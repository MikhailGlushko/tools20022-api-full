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

package com.tools20022.repository.area.pacs;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.PaymentsClearingandSettlementLatestVersion;
import com.tools20022.repository.msg.GroupHeader53;
import com.tools20022.repository.msg.OriginalGroupInformation27;
import com.tools20022.repository.msg.PaymentTransaction73;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.PaymentsClearingandSettlementISOLatestversion;
import com.tools20022.repository.msgset.PaymentsClearingandSettlementMaintenance20162017;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * <b>Scope</b><br>
 * The FinancialInstitutionToFinancialInstitutionPaymentStatusRequest message is
 * sent by the debtor agent to the creditor agent, directly or through other
 * agents and/or a payment clearing and settlement system. It is used to request
 * a FIToFIPaymentStatusReport message containing information on the status of a
 * previously sent instruction. <br>
 * <b>Usage</b><br>
 * The FIToFIPaymentStatusRequest message is exchanged between agents to request
 * status information about instructions previously sent. Its usage will always
 * be governed by a bilateral agreement between the agents.<br>
 * The FIToFIPaymentStatusRequest message can be used to request information
 * about the status (e.g. rejection, acceptance) of a credit transfer
 * instruction, a direct debit instruction, as well as other intra-agent
 * instructions (for example FIToFIPaymentCancellationRequest).<br>
 * The FIToFIPaymentStatusRequest message refers to the original instruction(s)
 * by means of references only or by means of references and a set of elements
 * from the original instruction.<br>
 * The FIToFIPaymentStatusRequest message can be used in domestic and
 * cross-border scenarios.<br>
 * <br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementLatestVersion
 * PaymentsClearingandSettlementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PaymentsClearingandSettlementISOLatestversion
 * PaymentsClearingandSettlementISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PaymentsClearingandSettlementMaintenance20162017
 * PaymentsClearingandSettlementMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FIToFIPmtStsReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV01#mmGroupHeader
 * FIToFIPaymentStatusRequestV01.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV01#mmOriginalGroupInformation
 * FIToFIPaymentStatusRequestV01.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV01#mmTransactionInformation
 * FIToFIPaymentStatusRequestV01.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV01#mmSupplementaryData
 * FIToFIPaymentStatusRequestV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.028.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FIToFIPaymentStatusRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FinancialInstitutionToFinancialInstitutionPaymentStatusRequest message is sent by the debtor agent to the creditor agent, directly or through other agents and/or a payment clearing and settlement system.  It is used to request a FIToFIPaymentStatusReport message containing information on the status of a previously sent instruction. \r\nUsage\r\nThe FIToFIPaymentStatusRequest message is exchanged between agents to request status information about instructions previously sent. Its usage will always be governed by a bilateral agreement between the agents.\r\nThe FIToFIPaymentStatusRequest message can be used to request information about the status (e.g. rejection, acceptance) of a credit transfer instruction, a direct debit instruction, as well as other intra-agent instructions (for example FIToFIPaymentCancellationRequest).\r\nThe FIToFIPaymentStatusRequest message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.\r\nThe FIToFIPaymentStatusRequest message can be used in domestic and cross-border scenarios.\r\n\r\n"
 * </li>
 * </ul>
 */
public class FIToFIPaymentStatusRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected GroupHeader53 groupHeader;
	/**
	 * Set of characteristics shared by all individual transactions included in
	 * the status request message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader53
	 * GroupHeader53}</li>
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
	 * "Set of characteristics shared by all individual transactions included in the status request message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmGroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the status request message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader53.mmObject();
		}
	};
	protected List<OriginalGroupInformation27> originalGroupInformation;
	/**
	 * Original group information concerning the group of transactions, to which
	 * the status request message refers to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation27
	 * OriginalGroupInformation27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original group information concerning the group of transactions, to which the status request message refers to."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOriginalGroupInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgnlGrpInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Original group information concerning the group of transactions, to which the status request message refers to.";
			minOccurs = 0;
			complexType_lazy = () -> OriginalGroupInformation27.mmObject();
		}
	};
	protected List<PaymentTransaction73> transactionInformation;
	/**
	 * Information concerning the original transaction, to which the status
	 * request message refers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73
	 * PaymentTransaction73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the original transaction, to which the status request message refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformation";
			definition = "Information concerning the original transaction, to which the status request message refers.";
			minOccurs = 0;
			complexType_lazy = () -> PaymentTransaction73.mmObject();
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FIToFIPaymentStatusRequestV01";
				definition = "Scope\r\nThe FinancialInstitutionToFinancialInstitutionPaymentStatusRequest message is sent by the debtor agent to the creditor agent, directly or through other agents and/or a payment clearing and settlement system.  It is used to request a FIToFIPaymentStatusReport message containing information on the status of a previously sent instruction. \r\nUsage\r\nThe FIToFIPaymentStatusRequest message is exchanged between agents to request status information about instructions previously sent. Its usage will always be governed by a bilateral agreement between the agents.\r\nThe FIToFIPaymentStatusRequest message can be used to request information about the status (e.g. rejection, acceptance) of a credit transfer instruction, a direct debit instruction, as well as other intra-agent instructions (for example FIToFIPaymentCancellationRequest).\r\nThe FIToFIPaymentStatusRequest message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.\r\nThe FIToFIPaymentStatusRequest message can be used in domestic and cross-border scenarios.\r\n\r\n";
				messageSet_lazy = () -> Arrays.asList(PaymentsClearingandSettlementISOLatestversion.mmObject(), PaymentsClearingandSettlementMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "FIToFIPmtStsReq";
				businessArea_lazy = () -> PaymentsClearingandSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV01.mmGroupHeader, com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV01.mmOriginalGroupInformation,
						com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV01.mmTransactionInformation, com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "028";
						version = "01";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader53 getGroupHeader() {
		return groupHeader;
	}

	public void setGroupHeader(GroupHeader53 groupHeader) {
		this.groupHeader = groupHeader;
	}

	public List<OriginalGroupInformation27> getOriginalGroupInformation() {
		return originalGroupInformation;
	}

	public void setOriginalGroupInformation(List<OriginalGroupInformation27> originalGroupInformation) {
		this.originalGroupInformation = originalGroupInformation;
	}

	public List<PaymentTransaction73> getTransactionInformation() {
		return transactionInformation;
	}

	public void setTransactionInformation(List<PaymentTransaction73> transactionInformation) {
		this.transactionInformation = transactionInformation;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}