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
import com.tools20022.repository.datatype.ISINOct2015Identifier;
import com.tools20022.repository.datatype.RestrictedFINXMax140Text;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OtherIdentification3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of a security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification32#mmISIN
 * SecurityIdentification32.mmISIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification32#mmOtherIdentification
 * SecurityIdentification32.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification32#mmDescription
 * SecurityIdentification32.mmDescription}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
 * SecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityIdentification32"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a security."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDescriptionPresenceRule#forSecurityIdentification32
 * ConstraintDescriptionPresenceRule.forSecurityIdentification32}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherIdentificationPresenceRule#forSecurityIdentification32
 * ConstraintOtherIdentificationPresenceRule.forSecurityIdentification32}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintISINPresenceRule#forSecurityIdentification32
 * ConstraintISINPresenceRule.forSecurityIdentification32}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDescriptionUsageRule#forSecurityIdentification32
 * ConstraintDescriptionUsageRule.forSecurityIdentification32}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintISINGuideline#forSecurityIdentification32
 * ConstraintISINGuideline.forSecurityIdentification32}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityIdentification32", propOrder = {"iSIN", "otherIdentification", "description"})
public class SecurityIdentification32 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ISIN")
	protected ISINOct2015Identifier iSIN;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
	 * SecuritiesIdentification.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification32
	 * SecurityIdentification32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISIN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Securities Identification Number (ISIN). A numbering system designed by the United Nation's International Organisation for Standardisation (ISO). The ISIN is composed of a 2-character prefix representing the country of issue, followed by the national security number (if one exists), and a check digit. Each country has a national numbering agency that assigns ISIN numbers for securities in that country."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityIdentification32, Optional<ISINOct2015Identifier>> mmISIN = new MMMessageAttribute<SecurityIdentification32, Optional<ISINOct2015Identifier>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityIdentification32.mmObject();
			isDerived = false;
			xmlTag = "ISIN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISIN";
			definition = "International Securities Identification Number (ISIN). A numbering system designed by the United Nation's International Organisation for Standardisation (ISO). The ISIN is composed of a 2-character prefix representing the country of issue, followed by the national security number (if one exists), and a check digit. Each country has a national numbering agency that assigns ISIN numbers for securities in that country.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}

		@Override
		public Optional<ISINOct2015Identifier> getValue(SecurityIdentification32 obj) {
			return obj.getISIN();
		}

		@Override
		public void setValue(SecurityIdentification32 obj, Optional<ISINOct2015Identifier> value) {
			obj.setISIN(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrId")
	protected List<OtherIdentification3> otherIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherIdentification3
	 * OtherIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification32
	 * SecurityIdentification32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a security by proprietary or domestic identification scheme."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityIdentification32, List<OtherIdentification3>> mmOtherIdentification = new MMMessageAssociationEnd<SecurityIdentification32, List<OtherIdentification3>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityIdentification32.mmObject();
			isDerived = false;
			xmlTag = "OthrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherIdentification";
			definition = "Identification of a security by proprietary or domestic identification scheme.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherIdentification3.mmObject();
		}

		@Override
		public List<OtherIdentification3> getValue(SecurityIdentification32 obj) {
			return obj.getOtherIdentification();
		}

		@Override
		public void setValue(SecurityIdentification32 obj, List<OtherIdentification3> value) {
			obj.setOtherIdentification(value);
		}
	};
	@XmlElement(name = "Desc")
	protected RestrictedFINXMax140Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax140Text
	 * RestrictedFINXMax140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification32
	 * SecurityIdentification32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Textual description of a security instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityIdentification32, Optional<RestrictedFINXMax140Text>> mmDescription = new MMMessageAttribute<SecurityIdentification32, Optional<RestrictedFINXMax140Text>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityIdentification32.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Textual description of a security instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax140Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax140Text> getValue(SecurityIdentification32 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(SecurityIdentification32 obj, Optional<RestrictedFINXMax140Text> value) {
			obj.setDescription(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityIdentification32.mmISIN, com.tools20022.repository.msg.SecurityIdentification32.mmOtherIdentification,
						com.tools20022.repository.msg.SecurityIdentification32.mmDescription);
				trace_lazy = () -> SecuritiesIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDescriptionPresenceRule.forSecurityIdentification32,
						com.tools20022.repository.constraints.ConstraintOtherIdentificationPresenceRule.forSecurityIdentification32, com.tools20022.repository.constraints.ConstraintISINPresenceRule.forSecurityIdentification32,
						com.tools20022.repository.constraints.ConstraintDescriptionUsageRule.forSecurityIdentification32, com.tools20022.repository.constraints.ConstraintISINGuideline.forSecurityIdentification32);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityIdentification32";
				definition = "Identification of a security.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISINOct2015Identifier> getISIN() {
		return iSIN == null ? Optional.empty() : Optional.of(iSIN);
	}

	public SecurityIdentification32 setISIN(ISINOct2015Identifier iSIN) {
		this.iSIN = iSIN;
		return this;
	}

	public List<OtherIdentification3> getOtherIdentification() {
		return otherIdentification == null ? otherIdentification = new ArrayList<>() : otherIdentification;
	}

	public SecurityIdentification32 setOtherIdentification(List<OtherIdentification3> otherIdentification) {
		this.otherIdentification = Objects.requireNonNull(otherIdentification);
		return this;
	}

	public Optional<RestrictedFINXMax140Text> getDescription() {
		return description == null ? Optional.empty() : Optional.of(description);
	}

	public SecurityIdentification32 setDescription(RestrictedFINXMax140Text description) {
		this.description = description;
		return this;
	}
}