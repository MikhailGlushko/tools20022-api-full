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

package com.tools20022.repository.other;

import com.tools20022.metamodel.MMUserDefined;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Technical extension structure that allows to specify any valid XML Structure
 * (e.g. through an XML Schema). The property namespace is set to 'any'. <br>
 * The content of the extension MUST be validated by the receiver
 * (processContent=strict), hence the receiver must have the description (e.g.
 * the XML Schema) of the extension.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMUserDefined#getNamespace
 * namespace} = com.tools20022.metamodel.MMNamespace.any</li>
 * <li>{@linkplain com.tools20022.metamodel.MMUserDefined#getProcessContents
 * processContents} = com.tools20022.metamodel.MMProcessContent.LAX</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExtensionContents2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Technical extension structure that allows to specify any valid XML Structure (e.g. through an XML Schema). The property namespace is set to 'any'. \r\nThe content of the extension MUST be validated by the receiver (processContent=strict), hence the receiver must have the description (e.g. the XML Schema) of the extension."
 * </li>
 * </ul>
 */
public class ExtensionContents2 {

	final static private AtomicReference<MMUserDefined> mmObject_lazy = new AtomicReference<>();

	final static public MMUserDefined mmObject() {
		mmObject_lazy.compareAndSet(null, new MMUserDefined() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ExtensionContents2";
				definition = "Technical extension structure that allows to specify any valid XML Structure (e.g. through an XML Schema). The property namespace is set to 'any'. \r\nThe content of the extension MUST be validated by the receiver (processContent=strict), hence the receiver must have the description (e.g. the XML Schema) of the extension.";
				namespace = com.tools20022.metamodel.MMNamespace.any;
				processContents = com.tools20022.metamodel.MMProcessContent.LAX;
			}
		});
		return mmObject_lazy.get();
	}
}