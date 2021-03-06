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
import com.tools20022.repository.datatype.Min6Max8Text;
import com.tools20022.repository.entity.CardPaymentValidation;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification33;
import com.tools20022.repository.msg.ResponseType1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Outcome of the authorisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult2#mmAuthorisationEntity
 * AuthorisationResult2.mmAuthorisationEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult2#mmResponseToAuthorisation
 * AuthorisationResult2.mmResponseToAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorisationResult2#mmAuthorisationCode
 * AuthorisationResult2.mmAuthorisationCode}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPaymentValidation
 * CardPaymentValidation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AuthorisationResult2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Outcome of the authorisation."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorisationResult3
 * AuthorisationResult3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorisationResult5
 * AuthorisationResult5}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AuthorisationResult2", propOrder = {"authorisationEntity", "responseToAuthorisation", "authorisationCode"})
public class AuthorisationResult2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AuthstnNtty")
	protected GenericIdentification33 authorisationEntity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification33
	 * GenericIdentification33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult2
	 * AuthorisationResult2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthstnNtty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationEntity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of party that has delivered or declined the card payment authorisation (the party is not identified)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult5#mmAuthorisationEntity
	 * AuthorisationResult5.mmAuthorisationEntity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AuthorisationResult2, Optional<GenericIdentification33>> mmAuthorisationEntity = new MMMessageAssociationEnd<AuthorisationResult2, Optional<GenericIdentification33>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthorisationResult2.mmObject();
			isDerived = false;
			xmlTag = "AuthstnNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationEntity";
			definition = "Type of party that has delivered or declined the card payment authorisation (the party is not identified).";
			nextVersions_lazy = () -> Arrays.asList(AuthorisationResult5.mmAuthorisationEntity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification33.mmObject();
		}

		@Override
		public Optional<GenericIdentification33> getValue(AuthorisationResult2 obj) {
			return obj.getAuthorisationEntity();
		}

		@Override
		public void setValue(AuthorisationResult2 obj, Optional<GenericIdentification33> value) {
			obj.setAuthorisationEntity(value.orElse(null));
		}
	};
	@XmlElement(name = "RspnToAuthstn", required = true)
	protected ResponseType1 responseToAuthorisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType1
	 * ResponseType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmResponse
	 * CardPaymentValidation.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult2
	 * AuthorisationResult2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnToAuthstn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseToAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to an authorisation request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult5#mmResponseToAuthorisation
	 * AuthorisationResult5.mmResponseToAuthorisation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AuthorisationResult2, ResponseType1> mmResponseToAuthorisation = new MMMessageAssociationEnd<AuthorisationResult2, ResponseType1>() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmResponse;
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthorisationResult2.mmObject();
			isDerived = false;
			xmlTag = "RspnToAuthstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseToAuthorisation";
			definition = "Response to an authorisation request.";
			nextVersions_lazy = () -> Arrays.asList(AuthorisationResult5.mmResponseToAuthorisation);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ResponseType1.mmObject();
		}

		@Override
		public ResponseType1 getValue(AuthorisationResult2 obj) {
			return obj.getResponseToAuthorisation();
		}

		@Override
		public void setValue(AuthorisationResult2 obj, ResponseType1 value) {
			obj.setResponseToAuthorisation(value);
		}
	};
	@XmlElement(name = "AuthstnCd")
	protected Min6Max8Text authorisationCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min6Max8Text Min6Max8Text}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmAuthorisationCode
	 * CardPaymentValidation.mmAuthorisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult2
	 * AuthorisationResult2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthstnCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value assigned by the authorising party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult5#mmAuthorisationCode
	 * AuthorisationResult5.mmAuthorisationCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AuthorisationResult2, Optional<Min6Max8Text>> mmAuthorisationCode = new MMMessageAttribute<AuthorisationResult2, Optional<Min6Max8Text>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmAuthorisationCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthorisationResult2.mmObject();
			isDerived = false;
			xmlTag = "AuthstnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationCode";
			definition = "Value assigned by the authorising party.";
			nextVersions_lazy = () -> Arrays.asList(AuthorisationResult5.mmAuthorisationCode);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min6Max8Text.mmObject();
		}

		@Override
		public Optional<Min6Max8Text> getValue(AuthorisationResult2 obj) {
			return obj.getAuthorisationCode();
		}

		@Override
		public void setValue(AuthorisationResult2 obj, Optional<Min6Max8Text> value) {
			obj.setAuthorisationCode(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AuthorisationResult2.mmAuthorisationEntity, com.tools20022.repository.msg.AuthorisationResult2.mmResponseToAuthorisation,
						com.tools20022.repository.msg.AuthorisationResult2.mmAuthorisationCode);
				trace_lazy = () -> CardPaymentValidation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthorisationResult2";
				definition = "Outcome of the authorisation.";
				nextVersions_lazy = () -> Arrays.asList(AuthorisationResult3.mmObject(), AuthorisationResult5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<GenericIdentification33> getAuthorisationEntity() {
		return authorisationEntity == null ? Optional.empty() : Optional.of(authorisationEntity);
	}

	public AuthorisationResult2 setAuthorisationEntity(GenericIdentification33 authorisationEntity) {
		this.authorisationEntity = authorisationEntity;
		return this;
	}

	public ResponseType1 getResponseToAuthorisation() {
		return responseToAuthorisation;
	}

	public AuthorisationResult2 setResponseToAuthorisation(ResponseType1 responseToAuthorisation) {
		this.responseToAuthorisation = Objects.requireNonNull(responseToAuthorisation);
		return this;
	}

	public Optional<Min6Max8Text> getAuthorisationCode() {
		return authorisationCode == null ? Optional.empty() : Optional.of(authorisationCode);
	}

	public AuthorisationResult2 setAuthorisationCode(Min6Max8Text authorisationCode) {
		this.authorisationCode = authorisationCode;
		return this;
	}
}