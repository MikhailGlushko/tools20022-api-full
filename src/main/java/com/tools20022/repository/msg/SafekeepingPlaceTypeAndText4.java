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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.SafekeepingPlace3Code;
import com.tools20022.repository.datatype.RestrictedFINXMax30Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.SafekeepingPlace;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of the place of safekeeping expressed as a code and a
 * narrative description.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText4#mmSafekeepingPlaceType
 * SafekeepingPlaceTypeAndText4.mmSafekeepingPlaceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText4#mmIdentification
 * SafekeepingPlaceTypeAndText4.mmIdentification}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SafekeepingPlaceTypeAndText4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of the place of safekeeping expressed as a code and a narrative description."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistence35to30TextFieldRule#forSafekeepingPlaceTypeAndText4
 * ConstraintCoexistence35to30TextFieldRule.forSafekeepingPlaceTypeAndText4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SafekeepingPlaceTypeAndText4", propOrder = {"safekeepingPlaceType", "identification"})
public class SafekeepingPlaceTypeAndText4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SfkpgPlcTp", required = true)
	protected SafekeepingPlace3Code safekeepingPlaceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlace3Code
	 * SafekeepingPlace3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSafekeepingPlaceType
	 * SafekeepingPlace.mmSafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText4
	 * SafekeepingPlaceTypeAndText4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlcTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of safekeeping as a code."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94B::4!c//4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SafekeepingPlaceTypeAndText4, SafekeepingPlace3Code> mmSafekeepingPlaceType = new MMMessageAttribute<SafekeepingPlaceTypeAndText4, SafekeepingPlace3Code>() {
		{
			businessElementTrace_lazy = () -> SafekeepingPlace.mmSafekeepingPlaceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SafekeepingPlaceTypeAndText4.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlcTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94B::4!c//4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceType";
			definition = "Place of safekeeping as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SafekeepingPlace3Code.mmObject();
		}

		@Override
		public SafekeepingPlace3Code getValue(SafekeepingPlaceTypeAndText4 obj) {
			return obj.getSafekeepingPlaceType();
		}

		@Override
		public void setValue(SafekeepingPlaceTypeAndText4 obj, SafekeepingPlace3Code value) {
			obj.setSafekeepingPlaceType(value);
		}
	};
	@XmlElement(name = "Id")
	protected RestrictedFINXMax30Text identification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText4
	 * SafekeepingPlaceTypeAndText4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the place of safekeeping."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SafekeepingPlaceTypeAndText4, Optional<RestrictedFINXMax30Text>> mmIdentification = new MMMessageAttribute<SafekeepingPlaceTypeAndText4, Optional<RestrictedFINXMax30Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SafekeepingPlaceTypeAndText4.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Additional information about the place of safekeeping.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax30Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax30Text> getValue(SafekeepingPlaceTypeAndText4 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(SafekeepingPlaceTypeAndText4 obj, Optional<RestrictedFINXMax30Text> value) {
			obj.setIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SafekeepingPlaceTypeAndText4.mmSafekeepingPlaceType, com.tools20022.repository.msg.SafekeepingPlaceTypeAndText4.mmIdentification);
				trace_lazy = () -> SafekeepingPlace.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistence35to30TextFieldRule.forSafekeepingPlaceTypeAndText4);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SafekeepingPlaceTypeAndText4";
				definition = "Identification of the place of safekeeping expressed as a code and a narrative description.";
			}
		});
		return mmObject_lazy.get();
	}

	public SafekeepingPlace3Code getSafekeepingPlaceType() {
		return safekeepingPlaceType;
	}

	public SafekeepingPlaceTypeAndText4 setSafekeepingPlaceType(SafekeepingPlace3Code safekeepingPlaceType) {
		this.safekeepingPlaceType = Objects.requireNonNull(safekeepingPlaceType);
		return this;
	}

	public Optional<RestrictedFINXMax30Text> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public SafekeepingPlaceTypeAndText4 setIdentification(RestrictedFINXMax30Text identification) {
		this.identification = identification;
		return this;
	}
}