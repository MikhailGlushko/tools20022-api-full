/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.CorporateActionEventReference1Choice;
import com.tools20022.repository.choice.ProcessingPosition1Choice;
import com.tools20022.repository.entity.CorporateActionEventRegistration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identification of a linked corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference1#mmEventIdentification
 * CorporateActionEventReference1.mmEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference1#mmLinkageType
 * CorporateActionEventReference1.mmLinkageType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
 * CorporateActionEventRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV01#mmEventsLinkage
 * CorporateActionInstructionV01.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV02#mmEventsLinkage
 * CorporateActionInstructionV02.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV03#mmEventsLinkage
 * CorporateActionInstructionV03.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV04#mmEventsLinkage
 * CorporateActionInstructionV04.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#mmEventsLinkage
 * CorporateActionMovementConfirmationV01.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02#mmEventsLinkage
 * CorporateActionMovementConfirmationV02.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03#mmEventsLinkage
 * CorporateActionMovementConfirmationV03.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04#mmEventsLinkage
 * CorporateActionMovementConfirmationV04.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmEventsLinkage
 * CorporateActionMovementPreliminaryAdviceV01.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#mmEventsLinkage
 * CorporateActionMovementPreliminaryAdviceV02.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#mmEventsLinkage
 * CorporateActionMovementPreliminaryAdviceV03.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#mmEventsLinkage
 * CorporateActionMovementPreliminaryAdviceV04.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01#mmEventsLinkage
 * CorporateActionMovementReversalAdviceV01.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02#mmEventsLinkage
 * CorporateActionMovementReversalAdviceV02.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03#mmEventsLinkage
 * CorporateActionMovementReversalAdviceV03.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04#mmEventsLinkage
 * CorporateActionMovementReversalAdviceV04.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#mmEventsLinkage
 * CorporateActionNotificationV01.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#mmEventsLinkage
 * CorporateActionNotificationV02.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03#mmEventsLinkage
 * CorporateActionNotificationV03.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmEventsLinkage
 * CorporateActionNotificationV04.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05#mmEventsLinkage
 * CorporateActionMovementConfirmationV05.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmEventsLinkage
 * CorporateActionNotificationV05.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmEventsLinkage
 * CorporateActionMovementPreliminaryAdviceV05.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV05#mmEventsLinkage
 * CorporateActionInstructionV05.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05#mmEventsLinkage
 * CorporateActionMovementReversalAdviceV05.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV06#mmEventsLinkage
 * CorporateActionMovementConfirmationV06.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmEventsLinkage
 * CorporateActionMovementPreliminaryAdviceV06.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06#mmEventsLinkage
 * CorporateActionMovementReversalAdviceV06.mmEventsLinkage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventReference1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a linked corporate action event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionEventReference3
 * CorporateActionEventReference3}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class CorporateActionEventReference1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionEventReference1Choice eventIdentification;
	/**
	 * Identification of the linked corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference1Choice
	 * CorporateActionEventReference1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEventIdentification
	 * CorporateActionEventRegistration.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference1
	 * CorporateActionEventReference1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the linked corporate action event."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference3#mmEventIdentification
	 * CorporateActionEventReference3.mmEventIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEventIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmCorporateActionEventIdentification;
			componentContext_lazy = () -> CorporateActionEventReference1.mmObject();
			isDerived = false;
			xmlTag = "EvtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventIdentification";
			definition = "Identification of the linked corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionEventReference3.mmEventIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionEventReference1Choice.mmObject();
		}
	};
	protected ProcessingPosition1Choice linkageType;
	/**
	 * Specifies when this corporate action event is to be processed relative to
	 * a linked corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition1Choice
	 * ProcessingPosition1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference1
	 * CorporateActionEventReference1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkgTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies when this corporate action event is to be processed relative to a linked corporate action event."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference3#mmLinkageType
	 * CorporateActionEventReference3.mmLinkageType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLinkageType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionEventReference1.mmObject();
			isDerived = false;
			xmlTag = "LkgTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageType";
			definition = "Specifies when this corporate action event is to be processed relative to a linked corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionEventReference3.mmLinkageType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingPosition1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionEventReference1.mmEventIdentification, com.tools20022.repository.msg.CorporateActionEventReference1.mmLinkageType);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionInstructionV01.mmEventsLinkage, com.tools20022.repository.area.seev.CorporateActionInstructionV02.mmEventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionInstructionV03.mmEventsLinkage, com.tools20022.repository.area.seev.CorporateActionInstructionV04.mmEventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01.mmEventsLinkage, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02.mmEventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03.mmEventsLinkage, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04.mmEventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmEventsLinkage, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02.mmEventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03.mmEventsLinkage, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04.mmEventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01.mmEventsLinkage, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02.mmEventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03.mmEventsLinkage, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04.mmEventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionNotificationV01.mmEventsLinkage, com.tools20022.repository.area.seev.CorporateActionNotificationV02.mmEventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionNotificationV03.mmEventsLinkage, com.tools20022.repository.area.seev.CorporateActionNotificationV04.mmEventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05.mmEventsLinkage, com.tools20022.repository.area.seev.CorporateActionNotificationV05.mmEventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05.mmEventsLinkage, com.tools20022.repository.area.seev.CorporateActionInstructionV05.mmEventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05.mmEventsLinkage, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV06.mmEventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmEventsLinkage, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06.mmEventsLinkage);
				trace_lazy = () -> CorporateActionEventRegistration.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventReference1";
				definition = "Identification of a linked corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionEventReference3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionEventReference1Choice getEventIdentification() {
		return eventIdentification;
	}

	public void setEventIdentification(CorporateActionEventReference1Choice eventIdentification) {
		this.eventIdentification = eventIdentification;
	}

	public ProcessingPosition1Choice getLinkageType() {
		return linkageType;
	}

	public void setLinkageType(ProcessingPosition1Choice linkageType) {
		this.linkageType = linkageType;
	}
}