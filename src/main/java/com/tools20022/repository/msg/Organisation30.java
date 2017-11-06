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
import com.tools20022.repository.choice.OrganisationType1Choice;
import com.tools20022.repository.choice.PartyIdentification72Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.PostalAddress;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Organised structure that is set up for a particular purpose, for example, a
 * business, government body, department, charity, or financial institution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation30#mmName
 * Organisation30.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation30#mmShortName
 * Organisation30.mmShortName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation30#mmIdentification
 * Organisation30.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation30#mmLegalEntityIdentifier
 * Organisation30.mmLegalEntityIdentifier}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation30#mmPurpose
 * Organisation30.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation30#mmRegistrationCountry
 * Organisation30.mmRegistrationCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation30#mmRegistrationDate
 * Organisation30.mmRegistrationDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation30#mmPostalAddress
 * Organisation30.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation30#mmTypeOfOrganisation
 * Organisation30.mmTypeOfOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation30#mmPlaceOfListing
 * Organisation30.mmPlaceOfListing}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Organisation
 * Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Organisation30"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Organised structure that is set up for a particular purpose, for example, a business, government body, department, charity, or financial institution."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Organisation24
 * Organisation24}</li>
 * </ul>
 */
public class Organisation30 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text name;
	/**
	 * Name by which the organisation is known and which is usually used to
	 * identify that organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation30 Organisation30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which the organisation is known and which is usually used to identify that  organisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24#mmName
	 * Organisation24.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyName.mmName;
			componentContext_lazy = () -> Organisation30.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which the organisation is known and which is usually used to identify that  organisation.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Organisation24.mmName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max35Text shortName;
	/**
	 * Name of the organisation in short form.
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
	 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmShortName
	 * OrganisationName.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation30 Organisation30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the organisation in short form."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24#mmShortName
	 * Organisation24.mmShortName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShortName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.OrganisationName.mmShortName;
			componentContext_lazy = () -> Organisation30.mmObject();
			isDerived = false;
			xmlTag = "ShrtNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortName";
			definition = "Name of the organisation in short form.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Organisation24.mmShortName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification72Choice identification;
	/**
	 * Unique and unambiguous identifier for the organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification72Choice
	 * PartyIdentification72Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation30 Organisation30}</li>
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
	 * definition} = "Unique and unambiguous identifier for the organisation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24#mmIdentification
	 * Organisation24.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> Organisation30.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier for the organisation.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Organisation24.mmIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification72Choice.mmObject();
		}
	};
	protected LEIIdentifier legalEntityIdentifier;
	/**
	 * Identification of the organisation with a Legal Entity Identifier. This
	 * is a code allocated to a party as described in ISO 17442
	 * "Financial Services - Legal Entity Identifier (LEI)".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmLEI
	 * PartyIdentificationInformation.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation30 Organisation30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglNttyIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalEntityIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the organisation with a Legal Entity Identifier. This is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\"."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24#mmLegalEntityIdentifier
	 * Organisation24.mmLegalEntityIdentifier}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegalEntityIdentifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmLEI;
			componentContext_lazy = () -> Organisation30.mmObject();
			isDerived = false;
			xmlTag = "LglNttyIdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalEntityIdentifier";
			definition = "Identification of the organisation with a Legal Entity Identifier. This is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Organisation24.mmLegalEntityIdentifier;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};
	protected Max35Text purpose;
	/**
	 * Purpose of the organisation, for example, charity.
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
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmPurpose
	 * Organisation.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation30 Organisation30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Purpose of the organisation, for example, charity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24#mmPurpose
	 * Organisation24.mmPurpose}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPurpose = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.mmPurpose;
			componentContext_lazy = () -> Organisation30.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Purpose of the organisation, for example, charity.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Organisation24.mmPurpose;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CountryCode registrationCountry;
	/**
	 * Country in which the organisation is registered.
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
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation30 Organisation30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country in which the organisation is registered."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24#mmRegistrationCountry
	 * Organisation24.mmRegistrationCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Country.mmCode;
			componentContext_lazy = () -> Organisation30.mmObject();
			isDerived = false;
			xmlTag = "RegnCtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationCountry";
			definition = "Country in which the organisation is registered.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Organisation24.mmRegistrationCountry;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected ISODate registrationDate;
	/**
	 * Date and time at which a given organisation was officially registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmRegistrationDate
	 * Organisation.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation30 Organisation30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a given organisation was officially registered."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24#mmRegistrationDate
	 * Organisation24.mmRegistrationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.mmRegistrationDate;
			componentContext_lazy = () -> Organisation30.mmObject();
			isDerived = false;
			xmlTag = "RegnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDate";
			definition = "Date and time at which a given organisation was officially registered.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Organisation24.mmRegistrationDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PostalAddress21> postalAddress;
	/**
	 * Information that locates and identifies a specific address, as defined by
	 * postal services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation30 Organisation30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstlAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that locates and identifies a specific address, as defined by postal services."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24#mmPostalAddress
	 * Organisation24.mmPostalAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPostalAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> Organisation30.mmObject();
			isDerived = false;
			xmlTag = "PstlAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalAddress";
			definition = "Information that locates and identifies a specific address, as defined by postal services.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Organisation24.mmPostalAddress;
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress21.mmObject();
		}
	};
	protected OrganisationType1Choice typeOfOrganisation;
	/**
	 * Type of organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OrganisationType1Choice
	 * OrganisationType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation30 Organisation30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpOfOrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfOrganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of organisation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24#mmTypeOfOrganisation
	 * Organisation24.mmTypeOfOrganisation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTypeOfOrganisation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Organisation30.mmObject();
			isDerived = false;
			xmlTag = "TpOfOrg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfOrganisation";
			definition = "Type of organisation.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Organisation24.mmTypeOfOrganisation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OrganisationType1Choice.mmObject();
		}
	};
	protected List<MICIdentifier> placeOfListing;
	/**
	 * Place of listing for shares in the organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmMIC
	 * OrganisationIdentification.mmMIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation30 Organisation30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfListg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of listing for shares in the organisation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfListing = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmMIC;
			componentContext_lazy = () -> Organisation30.mmObject();
			isDerived = false;
			xmlTag = "PlcOfListg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Place of listing for shares in the organisation.";
			minOccurs = 0;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation30.mmName, com.tools20022.repository.msg.Organisation30.mmShortName, com.tools20022.repository.msg.Organisation30.mmIdentification,
						com.tools20022.repository.msg.Organisation30.mmLegalEntityIdentifier, com.tools20022.repository.msg.Organisation30.mmPurpose, com.tools20022.repository.msg.Organisation30.mmRegistrationCountry,
						com.tools20022.repository.msg.Organisation30.mmRegistrationDate, com.tools20022.repository.msg.Organisation30.mmPostalAddress, com.tools20022.repository.msg.Organisation30.mmTypeOfOrganisation,
						com.tools20022.repository.msg.Organisation30.mmPlaceOfListing);
				trace_lazy = () -> Organisation.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Organisation30";
				definition = "Organised structure that is set up for a particular purpose, for example, a business, government body, department, charity, or financial institution.";
				previousVersion_lazy = () -> Organisation24.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getName() {
		return name;
	}

	public void setName(Max350Text name) {
		this.name = name;
	}

	public Max35Text getShortName() {
		return shortName;
	}

	public void setShortName(Max35Text shortName) {
		this.shortName = shortName;
	}

	public PartyIdentification72Choice getIdentification() {
		return identification;
	}

	public void setIdentification(PartyIdentification72Choice identification) {
		this.identification = identification;
	}

	public LEIIdentifier getLegalEntityIdentifier() {
		return legalEntityIdentifier;
	}

	public void setLegalEntityIdentifier(LEIIdentifier legalEntityIdentifier) {
		this.legalEntityIdentifier = legalEntityIdentifier;
	}

	public Max35Text getPurpose() {
		return purpose;
	}

	public void setPurpose(Max35Text purpose) {
		this.purpose = purpose;
	}

	public CountryCode getRegistrationCountry() {
		return registrationCountry;
	}

	public void setRegistrationCountry(CountryCode registrationCountry) {
		this.registrationCountry = registrationCountry;
	}

	public ISODate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(ISODate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public List<PostalAddress21> getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(List<com.tools20022.repository.msg.PostalAddress21> postalAddress) {
		this.postalAddress = postalAddress;
	}

	public OrganisationType1Choice getTypeOfOrganisation() {
		return typeOfOrganisation;
	}

	public void setTypeOfOrganisation(OrganisationType1Choice typeOfOrganisation) {
		this.typeOfOrganisation = typeOfOrganisation;
	}

	public List<MICIdentifier> getPlaceOfListing() {
		return placeOfListing;
	}

	public void setPlaceOfListing(List<MICIdentifier> placeOfListing) {
		this.placeOfListing = placeOfListing;
	}
}