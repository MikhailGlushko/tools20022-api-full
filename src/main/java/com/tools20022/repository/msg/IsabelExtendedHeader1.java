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
import com.tools20022.repository.datatype.BICFIIdentifier;
import com.tools20022.repository.datatype.Max3Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the extended parameters for an Isabel payment file.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelExtendedHeader1#mmSEPA
 * IsabelExtendedHeader1.mmSEPA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelExtendedHeader1#mmBPNFinancialInstitution
 * IsabelExtendedHeader1.mmBPNFinancialInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelExtendedHeader1#mmBICFinancialInstitution
 * IsabelExtendedHeader1.mmBICFinancialInstitution}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IsabelExtendedHeader1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the extended parameters for an Isabel payment file."
 * </li>
 * </ul>
 */
public class IsabelExtendedHeader1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected IsabelSEPAFile1 sEPA;
	/**
	 * SEPA related information for a payment file.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IsabelSEPAFile1
	 * IsabelSEPAFile1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelExtendedHeader1
	 * IsabelExtendedHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SEPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SEPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "SEPA related information for a payment file."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSEPA = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IsabelExtendedHeader1.mmObject();
			isDerived = false;
			xmlTag = "SEPA";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SEPA";
			definition = "SEPA related information for a payment file.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IsabelSEPAFile1.mmObject();
		}
	};
	protected Max3Text bPNFinancialInstitution;
	/**
	 * Belgian bank protocol number (BPN) of the receiving bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Text
	 * Max3Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelExtendedHeader1
	 * IsabelExtendedHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BPNFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BPNFinancialInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Belgian bank protocol number (BPN) of the receiving bank."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBPNFinancialInstitution = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelExtendedHeader1.mmObject();
			isDerived = false;
			xmlTag = "BPNFI";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BPNFinancialInstitution";
			definition = "Belgian bank protocol number (BPN) of the receiving bank.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}
	};
	protected BICFIIdentifier bICFinancialInstitution;
	/**
	 * Business identification code of the receiving bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICFIIdentifier
	 * BICFIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelExtendedHeader1
	 * IsabelExtendedHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BICFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BICFinancialInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Business identification code of the receiving bank."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBICFinancialInstitution = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelExtendedHeader1.mmObject();
			isDerived = false;
			xmlTag = "BICFI";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BICFinancialInstitution";
			definition = "Business identification code of the receiving bank.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICFIIdentifier.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IsabelExtendedHeader1.mmSEPA, com.tools20022.repository.msg.IsabelExtendedHeader1.mmBPNFinancialInstitution,
						com.tools20022.repository.msg.IsabelExtendedHeader1.mmBICFinancialInstitution);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelExtendedHeader1";
				definition = "Specifies the extended parameters for an Isabel payment file.";
			}
		});
		return mmObject_lazy.get();
	}

	public IsabelSEPAFile1 getSEPA() {
		return sEPA;
	}

	public void setSEPA(com.tools20022.repository.msg.IsabelSEPAFile1 sEPA) {
		this.sEPA = sEPA;
	}

	public Max3Text getBPNFinancialInstitution() {
		return bPNFinancialInstitution;
	}

	public void setBPNFinancialInstitution(Max3Text bPNFinancialInstitution) {
		this.bPNFinancialInstitution = bPNFinancialInstitution;
	}

	public BICFIIdentifier getBICFinancialInstitution() {
		return bICFinancialInstitution;
	}

	public void setBICFinancialInstitution(BICFIIdentifier bICFinancialInstitution) {
		this.bICFinancialInstitution = bICFinancialInstitution;
	}
}