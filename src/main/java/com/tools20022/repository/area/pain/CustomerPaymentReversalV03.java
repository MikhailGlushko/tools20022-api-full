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

package com.tools20022.repository.area.pain;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.PaymentsInitiationArchive;
import com.tools20022.repository.msg.GroupHeader56;
import com.tools20022.repository.msg.OriginalGroupHeader3;
import com.tools20022.repository.msg.OriginalPaymentInstruction2;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The CustomerPaymentReversal message is sent by the initiating party to the
 * next party in the payment chain. It is used to reverse a payment previously
 * executed.<br>
 * <b>Usage</b><br>
 * The CustomerPaymentReversal message is exchanged between a non-financial
 * institution customer and an agent to reverse a CustomerDirectDebitInitiation
 * message that has been settled. The result will be a credit on the debtor
 * account.<br>
 * The CustomerPaymentReversal message refers to the original
 * CustomerDirectDebitInitiation message by means of references only or by means
 * of references and a set of elements from the original instruction.<br>
 * The CustomerPaymentReversal message can be used in domestic and cross-border
 * scenarios.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pain.007.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsInitiationArchive
 * PaymentsInitiationArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV03#mmGroupHeader
 * CustomerPaymentReversalV03.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV03#mmOriginalGroupInformation
 * CustomerPaymentReversalV03.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV03#mmOriginalPaymentInformationAndReversal
 * CustomerPaymentReversalV03.mmOriginalPaymentInformationAndReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV03#mmSupplementaryData
 * CustomerPaymentReversalV03.mmSupplementaryData}</li>
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
 * xmlTag} = "CstmrPmtRvsl"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerPaymentReversalV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CustomerPaymentReversal message is sent by the initiating party to the next party in the payment chain. It is used to reverse a payment previously executed.\r\nUsage\r\nThe CustomerPaymentReversal message is exchanged between a non-financial institution customer and an agent to reverse a CustomerDirectDebitInitiation message that has been settled. The result will be a credit on the debtor account.\r\nThe CustomerPaymentReversal message refers to the original CustomerDirectDebitInitiation message by means of references only or by means of references and a set of elements from the original instruction.\r\nThe CustomerPaymentReversal message can be used in domestic and cross-border scenarios."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationNotPresentRule#for_pain_CustomerPaymentReversalV03
 * ConstraintGroupReversalAndPaymentInformationNotPresentRule.
 * for_pain_CustomerPaymentReversalV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndReasonRule#for_pain_CustomerPaymentReversalV03
 * ConstraintGroupReversalAndReasonRule.for_pain_CustomerPaymentReversalV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule#for_pain_CustomerPaymentReversalV03
 * ConstraintGroupReversalAndNumberOfTransactionsRule.
 * for_pain_CustomerPaymentReversalV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationPresentRule#for_pain_CustomerPaymentReversalV03
 * ConstraintGroupReversalAndPaymentInformationPresentRule.
 * for_pain_CustomerPaymentReversalV03}</li>
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
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV04
 * CustomerPaymentReversalV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV02
 * CustomerPaymentReversalV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CustomerPaymentReversalV03", propOrder = {"groupHeader", "originalGroupInformation", "originalPaymentInformationAndReversal", "supplementaryData"})
