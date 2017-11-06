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
import java.text.DateFormat;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * The W3C XML Schema that specifies following standard signature:<br>
 * XML Signature Syntax and Processing (Second Edition) W3C Recommendation 10
 * June 2008<br>
 * http://www.w3.org/TR/2008/REC-xmldsig-core-20080610/
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMUserDefined#getNamespace
 * namespace} = com.tools20022.metamodel.MMNamespace.list</li>
 * <li>{@linkplain com.tools20022.metamodel.MMUserDefined#getNamespaceList
 * namespaceList} = "http://www.w3.org/2000/09/xmldsig#"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMUserDefined#getProcessContents
 * processContents} = com.tools20022.metamodel.MMProcessContent.LAX</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = January 1, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "XMLSignature"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The W3C XML Schema that specifies following standard signature:\r\n XML Signature Syntax and Processing (Second Edition) W3C Recommendation 10 June 2008\r\nhttp://www.w3.org/TR/2008/REC-xmldsig-core-20080610/"
 * </li>
 * </ul>
 */
public class XMLSignature {

	final static private AtomicReference<MMUserDefined> mmObject_lazy = new AtomicReference<>();

	final static public MMUserDefined mmObject() {
		mmObject_lazy.compareAndSet(null, new MMUserDefined() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("January 1, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "XMLSignature";
				definition = "The W3C XML Schema that specifies following standard signature:\r\n XML Signature Syntax and Processing (Second Edition) W3C Recommendation 10 June 2008\r\nhttp://www.w3.org/TR/2008/REC-xmldsig-core-20080610/";
				namespaceList = "http://www.w3.org/2000/09/xmldsig#";
				namespace = com.tools20022.metamodel.MMNamespace.list;
				processContents = com.tools20022.metamodel.MMProcessContent.LAX;
			}
		});
		return mmObject_lazy.get();
	}
}