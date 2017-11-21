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
import com.tools20022.repository.entity.TransportPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Consignment2;
import com.tools20022.repository.msg.Consignment4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party responsible for dispatching the goods.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Consignor" src="doc-files/Consignor.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.TransportPartyRole
 * TransportPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment2#mmConsignor
 * Consignment2.mmConsignor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment4#mmConsignor
 * Consignment4.mmConsignor}</li>
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
 * "Consignor"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party responsible for dispatching the goods."</li>
 * </ul>
 */
public class Consignor extends TransportPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Consignor";
				definition = "Party responsible for dispatching the goods.";
				derivationElement_lazy = () -> Arrays.asList(Consignment2.mmConsignor, Consignment4.mmConsignor);
				superType_lazy = () -> TransportPartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return Consignor.class;
			}
		});
		return mmObject_lazy.get();
	}
}