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
 * Specifies DTCC (The Depository Trust and Clearing Corporation) specific
 * options.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode#mmForeignTaxUnfavorable
 * ExtendedOptionFeatureCode.mmForeignTaxUnfavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode#mmForeignTaxFavorable
 * ExtendedOptionFeatureCode.mmForeignTaxFavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode#mmForeignTaxExempt
 * ExtendedOptionFeatureCode.mmForeignTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode#mmDRIPUnfavorable
 * ExtendedOptionFeatureCode.mmDRIPUnfavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode#mmDRIPFavorable
 * ExtendedOptionFeatureCode.mmDRIPFavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode#mmDRIPExempt
 * ExtendedOptionFeatureCode.mmDRIPExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode#mmForeignCurrencyPayment
 * ExtendedOptionFeatureCode.mmForeignCurrencyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode#mmForeignCurrencyPaymentUnfavorable
 * ExtendedOptionFeatureCode.mmForeignCurrencyPaymentUnfavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode#mmForeignCurrencyPaymentFavorable
 * ExtendedOptionFeatureCode.mmForeignCurrencyPaymentFavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode#mmForeignCurrencyPaymentExempt
 * ExtendedOptionFeatureCode.mmForeignCurrencyPaymentExempt}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ExtendedOptionFeature1Code
 * ExtendedOptionFeature1Code}</li>
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
 * <li>"FORU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExtendedOptionFeatureCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTCC (The Depository Trust and Clearing Corporation) specific options."
 * </li>
 * </ul>
 */
public class ExtendedOptionFeatureCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * DTC (The Depository Trust Company) only option. The event and security
	 * are eligible for the Foreign Tax Relief service at DTC. Option to select
	 * unfavourable tax rate. The Foreign Tax Unfavourable option is the default
	 * option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
	 * ExtendedOptionFeatureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxUnfavorable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Company) only option. The event and security are eligible for the Foreign Tax Relief service at DTC. Option to select unfavourable tax rate. The Foreign Tax Unfavourable option is the default option."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmForeignTaxUnfavorable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxUnfavorable";
			definition = "DTC (The Depository Trust Company) only option. The event and security are eligible for the Foreign Tax Relief service at DTC. Option to select unfavourable tax rate. The Foreign Tax Unfavourable option is the default option.";
			owner_lazy = () -> ExtendedOptionFeatureCode.mmObject();
			codeName = "FORU";
		}
	};
	/**
	 * DTC (The Depository Trust Company) only option. The event and security
	 * are eligible for the Foreign Tax Relief service at DTC. An election into
	 * this option ensures the participant receives their payment at a
	 * favourable tax withholding rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
	 * ExtendedOptionFeatureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxFavorable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Company) only option. The event and security are eligible for the Foreign Tax Relief service at DTC. An election into this option ensures the participant receives their payment at a favourable tax withholding rate. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmForeignTaxFavorable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxFavorable";
			definition = "DTC (The Depository Trust Company) only option. The event and security are eligible for the Foreign Tax Relief service at DTC. An election into this option ensures the participant receives their payment at a favourable tax withholding rate. ";
			owner_lazy = () -> ExtendedOptionFeatureCode.mmObject();
			codeName = "FORF";
		}
	};
	/**
	 * DTC (The Depository Trust Company) only option. The event and security
	 * are eligible for the Foreign Tax Relief service at DTC. An election into
	 * this option ensures the participant is exempt from any tax withholding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
	 * ExtendedOptionFeatureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Company)  only option. The event and security are eligible for the Foreign Tax Relief service at DTC. An election into this option ensures the participant is exempt from any tax withholding. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmForeignTaxExempt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxExempt";
			definition = "DTC (The Depository Trust Company)  only option. The event and security are eligible for the Foreign Tax Relief service at DTC. An election into this option ensures the participant is exempt from any tax withholding. ";
			owner_lazy = () -> ExtendedOptionFeatureCode.mmObject();
			codeName = "FORX";
		}
	};
	/**
	 * DTC (The Depository Trust Company) only option. The event and security
	 * are eligible for both the Dividend Reinvestment and Foreign Tax services
	 * at DTC. Participants electing this option will receive additional shares
	 * and the tax withholding on those shares will be at the unfavourable tax
	 * rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
	 * ExtendedOptionFeatureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRPU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DRIPUnfavorable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Dividend Reinvestment and Foreign Tax services at DTC. Participants electing this option will receive additional shares and the tax withholding on those shares will be at the unfavourable tax rate. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDRIPUnfavorable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DRIPUnfavorable";
			definition = "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Dividend Reinvestment and Foreign Tax services at DTC. Participants electing this option will receive additional shares and the tax withholding on those shares will be at the unfavourable tax rate. ";
			owner_lazy = () -> ExtendedOptionFeatureCode.mmObject();
			codeName = "DRPU";
		}
	};
	/**
	 * DTC (The Depository Trust Company) only option. The event and security
	 * are eligible for both the Dividend Reinvestment and Foreign Tax Relief
	 * services at DTC. Participants electing this option will receive
	 * additional shares and the tax withholding on those shares will be at the
	 * favourable tax rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
	 * ExtendedOptionFeatureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRPF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DRIPFavorable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Dividend Reinvestment and Foreign Tax Relief services at DTC. Participants electing this option will receive additional shares and the tax withholding on those shares will be at the favourable tax rate. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDRIPFavorable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DRIPFavorable";
			definition = "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Dividend Reinvestment and Foreign Tax Relief services at DTC. Participants electing this option will receive additional shares and the tax withholding on those shares will be at the favourable tax rate. ";
			owner_lazy = () -> ExtendedOptionFeatureCode.mmObject();
			codeName = "DRPF";
		}
	};
	/**
	 * DTC (The Depository Trust Company) only option. The event and security
	 * are eligible for both the Dividend Reinvestment and the Foreign Tax
	 * Relief services at DTC. Participants electing this option will receive
	 * additional shares and will be exempt from any tax withholding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
	 * ExtendedOptionFeatureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRPX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DRIPExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Dividend Reinvestment and the Foreign Tax Relief services at DTC. Participants electing this option will receive additional shares and will be exempt from any tax withholding."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDRIPExempt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DRIPExempt";
			definition = "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Dividend Reinvestment and the Foreign Tax Relief services at DTC. Participants electing this option will receive additional shares and will be exempt from any tax withholding.";
			owner_lazy = () -> ExtendedOptionFeatureCode.mmObject();
			codeName = "DRPX";
		}
	};
	/**
	 * DTC (The Depository Trust Company) only option. The event and security
	 * are eligible for Foreign Currency Payment service at DTC. Participants
	 * electing this option will receive their distribution in the foreign
	 * currency instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
	 * ExtendedOptionFeatureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCurrencyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Company) only option. The event and security are eligible for  Foreign Currency Payment service at DTC. Participants electing this option will receive their distribution in the foreign currency instructed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmForeignCurrencyPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCurrencyPayment";
			definition = "DTC (The Depository Trust Company) only option. The event and security are eligible for  Foreign Currency Payment service at DTC. Participants electing this option will receive their distribution in the foreign currency instructed.";
			owner_lazy = () -> ExtendedOptionFeatureCode.mmObject();
			codeName = "FCPP";
		}
	};
	/**
	 * DTC (The Depository Trust Company) only option. The event and security
	 * are eligible for both the Foreign Currency and Foreign Tax services at
	 * DTC. Participants electing this option will receive their distribution in
	 * a foreign currency and the tax withholding on that distribution will be
	 * subject to unfavourable tax withholding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
	 * ExtendedOptionFeatureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCPU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCurrencyPaymentUnfavorable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Foreign Currency and Foreign Tax services at DTC. Participants electing this option will receive their distribution in a foreign currency and the tax withholding on that distribution will be subject to unfavourable tax withholding. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmForeignCurrencyPaymentUnfavorable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCurrencyPaymentUnfavorable";
			definition = "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Foreign Currency and Foreign Tax services at DTC. Participants electing this option will receive their distribution in a foreign currency and the tax withholding on that distribution will be subject to unfavourable tax withholding. ";
			owner_lazy = () -> ExtendedOptionFeatureCode.mmObject();
			codeName = "FCPU";
		}
	};
	/**
	 * DTC (The Depository Trust Company) only option. The event and security
	 * are eligible for both the Foreign Currency and Foreign Tax services at
	 * DTC. Participants electing the option will receive their distribution in
	 * foreign currency and the tax withholding on that distribution will be
	 * subject to favourable tax withholding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
	 * ExtendedOptionFeatureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCPF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCurrencyPaymentFavorable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Foreign Currency and Foreign Tax services at DTC. Participants electing the option will receive their distribution in foreign currency and the tax withholding on that distribution will be subject to favourable tax withholding. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmForeignCurrencyPaymentFavorable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCurrencyPaymentFavorable";
			definition = "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Foreign Currency and Foreign Tax services at DTC. Participants electing the option will receive their distribution in foreign currency and the tax withholding on that distribution will be subject to favourable tax withholding. ";
			owner_lazy = () -> ExtendedOptionFeatureCode.mmObject();
			codeName = "FCPF";
		}
	};
	/**
	 * DTC (The Depository Trust Company) only option. The event and security
	 * are eligible for both the Foreign Currency and Foreign Tax services at
	 * DTC. Participants electing this option will receive their distribution in
	 * a foreign currency and will be exempt from any tax withholding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedOptionFeatureCode
	 * ExtendedOptionFeatureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCPX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCurrencyPaymentExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Foreign Currency and Foreign Tax services at DTC. Participants electing this option will receive their distribution in a foreign currency and will be exempt from any tax withholding. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmForeignCurrencyPaymentExempt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCurrencyPaymentExempt";
			definition = "DTC (The Depository Trust Company) only option. The event and security are eligible for both the Foreign Currency and Foreign Tax services at DTC. Participants electing this option will receive their distribution in a foreign currency and will be exempt from any tax withholding. ";
			owner_lazy = () -> ExtendedOptionFeatureCode.mmObject();
			codeName = "FCPX";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("FORU");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExtendedOptionFeatureCode";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) specific options.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExtendedOptionFeatureCode.mmForeignTaxUnfavorable, com.tools20022.repository.codeset.ExtendedOptionFeatureCode.mmForeignTaxFavorable,
						com.tools20022.repository.codeset.ExtendedOptionFeatureCode.mmForeignTaxExempt, com.tools20022.repository.codeset.ExtendedOptionFeatureCode.mmDRIPUnfavorable,
						com.tools20022.repository.codeset.ExtendedOptionFeatureCode.mmDRIPFavorable, com.tools20022.repository.codeset.ExtendedOptionFeatureCode.mmDRIPExempt,
						com.tools20022.repository.codeset.ExtendedOptionFeatureCode.mmForeignCurrencyPayment, com.tools20022.repository.codeset.ExtendedOptionFeatureCode.mmForeignCurrencyPaymentUnfavorable,
						com.tools20022.repository.codeset.ExtendedOptionFeatureCode.mmForeignCurrencyPaymentFavorable, com.tools20022.repository.codeset.ExtendedOptionFeatureCode.mmForeignCurrencyPaymentExempt);
				derivation_lazy = () -> Arrays.asList(ExtendedOptionFeature1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}