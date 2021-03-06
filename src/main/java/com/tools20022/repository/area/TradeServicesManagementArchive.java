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

package com.tools20022.repository.area;

import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.tsmt.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support ancillary commercial trade services functions,
 * including checking, matching and reporting, plus any exceptions and
 * investigations related to trade services transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "tsmt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03
 * BaselineAmendmentRequestV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03
 * BaselineReSubmissionV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03
 * DataSetSubmissionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03
 * ForwardDataSetSubmissionReportV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV03
 * FullPushThroughReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV03
 * InitialBaselineSubmissionV03}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Trade Services Management - Archive - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support ancillary commercial trade services functions, including checking, matching and reporting, plus any exceptions and investigations related to trade services transactions."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
public class TradeServicesManagementArchive {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Trade Services Management - Archive - master";
				definition = "Messages that support ancillary commercial trade services functions, including checking, matching and reporting, plus any exceptions and investigations related to trade services transactions.";
				code = "tsmt";
				messageDefinition_lazy = () -> Arrays.asList(BaselineAmendmentRequestV03.mmObject(), BaselineReSubmissionV03.mmObject(), DataSetSubmissionV03.mmObject(), ForwardDataSetSubmissionReportV03.mmObject(),
						FullPushThroughReportV03.mmObject(), InitialBaselineSubmissionV03.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}