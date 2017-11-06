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
import com.tools20022.repository.choice.Party12Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InvestigationCase;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Represents the assignment of a case to a party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CaseAssignment3#mmIdentification
 * CaseAssignment3.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CaseAssignment3#mmAssigner
 * CaseAssignment3.mmAssigner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CaseAssignment3#mmAssignee
 * CaseAssignment3.mmAssignee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CaseAssignment3#mmCreationDateTime
 * CaseAssignment3.mmCreationDateTime}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestigationCase
 * InvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV02#mmAssignment
 * CustomerPaymentCancellationRequestV02.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV03#mmAssignment
 * CustomerPaymentCancellationRequestV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV02#mmAssignment
 * FIToFIPaymentCancellationRequestV02.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV03#mmAssignment
 * FIToFIPaymentCancellationRequestV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV04#mmAssignment
 * UnableToApplyV04.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV04#mmAssignment
 * ClaimNonReceiptV04.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV04#mmAssignment
 * AdditionalPaymentInformationV04.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV04#mmAssignment
 * ResolutionOfInvestigationV04.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04#mmAssignment
 * NotificationOfCaseAssignmentV04.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RejectInvestigationV04#mmAssignment
 * RejectInvestigationV04.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CancelCaseAssignmentV03#mmAssignment
 * CancelCaseAssignmentV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestForDuplicateV04#mmAssignment
 * RequestForDuplicateV04.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DuplicateV04#mmAssignment
 * DuplicateV04.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV03#mmAssignment
 * ProprietaryFormatInvestigationV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV03#mmAssignment
 * DebitAuthorisationResponseV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV04#mmAssignment
 * DebitAuthorisationRequestV04.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportV04#mmNewAssignment
 * CaseStatusReportV04.mmNewAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV01#mmAssignment
 * RequestToModifyPaymentV01.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV05#mmAssignment
 * ResolutionOfInvestigationV05.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV04#mmAssignment
 * FIToFIPaymentCancellationRequestV04.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV04#mmAssignment
 * CustomerPaymentCancellationRequestV04.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV05#mmAssignment
 * AdditionalPaymentInformationV05.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV02#mmAssignment
 * RequestToModifyPaymentV02.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV06#mmAssignment
 * AdditionalPaymentInformationV06.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV05#mmAssignment
 * FIToFIPaymentCancellationRequestV05.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV03#mmAssignment
 * RequestToModifyPaymentV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV06#mmAssignment
 * ResolutionOfInvestigationV06.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV05#mmAssignment
 * CustomerPaymentCancellationRequestV05.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV05#mmAssignment
 * UnableToApplyV05.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV06#mmAssignment
 * CustomerPaymentCancellationRequestV06.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV07#mmAssignment
 * AdditionalPaymentInformationV07.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#mmAssignment
 * ResolutionOfInvestigationV07.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06#mmAssignment
 * FIToFIPaymentCancellationRequestV06.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV05#mmAssignment
 * DebitAuthorisationRequestV05.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05#mmAssignment
 * ClaimNonReceiptV05.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV04#mmAssignment
 * RequestToModifyPaymentV04.mmAssignment}</li>
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
 * "CaseAssignment3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Represents the assignment of a case to a party."</li>
 * </ul>
 */
