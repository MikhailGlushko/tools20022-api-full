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
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.ATMDevice2Code;
import com.tools20022.repository.codeset.TransactionEnvironment2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.PointOfInteraction;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.entity.SystemIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMEquipment1;
import com.tools20022.repository.msg.PointOfInteractionCapabilities5;
import com.tools20022.repository.msg.PostalAddress17;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * ATM information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4#mmIdentification
 * AutomatedTellerMachine4.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4#mmAdditionalIdentification
 * AutomatedTellerMachine4.mmAdditionalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4#mmSequenceNumber
 * AutomatedTellerMachine4.mmSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4#mmBaseCurrency
 * AutomatedTellerMachine4.mmBaseCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4#mmLocation
 * AutomatedTellerMachine4.mmLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4#mmLocationCategory
 * AutomatedTellerMachine4.mmLocationCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4#mmCapabilities
 * AutomatedTellerMachine4.mmCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4#mmEquipment
 * AutomatedTellerMachine4.mmEquipment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4#mmAvailableDevice
 * AutomatedTellerMachine4.mmAvailableDevice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SystemIdentification
 * SystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AutomatedTellerMachine4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "ATM information."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AutomatedTellerMachine5
 * AutomatedTellerMachine5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine1
 * AutomatedTellerMachine1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AutomatedTellerMachine4", propOrder = {"identification", "additionalIdentification", "sequenceNumber", "baseCurrency", "location", "locationCategory", "capabilities", "equipment", "availableDevice"})
