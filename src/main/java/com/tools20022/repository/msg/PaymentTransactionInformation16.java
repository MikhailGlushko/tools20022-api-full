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
import com.tools20022.repository.codeset.ChargeBearerType2Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Charges;
import com.tools20022.repository.entity.Payment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Reference and status information concerning the original transactions,
 * included in the original instruction, to which the return message applies.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmReturnIdentification
 * PaymentTransactionInformation16.mmReturnIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmOriginalGroupInformation
 * PaymentTransactionInformation16.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmOriginalInstructionIdentification
 * PaymentTransactionInformation16.mmOriginalInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmOriginalEndToEndIdentification
 * PaymentTransactionInformation16.mmOriginalEndToEndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmOriginalTransactionIdentification
 * PaymentTransactionInformation16.mmOriginalTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmOriginalInterbankSettlementAmount
 * PaymentTransactionInformation16.mmOriginalInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmReturnedInterbankSettlementAmount
 * PaymentTransactionInformation16.mmReturnedInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmInterbankSettlementDate
 * PaymentTransactionInformation16.mmInterbankSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmReturnedInstructedAmount
 * PaymentTransactionInformation16.mmReturnedInstructedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmExchangeRate
 * PaymentTransactionInformation16.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmCompensationAmount
 * PaymentTransactionInformation16.mmCompensationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmChargeBearer
 * PaymentTransactionInformation16.mmChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmChargesInformation
 * PaymentTransactionInformation16.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmInstructingAgent
 * PaymentTransactionInformation16.mmInstructingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmInstructedAgent
 * PaymentTransactionInformation16.mmInstructedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmReturnReasonInformation
 * PaymentTransactionInformation16.mmReturnReasonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmOriginalTransactionReference
 * PaymentTransactionInformation16.mmOriginalTransactionReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentTransactionInformation16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reference and status information concerning the original transactions, included in the original instruction, to which the return message applies."
 * </li>
 * </ul>
 */
