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

package com.tools20022.repository.area.sese;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementArchive;
import com.tools20022.repository.choice.PartyIdentification36Choice;
import com.tools20022.repository.msg.AdditionalInformation7;
import com.tools20022.repository.msg.RequestDetails11;
import com.tools20022.repository.msg.SecuritiesAccount13;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * Scope An account owner sends a
 * SecuritiesSettlementConditionsModificationRequest to an account servicer to
 * request the modification of a processing indicator or another non-matching
 * information. The account owner/servicer relationship may be: - a central
 * securities depository participant which has an account with a central
 * securities depository. It could also be, if agreed in a service level
 * agreement: - a global custodian which has an account with its local agent
 * (sub-custodian), or - an investment management institution which manage a
 * fund account opened at a custodian, or - a broker which has an account with a
 * custodian, or - a central securities depository which has an account with a
 * custodian, another central securities depository or another settlement market
 * infrastructure.
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 * 
 * This message cannot be used to request the modification of trade or event
 * details. The use of AdditionalInformation and its fields must be pre-agreed
 * between account servicer and account owner. The fields in that sequence
 * cannot be used to amend a trade or event detail unless authorised by country
 * market practice.
 * 
 * ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.030.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV04#mmAccountOwner
 * SecuritiesSettlementConditionsModificationRequestV04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV04#mmSafekeepingAccount
 * SecuritiesSettlementConditionsModificationRequestV04.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV04#mmRequestDetails
 * SecuritiesSettlementConditionsModificationRequestV04.mmRequestDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV04#mmAdditionalInformation
 * SecuritiesSettlementConditionsModificationRequestV04.mmAdditionalInformation}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV04#mmSupplementaryData
 * SecuritiesSettlementConditionsModificationRequestV04.mmSupplementaryData}</li>
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
 * xmlTag} = "SctiesSttlmCondsModReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementConditionsModificationRequestV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nAn account owner sends a SecuritiesSettlementConditionsModificationRequest to an account servicer to request the modification of a processing indicator or another non-matching information.\nThe account owner/servicer relationship may be:\n- a central securities depository participant which has an account with a central securities depository.\nIt could also be, if agreed in a service level agreement:\n- a global custodian which has an account with its local agent (sub-custodian), or\n- an investment management institution which manage a fund account opened at a custodian, or\n- a broker which has an account with a custodian, or\n- a central securities depository which has an account with a custodian, another central securities depository or another settlement market infrastructure.\n\nUsage\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nThis message cannot be used to request the modification of trade or event details.\nThe use of AdditionalInformation and its fields must be pre-agreed between account servicer and account owner. The fields in that sequence cannot be used to amend a trade or event detail unless authorised by country market practice.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementConditionsModificationRequestV04
 * ConstraintCoexistenceCharacterSetXRule.
 * for_sese_SecuritiesSettlementConditionsModificationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#for_sese_SecuritiesSettlementConditionsModificationRequestV04
 * ConstraintCoexistenceIdentificationRule.
 * for_sese_SecuritiesSettlementConditionsModificationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementConditionsModificationRequestV04
 * ConstraintSecuritiesMarketPracticeGroupGuideline.
 * for_sese_SecuritiesSettlementConditionsModificationRequestV04}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV05
 * SecuritiesSettlementConditionsModificationRequestV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV03
 * SecuritiesSettlementConditionsModificationRequestV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesSettlementConditionsModificationRequestV04", propOrder = {"accountOwner", "safekeepingAccount", "requestDetails", "additionalInformation", "supplementaryData"})
