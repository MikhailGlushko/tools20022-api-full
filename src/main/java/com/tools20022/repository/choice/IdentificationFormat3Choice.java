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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.datatype.Exact3UpperCaseAlphaNumericText;
import com.tools20022.repository.datatype.Max30Text;
import com.tools20022.repository.msg.GenericIdentification36;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice between either a short, long or a proprietary identification format.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationFormat3Choice#mmShortIdentification
 * IdentificationFormat3Choice.mmShortIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationFormat3Choice#mmLongIdentification
 * IdentificationFormat3Choice.mmLongIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationFormat3Choice#mmProprietaryIdentification
 * IdentificationFormat3Choice.mmProprietaryIdentification}</li>
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
 * "IdentificationFormat3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between either a short, long or a proprietary identification format."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.IdentificationFormat1Choice
 * IdentificationFormat1Choice}</li>
 * </ul>
 */
public class IdentificationFormat3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Exact3UpperCaseAlphaNumericText shortIdentification;
	/**
	 * Format expressed as a short identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3UpperCaseAlphaNumericText
	 * Exact3UpperCaseAlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationFormat3Choice
	 * IdentificationFormat3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Format expressed as a short identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationFormat1Choice#mmShortIdentification
	 * IdentificationFormat1Choice.mmShortIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShortIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IdentificationFormat3Choice.mmObject();
			isDerived = false;
			xmlTag = "ShrtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortIdentification";
			definition = "Format expressed as a short identification.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.IdentificationFormat1Choice.mmShortIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3UpperCaseAlphaNumericText.mmObject();
		}
	};
	protected Max30Text longIdentification;
	/**
	 * Format expressed as a long identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max30Text
	 * Max30Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationFormat3Choice
	 * IdentificationFormat3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LngId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Format expressed as a long identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationFormat1Choice#mmLongIdentification
	 * IdentificationFormat1Choice.mmLongIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLongIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IdentificationFormat3Choice.mmObject();
			isDerived = false;
			xmlTag = "LngId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongIdentification";
			definition = "Format expressed as a long identification.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.IdentificationFormat1Choice.mmLongIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max30Text.mmObject();
		}
	};
	protected GenericIdentification36 proprietaryIdentification;
	/**
	 * Format expressed as a proprietary identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification36
	 * GenericIdentification36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationFormat3Choice
	 * IdentificationFormat3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Format expressed as a proprietary identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationFormat1Choice#mmProprietaryIdentification
	 * IdentificationFormat1Choice.mmProprietaryIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietaryIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IdentificationFormat3Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Format expressed as a proprietary identification.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.IdentificationFormat1Choice.mmProprietaryIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification36.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IdentificationFormat3Choice.mmShortIdentification, com.tools20022.repository.choice.IdentificationFormat3Choice.mmLongIdentification,
						com.tools20022.repository.choice.IdentificationFormat3Choice.mmProprietaryIdentification);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IdentificationFormat3Choice";
				definition = "Choice between either a short, long or a proprietary identification format.";
				previousVersion_lazy = () -> IdentificationFormat1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Exact3UpperCaseAlphaNumericText getShortIdentification() {
		return shortIdentification;
	}

	public void setShortIdentification(Exact3UpperCaseAlphaNumericText shortIdentification) {
		this.shortIdentification = shortIdentification;
	}

	public Max30Text getLongIdentification() {
		return longIdentification;
	}

	public void setLongIdentification(Max30Text longIdentification) {
		this.longIdentification = longIdentification;
	}

	public GenericIdentification36 getProprietaryIdentification() {
		return proprietaryIdentification;
	}

	public void setProprietaryIdentification(GenericIdentification36 proprietaryIdentification) {
		this.proprietaryIdentification = proprietaryIdentification;
	}
}