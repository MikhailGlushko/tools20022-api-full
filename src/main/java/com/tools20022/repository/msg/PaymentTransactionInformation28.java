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
import com.tools20022.repository.codeset.ChargeBearerType1Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Payment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Set of elements used to provide reference and status information on the
 * original transactions, included in the original instruction, to which the
 * reversal message applies.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#mmReversalIdentification
 * PaymentTransactionInformation28.mmReversalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#mmOriginalInstructionIdentification
 * PaymentTransactionInformation28.mmOriginalInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#mmOriginalEndToEndIdentification
 * PaymentTransactionInformation28.mmOriginalEndToEndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#mmOriginalInstructedAmount
 * PaymentTransactionInformation28.mmOriginalInstructedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#mmReversedInstructedAmount
 * PaymentTransactionInformation28.mmReversedInstructedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#mmChargeBearer
 * PaymentTransactionInformation28.mmChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#mmReversalReasonInformation
 * PaymentTransactionInformation28.mmReversalReasonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#mmOriginalTransactionReference
 * PaymentTransactionInformation28.mmOriginalTransactionReference}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentTransactionInformation28"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide reference and status information on the original transactions, included in the original instruction, to which the reversal message applies."
 * </li>
 * </ul>
 */
public class PaymentTransactionInformation28 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text reversalIdentification;
	/**
	 * Unique identification, as assigned by an instructing party for an
	 * instructed party, to unambiguously identify the reversed transaction.
	 * Usage: The instructing party is the party sending the reversal message
	 * and not the party that sent the original instruction that is being
	 * reversed.
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28
	 * PaymentTransactionInformation28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the reversed transaction.\nUsage: The instructing party is the party sending the reversal message and not the party that sent the original instruction that is being reversed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReversalIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTransactionInformation28.mmObject();
			isDerived = false;
			xmlTag = "RvslId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalIdentification";
			definition = "Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the reversed transaction.\nUsage: The instructing party is the party sending the reversal message and not the party that sent the original instruction that is being reversed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text originalInstructionIdentification;
	/**
	 * Unique identification, as assigned by the original instructing party for
	 * the original instructed party, to unambiguously identify the original
	 * instruction.
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28
	 * PaymentTransactionInformation28}</li>
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
	 * "Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalInstructionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmInstructionIdentification;
			componentContext_lazy = () -> PaymentTransactionInformation28.mmObject();
			isDerived = false;
			xmlTag = "OrgnlInstrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInstructionIdentification";
			definition = "Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text originalEndToEndIdentification;
	/**
	 * Unique identification, as assigned by the original initiating party, to
	 * unambiguously identify the original transaction.
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28
	 * PaymentTransactionInformation28}</li>
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
	 * "Unique identification, as assigned by the original initiating party, to unambiguously identify the original transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalEndToEndIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> PaymentTransactionInformation28.mmObject();
			isDerived = false;
			xmlTag = "OrgnlEndToEndId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalEndToEndIdentification";
			definition = "Unique identification, as assigned by the original initiating party, to unambiguously identify the original transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount originalInstructedAmount;
	/**
	 * Amount of money, as provided in the original transaction, to be moved
	 * between the debtor and the creditor, before deduction of charges,
	 * expressed in the currency, as ordered by the original initiating party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28
	 * PaymentTransactionInformation28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlInstdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInstructedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money, as provided in the original transaction, to be moved between the debtor and the creditor, before deduction of charges, expressed in the currency, as ordered by the original initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalInstructedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmInstructedAmount;
			componentContext_lazy = () -> PaymentTransactionInformation28.mmObject();
			isDerived = false;
			xmlTag = "OrgnlInstdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInstructedAmount";
			definition = "Amount of money, as provided in the original transaction, to be moved between the debtor and the creditor, before deduction of charges, expressed in the currency, as ordered by the original initiating party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount reversedInstructedAmount;
	/**
	 * Amount of money to be moved between the debtor and the creditor, before
	 * deduction of charges, in the reversed transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28
	 * PaymentTransactionInformation28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvsdInstdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversedInstructedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be moved between the debtor and the creditor, before deduction of charges, in the reversed transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReversedInstructedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmInstructedAmount;
			componentContext_lazy = () -> PaymentTransactionInformation28.mmObject();
			isDerived = false;
			xmlTag = "RvsdInstdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversedInstructedAmount";
			definition = "Amount of money to be moved between the debtor and the creditor, before deduction of charges, in the reversed transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected ChargeBearerType1Code chargeBearer;
	/**
	 * Specifies if the creditor and/or debtor will bear the charges associated
	 * with the processing of the payment transaction.
	 * 
	 * Usage: The ChargeBearer applies to the reversal message, not to the
	 * original instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code
	 * ChargeBearerType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmBearerType
	 * Charges.mmBearerType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28
	 * PaymentTransactionInformation28}</li>
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
	 * "Specifies if the creditor and/or debtor will bear the charges associated with the processing of the payment transaction.\n\nUsage: The ChargeBearer applies to the reversal message, not to the original instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargeBearer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Charges.mmBearerType;
			componentContext_lazy = () -> PaymentTransactionInformation28.mmObject();
			isDerived = false;
			xmlTag = "ChrgBr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearer";
			definition = "Specifies if the creditor and/or debtor will bear the charges associated with the processing of the payment transaction.\n\nUsage: The ChargeBearer applies to the reversal message, not to the original instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ChargeBearerType1Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ReversalReasonInformation6> reversalReasonInformation;
	/**
	 * Set of elements used to provide detailed information on the reversal
	 * reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReversalReasonInformation6
	 * ReversalReasonInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
	 * Payment.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28
	 * PaymentTransactionInformation28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide detailed information on the reversal reason."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReversalReasonInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmPaymentStatus;
			componentContext_lazy = () -> PaymentTransactionInformation28.mmObject();
			isDerived = false;
			xmlTag = "RvslRsnInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalReasonInformation";
			definition = "Set of elements used to provide detailed information on the reversal reason.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReversalReasonInformation6.mmObject();
		}
	};
	protected OriginalTransactionReference13 originalTransactionReference;
	/**
	 * Set of key elements used to identify the original transaction that is
	 * being referred to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13
	 * OriginalTransactionReference13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28
	 * PaymentTransactionInformation28}</li>
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
	 * "Set of key elements used to identify the original transaction that is being referred to."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalTransactionReference = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> PaymentTransactionInformation28.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTxRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransactionReference";
			definition = "Set of key elements used to identify the original transaction that is being referred to.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalTransactionReference13.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTransactionInformation28.mmReversalIdentification,
						com.tools20022.repository.msg.PaymentTransactionInformation28.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation28.mmOriginalEndToEndIdentification,
						com.tools20022.repository.msg.PaymentTransactionInformation28.mmOriginalInstructedAmount, com.tools20022.repository.msg.PaymentTransactionInformation28.mmReversedInstructedAmount,
						com.tools20022.repository.msg.PaymentTransactionInformation28.mmChargeBearer, com.tools20022.repository.msg.PaymentTransactionInformation28.mmReversalReasonInformation,
						com.tools20022.repository.msg.PaymentTransactionInformation28.mmOriginalTransactionReference);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentTransactionInformation28";
				definition = "Set of elements used to provide reference and status information on the original transactions, included in the original instruction, to which the reversal message applies.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getReversalIdentification() {
		return reversalIdentification;
	}

	public void setReversalIdentification(Max35Text reversalIdentification) {
		this.reversalIdentification = reversalIdentification;
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

	public ActiveOrHistoricCurrencyAndAmount getOriginalInstructedAmount() {
		return originalInstructedAmount;
	}

	public void setOriginalInstructedAmount(ActiveOrHistoricCurrencyAndAmount originalInstructedAmount) {
		this.originalInstructedAmount = originalInstructedAmount;
	}

	public ActiveOrHistoricCurrencyAndAmount getReversedInstructedAmount() {
		return reversedInstructedAmount;
	}

	public void setReversedInstructedAmount(ActiveOrHistoricCurrencyAndAmount reversedInstructedAmount) {
		this.reversedInstructedAmount = reversedInstructedAmount;
	}

	public ChargeBearerType1Code getChargeBearer() {
		return chargeBearer;
	}

	public void setChargeBearer(ChargeBearerType1Code chargeBearer) {
		this.chargeBearer = chargeBearer;
	}

	public List<ReversalReasonInformation6> getReversalReasonInformation() {
		return reversalReasonInformation;
	}

	public void setReversalReasonInformation(List<com.tools20022.repository.msg.ReversalReasonInformation6> reversalReasonInformation) {
		this.reversalReasonInformation = reversalReasonInformation;
	}

	public OriginalTransactionReference13 getOriginalTransactionReference() {
		return originalTransactionReference;
	}

	public void setOriginalTransactionReference(com.tools20022.repository.msg.OriginalTransactionReference13 originalTransactionReference) {
		this.originalTransactionReference = originalTransactionReference;
	}
}