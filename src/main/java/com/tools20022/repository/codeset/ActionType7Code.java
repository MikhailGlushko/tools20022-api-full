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
import com.tools20022.repository.codeset.ActionTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of action to be performed by the point of interaction (POI).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode ActionTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionType7Code#mmBusy
 * ActionType7Code.mmBusy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType7Code#mmCaptureCard
 * ActionType7Code.mmCaptureCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType7Code#mmDisplayMessage
 * ActionType7Code.mmDisplayMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType7Code#mmForbidOverride
 * ActionType7Code.mmForbidOverride}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType7Code#mmIdentificationRequired
 * ActionType7Code.mmIdentificationRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType7Code#mmPINLastTry
 * ActionType7Code.mmPINLastTry}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionType7Code#mmPINRetry
 * ActionType7Code.mmPINRetry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType7Code#mmPrintMessage
 * ActionType7Code.mmPrintMessage}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionType7Code#mmReferral
 * ActionType7Code.mmReferral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType7Code#mmRequestData
 * ActionType7Code.mmRequestData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType7Code#mmAcceptCurrencyConversion
 * ActionType7Code.mmAcceptCurrencyConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType7Code#mmFallForward
 * ActionType7Code.mmFallForward}</li>
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
 * <li>"BUSY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ActionType7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Type of action to be performed by the point of interaction (POI)."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.ActionType3Code
 * ActionType3Code}</li>
 * </ul>
 */
public class ActionType7Code extends ActionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code
	 * ActionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Busy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#mmBusy
	 * ActionType3Code.mmBusy}</li>
	 * </ul>
	 */
	public static final MMCode mmBusy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Busy";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType3Code.mmBusy;
			owner_lazy = () -> ActionType7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code
	 * ActionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CaptureCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#mmCaptureCard
	 * ActionType3Code.mmCaptureCard}</li>
	 * </ul>
	 */
	public static final MMCode mmCaptureCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CaptureCard";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType3Code.mmCaptureCard;
			owner_lazy = () -> ActionType7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code
	 * ActionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisplayMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#mmDisplayMessage
	 * ActionType3Code.mmDisplayMessage}</li>
	 * </ul>
	 */
	public static final MMCode mmDisplayMessage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisplayMessage";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType3Code.mmDisplayMessage;
			owner_lazy = () -> ActionType7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code
	 * ActionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForbidOverride"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#mmForbidOverride
	 * ActionType3Code.mmForbidOverride}</li>
	 * </ul>
	 */
	public static final MMCode mmForbidOverride = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForbidOverride";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType3Code.mmForbidOverride;
			owner_lazy = () -> ActionType7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code
	 * ActionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#mmIdentificationRequired
	 * ActionType3Code.mmIdentificationRequired}</li>
	 * </ul>
	 */
	public static final MMCode mmIdentificationRequired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationRequired";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType3Code.mmIdentificationRequired;
			owner_lazy = () -> ActionType7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code
	 * ActionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINLastTry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#mmPINLastTry
	 * ActionType3Code.mmPINLastTry}</li>
	 * </ul>
	 */
	public static final MMCode mmPINLastTry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINLastTry";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType3Code.mmPINLastTry;
			owner_lazy = () -> ActionType7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code
	 * ActionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINRetry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#mmPINRetry
	 * ActionType3Code.mmPINRetry}</li>
	 * </ul>
	 */
	public static final MMCode mmPINRetry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINRetry";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType3Code.mmPINRetry;
			owner_lazy = () -> ActionType7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code
	 * ActionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrintMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#mmPrintMessage
	 * ActionType3Code.mmPrintMessage}</li>
	 * </ul>
	 */
	public static final MMCode mmPrintMessage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrintMessage";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType3Code.mmPrintMessage;
			owner_lazy = () -> ActionType7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code
	 * ActionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Referral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#mmReferral
	 * ActionType3Code.mmReferral}</li>
	 * </ul>
	 */
	public static final MMCode mmReferral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Referral";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType3Code.mmReferral;
			owner_lazy = () -> ActionType7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code
	 * ActionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#mmRequestData
	 * ActionType3Code.mmRequestData}</li>
	 * </ul>
	 */
	public static final MMCode mmRequestData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestData";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType3Code.mmRequestData;
			owner_lazy = () -> ActionType7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code
	 * ActionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptCurrencyConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#mmAcceptCurrencyConversion
	 * ActionType3Code.mmAcceptCurrencyConversion}</li>
	 * </ul>
	 */
	public static final MMCode mmAcceptCurrencyConversion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptCurrencyConversion";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType3Code.mmAcceptCurrencyConversion;
			owner_lazy = () -> ActionType7Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code
	 * ActionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FallForward"</li>
	 * </ul>
	 */
	public static final MMCode mmFallForward = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FallForward";
			owner_lazy = () -> ActionType7Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("BUSY");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ActionType7Code";
				definition = "Type of action to be performed by the point of interaction (POI).";
				previousVersion_lazy = () -> ActionType3Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ActionType7Code.mmBusy, com.tools20022.repository.codeset.ActionType7Code.mmCaptureCard, com.tools20022.repository.codeset.ActionType7Code.mmDisplayMessage,
						com.tools20022.repository.codeset.ActionType7Code.mmForbidOverride, com.tools20022.repository.codeset.ActionType7Code.mmIdentificationRequired, com.tools20022.repository.codeset.ActionType7Code.mmPINLastTry,
						com.tools20022.repository.codeset.ActionType7Code.mmPINRetry, com.tools20022.repository.codeset.ActionType7Code.mmPrintMessage, com.tools20022.repository.codeset.ActionType7Code.mmReferral,
						com.tools20022.repository.codeset.ActionType7Code.mmRequestData, com.tools20022.repository.codeset.ActionType7Code.mmAcceptCurrencyConversion, com.tools20022.repository.codeset.ActionType7Code.mmFallForward);
				trace_lazy = () -> ActionTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}