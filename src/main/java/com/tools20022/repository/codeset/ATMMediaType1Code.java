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
import com.tools20022.repository.codeset.ATMMediaType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of media inside an ATM cassette.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#Cards
 * ATMMediaType1Code.Cards}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#Coins
 * ATMMediaType1Code.Coins}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#Commodity
 * ATMMediaType1Code.Commodity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#Coupons
 * ATMMediaType1Code.Coupons}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#Notes
 * ATMMediaType1Code.Notes}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#Stamps
 * ATMMediaType1Code.Stamps}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#Undetermined
 * ATMMediaType1Code.Undetermined}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode
 * ATMMediaTypeCode}</li>
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
 * "ATMMediaType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of media inside an ATM cassette."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType2Code
 * ATMMediaType2Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMMediaType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code
	 * ATMMediaType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cards"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#Cards
	 * ATMMediaType2Code.Cards}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMMediaType1Code Cards = new ATMMediaType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cards";
			nextVersions_lazy = () -> Arrays.asList(ATMMediaType2Code.Cards);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType1Code.mmObject();
			codeName = ATMMediaTypeCode.Cards.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code
	 * ATMMediaType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coins"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#Coins
	 * ATMMediaType2Code.Coins}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMMediaType1Code Coins = new ATMMediaType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coins";
			nextVersions_lazy = () -> Arrays.asList(ATMMediaType2Code.Coins);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType1Code.mmObject();
			codeName = ATMMediaTypeCode.Coins.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code
	 * ATMMediaType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodity"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#Commodity
	 * ATMMediaType2Code.Commodity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMMediaType1Code Commodity = new ATMMediaType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodity";
			nextVersions_lazy = () -> Arrays.asList(ATMMediaType2Code.Commodity);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType1Code.mmObject();
			codeName = ATMMediaTypeCode.Commodity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code
	 * ATMMediaType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coupons"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#Coupons
	 * ATMMediaType2Code.Coupons}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMMediaType1Code Coupons = new ATMMediaType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coupons";
			nextVersions_lazy = () -> Arrays.asList(ATMMediaType2Code.Coupons);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType1Code.mmObject();
			codeName = ATMMediaTypeCode.Coupons.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code
	 * ATMMediaType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Notes"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#Notes
	 * ATMMediaType2Code.Notes}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMMediaType1Code Notes = new ATMMediaType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Notes";
			nextVersions_lazy = () -> Arrays.asList(ATMMediaType2Code.Notes);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType1Code.mmObject();
			codeName = ATMMediaTypeCode.Notes.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code
	 * ATMMediaType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stamps"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#Stamps
	 * ATMMediaType2Code.Stamps}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMMediaType1Code Stamps = new ATMMediaType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Stamps";
			nextVersions_lazy = () -> Arrays.asList(ATMMediaType2Code.Stamps);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType1Code.mmObject();
			codeName = ATMMediaTypeCode.Stamps.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code
	 * ATMMediaType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undetermined"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#Undetermined
	 * ATMMediaType2Code.Undetermined}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMMediaType1Code Undetermined = new ATMMediaType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Undetermined";
			nextVersions_lazy = () -> Arrays.asList(ATMMediaType2Code.Undetermined);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMMediaType1Code.mmObject();
			codeName = ATMMediaTypeCode.Undetermined.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMMediaType1Code> codesByName = new LinkedHashMap<>();

	protected ATMMediaType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMMediaType1Code";
				definition = "Type of media inside an ATM cassette.";
				nextVersions_lazy = () -> Arrays.asList(ATMMediaType2Code.mmObject());
				trace_lazy = () -> ATMMediaTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMMediaType1Code.Cards, com.tools20022.repository.codeset.ATMMediaType1Code.Coins, com.tools20022.repository.codeset.ATMMediaType1Code.Commodity,
						com.tools20022.repository.codeset.ATMMediaType1Code.Coupons, com.tools20022.repository.codeset.ATMMediaType1Code.Notes, com.tools20022.repository.codeset.ATMMediaType1Code.Stamps,
						com.tools20022.repository.codeset.ATMMediaType1Code.Undetermined);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Cards.getCodeName().get(), Cards);
		codesByName.put(Coins.getCodeName().get(), Coins);
		codesByName.put(Commodity.getCodeName().get(), Commodity);
		codesByName.put(Coupons.getCodeName().get(), Coupons);
		codesByName.put(Notes.getCodeName().get(), Notes);
		codesByName.put(Stamps.getCodeName().get(), Stamps);
		codesByName.put(Undetermined.getCodeName().get(), Undetermined);
	}

	public static ATMMediaType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMMediaType1Code[] values() {
		ATMMediaType1Code[] values = new ATMMediaType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMMediaType1Code> {
		@Override
		public ATMMediaType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMMediaType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}