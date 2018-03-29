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
import com.tools20022.repository.choice.AccountIdentification4Choice;
import com.tools20022.repository.codeset.AccountStatus3Code;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.Frequency3Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashAccountType2;
import com.tools20022.repository.msg.Restriction1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account owned by a customer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmIdentification
 * CustomerAccount3.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount3#mmName
 * CustomerAccount3.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount3#mmStatus
 * CustomerAccount3.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount3#mmType
 * CustomerAccount3.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount3#mmCurrency
 * CustomerAccount3.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmMonthlyPaymentValue
 * CustomerAccount3.mmMonthlyPaymentValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmMonthlyReceivedValue
 * CustomerAccount3.mmMonthlyReceivedValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmMonthlyTransactionNumber
 * CustomerAccount3.mmMonthlyTransactionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmAverageBalance
 * CustomerAccount3.mmAverageBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmAccountPurpose
 * CustomerAccount3.mmAccountPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmFloorNotificationAmount
 * CustomerAccount3.mmFloorNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmCeilingNotificationAmount
 * CustomerAccount3.mmCeilingNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmStatementCycle
 * CustomerAccount3.mmStatementCycle}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount3#mmClosingDate
 * CustomerAccount3.mmClosingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount3#mmRestriction
 * CustomerAccount3.mmRestriction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount3#mmOpeningDate
 * CustomerAccount3.mmOpeningDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccount
 * CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerAccount3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account owned by a customer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount6
 * CustomerAccount6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CustomerAccount3", propOrder = {"identification", "name", "status", "type", "currency", "monthlyPaymentValue", "monthlyReceivedValue", "monthlyTransactionNumber", "averageBalance", "accountPurpose",
		"floorNotificationAmount", "ceilingNotificationAmount", "statementCycle", "closingDate", "restriction", "openingDate"})
