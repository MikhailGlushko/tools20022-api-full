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
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identification of partners involved in exchange from the merchant to the
 * issuer, with the relative timestamp of their exchanges.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Traceability1#mmRelayIdentification
 * Traceability1.mmRelayIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Traceability1#mmTraceDateTimeIn
 * Traceability1.mmTraceDateTimeIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Traceability1#mmTraceDateTimeOut
 * Traceability1.mmTraceDateTimeOut}</li>
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
 * "Traceability1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Traceability2 Traceability2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class Traceability1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification31 relayIdentification;
	/**
	 * Identification of a partner of a message exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification31
	 * GenericIdentification31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Traceability1 Traceability1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RlayId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelayIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a partner of a message exchange."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Traceability2#mmRelayIdentification
	 * Traceability2.mmRelayIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelayIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Traceability1.mmObject();
			isDerived = false;
			xmlTag = "RlayId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelayIdentification";
			definition = "Identification of a partner of a message exchange.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Traceability2.mmRelayIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification31.mmObject();
		}
	};
	protected ISODateTime traceDateTimeIn;
	/**
	 * Date and time of incoming data exchange for relaying or processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Traceability1 Traceability1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TracDtTmIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TraceDateTimeIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of incoming data exchange for relaying or processing."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Traceability2#mmTraceDateTimeIn
	 * Traceability2.mmTraceDateTimeIn}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTraceDateTimeIn = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Traceability1.mmObject();
			isDerived = false;
			xmlTag = "TracDtTmIn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TraceDateTimeIn";
			definition = "Date and time of incoming data exchange for relaying or processing.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Traceability2.mmTraceDateTimeIn);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime traceDateTimeOut;
	/**
	 * Date and time of the outgoing exchange for relaying or processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Traceability1 Traceability1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TracDtTmOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TraceDateTimeOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of the outgoing exchange for relaying or processing."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Traceability2#mmTraceDateTimeOut
	 * Traceability2.mmTraceDateTimeOut}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTraceDateTimeOut = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Traceability1.mmObject();
			isDerived = false;
			xmlTag = "TracDtTmOut";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TraceDateTimeOut";
			definition = "Date and time of the outgoing exchange for relaying or processing.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Traceability2.mmTraceDateTimeOut);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Traceability1.mmRelayIdentification, com.tools20022.repository.msg.Traceability1.mmTraceDateTimeIn,
						com.tools20022.repository.msg.Traceability1.mmTraceDateTimeOut);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Traceability1";
				definition = "Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges.";
				nextVersions_lazy = () -> Arrays.asList(Traceability2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification31 getRelayIdentification() {
		return relayIdentification;
	}

	public void setRelayIdentification(com.tools20022.repository.msg.GenericIdentification31 relayIdentification) {
		this.relayIdentification = relayIdentification;
	}

	public ISODateTime getTraceDateTimeIn() {
		return traceDateTimeIn;
	}

	public void setTraceDateTimeIn(ISODateTime traceDateTimeIn) {
		this.traceDateTimeIn = traceDateTimeIn;
	}

	public ISODateTime getTraceDateTimeOut() {
		return traceDateTimeOut;
	}

	public void setTraceDateTimeOut(ISODateTime traceDateTimeOut) {
		this.traceDateTimeOut = traceDateTimeOut;
	}
}