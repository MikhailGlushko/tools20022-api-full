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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.entity.AmountRange;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Range of amount values.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1#mmAmount
 * ActiveCurrencyAndAmountRange1.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1#mmCreditDebitIndicator
 * ActiveCurrencyAndAmountRange1.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1#mmCurrency
 * ActiveCurrencyAndAmountRange1.mmCurrency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AmountRange
 * AmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ActiveCurrencyAndAmountRange1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Range of amount values."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2018</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange2
 * ActiveCurrencyAndAmountRange2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ActiveCurrencyAndAmountRange1", propOrder = {"amount", "creditDebitIndicator", "currency"})
public class ActiveCurrencyAndAmountRange1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Amt", required = true)
	protected ImpliedCurrencyAmountRangeChoice amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice
	 * ImpliedCurrencyAmountRangeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1
	 * ActiveCurrencyAndAmountRange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specified amount or amount range."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange2#mmAmount
	 * ActiveCurrencyAndAmountRange2.mmAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ActiveCurrencyAndAmountRange1, ImpliedCurrencyAmountRangeChoice> mmAmount = new MMMessageAttribute<ActiveCurrencyAndAmountRange1, ImpliedCurrencyAmountRangeChoice>() {
		{
			businessComponentTrace_lazy = () -> AmountRange.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Specified amount or amount range.";
			nextVersions_lazy = () -> Arrays.asList(ActiveCurrencyAndAmountRange2.mmAmount);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ImpliedCurrencyAmountRangeChoice.mmObject();
		}

		@Override
		public ImpliedCurrencyAmountRangeChoice getValue(ActiveCurrencyAndAmountRange1 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(ActiveCurrencyAndAmountRange1 obj, ImpliedCurrencyAmountRangeChoice value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "CdtDbtInd")
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange#mmCreditDebitIndicator
	 * AmountRange.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1
	 * ActiveCurrencyAndAmountRange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the amount is a credited or debited amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange2#mmCreditDebitIndicator
	 * ActiveCurrencyAndAmountRange2.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ActiveCurrencyAndAmountRange1, Optional<CreditDebitCode>> mmCreditDebitIndicator = new MMMessageAttribute<ActiveCurrencyAndAmountRange1, Optional<CreditDebitCode>>() {
		{
			businessElementTrace_lazy = () -> AmountRange.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the amount is a credited or debited amount.";
			nextVersions_lazy = () -> Arrays.asList(ActiveCurrencyAndAmountRange2.mmCreditDebitIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public Optional<CreditDebitCode> getValue(ActiveCurrencyAndAmountRange1 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(ActiveCurrencyAndAmountRange1 obj, Optional<CreditDebitCode> value) {
			obj.setCreditDebitIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy", required = true)
	protected ActiveOrHistoricCurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange#mmCurrency
	 * AmountRange.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1
	 * ActiveCurrencyAndAmountRange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Medium of exchange of value, used to qualify an amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange2#mmCurrency
	 * ActiveCurrencyAndAmountRange2.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ActiveCurrencyAndAmountRange1, ActiveOrHistoricCurrencyCode> mmCurrency = new MMMessageAttribute<ActiveCurrencyAndAmountRange1, ActiveOrHistoricCurrencyCode>() {
		{
			businessElementTrace_lazy = () -> AmountRange.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Medium of exchange of value, used to qualify an amount.";
			nextVersions_lazy = () -> Arrays.asList(ActiveCurrencyAndAmountRange2.mmCurrency);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyCode getValue(ActiveCurrencyAndAmountRange1 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(ActiveCurrencyAndAmountRange1 obj, ActiveOrHistoricCurrencyCode value) {
			obj.setCurrency(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1.mmAmount, com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1.mmCreditDebitIndicator,
						com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1.mmCurrency);
				trace_lazy = () -> AmountRange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2018");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "ActiveCurrencyAndAmountRange1";
				definition = "Range of amount values.";
				nextVersions_lazy = () -> Arrays.asList(ActiveCurrencyAndAmountRange2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ImpliedCurrencyAmountRangeChoice getAmount() {
		return amount;
	}

	public ActiveCurrencyAndAmountRange1 setAmount(ImpliedCurrencyAmountRangeChoice amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Optional<CreditDebitCode> getCreditDebitIndicator() {
		return creditDebitIndicator == null ? Optional.empty() : Optional.of(creditDebitIndicator);
	}

	public ActiveCurrencyAndAmountRange1 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
		return this;
	}

	public ActiveOrHistoricCurrencyCode getCurrency() {
		return currency;
	}

	public ActiveCurrencyAndAmountRange1 setCurrency(ActiveOrHistoricCurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}
}