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
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.CurrencyOption;
import com.tools20022.repository.entity.Option;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the value date and the amounts traded in a foreign exchange option
 * trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate5#mmCallAmount
 * AmountsAndValueDate5.mmCallAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate5#mmPutAmount
 * AmountsAndValueDate5.mmPutAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate5#mmOptionSettlementCurrency
 * AmountsAndValueDate5.mmOptionSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate5#mmFinalSettlementDate
 * AmountsAndValueDate5.mmFinalSettlementDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CurrencyOption
 * CurrencyOption}</li>
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
 * "AmountsAndValueDate5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the value date and the amounts traded in a foreign exchange option trade."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AmountsAndValueDate5", propOrder = {"callAmount", "putAmount", "optionSettlementCurrency", "finalSettlementDate"})
public class AmountsAndValueDate5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CallAmt", required = true)
	protected ActiveOrHistoricCurrencyAndAmount callAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmCallAmount
	 * CurrencyOption.mmCallAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate5
	 * AmountsAndValueDate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CallAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Call amount and currency of a foreign exchange option trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountsAndValueDate5, ActiveOrHistoricCurrencyAndAmount> mmCallAmount = new MMMessageAttribute<AmountsAndValueDate5, ActiveOrHistoricCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CurrencyOption.mmCallAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountsAndValueDate5.mmObject();
			isDerived = false;
			xmlTag = "CallAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallAmount";
			definition = "Call amount and currency of a foreign exchange option trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(AmountsAndValueDate5 obj) {
			return obj.getCallAmount();
		}

		@Override
		public void setValue(AmountsAndValueDate5 obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setCallAmount(value);
		}
	};
	@XmlElement(name = "PutAmt", required = true)
	protected ActiveOrHistoricCurrencyAndAmount putAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmPutAmount
	 * CurrencyOption.mmPutAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate5
	 * AmountsAndValueDate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PutAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Put amount and currency of a foreign exchange option trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountsAndValueDate5, ActiveOrHistoricCurrencyAndAmount> mmPutAmount = new MMMessageAttribute<AmountsAndValueDate5, ActiveOrHistoricCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CurrencyOption.mmPutAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountsAndValueDate5.mmObject();
			isDerived = false;
			xmlTag = "PutAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutAmount";
			definition = "Put amount and currency of a foreign exchange option trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(AmountsAndValueDate5 obj) {
			return obj.getPutAmount();
		}

		@Override
		public void setValue(AmountsAndValueDate5 obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setPutAmount(value);
		}
	};
	@XmlElement(name = "OptnSttlmCcy")
	protected ActiveOrHistoricCurrencyCode optionSettlementCurrency;
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
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmOptionSettlementCurrency
	 * CurrencyOption.mmOptionSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate5
	 * AmountsAndValueDate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnSttlmCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionSettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement between two parties in which one party buys a currency and the other party sells a different currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountsAndValueDate5, Optional<ActiveOrHistoricCurrencyCode>> mmOptionSettlementCurrency = new MMMessageAttribute<AmountsAndValueDate5, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> CurrencyOption.mmOptionSettlementCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountsAndValueDate5.mmObject();
			isDerived = false;
			xmlTag = "OptnSttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionSettlementCurrency";
			definition = "Agreement between two parties in which one party buys a currency and the other party sells a different currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(AmountsAndValueDate5 obj) {
			return obj.getOptionSettlementCurrency();
		}

		@Override
		public void setValue(AmountsAndValueDate5 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setOptionSettlementCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "FnlSttlmDt")
	protected ISODate finalSettlementDate;
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
	 * {@linkplain com.tools20022.repository.entity.Option#mmFinalSettlementDate
	 * Option.mmFinalSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate5
	 * AmountsAndValueDate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the trade is settled, ie, the amounts are due."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountsAndValueDate5, Optional<ISODate>> mmFinalSettlementDate = new MMMessageAttribute<AmountsAndValueDate5, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Option.mmFinalSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountsAndValueDate5.mmObject();
			isDerived = false;
			xmlTag = "FnlSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalSettlementDate";
			definition = "Date on which the trade is settled, ie, the amounts are due.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(AmountsAndValueDate5 obj) {
			return obj.getFinalSettlementDate();
		}

		@Override
		public void setValue(AmountsAndValueDate5 obj, Optional<ISODate> value) {
			obj.setFinalSettlementDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountsAndValueDate5.mmCallAmount, com.tools20022.repository.msg.AmountsAndValueDate5.mmPutAmount,
						com.tools20022.repository.msg.AmountsAndValueDate5.mmOptionSettlementCurrency, com.tools20022.repository.msg.AmountsAndValueDate5.mmFinalSettlementDate);
				trace_lazy = () -> CurrencyOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AmountsAndValueDate5";
				definition = "Specifies the value date and the amounts traded in a foreign exchange option trade.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyAndAmount getCallAmount() {
		return callAmount;
	}

	public AmountsAndValueDate5 setCallAmount(ActiveOrHistoricCurrencyAndAmount callAmount) {
		this.callAmount = Objects.requireNonNull(callAmount);
		return this;
	}

	public ActiveOrHistoricCurrencyAndAmount getPutAmount() {
		return putAmount;
	}

	public AmountsAndValueDate5 setPutAmount(ActiveOrHistoricCurrencyAndAmount putAmount) {
		this.putAmount = Objects.requireNonNull(putAmount);
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getOptionSettlementCurrency() {
		return optionSettlementCurrency == null ? Optional.empty() : Optional.of(optionSettlementCurrency);
	}

	public AmountsAndValueDate5 setOptionSettlementCurrency(ActiveOrHistoricCurrencyCode optionSettlementCurrency) {
		this.optionSettlementCurrency = optionSettlementCurrency;
		return this;
	}

	public Optional<ISODate> getFinalSettlementDate() {
		return finalSettlementDate == null ? Optional.empty() : Optional.of(finalSettlementDate);
	}

	public AmountsAndValueDate5 setFinalSettlementDate(ISODate finalSettlementDate) {
		this.finalSettlementDate = finalSettlementDate;
		return this;
	}
}