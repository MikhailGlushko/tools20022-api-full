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
 * Frequency of the cash distribution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code#mmFinal
 * CorporateActionFrequencyTypeV2Code.mmFinal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code#mmInterim
 * CorporateActionFrequencyTypeV2Code.mmInterim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code#mmRegular
 * CorporateActionFrequencyTypeV2Code.mmRegular}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code#mmSpecial
 * CorporateActionFrequencyTypeV2Code.mmSpecial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code#mmReinvestment
 * CorporateActionFrequencyTypeV2Code.mmReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code#mmSpecialDividendWithReinvestment
 * CorporateActionFrequencyTypeV2Code.mmSpecialDividendWithReinvestment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType3Code
 * CorporateActionFrequencyType3Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType4Code
 * CorporateActionFrequencyType4Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code
 * CorporateActionFrequencyType5Code}</li>
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
 * <li>"FINL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionFrequencyTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Frequency of the cash distribution."</li>
 * </ul>
 */
public class CorporateActionFrequencyTypeV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment of a dividend, less amounts already paid through interim
	 * dividends.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code
	 * CorporateActionFrequencyTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FINL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Final"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment of a dividend, less amounts already paid through interim dividends."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFinal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Final";
			definition = "Payment of a dividend, less amounts already paid through interim dividends.";
			owner_lazy = () -> CorporateActionFrequencyTypeV2Code.mmObject();
			codeName = "FINL";
		}
	};
	/**
	 * Dividend declared and paid before annual earnings have been determined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code
	 * CorporateActionFrequencyTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend declared and paid before annual earnings have been determined."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInterim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interim";
			definition = "Dividend declared and paid before annual earnings have been determined.";
			owner_lazy = () -> CorporateActionFrequencyTypeV2Code.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Dividend paid at regular interval, for example, quarterly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code
	 * CorporateActionFrequencyTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Regular"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend paid at regular interval, for example, quarterly."</li>
	 * </ul>
	 */
	public static final MMCode mmRegular = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Regular";
			definition = "Dividend paid at regular interval, for example, quarterly.";
			owner_lazy = () -> CorporateActionFrequencyTypeV2Code.mmObject();
			codeName = "REGR";
		}
	};
	/**
	 * Dividend in addition to the regular dividend being paid by the company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code
	 * CorporateActionFrequencyTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Special"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend in addition to the regular dividend being paid by the company."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSpecial = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Special";
			definition = "Dividend in addition to the regular dividend being paid by the company.";
			owner_lazy = () -> CorporateActionFrequencyTypeV2Code.mmObject();
			codeName = "SPEC";
		}
	};
	/**
	 * Reinvestment of cash distributed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code
	 * CorporateActionFrequencyTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reinvestment of cash distributed."</li>
	 * </ul>
	 */
	public static final MMCode mmReinvestment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reinvestment";
			definition = "Reinvestment of cash distributed.";
			owner_lazy = () -> CorporateActionFrequencyTypeV2Code.mmObject();
			codeName = "REIN";
		}
	};
	/**
	 * Special Dividend with reinvestment component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code
	 * CorporateActionFrequencyTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDividendWithReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Special Dividend with reinvestment component.  "</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialDividendWithReinvestment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDividendWithReinvestment";
			definition = "Special Dividend with reinvestment component.  ";
			owner_lazy = () -> CorporateActionFrequencyTypeV2Code.mmObject();
			codeName = "SPRE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("FINL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionFrequencyTypeV2Code";
				definition = "Frequency of the cash distribution.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code.mmFinal, com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code.mmInterim,
						com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code.mmRegular, com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code.mmSpecial,
						com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code.mmReinvestment, com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code.mmSpecialDividendWithReinvestment);
				derivation_lazy = () -> Arrays.asList(CorporateActionFrequencyType3Code.mmObject(), CorporateActionFrequencyType4Code.mmObject(), CorporateActionFrequencyType5Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}