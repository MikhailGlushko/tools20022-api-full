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

package com.tools20022.repository.area.setr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesTradeLatestVersion;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOLatestversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The SwitchOrderConfirmationCancellationInstruction message is sent by an
 * executing party, for example, a transfer agent, to the instructing party, for
 * example, an investment manager or its authorised representative, to cancel a
 * previously sent SwitchOrderConfirmation.<br>
 * <b>Usage</b><br>
 * To request the cancellation of one or more individual order executions, the
 * order reference and deal reference of each individual order execution in the
 * original SwitchOrderConfirmation are specified in the order reference and
 * deal reference elements respectively. The message identification of the
 * SwitchOrderConfirmation message in which the individual order execution was
 * conveyed may also be quoted in PreviousReference but this is not recommended.
 * The AmendmentIndicator is used to specify whether the switch order
 * confirmation cancellation is to be followed by an amendment An amendment of a
 * switch order confirmation is carried out by sending a SwitchOrderConfirmation
 * message in which the AmendmentIndicator contains the value ‘true’.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.055.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradeLatestVersion
 * SecuritiesTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#mmMessageIdentification
 * SwitchOrderConfirmationCancellationInstructionV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#mmPoolReference
 * SwitchOrderConfirmationCancellationInstructionV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#mmPreviousReference
 * SwitchOrderConfirmationCancellationInstructionV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#mmRelatedReference
 * SwitchOrderConfirmationCancellationInstructionV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#mmAmendmentIndicator
 * SwitchOrderConfirmationCancellationInstructionV02.mmAmendmentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#mmMasterReference
 * SwitchOrderConfirmationCancellationInstructionV02.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#mmOrderReferences
 * SwitchOrderConfirmationCancellationInstructionV02.mmOrderReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#mmCopyDetails
 * SwitchOrderConfirmationCancellationInstructionV02.mmCopyDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOLatestversion
 * InvestmentFundsISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SwtchOrdrConfCxlInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SwitchOrderConfirmationCancellationInstructionV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe SwitchOrderConfirmationCancellationInstruction message is sent by an executing party, for example, a transfer agent, to the instructing party, for example, an investment manager or its authorised representative, to cancel a previously sent SwitchOrderConfirmation.\r\nUsage\r\nTo request the cancellation of one or more individual order executions, the order reference and deal reference of each individual order execution in the original SwitchOrderConfirmation are specified in the order reference and deal reference elements respectively. The message identification of the SwitchOrderConfirmation message in which the individual order execution was conveyed may also be quoted in PreviousReference but this is not recommended. The AmendmentIndicator is used to specify whether the switch order confirmation cancellation is to be followed by an amendment An amendment of a switch order confirmation is carried out by sending a SwitchOrderConfirmation message in which the AmendmentIndicator contains the value ‘true’."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01
 * SwitchOrderConfirmationCancellationInstructionV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SwitchOrderConfirmationCancellationInstructionV02", propOrder = {"messageIdentification", "poolReference", "previousReference", "relatedReference", "amendmentIndicator", "masterReference", "orderReferences", "copyDetails"})
