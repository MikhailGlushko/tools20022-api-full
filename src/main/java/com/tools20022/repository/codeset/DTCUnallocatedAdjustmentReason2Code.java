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
import com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * DTC Unallocated reason codes for payment adjustments.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReasonCode
 * DTCUnallocatedAdjustmentReasonCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmBadAnnouncement
 * DTCUnallocatedAdjustmentReason2Code.mmBadAnnouncement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmBadPayableDate
 * DTCUnallocatedAdjustmentReason2Code.mmBadPayableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmCashRateUnknown
 * DTCUnallocatedAdjustmentReason2Code.mmCashRateUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmCashRateZero
 * DTCUnallocatedAdjustmentReason2Code.mmCashRateZero}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmConditionalPayment
 * DTCUnallocatedAdjustmentReason2Code.mmConditionalPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmDefault
 * DTCUnallocatedAdjustmentReason2Code.mmDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmHolidayInCountryOfOrigin
 * DTCUnallocatedAdjustmentReason2Code.mmHolidayInCountryOfOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmInsufficientFundsReceivedFromAgent
 * DTCUnallocatedAdjustmentReason2Code.mmInsufficientFundsReceivedFromAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmIssueNotFunded
 * DTCUnallocatedAdjustmentReason2Code.mmIssueNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmIssueNotMaturing
 * DTCUnallocatedAdjustmentReason2Code.mmIssueNotMaturing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmAfterCycleCutOff
 * DTCUnallocatedAdjustmentReason2Code.mmAfterCycleCutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmItemIsPending
 * DTCUnallocatedAdjustmentReason2Code.mmItemIsPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmFundsNotReceivedByAgent
 * DTCUnallocatedAdjustmentReason2Code.mmFundsNotReceivedByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmLiquidation
 * DTCUnallocatedAdjustmentReason2Code.mmLiquidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmNotionalBalance
 * DTCUnallocatedAdjustmentReason2Code.mmNotionalBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmOther
 * DTCUnallocatedAdjustmentReason2Code.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmPaidUponReceiptOfCheck
 * DTCUnallocatedAdjustmentReason2Code.mmPaidUponReceiptOfCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmPendingConversionOfFunds
 * DTCUnallocatedAdjustmentReason2Code.mmPendingConversionOfFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmRecapitalizationNotFunded
 * DTCUnallocatedAdjustmentReason2Code.mmRecapitalizationNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmRedemptionOfRatesNotYetFunded
 * DTCUnallocatedAdjustmentReason2Code.mmRedemptionOfRatesNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmReleasedPledgePosition
 * DTCUnallocatedAdjustmentReason2Code.mmReleasedPledgePosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmSaleOfAssetsNotYetFunded
 * DTCUnallocatedAdjustmentReason2Code.mmSaleOfAssetsNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmSameDayPositionCapture
 * DTCUnallocatedAdjustmentReason2Code.mmSameDayPositionCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmSpecialDistributionNotYetFunded
 * DTCUnallocatedAdjustmentReason2Code.mmSpecialDistributionNotYetFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmSpecificIssuesSuppressed
 * DTCUnallocatedAdjustmentReason2Code.mmSpecificIssuesSuppressed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmApproximateRate
 * DTCUnallocatedAdjustmentReason2Code.mmApproximateRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmGracePeriod
 * DTCUnallocatedAdjustmentReason2Code.mmGracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmMaturityForStockPaymentOption
 * DTCUnallocatedAdjustmentReason2Code.mmMaturityForStockPaymentOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmPledgedPosition
 * DTCUnallocatedAdjustmentReason2Code.mmPledgedPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmCallRescinded
 * DTCUnallocatedAdjustmentReason2Code.mmCallRescinded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmCDAcceleratedMaturity
 * DTCUnallocatedAdjustmentReason2Code.mmCDAcceleratedMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmCHIPSPayment
 * DTCUnallocatedAdjustmentReason2Code.mmCHIPSPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmChurchBondNotFunded
 * DTCUnallocatedAdjustmentReason2Code.mmChurchBondNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmFDIC
 * DTCUnallocatedAdjustmentReason2Code.mmFDIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmFiveDayGracePeriod
 * DTCUnallocatedAdjustmentReason2Code.mmFiveDayGracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code#mmFundsHeldAtChaseForOFAC
 * DTCUnallocatedAdjustmentReason2Code.mmFundsHeldAtChaseForOFAC}</li>
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
 * "DTCUnallocatedAdjustmentReason2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "DTC Unallocated reason codes for payment adjustments."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code
 * DTCUnallocatedAdjustmentReason3Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code
 * DTCUnallocatedAdjustmentReason1Code}</li>
 * </ul>
 */
