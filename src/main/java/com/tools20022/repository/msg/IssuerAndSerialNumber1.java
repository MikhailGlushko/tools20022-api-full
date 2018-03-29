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
import com.tools20022.repository.datatype.Max35Binary;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CertificateIssuer1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Certificate issuer name and serial number (see X.509).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IssuerAndSerialNumber1#mmIssuer
 * IssuerAndSerialNumber1.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IssuerAndSerialNumber1#mmSerialNumber
 * IssuerAndSerialNumber1.mmSerialNumber}</li>
 * </ul>
 * </li>
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
 * "IssuerAndSerialNumber1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Certificate issuer name and serial number (see X.509)."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IssuerAndSerialNumber1", propOrder = {"issuer", "serialNumber"})
public class IssuerAndSerialNumber1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Issr", required = true)
	protected CertificateIssuer1 issuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CertificateIssuer1
	 * CertificateIssuer1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IssuerAndSerialNumber1
	 * IssuerAndSerialNumber1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate issuer name (see X.509)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IssuerAndSerialNumber1, CertificateIssuer1> mmIssuer = new MMMessageAssociationEnd<IssuerAndSerialNumber1, CertificateIssuer1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IssuerAndSerialNumber1.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Certificate issuer name (see X.509).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CertificateIssuer1.mmObject();
		}

		@Override
		public CertificateIssuer1 getValue(IssuerAndSerialNumber1 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(IssuerAndSerialNumber1 obj, CertificateIssuer1 value) {
			obj.setIssuer(value);
		}
	};
	@XmlElement(name = "SrlNb", required = true)
	protected Max35Binary serialNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Binary
	 * Max35Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IssuerAndSerialNumber1
	 * IssuerAndSerialNumber1}</li>
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
	 * definition} = "Certificate serial number (see X.509)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IssuerAndSerialNumber1, Max35Binary> mmSerialNumber = new MMMessageAttribute<IssuerAndSerialNumber1, Max35Binary>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IssuerAndSerialNumber1.mmObject();
			isDerived = false;
			xmlTag = "SrlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SerialNumber";
			definition = "Certificate serial number (see X.509).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Binary.mmObject();
		}

		@Override
		public Max35Binary getValue(IssuerAndSerialNumber1 obj) {
			return obj.getSerialNumber();
		}

		@Override
		public void setValue(IssuerAndSerialNumber1 obj, Max35Binary value) {
			obj.setSerialNumber(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IssuerAndSerialNumber1.mmIssuer, com.tools20022.repository.msg.IssuerAndSerialNumber1.mmSerialNumber);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IssuerAndSerialNumber1";
				definition = "Certificate issuer name and serial number (see X.509).";
			}
		});
		return mmObject_lazy.get();
	}

	public CertificateIssuer1 getIssuer() {
		return issuer;
	}

	public IssuerAndSerialNumber1 setIssuer(CertificateIssuer1 issuer) {
		this.issuer = Objects.requireNonNull(issuer);
		return this;
	}

	public Max35Binary getSerialNumber() {
		return serialNumber;
	}

	public IssuerAndSerialNumber1 setSerialNumber(Max35Binary serialNumber) {
		this.serialNumber = Objects.requireNonNull(serialNumber);
		return this;
	}
}