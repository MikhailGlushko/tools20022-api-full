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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementArchive;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The Customer Payment Cancellation Request message is sent by a case
 * creator/case assigner to a case assignee.<br>
 * This message is used to request the cancellation of an original payment
 * instruction. The Customer Payment Cancellation Request message is issued by
 * the initiating party to request the cancellation of an initiation payment
 * message previously sent (such as CustomerCreditTransferInitiation or
 * CustomerDirectDebitInitiation).<br>
 * <b>Usage</b><br>
 * The Customer Payment Cancellation Request message must be answered with a:<br>
 * - Resolution Of Investigation message with a positive final outcome when the
 * case assignee can perform the requested cancellation<br>
 * - Resolution Of Investigation message with a negative final outcome when the
 * case assignee may perform the requested cancellation but fails to do so (too
 * late, irrevocable instruction.)<br>
 * - Reject Investigation message when the case assignee is unable or not
 * authorised to perform the requested cancellation<br>
 * - Notification Of Case Assignment message to indicate whether the case
 * assignee will take on the case himself or reassign the case to a subsequent
 * party in the payment processing chain.<br>
 * A Customer Payment Cancellation Request message concerns one and only one
 * original payment instruction at a time.<br>
 * When a case assignee successfully performs a cancellation, it must return the
 * corresponding funds to the case assigner. It may provide some details about
 * the return in the Resolution Of Investigation message.<br>
 * The processing of a Customer Payment Cancellation Request message case may
 * lead to a Debit Authorisation Request message sent to the creditor by its
 * account servicing institution.<br>
 * The Customer Payment Cancellation Request message may be used to escalate a
 * case after an unsuccessful request to modify the payment. In this scenario,
 * the case identification remains the same as in the original Customer Payment
 * Cancellation Request message and the element ReopenCaseIndication is set to
 * 'Yes' or 'true'.<br>
 * The Customer Payment Cancellation Request message has the following main
 * characteristics:<br>
 * The case creator assigns a unique case identification and the reason code for
 * the cancellation request. This information will be passed unchanged to all
 * subsequent case assignee(s). For the Customer Payment Cancellation Request
 * message has been made optional, as the message might be used outside of a
 * case management environment where the case identification is not relevant.<br>
 * Moreover, the case identification may be present at different levels:<br>
 * - One unique case is defined per cancellation request message: If multiple
 * underlying groups, payment information blocks or transactions are present in
 * the message and the case assignee has already forwarded the transaction for
 * which the cancellation is requested, the case cannot be forwarded to the next
 * party in the chain (see rule on uniqueness of the case) and the case creator
 * will have to issue individual cancellation requests for each underlying
 * individual transaction. In response to this cancellation request, the case
 * must also be present at the message level in the Resolution of Investigation
 * message.<br>
 * - One case per original group, payment information or transaction present in
 * the cancellation request: For each group, payment information block or
 * transaction within the payment information, a unique case has been assigned.
 * This means, when a payment instruction has already been forwarded by the case
 * assignee, the cancellation request may be forwarded to next party in the
 * payment chain, with the unique case assigned to the transaction. When the
 * group can only be cancelled partially, new cancellation requests need however
 * to be issued for the individual transactions within the group for which the
 * cancellation request has not been successful. In response to this
 * cancellation request, the case must be present in the cancellation details
 * identifying the original group or transaction in the Resolution of
 * Investigation message.<br>
 * - No case used in cancellation request message:<br>
 * The cancellation of a payment instruction can be initiated by either the
 * debtor/creditor or any subsequent agent in the payment instruction processing
 * chain.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV02#mmAssignment
 * CustomerPaymentCancellationRequestV02.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV02#mmCase
 * CustomerPaymentCancellationRequestV02.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV02#mmControlData
 * CustomerPaymentCancellationRequestV02.mmControlData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV02#mmUnderlying
 * CustomerPaymentCancellationRequestV02.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV02#mmSupplementaryData
 * CustomerPaymentCancellationRequestV02.mmSupplementaryData}</li>
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
 * xmlTag} = "CstmrPmtCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.055.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrGroupCaseRule#forCustomerPaymentCancellationRequestV02
 * ConstraintMessageOrGroupCaseRule.forCustomerPaymentCancellationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationCaseRule#forCustomerPaymentCancellationRequestV02
 * ConstraintMessageOrPaymentInformationCaseRule.
 * forCustomerPaymentCancellationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule#forCustomerPaymentCancellationRequestV02
 * ConstraintMessageOrTransactionCaseRule.
 * forCustomerPaymentCancellationRequestV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerPaymentCancellationRequestV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Customer Payment Cancellation Request message is sent by a case creator/case assigner to a case assignee.\r\nThis message is used to request the cancellation of an original payment instruction. The Customer Payment Cancellation Request message is issued by the initiating party to request the cancellation of an initiation payment message previously sent (such as CustomerCreditTransferInitiation or CustomerDirectDebitInitiation).\r\nUsage\r\nThe Customer Payment Cancellation Request message must be answered with a:\r\n- Resolution Of Investigation message with a positive final outcome when the case assignee can perform the requested cancellation\r\n- Resolution Of Investigation message with a negative final outcome when the case assignee may perform the requested cancellation but fails to do so (too late, irrevocable instruction.)\r\n- Reject Investigation message when the case assignee is unable or not authorised to perform the requested cancellation\r\n- Notification Of Case Assignment message to indicate whether the case assignee will take on the case himself or reassign the case to a subsequent party in the payment processing chain.\r\nA Customer Payment Cancellation Request message concerns one and only one original payment instruction at a time.\r\nWhen a case assignee successfully performs a cancellation, it must return the corresponding funds to the case assigner. It may provide some details about the return in the Resolution Of Investigation message.\r\nThe processing of a Customer Payment Cancellation Request message case may lead to a Debit Authorisation Request message sent to the creditor by its account servicing institution.\r\nThe Customer Payment Cancellation Request message may be used to escalate a case after an unsuccessful request to modify the payment. In this scenario, the case identification remains the same as in the original Customer Payment Cancellation Request message and the element ReopenCaseIndication is set to 'Yes' or 'true'.\r\nThe Customer Payment Cancellation Request message has the following main characteristics:\r\nThe case creator assigns a unique case identification and the reason code for the cancellation request. This information will be passed unchanged to all subsequent case assignee(s). For the Customer Payment Cancellation Request message has been made optional, as the message might be used outside of a case management environment where the case identification is not relevant.\r\nMoreover, the case identification may be present at different levels:\r\n- One unique case is defined per cancellation request message: If multiple underlying groups, payment information blocks or transactions are present in the message and the case assignee has already forwarded the transaction for which the cancellation is requested, the case cannot be forwarded to the next party in the chain (see rule on uniqueness of the case) and the case creator will have to issue individual cancellation requests for each underlying individual transaction. In response to this cancellation request, the case must also be present at the message level in the Resolution of Investigation message.\r\n- One case per original group, payment information or transaction present in the cancellation request: For each group, payment information block or transaction within the payment information, a unique case has been assigned. This means, when a payment instruction has already been forwarded by the case assignee, the cancellation request may be forwarded to next party in the payment chain, with the unique case assigned to the transaction. When the group can only be cancelled partially, new cancellation requests need however to be issued for the individual transactions within the group for which the cancellation request has not been successful. In response to this cancellation request, the case must be present in the cancellation details identifying the original group or transaction in the Resolution of Investigation message.\r\n- No case used in cancellation request message:\r\nThe cancellation of a payment instruction can be initiated by either the debtor/creditor or any subsequent agent in the payment instruction processing chain."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV03
 * CustomerPaymentCancellationRequestV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV01
 * CustomerPaymentCancellationRequestV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CustomerPaymentCancellationRequestV02", propOrder = {"assignment", "case_", "controlData", "underlying", "supplementaryData"})
