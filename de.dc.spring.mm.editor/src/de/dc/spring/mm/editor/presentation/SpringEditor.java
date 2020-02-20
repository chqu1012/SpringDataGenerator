package de.dc.spring.mm.editor.presentation;

import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;

import de.dc.spring.mm.Entity;
import de.dc.spring.mm.editor.template.EntityTemplate;
import de.dc.spring.mm.presentation.MmEditor;

public class SpringEditor extends MmEditor{

	EntityTemplate entityTemplate = new EntityTemplate();
	
	@Override
	public void createPages() {
		createModel();
		if (!getEditingDomain().getResourceSet().getResources().isEmpty()) {
			PatternFilter filter = new PatternFilter();
			FilteredTree tree = new FilteredTree(getContainer(), SWT.MULTI | SWT.H_SCROLL
					| SWT.V_SCROLL, filter, true, true);
			
			selectionViewer = tree.getViewer();
			setCurrentViewer(selectionViewer);

			selectionViewer.setUseHashlookup(true);
			selectionViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
			selectionViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
			selectionViewer.setInput(editingDomain.getResourceSet());
			selectionViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)),
					true);

			selectionViewer.addDoubleClickListener(event -> {
				ISelection selection = event.getSelection();
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection ss = (IStructuredSelection) selection;
					Object firstElement = ss.getFirstElement();
					if (firstElement instanceof Entity) {
						Entity entity = (Entity) firstElement;
						String content = entityTemplate.gen(entity);
						System.out.println(content);
					}
				}
			});
			
			new AdapterFactoryTreeEditor(selectionViewer.getTree(), adapterFactory);

			createContextMenuFor(selectionViewer);
			int pageIndex = addPage(tree);
			setPageText(pageIndex, "Spring Editor");

			getSite().getShell().getDisplay().asyncExec(() -> {
				if (!getContainer().isDisposed()) {
					setActivePage(0);
				}
			});
		}

		getContainer().addControlListener(new ControlAdapter() {
			boolean guard = false;

			@Override
			public void controlResized(ControlEvent event) {
				if (!guard) {
					guard = true;
					hideTabs();
					guard = false;
				}
			}
		});

		getSite().getShell().getDisplay().asyncExec(() -> updateProblemIndication());
	}
}
