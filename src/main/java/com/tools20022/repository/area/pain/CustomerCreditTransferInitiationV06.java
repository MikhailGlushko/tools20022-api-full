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
import com.tools20022.repository.msg.GroupHeader48;
import com.tools20022.repository.msg.PaymentInstruction16;
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
 * The CustomerCreditTransferInitiation message is sent by the initiating party
 * to the forwarding agent or debtor agent. It is used to request movement of
 * funds from the debtor account to a creditor.<br>
 * <b>Usage</b><br>
 * The CustomerCreditTransferInitiation message can contain one or more customer
 * credit transfer instructions.<br>
 * The CustomerCreditTransferInitiation message is used to exchange:<br>
 * - One or more instances of a credit transfer initiation;<br>
 * - Payment transactions that result in book transfers at the debtor agent or
 * payments to another financial institution;<br>
 * - Payment transactions that result in an electronic cash transfer to the
 * creditor account or in the emission of a cheque.<br>
 * The message can be used in a direct or a relay scenario:<br>
 * - In a direct scenario, the message is sent directly to the debtor agent. The
 * debtor agent is the account servicer of the debtor.<br>
 * - In a relay scenario, the message is sent to a forwarding agent. The
 * forwarding agent acts as a concentrating financial institution. It will
 * forward the CustomerCreditTransferInitiation message to the debtor agent.<br>
 * The message can also be used by an initiating party that has authority to
 * send the message on behalf of the debtor. This caters for example for the
 * scenario of a payments factory initiating all payments on behalf of a large
 * corporate.<br>
 * The CustomerCreditTransferInitiation message can be used in domestic and
 * cross-border scenarios.<br>
 * The CustomerCreditTransferInitiation message must not be used by the debtor
 * agent to execute the credit transfer instruction(s). The
 * FIToFICustomerCreditTransfer message must be used instead.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV06#mmGroupHeader
 * CustomerCreditTransferInitiationV06.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV06#mmPaymentInformation
 * CustomerCreditTransferInitiationV06.mmPaymentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV06#mmSupplementaryData
 * CustomerCreditTransferInitiationV06.mmSupplementaryData}</li>
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
 * xmlTag} = "CstmrCdtTrfInitn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsInitiationArchive
 * PaymentsInitiationArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pain.001.001.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerCreditTransferInitiationV06
 * ConstraintSupplementaryDataRule.forCustomerCreditTransferInitiationV06}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerCreditTransferInitiationV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CustomerCreditTransferInitiation message is sent by the initiating party to the forwarding agent or debtor agent. It is used to request movement of funds from the debtor account to a creditor.\r\nUsage\r\nThe CustomerCreditTransferInitiation message can contain one or more customer credit transfer instructions.\r\nThe CustomerCreditTransferInitiation message is used to exchange:\r\n- One or more instances of a credit transfer initiation;\r\n- Payment transactions that result in book transfers at the debtor agent or payments to another financial institution;\r\n- Payment transactions that result in an electronic cash transfer to the creditor account or in the emission of a cheque.\r\nThe message can be used in a direct or a relay scenario:\r\n- In a direct scenario, the message is sent directly to the debtor agent. The debtor agent is the account servicer of the debtor.\r\n- In a relay scenario, the message is sent to a forwarding agent. The forwarding agent acts as a concentrating financial institution. It will forward the CustomerCreditTransferInitiation message to the debtor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the debtor. This caters for example for the scenario of a payments factory initiating all payments on behalf of a large corporate.\r\nThe CustomerCreditTransferInitiation message can be used in domestic and cross-border scenarios.\r\nThe CustomerCreditTransferInitiation message must not be used by the debtor agent to execute the credit transfer instruction(s). The FIToFICustomerCreditTransfer message must be used instead."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV07
 * CustomerCreditTransferInitiationV07}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV05
 * CustomerCreditTransferInitiationV05}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CustomerCreditTransferInitiationV06", propOrder = {"groupHeader", "paymentInformation", "supplementaryData"})
