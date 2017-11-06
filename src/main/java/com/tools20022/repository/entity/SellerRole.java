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
import com.tools20022.repository.entity.TradePartyRole;
import com.tools20022.repository.msg.PartyIdentification116;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party that sells assets, goods or services.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SellerRole" src="doc-files/SellerRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties3#mmSeller
 * ConfirmationParties3.mmSeller}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmSeller
 * ConfirmationParties4.mmSeller}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmSeller
 * ConfirmationParties2.mmSeller}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement6#mmSeller
 * TradeAgreement6.mmSeller}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement1#mmPayer
 * TradeSettlement1.mmPayer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportSpecification4#mmSeller
 * ReportSpecification4.mmSeller}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeContract1#mmSeller
 * TradeContract1.mmSeller}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#mmSeller
 * LoanContract1.mmSeller}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement13#mmSeller
 * TradeAgreement13.mmSeller}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmSeller
 * SecuritiesTransactionReport4.mmSeller}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.TradePartyRole
 * TradePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification116
 * PartyIdentification116}</li>
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
 * "SellerRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party that sells assets, goods or services."</li>
 * </ul>
 */
public class SellerRole extends TradePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SellerRole";
				definition = "Party that sells assets, goods or services.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ConfirmationParties3.mmSeller, com.tools20022.repository.msg.ConfirmationParties4.mmSeller,
						com.tools20022.repository.msg.ConfirmationParties2.mmSeller, com.tools20022.repository.msg.TradeAgreement6.mmSeller, com.tools20022.repository.msg.TradeSettlement1.mmPayer,
						com.tools20022.repository.msg.ReportSpecification4.mmSeller, com.tools20022.repository.msg.TradeContract1.mmSeller, com.tools20022.repository.msg.LoanContract1.mmSeller,
						com.tools20022.repository.msg.TradeAgreement13.mmSeller, com.tools20022.repository.msg.SecuritiesTransactionReport4.mmSeller);
				superType_lazy = () -> TradePartyRole.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(PartyIdentification116.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}