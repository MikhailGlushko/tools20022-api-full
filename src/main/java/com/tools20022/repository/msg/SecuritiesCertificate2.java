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
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.datatype.RestrictedFINXMax30Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.IdentificationIssuerRole;
import com.tools20022.repository.entity.Scheme;
import com.tools20022.repository.entity.SecuritiesCertificate;
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
 * Physical representation of a security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate2#mmNumber
 * SecuritiesCertificate2.mmNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate2#mmIssuer
 * SecuritiesCertificate2.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate2#mmSchemeName
 * SecuritiesCertificate2.mmSchemeName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesCertificate
 * SecuritiesCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintISO8532AndIssuerSchemeNameRule#forSecuritiesCertificate2
 * ConstraintISO8532AndIssuerSchemeNameRule.forSecuritiesCertificate2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIssuerSchemeNameRule#forSecuritiesCertificate2
 * ConstraintCoexistenceIssuerSchemeNameRule.forSecuritiesCertificate2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistence35to30TextFieldRule#forSecuritiesCertificate2
 * ConstraintCoexistence35to30TextFieldRule.forSecuritiesCertificate2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesCertificate2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Physical representation of a security."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesCertificate2", propOrder = {"number", "issuer", "schemeName"})
public class SecuritiesCertificate2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Nb", required = true)
	protected RestrictedFINXMax30Text number;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate2
	 * SecuritiesCertificate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13B::CERT/[4!c[4c]]/30x</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a certificate assigned by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesCertificate2, RestrictedFINXMax30Text> mmNumber = new MMMessageAttribute<SecuritiesCertificate2, RestrictedFINXMax30Text>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesCertificate2.mmObject();
			isDerived = false;
			xmlTag = "Nb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13B::CERT/[4!c[4c]]/30x"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Number";
			definition = "Unique and unambiguous identifier of a certificate assigned by the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax30Text.mmObject();
		}

		@Override
		public RestrictedFINXMax30Text getValue(SecuritiesCertificate2 obj) {
			return obj.getNumber();
		}

		@Override
		public void setValue(SecuritiesCertificate2 obj, RestrictedFINXMax30Text value) {
			obj.setNumber(value);
		}
	};
	@XmlElement(name = "Issr")
	protected Max4AlphaNumericText issuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole#mmEntityName
	 * IdentificationIssuerRole.mmEntityName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate2
	 * SecuritiesCertificate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13B::CERT/4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesCertificate2, Optional<Max4AlphaNumericText>> mmIssuer = new MMMessageAttribute<SecuritiesCertificate2, Optional<Max4AlphaNumericText>>() {
		{
			businessElementTrace_lazy = () -> IdentificationIssuerRole.mmEntityName;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesCertificate2.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13B::CERT/4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Max4AlphaNumericText> getValue(SecuritiesCertificate2 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(SecuritiesCertificate2 obj, Optional<Max4AlphaNumericText> value) {
			obj.setIssuer(value.orElse(null));
		}
	};
	@XmlElement(name = "SchmeNm")
	protected Max4AlphaNumericText schemeName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Scheme#mmNameShort
	 * Scheme.mmNameShort}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate2
	 * SecuritiesCertificate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchmeNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13B::CERT/4!c4c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SchemeName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Short textual description of the scheme."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesCertificate2, Optional<Max4AlphaNumericText>> mmSchemeName = new MMMessageAttribute<SecuritiesCertificate2, Optional<Max4AlphaNumericText>>() {
		{
			businessElementTrace_lazy = () -> Scheme.mmNameShort;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesCertificate2.mmObject();
			isDerived = false;
			xmlTag = "SchmeNm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13B::CERT/4!c4c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SchemeName";
			definition = "Short textual description of the scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Max4AlphaNumericText> getValue(SecuritiesCertificate2 obj) {
			return obj.getSchemeName();
		}

		@Override
		public void setValue(SecuritiesCertificate2 obj, Optional<Max4AlphaNumericText> value) {
			obj.setSchemeName(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesCertificate2.mmNumber, com.tools20022.repository.msg.SecuritiesCertificate2.mmIssuer,
						com.tools20022.repository.msg.SecuritiesCertificate2.mmSchemeName);
				trace_lazy = () -> SecuritiesCertificate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintISO8532AndIssuerSchemeNameRule.forSecuritiesCertificate2,
						com.tools20022.repository.constraints.ConstraintCoexistenceIssuerSchemeNameRule.forSecuritiesCertificate2, com.tools20022.repository.constraints.ConstraintCoexistence35to30TextFieldRule.forSecuritiesCertificate2);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SecuritiesCertificate2";
				definition = "Physical representation of a security.";
			}
		});
		return mmObject_lazy.get();
	}

	public RestrictedFINXMax30Text getNumber() {
		return number;
	}

	public SecuritiesCertificate2 setNumber(RestrictedFINXMax30Text number) {
		this.number = Objects.requireNonNull(number);
		return this;
	}

	public Optional<Max4AlphaNumericText> getIssuer() {
		return issuer == null ? Optional.empty() : Optional.of(issuer);
	}

	public SecuritiesCertificate2 setIssuer(Max4AlphaNumericText issuer) {
		this.issuer = issuer;
		return this;
	}

	public Optional<Max4AlphaNumericText> getSchemeName() {
		return schemeName == null ? Optional.empty() : Optional.of(schemeName);
	}

	public SecuritiesCertificate2 setSchemeName(Max4AlphaNumericText schemeName) {
		this.schemeName = schemeName;
		return this;
	}
}