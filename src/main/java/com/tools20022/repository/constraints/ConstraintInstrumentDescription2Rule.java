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
import com.tools20022.repository.msg.FinancialInstrument14;
import com.tools20022.repository.msg.FinancialInstrument15;

/**
 * If InstrumentDescription is present, then InstrumentDescription/Description
 * must be present.
 */
public class ConstraintInstrumentDescription2Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument14
	 * FinancialInstrument14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentDescription2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstrumentDescription is present, then InstrumentDescription/Description must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument14> forFinancialInstrument14 = new MMConstraint<FinancialInstrument14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentDescription2Rule";
			definition = "If InstrumentDescription is present, then InstrumentDescription/Description must be present.";
			owner_lazy = () -> FinancialInstrument14.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument14 obj) throws Exception {
			checkFinancialInstrument14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument15
	 * FinancialInstrument15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentDescription2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstrumentDescription is present, then InstrumentDescription/Description must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrument15> forFinancialInstrument15 = new MMConstraint<FinancialInstrument15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentDescription2Rule";
			definition = "If InstrumentDescription is present, then InstrumentDescription/Description must be present.";
			owner_lazy = () -> FinancialInstrument15.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrument15 obj) throws Exception {
			checkFinancialInstrument15(obj);
		}
	};

	/**
	 * If InstrumentDescription is present, then
	 * InstrumentDescription/Description must be present.
	 */
	public static void checkFinancialInstrument14(FinancialInstrument14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InstrumentDescription is present, then
	 * InstrumentDescription/Description must be present.
	 */
	public static void checkFinancialInstrument15(FinancialInstrument15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}