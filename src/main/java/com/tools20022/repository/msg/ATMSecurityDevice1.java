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
import com.tools20022.repository.codeset.ATMStatus2Code;
import com.tools20022.repository.codeset.FailureReason5Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMEquipment2;
import com.tools20022.repository.msg.ATMSecurityConfiguration1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Hardware security module of the ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1#mmDeviceProperty
 * ATMSecurityDevice1.mmDeviceProperty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1#mmCurrentConfiguration
 * ATMSecurityDevice1.mmCurrentConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1#mmSupportedConfiguration
 * ATMSecurityDevice1.mmSupportedConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1#mmCurrentStatus
 * ATMSecurityDevice1.mmCurrentStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMSecurityDevice1#mmIncident
 * ATMSecurityDevice1.mmIncident}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMSecurityDevice1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Hardware security module of the ATM."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMSecurityDevice2
 * ATMSecurityDevice2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMSecurityDevice1", propOrder = {"deviceProperty", "currentConfiguration", "supportedConfiguration", "currentStatus", "incident"})
public class ATMSecurityDevice1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DvcPrprty")
	protected ATMEquipment2 deviceProperty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEquipment2
	 * ATMEquipment2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1
	 * ATMSecurityDevice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvcPrprty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeviceProperty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Hardware security module information, so called EPP for Encrypted PIN Pad."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice2#mmDeviceProperty
	 * ATMSecurityDevice2.mmDeviceProperty}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMSecurityDevice1, Optional<ATMEquipment2>> mmDeviceProperty = new MMMessageAssociationEnd<ATMSecurityDevice1, Optional<ATMEquipment2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityDevice1.mmObject();
			isDerived = false;
			xmlTag = "DvcPrprty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeviceProperty";
			definition = "Hardware security module information, so called EPP for Encrypted PIN Pad.";
			nextVersions_lazy = () -> Arrays.asList(ATMSecurityDevice2.mmDeviceProperty);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMEquipment2.mmObject();
		}

		@Override
		public Optional<ATMEquipment2> getValue(ATMSecurityDevice1 obj) {
			return obj.getDeviceProperty();
		}

		@Override
		public void setValue(ATMSecurityDevice1 obj, Optional<ATMEquipment2> value) {
			obj.setDeviceProperty(value.orElse(null));
		}
	};
	@XmlElement(name = "CurCfgtn", required = true)
	protected ATMSecurityConfiguration1 currentConfiguration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration1
	 * ATMSecurityConfiguration1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1
	 * ATMSecurityDevice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurCfgtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentConfiguration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration parameters in use by the security device."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice2#mmCurrentConfiguration
	 * ATMSecurityDevice2.mmCurrentConfiguration}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMSecurityDevice1, ATMSecurityConfiguration1> mmCurrentConfiguration = new MMMessageAssociationEnd<ATMSecurityDevice1, ATMSecurityConfiguration1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityDevice1.mmObject();
			isDerived = false;
			xmlTag = "CurCfgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentConfiguration";
			definition = "Configuration parameters in use by the security device.";
			nextVersions_lazy = () -> Arrays.asList(ATMSecurityDevice2.mmCurrentConfiguration);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMSecurityConfiguration1.mmObject();
		}

		@Override
		public ATMSecurityConfiguration1 getValue(ATMSecurityDevice1 obj) {
			return obj.getCurrentConfiguration();
		}

		@Override
		public void setValue(ATMSecurityDevice1 obj, ATMSecurityConfiguration1 value) {
			obj.setCurrentConfiguration(value);
		}
	};
	@XmlElement(name = "SpprtdCfgtn")
	protected ATMSecurityConfiguration1 supportedConfiguration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration1
	 * ATMSecurityConfiguration1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1
	 * ATMSecurityDevice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpprtdCfgtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupportedConfiguration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration parameters supported by the security device."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice2#mmSupportedConfiguration
	 * ATMSecurityDevice2.mmSupportedConfiguration}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMSecurityDevice1, Optional<ATMSecurityConfiguration1>> mmSupportedConfiguration = new MMMessageAssociationEnd<ATMSecurityDevice1, Optional<ATMSecurityConfiguration1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityDevice1.mmObject();
			isDerived = false;
			xmlTag = "SpprtdCfgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupportedConfiguration";
			definition = "Configuration parameters supported by the security device.";
			nextVersions_lazy = () -> Arrays.asList(ATMSecurityDevice2.mmSupportedConfiguration);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMSecurityConfiguration1.mmObject();
		}

		@Override
		public Optional<ATMSecurityConfiguration1> getValue(ATMSecurityDevice1 obj) {
			return obj.getSupportedConfiguration();
		}

		@Override
		public void setValue(ATMSecurityDevice1 obj, Optional<ATMSecurityConfiguration1> value) {
			obj.setSupportedConfiguration(value.orElse(null));
		}
	};
	@XmlElement(name = "CurSts", required = true)
	protected ATMStatus2Code currentStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMStatus2Code
	 * ATMStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1
	 * ATMSecurityDevice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current status of the security device."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice2#mmCurrentStatus
	 * ATMSecurityDevice2.mmCurrentStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMSecurityDevice1, ATMStatus2Code> mmCurrentStatus = new MMMessageAttribute<ATMSecurityDevice1, ATMStatus2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityDevice1.mmObject();
			isDerived = false;
			xmlTag = "CurSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatus";
			definition = "Current status of the security device.";
			nextVersions_lazy = () -> Arrays.asList(ATMSecurityDevice2.mmCurrentStatus);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMStatus2Code.mmObject();
		}

		@Override
		public ATMStatus2Code getValue(ATMSecurityDevice1 obj) {
			return obj.getCurrentStatus();
		}

		@Override
		public void setValue(ATMSecurityDevice1 obj, ATMStatus2Code value) {
			obj.setCurrentStatus(value);
		}
	};
	@XmlElement(name = "Incdnt")
	protected FailureReason5Code incident;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason5Code
	 * FailureReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1
	 * ATMSecurityDevice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Incdnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incident"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Incident occurring on the device."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice2#mmIncident
	 * ATMSecurityDevice2.mmIncident}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMSecurityDevice1, Optional<FailureReason5Code>> mmIncident = new MMMessageAttribute<ATMSecurityDevice1, Optional<FailureReason5Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityDevice1.mmObject();
			isDerived = false;
			xmlTag = "Incdnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incident";
			definition = "Incident occurring on the device.";
			nextVersions_lazy = () -> Arrays.asList(ATMSecurityDevice2.mmIncident);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FailureReason5Code.mmObject();
		}

		@Override
		public Optional<FailureReason5Code> getValue(ATMSecurityDevice1 obj) {
			return obj.getIncident();
		}

		@Override
		public void setValue(ATMSecurityDevice1 obj, Optional<FailureReason5Code> value) {
			obj.setIncident(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMSecurityDevice1.mmDeviceProperty, com.tools20022.repository.msg.ATMSecurityDevice1.mmCurrentConfiguration,
						com.tools20022.repository.msg.ATMSecurityDevice1.mmSupportedConfiguration, com.tools20022.repository.msg.ATMSecurityDevice1.mmCurrentStatus, com.tools20022.repository.msg.ATMSecurityDevice1.mmIncident);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMSecurityDevice1";
				definition = "Hardware security module of the ATM.";
				nextVersions_lazy = () -> Arrays.asList(ATMSecurityDevice2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ATMEquipment2> getDeviceProperty() {
		return deviceProperty == null ? Optional.empty() : Optional.of(deviceProperty);
	}

	public ATMSecurityDevice1 setDeviceProperty(ATMEquipment2 deviceProperty) {
		this.deviceProperty = deviceProperty;
		return this;
	}

	public ATMSecurityConfiguration1 getCurrentConfiguration() {
		return currentConfiguration;
	}

	public ATMSecurityDevice1 setCurrentConfiguration(ATMSecurityConfiguration1 currentConfiguration) {
		this.currentConfiguration = Objects.requireNonNull(currentConfiguration);
		return this;
	}

	public Optional<ATMSecurityConfiguration1> getSupportedConfiguration() {
		return supportedConfiguration == null ? Optional.empty() : Optional.of(supportedConfiguration);
	}

	public ATMSecurityDevice1 setSupportedConfiguration(ATMSecurityConfiguration1 supportedConfiguration) {
		this.supportedConfiguration = supportedConfiguration;
		return this;
	}

	public ATMStatus2Code getCurrentStatus() {
		return currentStatus;
	}

	public ATMSecurityDevice1 setCurrentStatus(ATMStatus2Code currentStatus) {
		this.currentStatus = Objects.requireNonNull(currentStatus);
		return this;
	}

	public Optional<FailureReason5Code> getIncident() {
		return incident == null ? Optional.empty() : Optional.of(incident);
	}

	public ATMSecurityDevice1 setIncident(FailureReason5Code incident) {
		this.incident = incident;
		return this;
	}
}