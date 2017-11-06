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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the type of identification of the party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IdentificationTypeCode#mmBIC
 * IdentificationTypeCode.mmBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IdentificationTypeCode#mmBankSortCode
 * IdentificationTypeCode.mmBankSortCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IdentificationTypeCode#mmCFETS
 * IdentificationTypeCode.mmCFETS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IdentificationTypeCode#mmCDC
 * IdentificationTypeCode.mmCDC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IdentificationTypeCode#mmRICCode
 * IdentificationTypeCode.mmRICCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IdentificationTypeCode#mmUserDefined
 * IdentificationTypeCode.mmUserDefined}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.IdentificationType2Code
 * IdentificationType2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IdentificationType1Code
 * IdentificationType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IdentificationTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the type of identification of the party."</li>
 * </ul>
 */
public class IdentificationTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * BIC code defines as a standard format of business identifier code. It is
	 * a unique identification code for both financial and non-financial
	 * institutions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IdentificationTypeCode
	 * IdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BICO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "BIC code defines as a standard format of business identifier code. It is a unique identification code for both financial and non-financial institutions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBIC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BIC";
			definition = "BIC code defines as a standard format of business identifier code. It is a unique identification code for both financial and non-financial institutions.";
			owner_lazy = () -> IdentificationTypeCode.mmObject();
			codeName = "BICO";
		}
	};
	/**
	 * Specified source is bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IdentificationTypeCode
	 * IdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BASC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankSortCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specified source is bank."</li>
	 * </ul>
	 */
	public static final MMCode mmBankSortCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankSortCode";
			definition = "Specified source is bank.";
			owner_lazy = () -> IdentificationTypeCode.mmObject();
			codeName = "BASC";
		}
	};
	/**
	 * CFETS is an abbreviation of China Foreign Exchange Trade System, which is
	 * a sub-institution of the PBC. Its main functions include: providing
	 * systems for FX trading, RMB lending, bond trading and exchange rate and
	 * interest rate derivatives trading; organizing FX trading, RMB lending,
	 * bond trading, and exchange rate and interest rate derivatives trading;
	 * providing clearing, information, risk management, and surveillance
	 * services on interbank markets; and engaging in other businesses
	 * authorized by the PBC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IdentificationTypeCode
	 * IdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CFET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CFETS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CFETS is an abbreviation of China Foreign Exchange Trade System, which is a sub-institution of the PBC. Its main functions include: providing systems for FX trading, RMB lending, bond trading and exchange rate and interest rate derivatives trading; organizing FX trading, RMB lending, bond trading, and exchange rate and interest rate derivatives trading; providing clearing, information, risk management, and surveillance services on interbank markets; and engaging in other businesses authorized by the PBC."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCFETS = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CFETS";
			definition = "CFETS is an abbreviation of China Foreign Exchange Trade System, which is a sub-institution of the PBC. Its main functions include: providing systems for FX trading, RMB lending, bond trading and exchange rate and interest rate derivatives trading; organizing FX trading, RMB lending, bond trading, and exchange rate and interest rate derivatives trading; providing clearing, information, risk management, and surveillance services on interbank markets; and engaging in other businesses authorized by the PBC.";
			owner_lazy = () -> IdentificationTypeCode.mmObject();
			codeName = "CFET";
		}
	};
	/**
	 * CDC is an abbreviation of China Central Depository &amp; Clearing Co,
	 * Ltd, an entity undertake functions of centralized depository and
	 * settlement for inter-bank bond market in China.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IdentificationTypeCode
	 * IdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CDC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CDC is an abbreviation of China Central Depository &amp; Clearing Co, Ltd, an entity undertake functions of centralized depository and settlement for inter-bank bond market in China."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCDC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CDC";
			definition = "CDC is an abbreviation of China Central Depository & Clearing Co, Ltd, an entity undertake functions of centralized depository and settlement for inter-bank bond market in China.";
			owner_lazy = () -> IdentificationTypeCode.mmObject();
			codeName = "CDCO";
		}
	};
	/**
	 * RIC Code is an abbreviation of Reuters Instrument Code. RIC as encoding
	 * rule which has been wildly adopted in FX market and defines information
	 * including trading category, tenor, trade instrument and so on.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IdentificationTypeCode
	 * IdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RICC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RICCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "RIC Code is an abbreviation of Reuters Instrument Code. RIC as encoding rule which has been wildly adopted in FX market and defines information including trading category, tenor, trade instrument and so on."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRICCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RICCode";
			definition = "RIC Code is an abbreviation of Reuters Instrument Code. RIC as encoding rule which has been wildly adopted in FX market and defines information including trading category, tenor, trade instrument and so on.";
			owner_lazy = () -> IdentificationTypeCode.mmObject();
			codeName = "RICC";
		}
	};
	/**
	 * User defined code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IdentificationTypeCode
	 * IdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserDefined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "User defined code."</li>
	 * </ul>
	 */
	public static final MMCode mmUserDefined = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserDefined";
			definition = "User defined code.";
			owner_lazy = () -> IdentificationTypeCode.mmObject();
			codeName = "USDE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IdentificationTypeCode";
				definition = "Indicates the type of identification of the party.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IdentificationTypeCode.mmBIC, com.tools20022.repository.codeset.IdentificationTypeCode.mmBankSortCode,
						com.tools20022.repository.codeset.IdentificationTypeCode.mmCFETS, com.tools20022.repository.codeset.IdentificationTypeCode.mmCDC, com.tools20022.repository.codeset.IdentificationTypeCode.mmRICCode,
						com.tools20022.repository.codeset.IdentificationTypeCode.mmUserDefined);
				derivation_lazy = () -> Arrays.asList(IdentificationType2Code.mmObject(), IdentificationType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}