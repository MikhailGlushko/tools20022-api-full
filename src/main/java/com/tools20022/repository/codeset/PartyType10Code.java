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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.PartyTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of identified entity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode PartyTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType10Code#mmAcceptor
 * PartyType10Code.mmAcceptor}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType10Code#mmAcquirer
 * PartyType10Code.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType10Code#mmATMManager
 * PartyType10Code.mmATMManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType10Code#mmCardIssuer
 * PartyType10Code.mmCardIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType10Code#mmDelegateIssuer
 * PartyType10Code.mmDelegateIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType10Code#mmHostingEntity
 * PartyType10Code.mmHostingEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType10Code#mmIntermediaryAgent
 * PartyType10Code.mmIntermediaryAgent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyType10Code#mmMerchant
 * PartyType10Code.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType10Code#mmOriginatingATM
 * PartyType10Code.mmOriginatingATM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyType10Code#mmOriginatingPOI
 * PartyType10Code.mmOriginatingPOI}</li>
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
 * "PartyType10Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of identified entity."</li>
 * </ul>
 */
public class PartyType10Code extends PartyTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType10Code
	 * PartyType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acceptor"</li>
	 * </ul>
	 */
	public static final MMCode mmAcceptor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acceptor";
			owner_lazy = () -> PartyType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType10Code
	 * PartyType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * </ul>
	 */
	public static final MMCode mmAcquirer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			owner_lazy = () -> PartyType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType10Code
	 * PartyType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMManager"</li>
	 * </ul>
	 */
	public static final MMCode mmATMManager = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMManager";
			owner_lazy = () -> PartyType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType10Code
	 * PartyType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardIssuer"</li>
	 * </ul>
	 */
	public static final MMCode mmCardIssuer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardIssuer";
			owner_lazy = () -> PartyType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType10Code
	 * PartyType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegateIssuer"</li>
	 * </ul>
	 */
	public static final MMCode mmDelegateIssuer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegateIssuer";
			owner_lazy = () -> PartyType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType10Code
	 * PartyType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostingEntity"</li>
	 * </ul>
	 */
	public static final MMCode mmHostingEntity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostingEntity";
			owner_lazy = () -> PartyType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType10Code
	 * PartyType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent"</li>
	 * </ul>
	 */
	public static final MMCode mmIntermediaryAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent";
			owner_lazy = () -> PartyType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType10Code
	 * PartyType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merchant"</li>
	 * </ul>
	 */
	public static final MMCode mmMerchant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merchant";
			owner_lazy = () -> PartyType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType10Code
	 * PartyType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatingATM"</li>
	 * </ul>
	 */
	public static final MMCode mmOriginatingATM = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingATM";
			owner_lazy = () -> PartyType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType10Code
	 * PartyType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatingPOI"</li>
	 * </ul>
	 */
	public static final MMCode mmOriginatingPOI = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingPOI";
			owner_lazy = () -> PartyType10Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PartyType10Code";
				definition = "Type of identified entity.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartyType10Code.mmAcceptor, com.tools20022.repository.codeset.PartyType10Code.mmAcquirer, com.tools20022.repository.codeset.PartyType10Code.mmATMManager,
						com.tools20022.repository.codeset.PartyType10Code.mmCardIssuer, com.tools20022.repository.codeset.PartyType10Code.mmDelegateIssuer, com.tools20022.repository.codeset.PartyType10Code.mmHostingEntity,
						com.tools20022.repository.codeset.PartyType10Code.mmIntermediaryAgent, com.tools20022.repository.codeset.PartyType10Code.mmMerchant, com.tools20022.repository.codeset.PartyType10Code.mmOriginatingATM,
						com.tools20022.repository.codeset.PartyType10Code.mmOriginatingPOI);
				trace_lazy = () -> PartyTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}