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
import com.tools20022.repository.codeset.ATMServiceType3Code;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Inquiry service provided by the ATM inside the session.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService5#mmServiceReference
 * ATMService5.mmServiceReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService5#mmATMServiceCode
 * ATMService5.mmATMServiceCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService5#mmServiceType
 * ATMService5.mmServiceType}</li>
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
 * "ATMService5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Inquiry service provided by the ATM inside the session."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService7 ATMService7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService8 ATMService8}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ATMService3
 * ATMService3}</li>
 * </ul>
 */
public class ATMService5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text serviceReference;
	/**
	 * Unique identification of the withdrawal service provided by the ATM
	 * inside the session.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService5 ATMService5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the withdrawal service provided by the ATM inside the session."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMService8#mmServiceReference
	 * ATMService8.mmServiceReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMService3#mmServiceReference
	 * ATMService3.mmServiceReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService5.mmObject();
			isDerived = false;
			xmlTag = "SvcRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceReference";
			definition = "Unique identification of the withdrawal service provided by the ATM inside the session.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMService8.mmServiceReference);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMService3.mmServiceReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text aTMServiceCode;
	/**
	 * Codification of the type of service for the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService5 ATMService5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMSvcCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMServiceCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Codification of the type of service for the ATM."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMService8#mmATMServiceCode
	 * ATMService8.mmATMServiceCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMService3#mmATMServiceCode
	 * ATMService3.mmATMServiceCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmATMServiceCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService5.mmObject();
			isDerived = false;
			xmlTag = "ATMSvcCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMServiceCode";
			definition = "Codification of the type of service for the ATM.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMService8.mmATMServiceCode);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMService3.mmATMServiceCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ATMServiceType3Code serviceType;
	/**
	 * Describes the type of inquiry selected by the customer or the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType3Code
	 * ATMServiceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService5 ATMService5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the type of inquiry selected by the customer or the ATM."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMService7#mmServiceType
	 * ATMService7.mmServiceType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMService8#mmServiceType
	 * ATMService8.mmServiceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMService3#mmServiceType
	 * ATMService3.mmServiceType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService5.mmObject();
			isDerived = false;
			xmlTag = "SvcTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceType";
			definition = "Describes the type of inquiry selected by the customer or the ATM.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMService7.mmServiceType, com.tools20022.repository.msg.ATMService8.mmServiceType);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMService3.mmServiceType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMServiceType3Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMService5.mmServiceReference, com.tools20022.repository.msg.ATMService5.mmATMServiceCode, com.tools20022.repository.msg.ATMService5.mmServiceType);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMService5";
				definition = "Inquiry service provided by the ATM inside the session.";
				nextVersions_lazy = () -> Arrays.asList(ATMService7.mmObject(), ATMService8.mmObject());
				previousVersion_lazy = () -> ATMService3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getServiceReference() {
		return serviceReference;
	}

	public void setServiceReference(Max35Text serviceReference) {
		this.serviceReference = serviceReference;
	}

	public Max35Text getATMServiceCode() {
		return aTMServiceCode;
	}

	public void setATMServiceCode(Max35Text aTMServiceCode) {
		this.aTMServiceCode = aTMServiceCode;
	}

	public ATMServiceType3Code getServiceType() {
		return serviceType;
	}

	public void setServiceType(ATMServiceType3Code serviceType) {
		this.serviceType = serviceType;
	}
}