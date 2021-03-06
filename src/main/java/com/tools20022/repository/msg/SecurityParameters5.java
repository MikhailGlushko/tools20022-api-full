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
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContentInformationType14;
import com.tools20022.repository.msg.CryptographicKey8;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Security parameters of the host downloading the key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityParameters5#mmHostChallenge
 * SecurityParameters5.mmHostChallenge}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityParameters5#mmKey
 * SecurityParameters5.mmKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityParameters5#mmDigitalSignature
 * SecurityParameters5.mmDigitalSignature}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityParameters5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Security parameters of the host downloading the key."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityParameters8
 * SecurityParameters8}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecurityParameters4
 * SecurityParameters4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityParameters5", propOrder = {"hostChallenge", "key", "digitalSignature"})
public class SecurityParameters5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "HstChllng")
	protected Max140Binary hostChallenge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max140Binary Max140Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters5
	 * SecurityParameters5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstChllng"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostChallenge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Random value from the host."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters8#mmHostChallenge
	 * SecurityParameters8.mmHostChallenge}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters4#mmATMChallenge
	 * SecurityParameters4.mmATMChallenge}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityParameters5, Optional<Max140Binary>> mmHostChallenge = new MMMessageAttribute<SecurityParameters5, Optional<Max140Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityParameters5.mmObject();
			isDerived = false;
			xmlTag = "HstChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostChallenge";
			definition = "Random value from the host.";
			nextVersions_lazy = () -> Arrays.asList(SecurityParameters8.mmHostChallenge);
			previousVersion_lazy = () -> SecurityParameters4.mmATMChallenge;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Optional<Max140Binary> getValue(SecurityParameters5 obj) {
			return obj.getHostChallenge();
		}

		@Override
		public void setValue(SecurityParameters5 obj, Optional<Max140Binary> value) {
			obj.setHostChallenge(value.orElse(null));
		}
	};
	@XmlElement(name = "Key")
	protected List<CryptographicKey8> key;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8
	 * CryptographicKey8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters5
	 * SecurityParameters5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Key"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Key"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cryptographic key used to store in the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityParameters8#mmKey
	 * SecurityParameters8.mmKey}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters4#mmKey
	 * SecurityParameters4.mmKey}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityParameters5, List<CryptographicKey8>> mmKey = new MMMessageAttribute<SecurityParameters5, List<CryptographicKey8>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityParameters5.mmObject();
			isDerived = false;
			xmlTag = "Key";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Key";
			definition = "Cryptographic key used to store in the ATM.";
			nextVersions_lazy = () -> Arrays.asList(SecurityParameters8.mmKey);
			previousVersion_lazy = () -> SecurityParameters4.mmKey;
			minOccurs = 0;
			complexType_lazy = () -> CryptographicKey8.mmObject();
		}

		@Override
		public List<CryptographicKey8> getValue(SecurityParameters5 obj) {
			return obj.getKey();
		}

		@Override
		public void setValue(SecurityParameters5 obj, List<CryptographicKey8> value) {
			obj.setKey(value);
		}
	};
	@XmlElement(name = "DgtlSgntr")
	protected ContentInformationType14 digitalSignature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType14
	 * ContentInformationType14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters5
	 * SecurityParameters5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgtlSgntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Digital signature of implicit data depending on the security scheme download procedure."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters4#mmDigitalSignature
	 * SecurityParameters4.mmDigitalSignature}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityParameters5, Optional<ContentInformationType14>> mmDigitalSignature = new MMMessageAssociationEnd<SecurityParameters5, Optional<ContentInformationType14>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityParameters5.mmObject();
			isDerived = false;
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Digital signature of implicit data depending on the security scheme download procedure.";
			previousVersion_lazy = () -> SecurityParameters4.mmDigitalSignature;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType14.mmObject();
		}

		@Override
		public Optional<ContentInformationType14> getValue(SecurityParameters5 obj) {
			return obj.getDigitalSignature();
		}

		@Override
		public void setValue(SecurityParameters5 obj, Optional<ContentInformationType14> value) {
			obj.setDigitalSignature(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityParameters5.mmHostChallenge, com.tools20022.repository.msg.SecurityParameters5.mmKey,
						com.tools20022.repository.msg.SecurityParameters5.mmDigitalSignature);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityParameters5";
				definition = "Security parameters of the host downloading the key.";
				nextVersions_lazy = () -> Arrays.asList(SecurityParameters8.mmObject());
				previousVersion_lazy = () -> SecurityParameters4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max140Binary> getHostChallenge() {
		return hostChallenge == null ? Optional.empty() : Optional.of(hostChallenge);
	}

	public SecurityParameters5 setHostChallenge(Max140Binary hostChallenge) {
		this.hostChallenge = hostChallenge;
		return this;
	}

	public List<CryptographicKey8> getKey() {
		return key == null ? key = new ArrayList<>() : key;
	}

	public SecurityParameters5 setKey(List<CryptographicKey8> key) {
		this.key = Objects.requireNonNull(key);
		return this;
	}

	public Optional<ContentInformationType14> getDigitalSignature() {
		return digitalSignature == null ? Optional.empty() : Optional.of(digitalSignature);
	}

	public SecurityParameters5 setDigitalSignature(ContentInformationType14 digitalSignature) {
		this.digitalSignature = digitalSignature;
		return this;
	}
}