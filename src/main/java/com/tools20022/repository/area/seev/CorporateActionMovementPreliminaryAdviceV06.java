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

package com.tools20022.repository.area.seev;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesEventsArchive;
import com.tools20022.repository.choice.AccountIdentification23Choice;
import com.tools20022.repository.choice.PartyIdentification40Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * Scope An account servicer sends the CorporateActionMovementPreliminaryAdvice
 * message to an account owner or its designated agent to pre-advise upcoming
 * posting or reversal of securities and/or cash postings. Usage The message may
 * also be used to: - re-send a message previously sent (the sub-function of the
 * message is Duplicate), - provide a third party with a copy of a message for
 * information (the sub-function of the message is Copy), - re-send to a third
 * party a copy of a message for information (the sub-function of the message is
 * Copy Duplicate), using the relevant elements in the business application
 * header (BAH). ISO 15022 - 20022 COEXISTENCE<br>
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards
 * will coexist for a certain number of years. Until this coexistence period
 * ends, the usage of certain data types is restricted to ensure
 * interoperability between ISO 15022 and 20022 users. Compliance to these rules
 * is mandatory in a coexistence environment. The coexistence restrictions are
 * described in a Textual Rule linked to the Message Items they concern. These
 * coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.035.001.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsArchive
 * SecuritiesEventsArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmPagination
 * CorporateActionMovementPreliminaryAdviceV06.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmMovementPreliminaryAdviceGeneralInformation
 * CorporateActionMovementPreliminaryAdviceV06.
 * mmMovementPreliminaryAdviceGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmPreviousMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceV06.
 * mmPreviousMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmNotificationIdentification
 * CorporateActionMovementPreliminaryAdviceV06.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmMovementConfirmationIdentification
 * CorporateActionMovementPreliminaryAdviceV06.
 * mmMovementConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmInstructionIdentification
 * CorporateActionMovementPreliminaryAdviceV06.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmOtherDocumentIdentification
 * CorporateActionMovementPreliminaryAdviceV06.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmEventsLinkage
 * CorporateActionMovementPreliminaryAdviceV06.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmReversalReason
 * CorporateActionMovementPreliminaryAdviceV06.mmReversalReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmCorporateActionGeneralInformation
 * CorporateActionMovementPreliminaryAdviceV06.
 * mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmAccountDetails
 * CorporateActionMovementPreliminaryAdviceV06.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmCorporateActionDetails
 * CorporateActionMovementPreliminaryAdviceV06.mmCorporateActionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmCorporateActionMovementDetails
 * CorporateActionMovementPreliminaryAdviceV06.mmCorporateActionMovementDetails}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmAdditionalInformation
 * CorporateActionMovementPreliminaryAdviceV06.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceV06.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceV06.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceV06.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceV06.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceV06.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceV06.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceV06.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceV06.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceV06.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmSupplementaryData
 * CorporateActionMovementPreliminaryAdviceV06.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CorpActnMvmntPrlimryAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionMovementPreliminaryAdviceV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nAn account servicer sends the CorporateActionMovementPreliminaryAdvice message to an account owner or its designated agent to pre-advise upcoming posting or reversal of securities and/or cash postings.\nUsage\nThe message may also be used to:\n- re-send a message previously sent (the sub-function of the message is Duplicate),\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\nusing the relevant elements in the business application header (BAH).\nISO 15022 - 20022 COEXISTENCE\r\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule#for_seev_CorporateActionMovementPreliminaryAdviceV06
 * ConstraintRateAndCorporateActionEventRule.
 * for_seev_CorporateActionMovementPreliminaryAdviceV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#for_seev_CorporateActionMovementPreliminaryAdviceV06
 * ConstraintSafekeepingAccount1Rule.
 * for_seev_CorporateActionMovementPreliminaryAdviceV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount2Rule#for_seev_CorporateActionMovementPreliminaryAdviceV06
 * ConstraintSafekeepingAccount2Rule.
 * for_seev_CorporateActionMovementPreliminaryAdviceV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherEventRule#for_seev_CorporateActionMovementPreliminaryAdviceV06
 * ConstraintOtherEventRule.for_seev_CorporateActionMovementPreliminaryAdviceV06
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistributionRule#for_seev_CorporateActionMovementPreliminaryAdviceV06
 * ConstraintIntermediateSecuritiesDistributionRule.
 * for_seev_CorporateActionMovementPreliminaryAdviceV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionMovementPreliminaryAdviceV06
 * ConstraintCoexistenceCharacterSetXRule.
 * for_seev_CorporateActionMovementPreliminaryAdviceV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#for_seev_CorporateActionMovementPreliminaryAdviceV06
 * ConstraintCoexistenceIdentificationRule.
 * for_seev_CorporateActionMovementPreliminaryAdviceV06}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07
 * CorporateActionMovementPreliminaryAdviceV07}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05
 * CorporateActionMovementPreliminaryAdviceV05}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionMovementPreliminaryAdviceV06", propOrder = {"pagination", "movementPreliminaryAdviceGeneralInformation", "previousMovementPreliminaryAdviceIdentification", "notificationIdentification",
		"movementConfirmationIdentification", "instructionIdentification", "otherDocumentIdentification", "eventsLinkage", "reversalReason", "corporateActionGeneralInformation", "accountDetails", "corporateActionDetails",
		"corporateActionMovementDetails", "additionalInformation", "issuerAgent", "payingAgent", "subPayingAgent", "registrar", "resellingAgent", "physicalSecuritiesAgent", "dropAgent", "solicitationAgent", "informationAgent",
		"supplementaryData"})
