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
import com.tools20022.repository.area.camt.RequestToModifyPayment;
import com.tools20022.repository.choice.PaymentSchemeChoice;
import com.tools20022.repository.choice.PurposeChoice;
import com.tools20022.repository.choice.RemittanceInformation3Choice;
import com.tools20022.repository.codeset.ChargeBearer1Code;
import com.tools20022.repository.codeset.Instruction1Code;
import com.tools20022.repository.codeset.SWIFTServiceLevel2Code;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification;
import com.tools20022.repository.msg.CashAccount3;
import com.tools20022.repository.msg.InstructionForFinalAgent;
import com.tools20022.repository.msg.PartyIdentification1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Contains the requested modifications.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmRelatedReference
 * RequestedModification.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmBankOperationCode
 * RequestedModification.mmBankOperationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmInstructionCode
 * RequestedModification.mmInstructionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmRequestedExecutionDate
 * RequestedModification.mmRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmValueDate
 * RequestedModification.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmInterbankSettledAmount
 * RequestedModification.mmInterbankSettledAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestedModification#mmDebtor
 * RequestedModification.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmDebtorAccount
 * RequestedModification.mmDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmIntermediarySettlementAgent
 * RequestedModification.mmIntermediarySettlementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmLastSettlementAgent
 * RequestedModification.mmLastSettlementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmPaymentScheme
 * RequestedModification.mmPaymentScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmBeneficiaryInstitutionAccount
 * RequestedModification.mmBeneficiaryInstitutionAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmCreditor
 * RequestedModification.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmCreditorAccount
 * RequestedModification.mmCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmRemittanceInformation
 * RequestedModification.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmPurpose
 * RequestedModification.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmInstructionForFinalAgent
 * RequestedModification.mmInstructionForFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmDetailsOfCharges
 * RequestedModification.mmDetailsOfCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmSenderToReceiverInformation
 * RequestedModification.mmSenderToReceiverInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPayment#mmModification
 * RequestToModifyPayment.mmModification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequestedModification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Contains the requested modifications."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RequestedModification", propOrder = {"relatedReference", "bankOperationCode", "instructionCode", "requestedExecutionDate", "valueDate", "interbankSettledAmount", "debtor", "debtorAccount", "intermediarySettlementAgent",
		"lastSettlementAgent", "paymentScheme", "beneficiaryInstitutionAccount", "creditor", "creditorAccount", "remittanceInformation", "purpose", "instructionForFinalAgent", "detailsOfCharges", "senderToReceiverInformation"})
