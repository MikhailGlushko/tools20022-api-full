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
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An instructing party, eg, a (new) plan manager (Transferee), sends the
 * PortfolioTransferInstruction message to the executing party, eg, a (old) plan
 * manager (Transferor), on behalf of the initiating party, eg, an investor
 * (client), to instruct the transfer of financial instruments from the clients
 * account at the old plan manager (Transferor) to the clients account at the
 * new plan manager (Transferee) through a nominee account.<br>
 * <b>Usage</b><br>
 * The PortfolioTransferInstruction message is used to instruct the withdrawal
 * of one or more ISA or portfolio products from one account and deliver them to
 * another account.<br>
 * The PortfolioTransferInstruction message is used to instruct one or more
 * transfers for one client. Each transfer is for delivery to the same account.
 * The account may be owned by one or more individual investors or one or more
 * corporate investors. Each transfer is identified in TransferIdentification.<br>
 * If the instructing party does not have enough information to instruct the
 * transfer, then it must first send a AccountHoldingInformationRequest message
 * to the executing party in order to receive a AccountHoldingInformation
 * message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.012.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmMessageReference
 * PortfolioTransferInstructionV03.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmPoolReference
 * PortfolioTransferInstructionV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmPreviousReference
 * PortfolioTransferInstructionV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmRelatedReference
 * PortfolioTransferInstructionV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmPrimaryIndividualInvestor
 * PortfolioTransferInstructionV03.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmSecondaryIndividualInvestor
 * PortfolioTransferInstructionV03.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmOtherIndividualInvestor
 * PortfolioTransferInstructionV03.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmPrimaryCorporateInvestor
 * PortfolioTransferInstructionV03.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmSecondaryCorporateInvestor
 * PortfolioTransferInstructionV03.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmOtherCorporateInvestor
 * PortfolioTransferInstructionV03.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmTransferorAccount
 * PortfolioTransferInstructionV03.mmTransferorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmNomineeAccount
 * PortfolioTransferInstructionV03.mmNomineeAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmTransferee
 * PortfolioTransferInstructionV03.mmTransferee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmCashAccount
 * PortfolioTransferInstructionV03.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmProductTransfer
 * PortfolioTransferInstructionV03.mmProductTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmExtension
 * PortfolioTransferInstructionV03.mmExtension}</li>
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
 * xmlTag} = "PrtflTrfInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PortfolioTransferInstructionV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn instructing party, eg, a (new) plan manager (Transferee), sends the PortfolioTransferInstruction message to the executing party, eg, a (old) plan manager (Transferor), on behalf of the initiating party, eg, an investor (client), to instruct the transfer of financial instruments from the clients account at the old plan manager (Transferor) to the clients account at the new plan manager (Transferee) through a nominee account.\r\nUsage\r\nThe PortfolioTransferInstruction message is used to instruct the withdrawal of one or more ISA or portfolio products from one account and deliver them to another account.\r\nThe PortfolioTransferInstruction message is used to instruct one or more transfers for one client. Each transfer is for delivery to the same account. The account may be owned by one or more individual investors or one or more corporate investors. Each transfer is identified in TransferIdentification.\r\nIf the instructing party does not have enough information to instruct the transfer, then it must first send a AccountHoldingInformationRequest message to the executing party in order to receive a AccountHoldingInformation message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNomineeAccountServicerRule#for_sese_PortfolioTransferInstructionV03
 * ConstraintNomineeAccountServicerRule.for_sese_PortfolioTransferInstructionV03
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#for_sese_PortfolioTransferInstructionV03
 * ConstraintPorfolioRule.for_sese_PortfolioTransferInstructionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#for_sese_PortfolioTransferInstructionV03
 * ConstraintInvestorRule.for_sese_PortfolioTransferInstructionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_PortfolioTransferInstructionV03
 * ConstraintCorporateRule.for_sese_PortfolioTransferInstructionV03}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04
 * PortfolioTransferInstructionV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02
 * PEPOrISAOrPortfolioTransferInstructionV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PortfolioTransferInstructionV03", propOrder = {"messageReference", "poolReference", "previousReference", "relatedReference", "primaryIndividualInvestor", "secondaryIndividualInvestor", "otherIndividualInvestor",
		"primaryCorporateInvestor", "secondaryCorporateInvestor", "otherCorporateInvestor", "transferorAccount", "nomineeAccount", "transferee", "cashAccount", "productTransfer", "extension"})
