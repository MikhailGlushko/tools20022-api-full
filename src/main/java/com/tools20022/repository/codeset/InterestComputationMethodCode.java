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
 * Specifies the method used to compute accruing interest of a financial
 * instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode#mmIC30360ISDAor30360AmericanBasicRule
 * InterestComputationMethodCode.mmIC30360ISDAor30360AmericanBasicRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode#mmIC30365
 * InterestComputationMethodCode.mmIC30365}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode#mmIC30Actual
 * InterestComputationMethodCode.mmIC30Actual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode#mmActual360
 * InterestComputationMethodCode.mmActual360}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode#mmActual365Fixed
 * InterestComputationMethodCode.mmActual365Fixed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode#mmActualActualICMA
 * InterestComputationMethodCode.mmActualActualICMA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode#mmIC30E360orEuroBondBasismodel1
 * InterestComputationMethodCode.mmIC30E360orEuroBondBasismodel1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode#mmActualActualISDA
 * InterestComputationMethodCode.mmActualActualISDA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode#mmActual365LorActuActubasisRule
 * InterestComputationMethodCode.mmActual365LorActuActubasisRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode#mmActualActualAFB
 * InterestComputationMethodCode.mmActualActualAFB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode#mmIC30360ICMAor30360basicrule
 * InterestComputationMethodCode.mmIC30360ICMAor30360basicrule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode#mmIC30E2360orEurobondbasismodel2
 * InterestComputationMethodCode.mmIC30E2360orEurobondbasismodel2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode#mmIC30E3360orEurobondbasismodel3
 * InterestComputationMethodCode.mmIC30E3360orEurobondbasismodel3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode#mmActual365NL
 * InterestComputationMethodCode.mmActual365NL}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode#mmNarrative
 * InterestComputationMethodCode.mmNarrative}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
 * InterestComputationMethod2Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code
 * InterestComputationMethod1Code}</li>
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
 * <li>"A001"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InterestComputationMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the method used to compute accruing interest of a financial instrument."
 * </li>
 * </ul>
 */
