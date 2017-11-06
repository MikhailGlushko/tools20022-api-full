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
import com.tools20022.repository.codeset.AuthenticationEntityCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Entity or object in charge of verifying the cardholder authenticity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode
 * AuthenticationEntityCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity1Code#mmICC
 * AuthenticationEntity1Code.mmICC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity1Code#mmAuthorisedAgent
 * AuthenticationEntity1Code.mmAuthorisedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity1Code#mmMerchant
 * AuthenticationEntity1Code.mmMerchant}</li>
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
 * <li>"ICCD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AuthenticationEntity1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Entity or object in charge of verifying the cardholder authenticity."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AuthenticationEntity2Code
 * AuthenticationEntity2Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class AuthenticationEntity1Code extends AuthenticationEntityCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity1Code
	 * AuthenticationEntity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity2Code#mmICC
	 * AuthenticationEntity2Code.mmICC}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmICC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICC";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationEntity2Code.mmICC);
			owner_lazy = () -> AuthenticationEntity1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity1Code
	 * AuthenticationEntity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedAgent"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity2Code#mmAuthorisedAgent
	 * AuthenticationEntity2Code.mmAuthorisedAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAuthorisedAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedAgent";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationEntity2Code.mmAuthorisedAgent);
			owner_lazy = () -> AuthenticationEntity1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity1Code
	 * AuthenticationEntity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merchant"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity2Code#mmMerchant
	 * AuthenticationEntity2Code.mmMerchant}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMerchant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merchant";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationEntity2Code.mmMerchant);
			owner_lazy = () -> AuthenticationEntity1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("ICCD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AuthenticationEntity1Code";
				definition = "Entity or object in charge of verifying the cardholder authenticity.";
				nextVersions_lazy = () -> Arrays.asList(AuthenticationEntity2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationEntity1Code.mmICC, com.tools20022.repository.codeset.AuthenticationEntity1Code.mmAuthorisedAgent,
						com.tools20022.repository.codeset.AuthenticationEntity1Code.mmMerchant);
				trace_lazy = () -> AuthenticationEntityCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}