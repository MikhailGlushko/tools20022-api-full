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
import com.tools20022.repository.codeset.ReferToFundOrderDesk1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates that the operation is only possible in restricted circumstances.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReferToFundOrderDesk1Code#ReferToFundOrderDesk
 * ReferToFundOrderDesk1Code.ReferToFundOrderDesk}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.HoldingTransferableCode
 * HoldingTransferableCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReferToFundOrderDesk1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates that the operation is only possible in restricted circumstances."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RFOD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReferToFundOrderDesk1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReferToFundOrderDesk1Code
	 * ReferToFundOrderDesk1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferToFundOrderDesk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ReferToFundOrderDesk1Code ReferToFundOrderDesk = new ReferToFundOrderDesk1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferToFundOrderDesk";
			owner_lazy = () -> com.tools20022.repository.codeset.ReferToFundOrderDesk1Code.mmObject();
			codeName = HoldingTransferableCode.ReferToFundOrderDesk.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ReferToFundOrderDesk1Code> codesByName = new LinkedHashMap<>();

	protected ReferToFundOrderDesk1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RFOD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReferToFundOrderDesk1Code";
				definition = "Indicates that the operation is only possible in restricted circumstances.";
				trace_lazy = () -> HoldingTransferableCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReferToFundOrderDesk1Code.ReferToFundOrderDesk);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ReferToFundOrderDesk.getCodeName().get(), ReferToFundOrderDesk);
	}

	public static ReferToFundOrderDesk1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReferToFundOrderDesk1Code[] values() {
		ReferToFundOrderDesk1Code[] values = new ReferToFundOrderDesk1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReferToFundOrderDesk1Code> {
		@Override
		public ReferToFundOrderDesk1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReferToFundOrderDesk1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}