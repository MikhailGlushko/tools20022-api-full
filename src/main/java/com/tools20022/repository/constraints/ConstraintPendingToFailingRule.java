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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.msg.StatusAndReason15;
import java.util.Arrays;

/**
 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
 * settlement date instructed in the message, during the end of day reporting.
 */
public class ConstraintPendingToFailingRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus2Choice
	 * SettlementStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementStatus2Choice> forSettlementStatus2Choice = new MMConstraint<SettlementStatus2Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkSettlementStatus2Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			owner_lazy = () -> SettlementStatus2Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus7Choice
	 * SettlementStatus7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPendingToFailingRule#forSettlementStatus17Choice
	 * ConstraintPendingToFailingRule.forSettlementStatus17Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementStatus7Choice> forSettlementStatus7Choice = new MMConstraint<SettlementStatus7Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkSettlementStatus7Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPendingToFailingRule.forSettlementStatus17Choice);
			owner_lazy = () -> SettlementStatus7Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus13Choice
	 * SettlementStatus13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementStatus13Choice> forSettlementStatus13Choice = new MMConstraint<SettlementStatus13Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkSettlementStatus13Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			owner_lazy = () -> SettlementStatus13Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus4Choice
	 * SettlementStatus4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementStatus4Choice> forSettlementStatus4Choice = new MMConstraint<SettlementStatus4Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkSettlementStatus4Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			owner_lazy = () -> SettlementStatus4Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status2Choice Status2Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Status2Choice> forStatus2Choice = new MMConstraint<Status2Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkStatus2Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			owner_lazy = () -> Status2Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status4Choice Status4Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Status4Choice> forStatus4Choice = new MMConstraint<Status4Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkStatus4Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			owner_lazy = () -> Status4Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status9Choice Status9Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPendingToFailingRule#forStatus15Choice
	 * ConstraintPendingToFailingRule.forStatus15Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Status9Choice> forStatus9Choice = new MMConstraint<Status9Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkStatus9Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPendingToFailingRule.forStatus15Choice);
			owner_lazy = () -> Status9Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status11Choice
	 * Status11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Status11Choice> forStatus11Choice = new MMConstraint<Status11Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkStatus11Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			owner_lazy = () -> Status11Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus10Choice
	 * SettlementStatus10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPendingToFailingRule#forSettlementStatus18Choice
	 * ConstraintPendingToFailingRule.forSettlementStatus18Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementStatus10Choice> forSettlementStatus10Choice = new MMConstraint<SettlementStatus10Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkSettlementStatus10Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPendingToFailingRule.forSettlementStatus18Choice);
			owner_lazy = () -> SettlementStatus10Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus12Choice
	 * SettlementStatus12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementStatus12Choice> forSettlementStatus12Choice = new MMConstraint<SettlementStatus12Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkSettlementStatus12Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			owner_lazy = () -> SettlementStatus12Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus9Choice
	 * SettlementStatus9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPendingToFailingRule#forSettlementStatus16Choice
	 * ConstraintPendingToFailingRule.forSettlementStatus16Choice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementStatus9Choice> forSettlementStatus9Choice = new MMConstraint<SettlementStatus9Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkSettlementStatus9Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPendingToFailingRule.forSettlementStatus16Choice);
			owner_lazy = () -> SettlementStatus9Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus15Choice
	 * SettlementStatus15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementStatus15Choice> forSettlementStatus15Choice = new MMConstraint<SettlementStatus15Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkSettlementStatus15Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			owner_lazy = () -> SettlementStatus15Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason15
	 * StatusAndReason15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<StatusAndReason15> forStatusAndReason15 = new MMConstraint<StatusAndReason15>() {
		{
			validator = ConstraintPendingToFailingRule::checkStatusAndReason15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			owner_lazy = () -> StatusAndReason15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status15Choice
	 * Status15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPendingToFailingRule#forStatus18Choice
	 * ConstraintPendingToFailingRule.forStatus18Choice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPendingToFailingRule#forStatus9Choice
	 * ConstraintPendingToFailingRule.forStatus9Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<Status15Choice> forStatus15Choice = new MMConstraint<Status15Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkStatus15Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPendingToFailingRule.forStatus18Choice);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPendingToFailingRule.forStatus9Choice;
			owner_lazy = () -> Status15Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status16Choice
	 * Status16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Status16Choice> forStatus16Choice = new MMConstraint<Status16Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkStatus16Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			owner_lazy = () -> Status16Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus16Choice
	 * SettlementStatus16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPendingToFailingRule#forSettlementStatus9Choice
	 * ConstraintPendingToFailingRule.forSettlementStatus9Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementStatus16Choice> forSettlementStatus16Choice = new MMConstraint<SettlementStatus16Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkSettlementStatus16Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPendingToFailingRule.forSettlementStatus9Choice;
			owner_lazy = () -> SettlementStatus16Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus17Choice
	 * SettlementStatus17Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPendingToFailingRule#forSettlementStatus7Choice
	 * ConstraintPendingToFailingRule.forSettlementStatus7Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementStatus17Choice> forSettlementStatus17Choice = new MMConstraint<SettlementStatus17Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkSettlementStatus17Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPendingToFailingRule.forSettlementStatus7Choice;
			owner_lazy = () -> SettlementStatus17Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus18Choice
	 * SettlementStatus18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPendingToFailingRule#forSettlementStatus10Choice
	 * ConstraintPendingToFailingRule.forSettlementStatus10Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementStatus18Choice> forSettlementStatus18Choice = new MMConstraint<SettlementStatus18Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkSettlementStatus18Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPendingToFailingRule.forSettlementStatus10Choice;
			owner_lazy = () -> SettlementStatus18Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status18Choice
	 * Status18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPendingToFailingRule#forStatus15Choice
	 * ConstraintPendingToFailingRule.forStatus15Choice}</li>
	 * </ul>
	 */
	public static final MMConstraint<Status18Choice> forStatus18Choice = new MMConstraint<Status18Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkStatus18Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPendingToFailingRule.forStatus15Choice;
			owner_lazy = () -> Status18Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus21Choice
	 * SettlementStatus21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementStatus21Choice> forSettlementStatus21Choice = new MMConstraint<SettlementStatus21Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkSettlementStatus21Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			owner_lazy = () -> SettlementStatus21Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus20Choice
	 * SettlementStatus20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementStatus20Choice> forSettlementStatus20Choice = new MMConstraint<SettlementStatus20Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkSettlementStatus20Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			owner_lazy = () -> SettlementStatus20Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Status23Choice
	 * Status23Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Status23Choice> forStatus23Choice = new MMConstraint<Status23Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkStatus23Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			owner_lazy = () -> Status23Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus22Choice
	 * SettlementStatus22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingToFailingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementStatus22Choice> forSettlementStatus22Choice = new MMConstraint<SettlementStatus22Choice>() {
		{
			validator = ConstraintPendingToFailingRule::checkSettlementStatus22Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingToFailingRule";
			definition = "A pending transaction (PEND) becomes a failing transaction (PENF) on the settlement date instructed in the message, during the end of day reporting.";
			owner_lazy = () -> SettlementStatus22Choice.mmObject();
		}
	};

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkSettlementStatus2Choice(SettlementStatus2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkSettlementStatus7Choice(SettlementStatus7Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkSettlementStatus13Choice(SettlementStatus13Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkSettlementStatus4Choice(SettlementStatus4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkStatus2Choice(Status2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkStatus4Choice(Status4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkStatus9Choice(Status9Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkStatus11Choice(Status11Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkSettlementStatus10Choice(SettlementStatus10Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkSettlementStatus12Choice(SettlementStatus12Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkSettlementStatus9Choice(SettlementStatus9Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkSettlementStatus15Choice(SettlementStatus15Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkStatusAndReason15(StatusAndReason15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkStatus15Choice(Status15Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkStatus16Choice(Status16Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkSettlementStatus16Choice(SettlementStatus16Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkSettlementStatus17Choice(SettlementStatus17Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkSettlementStatus18Choice(SettlementStatus18Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkStatus18Choice(Status18Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkSettlementStatus21Choice(SettlementStatus21Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkSettlementStatus20Choice(SettlementStatus20Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkStatus23Choice(Status23Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * A pending transaction (PEND) becomes a failing transaction (PENF) on the
	 * settlement date instructed in the message, during the end of day
	 * reporting.
	 */
	public static void checkSettlementStatus22Choice(SettlementStatus22Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}