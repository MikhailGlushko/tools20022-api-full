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
import com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3;

/**
 * OfferorShareLocalCode can only be used when the corporate action event type
 * code is TEND.
 */
public class ConstraintUseOfOfferorShareLocalCodeRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6SD3
	 * UpdatedAdditionalInformation6SD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UseOfOfferorShareLocalCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OfferorShareLocalCode can only be used when the corporate action event type code is TEND."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<UpdatedAdditionalInformation6SD3> forUpdatedAdditionalInformation6SD3 = new MMConstraint<UpdatedAdditionalInformation6SD3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UseOfOfferorShareLocalCodeRule";
			definition = "OfferorShareLocalCode can only be used when the corporate action event type code is TEND.";
			owner_lazy = () -> UpdatedAdditionalInformation6SD3.mmObject();
		}

		@Override
		public void executeValidator(UpdatedAdditionalInformation6SD3 obj) throws Exception {
			checkUpdatedAdditionalInformation6SD3(obj);
		}
	};

	/**
	 * OfferorShareLocalCode can only be used when the corporate action event
	 * type code is TEND.
	 */
	public static void checkUpdatedAdditionalInformation6SD3(UpdatedAdditionalInformation6SD3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}