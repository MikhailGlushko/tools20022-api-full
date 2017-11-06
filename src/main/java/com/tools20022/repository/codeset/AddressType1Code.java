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
import com.tools20022.repository.codeset.AddressTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of address.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode
 * AddressTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AddressType1Code#mmResidential
 * AddressType1Code.mmResidential}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AddressType1Code#mmBusiness
 * AddressType1Code.mmBusiness}</li>
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
 * <li>"HOME"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AddressType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of address."</li>
 * </ul>
 */
public class AddressType1Code extends AddressTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AddressType1Code
	 * AddressType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Residential"</li>
	 * </ul>
	 */
	public static final MMCode mmResidential = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Residential";
			owner_lazy = () -> AddressType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AddressType1Code
	 * AddressType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Business"</li>
	 * </ul>
	 */
	public static final MMCode mmBusiness = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Business";
			owner_lazy = () -> AddressType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("HOME");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AddressType1Code";
				definition = "Specifies the type of address.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AddressType1Code.mmResidential, com.tools20022.repository.codeset.AddressType1Code.mmBusiness);
				trace_lazy = () -> AddressTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}