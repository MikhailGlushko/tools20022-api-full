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
import com.tools20022.repository.choice.Recipient4Choice;
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Message authentication code (MAC), computed on the data to protect with an
 * encryption key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData4#mmVersion
 * AuthenticatedData4.mmVersion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData4#mmRecipient
 * AuthenticatedData4.mmRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4#mmMACAlgorithm
 * AuthenticatedData4.mmMACAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4#mmEncapsulatedContent
 * AuthenticatedData4.mmEncapsulatedContent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData4#mmMAC
 * AuthenticatedData4.mmMAC}</li>
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
 * "AuthenticatedData4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Message authentication code (MAC), computed on the data to protect with an encryption key."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AuthenticatedData3
 * AuthenticatedData3}</li>
 * </ul>
 */
public class AuthenticatedData4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Number version;
	/**
	 * Version of the data structure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4
	 * AuthenticatedData4}</li>
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
	 * definition} = "Version of the data structure."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData3#mmVersion
	 * AuthenticatedData3.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AuthenticatedData4.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the data structure.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AuthenticatedData3.mmVersion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected List<Recipient4Choice> recipient;
	/**
	 * Session key or protection key identification used by the recipient.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Recipient4Choice
	 * Recipient4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4
	 * AuthenticatedData4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rcpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Recipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Session key or protection key identification used by the recipient."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData3#mmRecipient
	 * AuthenticatedData3.mmRecipient}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRecipient = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AuthenticatedData4.mmObject();
			isDerived = false;
			xmlTag = "Rcpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recipient";
			definition = "Session key or protection key identification used by the recipient.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AuthenticatedData3.mmRecipient;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Recipient4Choice.mmObject();
		}
	};
	protected AlgorithmIdentification15 mACAlgorithm;
	/**
	 * Algorithm to compute message authentication code (MAC).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification15
	 * AlgorithmIdentification15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4
	 * AuthenticatedData4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MACAlgo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MACAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Algorithm to compute message authentication code (MAC)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData3#mmMACAlgorithm
	 * AuthenticatedData3.mmMACAlgorithm}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMACAlgorithm = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AuthenticatedData4.mmObject();
			isDerived = false;
			xmlTag = "MACAlgo";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACAlgorithm";
			definition = "Algorithm to compute message authentication code (MAC).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AuthenticatedData3.mmMACAlgorithm;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AlgorithmIdentification15.mmObject();
		}
	};
	protected EncapsulatedContent3 encapsulatedContent;
	/**
	 * Data to authenticate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EncapsulatedContent3
	 * EncapsulatedContent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4
	 * AuthenticatedData4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcpsltdCntt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncapsulatedContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data to authenticate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData3#mmEncapsulatedContent
	 * AuthenticatedData3.mmEncapsulatedContent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEncapsulatedContent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AuthenticatedData4.mmObject();
			isDerived = false;
			xmlTag = "NcpsltdCntt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncapsulatedContent";
			definition = "Data to authenticate.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AuthenticatedData3.mmEncapsulatedContent;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.EncapsulatedContent3.mmObject();
		}
	};
	protected Max140Binary mAC;
	/**
	 * Message authentication code value.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4
	 * AuthenticatedData4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message authentication code value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData3#mmMAC
	 * AuthenticatedData3.mmMAC}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMAC = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AuthenticatedData4.mmObject();
			isDerived = false;
			xmlTag = "MAC";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MAC";
			definition = "Message authentication code value.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AuthenticatedData3.mmMAC;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AuthenticatedData4.mmVersion, com.tools20022.repository.msg.AuthenticatedData4.mmRecipient,
						com.tools20022.repository.msg.AuthenticatedData4.mmMACAlgorithm, com.tools20022.repository.msg.AuthenticatedData4.mmEncapsulatedContent, com.tools20022.repository.msg.AuthenticatedData4.mmMAC);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AuthenticatedData4";
				definition = "Message authentication code (MAC), computed on the data to protect with an encryption key.";
				previousVersion_lazy = () -> AuthenticatedData3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Number getVersion() {
		return version;
	}

	public void setVersion(Number version) {
		this.version = version;
	}

	public List<Recipient4Choice> getRecipient() {
		return recipient;
	}

	public void setRecipient(List<Recipient4Choice> recipient) {
		this.recipient = recipient;
	}

	public AlgorithmIdentification15 getMACAlgorithm() {
		return mACAlgorithm;
	}

	public void setMACAlgorithm(com.tools20022.repository.msg.AlgorithmIdentification15 mACAlgorithm) {
		this.mACAlgorithm = mACAlgorithm;
	}

	public EncapsulatedContent3 getEncapsulatedContent() {
		return encapsulatedContent;
	}

	public void setEncapsulatedContent(com.tools20022.repository.msg.EncapsulatedContent3 encapsulatedContent) {
		this.encapsulatedContent = encapsulatedContent;
	}

	public Max140Binary getMAC() {
		return mAC;
	}

	public void setMAC(Max140Binary mAC) {
		this.mAC = mAC;
	}
}