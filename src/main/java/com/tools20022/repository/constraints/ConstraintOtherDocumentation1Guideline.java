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
import com.tools20022.repository.msg.PowerOfAttorneyRequirements2;
import com.tools20022.repository.msg.PowerOfAttorneyRequirements3;
import java.util.Arrays;

/**
 * If PowerOfAttorney specific deadlines are announced, it is recommended that
 * OtherDocumentation be used.
 */
public class ConstraintOtherDocumentation1Guideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements3
	 * PowerOfAttorneyRequirements3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDocumentation1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PowerOfAttorney specific deadlines are announced, it is recommended that OtherDocumentation be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherDocumentation1Guideline#forPowerOfAttorneyRequirements2
	 * ConstraintOtherDocumentation1Guideline.forPowerOfAttorneyRequirements2}</li>
	 * </ul>
	 */
	public static final MMConstraint<PowerOfAttorneyRequirements3> forPowerOfAttorneyRequirements3 = new MMConstraint<PowerOfAttorneyRequirements3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentation1Guideline";
			definition = "If PowerOfAttorney specific deadlines are announced, it is recommended that OtherDocumentation be used.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherDocumentation1Guideline.forPowerOfAttorneyRequirements2;
			owner_lazy = () -> PowerOfAttorneyRequirements3.mmObject();
		}

		@Override
		public void executeValidator(PowerOfAttorneyRequirements3 obj) throws Exception {
			checkPowerOfAttorneyRequirements3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements2
	 * PowerOfAttorneyRequirements2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDocumentation1Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PowerOfAttorney specific deadlines are announced, it is recommended that OtherDocumentation be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherDocumentation1Guideline#forPowerOfAttorneyRequirements3
	 * ConstraintOtherDocumentation1Guideline.forPowerOfAttorneyRequirements3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PowerOfAttorneyRequirements2> forPowerOfAttorneyRequirements2 = new MMConstraint<PowerOfAttorneyRequirements2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentation1Guideline";
			definition = "If PowerOfAttorney specific deadlines are announced, it is recommended that OtherDocumentation be used.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherDocumentation1Guideline.forPowerOfAttorneyRequirements3);
			owner_lazy = () -> PowerOfAttorneyRequirements2.mmObject();
		}

		@Override
		public void executeValidator(PowerOfAttorneyRequirements2 obj) throws Exception {
			checkPowerOfAttorneyRequirements2(obj);
		}
	};

	/**
	 * If PowerOfAttorney specific deadlines are announced, it is recommended
	 * that OtherDocumentation be used.
	 */
	public static void checkPowerOfAttorneyRequirements3(PowerOfAttorneyRequirements3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PowerOfAttorney specific deadlines are announced, it is recommended
	 * that OtherDocumentation be used.
	 */
	public static void checkPowerOfAttorneyRequirements2(PowerOfAttorneyRequirements2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}