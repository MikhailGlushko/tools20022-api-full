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
import com.tools20022.repository.choice.AmountOrCoefficientPrice1Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.ISINOct2015Identifier;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.CollateralValuation;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.entity.Security;
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
 * Provides details of the collateral reference data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValue2#mmSecurityIdentification
 * CollateralValue2.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValue2#mmValuationDate
 * CollateralValue2.mmValuationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValue2#mmValuationCurrency
 * CollateralValue2.mmValuationCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValue2#mmValuationPrice
 * CollateralValue2.mmValuationPrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralValuation
 * CollateralValuation}</li>
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
 * "CollateralValue2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details of the collateral reference data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CollateralValue1 CollateralValue1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralValue2", propOrder = {"securityIdentification", "valuationDate", "valuationCurrency", "valuationPrice"})
public class CollateralValue2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctyId", required = true)
	protected ISINOct2015Identifier securityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISINOct2015Identifier
	 * ISINOct2015Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
	 * SecuritiesIdentification.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValue2
	 * CollateralValue2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a security by an ISIN."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValue1#mmSecurityIdentification
	 * CollateralValue1.mmSecurityIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValue2, ISINOct2015Identifier> mmSecurityIdentification = new MMMessageAttribute<CollateralValue2, ISINOct2015Identifier>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValue2.mmObject();
			isDerived = false;
			xmlTag = "SctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Identification of a security by an ISIN.";
			previousVersion_lazy = () -> CollateralValue1.mmSecurityIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}

		@Override
		public ISINOct2015Identifier getValue(CollateralValue2 obj) {
			return obj.getSecurityIdentification();
		}

		@Override
		public void setValue(CollateralValue2 obj, ISINOct2015Identifier value) {
			obj.setSecurityIdentification(value);
		}
	};
	@XmlElement(name = "ValtnDt", required = true)
	protected ISODate valuationDate;
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
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateralValuationDate
	 * CollateralValuation.mmCollateralValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValue2
	 * CollateralValue2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Valuation date for the price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValue1#mmValuationDate
	 * CollateralValue1.mmValuationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValue2, ISODate> mmValuationDate = new MMMessageAttribute<CollateralValue2, ISODate>() {
		{
			businessElementTrace_lazy = () -> CollateralValuation.mmCollateralValuationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValue2.mmObject();
			isDerived = false;
			xmlTag = "ValtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationDate";
			definition = "Valuation date for the price.";
			previousVersion_lazy = () -> CollateralValue1.mmValuationDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(CollateralValue2 obj) {
			return obj.getValuationDate();
		}

		@Override
		public void setValue(CollateralValue2 obj, ISODate value) {
			obj.setValuationDate(value);
		}
	};
	@XmlElement(name = "ValtnCcy")
	protected ActiveCurrencyCode valuationCurrency;
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
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateralValuationCurrency
	 * CollateralValuation.mmCollateralValuationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValue2
	 * CollateralValue2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details of the currency of the valuation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValue1#mmValuationCurrency
	 * CollateralValue1.mmValuationCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValue2, Optional<ActiveCurrencyCode>> mmValuationCurrency = new MMMessageAttribute<CollateralValue2, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> CollateralValuation.mmCollateralValuationCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValue2.mmObject();
			isDerived = false;
			xmlTag = "ValtnCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationCurrency";
			definition = "Provides details of the currency of the valuation.";
			previousVersion_lazy = () -> CollateralValue1.mmValuationCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(CollateralValue2 obj) {
			return obj.getValuationCurrency();
		}

		@Override
		public void setValue(CollateralValue2 obj, Optional<ActiveCurrencyCode> value) {
			obj.setValuationCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "ValtnPric", required = true)
	protected AmountOrCoefficientPrice1Choice valuationPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AmountOrCoefficientPrice1Choice
	 * AmountOrCoefficientPrice1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPricing
	 * Security.mmPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValue2
	 * CollateralValue2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details of the price provided for the security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValue1#mmValuationPrice
	 * CollateralValue1.mmValuationPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValue2, AmountOrCoefficientPrice1Choice> mmValuationPrice = new MMMessageAttribute<CollateralValue2, AmountOrCoefficientPrice1Choice>() {
		{
			businessElementTrace_lazy = () -> Security.mmPricing;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValue2.mmObject();
			isDerived = false;
			xmlTag = "ValtnPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationPrice";
			definition = "Provides details of the price provided for the security.";
			previousVersion_lazy = () -> CollateralValue1.mmValuationPrice;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountOrCoefficientPrice1Choice.mmObject();
		}

		@Override
		public AmountOrCoefficientPrice1Choice getValue(CollateralValue2 obj) {
			return obj.getValuationPrice();
		}

		@Override
		public void setValue(CollateralValue2 obj, AmountOrCoefficientPrice1Choice value) {
			obj.setValuationPrice(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralValue2.mmSecurityIdentification, com.tools20022.repository.msg.CollateralValue2.mmValuationDate,
						com.tools20022.repository.msg.CollateralValue2.mmValuationCurrency, com.tools20022.repository.msg.CollateralValue2.mmValuationPrice);
				trace_lazy = () -> CollateralValuation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralValue2";
				definition = "Provides details of the collateral reference data.";
				previousVersion_lazy = () -> CollateralValue1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ISINOct2015Identifier getSecurityIdentification() {
		return securityIdentification;
	}

	public CollateralValue2 setSecurityIdentification(ISINOct2015Identifier securityIdentification) {
		this.securityIdentification = Objects.requireNonNull(securityIdentification);
		return this;
	}

	public ISODate getValuationDate() {
		return valuationDate;
	}

	public CollateralValue2 setValuationDate(ISODate valuationDate) {
		this.valuationDate = Objects.requireNonNull(valuationDate);
		return this;
	}

	public Optional<ActiveCurrencyCode> getValuationCurrency() {
		return valuationCurrency == null ? Optional.empty() : Optional.of(valuationCurrency);
	}

	public CollateralValue2 setValuationCurrency(ActiveCurrencyCode valuationCurrency) {
		this.valuationCurrency = valuationCurrency;
		return this;
	}

	public AmountOrCoefficientPrice1Choice getValuationPrice() {
		return valuationPrice;
	}

	public CollateralValue2 setValuationPrice(AmountOrCoefficientPrice1Choice valuationPrice) {
		this.valuationPrice = Objects.requireNonNull(valuationPrice);
		return this;
	}
}