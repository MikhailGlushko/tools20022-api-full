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
 * Specifies the tax basis.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxationBasisCode#mmFlat
 * TaxationBasisCode.mmFlat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode#mmPerUnit
 * TaxationBasisCode.mmPerUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode#mmPercentage
 * TaxationBasisCode.mmPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode#mmRatePerBrackets
 * TaxationBasisCode.mmRatePerBrackets}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode#mmRateWithMinimumAmount
 * TaxationBasisCode.mmRateWithMinimumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode#mmRateWithMaximumAmount
 * TaxationBasisCode.mmRateWithMaximumAmount}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxationBasisCode#mmOther
 * TaxationBasisCode.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode#mmGrossAmount
 * TaxationBasisCode.mmGrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode#mmNetAmount
 * TaxationBasisCode.mmNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode#mmNetAssetValuePrice
 * TaxationBasisCode.mmNetAssetValuePrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxationBasis2Code
 * TaxationBasis2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxationBasis4Code
 * TaxationBasis4Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxationBasis3Code
 * TaxationBasis3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxationBasis5Code
 * TaxationBasis5Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FLAT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxationBasisCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the tax basis."</li>
 * </ul>
 */
public class TaxationBasisCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Charge/tax basis is a lump sum.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
	 * TaxationBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Flat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge/tax basis is a lump sum."</li>
	 * </ul>
	 */
	public static final MMCode mmFlat = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Flat";
			definition = "Charge/tax basis is a lump sum.";
			owner_lazy = () -> TaxationBasisCode.mmObject();
			codeName = "FLAT";
		}
	};
	/**
	 * Charges/tax basis is per unit of financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
	 * TaxationBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PERU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charges/tax basis is per unit of financial instrument."</li>
	 * </ul>
	 */
	public static final MMCode mmPerUnit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PerUnit";
			definition = "Charges/tax basis is per unit of financial instrument.";
			owner_lazy = () -> TaxationBasisCode.mmObject();
			codeName = "PERU";
		}
	};
	/**
	 * Charge/tax basis is a percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
	 * TaxationBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge/tax basis is a percentage."</li>
	 * </ul>
	 */
	public static final MMCode mmPercentage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Charge/tax basis is a percentage.";
			owner_lazy = () -> TaxationBasisCode.mmObject();
			codeName = "PRCT";
		}
	};
	/**
	 * Charge/tax basis is a percentage which depends on the tax brackets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
	 * TaxationBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RatePerBrackets"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charge/tax basis is a percentage which depends on the tax brackets."</li>
	 * </ul>
	 */
	public static final MMCode mmRatePerBrackets = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RatePerBrackets";
			definition = "Charge/tax basis is a percentage which depends on the tax brackets.";
			owner_lazy = () -> TaxationBasisCode.mmObject();
			codeName = "BRAC";
		}
	};
	/**
	 * Rate with a minimum amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
	 * TaxationBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MINI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateWithMinimumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate with a minimum amount."</li>
	 * </ul>
	 */
	public static final MMCode mmRateWithMinimumAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateWithMinimumAmount";
			definition = "Rate with a minimum amount.";
			owner_lazy = () -> TaxationBasisCode.mmObject();
			codeName = "MINI";
		}
	};
	/**
	 * Rate with a maximum amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
	 * TaxationBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAXI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateWithMaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate with a maximum amount."</li>
	 * </ul>
	 */
	public static final MMCode mmRateWithMaximumAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateWithMaximumAmount";
			definition = "Rate with a maximum amount.";
			owner_lazy = () -> TaxationBasisCode.mmObject();
			codeName = "MAXI";
		}
	};
	/**
	 * Another type of taxation basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
	 * TaxationBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Another type of taxation basis."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of taxation basis.";
			owner_lazy = () -> TaxationBasisCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Charge/Commission/tax basis is based on the gross amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
	 * TaxationBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GRAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge/Commission/tax basis is based on the gross amount."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmGrossAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossAmount";
			definition = "Charge/Commission/tax basis is based on the gross amount.";
			owner_lazy = () -> TaxationBasisCode.mmObject();
			codeName = "GRAM";
		}
	};
	/**
	 * Charge/commission/tax basis is based on the net amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
	 * TaxationBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NEAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge/commission/tax basis is based on the net amount."</li>
	 * </ul>
	 */
	public static final MMCode mmNetAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAmount";
			definition = "Charge/commission/tax basis is based on the net amount.";
			owner_lazy = () -> TaxationBasisCode.mmObject();
			codeName = "NEAM";
		}
	};
	/**
	 * Charge/tax basis is the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
	 * TaxationBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAVP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValuePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge/tax basis is the price."</li>
	 * </ul>
	 */
	public static final MMCode mmNetAssetValuePrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAssetValuePrice";
			definition = "Charge/tax basis is the price.";
			owner_lazy = () -> TaxationBasisCode.mmObject();
			codeName = "NAVP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("FLAT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxationBasisCode";
				definition = "Specifies the tax basis.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxationBasisCode.mmFlat, com.tools20022.repository.codeset.TaxationBasisCode.mmPerUnit, com.tools20022.repository.codeset.TaxationBasisCode.mmPercentage,
						com.tools20022.repository.codeset.TaxationBasisCode.mmRatePerBrackets, com.tools20022.repository.codeset.TaxationBasisCode.mmRateWithMinimumAmount,
						com.tools20022.repository.codeset.TaxationBasisCode.mmRateWithMaximumAmount, com.tools20022.repository.codeset.TaxationBasisCode.mmOther, com.tools20022.repository.codeset.TaxationBasisCode.mmGrossAmount,
						com.tools20022.repository.codeset.TaxationBasisCode.mmNetAmount, com.tools20022.repository.codeset.TaxationBasisCode.mmNetAssetValuePrice);
				derivation_lazy = () -> Arrays.asList(TaxationBasis2Code.mmObject(), TaxationBasis4Code.mmObject(), TaxationBasis3Code.mmObject(), TaxationBasis5Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}