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

package com.tools20022.repository.area.acmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AccountManagementPreviousVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer, for example, a registrar, transfer agent, custodian bank
 * or securities depository sends the AccountManagementStatusReport message to
 * the account owner or its designated agent, for example, an investor to report
 * on the receipt or the processing status of a previously received
 * AccountOpeningInstruction or AccountModificationInstruction or
 * GetAccountDetails message.<br>
 * <b>Usage</b><br>
 * The AccountManagementStatusReport message is used to provide the processing
 * status of a previously received AccountOpeningInstruction or of an
 * AccountModificationInstruction message.<br>
 * The AccountManagementStatusReport message is also used by an account servicer
 * to reject an AccountOpeningInstruction or AccountModificationInstruction or
 * GetAccountDetails message when the message is not compliant with the agreed
 * SLA or when the account cannot be uniquely identified.<br>
 * The account owner may report that the status of the instruction is either
 * rejected, accepted, that the instruction is being processed or that the
 * instruction has been forwarded to the next intermediary party for further
 * processing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.006.001.05}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementPreviousVersion
 * AccountManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV05#mmMessageIdentification
 * AccountManagementStatusReportV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV05#mmRelatedReference
 * AccountManagementStatusReportV05.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV05#mmStatusReport
 * AccountManagementStatusReportV05.mmStatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV05#mmMarketPracticeVersion
 * AccountManagementStatusReportV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV05#mmExtension
 * AccountManagementStatusReportV05.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctMgmtStsRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountManagementStatusReportV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer, for example, a registrar, transfer agent, custodian bank or securities depository sends the AccountManagementStatusReport message to the account owner or its designated agent, for example, an investor to report on the receipt or the processing status of a previously received AccountOpeningInstruction or AccountModificationInstruction or GetAccountDetails message.\r\nUsage\r\nThe AccountManagementStatusReport message is used to provide the processing status of a previously received AccountOpeningInstruction or of an AccountModificationInstruction message.\r\nThe AccountManagementStatusReport message is also used by an account servicer to reject an AccountOpeningInstruction or AccountModificationInstruction or GetAccountDetails message when the message is not compliant with the agreed SLA or when the account cannot be uniquely identified.\r\nThe account owner may report that the status of the instruction is either rejected, accepted, that the instruction is being processed or that the instruction has been forwarded to the next intermediary party for further processing."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV06
 * AccountManagementStatusReportV06}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV04
 * AccountManagementStatusReportV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountManagementStatusReportV05", propOrder = {"messageIdentification", "relatedReference", "statusReport", "marketPracticeVersion", "extension"})
