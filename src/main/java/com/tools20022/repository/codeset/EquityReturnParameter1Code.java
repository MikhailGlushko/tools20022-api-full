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
import com.tools20022.repository.codeset.EquityReturnParameterCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies an equity derivative return parameter.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameterCode
 * EquityReturnParameterCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameter1Code#mmParameterReturnDividend
 * EquityReturnParameter1Code.mmParameterReturnDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameter1Code#mmParameterReturnVariance
 * EquityReturnParameter1Code.mmParameterReturnVariance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameter1Code#mmParameterReturnVolatility
 * EquityReturnParameter1Code.mmParameterReturnVolatility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameter1Code#mmPriceReturnBasicPerformanceParameter
 * EquityReturnParameter1Code.mmPriceReturnBasicPerformanceParameter}</li>
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
 * "EquityReturnParameter1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies an equity derivative return parameter."</li>
 * </ul>
 */
public class EquityReturnParameter1Code extends EquityReturnParameterCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameter1Code
	 * EquityReturnParameter1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParameterReturnDividend"</li>
	 * </ul>
	 */
	public static final MMCode mmParameterReturnDividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParameterReturnDividend";
			owner_lazy = () -> EquityReturnParameter1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameter1Code
	 * EquityReturnParameter1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParameterReturnVariance"</li>
	 * </ul>
	 */
	public static final MMCode mmParameterReturnVariance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParameterReturnVariance";
			owner_lazy = () -> EquityReturnParameter1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameter1Code
	 * EquityReturnParameter1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParameterReturnVolatility"</li>
	 * </ul>
	 */
	public static final MMCode mmParameterReturnVolatility = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParameterReturnVolatility";
			owner_lazy = () -> EquityReturnParameter1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameter1Code
	 * EquityReturnParameter1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceReturnBasicPerformanceParameter"</li>
	 * </ul>
	 */
	public static final MMCode mmPriceReturnBasicPerformanceParameter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceReturnBasicPerformanceParameter";
			owner_lazy = () -> EquityReturnParameter1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EquityReturnParameter1Code";
				definition = "Specifies an equity derivative return parameter.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EquityReturnParameter1Code.mmParameterReturnDividend, com.tools20022.repository.codeset.EquityReturnParameter1Code.mmParameterReturnVariance,
						com.tools20022.repository.codeset.EquityReturnParameter1Code.mmParameterReturnVolatility, com.tools20022.repository.codeset.EquityReturnParameter1Code.mmPriceReturnBasicPerformanceParameter);
				trace_lazy = () -> EquityReturnParameterCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}