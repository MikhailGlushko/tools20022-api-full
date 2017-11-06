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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides statistical information on the number of movements and their value
 * for a particular account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AccountReportedMovement"
 * src="doc-files/AccountReportedMovement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmMonthlyPaymentValue
 * AccountReportedMovement.mmMonthlyPaymentValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmMonthlyReceivedValue
 * AccountReportedMovement.mmMonthlyReceivedValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmMonthlyTransactionNumber
 * AccountReportedMovement.mmMonthlyTransactionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmAverageBalance
 * AccountReportedMovement.mmAverageBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmReportedCashAccount
 * AccountReportedMovement.mmReportedCashAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmReportedMovements
 * CashAccount.mmReportedMovements}</li>
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
 * "AccountReportedMovement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides statistical information on the number of movements and their value for a particular account."
 * </li>
 * </ul>
 */
public class AccountReportedMovement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount monthlyPaymentValue;
	/**
	 * Monthly average of the payment amounts (that is, payments going out) over
	 * a year.
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
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement
	 * AccountReportedMovement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount1#mmMonthlyPaymentValue
	 * CustomerAccount1.mmMonthlyPaymentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#mmMonthlyPaymentValue
	 * CustomerAccount5.mmMonthlyPaymentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmMonthlyPaymentValue
	 * CustomerAccountModification1.mmMonthlyPaymentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#mmMonthlyPaymentValue
	 * CustomerAccount4.mmMonthlyPaymentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMinimumMonthlyPaymentValue
	 * CustomerAccount2.mmMinimumMonthlyPaymentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMaximumMonthlyPaymentValue
	 * CustomerAccount2.mmMaximumMonthlyPaymentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmMonthlyPaymentValue
	 * CustomerAccount3.mmMonthlyPaymentValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyPaymentValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monthly average of the payment amounts (that is, payments going out) over a year."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMonthlyPaymentValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount1.mmMonthlyPaymentValue, com.tools20022.repository.msg.CustomerAccount5.mmMonthlyPaymentValue,
					com.tools20022.repository.msg.CustomerAccountModification1.mmMonthlyPaymentValue, com.tools20022.repository.msg.CustomerAccount4.mmMonthlyPaymentValue,
					com.tools20022.repository.msg.CustomerAccount2.mmMinimumMonthlyPaymentValue, com.tools20022.repository.msg.CustomerAccount2.mmMaximumMonthlyPaymentValue,
					com.tools20022.repository.msg.CustomerAccount3.mmMonthlyPaymentValue);
			elementContext_lazy = () -> AccountReportedMovement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MonthlyPaymentValue";
			definition = "Monthly average of the payment amounts (that is, payments going out) over a year.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount monthlyReceivedValue;
	/**
	 * Monthly average of the received amounts over a year (that is, payments
	 * coming in).
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
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement
	 * AccountReportedMovement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount1#mmMonthlyReceivedValue
	 * CustomerAccount1.mmMonthlyReceivedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#mmMonthlyReceivedValue
	 * CustomerAccount5.mmMonthlyReceivedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmMonthlyReceivedValue
	 * CustomerAccountModification1.mmMonthlyReceivedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#mmMonthlyReceivedValue
	 * CustomerAccount4.mmMonthlyReceivedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMinimumMonthlyReceivedValue
	 * CustomerAccount2.mmMinimumMonthlyReceivedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMaximumMonthlyReceivedValue
	 * CustomerAccount2.mmMaximumMonthlyReceivedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmMonthlyReceivedValue
	 * CustomerAccount3.mmMonthlyReceivedValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyReceivedValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monthly average of the received amounts over a year (that is, payments coming in)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMonthlyReceivedValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount1.mmMonthlyReceivedValue, com.tools20022.repository.msg.CustomerAccount5.mmMonthlyReceivedValue,
					com.tools20022.repository.msg.CustomerAccountModification1.mmMonthlyReceivedValue, com.tools20022.repository.msg.CustomerAccount4.mmMonthlyReceivedValue,
					com.tools20022.repository.msg.CustomerAccount2.mmMinimumMonthlyReceivedValue, com.tools20022.repository.msg.CustomerAccount2.mmMaximumMonthlyReceivedValue,
					com.tools20022.repository.msg.CustomerAccount3.mmMonthlyReceivedValue);
			elementContext_lazy = () -> AccountReportedMovement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MonthlyReceivedValue";
			definition = "Monthly average of the received amounts over a year (that is, payments coming in).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected Max35Text monthlyTransactionNumber;
	/**
	 * Monthly average of the number of payments (coming in and going out) over
	 * a year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement
	 * AccountReportedMovement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount1#mmMonthlyTransactionNumber
	 * CustomerAccount1.mmMonthlyTransactionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#mmMonthlyTransactionNumber
	 * CustomerAccount5.mmMonthlyTransactionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmMonthlyTransactionNumber
	 * CustomerAccountModification1.mmMonthlyTransactionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#mmMonthlyTransactionNumber
	 * CustomerAccount4.mmMonthlyTransactionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMinimumMonthlyTransactionNumber
	 * CustomerAccount2.mmMinimumMonthlyTransactionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMaximumMonthlyTransactionNumber
	 * CustomerAccount2.mmMaximumMonthlyTransactionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmMonthlyTransactionNumber
	 * CustomerAccount3.mmMonthlyTransactionNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyTransactionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monthly average of the number of payments (coming in and going out) over a year."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMonthlyTransactionNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount1.mmMonthlyTransactionNumber, com.tools20022.repository.msg.CustomerAccount5.mmMonthlyTransactionNumber,
					com.tools20022.repository.msg.CustomerAccountModification1.mmMonthlyTransactionNumber, com.tools20022.repository.msg.CustomerAccount4.mmMonthlyTransactionNumber,
					com.tools20022.repository.msg.CustomerAccount2.mmMinimumMonthlyTransactionNumber, com.tools20022.repository.msg.CustomerAccount2.mmMaximumMonthlyTransactionNumber,
					com.tools20022.repository.msg.CustomerAccount3.mmMonthlyTransactionNumber);
			elementContext_lazy = () -> AccountReportedMovement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MonthlyTransactionNumber";
			definition = "Monthly average of the number of payments (coming in and going out) over a year.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CurrencyAndAmount averageBalance;
	/**
	 * Sum of the end of day balances over a month divided by the number of
	 * business days in the month.
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
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement
	 * AccountReportedMovement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount1#mmAverageBalance
	 * CustomerAccount1.mmAverageBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#mmAverageBalance
	 * CustomerAccount5.mmAverageBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmAverageBalance
	 * CustomerAccountModification1.mmAverageBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#mmAverageBalance
	 * CustomerAccount4.mmAverageBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMinimumAverageBalance
	 * CustomerAccount2.mmMinimumAverageBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMaximumAverageBalance
	 * CustomerAccount2.mmMaximumAverageBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmAverageBalance
	 * CustomerAccount3.mmAverageBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of the end of day balances over a month divided by the number of business days in the month."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAverageBalance = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount1.mmAverageBalance, com.tools20022.repository.msg.CustomerAccount5.mmAverageBalance,
					com.tools20022.repository.msg.CustomerAccountModification1.mmAverageBalance, com.tools20022.repository.msg.CustomerAccount4.mmAverageBalance, com.tools20022.repository.msg.CustomerAccount2.mmMinimumAverageBalance,
					com.tools20022.repository.msg.CustomerAccount2.mmMaximumAverageBalance, com.tools20022.repository.msg.CustomerAccount3.mmAverageBalance);
			elementContext_lazy = () -> AccountReportedMovement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AverageBalance";
			definition = "Sum of the end of day balances over a month divided by the number of business days in the month.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CashAccount reportedCashAccount;
	/**
	 * Cash account for which reported movements are calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmReportedMovements
	 * CashAccount.mmReportedMovements}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement
	 * AccountReportedMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedCashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account for which reported movements are calculated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReportedCashAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AccountReportedMovement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportedCashAccount";
			definition = "Cash account for which reported movements are calculated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmReportedMovements;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountReportedMovement";
				definition = "Provides statistical information on the number of movements and their value for a particular account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmReportedMovements);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountReportedMovement.mmMonthlyPaymentValue, com.tools20022.repository.entity.AccountReportedMovement.mmMonthlyReceivedValue,
						com.tools20022.repository.entity.AccountReportedMovement.mmMonthlyTransactionNumber, com.tools20022.repository.entity.AccountReportedMovement.mmAverageBalance,
						com.tools20022.repository.entity.AccountReportedMovement.mmReportedCashAccount);
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getMonthlyPaymentValue() {
		return monthlyPaymentValue;
	}

	public void setMonthlyPaymentValue(CurrencyAndAmount monthlyPaymentValue) {
		this.monthlyPaymentValue = monthlyPaymentValue;
	}

	public CurrencyAndAmount getMonthlyReceivedValue() {
		return monthlyReceivedValue;
	}

	public void setMonthlyReceivedValue(CurrencyAndAmount monthlyReceivedValue) {
		this.monthlyReceivedValue = monthlyReceivedValue;
	}

	public Max35Text getMonthlyTransactionNumber() {
		return monthlyTransactionNumber;
	}

	public void setMonthlyTransactionNumber(Max35Text monthlyTransactionNumber) {
		this.monthlyTransactionNumber = monthlyTransactionNumber;
	}

	public CurrencyAndAmount getAverageBalance() {
		return averageBalance;
	}

	public void setAverageBalance(CurrencyAndAmount averageBalance) {
		this.averageBalance = averageBalance;
	}

	public CashAccount getReportedCashAccount() {
		return reportedCashAccount;
	}

	public void setReportedCashAccount(com.tools20022.repository.entity.CashAccount reportedCashAccount) {
		this.reportedCashAccount = reportedCashAccount;
	}
}