public class CorporateActionMovementPreliminaryAdviceV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pgntn")
	protected Pagination pagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pgntn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the message and continuation indicator to indicate that the multi-parts preliminary advice is to continue or that the message is the last page of the multi-parts preliminary advice."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmPagination
	 * CorporateActionMovementPreliminaryAdviceV07.mmPagination}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmPagination
	 * CorporateActionMovementPreliminaryAdviceV05.mmPagination}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<Pagination>> mmPagination = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<Pagination>>() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Page number of the message and continuation indicator to indicate that the multi-parts preliminary advice is to continue or that the message is the last page of the multi-parts preliminary advice.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmPagination);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmPagination;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Optional<Pagination> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getPagination();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, Optional<Pagination> value) {
			obj.setPagination(value.orElse(null));
		}
	};
	@XmlElement(name = "MvmntPrlimryAdvcGnlInf", required = true)
	protected CorporateActionPreliminaryAdviceType2 movementPreliminaryAdviceGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType2
	 * CorporateActionPreliminaryAdviceType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MvmntPrlimryAdvcGnlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementPreliminaryAdviceGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information about the movement preliminary advice document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmMovementPreliminaryAdviceGeneralInformation
	 * CorporateActionMovementPreliminaryAdviceV07.
	 * mmMovementPreliminaryAdviceGeneralInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmMovementPreliminaryAdviceGeneralInformation
	 * CorporateActionMovementPreliminaryAdviceV05.
	 * mmMovementPreliminaryAdviceGeneralInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, CorporateActionPreliminaryAdviceType2> mmMovementPreliminaryAdviceGeneralInformation = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, CorporateActionPreliminaryAdviceType2>() {
		{
			xmlTag = "MvmntPrlimryAdvcGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementPreliminaryAdviceGeneralInformation";
			definition = "General information about the movement preliminary advice document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmMovementPreliminaryAdviceGeneralInformation);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmMovementPreliminaryAdviceGeneralInformation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionPreliminaryAdviceType2.mmObject();
		}

		@Override
		public CorporateActionPreliminaryAdviceType2 getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getMovementPreliminaryAdviceGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, CorporateActionPreliminaryAdviceType2 value) {
			obj.setMovementPreliminaryAdviceGeneralInformation(value);
		}
	};
	@XmlElement(name = "PrvsMvmntPrlimryAdvcId")
	protected DocumentIdentification15 previousMovementPreliminaryAdviceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification15
	 * DocumentIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsMvmntPrlimryAdvcId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousMovementPreliminaryAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent movement preliminary advice document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmPreviousMovementPreliminaryAdviceIdentification
	 * CorporateActionMovementPreliminaryAdviceV07.
	 * mmPreviousMovementPreliminaryAdviceIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmPreviousMovementPreliminaryAdviceIdentification
	 * CorporateActionMovementPreliminaryAdviceV05.
	 * mmPreviousMovementPreliminaryAdviceIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<DocumentIdentification15>> mmPreviousMovementPreliminaryAdviceIdentification = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<DocumentIdentification15>>() {
		{
			xmlTag = "PrvsMvmntPrlimryAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousMovementPreliminaryAdviceIdentification";
			definition = "Identification of a previously sent movement preliminary advice document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmPreviousMovementPreliminaryAdviceIdentification);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmPreviousMovementPreliminaryAdviceIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification15.mmObject();
		}

		@Override
		public Optional<DocumentIdentification15> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getPreviousMovementPreliminaryAdviceIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, Optional<DocumentIdentification15> value) {
			obj.setPreviousMovementPreliminaryAdviceIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "NtfctnId")
	protected DocumentIdentification15 notificationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification15
	 * DocumentIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent notification document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmNotificationIdentification
	 * CorporateActionMovementPreliminaryAdviceV07.mmNotificationIdentification}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmNotificationIdentification
	 * CorporateActionMovementPreliminaryAdviceV05.mmNotificationIdentification}
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<DocumentIdentification15>> mmNotificationIdentification = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<DocumentIdentification15>>() {
		{
			xmlTag = "NtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationIdentification";
			definition = "Identification of a previously sent notification document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmNotificationIdentification);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmNotificationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification15.mmObject();
		}

		@Override
		public Optional<DocumentIdentification15> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getNotificationIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, Optional<DocumentIdentification15> value) {
			obj.setNotificationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "MvmntConfId")
	protected DocumentIdentification15 movementConfirmationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification15
	 * DocumentIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MvmntConfId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementConfirmationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent movement confirmation document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmMovementConfirmationIdentification
	 * CorporateActionMovementPreliminaryAdviceV07.
	 * mmMovementConfirmationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmMovementConfirmationIdentification
	 * CorporateActionMovementPreliminaryAdviceV05.
	 * mmMovementConfirmationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<DocumentIdentification15>> mmMovementConfirmationIdentification = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<DocumentIdentification15>>() {
		{
			xmlTag = "MvmntConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementConfirmationIdentification";
			definition = "Identification of a previously sent movement confirmation document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmMovementConfirmationIdentification);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmMovementConfirmationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification15.mmObject();
		}

		@Override
		public Optional<DocumentIdentification15> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getMovementConfirmationIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, Optional<DocumentIdentification15> value) {
			obj.setMovementConfirmationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrId")
	protected DocumentIdentification9 instructionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification9
	 * DocumentIdentification9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a related instruction document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmInstructionIdentification
	 * CorporateActionMovementPreliminaryAdviceV07.mmInstructionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmInstructionIdentification
	 * CorporateActionMovementPreliminaryAdviceV05.mmInstructionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<DocumentIdentification9>> mmInstructionIdentification = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<DocumentIdentification9>>() {
		{
			xmlTag = "InstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Identification of a related instruction document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmInstructionIdentification);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmInstructionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification9.mmObject();
		}

		@Override
		public Optional<DocumentIdentification9> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getInstructionIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, Optional<DocumentIdentification9> value) {
			obj.setInstructionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrDocId")
	protected List<DocumentIdentification13> otherDocumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification13
	 * DocumentIdentification13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrDocId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of other documents as well as the document number."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmOtherDocumentIdentification
	 * CorporateActionMovementPreliminaryAdviceV07.mmOtherDocumentIdentification
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmOtherDocumentIdentification
	 * CorporateActionMovementPreliminaryAdviceV05.mmOtherDocumentIdentification
	 * }</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, List<DocumentIdentification13>> mmOtherDocumentIdentification = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, List<DocumentIdentification13>>() {
		{
			xmlTag = "OthrDocId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentIdentification";
			definition = "Identification of other documents as well as the document number.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmOtherDocumentIdentification);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmOtherDocumentIdentification;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification13.mmObject();
		}

		@Override
		public List<DocumentIdentification13> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getOtherDocumentIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, List<DocumentIdentification13> value) {
			obj.setOtherDocumentIdentification(value);
		}
	};
	@XmlElement(name = "EvtsLkg")
	protected List<CorporateActionEventReference1> eventsLinkage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference1
	 * CorporateActionEventReference1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtsLkg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventsLinkage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an other corporate action event that needs to be closely linked to the processing of the event notified in this document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmEventsLinkage
	 * CorporateActionMovementPreliminaryAdviceV07.mmEventsLinkage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmEventsLinkage
	 * CorporateActionMovementPreliminaryAdviceV05.mmEventsLinkage}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, List<CorporateActionEventReference1>> mmEventsLinkage = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, List<CorporateActionEventReference1>>() {
		{
			xmlTag = "EvtsLkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventsLinkage";
			definition = "Identification of an other corporate action event that needs to be closely linked to the processing of the event notified in this document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmEventsLinkage);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmEventsLinkage;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionEventReference1.mmObject();
		}

		@Override
		public List<CorporateActionEventReference1> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getEventsLinkage();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, List<CorporateActionEventReference1> value) {
			obj.setEventsLinkage(value);
		}
	};
	@XmlElement(name = "RvslRsn")
	protected CorporateActionReversalReason1 reversalReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason1
	 * CorporateActionReversalReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the reversal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmReversalReason
	 * CorporateActionMovementPreliminaryAdviceV07.mmReversalReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmReversalReason
	 * CorporateActionMovementPreliminaryAdviceV05.mmReversalReason}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<CorporateActionReversalReason1>> mmReversalReason = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<CorporateActionReversalReason1>>() {
		{
			xmlTag = "RvslRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalReason";
			definition = "Reason for the reversal.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmReversalReason);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmReversalReason;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionReversalReason1.mmObject();
		}

		@Override
		public Optional<CorporateActionReversalReason1> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getReversalReason();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, Optional<CorporateActionReversalReason1> value) {
			obj.setReversalReason(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionGeneralInformation69 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation69
	 * CorporateActionGeneralInformation69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnGnlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information about the corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmCorporateActionGeneralInformation
	 * CorporateActionMovementPreliminaryAdviceV07.
	 * mmCorporateActionGeneralInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmCorporateActionGeneralInformation
	 * CorporateActionMovementPreliminaryAdviceV05.
	 * mmCorporateActionGeneralInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, CorporateActionGeneralInformation69> mmCorporateActionGeneralInformation = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, CorporateActionGeneralInformation69>() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmCorporateActionGeneralInformation);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmCorporateActionGeneralInformation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionGeneralInformation69.mmObject();
		}

		@Override
		public CorporateActionGeneralInformation69 getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getCorporateActionGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, CorporateActionGeneralInformation69 value) {
			obj.setCorporateActionGeneralInformation(value);
		}
	};
	@XmlElement(name = "AcctDtls", required = true)
	protected AccountIdentification23Choice accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification23Choice
	 * AccountIdentification23Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information about the safekeeping account, owner and account balance."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmAccountDetails
	 * CorporateActionMovementPreliminaryAdviceV07.mmAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmAccountDetails
	 * CorporateActionMovementPreliminaryAdviceV05.mmAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, AccountIdentification23Choice> mmAccountDetails = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, AccountIdentification23Choice>() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "General information about the safekeeping account, owner and account balance.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmAccountDetails);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmAccountDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification23Choice.mmObject();
		}

		@Override
		public AccountIdentification23Choice getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getAccountDetails();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, AccountIdentification23Choice value) {
			obj.setAccountDetails(value);
		}
	};
	@XmlElement(name = "CorpActnDtls")
	protected CorporateAction24 corporateActionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction24
	 * CorporateAction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmCorporateActionDetails
	 * CorporateActionMovementPreliminaryAdviceV07.mmCorporateActionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmCorporateActionDetails
	 * CorporateActionMovementPreliminaryAdviceV05.mmCorporateActionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<CorporateAction24>> mmCorporateActionDetails = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<CorporateAction24>>() {
		{
			xmlTag = "CorpActnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionDetails";
			definition = "Information about the corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmCorporateActionDetails);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmCorporateActionDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateAction24.mmObject();
		}

		@Override
		public Optional<CorporateAction24> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getCorporateActionDetails();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, Optional<CorporateAction24> value) {
			obj.setCorporateActionDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnMvmntDtls")
	protected List<CorporateActionOption100> corporateActionMovementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100
	 * CorporateActionOption100}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnMvmntDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the corporate action option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmCorporateActionMovementDetails
	 * CorporateActionMovementPreliminaryAdviceV07.
	 * mmCorporateActionMovementDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmCorporateActionMovementDetails
	 * CorporateActionMovementPreliminaryAdviceV05.
	 * mmCorporateActionMovementDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, List<CorporateActionOption100>> mmCorporateActionMovementDetails = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, List<CorporateActionOption100>>() {
		{
			xmlTag = "CorpActnMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionMovementDetails";
			definition = "Information about the corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmCorporateActionMovementDetails);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmCorporateActionMovementDetails;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionOption100.mmObject();
		}

		@Override
		public List<CorporateActionOption100> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getCorporateActionMovementDetails();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, List<CorporateActionOption100> value) {
			obj.setCorporateActionMovementDetails(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateActionNarrative6 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative6
	 * CorporateActionNarrative6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmAdditionalInformation
	 * CorporateActionMovementPreliminaryAdviceV07.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmAdditionalInformation
	 * CorporateActionMovementPreliminaryAdviceV05.mmAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<CorporateActionNarrative6>> mmAdditionalInformation = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<CorporateActionNarrative6>>() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmAdditionalInformation);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmAdditionalInformation;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionNarrative6.mmObject();
		}

		@Override
		public Optional<CorporateActionNarrative6> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, Optional<CorporateActionNarrative6> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "IssrAgt")
	protected List<PartyIdentification40Choice> issuerAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
	 * PartyIdentification40Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmIssuerAgent
	 * CorporateActionMovementPreliminaryAdviceV07.mmIssuerAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmIssuerAgent
	 * CorporateActionMovementPreliminaryAdviceV05.mmIssuerAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, List<PartyIdentification40Choice>> mmIssuerAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, List<PartyIdentification40Choice>>() {
		{
			xmlTag = "IssrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgent";
			definition = "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmIssuerAgent);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmIssuerAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification40Choice.mmObject();
		}

		@Override
		public List<PartyIdentification40Choice> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getIssuerAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, List<PartyIdentification40Choice> value) {
			obj.setIssuerAgent(value);
		}
	};
	@XmlElement(name = "PngAgt")
	protected List<PartyIdentification40Choice> payingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
	 * PartyIdentification40Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PngAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmPayingAgent
	 * CorporateActionMovementPreliminaryAdviceV07.mmPayingAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmPayingAgent
	 * CorporateActionMovementPreliminaryAdviceV05.mmPayingAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, List<PartyIdentification40Choice>> mmPayingAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, List<PartyIdentification40Choice>>() {
		{
			xmlTag = "PngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			definition = "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmPayingAgent);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmPayingAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification40Choice.mmObject();
		}

		@Override
		public List<PartyIdentification40Choice> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getPayingAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, List<PartyIdentification40Choice> value) {
			obj.setPayingAgent(value);
		}
	};
	@XmlElement(name = "SubPngAgt")
	protected List<PartyIdentification40Choice> subPayingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
	 * PartyIdentification40Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubPngAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubPayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmSubPayingAgent
	 * CorporateActionMovementPreliminaryAdviceV07.mmSubPayingAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmSubPayingAgent
	 * CorporateActionMovementPreliminaryAdviceV05.mmSubPayingAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, List<PartyIdentification40Choice>> mmSubPayingAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, List<PartyIdentification40Choice>>() {
		{
			xmlTag = "SubPngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubPayingAgent";
			definition = "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmSubPayingAgent);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmSubPayingAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification40Choice.mmObject();
		}

		@Override
		public List<PartyIdentification40Choice> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getSubPayingAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, List<PartyIdentification40Choice> value) {
			obj.setSubPayingAgent(value);
		}
	};
	@XmlElement(name = "Regar")
	protected PartyIdentification40Choice registrar;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
	 * PartyIdentification40Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Regar"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party/agent responsible for maintaining the register of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmRegistrar
	 * CorporateActionMovementPreliminaryAdviceV07.mmRegistrar}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmRegistrar
	 * CorporateActionMovementPreliminaryAdviceV05.mmRegistrar}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<PartyIdentification40Choice>> mmRegistrar = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<PartyIdentification40Choice>>() {
		{
			xmlTag = "Regar";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registrar";
			definition = "Party/agent responsible for maintaining the register of a security.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmRegistrar);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmRegistrar;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification40Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification40Choice> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getRegistrar();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, Optional<PartyIdentification40Choice> value) {
			obj.setRegistrar(value.orElse(null));
		}
	};
	@XmlElement(name = "RsellngAgt")
	protected List<PartyIdentification40Choice> resellingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
	 * PartyIdentification40Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsellngAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResellingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A broker-dealer responsible for reselling to new investors securities (usually bonds) that have been tendered for purchase by their owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmResellingAgent
	 * CorporateActionMovementPreliminaryAdviceV07.mmResellingAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmResellingAgent
	 * CorporateActionMovementPreliminaryAdviceV05.mmResellingAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, List<PartyIdentification40Choice>> mmResellingAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, List<PartyIdentification40Choice>>() {
		{
			xmlTag = "RsellngAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResellingAgent";
			definition = "A broker-dealer responsible for reselling to new investors securities (usually bonds) that have been tendered for purchase by their owner.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmResellingAgent);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmResellingAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification40Choice.mmObject();
		}

		@Override
		public List<PartyIdentification40Choice> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getResellingAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, List<PartyIdentification40Choice> value) {
			obj.setResellingAgent(value);
		}
	};
	@XmlElement(name = "PhysSctiesAgt")
	protected PartyIdentification40Choice physicalSecuritiesAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
	 * PartyIdentification40Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysSctiesAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSecuritiesAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution assigned by an issuer to accept presentations of instruments, usually bonds, for transfer and or exchange."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmPhysicalSecuritiesAgent
	 * CorporateActionMovementPreliminaryAdviceV07.mmPhysicalSecuritiesAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmPhysicalSecuritiesAgent
	 * CorporateActionMovementPreliminaryAdviceV05.mmPhysicalSecuritiesAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<PartyIdentification40Choice>> mmPhysicalSecuritiesAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<PartyIdentification40Choice>>() {
		{
			xmlTag = "PhysSctiesAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSecuritiesAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to accept presentations of instruments, usually bonds, for transfer and or exchange.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmPhysicalSecuritiesAgent);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmPhysicalSecuritiesAgent;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification40Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification40Choice> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getPhysicalSecuritiesAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, Optional<PartyIdentification40Choice> value) {
			obj.setPhysicalSecuritiesAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "DrpAgt")
	protected PartyIdentification40Choice dropAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
	 * PartyIdentification40Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrpAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DropAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution who acts on behalf of an out of town agent or event agent where securities can be delivered in person."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmDropAgent
	 * CorporateActionMovementPreliminaryAdviceV07.mmDropAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmDropAgent
	 * CorporateActionMovementPreliminaryAdviceV05.mmDropAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<PartyIdentification40Choice>> mmDropAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<PartyIdentification40Choice>>() {
		{
			xmlTag = "DrpAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DropAgent";
			definition = "A trust company, bank or similar financial institution who acts on behalf of an out of town agent or event agent where securities can be delivered in person.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmDropAgent);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmDropAgent;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification40Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification40Choice> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getDropAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, Optional<PartyIdentification40Choice> value) {
			obj.setDropAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "SlctnAgt")
	protected List<PartyIdentification40Choice> solicitationAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
	 * PartyIdentification40Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlctnAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution assigned by an issuer to maintain records of investors and account balances and transactions for the consent of a material change."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmSolicitationAgent
	 * CorporateActionMovementPreliminaryAdviceV07.mmSolicitationAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmSolicitationAgent
	 * CorporateActionMovementPreliminaryAdviceV05.mmSolicitationAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, List<PartyIdentification40Choice>> mmSolicitationAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, List<PartyIdentification40Choice>>() {
		{
			xmlTag = "SlctnAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to maintain records of investors and account balances and transactions for the consent of a material change.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmSolicitationAgent);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmSolicitationAgent;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification40Choice.mmObject();
		}

		@Override
		public List<PartyIdentification40Choice> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getSolicitationAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, List<PartyIdentification40Choice> value) {
			obj.setSolicitationAgent(value);
		}
	};
	@XmlElement(name = "InfAgt")
	protected PartyIdentification40Choice informationAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
	 * PartyIdentification40Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution assigned by an Issuer to provide information and copies of the offering documentation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmInformationAgent
	 * CorporateActionMovementPreliminaryAdviceV07.mmInformationAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmInformationAgent
	 * CorporateActionMovementPreliminaryAdviceV05.mmInformationAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<PartyIdentification40Choice>> mmInformationAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, Optional<PartyIdentification40Choice>>() {
		{
			xmlTag = "InfAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an Issuer to provide information and copies of the offering documentation.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmInformationAgent);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmInformationAgent;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification40Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification40Choice> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getInformationAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, Optional<PartyIdentification40Choice> value) {
			obj.setInformationAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmSupplementaryData
	 * CorporateActionMovementPreliminaryAdviceV07.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmSupplementaryData
	 * CorporateActionMovementPreliminaryAdviceV05.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV06, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmSupplementaryData);
			previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CorporateActionMovementPreliminaryAdviceV06 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV06 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRateAndCorporateActionEventRule.for_seev_CorporateActionMovementPreliminaryAdviceV06,
						com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.for_seev_CorporateActionMovementPreliminaryAdviceV06,
						com.tools20022.repository.constraints.ConstraintSafekeepingAccount2Rule.for_seev_CorporateActionMovementPreliminaryAdviceV06,
						com.tools20022.repository.constraints.ConstraintOtherEventRule.for_seev_CorporateActionMovementPreliminaryAdviceV06,
						com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistributionRule.for_seev_CorporateActionMovementPreliminaryAdviceV06,
						com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionMovementPreliminaryAdviceV06,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.for_seev_CorporateActionMovementPreliminaryAdviceV06);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionMovementPreliminaryAdviceV06";
				definition = "Scope\nAn account servicer sends the CorporateActionMovementPreliminaryAdvice message to an account owner or its designated agent to pre-advise upcoming posting or reversal of securities and/or cash postings.\nUsage\nThe message may also be used to:\n- re-send a message previously sent (the sub-function of the message is Duplicate),\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\nusing the relevant elements in the business application header (BAH).\nISO 15022 - 20022 COEXISTENCE\r\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV07.mmObject());
				previousVersion_lazy = () -> CorporateActionMovementPreliminaryAdviceV05.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "CorpActnMvmntPrlimryAdvc";
				businessArea_lazy = () -> SecuritiesEventsArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmPagination,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmMovementPreliminaryAdviceGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmPreviousMovementPreliminaryAdviceIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmNotificationIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmMovementConfirmationIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmInstructionIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmOtherDocumentIdentification, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmEventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmReversalReason, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmAccountDetails, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmCorporateActionDetails,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmCorporateActionMovementDetails,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmAdditionalInformation, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmIssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmPayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmSubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmRegistrar, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmPhysicalSecuritiesAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmDropAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmSolicitationAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmInformationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "035";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionMovementPreliminaryAdviceV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Pagination> getPagination() {
		return pagination == null ? Optional.empty() : Optional.of(pagination);
	}

	public CorporateActionMovementPreliminaryAdviceV06 setPagination(Pagination pagination) {
		this.pagination = pagination;
		return this;
	}

	public CorporateActionPreliminaryAdviceType2 getMovementPreliminaryAdviceGeneralInformation() {
		return movementPreliminaryAdviceGeneralInformation;
	}

	public CorporateActionMovementPreliminaryAdviceV06 setMovementPreliminaryAdviceGeneralInformation(CorporateActionPreliminaryAdviceType2 movementPreliminaryAdviceGeneralInformation) {
		this.movementPreliminaryAdviceGeneralInformation = Objects.requireNonNull(movementPreliminaryAdviceGeneralInformation);
		return this;
	}

	public Optional<DocumentIdentification15> getPreviousMovementPreliminaryAdviceIdentification() {
		return previousMovementPreliminaryAdviceIdentification == null ? Optional.empty() : Optional.of(previousMovementPreliminaryAdviceIdentification);
	}

	public CorporateActionMovementPreliminaryAdviceV06 setPreviousMovementPreliminaryAdviceIdentification(DocumentIdentification15 previousMovementPreliminaryAdviceIdentification) {
		this.previousMovementPreliminaryAdviceIdentification = previousMovementPreliminaryAdviceIdentification;
		return this;
	}

	public Optional<DocumentIdentification15> getNotificationIdentification() {
		return notificationIdentification == null ? Optional.empty() : Optional.of(notificationIdentification);
	}

	public CorporateActionMovementPreliminaryAdviceV06 setNotificationIdentification(DocumentIdentification15 notificationIdentification) {
		this.notificationIdentification = notificationIdentification;
		return this;
	}

	public Optional<DocumentIdentification15> getMovementConfirmationIdentification() {
		return movementConfirmationIdentification == null ? Optional.empty() : Optional.of(movementConfirmationIdentification);
	}

	public CorporateActionMovementPreliminaryAdviceV06 setMovementConfirmationIdentification(DocumentIdentification15 movementConfirmationIdentification) {
		this.movementConfirmationIdentification = movementConfirmationIdentification;
		return this;
	}

	public Optional<DocumentIdentification9> getInstructionIdentification() {
		return instructionIdentification == null ? Optional.empty() : Optional.of(instructionIdentification);
	}

	public CorporateActionMovementPreliminaryAdviceV06 setInstructionIdentification(DocumentIdentification9 instructionIdentification) {
		this.instructionIdentification = instructionIdentification;
		return this;
	}

	public List<DocumentIdentification13> getOtherDocumentIdentification() {
		return otherDocumentIdentification == null ? otherDocumentIdentification = new ArrayList<>() : otherDocumentIdentification;
	}

	public CorporateActionMovementPreliminaryAdviceV06 setOtherDocumentIdentification(List<DocumentIdentification13> otherDocumentIdentification) {
		this.otherDocumentIdentification = Objects.requireNonNull(otherDocumentIdentification);
		return this;
	}

	public List<CorporateActionEventReference1> getEventsLinkage() {
		return eventsLinkage == null ? eventsLinkage = new ArrayList<>() : eventsLinkage;
	}

	public CorporateActionMovementPreliminaryAdviceV06 setEventsLinkage(List<CorporateActionEventReference1> eventsLinkage) {
		this.eventsLinkage = Objects.requireNonNull(eventsLinkage);
		return this;
	}

	public Optional<CorporateActionReversalReason1> getReversalReason() {
		return reversalReason == null ? Optional.empty() : Optional.of(reversalReason);
	}

	public CorporateActionMovementPreliminaryAdviceV06 setReversalReason(CorporateActionReversalReason1 reversalReason) {
		this.reversalReason = reversalReason;
		return this;
	}

	public CorporateActionGeneralInformation69 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public CorporateActionMovementPreliminaryAdviceV06 setCorporateActionGeneralInformation(CorporateActionGeneralInformation69 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public AccountIdentification23Choice getAccountDetails() {
		return accountDetails;
	}

	public CorporateActionMovementPreliminaryAdviceV06 setAccountDetails(AccountIdentification23Choice accountDetails) {
		this.accountDetails = Objects.requireNonNull(accountDetails);
		return this;
	}

	public Optional<CorporateAction24> getCorporateActionDetails() {
		return corporateActionDetails == null ? Optional.empty() : Optional.of(corporateActionDetails);
	}

	public CorporateActionMovementPreliminaryAdviceV06 setCorporateActionDetails(CorporateAction24 corporateActionDetails) {
		this.corporateActionDetails = corporateActionDetails;
		return this;
	}

	public List<CorporateActionOption100> getCorporateActionMovementDetails() {
		return corporateActionMovementDetails == null ? corporateActionMovementDetails = new ArrayList<>() : corporateActionMovementDetails;
	}

	public CorporateActionMovementPreliminaryAdviceV06 setCorporateActionMovementDetails(List<CorporateActionOption100> corporateActionMovementDetails) {
		this.corporateActionMovementDetails = Objects.requireNonNull(corporateActionMovementDetails);
		return this;
	}

	public Optional<CorporateActionNarrative6> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CorporateActionMovementPreliminaryAdviceV06 setAdditionalInformation(CorporateActionNarrative6 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<PartyIdentification40Choice> getIssuerAgent() {
		return issuerAgent == null ? issuerAgent = new ArrayList<>() : issuerAgent;
	}

	public CorporateActionMovementPreliminaryAdviceV06 setIssuerAgent(List<PartyIdentification40Choice> issuerAgent) {
		this.issuerAgent = Objects.requireNonNull(issuerAgent);
		return this;
	}

	public List<PartyIdentification40Choice> getPayingAgent() {
		return payingAgent == null ? payingAgent = new ArrayList<>() : payingAgent;
	}

	public CorporateActionMovementPreliminaryAdviceV06 setPayingAgent(List<PartyIdentification40Choice> payingAgent) {
		this.payingAgent = Objects.requireNonNull(payingAgent);
		return this;
	}

	public List<PartyIdentification40Choice> getSubPayingAgent() {
		return subPayingAgent == null ? subPayingAgent = new ArrayList<>() : subPayingAgent;
	}

	public CorporateActionMovementPreliminaryAdviceV06 setSubPayingAgent(List<PartyIdentification40Choice> subPayingAgent) {
		this.subPayingAgent = Objects.requireNonNull(subPayingAgent);
		return this;
	}

	public Optional<PartyIdentification40Choice> getRegistrar() {
		return registrar == null ? Optional.empty() : Optional.of(registrar);
	}

	public CorporateActionMovementPreliminaryAdviceV06 setRegistrar(PartyIdentification40Choice registrar) {
		this.registrar = registrar;
		return this;
	}

	public List<PartyIdentification40Choice> getResellingAgent() {
		return resellingAgent == null ? resellingAgent = new ArrayList<>() : resellingAgent;
	}

	public CorporateActionMovementPreliminaryAdviceV06 setResellingAgent(List<PartyIdentification40Choice> resellingAgent) {
		this.resellingAgent = Objects.requireNonNull(resellingAgent);
		return this;
	}

	public Optional<PartyIdentification40Choice> getPhysicalSecuritiesAgent() {
		return physicalSecuritiesAgent == null ? Optional.empty() : Optional.of(physicalSecuritiesAgent);
	}

	public CorporateActionMovementPreliminaryAdviceV06 setPhysicalSecuritiesAgent(PartyIdentification40Choice physicalSecuritiesAgent) {
		this.physicalSecuritiesAgent = physicalSecuritiesAgent;
		return this;
	}

	public Optional<PartyIdentification40Choice> getDropAgent() {
		return dropAgent == null ? Optional.empty() : Optional.of(dropAgent);
	}

	public CorporateActionMovementPreliminaryAdviceV06 setDropAgent(PartyIdentification40Choice dropAgent) {
		this.dropAgent = dropAgent;
		return this;
	}

	public List<PartyIdentification40Choice> getSolicitationAgent() {
		return solicitationAgent == null ? solicitationAgent = new ArrayList<>() : solicitationAgent;
	}

	public CorporateActionMovementPreliminaryAdviceV06 setSolicitationAgent(List<PartyIdentification40Choice> solicitationAgent) {
		this.solicitationAgent = Objects.requireNonNull(solicitationAgent);
		return this;
	}

	public Optional<PartyIdentification40Choice> getInformationAgent() {
		return informationAgent == null ? Optional.empty() : Optional.of(informationAgent);
	}

	public CorporateActionMovementPreliminaryAdviceV06 setInformationAgent(PartyIdentification40Choice informationAgent) {
		this.informationAgent = informationAgent;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CorporateActionMovementPreliminaryAdviceV06 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.035.001.06")
	static public class Document {
		@XmlElement(name = "CorpActnMvmntPrlimryAdvc", required = true)
		public CorporateActionMovementPreliminaryAdviceV06 messageBody;
	}
}