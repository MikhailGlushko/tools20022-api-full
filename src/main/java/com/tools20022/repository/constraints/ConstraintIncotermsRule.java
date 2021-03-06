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
import com.tools20022.repository.msg.LineItem11;
import com.tools20022.repository.msg.LineItem13;
import com.tools20022.repository.msg.LineItem5;
import com.tools20022.repository.msg.LineItem7;
import java.util.Arrays;

/**
 * If Incoterms is present, then Incoterms is not allowed within each occurrence
 * of LineItemDetails. If Incoterms is not present, then Incoterms is allowed
 * within each occurrence of LineItemDetails.
 */
public class ConstraintIncotermsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LineItem13 LineItem13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncotermsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Incoterms is present, then Incoterms is not allowed within each occurrence of LineItemDetails. If Incoterms is not present, then Incoterms is allowed within each occurrence of LineItemDetails."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncotermsRule#forLineItem11
	 * ConstraintIncotermsRule.forLineItem11}</li>
	 * </ul>
	 */
	public static final MMConstraint<LineItem13> forLineItem13 = new MMConstraint<LineItem13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncotermsRule";
			definition = "If Incoterms is present, then Incoterms is not allowed within each occurrence of LineItemDetails. If Incoterms is not present, then Incoterms is allowed within each occurrence of LineItemDetails.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIncotermsRule.forLineItem11;
			owner_lazy = () -> LineItem13.mmObject();
		}

		@Override
		public void executeValidator(LineItem13 obj) throws Exception {
			checkLineItem13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LineItem11 LineItem11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncotermsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Incoterms is present, then Incoterms is not allowed within each occurrence of LineItemDetails. If Incoterms is not present, then Incoterms is allowed within each occurrence of LineItemDetails."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncotermsRule#forLineItem13
	 * ConstraintIncotermsRule.forLineItem13}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncotermsRule#forLineItem7
	 * ConstraintIncotermsRule.forLineItem7}</li>
	 * </ul>
	 */
	public static final MMConstraint<LineItem11> forLineItem11 = new MMConstraint<LineItem11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncotermsRule";
			definition = "If Incoterms is present, then Incoterms is not allowed within each occurrence of LineItemDetails. If Incoterms is not present, then Incoterms is allowed within each occurrence of LineItemDetails.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIncotermsRule.forLineItem13);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIncotermsRule.forLineItem7;
			owner_lazy = () -> LineItem11.mmObject();
		}

		@Override
		public void executeValidator(LineItem11 obj) throws Exception {
			checkLineItem11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LineItem7 LineItem7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncotermsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Incoterms is present, then Incoterms is not allowed within each occurrence of LineItemDetails. If Incoterms is not present, then Incoterms is allowed within each occurrence of LineItemDetails."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncotermsRule#forLineItem11
	 * ConstraintIncotermsRule.forLineItem11}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LineItem7> forLineItem7 = new MMConstraint<LineItem7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncotermsRule";
			definition = "If Incoterms is present, then Incoterms is not allowed within each occurrence of LineItemDetails. If Incoterms is not present, then Incoterms is allowed within each occurrence of LineItemDetails.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIncotermsRule.forLineItem11);
			owner_lazy = () -> LineItem7.mmObject();
		}

		@Override
		public void executeValidator(LineItem7 obj) throws Exception {
			checkLineItem7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LineItem5 LineItem5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncotermsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Incoterms is present, then Incoterms is not allowed within each occurrence of LineItemDetails. If Incoterms is not present, then Incoterms is allowed within each occurrence of LineItemDetails."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<LineItem5> forLineItem5 = new MMConstraint<LineItem5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncotermsRule";
			definition = "If Incoterms is present, then Incoterms is not allowed within each occurrence of LineItemDetails. If Incoterms is not present, then Incoterms is allowed within each occurrence of LineItemDetails.";
			owner_lazy = () -> LineItem5.mmObject();
		}

		@Override
		public void executeValidator(LineItem5 obj) throws Exception {
			checkLineItem5(obj);
		}
	};

	/**
	 * If Incoterms is present, then Incoterms is not allowed within each
	 * occurrence of LineItemDetails. If Incoterms is not present, then
	 * Incoterms is allowed within each occurrence of LineItemDetails.
	 */
	public static void checkLineItem13(LineItem13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Incoterms is present, then Incoterms is not allowed within each
	 * occurrence of LineItemDetails. If Incoterms is not present, then
	 * Incoterms is allowed within each occurrence of LineItemDetails.
	 */
	public static void checkLineItem11(LineItem11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Incoterms is present, then Incoterms is not allowed within each
	 * occurrence of LineItemDetails. If Incoterms is not present, then
	 * Incoterms is allowed within each occurrence of LineItemDetails.
	 */
	public static void checkLineItem7(LineItem7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Incoterms is present, then Incoterms is not allowed within each
	 * occurrence of LineItemDetails. If Incoterms is not present, then
	 * Incoterms is allowed within each occurrence of LineItemDetails.
	 */
	public static void checkLineItem5(LineItem5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}