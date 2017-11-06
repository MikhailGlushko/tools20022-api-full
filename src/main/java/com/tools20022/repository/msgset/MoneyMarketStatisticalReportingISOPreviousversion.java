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

package com.tools20022.repository.msgset;

import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.repository.area.auth.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * This message set provides for the specification of the statistical reporting
 * requirements.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV01
 * MoneyMarketForeignExchangeSwapsStatisticalReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketOvernightIndexSwapsStatisticalReportV01
 * MoneyMarketOvernightIndexSwapsStatisticalReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV01
 * MoneyMarketUnsecuredMarketStatisticalReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketSecuredMarketStatisticalReportV01
 * MoneyMarketSecuredMarketStatisticalReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketStatisticalReportStatusAdviceV01
 * MoneyMarketStatisticalReportStatusAdviceV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmcatalogue
 * GeneratedRepository.mmcatalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Money Market Statistical Reporting - ISO - Previous version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "This message set provides for the specification of the statistical reporting requirements."
 * </li>
 * </ul>
 */
public class MoneyMarketStatisticalReportingISOPreviousversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.mmcatalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Money Market Statistical Reporting - ISO - Previous version";
				definition = "This message set provides for the specification of the statistical reporting requirements.";
				messageDefinition_lazy = () -> Arrays.asList(MoneyMarketForeignExchangeSwapsStatisticalReportV01.mmObject(), MoneyMarketOvernightIndexSwapsStatisticalReportV01.mmObject(),
						MoneyMarketUnsecuredMarketStatisticalReportV01.mmObject(), MoneyMarketSecuredMarketStatisticalReportV01.mmObject(), MoneyMarketStatisticalReportStatusAdviceV01.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}