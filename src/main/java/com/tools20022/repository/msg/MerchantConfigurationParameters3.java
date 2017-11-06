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
import com.tools20022.repository.codeset.TerminalManagementAction3Code;
import com.tools20022.repository.datatype.Max10000Binary;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Acceptor parameters dedicated to the merchant.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3#mmActionType
 * MerchantConfigurationParameters3.mmActionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3#mmMerchantIdentification
 * MerchantConfigurationParameters3.mmMerchantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3#mmVersion
 * MerchantConfigurationParameters3.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3#mmProxy
 * MerchantConfigurationParameters3.mmProxy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3#mmOtherParameters
 * MerchantConfigurationParameters3.mmOtherParameters}</li>
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
 * "MerchantConfigurationParameters3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Acceptor parameters dedicated to the merchant."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters2
 * MerchantConfigurationParameters2}</li>
 * </ul>
 */
public class MerchantConfigurationParameters3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TerminalManagementAction3Code actionType;
	/**
	 * Type of action for the configuration parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction3Code
	 * TerminalManagementAction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3
	 * MerchantConfigurationParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of action for the configuration parameters."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters2#mmActionType
	 * MerchantConfigurationParameters2.mmActionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MerchantConfigurationParameters3.mmObject();
			isDerived = false;
			xmlTag = "ActnTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionType";
			definition = "Type of action for the configuration parameters.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MerchantConfigurationParameters2.mmActionType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction3Code.mmObject();
		}
	};
	protected Max35Text merchantIdentification;
	/**
	 * Identification of the merchant for the MTM, if the POI manages several
	 * merchants.
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
	 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3
	 * MerchantConfigurationParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrchntId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the merchant for the MTM, if the POI manages several merchants."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters2#mmMerchantIdentification
	 * MerchantConfigurationParameters2.mmMerchantIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMerchantIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MerchantConfigurationParameters3.mmObject();
			isDerived = false;
			xmlTag = "MrchntId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantIdentification";
			definition = "Identification of the merchant for the MTM, if the POI manages several merchants.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MerchantConfigurationParameters2.mmMerchantIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max256Text version;
	/**
	 * Version of the merchant parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3
	 * MerchantConfigurationParameters3}</li>
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
	 * definition} = "Version of the merchant parameters."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters2#mmVersion
	 * MerchantConfigurationParameters2.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MerchantConfigurationParameters3.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the merchant parameters.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MerchantConfigurationParameters2.mmVersion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	protected NetworkParameters6 proxy;
	/**
	 * Local proxy configuration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetworkParameters6
	 * NetworkParameters6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3
	 * MerchantConfigurationParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prxy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proxy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Local proxy configuration."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters2#mmProxy
	 * MerchantConfigurationParameters2.mmProxy}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProxy = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MerchantConfigurationParameters3.mmObject();
			isDerived = false;
			xmlTag = "Prxy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proxy";
			definition = "Local proxy configuration.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MerchantConfigurationParameters2.mmProxy;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NetworkParameters6.mmObject();
		}
	};
	protected Max10000Binary otherParameters;
	/**
	 * Other merchant parameters.
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
	 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3
	 * MerchantConfigurationParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other merchant parameters."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters2#mmOtherParameters
	 * MerchantConfigurationParameters2.mmOtherParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherParameters = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MerchantConfigurationParameters3.mmObject();
			isDerived = false;
			xmlTag = "OthrParams";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherParameters";
			definition = "Other merchant parameters.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MerchantConfigurationParameters2.mmOtherParameters;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MerchantConfigurationParameters3.mmActionType, com.tools20022.repository.msg.MerchantConfigurationParameters3.mmMerchantIdentification,
						com.tools20022.repository.msg.MerchantConfigurationParameters3.mmVersion, com.tools20022.repository.msg.MerchantConfigurationParameters3.mmProxy,
						com.tools20022.repository.msg.MerchantConfigurationParameters3.mmOtherParameters);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MerchantConfigurationParameters3";
				definition = "Acceptor parameters dedicated to the merchant.";
				previousVersion_lazy = () -> MerchantConfigurationParameters2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TerminalManagementAction3Code getActionType() {
		return actionType;
	}

	public void setActionType(TerminalManagementAction3Code actionType) {
		this.actionType = actionType;
	}

	public Max35Text getMerchantIdentification() {
		return merchantIdentification;
	}

	public void setMerchantIdentification(Max35Text merchantIdentification) {
		this.merchantIdentification = merchantIdentification;
	}

	public Max256Text getVersion() {
		return version;
	}

	public void setVersion(Max256Text version) {
		this.version = version;
	}

	public NetworkParameters6 getProxy() {
		return proxy;
	}

	public void setProxy(com.tools20022.repository.msg.NetworkParameters6 proxy) {
		this.proxy = proxy;
	}

	public Max10000Binary getOtherParameters() {
		return otherParameters;
	}

	public void setOtherParameters(Max10000Binary otherParameters) {
		this.otherParameters = otherParameters;
	}
}