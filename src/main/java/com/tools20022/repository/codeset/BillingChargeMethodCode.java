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
 * Defines how the billing charge is calculated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#mmUnitPriced
 * BillingChargeMethodCode.mmUnitPriced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#mmStampDuty
 * BillingChargeMethodCode.mmStampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#mmBaseCharge
 * BillingChargeMethodCode.mmBaseCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#mmDiscountPrice
 * BillingChargeMethodCode.mmDiscountPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#mmFlatCharge
 * BillingChargeMethodCode.mmFlatCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#mmListPrice
 * BillingChargeMethodCode.mmListPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#mmMinimumCharge
 * BillingChargeMethodCode.mmMinimumCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#mmMaximumReduction
 * BillingChargeMethodCode.mmMaximumReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#mmTier1
 * BillingChargeMethodCode.mmTier1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#mmTier2
 * BillingChargeMethodCode.mmTier2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#mmTier3
 * BillingChargeMethodCode.mmTier3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#mmTier4
 * BillingChargeMethodCode.mmTier4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#mmTier5
 * BillingChargeMethodCode.mmTier5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#mmTier6
 * BillingChargeMethodCode.mmTier6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#mmTier7
 * BillingChargeMethodCode.mmTier7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#mmTier8
 * BillingChargeMethodCode.mmTier8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#mmTier9
 * BillingChargeMethodCode.mmTier9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#mmThresholdPrice
 * BillingChargeMethodCode.mmThresholdPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#mmZonePrice
 * BillingChargeMethodCode.mmZonePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode#mmBalanceBased
 * BillingChargeMethodCode.mmBalanceBased}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
 * BillingChargeMethod1Code}</li>
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
 * <li>"UPRC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BillingChargeMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines how the billing charge is calculated."</li>
 * </ul>
 */
