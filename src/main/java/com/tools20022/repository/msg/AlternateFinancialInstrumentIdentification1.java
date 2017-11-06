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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SecuritiesIdentification;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * A proprietary or domestic identification scheme that uniquely identifies a
 * financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1#mmDomesticOrProprietaryIdentificationSourceRule
 * AlternateFinancialInstrumentIdentification1.
 * mmDomesticOrProprietaryIdentificationSourceRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1#mmDomesticIdentificationSource
 * AlternateFinancialInstrumentIdentification1.mmDomesticIdentificationSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1#mmProprietaryIdentificationSource
 * AlternateFinancialInstrumentIdentification1.mmProprietaryIdentificationSource
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1#mmIdentification
 * AlternateFinancialInstrumentIdentification1.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
 * SecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AlternateFinancialInstrumentIdentification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "A proprietary or domestic identification scheme that uniquely identifies a financial instrument."
 * </li>
 * </ul>
 */
public class AlternateFinancialInstrumentIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CountryCode domesticIdentificationSource;
	/**
	 * Country of the proprietary identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole#mmCountry
	 * IdentificationIssuerRole.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1
	 * AlternateFinancialInstrumentIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmstIdSrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomesticIdentificationSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the proprietary identification scheme."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDomesticIdentificationSource = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.IdentificationIssuerRole.mmCountry;
			componentContext_lazy = () -> AlternateFinancialInstrumentIdentification1.mmObject();
			isDerived = false;
			xmlTag = "DmstIdSrc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomesticIdentificationSource";
			definition = "Country of the proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected Max16Text proprietaryIdentificationSource;
	/**
	 * Entity that issues the proprietary identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole#mmEntityName
	 * IdentificationIssuerRole.mmEntityName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1
	 * AlternateFinancialInstrumentIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryIdSrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentificationSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity that issues the proprietary identification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietaryIdentificationSource = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.IdentificationIssuerRole.mmEntityName;
			componentContext_lazy = () -> AlternateFinancialInstrumentIdentification1.mmObject();
			isDerived = false;
			xmlTag = "PrtryIdSrc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentificationSource";
			definition = "Entity that issues the proprietary identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	protected Max35Text identification;
	/**
	 * Unique and unambiguous identifier of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1
	 * AlternateFinancialInstrumentIdentification1}</li>
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
	 * definition} = "Unique and unambiguous identifier of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentification;
			componentContext_lazy = () -> AlternateFinancialInstrumentIdentification1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Either DomesticIdentificationSource or ProprietaryIdentificationSource
	 * must be present but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1#mmDomesticIdentificationSource
	 * AlternateFinancialInstrumentIdentification1.
	 * mmDomesticIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1#mmProprietaryIdentificationSource
	 * AlternateFinancialInstrumentIdentification1.
	 * mmProprietaryIdentificationSource}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1
	 * AlternateFinancialInstrumentIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomesticOrProprietaryIdentificationSourceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either DomesticIdentificationSource or ProprietaryIdentificationSource must be present but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmDomesticOrProprietaryIdentificationSourceRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomesticOrProprietaryIdentificationSourceRule";
			definition = "Either DomesticIdentificationSource or ProprietaryIdentificationSource must be present but not both.";
			messageComponent_lazy = () -> AlternateFinancialInstrumentIdentification1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.mmDomesticIdentificationSource,
					com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.mmProprietaryIdentificationSource);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.mmDomesticIdentificationSource,
						com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.mmProprietaryIdentificationSource, com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.mmIdentification);
				trace_lazy = () -> SecuritiesIdentification.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "AlternateFinancialInstrumentIdentification1";
				definition = "A proprietary or domestic identification scheme that uniquely identifies a financial instrument.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.mmDomesticOrProprietaryIdentificationSourceRule);
			}
		});
		return mmObject_lazy.get();
	}

	public CountryCode getDomesticIdentificationSource() {
		return domesticIdentificationSource;
	}

	public void setDomesticIdentificationSource(CountryCode domesticIdentificationSource) {
		this.domesticIdentificationSource = domesticIdentificationSource;
	}

	public Max16Text getProprietaryIdentificationSource() {
		return proprietaryIdentificationSource;
	}

	public void setProprietaryIdentificationSource(Max16Text proprietaryIdentificationSource) {
		this.proprietaryIdentificationSource = proprietaryIdentificationSource;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}
}