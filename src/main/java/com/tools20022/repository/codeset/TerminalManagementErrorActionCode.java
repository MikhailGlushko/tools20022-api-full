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
 * Action to perform in case of error during the action in progress.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorActionCode#mmIgnoreError
 * TerminalManagementErrorActionCode.mmIgnoreError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorActionCode#mmSendStatusReport
 * TerminalManagementErrorActionCode.mmSendStatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorActionCode#mmStopSequence
 * TerminalManagementErrorActionCode.mmStopSequence}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorAction1Code
 * TerminalManagementErrorAction1Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorAction2Code
 * TerminalManagementErrorAction2Code}</li>
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
 * <li>"IGNR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminalManagementErrorActionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Action to perform in case of error during the action in progress."</li>
 * </ul>
 */
public class TerminalManagementErrorActionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Ignore the error.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorActionCode
	 * TerminalManagementErrorActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IGNR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IgnoreError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ignore the error."</li>
	 * </ul>
	 */
	public static final MMCode mmIgnoreError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IgnoreError";
			definition = "Ignore the error.";
			owner_lazy = () -> TerminalManagementErrorActionCode.mmObject();
			codeName = "IGNR";
		}
	};
	/**
	 * Send a status report immediately.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorActionCode
	 * TerminalManagementErrorActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDSR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SendStatusReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Send a status report immediately."</li>
	 * </ul>
	 */
	public static final MMCode mmSendStatusReport = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SendStatusReport";
			definition = "Send a status report immediately.";
			owner_lazy = () -> TerminalManagementErrorActionCode.mmObject();
			codeName = "SDSR";
		}
	};
	/**
	 * Stop the current sequence of terminal management actions without any
	 * action, and do not notice the error with a status report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorActionCode
	 * TerminalManagementErrorActionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StopSequence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Stop the current sequence of terminal management actions without any action, and do not notice the error with a status report."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmStopSequence = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StopSequence";
			definition = "Stop the current sequence of terminal management actions without any action, and do not notice the error with a status report.";
			owner_lazy = () -> TerminalManagementErrorActionCode.mmObject();
			codeName = "STOP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("IGNR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementErrorActionCode";
				definition = "Action to perform in case of error during the action in progress.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementErrorActionCode.mmIgnoreError, com.tools20022.repository.codeset.TerminalManagementErrorActionCode.mmSendStatusReport,
						com.tools20022.repository.codeset.TerminalManagementErrorActionCode.mmStopSequence);
				derivation_lazy = () -> Arrays.asList(TerminalManagementErrorAction1Code.mmObject(), TerminalManagementErrorAction2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}