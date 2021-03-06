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
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Legal process whereby the debtor pays another party than the creditor to
 * settle a debt due by the creditor to that other party.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Garnishment" src="doc-files/Garnishment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.PaymentObligation
 * PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmGarnishmentRemittance
 * StructuredRemittanceInformation10.mmGarnishmentRemittance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#mmGarnishmentRemittance
 * StructuredRemittanceInformation12.mmGarnishmentRemittance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmGarnishmentRemittance
 * StructuredRemittanceInformation13.mmGarnishmentRemittance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15#mmGarnishmentRemittance
 * StructuredRemittanceInformation15.mmGarnishmentRemittance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Garnishment1 Garnishment1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Garnishment2 Garnishment2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Garnishment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Legal process whereby the debtor pays another party than the creditor to settle a debt due by the creditor to that other party."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class Garnishment extends PaymentObligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Garnishment";
				definition = "Legal process whereby the debtor pays another party than the creditor to settle a debt due by the creditor to that other party.";
				derivationElement_lazy = () -> Arrays.asList(StructuredRemittanceInformation10.mmGarnishmentRemittance, StructuredRemittanceInformation12.mmGarnishmentRemittance, StructuredRemittanceInformation13.mmGarnishmentRemittance,
						StructuredRemittanceInformation15.mmGarnishmentRemittance);
				superType_lazy = () -> PaymentObligation.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(Garnishment1.mmObject(), Garnishment2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Garnishment.class;
			}
		});
		return mmObject_lazy.get();
	}
}