public class CustomerCreditTransferInitiationV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader48 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader48
	 * GroupHeader48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics shared by all individual transactions included in the message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV07#mmGroupHeader
	 * CustomerCreditTransferInitiationV07.mmGroupHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV05#mmGroupHeader
	 * CustomerCreditTransferInitiationV05.mmGroupHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerCreditTransferInitiationV06, GroupHeader48> mmGroupHeader = new MMMessageBuildingBlock<CustomerCreditTransferInitiationV06, GroupHeader48>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			nextVersions_lazy = () -> Arrays.asList(CustomerCreditTransferInitiationV07.mmGroupHeader);
			previousVersion_lazy = () -> CustomerCreditTransferInitiationV05.mmGroupHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader48.mmObject();
		}

		@Override
		public GroupHeader48 getValue(CustomerCreditTransferInitiationV06 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(CustomerCreditTransferInitiationV06 obj, GroupHeader48 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "PmtInf", required = true)
	protected List<PaymentInstruction16> paymentInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics that applies to the debit side of the payment transactions included in the credit transfer initiation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV07#mmPaymentInformation
	 * CustomerCreditTransferInitiationV07.mmPaymentInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV05#mmPaymentInformation
	 * CustomerCreditTransferInitiationV05.mmPaymentInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerCreditTransferInitiationV06, List<PaymentInstruction16>> mmPaymentInformation = new MMMessageBuildingBlock<CustomerCreditTransferInitiationV06, List<PaymentInstruction16>>() {
		{
			xmlTag = "PmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformation";
			definition = "Set of characteristics that applies to the debit side of the payment transactions included in the credit transfer initiation.";
			nextVersions_lazy = () -> Arrays.asList(CustomerCreditTransferInitiationV07.mmPaymentInformation);
			previousVersion_lazy = () -> CustomerCreditTransferInitiationV05.mmPaymentInformation;
			minOccurs = 1;
			complexType_lazy = () -> PaymentInstruction16.mmObject();
		}

		@Override
		public List<PaymentInstruction16> getValue(CustomerCreditTransferInitiationV06 obj) {
			return obj.getPaymentInformation();
		}

		@Override
		public void setValue(CustomerCreditTransferInitiationV06 obj, List<PaymentInstruction16> value) {
			obj.setPaymentInformation(value);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV07#mmSupplementaryData
	 * CustomerCreditTransferInitiationV07.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV05#mmSupplementaryData
	 * CustomerCreditTransferInitiationV05.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerCreditTransferInitiationV06, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CustomerCreditTransferInitiationV06, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(CustomerCreditTransferInitiationV07.mmSupplementaryData);
			previousVersion_lazy = () -> CustomerCreditTransferInitiationV05.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CustomerCreditTransferInitiationV06 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CustomerCreditTransferInitiationV06 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerCreditTransferInitiationV06);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustomerCreditTransferInitiationV06";
				definition = "Scope\r\nThe CustomerCreditTransferInitiation message is sent by the initiating party to the forwarding agent or debtor agent. It is used to request movement of funds from the debtor account to a creditor.\r\nUsage\r\nThe CustomerCreditTransferInitiation message can contain one or more customer credit transfer instructions.\r\nThe CustomerCreditTransferInitiation message is used to exchange:\r\n- One or more instances of a credit transfer initiation;\r\n- Payment transactions that result in book transfers at the debtor agent or payments to another financial institution;\r\n- Payment transactions that result in an electronic cash transfer to the creditor account or in the emission of a cheque.\r\nThe message can be used in a direct or a relay scenario:\r\n- In a direct scenario, the message is sent directly to the debtor agent. The debtor agent is the account servicer of the debtor.\r\n- In a relay scenario, the message is sent to a forwarding agent. The forwarding agent acts as a concentrating financial institution. It will forward the CustomerCreditTransferInitiation message to the debtor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the debtor. This caters for example for the scenario of a payments factory initiating all payments on behalf of a large corporate.\r\nThe CustomerCreditTransferInitiation message can be used in domestic and cross-border scenarios.\r\nThe CustomerCreditTransferInitiation message must not be used by the debtor agent to execute the credit transfer instruction(s). The FIToFICustomerCreditTransfer message must be used instead.";
				nextVersions_lazy = () -> Arrays.asList(CustomerCreditTransferInitiationV07.mmObject());
				previousVersion_lazy = () -> CustomerCreditTransferInitiationV05.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "CstmrCdtTrfInitn";
				businessArea_lazy = () -> PaymentsInitiationArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV06.mmGroupHeader,
						com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV06.mmPaymentInformation, com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV06.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pain";
						messageFunctionality = "001";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CustomerCreditTransferInitiationV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader48 getGroupHeader() {
		return groupHeader;
	}

	public CustomerCreditTransferInitiationV06 setGroupHeader(GroupHeader48 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<PaymentInstruction16> getPaymentInformation() {
		return paymentInformation == null ? paymentInformation = new ArrayList<>() : paymentInformation;
	}

	public CustomerCreditTransferInitiationV06 setPaymentInformation(List<PaymentInstruction16> paymentInformation) {
		this.paymentInformation = Objects.requireNonNull(paymentInformation);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CustomerCreditTransferInitiationV06 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.06")
	static public class Document {
		@XmlElement(name = "CstmrCdtTrfInitn", required = true)
		public CustomerCreditTransferInitiationV06 messageBody;
	}
}