public class AccountManagementStatusReportV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
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
	 * xmlTag} = "MsgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that uniquely identifies the message from a business application standpoint."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV06#mmMessageIdentification
	 * AccountManagementStatusReportV06.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV04#mmMessageIdentification
	 * AccountManagementStatusReportV04.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountManagementStatusReportV05, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<AccountManagementStatusReportV05, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies the message from a business application standpoint.";
			nextVersions_lazy = () -> Arrays.asList(AccountManagementStatusReportV06.mmMessageIdentification);
			previousVersion_lazy = () -> AccountManagementStatusReportV04.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(AccountManagementStatusReportV05 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(AccountManagementStatusReportV05 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "RltdRef", required = true)
	protected List<AdditionalReference6> relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6
	 * AdditionalReference6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV06#mmRelatedReference
	 * AccountManagementStatusReportV06.mmRelatedReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV04#mmRelatedReference
	 * AccountManagementStatusReportV04.mmRelatedReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountManagementStatusReportV05, List<AdditionalReference6>> mmRelatedReference = new MMMessageBuildingBlock<AccountManagementStatusReportV05, List<AdditionalReference6>>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			nextVersions_lazy = () -> Arrays.asList(AccountManagementStatusReportV06.mmRelatedReference);
			previousVersion_lazy = () -> AccountManagementStatusReportV04.mmRelatedReference;
			maxOccurs = 2;
			minOccurs = 1;
			complexType_lazy = () -> AdditionalReference6.mmObject();
		}

		@Override
		public List<AdditionalReference6> getValue(AccountManagementStatusReportV05 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(AccountManagementStatusReportV05 obj, List<AdditionalReference6> value) {
			obj.setRelatedReference(value);
		}
	};
	@XmlElement(name = "StsRpt", required = true)
	protected AccountManagementStatusAndReason4 statusReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason4
	 * AccountManagementStatusAndReason4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status report details of an account opening instruction or account modification instruction that was previously received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV06#mmStatusReport
	 * AccountManagementStatusReportV06.mmStatusReport}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV04#mmStatusReport
	 * AccountManagementStatusReportV04.mmStatusReport}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountManagementStatusReportV05, AccountManagementStatusAndReason4> mmStatusReport = new MMMessageBuildingBlock<AccountManagementStatusReportV05, AccountManagementStatusAndReason4>() {
		{
			xmlTag = "StsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReport";
			definition = "Status report details of an account opening instruction or account modification instruction that was previously received.";
			nextVersions_lazy = () -> Arrays.asList(AccountManagementStatusReportV06.mmStatusReport);
			previousVersion_lazy = () -> AccountManagementStatusReportV04.mmStatusReport;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountManagementStatusAndReason4.mmObject();
		}

		@Override
		public AccountManagementStatusAndReason4 getValue(AccountManagementStatusReportV05 obj) {
			return obj.getStatusReport();
		}

		@Override
		public void setValue(AccountManagementStatusReportV05 obj, AccountManagementStatusAndReason4 value) {
			obj.setStatusReport(value);
		}
	};
	@XmlElement(name = "MktPrctcVrsn")
	protected MarketPracticeVersion1 marketPracticeVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPrctcVrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPracticeVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the market practice to which the message conforms."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV06#mmMarketPracticeVersion
	 * AccountManagementStatusReportV06.mmMarketPracticeVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV04#mmMarketPracticeVersion
	 * AccountManagementStatusReportV04.mmMarketPracticeVersion}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountManagementStatusReportV05, Optional<MarketPracticeVersion1>> mmMarketPracticeVersion = new MMMessageBuildingBlock<AccountManagementStatusReportV05, Optional<MarketPracticeVersion1>>() {
		{
			xmlTag = "MktPrctcVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeVersion";
			definition = "Identifies the market practice to which the message conforms.";
			nextVersions_lazy = () -> Arrays.asList(AccountManagementStatusReportV06.mmMarketPracticeVersion);
			previousVersion_lazy = () -> AccountManagementStatusReportV04.mmMarketPracticeVersion;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketPracticeVersion1.mmObject();
		}

		@Override
		public Optional<MarketPracticeVersion1> getValue(AccountManagementStatusReportV05 obj) {
			return obj.getMarketPracticeVersion();
		}

		@Override
		public void setValue(AccountManagementStatusReportV05 obj, Optional<MarketPracticeVersion1> value) {
			obj.setMarketPracticeVersion(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV06#mmExtension
	 * AccountManagementStatusReportV06.mmExtension}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV04#mmExtension
	 * AccountManagementStatusReportV04.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountManagementStatusReportV05, List<Extension1>> mmExtension = new MMMessageBuildingBlock<AccountManagementStatusReportV05, List<Extension1>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(AccountManagementStatusReportV06.mmExtension);
			previousVersion_lazy = () -> AccountManagementStatusReportV04.mmExtension;
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(AccountManagementStatusReportV05 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(AccountManagementStatusReportV05 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountManagementStatusReportV05";
				definition = "Scope\r\nAn account servicer, for example, a registrar, transfer agent, custodian bank or securities depository sends the AccountManagementStatusReport message to the account owner or its designated agent, for example, an investor to report on the receipt or the processing status of a previously received AccountOpeningInstruction or AccountModificationInstruction or GetAccountDetails message.\r\nUsage\r\nThe AccountManagementStatusReport message is used to provide the processing status of a previously received AccountOpeningInstruction or of an AccountModificationInstruction message.\r\nThe AccountManagementStatusReport message is also used by an account servicer to reject an AccountOpeningInstruction or AccountModificationInstruction or GetAccountDetails message when the message is not compliant with the agreed SLA or when the account cannot be uniquely identified.\r\nThe account owner may report that the status of the instruction is either rejected, accepted, that the instruction is being processed or that the instruction has been forwarded to the next intermediary party for further processing.";
				nextVersions_lazy = () -> Arrays.asList(AccountManagementStatusReportV06.mmObject());
				previousVersion_lazy = () -> AccountManagementStatusReportV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "AcctMgmtStsRpt";
				businessArea_lazy = () -> AccountManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountManagementStatusReportV05.mmMessageIdentification,
						com.tools20022.repository.area.acmt.AccountManagementStatusReportV05.mmRelatedReference, com.tools20022.repository.area.acmt.AccountManagementStatusReportV05.mmStatusReport,
						com.tools20022.repository.area.acmt.AccountManagementStatusReportV05.mmMarketPracticeVersion, com.tools20022.repository.area.acmt.AccountManagementStatusReportV05.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "006";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountManagementStatusReportV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public AccountManagementStatusReportV05 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public List<AdditionalReference6> getRelatedReference() {
		return relatedReference == null ? relatedReference = new ArrayList<>() : relatedReference;
	}

	public AccountManagementStatusReportV05 setRelatedReference(List<AdditionalReference6> relatedReference) {
		this.relatedReference = Objects.requireNonNull(relatedReference);
		return this;
	}

	public AccountManagementStatusAndReason4 getStatusReport() {
		return statusReport;
	}

	public AccountManagementStatusReportV05 setStatusReport(AccountManagementStatusAndReason4 statusReport) {
		this.statusReport = Objects.requireNonNull(statusReport);
		return this;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return marketPracticeVersion == null ? Optional.empty() : Optional.of(marketPracticeVersion);
	}

	public AccountManagementStatusReportV05 setMarketPracticeVersion(MarketPracticeVersion1 marketPracticeVersion) {
		this.marketPracticeVersion = marketPracticeVersion;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public AccountManagementStatusReportV05 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.006.001.05")
	static public class Document {
		@XmlElement(name = "AcctMgmtStsRpt", required = true)
		public AccountManagementStatusReportV05 messageBody;
	}
}