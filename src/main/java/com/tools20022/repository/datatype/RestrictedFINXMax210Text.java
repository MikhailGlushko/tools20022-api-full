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

package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMText;
import com.tools20022.repository.GeneratedRepository;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a character string with a maximum length of 210 characters limited
 * to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + .
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMString#getPattern pattern} =
 * "[0-9a-zA-Z/\\-\\?:\\(\\)\\.\\n\\r,'\\+ ]{1,210}"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RestrictedFINXMax210Text"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies a character string with a maximum length of 210 characters limited to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + ."
 * </li>
 * </ul>
 */
public class RestrictedFINXMax210Text {

	final static private AtomicReference<MMText> mmObject_lazy = new AtomicReference<>();

	final static public MMText mmObject() {
		mmObject_lazy.compareAndSet(null, new MMText() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RestrictedFINXMax210Text";
				definition = "Specifies a character string with a maximum length of 210 characters limited to character set X, that is, a-z A-Z / - ? : ( ) . , ‘ + .";
				minLength = 1;
				maxLength = 210;
				pattern = "[0-9a-zA-Z/\\-\\?:\\(\\)\\.\\n\\r,'\\+ ]{1,210}";
			}
		});
		return mmObject_lazy.get();
	}
}