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
import com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculatedCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the fund calculates the taxable income per dividend/taxable
 * income per share (TID/TIS).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculatedCode
 * CorporateActionTaxableIncomePerShareCalculatedCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code#mmCalculated
 * CorporateActionTaxableIncomePerShareCalculated1Code.mmCalculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code#mmNotCalculated
 * CorporateActionTaxableIncomePerShareCalculated1Code.mmNotCalculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code#mmUnknown
 * CorporateActionTaxableIncomePerShareCalculated1Code.mmUnknown}</li>
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
 * <li>"TDIY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionTaxableIncomePerShareCalculated1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the fund calculates the taxable income per dividend/taxable income per share (TID/TIS)."
 * </li>
 * </ul>
 */
public class CorporateActionTaxableIncomePerShareCalculated1Code extends CorporateActionTaxableIncomePerShareCalculatedCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code
	 * CorporateActionTaxableIncomePerShareCalculated1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Calculated"</li>
	 * </ul>
	 */
	public static final MMCode mmCalculated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Calculated";
			owner_lazy = () -> CorporateActionTaxableIncomePerShareCalculated1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code
	 * CorporateActionTaxableIncomePerShareCalculated1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotCalculated"</li>
	 * </ul>
	 */
	public static final MMCode mmNotCalculated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotCalculated";
			owner_lazy = () -> CorporateActionTaxableIncomePerShareCalculated1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code
	 * CorporateActionTaxableIncomePerShareCalculated1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * </ul>
	 */
	public static final MMCode mmUnknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			owner_lazy = () -> CorporateActionTaxableIncomePerShareCalculated1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("TDIY");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionTaxableIncomePerShareCalculated1Code";
				definition = "Specifies whether the fund calculates the taxable income per dividend/taxable income per share (TID/TIS).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code.mmCalculated,
						com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code.mmNotCalculated, com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code.mmUnknown);
				trace_lazy = () -> CorporateActionTaxableIncomePerShareCalculatedCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}