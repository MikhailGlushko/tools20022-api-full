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
import com.tools20022.repository.entity.Organisation;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements used to uniquely and unambiguously identify a financial
 * institution or a branch of a financial institution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5#mmFinancialInstitutionIdentification
 * BranchAndFinancialInstitutionIdentification5.
 * mmFinancialInstitutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5#mmBranchIdentification
 * BranchAndFinancialInstitutionIdentification5.mmBranchIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Organisation
 * Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountAdditionalInformationRequestV02#mmAccountServicerIdentification
 * AccountAdditionalInformationRequestV02.mmAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#mmAccountServicerIdentification
 * AccountClosingAdditionalInformationRequestV02.mmAccountServicerIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#mmTransferAccountServicerIdentification
 * AccountClosingAdditionalInformationRequestV02.
 * mmTransferAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02#mmAccountServicerIdentification
 * AccountClosingAmendmentRequestV02.mmAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02#mmTransferAccountServicerIdentification
 * AccountClosingAmendmentRequestV02.mmTransferAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV02#mmAccountServicerIdentification
 * AccountClosingRequestV02.mmAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV02#mmTransferAccountServicerIdentification
 * AccountClosingRequestV02.mmTransferAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02#mmAccountServicerIdentification
 * AccountExcludedMandateMaintenanceAmendmentRequestV02.
 * mmAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#mmAccountServicerIdentification
 * AccountExcludedMandateMaintenanceRequestV02.mmAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#mmAccountServicerIdentification
 * AccountMandateMaintenanceAmendmentRequestV02.mmAccountServicerIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02#mmAccountServicerIdentification
 * AccountMandateMaintenanceRequestV02.mmAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAdditionalInformationRequestV02#mmAccountServicerIdentification
 * AccountOpeningAdditionalInformationRequestV02.mmAccountServicerIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02#mmAccountServicerIdentification
 * AccountOpeningAmendmentRequestV02.mmAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningRequestV02#mmAccountServicerIdentification
 * AccountOpeningRequestV02.mmAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportRequestV02#mmAccountServicerIdentification
 * AccountReportRequestV02.mmAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportV02#mmAccountServicerIdentification
 * AccountReportV02.mmAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02#mmAccountServicerIdentification
 * AccountRequestAcknowledgementV02.mmAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestRejectionV02#mmAccountServicerIdentification
 * AccountRequestRejectionV02.mmAccountServicerIdentification}</li>
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
 * "BranchAndFinancialInstitutionIdentification5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to uniquely and unambiguously identify a financial institution or a branch of a financial institution."
 * </li>
 * </ul>
 */
public class BranchAndFinancialInstitutionIdentification5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialInstitutionIdentification8 financialInstitutionIdentification;
	/**
	 * Unique and unambiguous identification of a financial institution, as
	 * assigned under an internationally recognised or proprietary
	 * identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8
	 * FinancialInstitutionIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstitutionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstitutionIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
			isDerived = false;
			xmlTag = "FinInstnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstitutionIdentification";
			definition = "Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitutionIdentification8.mmObject();
		}
	};
	protected BranchData2 branchIdentification;
	/**
	 * Identifies a specific branch of a financial institution.
	 * 
	 * Usage: This component should be used in case the identification
	 * information in the financial institution component does not provide
	 * identification up to branch level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BranchData2
	 * BranchData2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrnchId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BranchIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a specific branch of a financial institution.\n\nUsage: This component should be used in case the identification information in the financial institution component does not provide identification up to branch level."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBranchIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
			isDerived = false;
			xmlTag = "BrnchId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BranchIdentification";
			definition = "Identifies a specific branch of a financial institution.\n\nUsage: This component should be used in case the identification information in the financial institution component does not provide identification up to branch level.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchData2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmFinancialInstitutionIdentification,
						com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmBranchIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountAdditionalInformationRequestV02.mmAccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02.mmAccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02.mmTransferAccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02.mmAccountServicerIdentification, com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02.mmTransferAccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountClosingRequestV02.mmAccountServicerIdentification, com.tools20022.repository.area.acmt.AccountClosingRequestV02.mmTransferAccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02.mmAccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02.mmAccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02.mmAccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02.mmAccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountOpeningAdditionalInformationRequestV02.mmAccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02.mmAccountServicerIdentification, com.tools20022.repository.area.acmt.AccountOpeningRequestV02.mmAccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountReportRequestV02.mmAccountServicerIdentification, com.tools20022.repository.area.acmt.AccountReportV02.mmAccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02.mmAccountServicerIdentification, com.tools20022.repository.area.acmt.AccountRequestRejectionV02.mmAccountServicerIdentification);
				trace_lazy = () -> Organisation.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BranchAndFinancialInstitutionIdentification5";
				definition = "Set of elements used to uniquely and unambiguously identify a financial institution or a branch of a financial institution.";
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstitutionIdentification8 getFinancialInstitutionIdentification() {
		return financialInstitutionIdentification;
	}

	public void setFinancialInstitutionIdentification(com.tools20022.repository.msg.FinancialInstitutionIdentification8 financialInstitutionIdentification) {
		this.financialInstitutionIdentification = financialInstitutionIdentification;
	}

	public BranchData2 getBranchIdentification() {
		return branchIdentification;
	}

	public void setBranchIdentification(com.tools20022.repository.msg.BranchData2 branchIdentification) {
		this.branchIdentification = branchIdentification;
	}
}