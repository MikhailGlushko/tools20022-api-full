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

import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the external sub-family code of the bank transaction code in the
 * format of character string with a maximum length of 4 characters.<br>
 * The list of valid codes is an external code list published separately, and is
 * a sub-list of the bank transaction family code list.<br>
 * External code sets can be downloaded from www.iso20022.org.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"S001"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExternalBankTransactionSubFamilyCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the external sub-family code of the bank transaction code in the format of character string with a maximum length of 4 characters.\r\nThe list of valid codes is an external code list published separately, and is a sub-list of the bank transaction family code list.\r\nExternal code sets can be downloaded from www.iso20022.org."
 * </li>
 * </ul>
 */
public class ExternalBankTransactionSubFamilyCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("S001");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExternalBankTransactionSubFamilyCode";
				definition = "Specifies the external sub-family code of the bank transaction code in the format of character string with a maximum length of 4 characters.\r\nThe list of valid codes is an external code list published separately, and is a sub-list of the bank transaction family code list.\r\nExternal code sets can be downloaded from www.iso20022.org.";
			}
		});
		return mmObject_lazy.get();
	}
}