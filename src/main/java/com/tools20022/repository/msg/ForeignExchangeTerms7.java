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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.CurrencyExchange;
import com.tools20022.repository.entity.ForeignExchangeTrade;
import com.tools20022.repository.entity.Party;
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
 * Information needed to process a currency exchange or conversion.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#mmToAmount
 * ForeignExchangeTerms7.mmToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#mmFromAmount
 * ForeignExchangeTerms7.mmFromAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#mmUnitCurrency
 * ForeignExchangeTerms7.mmUnitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#mmQuotedCurrency
 * ForeignExchangeTerms7.mmQuotedCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#mmExchangeRate
 * ForeignExchangeTerms7.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#mmQuotationDate
 * ForeignExchangeTerms7.mmQuotationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#mmQuotingInstitution
 * ForeignExchangeTerms7.mmQuotingInstitution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
 * CurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignExchangeTerms7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information needed to process a currency exchange or conversion."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26
 * ForeignExchangeTerms26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33
 * ForeignExchangeTerms33}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ForeignExchangeTerms7", propOrder = {"toAmount", "fromAmount", "unitCurrency", "quotedCurrency", "exchangeRate", "quotationDate", "quotingInstitution"})
public class ForeignExchangeTerms7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ToAmt")
	protected ActiveCurrencyAnd13DecimalAmount toAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmBuyAmount
	 * ForeignExchangeTrade.mmBuyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7
	 * ForeignExchangeTerms7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ToAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash amount resulting from a foreign exchange trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#mmToAmount
	 * ForeignExchangeTerms26.mmToAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#mmToAmount
	 * ForeignExchangeTerms33.mmToAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ForeignExchangeTerms7, Optional<ActiveCurrencyAnd13DecimalAmount>> mmToAmount = new MMMessageAttribute<ForeignExchangeTerms7, Optional<ActiveCurrencyAnd13DecimalAmount>>() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmBuyAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms7.mmObject();
			isDerived = false;
			xmlTag = "ToAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToAmount";
			definition = "Cash amount resulting from a foreign exchange trade.";
			nextVersions_lazy = () -> Arrays.asList(ForeignExchangeTerms26.mmToAmount, ForeignExchangeTerms33.mmToAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAnd13DecimalAmount> getValue(ForeignExchangeTerms7 obj) {
			return obj.getToAmount();
		}

		@Override
		public void setValue(ForeignExchangeTerms7 obj, Optional<ActiveCurrencyAnd13DecimalAmount> value) {
			obj.setToAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "FrAmt")
	protected ActiveCurrencyAndAmount fromAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmSellAmount
	 * ForeignExchangeTrade.mmSellAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7
	 * ForeignExchangeTerms7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash amount for which a foreign exchange is required."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#mmFromAmount
	 * ForeignExchangeTerms26.mmFromAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#mmFromAmount
	 * ForeignExchangeTerms33.mmFromAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ForeignExchangeTerms7, Optional<ActiveCurrencyAndAmount>> mmFromAmount = new MMMessageAttribute<ForeignExchangeTerms7, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmSellAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms7.mmObject();
			isDerived = false;
			xmlTag = "FrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromAmount";
			definition = "Cash amount for which a foreign exchange is required.";
			nextVersions_lazy = () -> Arrays.asList(ForeignExchangeTerms26.mmFromAmount, ForeignExchangeTerms33.mmFromAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(ForeignExchangeTerms7 obj) {
			return obj.getFromAmount();
		}

		@Override
		public void setValue(ForeignExchangeTerms7 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setFromAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "UnitCcy", required = true)
	protected ActiveOrHistoricCurrencyCode unitCurrency;
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
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmUnitCurrency
	 * CurrencyExchange.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7
	 * ForeignExchangeTerms7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#mmUnitCurrency
	 * ForeignExchangeTerms26.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#mmUnitCurrency
	 * ForeignExchangeTerms33.mmUnitCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ForeignExchangeTerms7, ActiveOrHistoricCurrencyCode> mmUnitCurrency = new MMMessageAttribute<ForeignExchangeTerms7, ActiveOrHistoricCurrencyCode>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmUnitCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms7.mmObject();
			isDerived = false;
			xmlTag = "UnitCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitCurrency";
			definition = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.";
			nextVersions_lazy = () -> Arrays.asList(ForeignExchangeTerms26.mmUnitCurrency, ForeignExchangeTerms33.mmUnitCurrency);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyCode getValue(ForeignExchangeTerms7 obj) {
			return obj.getUnitCurrency();
		}

		@Override
		public void setValue(ForeignExchangeTerms7 obj, ActiveOrHistoricCurrencyCode value) {
			obj.setUnitCurrency(value);
		}
	};
	@XmlElement(name = "QtdCcy", required = true)
	protected ActiveOrHistoricCurrencyCode quotedCurrency;
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
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmQuotedCurrency
	 * CurrencyExchange.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7
	 * ForeignExchangeTerms7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtdCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotedCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency into which the base currency is converted, in a currency exchange."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#mmQuotedCurrency
	 * ForeignExchangeTerms26.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#mmQuotedCurrency
	 * ForeignExchangeTerms33.mmQuotedCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ForeignExchangeTerms7, ActiveOrHistoricCurrencyCode> mmQuotedCurrency = new MMMessageAttribute<ForeignExchangeTerms7, ActiveOrHistoricCurrencyCode>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmQuotedCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms7.mmObject();
			isDerived = false;
			xmlTag = "QtdCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotedCurrency";
			definition = "Currency into which the base currency is converted, in a currency exchange.";
			nextVersions_lazy = () -> Arrays.asList(ForeignExchangeTerms26.mmQuotedCurrency, ForeignExchangeTerms33.mmQuotedCurrency);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyCode getValue(ForeignExchangeTerms7 obj) {
			return obj.getQuotedCurrency();
		}

		@Override
		public void setValue(ForeignExchangeTerms7 obj, ActiveOrHistoricCurrencyCode value) {
			obj.setQuotedCurrency(value);
		}
	};
	@XmlElement(name = "XchgRate", required = true)
	protected BaseOneRate exchangeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmExchangeRate
	 * CurrencyExchange.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7
	 * ForeignExchangeTerms7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The value of one currency expressed in relation to another currency. ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::EXCH</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#mmExchangeRate
	 * ForeignExchangeTerms26.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#mmExchangeRate
	 * ForeignExchangeTerms33.mmExchangeRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ForeignExchangeTerms7, BaseOneRate> mmExchangeRate = new MMMessageAttribute<ForeignExchangeTerms7, BaseOneRate>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms7.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::EXCH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "The value of one currency expressed in relation to another currency. ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).";
			nextVersions_lazy = () -> Arrays.asList(ForeignExchangeTerms26.mmExchangeRate, ForeignExchangeTerms33.mmExchangeRate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public BaseOneRate getValue(ForeignExchangeTerms7 obj) {
			return obj.getExchangeRate();
		}

		@Override
		public void setValue(ForeignExchangeTerms7 obj, BaseOneRate value) {
			obj.setExchangeRate(value);
		}
	};
	@XmlElement(name = "QtnDt")
	protected ISODateTime quotationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmQuotationDate
	 * CurrencyExchange.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7
	 * ForeignExchangeTerms7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which an exchange rate is quoted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#mmQuotationDate
	 * ForeignExchangeTerms26.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#mmQuotationDate
	 * ForeignExchangeTerms33.mmQuotationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ForeignExchangeTerms7, Optional<ISODateTime>> mmQuotationDate = new MMMessageAttribute<ForeignExchangeTerms7, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmQuotationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms7.mmObject();
			isDerived = false;
			xmlTag = "QtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotationDate";
			definition = "Date and time at which an exchange rate is quoted.";
			nextVersions_lazy = () -> Arrays.asList(ForeignExchangeTerms26.mmQuotationDate, ForeignExchangeTerms33.mmQuotationDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(ForeignExchangeTerms7 obj) {
			return obj.getQuotationDate();
		}

		@Override
		public void setValue(ForeignExchangeTerms7 obj, Optional<ISODateTime> value) {
			obj.setQuotationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "QtgInstn")
	protected PartyIdentification2Choice quotingInstitution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7
	 * ForeignExchangeTerms7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtgInstn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotingInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that proposes a foreign exchange rate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#mmQuotingInstitution
	 * ForeignExchangeTerms26.mmQuotingInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#mmQuotingInstitution
	 * ForeignExchangeTerms33.mmQuotingInstitution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ForeignExchangeTerms7, Optional<PartyIdentification2Choice>> mmQuotingInstitution = new MMMessageAttribute<ForeignExchangeTerms7, Optional<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms7.mmObject();
			isDerived = false;
			xmlTag = "QtgInstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotingInstitution";
			definition = "Party that proposes a foreign exchange rate.";
			nextVersions_lazy = () -> Arrays.asList(ForeignExchangeTerms26.mmQuotingInstitution, ForeignExchangeTerms33.mmQuotingInstitution);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification2Choice> getValue(ForeignExchangeTerms7 obj) {
			return obj.getQuotingInstitution();
		}

		@Override
		public void setValue(ForeignExchangeTerms7 obj, Optional<PartyIdentification2Choice> value) {
			obj.setQuotingInstitution(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ForeignExchangeTerms7.mmToAmount, com.tools20022.repository.msg.ForeignExchangeTerms7.mmFromAmount,
						com.tools20022.repository.msg.ForeignExchangeTerms7.mmUnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms7.mmQuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms7.mmExchangeRate,
						com.tools20022.repository.msg.ForeignExchangeTerms7.mmQuotationDate, com.tools20022.repository.msg.ForeignExchangeTerms7.mmQuotingInstitution);
				trace_lazy = () -> CurrencyExchange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeTerms7";
				definition = "Information needed to process a currency exchange or conversion.";
				nextVersions_lazy = () -> Arrays.asList(ForeignExchangeTerms26.mmObject(), ForeignExchangeTerms33.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveCurrencyAnd13DecimalAmount> getToAmount() {
		return toAmount == null ? Optional.empty() : Optional.of(toAmount);
	}

	public ForeignExchangeTerms7 setToAmount(ActiveCurrencyAnd13DecimalAmount toAmount) {
		this.toAmount = toAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getFromAmount() {
		return fromAmount == null ? Optional.empty() : Optional.of(fromAmount);
	}

	public ForeignExchangeTerms7 setFromAmount(ActiveCurrencyAndAmount fromAmount) {
		this.fromAmount = fromAmount;
		return this;
	}

	public ActiveOrHistoricCurrencyCode getUnitCurrency() {
		return unitCurrency;
	}

	public ForeignExchangeTerms7 setUnitCurrency(ActiveOrHistoricCurrencyCode unitCurrency) {
		this.unitCurrency = Objects.requireNonNull(unitCurrency);
		return this;
	}

	public ActiveOrHistoricCurrencyCode getQuotedCurrency() {
		return quotedCurrency;
	}

	public ForeignExchangeTerms7 setQuotedCurrency(ActiveOrHistoricCurrencyCode quotedCurrency) {
		this.quotedCurrency = Objects.requireNonNull(quotedCurrency);
		return this;
	}

	public BaseOneRate getExchangeRate() {
		return exchangeRate;
	}

	public ForeignExchangeTerms7 setExchangeRate(BaseOneRate exchangeRate) {
		this.exchangeRate = Objects.requireNonNull(exchangeRate);
		return this;
	}

	public Optional<ISODateTime> getQuotationDate() {
		return quotationDate == null ? Optional.empty() : Optional.of(quotationDate);
	}

	public ForeignExchangeTerms7 setQuotationDate(ISODateTime quotationDate) {
		this.quotationDate = quotationDate;
		return this;
	}

	public Optional<PartyIdentification2Choice> getQuotingInstitution() {
		return quotingInstitution == null ? Optional.empty() : Optional.of(quotingInstitution);
	}

	public ForeignExchangeTerms7 setQuotingInstitution(PartyIdentification2Choice quotingInstitution) {
		this.quotingInstitution = quotingInstitution;
		return this;
	}
}