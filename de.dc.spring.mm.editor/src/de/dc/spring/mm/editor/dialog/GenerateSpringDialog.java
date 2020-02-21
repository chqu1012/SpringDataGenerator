package de.dc.spring.mm.editor.dialog;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.PackageFragment;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;

import de.dc.spring.mm.DBSource;
import de.dc.spring.mm.Entity;
import de.dc.spring.mm.RestController;
import de.dc.spring.mm.SpringProject;
import de.dc.spring.mm.editor.file.SpringFile;
import de.dc.spring.mm.editor.template.EntityTemplate;
import de.dc.spring.mm.editor.template.PropertiesTemplate;
import de.dc.spring.mm.editor.template.RepositoryTemplate;
import de.dc.spring.mm.editor.template.RestControllerTemplate;

public class GenerateSpringDialog extends TitleAreaDialog {
	private Text textPackage;
	private Label labelEntityPath;
	private Label labelRepositoryPath;
	private Label labelRestPath;

	private IPackageFragment fragment = null;
	private IFolder srcFolder;
	private IFile model;
	private IJavaProject jp;
	private Button btnUseSrcmainjavaStructure;
	private Button btnGenerateEntity;
	private Button btnGenerateRepository;
	private Button btnGenerateRestContoller;
	private Button btnGenerateApplciationproperties;
	private IFolder srcGen;
	
	private SpringFile fileReader = new SpringFile();
	private IFolder resFolder;
	
