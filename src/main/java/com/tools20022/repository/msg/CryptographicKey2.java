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
import com.tools20022.repository.codeset.CryptographicKeyType2Code;
import com.tools20022.repository.codeset.KeyUsage1Code;
import com.tools20022.repository.datatype.Exact10Text;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Binary;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Cryptographic Key to exchange.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey2#mmIdentification
 * CryptographicKey2.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey2#mmAdditionalIdentification
 * CryptographicKey2.mmAdditionalIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey2#mmVersion
 * CryptographicKey2.mmVersion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey2#mmType
 * CryptographicKey2.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey2#mmFunction
 * CryptographicKey2.mmFunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey2#mmActivationDate
 * CryptographicKey2.mmActivationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey2#mmDeactivationDate
 * CryptographicKey2.mmDeactivationDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey2#mmKeyValue
 * CryptographicKey2.mmKeyValue}</li>
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
 * "CryptographicKey2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Cryptographic Key to exchange."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey3
 * CryptographicKey3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey4
 * CryptographicKey4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CryptographicKey1
 * CryptographicKey1}</li>
 * </ul>
 */
public class CryptographicKey2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max140Text identification;
	/**
	 * Name of the cryptographic key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey2
	 * CryptographicKey2}</li>
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
	 * definition} = "Name of the cryptographic key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey4#mmIdentification
	 * CryptographicKey4.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey2.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Name of the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CryptographicKey4.mmIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Max35Binary additionalIdentification;
	/**
	 * Additional identification of the key.<br>
	 * <b>Usage</b><br>
	 * For derived unique key per transaction (DUKPT) keys, the key serial
	 * number (KSN) with the 21 bits of the transaction counter set to zero.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Binary
	 * Max35Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey2
	 * CryptographicKey2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional identification of the key.\r\nUsage\r\nFor derived unique key per transaction (DUKPT) keys, the key serial number (KSN) with the 21 bits of the transaction counter set to zero."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey4#mmAdditionalIdentification
	 * CryptographicKey4.mmAdditionalIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey2.mmObject();
			isDerived = false;
			xmlTag = "AddtlId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalIdentification";
			definition = "Additional identification of the key.\r\nUsage\r\nFor derived unique key per transaction (DUKPT) keys, the key serial number (KSN) with the 21 bits of the transaction counter set to zero.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CryptographicKey4.mmAdditionalIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Binary.mmObject();
		}
	};
	protected Exact10Text version;
	/**
	 * Version of the cryptographic key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Exact10Text
	 * Exact10Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey2
	 * CryptographicKey2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the cryptographic key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey4#mmVersion
	 * CryptographicKey4.mmVersion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey2.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CryptographicKey4.mmVersion);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact10Text.mmObject();
		}
	};
	protected CryptographicKeyType2Code type;
	/**
	 * Type of algorithm used by the cryptographic key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType2Code
	 * CryptographicKeyType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey2
	 * CryptographicKey2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of algorithm used by the cryptographic key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey4#mmType
	 * CryptographicKey4.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of algorithm used by the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CryptographicKey4.mmType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CryptographicKeyType2Code.mmObject();
		}
	};
	protected List<KeyUsage1Code> function;
	/**
	 * Allowed usage of the key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey2
	 * CryptographicKey2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Function"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allowed usage of the key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey4#mmFunction
	 * CryptographicKey4.mmFunction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFunction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey2.mmObject();
			isDerived = false;
			xmlTag = "Fctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Function";
			definition = "Allowed usage of the key.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CryptographicKey4.mmFunction);
			minOccurs = 1;
			simpleType_lazy = () -> KeyUsage1Code.mmObject();
		}
	};
	protected ISODateTime activationDate;
	/**
	 * Date and time on which the key must be activated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey2
	 * CryptographicKey2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActvtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActivationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time on which the key must be activated."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey4#mmActivationDate
	 * CryptographicKey4.mmActivationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActivationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey2.mmObject();
			isDerived = false;
			xmlTag = "ActvtnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivationDate";
			definition = "Date and time on which the key must be activated.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CryptographicKey4.mmActivationDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime deactivationDate;
	/**
	 * Date and time on which the key must be deactivated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey2
	 * CryptographicKey2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DeactvtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeactivationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time on which the key must be deactivated."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey4#mmDeactivationDate
	 * CryptographicKey4.mmDeactivationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeactivationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CryptographicKey2.mmObject();
			isDerived = false;
			xmlTag = "DeactvtnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeactivationDate";
			definition = "Date and time on which the key must be deactivated.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CryptographicKey4.mmDeactivationDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ContentInformationType5 keyValue;
	/**
	 * Encrypted cryptographic key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType5
	 * ContentInformationType5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey2
	 * CryptographicKey2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted cryptographic key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey4#mmKeyValue
	 * CryptographicKey4.mmKeyValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKeyValue = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CryptographicKey2.mmObject();
			isDerived = false;
			xmlTag = "KeyVal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyValue";
			definition = "Encrypted cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CryptographicKey4.mmKeyValue);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CryptographicKey2.mmIdentification, com.tools20022.repository.msg.CryptographicKey2.mmAdditionalIdentification,
						com.tools20022.repository.msg.CryptographicKey2.mmVersion, com.tools20022.repository.msg.CryptographicKey2.mmType, com.tools20022.repository.msg.CryptographicKey2.mmFunction,
						com.tools20022.repository.msg.CryptographicKey2.mmActivationDate, com.tools20022.repository.msg.CryptographicKey2.mmDeactivationDate, com.tools20022.repository.msg.CryptographicKey2.mmKeyValue);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CryptographicKey2";
				definition = "Cryptographic Key to exchange.";
				nextVersions_lazy = () -> Arrays.asList(CryptographicKey3.mmObject(), CryptographicKey4.mmObject());
				previousVersion_lazy = () -> CryptographicKey1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max140Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max140Text identification) {
		this.identification = identification;
	}

	public Max35Binary getAdditionalIdentification() {
		return additionalIdentification;
	}

	public void setAdditionalIdentification(Max35Binary additionalIdentification) {
		this.additionalIdentification = additionalIdentification;
	}

	public Exact10Text getVersion() {
		return version;
	}

	public void setVersion(Exact10Text version) {
		this.version = version;
	}

	public CryptographicKeyType2Code getType() {
		return type;
	}

	public void setType(CryptographicKeyType2Code type) {
		this.type = type;
	}

	public List<KeyUsage1Code> getFunction() {
		return function;
	}

	public void setFunction(List<KeyUsage1Code> function) {
		this.function = function;
	}

	public ISODateTime getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(ISODateTime activationDate) {
		this.activationDate = activationDate;
	}

	public ISODateTime getDeactivationDate() {
		return deactivationDate;
	}

	public void setDeactivationDate(ISODateTime deactivationDate) {
		this.deactivationDate = deactivationDate;
	}

	public ContentInformationType5 getKeyValue() {
		return keyValue;
	}

	public void setKeyValue(com.tools20022.repository.msg.ContentInformationType5 keyValue) {
		this.keyValue = keyValue;
	}
}