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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Process required for executing an end to end payment. It consists of a
 * payment initiation which may be followed by a series of instructions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentExecution" src="doc-files/PaymentExecution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCreditDebitIndicator
 * PaymentExecution.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCreationDate
 * PaymentExecution.mmCreationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmAcceptanceDateTime
 * PaymentExecution.mmAcceptanceDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#mmPayment
 * PaymentExecution.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmProcessingInstructions
 * PaymentExecution.mmProcessingInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRequestedExecutionDate
 * PaymentExecution.mmRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRelatedInvestigationCase
 * PaymentExecution.mmRelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRelatedInvestigationCaseResolution
 * PaymentExecution.mmRelatedInvestigationCaseResolution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#mmNext
 * PaymentExecution.mmNext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCurrencyExchange
 * PaymentExecution.mmCurrencyExchange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentInitiation
 * PaymentInitiation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
 * Payment.mmPaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmPrevious
 * PaymentInstruction.mmPrevious}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmPaymentExecution
 * PaymentProcessing.mmPaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmPaymentExecution
 * CurrencyExchange.mmPaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingInstruction
 * PaymentInvestigationCase.mmUnderlyingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmPaymentExecutionCorrection
 * PaymentInvestigationCaseResolution.mmPaymentExecutionCorrection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmPaymentTypeInformation
 * RequestedModification3.mmPaymentTypeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmPaymentTypeInformation
 * RequestedModification4.mmPaymentTypeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmPaymentTypeInformation
 * RequestedModification5.mmPaymentTypeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmPaymentTypeInformation
 * RequestedModification6.mmPaymentTypeInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDates1
 * TransactionDates1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDates2
 * TransactionDates2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader4
 * OriginalGroupHeader4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader3
 * OriginalGroupHeader3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader1
 * OriginalGroupHeader1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader2
 * OriginalGroupHeader2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader5
 * OriginalGroupHeader5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader67 GroupHeader67}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader7
 * OriginalGroupHeader7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader6
 * OriginalGroupHeader6}</li>
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
 * "PaymentExecution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Process required for executing an end to end payment. It consists of a payment initiation which may be followed by a series of instructions."
 * </li>
 * </ul>
 */