public class DTCUnallocatedAdjustmentReason2Code extends DTCUnallocatedAdjustmentReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BadAnnouncement"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmBadAnnouncement
	 * DTCUnallocatedAdjustmentReason3Code.mmBadAnnouncement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmBadAnnouncement
	 * DTCUnallocatedAdjustmentReason1Code.mmBadAnnouncement}</li>
	 * </ul>
	 */
	public static final MMCode mmBadAnnouncement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadAnnouncement";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmBadAnnouncement);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmBadAnnouncement;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BadPayableDate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmBadPayableDate
	 * DTCUnallocatedAdjustmentReason3Code.mmBadPayableDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmBadPayableDate
	 * DTCUnallocatedAdjustmentReason1Code.mmBadPayableDate}</li>
	 * </ul>
	 */
	public static final MMCode mmBadPayableDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadPayableDate";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmBadPayableDate);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmBadPayableDate;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashRateUnknown"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmCashRateUnknown
	 * DTCUnallocatedAdjustmentReason3Code.mmCashRateUnknown}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmCashRateUnknown
	 * DTCUnallocatedAdjustmentReason1Code.mmCashRateUnknown}</li>
	 * </ul>
	 */
	public static final MMCode mmCashRateUnknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateUnknown";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmCashRateUnknown);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmCashRateUnknown;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashRateZero"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmCashRateZero
	 * DTCUnallocatedAdjustmentReason3Code.mmCashRateZero}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmCashRateZero
	 * DTCUnallocatedAdjustmentReason1Code.mmCashRateZero}</li>
	 * </ul>
	 */
	public static final MMCode mmCashRateZero = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashRateZero";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmCashRateZero);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmCashRateZero;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalPayment"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmConditionalPayment
	 * DTCUnallocatedAdjustmentReason3Code.mmConditionalPayment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmConditionalPayment
	 * DTCUnallocatedAdjustmentReason1Code.mmConditionalPayment}</li>
	 * </ul>
	 */
	public static final MMCode mmConditionalPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalPayment";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmConditionalPayment);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmConditionalPayment;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Default"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmDefault
	 * DTCUnallocatedAdjustmentReason3Code.mmDefault}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmDefault
	 * DTCUnallocatedAdjustmentReason1Code.mmDefault}</li>
	 * </ul>
	 */
	public static final MMCode mmDefault = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Default";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmDefault);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmDefault;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HolidayInCountryOfOrigin"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmHolidayInCountryOfOrigin
	 * DTCUnallocatedAdjustmentReason3Code.mmHolidayInCountryOfOrigin}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmHolidayInCountryOfOrigin
	 * DTCUnallocatedAdjustmentReason1Code.mmHolidayInCountryOfOrigin}</li>
	 * </ul>
	 */
	public static final MMCode mmHolidayInCountryOfOrigin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HolidayInCountryOfOrigin";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmHolidayInCountryOfOrigin);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmHolidayInCountryOfOrigin;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientFundsReceivedFromAgent"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmInsufficientFundsReceivedFromAgent
	 * DTCUnallocatedAdjustmentReason3Code.mmInsufficientFundsReceivedFromAgent}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmInsufficientFundsReceivedFromAgent
	 * DTCUnallocatedAdjustmentReason1Code.mmInsufficientFundsReceivedFromAgent}
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInsufficientFundsReceivedFromAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFundsReceivedFromAgent";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmInsufficientFundsReceivedFromAgent);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmInsufficientFundsReceivedFromAgent;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueNotFunded"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmIssueNotFunded
	 * DTCUnallocatedAdjustmentReason3Code.mmIssueNotFunded}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmIssueNotFunded
	 * DTCUnallocatedAdjustmentReason1Code.mmIssueNotFunded}</li>
	 * </ul>
	 */
	public static final MMCode mmIssueNotFunded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotFunded";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmIssueNotFunded);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmIssueNotFunded;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueNotMaturing"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmIssueNotMaturing
	 * DTCUnallocatedAdjustmentReason3Code.mmIssueNotMaturing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmIssueNotMaturing
	 * DTCUnallocatedAdjustmentReason1Code.mmIssueNotMaturing}</li>
	 * </ul>
	 */
	public static final MMCode mmIssueNotMaturing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotMaturing";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmIssueNotMaturing);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmIssueNotMaturing;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AfterCycleCutOff"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmAfterCycleCutOff
	 * DTCUnallocatedAdjustmentReason3Code.mmAfterCycleCutOff}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmAfterCycleCutOff
	 * DTCUnallocatedAdjustmentReason1Code.mmAfterCycleCutOff}</li>
	 * </ul>
	 */
	public static final MMCode mmAfterCycleCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterCycleCutOff";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmAfterCycleCutOff);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmAfterCycleCutOff;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemIsPending"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmItemIsPending
	 * DTCUnallocatedAdjustmentReason3Code.mmItemIsPending}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmItemIsPending
	 * DTCUnallocatedAdjustmentReason1Code.mmItemIsPending}</li>
	 * </ul>
	 */
	public static final MMCode mmItemIsPending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemIsPending";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmItemIsPending);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmItemIsPending;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundsNotReceivedByAgent"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmFundsNotReceivedByAgent
	 * DTCUnallocatedAdjustmentReason3Code.mmFundsNotReceivedByAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmFundsNotReceivedByAgent
	 * DTCUnallocatedAdjustmentReason1Code.mmFundsNotReceivedByAgent}</li>
	 * </ul>
	 */
	public static final MMCode mmFundsNotReceivedByAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundsNotReceivedByAgent";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmFundsNotReceivedByAgent);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmFundsNotReceivedByAgent;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmLiquidation
	 * DTCUnallocatedAdjustmentReason3Code.mmLiquidation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmLiquidation
	 * DTCUnallocatedAdjustmentReason1Code.mmLiquidation}</li>
	 * </ul>
	 */
	public static final MMCode mmLiquidation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidation";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmLiquidation);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmLiquidation;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalBalance"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmNotionalBalance
	 * DTCUnallocatedAdjustmentReason3Code.mmNotionalBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmNotionalBalance
	 * DTCUnallocatedAdjustmentReason1Code.mmNotionalBalance}</li>
	 * </ul>
	 */
	public static final MMCode mmNotionalBalance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalBalance";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmNotionalBalance);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmNotionalBalance;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmOther
	 * DTCUnallocatedAdjustmentReason3Code.mmOther}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmOther
	 * DTCUnallocatedAdjustmentReason1Code.mmOther}</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmOther);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmOther;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaidUponReceiptOfCheck"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmPaidUponReceiptOfCheck
	 * DTCUnallocatedAdjustmentReason3Code.mmPaidUponReceiptOfCheck}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmPaidUponReceiptOfCheck
	 * DTCUnallocatedAdjustmentReason1Code.mmPaidUponReceiptOfCheck}</li>
	 * </ul>
	 */
	public static final MMCode mmPaidUponReceiptOfCheck = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaidUponReceiptOfCheck";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmPaidUponReceiptOfCheck);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmPaidUponReceiptOfCheck;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingConversionOfFunds"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmPendingConversionOfFunds
	 * DTCUnallocatedAdjustmentReason3Code.mmPendingConversionOfFunds}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmPendingConversionOfFunds
	 * DTCUnallocatedAdjustmentReason1Code.mmPendingConversionOfFunds}</li>
	 * </ul>
	 */
	public static final MMCode mmPendingConversionOfFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingConversionOfFunds";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmPendingConversionOfFunds);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmPendingConversionOfFunds;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecapitalizationNotFunded"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmRecapitalizationNotFunded
	 * DTCUnallocatedAdjustmentReason3Code.mmRecapitalizationNotFunded}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmRecapitalizationNotFunded
	 * DTCUnallocatedAdjustmentReason1Code.mmRecapitalizationNotFunded}</li>
	 * </ul>
	 */
	public static final MMCode mmRecapitalizationNotFunded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecapitalizationNotFunded";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmRecapitalizationNotFunded);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmRecapitalizationNotFunded;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionOfRatesNotYetFunded"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmRedemptionOfRatesNotYetFunded
	 * DTCUnallocatedAdjustmentReason3Code.mmRedemptionOfRatesNotYetFunded}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmRedemptionOfRatesNotYetFunded
	 * DTCUnallocatedAdjustmentReason1Code.mmRedemptionOfRatesNotYetFunded}</li>
	 * </ul>
	 */
	public static final MMCode mmRedemptionOfRatesNotYetFunded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionOfRatesNotYetFunded";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmRedemptionOfRatesNotYetFunded);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmRedemptionOfRatesNotYetFunded;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReleasedPledgePosition"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmReleasedPledgePosition
	 * DTCUnallocatedAdjustmentReason3Code.mmReleasedPledgePosition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmReleasedPledgePosition
	 * DTCUnallocatedAdjustmentReason1Code.mmReleasedPledgePosition}</li>
	 * </ul>
	 */
	public static final MMCode mmReleasedPledgePosition = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReleasedPledgePosition";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmReleasedPledgePosition);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmReleasedPledgePosition;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleOfAssetsNotYetFunded"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmSaleOfAssetsNotYetFunded
	 * DTCUnallocatedAdjustmentReason3Code.mmSaleOfAssetsNotYetFunded}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmSaleOfAssetsNotYetFunded
	 * DTCUnallocatedAdjustmentReason1Code.mmSaleOfAssetsNotYetFunded}</li>
	 * </ul>
	 */
	public static final MMCode mmSaleOfAssetsNotYetFunded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleOfAssetsNotYetFunded";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmSaleOfAssetsNotYetFunded);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmSaleOfAssetsNotYetFunded;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameDayPositionCapture"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmSameDayPositionCapture
	 * DTCUnallocatedAdjustmentReason3Code.mmSameDayPositionCapture}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmSameDayPositionCapture
	 * DTCUnallocatedAdjustmentReason1Code.mmSameDayPositionCapture}</li>
	 * </ul>
	 */
	public static final MMCode mmSameDayPositionCapture = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameDayPositionCapture";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmSameDayPositionCapture);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmSameDayPositionCapture;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDistributionNotYetFunded"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmSpecialDistributionNotYetFunded
	 * DTCUnallocatedAdjustmentReason3Code.mmSpecialDistributionNotYetFunded}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmSpecialDistributionNotYetFunded
	 * DTCUnallocatedAdjustmentReason1Code.mmSpecialDistributionNotYetFunded}</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialDistributionNotYetFunded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDistributionNotYetFunded";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmSpecialDistributionNotYetFunded);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmSpecialDistributionNotYetFunded;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecificIssuesSuppressed"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmSpecificIssuesSuppressed
	 * DTCUnallocatedAdjustmentReason3Code.mmSpecificIssuesSuppressed}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmSpecificIssuesSuppressed
	 * DTCUnallocatedAdjustmentReason1Code.mmSpecificIssuesSuppressed}</li>
	 * </ul>
	 */
	public static final MMCode mmSpecificIssuesSuppressed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecificIssuesSuppressed";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmSpecificIssuesSuppressed);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmSpecificIssuesSuppressed;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApproximateRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmApproximateRate
	 * DTCUnallocatedAdjustmentReason3Code.mmApproximateRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmApproximateRate
	 * DTCUnallocatedAdjustmentReason1Code.mmApproximateRate}</li>
	 * </ul>
	 */
	public static final MMCode mmApproximateRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApproximateRate";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmApproximateRate);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmApproximateRate;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GracePeriod"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmGracePeriod
	 * DTCUnallocatedAdjustmentReason3Code.mmGracePeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code#mmGracePeriod
	 * DTCUnallocatedAdjustmentReason1Code.mmGracePeriod}</li>
	 * </ul>
	 */
	public static final MMCode mmGracePeriod = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GracePeriod";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmGracePeriod);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason1Code.mmGracePeriod;
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityForStockPaymentOption"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmMaturityForStockPaymentOption
	 * DTCUnallocatedAdjustmentReason3Code.mmMaturityForStockPaymentOption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMaturityForStockPaymentOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityForStockPaymentOption";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmMaturityForStockPaymentOption);
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgedPosition"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmPledgedPosition
	 * DTCUnallocatedAdjustmentReason3Code.mmPledgedPosition}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPledgedPosition = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgedPosition";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmPledgedPosition);
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallRescinded"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmCallRescinded
	 * DTCUnallocatedAdjustmentReason3Code.mmCallRescinded}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCallRescinded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallRescinded";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmCallRescinded);
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CDAcceleratedMaturity"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmCDAcceleratedMaturity
	 * DTCUnallocatedAdjustmentReason3Code.mmCDAcceleratedMaturity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCDAcceleratedMaturity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CDAcceleratedMaturity";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmCDAcceleratedMaturity);
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSPayment"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmCHIPSPayment
	 * DTCUnallocatedAdjustmentReason3Code.mmCHIPSPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCHIPSPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CHIPSPayment";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmCHIPSPayment);
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChurchBondNotFunded"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmChurchBondNotFunded
	 * DTCUnallocatedAdjustmentReason3Code.mmChurchBondNotFunded}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmChurchBondNotFunded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChurchBondNotFunded";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmChurchBondNotFunded);
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FDIC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmFDIC
	 * DTCUnallocatedAdjustmentReason3Code.mmFDIC}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFDIC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FDIC";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmFDIC);
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiveDayGracePeriod"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmFiveDayGracePeriod
	 * DTCUnallocatedAdjustmentReason3Code.mmFiveDayGracePeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFiveDayGracePeriod = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiveDayGracePeriod";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmFiveDayGracePeriod);
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code
	 * DTCUnallocatedAdjustmentReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundsHeldAtChaseForOFAC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code#mmFundsHeldAtChaseForOFAC
	 * DTCUnallocatedAdjustmentReason3Code.mmFundsHeldAtChaseForOFAC}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFundsHeldAtChaseForOFAC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundsHeldAtChaseForOFAC";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason3Code.mmFundsHeldAtChaseForOFAC);
			owner_lazy = () -> DTCUnallocatedAdjustmentReason2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DTCUnallocatedAdjustmentReason2Code";
				definition = "DTC Unallocated reason codes for payment adjustments.";
				nextVersions_lazy = () -> Arrays.asList(DTCUnallocatedAdjustmentReason3Code.mmObject());
				previousVersion_lazy = () -> DTCUnallocatedAdjustmentReason1Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmBadAnnouncement, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmBadPayableDate,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmCashRateUnknown, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmCashRateZero,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmConditionalPayment, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmDefault,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmHolidayInCountryOfOrigin, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmInsufficientFundsReceivedFromAgent,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmIssueNotFunded, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmIssueNotMaturing,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmAfterCycleCutOff, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmItemIsPending,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmFundsNotReceivedByAgent, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmLiquidation,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmNotionalBalance, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmOther,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmPaidUponReceiptOfCheck, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmPendingConversionOfFunds,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmRecapitalizationNotFunded, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmRedemptionOfRatesNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmReleasedPledgePosition, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmSaleOfAssetsNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmSameDayPositionCapture, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmSpecialDistributionNotYetFunded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmSpecificIssuesSuppressed, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmApproximateRate,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmGracePeriod, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmMaturityForStockPaymentOption,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmPledgedPosition, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmCallRescinded,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmCDAcceleratedMaturity, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmCHIPSPayment,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmChurchBondNotFunded, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmFDIC,
						com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmFiveDayGracePeriod, com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason2Code.mmFundsHeldAtChaseForOFAC);
				trace_lazy = () -> DTCUnallocatedAdjustmentReasonCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}