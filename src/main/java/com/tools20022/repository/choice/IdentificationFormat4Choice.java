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
import com.tools20022.repository.datatype.Exact3UpperCaseAlphaNumericText;
import com.tools20022.repository.datatype.RestrictedFINXMax30Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification86;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between either a short, long or a proprietary identification format.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationFormat4Choice#mmShortIdentification
 * IdentificationFormat4Choice.mmShortIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationFormat4Choice#mmLongIdentification
 * IdentificationFormat4Choice.mmLongIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationFormat4Choice#mmProprietaryIdentification
 * IdentificationFormat4Choice.mmProprietaryIdentification}</li>
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
 * "IdentificationFormat4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between either a short, long or a proprietary identification format."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IdentificationFormat4Choice", propOrder = {"shortIdentification", "longIdentification", "proprietaryIdentification"})
public class IdentificationFormat4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ShrtId", required = true)
	protected Exact3UpperCaseAlphaNumericText shortIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3UpperCaseAlphaNumericText
	 * Exact3UpperCaseAlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationFormat4Choice
	 * IdentificationFormat4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13A:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Format expressed as a short identification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IdentificationFormat4Choice, Exact3UpperCaseAlphaNumericText> mmShortIdentification = new MMMessageAttribute<IdentificationFormat4Choice, Exact3UpperCaseAlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.IdentificationFormat4Choice.mmObject();
			isDerived = false;
			xmlTag = "ShrtId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13A:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortIdentification";
			definition = "Format expressed as a short identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3UpperCaseAlphaNumericText.mmObject();
		}

		@Override
		public Exact3UpperCaseAlphaNumericText getValue(IdentificationFormat4Choice obj) {
			return obj.getShortIdentification();
		}

		@Override
		public void setValue(IdentificationFormat4Choice obj, Exact3UpperCaseAlphaNumericText value) {
			obj.setShortIdentification(value);
		}
	};
	@XmlElement(name = "LngId", required = true)
	protected RestrictedFINXMax30Text longIdentification;
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
	 * {@linkplain com.tools20022.repository.choice.IdentificationFormat4Choice
	 * IdentificationFormat4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LngId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13B::COUP//30x</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Format expressed as a long identification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IdentificationFormat4Choice, RestrictedFINXMax30Text> mmLongIdentification = new MMMessageAttribute<IdentificationFormat4Choice, RestrictedFINXMax30Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.IdentificationFormat4Choice.mmObject();
			isDerived = false;
			xmlTag = "LngId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13B::COUP//30x"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongIdentification";
			definition = "Format expressed as a long identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax30Text.mmObject();
		}

		@Override
		public RestrictedFINXMax30Text getValue(IdentificationFormat4Choice obj) {
			return obj.getLongIdentification();
		}

		@Override
		public void setValue(IdentificationFormat4Choice obj, RestrictedFINXMax30Text value) {
			obj.setLongIdentification(value);
		}
	};
	@XmlElement(name = "PrtryId", required = true)
	protected GenericIdentification86 proprietaryIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification86
	 * GenericIdentification86}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationFormat4Choice
	 * IdentificationFormat4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Format expressed as a proprietary identification."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IdentificationFormat4Choice, GenericIdentification86> mmProprietaryIdentification = new MMMessageAssociationEnd<IdentificationFormat4Choice, GenericIdentification86>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.IdentificationFormat4Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Format expressed as a proprietary identification.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification86.mmObject();
		}

		@Override
		public GenericIdentification86 getValue(IdentificationFormat4Choice obj) {
			return obj.getProprietaryIdentification();
		}

		@Override
		public void setValue(IdentificationFormat4Choice obj, GenericIdentification86 value) {
			obj.setProprietaryIdentification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IdentificationFormat4Choice.mmShortIdentification, com.tools20022.repository.choice.IdentificationFormat4Choice.mmLongIdentification,
						com.tools20022.repository.choice.IdentificationFormat4Choice.mmProprietaryIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IdentificationFormat4Choice";
				definition = "Choice between either a short, long or a proprietary identification format.";
			}
		});
		return mmObject_lazy.get();
	}

	public Exact3UpperCaseAlphaNumericText getShortIdentification() {
		return shortIdentification;
	}

	public IdentificationFormat4Choice setShortIdentification(Exact3UpperCaseAlphaNumericText shortIdentification) {
		this.shortIdentification = Objects.requireNonNull(shortIdentification);
		return this;
	}

	public RestrictedFINXMax30Text getLongIdentification() {
		return longIdentification;
	}

	public IdentificationFormat4Choice setLongIdentification(RestrictedFINXMax30Text longIdentification) {
		this.longIdentification = Objects.requireNonNull(longIdentification);
		return this;
	}

	public GenericIdentification86 getProprietaryIdentification() {
		return proprietaryIdentification;
	}

	public IdentificationFormat4Choice setProprietaryIdentification(GenericIdentification86 proprietaryIdentification) {
		this.proprietaryIdentification = Objects.requireNonNull(proprietaryIdentification);
		return this;
	}
}