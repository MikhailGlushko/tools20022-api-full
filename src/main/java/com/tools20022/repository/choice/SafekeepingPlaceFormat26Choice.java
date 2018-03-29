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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.SafekeepingPlace;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification89;
import com.tools20022.repository.msg.SafekeepingPlaceTypeAndAnyBICIdentifier1;
import com.tools20022.repository.msg.SafekeepingPlaceTypeAndText25;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of formats for the place of safekeeping.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice#mmIdentification
 * SafekeepingPlaceFormat26Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice#mmCountry
 * SafekeepingPlaceFormat26Choice.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice#mmTypeAndIdentification
 * SafekeepingPlaceFormat26Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice#mmProprietary
 * SafekeepingPlaceFormat26Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SafekeepingPlace
 * SafekeepingPlace}</li>
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
 * "SafekeepingPlaceFormat26Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of formats for the place of safekeeping."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat27Choice
 * SafekeepingPlaceFormat27Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SafekeepingPlaceFormat26Choice", propOrder = {"identification", "country", "typeAndIdentification", "proprietary"})
public class SafekeepingPlaceFormat26Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected SafekeepingPlaceTypeAndText25 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText25
	 * SafekeepingPlaceTypeAndText25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice
	 * SafekeepingPlaceFormat26Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94F::SAFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of safekeeping expressed as a code and a narrative description."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat27Choice#mmIdentification
	 * SafekeepingPlaceFormat27Choice.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SafekeepingPlaceFormat26Choice, SafekeepingPlaceTypeAndText25> mmIdentification = new MMMessageAssociationEnd<SafekeepingPlaceFormat26Choice, SafekeepingPlaceTypeAndText25>() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice.mmObject();
			isDerived = false;
			xmlTag = "Id";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94F::SAFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Place of safekeeping expressed as a code and a narrative description.";
			nextVersions_lazy = () -> Arrays.asList(SafekeepingPlaceFormat27Choice.mmIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SafekeepingPlaceTypeAndText25.mmObject();
		}

		@Override
		public SafekeepingPlaceTypeAndText25 getValue(SafekeepingPlaceFormat26Choice obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(SafekeepingPlaceFormat26Choice obj, SafekeepingPlaceTypeAndText25 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Ctry", required = true)
	protected CountryCode country;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmCountry
	 * SafekeepingPlace.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice
	 * SafekeepingPlaceFormat26Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of safekeeping expressed with a country code."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat27Choice#mmCountry
	 * SafekeepingPlaceFormat27Choice.mmCountry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SafekeepingPlaceFormat26Choice, CountryCode> mmCountry = new MMMessageAttribute<SafekeepingPlaceFormat26Choice, CountryCode>() {
		{
			businessElementTrace_lazy = () -> SafekeepingPlace.mmCountry;
			componentContext_lazy = () -> com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Place of safekeeping expressed with a country code.";
			nextVersions_lazy = () -> Arrays.asList(SafekeepingPlaceFormat27Choice.mmCountry);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(SafekeepingPlaceFormat26Choice obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(SafekeepingPlaceFormat26Choice obj, CountryCode value) {
			obj.setCountry(value);
		}
	};
	@XmlElement(name = "TpAndId", required = true)
	protected SafekeepingPlaceTypeAndAnyBICIdentifier1 typeAndIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndAnyBICIdentifier1
	 * SafekeepingPlaceTypeAndAnyBICIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice
	 * SafekeepingPlaceFormat26Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpAndId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeAndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of safekeeping expressed with a type and identification."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat27Choice#mmTypeAndIdentification
	 * SafekeepingPlaceFormat27Choice.mmTypeAndIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SafekeepingPlaceFormat26Choice, SafekeepingPlaceTypeAndAnyBICIdentifier1> mmTypeAndIdentification = new MMMessageAssociationEnd<SafekeepingPlaceFormat26Choice, SafekeepingPlaceTypeAndAnyBICIdentifier1>() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice.mmObject();
			isDerived = false;
			xmlTag = "TpAndId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeAndIdentification";
			definition = "Place of safekeeping expressed with a type and identification.";
			nextVersions_lazy = () -> Arrays.asList(SafekeepingPlaceFormat27Choice.mmTypeAndIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SafekeepingPlaceTypeAndAnyBICIdentifier1.mmObject();
		}

		@Override
		public SafekeepingPlaceTypeAndAnyBICIdentifier1 getValue(SafekeepingPlaceFormat26Choice obj) {
			return obj.getTypeAndIdentification();
		}

		@Override
		public void setValue(SafekeepingPlaceFormat26Choice obj, SafekeepingPlaceTypeAndAnyBICIdentifier1 value) {
			obj.setTypeAndIdentification(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected GenericIdentification89 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification89
	 * GenericIdentification89}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice
	 * SafekeepingPlaceFormat26Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of safekeeping expressed with a propriety identification scheme."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat27Choice#mmProprietary
	 * SafekeepingPlaceFormat27Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SafekeepingPlaceFormat26Choice, GenericIdentification89> mmProprietary = new MMMessageAssociationEnd<SafekeepingPlaceFormat26Choice, GenericIdentification89>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Place of safekeeping expressed with a propriety identification scheme.";
			nextVersions_lazy = () -> Arrays.asList(SafekeepingPlaceFormat27Choice.mmProprietary);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification89.mmObject();
		}

		@Override
		public GenericIdentification89 getValue(SafekeepingPlaceFormat26Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(SafekeepingPlaceFormat26Choice obj, GenericIdentification89 value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice.mmIdentification, com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice.mmCountry,
						com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice.mmTypeAndIdentification, com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice.mmProprietary);
				trace_lazy = () -> SafekeepingPlace.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SafekeepingPlaceFormat26Choice";
				definition = "Choice of formats for the place of safekeeping.";
				nextVersions_lazy = () -> Arrays.asList(SafekeepingPlaceFormat27Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SafekeepingPlaceTypeAndText25 getIdentification() {
		return identification;
	}

	public SafekeepingPlaceFormat26Choice setIdentification(SafekeepingPlaceTypeAndText25 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public CountryCode getCountry() {
		return country;
	}

	public SafekeepingPlaceFormat26Choice setCountry(CountryCode country) {
		this.country = Objects.requireNonNull(country);
		return this;
	}

	public SafekeepingPlaceTypeAndAnyBICIdentifier1 getTypeAndIdentification() {
		return typeAndIdentification;
	}

	public SafekeepingPlaceFormat26Choice setTypeAndIdentification(SafekeepingPlaceTypeAndAnyBICIdentifier1 typeAndIdentification) {
		this.typeAndIdentification = Objects.requireNonNull(typeAndIdentification);
		return this;
	}

	public GenericIdentification89 getProprietary() {
		return proprietary;
	}

	public SafekeepingPlaceFormat26Choice setProprietary(GenericIdentification89 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}