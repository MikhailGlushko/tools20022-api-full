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
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * Reference/OtherReference should be used to reference a transfer cancellation
 * request 'message' sent in a proprietary way or used for a system reference.
 * If Reference/OtherReference is present, References/OtherReference/MessageName
 * must contain, for example, 'fax' or 'phone' or 'email'.
 */
public class ConstraintOtherReferenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06
	 * TransferCancellationStatusReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference/OtherReference should be used to reference a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, References/OtherReference/MessageName must contain, for example, 'fax' or 'phone' or 'email'."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferCancellationStatusReportV05
	 * ConstraintOtherReferenceRule.forTransferCancellationStatusReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferCancellationStatusReportV06> forTransferCancellationStatusReportV06 = new MMConstraint<TransferCancellationStatusReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "Reference/OtherReference should be used to reference a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, References/OtherReference/MessageName must contain, for example, 'fax' or 'phone' or 'email'.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferCancellationStatusReportV05;
			owner_lazy = () -> TransferCancellationStatusReportV06.mmObject();
		}

		@Override
		public void executeValidator(TransferCancellationStatusReportV06 obj) throws Exception {
			checkTransferCancellationStatusReportV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV06
	 * TransferInstructionStatusReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferInstructionStatusReportV05
	 * ConstraintOtherReferenceRule.forTransferInstructionStatusReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInstructionStatusReportV06> forTransferInstructionStatusReportV06 = new MMConstraint<TransferInstructionStatusReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferInstructionStatusReportV05;
			owner_lazy = () -> TransferInstructionStatusReportV06.mmObject();
		}

		@Override
		public void executeValidator(TransferInstructionStatusReportV06 obj) throws Exception {
			checkTransferInstructionStatusReportV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV05
	 * TransferInstructionStatusReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferInstructionStatusReportV06
	 * ConstraintOtherReferenceRule.forTransferInstructionStatusReportV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferInstructionStatusReportV04
	 * ConstraintOtherReferenceRule.forTransferInstructionStatusReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInstructionStatusReportV05> forTransferInstructionStatusReportV05 = new MMConstraint<TransferInstructionStatusReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferInstructionStatusReportV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferInstructionStatusReportV04;
			owner_lazy = () -> TransferInstructionStatusReportV05.mmObject();
		}

		@Override
		public void executeValidator(TransferInstructionStatusReportV05 obj) throws Exception {
			checkTransferInstructionStatusReportV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV05
	 * TransferCancellationStatusReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference/OtherReference should be used to reference a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, References/OtherReference/MessageName must contain, for example, 'fax' or 'phone' or 'email'."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferCancellationStatusReportV06
	 * ConstraintOtherReferenceRule.forTransferCancellationStatusReportV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferCancellationStatusReportV04
	 * ConstraintOtherReferenceRule.forTransferCancellationStatusReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferCancellationStatusReportV05> forTransferCancellationStatusReportV05 = new MMConstraint<TransferCancellationStatusReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "Reference/OtherReference should be used to reference a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, References/OtherReference/MessageName must contain, for example, 'fax' or 'phone' or 'email'.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferCancellationStatusReportV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferCancellationStatusReportV04;
			owner_lazy = () -> TransferCancellationStatusReportV05.mmObject();
		}

		@Override
		public void executeValidator(TransferCancellationStatusReportV05 obj) throws Exception {
			checkTransferCancellationStatusReportV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV02
	 * TransferCancellationStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used to reference a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferCancellationStatusReportV02> forTransferCancellationStatusReportV02 = new MMConstraint<TransferCancellationStatusReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "OtherReference should be used to reference a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> TransferCancellationStatusReportV02.mmObject();
		}

		@Override
		public void executeValidator(TransferCancellationStatusReportV02 obj) throws Exception {
			checkTransferCancellationStatusReportV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV03
	 * TransferCancellationStatusReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used to reference a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferCancellationStatusReportV04
	 * ConstraintOtherReferenceRule.forTransferCancellationStatusReportV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferCancellationStatusReportV03> forTransferCancellationStatusReportV03 = new MMConstraint<TransferCancellationStatusReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "OtherReference should be used to reference a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferCancellationStatusReportV04);
			owner_lazy = () -> TransferCancellationStatusReportV03.mmObject();
		}

		@Override
		public void executeValidator(TransferCancellationStatusReportV03 obj) throws Exception {
			checkTransferCancellationStatusReportV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02
	 * TransferInstructionStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInstructionStatusReportV02> forTransferInstructionStatusReportV02 = new MMConstraint<TransferInstructionStatusReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			owner_lazy = () -> TransferInstructionStatusReportV02.mmObject();
		}

		@Override
		public void executeValidator(TransferInstructionStatusReportV02 obj) throws Exception {
			checkTransferInstructionStatusReportV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03
	 * TransferInstructionStatusReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferInstructionStatusReportV04
	 * ConstraintOtherReferenceRule.forTransferInstructionStatusReportV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInstructionStatusReportV03> forTransferInstructionStatusReportV03 = new MMConstraint<TransferInstructionStatusReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferInstructionStatusReportV04);
			owner_lazy = () -> TransferInstructionStatusReportV03.mmObject();
		}

		@Override
		public void executeValidator(TransferInstructionStatusReportV03 obj) throws Exception {
			checkTransferInstructionStatusReportV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV04
	 * TransferInstructionStatusReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferInstructionStatusReportV05
	 * ConstraintOtherReferenceRule.forTransferInstructionStatusReportV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferInstructionStatusReportV03
	 * ConstraintOtherReferenceRule.forTransferInstructionStatusReportV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInstructionStatusReportV04> forTransferInstructionStatusReportV04 = new MMConstraint<TransferInstructionStatusReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferInstructionStatusReportV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferInstructionStatusReportV03;
			owner_lazy = () -> TransferInstructionStatusReportV04.mmObject();
		}

		@Override
		public void executeValidator(TransferInstructionStatusReportV04 obj) throws Exception {
			checkTransferInstructionStatusReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV04
	 * TransferCancellationStatusReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference/OtherReference should be used to reference a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, References/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferCancellationStatusReportV05
	 * ConstraintOtherReferenceRule.forTransferCancellationStatusReportV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferCancellationStatusReportV03
	 * ConstraintOtherReferenceRule.forTransferCancellationStatusReportV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferCancellationStatusReportV04> forTransferCancellationStatusReportV04 = new MMConstraint<TransferCancellationStatusReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "Reference/OtherReference should be used to reference a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, References/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferCancellationStatusReportV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferCancellationStatusReportV03;
			owner_lazy = () -> TransferCancellationStatusReportV04.mmObject();
		}

		@Override
		public void executeValidator(TransferCancellationStatusReportV04 obj) throws Exception {
			checkTransferCancellationStatusReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference1
	 * MessageAndBusinessReference1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used for transfers sent by proprietary way or for system references. \nIf OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', for example."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference1> forMessageAndBusinessReference1 = new MMConstraint<MessageAndBusinessReference1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "OtherReference should be used for transfers sent by proprietary way or for system references. \nIf OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', for example.";
			owner_lazy = () -> MessageAndBusinessReference1.mmObject();
		}

		@Override
		public void executeValidator(MessageAndBusinessReference1 obj) throws Exception {
			checkMessageAndBusinessReference1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference6
	 * MessageAndBusinessReference6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forMessageAndBusinessReference7
	 * ConstraintOtherReferenceRule.forMessageAndBusinessReference7}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference6> forMessageAndBusinessReference6 = new MMConstraint<MessageAndBusinessReference6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If OtherReference is present, OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forMessageAndBusinessReference7);
			owner_lazy = () -> MessageAndBusinessReference6.mmObject();
		}

		@Override
		public void executeValidator(MessageAndBusinessReference6 obj) throws Exception {
			checkMessageAndBusinessReference6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference7
	 * MessageAndBusinessReference7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forMessageAndBusinessReference8
	 * ConstraintOtherReferenceRule.forMessageAndBusinessReference8}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forMessageAndBusinessReference6
	 * ConstraintOtherReferenceRule.forMessageAndBusinessReference6}</li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference7> forMessageAndBusinessReference7 = new MMConstraint<MessageAndBusinessReference7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forMessageAndBusinessReference8);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forMessageAndBusinessReference6;
			owner_lazy = () -> MessageAndBusinessReference7.mmObject();
		}

		@Override
		public void executeValidator(MessageAndBusinessReference7 obj) throws Exception {
			checkMessageAndBusinessReference7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8
	 * MessageAndBusinessReference8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forMessageAndBusinessReference11
	 * ConstraintOtherReferenceRule.forMessageAndBusinessReference11}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forMessageAndBusinessReference7
	 * ConstraintOtherReferenceRule.forMessageAndBusinessReference7}</li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference8> forMessageAndBusinessReference8 = new MMConstraint<MessageAndBusinessReference8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forMessageAndBusinessReference11);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forMessageAndBusinessReference7;
			owner_lazy = () -> MessageAndBusinessReference8.mmObject();
		}

		@Override
		public void executeValidator(MessageAndBusinessReference8 obj) throws Exception {
			checkMessageAndBusinessReference8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference11
	 * MessageAndBusinessReference11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forMessageAndBusinessReference8
	 * ConstraintOtherReferenceRule.forMessageAndBusinessReference8}</li>
	 * </ul>
	 */
	public static final MMConstraint<MessageAndBusinessReference11> forMessageAndBusinessReference11 = new MMConstraint<MessageAndBusinessReference11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReferenceRule";
			definition = "Reference/OtherReference should be used to reference a transfer instruction or a transfer cancellation request 'message' sent in a proprietary way or used for a system reference. If Reference/OtherReference is present, Reference/OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forMessageAndBusinessReference8;
			owner_lazy = () -> MessageAndBusinessReference11.mmObject();
		}

		@Override
		public void executeValidator(MessageAndBusinessReference11 obj) throws Exception {
			checkMessageAndBusinessReference11(obj);
		}
	};

	/**
	 * Reference/OtherReference should be used to reference a transfer
	 * cancellation request 'message' sent in a proprietary way or used for a
	 * system reference. If Reference/OtherReference is present,
	 * References/OtherReference/MessageName must contain, for example, 'fax' or
	 * 'phone' or 'email'.
	 */
	public static void checkTransferCancellationStatusReportV06(TransferCancellationStatusReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Reference/OtherReference should be used to reference a transfer
	 * instruction or a transfer cancellation request 'message' sent in a
	 * proprietary way or used for a system reference. If
	 * Reference/OtherReference is present, Reference/OtherReference/MessageName
	 * must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkTransferInstructionStatusReportV06(TransferInstructionStatusReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Reference/OtherReference should be used to reference a transfer
	 * instruction or a transfer cancellation request 'message' sent in a
	 * proprietary way or used for a system reference. If
	 * Reference/OtherReference is present, Reference/OtherReference/MessageName
	 * must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkTransferInstructionStatusReportV05(TransferInstructionStatusReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Reference/OtherReference should be used to reference a transfer
	 * cancellation request 'message' sent in a proprietary way or used for a
	 * system reference. If Reference/OtherReference is present,
	 * References/OtherReference/MessageName must contain, for example, 'fax' or
	 * 'phone' or 'email'.
	 */
	public static void checkTransferCancellationStatusReportV05(TransferCancellationStatusReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used to reference a transfer cancellation
	 * request 'message' sent in a proprietary way or used for a system
	 * reference. If OtherReference is present, OtherReference/MessageName must
	 * contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkTransferCancellationStatusReportV02(TransferCancellationStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used to reference a transfer cancellation
	 * request 'message' sent in a proprietary way or used for a system
	 * reference. If OtherReference is present, OtherReference/MessageName must
	 * contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkTransferCancellationStatusReportV03(TransferCancellationStatusReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used to reference a transfer instruction or a
	 * transfer cancellation request 'message' sent in a proprietary way or used
	 * for a system reference. If OtherReference is present,
	 * OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkTransferInstructionStatusReportV02(TransferInstructionStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used to reference a transfer instruction or a
	 * transfer cancellation request 'message' sent in a proprietary way or used
	 * for a system reference. If OtherReference is present,
	 * OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkTransferInstructionStatusReportV03(TransferInstructionStatusReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Reference/OtherReference should be used to reference a transfer
	 * instruction or a transfer cancellation request 'message' sent in a
	 * proprietary way or used for a system reference. If
	 * Reference/OtherReference is present, Reference/OtherReference/MessageName
	 * must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkTransferInstructionStatusReportV04(TransferInstructionStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Reference/OtherReference should be used to reference a transfer
	 * cancellation request 'message' sent in a proprietary way or used for a
	 * system reference. If Reference/OtherReference is present,
	 * References/OtherReference/MessageName must contain 'fax' or 'phone' or
	 * 'email', etc.
	 */
	public static void checkTransferCancellationStatusReportV04(TransferCancellationStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used for transfers sent by proprietary way or
	 * for system references. If OtherReference is present,
	 * OtherReference/MessageName must contain 'fax' or 'phone' or 'email', for
	 * example.
	 */
	public static void checkMessageAndBusinessReference1(MessageAndBusinessReference1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OtherReference should be used to reference a transfer instruction or a
	 * transfer cancellation request 'message' sent in a proprietary way or used
	 * for a system reference. If OtherReference is present,
	 * OtherReference/MessageName must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkMessageAndBusinessReference6(MessageAndBusinessReference6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Reference/OtherReference should be used to reference a transfer
	 * instruction or a transfer cancellation request 'message' sent in a
	 * proprietary way or used for a system reference. If
	 * Reference/OtherReference is present, Reference/OtherReference/MessageName
	 * must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkMessageAndBusinessReference7(MessageAndBusinessReference7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Reference/OtherReference should be used to reference a transfer
	 * instruction or a transfer cancellation request 'message' sent in a
	 * proprietary way or used for a system reference. If
	 * Reference/OtherReference is present, Reference/OtherReference/MessageName
	 * must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkMessageAndBusinessReference8(MessageAndBusinessReference8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Reference/OtherReference should be used to reference a transfer
	 * instruction or a transfer cancellation request 'message' sent in a
	 * proprietary way or used for a system reference. If
	 * Reference/OtherReference is present, Reference/OtherReference/MessageName
	 * must contain 'fax' or 'phone' or 'email', etc.
	 */
	public static void checkMessageAndBusinessReference11(MessageAndBusinessReference11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}