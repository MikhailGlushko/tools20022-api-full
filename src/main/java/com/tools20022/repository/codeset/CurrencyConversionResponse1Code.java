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
import com.tools20022.repository.codeset.CurrencyConversionResponseCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Result of a requested currency conversion.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode
 * CurrencyConversionResponseCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code#mmAllowed
 * CurrencyConversionResponse1Code.mmAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code#mmAssumed
 * CurrencyConversionResponse1Code.mmAssumed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code#mmInvalidCard
 * CurrencyConversionResponse1Code.mmInvalidCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code#mmInvalidMerchant
 * CurrencyConversionResponse1Code.mmInvalidMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code#mmInvalidProduct
 * CurrencyConversionResponse1Code.mmInvalidProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code#mmNoRate
 * CurrencyConversionResponse1Code.mmNoRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code#mmNotAvailable
 * CurrencyConversionResponse1Code.mmNotAvailable}</li>
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
 * "CurrencyConversionResponse1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Result of a requested currency conversion."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code
 * CurrencyConversionResponse3Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class CurrencyConversionResponse1Code extends CurrencyConversionResponseCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code
	 * CurrencyConversionResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Allowed"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#mmAllowed
	 * CurrencyConversionResponse3Code.mmAllowed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Allowed";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CurrencyConversionResponse3Code.mmAllowed);
			owner_lazy = () -> CurrencyConversionResponse1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code
	 * CurrencyConversionResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assumed"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#mmAssumed
	 * CurrencyConversionResponse3Code.mmAssumed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAssumed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assumed";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CurrencyConversionResponse3Code.mmAssumed);
			owner_lazy = () -> CurrencyConversionResponse1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code
	 * CurrencyConversionResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCard"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#mmInvalidCard
	 * CurrencyConversionResponse3Code.mmInvalidCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCard";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CurrencyConversionResponse3Code.mmInvalidCard);
			owner_lazy = () -> CurrencyConversionResponse1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code
	 * CurrencyConversionResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMerchant"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#mmInvalidMerchant
	 * CurrencyConversionResponse3Code.mmInvalidMerchant}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidMerchant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMerchant";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CurrencyConversionResponse3Code.mmInvalidMerchant);
			owner_lazy = () -> CurrencyConversionResponse1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code
	 * CurrencyConversionResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidProduct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#mmInvalidProduct
	 * CurrencyConversionResponse3Code.mmInvalidProduct}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidProduct = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidProduct";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CurrencyConversionResponse3Code.mmInvalidProduct);
			owner_lazy = () -> CurrencyConversionResponse1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code
	 * CurrencyConversionResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#mmNoRate
	 * CurrencyConversionResponse3Code.mmNoRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNoRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoRate";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CurrencyConversionResponse3Code.mmNoRate);
			owner_lazy = () -> CurrencyConversionResponse1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code
	 * CurrencyConversionResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAvailable"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code#mmNotAvailable
	 * CurrencyConversionResponse3Code.mmNotAvailable}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNotAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAvailable";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CurrencyConversionResponse3Code.mmNotAvailable);
			owner_lazy = () -> CurrencyConversionResponse1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CurrencyConversionResponse1Code";
				definition = "Result of a requested currency conversion.";
				nextVersions_lazy = () -> Arrays.asList(CurrencyConversionResponse3Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CurrencyConversionResponse1Code.mmAllowed, com.tools20022.repository.codeset.CurrencyConversionResponse1Code.mmAssumed,
						com.tools20022.repository.codeset.CurrencyConversionResponse1Code.mmInvalidCard, com.tools20022.repository.codeset.CurrencyConversionResponse1Code.mmInvalidMerchant,
						com.tools20022.repository.codeset.CurrencyConversionResponse1Code.mmInvalidProduct, com.tools20022.repository.codeset.CurrencyConversionResponse1Code.mmNoRate,
						com.tools20022.repository.codeset.CurrencyConversionResponse1Code.mmNotAvailable);
				trace_lazy = () -> CurrencyConversionResponseCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}