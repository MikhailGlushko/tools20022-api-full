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
 * Specifies further instructions concerning the processing of a payment
 * instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#mmPayTheBeneficiary
 * InstructionCode.mmPayTheBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.InstructionCode#mmTimeTill
 * InstructionCode.mmTimeTill}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.InstructionCode#mmTimeFrom
 * InstructionCode.mmTimeFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#mmPayCreditorByCheque
 * InstructionCode.mmPayCreditorByCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#mmHoldCashForCreditor
 * InstructionCode.mmHoldCashForCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#mmPhoneBeneficiary
 * InstructionCode.mmPhoneBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.InstructionCode#mmTelecom
 * InstructionCode.mmTelecom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#mmPhoneNextAgent
 * InstructionCode.mmPhoneNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#mmTelecomNextAgent
 * InstructionCode.mmTelecomNextAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Instruction1Code
 * Instruction1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Instruction3Code
 * Instruction3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Instruction4Code
 * Instruction4Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Instruction5Code
 * Instruction5Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartialInstruction3Code
 * PartialInstruction3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Instruction6Code
 * Instruction6Code}</li>
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
 * <li>"PBEN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies further instructions concerning the processing of a payment instruction."
 * </li>
 * </ul>
 */
public class InstructionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (Ultimate) creditor to be paid only after verification of identity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PBEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayTheBeneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(Ultimate) creditor to be paid only after verification of identity."</li>
	 * </ul>
	 */
	public static final MMCode mmPayTheBeneficiary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PayTheBeneficiary";
			definition = "(Ultimate) creditor to be paid only after verification of identity.";
			owner_lazy = () -> InstructionCode.mmObject();
			codeName = "PBEN";
		}
	};
	/**
	 * Payment instruction is valid and eligible for execution until the date
	 * and time stipulated. Otherwise, the payment instruction will be rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TTIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeTill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment instruction is valid and eligible for execution until the date and time stipulated. Otherwise, the payment instruction will be rejected."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTimeTill = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TimeTill";
			definition = "Payment instruction is valid and eligible for execution until the date and time stipulated. Otherwise, the payment instruction will be rejected.";
			owner_lazy = () -> InstructionCode.mmObject();
			codeName = "TTIL";
		}
	};
	/**
	 * Payment instruction will be valid and eligible for execution from the
	 * date and time stipulated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TFRO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment instruction will be valid and eligible for execution from the date and time stipulated."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTimeFrom = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TimeFrom";
			definition = "Payment instruction will be valid and eligible for execution from the date and time stipulated.";
			owner_lazy = () -> InstructionCode.mmObject();
			codeName = "TFRO";
		}
	};
	/**
	 * (Ultimate) creditor must be paid by cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHQB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayCreditorByCheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "(Ultimate) creditor must be paid by cheque."</li>
	 * </ul>
	 */
	public static final MMCode mmPayCreditorByCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PayCreditorByCheque";
			definition = "(Ultimate) creditor must be paid by cheque.";
			owner_lazy = () -> InstructionCode.mmObject();
			codeName = "CHQB";
		}
	};
	/**
	 * Amount of money must be held for the (ultimate) creditor, who will call.
	 * Pay on identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldCashForCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money must be held for the (ultimate) creditor, who will call. Pay on identification."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmHoldCashForCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldCashForCreditor";
			definition = "Amount of money must be held for the (ultimate) creditor, who will call. Pay on identification.";
			owner_lazy = () -> InstructionCode.mmObject();
			codeName = "HOLD";
		}
	};
	/**
	 * Please advise/contact (ultimate) creditor/claimant by phone
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHOB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhoneBeneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Please advise/contact (ultimate) creditor/claimant by phone"</li>
	 * </ul>
	 */
	public static final MMCode mmPhoneBeneficiary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhoneBeneficiary";
			definition = "Please advise/contact (ultimate) creditor/claimant by phone";
			owner_lazy = () -> InstructionCode.mmObject();
			codeName = "PHOB";
		}
	};
	/**
	 * Please advise/contact (ultimate) creditor/claimant by the most efficient
	 * means of telecommunication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TELB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Telecom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Please advise/contact (ultimate) creditor/claimant by the most efficient means of telecommunication."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTelecom = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Telecom";
			definition = "Please advise/contact (ultimate) creditor/claimant by the most efficient means of telecommunication.";
			owner_lazy = () -> InstructionCode.mmObject();
			codeName = "TELB";
		}
	};
	/**
	 * Please advise/contact next agent by phone.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHOA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhoneNextAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Please advise/contact next agent by phone."</li>
	 * </ul>
	 */
	public static final MMCode mmPhoneNextAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhoneNextAgent";
			definition = "Please advise/contact next agent by phone.";
			owner_lazy = () -> InstructionCode.mmObject();
			codeName = "PHOA";
		}
	};
	/**
	 * Please advise/contact next agent by the most efficient means of
	 * telecommunication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TELA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelecomNextAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Please advise/contact next agent by the most efficient means of telecommunication."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTelecomNextAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TelecomNextAgent";
			definition = "Please advise/contact next agent by the most efficient means of telecommunication.";
			owner_lazy = () -> InstructionCode.mmObject();
			codeName = "TELA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("PBEN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InstructionCode";
				definition = "Specifies further instructions concerning the processing of a payment instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstructionCode.mmPayTheBeneficiary, com.tools20022.repository.codeset.InstructionCode.mmTimeTill,
						com.tools20022.repository.codeset.InstructionCode.mmTimeFrom, com.tools20022.repository.codeset.InstructionCode.mmPayCreditorByCheque, com.tools20022.repository.codeset.InstructionCode.mmHoldCashForCreditor,
						com.tools20022.repository.codeset.InstructionCode.mmPhoneBeneficiary, com.tools20022.repository.codeset.InstructionCode.mmTelecom, com.tools20022.repository.codeset.InstructionCode.mmPhoneNextAgent,
						com.tools20022.repository.codeset.InstructionCode.mmTelecomNextAgent);
				derivation_lazy = () -> Arrays.asList(Instruction1Code.mmObject(), Instruction3Code.mmObject(), Instruction4Code.mmObject(), Instruction5Code.mmObject(), PartialInstruction3Code.mmObject(), Instruction6Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}