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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstitution2;
import com.tools20022.repository.msg.SettlementInformation11;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of characteristics shared by all individual transactions included in the
 * message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GroupHeader28#mmMessageIdentification
 * GroupHeader28.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GroupHeader28#mmCreationDateTime
 * GroupHeader28.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GroupHeader28#mmNumberOfTransactions
 * GroupHeader28.mmNumberOfTransactions}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader28#mmGroupReversal
 * GroupHeader28.mmGroupReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GroupHeader28#mmTotalReversedInterbankSettlementAmount
 * GroupHeader28.mmTotalReversedInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GroupHeader28#mmInterbankSettlementDate
 * GroupHeader28.mmInterbankSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GroupHeader28#mmSettlementInformation
 * GroupHeader28.mmSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GroupHeader28#mmInstructingAgent
 * GroupHeader28.mmInstructingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GroupHeader28#mmInstructedAgent
 * GroupHeader28.mmInstructedAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GroupHeader28"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of characteristics shared by all individual transactions included in the message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsGuideline#forGroupHeader28
 * ConstraintGroupReversalAndNumberOfTransactionsGuideline.forGroupHeader28}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSEPAGroupReversalRule#forGroupHeader28
 * ConstraintSEPAGroupReversalRule.forGroupHeader28}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GroupHeader28", propOrder = {"messageIdentification", "creationDateTime", "numberOfTransactions", "groupReversal", "totalReversedInterbankSettlementAmount", "interbankSettlementDate", "settlementInformation",
		"instructingAgent", "instructedAgent"})
