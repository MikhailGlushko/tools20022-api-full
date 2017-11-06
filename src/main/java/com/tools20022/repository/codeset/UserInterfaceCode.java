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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of user interface to display or print information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode#mmCardholderDisplay
 * UserInterfaceCode.mmCardholderDisplay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode#mmCardholderReceipt
 * UserInterfaceCode.mmCardholderReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode#mmMerchantDisplay
 * UserInterfaceCode.mmMerchantDisplay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode#mmMerchantReceipt
 * UserInterfaceCode.mmMerchantReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode#mmAcquirer
 * UserInterfaceCode.mmAcquirer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UserInterfaceCode#mmIssuer
 * UserInterfaceCode.mmIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UserInterfaceCode#mmAgent
 * UserInterfaceCode.mmAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode#mmOtherCardholderInterface
 * UserInterfaceCode.mmOtherCardholderInterface}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UserInterface2Code
 * UserInterface2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UserInterface1Code
 * UserInterface1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UserInterface4Code
 * UserInterface4Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UserInterface3Code
 * UserInterface3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UserInterface5Code
 * UserInterface5Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CDSP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UserInterfaceCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of user interface to display or print information."</li>
 * </ul>
 */
public class UserInterfaceCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cardholder display or interface.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderDisplay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cardholder display or interface."</li>
	 * </ul>
	 */
	public static final MMCode mmCardholderDisplay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardholderDisplay";
			definition = "Cardholder display or interface.";
			owner_lazy = () -> UserInterfaceCode.mmObject();
			codeName = "CDSP";
		}
	};
	/**
	 * Cardholder receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cardholder receipt."</li>
	 * </ul>
	 */
	public static final MMCode mmCardholderReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardholderReceipt";
			definition = "Cardholder receipt.";
			owner_lazy = () -> UserInterfaceCode.mmObject();
			codeName = "CRCP";
		}
	};
	/**
	 * Merchant display or interface.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MDSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantDisplay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Merchant display or interface."</li>
	 * </ul>
	 */
	public static final MMCode mmMerchantDisplay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MerchantDisplay";
			definition = "Merchant display or interface.";
			owner_lazy = () -> UserInterfaceCode.mmObject();
			codeName = "MDSP";
		}
	};
	/**
	 * Merchant receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Merchant receipt."</li>
	 * </ul>
	 */
	public static final MMCode mmMerchantReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MerchantReceipt";
			definition = "Merchant receipt.";
			owner_lazy = () -> UserInterfaceCode.mmObject();
			codeName = "MRCP";
		}
	};
	/**
	 * Acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACQU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquirer."</li>
	 * </ul>
	 */
	public static final MMCode mmAcquirer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer.";
			owner_lazy = () -> UserInterfaceCode.mmObject();
			codeName = "ACQU";
		}
	};
	/**
	 * Issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer."</li>
	 * </ul>
	 */
	public static final MMCode mmIssuer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Issuer.";
			owner_lazy = () -> UserInterfaceCode.mmObject();
			codeName = "ISSR";
		}
	};
	/**
	 * Agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agent."</li>
	 * </ul>
	 */
	public static final MMCode mmAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agent";
			definition = "Agent.";
			owner_lazy = () -> UserInterfaceCode.mmObject();
			codeName = "AGNT";
		}
	};
	/**
	 * Other interface of the cardholder, for instance e-mail or smartphone
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
	 * UserInterfaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCardholderInterface"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other interface of the cardholder, for instance e-mail or smartphone message."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOtherCardholderInterface = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCardholderInterface";
			definition = "Other interface of the cardholder, for instance e-mail or smartphone message.";
			owner_lazy = () -> UserInterfaceCode.mmObject();
			codeName = "CRDO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("CDSP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UserInterfaceCode";
				definition = "Type of user interface to display or print information.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UserInterfaceCode.mmCardholderDisplay, com.tools20022.repository.codeset.UserInterfaceCode.mmCardholderReceipt,
						com.tools20022.repository.codeset.UserInterfaceCode.mmMerchantDisplay, com.tools20022.repository.codeset.UserInterfaceCode.mmMerchantReceipt, com.tools20022.repository.codeset.UserInterfaceCode.mmAcquirer,
						com.tools20022.repository.codeset.UserInterfaceCode.mmIssuer, com.tools20022.repository.codeset.UserInterfaceCode.mmAgent, com.tools20022.repository.codeset.UserInterfaceCode.mmOtherCardholderInterface);
				derivation_lazy = () -> Arrays.asList(UserInterface2Code.mmObject(), UserInterface1Code.mmObject(), UserInterface4Code.mmObject(), UserInterface3Code.mmObject(), UserInterface5Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}