public class CustomerPaymentReversalV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader56 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader56
	 * GroupHeader56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics shared by all individual transactions included in the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerPaymentReversalV03, GroupHeader56> mmGroupHeader = new MMMessageBuildingBlock<CustomerPaymentReversalV03, GroupHeader56>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader56.mmObject();
		}

		@Override
		public GroupHeader56 getValue(CustomerPaymentReversalV03 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(CustomerPaymentReversalV03 obj, GroupHeader56 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "OrgnlGrpInf", required = true)
	protected OriginalGroupHeader3 originalGroupInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3
	 * OriginalGroupHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the original group of transactions, to which the message refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerPaymentReversalV03, OriginalGroupHeader3> mmOriginalGroupInformation = new MMMessageBuildingBlock<CustomerPaymentReversalV03, OriginalGroupHeader3>() {
		{
			xmlTag = "OrgnlGrpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Information concerning the original group of transactions, to which the message refers.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OriginalGroupHeader3.mmObject();
		}

		@Override
		public OriginalGroupHeader3 getValue(CustomerPaymentReversalV03 obj) {
			return obj.getOriginalGroupInformation();
		}

		@Override
		public void setValue(CustomerPaymentReversalV03 obj, OriginalGroupHeader3 value) {
			obj.setOriginalGroupInformation(value);
		}
	};
	@XmlElement(name = "OrgnlPmtInfAndRvsl")
	protected List<OriginalPaymentInstruction2> originalPaymentInformationAndReversal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction2
	 * OriginalPaymentInstruction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPmtInfAndRvsl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPaymentInformationAndReversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the original payment information, to which the reversal message refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerPaymentReversalV03, List<OriginalPaymentInstruction2>> mmOriginalPaymentInformationAndReversal = new MMMessageBuildingBlock<CustomerPaymentReversalV03, List<OriginalPaymentInstruction2>>() {
		{
			xmlTag = "OrgnlPmtInfAndRvsl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationAndReversal";
			definition = "Information concerning the original payment information, to which the reversal message refers.";
			minOccurs = 0;
			complexType_lazy = () -> OriginalPaymentInstruction2.mmObject();
		}

		@Override
		public List<OriginalPaymentInstruction2> getValue(CustomerPaymentReversalV03 obj) {
			return obj.getOriginalPaymentInformationAndReversal();
		}

		@Override
		public void setValue(CustomerPaymentReversalV03 obj, List<OriginalPaymentInstruction2> value) {
			obj.setOriginalPaymentInformationAndReversal(value);
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerPaymentReversalV03, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CustomerPaymentReversalV03, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CustomerPaymentReversalV03 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CustomerPaymentReversalV03 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationNotPresentRule.for_pain_CustomerPaymentReversalV03,
						com.tools20022.repository.constraints.ConstraintGroupReversalAndReasonRule.for_pain_CustomerPaymentReversalV03,
						com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule.for_pain_CustomerPaymentReversalV03,
						com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationPresentRule.for_pain_CustomerPaymentReversalV03);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustomerPaymentReversalV03";
				definition = "Scope\r\nThe CustomerPaymentReversal message is sent by the initiating party to the next party in the payment chain. It is used to reverse a payment previously executed.\r\nUsage\r\nThe CustomerPaymentReversal message is exchanged between a non-financial institution customer and an agent to reverse a CustomerDirectDebitInitiation message that has been settled. The result will be a credit on the debtor account.\r\nThe CustomerPaymentReversal message refers to the original CustomerDirectDebitInitiation message by means of references only or by means of references and a set of elements from the original instruction.\r\nThe CustomerPaymentReversal message can be used in domestic and cross-border scenarios.";
				nextVersions_lazy = () -> Arrays.asList(CustomerPaymentReversalV04.mmObject());
				previousVersion_lazy = () -> CustomerPaymentReversalV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "CstmrPmtRvsl";
				businessArea_lazy = () -> PaymentsInitiationArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CustomerPaymentReversalV03.mmGroupHeader, com.tools20022.repository.area.pain.CustomerPaymentReversalV03.mmOriginalGroupInformation,
						com.tools20022.repository.area.pain.CustomerPaymentReversalV03.mmOriginalPaymentInformationAndReversal, com.tools20022.repository.area.pain.CustomerPaymentReversalV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pain";
						messageFunctionality = "007";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CustomerPaymentReversalV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader56 getGroupHeader() {
		return groupHeader;
	}

	public CustomerPaymentReversalV03 setGroupHeader(GroupHeader56 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public OriginalGroupHeader3 getOriginalGroupInformation() {
		return originalGroupInformation;
	}

	public CustomerPaymentReversalV03 setOriginalGroupInformation(OriginalGroupHeader3 originalGroupInformation) {
		this.originalGroupInformation = Objects.requireNonNull(originalGroupInformation);
		return this;
	}

	public List<OriginalPaymentInstruction2> getOriginalPaymentInformationAndReversal() {
		return originalPaymentInformationAndReversal == null ? originalPaymentInformationAndReversal = new ArrayList<>() : originalPaymentInformationAndReversal;
	}

	public CustomerPaymentReversalV03 setOriginalPaymentInformationAndReversal(List<OriginalPaymentInstruction2> originalPaymentInformationAndReversal) {
		this.originalPaymentInformationAndReversal = Objects.requireNonNull(originalPaymentInformationAndReversal);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CustomerPaymentReversalV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.007.001.03")
	static public class Document {
		@XmlElement(name = "CstmrPmtRvsl", required = true)
		public CustomerPaymentReversalV03 messageBody;
	}
}