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
import com.tools20022.repository.codeset.AuthenticationMethod7Code;
import com.tools20022.repository.datatype.Max5000Binary;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.Authentication;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContentInformationType10;
import com.tools20022.repository.msg.OnLinePIN5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Data related to the authentication of the card and the cardholder.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication8#mmAuthenticationMethod
 * CardholderAuthentication8.mmAuthenticationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication8#mmTokenRequested
 * CardholderAuthentication8.mmTokenRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication8#mmAuthenticationValue
 * CardholderAuthentication8.mmAuthenticationValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication8#mmProtectedAuthenticationValue
 * CardholderAuthentication8.mmProtectedAuthenticationValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication8#mmCardholderOnLinePIN
 * CardholderAuthentication8.mmCardholderOnLinePIN}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Authentication
 * Authentication}</li>
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
 * "CardholderAuthentication8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Data related to the authentication of the card and the cardholder."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication7
 * CardholderAuthentication7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardholderAuthentication8", propOrder = {"authenticationMethod", "tokenRequested", "authenticationValue", "protectedAuthenticationValue", "cardholderOnLinePIN"})
public class CardholderAuthentication8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AuthntcnMtd", required = true)
	protected AuthenticationMethod7Code authenticationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod7Code
	 * AuthenticationMethod7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationMethod
	 * Authentication.mmAuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication8
	 * CardholderAuthentication8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method and data intended to be used for this transaction to authenticate the customer or its card."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication7#mmAuthenticationMethod
	 * CardholderAuthentication7.mmAuthenticationMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardholderAuthentication8, AuthenticationMethod7Code> mmAuthenticationMethod = new MMMessageAttribute<CardholderAuthentication8, AuthenticationMethod7Code>() {
		{
			businessElementTrace_lazy = () -> Authentication.mmAuthenticationMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication8.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationMethod";
			definition = "Method and data intended to be used for this transaction to authenticate the customer or its card.";
			previousVersion_lazy = () -> CardholderAuthentication7.mmAuthenticationMethod;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AuthenticationMethod7Code.mmObject();
		}

		@Override
		public AuthenticationMethod7Code getValue(CardholderAuthentication8 obj) {
			return obj.getAuthenticationMethod();
		}

		@Override
		public void setValue(CardholderAuthentication8 obj, AuthenticationMethod7Code value) {
			obj.setAuthenticationMethod(value);
		}
	};
	@XmlElement(name = "TknReqd")
	protected TrueFalseIndicator tokenRequested;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication8
	 * CardholderAuthentication8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TknReqd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TokenRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "True if an authentication token is requested to the host. This token will be provided to the ATM for further authentication."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardholderAuthentication8, Optional<TrueFalseIndicator>> mmTokenRequested = new MMMessageAttribute<CardholderAuthentication8, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication8.mmObject();
			isDerived = false;
			xmlTag = "TknReqd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenRequested";
			definition = "True if an authentication token is requested to the host. This token will be provided to the ATM for further authentication.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(CardholderAuthentication8 obj) {
			return obj.getTokenRequested();
		}

		@Override
		public void setValue(CardholderAuthentication8 obj, Optional<TrueFalseIndicator> value) {
			obj.setTokenRequested(value.orElse(null));
		}
	};
	@XmlElement(name = "AuthntcnVal")
	protected Max5000Binary authenticationValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5000Binary
	 * Max5000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationValue
	 * Authentication.mmAuthenticationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication8
	 * CardholderAuthentication8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value or token to be used for customer or card authentication."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication7#mmAuthenticationValue
	 * CardholderAuthentication7.mmAuthenticationValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardholderAuthentication8, Optional<Max5000Binary>> mmAuthenticationValue = new MMMessageAttribute<CardholderAuthentication8, Optional<Max5000Binary>>() {
		{
			businessElementTrace_lazy = () -> Authentication.mmAuthenticationValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication8.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationValue";
			definition = "Value or token to be used for customer or card authentication.";
			previousVersion_lazy = () -> CardholderAuthentication7.mmAuthenticationValue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}

		@Override
		public Optional<Max5000Binary> getValue(CardholderAuthentication8 obj) {
			return obj.getAuthenticationValue();
		}

		@Override
		public void setValue(CardholderAuthentication8 obj, Optional<Max5000Binary> value) {
			obj.setAuthenticationValue(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtctdAuthntcnVal")
	protected ContentInformationType10 protectedAuthenticationValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication8
	 * CardholderAuthentication8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdAuthntcnVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedAuthenticationValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protection of the authentication value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication7#mmProtectedAuthenticationValue
	 * CardholderAuthentication7.mmProtectedAuthenticationValue}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardholderAuthentication8, Optional<ContentInformationType10>> mmProtectedAuthenticationValue = new MMMessageAssociationEnd<CardholderAuthentication8, Optional<ContentInformationType10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication8.mmObject();
			isDerived = false;
			xmlTag = "PrtctdAuthntcnVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedAuthenticationValue";
			definition = "Protection of the authentication value.";
			previousVersion_lazy = () -> CardholderAuthentication7.mmProtectedAuthenticationValue;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType10.mmObject();
		}

		@Override
		public Optional<ContentInformationType10> getValue(CardholderAuthentication8 obj) {
			return obj.getProtectedAuthenticationValue();
		}

		@Override
		public void setValue(CardholderAuthentication8 obj, Optional<ContentInformationType10> value) {
			obj.setProtectedAuthenticationValue(value.orElse(null));
		}
	};
	@XmlElement(name = "CrdhldrOnLinePIN")
	protected OnLinePIN5 cardholderOnLinePIN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OnLinePIN5 OnLinePIN5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication8
	 * CardholderAuthentication8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrdhldrOnLinePIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderOnLinePIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Encrypted personal identification number (PIN) and related information."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication7#mmCardholderOnLinePIN
	 * CardholderAuthentication7.mmCardholderOnLinePIN}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardholderAuthentication8, Optional<OnLinePIN5>> mmCardholderOnLinePIN = new MMMessageAssociationEnd<CardholderAuthentication8, Optional<OnLinePIN5>>() {
		{
			businessComponentTrace_lazy = () -> Authentication.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardholderAuthentication8.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrOnLinePIN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderOnLinePIN";
			definition = "Encrypted personal identification number (PIN) and related information.";
			previousVersion_lazy = () -> CardholderAuthentication7.mmCardholderOnLinePIN;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OnLinePIN5.mmObject();
		}

		@Override
		public Optional<OnLinePIN5> getValue(CardholderAuthentication8 obj) {
			return obj.getCardholderOnLinePIN();
		}

		@Override
		public void setValue(CardholderAuthentication8 obj, Optional<OnLinePIN5> value) {
			obj.setCardholderOnLinePIN(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardholderAuthentication8.mmAuthenticationMethod, com.tools20022.repository.msg.CardholderAuthentication8.mmTokenRequested,
						com.tools20022.repository.msg.CardholderAuthentication8.mmAuthenticationValue, com.tools20022.repository.msg.CardholderAuthentication8.mmProtectedAuthenticationValue,
						com.tools20022.repository.msg.CardholderAuthentication8.mmCardholderOnLinePIN);
				trace_lazy = () -> Authentication.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardholderAuthentication8";
				definition = "Data related to the authentication of the card and the cardholder.";
				previousVersion_lazy = () -> CardholderAuthentication7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public AuthenticationMethod7Code getAuthenticationMethod() {
		return authenticationMethod;
	}

	public CardholderAuthentication8 setAuthenticationMethod(AuthenticationMethod7Code authenticationMethod) {
		this.authenticationMethod = Objects.requireNonNull(authenticationMethod);
		return this;
	}

	public Optional<TrueFalseIndicator> getTokenRequested() {
		return tokenRequested == null ? Optional.empty() : Optional.of(tokenRequested);
	}

	public CardholderAuthentication8 setTokenRequested(TrueFalseIndicator tokenRequested) {
		this.tokenRequested = tokenRequested;
		return this;
	}

	public Optional<Max5000Binary> getAuthenticationValue() {
		return authenticationValue == null ? Optional.empty() : Optional.of(authenticationValue);
	}

	public CardholderAuthentication8 setAuthenticationValue(Max5000Binary authenticationValue) {
		this.authenticationValue = authenticationValue;
		return this;
	}

	public Optional<ContentInformationType10> getProtectedAuthenticationValue() {
		return protectedAuthenticationValue == null ? Optional.empty() : Optional.of(protectedAuthenticationValue);
	}

	public CardholderAuthentication8 setProtectedAuthenticationValue(ContentInformationType10 protectedAuthenticationValue) {
		this.protectedAuthenticationValue = protectedAuthenticationValue;
		return this;
	}

	public Optional<OnLinePIN5> getCardholderOnLinePIN() {
		return cardholderOnLinePIN == null ? Optional.empty() : Optional.of(cardholderOnLinePIN);
	}

	public CardholderAuthentication8 setCardholderOnLinePIN(OnLinePIN5 cardholderOnLinePIN) {
		this.cardholderOnLinePIN = cardholderOnLinePIN;
		return this;
	}
}