public class AutomatedTellerMachine4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmIdentificationForSystem
	 * SystemIdentification.mmIdentificationForSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4
	 * AutomatedTellerMachine4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ATM terminal device identification for the acquirer and the issuer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine5#mmIdentification
	 * AutomatedTellerMachine5.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine1#mmIdentification
	 * AutomatedTellerMachine1.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AutomatedTellerMachine4, Max35Text> mmIdentification = new MMMessageAttribute<AutomatedTellerMachine4, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SystemIdentification.mmIdentificationForSystem;
			componentContext_lazy = () -> com.tools20022.repository.msg.AutomatedTellerMachine4.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "ATM terminal device identification for the acquirer and the issuer.";
			nextVersions_lazy = () -> Arrays.asList(AutomatedTellerMachine5.mmIdentification);
			previousVersion_lazy = () -> AutomatedTellerMachine1.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AutomatedTellerMachine4 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(AutomatedTellerMachine4 obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "AddtlId")
	protected Max35Text additionalIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4
	 * AutomatedTellerMachine4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ATM terminal device identification for the ATM manager."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine5#mmAdditionalIdentification
	 * AutomatedTellerMachine5.mmAdditionalIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine1#mmAdditionalIdentification
	 * AutomatedTellerMachine1.mmAdditionalIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AutomatedTellerMachine4, Optional<Max35Text>> mmAdditionalIdentification = new MMMessageAttribute<AutomatedTellerMachine4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AutomatedTellerMachine4.mmObject();
			isDerived = false;
			xmlTag = "AddtlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalIdentification";
			definition = "ATM terminal device identification for the ATM manager.";
			nextVersions_lazy = () -> Arrays.asList(AutomatedTellerMachine5.mmAdditionalIdentification);
			previousVersion_lazy = () -> AutomatedTellerMachine1.mmAdditionalIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AutomatedTellerMachine4 obj) {
			return obj.getAdditionalIdentification();
		}

		@Override
		public void setValue(AutomatedTellerMachine4 obj, Optional<Max35Text> value) {
			obj.setAdditionalIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "SeqNb")
	protected Max35Text sequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmSystemName
	 * SystemIdentification.mmSystemName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4
	 * AutomatedTellerMachine4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ATM terminal device identification for the branch."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine5#mmSequenceNumber
	 * AutomatedTellerMachine5.mmSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine1#mmSequenceNumber
	 * AutomatedTellerMachine1.mmSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AutomatedTellerMachine4, Optional<Max35Text>> mmSequenceNumber = new MMMessageAttribute<AutomatedTellerMachine4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SystemIdentification.mmSystemName;
			componentContext_lazy = () -> com.tools20022.repository.msg.AutomatedTellerMachine4.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "ATM terminal device identification for the branch.";
			nextVersions_lazy = () -> Arrays.asList(AutomatedTellerMachine5.mmSequenceNumber);
			previousVersion_lazy = () -> AutomatedTellerMachine1.mmSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AutomatedTellerMachine4 obj) {
			return obj.getSequenceNumber();
		}

		@Override
		public void setValue(AutomatedTellerMachine4 obj, Optional<Max35Text> value) {
			obj.setSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "BaseCcy", required = true)
	protected ActiveCurrencyCode baseCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyOfTransfer
	 * Payment.mmCurrencyOfTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4
	 * AutomatedTellerMachine4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BaseCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference currency of the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine5#mmBaseCurrency
	 * AutomatedTellerMachine5.mmBaseCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine1#mmBaseCurrency
	 * AutomatedTellerMachine1.mmBaseCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AutomatedTellerMachine4, ActiveCurrencyCode> mmBaseCurrency = new MMMessageAttribute<AutomatedTellerMachine4, ActiveCurrencyCode>() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyOfTransfer;
			componentContext_lazy = () -> com.tools20022.repository.msg.AutomatedTellerMachine4.mmObject();
			isDerived = false;
			xmlTag = "BaseCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseCurrency";
			definition = "Reference currency of the ATM.";
			nextVersions_lazy = () -> Arrays.asList(AutomatedTellerMachine5.mmBaseCurrency);
			previousVersion_lazy = () -> AutomatedTellerMachine1.mmBaseCurrency;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public ActiveCurrencyCode getValue(AutomatedTellerMachine4 obj) {
			return obj.getBaseCurrency();
		}

		@Override
		public void setValue(AutomatedTellerMachine4 obj, ActiveCurrencyCode value) {
			obj.setBaseCurrency(value);
		}
	};
	@XmlElement(name = "Lctn")
	protected PostalAddress17 location;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress17
	 * PostalAddress17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.System#mmLocation
	 * System.mmLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4
	 * AutomatedTellerMachine4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Location of the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine5#mmLocation
	 * AutomatedTellerMachine5.mmLocation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine1#mmLocation
	 * AutomatedTellerMachine1.mmLocation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AutomatedTellerMachine4, Optional<PostalAddress17>> mmLocation = new MMMessageAssociationEnd<AutomatedTellerMachine4, Optional<PostalAddress17>>() {
		{
			businessElementTrace_lazy = () -> System.mmLocation;
			componentContext_lazy = () -> com.tools20022.repository.msg.AutomatedTellerMachine4.mmObject();
			isDerived = false;
			xmlTag = "Lctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Location";
			definition = "Location of the ATM.";
			nextVersions_lazy = () -> Arrays.asList(AutomatedTellerMachine5.mmLocation);
			previousVersion_lazy = () -> AutomatedTellerMachine1.mmLocation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PostalAddress17.mmObject();
		}

		@Override
		public Optional<PostalAddress17> getValue(AutomatedTellerMachine4 obj) {
			return obj.getLocation();
		}

		@Override
		public void setValue(AutomatedTellerMachine4 obj, Optional<PostalAddress17> value) {
			obj.setLocation(value.orElse(null));
		}
	};
	@XmlElement(name = "LctnCtgy")
	protected TransactionEnvironment2Code locationCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironment2Code
	 * TransactionEnvironment2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4
	 * AutomatedTellerMachine4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LctnCtgy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocationCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the environment of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine5#mmLocationCategory
	 * AutomatedTellerMachine5.mmLocationCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine1#mmLocationCategory
	 * AutomatedTellerMachine1.mmLocationCategory}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AutomatedTellerMachine4, Optional<TransactionEnvironment2Code>> mmLocationCategory = new MMMessageAttribute<AutomatedTellerMachine4, Optional<TransactionEnvironment2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AutomatedTellerMachine4.mmObject();
			isDerived = false;
			xmlTag = "LctnCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocationCategory";
			definition = "Indicates the environment of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(AutomatedTellerMachine5.mmLocationCategory);
			previousVersion_lazy = () -> AutomatedTellerMachine1.mmLocationCategory;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TransactionEnvironment2Code.mmObject();
		}

		@Override
		public Optional<TransactionEnvironment2Code> getValue(AutomatedTellerMachine4 obj) {
			return obj.getLocationCategory();
		}

		@Override
		public void setValue(AutomatedTellerMachine4 obj, Optional<TransactionEnvironment2Code> value) {
			obj.setLocationCategory(value.orElse(null));
		}
	};
	@XmlElement(name = "Cpblties")
	protected PointOfInteractionCapabilities5 capabilities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities5
	 * PointOfInteractionCapabilities5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmCardReadingCapabilities
	 * PointOfInteraction.mmCardReadingCapabilities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4
	 * AutomatedTellerMachine4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cpblties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Capabilities of the ATM terminal performing the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine1#mmCapabilities
	 * AutomatedTellerMachine1.mmCapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AutomatedTellerMachine4, Optional<PointOfInteractionCapabilities5>> mmCapabilities = new MMMessageAssociationEnd<AutomatedTellerMachine4, Optional<PointOfInteractionCapabilities5>>() {
		{
			businessElementTrace_lazy = () -> PointOfInteraction.mmCardReadingCapabilities;
			componentContext_lazy = () -> com.tools20022.repository.msg.AutomatedTellerMachine4.mmObject();
			isDerived = false;
			xmlTag = "Cpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capabilities";
			definition = "Capabilities of the ATM terminal performing the transaction.";
			previousVersion_lazy = () -> AutomatedTellerMachine1.mmCapabilities;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PointOfInteractionCapabilities5.mmObject();
		}

		@Override
		public Optional<PointOfInteractionCapabilities5> getValue(AutomatedTellerMachine4 obj) {
			return obj.getCapabilities();
		}

		@Override
		public void setValue(AutomatedTellerMachine4 obj, Optional<PointOfInteractionCapabilities5> value) {
			obj.setCapabilities(value.orElse(null));
		}
	};
	@XmlElement(name = "Eqpmnt")
	protected ATMEquipment1 equipment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEquipment1
	 * ATMEquipment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4
	 * AutomatedTellerMachine4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Eqpmnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ATM terminal equipment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine5#mmEquipment
	 * AutomatedTellerMachine5.mmEquipment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine1#mmEquipment
	 * AutomatedTellerMachine1.mmEquipment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AutomatedTellerMachine4, Optional<ATMEquipment1>> mmEquipment = new MMMessageAssociationEnd<AutomatedTellerMachine4, Optional<ATMEquipment1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AutomatedTellerMachine4.mmObject();
			isDerived = false;
			xmlTag = "Eqpmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equipment";
			definition = "ATM terminal equipment.";
			nextVersions_lazy = () -> Arrays.asList(AutomatedTellerMachine5.mmEquipment);
			previousVersion_lazy = () -> AutomatedTellerMachine1.mmEquipment;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMEquipment1.mmObject();
		}

		@Override
		public Optional<ATMEquipment1> getValue(AutomatedTellerMachine4 obj) {
			return obj.getEquipment();
		}

		@Override
		public void setValue(AutomatedTellerMachine4 obj, Optional<ATMEquipment1> value) {
			obj.setEquipment(value.orElse(null));
		}
	};
	@XmlElement(name = "AvlblDvc")
	protected List<ATMDevice2Code> availableDevice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMDevice2Code
	 * ATMDevice2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4
	 * AutomatedTellerMachine4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvlblDvc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableDevice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of ATM devices out of service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine5#mmOutOfServiceDevice
	 * AutomatedTellerMachine5.mmOutOfServiceDevice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AutomatedTellerMachine4, List<ATMDevice2Code>> mmAvailableDevice = new MMMessageAttribute<AutomatedTellerMachine4, List<ATMDevice2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AutomatedTellerMachine4.mmObject();
			isDerived = false;
			xmlTag = "AvlblDvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableDevice";
			definition = "List of ATM devices out of service.";
			nextVersions_lazy = () -> Arrays.asList(AutomatedTellerMachine5.mmOutOfServiceDevice);
			minOccurs = 0;
			simpleType_lazy = () -> ATMDevice2Code.mmObject();
		}

		@Override
		public List<ATMDevice2Code> getValue(AutomatedTellerMachine4 obj) {
			return obj.getAvailableDevice();
		}

		@Override
		public void setValue(AutomatedTellerMachine4 obj, List<ATMDevice2Code> value) {
			obj.setAvailableDevice(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AutomatedTellerMachine4.mmIdentification, com.tools20022.repository.msg.AutomatedTellerMachine4.mmAdditionalIdentification,
						com.tools20022.repository.msg.AutomatedTellerMachine4.mmSequenceNumber, com.tools20022.repository.msg.AutomatedTellerMachine4.mmBaseCurrency, com.tools20022.repository.msg.AutomatedTellerMachine4.mmLocation,
						com.tools20022.repository.msg.AutomatedTellerMachine4.mmLocationCategory, com.tools20022.repository.msg.AutomatedTellerMachine4.mmCapabilities, com.tools20022.repository.msg.AutomatedTellerMachine4.mmEquipment,
						com.tools20022.repository.msg.AutomatedTellerMachine4.mmAvailableDevice);
				trace_lazy = () -> SystemIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AutomatedTellerMachine4";
				definition = "ATM information.";
				nextVersions_lazy = () -> Arrays.asList(AutomatedTellerMachine5.mmObject());
				previousVersion_lazy = () -> AutomatedTellerMachine1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public AutomatedTellerMachine4 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max35Text> getAdditionalIdentification() {
		return additionalIdentification == null ? Optional.empty() : Optional.of(additionalIdentification);
	}

	public AutomatedTellerMachine4 setAdditionalIdentification(Max35Text additionalIdentification) {
		this.additionalIdentification = additionalIdentification;
		return this;
	}

	public Optional<Max35Text> getSequenceNumber() {
		return sequenceNumber == null ? Optional.empty() : Optional.of(sequenceNumber);
	}

	public AutomatedTellerMachine4 setSequenceNumber(Max35Text sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
		return this;
	}

	public ActiveCurrencyCode getBaseCurrency() {
		return baseCurrency;
	}

	public AutomatedTellerMachine4 setBaseCurrency(ActiveCurrencyCode baseCurrency) {
		this.baseCurrency = Objects.requireNonNull(baseCurrency);
		return this;
	}

	public Optional<PostalAddress17> getLocation() {
		return location == null ? Optional.empty() : Optional.of(location);
	}

	public AutomatedTellerMachine4 setLocation(PostalAddress17 location) {
		this.location = location;
		return this;
	}

	public Optional<TransactionEnvironment2Code> getLocationCategory() {
		return locationCategory == null ? Optional.empty() : Optional.of(locationCategory);
	}

	public AutomatedTellerMachine4 setLocationCategory(TransactionEnvironment2Code locationCategory) {
		this.locationCategory = locationCategory;
		return this;
	}

	public Optional<PointOfInteractionCapabilities5> getCapabilities() {
		return capabilities == null ? Optional.empty() : Optional.of(capabilities);
	}

	public AutomatedTellerMachine4 setCapabilities(PointOfInteractionCapabilities5 capabilities) {
		this.capabilities = capabilities;
		return this;
	}

	public Optional<ATMEquipment1> getEquipment() {
		return equipment == null ? Optional.empty() : Optional.of(equipment);
	}

	public AutomatedTellerMachine4 setEquipment(ATMEquipment1 equipment) {
		this.equipment = equipment;
		return this;
	}

	public List<ATMDevice2Code> getAvailableDevice() {
		return availableDevice == null ? availableDevice = new ArrayList<>() : availableDevice;
	}

	public AutomatedTellerMachine4 setAvailableDevice(List<ATMDevice2Code> availableDevice) {
		this.availableDevice = Objects.requireNonNull(availableDevice);
		return this;
	}
}