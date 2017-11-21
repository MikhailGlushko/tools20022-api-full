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
import com.tools20022.repository.datatype.Max500Binary;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters associated to the MAC algorithm.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Parameter7#mmInitialisationVector
 * Parameter7.mmInitialisationVector}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Parameter7#mmBytePadding
 * Parameter7.mmBytePadding}</li>
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
 * "Parameter7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters associated to the MAC algorithm."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Parameter1
 * Parameter1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Parameter7", propOrder = {"initialisationVector", "bytePadding"})
public class Parameter7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max500Binary initialisationVector;
	/**
	 * Initialisation vector of a cipher block chaining (CBC) mode encryption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max500Binary Max500Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Parameter7
	 * Parameter7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Parameter1#mmInitialisationVector
	 * Parameter1.mmInitialisationVector}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInitialisationVector = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Parameter7.mmObject();
			isDerived = false;
			xmlTag = "InitlstnVctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialisationVector";
			definition = "Initialisation vector of a cipher block chaining (CBC) mode encryption.";
			previousVersion_lazy = () -> Parameter1.mmInitialisationVector;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Binary.mmObject();
		}
	};
	protected BytePadding1Code bytePadding;
	/**
	 * Byte padding for a cypher block chaining mode encryption, if the padding
	 * is not implicit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BytePadding1Code
	 * BytePadding1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Parameter7
	 * Parameter7}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmBytePadding = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Parameter7.mmObject();
			isDerived = false;
			xmlTag = "BPddg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BytePadding";
			definition = "Byte padding for a cypher block chaining mode encryption, if the padding is not implicit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BytePadding1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Parameter7.mmInitialisationVector, Parameter7.mmBytePadding);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Parameter7";
				definition = "Parameters associated to the MAC algorithm.";
				previousVersion_lazy = () -> Parameter1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "InitlstnVctr")
	public Max500Binary getInitialisationVector() {
		return initialisationVector;
	}

	public void setInitialisationVector(Max500Binary initialisationVector) {
		this.initialisationVector = initialisationVector;
	}

	@XmlElement(name = "BPddg")
	public BytePadding1Code getBytePadding() {
		return bytePadding;
	}

	public void setBytePadding(BytePadding1Code bytePadding) {
		this.bytePadding = bytePadding;
	}
}