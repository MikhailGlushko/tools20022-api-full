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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.RequestedIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines the criteria used to report on the payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmMessageIdentificationIndicator
 * PaymentReturnCriteria3.mmMessageIdentificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmRequestedExecutionDateIndicator
 * PaymentReturnCriteria3.mmRequestedExecutionDateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmInstructionIndicator
 * PaymentReturnCriteria3.mmInstructionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmInstructionStatusReturnCriteria
 * PaymentReturnCriteria3.mmInstructionStatusReturnCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmInstructedAmountIndicator
 * PaymentReturnCriteria3.mmInstructedAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmCreditDebitIndicator
 * PaymentReturnCriteria3.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmInterbankSettlementAmountIndicator
 * PaymentReturnCriteria3.mmInterbankSettlementAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmPriorityIndicator
 * PaymentReturnCriteria3.mmPriorityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmProcessingValidityTimeIndicator
 * PaymentReturnCriteria3.mmProcessingValidityTimeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmPurposeIndicator
 * PaymentReturnCriteria3.mmPurposeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmInstructionCopyIndicator
 * PaymentReturnCriteria3.mmInstructionCopyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmPaymentMessageTypeIndicator
 * PaymentReturnCriteria3.mmPaymentMessageTypeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmPaymentTypeIndicator
 * PaymentReturnCriteria3.mmPaymentTypeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmTransactionIdentificationIndicator
 * PaymentReturnCriteria3.mmTransactionIdentificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmInterbankSettlementDateIndicator
 * PaymentReturnCriteria3.mmInterbankSettlementDateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmEndToEndIdentificationIndicator
 * PaymentReturnCriteria3.mmEndToEndIdentificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmPaymentMethodIndicator
 * PaymentReturnCriteria3.mmPaymentMethodIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmDebtorIndicator
 * PaymentReturnCriteria3.mmDebtorIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmDebtorAgentIndicator
 * PaymentReturnCriteria3.mmDebtorAgentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmInstructingReimbursementAgentIndicator
 * PaymentReturnCriteria3.mmInstructingReimbursementAgentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmInstructedReimbursementAgentIndicator
 * PaymentReturnCriteria3.mmInstructedReimbursementAgentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmIntermediaryIndicator
 * PaymentReturnCriteria3.mmIntermediaryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmCreditorAgentIndicator
 * PaymentReturnCriteria3.mmCreditorAgentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmCreditorIndicator
 * PaymentReturnCriteria3.mmCreditorIndicator}</li>
 * </ul>
 * </li>
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
 * "PaymentReturnCriteria3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to report on the payment."</li>
 * </ul>
 */
