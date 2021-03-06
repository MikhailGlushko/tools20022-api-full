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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ApplicationSpecifics1;
import com.tools20022.repository.msg.ManifestDetails1;
import com.tools20022.repository.msg.PayloadDetails1;
import com.tools20022.repository.msg.PayloadTypeDetails1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Contains information about the payload.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PayloadDescription1#mmPayloadDetails
 * PayloadDescription1.mmPayloadDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PayloadDescription1#mmApplicationSpecificInformation
 * PayloadDescription1.mmApplicationSpecificInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PayloadDescription1#mmPayloadTypeDetails
 * PayloadDescription1.mmPayloadTypeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PayloadDescription1#mmManifestDetails
 * PayloadDescription1.mmManifestDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PayloadDescription1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Contains information about the payload."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PayloadDescription1", propOrder = {"payloadDetails", "applicationSpecificInformation", "payloadTypeDetails", "manifestDetails"})
public class PayloadDescription1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PyldDtls", required = true)
	protected PayloadDetails1 payloadDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PayloadDetails1
	 * PayloadDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PayloadDescription1
	 * PayloadDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyldDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayloadDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This component is used to identify the instance of the document exchanged."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PayloadDescription1, PayloadDetails1> mmPayloadDetails = new MMMessageAssociationEnd<PayloadDescription1, PayloadDetails1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PayloadDescription1.mmObject();
			isDerived = false;
			xmlTag = "PyldDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayloadDetails";
			definition = "This component is used to identify the instance of the document exchanged.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PayloadDetails1.mmObject();
		}

		@Override
		public PayloadDetails1 getValue(PayloadDescription1 obj) {
			return obj.getPayloadDetails();
		}

		@Override
		public void setValue(PayloadDescription1 obj, PayloadDetails1 value) {
			obj.setPayloadDetails(value);
		}
	};
	@XmlElement(name = "ApplSpcfcInf")
	protected ApplicationSpecifics1 applicationSpecificInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ApplicationSpecifics1
	 * ApplicationSpecifics1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PayloadDescription1
	 * PayloadDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplSpcfcInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationSpecificInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains business information that is considered as necessary by the service provider."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PayloadDescription1, Optional<ApplicationSpecifics1>> mmApplicationSpecificInformation = new MMMessageAssociationEnd<PayloadDescription1, Optional<ApplicationSpecifics1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PayloadDescription1.mmObject();
			isDerived = false;
			xmlTag = "ApplSpcfcInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationSpecificInformation";
			definition = "Contains business information that is considered as necessary by the service provider.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ApplicationSpecifics1.mmObject();
		}

		@Override
		public Optional<ApplicationSpecifics1> getValue(PayloadDescription1 obj) {
			return obj.getApplicationSpecificInformation();
		}

		@Override
		public void setValue(PayloadDescription1 obj, Optional<ApplicationSpecifics1> value) {
			obj.setApplicationSpecificInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "PyldTpDtls", required = true)
	protected PayloadTypeDetails1 payloadTypeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PayloadTypeDetails1
	 * PayloadTypeDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PayloadDescription1
	 * PayloadDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyldTpDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayloadTypeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the type of payload."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PayloadDescription1, PayloadTypeDetails1> mmPayloadTypeDetails = new MMMessageAssociationEnd<PayloadDescription1, PayloadTypeDetails1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PayloadDescription1.mmObject();
			isDerived = false;
			xmlTag = "PyldTpDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayloadTypeDetails";
			definition = "Identification of the type of payload.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PayloadTypeDetails1.mmObject();
		}

		@Override
		public PayloadTypeDetails1 getValue(PayloadDescription1 obj) {
			return obj.getPayloadTypeDetails();
		}

		@Override
		public void setValue(PayloadDescription1 obj, PayloadTypeDetails1 value) {
			obj.setPayloadTypeDetails(value);
		}
	};
	@XmlElement(name = "MnfstDtls")
	protected List<ManifestDetails1> manifestDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ManifestDetails1
	 * ManifestDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PayloadDescription1
	 * PayloadDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnfstDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManifestDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Manifest that describes the related items or attachments.\r\nThis block is repeated for each different type of item."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PayloadDescription1, List<ManifestDetails1>> mmManifestDetails = new MMMessageAssociationEnd<PayloadDescription1, List<ManifestDetails1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PayloadDescription1.mmObject();
			isDerived = false;
			xmlTag = "MnfstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManifestDetails";
			definition = "Manifest that describes the related items or attachments.\r\nThis block is repeated for each different type of item.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ManifestDetails1.mmObject();
		}

		@Override
		public List<ManifestDetails1> getValue(PayloadDescription1 obj) {
			return obj.getManifestDetails();
		}

		@Override
		public void setValue(PayloadDescription1 obj, List<ManifestDetails1> value) {
			obj.setManifestDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PayloadDescription1.mmPayloadDetails, com.tools20022.repository.msg.PayloadDescription1.mmApplicationSpecificInformation,
						com.tools20022.repository.msg.PayloadDescription1.mmPayloadTypeDetails, com.tools20022.repository.msg.PayloadDescription1.mmManifestDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PayloadDescription1";
				definition = "Contains information about the payload.";
			}
		});
		return mmObject_lazy.get();
	}

	public PayloadDetails1 getPayloadDetails() {
		return payloadDetails;
	}

	public PayloadDescription1 setPayloadDetails(PayloadDetails1 payloadDetails) {
		this.payloadDetails = Objects.requireNonNull(payloadDetails);
		return this;
	}

	public Optional<ApplicationSpecifics1> getApplicationSpecificInformation() {
		return applicationSpecificInformation == null ? Optional.empty() : Optional.of(applicationSpecificInformation);
	}

	public PayloadDescription1 setApplicationSpecificInformation(ApplicationSpecifics1 applicationSpecificInformation) {
		this.applicationSpecificInformation = applicationSpecificInformation;
		return this;
	}

	public PayloadTypeDetails1 getPayloadTypeDetails() {
		return payloadTypeDetails;
	}

	public PayloadDescription1 setPayloadTypeDetails(PayloadTypeDetails1 payloadTypeDetails) {
		this.payloadTypeDetails = Objects.requireNonNull(payloadTypeDetails);
		return this;
	}

	public List<ManifestDetails1> getManifestDetails() {
		return manifestDetails == null ? manifestDetails = new ArrayList<>() : manifestDetails;
	}

	public PayloadDescription1 setManifestDetails(List<ManifestDetails1> manifestDetails) {
		this.manifestDetails = Objects.requireNonNull(manifestDetails);
		return this;
	}
}