public class BillingChargeMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Charge is calculated as the product of volume times unit price. This is
	 * the default value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UPRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitPriced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charge is calculated as the product of volume times unit price. This is the default value."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnitPriced = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitPriced";
			definition = "Charge is calculated as the product of volume times unit price. This is the default value.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "UPRC";
		}
	};
	/**
	 * Service is specifically identified as a stamp duty for accounting
	 * purposes. The charge is calculated as the product of volume times unit
	 * price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDuty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Service is specifically identified as a stamp duty for accounting purposes. The charge is calculated as the product of volume times unit price."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmStampDuty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			definition = "Service is specifically identified as a stamp duty for accounting purposes. The charge is calculated as the product of volume times unit price.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "STAM";
		}
	};
	/**
	 * Fee charged in addition to the volume times unit price when one or more
	 * units of the service are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCHG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fee charged in addition to the volume times unit price when one or more units of the service are provided."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBaseCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseCharge";
			definition = "Fee charged in addition to the volume times unit price when one or more units of the service are provided.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "BCHG";
		}
	};
	/**
	 * Charge is calculated using a price which is lower than the quoted bank
	 * price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charge is calculated using a price which is lower than the quoted bank price."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDiscountPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountPrice";
			definition = "Charge is calculated using a price which is lower than the quoted bank price.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "DPRC";
		}
	};
	/**
	 * Fixed charge not tied to volume or unit price. Flat Charge fees do not
	 * require a volume or Unit Price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCHG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FlatCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fixed charge not tied to volume or unit price. Flat Charge fees do not require a volume or Unit Price."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFlatCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FlatCharge";
			definition = "Fixed charge not tied to volume or unit price. Flat Charge fees do not require a volume or Unit Price.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "FCHG";
		}
	};
	/**
	 * A single service where the volume, original charge and balance required
	 * are the totals of two or more pricing tiers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LPRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A single service where the volume, original charge and balance required are the totals of two or more pricing tiers."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmListPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListPrice";
			definition = "A single service where the volume, original charge and balance required are the totals of two or more pricing tiers.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "LPRC";
		}
	};
	/**
	 * Lowest charge possible for the service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCHG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lowest charge possible for the service."</li>
	 * </ul>
	 */
	public static final MMCode mmMinimumCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumCharge";
			definition = "Lowest charge possible for the service.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "MCHG";
		}
	};
	/**
	 * Maximum charge possible for the service even though volume times unit
	 * price exceeds the maximum reduction value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MXRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumReduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum charge possible for the service even though volume times unit price exceeds the maximum reduction value."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMaximumReduction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumReduction";
			definition = "Maximum charge possible for the service even though volume times unit price exceeds the maximum reduction value.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "MXRD";
		}
	};
	/**
	 * Line item represents a charge for tier 1 in a multi tier, volume discount
	 * charging structure. Designates the tier 1 used to charge out the volume
	 * that falls in that tier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIR1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item represents a charge for tier 1 in a multi tier, volume discount charging structure. Designates the tier 1 used to charge out the volume that falls in that tier."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTier1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier1";
			definition = "Line item represents a charge for tier 1 in a multi tier, volume discount charging structure. Designates the tier 1 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "TIR1";
		}
	};
	/**
	 * Line item represents a charge for tier 2 in a multi tier, volume discount
	 * charging structure. Designates the tier 2 used to charge out the volume
	 * that falls in that tier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIR2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item represents a charge for tier 2 in a multi tier, volume discount charging structure. Designates the tier 2 used to charge out the volume that falls in that tier."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTier2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier2";
			definition = "Line item represents a charge for tier 2 in a multi tier, volume discount charging structure. Designates the tier 2 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "TIR2";
		}
	};
	/**
	 * Line item represents a charge for tier 3 in a multi tier, volume discount
	 * charging structure. Designates the tier 3 used to charge out the volume
	 * that falls in that tier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIR3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item represents a charge for tier 3 in a multi tier, volume discount charging structure. Designates the tier 3 used to charge out the volume that falls in that tier."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTier3 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier3";
			definition = "Line item represents a charge for tier 3 in a multi tier, volume discount charging structure. Designates the tier 3 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "TIR3";
		}
	};
	/**
	 * Line item represents a charge for tier 4 in a multi tier, volume discount
	 * charging structure. Designates the tier 4 used to charge out the volume
	 * that falls in that tier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIR4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item represents a charge for tier 4 in a multi tier, volume discount charging structure. Designates the tier 4 used to charge out the volume that falls in that tier."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTier4 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier4";
			definition = "Line item represents a charge for tier 4 in a multi tier, volume discount charging structure. Designates the tier 4 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "TIR4";
		}
	};
	/**
	 * Line item represents a charge for tier 5 in a multi tier, volume discount
	 * charging structure. Designates the tier 5 used to charge out the volume
	 * that falls in that tier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIR5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item represents a charge for tier 5 in a multi tier, volume discount charging structure. Designates the tier 5 used to charge out the volume that falls in that tier."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTier5 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier5";
			definition = "Line item represents a charge for tier 5 in a multi tier, volume discount charging structure. Designates the tier 5 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "TIR5";
		}
	};
	/**
	 * Line item represents a charge for tier 6 in a multi tier, volume discount
	 * charging structure. Designates the tier 6 used to charge out the volume
	 * that falls in that tier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIR6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item represents a charge for tier 6 in a multi tier, volume discount charging structure. Designates the tier 6 used to charge out the volume that falls in that tier."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTier6 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier6";
			definition = "Line item represents a charge for tier 6 in a multi tier, volume discount charging structure. Designates the tier 6 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "TIR6";
		}
	};
	/**
	 * Line item represents a charge for tier 7 in a multi tier, volume discount
	 * charging structure. Designates the tier 7 used to charge out the volume
	 * that falls in that tier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIR7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item represents a charge for tier 7 in a multi tier, volume discount charging structure. Designates the tier 7 used to charge out the volume that falls in that tier."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTier7 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier7";
			definition = "Line item represents a charge for tier 7 in a multi tier, volume discount charging structure. Designates the tier 7 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "TIR7";
		}
	};
	/**
	 * Line item represents a charge for tier 8 in a multi tier, volume discount
	 * charging structure. Designates the tier 8 used to charge out the volume
	 * that falls in that tier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIR8"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier8"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item represents a charge for tier 8 in a multi tier, volume discount charging structure. Designates the tier 8 used to charge out the volume that falls in that tier."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTier8 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier8";
			definition = "Line item represents a charge for tier 8 in a multi tier, volume discount charging structure. Designates the tier 8 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "TIR8";
		}
	};
	/**
	 * Line item represents a charge for tier 9 in a multi tier, volume discount
	 * charging structure. Designates the tier 9 used to charge out the volume
	 * that falls in that tier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIR9"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier9"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item represents a charge for tier 9 in a multi tier, volume discount charging structure. Designates the tier 9 used to charge out the volume that falls in that tier."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTier9 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier9";
			definition = "Line item represents a charge for tier 9 in a multi tier, volume discount charging structure. Designates the tier 9 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "TIR9";
		}
	};
	/**
	 * Unit price is determined by the total volume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TPRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThresholdPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit price is determined by the total volume."</li>
	 * </ul>
	 */
	public static final MMCode mmThresholdPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThresholdPrice";
			definition = "Unit price is determined by the total volume.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "TPRC";
		}
	};
	/**
	 * Indicates different prices for the same service. Typically used in a
	 * relationship summary statement where the same service has a different
	 * price for different accounts in the relationship.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ZPRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZonePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates different prices for the same service. Typically used in a relationship summary statement where the same service has a different price for different accounts in the relationship."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmZonePrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZonePrice";
			definition = "Indicates different prices for the same service. Typically used in a relationship summary statement where the same service has a different price for different accounts in the relationship.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "ZPRC";
		}
	};
	/**
	 * Charge is calculated as a balance times a per-annum rate multiplied by a
	 * time factor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BBSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceBased"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charge is calculated as a balance times a per-annum rate multiplied by a time factor."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBalanceBased = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceBased";
			definition = "Charge is calculated as a balance times a per-annum rate multiplied by a time factor.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "BBSE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("UPRC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BillingChargeMethodCode";
				definition = "Defines how the billing charge is calculated.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BillingChargeMethodCode.mmUnitPriced, com.tools20022.repository.codeset.BillingChargeMethodCode.mmStampDuty,
						com.tools20022.repository.codeset.BillingChargeMethodCode.mmBaseCharge, com.tools20022.repository.codeset.BillingChargeMethodCode.mmDiscountPrice,
						com.tools20022.repository.codeset.BillingChargeMethodCode.mmFlatCharge, com.tools20022.repository.codeset.BillingChargeMethodCode.mmListPrice,
						com.tools20022.repository.codeset.BillingChargeMethodCode.mmMinimumCharge, com.tools20022.repository.codeset.BillingChargeMethodCode.mmMaximumReduction,
						com.tools20022.repository.codeset.BillingChargeMethodCode.mmTier1, com.tools20022.repository.codeset.BillingChargeMethodCode.mmTier2, com.tools20022.repository.codeset.BillingChargeMethodCode.mmTier3,
						com.tools20022.repository.codeset.BillingChargeMethodCode.mmTier4, com.tools20022.repository.codeset.BillingChargeMethodCode.mmTier5, com.tools20022.repository.codeset.BillingChargeMethodCode.mmTier6,
						com.tools20022.repository.codeset.BillingChargeMethodCode.mmTier7, com.tools20022.repository.codeset.BillingChargeMethodCode.mmTier8, com.tools20022.repository.codeset.BillingChargeMethodCode.mmTier9,
						com.tools20022.repository.codeset.BillingChargeMethodCode.mmThresholdPrice, com.tools20022.repository.codeset.BillingChargeMethodCode.mmZonePrice,
						com.tools20022.repository.codeset.BillingChargeMethodCode.mmBalanceBased);
				derivation_lazy = () -> Arrays.asList(BillingChargeMethod1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}