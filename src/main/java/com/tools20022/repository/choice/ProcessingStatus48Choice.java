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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV07;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.entity.SecuritiesTradeStatus;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProprietaryReason4;
import com.tools20022.repository.msg.ProprietaryStatusAndReason6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmAcknowledgedAccepted
 * ProcessingStatus48Choice.mmAcknowledgedAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmPendingProcessing
 * ProcessingStatus48Choice.mmPendingProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmRejected
 * ProcessingStatus48Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmRepair
 * ProcessingStatus48Choice.mmRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmCancelled
 * ProcessingStatus48Choice.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmPendingCancellation
 * ProcessingStatus48Choice.mmPendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmProprietary
 * ProcessingStatus48Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmCancellationRequested
 * ProcessingStatus48Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmModificationRequested
 * ProcessingStatus48Choice.mmModificationRequested}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
 * SecuritiesTradeStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV07#mmProcessingStatus
 * SecuritiesSettlementTransactionStatusAdviceV07.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08#mmProcessingStatus
 * SecuritiesSettlementTransactionStatusAdviceV08.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09#mmProcessingStatus
 * SecuritiesSettlementTransactionStatusAdviceV09.mmProcessingStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProcessingStatus48Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the processing status."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice
 * ProcessingStatus37Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ProcessingStatus48Choice", propOrder = {"acknowledgedAccepted", "pendingProcessing", "rejected", "repair", "cancelled", "pendingCancellation", "proprietary", "cancellationRequested", "modificationRequested"})
