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
import com.tools20022.repository.choice.AmountType2Choice;
import com.tools20022.repository.choice.Purpose1Choice;
import com.tools20022.repository.codeset.ChargeBearerType1Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.ChequeIssue;
import com.tools20022.repository.entity.CreditTransfer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Set of elements providing information specific to the individual
 * transaction(s) included in the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmPaymentIdentification
 * CreditTransferTransactionInformation1.mmPaymentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmPaymentTypeInformation
 * CreditTransferTransactionInformation1.mmPaymentTypeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmAmount
 * CreditTransferTransactionInformation1.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmExchangeRateInformation
 * CreditTransferTransactionInformation1.mmExchangeRateInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmChargeBearer
 * CreditTransferTransactionInformation1.mmChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmChequeInstruction
 * CreditTransferTransactionInformation1.mmChequeInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmUltimateDebtor
 * CreditTransferTransactionInformation1.mmUltimateDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmIntermediaryAgent1
 * CreditTransferTransactionInformation1.mmIntermediaryAgent1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmIntermediaryAgent1Account
 * CreditTransferTransactionInformation1.mmIntermediaryAgent1Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmIntermediaryAgent2
 * CreditTransferTransactionInformation1.mmIntermediaryAgent2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmIntermediaryAgent2Account
 * CreditTransferTransactionInformation1.mmIntermediaryAgent2Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmIntermediaryAgent3
 * CreditTransferTransactionInformation1.mmIntermediaryAgent3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmIntermediaryAgent3Account
 * CreditTransferTransactionInformation1.mmIntermediaryAgent3Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmCreditorAgent
 * CreditTransferTransactionInformation1.mmCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmCreditorAgentAccount
 * CreditTransferTransactionInformation1.mmCreditorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmCreditor
 * CreditTransferTransactionInformation1.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmCreditorAccount
 * CreditTransferTransactionInformation1.mmCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmUltimateCreditor
 * CreditTransferTransactionInformation1.mmUltimateCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmInstructionForCreditorAgent
 * CreditTransferTransactionInformation1.mmInstructionForCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmInstructionForDebtorAgent
 * CreditTransferTransactionInformation1.mmInstructionForDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmPurpose
 * CreditTransferTransactionInformation1.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmRegulatoryReporting
 * CreditTransferTransactionInformation1.mmRegulatoryReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmTax
 * CreditTransferTransactionInformation1.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmRelatedRemittanceInformation
 * CreditTransferTransactionInformation1.mmRelatedRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmRemittanceInformation
 * CreditTransferTransactionInformation1.mmRemittanceInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CreditTransfer
 * CreditTransfer}</li>
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
 * "CreditTransferTransactionInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements providing information specific to the individual transaction(s) included in the message."
 * </li>
 * </ul>
 */
