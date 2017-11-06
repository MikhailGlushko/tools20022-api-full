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
 * The legal form of a Fund.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundLegalFormCode#mmContractual
 * FundLegalFormCode.mmContractual}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FundLegalFormCode#mmTrust
 * FundLegalFormCode.mmTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundLegalFormCode#mmCorporate
 * FundLegalFormCode.mmCorporate}</li>
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
 * <li>"CONT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundLegalFormCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "The legal form of a Fund."</li>
 * </ul>
 */
public class FundLegalFormCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The fund is constituted under the law of contract. Contractual fund issue
	 * units and investors are called unitholders. The fund is run by a
	 * management company which may or may not delegate to third agents certain
	 * investment and/or administration tasks.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundLegalFormCode
	 * FundLegalFormCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Contractual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The fund is constituted under the law of contract. Contractual fund issue units and investors are called unitholders. The fund is run by a management company which may or may not delegate to third agents certain investment and/or administration tasks."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmContractual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Contractual";
			definition = "The fund is constituted under the law of contract. Contractual fund issue units and investors are called unitholders. The fund is run by a management company which may or may not delegate to third agents certain investment and/or administration tasks.";
			owner_lazy = () -> FundLegalFormCode.mmObject();
			codeName = "CONT";
		}
	};
	/**
	 * The fund is constituted under the trust law. Whereby an independant
	 * person (a trustee) holds the assets of the investment fund for the
	 * benefit of the underlying investors. The trustee is placed under the
	 * fiduciary responsibility to ensure that the fund is managed in accordance
	 * with its investment policy and objectives.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundLegalFormCode
	 * FundLegalFormCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trust"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The fund is constituted under the trust law. Whereby an independant person (a trustee) holds the assets of the investment fund for the benefit of the underlying investors. The trustee is placed under the fiduciary responsibility to ensure that the fund is managed in accordance with its investment policy and objectives."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTrust = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trust";
			definition = "The fund is constituted under the trust law. Whereby an independant person (a trustee) holds the assets of the investment fund for the benefit of the underlying investors. The trustee is placed under the fiduciary responsibility to ensure that the fund is managed in accordance with its investment policy and objectives.";
			owner_lazy = () -> FundLegalFormCode.mmObject();
			codeName = "TRUS";
		}
	};
	/**
	 * The fund is constituted as a company . It issues shares and the investors
	 * are the shareholders. The fund is run by a management company which may
	 * or may not delegate to third agens certain investment and/or
	 * administration tasks.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundLegalFormCode
	 * FundLegalFormCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Corporate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The fund is constituted as a company . It issues shares and the investors are the shareholders. The fund is run by a management company which may or may not delegate to third agens certain investment and/or administration tasks."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCorporate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Corporate";
			definition = "The fund is constituted as a company . It issues shares and the investors are the shareholders. The fund is run by a management company which may or may not delegate to third agens certain investment and/or administration tasks.";
			owner_lazy = () -> FundLegalFormCode.mmObject();
			codeName = "CORP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("CONT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FundLegalFormCode";
				definition = "The legal form of a Fund.";
				code_lazy = () -> Arrays
						.asList(com.tools20022.repository.codeset.FundLegalFormCode.mmContractual, com.tools20022.repository.codeset.FundLegalFormCode.mmTrust, com.tools20022.repository.codeset.FundLegalFormCode.mmCorporate);
			}
		});
		return mmObject_lazy.get();
	}
}