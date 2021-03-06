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
import com.tools20022.repository.codeset.SystemPartyType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of the party within a system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemPartyType1Code#CentralSecuritiesDepository
 * SystemPartyType1Code.CentralSecuritiesDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemPartyType1Code#NationalCentralBank
 * SystemPartyType1Code.NationalCentralBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemPartyType1Code#PaymentBank
 * SystemPartyType1Code.PaymentBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemPartyType1Code#CentralSecuritiesDepositoryParticipant
 * SystemPartyType1Code.CentralSecuritiesDepositoryParticipant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemPartyType1Code#ExternalCentralSecuritiesDepository
 * SystemPartyType1Code.ExternalCentralSecuritiesDepository}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SystemPartyTypeCode
 * SystemPartyTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemPartyType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of the party within a system."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CSDY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SystemPartyType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemPartyType1Code
	 * SystemPartyType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralSecuritiesDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemPartyType1Code CentralSecuritiesDepository = new SystemPartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralSecuritiesDepository";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemPartyType1Code.mmObject();
			codeName = SystemPartyTypeCode.CentralSecuritiesDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemPartyType1Code
	 * SystemPartyType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalCentralBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemPartyType1Code NationalCentralBank = new SystemPartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalCentralBank";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemPartyType1Code.mmObject();
			codeName = SystemPartyTypeCode.NationalCentralBank.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemPartyType1Code
	 * SystemPartyType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemPartyType1Code PaymentBank = new SystemPartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentBank";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemPartyType1Code.mmObject();
			codeName = SystemPartyTypeCode.PaymentBank.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemPartyType1Code
	 * SystemPartyType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralSecuritiesDepositoryParticipant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemPartyType1Code CentralSecuritiesDepositoryParticipant = new SystemPartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralSecuritiesDepositoryParticipant";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemPartyType1Code.mmObject();
			codeName = SystemPartyTypeCode.CentralSecuritiesDepositoryParticipant.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemPartyType1Code
	 * SystemPartyType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalCentralSecuritiesDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SystemPartyType1Code ExternalCentralSecuritiesDepository = new SystemPartyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalCentralSecuritiesDepository";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemPartyType1Code.mmObject();
			codeName = SystemPartyTypeCode.ExternalCentralSecuritiesDepository.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SystemPartyType1Code> codesByName = new LinkedHashMap<>();

	protected SystemPartyType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CSDY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemPartyType1Code";
				definition = "Specifies the type of the party within a system.";
				trace_lazy = () -> SystemPartyTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SystemPartyType1Code.CentralSecuritiesDepository, com.tools20022.repository.codeset.SystemPartyType1Code.NationalCentralBank,
						com.tools20022.repository.codeset.SystemPartyType1Code.PaymentBank, com.tools20022.repository.codeset.SystemPartyType1Code.CentralSecuritiesDepositoryParticipant,
						com.tools20022.repository.codeset.SystemPartyType1Code.ExternalCentralSecuritiesDepository);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CentralSecuritiesDepository.getCodeName().get(), CentralSecuritiesDepository);
		codesByName.put(NationalCentralBank.getCodeName().get(), NationalCentralBank);
		codesByName.put(PaymentBank.getCodeName().get(), PaymentBank);
		codesByName.put(CentralSecuritiesDepositoryParticipant.getCodeName().get(), CentralSecuritiesDepositoryParticipant);
		codesByName.put(ExternalCentralSecuritiesDepository.getCodeName().get(), ExternalCentralSecuritiesDepository);
	}

	public static SystemPartyType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SystemPartyType1Code[] values() {
		SystemPartyType1Code[] values = new SystemPartyType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SystemPartyType1Code> {
		@Override
		public SystemPartyType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SystemPartyType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}