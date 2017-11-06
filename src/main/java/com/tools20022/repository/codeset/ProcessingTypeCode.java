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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of processing restrictions the central system must apply.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode#mmRejection
 * ProcessingTypeCode.mmRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode#mmCSDValidationHold
 * ProcessingTypeCode.mmCSDValidationHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode#mmReservation
 * ProcessingTypeCode.mmReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode#mmBlocking
 * ProcessingTypeCode.mmBlocking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode#mmEarmarking
 * ProcessingTypeCode.mmEarmarking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode#mmEarmarkingForAutoCollateralisation
 * ProcessingTypeCode.mmEarmarkingForAutoCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode#mmDeliverable
 * ProcessingTypeCode.mmDeliverable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode#mmCollateralised
 * ProcessingTypeCode.mmCollateralised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode#mmCoSDBlocking
 * ProcessingTypeCode.mmCoSDBlocking}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ProcessingType1Code
 * ProcessingType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RJCT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProcessingTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of processing restrictions the central system must apply."
 * </li>
 * </ul>
 */
public class ProcessingTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Restriction is the rejection during the settlement instruction
	 * validation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
	 * ProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Restriction is the rejection during the settlement instruction validation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejection";
			definition = "Restriction is the rejection during the settlement instruction validation.";
			owner_lazy = () -> ProcessingTypeCode.mmObject();
			codeName = "RJCT";
		}
	};
	/**
	 * Restriction is setting the CSD validation automatically to hold when
	 * accepting a settlement instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
	 * ProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CVHD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDValidationHold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Restriction is setting the CSD validation automatically to hold when accepting a settlement instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCSDValidationHold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDValidationHold";
			definition = "Restriction is setting the CSD validation automatically to hold when accepting a settlement instruction.";
			owner_lazy = () -> ProcessingTypeCode.mmObject();
			codeName = "CVHD";
		}
	};
	/**
	 * Restriction is the creation of a reservation of a cash balance or a
	 * securities position for a specific purpose.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
	 * ProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSVT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Restriction is the creation of a reservation of a cash balance or a securities position for a specific purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReservation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reservation";
			definition = "Restriction is the creation of a reservation of a cash balance or a securities position for a specific purpose.";
			owner_lazy = () -> ProcessingTypeCode.mmObject();
			codeName = "RSVT";
		}
	};
	/**
	 * Restriction is the blocking of a party, securities account, security or
	 * cash account from settlement, blocking of securities position or cash
	 * balance for a specific purpose
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
	 * ProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLCK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Restriction is the blocking of a party, securities account, security or cash account from settlement, blocking of securities position or cash balance for a specific purpose"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBlocking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocking";
			definition = "Restriction is the blocking of a party, securities account, security or cash account from settlement, blocking of securities position or cash balance for a specific purpose";
			owner_lazy = () -> ProcessingTypeCode.mmObject();
			codeName = "BLCK";
		}
	};
	/**
	 * Restriction of linked to the balance type that defines and manages
	 * position types for securities positions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
	 * ProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EARM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Earmarking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Restriction of linked to the balance type that defines and manages position types for securities positions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEarmarking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Earmarking";
			definition = "Restriction of linked to the balance type that defines and manages position types for securities positions.";
			owner_lazy = () -> ProcessingTypeCode.mmObject();
			codeName = "EARM";
		}
	};
	/**
	 * Restriction of linked to the balance type that defines and manages
	 * position types for securities positions for auto-collateralisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
	 * ProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EFAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarmarkingForAutoCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Restriction of linked to the balance type that defines and manages position types for securities positions for auto-collateralisation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEarmarkingForAutoCollateralisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarmarkingForAutoCollateralisation";
			definition = "Restriction of linked to the balance type that defines and manages position types for securities positions for auto-collateralisation.";
			owner_lazy = () -> ProcessingTypeCode.mmObject();
			codeName = "EFAC";
		}
	};
	/**
	 * No restriction has been defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
	 * ProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deliverable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No restriction has been defined."</li>
	 * </ul>
	 */
	public static final MMCode mmDeliverable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deliverable";
			definition = "No restriction has been defined.";
			owner_lazy = () -> ProcessingTypeCode.mmObject();
			codeName = "DLVR";
		}
	};
	/**
	 * Restriction is linked to a sub-pledged collateral transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
	 * ProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateralised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Restriction is linked to a sub-pledged collateral transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmCollateralised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateralised";
			definition = "Restriction is linked to a sub-pledged collateral transaction.";
			owner_lazy = () -> ProcessingTypeCode.mmObject();
			codeName = "COLD";
		}
	};
	/**
	 * Restriction does not support any partial execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
	 * ProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoSDBlocking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Restriction does not support any partial execution."</li>
	 * </ul>
	 */
	public static final MMCode mmCoSDBlocking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoSDBlocking";
			definition = "Restriction does not support any partial execution.";
			owner_lazy = () -> ProcessingTypeCode.mmObject();
			codeName = "CSDB";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("RJCT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProcessingTypeCode";
				definition = "Specifies the type of processing restrictions the central system must apply.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProcessingTypeCode.mmRejection, com.tools20022.repository.codeset.ProcessingTypeCode.mmCSDValidationHold,
						com.tools20022.repository.codeset.ProcessingTypeCode.mmReservation, com.tools20022.repository.codeset.ProcessingTypeCode.mmBlocking, com.tools20022.repository.codeset.ProcessingTypeCode.mmEarmarking,
						com.tools20022.repository.codeset.ProcessingTypeCode.mmEarmarkingForAutoCollateralisation, com.tools20022.repository.codeset.ProcessingTypeCode.mmDeliverable,
						com.tools20022.repository.codeset.ProcessingTypeCode.mmCollateralised, com.tools20022.repository.codeset.ProcessingTypeCode.mmCoSDBlocking);
				derivation_lazy = () -> Arrays.asList(ProcessingType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}