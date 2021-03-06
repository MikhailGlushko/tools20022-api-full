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
import com.tools20022.repository.choice.NCBOrPaymentBank1Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.ISINOct2015Identifier;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details of the eligible securities as defined in the collateral
 * reference data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligibleSecurity2#mmSecurityIdentification
 * EligibleSecurity2.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligibleSecurity2#mmCollateralisationCurrency
 * EligibleSecurity2.mmCollateralisationCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligibleSecurity2#mmPartyIdentification
 * EligibleSecurity2.mmPartyIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EligibleSecurity2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details of the eligible securities as defined in the collateral reference data."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.EligibleSecurity1
 * EligibleSecurity1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EligibleSecurity2", propOrder = {"securityIdentification", "collateralisationCurrency", "partyIdentification"})
public class EligibleSecurity2 {

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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibleSecurity2
	 * EligibleSecurity2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a security by an ISIN."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EligibleSecurity1#mmSecurityIdentification
	 * EligibleSecurity1.mmSecurityIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EligibleSecurity2, ISINOct2015Identifier> mmSecurityIdentification = new MMMessageAttribute<EligibleSecurity2, ISINOct2015Identifier>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EligibleSecurity2.mmObject();
			isDerived = false;
			xmlTag = "SctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Identification of a security by an ISIN.";
			previousVersion_lazy = () -> EligibleSecurity1.mmSecurityIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}

		@Override
		public ISINOct2015Identifier getValue(EligibleSecurity2 obj) {
			return obj.getSecurityIdentification();
		}

		@Override
		public void setValue(EligibleSecurity2 obj, ISINOct2015Identifier value) {
			obj.setSecurityIdentification(value);
		}
	};
	@XmlElement(name = "CollstnCcy", required = true)
	protected ActiveOrHistoricCurrencyCode collateralisationCurrency;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibleSecurity2
	 * EligibleSecurity2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollstnCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisationCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency which may be processed by the system. A system may process transactions in a single currency or in multiple currencies."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EligibleSecurity1#mmCollateralisationCurrency
	 * EligibleSecurity1.mmCollateralisationCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EligibleSecurity2, ActiveOrHistoricCurrencyCode> mmCollateralisationCurrency = new MMMessageAttribute<EligibleSecurity2, ActiveOrHistoricCurrencyCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EligibleSecurity2.mmObject();
			isDerived = false;
			xmlTag = "CollstnCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisationCurrency";
			definition = "Currency which may be processed by the system. A system may process transactions in a single currency or in multiple currencies.";
			previousVersion_lazy = () -> EligibleSecurity1.mmCollateralisationCurrency;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyCode getValue(EligibleSecurity2 obj) {
			return obj.getCollateralisationCurrency();
		}

		@Override
		public void setValue(EligibleSecurity2 obj, ActiveOrHistoricCurrencyCode value) {
			obj.setCollateralisationCurrency(value);
		}
	};
	@XmlElement(name = "PtyId", required = true)
	protected NCBOrPaymentBank1Choice partyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.NCBOrPaymentBank1Choice
	 * NCBOrPaymentBank1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibleSecurity2
	 * EligibleSecurity2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party for which the eligible security is defined."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EligibleSecurity1#mmPartyIdentification
	 * EligibleSecurity1.mmPartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EligibleSecurity2, NCBOrPaymentBank1Choice> mmPartyIdentification = new MMMessageAttribute<EligibleSecurity2, NCBOrPaymentBank1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EligibleSecurity2.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Identifies the party for which the eligible security is defined.";
			previousVersion_lazy = () -> EligibleSecurity1.mmPartyIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NCBOrPaymentBank1Choice.mmObject();
		}

		@Override
		public NCBOrPaymentBank1Choice getValue(EligibleSecurity2 obj) {
			return obj.getPartyIdentification();
		}

		@Override
		public void setValue(EligibleSecurity2 obj, NCBOrPaymentBank1Choice value) {
			obj.setPartyIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EligibleSecurity2.mmSecurityIdentification, com.tools20022.repository.msg.EligibleSecurity2.mmCollateralisationCurrency,
						com.tools20022.repository.msg.EligibleSecurity2.mmPartyIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "EligibleSecurity2";
				definition = "Provides details of the eligible securities as defined in the collateral reference data.";
				previousVersion_lazy = () -> EligibleSecurity1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ISINOct2015Identifier getSecurityIdentification() {
		return securityIdentification;
	}

	public EligibleSecurity2 setSecurityIdentification(ISINOct2015Identifier securityIdentification) {
		this.securityIdentification = Objects.requireNonNull(securityIdentification);
		return this;
	}

	public ActiveOrHistoricCurrencyCode getCollateralisationCurrency() {
		return collateralisationCurrency;
	}

	public EligibleSecurity2 setCollateralisationCurrency(ActiveOrHistoricCurrencyCode collateralisationCurrency) {
		this.collateralisationCurrency = Objects.requireNonNull(collateralisationCurrency);
		return this;
	}

	public NCBOrPaymentBank1Choice getPartyIdentification() {
		return partyIdentification;
	}

	public EligibleSecurity2 setPartyIdentification(NCBOrPaymentBank1Choice partyIdentification) {
		this.partyIdentification = Objects.requireNonNull(partyIdentification);
		return this;
	}
}