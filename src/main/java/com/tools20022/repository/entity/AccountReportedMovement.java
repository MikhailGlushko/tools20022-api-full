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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountReportedMovement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides statistical information on the number of movements and their value for a particular account."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class AccountReportedMovement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount monthlyPaymentValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMinimumMonthlyPaymentValue
	 * CustomerAccount7.mmMinimumMonthlyPaymentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMaximumMonthlyPaymentValue
	 * CustomerAccount7.mmMaximumMonthlyPaymentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmMonthlyPaymentValue
	 * CustomerAccount6.mmMonthlyPaymentValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement
	 * AccountReportedMovement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyPaymentValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monthly average of the payment amounts (that is, payments going out) over a year."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AccountReportedMovement, CurrencyAndAmount> mmMonthlyPaymentValue = new MMBusinessAttribute<AccountReportedMovement, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CustomerAccount1.mmMonthlyPaymentValue, CustomerAccount5.mmMonthlyPaymentValue, CustomerAccountModification1.mmMonthlyPaymentValue, CustomerAccount4.mmMonthlyPaymentValue,
					CustomerAccount2.mmMinimumMonthlyPaymentValue, CustomerAccount2.mmMaximumMonthlyPaymentValue, CustomerAccount3.mmMonthlyPaymentValue, CustomerAccount7.mmMinimumMonthlyPaymentValue,
					CustomerAccount7.mmMaximumMonthlyPaymentValue, CustomerAccount6.mmMonthlyPaymentValue);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountReportedMovement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MonthlyPaymentValue";
			definition = "Monthly average of the payment amounts (that is, payments going out) over a year.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(AccountReportedMovement obj) {
			return obj.getMonthlyPaymentValue();
		}

		@Override
		public void setValue(AccountReportedMovement obj, CurrencyAndAmount value) {
			obj.setMonthlyPaymentValue(value);
		}
	};
	protected CurrencyAndAmount monthlyReceivedValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMinimumMonthlyReceivedValue
	 * CustomerAccount7.mmMinimumMonthlyReceivedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMaximumMonthlyReceivedValue
	 * CustomerAccount7.mmMaximumMonthlyReceivedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmMonthlyReceivedValue
	 * CustomerAccount6.mmMonthlyReceivedValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement
	 * AccountReportedMovement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyReceivedValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monthly average of the received amounts over a year (that is, payments coming in)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AccountReportedMovement, CurrencyAndAmount> mmMonthlyReceivedValue = new MMBusinessAttribute<AccountReportedMovement, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CustomerAccount1.mmMonthlyReceivedValue, CustomerAccount5.mmMonthlyReceivedValue, CustomerAccountModification1.mmMonthlyReceivedValue, CustomerAccount4.mmMonthlyReceivedValue,
					CustomerAccount2.mmMinimumMonthlyReceivedValue, CustomerAccount2.mmMaximumMonthlyReceivedValue, CustomerAccount3.mmMonthlyReceivedValue, CustomerAccount7.mmMinimumMonthlyReceivedValue,
					CustomerAccount7.mmMaximumMonthlyReceivedValue, CustomerAccount6.mmMonthlyReceivedValue);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountReportedMovement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MonthlyReceivedValue";
			definition = "Monthly average of the received amounts over a year (that is, payments coming in).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(AccountReportedMovement obj) {
			return obj.getMonthlyReceivedValue();
		}

		@Override
		public void setValue(AccountReportedMovement obj, CurrencyAndAmount value) {
			obj.setMonthlyReceivedValue(value);
		}
	};
	protected Max35Text monthlyTransactionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMinimumMonthlyTransactionNumber
	 * CustomerAccount7.mmMinimumMonthlyTransactionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMaximumMonthlyTransactionNumber
	 * CustomerAccount7.mmMaximumMonthlyTransactionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmMonthlyTransactionNumber
	 * CustomerAccount6.mmMonthlyTransactionNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement
	 * AccountReportedMovement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyTransactionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monthly average of the number of payments (coming in and going out) over a year."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AccountReportedMovement, Max35Text> mmMonthlyTransactionNumber = new MMBusinessAttribute<AccountReportedMovement, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CustomerAccount1.mmMonthlyTransactionNumber, CustomerAccount5.mmMonthlyTransactionNumber, CustomerAccountModification1.mmMonthlyTransactionNumber,
					CustomerAccount4.mmMonthlyTransactionNumber, CustomerAccount2.mmMinimumMonthlyTransactionNumber, CustomerAccount2.mmMaximumMonthlyTransactionNumber, CustomerAccount3.mmMonthlyTransactionNumber,
					CustomerAccount7.mmMinimumMonthlyTransactionNumber, CustomerAccount7.mmMaximumMonthlyTransactionNumber, CustomerAccount6.mmMonthlyTransactionNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountReportedMovement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MonthlyTransactionNumber";
			definition = "Monthly average of the number of payments (coming in and going out) over a year.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AccountReportedMovement obj) {
			return obj.getMonthlyTransactionNumber();
		}

		@Override
		public void setValue(AccountReportedMovement obj, Max35Text value) {
			obj.setMonthlyTransactionNumber(value);
		}
	};
	protected CurrencyAndAmount averageBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMinimumAverageBalance
	 * CustomerAccount7.mmMinimumAverageBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMaximumAverageBalance
	 * CustomerAccount7.mmMaximumAverageBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmAverageBalance
	 * CustomerAccount6.mmAverageBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement
	 * AccountReportedMovement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of the end of day balances over a month divided by the number of business days in the month."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AccountReportedMovement, CurrencyAndAmount> mmAverageBalance = new MMBusinessAttribute<AccountReportedMovement, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CustomerAccount1.mmAverageBalance, CustomerAccount5.mmAverageBalance, CustomerAccountModification1.mmAverageBalance, CustomerAccount4.mmAverageBalance,
					CustomerAccount2.mmMinimumAverageBalance, CustomerAccount2.mmMaximumAverageBalance, CustomerAccount3.mmAverageBalance, CustomerAccount7.mmMinimumAverageBalance, CustomerAccount7.mmMaximumAverageBalance,
					CustomerAccount6.mmAverageBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountReportedMovement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AverageBalance";
			definition = "Sum of the end of day balances over a month divided by the number of business days in the month.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(AccountReportedMovement obj) {
			return obj.getAverageBalance();
		}

		@Override
		public void setValue(AccountReportedMovement obj, CurrencyAndAmount value) {
			obj.setAverageBalance(value);
		}
	};
	protected CashAccount reportedCashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmReportedMovements
	 * CashAccount.mmReportedMovements}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement
	 * AccountReportedMovement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedCashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account for which reported movements are calculated."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AccountReportedMovement, Optional<CashAccount>> mmReportedCashAccount = new MMBusinessAssociationEnd<AccountReportedMovement, Optional<CashAccount>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountReportedMovement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportedCashAccount";
			definition = "Cash account for which reported movements are calculated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CashAccount.mmReportedMovements;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashAccount.mmObject();
		}

		@Override
		public Optional<CashAccount> getValue(AccountReportedMovement obj) {
			return obj.getReportedCashAccount();
		}

		@Override
		public void setValue(AccountReportedMovement obj, Optional<CashAccount> value) {
			obj.setReportedCashAccount(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountReportedMovement";
				definition = "Provides statistical information on the number of movements and their value for a particular account.";
				associationDomain_lazy = () -> Arrays.asList(CashAccount.mmReportedMovements);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountReportedMovement.mmMonthlyPaymentValue, com.tools20022.repository.entity.AccountReportedMovement.mmMonthlyReceivedValue,
						com.tools20022.repository.entity.AccountReportedMovement.mmMonthlyTransactionNumber, com.tools20022.repository.entity.AccountReportedMovement.mmAverageBalance,
						com.tools20022.repository.entity.AccountReportedMovement.mmReportedCashAccount);
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountReportedMovement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getMonthlyPaymentValue() {
		return monthlyPaymentValue;
	}

	public AccountReportedMovement setMonthlyPaymentValue(CurrencyAndAmount monthlyPaymentValue) {
		this.monthlyPaymentValue = Objects.requireNonNull(monthlyPaymentValue);
		return this;
	}

	public CurrencyAndAmount getMonthlyReceivedValue() {
		return monthlyReceivedValue;
	}

	public AccountReportedMovement setMonthlyReceivedValue(CurrencyAndAmount monthlyReceivedValue) {
		this.monthlyReceivedValue = Objects.requireNonNull(monthlyReceivedValue);
		return this;
	}

	public Max35Text getMonthlyTransactionNumber() {
		return monthlyTransactionNumber;
	}

	public AccountReportedMovement setMonthlyTransactionNumber(Max35Text monthlyTransactionNumber) {
		this.monthlyTransactionNumber = Objects.requireNonNull(monthlyTransactionNumber);
		return this;
	}

	public CurrencyAndAmount getAverageBalance() {
		return averageBalance;
	}

	public AccountReportedMovement setAverageBalance(CurrencyAndAmount averageBalance) {
		this.averageBalance = Objects.requireNonNull(averageBalance);
		return this;
	}

	public Optional<CashAccount> getReportedCashAccount() {
		return reportedCashAccount == null ? Optional.empty() : Optional.of(reportedCashAccount);
	}

	public AccountReportedMovement setReportedCashAccount(CashAccount reportedCashAccount) {
		this.reportedCashAccount = reportedCashAccount;
		return this;
	}
}