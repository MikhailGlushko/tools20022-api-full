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
import com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV01;
import com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV01;
import com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01;
import com.tools20022.repository.area.acmt.AccountReportV01;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.OrganisationName;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.PostalAddress;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OrganisationIdentification6;
import com.tools20022.repository.msg.PartyIdentification40;
import com.tools20022.repository.msg.PostalAddress6;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information which describes the organisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation6#mmFullLegalName
 * Organisation6.mmFullLegalName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation6#mmTradingName
 * Organisation6.mmTradingName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation6#mmCountryOfOperation
 * Organisation6.mmCountryOfOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation6#mmRegistrationDate
 * Organisation6.mmRegistrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation6#mmOperationalAddress
 * Organisation6.mmOperationalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation6#mmBusinessAddress
 * Organisation6.mmBusinessAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation6#mmLegalAddress
 * Organisation6.mmLegalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation6#mmOrganisationIdentification
 * Organisation6.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation6#mmRepresentativeOfficer
 * Organisation6.mmRepresentativeOfficer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation6#mmTreasuryManager
 * Organisation6.mmTreasuryManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation6#mmMainMandateHolder
 * Organisation6.mmMainMandateHolder}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation6#mmSender
 * Organisation6.mmSender}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Organisation
 * Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV01#mmOrganisation
 * AccountExcludedMandateMaintenanceAmendmentRequestV01.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV01#mmOrganisation
 * AccountExcludedMandateMaintenanceRequestV01.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01#mmOrganisation
 * AccountOpeningAmendmentRequestV01.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportV01#mmOrganisation
 * AccountReportV01.mmOrganisation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Organisation6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information which describes the organisation."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation12 Organisation12}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Organisation6", propOrder = {"fullLegalName", "tradingName", "countryOfOperation", "registrationDate", "operationalAddress", "businessAddress", "legalAddress", "organisationIdentification", "representativeOfficer",
		"treasuryManager", "mainMandateHolder", "sender"})
