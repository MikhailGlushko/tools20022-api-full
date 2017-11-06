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
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Min5Max16Binary;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identification of a key encryption key (KEK), using previously distributed
 * symmetric key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.KEKIdentifier2#mmKeyIdentification
 * KEKIdentifier2.mmKeyIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.KEKIdentifier2#mmKeyVersion
 * KEKIdentifier2.mmKeyVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.KEKIdentifier2#mmSequenceNumber
 * KEKIdentifier2.mmSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.KEKIdentifier2#mmDerivationIdentification
 * KEKIdentifier2.mmDerivationIdentification}</li>
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
 * "KEKIdentifier2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of a key encryption key (KEK), using previously distributed symmetric key."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.KEKIdentifier3 KEKIdentifier3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.KEKIdentifier5 KEKIdentifier5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.KEKIdentifier1
 * KEKIdentifier1}</li>
 * </ul>
 */
public class KEKIdentifier2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max140Text keyIdentification;
	/**
	 * Identification of the cryptographic key.
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
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier2 KEKIdentifier2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the cryptographic key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier3#mmIdentification
	 * KEKIdentifier3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier5#mmKeyIdentification
	 * KEKIdentifier5.mmKeyIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier1#mmKeyIdentification
	 * KEKIdentifier1.mmKeyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmKeyIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> KEKIdentifier2.mmObject();
			isDerived = false;
			xmlTag = "KeyId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyIdentification";
			definition = "Identification of the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.KEKIdentifier3.mmIdentification, com.tools20022.repository.msg.KEKIdentifier5.mmKeyIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.msg.KEKIdentifier1.mmKeyIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Max140Text keyVersion;
	/**
	 * Version of the cryptographic key.
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
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier2 KEKIdentifier2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the cryptographic key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.KEKIdentifier3#mmVersion
	 * KEKIdentifier3.mmVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier5#mmKeyVersion
	 * KEKIdentifier5.mmKeyVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier1#mmKeyVersion
	 * KEKIdentifier1.mmKeyVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmKeyVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> KEKIdentifier2.mmObject();
			isDerived = false;
			xmlTag = "KeyVrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyVersion";
			definition = "Version of the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.KEKIdentifier3.mmVersion, com.tools20022.repository.msg.KEKIdentifier5.mmKeyVersion);
			previousVersion_lazy = () -> com.tools20022.repository.msg.KEKIdentifier1.mmKeyVersion;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Number sequenceNumber;
	/**
	 * Number of usages of the cryptographic key.
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
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier2 KEKIdentifier2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of usages of the cryptographic key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier5#mmSequenceNumber
	 * KEKIdentifier5.mmSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> KEKIdentifier2.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Number of usages of the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.KEKIdentifier5.mmSequenceNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Min5Max16Binary derivationIdentification;
	/**
	 * Identification used for derivation of a unique key from a master key
	 * provided for the data protection.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min5Max16Binary
	 * Min5Max16Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier2 KEKIdentifier2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivtnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification used for derivation of a unique key from a master key provided for the data protection."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier5#mmDerivationIdentification
	 * KEKIdentifier5.mmDerivationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier1#mmDerivationIdentification
	 * KEKIdentifier1.mmDerivationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDerivationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> KEKIdentifier2.mmObject();
			isDerived = false;
			xmlTag = "DerivtnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivationIdentification";
			definition = "Identification used for derivation of a unique key from a master key provided for the data protection.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.KEKIdentifier5.mmDerivationIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.msg.KEKIdentifier1.mmDerivationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min5Max16Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.KEKIdentifier2.mmKeyIdentification, com.tools20022.repository.msg.KEKIdentifier2.mmKeyVersion,
						com.tools20022.repository.msg.KEKIdentifier2.mmSequenceNumber, com.tools20022.repository.msg.KEKIdentifier2.mmDerivationIdentification);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "KEKIdentifier2";
				definition = "Identification of a key encryption key (KEK), using previously distributed symmetric key.";
				nextVersions_lazy = () -> Arrays.asList(KEKIdentifier3.mmObject(), KEKIdentifier5.mmObject());
				previousVersion_lazy = () -> KEKIdentifier1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max140Text getKeyIdentification() {
		return keyIdentification;
	}

	public void setKeyIdentification(Max140Text keyIdentification) {
		this.keyIdentification = keyIdentification;
	}

	public Max140Text getKeyVersion() {
		return keyVersion;
	}

	public void setKeyVersion(Max140Text keyVersion) {
		this.keyVersion = keyVersion;
	}

	public Number getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Number sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public Min5Max16Binary getDerivationIdentification() {
		return derivationIdentification;
	}

	public void setDerivationIdentification(Min5Max16Binary derivationIdentification) {
		this.derivationIdentification = derivationIdentification;
	}
}