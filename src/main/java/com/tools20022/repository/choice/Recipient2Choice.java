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
import com.tools20022.repository.msg.KEK2;
import com.tools20022.repository.msg.KeyTransport2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Transport key or key encryption key (KEK) for the recipient.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Recipient2Choice#mmKeyTransport
 * Recipient2Choice.mmKeyTransport}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Recipient2Choice#mmKEK
 * Recipient2Choice.mmKEK}</li>
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
 * "Recipient2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Transport key or key encryption key (KEK) for the recipient."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Recipient3Choice
 * Recipient3Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.Recipient1Choice
 * Recipient1Choice}</li>
 * </ul>
 */
public class Recipient2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected KeyTransport2 keyTransport;
	/**
	 * Encryption key using previously distributed asymmetric public key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KeyTransport2
	 * KeyTransport2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Recipient2Choice
	 * Recipient2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyTrnsprt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyTransport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Encryption key using previously distributed asymmetric public key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Recipient3Choice#mmKeyTransport
	 * Recipient3Choice.mmKeyTransport}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKeyTransport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Recipient2Choice.mmObject();
			isDerived = false;
			xmlTag = "KeyTrnsprt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyTransport";
			definition = "Encryption key using previously distributed asymmetric public key.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Recipient3Choice.mmKeyTransport);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> KeyTransport2.mmObject();
		}
	};
	protected KEK2 kEK;
	/**
	 * Encryption key using previously distributed symmetric key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KEK2 KEK2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Recipient2Choice
	 * Recipient2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KEK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KEK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Encryption key using previously distributed symmetric key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.Recipient3Choice#mmKEK
	 * Recipient3Choice.mmKEK}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKEK = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Recipient2Choice.mmObject();
			isDerived = false;
			xmlTag = "KEK";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KEK";
			definition = "Encryption key using previously distributed symmetric key.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Recipient3Choice.mmKEK);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> KEK2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Recipient2Choice.mmKeyTransport, com.tools20022.repository.choice.Recipient2Choice.mmKEK);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Recipient2Choice";
				definition = "Transport key or key encryption key (KEK) for the recipient.";
				nextVersions_lazy = () -> Arrays.asList(Recipient3Choice.mmObject());
				previousVersion_lazy = () -> Recipient1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public KeyTransport2 getKeyTransport() {
		return keyTransport;
	}

	public void setKeyTransport(KeyTransport2 keyTransport) {
		this.keyTransport = keyTransport;
	}

	public KEK2 getKEK() {
		return kEK;
	}

	public void setKEK(KEK2 kEK) {
		this.kEK = kEK;
	}
}