public class CaseAssignment3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * Uniquely identifies the case assignment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmAssignmentIdentification
	 * InvestigationCase.mmAssignmentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CaseAssignment3
	 * CaseAssignment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Uniquely identifies the case assignment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmAssignmentIdentification;
			componentContext_lazy = () -> CaseAssignment3.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Uniquely identifies the case assignment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Party12Choice assigner;
	/**
	 * Party who assigns the case. Usage: This is also the sender of the
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party12Choice
	 * Party12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CaseAssignment3
	 * CaseAssignment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assigner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party who assigns the case. \nUsage: This is also the sender of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAssigner = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> CaseAssignment3.mmObject();
			isDerived = false;
			xmlTag = "Assgnr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assigner";
			definition = "Party who assigns the case. \nUsage: This is also the sender of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Party12Choice.mmObject();
		}
	};
	protected Party12Choice assignee;
	/**
	 * Party to which the case is assigned. Usage: This is also the receiver of
	 * the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party12Choice
	 * Party12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CaseAssignment3
	 * CaseAssignment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgne"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party to which the case is assigned.\nUsage: This is also the receiver of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAssignee = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> CaseAssignment3.mmObject();
			isDerived = false;
			xmlTag = "Assgne";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignee";
			definition = "Party to which the case is assigned.\nUsage: This is also the receiver of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Party12Choice.mmObject();
		}
	};
	protected ISODateTime creationDateTime;
	/**
	 * Date and time at which the assignment was created.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmCreationDateTime
	 * InvestigationCase.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CaseAssignment3
	 * CaseAssignment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the assignment was created."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmCreationDateTime;
			componentContext_lazy = () -> CaseAssignment3.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the assignment was created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CaseAssignment3.mmIdentification, com.tools20022.repository.msg.CaseAssignment3.mmAssigner, com.tools20022.repository.msg.CaseAssignment3.mmAssignee,
						com.tools20022.repository.msg.CaseAssignment3.mmCreationDateTime);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV02.mmAssignment, com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV03.mmAssignment,
						com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV02.mmAssignment, com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV03.mmAssignment,
						com.tools20022.repository.area.camt.UnableToApplyV04.mmAssignment, com.tools20022.repository.area.camt.ClaimNonReceiptV04.mmAssignment,
						com.tools20022.repository.area.camt.AdditionalPaymentInformationV04.mmAssignment, com.tools20022.repository.area.camt.ResolutionOfInvestigationV04.mmAssignment,
						com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04.mmAssignment, com.tools20022.repository.area.camt.RejectInvestigationV04.mmAssignment,
						com.tools20022.repository.area.camt.CancelCaseAssignmentV03.mmAssignment, com.tools20022.repository.area.camt.RequestForDuplicateV04.mmAssignment, com.tools20022.repository.area.camt.DuplicateV04.mmAssignment,
						com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV03.mmAssignment, com.tools20022.repository.area.camt.DebitAuthorisationResponseV03.mmAssignment,
						com.tools20022.repository.area.camt.DebitAuthorisationRequestV04.mmAssignment, com.tools20022.repository.area.camt.CaseStatusReportV04.mmNewAssignment,
						com.tools20022.repository.area.camt.RequestToModifyPaymentV01.mmAssignment, com.tools20022.repository.area.camt.ResolutionOfInvestigationV05.mmAssignment,
						com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV04.mmAssignment, com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV04.mmAssignment,
						com.tools20022.repository.area.camt.AdditionalPaymentInformationV05.mmAssignment, com.tools20022.repository.area.camt.RequestToModifyPaymentV02.mmAssignment,
						com.tools20022.repository.area.camt.AdditionalPaymentInformationV06.mmAssignment, com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV05.mmAssignment,
						com.tools20022.repository.area.camt.RequestToModifyPaymentV03.mmAssignment, com.tools20022.repository.area.camt.ResolutionOfInvestigationV06.mmAssignment,
						com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV05.mmAssignment, com.tools20022.repository.area.camt.UnableToApplyV05.mmAssignment,
						com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV06.mmAssignment, com.tools20022.repository.area.camt.AdditionalPaymentInformationV07.mmAssignment,
						com.tools20022.repository.area.camt.ResolutionOfInvestigationV07.mmAssignment, com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06.mmAssignment,
						com.tools20022.repository.area.camt.DebitAuthorisationRequestV05.mmAssignment, com.tools20022.repository.area.camt.ClaimNonReceiptV05.mmAssignment,
						com.tools20022.repository.area.camt.RequestToModifyPaymentV04.mmAssignment);
				trace_lazy = () -> InvestigationCase.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CaseAssignment3";
				definition = "Represents the assignment of a case to a party.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public Party12Choice getAssigner() {
		return assigner;
	}

	public void setAssigner(Party12Choice assigner) {
		this.assigner = assigner;
	}

	public Party12Choice getAssignee() {
		return assignee;
	}

	public void setAssignee(Party12Choice assignee) {
		this.assignee = assignee;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}
}