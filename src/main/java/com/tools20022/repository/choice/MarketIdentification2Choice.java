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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.MICIdentifier;
import com.tools20022.repository.datatype.RestrictedFINXMax30Text;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.TradingMarket;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of market identification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarketIdentification2Choice#mmMarketIdentifierCode
 * MarketIdentification2Choice.mmMarketIdentifierCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarketIdentification2Choice#mmDescription
 * MarketIdentification2Choice.mmDescription}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradingMarket
 * TradingMarket}</li>
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
 * "MarketIdentification2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of market identification."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MarketIdentification2Choice", propOrder = {"marketIdentifierCode", "description"})
public class MarketIdentification2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MktIdrCd", required = true)
	protected MICIdentifier marketIdentifierCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmMIC
	 * OrganisationIdentification.mmMIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification2Choice
	 * MarketIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktIdrCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketIdentifierCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ISO 10383 Market Identification Code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarketIdentification2Choice, MICIdentifier> mmMarketIdentifierCode = new MMMessageAttribute<MarketIdentification2Choice, MICIdentifier>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmMIC;
			componentContext_lazy = () -> com.tools20022.repository.choice.MarketIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "MktIdrCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketIdentifierCode";
			definition = "ISO 10383 Market Identification Code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}

		@Override
		public MICIdentifier getValue(MarketIdentification2Choice obj) {
			return obj.getMarketIdentifierCode();
		}

		@Override
		public void setValue(MarketIdentification2Choice obj, MICIdentifier value) {
			obj.setMarketIdentifierCode(value);
		}
	};
	@XmlElement(name = "Desc", required = true)
	protected RestrictedFINXMax30Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax30Text
	 * RestrictedFINXMax30Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification2Choice
	 * MarketIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of the market when no Market Identifier Code is available."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarketIdentification2Choice, RestrictedFINXMax30Text> mmDescription = new MMMessageAttribute<MarketIdentification2Choice, RestrictedFINXMax30Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.MarketIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Description of the market when no Market Identifier Code is available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax30Text.mmObject();
		}

		@Override
		public RestrictedFINXMax30Text getValue(MarketIdentification2Choice obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(MarketIdentification2Choice obj, RestrictedFINXMax30Text value) {
			obj.setDescription(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MarketIdentification2Choice.mmMarketIdentifierCode, com.tools20022.repository.choice.MarketIdentification2Choice.mmDescription);
				trace_lazy = () -> TradingMarket.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarketIdentification2Choice";
				definition = "Choice of market identification.";
			}
		});
		return mmObject_lazy.get();
	}

	public MICIdentifier getMarketIdentifierCode() {
		return marketIdentifierCode;
	}

	public MarketIdentification2Choice setMarketIdentifierCode(MICIdentifier marketIdentifierCode) {
		this.marketIdentifierCode = Objects.requireNonNull(marketIdentifierCode);
		return this;
	}

	public RestrictedFINXMax30Text getDescription() {
		return description;
	}

	public MarketIdentification2Choice setDescription(RestrictedFINXMax30Text description) {
		this.description = Objects.requireNonNull(description);
		return this;
	}
}