public class CreditTransferTransactionInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentIdentification1 paymentIdentification;
	/**
	 * Set of elements to reference a payment instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentIdentification1
	 * PaymentIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentRelatedIdentifications
	 * Payment.mmPaymentRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of elements to reference a payment instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmPaymentRelatedIdentifications;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "PmtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentIdentification";
			definition = "Set of elements to reference a payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentIdentification1.mmObject();
		}
	};
	protected PaymentTypeInformation1 paymentTypeInformation;
	/**
	 * Set of elements used to further specify the type of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation1
	 * PaymentTypeInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmProcessingInstructions
	 * PaymentExecution.mmProcessingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTpInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTypeInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to further specify the type of transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentTypeInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmProcessingInstructions;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "PmtTpInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTypeInformation";
			definition = "Set of elements used to further specify the type of transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTypeInformation1.mmObject();
		}
	};
	protected AmountType2Choice amount;
	/**
	 * Amount of money to be moved between the debtor and creditor, before
	 * deduction of charges, expressed in the currency as ordered by the
	 * initiating party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.AmountType2Choice
	 * AmountType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmInstructedAmount;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountType2Choice.mmObject();
		}
	};
	protected ExchangeRateInformation1 exchangeRateInformation;
	/**
	 * Further detailed information on the exchange rate specified in the
	 * payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeRateInformation1
	 * ExchangeRateInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
	 * Payment.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRateInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRateInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further detailed information on the exchange rate specified in the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExchangeRateInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmCurrencyExchange;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "XchgRateInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRateInformation";
			definition = "Further detailed information on the exchange rate specified in the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExchangeRateInformation1.mmObject();
		}
	};
	protected ChargeBearerType1Code chargeBearer;
	/**
	 * Specifies which party/parties will bear the charges associated with the
	 * processing of the payment transaction.
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
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
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
	 * "Specifies which party/parties will bear the charges associated with the processing of the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargeBearer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Charges.mmBearerType;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "ChrgBr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearer";
			definition = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ChargeBearerType1Code.mmObject();
		}
	};
	protected Cheque5 chequeInstruction;
	/**
	 * Information related to the issuance of a cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cheque5 Cheque5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChqInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the issuance of a cheque."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChequeInstruction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ChequeIssue.mmObject();
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "ChqInstr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstruction";
			definition = "Information related to the issuance of a cheque.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Cheque5.mmObject();
		}
	};
	protected PartyIdentification8 ultimateDebtor;
	/**
	 * Ultimate party that owes an amount of money to the (ultimate) creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification8
	 * PartyIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtDbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ultimate party that owes an amount of money to the (ultimate) creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUltimateDebtor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "UltmtDbtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtor";
			definition = "Ultimate party that owes an amount of money to the (ultimate) creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification8.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification3 intermediaryAgent1;
	/**
	 * Agent between the debtor agent and creditor agent.
	 * 
	 * Usage: If more than one intermediary agent is present, then
	 * IntermediaryAgent1 identifies the agent between the debtor agent and the
	 * intermediary agent 2.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3
	 * BranchAndFinancialInstitutionIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor agent and creditor agent.\n\nUsage: If more than one intermediary agent is present, then IntermediaryAgent1 identifies the agent between the debtor agent and the intermediary agent 2."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryAgent1 = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt1";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1";
			definition = "Agent between the debtor agent and creditor agent.\n\nUsage: If more than one intermediary agent is present, then IntermediaryAgent1 identifies the agent between the debtor agent and the intermediary agent 2.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3.mmObject();
		}
	};
	protected CashAccount7 intermediaryAgent1Account;
	/**
	 * Unambiguous identification of the account of the intermediary agent 1 at
	 * its servicing agent in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt1Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the intermediary agent 1 at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryAgent1Account = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt1Acct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1Account";
			definition = "Unambiguous identification of the account of the intermediary agent 1 at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount7.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification3 intermediaryAgent2;
	/**
	 * Agent between the debtor agent and creditor agent.
	 * 
	 * Usage: If more than two intermediary agents are present, then
	 * IntermediaryAgent2 identifies the agent between the intermediary agent 1
	 * and the intermediary agent 3.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3
	 * BranchAndFinancialInstitutionIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor agent and creditor agent.\n\nUsage: If more than two intermediary agents are present, then IntermediaryAgent2 identifies the agent between the intermediary agent 1 and the intermediary agent 3."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryAgent2 = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt2";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent2";
			definition = "Agent between the debtor agent and creditor agent.\n\nUsage: If more than two intermediary agents are present, then IntermediaryAgent2 identifies the agent between the intermediary agent 1 and the intermediary agent 3.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3.mmObject();
		}
	};
	protected CashAccount7 intermediaryAgent2Account;
	/**
	 * Unambiguous identification of the account of the intermediary agent 2 at
	 * its servicing agent in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt2Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent2Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the intermediary agent 2 at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryAgent2Account = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt2Acct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent2Account";
			definition = "Unambiguous identification of the account of the intermediary agent 2 at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount7.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification3 intermediaryAgent3;
	/**
	 * Agent between the debtor agent and creditor agent.
	 * 
	 * Usage: If IntermediaryAgent3 is present, then it identifies the agent
	 * between the intermediary agent 2 and the creditor agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3
	 * BranchAndFinancialInstitutionIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor agent and creditor agent.\n\nUsage: If IntermediaryAgent3 is present, then it identifies the agent between the intermediary agent 2 and the creditor agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryAgent3 = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt3";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3";
			definition = "Agent between the debtor agent and creditor agent.\n\nUsage: If IntermediaryAgent3 is present, then it identifies the agent between the intermediary agent 2 and the creditor agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3.mmObject();
		}
	};
	protected CashAccount7 intermediaryAgent3Account;
	/**
	 * Unambiguous identification of the account of the intermediary agent 3 at
	 * its servicing agent in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt3Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the intermediary agent 3 at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryAgent3Account = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt3Acct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Account";
			definition = "Unambiguous identification of the account of the intermediary agent 3 at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount7.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification3 creditorAgent;
	/**
	 * Financial institution servicing an account for the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3
	 * BranchAndFinancialInstitutionIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the creditor."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution servicing an account for the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3.mmObject();
		}
	};
	protected CashAccount7 creditorAgentAccount;
	/**
	 * Unambiguous identification of the account of the creditor agent at its
	 * servicing agent to which a credit entry will be made as a result of the
	 * payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the creditor agent at its servicing agent to which a credit entry will be made as a result of the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgtAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgentAccount";
			definition = "Unambiguous identification of the account of the creditor agent at its servicing agent to which a credit entry will be made as a result of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount7.mmObject();
		}
	};
	protected PartyIdentification8 creditor;
	/**
	 * Party to which an amount of money is due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification8
	 * PartyIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to which an amount of money is due."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party to which an amount of money is due.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification8.mmObject();
		}
	};
	protected CashAccount7 creditorAccount;
	/**
	 * Unambiguous identification of the account of the creditor to which a
	 * credit entry will be posted as a result of the payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "CdtrAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccount";
			definition = "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount7.mmObject();
		}
	};
	protected PartyIdentification8 ultimateCreditor;
	/**
	 * Ultimate party to which an amount of money is due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification8
	 * PartyIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtCdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ultimate party to which an amount of money is due."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUltimateCreditor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "UltmtCdtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditor";
			definition = "Ultimate party to which an amount of money is due.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification8.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InstructionForCreditorAgent1> instructionForCreditorAgent;
	/**
	 * Further information related to the processing of the payment instruction,
	 * provided by the initiating party, and intended for the creditor agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InstructionForCreditorAgent1
	 * InstructionForCreditorAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructionForCreditorAgent
	 * Payment.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrForCdtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForCreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction, provided by the initiating party, and intended for the creditor agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructionForCreditorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmInstructionForCreditorAgent;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "InstrForCdtrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionForCreditorAgent";
			definition = "Further information related to the processing of the payment instruction, provided by the initiating party, and intended for the creditor agent.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InstructionForCreditorAgent1.mmObject();
		}
	};
	protected Max140Text instructionForDebtorAgent;
	/**
	 * Further information related to the processing of the payment instruction
	 * that may need to be acted upon by the debtor agent, depending on
	 * agreement between debtor and the debtor agent.
	 * 
	 * Usage: The instruction can relate to a level of service, can be an
	 * instruction to be executed by the debtor's agent, or can be information
	 * required by the debtor's agent to process the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructionForDebtorAgent
	 * Payment.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrForDbtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForDebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction that may need to be acted upon by the debtor agent, depending on agreement between debtor and the debtor agent.  \n\nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the debtor's agent, or can be information required by the debtor's agent to process the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionForDebtorAgent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmInstructionForDebtorAgent;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "InstrForDbtrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionForDebtorAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the debtor agent, depending on agreement between debtor and the debtor agent.  \n\nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the debtor's agent, or can be information required by the debtor's agent to process the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Purpose1Choice purpose;
	/**
	 * Underlying reason for the payment transaction, eg, a charity payment, or
	 * a commercial agreement between the creditor and the debtor.
	 * 
	 * Usage: purpose is used by the end-customers, ie originating party,
	 * initiating party, debtor, creditor, final party, to provide information
	 * concerning the nature of the payment transaction. Purpose is a content
	 * element, which is not used for processing by any of the agents involved
	 * in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Purpose1Choice
	 * Purpose1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPurpose
	 * PaymentObligation.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying reason for the payment transaction, eg, a charity payment, or a commercial agreement between the creditor and the debtor.  \n\nUsage: purpose is used by the end-customers, ie originating party, initiating party, debtor, creditor, final party, to provide information concerning the nature of the payment transaction. Purpose is a content element, which is not used for processing by any of the agents involved in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPurpose = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmPurpose;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Underlying reason for the payment transaction, eg, a charity payment, or a commercial agreement between the creditor and the debtor.  \n\nUsage: purpose is used by the end-customers, ie originating party, initiating party, debtor, creditor, final party, to provide information concerning the nature of the payment transaction. Purpose is a content element, which is not used for processing by any of the agents involved in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Purpose1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.RegulatoryReporting2> regulatoryReporting;
	/**
	 * Information needed due to regulatory and statutory requirements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RegulatoryReporting2
	 * RegulatoryReporting2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmRegulatoryReport
	 * FinancialTransaction.mmRegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgltryRptg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryReporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information needed due to regulatory and statutory requirements."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRegulatoryReporting = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.mmRegulatoryReport;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "RgltryRptg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryReporting";
			definition = "Information needed due to regulatory and statutory requirements.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting2.mmObject();
		}
	};
	protected TaxInformation2 tax;
	/**
	 * Amount of money due to the government or tax authority, according to
	 * various pre-defined parameters such as thresholds or income.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxInformation2
	 * TaxInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmTaxOnPayment
	 * Payment.mmTaxOnPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmTaxOnPayment;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxInformation2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.RemittanceLocation1> relatedRemittanceInformation;
	/**
	 * Information related to the handling of the remittance information by any
	 * of the agents in the transaction processing chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RemittanceLocation1
	 * RemittanceLocation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRemittanceLocation
	 * PaymentObligation.mmRemittanceLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the handling of the remittance information by any of the agents in the transaction processing chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedRemittanceInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmRemittanceLocation;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "RltdRmtInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedRemittanceInformation";
			definition = "Information related to the handling of the remittance information by any of the agents in the transaction processing chain.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RemittanceLocation1.mmObject();
		}
	};
	protected RemittanceInformation1 remittanceInformation;
	/**
	 * Information that enables the matching, ie, reconciliation, of a payment
	 * with the items that the payment is intended to settle, eg, commercial
	 * invoices in an account receivable system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RemittanceInformation1
	 * RemittanceInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
	 * PaymentObligation.mmAssociatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that enables the matching, ie, reconciliation, of a payment with the items that the payment is intended to settle, eg, commercial invoices in an account receivable system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRemittanceInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmAssociatedDocument;
			componentContext_lazy = () -> CreditTransferTransactionInformation1.mmObject();
			isDerived = false;
			xmlTag = "RmtInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceInformation";
			definition = "Information that enables the matching, ie, reconciliation, of a payment with the items that the payment is intended to settle, eg, commercial invoices in an account receivable system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RemittanceInformation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmPaymentIdentification,
						com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmPaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmAmount,
						com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmExchangeRateInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmChargeBearer,
						com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmChequeInstruction, com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmUltimateDebtor,
						com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmIntermediaryAgent1, com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmIntermediaryAgent1Account,
						com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmIntermediaryAgent2, com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmIntermediaryAgent2Account,
						com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmIntermediaryAgent3, com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmIntermediaryAgent3Account,
						com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmCreditorAgent, com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmCreditorAgentAccount,
						com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmCreditor, com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmCreditorAccount,
						com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmUltimateCreditor, com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmInstructionForCreditorAgent,
						com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmInstructionForDebtorAgent, com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmPurpose,
						com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmRegulatoryReporting, com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmTax,
						com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmRelatedRemittanceInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmRemittanceInformation);
				trace_lazy = () -> CreditTransfer.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CreditTransferTransactionInformation1";
				definition = "Set of elements providing information specific to the individual transaction(s) included in the message.";
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentIdentification1 getPaymentIdentification() {
		return paymentIdentification;
	}

	public void setPaymentIdentification(com.tools20022.repository.msg.PaymentIdentification1 paymentIdentification) {
		this.paymentIdentification = paymentIdentification;
	}

	public PaymentTypeInformation1 getPaymentTypeInformation() {
		return paymentTypeInformation;
	}

	public void setPaymentTypeInformation(com.tools20022.repository.msg.PaymentTypeInformation1 paymentTypeInformation) {
		this.paymentTypeInformation = paymentTypeInformation;
	}

	public AmountType2Choice getAmount() {
		return amount;
	}

	public void setAmount(AmountType2Choice amount) {
		this.amount = amount;
	}

	public ExchangeRateInformation1 getExchangeRateInformation() {
		return exchangeRateInformation;
	}

	public void setExchangeRateInformation(com.tools20022.repository.msg.ExchangeRateInformation1 exchangeRateInformation) {
		this.exchangeRateInformation = exchangeRateInformation;
	}

	public ChargeBearerType1Code getChargeBearer() {
		return chargeBearer;
	}

	public void setChargeBearer(ChargeBearerType1Code chargeBearer) {
		this.chargeBearer = chargeBearer;
	}

	public Cheque5 getChequeInstruction() {
		return chequeInstruction;
	}

	public void setChequeInstruction(com.tools20022.repository.msg.Cheque5 chequeInstruction) {
		this.chequeInstruction = chequeInstruction;
	}

	public PartyIdentification8 getUltimateDebtor() {
		return ultimateDebtor;
	}

	public void setUltimateDebtor(com.tools20022.repository.msg.PartyIdentification8 ultimateDebtor) {
		this.ultimateDebtor = ultimateDebtor;
	}

	public BranchAndFinancialInstitutionIdentification3 getIntermediaryAgent1() {
		return intermediaryAgent1;
	}

	public void setIntermediaryAgent1(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3 intermediaryAgent1) {
		this.intermediaryAgent1 = intermediaryAgent1;
	}

	public CashAccount7 getIntermediaryAgent1Account() {
		return intermediaryAgent1Account;
	}

	public void setIntermediaryAgent1Account(com.tools20022.repository.msg.CashAccount7 intermediaryAgent1Account) {
		this.intermediaryAgent1Account = intermediaryAgent1Account;
	}

	public BranchAndFinancialInstitutionIdentification3 getIntermediaryAgent2() {
		return intermediaryAgent2;
	}

	public void setIntermediaryAgent2(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3 intermediaryAgent2) {
		this.intermediaryAgent2 = intermediaryAgent2;
	}

	public CashAccount7 getIntermediaryAgent2Account() {
		return intermediaryAgent2Account;
	}

	public void setIntermediaryAgent2Account(com.tools20022.repository.msg.CashAccount7 intermediaryAgent2Account) {
		this.intermediaryAgent2Account = intermediaryAgent2Account;
	}

	public BranchAndFinancialInstitutionIdentification3 getIntermediaryAgent3() {
		return intermediaryAgent3;
	}

	public void setIntermediaryAgent3(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3 intermediaryAgent3) {
		this.intermediaryAgent3 = intermediaryAgent3;
	}

	public CashAccount7 getIntermediaryAgent3Account() {
		return intermediaryAgent3Account;
	}

	public void setIntermediaryAgent3Account(com.tools20022.repository.msg.CashAccount7 intermediaryAgent3Account) {
		this.intermediaryAgent3Account = intermediaryAgent3Account;
	}

	public BranchAndFinancialInstitutionIdentification3 getCreditorAgent() {
		return creditorAgent;
	}

	public void setCreditorAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3 creditorAgent) {
		this.creditorAgent = creditorAgent;
	}

	public CashAccount7 getCreditorAgentAccount() {
		return creditorAgentAccount;
	}

	public void setCreditorAgentAccount(com.tools20022.repository.msg.CashAccount7 creditorAgentAccount) {
		this.creditorAgentAccount = creditorAgentAccount;
	}

	public PartyIdentification8 getCreditor() {
		return creditor;
	}

	public void setCreditor(com.tools20022.repository.msg.PartyIdentification8 creditor) {
		this.creditor = creditor;
	}

	public CashAccount7 getCreditorAccount() {
		return creditorAccount;
	}

	public void setCreditorAccount(com.tools20022.repository.msg.CashAccount7 creditorAccount) {
		this.creditorAccount = creditorAccount;
	}

	public PartyIdentification8 getUltimateCreditor() {
		return ultimateCreditor;
	}

	public void setUltimateCreditor(com.tools20022.repository.msg.PartyIdentification8 ultimateCreditor) {
		this.ultimateCreditor = ultimateCreditor;
	}

	public List<InstructionForCreditorAgent1> getInstructionForCreditorAgent() {
		return instructionForCreditorAgent;
	}

	public void setInstructionForCreditorAgent(List<com.tools20022.repository.msg.InstructionForCreditorAgent1> instructionForCreditorAgent) {
		this.instructionForCreditorAgent = instructionForCreditorAgent;
	}

	public Max140Text getInstructionForDebtorAgent() {
		return instructionForDebtorAgent;
	}

	public void setInstructionForDebtorAgent(Max140Text instructionForDebtorAgent) {
		this.instructionForDebtorAgent = instructionForDebtorAgent;
	}

	public Purpose1Choice getPurpose() {
		return purpose;
	}

	public void setPurpose(Purpose1Choice purpose) {
		this.purpose = purpose;
	}

	public List<RegulatoryReporting2> getRegulatoryReporting() {
		return regulatoryReporting;
	}

	public void setRegulatoryReporting(List<com.tools20022.repository.msg.RegulatoryReporting2> regulatoryReporting) {
		this.regulatoryReporting = regulatoryReporting;
	}

	public TaxInformation2 getTax() {
		return tax;
	}

	public void setTax(com.tools20022.repository.msg.TaxInformation2 tax) {
		this.tax = tax;
	}

	public List<RemittanceLocation1> getRelatedRemittanceInformation() {
		return relatedRemittanceInformation;
	}

	public void setRelatedRemittanceInformation(List<com.tools20022.repository.msg.RemittanceLocation1> relatedRemittanceInformation) {
		this.relatedRemittanceInformation = relatedRemittanceInformation;
	}

	public RemittanceInformation1 getRemittanceInformation() {
		return remittanceInformation;
	}

	public void setRemittanceInformation(com.tools20022.repository.msg.RemittanceInformation1 remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
	}
}