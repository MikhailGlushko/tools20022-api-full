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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IssuerAndSerialNumber1;
import com.tools20022.repository.msg.KEKIdentifier2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of a cryptographic asymmetric key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Recipient5Choice#mmIssuerAndSerialNumber
 * Recipient5Choice.mmIssuerAndSerialNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Recipient5Choice#mmKeyIdentifier
 * Recipient5Choice.mmKeyIdentifier}</li>
 * </ul>
 * </li>
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
 * "Recipient5Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a cryptographic asymmetric key."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.Recipient4Choice
 * Recipient4Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Recipient5Choice", propOrder = {"issuerAndSerialNumber", "keyIdentifier"})
public class Recipient5Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected IssuerAndSerialNumber1 issuerAndSerialNumber;
	/**
	 * Certificate issuer name and serial number (see ITU X.509).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IssuerAndSerialNumber1
	 * IssuerAndSerialNumber1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Recipient5Choice
	 * Recipient5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrAndSrlNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAndSerialNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate issuer name and serial number (see ITU X.509)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssuerAndSerialNumber = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Recipient5Choice.mmObject();
			isDerived = false;
			xmlTag = "IssrAndSrlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAndSerialNumber";
			definition = "Certificate issuer name and serial number (see ITU X.509).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IssuerAndSerialNumber1.mmObject();
		}
	};
	protected KEKIdentifier2 keyIdentifier;
	/**
	 * Identifier of a cryptographic asymmetric key, previously exchanged
	 * between initiator and recipient.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KEKIdentifier2
	 * KEKIdentifier2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Recipient5Choice
	 * Recipient5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of a cryptographic asymmetric key, previously exchanged between initiator and recipient."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Recipient4Choice#mmKeyIdentifier
	 * Recipient4Choice.mmKeyIdentifier}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKeyIdentifier = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Recipient5Choice.mmObject();
			isDerived = false;
			xmlTag = "KeyIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyIdentifier";
			definition = "Identifier of a cryptographic asymmetric key, previously exchanged between initiator and recipient.";
			previousVersion_lazy = () -> Recipient4Choice.mmKeyIdentifier;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> KEKIdentifier2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Recipient5Choice.mmIssuerAndSerialNumber, Recipient5Choice.mmKeyIdentifier);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Recipient5Choice";
				definition = "Identification of a cryptographic asymmetric key.";
				previousVersion_lazy = () -> Recipient4Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "IssrAndSrlNb", required = true)
	public IssuerAndSerialNumber1 getIssuerAndSerialNumber() {
		return issuerAndSerialNumber;
	}

	public void setIssuerAndSerialNumber(IssuerAndSerialNumber1 issuerAndSerialNumber) {
		this.issuerAndSerialNumber = issuerAndSerialNumber;
	}

	@XmlElement(name = "KeyIdr", required = true)
	public KEKIdentifier2 getKeyIdentifier() {
		return keyIdentifier;
	}

	public void setKeyIdentifier(KEKIdentifier2 keyIdentifier) {
		this.keyIdentifier = keyIdentifier;
	}
}