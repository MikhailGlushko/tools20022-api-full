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
import com.tools20022.repository.msg.SubscriptionBulkExecution2;
import com.tools20022.repository.msg.SubscriptionBulkExecution3;
import java.util.Arrays;

/**
 * Either IndividualExecutionDetails/CashSettlementDetails or
 * BulkCashSettlementDetails may be present, but not both.
 */
public class ConstraintBulkCashSettlementDetails4Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution2
	 * SubscriptionBulkExecution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetails4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either IndividualExecutionDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkExecution2> forSubscriptionBulkExecution2 = new MMConstraint<SubscriptionBulkExecution2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetails4Rule";
			definition = "Either IndividualExecutionDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.";
			owner_lazy = () -> SubscriptionBulkExecution2.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkExecution2 obj) throws Exception {
			checkSubscriptionBulkExecution2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3
	 * SubscriptionBulkExecution3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetails4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either IndividualExecutionDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetailsRule#forSubscriptionBulkExecution4
	 * ConstraintBulkCashSettlementDetailsRule.forSubscriptionBulkExecution4}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkExecution3> forSubscriptionBulkExecution3 = new MMConstraint<SubscriptionBulkExecution3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetails4Rule";
			definition = "Either IndividualExecutionDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetailsRule.forSubscriptionBulkExecution4);
			owner_lazy = () -> SubscriptionBulkExecution3.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkExecution3 obj) throws Exception {
			checkSubscriptionBulkExecution3(obj);
		}
	};

	/**
	 * Either IndividualExecutionDetails/CashSettlementDetails or
	 * BulkCashSettlementDetails may be present, but not both.
	 */
	public static void checkSubscriptionBulkExecution2(SubscriptionBulkExecution2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either IndividualExecutionDetails/CashSettlementDetails or
	 * BulkCashSettlementDetails may be present, but not both.
	 */
	public static void checkSubscriptionBulkExecution3(SubscriptionBulkExecution3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}