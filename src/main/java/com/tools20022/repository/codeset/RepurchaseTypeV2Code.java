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
 * Relates to a principal adjustment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeV2Code#mmSwap
 * RepurchaseTypeV2Code.mmSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeV2Code#mmRepurchaseCall
 * RepurchaseTypeV2Code.mmRepurchaseCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeV2Code#mmPairoff
 * RepurchaseTypeV2Code.mmPairoff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeV2Code#mmRepoRate
 * RepurchaseTypeV2Code.mmRepoRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeV2Code#mmRepoContractRollover
 * RepurchaseTypeV2Code.mmRepoContractRollover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeV2Code#mmTopUp
 * RepurchaseTypeV2Code.mmTopUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeV2Code#mmWithdrawal
 * RepurchaseTypeV2Code.mmWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeV2Code#mmPrincipalExposureAdjustment
 * RepurchaseTypeV2Code.mmPrincipalExposureAdjustment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RepurchaseType8Code
 * RepurchaseType8Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RepurchaseType10Code
 * RepurchaseType10Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RepurchaseType9Code
 * RepurchaseType9Code}</li>
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
 * <li>"CADJ"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RepurchaseTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Relates to a principal adjustment."</li>
 * </ul>
 */
public class RepurchaseTypeV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Relates to a swap/substitution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeV2Code
	 * RepurchaseTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CADJ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a swap/substitution."</li>
	 * </ul>
	 */
	public static final MMCode mmSwap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swap";
			definition = "Relates to a swap/substitution.";
			owner_lazy = () -> RepurchaseTypeV2Code.mmObject();
			codeName = "CADJ";
		}
	};
	/**
	 * Relates to the early closing/maturity date for a term repo or a
	 * termination date of an open repo with the underlying collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeV2Code
	 * RepurchaseTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CALL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the early closing/maturity date for a term repo or a termination date of an open repo with the underlying collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRepurchaseCall = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseCall";
			definition = "Relates to the early closing/maturity date for a term repo or a termination date of an open repo with the underlying collateral.";
			owner_lazy = () -> RepurchaseTypeV2Code.mmObject();
			codeName = "CALL";
		}
	};
	/**
	 * Relates to a transaction that is paired off and netted against one or
	 * more previous transactions. A paired off transaction is a buyback to
	 * offset and effectively liquidate a prior sale of securities or a sellback
	 * to offset and effectively liquidate a prior buy of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeV2Code
	 * RepurchaseTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAIR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pairoff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a transaction that is paired off and netted against one or more previous transactions. A paired off transaction is a buyback to offset and effectively liquidate a prior sale of securities or a sellback to offset and effectively liquidate a prior buy of securities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPairoff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pairoff";
			definition = "Relates to a transaction that is paired off and netted against one or more previous transactions. A paired off transaction is a buyback to offset and effectively liquidate a prior sale of securities or a sellback to offset and effectively liquidate a prior buy of securities.";
			owner_lazy = () -> RepurchaseTypeV2Code.mmObject();
			codeName = "PAIR";
		}
	};
	/**
	 * Is part of a pair-off.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeV2Code
	 * RepurchaseTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RATE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Is part of a pair-off."</li>
	 * </ul>
	 */
	public static final MMCode mmRepoRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoRate";
			definition = "Is part of a pair-off.";
			owner_lazy = () -> RepurchaseTypeV2Code.mmObject();
			codeName = "RATE";
		}
	};
	/**
	 * Relates to a repo rollover of a contract extending the closing or
	 * maturity date without the underlying collateral impacted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeV2Code
	 * RepurchaseTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ROLP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoContractRollover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a repo rollover of a contract extending the closing or maturity date without the underlying collateral impacted."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRepoContractRollover = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoContractRollover";
			definition = "Relates to a repo rollover of a contract extending the closing or maturity date without the underlying collateral impacted.";
			owner_lazy = () -> RepurchaseTypeV2Code.mmObject();
			codeName = "ROLP";
		}
	};
	/**
	 * Relates to a repo rollover of a position extending the closing or
	 * maturity date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeV2Code
	 * RepurchaseTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOPU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TopUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a repo rollover of a position extending the closing or maturity date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTopUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TopUp";
			definition = "Relates to a repo rollover of a position extending the closing or maturity date.";
			owner_lazy = () -> RepurchaseTypeV2Code.mmObject();
			codeName = "TOPU";
		}
	};
	/**
	 * Relates to a repo rollover of a position extending the closing or
	 * maturity date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeV2Code
	 * RepurchaseTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WTHD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a repo rollover of a position extending the closing or maturity date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawal";
			definition = "Relates to a repo rollover of a position extending the closing or maturity date.";
			owner_lazy = () -> RepurchaseTypeV2Code.mmObject();
			codeName = "WTHD";
		}
	};
	/**
	 * Relates to a principal adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeV2Code
	 * RepurchaseTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PADJ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalExposureAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a principal adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmPrincipalExposureAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalExposureAdjustment";
			definition = "Relates to a principal adjustment.";
			owner_lazy = () -> RepurchaseTypeV2Code.mmObject();
			codeName = "PADJ";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("CADJ");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RepurchaseTypeV2Code";
				definition = "Relates to a principal adjustment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RepurchaseTypeV2Code.mmSwap, com.tools20022.repository.codeset.RepurchaseTypeV2Code.mmRepurchaseCall,
						com.tools20022.repository.codeset.RepurchaseTypeV2Code.mmPairoff, com.tools20022.repository.codeset.RepurchaseTypeV2Code.mmRepoRate, com.tools20022.repository.codeset.RepurchaseTypeV2Code.mmRepoContractRollover,
						com.tools20022.repository.codeset.RepurchaseTypeV2Code.mmTopUp, com.tools20022.repository.codeset.RepurchaseTypeV2Code.mmWithdrawal,
						com.tools20022.repository.codeset.RepurchaseTypeV2Code.mmPrincipalExposureAdjustment);
				derivation_lazy = () -> Arrays.asList(RepurchaseType8Code.mmObject(), RepurchaseType10Code.mmObject(), RepurchaseType9Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}