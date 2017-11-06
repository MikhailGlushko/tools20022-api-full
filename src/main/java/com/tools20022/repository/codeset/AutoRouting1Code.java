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
import com.tools20022.repository.codeset.AutoRoutingCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates whether an automatic routing system is involved.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AutoRoutingCode
 * AutoRoutingCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AutoRouting1Code#mmDOTSystem
 * AutoRouting1Code.mmDOTSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AutoRouting1Code#mmSuperDOTSystem
 * AutoRouting1Code.mmSuperDOTSystem}</li>
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
 * <li>"DDOT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AutoRouting1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates whether an automatic routing system is involved."</li>
 * </ul>
 */
public class AutoRouting1Code extends AutoRoutingCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AutoRouting1Code
	 * AutoRouting1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DOTSystem"</li>
	 * </ul>
	 */
	public static final MMCode mmDOTSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DOTSystem";
			owner_lazy = () -> AutoRouting1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AutoRouting1Code
	 * AutoRouting1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuperDOTSystem"</li>
	 * </ul>
	 */
	public static final MMCode mmSuperDOTSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuperDOTSystem";
			owner_lazy = () -> AutoRouting1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("DDOT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AutoRouting1Code";
				definition = "Indicates whether an automatic routing system is involved.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AutoRouting1Code.mmDOTSystem, com.tools20022.repository.codeset.AutoRouting1Code.mmSuperDOTSystem);
				trace_lazy = () -> AutoRoutingCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}