public class SecuritiesSettlementConditionsModificationRequestV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification36Choice accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice
	 * PartyIdentification36Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV05#mmAccountOwner
	 * SecuritiesSettlementConditionsModificationRequestV05.mmAccountOwner}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementConditionsModificationRequestV04, Optional<PartyIdentification36Choice>> mmAccountOwner = new MMMessageBuildingBlock<SecuritiesSettlementConditionsModificationRequestV04, Optional<PartyIdentification36Choice>>() {
		{
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementConditionsModificationRequestV05.mmAccountOwner);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification36Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification36Choice> getValue(SecuritiesSettlementConditionsModificationRequestV04 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(SecuritiesSettlementConditionsModificationRequestV04 obj, Optional<PartyIdentification36Choice> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct", required = true)
	protected SecuritiesAccount13 safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV05#mmSafekeepingAccount
	 * SecuritiesSettlementConditionsModificationRequestV05.mmSafekeepingAccount
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementConditionsModificationRequestV04, SecuritiesAccount13> mmSafekeepingAccount = new MMMessageBuildingBlock<SecuritiesSettlementConditionsModificationRequestV04, SecuritiesAccount13>() {
		{
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementConditionsModificationRequestV05.mmSafekeepingAccount);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount13.mmObject();
		}

		@Override
		public SecuritiesAccount13 getValue(SecuritiesSettlementConditionsModificationRequestV04 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(SecuritiesSettlementConditionsModificationRequestV04 obj, SecuritiesAccount13 value) {
			obj.setSafekeepingAccount(value);
		}
	};
	@XmlElement(name = "ReqDtls", required = true)
	protected List<RequestDetails11> requestDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails11
	 * RequestDetails11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV05#mmRequestDetails
	 * SecuritiesSettlementConditionsModificationRequestV05.mmRequestDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementConditionsModificationRequestV04, List<RequestDetails11>> mmRequestDetails = new MMMessageBuildingBlock<SecuritiesSettlementConditionsModificationRequestV04, List<RequestDetails11>>() {
		{
			xmlTag = "ReqDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestDetails";
			definition = "Details of the request.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementConditionsModificationRequestV05.mmRequestDetails);
			minOccurs = 1;
			complexType_lazy = () -> RequestDetails11.mmObject();
		}

		@Override
		public List<RequestDetails11> getValue(SecuritiesSettlementConditionsModificationRequestV04 obj) {
			return obj.getRequestDetails();
		}

		@Override
		public void setValue(SecuritiesSettlementConditionsModificationRequestV04 obj, List<RequestDetails11> value) {
			obj.setRequestDetails(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<AdditionalInformation7> additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7
	 * AdditionalInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV05#mmAdditionalInformation
	 * SecuritiesSettlementConditionsModificationRequestV05.
	 * mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementConditionsModificationRequestV04, List<AdditionalInformation7>> mmAdditionalInformation = new MMMessageBuildingBlock<SecuritiesSettlementConditionsModificationRequestV04, List<AdditionalInformation7>>() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementConditionsModificationRequestV05.mmAdditionalInformation);
			minOccurs = 0;
			complexType_lazy = () -> AdditionalInformation7.mmObject();
		}

		@Override
		public List<AdditionalInformation7> getValue(SecuritiesSettlementConditionsModificationRequestV04 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(SecuritiesSettlementConditionsModificationRequestV04 obj, List<AdditionalInformation7> value) {
			obj.setAdditionalInformation(value);
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
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV05#mmSupplementaryData
	 * SecuritiesSettlementConditionsModificationRequestV05.mmSupplementaryData}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementConditionsModificationRequestV04, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<SecuritiesSettlementConditionsModificationRequestV04, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementConditionsModificationRequestV05.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SecuritiesSettlementConditionsModificationRequestV04 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SecuritiesSettlementConditionsModificationRequestV04 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementConditionsModificationRequestV04,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.for_sese_SecuritiesSettlementConditionsModificationRequestV04,
						com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementConditionsModificationRequestV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementConditionsModificationRequestV04";
				definition = "Scope\nAn account owner sends a SecuritiesSettlementConditionsModificationRequest to an account servicer to request the modification of a processing indicator or another non-matching information.\nThe account owner/servicer relationship may be:\n- a central securities depository participant which has an account with a central securities depository.\nIt could also be, if agreed in a service level agreement:\n- a global custodian which has an account with its local agent (sub-custodian), or\n- an investment management institution which manage a fund account opened at a custodian, or\n- a broker which has an account with a custodian, or\n- a central securities depository which has an account with a custodian, another central securities depository or another settlement market infrastructure.\n\nUsage\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nThis message cannot be used to request the modification of trade or event details.\nThe use of AdditionalInformation and its fields must be pre-agreed between account servicer and account owner. The fields in that sequence cannot be used to amend a trade or event detail unless authorised by country market practice.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementConditionsModificationRequestV05.mmObject());
				previousVersion_lazy = () -> SecuritiesSettlementConditionsModificationRequestV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesSttlmCondsModReq";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV04.mmAccountOwner,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV04.mmSafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV04.mmRequestDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV04.mmAdditionalInformation,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "030";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementConditionsModificationRequestV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PartyIdentification36Choice> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public SecuritiesSettlementConditionsModificationRequestV04 setAccountOwner(PartyIdentification36Choice accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public SecuritiesAccount13 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public SecuritiesSettlementConditionsModificationRequestV04 setSafekeepingAccount(SecuritiesAccount13 safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}

	public List<RequestDetails11> getRequestDetails() {
		return requestDetails == null ? requestDetails = new ArrayList<>() : requestDetails;
	}

	public SecuritiesSettlementConditionsModificationRequestV04 setRequestDetails(List<RequestDetails11> requestDetails) {
		this.requestDetails = Objects.requireNonNull(requestDetails);
		return this;
	}

	public List<AdditionalInformation7> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public SecuritiesSettlementConditionsModificationRequestV04 setAdditionalInformation(List<AdditionalInformation7> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesSettlementConditionsModificationRequestV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.030.001.04")
	static public class Document {
		@XmlElement(name = "SctiesSttlmCondsModReq", required = true)
		public SecuritiesSettlementConditionsModificationRequestV04 messageBody;
	}
}