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
import com.tools20022.repository.codeset.LocationCategory3Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.PointOfInteraction;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Point of interaction (POI) performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5#mmIdentification
 * PointOfInteraction5.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5#mmSystemName
 * PointOfInteraction5.mmSystemName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5#mmGroupIdentification
 * PointOfInteraction5.mmGroupIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5#mmCapabilities
 * PointOfInteraction5.mmCapabilities}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteraction5#mmTimeZone
 * PointOfInteraction5.mmTimeZone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5#mmTerminalIntegration
 * PointOfInteraction5.mmTerminalIntegration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5#mmComponent
 * PointOfInteraction5.mmComponent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PointOfInteraction
 * PointOfInteraction}</li>
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
 * "PointOfInteraction5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Point of interaction (POI) performing the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteraction7
 * PointOfInteraction7}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PointOfInteraction4
 * PointOfInteraction4}</li>
 * </ul>
 */
public class PointOfInteraction5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification32 identification;
	/**
	 * Identification of the POI (Point Of Interaction) for the acquirer or its
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5
	 * PointOfInteraction5}</li>
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
	 * definition} =
	 * "Identification of the POI (Point Of Interaction) for the acquirer or its agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmIdentification
	 * PointOfInteraction7.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction4#mmIdentification
	 * PointOfInteraction4.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PointOfInteraction5.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the POI (Point Of Interaction) for the acquirer or its agent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteraction7.mmIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.msg.PointOfInteraction4.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification32.mmObject();
		}
	};
	protected Max70Text systemName;
	/**
	 * Common name assigned by the acquirer to the POI (Point Of Interaction)
	 * system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemName#mmName
	 * SystemName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5
	 * PointOfInteraction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common name assigned by the acquirer to the POI (Point Of Interaction) system."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmSystemName
	 * PointOfInteraction7.mmSystemName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction4#mmSystemName
	 * PointOfInteraction4.mmSystemName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSystemName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SystemName.mmName;
			componentContext_lazy = () -> PointOfInteraction5.mmObject();
			isDerived = false;
			xmlTag = "SysNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemName";
			definition = "Common name assigned by the acquirer to the POI (Point Of Interaction) system.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteraction7.mmSystemName);
			previousVersion_lazy = () -> com.tools20022.repository.msg.PointOfInteraction4.mmSystemName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Max35Text groupIdentification;
	/**
	 * Identifier assigned by the merchant identifying a set of POI (Point Of
	 * Interaction) terminals performing some categories of transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5
	 * PointOfInteraction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier assigned by the merchant identifying a set of POI (Point Of Interaction) terminals performing some categories of transactions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmGroupIdentification
	 * PointOfInteraction7.mmGroupIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction4#mmGroupIdentification
	 * PointOfInteraction4.mmGroupIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGroupIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteraction5.mmObject();
			isDerived = false;
			xmlTag = "GrpId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupIdentification";
			definition = "Identifier assigned by the merchant identifying a set of POI (Point Of Interaction) terminals performing some categories of transactions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteraction7.mmGroupIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.msg.PointOfInteraction4.mmGroupIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PointOfInteractionCapabilities6 capabilities;
	/**
	 * Capabilities of the POI (Point Of Interaction) performing the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionCapabilities6
	 * PointOfInteractionCapabilities6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5
	 * PointOfInteraction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cpblties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Capabilities of the POI (Point Of Interaction) performing the transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmCapabilities
	 * PointOfInteraction7.mmCapabilities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction4#mmCapabilities
	 * PointOfInteraction4.mmCapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCapabilities = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PointOfInteraction.mmObject();
			componentContext_lazy = () -> PointOfInteraction5.mmObject();
			isDerived = false;
			xmlTag = "Cpblties";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capabilities";
			definition = "Capabilities of the POI (Point Of Interaction) performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteraction7.mmCapabilities);
			previousVersion_lazy = () -> com.tools20022.repository.msg.PointOfInteraction4.mmCapabilities;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PointOfInteractionCapabilities6.mmObject();
		}
	};
	protected Max70Text timeZone;
	/**
	 * Time zone name as defined by IANA (Internet Assigned Numbers Authority)
	 * in the time zone data base. America/Chicago or Europe/Paris are examples
	 * of time zone names.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5
	 * PointOfInteraction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Time zone name as defined by IANA (Internet Assigned Numbers Authority) in the time zone data base. America/Chicago or Europe/Paris are examples of time zone names."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmTimeZone
	 * PointOfInteraction7.mmTimeZone}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTimeZone = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteraction5.mmObject();
			isDerived = false;
			xmlTag = "TmZone";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeZone";
			definition = "Time zone name as defined by IANA (Internet Assigned Numbers Authority) in the time zone data base. America/Chicago or Europe/Paris are examples of time zone names.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteraction7.mmTimeZone);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected LocationCategory3Code terminalIntegration;
	/**
	 * Indicates the type of integration of the POI terminal in the sale
	 * environment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory3Code
	 * LocationCategory3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5
	 * PointOfInteraction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermnlIntgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalIntegration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of integration of the POI terminal in the sale environment."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmTerminalIntegration
	 * PointOfInteraction7.mmTerminalIntegration}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTerminalIntegration = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteraction5.mmObject();
			isDerived = false;
			xmlTag = "TermnlIntgtn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalIntegration";
			definition = "Indicates the type of integration of the POI terminal in the sale environment.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteraction7.mmTerminalIntegration);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LocationCategory3Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PointOfInteractionComponent6> component;
	/**
	 * Data related to a component of the POI (Point Of Interaction) performing
	 * the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent6
	 * PointOfInteractionComponent6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmComponent
	 * PointOfInteraction.mmComponent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction5
	 * PointOfInteraction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmpnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Component"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data related to a component of the POI (Point Of Interaction) performing the transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction7#mmComponent
	 * PointOfInteraction7.mmComponent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction4#mmComponent
	 * PointOfInteraction4.mmComponent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmComponent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmComponent;
			componentContext_lazy = () -> PointOfInteraction5.mmObject();
			isDerived = false;
			xmlTag = "Cmpnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Component";
			definition = "Data related to a component of the POI (Point Of Interaction) performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteraction7.mmComponent);
			previousVersion_lazy = () -> com.tools20022.repository.msg.PointOfInteraction4.mmComponent;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponent6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteraction5.mmIdentification, com.tools20022.repository.msg.PointOfInteraction5.mmSystemName,
						com.tools20022.repository.msg.PointOfInteraction5.mmGroupIdentification, com.tools20022.repository.msg.PointOfInteraction5.mmCapabilities, com.tools20022.repository.msg.PointOfInteraction5.mmTimeZone,
						com.tools20022.repository.msg.PointOfInteraction5.mmTerminalIntegration, com.tools20022.repository.msg.PointOfInteraction5.mmComponent);
				trace_lazy = () -> PointOfInteraction.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PointOfInteraction5";
				definition = "Point of interaction (POI) performing the transaction.";
				nextVersions_lazy = () -> Arrays.asList(PointOfInteraction7.mmObject());
				previousVersion_lazy = () -> PointOfInteraction4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification32 getIdentification() {
		return identification;
	}

	public void setIdentification(com.tools20022.repository.msg.GenericIdentification32 identification) {
		this.identification = identification;
	}

	public Max70Text getSystemName() {
		return systemName;
	}

	public void setSystemName(Max70Text systemName) {
		this.systemName = systemName;
	}

	public Max35Text getGroupIdentification() {
		return groupIdentification;
	}

	public void setGroupIdentification(Max35Text groupIdentification) {
		this.groupIdentification = groupIdentification;
	}

	public PointOfInteractionCapabilities6 getCapabilities() {
		return capabilities;
	}

	public void setCapabilities(com.tools20022.repository.msg.PointOfInteractionCapabilities6 capabilities) {
		this.capabilities = capabilities;
	}

	public Max70Text getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(Max70Text timeZone) {
		this.timeZone = timeZone;
	}

	public LocationCategory3Code getTerminalIntegration() {
		return terminalIntegration;
	}

	public void setTerminalIntegration(LocationCategory3Code terminalIntegration) {
		this.terminalIntegration = terminalIntegration;
	}

	public List<PointOfInteractionComponent6> getComponent() {
		return component;
	}

	public void setComponent(List<com.tools20022.repository.msg.PointOfInteractionComponent6> component) {
		this.component = component;
	}
}