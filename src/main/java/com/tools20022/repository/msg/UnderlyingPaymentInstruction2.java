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
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PaymentInstruction;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Reference information concerning the original payment initiation, to which
 * the investigation message refers.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#mmOriginalGroupInformation
 * UnderlyingPaymentInstruction2.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#mmOriginalPaymentInformationIdentification
 * UnderlyingPaymentInstruction2.mmOriginalPaymentInformationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#mmOriginalInstructionIdentification
 * UnderlyingPaymentInstruction2.mmOriginalInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#mmOriginalEndToEndIdentification
 * UnderlyingPaymentInstruction2.mmOriginalEndToEndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#mmOriginalInstructedAmount
 * UnderlyingPaymentInstruction2.mmOriginalInstructedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#mmRequestedExecutionDate
 * UnderlyingPaymentInstruction2.mmRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#mmRequestedCollectionDate
 * UnderlyingPaymentInstruction2.mmRequestedCollectionDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
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
 * "UnderlyingPaymentInstruction2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reference information concerning the original payment initiation, to which the investigation message refers."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3
 * UnderlyingPaymentInstruction3}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class UnderlyingPaymentInstruction2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected UnderlyingGroupInformation1 originalGroupInformation;
	/**
	 * Set of elements used to provide information on the original message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingGroupInformation1
	 * UnderlyingGroupInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2
	 * UnderlyingPaymentInstruction2}</li>
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
	 * "Set of elements used to provide information on the original message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#mmOriginalGroupInformation
	 * UnderlyingPaymentInstruction3.mmOriginalGroupInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalGroupInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> UnderlyingPaymentInstruction2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlGrpInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Set of elements used to provide information on the original message.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingPaymentInstruction3.mmOriginalGroupInformation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UnderlyingGroupInformation1.mmObject();
		}
	};
	protected Max35Text originalPaymentInformationIdentification;
	/**
	 * Unique identification, as assigned by the original sending party, to
	 * unambiguously identify the original payment information group.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmExecutionIdentification
	 * PaymentIdentification.mmExecutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2
	 * UnderlyingPaymentInstruction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPmtInfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPaymentInformationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the original sending party, to unambiguously identify the original payment information group."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#mmOriginalPaymentInformationIdentification
	 * UnderlyingPaymentInstruction3.mmOriginalPaymentInformationIdentification}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalPaymentInformationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> UnderlyingPaymentInstruction2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPmtInfId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationIdentification";
			definition = "Unique identification, as assigned by the original sending party, to unambiguously identify the original payment information group.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingPaymentInstruction3.mmOriginalPaymentInformationIdentification);
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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2
	 * UnderlyingPaymentInstruction2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#mmOriginalInstructionIdentification
	 * UnderlyingPaymentInstruction3.mmOriginalInstructionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalInstructionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmInstructionIdentification;
			componentContext_lazy = () -> UnderlyingPaymentInstruction2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlInstrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInstructionIdentification";
			definition = "Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingPaymentInstruction3.mmOriginalInstructionIdentification);
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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2
	 * UnderlyingPaymentInstruction2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#mmOriginalEndToEndIdentification
	 * UnderlyingPaymentInstruction3.mmOriginalEndToEndIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalEndToEndIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> UnderlyingPaymentInstruction2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlEndToEndId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalEndToEndIdentification";
			definition = "Unique identification, as assigned by the original initiating party, to unambiguously identify the original transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingPaymentInstruction3.mmOriginalEndToEndIdentification);
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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2
	 * UnderlyingPaymentInstruction2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#mmOriginalInstructedAmount
	 * UnderlyingPaymentInstruction3.mmOriginalInstructedAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalInstructedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmInstructedAmount;
			componentContext_lazy = () -> UnderlyingPaymentInstruction2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlInstdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInstructedAmount";
			definition = "Amount of money, as provided in the original transaction, to be moved between the debtor and the creditor, before deduction of charges, expressed in the currency, as ordered by the original initiating party.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingPaymentInstruction3.mmOriginalInstructedAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected ISODate requestedExecutionDate;
	/**
	 * Date at which the initiating party requests the clearing agent to process
	 * the payment. Usage: This is the date on which the debtor's account is to
	 * be debited. If payment by cheque, the date when the cheque must be
	 * generated by the bank.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRequestedExecutionDate
	 * PaymentExecution.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2
	 * UnderlyingPaymentInstruction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdExctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the initiating party requests the clearing agent to process the payment. \nUsage: This is the date on which the debtor's account is to be debited. If payment by cheque, the date when the cheque must be generated by the bank."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#mmRequestedExecutionDate
	 * UnderlyingPaymentInstruction3.mmRequestedExecutionDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedExecutionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmRequestedExecutionDate;
			componentContext_lazy = () -> UnderlyingPaymentInstruction2.mmObject();
			isDerived = false;
			xmlTag = "ReqdExctnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the initiating party requests the clearing agent to process the payment. \nUsage: This is the date on which the debtor's account is to be debited. If payment by cheque, the date when the cheque must be generated by the bank.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingPaymentInstruction3.mmRequestedExecutionDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate requestedCollectionDate;
	/**
	 * Date at which the creditor requests the amount of money to be collected
	 * from the debtor.
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
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2
	 * UnderlyingPaymentInstruction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdColltnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the creditor requests the amount of money to be collected from the debtor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#mmRequestedCollectionDate
	 * UnderlyingPaymentInstruction3.mmRequestedCollectionDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedCollectionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> UnderlyingPaymentInstruction2.mmObject();
			isDerived = false;
			xmlTag = "ReqdColltnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedCollectionDate";
			definition = "Date at which the creditor requests the amount of money to be collected from the debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingPaymentInstruction3.mmRequestedCollectionDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingPaymentInstruction2.mmOriginalGroupInformation,
						com.tools20022.repository.msg.UnderlyingPaymentInstruction2.mmOriginalPaymentInformationIdentification, com.tools20022.repository.msg.UnderlyingPaymentInstruction2.mmOriginalInstructionIdentification,
						com.tools20022.repository.msg.UnderlyingPaymentInstruction2.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.UnderlyingPaymentInstruction2.mmOriginalInstructedAmount,
						com.tools20022.repository.msg.UnderlyingPaymentInstruction2.mmRequestedExecutionDate, com.tools20022.repository.msg.UnderlyingPaymentInstruction2.mmRequestedCollectionDate);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UnderlyingPaymentInstruction2";
				definition = "Reference information concerning the original payment initiation, to which the investigation message refers.";
				nextVersions_lazy = () -> Arrays.asList(UnderlyingPaymentInstruction3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public UnderlyingGroupInformation1 getOriginalGroupInformation() {
		return originalGroupInformation;
	}

	public void setOriginalGroupInformation(com.tools20022.repository.msg.UnderlyingGroupInformation1 originalGroupInformation) {
		this.originalGroupInformation = originalGroupInformation;
	}

	public Max35Text getOriginalPaymentInformationIdentification() {
		return originalPaymentInformationIdentification;
	}

	public void setOriginalPaymentInformationIdentification(Max35Text originalPaymentInformationIdentification) {
		this.originalPaymentInformationIdentification = originalPaymentInformationIdentification;
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

	public ISODate getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public void setRequestedExecutionDate(ISODate requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
	}

	public ISODate getRequestedCollectionDate() {
		return requestedCollectionDate;
	}

	public void setRequestedCollectionDate(ISODate requestedCollectionDate) {
		this.requestedCollectionDate = requestedCollectionDate;
	}
}