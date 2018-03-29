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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.FinancialInstrument16;
import com.tools20022.repository.msg.FinancialInstrument20;

/**
 * If CountryOfDomicile is AT, BE, CH, DE, ES, FR, GB, IE, IT, LU or NL then
 * Identification\ISIN must be present.
 */
public class ConstraintISINIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16
	 * FinancialInstrument16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISINIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CountryOfDomicile is AT, BE, CH, DE, ES, FR, GB, IE, IT, LU or NL then Identification\\ISIN must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument16> forFinancialInstrument16 = new MMConstraint<FinancialInstrument16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISINIdentificationRule";
			definition = "If CountryOfDomicile is AT, BE, CH, DE, ES, FR, GB, IE, IT, LU or NL then Identification\\ISIN must be present.";
			owner_lazy = () -> FinancialInstrument16.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument16 obj) throws Exception {
			checkFinancialInstrument16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20
	 * FinancialInstrument20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISINIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CountryOfDomicile is AT, BE, CH, DE, ES, FR, GB, IE, IT, LU or NL then Identification\\ISIN must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument20> forFinancialInstrument20 = new MMConstraint<FinancialInstrument20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISINIdentificationRule";
			definition = "If CountryOfDomicile is AT, BE, CH, DE, ES, FR, GB, IE, IT, LU or NL then Identification\\ISIN must be present.";
			owner_lazy = () -> FinancialInstrument20.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument20 obj) throws Exception {
			checkFinancialInstrument20(obj);
		}
	};

	/**
	 * If CountryOfDomicile is AT, BE, CH, DE, ES, FR, GB, IE, IT, LU or NL then
	 * Identification\ISIN must be present.
	 */
	public static void checkFinancialInstrument16(FinancialInstrument16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CountryOfDomicile is AT, BE, CH, DE, ES, FR, GB, IE, IT, LU or NL then
	 * Identification\ISIN must be present.
	 */
	public static void checkFinancialInstrument20(FinancialInstrument20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}