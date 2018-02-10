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
import com.tools20022.repository.codeset.MessageItemConditionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Rule to apply for the presence and the value of a message item.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode#Mandatory
 * MessageItemConditionCode.Mandatory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode#ConfiguredValue
 * MessageItemConditionCode.ConfiguredValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode#DefaultValue
 * MessageItemConditionCode.DefaultValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode#AllowedValues
 * MessageItemConditionCode.AllowedValues}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode#IfAvailable
 * MessageItemConditionCode.IfAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode#Copy
 * MessageItemConditionCode.Copy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode#NotSupported
 * MessageItemConditionCode.NotSupported}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageItemCondition1Code
 * MessageItemCondition1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MNDT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MessageItemConditionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Rule to apply for the presence and the value of a message item."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MessageItemConditionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Message item must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode
	 * MessageItemConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MNDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandatory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message item must be present."</li>
	 * </ul>
	 */
	public static final MessageItemConditionCode Mandatory = new MessageItemConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Mandatory";
			definition = "Message item must be present.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageItemConditionCode.mmObject();
			codeName = "MNDT";
		}
	};
	/**
	 * Message item must be present with the configured value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode
	 * MessageItemConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CFVL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfiguredValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message item must be present with the configured value."</li>
	 * </ul>
	 */
	public static final MessageItemConditionCode ConfiguredValue = new MessageItemConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConfiguredValue";
			definition = "Message item must be present with the configured value.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageItemConditionCode.mmObject();
			codeName = "CFVL";
		}
	};
	/**
	 * Message item has the configured value if the item is absent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode
	 * MessageItemConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message item has the configured value if the item is absent."</li>
	 * </ul>
	 */
	public static final MessageItemConditionCode DefaultValue = new MessageItemConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DefaultValue";
			definition = "Message item has the configured value if the item is absent.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageItemConditionCode.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Message item must have one of the configured values.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode
	 * MessageItemConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALWV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowedValues"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message item must have one of the configured values."</li>
	 * </ul>
	 */
	public static final MessageItemConditionCode AllowedValues = new MessageItemConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllowedValues";
			definition = "Message item must have one of the configured values.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageItemConditionCode.mmObject();
			codeName = "ALWV";
		}
	};
	/**
	 * Message item has to be present if available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode
	 * MessageItemConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IFAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IfAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message item has to be present if available."</li>
	 * </ul>
	 */
	public static final MessageItemConditionCode IfAvailable = new MessageItemConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IfAvailable";
			definition = "Message item has to be present if available.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageItemConditionCode.mmObject();
			codeName = "IFAV";
		}
	};
	/**
	 * Message item is present if it was present in a previous related message
	 * with the same value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode
	 * MessageItemConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COPY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Copy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message item is present if it was present in a previous related message with the same value."
	 * </li>
	 * </ul>
	 */
	public static final MessageItemConditionCode Copy = new MessageItemConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Copy";
			definition = "Message item is present if it was present in a previous related message with the same value.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageItemConditionCode.mmObject();
			codeName = "COPY";
		}
	};
	/**
	 * Message item is not supported and has to be absent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageItemConditionCode
	 * MessageItemConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSupported"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message item is not supported and has to be absent."</li>
	 * </ul>
	 */
	public static final MessageItemConditionCode NotSupported = new MessageItemConditionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotSupported";
			definition = "Message item is not supported and has to be absent.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageItemConditionCode.mmObject();
			codeName = "UNSP";
		}
	};
	final static private LinkedHashMap<String, MessageItemConditionCode> codesByName = new LinkedHashMap<>();

	protected MessageItemConditionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MNDT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageItemConditionCode";
				definition = "Rule to apply for the presence and the value of a message item.";
				derivation_lazy = () -> Arrays.asList(MessageItemCondition1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageItemConditionCode.Mandatory, com.tools20022.repository.codeset.MessageItemConditionCode.ConfiguredValue,
						com.tools20022.repository.codeset.MessageItemConditionCode.DefaultValue, com.tools20022.repository.codeset.MessageItemConditionCode.AllowedValues,
						com.tools20022.repository.codeset.MessageItemConditionCode.IfAvailable, com.tools20022.repository.codeset.MessageItemConditionCode.Copy, com.tools20022.repository.codeset.MessageItemConditionCode.NotSupported);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Mandatory.getCodeName().get(), Mandatory);
		codesByName.put(ConfiguredValue.getCodeName().get(), ConfiguredValue);
		codesByName.put(DefaultValue.getCodeName().get(), DefaultValue);
		codesByName.put(AllowedValues.getCodeName().get(), AllowedValues);
		codesByName.put(IfAvailable.getCodeName().get(), IfAvailable);
		codesByName.put(Copy.getCodeName().get(), Copy);
		codesByName.put(NotSupported.getCodeName().get(), NotSupported);
	}

	public static MessageItemConditionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MessageItemConditionCode[] values() {
		MessageItemConditionCode[] values = new MessageItemConditionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MessageItemConditionCode> {
		@Override
		public MessageItemConditionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MessageItemConditionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}