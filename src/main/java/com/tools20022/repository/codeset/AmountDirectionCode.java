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
 * Specifies if an operation is an increase or a decrease or the result of a
 * reversal operation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode#mmDebit
 * AmountDirectionCode.mmDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode#mmCredit
 * AmountDirectionCode.mmCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode#mmReversalDebit
 * AmountDirectionCode.mmReversalDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode#mmReversalCredit
 * AmountDirectionCode.mmReversalCredit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CreditDebitCode
 * CreditDebitCode}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ReversalCode ReversalCode}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CreditDebit3Code
 * CreditDebit3Code}</li>
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
 * <li>"DBIT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AmountDirectionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if an operation is an increase or a decrease or the result of a reversal operation."
 * </li>
 * </ul>
 */
public class AmountDirectionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Operation is a decrease.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode
	 * AmountDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DBIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Operation is a decrease."</li>
	 * </ul>
	 */
	public static final MMCode mmDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Debit";
			definition = "Operation is a decrease.";
			owner_lazy = () -> AmountDirectionCode.mmObject();
			codeName = "DBIT";
		}
	};
	/**
	 * Operation is an increase.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode
	 * AmountDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Operation is an increase."</li>
	 * </ul>
	 */
	public static final MMCode mmCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Credit";
			definition = "Operation is an increase.";
			owner_lazy = () -> AmountDirectionCode.mmObject();
			codeName = "CRDT";
		}
	};
	/**
	 * Credit entry used to reverse a previously booked debit entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode
	 * AmountDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RVDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Credit entry used to reverse a previously booked debit entry."</li>
	 * </ul>
	 */
	public static final MMCode mmReversalDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReversalDebit";
			definition = "Credit entry used to reverse a previously booked debit entry.";
			owner_lazy = () -> AmountDirectionCode.mmObject();
			codeName = "RVDB";
		}
	};
	/**
	 * Debit entry used to reverse a previously booked credit entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode
	 * AmountDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RVCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Debit entry used to reverse a previously booked credit entry."</li>
	 * </ul>
	 */
	public static final MMCode mmReversalCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReversalCredit";
			definition = "Debit entry used to reverse a previously booked credit entry.";
			owner_lazy = () -> AmountDirectionCode.mmObject();
			codeName = "RVCD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("DBIT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AmountDirectionCode";
				definition = "Specifies if an operation is an increase or a decrease or the result of a reversal operation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AmountDirectionCode.mmDebit, com.tools20022.repository.codeset.AmountDirectionCode.mmCredit,
						com.tools20022.repository.codeset.AmountDirectionCode.mmReversalDebit, com.tools20022.repository.codeset.AmountDirectionCode.mmReversalCredit);
				derivation_lazy = () -> Arrays.asList(CreditDebitCode.mmObject(), ReversalCode.mmObject(), CreditDebit3Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}