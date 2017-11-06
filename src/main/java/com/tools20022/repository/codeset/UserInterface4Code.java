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
import com.tools20022.repository.codeset.UserInterfaceCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Destination of the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
 * UserInterfaceCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code#mmCardholderDisplay
 * UserInterface4Code.mmCardholderDisplay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code#mmCardholderReceipt
 * UserInterface4Code.mmCardholderReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code#mmMerchantDisplay
 * UserInterface4Code.mmMerchantDisplay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code#mmMerchantReceipt
 * UserInterface4Code.mmMerchantReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code#mmOtherCardholderInterface
 * UserInterface4Code.mmOtherCardholderInterface}</li>
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
 * "UserInterface4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Destination of the message."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UserInterface5Code
 * UserInterface5Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class UserInterface4Code extends UserInterfaceCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code
	 * UserInterface4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderDisplay"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UserInterface5Code#mmCardholderDisplay
	 * UserInterface5Code.mmCardholderDisplay}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCardholderDisplay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderDisplay";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UserInterface5Code.mmCardholderDisplay);
			owner_lazy = () -> UserInterface4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code
	 * UserInterface4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderReceipt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UserInterface5Code#mmCardholderReceipt
	 * UserInterface5Code.mmCardholderReceipt}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCardholderReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderReceipt";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UserInterface5Code.mmCardholderReceipt);
			owner_lazy = () -> UserInterface4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code
	 * UserInterface4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantDisplay"</li>
	 * </ul>
	 */
	public static final MMCode mmMerchantDisplay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantDisplay";
			owner_lazy = () -> UserInterface4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code
	 * UserInterface4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantReceipt"</li>
	 * </ul>
	 */
	public static final MMCode mmMerchantReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantReceipt";
			owner_lazy = () -> UserInterface4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code
	 * UserInterface4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCardholderInterface"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UserInterface5Code#mmOtherCardholderInterface
	 * UserInterface5Code.mmOtherCardholderInterface}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOtherCardholderInterface = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCardholderInterface";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UserInterface5Code.mmOtherCardholderInterface);
			owner_lazy = () -> UserInterface4Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UserInterface4Code";
				definition = "Destination of the message.";
				nextVersions_lazy = () -> Arrays.asList(UserInterface5Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UserInterface4Code.mmCardholderDisplay, com.tools20022.repository.codeset.UserInterface4Code.mmCardholderReceipt,
						com.tools20022.repository.codeset.UserInterface4Code.mmMerchantDisplay, com.tools20022.repository.codeset.UserInterface4Code.mmMerchantReceipt,
						com.tools20022.repository.codeset.UserInterface4Code.mmOtherCardholderInterface);
				trace_lazy = () -> UserInterfaceCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}