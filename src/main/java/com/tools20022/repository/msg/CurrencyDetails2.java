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
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of a currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyDetails2#mmAlphaCode
 * CurrencyDetails2.mmAlphaCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyDetails2#mmNumericCode
 * CurrencyDetails2.mmNumericCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyDetails2#mmDecimal
 * CurrencyDetails2.mmDecimal}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyDetails2#mmName
 * CurrencyDetails2.mmName}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CurrencyDetails2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of a currency."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CurrencyDetails1 CurrencyDetails1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CurrencyDetails2", propOrder = {"alphaCode", "numericCode", "decimal", "name"})
public class CurrencyDetails2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AlphaCd")
	protected ActiveCurrencyCode alphaCode;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyDetails2
	 * CurrencyDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AlphaCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlphaCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Alpha currency code (ISO 4217, 3 alphanumeric characters)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyDetails1#mmAlphaCode
	 * CurrencyDetails1.mmAlphaCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyDetails2, Optional<ActiveCurrencyCode>> mmAlphaCode = new MMMessageAttribute<CurrencyDetails2, Optional<ActiveCurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyDetails2.mmObject();
			isDerived = false;
			xmlTag = "AlphaCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlphaCode";
			definition = "Alpha currency code (ISO 4217, 3 alphanumeric characters).";
			previousVersion_lazy = () -> CurrencyDetails1.mmAlphaCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(CurrencyDetails2 obj) {
			return obj.getAlphaCode();
		}

		@Override
		public void setValue(CurrencyDetails2 obj, Optional<ActiveCurrencyCode> value) {
			obj.setAlphaCode(value.orElse(null));
		}
	};
	@XmlElement(name = "NmrcCd")
	protected Exact3NumericText numericCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyDetails2
	 * CurrencyDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmrcCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumericCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Numeric currency code (ISO 4217, 3 numeric characters)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyDetails1#mmNumericCode
	 * CurrencyDetails1.mmNumericCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyDetails2, Optional<Exact3NumericText>> mmNumericCode = new MMMessageAttribute<CurrencyDetails2, Optional<Exact3NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyDetails2.mmObject();
			isDerived = false;
			xmlTag = "NmrcCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumericCode";
			definition = "Numeric currency code (ISO 4217, 3 numeric characters).";
			previousVersion_lazy = () -> CurrencyDetails1.mmNumericCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Optional<Exact3NumericText> getValue(CurrencyDetails2 obj) {
			return obj.getNumericCode();
		}

		@Override
		public void setValue(CurrencyDetails2 obj, Optional<Exact3NumericText> value) {
			obj.setNumericCode(value.orElse(null));
		}
	};
	@XmlElement(name = "Dcml")
	protected Number decimal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyDetails2
	 * CurrencyDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dcml"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Decimal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximal number of digits after the decimal separator for the currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyDetails1#mmDecimal
	 * CurrencyDetails1.mmDecimal}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyDetails2, Optional<Number>> mmDecimal = new MMMessageAttribute<CurrencyDetails2, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyDetails2.mmObject();
			isDerived = false;
			xmlTag = "Dcml";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Decimal";
			definition = "Maximal number of digits after the decimal separator for the currency.";
			previousVersion_lazy = () -> CurrencyDetails1.mmDecimal;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(CurrencyDetails2 obj) {
			return obj.getDecimal();
		}

		@Override
		public void setValue(CurrencyDetails2 obj, Optional<Number> value) {
			obj.setDecimal(value.orElse(null));
		}
	};
	@XmlElement(name = "Nm")
	protected Max35Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyDetails2
	 * CurrencyDetails2}</li>
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
	 * definition} = "Full name of the currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyDetails1#mmName
	 * CurrencyDetails1.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyDetails2, Optional<Max35Text>> mmName = new MMMessageAttribute<CurrencyDetails2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyDetails2.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Full name of the currency.";
			previousVersion_lazy = () -> CurrencyDetails1.mmName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CurrencyDetails2 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(CurrencyDetails2 obj, Optional<Max35Text> value) {
			obj.setName(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyDetails2.mmAlphaCode, com.tools20022.repository.msg.CurrencyDetails2.mmNumericCode, com.tools20022.repository.msg.CurrencyDetails2.mmDecimal,
						com.tools20022.repository.msg.CurrencyDetails2.mmName);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyDetails2";
				definition = "Details of a currency.";
				previousVersion_lazy = () -> CurrencyDetails1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveCurrencyCode> getAlphaCode() {
		return alphaCode == null ? Optional.empty() : Optional.of(alphaCode);
	}

	public CurrencyDetails2 setAlphaCode(ActiveCurrencyCode alphaCode) {
		this.alphaCode = alphaCode;
		return this;
	}

	public Optional<Exact3NumericText> getNumericCode() {
		return numericCode == null ? Optional.empty() : Optional.of(numericCode);
	}

	public CurrencyDetails2 setNumericCode(Exact3NumericText numericCode) {
		this.numericCode = numericCode;
		return this;
	}

	public Optional<Number> getDecimal() {
		return decimal == null ? Optional.empty() : Optional.of(decimal);
	}

	public CurrencyDetails2 setDecimal(Number decimal) {
		this.decimal = decimal;
		return this;
	}

	public Optional<Max35Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public CurrencyDetails2 setName(Max35Text name) {
		this.name = name;
		return this;
	}
}