	public GenerateSpringDialog(Shell parentShell) {
		super(parentShell);
		setShellStyle(SWT.DIALOG_TRIM | SWT.RESIZE);
		setBlockOnOpen(false);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		setMessage("All required Spring Date Model, Repository...");
		setTitle("Generate Spring Files Dialog");
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		GridLayout gl_container = new GridLayout(3, false);
		gl_container.marginWidth = 10;
		container.setLayout(gl_container);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Label lblPackage = new Label(container, SWT.NONE);
		lblPackage.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPackage.setText("Package:");
		
		textPackage = new Text(container, SWT.BORDER);
		textPackage.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		textPackage.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				labelEntityPath.setText(textPackage.getText() + ".model");
				labelRepositoryPath.setText(textPackage.getText() + ".repository");
				labelRestPath.setText(textPackage.getText() + ".controller");
			}
		});
		
		Button buttonOpenPackage = new Button(container, SWT.NONE);
		buttonOpenPackage.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					SelectionDialog dialog = JavaUI.createPackageDialog(new Shell(), jp.getPackageFragmentRoot(srcFolder));
					int code = dialog.open();
					if (code == 0) {
						for (Object object : dialog.getResult()) {
							if (object instanceof PackageFragment) {
								fragment = (PackageFragment) object;
								String basePackage = fragment.getElementName();
								textPackage.setText(basePackage);
								labelEntityPath.setText(basePackage + ".model");
								labelRepositoryPath.setText(basePackage + ".repository");
								labelRestPath.setText(basePackage + ".controller");
							}
						}
					}
				} catch (JavaModelException e1) {
					e1.printStackTrace();
				}
			}
		});
		buttonOpenPackage.setText("...");
		
		Label lblEntityPath = new Label(container, SWT.NONE);
		lblEntityPath.setEnabled(false);
		lblEntityPath.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblEntityPath.setText("Entity Path:");
		
		labelEntityPath = new Label(container, SWT.NONE);
		labelEntityPath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		new Label(container, SWT.NONE);
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setEnabled(false);
		lblNewLabel.setText("Repository Path:");
		
		labelRepositoryPath = new Label(container, SWT.NONE);
		labelRepositoryPath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		new Label(container, SWT.NONE);
		
		Label lblRestPath = new Label(container, SWT.NONE);
		lblRestPath.setEnabled(false);
		lblRestPath.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblRestPath.setText("Rest Path:");
		
		labelRestPath = new Label(container, SWT.NONE);
		labelRestPath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		btnUseSrcmainjavaStructure = new Button(container, SWT.CHECK);
		btnUseSrcmainjavaStructure.setSelection(true);
		btnUseSrcmainjavaStructure.setText("use src/main/java structure");
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		btnGenerateEntity = new Button(container, SWT.CHECK);
		btnGenerateEntity.setSelection(true);
		btnGenerateEntity.setText("generate Entity");
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		btnGenerateRepository = new Button(container, SWT.CHECK);
		btnGenerateRepository.setSelection(true);
		btnGenerateRepository.setText("generate Repository");
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		btnGenerateRestContoller = new Button(container, SWT.CHECK);
		btnGenerateRestContoller.setSelection(true);
		btnGenerateRestContoller.setText("generate Rest Contoller");
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		btnGenerateApplciationproperties = new Button(container, SWT.CHECK);
		btnGenerateApplciationproperties.setSelection(true);
		btnGenerateApplciationproperties.setText("generate applciation.properties");
		new Label(container, SWT.NONE);

		initModel();
		
		return area;
	}
	
	private void initModel(){
		if (model != null) {
			return;
		}
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		ISelection selection = selectionService.getSelection();
		if (selection instanceof TreeSelection) {
			TreeSelection ss = (TreeSelection) selection;
			Object firstElement = ss.getFirstElement();
			if (firstElement instanceof IFile) {
				model = (IFile) firstElement;
				IFolder parent = (IFolder) model.getParent();
				
				IProject project = parent.getProject();
				jp = JavaCore.create(project);

				srcFolder = project.getFolder("src");
				resFolder = project.getFolder("resources");
				srcGen = project.getFolder("src-gen");
				if (!srcGen.exists()) {
					try {
						srcGen.create(true, true, new NullProgressMonitor());
						createSrcGenFolder();
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}else {
					try {
						createSrcGenFolder();
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}

				IFolder mainFolder = srcFolder.getFolder("main");
				if (mainFolder.exists()) {
					srcFolder = mainFolder.getFolder("java");
					resFolder = mainFolder.getFolder("resources");
				}
			}
		}
	}

	private void createSrcGenFolder() throws CoreException {
		if (btnUseSrcmainjavaStructure.getSelection()) {
			IFolder mainFolder = srcGen.getFolder("main");
			if (!mainFolder.exists()) {
				mainFolder.create(true, true, new NullProgressMonitor());
				srcGen = mainFolder.getFolder("java");
				resFolder = mainFolder.getFolder("resources");
				if (!srcGen.exists()) {
					srcGen.create(true, true, new NullProgressMonitor());
					addIFolderToClasspath(srcGen);
				}
				if (!resFolder.exists()) {
					resFolder.create(true, true, new NullProgressMonitor());
					addIFolderToClasspath(resFolder);
				}
			}else {
				srcGen = mainFolder.getFolder("java");
				resFolder = mainFolder.getFolder("resources");
			}
		}
	}
	
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}
	
	@Override
	protected void buttonPressed(int buttonId) {
		if (buttonId == OK) {
			initModel();
			initFragment();
			String basePackage = fragment.getElementName();

			SpringProject project = fileReader.readExtEmfModel(model.getFullPath().toPortableString());
			project.setBasePackage(basePackage);
			
			for (Object e : project.getEntities()) {
				Entity entity = (Entity) e;
				String packagePath = basePackage+".model";
				String filename = entity.getName()+".java";
				String tpl = new EntityTemplate().gen(entity);
				generateFile(srcFolder, tpl, filename, packagePath);
				
				packagePath = basePackage+".repository";
				filename = entity.getName()+"Repository.java";
				tpl = new RepositoryTemplate().gen(entity);
				generateFile(srcFolder, tpl, filename, packagePath);
			}
			
			for (Object e : project.getControllers()) {
				RestController controller = (RestController) e;
				String packagePath = basePackage+".controller";
				String filename = controller.getName()+".java";
				String tpl = new RestControllerTemplate().gen(controller);
				generateFile(srcFolder, tpl, filename, packagePath);
			}
			
			DBSource dbSource = project.getDbSource();
			String filename ="application.properties";
			String tpl = new PropertiesTemplate().gen(dbSource);
			generateFile(resFolder, tpl, filename, "");
		}
		super.buttonPressed(buttonId);
	}

	private void addIFolderToClasspath(IFolder sourceFolder) {
		try {
			IClasspathEntry[] oldEntries = jp.getRawClasspath();
			IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
			System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
			newEntries[oldEntries.length] = JavaCore.newSourceEntry(sourceFolder.getFullPath());
			jp.setRawClasspath(newEntries, null);
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
	}
	
	private void initFragment() {
		if (fragment==null) {
			try {
				IFolder folder = getFolder(srcFolder, textPackage.getText().split("\\."));
				fragment = jp.findPackageFragment(folder.getFullPath());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

	private void generateFile(IFolder generatedFolder, String controllerContent, String baseController, String controllerPackage) {
		try {
			IFolder genFolder = getFolder(generatedFolder, controllerPackage.split("\\."));
			if (!genFolder.exists()) {
				genFolder.create(true, true, null);
			}
			IFile ifile = genFolder.getFile(baseController);
			if (ifile.exists()) {
				ifile.delete(true, null);
			}
			ifile.create(new ByteArrayInputStream(controllerContent.getBytes()), IResource.NONE, null);
			genFolder.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e1) {
			e1.printStackTrace();
		}
	}

	public String fileToString(String path) {
		FileInputStream fileinput = null;
		try {
			fileinput = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int filetmp = 0;
		try {
			filetmp = fileinput.available();
		} catch (IOException e) {
			e.printStackTrace();
		}
		byte bitstream[] = new byte[filetmp];
		try {
			fileinput.read(bitstream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new String(bitstream);
	}

	public IFolder getFolder(IFolder folder, String[] basePackage) throws CoreException {
		IFolder currentFolder = null;
		for (String pack : basePackage) {
			if (currentFolder != null) {
				currentFolder = currentFolder.getFolder(pack);
			} else {
				currentFolder = folder.getFolder(pack);
			}
			if (!currentFolder.exists()) {
				currentFolder.create(true, true, null);
			}
		}
		return currentFolder;
	}

	@Override
	protected Point getInitialSize() {
		return new Point(450, 489);
	}

}