public class ProcessingStatus48Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AckdAccptd", required = true)
	protected AcknowledgedAcceptedStatus21Choice acknowledgedAccepted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus21Choice
	 * AcknowledgedAcceptedStatus21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmAcknowledgedAcceptedReason
	 * StatusReason.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice
	 * ProcessingStatus48Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckdAccptd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has been acknowledged by the account servicer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#mmAcknowledgedAccepted
	 * ProcessingStatus37Choice.mmAcknowledgedAccepted}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ProcessingStatus48Choice, AcknowledgedAcceptedStatus21Choice> mmAcknowledgedAccepted = new MMMessageAssociationEnd<ProcessingStatus48Choice, AcknowledgedAcceptedStatus21Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmAcknowledgedAcceptedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.ProcessingStatus48Choice.mmObject();
			isDerived = false;
			xmlTag = "AckdAccptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Instruction has been acknowledged by the account servicer.";
			previousVersion_lazy = () -> ProcessingStatus37Choice.mmAcknowledgedAccepted;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AcknowledgedAcceptedStatus21Choice.mmObject();
		}

		@Override
		public AcknowledgedAcceptedStatus21Choice getValue(ProcessingStatus48Choice obj) {
			return obj.getAcknowledgedAccepted();
		}

		@Override
		public void setValue(ProcessingStatus48Choice obj, AcknowledgedAcceptedStatus21Choice value) {
			obj.setAcknowledgedAccepted(value);
		}
	};
	@XmlElement(name = "PdgPrcg", required = true)
	protected PendingProcessingStatus11Choice pendingProcessing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus11Choice
	 * PendingProcessingStatus11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice
	 * ProcessingStatus48Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgPrcg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing of the instruction/request is pending."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#mmPendingProcessing
	 * ProcessingStatus37Choice.mmPendingProcessing}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ProcessingStatus48Choice, PendingProcessingStatus11Choice> mmPendingProcessing = new MMMessageAssociationEnd<ProcessingStatus48Choice, PendingProcessingStatus11Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.ProcessingStatus48Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgPrcg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			definition = "Processing of the instruction/request is pending.";
			previousVersion_lazy = () -> ProcessingStatus37Choice.mmPendingProcessing;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PendingProcessingStatus11Choice.mmObject();
		}

		@Override
		public PendingProcessingStatus11Choice getValue(ProcessingStatus48Choice obj) {
			return obj.getPendingProcessing();
		}

		@Override
		public void setValue(ProcessingStatus48Choice obj, PendingProcessingStatus11Choice value) {
			obj.setPendingProcessing(value);
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected RejectionStatus21Choice rejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus21Choice
	 * RejectionStatus21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice
	 * ProcessingStatus48Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction/Request has been rejected for further processing."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#mmRejected
	 * ProcessingStatus37Choice.mmRejected}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ProcessingStatus48Choice, RejectionStatus21Choice> mmRejected = new MMMessageAssociationEnd<ProcessingStatus48Choice, RejectionStatus21Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.ProcessingStatus48Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Instruction/Request has been rejected for further processing.";
			previousVersion_lazy = () -> ProcessingStatus37Choice.mmRejected;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectionStatus21Choice.mmObject();
		}

		@Override
		public RejectionStatus21Choice getValue(ProcessingStatus48Choice obj) {
			return obj.getRejected();
		}

		@Override
		public void setValue(ProcessingStatus48Choice obj, RejectionStatus21Choice value) {
			obj.setRejected(value);
		}
	};
	@XmlElement(name = "Rpr", required = true)
	protected RepairStatus12Choice repair;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RepairStatus12Choice
	 * RepairStatus12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepairReason
	 * SecuritiesTradeStatusReason.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice
	 * ProcessingStatus48Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rpr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction/Request is accepted but in repair."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#mmRepair
	 * ProcessingStatus37Choice.mmRepair}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ProcessingStatus48Choice, RepairStatus12Choice> mmRepair = new MMMessageAssociationEnd<ProcessingStatus48Choice, RepairStatus12Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmRepairReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.ProcessingStatus48Choice.mmObject();
			isDerived = false;
			xmlTag = "Rpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repair";
			definition = "Instruction/Request is accepted but in repair.";
			previousVersion_lazy = () -> ProcessingStatus37Choice.mmRepair;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RepairStatus12Choice.mmObject();
		}

		@Override
		public RepairStatus12Choice getValue(ProcessingStatus48Choice obj) {
			return obj.getRepair();
		}

		@Override
		public void setValue(ProcessingStatus48Choice obj, RepairStatus12Choice value) {
			obj.setRepair(value);
		}
	};
	@XmlElement(name = "Canc", required = true)
	protected CancellationStatus14Choice cancelled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus14Choice
	 * CancellationStatus14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice
	 * ProcessingStatus48Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Canc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction/Request has been cancelled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#mmCancelled
	 * ProcessingStatus37Choice.mmCancelled}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ProcessingStatus48Choice, CancellationStatus14Choice> mmCancelled = new MMMessageAssociationEnd<ProcessingStatus48Choice, CancellationStatus14Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.ProcessingStatus48Choice.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Instruction/Request has been cancelled.";
			previousVersion_lazy = () -> ProcessingStatus37Choice.mmCancelled;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancellationStatus14Choice.mmObject();
		}

		@Override
		public CancellationStatus14Choice getValue(ProcessingStatus48Choice obj) {
			return obj.getCancelled();
		}

		@Override
		public void setValue(ProcessingStatus48Choice obj, CancellationStatus14Choice value) {
			obj.setCancelled(value);
		}
	};
	@XmlElement(name = "PdgCxl", required = true)
	protected PendingStatus38Choice pendingCancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingStatus38Choice
	 * PendingStatus38Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice
	 * ProcessingStatus48Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgCxl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request from yourself for this instruction is pending, waiting for further processing."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#mmPendingCancellation
	 * ProcessingStatus37Choice.mmPendingCancellation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ProcessingStatus48Choice, PendingStatus38Choice> mmPendingCancellation = new MMMessageAssociationEnd<ProcessingStatus48Choice, PendingStatus38Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.ProcessingStatus48Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			definition = "Cancellation request from yourself for this instruction is pending, waiting for further processing.";
			previousVersion_lazy = () -> ProcessingStatus37Choice.mmPendingCancellation;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PendingStatus38Choice.mmObject();
		}

		@Override
		public PendingStatus38Choice getValue(ProcessingStatus48Choice obj) {
			return obj.getPendingCancellation();
		}

		@Override
		public void setValue(ProcessingStatus48Choice obj, PendingStatus38Choice value) {
			obj.setPendingCancellation(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected ProprietaryStatusAndReason6 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason6
	 * ProprietaryStatusAndReason6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice
	 * ProcessingStatus48Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status that cannot be reported using one of the available standard status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#mmProprietary
	 * ProcessingStatus37Choice.mmProprietary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ProcessingStatus48Choice, ProprietaryStatusAndReason6> mmProprietary = new MMMessageAssociationEnd<ProcessingStatus48Choice, ProprietaryStatusAndReason6>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ProcessingStatus48Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Status that cannot be reported using one of the available standard status.";
			previousVersion_lazy = () -> ProcessingStatus37Choice.mmProprietary;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason6.mmObject();
		}

		@Override
		public ProprietaryStatusAndReason6 getValue(ProcessingStatus48Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(ProcessingStatus48Choice obj, ProprietaryStatusAndReason6 value) {
			obj.setProprietary(value);
		}
	};
	@XmlElement(name = "CxlReqd", required = true)
	protected ProprietaryReason4 cancellationRequested;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason4
	 * ProprietaryReason4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice
	 * ProcessingStatus48Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlReqd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request from your counterparty for this transaction is pending waiting for your cancellation request or consent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#mmCancellationRequested
	 * ProcessingStatus37Choice.mmCancellationRequested}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ProcessingStatus48Choice, ProprietaryReason4> mmCancellationRequested = new MMMessageAssociationEnd<ProcessingStatus48Choice, ProprietaryReason4>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ProcessingStatus48Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlReqd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequested";
			definition = "Cancellation request from your counterparty for this transaction is pending waiting for your cancellation request or consent.";
			previousVersion_lazy = () -> ProcessingStatus37Choice.mmCancellationRequested;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason4.mmObject();
		}

		@Override
		public ProprietaryReason4 getValue(ProcessingStatus48Choice obj) {
			return obj.getCancellationRequested();
		}

		@Override
		public void setValue(ProcessingStatus48Choice obj, ProprietaryReason4 value) {
			obj.setCancellationRequested(value);
		}
	};
	@XmlElement(name = "ModReqd", required = true)
	protected ProprietaryReason4 modificationRequested;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason4
	 * ProprietaryReason4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice
	 * ProcessingStatus48Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModReqd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification request from your counterparty for this transaction is pending waiting for your cancellation request or your consent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#mmModificationRequested
	 * ProcessingStatus37Choice.mmModificationRequested}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ProcessingStatus48Choice, ProprietaryReason4> mmModificationRequested = new MMMessageAssociationEnd<ProcessingStatus48Choice, ProprietaryReason4>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ProcessingStatus48Choice.mmObject();
			isDerived = false;
			xmlTag = "ModReqd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationRequested";
			definition = "Modification request from your counterparty for this transaction is pending waiting for your cancellation request or your consent.";
			previousVersion_lazy = () -> ProcessingStatus37Choice.mmModificationRequested;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason4.mmObject();
		}

		@Override
		public ProprietaryReason4 getValue(ProcessingStatus48Choice obj) {
			return obj.getModificationRequested();
		}

		@Override
		public void setValue(ProcessingStatus48Choice obj, ProprietaryReason4 value) {
			obj.setModificationRequested(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ProcessingStatus48Choice.mmAcknowledgedAccepted, com.tools20022.repository.choice.ProcessingStatus48Choice.mmPendingProcessing,
						com.tools20022.repository.choice.ProcessingStatus48Choice.mmRejected, com.tools20022.repository.choice.ProcessingStatus48Choice.mmRepair, com.tools20022.repository.choice.ProcessingStatus48Choice.mmCancelled,
						com.tools20022.repository.choice.ProcessingStatus48Choice.mmPendingCancellation, com.tools20022.repository.choice.ProcessingStatus48Choice.mmProprietary,
						com.tools20022.repository.choice.ProcessingStatus48Choice.mmCancellationRequested, com.tools20022.repository.choice.ProcessingStatus48Choice.mmModificationRequested);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdviceV07.mmProcessingStatus, SecuritiesSettlementTransactionStatusAdviceV08.mmProcessingStatus,
						SecuritiesSettlementTransactionStatusAdviceV09.mmProcessingStatus);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProcessingStatus48Choice";
				definition = "Choice of format for the processing status.";
				previousVersion_lazy = () -> ProcessingStatus37Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public AcknowledgedAcceptedStatus21Choice getAcknowledgedAccepted() {
		return acknowledgedAccepted;
	}

	public ProcessingStatus48Choice setAcknowledgedAccepted(AcknowledgedAcceptedStatus21Choice acknowledgedAccepted) {
		this.acknowledgedAccepted = Objects.requireNonNull(acknowledgedAccepted);
		return this;
	}

	public PendingProcessingStatus11Choice getPendingProcessing() {
		return pendingProcessing;
	}

	public ProcessingStatus48Choice setPendingProcessing(PendingProcessingStatus11Choice pendingProcessing) {
		this.pendingProcessing = Objects.requireNonNull(pendingProcessing);
		return this;
	}

	public RejectionStatus21Choice getRejected() {
		return rejected;
	}

	public ProcessingStatus48Choice setRejected(RejectionStatus21Choice rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public RepairStatus12Choice getRepair() {
		return repair;
	}

	public ProcessingStatus48Choice setRepair(RepairStatus12Choice repair) {
		this.repair = Objects.requireNonNull(repair);
		return this;
	}

	public CancellationStatus14Choice getCancelled() {
		return cancelled;
	}

	public ProcessingStatus48Choice setCancelled(CancellationStatus14Choice cancelled) {
		this.cancelled = Objects.requireNonNull(cancelled);
		return this;
	}

	public PendingStatus38Choice getPendingCancellation() {
		return pendingCancellation;
	}

	public ProcessingStatus48Choice setPendingCancellation(PendingStatus38Choice pendingCancellation) {
		this.pendingCancellation = Objects.requireNonNull(pendingCancellation);
		return this;
	}

	public ProprietaryStatusAndReason6 getProprietary() {
		return proprietary;
	}

	public ProcessingStatus48Choice setProprietary(ProprietaryStatusAndReason6 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}

	public ProprietaryReason4 getCancellationRequested() {
		return cancellationRequested;
	}

	public ProcessingStatus48Choice setCancellationRequested(ProprietaryReason4 cancellationRequested) {
		this.cancellationRequested = Objects.requireNonNull(cancellationRequested);
		return this;
	}

	public ProprietaryReason4 getModificationRequested() {
		return modificationRequested;
	}

	public ProcessingStatus48Choice setModificationRequested(ProprietaryReason4 modificationRequested) {
		this.modificationRequested = Objects.requireNonNull(modificationRequested);
		return this;
	}
}