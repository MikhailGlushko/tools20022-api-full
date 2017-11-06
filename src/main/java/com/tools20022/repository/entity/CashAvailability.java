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
import com.tools20022.repository.choice.CashAvailabilityDate1Choice;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.msg.CashAvailability1;
import com.tools20022.repository.msg.CashBalanceAvailability1;
import com.tools20022.repository.msg.CashBalanceAvailability2;
import com.tools20022.repository.msg.CashBalanceAvailabilityDate1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates when the amount of money will become available, ie can be accessed
 * and start generating interest.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashAvailability" src="doc-files/CashAvailability.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAvailability#mmCashBalance
 * CashAvailability.mmCashBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAvailability#mmDate
 * CashAvailability.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAvailability#mmNumberOfDays
 * CashAvailability.mmNumberOfDays}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAvailability#mmAmount
 * CashAvailability.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAvailability#mmCashEntry
 * CashAvailability.mmCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAvailability#mmCreditDebitIndicator
 * CashAvailability.mmCreditDebitIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmAvailability
 * CashEntry.mmAvailability}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#mmAvailability
 * CashBalance.mmAvailability}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode2#mmAvailability
 * TotalsPerBankTransactionCode2.mmAvailability}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceAvailabilityDate1
 * CashBalanceAvailabilityDate1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceAvailability1
 * CashBalanceAvailability1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceAvailability2
 * CashBalanceAvailability2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CashAvailabilityDate1Choice
 * CashAvailabilityDate1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAvailability1
 * CashAvailability1}</li>
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
 * "CashAvailability"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates when the amount of money will become available, ie can be accessed and start generating interest."
 * </li>
 * </ul>
 */
public class CashAvailability {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CashBalance cashBalance;
	/**
	 * Cash balance for which the availability is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmAvailability
	 * CashBalance.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashBalance
	 * CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAvailability
	 * CashAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash balance for which the availability is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAvailability.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashBalance";
			definition = "Cash balance for which the availability is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.mmAvailability;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
		}
	};
	protected ISODate date;
	/**
	 * Identifies the availability date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAvailability
	 * CashAvailability}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailabilityDate1#mmActualDate
	 * CashBalanceAvailabilityDate1.mmActualDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailability1#mmDate
	 * CashBalanceAvailability1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailability2#mmDate
	 * CashBalanceAvailability2.mmDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms6#mmDueDate
	 * PaymentTerms6.mmDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAvailabilityDate1Choice#mmActualDate
	 * CashAvailabilityDate1Choice.mmActualDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAvailability1#mmDate
	 * CashAvailability1.mmDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the availability date."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashBalanceAvailabilityDate1.mmActualDate, com.tools20022.repository.msg.CashBalanceAvailability1.mmDate,
					com.tools20022.repository.msg.CashBalanceAvailability2.mmDate, com.tools20022.repository.msg.PaymentTerms6.mmDueDate, com.tools20022.repository.choice.CashAvailabilityDate1Choice.mmActualDate,
					com.tools20022.repository.msg.CashAvailability1.mmDate);
			elementContext_lazy = () -> CashAvailability.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Identifies the availability date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max15NumericText numberOfDays;
	/**
	 * Indicates the number of float days attached to the balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAvailability
	 * CashAvailability}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailabilityDate1#mmNumberOfDays
	 * CashBalanceAvailabilityDate1.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAvailabilityDate1Choice#mmNumberOfDays
	 * CashAvailabilityDate1Choice.mmNumberOfDays}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the number of float days attached to the balance."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNumberOfDays = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashBalanceAvailabilityDate1.mmNumberOfDays, com.tools20022.repository.choice.CashAvailabilityDate1Choice.mmNumberOfDays);
			elementContext_lazy = () -> CashAvailability.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberOfDays";
			definition = "Indicates the number of float days attached to the balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * Available amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAvailability
	 * CashAvailability}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailability1#mmAmount
	 * CashBalanceAvailability1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailability2#mmAmount
	 * CashBalanceAvailability2.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAvailability1#mmAmount
	 * CashAvailability1.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Available amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashBalanceAvailability1.mmAmount, com.tools20022.repository.msg.CashBalanceAvailability2.mmAmount, com.tools20022.repository.msg.CashAvailability1.mmAmount);
			elementContext_lazy = () -> CashAvailability.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Available amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CashEntry cashEntry;
	/**
	 * Specifies the cash entry for which the availability information is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAvailability
	 * CashEntry.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAvailability
	 * CashAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the cash entry for which the availability information is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAvailability.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Specifies the cash entry for which the availability information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.mmAvailability;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}
	};
	protected DebitCreditCode creditDebitIndicator;
	/**
	 * Indicates whether the availability balance is a credit or a debit
	 * balance. A zero balance is considered to be a credit balance.
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
	 * {@linkplain com.tools20022.repository.entity.CashAvailability
	 * CashAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the availability balance is a credit or a debit balance. A zero balance is considered to be a credit balance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCreditDebitIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashAvailability.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the availability balance is a credit or a debit balance. A zero balance is considered to be a credit balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashAvailability";
				definition = "Indicates when the amount of money will become available, ie can be accessed and start generating interest.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashEntry.mmAvailability, com.tools20022.repository.entity.CashBalance.mmAvailability);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalsPerBankTransactionCode2.mmAvailability);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAvailability.mmCashBalance, com.tools20022.repository.entity.CashAvailability.mmDate, com.tools20022.repository.entity.CashAvailability.mmNumberOfDays,
						com.tools20022.repository.entity.CashAvailability.mmAmount, com.tools20022.repository.entity.CashAvailability.mmCashEntry, com.tools20022.repository.entity.CashAvailability.mmCreditDebitIndicator);
				derivationComponent_lazy = () -> Arrays.asList(CashBalanceAvailabilityDate1.mmObject(), CashBalanceAvailability1.mmObject(), CashBalanceAvailability2.mmObject(), CashAvailabilityDate1Choice.mmObject(),
						CashAvailability1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CashBalance getCashBalance() {
		return cashBalance;
	}

	public void setCashBalance(com.tools20022.repository.entity.CashBalance cashBalance) {
		this.cashBalance = cashBalance;
	}

	public ISODate getDate() {
		return date;
	}

	public void setDate(ISODate date) {
		this.date = date;
	}

	public Max15NumericText getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(Max15NumericText numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public CashEntry getCashEntry() {
		return cashEntry;
	}

	public void setCashEntry(com.tools20022.repository.entity.CashEntry cashEntry) {
		this.cashEntry = cashEntry;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}
}