public class InterestComputationMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Method whereby interest is calculated based on a 30-day month and a
	 * 360-day year. Accrued interest to a value date on the last day of a month
	 * shall be the same as to the 30th calendar day of the same month, except
	 * for February, and provided that the interest period started on a 30th or
	 * a 31st. This means that a 31st is assumed to be a 30th if the period
	 * started on a 30th or a 31st and the 28 Feb (or 29 Feb for a leap year) is
	 * assumed to be a 28th (or 29th). It is the most commonly used 30/360
	 * method for US straight and convertible bonds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
	 * InterestComputationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "A001"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30360ISDAor30360AmericanBasicRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month, except for February, and provided that the interest period started on a 30th or a 31st. This means that a 31st is assumed to be a 30th if the period started on a 30th or a 31st and the 28\nFeb (or 29 Feb for a leap year) is assumed to be a 28th (or 29th). It is the most commonly used 30/360 method for US straight and convertible bonds."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIC30360ISDAor30360AmericanBasicRule = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IC30360ISDAor30360AmericanBasicRule";
			definition = "Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month, except for February, and provided that the interest period started on a 30th or a 31st. This means that a 31st is assumed to be a 30th if the period started on a 30th or a 31st and the 28\nFeb (or 29 Feb for a leap year) is assumed to be a 28th (or 29th). It is the most commonly used 30/360 method for US straight and convertible bonds.";
			owner_lazy = () -> InterestComputationMethodCode.mmObject();
			codeName = "A001";
		}
	};
	/**
	 * Method whereby interest is calculated based on a 30-day month in a way
	 * similar to the 30/360 (basic rule) and a 365-day year. Accrued interest
	 * to a value date on the last day of a month shall be the same as to the
	 * 30th calendar day of the same month, except for February. This means that
	 * a 31st is assumed to be a 30th and the 28 Feb (or 29 Feb for a leap year)
	 * is assumed to be a 28th (or 29th).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
	 * InterestComputationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "A002"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30365"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on a 30-day month in a way similar to the 30/360 (basic rule) and a 365-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month, except for February. This means that a 31st is assumed to be a 30th and the 28 Feb (or 29 Feb for a leap year) is assumed to be a 28th (or 29th)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIC30365 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IC30365";
			definition = "Method whereby interest is calculated based on a 30-day month in a way similar to the 30/360 (basic rule) and a 365-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month, except for February. This means that a 31st is assumed to be a 30th and the 28 Feb (or 29 Feb for a leap year) is assumed to be a 28th (or 29th).";
			owner_lazy = () -> InterestComputationMethodCode.mmObject();
			codeName = "A002";
		}
	};
	/**
	 * Method whereby interest is calculated based on a 30-day month in a way
	 * similar to the 30/360 (basic rule) and the assumed number of days in a
	 * year in a way similar to the Actual/Actual (ICMA). Accrued interest to a
	 * value date on the last day of a month shall be the same as to the 30th
	 * calendar day of the same month, except for February. This means that a
	 * 31st is assumed to be a 30th and the 28 Feb (or 29 Feb for a leap year)
	 * is assumed to be a 28th (or 29th). The assumed number of days in a year
	 * is computed as the actual number of days in the coupon period multiplied
	 * by the number of interest payments in the year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
	 * InterestComputationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "A003"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30Actual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on a 30-day month in a way similar to the 30/360 (basic rule) and the assumed number of days in a year in a way similar to the Actual/Actual (ICMA). Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month, except for February. This means that a 31st is assumed to be a 30th and the 28 Feb (or 29 Feb for a leap year) is assumed to be a 28th (or 29th). The assumed number of days in a year is computed as the actual number of days in the coupon period multiplied by the number of interest payments in the year."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIC30Actual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IC30Actual";
			definition = "Method whereby interest is calculated based on a 30-day month in a way similar to the 30/360 (basic rule) and the assumed number of days in a year in a way similar to the Actual/Actual (ICMA). Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month, except for February. This means that a 31st is assumed to be a 30th and the 28 Feb (or 29 Feb for a leap year) is assumed to be a 28th (or 29th). The assumed number of days in a year is computed as the actual number of days in the coupon period multiplied by the number of interest payments in the year.";
			owner_lazy = () -> InterestComputationMethodCode.mmObject();
			codeName = "A003";
		}
	};
	/**
	 * Method whereby interest is calculated based on the actual number of
	 * accrued days in the interest period and a 360-day year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
	 * InterestComputationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "A004"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual360"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on the actual number of accrued days in the interest period and a 360-day year."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmActual360 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Actual360";
			definition = "Method whereby interest is calculated based on the actual number of accrued days in the interest period and a 360-day year.";
			owner_lazy = () -> InterestComputationMethodCode.mmObject();
			codeName = "A004";
		}
	};
	/**
	 * Method whereby interest is calculated based on the actual number of
	 * accrued days in the interest period and a 365-day year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
	 * InterestComputationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "A005"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual365Fixed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on the actual number of accrued days in the interest period and a 365-day year."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmActual365Fixed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Actual365Fixed";
			definition = "Method whereby interest is calculated based on the actual number of accrued days in the interest period and a 365-day year.";
			owner_lazy = () -> InterestComputationMethodCode.mmObject();
			codeName = "A005";
		}
	};
	/**
	 * Method whereby interest is calculated based on the actual number of
	 * accrued days and the assumed number of days in a year, ie, the actual
	 * number of days in the coupon period multiplied by the number of interest
	 * payments in the year. If the coupon period is irregular (first or last
	 * coupon), it is extended or split into quasi interest periods that have
	 * the length of a regular coupon period and the computation is operated
	 * separately on each quasi interest period and the intermediate results are
	 * summed up.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
	 * InterestComputationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "A006"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualActualICMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on the actual number of accrued days and the assumed number of days in a year, ie, the actual number of days in the coupon period multiplied by the number of interest payments in the year. If the coupon period is irregular (first or last coupon), it is extended or split into quasi interest periods that have the length of a regular coupon period and the computation is operated separately on each quasi interest period and the intermediate results are summed up."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmActualActualICMA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActualActualICMA";
			definition = "Method whereby interest is calculated based on the actual number of accrued days and the assumed number of days in a year, ie, the actual number of days in the coupon period multiplied by the number of interest payments in the year. If the coupon period is irregular (first or last coupon), it is extended or split into quasi interest periods that have the length of a regular coupon period and the computation is operated separately on each quasi interest period and the intermediate results are summed up.";
			owner_lazy = () -> InterestComputationMethodCode.mmObject();
			codeName = "A006";
		}
	};
	/**
	 * Method whereby interest is calculated based on a 30-day month and a
	 * 360-day year. Accrued interest to a value date on the last day of a month
	 * shall be the same as to the 30th calendar day of the same month. This
	 * means that a 31st is assumed to be a 30th and the 28 Feb (or 29 Feb for a
	 * leap year) is assumed to be equivalent to a 30 Feb. However, if the last
	 * day of the maturity coupon period is the last day of February, it will
	 * not be assumed to be a 30th. It is a variation of the 30/360 (ICMA)
	 * method commonly used for eurobonds. The usage of this variation is only
	 * relevant when the coupon periods are scheduled to end on the last day of
	 * the month.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
	 * InterestComputationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "A007"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30E360orEuroBondBasismodel1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month. This means that a 31st is\nassumed to be a 30th and the 28 Feb (or 29 Feb for a leap year) is assumed to be equivalent to a 30 Feb. However, if the last day of the maturity coupon period is the last day of February, it will not be assumed to be a 30th. It is a variation of the 30/360 (ICMA) method commonly used for eurobonds. The usage of this variation is only relevant when the coupon periods are scheduled to end on the last day of the month."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIC30E360orEuroBondBasismodel1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IC30E360orEuroBondBasismodel1";
			definition = "Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month. This means that a 31st is\nassumed to be a 30th and the 28 Feb (or 29 Feb for a leap year) is assumed to be equivalent to a 30 Feb. However, if the last day of the maturity coupon period is the last day of February, it will not be assumed to be a 30th. It is a variation of the 30/360 (ICMA) method commonly used for eurobonds. The usage of this variation is only relevant when the coupon periods are scheduled to end on the last day of the month.";
			owner_lazy = () -> InterestComputationMethodCode.mmObject();
			codeName = "A007";
		}
	};
	/**
	 * Method whereby interest is calculated based on the actual number of
	 * accrued days of the interest period that fall (falling on a normal year,
	 * year) divided by 365, added to the actual number of days of the interest
	 * period that fall (falling on a leap year, year) divided by 366.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
	 * InterestComputationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "A008"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualActualISDA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on the actual number of accrued days of the interest period that fall (falling on a normal year, year) divided by 365, added to the actual number of days of the interest period that fall (falling on a leap year, year) divided by 366."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmActualActualISDA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActualActualISDA";
			definition = "Method whereby interest is calculated based on the actual number of accrued days of the interest period that fall (falling on a normal year, year) divided by 365, added to the actual number of days of the interest period that fall (falling on a leap year, year) divided by 366.";
			owner_lazy = () -> InterestComputationMethodCode.mmObject();
			codeName = "A008";
		}
	};
	/**
	 * Method whereby interest is calculated based on the actual number of
	 * accrued days and a 365-day year (if the coupon payment date is NOT in a
	 * leap year) or a 366-day year (if the coupon payment date is in a leap
	 * year).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
	 * InterestComputationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "A009"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual365LorActuActubasisRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on the actual number of accrued days and a 365-day year (if the coupon payment date is NOT in a leap year) or a 366-day year (if the coupon payment date is in a leap year)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmActual365LorActuActubasisRule = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Actual365LorActuActubasisRule";
			definition = "Method whereby interest is calculated based on the actual number of accrued days and a 365-day year (if the coupon payment date is NOT in a leap year) or a 366-day year (if the coupon payment date is in a leap year).";
			owner_lazy = () -> InterestComputationMethodCode.mmObject();
			codeName = "A009";
		}
	};
	/**
	 * Method whereby interest is calculated based on the actual number of
	 * accrued days and a 366-day year (if 29 Feb falls in the coupon period) or
	 * a 365-day year (if 29 Feb does not fall in the coupon period). If a
	 * coupon period is longer than one year, it is split by repetitively
	 * separating full year sub-periods counting backwards from the end of the
	 * coupon period (a year backwards from a 28 Feb being 29 Feb, if it
	 * exists). The first of the sub-periods starts on the start date of the
	 * accrued interest period and thus is possibly shorter than a year. Then
	 * the interest computation is operated separately on each sub-period and
	 * the intermediate results are summed up.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
	 * InterestComputationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "A010"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualActualAFB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on the actual number of accrued days and a 366-day year (if 29 Feb falls in the coupon period) or a 365-day year (if 29 Feb does not fall in the coupon period). If a coupon period is longer than one year, it is split by repetitively separating full year sub-periods counting backwards from the end of the coupon period (a year backwards from a 28 Feb being 29 Feb, if it exists). The first of the sub-periods starts on the start date of the accrued interest period and thus is possibly shorter than a year. Then the interest computation is operated separately on each sub-period and the intermediate results are summed up."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmActualActualAFB = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActualActualAFB";
			definition = "Method whereby interest is calculated based on the actual number of accrued days and a 366-day year (if 29 Feb falls in the coupon period) or a 365-day year (if 29 Feb does not fall in the coupon period). If a coupon period is longer than one year, it is split by repetitively separating full year sub-periods counting backwards from the end of the coupon period (a year backwards from a 28 Feb being 29 Feb, if it exists). The first of the sub-periods starts on the start date of the accrued interest period and thus is possibly shorter than a year. Then the interest computation is operated separately on each sub-period and the intermediate results are summed up.";
			owner_lazy = () -> InterestComputationMethodCode.mmObject();
			codeName = "A010";
		}
	};
	/**
	 * Method whereby interest is calculated based on a 30-day month and a
	 * 360-day year. Accrued interest to a value date on the last day of a month
	 * shall be the same as to the 30th calendar day of the same month, except
	 * for February. This means that a 31st is assumed to be a 30th and the 28
	 * Feb (or 29 Feb for a leap year) is assumed to be a 28th (or 29th). It is
	 * the most commonly used 30/360 method for non-US straight and convertible
	 * bonds issued before 01/01/1999.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
	 * InterestComputationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "A011"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30360ICMAor30360basicrule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month, except for February. This means that a 31st is assumed to be a 30th and the 28 Feb (or 29 Feb for a leap\nyear) is assumed to be a 28th (or 29th). It is the most commonly used 30/360 method for non-US straight and convertible bonds issued before 01/01/1999."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIC30360ICMAor30360basicrule = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IC30360ICMAor30360basicrule";
			definition = "Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month, except for February. This means that a 31st is assumed to be a 30th and the 28 Feb (or 29 Feb for a leap\nyear) is assumed to be a 28th (or 29th). It is the most commonly used 30/360 method for non-US straight and convertible bonds issued before 01/01/1999.";
			owner_lazy = () -> InterestComputationMethodCode.mmObject();
			codeName = "A011";
		}
	};
	/**
	 * Method whereby interest is calculated based on a 30-day month and a
	 * 360-day year. Accrued interest to a value date on the last day of a month
	 * shall be the same as to the 30th calendar day of the same month, except
	 * for the last day of February whose day of the month value shall be
	 * adapted to the value of the first day of the interest period if the
	 * latter is higher and if the period is one of a regular schedule. This
	 * means that a 31st is assumed to be a 30th and the 28th Feb of a non-leap
	 * year is assumed to be equivalent to a 29th Feb when the first day of the
	 * interest period is a 29th, or to a 30th Feb when the first day of the
	 * interest period is a 30th or a 31st. The 29th Feb of a leap year is
	 * assumed to be equivalent to a 30th Feb when the first day of the interest
	 * period is a 30th or a 31st. Similarly, if the coupon period starts on the
	 * last day of February, it is assumed to produce only one day of interest
	 * in February as if it was starting on a 30th Feb when the end of the
	 * period is a 30th or a 31st, or two days of interest in February when the
	 * end of the period is a 29th, or 3 days of interest in February when it is
	 * the 28th Feb of a non-leap year and the end of the period is before the
	 * 29th.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
	 * InterestComputationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "A012"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30E2360orEurobondbasismodel2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month, except for the last day of February whose day of the month value shall be adapted to the value of the first day of the interest period if the latter is higher and if the period is one of a regular schedule. This means that a 31st is assumed to be a 30th and the 28th Feb of a non-leap year is assumed to be equivalent to a 29th Feb when the first day of the interest period is a 29th, or to a 30th Feb when the first day of the interest period is a 30th or a 31st. The 29th Feb of a leap year is assumed to be equivalent to a 30th Feb when the first day of the interest period is a 30th or a 31st. Similarly, if the coupon period starts on the last day of February, it is assumed to produce only one day of interest in February as if it was starting on a 30th Feb when the end of the period is a 30th or a 31st, or two days of interest in February when the end of the period is a 29th, or 3 days of interest in February when it is the 28th Feb of a non-leap year and the end of the period is before the 29th."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIC30E2360orEurobondbasismodel2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IC30E2360orEurobondbasismodel2";
			definition = "Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month, except for the last day of February whose day of the month value shall be adapted to the value of the first day of the interest period if the latter is higher and if the period is one of a regular schedule. This means that a 31st is assumed to be a 30th and the 28th Feb of a non-leap year is assumed to be equivalent to a 29th Feb when the first day of the interest period is a 29th, or to a 30th Feb when the first day of the interest period is a 30th or a 31st. The 29th Feb of a leap year is assumed to be equivalent to a 30th Feb when the first day of the interest period is a 30th or a 31st. Similarly, if the coupon period starts on the last day of February, it is assumed to produce only one day of interest in February as if it was starting on a 30th Feb when the end of the period is a 30th or a 31st, or two days of interest in February when the end of the period is a 29th, or 3 days of interest in February when it is the 28th Feb of a non-leap year and the end of the period is before the 29th.";
			owner_lazy = () -> InterestComputationMethodCode.mmObject();
			codeName = "A012";
		}
	};
	/**
	 * Method whereby interest is calculated based on a 30-day month and a
	 * 360-day year. Accrued interest to a value date on the last day of a month
	 * shall be the same as to the 30th calendar day of the same month. This
	 * means that a 31st is assumed to be a 30th and the 28 Feb (or 29 Feb for a
	 * leap year) is assumed to be equivalent to a 30 Feb. It is a variation of
	 * the 30E/360 (or Eurobond basis) method where the last day of February is
	 * always assumed to be a 30th, even if it is the last day of the maturity
	 * coupon period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
	 * InterestComputationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "A013"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30E3360orEurobondbasismodel3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month. This means that a 31st is assumed to be a 30th and the 28 Feb (or 29 Feb for a leap year) is assumed to be equivalent to a 30 Feb. It is a variation of the 30E/360 (or Eurobond basis) method where the last day of February is always assumed to be a 30th, even if it is the last day of the maturity coupon period."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIC30E3360orEurobondbasismodel3 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IC30E3360orEurobondbasismodel3";
			definition = "Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month. This means that a 31st is assumed to be a 30th and the 28 Feb (or 29 Feb for a leap year) is assumed to be equivalent to a 30 Feb. It is a variation of the 30E/360 (or Eurobond basis) method where the last day of February is always assumed to be a 30th, even if it is the last day of the maturity coupon period.";
			owner_lazy = () -> InterestComputationMethodCode.mmObject();
			codeName = "A013";
		}
	};
	/**
	 * Method whereby interest is calculated based on the actual number of
	 * accrued days in the interest period, excluding any leap day from the
	 * count, and a 365-day year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
	 * InterestComputationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "A014"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual365NL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on the actual number of accrued days in the interest period, excluding any leap day from the count, and a 365-day year."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmActual365NL = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Actual365NL";
			definition = "Method whereby interest is calculated based on the actual number of accrued days in the interest period, excluding any leap day from the count, and a 365-day year.";
			owner_lazy = () -> InterestComputationMethodCode.mmObject();
			codeName = "A014";
		}
	};
	/**
	 * Other method than A001-A014. See Narrative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
	 * InterestComputationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NARR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Narrative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other method than A001-A014. See Narrative."</li>
	 * </ul>
	 */
	public static final MMCode mmNarrative = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Narrative";
			definition = "Other method than A001-A014. See Narrative.";
			owner_lazy = () -> InterestComputationMethodCode.mmObject();
			codeName = "NARR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("A001");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InterestComputationMethodCode";
				definition = "Specifies the method used to compute accruing interest of a financial instrument.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InterestComputationMethodCode.mmIC30360ISDAor30360AmericanBasicRule, com.tools20022.repository.codeset.InterestComputationMethodCode.mmIC30365,
						com.tools20022.repository.codeset.InterestComputationMethodCode.mmIC30Actual, com.tools20022.repository.codeset.InterestComputationMethodCode.mmActual360,
						com.tools20022.repository.codeset.InterestComputationMethodCode.mmActual365Fixed, com.tools20022.repository.codeset.InterestComputationMethodCode.mmActualActualICMA,
						com.tools20022.repository.codeset.InterestComputationMethodCode.mmIC30E360orEuroBondBasismodel1, com.tools20022.repository.codeset.InterestComputationMethodCode.mmActualActualISDA,
						com.tools20022.repository.codeset.InterestComputationMethodCode.mmActual365LorActuActubasisRule, com.tools20022.repository.codeset.InterestComputationMethodCode.mmActualActualAFB,
						com.tools20022.repository.codeset.InterestComputationMethodCode.mmIC30360ICMAor30360basicrule, com.tools20022.repository.codeset.InterestComputationMethodCode.mmIC30E2360orEurobondbasismodel2,
						com.tools20022.repository.codeset.InterestComputationMethodCode.mmIC30E3360orEurobondbasismodel3, com.tools20022.repository.codeset.InterestComputationMethodCode.mmActual365NL,
						com.tools20022.repository.codeset.InterestComputationMethodCode.mmNarrative);
				derivation_lazy = () -> Arrays.asList(InterestComputationMethod2Code.mmObject(), InterestComputationMethod1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}