public class CustomerPaymentCancellationRequestV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Assgnmt", required = true)
	protected CaseAssignment3 assignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment3
	 * CaseAssignment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerPaymentCancellationRequestV02, CaseAssignment3> mmAssignment = new MMMessageBuildingBlock<CustomerPaymentCancellationRequestV02, CaseAssignment3>() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment3.mmObject();
		}

		@Override
		public CaseAssignment3 getValue(CustomerPaymentCancellationRequestV02 obj) {
			return obj.getAssignment();
		}

		@Override
		public void setValue(CustomerPaymentCancellationRequestV02 obj, CaseAssignment3 value) {
			obj.setAssignment(value);
		}
	};
	@XmlElement(name = "Case")
	protected Case3 case_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case3 Case3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the investigation case."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerPaymentCancellationRequestV02, Optional<Case3>> mmCase = new MMMessageBuildingBlock<CustomerPaymentCancellationRequestV02, Optional<Case3>>() {
		{
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the investigation case.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Case3.mmObject();
		}

		@Override
		public Optional<Case3> getValue(CustomerPaymentCancellationRequestV02 obj) {
			return obj.getCase();
		}

		@Override
		public void setValue(CustomerPaymentCancellationRequestV02 obj, Optional<Case3> value) {
			obj.setCase(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrlData")
	protected ControlData1 controlData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ControlData1
	 * ControlData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrlData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the number of transactions and the control sum of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerPaymentCancellationRequestV02, Optional<ControlData1>> mmControlData = new MMMessageBuildingBlock<CustomerPaymentCancellationRequestV02, Optional<ControlData1>>() {
		{
			xmlTag = "CtrlData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlData";
			definition = "Provides details on the number of transactions and the control sum of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ControlData1.mmObject();
		}

		@Override
		public Optional<ControlData1> getValue(CustomerPaymentCancellationRequestV02 obj) {
			return obj.getControlData();
		}

		@Override
		public void setValue(CustomerPaymentCancellationRequestV02 obj, Optional<ControlData1> value) {
			obj.setControlData(value.orElse(null));
		}
	};
	@XmlElement(name = "Undrlyg", required = true)
	protected List<UnderlyingTransaction6> underlying;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction6
	 * UnderlyingTransaction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Undrlyg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Underlying"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the payment instruction to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerPaymentCancellationRequestV02, List<UnderlyingTransaction6>> mmUnderlying = new MMMessageBuildingBlock<CustomerPaymentCancellationRequestV02, List<UnderlyingTransaction6>>() {
		{
			xmlTag = "Undrlyg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Underlying";
			definition = "Identifies the payment instruction to be cancelled.";
			minOccurs = 1;
			complexType_lazy = () -> UnderlyingTransaction6.mmObject();
		}

		@Override
		public List<UnderlyingTransaction6> getValue(CustomerPaymentCancellationRequestV02 obj) {
			return obj.getUnderlying();
		}

		@Override
		public void setValue(CustomerPaymentCancellationRequestV02 obj, List<UnderlyingTransaction6> value) {
			obj.setUnderlying(value);
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerPaymentCancellationRequestV02, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CustomerPaymentCancellationRequestV02, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CustomerPaymentCancellationRequestV02 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CustomerPaymentCancellationRequestV02 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrGroupCaseRule.forCustomerPaymentCancellationRequestV02,
						com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationCaseRule.forCustomerPaymentCancellationRequestV02,
						com.tools20022.repository.constraints.ConstraintMessageOrTransactionCaseRule.forCustomerPaymentCancellationRequestV02);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustomerPaymentCancellationRequestV02";
				definition = "Scope\r\nThe Customer Payment Cancellation Request message is sent by a case creator/case assigner to a case assignee.\r\nThis message is used to request the cancellation of an original payment instruction. The Customer Payment Cancellation Request message is issued by the initiating party to request the cancellation of an initiation payment message previously sent (such as CustomerCreditTransferInitiation or CustomerDirectDebitInitiation).\r\nUsage\r\nThe Customer Payment Cancellation Request message must be answered with a:\r\n- Resolution Of Investigation message with a positive final outcome when the case assignee can perform the requested cancellation\r\n- Resolution Of Investigation message with a negative final outcome when the case assignee may perform the requested cancellation but fails to do so (too late, irrevocable instruction.)\r\n- Reject Investigation message when the case assignee is unable or not authorised to perform the requested cancellation\r\n- Notification Of Case Assignment message to indicate whether the case assignee will take on the case himself or reassign the case to a subsequent party in the payment processing chain.\r\nA Customer Payment Cancellation Request message concerns one and only one original payment instruction at a time.\r\nWhen a case assignee successfully performs a cancellation, it must return the corresponding funds to the case assigner. It may provide some details about the return in the Resolution Of Investigation message.\r\nThe processing of a Customer Payment Cancellation Request message case may lead to a Debit Authorisation Request message sent to the creditor by its account servicing institution.\r\nThe Customer Payment Cancellation Request message may be used to escalate a case after an unsuccessful request to modify the payment. In this scenario, the case identification remains the same as in the original Customer Payment Cancellation Request message and the element ReopenCaseIndication is set to 'Yes' or 'true'.\r\nThe Customer Payment Cancellation Request message has the following main characteristics:\r\nThe case creator assigns a unique case identification and the reason code for the cancellation request. This information will be passed unchanged to all subsequent case assignee(s). For the Customer Payment Cancellation Request message has been made optional, as the message might be used outside of a case management environment where the case identification is not relevant.\r\nMoreover, the case identification may be present at different levels:\r\n- One unique case is defined per cancellation request message: If multiple underlying groups, payment information blocks or transactions are present in the message and the case assignee has already forwarded the transaction for which the cancellation is requested, the case cannot be forwarded to the next party in the chain (see rule on uniqueness of the case) and the case creator will have to issue individual cancellation requests for each underlying individual transaction. In response to this cancellation request, the case must also be present at the message level in the Resolution of Investigation message.\r\n- One case per original group, payment information or transaction present in the cancellation request: For each group, payment information block or transaction within the payment information, a unique case has been assigned. This means, when a payment instruction has already been forwarded by the case assignee, the cancellation request may be forwarded to next party in the payment chain, with the unique case assigned to the transaction. When the group can only be cancelled partially, new cancellation requests need however to be issued for the individual transactions within the group for which the cancellation request has not been successful. In response to this cancellation request, the case must be present in the cancellation details identifying the original group or transaction in the Resolution of Investigation message.\r\n- No case used in cancellation request message:\r\nThe cancellation of a payment instruction can be initiated by either the debtor/creditor or any subsequent agent in the payment instruction processing chain.";
				nextVersions_lazy = () -> Arrays.asList(CustomerPaymentCancellationRequestV03.mmObject());
				previousVersion_lazy = () -> CustomerPaymentCancellationRequestV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "CstmrPmtCxlReq";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV02.mmAssignment, com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV02.mmCase,
						com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV02.mmControlData, com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV02.mmUnderlying,
						com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "055";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CustomerPaymentCancellationRequestV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CaseAssignment3 getAssignment() {
		return assignment;
	}

	public CustomerPaymentCancellationRequestV02 setAssignment(CaseAssignment3 assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public Optional<Case3> getCase() {
		return case_ == null ? Optional.empty() : Optional.of(case_);
	}

	public CustomerPaymentCancellationRequestV02 setCase(Case3 case_) {
		this.case_ = case_;
		return this;
	}

	public Optional<ControlData1> getControlData() {
		return controlData == null ? Optional.empty() : Optional.of(controlData);
	}

	public CustomerPaymentCancellationRequestV02 setControlData(ControlData1 controlData) {
		this.controlData = controlData;
		return this;
	}

	public List<UnderlyingTransaction6> getUnderlying() {
		return underlying == null ? underlying = new ArrayList<>() : underlying;
	}

	public CustomerPaymentCancellationRequestV02 setUnderlying(List<UnderlyingTransaction6> underlying) {
		this.underlying = Objects.requireNonNull(underlying);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CustomerPaymentCancellationRequestV02 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.055.001.02")
	static public class Document {
		@XmlElement(name = "CstmrPmtCxlReq", required = true)
		public CustomerPaymentCancellationRequestV02 messageBody;
	}
}