public class CustomerAccount3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected AccountIdentification4Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3
	 * CustomerAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmIdentification
	 * CustomerAccount6.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount3, AccountIdentification4Choice> mmIdentification = new MMMessageAttribute<CustomerAccount3, AccountIdentification4Choice>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount3.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the account.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount6.mmIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification4Choice.mmObject();
		}

		@Override
		public AccountIdentification4Choice getValue(CustomerAccount3 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(CustomerAccount3 obj, AccountIdentification4Choice value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Nm")
	protected Max70Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmName
	 * AccountIdentification.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3
	 * CustomerAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount6#mmName
	 * CustomerAccount6.mmName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount3, Optional<Max70Text>> mmName = new MMMessageAttribute<CustomerAccount3, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount3.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount6.mmName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(CustomerAccount3 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(CustomerAccount3 obj, Optional<Max70Text> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "Sts")
	protected AccountStatus3Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountStatus3Code
	 * AccountStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmStatus
	 * Account.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3
	 * CustomerAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the current state of an account, eg, enabled or deleted."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount6#mmStatus
	 * CustomerAccount6.mmStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount3, Optional<AccountStatus3Code>> mmStatus = new MMMessageAttribute<CustomerAccount3, Optional<AccountStatus3Code>>() {
		{
			businessElementTrace_lazy = () -> Account.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount3.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Specifies the current state of an account, eg, enabled or deleted.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount6.mmStatus);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AccountStatus3Code.mmObject();
		}

		@Override
		public Optional<AccountStatus3Code> getValue(CustomerAccount3 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(CustomerAccount3 obj, Optional<AccountStatus3Code> value) {
			obj.setStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp")
	protected CashAccountType2 type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountType2
	 * CashAccountType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3
	 * CustomerAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount6#mmType
	 * CustomerAccount6.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount3, Optional<CashAccountType2>> mmType = new MMMessageAttribute<CustomerAccount3, Optional<CashAccountType2>>() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount3.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of the account.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount6.mmType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashAccountType2.mmObject();
		}

		@Override
		public Optional<CashAccountType2> getValue(CustomerAccount3 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(CustomerAccount3 obj, Optional<CashAccountType2> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy", required = true)
	protected ActiveCurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmBaseCurrency
	 * Account.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3
	 * CustomerAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Medium of exchange of value."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmCurrency
	 * CustomerAccount6.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount3, ActiveCurrencyCode> mmCurrency = new MMMessageAttribute<CustomerAccount3, ActiveCurrencyCode>() {
		{
			businessElementTrace_lazy = () -> Account.mmBaseCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount3.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Medium of exchange of value.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount6.mmCurrency);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public ActiveCurrencyCode getValue(CustomerAccount3 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(CustomerAccount3 obj, ActiveCurrencyCode value) {
			obj.setCurrency(value);
		}
	};
	@XmlElement(name = "MnthlyPmtVal")
	protected ImpliedCurrencyAndAmount monthlyPaymentValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmMonthlyPaymentValue
	 * AccountReportedMovement.mmMonthlyPaymentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3
	 * CustomerAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnthlyPmtVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyPaymentValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monthly average of the payment amounts (that is, payments going out) over a year."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmMonthlyPaymentValue
	 * CustomerAccount6.mmMonthlyPaymentValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount3, Optional<ImpliedCurrencyAndAmount>> mmMonthlyPaymentValue = new MMMessageAttribute<CustomerAccount3, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyPaymentValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount3.mmObject();
			isDerived = false;
			xmlTag = "MnthlyPmtVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonthlyPaymentValue";
			definition = "Monthly average of the payment amounts (that is, payments going out) over a year.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount6.mmMonthlyPaymentValue);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(CustomerAccount3 obj) {
			return obj.getMonthlyPaymentValue();
		}

		@Override
		public void setValue(CustomerAccount3 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setMonthlyPaymentValue(value.orElse(null));
		}
	};
	@XmlElement(name = "MnthlyRcvdVal")
	protected ImpliedCurrencyAndAmount monthlyReceivedValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmMonthlyReceivedValue
	 * AccountReportedMovement.mmMonthlyReceivedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3
	 * CustomerAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnthlyRcvdVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyReceivedValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monthly average of the received amounts over a year (that is, payments coming in)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmMonthlyReceivedValue
	 * CustomerAccount6.mmMonthlyReceivedValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount3, Optional<ImpliedCurrencyAndAmount>> mmMonthlyReceivedValue = new MMMessageAttribute<CustomerAccount3, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyReceivedValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount3.mmObject();
			isDerived = false;
			xmlTag = "MnthlyRcvdVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonthlyReceivedValue";
			definition = "Monthly average of the received amounts over a year (that is, payments coming in).";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount6.mmMonthlyReceivedValue);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(CustomerAccount3 obj) {
			return obj.getMonthlyReceivedValue();
		}

		@Override
		public void setValue(CustomerAccount3 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setMonthlyReceivedValue(value.orElse(null));
		}
	};
	@XmlElement(name = "MnthlyTxNb")
	protected Max5NumericText monthlyTransactionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5NumericText
	 * Max5NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmMonthlyTransactionNumber
	 * AccountReportedMovement.mmMonthlyTransactionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3
	 * CustomerAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnthlyTxNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyTransactionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monthly average of the number of payments (coming in and going out) over a year."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmMonthlyTransactionNumber
	 * CustomerAccount6.mmMonthlyTransactionNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount3, Optional<Max5NumericText>> mmMonthlyTransactionNumber = new MMMessageAttribute<CustomerAccount3, Optional<Max5NumericText>>() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyTransactionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount3.mmObject();
			isDerived = false;
			xmlTag = "MnthlyTxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonthlyTransactionNumber";
			definition = "Monthly average of the number of payments (coming in and going out) over a year.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount6.mmMonthlyTransactionNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}

		@Override
		public Optional<Max5NumericText> getValue(CustomerAccount3 obj) {
			return obj.getMonthlyTransactionNumber();
		}

		@Override
		public void setValue(CustomerAccount3 obj, Optional<Max5NumericText> value) {
			obj.setMonthlyTransactionNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "AvrgBal")
	protected ImpliedCurrencyAndAmount averageBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmAverageBalance
	 * AccountReportedMovement.mmAverageBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3
	 * CustomerAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of the end of day balances over a month divided by the number of business days in the month."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmAverageBalance
	 * CustomerAccount6.mmAverageBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount3, Optional<ImpliedCurrencyAndAmount>> mmAverageBalance = new MMMessageAttribute<CustomerAccount3, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmAverageBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount3.mmObject();
			isDerived = false;
			xmlTag = "AvrgBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageBalance";
			definition = "Sum of the end of day balances over a month divided by the number of business days in the month.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount6.mmAverageBalance);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(CustomerAccount3 obj) {
			return obj.getAverageBalance();
		}

		@Override
		public void setValue(CustomerAccount3 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setAverageBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctPurp")
	protected Max140Text accountPurpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmPurpose
	 * Account.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3
	 * CustomerAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctPurp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the purpose of the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmAccountPurpose
	 * CustomerAccount6.mmAccountPurpose}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount3, Optional<Max140Text>> mmAccountPurpose = new MMMessageAttribute<CustomerAccount3, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> Account.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount3.mmObject();
			isDerived = false;
			xmlTag = "AcctPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountPurpose";
			definition = "Specifies the purpose of the account.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount6.mmAccountPurpose);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(CustomerAccount3 obj) {
			return obj.getAccountPurpose();
		}

		@Override
		public void setValue(CustomerAccount3 obj, Optional<Max140Text> value) {
			obj.setAccountPurpose(value.orElse(null));
		}
	};
	@XmlElement(name = "FlrNtfctnAmt")
	protected ImpliedCurrencyAndAmount floorNotificationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmFloorNotificationAmount
	 * ReportingService.mmFloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3
	 * CustomerAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FlrNtfctnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloorNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the value of the balance under which a notification will be sent to the account owner."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmFloorNotificationAmount
	 * CustomerAccount6.mmFloorNotificationAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount3, Optional<ImpliedCurrencyAndAmount>> mmFloorNotificationAmount = new MMMessageAttribute<CustomerAccount3, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmFloorNotificationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount3.mmObject();
			isDerived = false;
			xmlTag = "FlrNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloorNotificationAmount";
			definition = "Specifies the value of the balance under which a notification will be sent to the account owner.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount6.mmFloorNotificationAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(CustomerAccount3 obj) {
			return obj.getFloorNotificationAmount();
		}

		@Override
		public void setValue(CustomerAccount3 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setFloorNotificationAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ClngNtfctnAmt")
	protected ImpliedCurrencyAndAmount ceilingNotificationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmCeilingNotificationAmount
	 * ReportingService.mmCeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3
	 * CustomerAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClngNtfctnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CeilingNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the value of the balance above which a notification will be sent to the account owner."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmCeilingNotificationAmount
	 * CustomerAccount6.mmCeilingNotificationAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount3, Optional<ImpliedCurrencyAndAmount>> mmCeilingNotificationAmount = new MMMessageAttribute<CustomerAccount3, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmCeilingNotificationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount3.mmObject();
			isDerived = false;
			xmlTag = "ClngNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CeilingNotificationAmount";
			definition = "Specifies the value of the balance above which a notification will be sent to the account owner.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount6.mmCeilingNotificationAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(CustomerAccount3 obj) {
			return obj.getCeilingNotificationAmount();
		}

		@Override
		public void setValue(CustomerAccount3 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setCeilingNotificationAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "StmtCycl")
	protected Frequency3Code statementCycle;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency3Code
	 * Frequency3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmStatementFrequency
	 * ReportingService.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3
	 * CustomerAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtCycl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementCycle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how often statements (for audit purposes) will be sent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount3, Optional<Frequency3Code>> mmStatementCycle = new MMMessageAttribute<CustomerAccount3, Optional<Frequency3Code>>() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmStatementFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount3.mmObject();
			isDerived = false;
			xmlTag = "StmtCycl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementCycle";
			definition = "Specifies how often statements (for audit purposes) will be sent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency3Code.mmObject();
		}

		@Override
		public Optional<Frequency3Code> getValue(CustomerAccount3 obj) {
			return obj.getStatementCycle();
		}

		@Override
		public void setValue(CustomerAccount3 obj, Optional<Frequency3Code> value) {
			obj.setStatementCycle(value.orElse(null));
		}
	};
	@XmlElement(name = "ClsgDt")
	protected ISODate closingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmClosingDate
	 * Account.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3
	 * CustomerAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the account will be or was closed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmClosingDate
	 * CustomerAccount6.mmClosingDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount3, Optional<ISODate>> mmClosingDate = new MMMessageAttribute<CustomerAccount3, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Account.mmClosingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount3.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Date when the account will be or was closed.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount6.mmClosingDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CustomerAccount3 obj) {
			return obj.getClosingDate();
		}

		@Override
		public void setValue(CustomerAccount3 obj, Optional<ISODate> value) {
			obj.setClosingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Rstrctn")
	protected List<Restriction1> restriction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Restriction1
	 * Restriction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmAccountRestriction
	 * Account.mmAccountRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3
	 * CustomerAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rstrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Restriction on capability or operations allowed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmRestriction
	 * CustomerAccount6.mmRestriction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CustomerAccount3, List<Restriction1>> mmRestriction = new MMMessageAssociationEnd<CustomerAccount3, List<Restriction1>>() {
		{
			businessElementTrace_lazy = () -> Account.mmAccountRestriction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount3.mmObject();
			isDerived = false;
			xmlTag = "Rstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restriction";
			definition = "Restriction on capability or operations allowed.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount6.mmRestriction);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Restriction1.mmObject();
		}

		@Override
		public List<Restriction1> getValue(CustomerAccount3 obj) {
			return obj.getRestriction();
		}

		@Override
		public void setValue(CustomerAccount3 obj, List<Restriction1> value) {
			obj.setRestriction(value);
		}
	};
	@XmlElement(name = "OpngDt")
	protected ISODate openingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmOpeningDate
	 * Account.mmOpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3
	 * CustomerAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the account was opened."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmOpeningDate
	 * CustomerAccount6.mmOpeningDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount3, Optional<ISODate>> mmOpeningDate = new MMMessageAttribute<CustomerAccount3, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Account.mmOpeningDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount3.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Date when the account was opened.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount6.mmOpeningDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CustomerAccount3 obj) {
			return obj.getOpeningDate();
		}

		@Override
		public void setValue(CustomerAccount3 obj, Optional<ISODate> value) {
			obj.setOpeningDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount3.mmIdentification, com.tools20022.repository.msg.CustomerAccount3.mmName, com.tools20022.repository.msg.CustomerAccount3.mmStatus,
						com.tools20022.repository.msg.CustomerAccount3.mmType, com.tools20022.repository.msg.CustomerAccount3.mmCurrency, com.tools20022.repository.msg.CustomerAccount3.mmMonthlyPaymentValue,
						com.tools20022.repository.msg.CustomerAccount3.mmMonthlyReceivedValue, com.tools20022.repository.msg.CustomerAccount3.mmMonthlyTransactionNumber, com.tools20022.repository.msg.CustomerAccount3.mmAverageBalance,
						com.tools20022.repository.msg.CustomerAccount3.mmAccountPurpose, com.tools20022.repository.msg.CustomerAccount3.mmFloorNotificationAmount, com.tools20022.repository.msg.CustomerAccount3.mmCeilingNotificationAmount,
						com.tools20022.repository.msg.CustomerAccount3.mmStatementCycle, com.tools20022.repository.msg.CustomerAccount3.mmClosingDate, com.tools20022.repository.msg.CustomerAccount3.mmRestriction,
						com.tools20022.repository.msg.CustomerAccount3.mmOpeningDate);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CustomerAccount3";
				definition = "Account owned by a customer.";
				nextVersions_lazy = () -> Arrays.asList(CustomerAccount6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public AccountIdentification4Choice getIdentification() {
		return identification;
	}

	public CustomerAccount3 setIdentification(AccountIdentification4Choice identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max70Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public CustomerAccount3 setName(Max70Text name) {
		this.name = name;
		return this;
	}

	public Optional<AccountStatus3Code> getStatus() {
		return status == null ? Optional.empty() : Optional.of(status);
	}

	public CustomerAccount3 setStatus(AccountStatus3Code status) {
		this.status = status;
		return this;
	}

	public Optional<CashAccountType2> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public CustomerAccount3 setType(CashAccountType2 type) {
		this.type = type;
		return this;
	}

	public ActiveCurrencyCode getCurrency() {
		return currency;
	}

	public CustomerAccount3 setCurrency(ActiveCurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMonthlyPaymentValue() {
		return monthlyPaymentValue == null ? Optional.empty() : Optional.of(monthlyPaymentValue);
	}

	public CustomerAccount3 setMonthlyPaymentValue(ImpliedCurrencyAndAmount monthlyPaymentValue) {
		this.monthlyPaymentValue = monthlyPaymentValue;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMonthlyReceivedValue() {
		return monthlyReceivedValue == null ? Optional.empty() : Optional.of(monthlyReceivedValue);
	}

	public CustomerAccount3 setMonthlyReceivedValue(ImpliedCurrencyAndAmount monthlyReceivedValue) {
		this.monthlyReceivedValue = monthlyReceivedValue;
		return this;
	}

	public Optional<Max5NumericText> getMonthlyTransactionNumber() {
		return monthlyTransactionNumber == null ? Optional.empty() : Optional.of(monthlyTransactionNumber);
	}

	public CustomerAccount3 setMonthlyTransactionNumber(Max5NumericText monthlyTransactionNumber) {
		this.monthlyTransactionNumber = monthlyTransactionNumber;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getAverageBalance() {
		return averageBalance == null ? Optional.empty() : Optional.of(averageBalance);
	}

	public CustomerAccount3 setAverageBalance(ImpliedCurrencyAndAmount averageBalance) {
		this.averageBalance = averageBalance;
		return this;
	}

	public Optional<Max140Text> getAccountPurpose() {
		return accountPurpose == null ? Optional.empty() : Optional.of(accountPurpose);
	}

	public CustomerAccount3 setAccountPurpose(Max140Text accountPurpose) {
		this.accountPurpose = accountPurpose;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getFloorNotificationAmount() {
		return floorNotificationAmount == null ? Optional.empty() : Optional.of(floorNotificationAmount);
	}

	public CustomerAccount3 setFloorNotificationAmount(ImpliedCurrencyAndAmount floorNotificationAmount) {
		this.floorNotificationAmount = floorNotificationAmount;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getCeilingNotificationAmount() {
		return ceilingNotificationAmount == null ? Optional.empty() : Optional.of(ceilingNotificationAmount);
	}

	public CustomerAccount3 setCeilingNotificationAmount(ImpliedCurrencyAndAmount ceilingNotificationAmount) {
		this.ceilingNotificationAmount = ceilingNotificationAmount;
		return this;
	}

	public Optional<Frequency3Code> getStatementCycle() {
		return statementCycle == null ? Optional.empty() : Optional.of(statementCycle);
	}

	public CustomerAccount3 setStatementCycle(Frequency3Code statementCycle) {
		this.statementCycle = statementCycle;
		return this;
	}

	public Optional<ISODate> getClosingDate() {
		return closingDate == null ? Optional.empty() : Optional.of(closingDate);
	}

	public CustomerAccount3 setClosingDate(ISODate closingDate) {
		this.closingDate = closingDate;
		return this;
	}

	public List<Restriction1> getRestriction() {
		return restriction == null ? restriction = new ArrayList<>() : restriction;
	}

	public CustomerAccount3 setRestriction(List<Restriction1> restriction) {
		this.restriction = Objects.requireNonNull(restriction);
		return this;
	}

	public Optional<ISODate> getOpeningDate() {
		return openingDate == null ? Optional.empty() : Optional.of(openingDate);
	}

	public CustomerAccount3 setOpeningDate(ISODate openingDate) {
		this.openingDate = openingDate;
		return this;
	}
}