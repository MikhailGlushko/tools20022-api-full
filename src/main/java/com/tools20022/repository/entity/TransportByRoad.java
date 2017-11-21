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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information related to the transportation of goods by road.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TransportByRoad" src="doc-files/TransportByRoad.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Transport
 * Transport}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransportByRoad1
 * TransportByRoad1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportByRoad3
 * TransportByRoad3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportByRoad2
 * TransportByRoad2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportByRoad4
 * TransportByRoad4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportByRoad5
 * TransportByRoad5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport1#mmTransportByRoad
 * SingleTransport1.mmTransportByRoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport4#mmTransportByRoad
 * SingleTransport4.mmTransportByRoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport2#mmTransportByRoad
 * SingleTransport2.mmTransportByRoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport5#mmTransportByRoad
 * SingleTransport5.mmTransportByRoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport3#mmTransportByRoad
 * SingleTransport3.mmTransportByRoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport6#mmTransportByRoad
 * SingleTransport6.mmTransportByRoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport7#mmTransportByRoad
 * SingleTransport7.mmTransportByRoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport8#mmTransportByRoad
 * SingleTransport8.mmTransportByRoad}</li>
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
 * "TransportByRoad"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the transportation of goods by road."</li>
 * </ul>
 */
public class TransportByRoad extends Transport {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransportByRoad";
				definition = "Information related to the transportation of goods by road.";
				derivationElement_lazy = () -> Arrays.asList(SingleTransport1.mmTransportByRoad, SingleTransport4.mmTransportByRoad, SingleTransport2.mmTransportByRoad, SingleTransport5.mmTransportByRoad,
						SingleTransport3.mmTransportByRoad, SingleTransport6.mmTransportByRoad, SingleTransport7.mmTransportByRoad, SingleTransport8.mmTransportByRoad);
				superType_lazy = () -> Transport.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(TransportByRoad1.mmObject(), TransportByRoad3.mmObject(), TransportByRoad2.mmObject(), TransportByRoad4.mmObject(), TransportByRoad5.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return TransportByRoad.class;
			}
		});
		return mmObject_lazy.get();
	}
}