public class PortfolioTransferInstructionV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgRef", required = true)
	protected MessageIdentification1 messageReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferInstructionV03, MessageIdentification1> mmMessageReference = new MMMessageBuildingBlock<PortfolioTransferInstructionV03, MessageIdentification1>() {
		{
			xmlTag = "MsgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageReference";
			definition = "Identifies the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(PortfolioTransferInstructionV03 obj) {
			return obj.getMessageReference();
		}

		@Override
		public void setValue(PortfolioTransferInstructionV03 obj, MessageIdentification1 value) {
			obj.setMessageReference(value);
		}
	};
	@XmlElement(name = "PoolRef")
	protected AdditionalReference3 poolReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferInstructionV03, Optional<AdditionalReference3>> mmPoolReference = new MMMessageBuildingBlock<PortfolioTransferInstructionV03, Optional<AdditionalReference3>>() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(PortfolioTransferInstructionV03 obj) {
			return obj.getPoolReference();
		}

		@Override
		public void setValue(PortfolioTransferInstructionV03 obj, Optional<AdditionalReference3> value) {
			obj.setPoolReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsRef")
	protected AdditionalReference3 previousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferInstructionV03, Optional<AdditionalReference3>> mmPreviousReference = new MMMessageBuildingBlock<PortfolioTransferInstructionV03, Optional<AdditionalReference3>>() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(PortfolioTransferInstructionV03 obj) {
			return obj.getPreviousReference();
		}

		@Override
		public void setValue(PortfolioTransferInstructionV03 obj, Optional<AdditionalReference3> value) {
			obj.setPreviousReference(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdRef")
	protected AdditionalReference3 relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferInstructionV03, Optional<AdditionalReference3>> mmRelatedReference = new MMMessageBuildingBlock<PortfolioTransferInstructionV03, Optional<AdditionalReference3>>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(PortfolioTransferInstructionV03 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(PortfolioTransferInstructionV03 obj, Optional<AdditionalReference3> value) {
			obj.setRelatedReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PmryIndvInvstr")
	protected IndividualPerson8 primaryIndividualInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryIndvInvstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryIndividualInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the primary individual investor, eg, name, address, social security number and date of birth."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferInstructionV03, Optional<IndividualPerson8>> mmPrimaryIndividualInvestor = new MMMessageBuildingBlock<PortfolioTransferInstructionV03, Optional<IndividualPerson8>>() {
		{
			xmlTag = "PmryIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryIndividualInvestor";
			definition = "Information identifying the primary individual investor, eg, name, address, social security number and date of birth.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IndividualPerson8.mmObject();
		}

		@Override
		public Optional<IndividualPerson8> getValue(PortfolioTransferInstructionV03 obj) {
			return obj.getPrimaryIndividualInvestor();
		}

		@Override
		public void setValue(PortfolioTransferInstructionV03 obj, Optional<IndividualPerson8> value) {
			obj.setPrimaryIndividualInvestor(value.orElse(null));
		}
	};
	@XmlElement(name = "ScndryIndvInvstr")
	protected IndividualPerson8 secondaryIndividualInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryIndvInvstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryIndividualInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the secondary individual investor, eg, name, address, social security number and date of birth."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferInstructionV03, Optional<IndividualPerson8>> mmSecondaryIndividualInvestor = new MMMessageBuildingBlock<PortfolioTransferInstructionV03, Optional<IndividualPerson8>>() {
		{
			xmlTag = "ScndryIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryIndividualInvestor";
			definition = "Information identifying the secondary individual investor, eg, name, address, social security number and date of birth.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IndividualPerson8.mmObject();
		}

		@Override
		public Optional<IndividualPerson8> getValue(PortfolioTransferInstructionV03 obj) {
			return obj.getSecondaryIndividualInvestor();
		}

		@Override
		public void setValue(PortfolioTransferInstructionV03 obj, Optional<IndividualPerson8> value) {
			obj.setSecondaryIndividualInvestor(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrIndvInvstr")
	protected List<IndividualPerson8> otherIndividualInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrIndvInvstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherIndividualInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the other individual investors, eg, name, address, social security number and date of birth."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferInstructionV03, List<IndividualPerson8>> mmOtherIndividualInvestor = new MMMessageBuildingBlock<PortfolioTransferInstructionV03, List<IndividualPerson8>>() {
		{
			xmlTag = "OthrIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherIndividualInvestor";
			definition = "Information identifying the other individual investors, eg, name, address, social security number and date of birth.";
			minOccurs = 0;
			complexType_lazy = () -> IndividualPerson8.mmObject();
		}

		@Override
		public List<IndividualPerson8> getValue(PortfolioTransferInstructionV03 obj) {
			return obj.getOtherIndividualInvestor();
		}

		@Override
		public void setValue(PortfolioTransferInstructionV03 obj, List<IndividualPerson8> value) {
			obj.setOtherIndividualInvestor(value);
		}
	};
	@XmlElement(name = "PmryCorpInvstr")
	protected Organisation4 primaryCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Organisation4
	 * Organisation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryCorpInvstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryCorporateInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the primary corporate investor, eg, name and address."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferInstructionV03, Optional<Organisation4>> mmPrimaryCorporateInvestor = new MMMessageBuildingBlock<PortfolioTransferInstructionV03, Optional<Organisation4>>() {
		{
			xmlTag = "PmryCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryCorporateInvestor";
			definition = "Information identifying the primary corporate investor, eg, name and address.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Organisation4.mmObject();
		}

		@Override
		public Optional<Organisation4> getValue(PortfolioTransferInstructionV03 obj) {
			return obj.getPrimaryCorporateInvestor();
		}

		@Override
		public void setValue(PortfolioTransferInstructionV03 obj, Optional<Organisation4> value) {
			obj.setPrimaryCorporateInvestor(value.orElse(null));
		}
	};
	@XmlElement(name = "ScndryCorpInvstr")
	protected Organisation4 secondaryCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Organisation4
	 * Organisation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryCorpInvstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryCorporateInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the secondary corporate investor, eg, name and address."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferInstructionV03, Optional<Organisation4>> mmSecondaryCorporateInvestor = new MMMessageBuildingBlock<PortfolioTransferInstructionV03, Optional<Organisation4>>() {
		{
			xmlTag = "ScndryCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryCorporateInvestor";
			definition = "Information identifying the secondary corporate investor, eg, name and address.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Organisation4.mmObject();
		}

		@Override
		public Optional<Organisation4> getValue(PortfolioTransferInstructionV03 obj) {
			return obj.getSecondaryCorporateInvestor();
		}

		@Override
		public void setValue(PortfolioTransferInstructionV03 obj, Optional<Organisation4> value) {
			obj.setSecondaryCorporateInvestor(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrCorpInvstr")
	protected List<Organisation4> otherCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Organisation4
	 * Organisation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrCorpInvstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCorporateInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the other corporate investors, eg, name and address."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferInstructionV03, List<Organisation4>> mmOtherCorporateInvestor = new MMMessageBuildingBlock<PortfolioTransferInstructionV03, List<Organisation4>>() {
		{
			xmlTag = "OthrCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCorporateInvestor";
			definition = "Information identifying the other corporate investors, eg, name and address.";
			minOccurs = 0;
			complexType_lazy = () -> Organisation4.mmObject();
		}

		@Override
		public List<Organisation4> getValue(PortfolioTransferInstructionV03 obj) {
			return obj.getOtherCorporateInvestor();
		}

		@Override
		public void setValue(PortfolioTransferInstructionV03 obj, List<Organisation4> value) {
			obj.setOtherCorporateInvestor(value);
		}
	};
	@XmlElement(name = "TrfrAcct", required = true)
	protected Account5 transferorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Account5
	 * Account5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfrAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an account owned by the investor at the old plan manager (account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferInstructionV03, Account5> mmTransferorAccount = new MMMessageBuildingBlock<PortfolioTransferInstructionV03, Account5>() {
		{
			xmlTag = "TrfrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferorAccount";
			definition = "Identification of an account owned by the investor at the old plan manager (account servicer).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Account5.mmObject();
		}

		@Override
		public Account5 getValue(PortfolioTransferInstructionV03 obj) {
			return obj.getTransferorAccount();
		}

		@Override
		public void setValue(PortfolioTransferInstructionV03 obj, Account5 value) {
			obj.setTransferorAccount(value);
		}
	};
	@XmlElement(name = "NmneeAcct")
	protected Account6 nomineeAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Account6
	 * Account6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmneeAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NomineeAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account held in the name of a party that is not the name of the beneficial owner of the shares."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferInstructionV03, Optional<Account6>> mmNomineeAccount = new MMMessageBuildingBlock<PortfolioTransferInstructionV03, Optional<Account6>>() {
		{
			xmlTag = "NmneeAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NomineeAccount";
			definition = "Account held in the name of a party that is not the name of the beneficial owner of the shares.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Account6.mmObject();
		}

		@Override
		public Optional<Account6> getValue(PortfolioTransferInstructionV03 obj) {
			return obj.getNomineeAccount();
		}

		@Override
		public void setValue(PortfolioTransferInstructionV03 obj, Optional<Account6> value) {
			obj.setNomineeAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "Trfee", required = true)
	protected PartyIdentification2Choice transferee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trfee"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transferee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the institution to which the financial instrument is to be transferred."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferInstructionV03, PartyIdentification2Choice> mmTransferee = new MMMessageBuildingBlock<PortfolioTransferInstructionV03, PartyIdentification2Choice>() {
		{
			xmlTag = "Trfee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transferee";
			definition = "Information related to the institution to which the financial instrument is to be transferred.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public PartyIdentification2Choice getValue(PortfolioTransferInstructionV03 obj) {
			return obj.getTransferee();
		}

		@Override
		public void setValue(PortfolioTransferInstructionV03 obj, PartyIdentification2Choice value) {
			obj.setTransferee(value);
		}
	};
	@XmlElement(name = "CshAcct")
	protected CashAccount11 cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashAccount11
	 * CashAccount11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an account owned by the investor to which a cash entry is made based on the transfer of asset(s)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferInstructionV03, Optional<CashAccount11>> mmCashAccount = new MMMessageBuildingBlock<PortfolioTransferInstructionV03, Optional<CashAccount11>>() {
		{
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Identification of an account owned by the investor to which a cash entry is made based on the transfer of asset(s).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashAccount11.mmObject();
		}

		@Override
		public Optional<CashAccount11> getValue(PortfolioTransferInstructionV03 obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(PortfolioTransferInstructionV03 obj, Optional<CashAccount11> value) {
			obj.setCashAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "PdctTrf", required = true)
	protected List<ISATransfer1> productTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ISATransfer1
	 * ISATransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctTrf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information related to the asset(s) transferred."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferInstructionV03, List<ISATransfer1>> mmProductTransfer = new MMMessageBuildingBlock<PortfolioTransferInstructionV03, List<ISATransfer1>>() {
		{
			xmlTag = "PdctTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductTransfer";
			definition = "Provides information related to the asset(s) transferred.";
			minOccurs = 1;
			complexType_lazy = () -> ISATransfer1.mmObject();
		}

		@Override
		public List<ISATransfer1> getValue(PortfolioTransferInstructionV03 obj) {
			return obj.getProductTransfer();
		}

		@Override
		public void setValue(PortfolioTransferInstructionV03 obj, List<ISATransfer1> value) {
			obj.setProductTransfer(value);
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferInstructionV03, List<Extension1>> mmExtension = new MMMessageBuildingBlock<PortfolioTransferInstructionV03, List<Extension1>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(PortfolioTransferInstructionV03 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(PortfolioTransferInstructionV03 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNomineeAccountServicerRule.for_sese_PortfolioTransferInstructionV03,
						com.tools20022.repository.constraints.ConstraintPorfolioRule.for_sese_PortfolioTransferInstructionV03, com.tools20022.repository.constraints.ConstraintInvestorRule.for_sese_PortfolioTransferInstructionV03,
						com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_PortfolioTransferInstructionV03);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PortfolioTransferInstructionV03";
				definition = "Scope\r\nAn instructing party, eg, a (new) plan manager (Transferee), sends the PortfolioTransferInstruction message to the executing party, eg, a (old) plan manager (Transferor), on behalf of the initiating party, eg, an investor (client), to instruct the transfer of financial instruments from the clients account at the old plan manager (Transferor) to the clients account at the new plan manager (Transferee) through a nominee account.\r\nUsage\r\nThe PortfolioTransferInstruction message is used to instruct the withdrawal of one or more ISA or portfolio products from one account and deliver them to another account.\r\nThe PortfolioTransferInstruction message is used to instruct one or more transfers for one client. Each transfer is for delivery to the same account. The account may be owned by one or more individual investors or one or more corporate investors. Each transfer is identified in TransferIdentification.\r\nIf the instructing party does not have enough information to instruct the transfer, then it must first send a AccountHoldingInformationRequest message to the executing party in order to receive a AccountHoldingInformation message.";
				nextVersions_lazy = () -> Arrays.asList(PortfolioTransferInstructionV04.mmObject());
				previousVersion_lazy = () -> PEPOrISAOrPortfolioTransferInstructionV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "PrtflTrfInstr";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmMessageReference, com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmPoolReference,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmPreviousReference, com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmRelatedReference,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmPrimaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmSecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmOtherIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmPrimaryCorporateInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmSecondaryCorporateInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmOtherCorporateInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmTransferorAccount, com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmNomineeAccount,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmTransferee, com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmCashAccount,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmProductTransfer, com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "012";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return PortfolioTransferInstructionV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageReference() {
		return messageReference;
	}

	public PortfolioTransferInstructionV03 setMessageReference(MessageIdentification1 messageReference) {
		this.messageReference = Objects.requireNonNull(messageReference);
		return this;
	}

	public Optional<AdditionalReference3> getPoolReference() {
		return poolReference == null ? Optional.empty() : Optional.of(poolReference);
	}

	public PortfolioTransferInstructionV03 setPoolReference(AdditionalReference3 poolReference) {
		this.poolReference = poolReference;
		return this;
	}

	public Optional<AdditionalReference3> getPreviousReference() {
		return previousReference == null ? Optional.empty() : Optional.of(previousReference);
	}

	public PortfolioTransferInstructionV03 setPreviousReference(AdditionalReference3 previousReference) {
		this.previousReference = previousReference;
		return this;
	}

	public Optional<AdditionalReference3> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public PortfolioTransferInstructionV03 setRelatedReference(AdditionalReference3 relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public Optional<IndividualPerson8> getPrimaryIndividualInvestor() {
		return primaryIndividualInvestor == null ? Optional.empty() : Optional.of(primaryIndividualInvestor);
	}

	public PortfolioTransferInstructionV03 setPrimaryIndividualInvestor(IndividualPerson8 primaryIndividualInvestor) {
		this.primaryIndividualInvestor = primaryIndividualInvestor;
		return this;
	}

	public Optional<IndividualPerson8> getSecondaryIndividualInvestor() {
		return secondaryIndividualInvestor == null ? Optional.empty() : Optional.of(secondaryIndividualInvestor);
	}

	public PortfolioTransferInstructionV03 setSecondaryIndividualInvestor(IndividualPerson8 secondaryIndividualInvestor) {
		this.secondaryIndividualInvestor = secondaryIndividualInvestor;
		return this;
	}

	public List<IndividualPerson8> getOtherIndividualInvestor() {
		return otherIndividualInvestor == null ? otherIndividualInvestor = new ArrayList<>() : otherIndividualInvestor;
	}

	public PortfolioTransferInstructionV03 setOtherIndividualInvestor(List<IndividualPerson8> otherIndividualInvestor) {
		this.otherIndividualInvestor = Objects.requireNonNull(otherIndividualInvestor);
		return this;
	}

	public Optional<Organisation4> getPrimaryCorporateInvestor() {
		return primaryCorporateInvestor == null ? Optional.empty() : Optional.of(primaryCorporateInvestor);
	}

	public PortfolioTransferInstructionV03 setPrimaryCorporateInvestor(Organisation4 primaryCorporateInvestor) {
		this.primaryCorporateInvestor = primaryCorporateInvestor;
		return this;
	}

	public Optional<Organisation4> getSecondaryCorporateInvestor() {
		return secondaryCorporateInvestor == null ? Optional.empty() : Optional.of(secondaryCorporateInvestor);
	}

	public PortfolioTransferInstructionV03 setSecondaryCorporateInvestor(Organisation4 secondaryCorporateInvestor) {
		this.secondaryCorporateInvestor = secondaryCorporateInvestor;
		return this;
	}

	public List<Organisation4> getOtherCorporateInvestor() {
		return otherCorporateInvestor == null ? otherCorporateInvestor = new ArrayList<>() : otherCorporateInvestor;
	}

	public PortfolioTransferInstructionV03 setOtherCorporateInvestor(List<Organisation4> otherCorporateInvestor) {
		this.otherCorporateInvestor = Objects.requireNonNull(otherCorporateInvestor);
		return this;
	}

	public Account5 getTransferorAccount() {
		return transferorAccount;
	}

	public PortfolioTransferInstructionV03 setTransferorAccount(Account5 transferorAccount) {
		this.transferorAccount = Objects.requireNonNull(transferorAccount);
		return this;
	}

	public Optional<Account6> getNomineeAccount() {
		return nomineeAccount == null ? Optional.empty() : Optional.of(nomineeAccount);
	}

	public PortfolioTransferInstructionV03 setNomineeAccount(Account6 nomineeAccount) {
		this.nomineeAccount = nomineeAccount;
		return this;
	}

	public PartyIdentification2Choice getTransferee() {
		return transferee;
	}

	public PortfolioTransferInstructionV03 setTransferee(PartyIdentification2Choice transferee) {
		this.transferee = Objects.requireNonNull(transferee);
		return this;
	}

	public Optional<CashAccount11> getCashAccount() {
		return cashAccount == null ? Optional.empty() : Optional.of(cashAccount);
	}

	public PortfolioTransferInstructionV03 setCashAccount(CashAccount11 cashAccount) {
		this.cashAccount = cashAccount;
		return this;
	}

	public List<ISATransfer1> getProductTransfer() {
		return productTransfer == null ? productTransfer = new ArrayList<>() : productTransfer;
	}

	public PortfolioTransferInstructionV03 setProductTransfer(List<ISATransfer1> productTransfer) {
		this.productTransfer = Objects.requireNonNull(productTransfer);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public PortfolioTransferInstructionV03 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.012.001.03")
	static public class Document {
		@XmlElement(name = "PrtflTrfInstr", required = true)
		public PortfolioTransferInstructionV03 messageBody;
	}
}