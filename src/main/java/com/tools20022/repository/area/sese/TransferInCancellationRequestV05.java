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
import com.tools20022.repository.choice.Cancellation5Choice;
import com.tools20022.repository.msg.CopyInformation2;
import com.tools20022.repository.msg.MarketPracticeVersion1;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.References15;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An instructing party, for example, a transfer agent, sends the
 * TransferInCancellationRequest message to the executing party, for example, a
 * transfer agent, to request the cancellation of a previously sent
 * TransferInInstruction.<br>
 * <b>Usage</b><br>
 * The TransferInCancellationRequest message is used to request cancellation of
 * a previously sent TransferInInstruction.<br>
 * There are two ways to specify the transfer cancellation request. Either:<br>
 * - the transfer reference of the original transfer is quoted, or,<br>
 * - all the details of the original transfer (this includes TransferReference)
 * are quoted but this is not recommended.<br>
 * The message identification of the TransferInInstruction message in which the
 * transfer was conveyed may also be quoted in PreviousReference. It is also
 * possible to request the cancellation of a TransferInInstruction message by
 * quoting its message identification in PreviousReference.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV05#mmMessageIdentification
 * TransferInCancellationRequestV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV05#mmReferences
 * TransferInCancellationRequestV05.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV05#mmCancellation
 * TransferInCancellationRequestV05.mmCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV05#mmMarketPracticeVersion
 * TransferInCancellationRequestV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV05#mmCopyDetails
 * TransferInCancellationRequestV05.mmCopyDetails}</li>
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
 * xmlTag} = "TrfInCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.006.001.05}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransferInCancellationRequestV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn instructing party, for example, a transfer agent, sends the TransferInCancellationRequest message to the executing party, for example, a transfer agent, to request the cancellation of a previously sent TransferInInstruction.\r\nUsage\r\nThe TransferInCancellationRequest message is used to request cancellation of a previously sent TransferInInstruction.\r\nThere are two ways to specify the transfer cancellation request. Either:\r\n- the transfer reference of the original transfer is quoted, or,\r\n- all the details of the original transfer (this includes TransferReference) are quoted but this is not recommended.\r\nThe message identification of the TransferInInstruction message in which the transfer was conveyed may also be quoted in PreviousReference. It is also possible to request the cancellation of a TransferInInstruction message by quoting its message identification in PreviousReference."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV06
 * TransferInCancellationRequestV06}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV04
 * TransferInCancellationRequestV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransferInCancellationRequestV05", propOrder = {"messageIdentification", "references", "cancellation", "marketPracticeVersion", "copyDetails"})
