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
import com.tools20022.repository.codeset.StatementSourceCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the source of the report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.StatementSourceCode
 * StatementSourceCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatementSource1Code#mmAccounting
 * StatementSource1Code.mmAccounting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatementSource1Code#mmCustody
 * StatementSource1Code.mmCustody}</li>
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
 * <li>"ACCT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatementSource1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the source of the report."</li>
 * </ul>
 */
public class StatementSource1Code extends StatementSourceCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatementSource1Code
	 * StatementSource1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accounting"</li>
	 * </ul>
	 */
	public static final MMCode mmAccounting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accounting";
			owner_lazy = () -> StatementSource1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatementSource1Code
	 * StatementSource1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Custody"</li>
	 * </ul>
	 */
	public static final MMCode mmCustody = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Custody";
			owner_lazy = () -> StatementSource1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACCT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StatementSource1Code";
				definition = "Specifies the source of the report.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StatementSource1Code.mmAccounting, com.tools20022.repository.codeset.StatementSource1Code.mmCustody);
				trace_lazy = () -> StatementSourceCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}