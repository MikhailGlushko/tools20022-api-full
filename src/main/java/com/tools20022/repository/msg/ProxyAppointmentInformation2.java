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
import com.tools20022.repository.choice.DateFormat2Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.ProxyAppointmentCondition;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Indicates how to register a proxy.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2#mmRegistrationMethod
 * ProxyAppointmentInformation2.mmRegistrationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2#mmDeadline
 * ProxyAppointmentInformation2.mmDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2#mmSTPDeadline
 * ProxyAppointmentInformation2.mmSTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2#mmMarketDeadline
 * ProxyAppointmentInformation2.mmMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2#mmAuthorisedProxy
 * ProxyAppointmentInformation2.mmAuthorisedProxy}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition
 * ProxyAppointmentCondition}</li>
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
 * "ProxyAppointmentInformation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates how to register a proxy."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3
 * ProxyAppointmentInformation3}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class ProxyAppointmentInformation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text registrationMethod;
	/**
	 * Indicates how to register a proxy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#mmRegistrationMethod
	 * ProxyAppointmentCondition.mmRegistrationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2
	 * ProxyAppointmentInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates how to register a proxy."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3#mmRegistrationMethod
	 * ProxyAppointmentInformation3.mmRegistrationMethod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ProxyAppointmentCondition.mmRegistrationMethod;
			componentContext_lazy = () -> ProxyAppointmentInformation2.mmObject();
			isDerived = false;
			xmlTag = "RegnMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationMethod";
			definition = "Indicates how to register a proxy.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProxyAppointmentInformation3.mmRegistrationMethod);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected DateFormat2Choice deadline;
	/**
	 * Date by which the information on proxy assignment must be received by the
	 * intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2
	 * ProxyAppointmentInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ddln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the information on proxy assignment must be received by the intermediary."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3#mmDeadline
	 * ProxyAppointmentInformation3.mmDeadline}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeadline = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ProxyAppointmentInformation2.mmObject();
			isDerived = false;
			xmlTag = "Ddln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deadline";
			definition = "Date by which the information on proxy assignment must be received by the intermediary.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProxyAppointmentInformation3.mmDeadline);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	protected DateFormat2Choice sTPDeadline;
	/**
	 * Date by which the information on proxy assignment must be received by the
	 * intermediary (STP mode).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2
	 * ProxyAppointmentInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "STPDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "STPDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the information on proxy assignment must be received by the intermediary (STP mode)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3#mmSTPDeadline
	 * ProxyAppointmentInformation3.mmSTPDeadline}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSTPDeadline = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ProxyAppointmentInformation2.mmObject();
			isDerived = false;
			xmlTag = "STPDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "STPDeadline";
			definition = "Date by which the information on proxy assignment must be received by the intermediary (STP mode).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProxyAppointmentInformation3.mmSTPDeadline);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	protected DateFormat2Choice marketDeadline;
	/**
	 * Date by which the information on proxy assignment must be received by the
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2
	 * ProxyAppointmentInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the information on proxy assignment must be received by the issuer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3#mmMarketDeadline
	 * ProxyAppointmentInformation3.mmMarketDeadline}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Deadline.mmMarketDeadline;
			componentContext_lazy = () -> ProxyAppointmentInformation2.mmObject();
			isDerived = false;
			xmlTag = "MktDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadline";
			definition = "Date by which the information on proxy assignment must be received by the issuer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProxyAppointmentInformation3.mmMarketDeadline);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Proxy3> authorisedProxy;
	/**
	 * Specifies the proxy persons which are authorised by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Proxy3 Proxy3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2
	 * ProxyAppointmentInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthrsdPrxy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedProxy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the proxy persons which are authorised by the issuer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3#mmAuthorisedProxy
	 * ProxyAppointmentInformation3.mmAuthorisedProxy}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthorisedProxy = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ProxyAppointmentInformation2.mmObject();
			isDerived = false;
			xmlTag = "AuthrsdPrxy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedProxy";
			definition = "Specifies the proxy persons which are authorised by the issuer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProxyAppointmentInformation3.mmAuthorisedProxy);
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Proxy3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProxyAppointmentInformation2.mmRegistrationMethod, com.tools20022.repository.msg.ProxyAppointmentInformation2.mmDeadline,
						com.tools20022.repository.msg.ProxyAppointmentInformation2.mmSTPDeadline, com.tools20022.repository.msg.ProxyAppointmentInformation2.mmMarketDeadline,
						com.tools20022.repository.msg.ProxyAppointmentInformation2.mmAuthorisedProxy);
				trace_lazy = () -> ProxyAppointmentCondition.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProxyAppointmentInformation2";
				definition = "Indicates how to register a proxy.";
				nextVersions_lazy = () -> Arrays.asList(ProxyAppointmentInformation3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getRegistrationMethod() {
		return registrationMethod;
	}

	public void setRegistrationMethod(Max350Text registrationMethod) {
		this.registrationMethod = registrationMethod;
	}

	public DateFormat2Choice getDeadline() {
		return deadline;
	}

	public void setDeadline(DateFormat2Choice deadline) {
		this.deadline = deadline;
	}

	public DateFormat2Choice getSTPDeadline() {
		return sTPDeadline;
	}

	public void setSTPDeadline(DateFormat2Choice sTPDeadline) {
		this.sTPDeadline = sTPDeadline;
	}

	public DateFormat2Choice getMarketDeadline() {
		return marketDeadline;
	}

	public void setMarketDeadline(DateFormat2Choice marketDeadline) {
		this.marketDeadline = marketDeadline;
	}

	public List<Proxy3> getAuthorisedProxy() {
		return authorisedProxy;
	}

	public void setAuthorisedProxy(List<com.tools20022.repository.msg.Proxy3> authorisedProxy) {
		this.authorisedProxy = authorisedProxy;
	}
}