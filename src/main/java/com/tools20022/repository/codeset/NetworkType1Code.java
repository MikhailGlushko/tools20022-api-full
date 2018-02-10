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
import com.tools20022.repository.codeset.NetworkType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of communication network.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetworkType1Code#InternetProtocol
 * NetworkType1Code.InternetProtocol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetworkType1Code#PublicTelephone
 * NetworkType1Code.PublicTelephone}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.NetworkTypeCode
 * NetworkTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NetworkType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of communication network."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NetworkType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetworkType1Code
	 * NetworkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternetProtocol"</li>
	 * </ul>
	 */
	public static final NetworkType1Code InternetProtocol = new NetworkType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternetProtocol";
			owner_lazy = () -> com.tools20022.repository.codeset.NetworkType1Code.mmObject();
			codeName = NetworkTypeCode.InternetProtocol.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetworkType1Code
	 * NetworkType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PublicTelephone"</li>
	 * </ul>
	 */
	public static final NetworkType1Code PublicTelephone = new NetworkType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PublicTelephone";
			owner_lazy = () -> com.tools20022.repository.codeset.NetworkType1Code.mmObject();
			codeName = NetworkTypeCode.PublicTelephone.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, NetworkType1Code> codesByName = new LinkedHashMap<>();

	protected NetworkType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetworkType1Code";
				definition = "Type of communication network.";
				trace_lazy = () -> NetworkTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NetworkType1Code.InternetProtocol, com.tools20022.repository.codeset.NetworkType1Code.PublicTelephone);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InternetProtocol.getCodeName().get(), InternetProtocol);
		codesByName.put(PublicTelephone.getCodeName().get(), PublicTelephone);
	}

	public static NetworkType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NetworkType1Code[] values() {
		NetworkType1Code[] values = new NetworkType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NetworkType1Code> {
		@Override
		public NetworkType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NetworkType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}