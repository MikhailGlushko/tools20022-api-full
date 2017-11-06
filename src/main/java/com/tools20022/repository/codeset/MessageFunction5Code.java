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
import com.tools20022.repository.codeset.MessageFunctionCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of message supporting a service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
 * MessageFunctionCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code#mmFinancialAuthorisationRequest
 * MessageFunction5Code.mmFinancialAuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code#mmCancellationRequest
 * MessageFunction5Code.mmCancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code#mmCompletionAdvice
 * MessageFunction5Code.mmCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code#mmDiagnosticRequest
 * MessageFunction5Code.mmDiagnosticRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code#mmReconciliationRequest
 * MessageFunction5Code.mmReconciliationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code#mmCancellationAdvice
 * MessageFunction5Code.mmCancellationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code#mmBatchTransfer
 * MessageFunction5Code.mmBatchTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code#mmFinancialReversalAdvice
 * MessageFunction5Code.mmFinancialReversalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code#mmAuthorisationRequest
 * MessageFunction5Code.mmAuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code#mmFinancialCompletionAdvice
 * MessageFunction5Code.mmFinancialCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code#mmAcquirerReversalAdvice
 * MessageFunction5Code.mmAcquirerReversalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code#mmCurrencyConversionRequest
 * MessageFunction5Code.mmCurrencyConversionRequest}</li>
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
 * <li>"FAUQ"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MessageFunction5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of message supporting a service."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageFunction12Code
 * MessageFunction12Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.MessageFunction3Code
 * MessageFunction3Code}</li>
 * </ul>
 */
