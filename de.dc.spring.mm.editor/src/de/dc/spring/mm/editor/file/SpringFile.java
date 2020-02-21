package de.dc.spring.mm.editor.file;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.spring.mm.MmFactory;
import de.dc.spring.mm.MmPackage;
import de.dc.spring.mm.SpringProject;

public class SpringFile extends EmfFile<SpringProject>{

	public SpringProject readExtEmfModel(String path) {
		return load(path);
	}
	
	@Override
	public EPackage getEPackageEInstance() {
		return MmPackage.eINSTANCE;
	}

	@Override
	public EFactory getEFactoryEInstance() {
		return MmFactory.eINSTANCE;
	}

	@Override
	public String getExtension() {
		return "spring";
	}

}