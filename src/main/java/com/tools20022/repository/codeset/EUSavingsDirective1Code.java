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
import com.tools20022.repository.codeset.EUSavingsDirectiveCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * ndicate whether or not the fund is subject to reporting under the EU Savings
 * Directive. Enter "Variable" if the status of the fund is likely to change
 * from time to time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirectiveCode
 * EUSavingsDirectiveCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirective1Code#mmEUSavingsInScope
 * EUSavingsDirective1Code.mmEUSavingsInScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirective1Code#mmEUSavingsOutScope
 * EUSavingsDirective1Code.mmEUSavingsOutScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirective1Code#mmEUSavingsVariable
 * EUSavingsDirective1Code.mmEUSavingsVariable}</li>
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
 * <li>"EUSI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EUSavingsDirective1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "ndicate whether or not the fund is subject to reporting  under the EU Savings Directive.  Enter \"Variable\" if the status of the fund is likely to change from time to time."
 * </li>
 * </ul>
 */
public class EUSavingsDirective1Code extends EUSavingsDirectiveCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirective1Code
	 * EUSavingsDirective1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUSavingsInScope"</li>
	 * </ul>
	 */
	public static final MMCode mmEUSavingsInScope = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUSavingsInScope";
			owner_lazy = () -> EUSavingsDirective1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirective1Code
	 * EUSavingsDirective1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUSavingsOutScope"</li>
	 * </ul>
	 */
	public static final MMCode mmEUSavingsOutScope = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUSavingsOutScope";
			owner_lazy = () -> EUSavingsDirective1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirective1Code
	 * EUSavingsDirective1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUSavingsVariable"</li>
	 * </ul>
	 */
	public static final MMCode mmEUSavingsVariable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUSavingsVariable";
			owner_lazy = () -> EUSavingsDirective1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("EUSI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EUSavingsDirective1Code";
				definition = "ndicate whether or not the fund is subject to reporting  under the EU Savings Directive.  Enter \"Variable\" if the status of the fund is likely to change from time to time.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EUSavingsDirective1Code.mmEUSavingsInScope, com.tools20022.repository.codeset.EUSavingsDirective1Code.mmEUSavingsOutScope,
						com.tools20022.repository.codeset.EUSavingsDirective1Code.mmEUSavingsVariable);
				trace_lazy = () -> EUSavingsDirectiveCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}