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
import com.tools20022.repository.choice.SafekeepingPlaceFormat17Choice;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Place where the securities are safe-kept, physically or notionally. This
 * place can be, for example, a local custodian, a Central Securities Depository
 * (CSD) or an International Central Securities Depository (ICSD).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafeKeepingPlace2#mmSafekeepingPlaceFormat
 * SafeKeepingPlace2.mmSafekeepingPlaceFormat}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafeKeepingPlace2#mmLEI
 * SafeKeepingPlace2.mmLEI}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SafeKeepingPlace2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceFormatOrLEIRule#forSafeKeepingPlace2
 * ConstraintSafekeepingPlaceFormatOrLEIRule.forSafeKeepingPlace2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SafeKeepingPlace2", propOrder = {"safekeepingPlaceFormat", "lEI"})
public class SafeKeepingPlace2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SfkpgPlcFrmt")
	protected SafekeepingPlaceFormat17Choice safekeepingPlaceFormat;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat17Choice
	 * SafekeepingPlaceFormat17Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafeKeepingPlace2
	 * SafeKeepingPlace2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlcFrmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceFormat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of the party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SafeKeepingPlace1#mmSafekeepingPlaceFormat
	 * SafeKeepingPlace1.mmSafekeepingPlaceFormat}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SafeKeepingPlace2, Optional<SafekeepingPlaceFormat17Choice>> mmSafekeepingPlaceFormat = new MMMessageAssociationEnd<SafeKeepingPlace2, Optional<SafekeepingPlaceFormat17Choice>>() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SafeKeepingPlace2.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlcFrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceFormat";
			definition = "Unique identification of the party.";
			previousVersion_lazy = () -> SafeKeepingPlace1.mmSafekeepingPlaceFormat;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SafekeepingPlaceFormat17Choice.mmObject();
		}

		@Override
		public Optional<SafekeepingPlaceFormat17Choice> getValue(SafeKeepingPlace2 obj) {
			return obj.getSafekeepingPlaceFormat();
		}

		@Override
		public void setValue(SafeKeepingPlace2 obj, Optional<SafekeepingPlaceFormat17Choice> value) {
			obj.setSafekeepingPlaceFormat(value.orElse(null));
		}
	};
	@XmlElement(name = "LEI")
	protected LEIIdentifier lEI;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafeKeepingPlace2
	 * SafeKeepingPlace2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LEI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal entity identification as an alternate identification for a place of safekeeping."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SafeKeepingPlace1#mmLEI
	 * SafeKeepingPlace1.mmLEI}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SafeKeepingPlace2, Optional<LEIIdentifier>> mmLEI = new MMMessageAttribute<SafeKeepingPlace2, Optional<LEIIdentifier>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SafeKeepingPlace2.mmObject();
			isDerived = false;
			xmlTag = "LEI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LEI";
			definition = "Legal entity identification as an alternate identification for a place of safekeeping.";
			previousVersion_lazy = () -> SafeKeepingPlace1.mmLEI;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}

		@Override
		public Optional<LEIIdentifier> getValue(SafeKeepingPlace2 obj) {
			return obj.getLEI();
		}

		@Override
		public void setValue(SafeKeepingPlace2 obj, Optional<LEIIdentifier> value) {
			obj.setLEI(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SafeKeepingPlace2.mmSafekeepingPlaceFormat, com.tools20022.repository.msg.SafeKeepingPlace2.mmLEI);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingPlaceFormatOrLEIRule.forSafeKeepingPlace2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SafeKeepingPlace2";
				definition = "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SafekeepingPlaceFormat17Choice> getSafekeepingPlaceFormat() {
		return safekeepingPlaceFormat == null ? Optional.empty() : Optional.of(safekeepingPlaceFormat);
	}

	public SafeKeepingPlace2 setSafekeepingPlaceFormat(SafekeepingPlaceFormat17Choice safekeepingPlaceFormat) {
		this.safekeepingPlaceFormat = safekeepingPlaceFormat;
		return this;
	}

	public Optional<LEIIdentifier> getLEI() {
		return lEI == null ? Optional.empty() : Optional.of(lEI);
	}

	public SafeKeepingPlace2 setLEI(LEIIdentifier lEI) {
		this.lEI = lEI;
		return this;
	}
}