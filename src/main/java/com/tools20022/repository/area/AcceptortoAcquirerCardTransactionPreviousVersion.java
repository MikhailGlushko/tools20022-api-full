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
import com.tools20022.repository.area.caaa.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support any card payment related transactions and services
 * between a card acceptor and a card transaction acquirer. It includes the
 * authorisation, cancellation and capture of card transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "caaa"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV03
 * AcceptorCancellationAdviceResponseV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV03
 * AcceptorDiagnosticResponseV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV01
 * AcceptorCurrencyConversionResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationResponseV03
 * AcceptorCancellationResponseV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV03
 * AcceptorCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV01
 * AcceptorCurrencyConversionRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV03
 * AcceptorReconciliationResponseV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV03
 * AcceptorBatchTransferResponseV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV03
 * AcceptorCompletionAdviceResponseV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorRejectionV03
 * AcceptorRejectionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV03
 * AcceptorDiagnosticRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV03
 * AcceptorAuthorisationRequestV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV03
 * AcceptorBatchTransferV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV03
 * AcceptorCompletionAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV03
 * AcceptorCancellationAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV03
 * AcceptorReconciliationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV03
 * AcceptorAuthorisationResponseV03}</li>
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
 * "Acceptor to Acquirer Card Transaction - Previous version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support any card payment related transactions and services between a card acceptor and a card transaction acquirer. It includes the authorisation, cancellation and capture of card transactions."
 * </li>
 * </ul>
 */
public class AcceptortoAcquirerCardTransactionPreviousVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.mmcatalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Acceptor to Acquirer Card Transaction - Previous version - master";
				definition = "Messages that support any card payment related transactions and services between a card acceptor and a card transaction acquirer. It includes the authorisation, cancellation and capture of card transactions.";
				messageDefinition_lazy = () -> Arrays.asList(AcceptorCancellationAdviceResponseV03.mmObject(), AcceptorDiagnosticResponseV03.mmObject(), AcceptorCurrencyConversionResponseV01.mmObject(),
						AcceptorCancellationResponseV03.mmObject(), AcceptorCancellationRequestV03.mmObject(), AcceptorCurrencyConversionRequestV01.mmObject(), AcceptorReconciliationResponseV03.mmObject(),
						AcceptorBatchTransferResponseV03.mmObject(), AcceptorCompletionAdviceResponseV03.mmObject(), AcceptorRejectionV03.mmObject(), AcceptorDiagnosticRequestV03.mmObject(), AcceptorAuthorisationRequestV03.mmObject(),
						AcceptorBatchTransferV03.mmObject(), AcceptorCompletionAdviceV03.mmObject(), AcceptorCancellationAdviceV03.mmObject(), AcceptorReconciliationRequestV03.mmObject(), AcceptorAuthorisationResponseV03.mmObject());
				code = "caaa";
			}
		});
		return mmObject_lazy.get();
	}
}