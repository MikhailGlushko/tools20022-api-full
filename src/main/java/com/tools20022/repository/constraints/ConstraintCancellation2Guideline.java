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
import com.tools20022.repository.area.seev.MeetingCancellationV02;
import com.tools20022.repository.area.seev.MeetingCancellationV03;
import com.tools20022.repository.area.seev.MeetingCancellationV04;

/**
 * It is recommended to cancel a meeting notification message by using
 * MessageCancellation, MeetingReference/MeetingIdentification and Reason only.
 * It is recommended to avoid the repetition of optional building blocks or
 * components.
 */
public class ConstraintCancellation2Guideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV02
	 * MeetingCancellationV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation2Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended to cancel a meeting notification message by using MessageCancellation, MeetingReference/MeetingIdentification and Reason only. It is recommended to avoid the repetition of optional building blocks or components."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingCancellationV02> for_seev_MeetingCancellationV02 = new MMConstraint<MeetingCancellationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation2Guideline";
			definition = "It is recommended to cancel a meeting notification message by using MessageCancellation, MeetingReference/MeetingIdentification and Reason only. It is recommended to avoid the repetition of optional building blocks or components.";
			owner_lazy = () -> MeetingCancellationV02.mmObject();
		}

		@Override
		public void executeValidator(MeetingCancellationV02 obj) throws Exception {
			check_seev_MeetingCancellationV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV04
	 * MeetingCancellationV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation2Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended to cancel a meeting notification message by using MessageCancellation, MeetingReference/MeetingIdentification and Reason only. It is recommended to avoid the repetition of optional building blocks or components."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingCancellationV04> for_seev_MeetingCancellationV04 = new MMConstraint<MeetingCancellationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation2Guideline";
			definition = "It is recommended to cancel a meeting notification message by using MessageCancellation, MeetingReference/MeetingIdentification and Reason only. It is recommended to avoid the repetition of optional building blocks or components.";
			owner_lazy = () -> MeetingCancellationV04.mmObject();
		}

		@Override
		public void executeValidator(MeetingCancellationV04 obj) throws Exception {
			check_seev_MeetingCancellationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV03
	 * MeetingCancellationV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation2Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended to cancel a meeting notification message by using MessageCancellation, MeetingReference/MeetingIdentification and Reason only. It is recommended to avoid the repetition of optional building blocks or components."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingCancellationV03> for_seev_MeetingCancellationV03 = new MMConstraint<MeetingCancellationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation2Guideline";
			definition = "It is recommended to cancel a meeting notification message by using MessageCancellation, MeetingReference/MeetingIdentification and Reason only. It is recommended to avoid the repetition of optional building blocks or components.";
			owner_lazy = () -> MeetingCancellationV03.mmObject();
		}

		@Override
		public void executeValidator(MeetingCancellationV03 obj) throws Exception {
			check_seev_MeetingCancellationV03(obj);
		}
	};

	/**
	 * It is recommended to cancel a meeting notification message by using
	 * MessageCancellation, MeetingReference/MeetingIdentification and Reason
	 * only. It is recommended to avoid the repetition of optional building
	 * blocks or components.
	 */
	public static void check_seev_MeetingCancellationV02(MeetingCancellationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended to cancel a meeting notification message by using
	 * MessageCancellation, MeetingReference/MeetingIdentification and Reason
	 * only. It is recommended to avoid the repetition of optional building
	 * blocks or components.
	 */
	public static void check_seev_MeetingCancellationV04(MeetingCancellationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended to cancel a meeting notification message by using
	 * MessageCancellation, MeetingReference/MeetingIdentification and Reason
	 * only. It is recommended to avoid the repetition of optional building
	 * blocks or components.
	 */
	public static void check_seev_MeetingCancellationV03(MeetingCancellationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}