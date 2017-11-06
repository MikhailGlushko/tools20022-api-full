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
 * Specifies the nature of the disputed collateral amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode#mmReconcileCollateral
 * DisputeResolutionTypeCode.mmReconcileCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode#mmReconcileExposure
 * DisputeResolutionTypeCode.mmReconcileExposure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode#mmReconcileThreshold
 * DisputeResolutionTypeCode.mmReconcileThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode#mmReconcileMinimumTransferAmount
 * DisputeResolutionTypeCode.mmReconcileMinimumTransferAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode#mmReconcileRounding
 * DisputeResolutionTypeCode.mmReconcileRounding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode#mmReconcileValuationFrequency
 * DisputeResolutionTypeCode.mmReconcileValuationFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode#mmReconcileNettedIndependentAmount
 * DisputeResolutionTypeCode.mmReconcileNettedIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode#mmReconcileSegregatedIndependentAmount
 * DisputeResolutionTypeCode.mmReconcileSegregatedIndependentAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code
 * DisputeResolutionType2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DisputeResolutionType1Code
 * DisputeResolutionType1Code}</li>
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
 * <li>"RECO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DisputeResolutionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the nature of the disputed collateral amount."</li>
 * </ul>
 */
public class DisputeResolutionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode
	 * DisputeResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RECO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the disputed collateral amount should be confirmed through reconciliation of the collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReconcileCollateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileCollateral";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the collateral.";
			owner_lazy = () -> DisputeResolutionTypeCode.mmObject();
			codeName = "RECO";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the exposure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode
	 * DisputeResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileExposure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the disputed collateral amount should be confirmed through reconciliation of the exposure."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReconcileExposure = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileExposure";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the exposure.";
			owner_lazy = () -> DisputeResolutionTypeCode.mmObject();
			codeName = "REEX";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the threshold.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode
	 * DisputeResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RETH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileThreshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the disputed collateral amount should be confirmed through reconciliation of the threshold."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReconcileThreshold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileThreshold";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the threshold.";
			owner_lazy = () -> DisputeResolutionTypeCode.mmObject();
			codeName = "RETH";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the minimum transfer amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode
	 * DisputeResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RMTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileMinimumTransferAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the disputed collateral amount should be confirmed through reconciliation of the minimum transfer amount."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReconcileMinimumTransferAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileMinimumTransferAmount";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the minimum transfer amount.";
			owner_lazy = () -> DisputeResolutionTypeCode.mmObject();
			codeName = "RMTA";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the rounding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode
	 * DisputeResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RERO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileRounding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the disputed collateral amount should be confirmed through reconciliation of the rounding."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReconcileRounding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileRounding";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the rounding.";
			owner_lazy = () -> DisputeResolutionTypeCode.mmObject();
			codeName = "RERO";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the valuation frequency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode
	 * DisputeResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REVF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileValuationFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the disputed collateral amount should be confirmed through reconciliation of the valuation frequency."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReconcileValuationFrequency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileValuationFrequency";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the valuation frequency.";
			owner_lazy = () -> DisputeResolutionTypeCode.mmObject();
			codeName = "REVF";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode
	 * DisputeResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RNIA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileNettedIndependentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the disputed collateral amount should be confirmed through reconciliation of the independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReconcileNettedIndependentAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileNettedIndependentAmount";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the independent amount.";
			owner_lazy = () -> DisputeResolutionTypeCode.mmObject();
			codeName = "RNIA";
		}
	};
	/**
	 * Indicates that the disputed collateral amount should be confirmed through
	 * reconciliation of the initial margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode
	 * DisputeResolutionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileSegregatedIndependentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the disputed collateral amount should be confirmed through reconciliation of the initial margin."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReconcileSegregatedIndependentAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileSegregatedIndependentAmount";
			definition = "Indicates that the disputed collateral amount should be confirmed through reconciliation of the initial margin.";
			owner_lazy = () -> DisputeResolutionTypeCode.mmObject();
			codeName = "RESA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("RECO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DisputeResolutionTypeCode";
				definition = "Specifies the nature of the disputed collateral amount.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DisputeResolutionTypeCode.mmReconcileCollateral, com.tools20022.repository.codeset.DisputeResolutionTypeCode.mmReconcileExposure,
						com.tools20022.repository.codeset.DisputeResolutionTypeCode.mmReconcileThreshold, com.tools20022.repository.codeset.DisputeResolutionTypeCode.mmReconcileMinimumTransferAmount,
						com.tools20022.repository.codeset.DisputeResolutionTypeCode.mmReconcileRounding, com.tools20022.repository.codeset.DisputeResolutionTypeCode.mmReconcileValuationFrequency,
						com.tools20022.repository.codeset.DisputeResolutionTypeCode.mmReconcileNettedIndependentAmount, com.tools20022.repository.codeset.DisputeResolutionTypeCode.mmReconcileSegregatedIndependentAmount);
				derivation_lazy = () -> Arrays.asList(DisputeResolutionType2Code.mmObject(), DisputeResolutionType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}