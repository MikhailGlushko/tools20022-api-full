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
import com.tools20022.repository.codeset.POIComponentType2Code;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.PointOfInteraction;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Data related to a component of the POI.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2#mmPOIComponentType
 * PointOfInteractionComponent2.mmPOIComponentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2#mmManufacturerIdentification
 * PointOfInteractionComponent2.mmManufacturerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2#mmModel
 * PointOfInteractionComponent2.mmModel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2#mmVersionNumber
 * PointOfInteractionComponent2.mmVersionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2#mmSerialNumber
 * PointOfInteractionComponent2.mmSerialNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2#mmApprovalNumber
 * PointOfInteractionComponent2.mmApprovalNumber}</li>
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
 * "PointOfInteractionComponent2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Data related to a component of the POI."</li>
 * </ul>
 */
public class PointOfInteractionComponent2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected POIComponentType2Code pOIComponentType;
	/**
	 * Type of component belonging to a POI Terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType2Code
	 * POIComponentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2
	 * PointOfInteractionComponent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POICmpntTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIComponentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of component belonging to a POI Terminal."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPOIComponentType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionComponent2.mmObject();
			isDerived = false;
			xmlTag = "POICmpntTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIComponentType";
			definition = "Type of component belonging to a POI Terminal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> POIComponentType2Code.mmObject();
		}
	};
	protected Max35Text manufacturerIdentification;
	/**
	 * Identification of the software, hardware or system provider of the POI
	 * component.
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2
	 * PointOfInteractionComponent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ManfctrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManufacturerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the software, hardware or system provider of the POI component."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmManufacturerIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentification;
			componentContext_lazy = () -> PointOfInteractionComponent2.mmObject();
			isDerived = false;
			xmlTag = "ManfctrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManufacturerIdentification";
			definition = "Identification of the software, hardware or system provider of the POI component.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text model;
	/**
	 * Identification of a model of POI component for a given manufacturer.
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
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmModel
	 * SystemIdentification.mmModel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2
	 * PointOfInteractionComponent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mdl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Model"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a model of POI component for a given manufacturer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmModel = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmModel;
			componentContext_lazy = () -> PointOfInteractionComponent2.mmObject();
			isDerived = false;
			xmlTag = "Mdl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Model";
			definition = "Identification of a model of POI component for a given manufacturer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max16Text versionNumber;
	/**
	 * Version of component belonging to a given model.
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
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmSystemVersion
	 * SystemIdentification.mmSystemVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2
	 * PointOfInteractionComponent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VrsnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VersionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of component belonging to a given model."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersionNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmSystemVersion;
			componentContext_lazy = () -> PointOfInteractionComponent2.mmObject();
			isDerived = false;
			xmlTag = "VrsnNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VersionNumber";
			definition = "Version of component belonging to a given model.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	protected Max35Text serialNumber;
	/**
	 * Serial number of a component.
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
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmSerialNumber
	 * SystemIdentification.mmSerialNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2
	 * PointOfInteractionComponent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrlNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SerialNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Serial number of a component."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSerialNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmSerialNumber;
			componentContext_lazy = () -> PointOfInteractionComponent2.mmObject();
			isDerived = false;
			xmlTag = "SrlNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SerialNumber";
			definition = "Serial number of a component.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<Max70Text> approvalNumber;
	/**
	 * Unique approval number for a component, delivered by a certification
	 * body.<br>
	 * Usage: More than one approval number could be present, when assigned by
	 * different bodies. The certification body identification must be provided
	 * within the approval number (for example at the beginning of the value).
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
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmApprovalNumber
	 * SystemIdentification.mmApprovalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2
	 * PointOfInteractionComponent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApprvlNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovalNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique approval number for a component, delivered by a certification body.\r\nUsage: More than one approval number could be present, when assigned by different bodies. The certification body identification must be provided within the approval number (for example at the beginning of the value)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmApprovalNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmApprovalNumber;
			componentContext_lazy = () -> PointOfInteractionComponent2.mmObject();
			isDerived = false;
			xmlTag = "ApprvlNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovalNumber";
			definition = "Unique approval number for a component, delivered by a certification body.\r\nUsage: More than one approval number could be present, when assigned by different bodies. The certification body identification must be provided within the approval number (for example at the beginning of the value).";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionComponent2.mmPOIComponentType, com.tools20022.repository.msg.PointOfInteractionComponent2.mmManufacturerIdentification,
						com.tools20022.repository.msg.PointOfInteractionComponent2.mmModel, com.tools20022.repository.msg.PointOfInteractionComponent2.mmVersionNumber,
						com.tools20022.repository.msg.PointOfInteractionComponent2.mmSerialNumber, com.tools20022.repository.msg.PointOfInteractionComponent2.mmApprovalNumber);
				trace_lazy = () -> PointOfInteraction.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PointOfInteractionComponent2";
				definition = "Data related to a component of the POI.";
			}
		});
		return mmObject_lazy.get();
	}

	public POIComponentType2Code getPOIComponentType() {
		return pOIComponentType;
	}

	public void setPOIComponentType(POIComponentType2Code pOIComponentType) {
		this.pOIComponentType = pOIComponentType;
	}

	public Max35Text getManufacturerIdentification() {
		return manufacturerIdentification;
	}

	public void setManufacturerIdentification(Max35Text manufacturerIdentification) {
		this.manufacturerIdentification = manufacturerIdentification;
	}

	public Max35Text getModel() {
		return model;
	}

	public void setModel(Max35Text model) {
		this.model = model;
	}

	public Max16Text getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(Max16Text versionNumber) {
		this.versionNumber = versionNumber;
	}

	public Max35Text getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Max35Text serialNumber) {
		this.serialNumber = serialNumber;
	}

	public List<Max70Text> getApprovalNumber() {
		return approvalNumber;
	}

	public void setApprovalNumber(List<Max70Text> approvalNumber) {
		this.approvalNumber = approvalNumber;
	}
}