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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PaymentTokenIdentifiers1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Payment token information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentToken3#mmTokenCharacteristic
 * CardPaymentToken3.mmTokenCharacteristic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentToken3#mmTokenRequestor
 * CardPaymentToken3.mmTokenRequestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentToken3#mmTokenAssuranceLevel
 * CardPaymentToken3.mmTokenAssuranceLevel}</li>
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
 * "CardPaymentToken3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment token information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentToken4
 * CardPaymentToken4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentToken2
 * CardPaymentToken2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentToken3", propOrder = {"tokenCharacteristic", "tokenRequestor", "tokenAssuranceLevel"})
public class CardPaymentToken3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TknChrtc")
	protected List<Max35Text> tokenCharacteristic;
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentToken3
	 * CardPaymentToken3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TknChrtc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenCharacteristic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional payment token information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentToken4#mmTokenCharacteristic
	 * CardPaymentToken4.mmTokenCharacteristic}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentToken3, List<Max35Text>> mmTokenCharacteristic = new MMMessageAttribute<CardPaymentToken3, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentToken3.mmObject();
			isDerived = false;
			xmlTag = "TknChrtc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenCharacteristic";
			definition = "Additional payment token information.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentToken4.mmTokenCharacteristic);
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(CardPaymentToken3 obj) {
			return obj.getTokenCharacteristic();
		}

		@Override
		public void setValue(CardPaymentToken3 obj, List<Max35Text> value) {
			obj.setTokenCharacteristic(value);
		}
	};
	@XmlElement(name = "TknRqstr")
	protected PaymentTokenIdentifiers1 tokenRequestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTokenIdentifiers1
	 * PaymentTokenIdentifiers1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentToken3
	 * CardPaymentToken3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TknRqstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenRequestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of a token provider requestor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentToken4#mmTokenRequestor
	 * CardPaymentToken4.mmTokenRequestor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentToken3, Optional<PaymentTokenIdentifiers1>> mmTokenRequestor = new MMMessageAssociationEnd<CardPaymentToken3, Optional<PaymentTokenIdentifiers1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentToken3.mmObject();
			isDerived = false;
			xmlTag = "TknRqstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenRequestor";
			definition = "Identifier of a token provider requestor.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentToken4.mmTokenRequestor);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTokenIdentifiers1.mmObject();
		}

		@Override
		public Optional<PaymentTokenIdentifiers1> getValue(CardPaymentToken3 obj) {
			return obj.getTokenRequestor();
		}

		@Override
		public void setValue(CardPaymentToken3 obj, Optional<PaymentTokenIdentifiers1> value) {
			obj.setTokenRequestor(value.orElse(null));
		}
	};
	@XmlElement(name = "TknAssrncLvl")
	protected Number tokenAssuranceLevel;
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentToken3
	 * CardPaymentToken3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TknAssrncLvl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenAssuranceLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Level of confidence resulting of the identification and authentication of the cardholder performed and the entity that performed it."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentToken4#mmTokenAssuranceLevel
	 * CardPaymentToken4.mmTokenAssuranceLevel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentToken2#mmTokenAssuranceLevel
	 * CardPaymentToken2.mmTokenAssuranceLevel}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentToken3, Optional<Number>> mmTokenAssuranceLevel = new MMMessageAttribute<CardPaymentToken3, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentToken3.mmObject();
			isDerived = false;
			xmlTag = "TknAssrncLvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenAssuranceLevel";
			definition = "Level of confidence resulting of the identification and authentication of the cardholder performed and the entity that performed it.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentToken4.mmTokenAssuranceLevel);
			previousVersion_lazy = () -> CardPaymentToken2.mmTokenAssuranceLevel;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(CardPaymentToken3 obj) {
			return obj.getTokenAssuranceLevel();
		}

		@Override
		public void setValue(CardPaymentToken3 obj, Optional<Number> value) {
			obj.setTokenAssuranceLevel(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentToken3.mmTokenCharacteristic, com.tools20022.repository.msg.CardPaymentToken3.mmTokenRequestor,
						com.tools20022.repository.msg.CardPaymentToken3.mmTokenAssuranceLevel);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentToken3";
				definition = "Payment token information.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentToken4.mmObject());
				previousVersion_lazy = () -> CardPaymentToken2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<Max35Text> getTokenCharacteristic() {
		return tokenCharacteristic == null ? tokenCharacteristic = new ArrayList<>() : tokenCharacteristic;
	}

	public CardPaymentToken3 setTokenCharacteristic(List<Max35Text> tokenCharacteristic) {
		this.tokenCharacteristic = Objects.requireNonNull(tokenCharacteristic);
		return this;
	}

	public Optional<PaymentTokenIdentifiers1> getTokenRequestor() {
		return tokenRequestor == null ? Optional.empty() : Optional.of(tokenRequestor);
	}

	public CardPaymentToken3 setTokenRequestor(PaymentTokenIdentifiers1 tokenRequestor) {
		this.tokenRequestor = tokenRequestor;
		return this;
	}

	public Optional<Number> getTokenAssuranceLevel() {
		return tokenAssuranceLevel == null ? Optional.empty() : Optional.of(tokenAssuranceLevel);
	}

	public CardPaymentToken3 setTokenAssuranceLevel(Number tokenAssuranceLevel) {
		this.tokenAssuranceLevel = tokenAssuranceLevel;
		return this;
	}
}