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
import com.tools20022.repository.codeset.ChargeBearerType2Code;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.EuroMax9Amount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ChargesInformation4;
import com.tools20022.repository.msg.FinancialInstitution2;
import com.tools20022.repository.msg.OriginalTransactionReference9;
import com.tools20022.repository.msg.ReversalReasonInformation5;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reference and status information concerning the original transactions,
 * included in the original instruction, to which the reversal message applies.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmReversalIdentification
 * PaymentTransactionInformation24.mmReversalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmOriginalPaymentInformationIdentification
 * PaymentTransactionInformation24.mmOriginalPaymentInformationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmOriginalInstructionIdentification
 * PaymentTransactionInformation24.mmOriginalInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmOriginalEndToEndIdentification
 * PaymentTransactionInformation24.mmOriginalEndToEndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmOriginalTransactionIdentification
 * PaymentTransactionInformation24.mmOriginalTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmOriginalInterbankSettlementAmount
 * PaymentTransactionInformation24.mmOriginalInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmReversedInterbankSettlementAmount
 * PaymentTransactionInformation24.mmReversedInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmReversedInstructedAmount
 * PaymentTransactionInformation24.mmReversedInstructedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmExchangeRate
 * PaymentTransactionInformation24.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmCompensationAmount
 * PaymentTransactionInformation24.mmCompensationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmChargeBearer
 * PaymentTransactionInformation24.mmChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmChargesInformation
 * PaymentTransactionInformation24.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmInstructingAgent
 * PaymentTransactionInformation24.mmInstructingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmInstructedAgent
 * PaymentTransactionInformation24.mmInstructedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmReversalReasonInformation
 * PaymentTransactionInformation24.mmReversalReasonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmOriginalTransactionReference
 * PaymentTransactionInformation24.mmOriginalTransactionReference}</li>
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
 * "PaymentTransactionInformation24"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reference and status information concerning the original transactions, included in the original instruction, to which the reversal message applies."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate1Rule#forPaymentTransactionInformation24
 * ConstraintReversedInstructedAmountAndExchangeRate1Rule.
 * forPaymentTransactionInformation24}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate2Rule#forPaymentTransactionInformation24
 * ConstraintReversedInstructedAmountAndExchangeRate2Rule.
 * forPaymentTransactionInformation24}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChargesInformationAndReversedInstructedAmountRule#forPaymentTransactionInformation24
 * ConstraintChargesInformationAndReversedInstructedAmountRule.
 * forPaymentTransactionInformation24}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSEPAOriginalAndReversedInterbankSettlementAmountRule#forPaymentTransactionInformation24
 * ConstraintSEPAOriginalAndReversedInterbankSettlementAmountRule.
 * forPaymentTransactionInformation24}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentTransactionInformation24", propOrder = {"reversalIdentification", "originalPaymentInformationIdentification", "originalInstructionIdentification", "originalEndToEndIdentification",
		"originalTransactionIdentification", "originalInterbankSettlementAmount", "reversedInterbankSettlementAmount", "reversedInstructedAmount", "exchangeRate", "compensationAmount", "chargeBearer", "chargesInformation",
		"instructingAgent", "instructedAgent", "reversalReasonInformation", "originalTransactionReference"})
