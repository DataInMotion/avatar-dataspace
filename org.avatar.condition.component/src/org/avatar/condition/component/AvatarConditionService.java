package org.avatar.condition.component;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.condition.Condition;

@Component(property = {Condition.CONDITION_ID +"=AvatarConditionService"})
public class AvatarConditionService implements Condition{

	@Activate
	public AvatarConditionService(@Reference(cardinality = ReferenceCardinality.MANDATORY, target = "(" + EMFNamespaces.EMF_CONFIGURATOR_NAME + "=mongo)")
	ResourceSet resourceSet) {
		
	}

}
