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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.datatype.Max350Text;
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
 * Provides additional information regarding optional dividend election details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionalDividendAccountQuantitySD3#mmPlaceAndName
 * OptionalDividendAccountQuantitySD3.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionalDividendAccountQuantitySD3#mmBeneficialOwnerQuantity
 * OptionalDividendAccountQuantitySD3.mmBeneficialOwnerQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionalDividendAccountQuantitySD3#mmNumberOfAccounts
 * OptionalDividendAccountQuantitySD3.mmNumberOfAccounts}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OptionalDividendAccountQuantitySD3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding optional dividend election details."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.OptionalDividendAccountQuantitySD2
 * OptionalDividendAccountQuantitySD2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OptionalDividendAccountQuantitySD3", propOrder = {"placeAndName", "beneficialOwnerQuantity", "numberOfAccounts"})
public class OptionalDividendAccountQuantitySD3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionalDividendAccountQuantitySD3
	 * OptionalDividendAccountQuantitySD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Xpath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionalDividendAccountQuantitySD2#mmPlaceAndName
	 * OptionalDividendAccountQuantitySD2.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OptionalDividendAccountQuantitySD3, Optional<Max350Text>> mmPlaceAndName = new MMMessageAttribute<OptionalDividendAccountQuantitySD3, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionalDividendAccountQuantitySD3.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Xpath to the element that is being extended.";
			previousVersion_lazy = () -> OptionalDividendAccountQuantitySD2.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(OptionalDividendAccountQuantitySD3 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(OptionalDividendAccountQuantitySD3 obj, Optional<Max350Text> value) {
			obj.setPlaceAndName(value.orElse(null));
		}
	};
	@XmlElement(name = "BnfclOwnrQty", required = true)
	protected FinancialInstrumentQuantity15Choice beneficialOwnerQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionalDividendAccountQuantitySD3
	 * OptionalDividendAccountQuantitySD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfclOwnrQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Beneficial owner quantity to be paid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Beneficial Owner Quantity</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionalDividendAccountQuantitySD2#mmBeneficialOwnerQuantity
	 * OptionalDividendAccountQuantitySD2.mmBeneficialOwnerQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OptionalDividendAccountQuantitySD3, FinancialInstrumentQuantity15Choice> mmBeneficialOwnerQuantity = new MMMessageAttribute<OptionalDividendAccountQuantitySD3, FinancialInstrumentQuantity15Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionalDividendAccountQuantitySD3.mmObject();
			isDerived = false;
			xmlTag = "BnfclOwnrQty";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Beneficial Owner Quantity"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerQuantity";
			definition = "Beneficial owner quantity to be paid.";
			previousVersion_lazy = () -> OptionalDividendAccountQuantitySD2.mmBeneficialOwnerQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity15Choice getValue(OptionalDividendAccountQuantitySD3 obj) {
			return obj.getBeneficialOwnerQuantity();
		}

		@Override
		public void setValue(OptionalDividendAccountQuantitySD3 obj, FinancialInstrumentQuantity15Choice value) {
			obj.setBeneficialOwnerQuantity(value);
		}
	};
	@XmlElement(name = "NbOfAccts", required = true)
	protected Max15NumericText numberOfAccounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionalDividendAccountQuantitySD3
	 * OptionalDividendAccountQuantitySD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfAccts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfAccounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of accounts for which the beneficial quantity is elected."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionalDividendAccountQuantitySD2#mmNumberOfAccounts
	 * OptionalDividendAccountQuantitySD2.mmNumberOfAccounts}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OptionalDividendAccountQuantitySD3, Max15NumericText> mmNumberOfAccounts = new MMMessageAttribute<OptionalDividendAccountQuantitySD3, Max15NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionalDividendAccountQuantitySD3.mmObject();
			isDerived = false;
			xmlTag = "NbOfAccts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfAccounts";
			definition = "Number of accounts for which the beneficial quantity is elected.";
			previousVersion_lazy = () -> OptionalDividendAccountQuantitySD2.mmNumberOfAccounts;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Max15NumericText getValue(OptionalDividendAccountQuantitySD3 obj) {
			return obj.getNumberOfAccounts();
		}

		@Override
		public void setValue(OptionalDividendAccountQuantitySD3 obj, Max15NumericText value) {
			obj.setNumberOfAccounts(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OptionalDividendAccountQuantitySD3.mmPlaceAndName, com.tools20022.repository.msg.OptionalDividendAccountQuantitySD3.mmBeneficialOwnerQuantity,
						com.tools20022.repository.msg.OptionalDividendAccountQuantitySD3.mmNumberOfAccounts);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionalDividendAccountQuantitySD3";
				definition = "Provides additional information regarding optional dividend election details.";
				previousVersion_lazy = () -> OptionalDividendAccountQuantitySD2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public OptionalDividendAccountQuantitySD3 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public FinancialInstrumentQuantity15Choice getBeneficialOwnerQuantity() {
		return beneficialOwnerQuantity;
	}

	public OptionalDividendAccountQuantitySD3 setBeneficialOwnerQuantity(FinancialInstrumentQuantity15Choice beneficialOwnerQuantity) {
		this.beneficialOwnerQuantity = Objects.requireNonNull(beneficialOwnerQuantity);
		return this;
	}

	public Max15NumericText getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public OptionalDividendAccountQuantitySD3 setNumberOfAccounts(Max15NumericText numberOfAccounts) {
		this.numberOfAccounts = Objects.requireNonNull(numberOfAccounts);
		return this;
	}
}