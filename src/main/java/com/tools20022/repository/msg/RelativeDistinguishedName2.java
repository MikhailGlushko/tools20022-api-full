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
import com.tools20022.repository.codeset.AttributeType2Code;
import com.tools20022.repository.datatype.Max140Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Attribute of the certificate service to be put in the certificate extensions,
 * or to be used for the request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RelativeDistinguishedName2#mmAttributeType
 * RelativeDistinguishedName2.mmAttributeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RelativeDistinguishedName2#mmAttributeValue
 * RelativeDistinguishedName2.mmAttributeValue}</li>
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
 * "RelativeDistinguishedName2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Attribute of the certificate service to be put in the certificate extensions, or to be used for the request."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.RelativeDistinguishedName1
 * RelativeDistinguishedName1}</li>
 * </ul>
 */
public class RelativeDistinguishedName2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AttributeType2Code attributeType;
	/**
	 * Type of attribute of a distinguished name (see X.500).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AttributeType2Code
	 * AttributeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RelativeDistinguishedName2
	 * RelativeDistinguishedName2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttributeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of attribute of a distinguished name (see X.500)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RelativeDistinguishedName1#mmAttributeType
	 * RelativeDistinguishedName1.mmAttributeType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAttributeType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RelativeDistinguishedName2.mmObject();
			isDerived = false;
			xmlTag = "AttrTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttributeType";
			definition = "Type of attribute of a distinguished name (see X.500).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RelativeDistinguishedName1.mmAttributeType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AttributeType2Code.mmObject();
		}
	};
	protected Max140Text attributeValue;
	/**
	 * Value of the attribute of a distinguished name (see X.500).
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
	 * {@linkplain com.tools20022.repository.msg.RelativeDistinguishedName2
	 * RelativeDistinguishedName2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttrVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttributeValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the attribute of a distinguished name (see X.500)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RelativeDistinguishedName1#mmAttributeValue
	 * RelativeDistinguishedName1.mmAttributeValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAttributeValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RelativeDistinguishedName2.mmObject();
			isDerived = false;
			xmlTag = "AttrVal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttributeValue";
			definition = "Value of the attribute of a distinguished name (see X.500).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RelativeDistinguishedName1.mmAttributeValue;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RelativeDistinguishedName2.mmAttributeType, com.tools20022.repository.msg.RelativeDistinguishedName2.mmAttributeValue);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RelativeDistinguishedName2";
				definition = "Attribute of the certificate service to be put in the certificate extensions, or to be used for the request.";
				previousVersion_lazy = () -> RelativeDistinguishedName1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public AttributeType2Code getAttributeType() {
		return attributeType;
	}

	public void setAttributeType(AttributeType2Code attributeType) {
		this.attributeType = attributeType;
	}

	public Max140Text getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(Max140Text attributeValue) {
		this.attributeValue = attributeValue;
	}
}