public class PaymentTransactionInformation16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text returnIdentification;
	/**
	 * Unique identification as assigned by an instructing party for an
	 * instructed party to unambiguously identify the returned transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16
	 * PaymentTransactionInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the returned transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReturnIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTransactionInformation16.mmObject();
			isDerived = false;
			xmlTag = "RtrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnIdentification";
			definition = "Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the returned transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected OriginalGroupInformation3 originalGroupInformation;
	/**
	 * Information concerning the original group of transactions, to which the
	 * message refers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation3
	 * OriginalGroupInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
	 * Payment.mmPaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16
	 * PaymentTransactionInformation16}</li>
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
	 * "Information concerning the original group of transactions, to which the message refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalGroupInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmPaymentExecution;
			componentContext_lazy = () -> PaymentTransactionInformation16.mmObject();
			isDerived = false;
			xmlTag = "OrgnlGrpInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Information concerning the original group of transactions, to which the message refers.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation3.mmObject();
		}
	};
	protected Max35Text originalInstructionIdentification;
	/**
	 * Original unique instruction identification as assigned by an instructing
	 * party for an instructed party to unambiguously identify the original
	 * instruction.
	 * 
	 * Usage: the original instruction identification is the original point to
	 * point reference used between the instructing party and the instructed
	 * party to refer to the original instruction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16
	 * PaymentTransactionInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlInstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original unique instruction identification as assigned by an instructing party for an instructed party to unambiguously identify the original instruction.\n\nUsage: the original instruction identification is the original point to point reference used between the instructing party and the instructed party to refer to the original instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalInstructionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmInstructionIdentification;
			componentContext_lazy = () -> PaymentTransactionInformation16.mmObject();
			isDerived = false;
			xmlTag = "OrgnlInstrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInstructionIdentification";
			definition = "Original unique instruction identification as assigned by an instructing party for an instructed party to unambiguously identify the original instruction.\n\nUsage: the original instruction identification is the original point to point reference used between the instructing party and the instructed party to refer to the original instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text originalEndToEndIdentification;
	/**
	 * Original unique identification assigned by the initiating party to
	 * unambiguously identify the original transaction. This identification is
	 * passed on, unchanged, throughout the entire end-to-end chain.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16
	 * PaymentTransactionInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlEndToEndId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalEndToEndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original unique identification assigned by the initiating party to unambiguously identify the original transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalEndToEndIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> PaymentTransactionInformation16.mmObject();
			isDerived = false;
			xmlTag = "OrgnlEndToEndId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalEndToEndIdentification";
			definition = "Original unique identification assigned by the initiating party to unambiguously identify the original transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text originalTransactionIdentification;
	/**
	 * Original identification of a transaction, as assigned by the first
	 * instructing agent and passed on, unchanged, throughout the entire
	 * interbank chain.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16
	 * PaymentTransactionInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original identification of a transaction, as assigned by the first instructing agent and passed on, unchanged, throughout the entire interbank chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmTransactionIdentification;
			componentContext_lazy = () -> PaymentTransactionInformation16.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransactionIdentification";
			definition = "Original identification of a transaction, as assigned by the first instructing agent and passed on, unchanged, throughout the entire interbank chain.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected EuroMax9Amount originalInterbankSettlementAmount;
	/**
	 * Original amount of money as moved between the instructing agent and the
	 * instructed agent in the original transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16
	 * PaymentTransactionInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlIntrBkSttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original amount of money as moved between the instructing agent and the instructed agent in the original transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalInterbankSettlementAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> PaymentTransactionInformation16.mmObject();
			isDerived = false;
			xmlTag = "OrgnlIntrBkSttlmAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInterbankSettlementAmount";
			definition = "Original amount of money as moved between the instructing agent and the instructed agent in the original transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EuroMax9Amount.mmObject();
		}
	};
	protected EuroMax9Amount returnedInterbankSettlementAmount;
	/**
	 * Returned amount of money moved between the instructing agent and the
	 * instructed agent in the return transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16
	 * PaymentTransactionInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrdIntrBkSttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnedInterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Returned amount of money moved between the instructing agent and the instructed agent in the return transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReturnedInterbankSettlementAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> PaymentTransactionInformation16.mmObject();
			isDerived = false;
			xmlTag = "RtrdIntrBkSttlmAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnedInterbankSettlementAmount";
			definition = "Returned amount of money moved between the instructing agent and the instructed agent in the return transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EuroMax9Amount.mmObject();
		}
	};
	protected ISODate interbankSettlementDate;
	/**
	 * Date on which the amount of money ceases to be available to the agent
	 * that owes it and when the amount of money becomes available to the agent
	 * to which it is due.
	 * 
	 * Usage: the InterbankSettlementDate is the interbank settlement date of
	 * the return message, and not of the original instruction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16
	 * PaymentTransactionInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.\n\nUsage: the InterbankSettlementDate is the interbank settlement date of the return message, and not of the original instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterbankSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmInterbankSettlementDate;
			componentContext_lazy = () -> PaymentTransactionInformation16.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.\n\nUsage: the InterbankSettlementDate is the interbank settlement date of the return message, and not of the original instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected CurrencyAndAmount returnedInstructedAmount;
	/**
	 * Amount of money to be moved between the debtor and the creditor, before
	 * deduction of charges, in the returned transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16
	 * PaymentTransactionInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrdInstdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnedInstructedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be moved between the debtor and the creditor, before deduction of charges, in the returned transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReturnedInstructedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmInstructedAmount;
			componentContext_lazy = () -> PaymentTransactionInformation16.mmObject();
			isDerived = false;
			xmlTag = "RtrdInstdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnedInstructedAmount";
			definition = "Amount of money to be moved between the debtor and the creditor, before deduction of charges, in the returned transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected BaseOneRate exchangeRate;
	/**
	 * The factor used for conversion of an amount from one currency into
	 * another. This reflects the price at which one currency was bought with
	 * another currency.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16
	 * PaymentTransactionInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The factor used for conversion of an amount from one currency into another. This reflects the price at which one currency was bought with another currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> PaymentTransactionInformation16.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "The factor used for conversion of an amount from one currency into another. This reflects the price at which one currency was bought with another currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	protected EuroMax9Amount compensationAmount;
	/**
	 * Amount of money asked or paid as compensation for the processing of the
	 * instruction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16
	 * PaymentTransactionInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CompstnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompensationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money asked or paid as compensation for the processing of the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCompensationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmClearingChargeAmount;
			componentContext_lazy = () -> PaymentTransactionInformation16.mmObject();
			isDerived = false;
			xmlTag = "CompstnAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompensationAmount";
			definition = "Amount of money asked or paid as compensation for the processing of the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EuroMax9Amount.mmObject();
		}
	};
	protected ChargeBearerType2Code chargeBearer;
	/**
	 * Specifies which party/parties will bear the charges associated with the
	 * processing of the payment transaction.
	 * 
	 * Usage: The ChargeBearer applies to the return message, not to the
	 * original instruction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16
	 * PaymentTransactionInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgBr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.\n\nUsage: The ChargeBearer applies to the return message, not to the original instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargeBearer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Charges.mmBearerType;
			componentContext_lazy = () -> PaymentTransactionInformation16.mmObject();
			isDerived = false;
			xmlTag = "ChrgBr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearer";
			definition = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.\n\nUsage: The ChargeBearer applies to the return message, not to the original instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ChargeBearerType2Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ChargesInformation2> chargesInformation;
	/**
	 * Transaction charges to be paid by the charge bearer for the return
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ChargesInformation2
	 * ChargesInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16
	 * PaymentTransactionInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction charges to be paid by the charge bearer for the return transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChargesInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Charges.mmObject();
			componentContext_lazy = () -> PaymentTransactionInformation16.mmObject();
			isDerived = false;
			xmlTag = "ChrgsInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesInformation";
			definition = "Transaction charges to be paid by the charge bearer for the return transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ChargesInformation2.mmObject();
		}
	};
	protected FinancialInstitution2 instructingAgent;
	/**
	 * Agent that instructs the next party in the chain to carry out the (set
	 * of) instruction(s).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16
	 * PaymentTransactionInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent that instructs the next party in the chain to carry out the (set of) instruction(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructingAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> PaymentTransactionInformation16.mmObject();
			isDerived = false;
			xmlTag = "InstgAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingAgent";
			definition = "Agent that instructs the next party in the chain to carry out the (set of) instruction(s).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitution2.mmObject();
		}
	};
	protected FinancialInstitution2 instructedAgent;
	/**
	 * Agent that is instructed by the previous party in the chain to carry out
	 * the (set of) instruction(s).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16
	 * PaymentTransactionInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent that is instructed by the previous party in the chain to carry out the (set of) instruction(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructedAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> PaymentTransactionInformation16.mmObject();
			isDerived = false;
			xmlTag = "InstdAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAgent";
			definition = "Agent that is instructed by the previous party in the chain to carry out the (set of) instruction(s).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitution2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ReturnReasonInformation3> returnReasonInformation;
	/**
	 * Detailed information on the return reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation3
	 * ReturnReasonInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
	 * Payment.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16
	 * PaymentTransactionInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed information on the return reason."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReturnReasonInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmPaymentStatus;
			componentContext_lazy = () -> PaymentTransactionInformation16.mmObject();
			isDerived = false;
			xmlTag = "RtrRsnInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnReasonInformation";
			definition = "Detailed information on the return reason.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReturnReasonInformation3.mmObject();
		}
	};
	protected OriginalTransactionReference9 originalTransactionReference;
	/**
	 * Set of key elements of the original transaction being referred to.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16
	 * PaymentTransactionInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlTxRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of key elements of the original transaction being referred to."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalTransactionReference = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> PaymentTransactionInformation16.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTxRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransactionReference";
			definition = "Set of key elements of the original transaction being referred to.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalTransactionReference9.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTransactionInformation16.mmReturnIdentification, com.tools20022.repository.msg.PaymentTransactionInformation16.mmOriginalGroupInformation,
						com.tools20022.repository.msg.PaymentTransactionInformation16.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation16.mmOriginalEndToEndIdentification,
						com.tools20022.repository.msg.PaymentTransactionInformation16.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation16.mmOriginalInterbankSettlementAmount,
						com.tools20022.repository.msg.PaymentTransactionInformation16.mmReturnedInterbankSettlementAmount, com.tools20022.repository.msg.PaymentTransactionInformation16.mmInterbankSettlementDate,
						com.tools20022.repository.msg.PaymentTransactionInformation16.mmReturnedInstructedAmount, com.tools20022.repository.msg.PaymentTransactionInformation16.mmExchangeRate,
						com.tools20022.repository.msg.PaymentTransactionInformation16.mmCompensationAmount, com.tools20022.repository.msg.PaymentTransactionInformation16.mmChargeBearer,
						com.tools20022.repository.msg.PaymentTransactionInformation16.mmChargesInformation, com.tools20022.repository.msg.PaymentTransactionInformation16.mmInstructingAgent,
						com.tools20022.repository.msg.PaymentTransactionInformation16.mmInstructedAgent, com.tools20022.repository.msg.PaymentTransactionInformation16.mmReturnReasonInformation,
						com.tools20022.repository.msg.PaymentTransactionInformation16.mmOriginalTransactionReference);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentTransactionInformation16";
				definition = "Reference and status information concerning the original transactions, included in the original instruction, to which the return message applies.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getReturnIdentification() {
		return returnIdentification;
	}

	public void setReturnIdentification(Max35Text returnIdentification) {
		this.returnIdentification = returnIdentification;
	}

	public OriginalGroupInformation3 getOriginalGroupInformation() {
		return originalGroupInformation;
	}

	public void setOriginalGroupInformation(com.tools20022.repository.msg.OriginalGroupInformation3 originalGroupInformation) {
		this.originalGroupInformation = originalGroupInformation;
	}

	public Max35Text getOriginalInstructionIdentification() {
		return originalInstructionIdentification;
	}

	public void setOriginalInstructionIdentification(Max35Text originalInstructionIdentification) {
		this.originalInstructionIdentification = originalInstructionIdentification;
	}

	public Max35Text getOriginalEndToEndIdentification() {
		return originalEndToEndIdentification;
	}

	public void setOriginalEndToEndIdentification(Max35Text originalEndToEndIdentification) {
		this.originalEndToEndIdentification = originalEndToEndIdentification;
	}

	public Max35Text getOriginalTransactionIdentification() {
		return originalTransactionIdentification;
	}

	public void setOriginalTransactionIdentification(Max35Text originalTransactionIdentification) {
		this.originalTransactionIdentification = originalTransactionIdentification;
	}

	public EuroMax9Amount getOriginalInterbankSettlementAmount() {
		return originalInterbankSettlementAmount;
	}

	public void setOriginalInterbankSettlementAmount(EuroMax9Amount originalInterbankSettlementAmount) {
		this.originalInterbankSettlementAmount = originalInterbankSettlementAmount;
	}

	public EuroMax9Amount getReturnedInterbankSettlementAmount() {
		return returnedInterbankSettlementAmount;
	}

	public void setReturnedInterbankSettlementAmount(EuroMax9Amount returnedInterbankSettlementAmount) {
		this.returnedInterbankSettlementAmount = returnedInterbankSettlementAmount;
	}

	public ISODate getInterbankSettlementDate() {
		return interbankSettlementDate;
	}

	public void setInterbankSettlementDate(ISODate interbankSettlementDate) {
		this.interbankSettlementDate = interbankSettlementDate;
	}

	public CurrencyAndAmount getReturnedInstructedAmount() {
		return returnedInstructedAmount;
	}

	public void setReturnedInstructedAmount(CurrencyAndAmount returnedInstructedAmount) {
		this.returnedInstructedAmount = returnedInstructedAmount;
	}

	public BaseOneRate getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BaseOneRate exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public EuroMax9Amount getCompensationAmount() {
		return compensationAmount;
	}

	public void setCompensationAmount(EuroMax9Amount compensationAmount) {
		this.compensationAmount = compensationAmount;
	}

	public ChargeBearerType2Code getChargeBearer() {
		return chargeBearer;
	}

	public void setChargeBearer(ChargeBearerType2Code chargeBearer) {
		this.chargeBearer = chargeBearer;
	}

	public List<ChargesInformation2> getChargesInformation() {
		return chargesInformation;
	}

	public void setChargesInformation(List<com.tools20022.repository.msg.ChargesInformation2> chargesInformation) {
		this.chargesInformation = chargesInformation;
	}

	public FinancialInstitution2 getInstructingAgent() {
		return instructingAgent;
	}

	public void setInstructingAgent(com.tools20022.repository.msg.FinancialInstitution2 instructingAgent) {
		this.instructingAgent = instructingAgent;
	}

	public FinancialInstitution2 getInstructedAgent() {
		return instructedAgent;
	}

	public void setInstructedAgent(com.tools20022.repository.msg.FinancialInstitution2 instructedAgent) {
		this.instructedAgent = instructedAgent;
	}

	public List<ReturnReasonInformation3> getReturnReasonInformation() {
		return returnReasonInformation;
	}

	public void setReturnReasonInformation(List<com.tools20022.repository.msg.ReturnReasonInformation3> returnReasonInformation) {
		this.returnReasonInformation = returnReasonInformation;
	}

	public OriginalTransactionReference9 getOriginalTransactionReference() {
		return originalTransactionReference;
	}

	public void setOriginalTransactionReference(com.tools20022.repository.msg.OriginalTransactionReference9 originalTransactionReference) {
		this.originalTransactionReference = originalTransactionReference;
	}
}