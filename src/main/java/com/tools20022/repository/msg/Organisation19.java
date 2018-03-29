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
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.OrganisationName;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification32;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Card acceptor performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation19#mmIdentification
 * Organisation19.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation19#mmCommonName
 * Organisation19.mmCommonName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation19#mmSelectedLanguage
 * Organisation19.mmSelectedLanguage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation19#mmSchemeData
 * Organisation19.mmSchemeData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Organisation
 * Organisation}</li>
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
 * "Organisation19"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Card acceptor performing the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Organisation18
 * Organisation18}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Organisation19", propOrder = {"identification", "commonName", "selectedLanguage", "schemeData"})
public class Organisation19 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected GenericIdentification32 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation19 Organisation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the card acceptor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation18#mmIdentification
	 * Organisation18.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation19, GenericIdentification32> mmIdentification = new MMMessageAssociationEnd<Organisation19, GenericIdentification32>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation19.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the card acceptor.";
			previousVersion_lazy = () -> Organisation18.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification32.mmObject();
		}

		@Override
		public GenericIdentification32 getValue(Organisation19 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Organisation19 obj, GenericIdentification32 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "CmonNm", required = true)
	protected Max70Text commonName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmShortName
	 * OrganisationName.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation19 Organisation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the card acceptor as appearing on the receipt or the statement of account of the cardholder.\r\nIt correspond to the ISO 8583, field number 43."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation18#mmCommonName
	 * Organisation18.mmCommonName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation19, Max70Text> mmCommonName = new MMMessageAttribute<Organisation19, Max70Text>() {
		{
			businessElementTrace_lazy = () -> OrganisationName.mmShortName;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation19.mmObject();
			isDerived = false;
			xmlTag = "CmonNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonName";
			definition = "Name of the card acceptor as appearing on the receipt or the statement of account of the cardholder.\r\nIt correspond to the ISO 8583, field number 43.";
			previousVersion_lazy = () -> Organisation18.mmCommonName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(Organisation19 obj) {
			return obj.getCommonName();
		}

		@Override
		public void setValue(Organisation19 obj, Max70Text value) {
			obj.setCommonName(value);
		}
	};
	@XmlElement(name = "SelctdLang")
	protected LanguageCode selectedLanguage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation19 Organisation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SelctdLang"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelectedLanguage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Selected language of the card acceptor. Reference ISO 639-1 (alpha-2) and ISO 639-2 (alpha-3)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation18#mmSelectedLanguage
	 * Organisation18.mmSelectedLanguage}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation19, Optional<LanguageCode>> mmSelectedLanguage = new MMMessageAttribute<Organisation19, Optional<LanguageCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation19.mmObject();
			isDerived = false;
			xmlTag = "SelctdLang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelectedLanguage";
			definition = "Selected language of the card acceptor. Reference ISO 639-1 (alpha-2) and ISO 639-2 (alpha-3).";
			previousVersion_lazy = () -> Organisation18.mmSelectedLanguage;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		@Override
		public Optional<LanguageCode> getValue(Organisation19 obj) {
			return obj.getSelectedLanguage();
		}

		@Override
		public void setValue(Organisation19 obj, Optional<LanguageCode> value) {
			obj.setSelectedLanguage(value.orElse(null));
		}
	};
	@XmlElement(name = "SchmeData")
	protected Max140Text schemeData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation19 Organisation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchmeData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SchemeData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional card acceptor data required by a card scheme."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation18#mmSchemeData
	 * Organisation18.mmSchemeData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation19, Optional<Max140Text>> mmSchemeData = new MMMessageAttribute<Organisation19, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation19.mmObject();
			isDerived = false;
			xmlTag = "SchmeData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SchemeData";
			definition = "Additional card acceptor data required by a card scheme.";
			previousVersion_lazy = () -> Organisation18.mmSchemeData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(Organisation19 obj) {
			return obj.getSchemeData();
		}

		@Override
		public void setValue(Organisation19 obj, Optional<Max140Text> value) {
			obj.setSchemeData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation19.mmIdentification, com.tools20022.repository.msg.Organisation19.mmCommonName,
						com.tools20022.repository.msg.Organisation19.mmSelectedLanguage, com.tools20022.repository.msg.Organisation19.mmSchemeData);
				trace_lazy = () -> Organisation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Organisation19";
				definition = "Card acceptor performing the transaction.";
				previousVersion_lazy = () -> Organisation18.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification32 getIdentification() {
		return identification;
	}

	public Organisation19 setIdentification(GenericIdentification32 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Max70Text getCommonName() {
		return commonName;
	}

	public Organisation19 setCommonName(Max70Text commonName) {
		this.commonName = Objects.requireNonNull(commonName);
		return this;
	}

	public Optional<LanguageCode> getSelectedLanguage() {
		return selectedLanguage == null ? Optional.empty() : Optional.of(selectedLanguage);
	}

	public Organisation19 setSelectedLanguage(LanguageCode selectedLanguage) {
		this.selectedLanguage = selectedLanguage;
		return this;
	}

	public Optional<Max140Text> getSchemeData() {
		return schemeData == null ? Optional.empty() : Optional.of(schemeData);
	}

	public Organisation19 setSchemeData(Max140Text schemeData) {
		this.schemeData = schemeData;
		return this;
	}
}