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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.msg.ProprietaryStatusAndReason2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of format for the processing status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#mmAcknowledgedAccepted
 * ModificationProcessingStatus3Choice.mmAcknowledgedAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#mmPendingProcessing
 * ModificationProcessingStatus3Choice.mmPendingProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#mmDenied
 * ModificationProcessingStatus3Choice.mmDenied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#mmRejected
 * ModificationProcessingStatus3Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#mmRepaired
 * ModificationProcessingStatus3Choice.mmRepaired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#mmModified
 * ModificationProcessingStatus3Choice.mmModified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#mmProprietary
 * ModificationProcessingStatus3Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
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
 * "ModificationProcessingStatus3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the processing status."</li>
 * </ul>
 */
public class ModificationProcessingStatus3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected AcknowledgedAcceptedStatus15Choice acknowledgedAccepted;
	/**
	 * Instruction has been acknowledged by the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus15Choice
	 * AcknowledgedAcceptedStatus15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmAcknowledgedAcceptedReason
	 * StatusReason.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice
	 * ModificationProcessingStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckdAccptd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has been acknowledged by the account servicer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcknowledgedAccepted = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.StatusReason.mmAcknowledgedAcceptedReason;
			componentContext_lazy = () -> ModificationProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "AckdAccptd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Instruction has been acknowledged by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AcknowledgedAcceptedStatus15Choice.mmObject();
		}
	};
	protected PendingProcessingStatus8Choice pendingProcessing;
	/**
	 * The modification is pending processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus8Choice
	 * PendingProcessingStatus8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice
	 * ModificationProcessingStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgPrcg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The modification is pending processing."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingProcessing = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.StatusReason.mmPendingReason;
			componentContext_lazy = () -> ModificationProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgPrcg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			definition = "The modification is pending processing.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingProcessingStatus8Choice.mmObject();
		}
	};
	protected DeniedStatus9Choice denied;
	/**
	 * Modification request will not be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DeniedStatus9Choice
	 * DeniedStatus9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmDeniedReason
	 * SecuritiesTradeStatusReason.mmDeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice
	 * ModificationProcessingStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Denied"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modification request will not be executed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDenied = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmDeniedReason;
			componentContext_lazy = () -> ModificationProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "Dnd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denied";
			definition = "Modification request will not be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.DeniedStatus9Choice.mmObject();
		}
	};
	protected RejectionStatus10Choice rejected;
	/**
	 * Modification request has been rejected for further processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus10Choice
	 * RejectionStatus10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice
	 * ModificationProcessingStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification request has been rejected for further processing."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejected = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.StatusReason.mmRejectionReason;
			componentContext_lazy = () -> ModificationProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Modification request has been rejected for further processing.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RejectionStatus10Choice.mmObject();
		}
	};
	protected RepairStatus9Choice repaired;
	/**
	 * Modification request is accepted but in repair.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RepairStatus9Choice
	 * RepairStatus9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepairReason
	 * SecuritiesTradeStatusReason.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice
	 * ModificationProcessingStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rprd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repaired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modification request is accepted but in repair."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepaired = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmRepairReason;
			componentContext_lazy = () -> ModificationProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "Rprd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repaired";
			definition = "Modification request is accepted but in repair.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RepairStatus9Choice.mmObject();
		}
	};
	protected ModificationStatus3Choice modified;
	/**
	 * Instruction has been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ModificationStatus3Choice
	 * ModificationStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmModifiedStatusReason
	 * SecuritiesTradeStatusReason.mmModifiedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice
	 * ModificationProcessingStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Modfd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmModified = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatusReason.mmModifiedStatusReason;
			componentContext_lazy = () -> ModificationProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "Modfd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modified";
			definition = "Instruction has been modified.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.choice.ModificationStatus3Choice.mmObject();
		}
	};
	protected ProprietaryStatusAndReason2 proprietary;
	/**
	 * Proprietary status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason2
	 * ProprietaryStatusAndReason2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice
	 * ModificationProcessingStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proprietary status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> ModificationProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ModificationProcessingStatus3Choice.mmAcknowledgedAccepted,
						com.tools20022.repository.choice.ModificationProcessingStatus3Choice.mmPendingProcessing, com.tools20022.repository.choice.ModificationProcessingStatus3Choice.mmDenied,
						com.tools20022.repository.choice.ModificationProcessingStatus3Choice.mmRejected, com.tools20022.repository.choice.ModificationProcessingStatus3Choice.mmRepaired,
						com.tools20022.repository.choice.ModificationProcessingStatus3Choice.mmModified, com.tools20022.repository.choice.ModificationProcessingStatus3Choice.mmProprietary);
				trace_lazy = () -> Status.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ModificationProcessingStatus3Choice";
				definition = "Choice of format for the processing status.";
			}
		});
		return mmObject_lazy.get();
	}

	public AcknowledgedAcceptedStatus15Choice getAcknowledgedAccepted() {
		return acknowledgedAccepted;
	}

	public void setAcknowledgedAccepted(com.tools20022.repository.choice.AcknowledgedAcceptedStatus15Choice acknowledgedAccepted) {
		this.acknowledgedAccepted = acknowledgedAccepted;
	}

	public PendingProcessingStatus8Choice getPendingProcessing() {
		return pendingProcessing;
	}

	public void setPendingProcessing(com.tools20022.repository.choice.PendingProcessingStatus8Choice pendingProcessing) {
		this.pendingProcessing = pendingProcessing;
	}

	public DeniedStatus9Choice getDenied() {
		return denied;
	}

	public void setDenied(com.tools20022.repository.choice.DeniedStatus9Choice denied) {
		this.denied = denied;
	}

	public RejectionStatus10Choice getRejected() {
		return rejected;
	}

	public void setRejected(com.tools20022.repository.choice.RejectionStatus10Choice rejected) {
		this.rejected = rejected;
	}

	public RepairStatus9Choice getRepaired() {
		return repaired;
	}

	public void setRepaired(com.tools20022.repository.choice.RepairStatus9Choice repaired) {
		this.repaired = repaired;
	}

	public ModificationStatus3Choice getModified() {
		return modified;
	}

	public void setModified(com.tools20022.repository.choice.ModificationStatus3Choice modified) {
		this.modified = modified;
	}

	public ProprietaryStatusAndReason2 getProprietary() {
		return proprietary;
	}

	public void setProprietary(ProprietaryStatusAndReason2 proprietary) {
		this.proprietary = proprietary;
	}
}