public class Organisation6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FullLglNm", required = true)
	protected Max350Text fullLegalName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmLegalName
	 * OrganisationName.mmLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation6 Organisation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FullLglNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullLegalName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a party is known and which is usually used to identify that party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation6, Max350Text> mmFullLegalName = new MMMessageAttribute<Organisation6, Max350Text>() {
		{
			businessElementTrace_lazy = () -> OrganisationName.mmLegalName;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation6.mmObject();
			isDerived = false;
			xmlTag = "FullLglNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullLegalName";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(Organisation6 obj) {
			return obj.getFullLegalName();
		}

		@Override
		public void setValue(Organisation6 obj, Max350Text value) {
			obj.setFullLegalName(value);
		}
	};
	@XmlElement(name = "TradgNm")
	protected Max350Text tradingName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmTradingName
	 * OrganisationName.mmTradingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation6 Organisation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name used by a business for commercial purposes, although its registered legal name, used for contracts and other formal situations, may be another."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation6, Optional<Max350Text>> mmTradingName = new MMMessageAttribute<Organisation6, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> OrganisationName.mmTradingName;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation6.mmObject();
			isDerived = false;
			xmlTag = "TradgNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingName";
			definition = "Name used by a business for commercial purposes, although its registered legal name, used for contracts and other formal situations, may be another.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(Organisation6 obj) {
			return obj.getTradingName();
		}

		@Override
		public void setValue(Organisation6 obj, Optional<Max350Text> value) {
			obj.setTradingName(value.orElse(null));
		}
	};
	@XmlElement(name = "CtryOfOpr", required = true)
	protected CountryCode countryOfOperation;
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
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmPlaceOfOperation
	 * Organisation.mmPlaceOfOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation6 Organisation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfOpr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country in which the organisation has its business activity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation6, CountryCode> mmCountryOfOperation = new MMMessageAttribute<Organisation6, CountryCode>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmPlaceOfOperation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation6.mmObject();
			isDerived = false;
			xmlTag = "CtryOfOpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfOperation";
			definition = "Country in which the organisation has its business activity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(Organisation6 obj) {
			return obj.getCountryOfOperation();
		}

		@Override
		public void setValue(Organisation6 obj, CountryCode value) {
			obj.setCountryOfOperation(value);
		}
	};
	@XmlElement(name = "RegnDt")
	protected ISODate registrationDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.Organisation6 Organisation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a given organisation was officially registered."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation6, Optional<ISODate>> mmRegistrationDate = new MMMessageAttribute<Organisation6, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmRegistrationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation6.mmObject();
			isDerived = false;
			xmlTag = "RegnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDate";
			definition = "Date and time at which a given organisation was officially registered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(Organisation6 obj) {
			return obj.getRegistrationDate();
		}

		@Override
		public void setValue(Organisation6 obj, Optional<ISODate> value) {
			obj.setRegistrationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "OprlAdr")
	protected PostalAddress6 operationalAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress6
	 * PostalAddress6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation6 Organisation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OprlAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperationalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Is an operational address, for example, of a shared services center."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation6, Optional<PostalAddress6>> mmOperationalAddress = new MMMessageAssociationEnd<Organisation6, Optional<PostalAddress6>>() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation6.mmObject();
			isDerived = false;
			xmlTag = "OprlAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalAddress";
			definition = "Is an operational address, for example, of a shared services center.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PostalAddress6.mmObject();
		}

		@Override
		public Optional<PostalAddress6> getValue(Organisation6 obj) {
			return obj.getOperationalAddress();
		}

		@Override
		public void setValue(Organisation6 obj, Optional<PostalAddress6> value) {
			obj.setOperationalAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "BizAdr")
	protected PostalAddress6 businessAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress6
	 * PostalAddress6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation6 Organisation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Is the address where the business activity is taking place."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation6, Optional<PostalAddress6>> mmBusinessAddress = new MMMessageAssociationEnd<Organisation6, Optional<PostalAddress6>>() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation6.mmObject();
			isDerived = false;
			xmlTag = "BizAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessAddress";
			definition = "Is the address where the business activity is taking place.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PostalAddress6.mmObject();
		}

		@Override
		public Optional<PostalAddress6> getValue(Organisation6 obj) {
			return obj.getBusinessAddress();
		}

		@Override
		public void setValue(Organisation6 obj, Optional<PostalAddress6> value) {
			obj.setBusinessAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "LglAdr", required = true)
	protected PostalAddress6 legalAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress6
	 * PostalAddress6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation6 Organisation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Is the address where the entity resides and is registered. More generically, it is the home address (Residential address)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation6, PostalAddress6> mmLegalAddress = new MMMessageAssociationEnd<Organisation6, PostalAddress6>() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation6.mmObject();
			isDerived = false;
			xmlTag = "LglAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalAddress";
			definition = "Is the address where the entity resides and is registered. More generically, it is the home address (Residential address).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PostalAddress6.mmObject();
		}

		@Override
		public PostalAddress6 getValue(Organisation6 obj) {
			return obj.getLegalAddress();
		}

		@Override
		public void setValue(Organisation6 obj, PostalAddress6 value) {
			obj.setLegalAddress(value);
		}
	};
	@XmlElement(name = "OrgId", required = true)
	protected OrganisationIdentification6 organisationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification6
	 * OrganisationIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation6 Organisation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous way of identifying an organisation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation6, OrganisationIdentification6> mmOrganisationIdentification = new MMMessageAssociationEnd<Organisation6, OrganisationIdentification6>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation6.mmObject();
			isDerived = false;
			xmlTag = "OrgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationIdentification";
			definition = "Unique and unambiguous way of identifying an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OrganisationIdentification6.mmObject();
		}

		@Override
		public OrganisationIdentification6 getValue(Organisation6 obj) {
			return obj.getOrganisationIdentification();
		}

		@Override
		public void setValue(Organisation6 obj, OrganisationIdentification6 value) {
			obj.setOrganisationIdentification(value);
		}
	};
	@XmlElement(name = "RprtvOffcr")
	protected List<PartyIdentification40> representativeOfficer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification40
	 * PartyIdentification40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation6 Organisation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RprtvOffcr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepresentativeOfficer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person in the customer's organisation who can be contacted by the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation6, List<PartyIdentification40>> mmRepresentativeOfficer = new MMMessageAssociationEnd<Organisation6, List<PartyIdentification40>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation6.mmObject();
			isDerived = false;
			xmlTag = "RprtvOffcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepresentativeOfficer";
			definition = "Person in the customer's organisation who can be contacted by the account servicer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification40.mmObject();
		}

		@Override
		public List<PartyIdentification40> getValue(Organisation6 obj) {
			return obj.getRepresentativeOfficer();
		}

		@Override
		public void setValue(Organisation6 obj, List<PartyIdentification40> value) {
			obj.setRepresentativeOfficer(value);
		}
	};
	@XmlElement(name = "TrsrMgr")
	protected PartyIdentification40 treasuryManager;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification40
	 * PartyIdentification40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation6 Organisation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrsrMgr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the person responsible of the treasury department within an organisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation6, Optional<PartyIdentification40>> mmTreasuryManager = new MMMessageAssociationEnd<Organisation6, Optional<PartyIdentification40>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation6.mmObject();
			isDerived = false;
			xmlTag = "TrsrMgr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryManager";
			definition = "Identification of the person responsible of the treasury department within an organisation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification40.mmObject();
		}

		@Override
		public Optional<PartyIdentification40> getValue(Organisation6 obj) {
			return obj.getTreasuryManager();
		}

		@Override
		public void setValue(Organisation6 obj, Optional<PartyIdentification40> value) {
			obj.setTreasuryManager(value.orElse(null));
		}
	};
	@XmlElement(name = "MainMndtHldr")
	protected List<PartyIdentification40> mainMandateHolder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification40
	 * PartyIdentification40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation6 Organisation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MainMndtHldr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MainMandateHolder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Is the main mandate holder that will delegate some authority to other individuals (mandate holders) to perform some specific bank operations on the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation6, List<PartyIdentification40>> mmMainMandateHolder = new MMMessageAssociationEnd<Organisation6, List<PartyIdentification40>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation6.mmObject();
			isDerived = false;
			xmlTag = "MainMndtHldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MainMandateHolder";
			definition = "Is the main mandate holder that will delegate some authority to other individuals (mandate holders) to perform some specific bank operations on the account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification40.mmObject();
		}

		@Override
		public List<PartyIdentification40> getValue(Organisation6 obj) {
			return obj.getMainMandateHolder();
		}

		@Override
		public void setValue(Organisation6 obj, List<PartyIdentification40> value) {
			obj.setMainMandateHolder(value);
		}
	};
	@XmlElement(name = "Sndr")
	protected List<PartyIdentification40> sender;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification40
	 * PartyIdentification40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation6 Organisation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sndr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Potential sender of a message related to the life cyle of an account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation6, List<PartyIdentification40>> mmSender = new MMMessageAssociationEnd<Organisation6, List<PartyIdentification40>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation6.mmObject();
			isDerived = false;
			xmlTag = "Sndr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sender";
			definition = "Potential sender of a message related to the life cyle of an account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification40.mmObject();
		}

		@Override
		public List<PartyIdentification40> getValue(Organisation6 obj) {
			return obj.getSender();
		}

		@Override
		public void setValue(Organisation6 obj, List<PartyIdentification40> value) {
			obj.setSender(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation6.mmFullLegalName, com.tools20022.repository.msg.Organisation6.mmTradingName,
						com.tools20022.repository.msg.Organisation6.mmCountryOfOperation, com.tools20022.repository.msg.Organisation6.mmRegistrationDate, com.tools20022.repository.msg.Organisation6.mmOperationalAddress,
						com.tools20022.repository.msg.Organisation6.mmBusinessAddress, com.tools20022.repository.msg.Organisation6.mmLegalAddress, com.tools20022.repository.msg.Organisation6.mmOrganisationIdentification,
						com.tools20022.repository.msg.Organisation6.mmRepresentativeOfficer, com.tools20022.repository.msg.Organisation6.mmTreasuryManager, com.tools20022.repository.msg.Organisation6.mmMainMandateHolder,
						com.tools20022.repository.msg.Organisation6.mmSender);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountExcludedMandateMaintenanceAmendmentRequestV01.mmOrganisation, AccountExcludedMandateMaintenanceRequestV01.mmOrganisation,
						AccountOpeningAmendmentRequestV01.mmOrganisation, AccountReportV01.mmOrganisation);
				trace_lazy = () -> Organisation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Organisation6";
				definition = "Information which describes the organisation.";
				nextVersions_lazy = () -> Arrays.asList(Organisation12.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getFullLegalName() {
		return fullLegalName;
	}

	public Organisation6 setFullLegalName(Max350Text fullLegalName) {
		this.fullLegalName = Objects.requireNonNull(fullLegalName);
		return this;
	}

	public Optional<Max350Text> getTradingName() {
		return tradingName == null ? Optional.empty() : Optional.of(tradingName);
	}

	public Organisation6 setTradingName(Max350Text tradingName) {
		this.tradingName = tradingName;
		return this;
	}

	public CountryCode getCountryOfOperation() {
		return countryOfOperation;
	}

	public Organisation6 setCountryOfOperation(CountryCode countryOfOperation) {
		this.countryOfOperation = Objects.requireNonNull(countryOfOperation);
		return this;
	}

	public Optional<ISODate> getRegistrationDate() {
		return registrationDate == null ? Optional.empty() : Optional.of(registrationDate);
	}

	public Organisation6 setRegistrationDate(ISODate registrationDate) {
		this.registrationDate = registrationDate;
		return this;
	}

	public Optional<PostalAddress6> getOperationalAddress() {
		return operationalAddress == null ? Optional.empty() : Optional.of(operationalAddress);
	}

	public Organisation6 setOperationalAddress(PostalAddress6 operationalAddress) {
		this.operationalAddress = operationalAddress;
		return this;
	}

	public Optional<PostalAddress6> getBusinessAddress() {
		return businessAddress == null ? Optional.empty() : Optional.of(businessAddress);
	}

	public Organisation6 setBusinessAddress(PostalAddress6 businessAddress) {
		this.businessAddress = businessAddress;
		return this;
	}

	public PostalAddress6 getLegalAddress() {
		return legalAddress;
	}

	public Organisation6 setLegalAddress(PostalAddress6 legalAddress) {
		this.legalAddress = Objects.requireNonNull(legalAddress);
		return this;
	}

	public OrganisationIdentification6 getOrganisationIdentification() {
		return organisationIdentification;
	}

	public Organisation6 setOrganisationIdentification(OrganisationIdentification6 organisationIdentification) {
		this.organisationIdentification = Objects.requireNonNull(organisationIdentification);
		return this;
	}

	public List<PartyIdentification40> getRepresentativeOfficer() {
		return representativeOfficer == null ? representativeOfficer = new ArrayList<>() : representativeOfficer;
	}

	public Organisation6 setRepresentativeOfficer(List<PartyIdentification40> representativeOfficer) {
		this.representativeOfficer = Objects.requireNonNull(representativeOfficer);
		return this;
	}

	public Optional<PartyIdentification40> getTreasuryManager() {
		return treasuryManager == null ? Optional.empty() : Optional.of(treasuryManager);
	}

	public Organisation6 setTreasuryManager(PartyIdentification40 treasuryManager) {
		this.treasuryManager = treasuryManager;
		return this;
	}

	public List<PartyIdentification40> getMainMandateHolder() {
		return mainMandateHolder == null ? mainMandateHolder = new ArrayList<>() : mainMandateHolder;
	}

	public Organisation6 setMainMandateHolder(List<PartyIdentification40> mainMandateHolder) {
		this.mainMandateHolder = Objects.requireNonNull(mainMandateHolder);
		return this;
	}

	public List<PartyIdentification40> getSender() {
		return sender == null ? sender = new ArrayList<>() : sender;
	}

	public Organisation6 setSender(List<PartyIdentification40> sender) {
		this.sender = Objects.requireNonNull(sender);
		return this;
	}
}