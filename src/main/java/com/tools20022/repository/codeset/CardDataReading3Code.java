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
import com.tools20022.repository.codeset.CardDataReading3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Card writing capabilities of the terminal performing the transaction. <br>
 * It correspond to the ISO 8583, field number 22-10 for the version 93, and
 * 27-8_9 for the version 2003.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading3Code#CardOnFile
 * CardDataReading3Code.CardOnFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading3Code#EMVProximityReader
 * CardDataReading3Code.EMVProximityReader}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CardDataReading3Code#ICC
 * CardDataReading3Code.ICC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading3Code#MagneticStripe
 * CardDataReading3Code.MagneticStripe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading3Code#ProximityReader
 * CardDataReading3Code.ProximityReader}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
 * CardDataReadingCode}</li>
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
 * "CardDataReading3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Card writing capabilities of the terminal performing the transaction. \r\nIt correspond to the ISO 8583, field number 22-10 for the version 93, and 27-8_9 for the version 2003."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardDataReading3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading3Code
	 * CardDataReading3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardOnFile"</li>
	 * </ul>
	 */
	public static final CardDataReading3Code CardOnFile = new CardDataReading3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardOnFile";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading3Code.mmObject();
			codeName = CardDataReadingCode.CardOnFile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading3Code
	 * CardDataReading3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVProximityReader"</li>
	 * </ul>
	 */
	public static final CardDataReading3Code EMVProximityReader = new CardDataReading3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMVProximityReader";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading3Code.mmObject();
			codeName = CardDataReadingCode.EMVProximityReader.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading3Code
	 * CardDataReading3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICC"</li>
	 * </ul>
	 */
	public static final CardDataReading3Code ICC = new CardDataReading3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICC";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading3Code.mmObject();
			codeName = CardDataReadingCode.ICC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading3Code
	 * CardDataReading3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MagneticStripe"</li>
	 * </ul>
	 */
	public static final CardDataReading3Code MagneticStripe = new CardDataReading3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MagneticStripe";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading3Code.mmObject();
			codeName = CardDataReadingCode.MagneticStripe.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading3Code
	 * CardDataReading3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProximityReader"</li>
	 * </ul>
	 */
	public static final CardDataReading3Code ProximityReader = new CardDataReading3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProximityReader";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading3Code.mmObject();
			codeName = CardDataReadingCode.ProximityReader.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardDataReading3Code> codesByName = new LinkedHashMap<>();

	protected CardDataReading3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardDataReading3Code";
				definition = "Card writing capabilities of the terminal performing the transaction. \r\nIt correspond to the ISO 8583, field number 22-10 for the version 93, and 27-8_9 for the version 2003.";
				trace_lazy = () -> CardDataReadingCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardDataReading3Code.CardOnFile, com.tools20022.repository.codeset.CardDataReading3Code.EMVProximityReader,
						com.tools20022.repository.codeset.CardDataReading3Code.ICC, com.tools20022.repository.codeset.CardDataReading3Code.MagneticStripe, com.tools20022.repository.codeset.CardDataReading3Code.ProximityReader);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CardOnFile.getCodeName().get(), CardOnFile);
		codesByName.put(EMVProximityReader.getCodeName().get(), EMVProximityReader);
		codesByName.put(ICC.getCodeName().get(), ICC);
		codesByName.put(MagneticStripe.getCodeName().get(), MagneticStripe);
		codesByName.put(ProximityReader.getCodeName().get(), ProximityReader);
	}

	public static CardDataReading3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardDataReading3Code[] values() {
		CardDataReading3Code[] values = new CardDataReading3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardDataReading3Code> {
		@Override
		public CardDataReading3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardDataReading3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}