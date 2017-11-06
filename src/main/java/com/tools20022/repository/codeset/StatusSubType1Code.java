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
import com.tools20022.repository.codeset.StatusSubTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the sub status of the trade notification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.StatusSubTypeCode
 * StatusSubTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatusSubType1Code#mmNoFlagsSet
 * StatusSubType1Code.mmNoFlagsSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatusSubType1Code#mmOnlyPendingFlagTrue
 * StatusSubType1Code.mmOnlyPendingFlagTrue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatusSubType1Code#mmOnlySameDayFlagTrue
 * StatusSubType1Code.mmOnlySameDayFlagTrue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatusSubType1Code#mmSameDayAndPendingFlagsTrue
 * StatusSubType1Code.mmSameDayAndPendingFlagsTrue}</li>
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
 * <li>"NONE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatusSubType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the sub status of the trade notification."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.StatusSubType2Code
 * StatusSubType2Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class StatusSubType1Code extends StatusSubTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusSubType1Code
	 * StatusSubType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoFlagsSet"</li>
	 * </ul>
	 */
	public static final MMCode mmNoFlagsSet = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoFlagsSet";
			owner_lazy = () -> StatusSubType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusSubType1Code
	 * StatusSubType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnlyPendingFlagTrue"</li>
	 * </ul>
	 */
	public static final MMCode mmOnlyPendingFlagTrue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnlyPendingFlagTrue";
			owner_lazy = () -> StatusSubType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusSubType1Code
	 * StatusSubType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnlySameDayFlagTrue"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.StatusSubType2Code#mmOnlySameDayFlagTrue
	 * StatusSubType2Code.mmOnlySameDayFlagTrue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOnlySameDayFlagTrue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnlySameDayFlagTrue";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StatusSubType2Code.mmOnlySameDayFlagTrue);
			owner_lazy = () -> StatusSubType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusSubType1Code
	 * StatusSubType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameDayAndPendingFlagsTrue"</li>
	 * </ul>
	 */
	public static final MMCode mmSameDayAndPendingFlagsTrue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameDayAndPendingFlagsTrue";
			owner_lazy = () -> StatusSubType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("NONE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StatusSubType1Code";
				definition = "Indicates the sub status of the trade notification.";
				nextVersions_lazy = () -> Arrays.asList(StatusSubType2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StatusSubType1Code.mmNoFlagsSet, com.tools20022.repository.codeset.StatusSubType1Code.mmOnlyPendingFlagTrue,
						com.tools20022.repository.codeset.StatusSubType1Code.mmOnlySameDayFlagTrue, com.tools20022.repository.codeset.StatusSubType1Code.mmSameDayAndPendingFlagsTrue);
				trace_lazy = () -> StatusSubTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}