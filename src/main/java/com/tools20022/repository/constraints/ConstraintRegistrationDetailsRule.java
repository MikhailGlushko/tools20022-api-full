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
import com.tools20022.repository.area.sese.*;
import java.util.Arrays;

/**
 * If SettlementParameters/Registration is present with code YREG (Registration
 * to take place), then additional registration details must be specified in the
 * AdditonalInformation/RegistrationDetails field of the Party (Receiving or
 * DeliveringSettlementParties) under whom the registration must take place,
 * unless this information is already available at the account servicer via
 * standing instruction/SLA.
 */
public class ConstraintRegistrationDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV08
	 * SecuritiesSettlementTransactionInstructionV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementParameters/Registration is present with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationDetailsRule#forSecuritiesSettlementTransactionInstructionV07
	 * ConstraintRegistrationDetailsRule.
	 * forSecuritiesSettlementTransactionInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV08> forSecuritiesSettlementTransactionInstructionV08 = new MMConstraint<SecuritiesSettlementTransactionInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetailsRule";
			definition = "If SettlementParameters/Registration is present with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRegistrationDetailsRule.forSecuritiesSettlementTransactionInstructionV07;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV08 obj) throws Exception {
			checkSecuritiesSettlementTransactionInstructionV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V08
	 * SecuritiesSettlementTransactionInstruction002V08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementParameters/Registration is used with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V08> forSecuritiesSettlementTransactionInstruction002V08 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetailsRule";
			definition = "If SettlementParameters/Registration is used with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstruction002V08 obj) throws Exception {
			checkSecuritiesSettlementTransactionInstruction002V08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV07
	 * SecuritiesSettlementTransactionInstructionV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementParameters/Registration is present with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationDetailsRule#forSecuritiesSettlementTransactionInstructionV08
	 * ConstraintRegistrationDetailsRule.
	 * forSecuritiesSettlementTransactionInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationDetailsRule#forSecuritiesSettlementTransactionInstructionV06
	 * ConstraintRegistrationDetailsRule.
	 * forSecuritiesSettlementTransactionInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV07> forSecuritiesSettlementTransactionInstructionV07 = new MMConstraint<SecuritiesSettlementTransactionInstructionV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetailsRule";
			definition = "If SettlementParameters/Registration is present with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRegistrationDetailsRule.forSecuritiesSettlementTransactionInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRegistrationDetailsRule.forSecuritiesSettlementTransactionInstructionV06;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV07 obj) throws Exception {
			checkSecuritiesSettlementTransactionInstructionV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V07
	 * SecuritiesSettlementTransactionInstruction002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementParameters/Registration is used with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V07> forSecuritiesSettlementTransactionInstruction002V07 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetailsRule";
			definition = "If SettlementParameters/Registration is used with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstruction002V07 obj) throws Exception {
			checkSecuritiesSettlementTransactionInstruction002V07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01
	 * SecuritiesSettlementTransactionInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementParameters/Registration is used with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV01> forSecuritiesSettlementTransactionInstructionV01 = new MMConstraint<SecuritiesSettlementTransactionInstructionV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetailsRule";
			definition = "If SettlementParameters/Registration is used with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV01 obj) throws Exception {
			checkSecuritiesSettlementTransactionInstructionV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV02
	 * SecuritiesSettlementTransactionInstructionV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementParameters/Registration is used with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV02> forSecuritiesSettlementTransactionInstructionV02 = new MMConstraint<SecuritiesSettlementTransactionInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetailsRule";
			definition = "If SettlementParameters/Registration is used with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV02 obj) throws Exception {
			checkSecuritiesSettlementTransactionInstructionV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV03
	 * SecuritiesSettlementTransactionInstructionV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementParameters/Registration is used with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV03> forSecuritiesSettlementTransactionInstructionV03 = new MMConstraint<SecuritiesSettlementTransactionInstructionV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetailsRule";
			definition = "If SettlementParameters/Registration is used with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV03 obj) throws Exception {
			checkSecuritiesSettlementTransactionInstructionV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04
	 * SecuritiesSettlementTransactionInstructionV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementParameters/Registration is used with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationDetailsRule#forSecuritiesSettlementTransactionInstructionV05
	 * ConstraintRegistrationDetailsRule.
	 * forSecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV04> forSecuritiesSettlementTransactionInstructionV04 = new MMConstraint<SecuritiesSettlementTransactionInstructionV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetailsRule";
			definition = "If SettlementParameters/Registration is used with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRegistrationDetailsRule.forSecuritiesSettlementTransactionInstructionV05);
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV04 obj) throws Exception {
			checkSecuritiesSettlementTransactionInstructionV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05
	 * SecuritiesSettlementTransactionInstructionV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementParameters/Registration is used with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationDetailsRule#forSecuritiesSettlementTransactionInstructionV06
	 * ConstraintRegistrationDetailsRule.
	 * forSecuritiesSettlementTransactionInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationDetailsRule#forSecuritiesSettlementTransactionInstructionV04
	 * ConstraintRegistrationDetailsRule.
	 * forSecuritiesSettlementTransactionInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV05> forSecuritiesSettlementTransactionInstructionV05 = new MMConstraint<SecuritiesSettlementTransactionInstructionV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetailsRule";
			definition = "If SettlementParameters/Registration is used with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRegistrationDetailsRule.forSecuritiesSettlementTransactionInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRegistrationDetailsRule.forSecuritiesSettlementTransactionInstructionV04;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV05 obj) throws Exception {
			checkSecuritiesSettlementTransactionInstructionV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV06
	 * SecuritiesSettlementTransactionInstructionV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementParameters/Registration is used with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationDetailsRule#forSecuritiesSettlementTransactionInstructionV07
	 * ConstraintRegistrationDetailsRule.
	 * forSecuritiesSettlementTransactionInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationDetailsRule#forSecuritiesSettlementTransactionInstructionV05
	 * ConstraintRegistrationDetailsRule.
	 * forSecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV06> forSecuritiesSettlementTransactionInstructionV06 = new MMConstraint<SecuritiesSettlementTransactionInstructionV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetailsRule";
			definition = "If SettlementParameters/Registration is used with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRegistrationDetailsRule.forSecuritiesSettlementTransactionInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRegistrationDetailsRule.forSecuritiesSettlementTransactionInstructionV05;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV06 obj) throws Exception {
			checkSecuritiesSettlementTransactionInstructionV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06
	 * SecuritiesSettlementTransactionInstruction002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SettlementParameters/Registration is used with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V06> forSecuritiesSettlementTransactionInstruction002V06 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetailsRule";
			definition = "If SettlementParameters/Registration is used with code YREG (Registration to take place), then additional registration details must be specified in the AdditonalInformation/RegistrationDetails field of the Party (Receiving or DeliveringSettlementParties) under whom the registration must take place, unless this information is already available at the account servicer via standing instruction/SLA.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstruction002V06 obj) throws Exception {
			checkSecuritiesSettlementTransactionInstruction002V06(obj);
		}
	};

	/**
	 * If SettlementParameters/Registration is present with code YREG
	 * (Registration to take place), then additional registration details must
	 * be specified in the AdditonalInformation/RegistrationDetails field of the
	 * Party (Receiving or DeliveringSettlementParties) under whom the
	 * registration must take place, unless this information is already
	 * available at the account servicer via standing instruction/SLA.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV08(SecuritiesSettlementTransactionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementParameters/Registration is used with code YREG (Registration
	 * to take place), then additional registration details must be specified in
	 * the AdditonalInformation/RegistrationDetails field of the Party
	 * (Receiving or DeliveringSettlementParties) under whom the registration
	 * must take place, unless this information is already available at the
	 * account servicer via standing instruction/SLA.
	 */
	public static void checkSecuritiesSettlementTransactionInstruction002V08(SecuritiesSettlementTransactionInstruction002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementParameters/Registration is present with code YREG
	 * (Registration to take place), then additional registration details must
	 * be specified in the AdditonalInformation/RegistrationDetails field of the
	 * Party (Receiving or DeliveringSettlementParties) under whom the
	 * registration must take place, unless this information is already
	 * available at the account servicer via standing instruction/SLA.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV07(SecuritiesSettlementTransactionInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementParameters/Registration is used with code YREG (Registration
	 * to take place), then additional registration details must be specified in
	 * the AdditonalInformation/RegistrationDetails field of the Party
	 * (Receiving or DeliveringSettlementParties) under whom the registration
	 * must take place, unless this information is already available at the
	 * account servicer via standing instruction/SLA.
	 */
	public static void checkSecuritiesSettlementTransactionInstruction002V07(SecuritiesSettlementTransactionInstruction002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementParameters/Registration is used with code YREG (Registration
	 * to take place), then additional registration details must be specified in
	 * the AdditonalInformation/RegistrationDetails field of the Party
	 * (Receiving or DeliveringSettlementParties) under whom the registration
	 * must take place, unless this information is already available at the
	 * account servicer via standing instruction/SLA.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV01(SecuritiesSettlementTransactionInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementParameters/Registration is used with code YREG (Registration
	 * to take place), then additional registration details must be specified in
	 * the AdditonalInformation/RegistrationDetails field of the Party
	 * (Receiving or DeliveringSettlementParties) under whom the registration
	 * must take place, unless this information is already available at the
	 * account servicer via standing instruction/SLA.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV02(SecuritiesSettlementTransactionInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementParameters/Registration is used with code YREG (Registration
	 * to take place), then additional registration details must be specified in
	 * the AdditonalInformation/RegistrationDetails field of the Party
	 * (Receiving or DeliveringSettlementParties) under whom the registration
	 * must take place, unless this information is already available at the
	 * account servicer via standing instruction/SLA.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV03(SecuritiesSettlementTransactionInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementParameters/Registration is used with code YREG (Registration
	 * to take place), then additional registration details must be specified in
	 * the AdditonalInformation/RegistrationDetails field of the Party
	 * (Receiving or DeliveringSettlementParties) under whom the registration
	 * must take place, unless this information is already available at the
	 * account servicer via standing instruction/SLA.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV04(SecuritiesSettlementTransactionInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementParameters/Registration is used with code YREG (Registration
	 * to take place), then additional registration details must be specified in
	 * the AdditonalInformation/RegistrationDetails field of the Party
	 * (Receiving or DeliveringSettlementParties) under whom the registration
	 * must take place, unless this information is already available at the
	 * account servicer via standing instruction/SLA.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV05(SecuritiesSettlementTransactionInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementParameters/Registration is used with code YREG (Registration
	 * to take place), then additional registration details must be specified in
	 * the AdditonalInformation/RegistrationDetails field of the Party
	 * (Receiving or DeliveringSettlementParties) under whom the registration
	 * must take place, unless this information is already available at the
	 * account servicer via standing instruction/SLA.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV06(SecuritiesSettlementTransactionInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If SettlementParameters/Registration is used with code YREG (Registration
	 * to take place), then additional registration details must be specified in
	 * the AdditonalInformation/RegistrationDetails field of the Party
	 * (Receiving or DeliveringSettlementParties) under whom the registration
	 * must take place, unless this information is already available at the
	 * account servicer via standing instruction/SLA.
	 */
	public static void checkSecuritiesSettlementTransactionInstruction002V06(SecuritiesSettlementTransactionInstruction002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}