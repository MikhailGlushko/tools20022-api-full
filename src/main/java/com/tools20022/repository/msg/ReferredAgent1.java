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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.Referred1Code;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the placement agent identification for a hedge fund if the investor
 * was referred by one.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredAgent1#mmReferred
 * ReferredAgent1.mmReferred}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredAgent1#mmReferredPlacementAgent
 * ReferredAgent1.mmReferredPlacementAgent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmPlacement
 * AccountDetailsConfirmationV02.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmPlacement
 * AccountDetailsConfirmationV03.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmModifiedPlacement
 * AccountModificationInstructionV02.mmModifiedPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedPlacement
 * AccountModificationInstructionV03.mmModifiedPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV02#mmPlacement
 * AccountOpeningInstructionV02.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmPlacement
 * AccountOpeningInstructionV03.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmPlacement
 * AccountDetailsConfirmationV04.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedPlacement
 * AccountModificationInstructionV04.mmModifiedPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmPlacement
 * AccountOpeningInstructionV04.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmPlacement
 * AccountOpeningInstructionV05.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmModifiedPlacement
 * AccountModificationInstructionV05.mmModifiedPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmPlacement
 * AccountDetailsConfirmationV05.mmPlacement}</li>
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
 * "ReferredAgent1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the placement agent identification for a hedge fund if the investor was referred by one."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredAgent2 ReferredAgent2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class ReferredAgent1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Referred1Code referred;
	/**
	 * Indicates if the investor was referred by a placement agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Referred1Code
	 * Referred1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReferredAgent1 ReferredAgent1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rfrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Referred"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the investor was referred by a placement agent."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ReferredAgent2#mmReferred
	 * ReferredAgent2.mmReferred}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferred = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReferredAgent1.mmObject();
			isDerived = false;
			xmlTag = "Rfrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Referred";
			definition = "Indicates if the investor was referred by a placement agent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReferredAgent2.mmReferred);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Referred1Code.mmObject();
		}
	};
	protected PartyIdentification2Choice referredPlacementAgent;
	/**
	 * Placement agent that referred the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReferredAgent1 ReferredAgent1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfrdPlcmntAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferredPlacementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Placement agent that referred the investor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredAgent2#mmReferredPlacementAgent
	 * ReferredAgent2.mmReferredPlacementAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReferredPlacementAgent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ReferredAgent1.mmObject();
			isDerived = false;
			xmlTag = "RfrdPlcmntAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredPlacementAgent";
			definition = "Placement agent that referred the investor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReferredAgent2.mmReferredPlacementAgent);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReferredAgent1.mmReferred, com.tools20022.repository.msg.ReferredAgent1.mmReferredPlacementAgent);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02.mmPlacement, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03.mmPlacement,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV02.mmModifiedPlacement, com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmModifiedPlacement,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV02.mmPlacement, com.tools20022.repository.area.acmt.AccountOpeningInstructionV03.mmPlacement,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04.mmPlacement, com.tools20022.repository.area.acmt.AccountModificationInstructionV04.mmModifiedPlacement,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.mmPlacement, com.tools20022.repository.area.acmt.AccountOpeningInstructionV05.mmPlacement,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV05.mmModifiedPlacement, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.mmPlacement);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReferredAgent1";
				definition = "Provides the placement agent identification for a hedge fund if the investor was referred by one.";
				nextVersions_lazy = () -> Arrays.asList(ReferredAgent2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Referred1Code getReferred() {
		return referred;
	}

	public void setReferred(Referred1Code referred) {
		this.referred = referred;
	}

	public PartyIdentification2Choice getReferredPlacementAgent() {
		return referredPlacementAgent;
	}

	public void setReferredPlacementAgent(PartyIdentification2Choice referredPlacementAgent) {
		this.referredPlacementAgent = referredPlacementAgent;
	}
}