public class GroupHeader28 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected Max35Text messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmExecutionIdentification
	 * PaymentIdentification.mmExecutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28 GroupHeader28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point to point reference assigned by the instructing party and sent to the next party in the chain to unambiguously identify the message.\n\nUsage: The instructing party has to make sure that 'MessageIdentification' is unique per instructed party for a pre-agreed period."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader28, Max35Text> mmMessageIdentification = new MMMessageAttribute<GroupHeader28, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.GroupHeader28.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Point to point reference assigned by the instructing party and sent to the next party in the chain to unambiguously identify the message.\n\nUsage: The instructing party has to make sure that 'MessageIdentification' is unique per instructed party for a pre-agreed period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(GroupHeader28 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(GroupHeader28 obj, Max35Text value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCreationDate
	 * PaymentExecution.mmCreationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28 GroupHeader28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a (group of) payment instruction(s) was created by the instructing party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader28, ISODateTime> mmCreationDateTime = new MMMessageAttribute<GroupHeader28, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmCreationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.GroupHeader28.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which a (group of) payment instruction(s) was created by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(GroupHeader28 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(GroupHeader28 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};
	@XmlElement(name = "NbOfTxs", required = true)
	protected Max15NumericText numberOfTransactions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28 GroupHeader28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfTxs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of individual transactions contained in the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader28, Max15NumericText> mmNumberOfTransactions = new MMMessageAttribute<GroupHeader28, Max15NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GroupHeader28.mmObject();
			isDerived = false;
			xmlTag = "NbOfTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactions";
			definition = "Number of individual transactions contained in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Max15NumericText getValue(GroupHeader28 obj) {
			return obj.getNumberOfTransactions();
		}

		@Override
		public void setValue(GroupHeader28 obj, Max15NumericText value) {
			obj.setNumberOfTransactions(value);
		}
	};
	@XmlElement(name = "GrpRvsl", required = true)
	protected TrueFalseIndicator groupReversal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28 GroupHeader28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpRvsl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupReversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the reversal applies to the whole group of transactions or to individual transactions within the original group."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader28, TrueFalseIndicator> mmGroupReversal = new MMMessageAttribute<GroupHeader28, TrueFalseIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GroupHeader28.mmObject();
			isDerived = false;
			xmlTag = "GrpRvsl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupReversal";
			definition = "Indicates whether the reversal applies to the whole group of transactions or to individual transactions within the original group.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(GroupHeader28 obj) {
			return obj.getGroupReversal();
		}

		@Override
		public void setValue(GroupHeader28 obj, TrueFalseIndicator value) {
			obj.setGroupReversal(value);
		}
	};
	@XmlElement(name = "TtlRvsdIntrBkSttlmAmt", required = true)
	protected EuroMax15Amount totalReversedInterbankSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.EuroMax15Amount
	 * EuroMax15Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
	 * CashSettlement.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28 GroupHeader28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlRvsdIntrBkSttlmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReversedInterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total reversed amount of money transferred between the instructing agent and the instructed agent in the reversal message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader28, EuroMax15Amount> mmTotalReversedInterbankSettlementAmount = new MMMessageAttribute<GroupHeader28, EuroMax15Amount>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.GroupHeader28.mmObject();
			isDerived = false;
			xmlTag = "TtlRvsdIntrBkSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReversedInterbankSettlementAmount";
			definition = "Total reversed amount of money transferred between the instructing agent and the instructed agent in the reversal message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EuroMax15Amount.mmObject();
		}

		@Override
		public EuroMax15Amount getValue(GroupHeader28 obj) {
			return obj.getTotalReversedInterbankSettlementAmount();
		}

		@Override
		public void setValue(GroupHeader28 obj, EuroMax15Amount value) {
			obj.setTotalReversedInterbankSettlementAmount(value);
		}
	};
	@XmlElement(name = "IntrBkSttlmDt", required = true)
	protected ISODate interbankSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementDate
	 * CashSettlement.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28 GroupHeader28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttlmDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader28, ISODate> mmInterbankSettlementDate = new MMMessageAttribute<GroupHeader28, ISODate>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.GroupHeader28.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(GroupHeader28 obj) {
			return obj.getInterbankSettlementDate();
		}

		@Override
		public void setValue(GroupHeader28 obj, ISODate value) {
			obj.setInterbankSettlementDate(value);
		}
	};
	@XmlElement(name = "SttlmInf", required = true)
	protected SettlementInformation11 settlementInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation11
	 * SettlementInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
	 * PaymentInstruction.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28 GroupHeader28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the details on how the settlement of the transaction(s) between the instructing agent and the instructed agent is completed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GroupHeader28, SettlementInformation11> mmSettlementInformation = new MMMessageAssociationEnd<GroupHeader28, SettlementInformation11>() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmSettlementInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.GroupHeader28.mmObject();
			isDerived = false;
			xmlTag = "SttlmInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInformation";
			definition = "Specifies the details on how the settlement of the transaction(s) between the instructing agent and the instructed agent is completed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementInformation11.mmObject();
		}

		@Override
		public SettlementInformation11 getValue(GroupHeader28 obj) {
			return obj.getSettlementInformation();
		}

		@Override
		public void setValue(GroupHeader28 obj, SettlementInformation11 value) {
			obj.setSettlementInformation(value);
		}
	};
	@XmlElement(name = "InstgAgt")
	protected FinancialInstitution2 instructingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstitution2
	 * FinancialInstitution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28 GroupHeader28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent that instructs the next party in the chain to carry out the (set of) instruction(s)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GroupHeader28, Optional<FinancialInstitution2>> mmInstructingAgent = new MMMessageAssociationEnd<GroupHeader28, Optional<FinancialInstitution2>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.GroupHeader28.mmObject();
			isDerived = false;
			xmlTag = "InstgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingAgent";
			definition = "Agent that instructs the next party in the chain to carry out the (set of) instruction(s).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstitution2.mmObject();
		}

		@Override
		public Optional<FinancialInstitution2> getValue(GroupHeader28 obj) {
			return obj.getInstructingAgent();
		}

		@Override
		public void setValue(GroupHeader28 obj, Optional<FinancialInstitution2> value) {
			obj.setInstructingAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "InstdAgt")
	protected FinancialInstitution2 instructedAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstitution2
	 * FinancialInstitution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28 GroupHeader28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent that is instructed by the previous party in the chain to carry out the (set of) instruction(s)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GroupHeader28, Optional<FinancialInstitution2>> mmInstructedAgent = new MMMessageAssociationEnd<GroupHeader28, Optional<FinancialInstitution2>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.GroupHeader28.mmObject();
			isDerived = false;
			xmlTag = "InstdAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAgent";
			definition = "Agent that is instructed by the previous party in the chain to carry out the (set of) instruction(s).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstitution2.mmObject();
		}

		@Override
		public Optional<FinancialInstitution2> getValue(GroupHeader28 obj) {
			return obj.getInstructedAgent();
		}

		@Override
		public void setValue(GroupHeader28 obj, Optional<FinancialInstitution2> value) {
			obj.setInstructedAgent(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GroupHeader28.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader28.mmCreationDateTime,
						com.tools20022.repository.msg.GroupHeader28.mmNumberOfTransactions, com.tools20022.repository.msg.GroupHeader28.mmGroupReversal, com.tools20022.repository.msg.GroupHeader28.mmTotalReversedInterbankSettlementAmount,
						com.tools20022.repository.msg.GroupHeader28.mmInterbankSettlementDate, com.tools20022.repository.msg.GroupHeader28.mmSettlementInformation, com.tools20022.repository.msg.GroupHeader28.mmInstructingAgent,
						com.tools20022.repository.msg.GroupHeader28.mmInstructedAgent);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsGuideline.forGroupHeader28,
						com.tools20022.repository.constraints.ConstraintSEPAGroupReversalRule.forGroupHeader28);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "GroupHeader28";
				definition = "Set of characteristics shared by all individual transactions included in the message.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public GroupHeader28 setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public GroupHeader28 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public Max15NumericText getNumberOfTransactions() {
		return numberOfTransactions;
	}

	public GroupHeader28 setNumberOfTransactions(Max15NumericText numberOfTransactions) {
		this.numberOfTransactions = Objects.requireNonNull(numberOfTransactions);
		return this;
	}

	public TrueFalseIndicator getGroupReversal() {
		return groupReversal;
	}

	public GroupHeader28 setGroupReversal(TrueFalseIndicator groupReversal) {
		this.groupReversal = Objects.requireNonNull(groupReversal);
		return this;
	}

	public EuroMax15Amount getTotalReversedInterbankSettlementAmount() {
		return totalReversedInterbankSettlementAmount;
	}

	public GroupHeader28 setTotalReversedInterbankSettlementAmount(EuroMax15Amount totalReversedInterbankSettlementAmount) {
		this.totalReversedInterbankSettlementAmount = Objects.requireNonNull(totalReversedInterbankSettlementAmount);
		return this;
	}

	public ISODate getInterbankSettlementDate() {
		return interbankSettlementDate;
	}

	public GroupHeader28 setInterbankSettlementDate(ISODate interbankSettlementDate) {
		this.interbankSettlementDate = Objects.requireNonNull(interbankSettlementDate);
		return this;
	}

	public SettlementInformation11 getSettlementInformation() {
		return settlementInformation;
	}

	public GroupHeader28 setSettlementInformation(SettlementInformation11 settlementInformation) {
		this.settlementInformation = Objects.requireNonNull(settlementInformation);
		return this;
	}

	public Optional<FinancialInstitution2> getInstructingAgent() {
		return instructingAgent == null ? Optional.empty() : Optional.of(instructingAgent);
	}

	public GroupHeader28 setInstructingAgent(FinancialInstitution2 instructingAgent) {
		this.instructingAgent = instructingAgent;
		return this;
	}

	public Optional<FinancialInstitution2> getInstructedAgent() {
		return instructedAgent == null ? Optional.empty() : Optional.of(instructedAgent);
	}

	public GroupHeader28 setInstructedAgent(FinancialInstitution2 instructedAgent) {
		this.instructedAgent = instructedAgent;
		return this;
	}
}