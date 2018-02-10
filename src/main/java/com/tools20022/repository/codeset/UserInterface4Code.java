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
import com.tools20022.repository.codeset.UserInterface4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Destination of the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code#CardholderDisplay
 * UserInterface4Code.CardholderDisplay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code#CardholderReceipt
 * UserInterface4Code.CardholderReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code#MerchantDisplay
 * UserInterface4Code.MerchantDisplay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code#MerchantReceipt
 * UserInterface4Code.MerchantReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code#OtherCardholderInterface
 * UserInterface4Code.OtherCardholderInterface}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
 * UserInterfaceCode}</li>
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
 * "UserInterface4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Destination of the message."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UserInterface5Code
 * UserInterface5Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UserInterface4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code
	 * UserInterface4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderDisplay"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UserInterface5Code#CardholderDisplay
	 * UserInterface5Code.CardholderDisplay}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UserInterface4Code CardholderDisplay = new UserInterface4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderDisplay";
			nextVersions_lazy = () -> Arrays.asList(UserInterface5Code.CardholderDisplay);
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterface4Code.mmObject();
			codeName = UserInterfaceCode.CardholderDisplay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code
	 * UserInterface4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderReceipt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UserInterface5Code#CardholderReceipt
	 * UserInterface5Code.CardholderReceipt}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UserInterface4Code CardholderReceipt = new UserInterface4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderReceipt";
			nextVersions_lazy = () -> Arrays.asList(UserInterface5Code.CardholderReceipt);
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterface4Code.mmObject();
			codeName = UserInterfaceCode.CardholderReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code
	 * UserInterface4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantDisplay"</li>
	 * </ul>
	 */
	public static final UserInterface4Code MerchantDisplay = new UserInterface4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantDisplay";
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterface4Code.mmObject();
			codeName = UserInterfaceCode.MerchantDisplay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code
	 * UserInterface4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantReceipt"</li>
	 * </ul>
	 */
	public static final UserInterface4Code MerchantReceipt = new UserInterface4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterface4Code.mmObject();
			codeName = UserInterfaceCode.MerchantReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code
	 * UserInterface4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCardholderInterface"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.UserInterface5Code#OtherCardholderInterface
	 * UserInterface5Code.OtherCardholderInterface}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final UserInterface4Code OtherCardholderInterface = new UserInterface4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCardholderInterface";
			nextVersions_lazy = () -> Arrays.asList(UserInterface5Code.OtherCardholderInterface);
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterface4Code.mmObject();
			codeName = UserInterfaceCode.OtherCardholderInterface.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UserInterface4Code> codesByName = new LinkedHashMap<>();

	protected UserInterface4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UserInterface4Code";
				definition = "Destination of the message.";
				nextVersions_lazy = () -> Arrays.asList(UserInterface5Code.mmObject());
				trace_lazy = () -> UserInterfaceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UserInterface4Code.CardholderDisplay, com.tools20022.repository.codeset.UserInterface4Code.CardholderReceipt,
						com.tools20022.repository.codeset.UserInterface4Code.MerchantDisplay, com.tools20022.repository.codeset.UserInterface4Code.MerchantReceipt,
						com.tools20022.repository.codeset.UserInterface4Code.OtherCardholderInterface);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CardholderDisplay.getCodeName().get(), CardholderDisplay);
		codesByName.put(CardholderReceipt.getCodeName().get(), CardholderReceipt);
		codesByName.put(MerchantDisplay.getCodeName().get(), MerchantDisplay);
		codesByName.put(MerchantReceipt.getCodeName().get(), MerchantReceipt);
		codesByName.put(OtherCardholderInterface.getCodeName().get(), OtherCardholderInterface);
	}

	public static UserInterface4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UserInterface4Code[] values() {
		UserInterface4Code[] values = new UserInterface4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UserInterface4Code> {
		@Override
		public UserInterface4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UserInterface4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}