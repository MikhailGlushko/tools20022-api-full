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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CryptographicKey4;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Point of interaction parameters related to the security of software
 * application and application protocol.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityParameters2#mmPOIChallenge
 * SecurityParameters2.mmPOIChallenge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityParameters2#mmTMChallenge
 * SecurityParameters2.mmTMChallenge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityParameters2#mmSymmetricKey
 * SecurityParameters2.mmSymmetricKey}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityParameters2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Point of interaction parameters related to the security of software application and application protocol."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityParameters3
 * SecurityParameters3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecurityParameters1
 * SecurityParameters1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityParameters2", propOrder = {"pOIChallenge", "tMChallenge", "symmetricKey"})
public class SecurityParameters2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "POIChllng")
	protected Max140Binary pOIChallenge;
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
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters2
	 * SecurityParameters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIChllng"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIChallenge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point of interaction challenge for cryptographic key injection."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters3#mmPOIChallenge
	 * SecurityParameters3.mmPOIChallenge}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters1#mmPOIChallenge
	 * SecurityParameters1.mmPOIChallenge}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityParameters2, Optional<Max140Binary>> mmPOIChallenge = new MMMessageAttribute<SecurityParameters2, Optional<Max140Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityParameters2.mmObject();
			isDerived = false;
			xmlTag = "POIChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIChallenge";
			definition = "Point of interaction challenge for cryptographic key injection.";
			nextVersions_lazy = () -> Arrays.asList(SecurityParameters3.mmPOIChallenge);
			previousVersion_lazy = () -> SecurityParameters1.mmPOIChallenge;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Optional<Max140Binary> getValue(SecurityParameters2 obj) {
			return obj.getPOIChallenge();
		}

		@Override
		public void setValue(SecurityParameters2 obj, Optional<Max140Binary> value) {
			obj.setPOIChallenge(value.orElse(null));
		}
	};
	@XmlElement(name = "TMChllng")
	protected Max140Binary tMChallenge;
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
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters2
	 * SecurityParameters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMChllng"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMChallenge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal manager challenge for cryptographic key injection."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters3#mmTMChallenge
	 * SecurityParameters3.mmTMChallenge}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters1#mmTMChallenge
	 * SecurityParameters1.mmTMChallenge}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityParameters2, Optional<Max140Binary>> mmTMChallenge = new MMMessageAttribute<SecurityParameters2, Optional<Max140Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityParameters2.mmObject();
			isDerived = false;
			xmlTag = "TMChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMChallenge";
			definition = "Terminal manager challenge for cryptographic key injection.";
			nextVersions_lazy = () -> Arrays.asList(SecurityParameters3.mmTMChallenge);
			previousVersion_lazy = () -> SecurityParameters1.mmTMChallenge;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Optional<Max140Binary> getValue(SecurityParameters2 obj) {
			return obj.getTMChallenge();
		}

		@Override
		public void setValue(SecurityParameters2 obj, Optional<Max140Binary> value) {
			obj.setTMChallenge(value.orElse(null));
		}
	};
	@XmlElement(name = "SmmtrcKey")
	protected List<CryptographicKey4> symmetricKey;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey4
	 * CryptographicKey4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters2
	 * SecurityParameters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SmmtrcKey"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SymmetricKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key to inject in the point of interaction, protected by the temporary key previously sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters3#mmSymmetricKey
	 * SecurityParameters3.mmSymmetricKey}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters1#mmSymmetricKey
	 * SecurityParameters1.mmSymmetricKey}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityParameters2, List<CryptographicKey4>> mmSymmetricKey = new MMMessageAttribute<SecurityParameters2, List<CryptographicKey4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityParameters2.mmObject();
			isDerived = false;
			xmlTag = "SmmtrcKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SymmetricKey";
			definition = "Key to inject in the point of interaction, protected by the temporary key previously sent.";
			nextVersions_lazy = () -> Arrays.asList(SecurityParameters3.mmSymmetricKey);
			previousVersion_lazy = () -> SecurityParameters1.mmSymmetricKey;
			minOccurs = 0;
			complexType_lazy = () -> CryptographicKey4.mmObject();
		}

		@Override
		public List<CryptographicKey4> getValue(SecurityParameters2 obj) {
			return obj.getSymmetricKey();
		}

		@Override
		public void setValue(SecurityParameters2 obj, List<CryptographicKey4> value) {
			obj.setSymmetricKey(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityParameters2.mmPOIChallenge, com.tools20022.repository.msg.SecurityParameters2.mmTMChallenge,
						com.tools20022.repository.msg.SecurityParameters2.mmSymmetricKey);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityParameters2";
				definition = "Point of interaction parameters related to the security of software application and application protocol.";
				nextVersions_lazy = () -> Arrays.asList(SecurityParameters3.mmObject());
				previousVersion_lazy = () -> SecurityParameters1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max140Binary> getPOIChallenge() {
		return pOIChallenge == null ? Optional.empty() : Optional.of(pOIChallenge);
	}

	public SecurityParameters2 setPOIChallenge(Max140Binary pOIChallenge) {
		this.pOIChallenge = pOIChallenge;
		return this;
	}

	public Optional<Max140Binary> getTMChallenge() {
		return tMChallenge == null ? Optional.empty() : Optional.of(tMChallenge);
	}

	public SecurityParameters2 setTMChallenge(Max140Binary tMChallenge) {
		this.tMChallenge = tMChallenge;
		return this;
	}

	public List<CryptographicKey4> getSymmetricKey() {
		return symmetricKey == null ? symmetricKey = new ArrayList<>() : symmetricKey;
	}

	public SecurityParameters2 setSymmetricKey(List<CryptographicKey4> symmetricKey) {
		this.symmetricKey = Objects.requireNonNull(symmetricKey);
		return this;
	}
}