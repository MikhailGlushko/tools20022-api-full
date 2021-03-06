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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.EntryStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of an entry.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EntryStatus1Code#Booked
 * EntryStatus1Code.Booked}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EntryStatus1Code#Pending
 * EntryStatus1Code.Pending}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EntryStatus1Code#Future
 * EntryStatus1Code.Future}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.EntryStatusCode
 * EntryStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EntryStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of an entry."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BOOK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EntryStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Entry is on the books of the account servicer and value has been applied
	 * to the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EntryStatus1Code
	 * EntryStatus1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOOK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Booked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entry is on the books of the account servicer and value has been applied to the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final EntryStatus1Code Booked = new EntryStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Booked";
			definition = "Entry is on the books of the account servicer and value has been applied to the account owner.";
			owner_lazy = () -> com.tools20022.repository.codeset.EntryStatus1Code.mmObject();
			codeName = "BOOK";
			codeName = EntryStatusCode.Booked.getCodeName().orElse(name);
		}
	};
	/**
	 * Entry is on the books of the account servicer and value has not yet been
	 * applied to the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EntryStatus1Code
	 * EntryStatus1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDNG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entry is on the books of the account servicer and value has not yet been applied to the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final EntryStatus1Code Pending = new EntryStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "Entry is on the books of the account servicer and value has not yet been applied to the account owner.";
			owner_lazy = () -> com.tools20022.repository.codeset.EntryStatus1Code.mmObject();
			codeName = "PDNG";
			codeName = EntryStatusCode.Pending.getCodeName().orElse(name);
		}
	};
	/**
	 * Entry is on the books of the account servicer and value will be applied
	 * to the account owner at a future date and time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EntryStatus1Code
	 * EntryStatus1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUTR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Future"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entry is on the books of the account servicer and value will be applied to the account owner at a future date and time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final EntryStatus1Code Future = new EntryStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Future";
			definition = "Entry is on the books of the account servicer and value will be applied to the account owner at a future date and time.";
			owner_lazy = () -> com.tools20022.repository.codeset.EntryStatus1Code.mmObject();
			codeName = "FUTR";
			codeName = EntryStatusCode.Future.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, EntryStatus1Code> codesByName = new LinkedHashMap<>();

	protected EntryStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BOOK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EntryStatus1Code";
				definition = "Specifies the status of an entry.";
				trace_lazy = () -> EntryStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EntryStatus1Code.Booked, com.tools20022.repository.codeset.EntryStatus1Code.Pending, com.tools20022.repository.codeset.EntryStatus1Code.Future);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Booked.getCodeName().get(), Booked);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(Future.getCodeName().get(), Future);
	}

	public static EntryStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EntryStatus1Code[] values() {
		EntryStatus1Code[] values = new EntryStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EntryStatus1Code> {
		@Override
		public EntryStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EntryStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}