public class MessageFunction5Code extends MessageFunctionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code
	 * MessageFunction5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAuthorisationRequest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction12Code#mmFinancialAuthorisationRequest
	 * MessageFunction12Code.mmFinancialAuthorisationRequest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction3Code#mmFinancialAuthorisationRequest
	 * MessageFunction3Code.mmFinancialAuthorisationRequest}</li>
	 * </ul>
	 */
	public static final MMCode mmFinancialAuthorisationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAuthorisationRequest";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction12Code.mmFinancialAuthorisationRequest);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.MessageFunction3Code.mmFinancialAuthorisationRequest;
			owner_lazy = () -> MessageFunction5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code
	 * MessageFunction5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction12Code#mmCancellationRequest
	 * MessageFunction12Code.mmCancellationRequest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction3Code#mmCancellationRequest
	 * MessageFunction3Code.mmCancellationRequest}</li>
	 * </ul>
	 */
	public static final MMCode mmCancellationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequest";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction12Code.mmCancellationRequest);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.MessageFunction3Code.mmCancellationRequest;
			owner_lazy = () -> MessageFunction5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code
	 * MessageFunction5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionAdvice"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction12Code#mmCompletionAdvice
	 * MessageFunction12Code.mmCompletionAdvice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction3Code#mmCompletionAdvice
	 * MessageFunction3Code.mmCompletionAdvice}</li>
	 * </ul>
	 */
	public static final MMCode mmCompletionAdvice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletionAdvice";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction12Code.mmCompletionAdvice);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.MessageFunction3Code.mmCompletionAdvice;
			owner_lazy = () -> MessageFunction5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code
	 * MessageFunction5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiagnosticRequest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction12Code#mmDiagnosticRequest
	 * MessageFunction12Code.mmDiagnosticRequest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction3Code#mmDiagnosticRequest
	 * MessageFunction3Code.mmDiagnosticRequest}</li>
	 * </ul>
	 */
	public static final MMCode mmDiagnosticRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiagnosticRequest";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction12Code.mmDiagnosticRequest);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.MessageFunction3Code.mmDiagnosticRequest;
			owner_lazy = () -> MessageFunction5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code
	 * MessageFunction5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationRequest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction12Code#mmReconciliationRequest
	 * MessageFunction12Code.mmReconciliationRequest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction3Code#mmReconciliationRequest
	 * MessageFunction3Code.mmReconciliationRequest}</li>
	 * </ul>
	 */
	public static final MMCode mmReconciliationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationRequest";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction12Code.mmReconciliationRequest);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.MessageFunction3Code.mmReconciliationRequest;
			owner_lazy = () -> MessageFunction5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code
	 * MessageFunction5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationAdvice"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction12Code#mmCancellationAdvice
	 * MessageFunction12Code.mmCancellationAdvice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction3Code#mmCancellationAdvice
	 * MessageFunction3Code.mmCancellationAdvice}</li>
	 * </ul>
	 */
	public static final MMCode mmCancellationAdvice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationAdvice";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction12Code.mmCancellationAdvice);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.MessageFunction3Code.mmCancellationAdvice;
			owner_lazy = () -> MessageFunction5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code
	 * MessageFunction5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchTransfer"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction12Code#mmBatchTransfer
	 * MessageFunction12Code.mmBatchTransfer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction3Code#mmBatchTransfer
	 * MessageFunction3Code.mmBatchTransfer}</li>
	 * </ul>
	 */
	public static final MMCode mmBatchTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchTransfer";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction12Code.mmBatchTransfer);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.MessageFunction3Code.mmBatchTransfer;
			owner_lazy = () -> MessageFunction5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code
	 * MessageFunction5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialReversalAdvice"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction12Code#mmFinancialReversalAdvice
	 * MessageFunction12Code.mmFinancialReversalAdvice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction3Code#mmFinancialReversalAdvice
	 * MessageFunction3Code.mmFinancialReversalAdvice}</li>
	 * </ul>
	 */
	public static final MMCode mmFinancialReversalAdvice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialReversalAdvice";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction12Code.mmFinancialReversalAdvice);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.MessageFunction3Code.mmFinancialReversalAdvice;
			owner_lazy = () -> MessageFunction5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code
	 * MessageFunction5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationRequest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction12Code#mmAuthorisationRequest
	 * MessageFunction12Code.mmAuthorisationRequest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction3Code#mmAuthorisationRequest
	 * MessageFunction3Code.mmAuthorisationRequest}</li>
	 * </ul>
	 */
	public static final MMCode mmAuthorisationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationRequest";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction12Code.mmAuthorisationRequest);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.MessageFunction3Code.mmAuthorisationRequest;
			owner_lazy = () -> MessageFunction5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code
	 * MessageFunction5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCompletionAdvice"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction12Code#mmFinancialCompletionAdvice
	 * MessageFunction12Code.mmFinancialCompletionAdvice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction3Code#mmFinancialCompletionAdvice
	 * MessageFunction3Code.mmFinancialCompletionAdvice}</li>
	 * </ul>
	 */
	public static final MMCode mmFinancialCompletionAdvice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialCompletionAdvice";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction12Code.mmFinancialCompletionAdvice);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.MessageFunction3Code.mmFinancialCompletionAdvice;
			owner_lazy = () -> MessageFunction5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code
	 * MessageFunction5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerReversalAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction3Code#mmReversalAdvice
	 * MessageFunction3Code.mmReversalAdvice}</li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerReversalAdvice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReversalAdvice";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.MessageFunction3Code.mmReversalAdvice;
			owner_lazy = () -> MessageFunction5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction5Code
	 * MessageFunction5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionRequest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction12Code#mmCurrencyConversionRequest
	 * MessageFunction12Code.mmCurrencyConversionRequest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCurrencyConversionRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionRequest";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction12Code.mmCurrencyConversionRequest);
			owner_lazy = () -> MessageFunction5Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("FAUQ");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MessageFunction5Code";
				definition = "Type of message supporting a service.";
				nextVersions_lazy = () -> Arrays.asList(MessageFunction12Code.mmObject());
				previousVersion_lazy = () -> MessageFunction3Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction5Code.mmFinancialAuthorisationRequest, com.tools20022.repository.codeset.MessageFunction5Code.mmCancellationRequest,
						com.tools20022.repository.codeset.MessageFunction5Code.mmCompletionAdvice, com.tools20022.repository.codeset.MessageFunction5Code.mmDiagnosticRequest,
						com.tools20022.repository.codeset.MessageFunction5Code.mmReconciliationRequest, com.tools20022.repository.codeset.MessageFunction5Code.mmCancellationAdvice,
						com.tools20022.repository.codeset.MessageFunction5Code.mmBatchTransfer, com.tools20022.repository.codeset.MessageFunction5Code.mmFinancialReversalAdvice,
						com.tools20022.repository.codeset.MessageFunction5Code.mmAuthorisationRequest, com.tools20022.repository.codeset.MessageFunction5Code.mmFinancialCompletionAdvice,
						com.tools20022.repository.codeset.MessageFunction5Code.mmAcquirerReversalAdvice, com.tools20022.repository.codeset.MessageFunction5Code.mmCurrencyConversionRequest);
				trace_lazy = () -> MessageFunctionCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}