public class PaymentReturnCriteria3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RequestedIndicator messageIdentificationIndicator;
	/**
	 * Indicates whether the original payment transaction message identification
	 * is requested. Usage: this is the former TransactionReference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgIdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the original payment transaction message identification is requested.\nUsage: this is the former TransactionReference."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageIdentificationIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "MsgIdInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentificationIndicator";
			definition = "Indicates whether the original payment transaction message identification is requested.\nUsage: this is the former TransactionReference.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator requestedExecutionDateIndicator;
	/**
	 * Indicates whether the requested execution date is requested. Usage: this
	 * is the former TransferValueDate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdExctnDtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the requested execution date is requested.\nUsage: this is the former TransferValueDate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedExecutionDateIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "ReqdExctnDtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDateIndicator";
			definition = "Indicates whether the requested execution date is requested.\nUsage: this is the former TransferValueDate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator instructionIndicator;
	/**
	 * Indicates whether the instruction is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the instruction is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "InstrInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIndicator";
			definition = "Indicates whether the instruction is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected InstructionStatusReturnCriteria instructionStatusReturnCriteria;
	/**
	 * Indicates whether the instruction status is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusReturnCriteria
	 * InstructionStatusReturnCriteria}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrStsRtrCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionStatusReturnCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the instruction status is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionStatusReturnCriteria = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "InstrStsRtrCrit";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionStatusReturnCriteria";
			definition = "Indicates whether the instruction status is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.InstructionStatusReturnCriteria.mmObject();
		}
	};
	protected RequestedIndicator instructedAmountIndicator;
	/**
	 * Indicates whether the instructed amount is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAmtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the instructed amount is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructedAmountIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "InstdAmtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountIndicator";
			definition = "Indicates whether the instructed amount is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator creditDebitIndicator;
	/**
	 * Indicates whether the credit debit indicator is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the credit debit indicator is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditDebitIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the credit debit indicator is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator interbankSettlementAmountIndicator;
	/**
	 * Indicates whether the interbank settlement amount is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttlmAmtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementAmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interbank settlement amount is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterbankSettlementAmountIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmAmtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementAmountIndicator";
			definition = "Indicates whether the interbank settlement amount is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator priorityIndicator;
	/**
	 * Indicates whether the payment priority is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the payment priority is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriorityIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "PrtyInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorityIndicator";
			definition = "Indicates whether the payment priority is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator processingValidityTimeIndicator;
	/**
	 * Indicates whether the processing validity time is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgVldtyTmInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingValidityTimeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the processing validity time is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProcessingValidityTimeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "PrcgVldtyTmInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingValidityTimeIndicator";
			definition = "Indicates whether the processing validity time is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator purposeIndicator;
	/**
	 * Indicates whether the transfer reason is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PurpInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurposeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the transfer reason is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPurposeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "PurpInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurposeIndicator";
			definition = "Indicates whether the transfer reason is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator instructionCopyIndicator;
	/**
	 * Indicates whether the instruction copy is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrCpyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCopyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the instruction copy is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionCopyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "InstrCpyInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCopyIndicator";
			definition = "Indicates whether the instruction copy is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator paymentMessageTypeIndicator;
	/**
	 * Indicates whether the payment message type is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMTInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMessageTypeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the payment message type is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentMessageTypeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "PmtMTInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMessageTypeIndicator";
			definition = "Indicates whether the payment message type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator paymentTypeIndicator;
	/**
	 * Indicates whether the payment type is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTpInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTypeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the payment type is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentTypeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "PmtTpInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTypeIndicator";
			definition = "Indicates whether the payment type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator transactionIdentificationIndicator;
	/**
	 * Indicates whether the transaction identification is requested. Usage:
	 * this is the former PaymentInstructionReference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction identification is requested.\nUsage:  this is the former PaymentInstructionReference. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentificationIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "TxIdInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationIndicator";
			definition = "Indicates whether the transaction identification is requested.\nUsage:  this is the former PaymentInstructionReference. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator interbankSettlementDateIndicator;
	/**
	 * Indicates whether the interbank settlement date is requested. Usage: this
	 * is the former InterbankValueDate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttlmDtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementDateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interbank settlement date is requested.\nUsage: this is the former InterbankValueDate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterbankSettlementDateIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmDtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementDateIndicator";
			definition = "Indicates whether the interbank settlement date is requested.\nUsage: this is the former InterbankValueDate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator endToEndIdentificationIndicator;
	/**
	 * Indicates whether the end-to-end identification is requested. Usage: this
	 * is the former RelatedReference
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndToEndIdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndToEndIdentificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the end-to-end identification is requested.\nUsage: this is the former RelatedReference"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEndToEndIdentificationIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "EndToEndIdInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndToEndIdentificationIndicator";
			definition = "Indicates whether the end-to-end identification is requested.\nUsage: this is the former RelatedReference";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator paymentMethodIndicator;
	/**
	 * Indicates whether the payment method is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMtdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMethodIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the payment method is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentMethodIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "PmtMtdInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethodIndicator";
			definition = "Indicates whether the payment method is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator debtorIndicator;
	/**
	 * Indicates whether the debtor is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the debtor is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDebtorIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "DbtrInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorIndicator";
			definition = "Indicates whether the debtor is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator debtorAgentIndicator;
	/**
	 * Indicates whether the debtor agent is requested. Usage: this is the
	 * former FirstAgent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the debtor agent is requested.\nUsage: this is the former FirstAgent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDebtorAgentIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentIndicator";
			definition = "Indicates whether the debtor agent is requested.\nUsage: this is the former FirstAgent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator instructingReimbursementAgentIndicator;
	/**
	 * Indicates whether the instructing reimbursement agent is requested.<br>
	 * Usage: this is the former InstructingAgentCorrespondent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgRmbrsmntAgtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingReimbursementAgentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the instructing reimbursement agent  is requested.\r\nUsage: this is the former InstructingAgentCorrespondent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructingReimbursementAgentIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "InstgRmbrsmntAgtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingReimbursementAgentIndicator";
			definition = "Indicates whether the instructing reimbursement agent  is requested.\r\nUsage: this is the former InstructingAgentCorrespondent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator instructedReimbursementAgentIndicator;
	/**
	 * Indicates whether the instructed reimbursement agent is requested.<br>
	 * Usage: this is the former InstructedAgentCorrespondent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdRmbrsmntAgtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedReimbursementAgentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the instructed reimbursement agent  is requested.\r\nUsage: this is the former InstructedAgentCorrespondent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructedReimbursementAgentIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "InstdRmbrsmntAgtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedReimbursementAgentIndicator";
			definition = "Indicates whether the instructed reimbursement agent  is requested.\r\nUsage: this is the former InstructedAgentCorrespondent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator intermediaryIndicator;
	/**
	 * Indicates whether the intermediary is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the intermediary is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntermediaryIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "IntrmyInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryIndicator";
			definition = "Indicates whether the intermediary is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator creditorAgentIndicator;
	/**
	 * Indicates whether the creditor agent is requested. Usage: this is the
	 * former FinalAgent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the creditor agent is requested.\nUsage: this is the former FinalAgent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditorAgentIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgentIndicator";
			definition = "Indicates whether the creditor agent is requested.\nUsage: this is the former FinalAgent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator creditorIndicator;
	/**
	 * Indicates whether the creditor is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
	 * PaymentReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the creditor is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditorIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "CdtrInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorIndicator";
			definition = "Indicates whether the creditor is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentReturnCriteria3.mmMessageIdentificationIndicator, com.tools20022.repository.msg.PaymentReturnCriteria3.mmRequestedExecutionDateIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria3.mmInstructionIndicator, com.tools20022.repository.msg.PaymentReturnCriteria3.mmInstructionStatusReturnCriteria,
						com.tools20022.repository.msg.PaymentReturnCriteria3.mmInstructedAmountIndicator, com.tools20022.repository.msg.PaymentReturnCriteria3.mmCreditDebitIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria3.mmInterbankSettlementAmountIndicator, com.tools20022.repository.msg.PaymentReturnCriteria3.mmPriorityIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria3.mmProcessingValidityTimeIndicator, com.tools20022.repository.msg.PaymentReturnCriteria3.mmPurposeIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria3.mmInstructionCopyIndicator, com.tools20022.repository.msg.PaymentReturnCriteria3.mmPaymentMessageTypeIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria3.mmPaymentTypeIndicator, com.tools20022.repository.msg.PaymentReturnCriteria3.mmTransactionIdentificationIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria3.mmInterbankSettlementDateIndicator, com.tools20022.repository.msg.PaymentReturnCriteria3.mmEndToEndIdentificationIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria3.mmPaymentMethodIndicator, com.tools20022.repository.msg.PaymentReturnCriteria3.mmDebtorIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria3.mmDebtorAgentIndicator, com.tools20022.repository.msg.PaymentReturnCriteria3.mmInstructingReimbursementAgentIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria3.mmInstructedReimbursementAgentIndicator, com.tools20022.repository.msg.PaymentReturnCriteria3.mmIntermediaryIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria3.mmCreditorAgentIndicator, com.tools20022.repository.msg.PaymentReturnCriteria3.mmCreditorIndicator);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentReturnCriteria3";
				definition = "Defines the criteria used to report on the payment.";
			}
		});
		return mmObject_lazy.get();
	}

	public RequestedIndicator getMessageIdentificationIndicator() {
		return messageIdentificationIndicator;
	}

	public void setMessageIdentificationIndicator(RequestedIndicator messageIdentificationIndicator) {
		this.messageIdentificationIndicator = messageIdentificationIndicator;
	}

	public RequestedIndicator getRequestedExecutionDateIndicator() {
		return requestedExecutionDateIndicator;
	}

	public void setRequestedExecutionDateIndicator(RequestedIndicator requestedExecutionDateIndicator) {
		this.requestedExecutionDateIndicator = requestedExecutionDateIndicator;
	}

	public RequestedIndicator getInstructionIndicator() {
		return instructionIndicator;
	}

	public void setInstructionIndicator(RequestedIndicator instructionIndicator) {
		this.instructionIndicator = instructionIndicator;
	}

	public InstructionStatusReturnCriteria getInstructionStatusReturnCriteria() {
		return instructionStatusReturnCriteria;
	}

	public void setInstructionStatusReturnCriteria(com.tools20022.repository.msg.InstructionStatusReturnCriteria instructionStatusReturnCriteria) {
		this.instructionStatusReturnCriteria = instructionStatusReturnCriteria;
	}

	public RequestedIndicator getInstructedAmountIndicator() {
		return instructedAmountIndicator;
	}

	public void setInstructedAmountIndicator(RequestedIndicator instructedAmountIndicator) {
		this.instructedAmountIndicator = instructedAmountIndicator;
	}

	public RequestedIndicator getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(RequestedIndicator creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	public RequestedIndicator getInterbankSettlementAmountIndicator() {
		return interbankSettlementAmountIndicator;
	}

	public void setInterbankSettlementAmountIndicator(RequestedIndicator interbankSettlementAmountIndicator) {
		this.interbankSettlementAmountIndicator = interbankSettlementAmountIndicator;
	}

	public RequestedIndicator getPriorityIndicator() {
		return priorityIndicator;
	}

	public void setPriorityIndicator(RequestedIndicator priorityIndicator) {
		this.priorityIndicator = priorityIndicator;
	}

	public RequestedIndicator getProcessingValidityTimeIndicator() {
		return processingValidityTimeIndicator;
	}

	public void setProcessingValidityTimeIndicator(RequestedIndicator processingValidityTimeIndicator) {
		this.processingValidityTimeIndicator = processingValidityTimeIndicator;
	}

	public RequestedIndicator getPurposeIndicator() {
		return purposeIndicator;
	}

	public void setPurposeIndicator(RequestedIndicator purposeIndicator) {
		this.purposeIndicator = purposeIndicator;
	}

	public RequestedIndicator getInstructionCopyIndicator() {
		return instructionCopyIndicator;
	}

	public void setInstructionCopyIndicator(RequestedIndicator instructionCopyIndicator) {
		this.instructionCopyIndicator = instructionCopyIndicator;
	}

	public RequestedIndicator getPaymentMessageTypeIndicator() {
		return paymentMessageTypeIndicator;
	}

	public void setPaymentMessageTypeIndicator(RequestedIndicator paymentMessageTypeIndicator) {
		this.paymentMessageTypeIndicator = paymentMessageTypeIndicator;
	}

	public RequestedIndicator getPaymentTypeIndicator() {
		return paymentTypeIndicator;
	}

	public void setPaymentTypeIndicator(RequestedIndicator paymentTypeIndicator) {
		this.paymentTypeIndicator = paymentTypeIndicator;
	}

	public RequestedIndicator getTransactionIdentificationIndicator() {
		return transactionIdentificationIndicator;
	}

	public void setTransactionIdentificationIndicator(RequestedIndicator transactionIdentificationIndicator) {
		this.transactionIdentificationIndicator = transactionIdentificationIndicator;
	}

	public RequestedIndicator getInterbankSettlementDateIndicator() {
		return interbankSettlementDateIndicator;
	}

	public void setInterbankSettlementDateIndicator(RequestedIndicator interbankSettlementDateIndicator) {
		this.interbankSettlementDateIndicator = interbankSettlementDateIndicator;
	}

	public RequestedIndicator getEndToEndIdentificationIndicator() {
		return endToEndIdentificationIndicator;
	}

	public void setEndToEndIdentificationIndicator(RequestedIndicator endToEndIdentificationIndicator) {
		this.endToEndIdentificationIndicator = endToEndIdentificationIndicator;
	}

	public RequestedIndicator getPaymentMethodIndicator() {
		return paymentMethodIndicator;
	}

	public void setPaymentMethodIndicator(RequestedIndicator paymentMethodIndicator) {
		this.paymentMethodIndicator = paymentMethodIndicator;
	}

	public RequestedIndicator getDebtorIndicator() {
		return debtorIndicator;
	}

	public void setDebtorIndicator(RequestedIndicator debtorIndicator) {
		this.debtorIndicator = debtorIndicator;
	}

	public RequestedIndicator getDebtorAgentIndicator() {
		return debtorAgentIndicator;
	}

	public void setDebtorAgentIndicator(RequestedIndicator debtorAgentIndicator) {
		this.debtorAgentIndicator = debtorAgentIndicator;
	}

	public RequestedIndicator getInstructingReimbursementAgentIndicator() {
		return instructingReimbursementAgentIndicator;
	}

	public void setInstructingReimbursementAgentIndicator(RequestedIndicator instructingReimbursementAgentIndicator) {
		this.instructingReimbursementAgentIndicator = instructingReimbursementAgentIndicator;
	}

	public RequestedIndicator getInstructedReimbursementAgentIndicator() {
		return instructedReimbursementAgentIndicator;
	}

	public void setInstructedReimbursementAgentIndicator(RequestedIndicator instructedReimbursementAgentIndicator) {
		this.instructedReimbursementAgentIndicator = instructedReimbursementAgentIndicator;
	}

	public RequestedIndicator getIntermediaryIndicator() {
		return intermediaryIndicator;
	}

	public void setIntermediaryIndicator(RequestedIndicator intermediaryIndicator) {
		this.intermediaryIndicator = intermediaryIndicator;
	}

	public RequestedIndicator getCreditorAgentIndicator() {
		return creditorAgentIndicator;
	}

	public void setCreditorAgentIndicator(RequestedIndicator creditorAgentIndicator) {
		this.creditorAgentIndicator = creditorAgentIndicator;
	}

	public RequestedIndicator getCreditorIndicator() {
		return creditorIndicator;
	}

	public void setCreditorIndicator(RequestedIndicator creditorIndicator) {
		this.creditorIndicator = creditorIndicator;
	}
}