public class PaymentExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected DebitCreditCode creditDebitIndicator;
	/**
	 * Indicates whether the payment is a debit or a credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#mmCreditDebitIndicator
	 * PaymentInstructionReference2Details.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#mmCreditDebitIndicator
	 * PaymentSearch2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmCreditDebitIndicator
	 * PaymentSearch3.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmCreditDebitIndicator
	 * PaymentSearch4.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction3#mmCreditDebitIndicator
	 * Transaction3.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction4#mmCreditDebitIndicator
	 * Transaction4.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction5#mmCreditDebitIndicator
	 * Transaction5.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction24#mmCreditDebitIndicator
	 * Transaction24.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection8#mmCreditDebitIndicator
	 * AmountAndDirection8.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection32#mmCreditDebitIndicator
	 * AmountAndDirection32.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9#mmCreditDebitIndicator
	 * AmountAndDirection9.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection12#mmCreditDebitIndicator
	 * AmountAndDirection12.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection33#mmCreditDebitIndicator
	 * AmountAndDirection33.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection17#mmCreditDebitIndicator
	 * AmountAndDirection17.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection24#mmCreditDebitIndicator
	 * AmountAndDirection24.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection5#mmCreditDebit
	 * AmountAndDirection5.mmCreditDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection4#mmCreditDebitIndicator
	 * AmountAndDirection4.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection2#mmCreditDebitIndicator
	 * AmountAndDirection2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection19#mmCreditDebit
	 * AmountAndDirection19.mmCreditDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection13#mmCreditDebitIndicator
	 * AmountAndDirection13.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection16#mmCreditDebitIndicator
	 * AmountAndDirection16.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection7#mmCreditDebitIndicator
	 * AmountAndDirection7.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection15#mmCreditDebitIndicator
	 * AmountAndDirection15.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection3#mmCreditDebit
	 * AmountAndDirection3.mmCreditDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection18#mmCreditDebit
	 * AmountAndDirection18.mmCreditDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection1#mmCreditDebit
	 * AmountAndDirection1.mmCreditDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29#mmCreditDebitIndicator
	 * AmountAndDirection29.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28#mmCreditDebitIndicator
	 * AmountAndDirection28.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection10#mmCreditDebitIndicator
	 * AmountAndDirection10.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection22#mmCreditDebitIndicator
	 * AmountAndDirection22.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection23#mmCreditDebitIndicator
	 * AmountAndDirection23.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection20#mmCreditDebitIndicator
	 * AmountAndDirection20.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection11#mmCreditDebitIndicator
	 * AmountAndDirection11.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection25#mmCreditDebitIndicator
	 * AmountAndDirection25.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection26#mmCreditDebitIndicator
	 * AmountAndDirection26.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection27#mmCreditDebitIndicator
	 * AmountAndDirection27.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection21#mmCreditDebitIndicator
	 * AmountAndDirection21.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmCreditDebitIndicator
	 * PaymentSearch5.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction33#mmCreditDebitIndicator
	 * Transaction33.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection36#mmCreditDebitIndicator
	 * AmountAndDirection36.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection37#mmCreditDebitIndicator
	 * AmountAndDirection37.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection38#mmCreditDebitIndicator
	 * AmountAndDirection38.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection40#mmCreditDebitIndicator
	 * AmountAndDirection40.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection46#mmCreditDebitIndicator
	 * AmountAndDirection46.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection49#mmCreditDebitIndicator
	 * AmountAndDirection49.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection48#mmCreditDebitIndicator
	 * AmountAndDirection48.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44#mmCreditDebitIndicator
	 * AmountAndDirection44.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection45#mmCreditDebitIndicator
	 * AmountAndDirection45.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection51#mmCreditDebitIndicator
	 * AmountAndDirection51.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection52#mmCreditDebitIndicator
	 * AmountAndDirection52.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection47#mmCreditDebitIndicator
	 * AmountAndDirection47.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmCreditDebit
	 * CashAccount33.mmCreditDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection66#mmCreditDebitIndicator
	 * AmountAndDirection66.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection60#mmCreditDebitIndicator
	 * AmountAndDirection60.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection71#mmCreditDebitIndicator
	 * AmountAndDirection71.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection57#mmCreditDebitIndicator
	 * AmountAndDirection57.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection85#mmCreditDebitIndicator
	 * AmountAndDirection85.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection55#mmCreditDebitIndicator
	 * AmountAndDirection55.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection59#mmCreditDebitIndicator
	 * AmountAndDirection59.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection58#mmCreditDebitIndicator
	 * AmountAndDirection58.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection72#mmCreditDebitIndicator
	 * AmountAndDirection72.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection67#mmCreditDebitIndicator
	 * AmountAndDirection67.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the payment is a debit or a credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionReference2Details.mmCreditDebitIndicator, com.tools20022.repository.msg.PaymentSearch2.mmCreditDebitIndicator,
					com.tools20022.repository.msg.PaymentSearch3.mmCreditDebitIndicator, com.tools20022.repository.msg.PaymentSearch4.mmCreditDebitIndicator, com.tools20022.repository.msg.Transaction3.mmCreditDebitIndicator,
					com.tools20022.repository.msg.Transaction4.mmCreditDebitIndicator, com.tools20022.repository.msg.Transaction5.mmCreditDebitIndicator, com.tools20022.repository.msg.Transaction24.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection8.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection32.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection9.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection12.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection33.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection17.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection24.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection5.mmCreditDebit, com.tools20022.repository.msg.AmountAndDirection4.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection2.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection19.mmCreditDebit, com.tools20022.repository.msg.AmountAndDirection13.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection16.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection7.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection15.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection3.mmCreditDebit, com.tools20022.repository.msg.AmountAndDirection18.mmCreditDebit,
					com.tools20022.repository.msg.AmountAndDirection1.mmCreditDebit, com.tools20022.repository.msg.AmountAndDirection29.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection28.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection10.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection22.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection23.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection20.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection11.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection25.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection26.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection27.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection21.mmCreditDebitIndicator, com.tools20022.repository.msg.PaymentSearch5.mmCreditDebitIndicator, com.tools20022.repository.msg.Transaction33.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection36.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection37.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection38.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection40.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection46.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection49.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection48.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection44.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection45.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection51.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection52.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection47.mmCreditDebitIndicator, com.tools20022.repository.msg.CashAccount33.mmCreditDebit,
					com.tools20022.repository.msg.AmountAndDirection66.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection60.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection71.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection57.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection85.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection55.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection59.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection58.mmCreditDebitIndicator,
					com.tools20022.repository.msg.AmountAndDirection72.mmCreditDebitIndicator, com.tools20022.repository.msg.AmountAndDirection67.mmCreditDebitIndicator);
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the payment is a debit or a credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	protected ISODateTime creationDate;
	/**
	 * Date and time at which the payment execution was created by the
	 * instructing agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader23#mmCreationDateTime
	 * GroupHeader23.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader42#mmCreationDateTime
	 * GroupHeader42.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader58#mmCreationDateTime
	 * GroupHeader58.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader1#mmCreationDateTime
	 * GroupHeader1.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader32#mmCreationDateTime
	 * GroupHeader32.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader48#mmCreationDateTime
	 * GroupHeader48.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader39#mmCreationDateTime
	 * GroupHeader39.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader55#mmCreationDateTime
	 * GroupHeader55.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader7#mmCreationDateTime
	 * GroupHeader7.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation4#mmOriginalCreationDateTime
	 * OriginalGroupInformation4.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation23#mmOriginalCreationDateTime
	 * OriginalGroupInformation23.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation3#mmOriginalCreationDateTime
	 * OriginalGroupInformation3.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader4#mmOriginalCreationDateTime
	 * OriginalGroupHeader4.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader8#mmCreationDateTime
	 * GroupHeader8.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation5#mmOriginalCreationDateTime
	 * OriginalGroupInformation5.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader40#mmCreationDateTime
	 * GroupHeader40.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation22#mmOriginalCreationDateTime
	 * OriginalGroupInformation22.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader56#mmCreationDateTime
	 * GroupHeader56.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3#mmOriginalCreationDateTime
	 * OriginalGroupHeader3.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader5#mmCreationDateTime
	 * GroupHeader5.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation1#mmOriginalCreationDateTime
	 * OriginalGroupInformation1.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader36#mmCreationDateTime
	 * GroupHeader36.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation20#mmOriginalCreationDateTime
	 * OriginalGroupInformation20.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader52#mmCreationDateTime
	 * GroupHeader52.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1#mmOriginalCreationDateTime
	 * OriginalGroupHeader1.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader2#mmCreationDateTime
	 * GroupHeader2.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader33#mmCreationDateTime
	 * GroupHeader33.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader49#mmCreationDateTime
	 * GroupHeader49.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader3#mmCreationDateTime
	 * GroupHeader3.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader34#mmCreationDateTime
	 * GroupHeader34.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#mmCreationDateTime
	 * GroupHeader50.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader9#mmCreationDateTime
	 * GroupHeader9.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader41#mmCreationDateTime
	 * GroupHeader41.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader57#mmCreationDateTime
	 * GroupHeader57.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader37#mmCreationDateTime
	 * GroupHeader37.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader53#mmCreationDateTime
	 * GroupHeader53.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader4#mmCreationDateTime
	 * GroupHeader4.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader35#mmCreationDateTime
	 * GroupHeader35.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader51#mmCreationDateTime
	 * GroupHeader51.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader31#mmCreationDateTime
	 * GroupHeader31.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader47#mmCreationDateTime
	 * GroupHeader47.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader6#mmCreationDateTime
	 * GroupHeader6.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation2#mmOriginalCreationDateTime
	 * OriginalGroupInformation2.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader38#mmCreationDateTime
	 * GroupHeader38.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation21#mmOriginalCreationDateTime
	 * OriginalGroupInformation21.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader54#mmCreationDateTime
	 * GroupHeader54.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader2#mmOriginalCreationDateTime
	 * OriginalGroupHeader2.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader46#mmCreationDateTime
	 * GroupHeader46.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25#mmOriginalCreationDateTime
	 * OriginalGroupInformation25.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader45#mmCreationDateTime
	 * GroupHeader45.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader43#mmCreationDateTime
	 * GroupHeader43.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader59#mmCreationDateTime
	 * GroupHeader59.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification1#mmOriginalCreationDateTime
	 * OriginalNotification1.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification4#mmOriginalCreationDateTime
	 * OriginalNotification4.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader44#mmCreationDateTime
	 * GroupHeader44.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification2#mmOriginalCreationDateTime
	 * OriginalNotification2.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification3#mmOriginalCreationDateTime
	 * OriginalNotification3.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation24#mmOriginalCreationDateTime
	 * OriginalGroupInformation24.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5#mmOriginalCreationDateTime
	 * OriginalGroupHeader5.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification6#mmOriginalCreationDateTime
	 * OriginalNotification6.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader60#mmCreationDateTime
	 * GroupHeader60.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification5#mmOriginalCreationDateTime
	 * OriginalNotification5.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader63#mmCreationDateTime
	 * GroupHeader63.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#mmOriginalCreationDateTime
	 * OriginalGroupInformation15.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation19#mmOriginalCreationDateTime
	 * OriginalGroupInformation19.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation11#mmOriginalCreationDateTime
	 * OriginalGroupInformation11.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation18#mmOriginalCreationDateTime
	 * OriginalGroupInformation18.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader19#mmCreationDateTime
	 * GroupHeader19.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader24#mmCreationDateTime
	 * GroupHeader24.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader20#mmCreationDateTime
	 * GroupHeader20.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader25#mmCreationDateTime
	 * GroupHeader25.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader15#mmCreationDateTime
	 * GroupHeader15.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader26#mmCreationDateTime
	 * GroupHeader26.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader17#mmCreationDateTime
	 * GroupHeader17.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader27#mmCreationDateTime
	 * GroupHeader27.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader22#mmCreationDateTime
	 * GroupHeader22.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28#mmCreationDateTime
	 * GroupHeader28.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader16#mmCreationDateTime
	 * GroupHeader16.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader29#mmCreationDateTime
	 * GroupHeader29.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader18#mmCreationDateTime
	 * GroupHeader18.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader30#mmCreationDateTime
	 * GroupHeader30.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation16#mmOriginalCreationDateTime
	 * OriginalGroupInformation16.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader12#mmCreationDateTime
	 * GroupHeader12.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader21#mmCreationDateTime
	 * GroupHeader21.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader62#mmCreationDateTime
	 * GroupHeader62.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader67#mmCreationDateTime
	 * GroupHeader67.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification7#mmOriginalCreationDateTime
	 * OriginalNotification7.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification8#mmOriginalCreationDateTime
	 * OriginalNotification8.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#mmCreationDateTime
	 * GroupHeader70.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification10#mmOriginalCreationDateTime
	 * OriginalNotification10.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification9#mmOriginalCreationDateTime
	 * OriginalNotification9.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#mmCreationDateTime
	 * GroupHeader72.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#mmCreationDateTime
	 * GroupHeader71.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage2#mmOriginalCreationDateTime
	 * OriginalMessage2.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage3#mmOriginalCreationDateTime
	 * OriginalMessage3.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation27#mmOriginalCreationDateTime
	 * OriginalGroupInformation27.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#mmOriginalCreationDateTime
	 * OriginalGroupHeader7.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#mmOriginalCreationDateTime
	 * OriginalGroupInformation28.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#mmOriginalCreationDateTime
	 * OriginalGroupHeader6.mmOriginalCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the payment execution was created by the instructing agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCreationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GroupHeader23.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader42.mmCreationDateTime,
					com.tools20022.repository.msg.GroupHeader58.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader1.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader32.mmCreationDateTime,
					com.tools20022.repository.msg.GroupHeader48.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader39.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader55.mmCreationDateTime,
					com.tools20022.repository.msg.GroupHeader7.mmCreationDateTime, com.tools20022.repository.msg.OriginalGroupInformation4.mmOriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation23.mmOriginalCreationDateTime, com.tools20022.repository.msg.OriginalGroupInformation3.mmOriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupHeader4.mmOriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader8.mmCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation5.mmOriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader40.mmCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation22.mmOriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader56.mmCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupHeader3.mmOriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader5.mmCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation1.mmOriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader36.mmCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation20.mmOriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader52.mmCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupHeader1.mmOriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader2.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader33.mmCreationDateTime,
					com.tools20022.repository.msg.GroupHeader49.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader3.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader34.mmCreationDateTime,
					com.tools20022.repository.msg.GroupHeader50.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader9.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader41.mmCreationDateTime,
					com.tools20022.repository.msg.GroupHeader57.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader37.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader53.mmCreationDateTime,
					com.tools20022.repository.msg.GroupHeader4.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader35.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader51.mmCreationDateTime,
					com.tools20022.repository.msg.GroupHeader31.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader47.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader6.mmCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation2.mmOriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader38.mmCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation21.mmOriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader54.mmCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupHeader2.mmOriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader46.mmCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation25.mmOriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader45.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader43.mmCreationDateTime,
					com.tools20022.repository.msg.GroupHeader59.mmCreationDateTime, com.tools20022.repository.msg.OriginalNotification1.mmOriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalNotification4.mmOriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader44.mmCreationDateTime,
					com.tools20022.repository.msg.OriginalNotification2.mmOriginalCreationDateTime, com.tools20022.repository.msg.OriginalNotification3.mmOriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation24.mmOriginalCreationDateTime, com.tools20022.repository.msg.OriginalGroupHeader5.mmOriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalNotification6.mmOriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader60.mmCreationDateTime,
					com.tools20022.repository.msg.OriginalNotification5.mmOriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader63.mmCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation15.mmOriginalCreationDateTime, com.tools20022.repository.msg.OriginalGroupInformation19.mmOriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation11.mmOriginalCreationDateTime, com.tools20022.repository.msg.OriginalGroupInformation18.mmOriginalCreationDateTime,
					com.tools20022.repository.msg.GroupHeader19.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader24.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader20.mmCreationDateTime,
					com.tools20022.repository.msg.GroupHeader25.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader15.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader26.mmCreationDateTime,
					com.tools20022.repository.msg.GroupHeader17.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader27.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader22.mmCreationDateTime,
					com.tools20022.repository.msg.GroupHeader28.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader16.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader29.mmCreationDateTime,
					com.tools20022.repository.msg.GroupHeader18.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader30.mmCreationDateTime, com.tools20022.repository.msg.OriginalGroupInformation16.mmOriginalCreationDateTime,
					com.tools20022.repository.msg.GroupHeader12.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader21.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader62.mmCreationDateTime,
					com.tools20022.repository.msg.GroupHeader67.mmCreationDateTime, com.tools20022.repository.msg.OriginalNotification7.mmOriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalNotification8.mmOriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader70.mmCreationDateTime,
					com.tools20022.repository.msg.OriginalNotification10.mmOriginalCreationDateTime, com.tools20022.repository.msg.OriginalNotification9.mmOriginalCreationDateTime,
					com.tools20022.repository.msg.GroupHeader72.mmCreationDateTime, com.tools20022.repository.msg.GroupHeader71.mmCreationDateTime, com.tools20022.repository.msg.OriginalMessage2.mmOriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalMessage3.mmOriginalCreationDateTime, com.tools20022.repository.msg.OriginalGroupInformation27.mmOriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupHeader7.mmOriginalCreationDateTime, com.tools20022.repository.msg.OriginalGroupInformation28.mmOriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupHeader6.mmOriginalCreationDateTime);
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreationDate";
			definition = "Date and time at which the payment execution was created by the instructing agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime acceptanceDateTime;
	/**
	 * Date and time at which all processing conditions for execution of the
	 * payment are met and adequate financial cover is available at the account
	 * servicing agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates1#mmAcceptanceDateTime
	 * TransactionDates1.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#mmAcceptanceDateTime
	 * TransactionDates2.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#mmAcceptanceDateTime
	 * PaymentTransactionInformation1.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#mmAcceptanceDateTime
	 * PaymentTransactionInformation25.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#mmAcceptanceDateTime
	 * PaymentTransaction32.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#mmAcceptanceDateTime
	 * PaymentTransaction46.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmAcceptanceDateTime
	 * CreditTransferTransactionInformation2.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmAcceptanceDateTime
	 * CreditTransferTransactionInformation11.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmAcceptanceDateTime
	 * CreditTransferTransaction2.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmAcceptanceDateTime
	 * CreditTransferTransaction7.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#mmAcceptanceDateTime
	 * PaymentTransactionInformation26.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#mmAcceptanceDateTime
	 * PaymentTransaction33.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#mmAcceptanceDateTime
	 * PaymentTransaction43.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#mmAcceptanceDateTime
	 * PaymentTransactionInformation34.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#mmAcceptanceDateTime
	 * PaymentTransaction41.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#mmAcceptanceDateTime
	 * PaymentTransaction49.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#mmAcceptanceDateTime
	 * PaymentTransactionInformation15.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#mmAcceptanceDateTime
	 * PaymentTransactionInformation22.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmAcceptanceDateTime
	 * CreditTransferTransactionInformation7.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmAcceptanceDateTime
	 * CreditTransferTransactionInformation9.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmAcceptanceDateTime
	 * CreditTransferTransaction19.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#mmAcceptanceDateTime
	 * PaymentTransaction52.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#mmAcceptanceDateTime
	 * PaymentTransaction57.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#mmAcceptanceDateTime
	 * PaymentTransaction59.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmAcceptanceDateTime
	 * CreditTransferTransaction25.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#mmAcceptanceDateTime
	 * PaymentTransaction63.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#mmAcceptanceDateTime
	 * PaymentTransaction68.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#mmAcceptanceDateTime
	 * PaymentTransaction69.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#mmAcceptanceDateTime
	 * PaymentTransaction73.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmAcceptanceDateTime
	 * PaymentTransaction80.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmAcceptanceDateTime
	 * PaymentTransaction83.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#mmAcceptanceDateTime
	 * PaymentTransaction82.mmAcceptanceDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptanceDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which all processing conditions for execution of the payment are met and adequate financial cover is available at the account servicing agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAcceptanceDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionDates1.mmAcceptanceDateTime, com.tools20022.repository.msg.TransactionDates2.mmAcceptanceDateTime,
					com.tools20022.repository.msg.PaymentTransactionInformation1.mmAcceptanceDateTime, com.tools20022.repository.msg.PaymentTransactionInformation25.mmAcceptanceDateTime,
					com.tools20022.repository.msg.PaymentTransaction32.mmAcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction46.mmAcceptanceDateTime,
					com.tools20022.repository.msg.CreditTransferTransactionInformation2.mmAcceptanceDateTime, com.tools20022.repository.msg.CreditTransferTransactionInformation11.mmAcceptanceDateTime,
					com.tools20022.repository.msg.CreditTransferTransaction2.mmAcceptanceDateTime, com.tools20022.repository.msg.CreditTransferTransaction7.mmAcceptanceDateTime,
					com.tools20022.repository.msg.PaymentTransactionInformation26.mmAcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction33.mmAcceptanceDateTime,
					com.tools20022.repository.msg.PaymentTransaction43.mmAcceptanceDateTime, com.tools20022.repository.msg.PaymentTransactionInformation34.mmAcceptanceDateTime,
					com.tools20022.repository.msg.PaymentTransaction41.mmAcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction49.mmAcceptanceDateTime,
					com.tools20022.repository.msg.PaymentTransactionInformation15.mmAcceptanceDateTime, com.tools20022.repository.msg.PaymentTransactionInformation22.mmAcceptanceDateTime,
					com.tools20022.repository.msg.CreditTransferTransactionInformation7.mmAcceptanceDateTime, com.tools20022.repository.msg.CreditTransferTransactionInformation9.mmAcceptanceDateTime,
					com.tools20022.repository.msg.CreditTransferTransaction19.mmAcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction52.mmAcceptanceDateTime,
					com.tools20022.repository.msg.PaymentTransaction57.mmAcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction59.mmAcceptanceDateTime,
					com.tools20022.repository.msg.CreditTransferTransaction25.mmAcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction63.mmAcceptanceDateTime,
					com.tools20022.repository.msg.PaymentTransaction68.mmAcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction69.mmAcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction73.mmAcceptanceDateTime,
					com.tools20022.repository.msg.PaymentTransaction80.mmAcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction83.mmAcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction82.mmAcceptanceDateTime);
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptanceDateTime";
			definition = "Date and time at which all processing conditions for execution of the payment are met and adequate financial cover is available at the account servicing agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Payment> payment;
	/**
	 * Specifies the end to end payment which is at the origin of the payment
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
	 * Payment.mmPaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#mmPaymentMethod
	 * PaymentInstructionReference1Details.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#mmPaymentMethod
	 * PaymentInstructionReference2Details.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LongPaymentIdentification1#mmPaymentMethod
	 * LongPaymentIdentification1.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails2#mmPaymentMethod
	 * PaymentCommonDetails2.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails3#mmPaymentMethod
	 * PaymentCommonDetails3.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4#mmPaymentMethod
	 * PaymentCommonDetails4.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon1#mmPaymentMethod
	 * PaymentCommon1.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction2#mmTransactionInformation
	 * UnderlyingTransaction2.mmTransactionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction5#mmTransactionInformation
	 * UnderlyingTransaction5.mmTransactionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction8#mmTransactionInformation
	 * UnderlyingTransaction8.mmTransactionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification1#mmOriginalItem
	 * OriginalNotification1.mmOriginalItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference1#mmOriginalItem
	 * OriginalNotificationReference1.mmOriginalItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification2#mmOriginalItemAndStatus
	 * OriginalNotification2.mmOriginalItemAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference2#mmOriginalItemAndStatus
	 * OriginalNotificationReference2.mmOriginalItemAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction3#mmTransactionInformationAndStatus
	 * UnderlyingTransaction3.mmTransactionInformationAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction4#mmTransactionInformationAndStatus
	 * UnderlyingTransaction4.mmTransactionInformationAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4#mmOriginalItem
	 * OriginalNotificationReference4.mmOriginalItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference3#mmOriginalItemAndStatus
	 * OriginalNotificationReference3.mmOriginalItemAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon2#mmPaymentMethod
	 * PaymentCommon2.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction10#mmTransactionInformation
	 * UnderlyingTransaction10.mmTransactionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction9#mmTransactionInformationAndStatus
	 * UnderlyingTransaction9.mmTransactionInformationAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#mmOriginalGroupInformation
	 * PaymentTransaction52.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference6#mmOriginalItem
	 * OriginalNotificationReference6.mmOriginalItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference5#mmOriginalItemAndStatus
	 * OriginalNotificationReference5.mmOriginalItemAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction13#mmTransactionInformation
	 * UnderlyingTransaction13.mmTransactionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction14#mmTransactionInformationAndStatus
	 * UnderlyingTransaction14.mmTransactionInformationAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#mmOriginalGroupInformation
	 * PaymentTransaction63.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#mmOriginalItem
	 * OriginalNotificationReference8.mmOriginalItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#mmOriginalItemAndStatus
	 * OriginalNotificationReference7.mmOriginalItemAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#mmOriginalGroupInformation
	 * PaymentTransaction73.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmOriginalGroupInformation
	 * PaymentTransaction80.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction16#mmTransactionInformation
	 * UnderlyingTransaction16.mmTransactionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction17#mmTransactionInformationAndStatus
	 * UnderlyingTransaction17.mmTransactionInformationAndStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the end to end payment which is at the origin of the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionReference1Details.mmPaymentMethod, com.tools20022.repository.msg.PaymentInstructionReference2Details.mmPaymentMethod,
					com.tools20022.repository.msg.LongPaymentIdentification1.mmPaymentMethod, com.tools20022.repository.msg.PaymentCommonDetails2.mmPaymentMethod, com.tools20022.repository.msg.PaymentCommonDetails3.mmPaymentMethod,
					com.tools20022.repository.msg.PaymentCommonDetails4.mmPaymentMethod, com.tools20022.repository.msg.PaymentCommon1.mmPaymentMethod, com.tools20022.repository.msg.UnderlyingTransaction2.mmTransactionInformation,
					com.tools20022.repository.msg.UnderlyingTransaction5.mmTransactionInformation, com.tools20022.repository.msg.UnderlyingTransaction8.mmTransactionInformation,
					com.tools20022.repository.msg.OriginalNotification1.mmOriginalItem, com.tools20022.repository.msg.OriginalNotificationReference1.mmOriginalItem,
					com.tools20022.repository.msg.OriginalNotification2.mmOriginalItemAndStatus, com.tools20022.repository.msg.OriginalNotificationReference2.mmOriginalItemAndStatus,
					com.tools20022.repository.msg.UnderlyingTransaction3.mmTransactionInformationAndStatus, com.tools20022.repository.msg.UnderlyingTransaction4.mmTransactionInformationAndStatus,
					com.tools20022.repository.msg.OriginalNotificationReference4.mmOriginalItem, com.tools20022.repository.msg.OriginalNotificationReference3.mmOriginalItemAndStatus,
					com.tools20022.repository.msg.PaymentCommon2.mmPaymentMethod, com.tools20022.repository.msg.UnderlyingTransaction10.mmTransactionInformation,
					com.tools20022.repository.msg.UnderlyingTransaction9.mmTransactionInformationAndStatus, com.tools20022.repository.msg.PaymentTransaction52.mmOriginalGroupInformation,
					com.tools20022.repository.msg.OriginalNotificationReference6.mmOriginalItem, com.tools20022.repository.msg.OriginalNotificationReference5.mmOriginalItemAndStatus,
					com.tools20022.repository.msg.UnderlyingTransaction13.mmTransactionInformation, com.tools20022.repository.msg.UnderlyingTransaction14.mmTransactionInformationAndStatus,
					com.tools20022.repository.msg.PaymentTransaction63.mmOriginalGroupInformation, com.tools20022.repository.msg.OriginalNotificationReference8.mmOriginalItem,
					com.tools20022.repository.msg.OriginalNotificationReference7.mmOriginalItemAndStatus, com.tools20022.repository.msg.PaymentTransaction73.mmOriginalGroupInformation,
					com.tools20022.repository.msg.PaymentTransaction80.mmOriginalGroupInformation, com.tools20022.repository.msg.UnderlyingTransaction16.mmTransactionInformation,
					com.tools20022.repository.msg.UnderlyingTransaction17.mmTransactionInformationAndStatus);
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Specifies the end to end payment which is at the origin of the payment instruction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmPaymentExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PaymentProcessing> processingInstructions;
	/**
	 * Specifies how the payment must be processed, for instance through which
	 * specific clearing channel.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmPaymentExecution
	 * PaymentProcessing.mmPaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmPaymentTypeInformation
	 * CreditTransferTransactionInformation1.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmPaymentTypeInformation
	 * PaymentInstructionInformation1.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#mmPaymentTypeInformation
	 * CreditTransferTransactionInformation10.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation3#mmPaymentTypeInformation
	 * PaymentInstructionInformation3.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#mmPaymentTypeInformation
	 * CreditTransferTransaction1.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6#mmPaymentTypeInformation
	 * PaymentInstruction6.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#mmPaymentTypeInformation
	 * CreditTransferTransaction6.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmPaymentTypeInformation
	 * PaymentInstruction9.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation2#mmPaymentTypeInformation
	 * PaymentInstructionInformation2.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation4#mmPaymentTypeInformation
	 * PaymentInstructionInformation4.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction7#mmPaymentTypeInformation
	 * PaymentInstruction7.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmPaymentTypeInformation
	 * PaymentInstruction10.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#mmPaymentTypeInformation
	 * OriginalTransactionReference1.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#mmPaymentTypeInformation
	 * OriginalTransactionReference13.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#mmPaymentTypeInformation
	 * OriginalTransactionReference16.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader2#mmPaymentTypeInformation
	 * GroupHeader2.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmPaymentTypeInformation
	 * CreditTransferTransactionInformation2.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader33#mmPaymentTypeInformation
	 * GroupHeader33.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmPaymentTypeInformation
	 * CreditTransferTransactionInformation11.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader49#mmPaymentTypeInformation
	 * GroupHeader49.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmPaymentTypeInformation
	 * CreditTransferTransaction2.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmPaymentTypeInformation
	 * CreditTransferTransaction7.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader3#mmPaymentTypeInformation
	 * GroupHeader3.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader34#mmPaymentTypeInformation
	 * GroupHeader34.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#mmPaymentTypeInformation
	 * GroupHeader50.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader4#mmPaymentTypeInformation
	 * GroupHeader4.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#mmPaymentTypeInformation
	 * CreditTransferTransactionInformation3.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader35#mmPaymentTypeInformation
	 * GroupHeader35.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#mmPaymentTypeInformation
	 * CreditTransferTransactionInformation13.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader51#mmPaymentTypeInformation
	 * GroupHeader51.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#mmPaymentTypeInformation
	 * CreditTransferTransaction4.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#mmPaymentTypeInformation
	 * CreditTransferTransaction8.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#mmPaymentTypeInformation
	 * OriginalTransactionReference15.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#mmPaymentTypeInformation
	 * OriginalTransactionReference17.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference19#mmPaymentTypeInformation
	 * OriginalTransactionReference19.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmPaymentTypeInformation
	 * CreditTransferTransactionInformation14.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction5#mmPaymentTypeInformation
	 * PaymentInstruction5.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#mmPaymentTypeInformation
	 * CreditTransferTransaction5.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction8#mmPaymentTypeInformation
	 * PaymentInstruction8.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmPaymentTypeInformation
	 * CreditTransferTransaction10.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#mmPaymentTypeInformation
	 * PaymentInstruction11.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmPaymentTypeInformation
	 * PaymentComplementaryInformation2.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentMeans1#mmPaymentType
	 * PaymentMeans1.mmPaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmPaymentTypeInformation
	 * PaymentComplementaryInformation3.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmPaymentTypeInformation
	 * CreditTransferTransaction9.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference7#mmPaymentTypeInformation
	 * OriginalTransactionReference7.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference10#mmPaymentTypeInformation
	 * OriginalTransactionReference10.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#mmPaymentTypeInformation
	 * OriginalTransactionReference9.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#mmPaymentTypeInformation
	 * OriginalTransactionReference12.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference8#mmPaymentTypeInformation
	 * OriginalTransactionReference8.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference11#mmPaymentTypeInformation
	 * OriginalTransactionReference11.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation6#mmPaymentTypeInformation
	 * CreditTransferTransactionInformation6.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation8#mmPaymentTypeInformation
	 * CreditTransferTransactionInformation8.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmPaymentTypeInformation
	 * CreditTransferTransactionInformation7.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmPaymentTypeInformation
	 * CreditTransferTransactionInformation9.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader19#mmPaymentTypeInformation
	 * GroupHeader19.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader24#mmPaymentTypeInformation
	 * GroupHeader24.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader20#mmPaymentTypeInformation
	 * GroupHeader20.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader25#mmPaymentTypeInformation
	 * GroupHeader25.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader15#mmPaymentTypeInformation
	 * GroupHeader15.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader26#mmPaymentTypeInformation
	 * GroupHeader26.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader16#mmPaymentTypeInformation
	 * GroupHeader16.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader29#mmPaymentTypeInformation
	 * GroupHeader29.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation6#mmPaymentTypeInformation
	 * OriginalPaymentInformation6.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmPaymentTypeInformation
	 * PaymentInstruction16.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmPaymentTypeInformation
	 * PaymentComplementaryInformation4.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#mmPaymentTypeInformation
	 * CreditTransferTransaction17.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmPaymentTypeInformation
	 * CreditTransferTransaction19.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmPaymentTypeInformation
	 * PaymentInstruction15.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#mmPaymentTypeInformation
	 * OriginalTransactionReference20.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#mmPaymentTypeInformation
	 * CreditTransferTransaction20.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#mmPaymentTypeInformation
	 * PaymentInstruction17.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference21#mmPaymentTypeInformation
	 * OriginalTransactionReference21.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmPaymentTypeInformation
	 * CreditTransferTransaction21.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmPaymentTypeInformation
	 * PaymentInstruction18.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmPaymentTypeInformation
	 * CreditTransferTransaction23.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#mmPaymentTypeInformation
	 * GroupHeader70.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmPaymentTypeInformation
	 * CreditTransferTransaction25.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmPaymentTypeInformation
	 * PaymentInstruction19.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmPaymentTypeInformation
	 * PaymentComplementaryInformation5.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmPaymentTypeInformation
	 * PaymentInstruction20.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#mmPaymentTypeInformation
	 * OriginalTransactionReference22.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmPaymentTypeInformation
	 * CreditTransferTransaction26.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmPaymentTypeInformation
	 * CreditTransferTransaction22.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference23#mmPaymentTypeInformation
	 * OriginalTransactionReference23.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmPaymentTypeInformation
	 * PaymentInstruction21.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmPaymentTypeInformation
	 * PaymentInstruction23.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmPaymentTypeInformation
	 * PaymentInstruction22.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmPaymentTypeInformation
	 * OriginalTransactionReference24.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmPaymentTypeInformation
	 * OriginalPaymentInformation7.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#mmPaymentTypeInformation
	 * OriginalTransactionReference26.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmPaymentTypeInformation
	 * PaymentComplementaryInformation6.mmPaymentTypeInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the payment must be processed, for instance through which specific clearing channel."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProcessingInstructions = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmPaymentTypeInformation, com.tools20022.repository.msg.PaymentInstructionInformation1.mmPaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation10.mmPaymentTypeInformation, com.tools20022.repository.msg.PaymentInstructionInformation3.mmPaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction1.mmPaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction6.mmPaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction6.mmPaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction9.mmPaymentTypeInformation,
					com.tools20022.repository.msg.PaymentInstructionInformation2.mmPaymentTypeInformation, com.tools20022.repository.msg.PaymentInstructionInformation4.mmPaymentTypeInformation,
					com.tools20022.repository.msg.PaymentInstruction7.mmPaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction10.mmPaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference1.mmPaymentTypeInformation, com.tools20022.repository.msg.OriginalTransactionReference13.mmPaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference16.mmPaymentTypeInformation, com.tools20022.repository.msg.GroupHeader2.mmPaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation2.mmPaymentTypeInformation, com.tools20022.repository.msg.GroupHeader33.mmPaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation11.mmPaymentTypeInformation, com.tools20022.repository.msg.GroupHeader49.mmPaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction2.mmPaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransaction7.mmPaymentTypeInformation,
					com.tools20022.repository.msg.GroupHeader3.mmPaymentTypeInformation, com.tools20022.repository.msg.GroupHeader34.mmPaymentTypeInformation, com.tools20022.repository.msg.GroupHeader50.mmPaymentTypeInformation,
					com.tools20022.repository.msg.GroupHeader4.mmPaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation3.mmPaymentTypeInformation,
					com.tools20022.repository.msg.GroupHeader35.mmPaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation13.mmPaymentTypeInformation,
					com.tools20022.repository.msg.GroupHeader51.mmPaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransaction4.mmPaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction8.mmPaymentTypeInformation, com.tools20022.repository.msg.OriginalTransactionReference15.mmPaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference17.mmPaymentTypeInformation, com.tools20022.repository.msg.OriginalTransactionReference19.mmPaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmPaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction5.mmPaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction5.mmPaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction8.mmPaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction10.mmPaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction11.mmPaymentTypeInformation,
					com.tools20022.repository.msg.PaymentComplementaryInformation2.mmPaymentTypeInformation, com.tools20022.repository.msg.PaymentMeans1.mmPaymentType,
					com.tools20022.repository.msg.PaymentComplementaryInformation3.mmPaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransaction9.mmPaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference7.mmPaymentTypeInformation, com.tools20022.repository.msg.OriginalTransactionReference10.mmPaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference9.mmPaymentTypeInformation, com.tools20022.repository.msg.OriginalTransactionReference12.mmPaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference8.mmPaymentTypeInformation, com.tools20022.repository.msg.OriginalTransactionReference11.mmPaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation6.mmPaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation8.mmPaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation7.mmPaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation9.mmPaymentTypeInformation,
					com.tools20022.repository.msg.GroupHeader19.mmPaymentTypeInformation, com.tools20022.repository.msg.GroupHeader24.mmPaymentTypeInformation, com.tools20022.repository.msg.GroupHeader20.mmPaymentTypeInformation,
					com.tools20022.repository.msg.GroupHeader25.mmPaymentTypeInformation, com.tools20022.repository.msg.GroupHeader15.mmPaymentTypeInformation, com.tools20022.repository.msg.GroupHeader26.mmPaymentTypeInformation,
					com.tools20022.repository.msg.GroupHeader16.mmPaymentTypeInformation, com.tools20022.repository.msg.GroupHeader29.mmPaymentTypeInformation,
					com.tools20022.repository.msg.OriginalPaymentInformation6.mmPaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction16.mmPaymentTypeInformation,
					com.tools20022.repository.msg.PaymentComplementaryInformation4.mmPaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransaction17.mmPaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction19.mmPaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction15.mmPaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference20.mmPaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransaction20.mmPaymentTypeInformation,
					com.tools20022.repository.msg.PaymentInstruction17.mmPaymentTypeInformation, com.tools20022.repository.msg.OriginalTransactionReference21.mmPaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction21.mmPaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction18.mmPaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction23.mmPaymentTypeInformation, com.tools20022.repository.msg.GroupHeader70.mmPaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction25.mmPaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction19.mmPaymentTypeInformation,
					com.tools20022.repository.msg.PaymentComplementaryInformation5.mmPaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction20.mmPaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference22.mmPaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransaction26.mmPaymentTypeInformation,
					com.tools20022.repository.msg.CreditTransferTransaction22.mmPaymentTypeInformation, com.tools20022.repository.msg.OriginalTransactionReference23.mmPaymentTypeInformation,
					com.tools20022.repository.msg.PaymentInstruction21.mmPaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction23.mmPaymentTypeInformation,
					com.tools20022.repository.msg.PaymentInstruction22.mmPaymentTypeInformation, com.tools20022.repository.msg.OriginalTransactionReference24.mmPaymentTypeInformation,
					com.tools20022.repository.msg.OriginalPaymentInformation7.mmPaymentTypeInformation, com.tools20022.repository.msg.OriginalTransactionReference26.mmPaymentTypeInformation,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.mmPaymentTypeInformation);
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingInstructions";
			definition = "Specifies how the payment must be processed, for instance through which specific clearing channel.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmPaymentExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
		}
	};
	protected ISODateTime requestedExecutionDate;
	/**
	 * Date at which the initiating party requests the clearing agent to process
	 * the payment. <br>
	 * Usage: This is the date on which the debtor's account is to be debited.
	 * If payment by cheque, the date when the cheque must be generated by the
	 * bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction3#mmRequestedExecutionDateTime
	 * PaymentInstruction3.mmRequestedExecutionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon1#mmRequestedExecutionDate
	 * PaymentCommon1.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmRequestedExecutionDate
	 * PaymentInstruction1.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmRequestedExecutionDate
	 * PaymentInstructionInformation1.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6#mmRequestedExecutionDate
	 * PaymentInstruction6.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmRequestedExecutionDate
	 * PaymentInstruction9.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation2#mmRequestedCollectionDate
	 * PaymentInstructionInformation2.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation4#mmRequestedCollectionDate
	 * PaymentInstructionInformation4.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction7#mmRequestedCollectionDate
	 * PaymentInstruction7.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmRequestedCollectionDate
	 * PaymentInstruction10.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation30#mmOriginalRequestedExecutionDate
	 * PaymentTransactionInformation30.mmOriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation30#mmOriginalRequestedCollectionDate
	 * PaymentTransactionInformation30.mmOriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction5#mmRequestedExecutionDate
	 * PaymentInstruction5.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction8#mmRequestedExecutionDate
	 * PaymentInstruction8.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#mmRequestedExecutionDate
	 * PaymentInstruction11.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#mmRequestedExecutionDate
	 * PaymentInstructionExtract2.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInstructionExtract#mmRequestedExecutionDate
	 * CorrectivePaymentInstructionExtract.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction1#mmRequestedExecutionDate
	 * UnderlyingPaymentInstruction1.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmRequestedExecutionDate
	 * PaymentComplementaryInformation2.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmRequestedCollectionDate
	 * PaymentComplementaryInformation2.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation32#mmOriginalRequestedExecutionDate
	 * PaymentTransactionInformation32.mmOriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation32#mmOriginalRequestedCollectionDate
	 * PaymentTransactionInformation32.mmOriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation1#mmRequestedExecutionDate
	 * CorrectivePaymentInitiation1.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#mmRequestedExecutionDate
	 * UnderlyingPaymentInstruction2.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmRequestedExecutionDate
	 * PaymentComplementaryInformation3.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmRequestedCollectionDate
	 * PaymentComplementaryInformation3.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction13#mmRequestedExecutionDateTime
	 * PaymentInstruction13.mmRequestedExecutionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon2#mmRequestedExecutionDate
	 * PaymentCommon2.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmRequestedExecutionDate
	 * PaymentInstruction14.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation6#mmRequestedExecutionDate
	 * OriginalPaymentInformation6.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmRequestedExecutionDate
	 * PaymentInstruction16.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmRequestedExecutionDate
	 * PaymentComplementaryInformation4.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmRequestedCollectionDate
	 * PaymentComplementaryInformation4.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmRequestedCollectionDate
	 * PaymentInstruction15.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#mmRequestedExecutionDate
	 * PaymentInstruction17.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmRequestedCollectionDate
	 * PaymentInstruction18.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmRequestedExecutionDate
	 * PaymentInstruction19.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmRequestedExecutionDate
	 * PaymentComplementaryInformation5.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmRequestedCollectionDate
	 * PaymentComplementaryInformation5.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmRequestedExecutionDate
	 * PaymentInstruction20.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmRequestedCollectionDate
	 * PaymentInstruction21.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmRequestedExecutionDate
	 * PaymentInstruction23.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmRequestedExecutionDate
	 * PaymentInstruction22.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmRequestedExecutionDate
	 * OriginalPaymentInformation7.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#mmRequestedExecutionDate
	 * CorrectivePaymentInitiation2.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#mmRequestedExecutionDate
	 * UnderlyingPaymentInstruction3.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmRequestedExecutionDate
	 * PaymentComplementaryInformation6.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmRequestedCollectionDate
	 * PaymentComplementaryInformation6.mmRequestedCollectionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the initiating party requests the clearing agent to process the payment. \r\nUsage: This is the date on which the debtor's account is to be debited. If payment by cheque, the date when the cheque must be generated by the bank."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRequestedExecutionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstruction3.mmRequestedExecutionDateTime, com.tools20022.repository.msg.PaymentCommon1.mmRequestedExecutionDate,
					com.tools20022.repository.msg.PaymentInstruction1.mmRequestedExecutionDate, com.tools20022.repository.msg.PaymentInstructionInformation1.mmRequestedExecutionDate,
					com.tools20022.repository.msg.PaymentInstruction6.mmRequestedExecutionDate, com.tools20022.repository.msg.PaymentInstruction9.mmRequestedExecutionDate,
					com.tools20022.repository.msg.PaymentInstructionInformation2.mmRequestedCollectionDate, com.tools20022.repository.msg.PaymentInstructionInformation4.mmRequestedCollectionDate,
					com.tools20022.repository.msg.PaymentInstruction7.mmRequestedCollectionDate, com.tools20022.repository.msg.PaymentInstruction10.mmRequestedCollectionDate,
					com.tools20022.repository.msg.PaymentTransactionInformation30.mmOriginalRequestedExecutionDate, com.tools20022.repository.msg.PaymentTransactionInformation30.mmOriginalRequestedCollectionDate,
					com.tools20022.repository.msg.PaymentInstruction5.mmRequestedExecutionDate, com.tools20022.repository.msg.PaymentInstruction8.mmRequestedExecutionDate,
					com.tools20022.repository.msg.PaymentInstruction11.mmRequestedExecutionDate, com.tools20022.repository.msg.PaymentInstructionExtract2.mmRequestedExecutionDate,
					com.tools20022.repository.msg.CorrectivePaymentInstructionExtract.mmRequestedExecutionDate, com.tools20022.repository.msg.UnderlyingPaymentInstruction1.mmRequestedExecutionDate,
					com.tools20022.repository.msg.PaymentComplementaryInformation2.mmRequestedExecutionDate, com.tools20022.repository.msg.PaymentComplementaryInformation2.mmRequestedCollectionDate,
					com.tools20022.repository.msg.PaymentTransactionInformation32.mmOriginalRequestedExecutionDate, com.tools20022.repository.msg.PaymentTransactionInformation32.mmOriginalRequestedCollectionDate,
					com.tools20022.repository.msg.CorrectivePaymentInitiation1.mmRequestedExecutionDate, com.tools20022.repository.msg.UnderlyingPaymentInstruction2.mmRequestedExecutionDate,
					com.tools20022.repository.msg.PaymentComplementaryInformation3.mmRequestedExecutionDate, com.tools20022.repository.msg.PaymentComplementaryInformation3.mmRequestedCollectionDate,
					com.tools20022.repository.msg.PaymentInstruction13.mmRequestedExecutionDateTime, com.tools20022.repository.msg.PaymentCommon2.mmRequestedExecutionDate,
					com.tools20022.repository.msg.PaymentInstruction14.mmRequestedExecutionDate, com.tools20022.repository.msg.OriginalPaymentInformation6.mmRequestedExecutionDate,
					com.tools20022.repository.msg.PaymentInstruction16.mmRequestedExecutionDate, com.tools20022.repository.msg.PaymentComplementaryInformation4.mmRequestedExecutionDate,
					com.tools20022.repository.msg.PaymentComplementaryInformation4.mmRequestedCollectionDate, com.tools20022.repository.msg.PaymentInstruction15.mmRequestedCollectionDate,
					com.tools20022.repository.msg.PaymentInstruction17.mmRequestedExecutionDate, com.tools20022.repository.msg.PaymentInstruction18.mmRequestedCollectionDate,
					com.tools20022.repository.msg.PaymentInstruction19.mmRequestedExecutionDate, com.tools20022.repository.msg.PaymentComplementaryInformation5.mmRequestedExecutionDate,
					com.tools20022.repository.msg.PaymentComplementaryInformation5.mmRequestedCollectionDate, com.tools20022.repository.msg.PaymentInstruction20.mmRequestedExecutionDate,
					com.tools20022.repository.msg.PaymentInstruction21.mmRequestedCollectionDate, com.tools20022.repository.msg.PaymentInstruction23.mmRequestedExecutionDate,
					com.tools20022.repository.msg.PaymentInstruction22.mmRequestedExecutionDate, com.tools20022.repository.msg.OriginalPaymentInformation7.mmRequestedExecutionDate,
					com.tools20022.repository.msg.CorrectivePaymentInitiation2.mmRequestedExecutionDate, com.tools20022.repository.msg.UnderlyingPaymentInstruction3.mmRequestedExecutionDate,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.mmRequestedExecutionDate, com.tools20022.repository.msg.PaymentComplementaryInformation6.mmRequestedCollectionDate);
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the initiating party requests the clearing agent to process the payment. \r\nUsage: This is the date on which the debtor's account is to be debited. If payment by cheque, the date when the cheque must be generated by the bank.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected PaymentInvestigationCase relatedInvestigationCase;
	/**
	 * Investigation case assigned to the payment execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingInstruction
	 * PaymentInvestigationCase.mmUnderlyingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation23#mmCase
	 * OriginalGroupInformation23.mmCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader4#mmCase
	 * OriginalGroupHeader4.mmCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5#mmResolvedCase
	 * OriginalGroupHeader5.mmResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#mmCase
	 * OriginalGroupHeader6.mmCase}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investigation case assigned to the payment execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalGroupInformation23.mmCase, com.tools20022.repository.msg.OriginalGroupHeader4.mmCase,
					com.tools20022.repository.msg.OriginalGroupHeader5.mmResolvedCase, com.tools20022.repository.msg.OriginalGroupHeader6.mmCase);
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Investigation case assigned to the payment execution.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmUnderlyingInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmObject();
		}
	};
	protected PaymentInvestigationCaseResolution relatedInvestigationCaseResolution;
	/**
	 * Payment investigation case resolution which is the source of the
	 * corrected payment execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmPaymentExecutionCorrection
	 * PaymentInvestigationCaseResolution.mmPaymentExecutionCorrection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCaseResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment investigation case resolution which is the source of the corrected payment execution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvestigationCaseResolution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Payment investigation case resolution which is the source of the corrected payment execution.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmPaymentExecutionCorrection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
		}
	};
	protected PaymentInstruction next;
	/**
	 * Specifies the next payment instruction in the payment end-to-end chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmPrevious
	 * PaymentInstruction.mmPrevious}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Next"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the next payment instruction in the payment end-to-end chain."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNext = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Next";
			definition = "Specifies the next payment instruction in the payment end-to-end chain.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmPrevious;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange;
	/**
	 * Rate used to transform the original amount into the credited amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmPaymentExecution
	 * CurrencyExchange.mmPaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to transform the original amount into the credited amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchange = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Rate used to transform the original amount into the credited amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmPaymentExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentExecution";
				definition = "Process required for executing an end to end payment. It consists of a payment initiation which may be followed by a series of instructions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.mmPaymentExecution, com.tools20022.repository.entity.PaymentInstruction.mmPrevious,
						com.tools20022.repository.entity.PaymentProcessing.mmPaymentExecution, com.tools20022.repository.entity.CurrencyExchange.mmPaymentExecution,
						com.tools20022.repository.entity.PaymentInvestigationCase.mmUnderlyingInstruction, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmPaymentExecutionCorrection);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestedModification3.mmPaymentTypeInformation, com.tools20022.repository.msg.RequestedModification4.mmPaymentTypeInformation,
						com.tools20022.repository.msg.RequestedModification5.mmPaymentTypeInformation, com.tools20022.repository.msg.RequestedModification6.mmPaymentTypeInformation);
				subType_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInstruction.mmObject(), PaymentInitiation.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentExecution.mmCreditDebitIndicator, com.tools20022.repository.entity.PaymentExecution.mmCreationDate,
						com.tools20022.repository.entity.PaymentExecution.mmAcceptanceDateTime, com.tools20022.repository.entity.PaymentExecution.mmPayment, com.tools20022.repository.entity.PaymentExecution.mmProcessingInstructions,
						com.tools20022.repository.entity.PaymentExecution.mmRequestedExecutionDate, com.tools20022.repository.entity.PaymentExecution.mmRelatedInvestigationCase,
						com.tools20022.repository.entity.PaymentExecution.mmRelatedInvestigationCaseResolution, com.tools20022.repository.entity.PaymentExecution.mmNext, com.tools20022.repository.entity.PaymentExecution.mmCurrencyExchange);
				derivationComponent_lazy = () -> Arrays.asList(TransactionDates1.mmObject(), TransactionDates2.mmObject(), OriginalGroupHeader4.mmObject(), OriginalGroupHeader3.mmObject(), OriginalGroupHeader1.mmObject(),
						OriginalGroupHeader2.mmObject(), OriginalGroupHeader5.mmObject(), GroupHeader67.mmObject(), OriginalGroupHeader7.mmObject(), OriginalGroupHeader6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	public ISODateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(ISODateTime creationDate) {
		this.creationDate = creationDate;
	}

	public ISODateTime getAcceptanceDateTime() {
		return acceptanceDateTime;
	}

	public void setAcceptanceDateTime(ISODateTime acceptanceDateTime) {
		this.acceptanceDateTime = acceptanceDateTime;
	}

	public List<Payment> getPayment() {
		return payment;
	}

	public void setPayment(List<com.tools20022.repository.entity.Payment> payment) {
		this.payment = payment;
	}

	public List<PaymentProcessing> getProcessingInstructions() {
		return processingInstructions;
	}

	public void setProcessingInstructions(List<com.tools20022.repository.entity.PaymentProcessing> processingInstructions) {
		this.processingInstructions = processingInstructions;
	}

	public ISODateTime getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public void setRequestedExecutionDate(ISODateTime requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
	}

	public PaymentInvestigationCase getRelatedInvestigationCase() {
		return relatedInvestigationCase;
	}

	public void setRelatedInvestigationCase(com.tools20022.repository.entity.PaymentInvestigationCase relatedInvestigationCase) {
		this.relatedInvestigationCase = relatedInvestigationCase;
	}

	public PaymentInvestigationCaseResolution getRelatedInvestigationCaseResolution() {
		return relatedInvestigationCaseResolution;
	}

	public void setRelatedInvestigationCaseResolution(com.tools20022.repository.entity.PaymentInvestigationCaseResolution relatedInvestigationCaseResolution) {
		this.relatedInvestigationCaseResolution = relatedInvestigationCaseResolution;
	}

	public PaymentInstruction getNext() {
		return next;
	}

	public void setNext(com.tools20022.repository.entity.PaymentInstruction next) {
		this.next = next;
	}

	public List<CurrencyExchange> getCurrencyExchange() {
		return currencyExchange;
	}

	public void setCurrencyExchange(List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange) {
		this.currencyExchange = currencyExchange;
	}
}