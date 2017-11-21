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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.choice.Party12Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestigationCase;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details to identify an investigation case.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Case3#mmIdentification
 * Case3.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Case3#mmCreator
 * Case3.mmCreator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Case3#mmReopenCaseIndication
 * Case3.mmReopenCaseIndication}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV02#mmCase
 * CustomerPaymentCancellationRequestV02.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV03#mmCase
 * CustomerPaymentCancellationRequestV03.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV02#mmCase
 * FIToFIPaymentCancellationRequestV02.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV03#mmCase
 * FIToFIPaymentCancellationRequestV03.mmCase}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.UnableToApplyV04#mmCase
 * UnableToApplyV04.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV04#mmCase
 * ClaimNonReceiptV04.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV04#mmCase
 * AdditionalPaymentInformationV04.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV04#mmResolvedCase
 * ResolutionOfInvestigationV04.mmResolvedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04#mmCase
 * NotificationOfCaseAssignmentV04.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RejectInvestigationV04#mmCase
 * RejectInvestigationV04.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CancelCaseAssignmentV03#mmCase
 * CancelCaseAssignmentV03.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestForDuplicateV04#mmCase
 * RequestForDuplicateV04.mmCase}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.DuplicateV04#mmCase
 * DuplicateV04.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV03#mmCase
 * ProprietaryFormatInvestigationV03.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV03#mmCase
 * DebitAuthorisationResponseV03.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV04#mmCase
 * DebitAuthorisationRequestV04.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportRequestV03#mmCase
 * CaseStatusReportRequestV03.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportV04#mmCase
 * CaseStatusReportV04.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV01#mmCase
 * RequestToModifyPaymentV01.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV05#mmResolvedCase
 * ResolutionOfInvestigationV05.mmResolvedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV04#mmCase
 * FIToFIPaymentCancellationRequestV04.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV04#mmCase
 * CustomerPaymentCancellationRequestV04.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV05#mmCase
 * AdditionalPaymentInformationV05.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV02#mmCase
 * RequestToModifyPaymentV02.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV06#mmCase
 * AdditionalPaymentInformationV06.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV05#mmCase
 * FIToFIPaymentCancellationRequestV05.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV03#mmCase
 * RequestToModifyPaymentV03.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV06#mmResolvedCase
 * ResolutionOfInvestigationV06.mmResolvedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV05#mmCase
 * CustomerPaymentCancellationRequestV05.mmCase}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.UnableToApplyV05#mmCase
 * UnableToApplyV05.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV06#mmCase
 * CustomerPaymentCancellationRequestV06.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV07#mmCase
 * AdditionalPaymentInformationV07.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#mmResolvedCase
 * ResolutionOfInvestigationV07.mmResolvedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06#mmCase
 * FIToFIPaymentCancellationRequestV06.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV05#mmCase
 * DebitAuthorisationRequestV05.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05#mmCase
 * ClaimNonReceiptV05.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV04#mmCase
 * RequestToModifyPaymentV04.mmCase}</li>
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
 * "Case3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides further details to identify an investigation case."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Case3", propOrder = {"identification", "creator", "reopenCaseIndication"})
public class Case3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * Uniquely identifies the case.
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
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmIdentification
	 * InvestigationCase.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Case3
	 * Case3}</li>
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
	 * definition} = "Uniquely identifies the case."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestigationCase.mmIdentification;
			componentContext_lazy = () -> Case3.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Uniquely identifies the case.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Party12Choice creator;
	/**
	 * Party that created the investigation case.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Case3
	 * Case3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cretr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that created the investigation case."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Case3.mmObject();
			isDerived = false;
			xmlTag = "Cretr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creator";
			definition = "Party that created the investigation case.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Party12Choice.mmObject();
		}
	};
	protected YesNoIndicator reopenCaseIndication;
	/**
	 * Indicates whether or not the case was previously closed and is now
	 * re-opened.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Case3
	 * Case3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReopCaseIndctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReopenCaseIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not the case was previously closed and is now re-opened."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReopenCaseIndication = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Case3.mmObject();
			isDerived = false;
			xmlTag = "ReopCaseIndctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReopenCaseIndication";
			definition = "Indicates whether or not the case was previously closed and is now re-opened.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Case3.mmIdentification, Case3.mmCreator, Case3.mmReopenCaseIndication);
				messageBuildingBlock_lazy = () -> Arrays.asList(CustomerPaymentCancellationRequestV02.mmCase, CustomerPaymentCancellationRequestV03.mmCase, FIToFIPaymentCancellationRequestV02.mmCase,
						FIToFIPaymentCancellationRequestV03.mmCase, UnableToApplyV04.mmCase, ClaimNonReceiptV04.mmCase, AdditionalPaymentInformationV04.mmCase, ResolutionOfInvestigationV04.mmResolvedCase,
						NotificationOfCaseAssignmentV04.mmCase, RejectInvestigationV04.mmCase, CancelCaseAssignmentV03.mmCase, RequestForDuplicateV04.mmCase, DuplicateV04.mmCase, ProprietaryFormatInvestigationV03.mmCase,
						DebitAuthorisationResponseV03.mmCase, DebitAuthorisationRequestV04.mmCase, CaseStatusReportRequestV03.mmCase, CaseStatusReportV04.mmCase, RequestToModifyPaymentV01.mmCase,
						ResolutionOfInvestigationV05.mmResolvedCase, FIToFIPaymentCancellationRequestV04.mmCase, CustomerPaymentCancellationRequestV04.mmCase, AdditionalPaymentInformationV05.mmCase, RequestToModifyPaymentV02.mmCase,
						AdditionalPaymentInformationV06.mmCase, FIToFIPaymentCancellationRequestV05.mmCase, RequestToModifyPaymentV03.mmCase, ResolutionOfInvestigationV06.mmResolvedCase, CustomerPaymentCancellationRequestV05.mmCase,
						UnableToApplyV05.mmCase, CustomerPaymentCancellationRequestV06.mmCase, AdditionalPaymentInformationV07.mmCase, ResolutionOfInvestigationV07.mmResolvedCase, FIToFIPaymentCancellationRequestV06.mmCase,
						DebitAuthorisationRequestV05.mmCase, ClaimNonReceiptV05.mmCase, RequestToModifyPaymentV04.mmCase);
				trace_lazy = () -> InvestigationCase.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Case3";
				definition = "Provides further details to identify an investigation case.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	@XmlElement(name = "Cretr", required = true)
	public Party12Choice getCreator() {
		return creator;
	}

	public void setCreator(Party12Choice creator) {
		this.creator = creator;
	}

	@XmlElement(name = "ReopCaseIndctn")
	public YesNoIndicator getReopenCaseIndication() {
		return reopenCaseIndication;
	}

	public void setReopenCaseIndication(YesNoIndicator reopenCaseIndication) {
		this.reopenCaseIndication = reopenCaseIndication;
	}
}