public class PaymentTransactionInformation24 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RvslId")
	protected Max35Text reversalIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24
	 * PaymentTransactionInformation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the reversed transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTransactionInformation24, Optional<Max35Text>> mmReversalIdentification = new MMMessageAttribute<PaymentTransactionInformation24, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransactionInformation24.mmObject();
			isDerived = false;
			xmlTag = "RvslId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalIdentification";
			definition = "Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the reversed transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentTransactionInformation24 obj) {
			return obj.getReversalIdentification();
		}

		@Override
		public void setValue(PaymentTransactionInformation24 obj, Optional<Max35Text> value) {
			obj.setReversalIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlPmtInfId")
	protected Max35Text originalPaymentInformationIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24
	 * PaymentTransactionInformation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPmtInfId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPaymentInformationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of the original payment information block as assigned by the original sending party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTransactionInformation24, Optional<Max35Text>> mmOriginalPaymentInformationIdentification = new MMMessageAttribute<PaymentTransactionInformation24, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransactionInformation24.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPmtInfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationIdentification";
			definition = "Unique and unambiguous identifier of the original payment information block as assigned by the original sending party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentTransactionInformation24 obj) {
			return obj.getOriginalPaymentInformationIdentification();
		}

		@Override
		public void setValue(PaymentTransactionInformation24 obj, Optional<Max35Text> value) {
			obj.setOriginalPaymentInformationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlInstrId")
	protected Max35Text originalInstructionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmInstructionIdentification
	 * PaymentIdentification.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24
	 * PaymentTransactionInformation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlInstrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original unique instruction identification as assigned by an instructing party for an instructed party to unambiguously identify the original instruction.\n\nUsage: the original instruction identification is the original point to point reference used between the instructing party and the instructed party to refer to the original instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTransactionInformation24, Optional<Max35Text>> mmOriginalInstructionIdentification = new MMMessageAttribute<PaymentTransactionInformation24, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmInstructionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransactionInformation24.mmObject();
			isDerived = false;
			xmlTag = "OrgnlInstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInstructionIdentification";
			definition = "Original unique instruction identification as assigned by an instructing party for an instructed party to unambiguously identify the original instruction.\n\nUsage: the original instruction identification is the original point to point reference used between the instructing party and the instructed party to refer to the original instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentTransactionInformation24 obj) {
			return obj.getOriginalInstructionIdentification();
		}

		@Override
		public void setValue(PaymentTransactionInformation24 obj, Optional<Max35Text> value) {
			obj.setOriginalInstructionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlEndToEndId")
	protected Max35Text originalEndToEndIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmEndToEndIdentification
	 * PaymentIdentification.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24
	 * PaymentTransactionInformation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlEndToEndId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalEndToEndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original unique identification assigned by the initiating party to unambiguously identify the original transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTransactionInformation24, Optional<Max35Text>> mmOriginalEndToEndIdentification = new MMMessageAttribute<PaymentTransactionInformation24, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransactionInformation24.mmObject();
			isDerived = false;
			xmlTag = "OrgnlEndToEndId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalEndToEndIdentification";
			definition = "Original unique identification assigned by the initiating party to unambiguously identify the original transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentTransactionInformation24 obj) {
			return obj.getOriginalEndToEndIdentification();
		}

		@Override
		public void setValue(PaymentTransactionInformation24 obj, Optional<Max35Text> value) {
			obj.setOriginalEndToEndIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlTxId")
	protected Max35Text originalTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmTransactionIdentification
	 * PaymentIdentification.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24
	 * PaymentTransactionInformation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlTxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original identification of a transaction, as assigned by the first instructing agent and passed on, unchanged, throughout the entire interbank chain."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTransactionInformation24, Optional<Max35Text>> mmOriginalTransactionIdentification = new MMMessageAttribute<PaymentTransactionInformation24, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransactionInformation24.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransactionIdentification";
			definition = "Original identification of a transaction, as assigned by the first instructing agent and passed on, unchanged, throughout the entire interbank chain.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentTransactionInformation24 obj) {
			return obj.getOriginalTransactionIdentification();
		}

		@Override
		public void setValue(PaymentTransactionInformation24 obj, Optional<Max35Text> value) {
			obj.setOriginalTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlIntrBkSttlmAmt")
	protected EuroMax9Amount originalInterbankSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.EuroMax9Amount
	 * EuroMax9Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
	 * CashSettlement.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24
	 * PaymentTransactionInformation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlIntrBkSttlmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money transferred between the instructing agent and the instructed agent in the original transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTransactionInformation24, Optional<EuroMax9Amount>> mmOriginalInterbankSettlementAmount = new MMMessageAttribute<PaymentTransactionInformation24, Optional<EuroMax9Amount>>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransactionInformation24.mmObject();
			isDerived = false;
			xmlTag = "OrgnlIntrBkSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInterbankSettlementAmount";
			definition = "Amount of money transferred between the instructing agent and the instructed agent in the original transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EuroMax9Amount.mmObject();
		}

		@Override
		public Optional<EuroMax9Amount> getValue(PaymentTransactionInformation24 obj) {
			return obj.getOriginalInterbankSettlementAmount();
		}

		@Override
		public void setValue(PaymentTransactionInformation24 obj, Optional<EuroMax9Amount> value) {
			obj.setOriginalInterbankSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "RvsdIntrBkSttlmAmt", required = true)
	protected EuroMax9Amount reversedInterbankSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.EuroMax9Amount
	 * EuroMax9Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
	 * CashSettlement.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24
	 * PaymentTransactionInformation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvsdIntrBkSttlmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversedInterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money moved between the instructing agent and the instructed agent in the reversed transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTransactionInformation24, EuroMax9Amount> mmReversedInterbankSettlementAmount = new MMMessageAttribute<PaymentTransactionInformation24, EuroMax9Amount>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransactionInformation24.mmObject();
			isDerived = false;
			xmlTag = "RvsdIntrBkSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversedInterbankSettlementAmount";
			definition = "Amount of money moved between the instructing agent and the instructed agent in the reversed transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EuroMax9Amount.mmObject();
		}

		@Override
		public EuroMax9Amount getValue(PaymentTransactionInformation24 obj) {
			return obj.getReversedInterbankSettlementAmount();
		}

		@Override
		public void setValue(PaymentTransactionInformation24 obj, EuroMax9Amount value) {
			obj.setReversedInterbankSettlementAmount(value);
		}
	};
	@XmlElement(name = "RvsdInstdAmt")
	protected CurrencyAndAmount reversedInstructedAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24
	 * PaymentTransactionInformation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvsdInstdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversedInstructedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be moved between the debtor and the creditor, before deduction of charges, in the reversed transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTransactionInformation24, Optional<CurrencyAndAmount>> mmReversedInstructedAmount = new MMMessageAttribute<PaymentTransactionInformation24, Optional<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransactionInformation24.mmObject();
			isDerived = false;
			xmlTag = "RvsdInstdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversedInstructedAmount";
			definition = "Amount of money to be moved between the debtor and the creditor, before deduction of charges, in the reversed transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<CurrencyAndAmount> getValue(PaymentTransactionInformation24 obj) {
			return obj.getReversedInstructedAmount();
		}

		@Override
		public void setValue(PaymentTransactionInformation24 obj, Optional<CurrencyAndAmount> value) {
			obj.setReversedInstructedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "XchgRate")
	protected BaseOneRate exchangeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmExchangeRate
	 * CurrencyExchange.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24
	 * PaymentTransactionInformation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The factor used for conversion of an amount from one currency into another. This reflects the price at which one currency was bought with another currency."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTransactionInformation24, Optional<BaseOneRate>> mmExchangeRate = new MMMessageAttribute<PaymentTransactionInformation24, Optional<BaseOneRate>>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransactionInformation24.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "The factor used for conversion of an amount from one currency into another. This reflects the price at which one currency was bought with another currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public Optional<BaseOneRate> getValue(PaymentTransactionInformation24 obj) {
			return obj.getExchangeRate();
		}

		@Override
		public void setValue(PaymentTransactionInformation24 obj, Optional<BaseOneRate> value) {
			obj.setExchangeRate(value.orElse(null));
		}
	};
	@XmlElement(name = "CompstnAmt")
	protected EuroMax9Amount compensationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.EuroMax9Amount
	 * EuroMax9Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmClearingChargeAmount
	 * PaymentInstruction.mmClearingChargeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24
	 * PaymentTransactionInformation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CompstnAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompensationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money asked or paid as compensation for the processing of the instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTransactionInformation24, Optional<EuroMax9Amount>> mmCompensationAmount = new MMMessageAttribute<PaymentTransactionInformation24, Optional<EuroMax9Amount>>() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmClearingChargeAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransactionInformation24.mmObject();
			isDerived = false;
			xmlTag = "CompstnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompensationAmount";
			definition = "Amount of money asked or paid as compensation for the processing of the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EuroMax9Amount.mmObject();
		}

		@Override
		public Optional<EuroMax9Amount> getValue(PaymentTransactionInformation24 obj) {
			return obj.getCompensationAmount();
		}

		@Override
		public void setValue(PaymentTransactionInformation24 obj, Optional<EuroMax9Amount> value) {
			obj.setCompensationAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgBr")
	protected ChargeBearerType2Code chargeBearer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType2Code
	 * ChargeBearerType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmBearerType
	 * Charges.mmBearerType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24
	 * PaymentTransactionInformation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgBr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the creditor and/or debtor will bear the charges associated with the processing of the payment transaction.\n\nUsage: The ChargeBearer applies to the reversal message, not to the original instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTransactionInformation24, Optional<ChargeBearerType2Code>> mmChargeBearer = new MMMessageAttribute<PaymentTransactionInformation24, Optional<ChargeBearerType2Code>>() {
		{
			businessElementTrace_lazy = () -> Charges.mmBearerType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransactionInformation24.mmObject();
			isDerived = false;
			xmlTag = "ChrgBr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearer";
			definition = "Specifies if the creditor and/or debtor will bear the charges associated with the processing of the payment transaction.\n\nUsage: The ChargeBearer applies to the reversal message, not to the original instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ChargeBearerType2Code.mmObject();
		}

		@Override
		public Optional<ChargeBearerType2Code> getValue(PaymentTransactionInformation24 obj) {
			return obj.getChargeBearer();
		}

		@Override
		public void setValue(PaymentTransactionInformation24 obj, Optional<ChargeBearerType2Code> value) {
			obj.setChargeBearer(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgsInf")
	protected List<ChargesInformation4> chargesInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ChargesInformation4
	 * ChargesInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24
	 * PaymentTransactionInformation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction charges to be paid by the charge bearer for the reversal transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentTransactionInformation24, List<ChargesInformation4>> mmChargesInformation = new MMMessageAssociationEnd<PaymentTransactionInformation24, List<ChargesInformation4>>() {
		{
			businessComponentTrace_lazy = () -> Charges.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransactionInformation24.mmObject();
			isDerived = false;
			xmlTag = "ChrgsInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesInformation";
			definition = "Transaction charges to be paid by the charge bearer for the reversal transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ChargesInformation4.mmObject();
		}

		@Override
		public List<ChargesInformation4> getValue(PaymentTransactionInformation24 obj) {
			return obj.getChargesInformation();
		}

		@Override
		public void setValue(PaymentTransactionInformation24 obj, List<ChargesInformation4> value) {
			obj.setChargesInformation(value);
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24
	 * PaymentTransactionInformation24}</li>
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
	public static final MMMessageAssociationEnd<PaymentTransactionInformation24, Optional<FinancialInstitution2>> mmInstructingAgent = new MMMessageAssociationEnd<PaymentTransactionInformation24, Optional<FinancialInstitution2>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransactionInformation24.mmObject();
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
		public Optional<FinancialInstitution2> getValue(PaymentTransactionInformation24 obj) {
			return obj.getInstructingAgent();
		}

		@Override
		public void setValue(PaymentTransactionInformation24 obj, Optional<FinancialInstitution2> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24
	 * PaymentTransactionInformation24}</li>
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
	public static final MMMessageAssociationEnd<PaymentTransactionInformation24, Optional<FinancialInstitution2>> mmInstructedAgent = new MMMessageAssociationEnd<PaymentTransactionInformation24, Optional<FinancialInstitution2>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransactionInformation24.mmObject();
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
		public Optional<FinancialInstitution2> getValue(PaymentTransactionInformation24 obj) {
			return obj.getInstructedAgent();
		}

		@Override
		public void setValue(PaymentTransactionInformation24 obj, Optional<FinancialInstitution2> value) {
			obj.setInstructedAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "RvslRsnInf")
	protected List<ReversalReasonInformation5> reversalReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReversalReasonInformation5
	 * ReversalReasonInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
	 * Payment.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24
	 * PaymentTransactionInformation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslRsnInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed information on the reversal reason."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentTransactionInformation24, List<ReversalReasonInformation5>> mmReversalReasonInformation = new MMMessageAssociationEnd<PaymentTransactionInformation24, List<ReversalReasonInformation5>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransactionInformation24.mmObject();
			isDerived = false;
			xmlTag = "RvslRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalReasonInformation";
			definition = "Detailed information on the reversal reason.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReversalReasonInformation5.mmObject();
		}

		@Override
		public List<ReversalReasonInformation5> getValue(PaymentTransactionInformation24 obj) {
			return obj.getReversalReasonInformation();
		}

		@Override
		public void setValue(PaymentTransactionInformation24 obj, List<ReversalReasonInformation5> value) {
			obj.setReversalReasonInformation(value);
		}
	};
	@XmlElement(name = "OrgnlTxRef", required = true)
	protected OriginalTransactionReference9 originalTransactionReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9
	 * OriginalTransactionReference9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24
	 * PaymentTransactionInformation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlTxRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of key elements of the original transaction being referred to."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentTransactionInformation24, OriginalTransactionReference9> mmOriginalTransactionReference = new MMMessageAssociationEnd<PaymentTransactionInformation24, OriginalTransactionReference9>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransactionInformation24.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransactionReference";
			definition = "Set of key elements of the original transaction being referred to.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OriginalTransactionReference9.mmObject();
		}

		@Override
		public OriginalTransactionReference9 getValue(PaymentTransactionInformation24 obj) {
			return obj.getOriginalTransactionReference();
		}

		@Override
		public void setValue(PaymentTransactionInformation24 obj, OriginalTransactionReference9 value) {
			obj.setOriginalTransactionReference(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTransactionInformation24.mmReversalIdentification,
						com.tools20022.repository.msg.PaymentTransactionInformation24.mmOriginalPaymentInformationIdentification, com.tools20022.repository.msg.PaymentTransactionInformation24.mmOriginalInstructionIdentification,
						com.tools20022.repository.msg.PaymentTransactionInformation24.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation24.mmOriginalTransactionIdentification,
						com.tools20022.repository.msg.PaymentTransactionInformation24.mmOriginalInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation24.mmReversedInterbankSettlementAmount,
						com.tools20022.repository.msg.PaymentTransactionInformation24.mmReversedInstructedAmount, com.tools20022.repository.msg.PaymentTransactionInformation24.mmExchangeRate,
						com.tools20022.repository.msg.PaymentTransactionInformation24.mmCompensationAmount, com.tools20022.repository.msg.PaymentTransactionInformation24.mmChargeBearer,
						com.tools20022.repository.msg.PaymentTransactionInformation24.mmChargesInformation, com.tools20022.repository.msg.PaymentTransactionInformation24.mmInstructingAgent,
						com.tools20022.repository.msg.PaymentTransactionInformation24.mmInstructedAgent, com.tools20022.repository.msg.PaymentTransactionInformation24.mmReversalReasonInformation,
						com.tools20022.repository.msg.PaymentTransactionInformation24.mmOriginalTransactionReference);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate1Rule.forPaymentTransactionInformation24,
						com.tools20022.repository.constraints.ConstraintReversedInstructedAmountAndExchangeRate2Rule.forPaymentTransactionInformation24,
						com.tools20022.repository.constraints.ConstraintChargesInformationAndReversedInstructedAmountRule.forPaymentTransactionInformation24,
						com.tools20022.repository.constraints.ConstraintSEPAOriginalAndReversedInterbankSettlementAmountRule.forPaymentTransactionInformation24);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentTransactionInformation24";
				definition = "Reference and status information concerning the original transactions, included in the original instruction, to which the reversal message applies.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getReversalIdentification() {
		return reversalIdentification == null ? Optional.empty() : Optional.of(reversalIdentification);
	}

	public PaymentTransactionInformation24 setReversalIdentification(Max35Text reversalIdentification) {
		this.reversalIdentification = reversalIdentification;
		return this;
	}

	public Optional<Max35Text> getOriginalPaymentInformationIdentification() {
		return originalPaymentInformationIdentification == null ? Optional.empty() : Optional.of(originalPaymentInformationIdentification);
	}

	public PaymentTransactionInformation24 setOriginalPaymentInformationIdentification(Max35Text originalPaymentInformationIdentification) {
		this.originalPaymentInformationIdentification = originalPaymentInformationIdentification;
		return this;
	}

	public Optional<Max35Text> getOriginalInstructionIdentification() {
		return originalInstructionIdentification == null ? Optional.empty() : Optional.of(originalInstructionIdentification);
	}

	public PaymentTransactionInformation24 setOriginalInstructionIdentification(Max35Text originalInstructionIdentification) {
		this.originalInstructionIdentification = originalInstructionIdentification;
		return this;
	}

	public Optional<Max35Text> getOriginalEndToEndIdentification() {
		return originalEndToEndIdentification == null ? Optional.empty() : Optional.of(originalEndToEndIdentification);
	}

	public PaymentTransactionInformation24 setOriginalEndToEndIdentification(Max35Text originalEndToEndIdentification) {
		this.originalEndToEndIdentification = originalEndToEndIdentification;
		return this;
	}

	public Optional<Max35Text> getOriginalTransactionIdentification() {
		return originalTransactionIdentification == null ? Optional.empty() : Optional.of(originalTransactionIdentification);
	}

	public PaymentTransactionInformation24 setOriginalTransactionIdentification(Max35Text originalTransactionIdentification) {
		this.originalTransactionIdentification = originalTransactionIdentification;
		return this;
	}

	public Optional<EuroMax9Amount> getOriginalInterbankSettlementAmount() {
		return originalInterbankSettlementAmount == null ? Optional.empty() : Optional.of(originalInterbankSettlementAmount);
	}

	public PaymentTransactionInformation24 setOriginalInterbankSettlementAmount(EuroMax9Amount originalInterbankSettlementAmount) {
		this.originalInterbankSettlementAmount = originalInterbankSettlementAmount;
		return this;
	}

	public EuroMax9Amount getReversedInterbankSettlementAmount() {
		return reversedInterbankSettlementAmount;
	}

	public PaymentTransactionInformation24 setReversedInterbankSettlementAmount(EuroMax9Amount reversedInterbankSettlementAmount) {
		this.reversedInterbankSettlementAmount = Objects.requireNonNull(reversedInterbankSettlementAmount);
		return this;
	}

	public Optional<CurrencyAndAmount> getReversedInstructedAmount() {
		return reversedInstructedAmount == null ? Optional.empty() : Optional.of(reversedInstructedAmount);
	}

	public PaymentTransactionInformation24 setReversedInstructedAmount(CurrencyAndAmount reversedInstructedAmount) {
		this.reversedInstructedAmount = reversedInstructedAmount;
		return this;
	}

	public Optional<BaseOneRate> getExchangeRate() {
		return exchangeRate == null ? Optional.empty() : Optional.of(exchangeRate);
	}

	public PaymentTransactionInformation24 setExchangeRate(BaseOneRate exchangeRate) {
		this.exchangeRate = exchangeRate;
		return this;
	}

	public Optional<EuroMax9Amount> getCompensationAmount() {
		return compensationAmount == null ? Optional.empty() : Optional.of(compensationAmount);
	}

	public PaymentTransactionInformation24 setCompensationAmount(EuroMax9Amount compensationAmount) {
		this.compensationAmount = compensationAmount;
		return this;
	}

	public Optional<ChargeBearerType2Code> getChargeBearer() {
		return chargeBearer == null ? Optional.empty() : Optional.of(chargeBearer);
	}

	public PaymentTransactionInformation24 setChargeBearer(ChargeBearerType2Code chargeBearer) {
		this.chargeBearer = chargeBearer;
		return this;
	}

	public List<ChargesInformation4> getChargesInformation() {
		return chargesInformation == null ? chargesInformation = new ArrayList<>() : chargesInformation;
	}

	public PaymentTransactionInformation24 setChargesInformation(List<ChargesInformation4> chargesInformation) {
		this.chargesInformation = Objects.requireNonNull(chargesInformation);
		return this;
	}

	public Optional<FinancialInstitution2> getInstructingAgent() {
		return instructingAgent == null ? Optional.empty() : Optional.of(instructingAgent);
	}

	public PaymentTransactionInformation24 setInstructingAgent(FinancialInstitution2 instructingAgent) {
		this.instructingAgent = instructingAgent;
		return this;
	}

	public Optional<FinancialInstitution2> getInstructedAgent() {
		return instructedAgent == null ? Optional.empty() : Optional.of(instructedAgent);
	}

	public PaymentTransactionInformation24 setInstructedAgent(FinancialInstitution2 instructedAgent) {
		this.instructedAgent = instructedAgent;
		return this;
	}

	public List<ReversalReasonInformation5> getReversalReasonInformation() {
		return reversalReasonInformation == null ? reversalReasonInformation = new ArrayList<>() : reversalReasonInformation;
	}

	public PaymentTransactionInformation24 setReversalReasonInformation(List<ReversalReasonInformation5> reversalReasonInformation) {
		this.reversalReasonInformation = Objects.requireNonNull(reversalReasonInformation);
		return this;
	}

	public OriginalTransactionReference9 getOriginalTransactionReference() {
		return originalTransactionReference;
	}

	public PaymentTransactionInformation24 setOriginalTransactionReference(OriginalTransactionReference9 originalTransactionReference) {
		this.originalTransactionReference = Objects.requireNonNull(originalTransactionReference);
		return this;
	}
}