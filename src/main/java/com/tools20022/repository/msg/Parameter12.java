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
import com.tools20022.repository.codeset.BytePadding1Code;
import com.tools20022.repository.codeset.EncryptionFormat2Code;
import com.tools20022.repository.datatype.Max500Binary;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters associated to a cryptographic encryption algorithm.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Parameter12#mmEncryptionFormat
 * Parameter12.mmEncryptionFormat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Parameter12#mmInitialisationVector
 * Parameter12.mmInitialisationVector}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Parameter12#mmBytePadding
 * Parameter12.mmBytePadding}</li>
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
 * "Parameter12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parameters associated to a cryptographic encryption algorithm."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Parameter6
 * Parameter6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Parameter12", propOrder = {"encryptionFormat", "initialisationVector", "bytePadding"})
public class Parameter12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NcrptnFrmt")
	protected EncryptionFormat2Code encryptionFormat;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EncryptionFormat2Code
	 * EncryptionFormat2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Parameter12 Parameter12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcrptnFrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncryptionFormat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Format of data before encryption, if the format is not plaintext or implicit."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Parameter6#mmEncryptionFormat
	 * Parameter6.mmEncryptionFormat}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Parameter12, Optional<EncryptionFormat2Code>> mmEncryptionFormat = new MMMessageAttribute<Parameter12, Optional<EncryptionFormat2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Parameter12.mmObject();
			isDerived = false;
			xmlTag = "NcrptnFrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptionFormat";
			definition = "Format of data before encryption, if the format is not plaintext or implicit.";
			previousVersion_lazy = () -> Parameter6.mmEncryptionFormat;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EncryptionFormat2Code.mmObject();
		}

		@Override
		public Optional<EncryptionFormat2Code> getValue(Parameter12 obj) {
			return obj.getEncryptionFormat();
		}

		@Override
		public void setValue(Parameter12 obj, Optional<EncryptionFormat2Code> value) {
			obj.setEncryptionFormat(value.orElse(null));
		}
	};
	@XmlElement(name = "InitlstnVctr")
	protected Max500Binary initialisationVector;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max500Binary Max500Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Parameter12 Parameter12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitlstnVctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialisationVector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Initialisation vector of a cipher block chaining (CBC) mode encryption."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Parameter6#mmInitialisationVector
	 * Parameter6.mmInitialisationVector}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Parameter12, Optional<Max500Binary>> mmInitialisationVector = new MMMessageAttribute<Parameter12, Optional<Max500Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Parameter12.mmObject();
			isDerived = false;
			xmlTag = "InitlstnVctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialisationVector";
			definition = "Initialisation vector of a cipher block chaining (CBC) mode encryption.";
			previousVersion_lazy = () -> Parameter6.mmInitialisationVector;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Binary.mmObject();
		}

		@Override
		public Optional<Max500Binary> getValue(Parameter12 obj) {
			return obj.getInitialisationVector();
		}

		@Override
		public void setValue(Parameter12 obj, Optional<Max500Binary> value) {
			obj.setInitialisationVector(value.orElse(null));
		}
	};
	@XmlElement(name = "BPddg")
	protected BytePadding1Code bytePadding;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BytePadding1Code
	 * BytePadding1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Parameter12 Parameter12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BPddg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BytePadding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Byte padding for a cypher block chaining mode encryption, if the padding is not implicit."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Parameter6#mmBytePadding
	 * Parameter6.mmBytePadding}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Parameter12, Optional<BytePadding1Code>> mmBytePadding = new MMMessageAttribute<Parameter12, Optional<BytePadding1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Parameter12.mmObject();
			isDerived = false;
			xmlTag = "BPddg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BytePadding";
			definition = "Byte padding for a cypher block chaining mode encryption, if the padding is not implicit.";
			previousVersion_lazy = () -> Parameter6.mmBytePadding;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BytePadding1Code.mmObject();
		}

		@Override
		public Optional<BytePadding1Code> getValue(Parameter12 obj) {
			return obj.getBytePadding();
		}

		@Override
		public void setValue(Parameter12 obj, Optional<BytePadding1Code> value) {
			obj.setBytePadding(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Parameter12.mmEncryptionFormat, com.tools20022.repository.msg.Parameter12.mmInitialisationVector,
						com.tools20022.repository.msg.Parameter12.mmBytePadding);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Parameter12";
				definition = "Parameters associated to a cryptographic encryption algorithm.";
				previousVersion_lazy = () -> Parameter6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<EncryptionFormat2Code> getEncryptionFormat() {
		return encryptionFormat == null ? Optional.empty() : Optional.of(encryptionFormat);
	}

	public Parameter12 setEncryptionFormat(EncryptionFormat2Code encryptionFormat) {
		this.encryptionFormat = encryptionFormat;
		return this;
	}

	public Optional<Max500Binary> getInitialisationVector() {
		return initialisationVector == null ? Optional.empty() : Optional.of(initialisationVector);
	}

	public Parameter12 setInitialisationVector(Max500Binary initialisationVector) {
		this.initialisationVector = initialisationVector;
		return this;
	}

	public Optional<BytePadding1Code> getBytePadding() {
		return bytePadding == null ? Optional.empty() : Optional.of(bytePadding);
	}

	public Parameter12 setBytePadding(BytePadding1Code bytePadding) {
		this.bytePadding = bytePadding;
		return this;
	}
}