public class SwitchOrderConfirmationCancellationInstructionV02 {

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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmMessageIdentification
	 * SwitchOrderConfirmationCancellationInstructionV01.mmMessageIdentification
	 * }</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV02, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV02, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies the message from a business application standpoint.";
			previousVersion_lazy = () -> SwitchOrderConfirmationCancellationInstructionV01.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(SwitchOrderConfirmationCancellationInstructionV02 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(SwitchOrderConfirmationCancellationInstructionV02 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "PoolRef")
	protected AdditionalReference9 poolReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference9
	 * AdditionalReference9}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmPoolReference
	 * SwitchOrderConfirmationCancellationInstructionV01.mmPoolReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV02, Optional<AdditionalReference9>> mmPoolReference = new MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV02, Optional<AdditionalReference9>>() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			previousVersion_lazy = () -> SwitchOrderConfirmationCancellationInstructionV01.mmPoolReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference9.mmObject();
		}

		@Override
		public Optional<AdditionalReference9> getValue(SwitchOrderConfirmationCancellationInstructionV02 obj) {
			return obj.getPoolReference();
		}

		@Override
		public void setValue(SwitchOrderConfirmationCancellationInstructionV02 obj, Optional<AdditionalReference9> value) {
			obj.setPoolReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsRef")
	protected List<AdditionalReference8> previousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8
	 * AdditionalReference8}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmPreviousReference
	 * SwitchOrderConfirmationCancellationInstructionV01.mmPreviousReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV02, List<AdditionalReference8>> mmPreviousReference = new MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV02, List<AdditionalReference8>>() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			previousVersion_lazy = () -> SwitchOrderConfirmationCancellationInstructionV01.mmPreviousReference;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference8.mmObject();
		}

		@Override
		public List<AdditionalReference8> getValue(SwitchOrderConfirmationCancellationInstructionV02 obj) {
			return obj.getPreviousReference();
		}

		@Override
		public void setValue(SwitchOrderConfirmationCancellationInstructionV02 obj, List<AdditionalReference8> value) {
			obj.setPreviousReference(value);
		}
	};
	@XmlElement(name = "RltdRef")
	protected AdditionalReference8 relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8
	 * AdditionalReference8}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmRelatedReference
	 * SwitchOrderConfirmationCancellationInstructionV01.mmRelatedReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV02, Optional<AdditionalReference8>> mmRelatedReference = new MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV02, Optional<AdditionalReference8>>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			previousVersion_lazy = () -> SwitchOrderConfirmationCancellationInstructionV01.mmRelatedReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference8.mmObject();
		}

		@Override
		public Optional<AdditionalReference8> getValue(SwitchOrderConfirmationCancellationInstructionV02 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(SwitchOrderConfirmationCancellationInstructionV02 obj, Optional<AdditionalReference8> value) {
			obj.setRelatedReference(value.orElse(null));
		}
	};
	@XmlElement(name = "AmdmntInd", required = true)
	protected YesNoIndicator amendmentIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdmntInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a confirmation amendment message will follow the confirmation cancellation instruction or not."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV02, YesNoIndicator> mmAmendmentIndicator = new MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV02, YesNoIndicator>() {
		{
			xmlTag = "AmdmntInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentIndicator";
			definition = "Indicates whether a confirmation amendment message will follow the confirmation cancellation instruction or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SwitchOrderConfirmationCancellationInstructionV02 obj) {
			return obj.getAmendmentIndicator();
		}

		@Override
		public void setValue(SwitchOrderConfirmationCancellationInstructionV02 obj, YesNoIndicator value) {
			obj.setAmendmentIndicator(value);
		}
	};
	@XmlElement(name = "MstrRef")
	protected Max35Text masterReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned to a set of orders or trades in order to link them together."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV02, Optional<Max35Text>> mmMasterReference = new MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV02, Optional<Max35Text>>() {
		{
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Reference assigned to a set of orders or trades in order to link them together.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SwitchOrderConfirmationCancellationInstructionV02 obj) {
			return obj.getMasterReference();
		}

		@Override
		public void setValue(SwitchOrderConfirmationCancellationInstructionV02 obj, Optional<Max35Text> value) {
			obj.setMasterReference(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrRefs", required = true)
	protected List<InvestmentFundOrder11> orderReferences;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder11
	 * InvestmentFundOrder11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrRefs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReferences"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the individual order confirmation to be cancelled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV02, List<InvestmentFundOrder11>> mmOrderReferences = new MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV02, List<InvestmentFundOrder11>>() {
		{
			xmlTag = "OrdrRefs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferences";
			definition = "Identification of the individual order confirmation to be cancelled.";
			minOccurs = 1;
			complexType_lazy = () -> InvestmentFundOrder11.mmObject();
		}

		@Override
		public List<InvestmentFundOrder11> getValue(SwitchOrderConfirmationCancellationInstructionV02 obj) {
			return obj.getOrderReferences();
		}

		@Override
		public void setValue(SwitchOrderConfirmationCancellationInstructionV02 obj, List<InvestmentFundOrder11> value) {
			obj.setOrderReferences(value);
		}
	};
	@XmlElement(name = "CpyDtls")
	protected CopyInformation4 copyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CopyInformation4
	 * CopyInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information provided when the message is a copy of a previous message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmCopyDetails
	 * SwitchOrderConfirmationCancellationInstructionV01.mmCopyDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV02, Optional<CopyInformation4>> mmCopyDetails = new MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV02, Optional<CopyInformation4>>() {
		{
			xmlTag = "CpyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDetails";
			definition = "Information provided when the message is a copy of a previous message.";
			previousVersion_lazy = () -> SwitchOrderConfirmationCancellationInstructionV01.mmCopyDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CopyInformation4.mmObject();
		}

		@Override
		public Optional<CopyInformation4> getValue(SwitchOrderConfirmationCancellationInstructionV02 obj) {
			return obj.getCopyDetails();
		}

		@Override
		public void setValue(SwitchOrderConfirmationCancellationInstructionV02 obj, Optional<CopyInformation4> value) {
			obj.setCopyDetails(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SwitchOrderConfirmationCancellationInstructionV02";
				definition = "Scope\r\nThe SwitchOrderConfirmationCancellationInstruction message is sent by an executing party, for example, a transfer agent, to the instructing party, for example, an investment manager or its authorised representative, to cancel a previously sent SwitchOrderConfirmation.\r\nUsage\r\nTo request the cancellation of one or more individual order executions, the order reference and deal reference of each individual order execution in the original SwitchOrderConfirmation are specified in the order reference and deal reference elements respectively. The message identification of the SwitchOrderConfirmation message in which the individual order execution was conveyed may also be quoted in PreviousReference but this is not recommended. The AmendmentIndicator is used to specify whether the switch order confirmation cancellation is to be followed by an amendment An amendment of a switch order confirmation is carried out by sending a SwitchOrderConfirmation message in which the AmendmentIndicator contains the value ‘true’.";
				previousVersion_lazy = () -> SwitchOrderConfirmationCancellationInstructionV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "SwtchOrdrConfCxlInstr";
				businessArea_lazy = () -> SecuritiesTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02.mmMessageIdentification,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02.mmPoolReference, com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02.mmPreviousReference,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02.mmRelatedReference, com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02.mmAmendmentIndicator,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02.mmMasterReference, com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02.mmOrderReferences,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02.mmCopyDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "055";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SwitchOrderConfirmationCancellationInstructionV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public SwitchOrderConfirmationCancellationInstructionV02 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<AdditionalReference9> getPoolReference() {
		return poolReference == null ? Optional.empty() : Optional.of(poolReference);
	}

	public SwitchOrderConfirmationCancellationInstructionV02 setPoolReference(AdditionalReference9 poolReference) {
		this.poolReference = poolReference;
		return this;
	}

	public List<AdditionalReference8> getPreviousReference() {
		return previousReference == null ? previousReference = new ArrayList<>() : previousReference;
	}

	public SwitchOrderConfirmationCancellationInstructionV02 setPreviousReference(List<AdditionalReference8> previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public Optional<AdditionalReference8> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public SwitchOrderConfirmationCancellationInstructionV02 setRelatedReference(AdditionalReference8 relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public YesNoIndicator getAmendmentIndicator() {
		return amendmentIndicator;
	}

	public SwitchOrderConfirmationCancellationInstructionV02 setAmendmentIndicator(YesNoIndicator amendmentIndicator) {
		this.amendmentIndicator = Objects.requireNonNull(amendmentIndicator);
		return this;
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public SwitchOrderConfirmationCancellationInstructionV02 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public List<InvestmentFundOrder11> getOrderReferences() {
		return orderReferences == null ? orderReferences = new ArrayList<>() : orderReferences;
	}

	public SwitchOrderConfirmationCancellationInstructionV02 setOrderReferences(List<InvestmentFundOrder11> orderReferences) {
		this.orderReferences = Objects.requireNonNull(orderReferences);
		return this;
	}

	public Optional<CopyInformation4> getCopyDetails() {
		return copyDetails == null ? Optional.empty() : Optional.of(copyDetails);
	}

	public SwitchOrderConfirmationCancellationInstructionV02 setCopyDetails(CopyInformation4 copyDetails) {
		this.copyDetails = copyDetails;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.055.001.02")
	static public class Document {
		@XmlElement(name = "SwtchOrdrConfCxlInstr", required = true)
		public SwitchOrderConfirmationCancellationInstructionV02 messageBody;
	}
}