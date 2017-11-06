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
import com.tools20022.repository.codeset.ContentType1Code;
import com.tools20022.repository.datatype.Max10000Binary;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Encrypted data with an encryption key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EncryptedContent2#mmContentType
 * EncryptedContent2.mmContentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EncryptedContent2#mmContentEncryptionAlgorithm
 * EncryptedContent2.mmContentEncryptionAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EncryptedContent2#mmEncryptedData
 * EncryptedContent2.mmEncryptedData}</li>
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
 * "EncryptedContent2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Encrypted data with an encryption key."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EncryptedContent3
 * EncryptedContent3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.EncryptedContent1
 * EncryptedContent1}</li>
 * </ul>
 */
public class EncryptedContent2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ContentType1Code contentType;
	/**
	 * Type of data which have been encrypted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType1Code
	 * ContentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EncryptedContent2
	 * EncryptedContent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnttTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of data which have been encrypted."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EncryptedContent3#mmContentType
	 * EncryptedContent3.mmContentType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContentType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EncryptedContent2.mmObject();
			isDerived = false;
			xmlTag = "CnttTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentType";
			definition = "Type of data which have been encrypted.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EncryptedContent3.mmContentType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ContentType1Code.mmObject();
		}
	};
	protected AlgorithmIdentification6 contentEncryptionAlgorithm;
	/**
	 * Algorithm used to encrypt the data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification6
	 * AlgorithmIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EncryptedContent2
	 * EncryptedContent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnttNcrptnAlgo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContentEncryptionAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Algorithm used to encrypt the data."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EncryptedContent3#mmContentEncryptionAlgorithm
	 * EncryptedContent3.mmContentEncryptionAlgorithm}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmContentEncryptionAlgorithm = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EncryptedContent2.mmObject();
			isDerived = false;
			xmlTag = "CnttNcrptnAlgo";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentEncryptionAlgorithm";
			definition = "Algorithm used to encrypt the data.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EncryptedContent3.mmContentEncryptionAlgorithm);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AlgorithmIdentification6.mmObject();
		}
	};
	protected Max10000Binary encryptedData;
	/**
	 * Encrypted data, result of the content encryption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EncryptedContent2
	 * EncryptedContent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcrptdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncryptedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted data, result of the content encryption."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EncryptedContent3#mmEncryptedData
	 * EncryptedContent3.mmEncryptedData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEncryptedData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EncryptedContent2.mmObject();
			isDerived = false;
			xmlTag = "NcrptdData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptedData";
			definition = "Encrypted data, result of the content encryption.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EncryptedContent3.mmEncryptedData);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EncryptedContent2.mmContentType, com.tools20022.repository.msg.EncryptedContent2.mmContentEncryptionAlgorithm,
						com.tools20022.repository.msg.EncryptedContent2.mmEncryptedData);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EncryptedContent2";
				definition = "Encrypted data with an encryption key.";
				nextVersions_lazy = () -> Arrays.asList(EncryptedContent3.mmObject());
				previousVersion_lazy = () -> EncryptedContent1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ContentType1Code getContentType() {
		return contentType;
	}

	public void setContentType(ContentType1Code contentType) {
		this.contentType = contentType;
	}

	public AlgorithmIdentification6 getContentEncryptionAlgorithm() {
		return contentEncryptionAlgorithm;
	}

	public void setContentEncryptionAlgorithm(com.tools20022.repository.msg.AlgorithmIdentification6 contentEncryptionAlgorithm) {
		this.contentEncryptionAlgorithm = contentEncryptionAlgorithm;
	}

	public Max10000Binary getEncryptedData() {
		return encryptedData;
	}

	public void setEncryptedData(Max10000Binary encryptedData) {
		this.encryptedData = encryptedData;
	}
}