public class RequestedModification {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RltdRef")
	protected Max35Text relatedReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference relating to a linked payment instruction or agreement which is meaningful to both parties (eg, the content of field 21 in a cover instruction)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestedModification, Optional<Max35Text>> mmRelatedReference = new MMMessageAttribute<RequestedModification, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference relating to a linked payment instruction or agreement which is meaningful to both parties (eg, the content of field 21 in a cover instruction).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(RequestedModification obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(RequestedModification obj, Optional<Max35Text> value) {
			obj.setRelatedReference(value.orElse(null));
		}
	};
	@XmlElement(name = "BkOprCd")
	protected SWIFTServiceLevel2Code bankOperationCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SWIFTServiceLevel2Code
	 * SWIFTServiceLevel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel#mmOther
	 * ServiceLevel.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkOprCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankOperationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SWIFT defined service level applies to the payment instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestedModification, Optional<SWIFTServiceLevel2Code>> mmBankOperationCode = new MMMessageAttribute<RequestedModification, Optional<SWIFTServiceLevel2Code>>() {
		{
			businessElementTrace_lazy = () -> ServiceLevel.mmOther;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "BkOprCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankOperationCode";
			definition = "SWIFT defined service level applies to the payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SWIFTServiceLevel2Code.mmObject();
		}

		@Override
		public Optional<SWIFTServiceLevel2Code> getValue(RequestedModification obj) {
			return obj.getBankOperationCode();
		}

		@Override
		public void setValue(RequestedModification obj, Optional<SWIFTServiceLevel2Code> value) {
			obj.setBankOperationCode(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrCd")
	protected Instruction1Code instructionCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Instruction1Code
	 * Instruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmInstructionForNextAgent
	 * PaymentInstruction.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction. The instruction can relate to a level of service between the bank and the customer, or give instructions to and for specific parties in the payment chain."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestedModification, Optional<Instruction1Code>> mmInstructionCode = new MMMessageAttribute<RequestedModification, Optional<Instruction1Code>>() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmInstructionForNextAgent;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "InstrCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCode";
			definition = "Further information related to the processing of the payment instruction. The instruction can relate to a level of service between the bank and the customer, or give instructions to and for specific parties in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Instruction1Code.mmObject();
		}

		@Override
		public Optional<Instruction1Code> getValue(RequestedModification obj) {
			return obj.getInstructionCode();
		}

		@Override
		public void setValue(RequestedModification obj, Optional<Instruction1Code> value) {
			obj.setInstructionCode(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdExctnDt")
	protected ISODate requestedExecutionDate;
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
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdExctnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time the debtor requests the clearing agent to process the payment instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestedModification, Optional<ISODate>> mmRequestedExecutionDate = new MMMessageAttribute<RequestedModification, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "ReqdExctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date and time the debtor requests the clearing agent to process the payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(RequestedModification obj) {
			return obj.getRequestedExecutionDate();
		}

		@Override
		public void setValue(RequestedModification obj, Optional<ISODate> value) {
			obj.setRequestedExecutionDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ValDt")
	protected ISODate valueDate;
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmValueDate
	 * Payment.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
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
	public static final MMMessageAttribute<RequestedModification, Optional<ISODate>> mmValueDate = new MMMessageAttribute<RequestedModification, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(RequestedModification obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(RequestedModification obj, Optional<ISODate> value) {
			obj.setValueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrBkSttldAmt")
	protected CurrencyAndAmount interbankSettledAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
	 * CashSettlement.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttldAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money moved between the instructing agent and the instructed agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestedModification, Optional<CurrencyAndAmount>> mmInterbankSettledAmount = new MMMessageAttribute<RequestedModification, Optional<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettledAmount";
			definition = "Amount of money moved between the instructing agent and the instructed agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<CurrencyAndAmount> getValue(RequestedModification obj) {
			return obj.getInterbankSettledAmount();
		}

		@Override
		public void setValue(RequestedModification obj, Optional<CurrencyAndAmount> value) {
			obj.setInterbankSettledAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "Dbtr")
	protected PartyIdentification1 debtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification1
	 * PartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dbtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debtor or Ordering customer of the payment instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestedModification, Optional<PartyIdentification1>> mmDebtor = new MMMessageAssociationEnd<RequestedModification, Optional<PartyIdentification1>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Debtor or Ordering customer of the payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification1.mmObject();
		}

		@Override
		public Optional<PartyIdentification1> getValue(RequestedModification obj) {
			return obj.getDebtor();
		}

		@Override
		public void setValue(RequestedModification obj, Optional<PartyIdentification1> value) {
			obj.setDebtor(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrAcct")
	protected CashAccount3 debtorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount3
	 * CashAccount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a cash entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestedModification, Optional<CashAccount3>> mmDebtorAccount = new MMMessageAssociationEnd<RequestedModification, Optional<CashAccount3>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Account to or from which a cash entry is made.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount3.mmObject();
		}

		@Override
		public Optional<CashAccount3> getValue(RequestedModification obj) {
			return obj.getDebtorAccount();
		}

		@Override
		public void setValue(RequestedModification obj, Optional<CashAccount3> value) {
			obj.setDebtorAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmySttlmAgt")
	protected BranchAndFinancialInstitutionIdentification intermediarySettlementAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification
	 * BranchAndFinancialInstitutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmySttlmAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediarySettlementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that executes a cash transfer received via a clearing agent or on request of an agreement party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestedModification, Optional<BranchAndFinancialInstitutionIdentification>> mmIntermediarySettlementAgent = new MMMessageAssociationEnd<RequestedModification, Optional<BranchAndFinancialInstitutionIdentification>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "IntrmySttlmAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediarySettlementAgent";
			definition = "Party that executes a cash transfer received via a clearing agent or on request of an agreement party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification> getValue(RequestedModification obj) {
			return obj.getIntermediarySettlementAgent();
		}

		@Override
		public void setValue(RequestedModification obj, Optional<BranchAndFinancialInstitutionIdentification> value) {
			obj.setIntermediarySettlementAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "LastSttlmAgt")
	protected BranchAndFinancialInstitutionIdentification lastSettlementAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification
	 * BranchAndFinancialInstitutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastSttlmAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastSettlementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that executes a cash transfer received via a clearing agent or on request of an agreement party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestedModification, Optional<BranchAndFinancialInstitutionIdentification>> mmLastSettlementAgent = new MMMessageAssociationEnd<RequestedModification, Optional<BranchAndFinancialInstitutionIdentification>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "LastSttlmAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastSettlementAgent";
			definition = "Party that executes a cash transfer received via a clearing agent or on request of an agreement party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification> getValue(RequestedModification obj) {
			return obj.getLastSettlementAgent();
		}

		@Override
		public void setValue(RequestedModification obj, Optional<BranchAndFinancialInstitutionIdentification> value) {
			obj.setLastSettlementAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtSchme")
	protected PaymentSchemeChoice paymentScheme;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PaymentSchemeChoice
	 * PaymentSchemeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem
	 * CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtSchme"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specification of a pre-agreed offering between clearing agents, or the channel through which the payment instruction is to be processed. This payment scheme can point to a specific rulebook governing the rules of clearing and settlement between two parties."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestedModification, Optional<PaymentSchemeChoice>> mmPaymentScheme = new MMMessageAssociationEnd<RequestedModification, Optional<PaymentSchemeChoice>>() {
		{
			businessComponentTrace_lazy = () -> CashClearingSystem.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "PmtSchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentScheme";
			definition = "Specification of a pre-agreed offering between clearing agents, or the channel through which the payment instruction is to be processed. This payment scheme can point to a specific rulebook governing the rules of clearing and settlement between two parties.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentSchemeChoice.mmObject();
		}

		@Override
		public Optional<PaymentSchemeChoice> getValue(RequestedModification obj) {
			return obj.getPaymentScheme();
		}

		@Override
		public void setValue(RequestedModification obj, Optional<PaymentSchemeChoice> value) {
			obj.setPaymentScheme(value.orElse(null));
		}
	};
	@XmlElement(name = "BnfcryInstnAcct")
	protected CashAccount3 beneficiaryInstitutionAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount3
	 * CashAccount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryInstnAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryInstitutionAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a cash entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestedModification, Optional<CashAccount3>> mmBeneficiaryInstitutionAccount = new MMMessageAssociationEnd<RequestedModification, Optional<CashAccount3>>() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "BnfcryInstnAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryInstitutionAccount";
			definition = "Account to or from which a cash entry is made.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount3.mmObject();
		}

		@Override
		public Optional<CashAccount3> getValue(RequestedModification obj) {
			return obj.getBeneficiaryInstitutionAccount();
		}

		@Override
		public void setValue(RequestedModification obj, Optional<CashAccount3> value) {
			obj.setBeneficiaryInstitutionAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "Cdtr")
	protected PartyIdentification1 creditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification1
	 * PartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity involved in an activity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestedModification, Optional<PartyIdentification1>> mmCreditor = new MMMessageAssociationEnd<RequestedModification, Optional<PartyIdentification1>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Entity involved in an activity.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification1.mmObject();
		}

		@Override
		public Optional<PartyIdentification1> getValue(RequestedModification obj) {
			return obj.getCreditor();
		}

		@Override
		public void setValue(RequestedModification obj, Optional<PartyIdentification1> value) {
			obj.setCreditor(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrAcct")
	protected CashAccount3 creditorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount3
	 * CashAccount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a cash entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestedModification, Optional<CashAccount3>> mmCreditorAccount = new MMMessageAssociationEnd<RequestedModification, Optional<CashAccount3>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "CdtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccount";
			definition = "Account to or from which a cash entry is made.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount3.mmObject();
		}

		@Override
		public Optional<CashAccount3> getValue(RequestedModification obj) {
			return obj.getCreditorAccount();
		}

		@Override
		public void setValue(RequestedModification obj, Optional<CashAccount3> value) {
			obj.setCreditorAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "RmtInf")
	protected RemittanceInformation3Choice remittanceInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RemittanceInformation3Choice
	 * RemittanceInformation3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Structured information that enables the matching, ie, reconciliation, of a payment with the items that the payment is intended to settle, such as commercial invoices in an account receivable system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestedModification, Optional<RemittanceInformation3Choice>> mmRemittanceInformation = new MMMessageAssociationEnd<RequestedModification, Optional<RemittanceInformation3Choice>>() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "RmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceInformation";
			definition = "Structured information that enables the matching, ie, reconciliation, of a payment with the items that the payment is intended to settle, such as commercial invoices in an account receivable system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RemittanceInformation3Choice.mmObject();
		}

		@Override
		public Optional<RemittanceInformation3Choice> getValue(RequestedModification obj) {
			return obj.getRemittanceInformation();
		}

		@Override
		public void setValue(RequestedModification obj, Optional<RemittanceInformation3Choice> value) {
			obj.setRemittanceInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "Purp")
	protected PurposeChoice purpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PurposeChoice
	 * PurposeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPurpose
	 * PaymentObligation.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying reason for the payment transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestedModification, Optional<PurposeChoice>> mmPurpose = new MMMessageAssociationEnd<RequestedModification, Optional<PurposeChoice>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Underlying reason for the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PurposeChoice.mmObject();
		}

		@Override
		public Optional<PurposeChoice> getValue(RequestedModification obj) {
			return obj.getPurpose();
		}

		@Override
		public void setValue(RequestedModification obj, Optional<PurposeChoice> value) {
			obj.setPurpose(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrForFnlAgt")
	protected InstructionForFinalAgent instructionForFinalAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InstructionForFinalAgent
	 * InstructionForFinalAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructionForCreditorAgent
	 * Payment.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrForFnlAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForFinalAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction. The instruction can relate to a level of service between the bank and the customer, or give instructions to and for specific parties in the payment chain."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestedModification, Optional<InstructionForFinalAgent>> mmInstructionForFinalAgent = new MMMessageAssociationEnd<RequestedModification, Optional<InstructionForFinalAgent>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructionForCreditorAgent;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "InstrForFnlAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionForFinalAgent";
			definition = "Further information related to the processing of the payment instruction. The instruction can relate to a level of service between the bank and the customer, or give instructions to and for specific parties in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InstructionForFinalAgent.mmObject();
		}

		@Override
		public Optional<InstructionForFinalAgent> getValue(RequestedModification obj) {
			return obj.getInstructionForFinalAgent();
		}

		@Override
		public void setValue(RequestedModification obj, Optional<InstructionForFinalAgent> value) {
			obj.setInstructionForFinalAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "DtlsOfChrgs")
	protected ChargeBearer1Code detailsOfCharges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearer1Code
	 * ChargeBearer1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtlsOfChrgs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailsOfCharges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party(ies) liable for a charge associated with the transfer of cash."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestedModification, Optional<ChargeBearer1Code>> mmDetailsOfCharges = new MMMessageAttribute<RequestedModification, Optional<ChargeBearer1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "DtlsOfChrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailsOfCharges";
			definition = "Party(ies) liable for a charge associated with the transfer of cash.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ChargeBearer1Code.mmObject();
		}

		@Override
		public Optional<ChargeBearer1Code> getValue(RequestedModification obj) {
			return obj.getDetailsOfCharges();
		}

		@Override
		public void setValue(RequestedModification obj, Optional<ChargeBearer1Code> value) {
			obj.setDetailsOfCharges(value.orElse(null));
		}
	};
	@XmlElement(name = "SndrToRcvrInf")
	protected List<Max35Text> senderToReceiverInformation;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndrToRcvrInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderToReceiverInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unformatted information from the sender to the receiver."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestedModification, List<Max35Text>> mmSenderToReceiverInformation = new MMMessageAttribute<RequestedModification, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "SndrToRcvrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderToReceiverInformation";
			definition = "Unformatted information from the sender to the receiver.";
			maxOccurs = 6;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(RequestedModification obj) {
			return obj.getSenderToReceiverInformation();
		}

		@Override
		public void setValue(RequestedModification obj, List<Max35Text> value) {
			obj.setSenderToReceiverInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestedModification.mmRelatedReference, com.tools20022.repository.msg.RequestedModification.mmBankOperationCode,
						com.tools20022.repository.msg.RequestedModification.mmInstructionCode, com.tools20022.repository.msg.RequestedModification.mmRequestedExecutionDate, com.tools20022.repository.msg.RequestedModification.mmValueDate,
						com.tools20022.repository.msg.RequestedModification.mmInterbankSettledAmount, com.tools20022.repository.msg.RequestedModification.mmDebtor, com.tools20022.repository.msg.RequestedModification.mmDebtorAccount,
						com.tools20022.repository.msg.RequestedModification.mmIntermediarySettlementAgent, com.tools20022.repository.msg.RequestedModification.mmLastSettlementAgent,
						com.tools20022.repository.msg.RequestedModification.mmPaymentScheme, com.tools20022.repository.msg.RequestedModification.mmBeneficiaryInstitutionAccount,
						com.tools20022.repository.msg.RequestedModification.mmCreditor, com.tools20022.repository.msg.RequestedModification.mmCreditorAccount, com.tools20022.repository.msg.RequestedModification.mmRemittanceInformation,
						com.tools20022.repository.msg.RequestedModification.mmPurpose, com.tools20022.repository.msg.RequestedModification.mmInstructionForFinalAgent, com.tools20022.repository.msg.RequestedModification.mmDetailsOfCharges,
						com.tools20022.repository.msg.RequestedModification.mmSenderToReceiverInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(RequestToModifyPayment.mmModification);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequestedModification";
				definition = "Contains the requested modifications.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public RequestedModification setRelatedReference(Max35Text relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public Optional<SWIFTServiceLevel2Code> getBankOperationCode() {
		return bankOperationCode == null ? Optional.empty() : Optional.of(bankOperationCode);
	}

	public RequestedModification setBankOperationCode(SWIFTServiceLevel2Code bankOperationCode) {
		this.bankOperationCode = bankOperationCode;
		return this;
	}

	public Optional<Instruction1Code> getInstructionCode() {
		return instructionCode == null ? Optional.empty() : Optional.of(instructionCode);
	}

	public RequestedModification setInstructionCode(Instruction1Code instructionCode) {
		this.instructionCode = instructionCode;
		return this;
	}

	public Optional<ISODate> getRequestedExecutionDate() {
		return requestedExecutionDate == null ? Optional.empty() : Optional.of(requestedExecutionDate);
	}

	public RequestedModification setRequestedExecutionDate(ISODate requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
		return this;
	}

	public Optional<ISODate> getValueDate() {
		return valueDate == null ? Optional.empty() : Optional.of(valueDate);
	}

	public RequestedModification setValueDate(ISODate valueDate) {
		this.valueDate = valueDate;
		return this;
	}

	public Optional<CurrencyAndAmount> getInterbankSettledAmount() {
		return interbankSettledAmount == null ? Optional.empty() : Optional.of(interbankSettledAmount);
	}

	public RequestedModification setInterbankSettledAmount(CurrencyAndAmount interbankSettledAmount) {
		this.interbankSettledAmount = interbankSettledAmount;
		return this;
	}

	public Optional<PartyIdentification1> getDebtor() {
		return debtor == null ? Optional.empty() : Optional.of(debtor);
	}

	public RequestedModification setDebtor(PartyIdentification1 debtor) {
		this.debtor = debtor;
		return this;
	}

	public Optional<CashAccount3> getDebtorAccount() {
		return debtorAccount == null ? Optional.empty() : Optional.of(debtorAccount);
	}

	public RequestedModification setDebtorAccount(CashAccount3 debtorAccount) {
		this.debtorAccount = debtorAccount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification> getIntermediarySettlementAgent() {
		return intermediarySettlementAgent == null ? Optional.empty() : Optional.of(intermediarySettlementAgent);
	}

	public RequestedModification setIntermediarySettlementAgent(BranchAndFinancialInstitutionIdentification intermediarySettlementAgent) {
		this.intermediarySettlementAgent = intermediarySettlementAgent;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification> getLastSettlementAgent() {
		return lastSettlementAgent == null ? Optional.empty() : Optional.of(lastSettlementAgent);
	}

	public RequestedModification setLastSettlementAgent(BranchAndFinancialInstitutionIdentification lastSettlementAgent) {
		this.lastSettlementAgent = lastSettlementAgent;
		return this;
	}

	public Optional<PaymentSchemeChoice> getPaymentScheme() {
		return paymentScheme == null ? Optional.empty() : Optional.of(paymentScheme);
	}

	public RequestedModification setPaymentScheme(PaymentSchemeChoice paymentScheme) {
		this.paymentScheme = paymentScheme;
		return this;
	}

	public Optional<CashAccount3> getBeneficiaryInstitutionAccount() {
		return beneficiaryInstitutionAccount == null ? Optional.empty() : Optional.of(beneficiaryInstitutionAccount);
	}

	public RequestedModification setBeneficiaryInstitutionAccount(CashAccount3 beneficiaryInstitutionAccount) {
		this.beneficiaryInstitutionAccount = beneficiaryInstitutionAccount;
		return this;
	}

	public Optional<PartyIdentification1> getCreditor() {
		return creditor == null ? Optional.empty() : Optional.of(creditor);
	}

	public RequestedModification setCreditor(PartyIdentification1 creditor) {
		this.creditor = creditor;
		return this;
	}

	public Optional<CashAccount3> getCreditorAccount() {
		return creditorAccount == null ? Optional.empty() : Optional.of(creditorAccount);
	}

	public RequestedModification setCreditorAccount(CashAccount3 creditorAccount) {
		this.creditorAccount = creditorAccount;
		return this;
	}

	public Optional<RemittanceInformation3Choice> getRemittanceInformation() {
		return remittanceInformation == null ? Optional.empty() : Optional.of(remittanceInformation);
	}

	public RequestedModification setRemittanceInformation(RemittanceInformation3Choice remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
		return this;
	}

	public Optional<PurposeChoice> getPurpose() {
		return purpose == null ? Optional.empty() : Optional.of(purpose);
	}

	public RequestedModification setPurpose(PurposeChoice purpose) {
		this.purpose = purpose;
		return this;
	}

	public Optional<InstructionForFinalAgent> getInstructionForFinalAgent() {
		return instructionForFinalAgent == null ? Optional.empty() : Optional.of(instructionForFinalAgent);
	}

	public RequestedModification setInstructionForFinalAgent(InstructionForFinalAgent instructionForFinalAgent) {
		this.instructionForFinalAgent = instructionForFinalAgent;
		return this;
	}

	public Optional<ChargeBearer1Code> getDetailsOfCharges() {
		return detailsOfCharges == null ? Optional.empty() : Optional.of(detailsOfCharges);
	}

	public RequestedModification setDetailsOfCharges(ChargeBearer1Code detailsOfCharges) {
		this.detailsOfCharges = detailsOfCharges;
		return this;
	}

	public List<Max35Text> getSenderToReceiverInformation() {
		return senderToReceiverInformation == null ? senderToReceiverInformation = new ArrayList<>() : senderToReceiverInformation;
	}

	public RequestedModification setSenderToReceiverInformation(List<Max35Text> senderToReceiverInformation) {
		this.senderToReceiverInformation = Objects.requireNonNull(senderToReceiverInformation);
		return this;
	}
}