public class TransferInCancellationRequestV05 {

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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that uniquely identifies a message from a business application standpoint."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV06#mmMessageIdentification
	 * TransferInCancellationRequestV06.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV04#mmMessageIdentification
	 * TransferInCancellationRequestV04.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferInCancellationRequestV05, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<TransferInCancellationRequestV05, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint.";
			nextVersions_lazy = () -> Arrays.asList(TransferInCancellationRequestV06.mmMessageIdentification);
			previousVersion_lazy = () -> TransferInCancellationRequestV04.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(TransferInCancellationRequestV05 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(TransferInCancellationRequestV05 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "Refs")
	protected List<References15> references;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.References15
	 * References15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the transaction identifier issued by the counterparty. Building block may also be used to reference a previous transaction, or tie a set of messages together."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV06#mmReferences
	 * TransferInCancellationRequestV06.mmReferences}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV04#mmReferences
	 * TransferInCancellationRequestV04.mmReferences}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferInCancellationRequestV05, List<References15>> mmReferences = new MMMessageBuildingBlock<TransferInCancellationRequestV05, List<References15>>() {
		{
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Reference to the transaction identifier issued by the counterparty. Building block may also be used to reference a previous transaction, or tie a set of messages together.";
			nextVersions_lazy = () -> Arrays.asList(TransferInCancellationRequestV06.mmReferences);
			previousVersion_lazy = () -> TransferInCancellationRequestV04.mmReferences;
			minOccurs = 0;
			complexType_lazy = () -> References15.mmObject();
		}

		@Override
		public List<References15> getValue(TransferInCancellationRequestV05 obj) {
			return obj.getReferences();
		}

		@Override
		public void setValue(TransferInCancellationRequestV05 obj, List<References15> value) {
			obj.setReferences(value);
		}
	};
	@XmlElement(name = "Cxl", required = true)
	protected List<Cancellation5Choice> cancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Cancellation5Choice
	 * Cancellation5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cxl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Choice between cancellation by reference or by transfer details."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV06#mmCancellation
	 * TransferInCancellationRequestV06.mmCancellation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV04#mmCancellation
	 * TransferInCancellationRequestV04.mmCancellation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferInCancellationRequestV05, List<Cancellation5Choice>> mmCancellation = new MMMessageBuildingBlock<TransferInCancellationRequestV05, List<Cancellation5Choice>>() {
		{
			xmlTag = "Cxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation";
			definition = "Choice between cancellation by reference or by transfer details.";
			nextVersions_lazy = () -> Arrays.asList(TransferInCancellationRequestV06.mmCancellation);
			previousVersion_lazy = () -> TransferInCancellationRequestV04.mmCancellation;
			minOccurs = 1;
			complexType_lazy = () -> Cancellation5Choice.mmObject();
		}

		@Override
		public List<Cancellation5Choice> getValue(TransferInCancellationRequestV05 obj) {
			return obj.getCancellation();
		}

		@Override
		public void setValue(TransferInCancellationRequestV05 obj, List<Cancellation5Choice> value) {
			obj.setCancellation(value);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPracticeVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the market practice to which the message conforms."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV06#mmMarketPracticeVersion
	 * TransferInCancellationRequestV06.mmMarketPracticeVersion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferInCancellationRequestV05, Optional<MarketPracticeVersion1>> mmMarketPracticeVersion = new MMMessageBuildingBlock<TransferInCancellationRequestV05, Optional<MarketPracticeVersion1>>() {
		{
			xmlTag = "MktPrctcVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeVersion";
			definition = "Identifies the market practice to which the message conforms.";
			nextVersions_lazy = () -> Arrays.asList(TransferInCancellationRequestV06.mmMarketPracticeVersion);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketPracticeVersion1.mmObject();
		}

		@Override
		public Optional<MarketPracticeVersion1> getValue(TransferInCancellationRequestV05 obj) {
			return obj.getMarketPracticeVersion();
		}

		@Override
		public void setValue(TransferInCancellationRequestV05 obj, Optional<MarketPracticeVersion1> value) {
			obj.setMarketPracticeVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "CpyDtls")
	protected CopyInformation2 copyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CopyInformation2
	 * CopyInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information provided when the message is a copy of a previous message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV06#mmCopyDetails
	 * TransferInCancellationRequestV06.mmCopyDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV04#mmCopyDetails
	 * TransferInCancellationRequestV04.mmCopyDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferInCancellationRequestV05, Optional<CopyInformation2>> mmCopyDetails = new MMMessageBuildingBlock<TransferInCancellationRequestV05, Optional<CopyInformation2>>() {
		{
			xmlTag = "CpyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDetails";
			definition = "Information provided when the message is a copy of a previous message.";
			nextVersions_lazy = () -> Arrays.asList(TransferInCancellationRequestV06.mmCopyDetails);
			previousVersion_lazy = () -> TransferInCancellationRequestV04.mmCopyDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CopyInformation2.mmObject();
		}

		@Override
		public Optional<CopyInformation2> getValue(TransferInCancellationRequestV05 obj) {
			return obj.getCopyDetails();
		}

		@Override
		public void setValue(TransferInCancellationRequestV05 obj, Optional<CopyInformation2> value) {
			obj.setCopyDetails(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferInCancellationRequestV05";
				definition = "Scope\r\nAn instructing party, for example, a transfer agent, sends the TransferInCancellationRequest message to the executing party, for example, a transfer agent, to request the cancellation of a previously sent TransferInInstruction.\r\nUsage\r\nThe TransferInCancellationRequest message is used to request cancellation of a previously sent TransferInInstruction.\r\nThere are two ways to specify the transfer cancellation request. Either:\r\n- the transfer reference of the original transfer is quoted, or,\r\n- all the details of the original transfer (this includes TransferReference) are quoted but this is not recommended.\r\nThe message identification of the TransferInInstruction message in which the transfer was conveyed may also be quoted in PreviousReference. It is also possible to request the cancellation of a TransferInInstruction message by quoting its message identification in PreviousReference.";
				nextVersions_lazy = () -> Arrays.asList(TransferInCancellationRequestV06.mmObject());
				previousVersion_lazy = () -> TransferInCancellationRequestV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "TrfInCxlReq";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.TransferInCancellationRequestV05.mmMessageIdentification,
						com.tools20022.repository.area.sese.TransferInCancellationRequestV05.mmReferences, com.tools20022.repository.area.sese.TransferInCancellationRequestV05.mmCancellation,
						com.tools20022.repository.area.sese.TransferInCancellationRequestV05.mmMarketPracticeVersion, com.tools20022.repository.area.sese.TransferInCancellationRequestV05.mmCopyDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "006";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return TransferInCancellationRequestV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public TransferInCancellationRequestV05 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public List<References15> getReferences() {
		return references == null ? references = new ArrayList<>() : references;
	}

	public TransferInCancellationRequestV05 setReferences(List<References15> references) {
		this.references = Objects.requireNonNull(references);
		return this;
	}

	public List<Cancellation5Choice> getCancellation() {
		return cancellation == null ? cancellation = new ArrayList<>() : cancellation;
	}

	public TransferInCancellationRequestV05 setCancellation(List<Cancellation5Choice> cancellation) {
		this.cancellation = Objects.requireNonNull(cancellation);
		return this;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return marketPracticeVersion == null ? Optional.empty() : Optional.of(marketPracticeVersion);
	}

	public TransferInCancellationRequestV05 setMarketPracticeVersion(MarketPracticeVersion1 marketPracticeVersion) {
		this.marketPracticeVersion = marketPracticeVersion;
		return this;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return copyDetails == null ? Optional.empty() : Optional.of(copyDetails);
	}

	public TransferInCancellationRequestV05 setCopyDetails(CopyInformation2 copyDetails) {
		this.copyDetails = copyDetails;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.006.001.05")
	static public class Document {
		@XmlElement(name = "TrfInCxlReq", required = true)
		public TransferInCancellationRequestV05 messageBody;
	}
}