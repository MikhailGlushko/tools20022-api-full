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
 * <li>{@linkplain com.tools20022.repository.codeset.ActionType3Code#mmBusy
 * ActionType3Code.mmBusy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#mmCaptureCard
 * ActionType3Code.mmCaptureCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#mmDisplayMessage
 * ActionType3Code.mmDisplayMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#mmForbidOverride
 * ActionType3Code.mmForbidOverride}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#mmIdentificationRequired
 * ActionType3Code.mmIdentificationRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#mmPINLastTry
 * ActionType3Code.mmPINLastTry}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionType3Code#mmPINRetry
 * ActionType3Code.mmPINRetry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#mmPrintMessage
 * ActionType3Code.mmPrintMessage}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionType3Code#mmReferral
 * ActionType3Code.mmReferral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#mmRequestData
 * ActionType3Code.mmRequestData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionType3Code#mmAcceptCurrencyConversion
 * ActionType3Code.mmAcceptCurrencyConversion}</li>
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
 * "ActionType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Type of action to be performed by the point of interaction (POI)."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionType7Code
 * ActionType7Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.ActionType2Code
 * ActionType2Code}</li>
 * </ul>
 */
public class ActionType3Code extends ActionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code
	 * ActionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Busy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.codeset.ActionType7Code#mmBusy
	 * ActionType7Code.mmBusy}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType2Code#mmBusy
	 * ActionType2Code.mmBusy}</li>
	 * </ul>
	 */
	public static final MMCode mmBusy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Busy";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ActionType7Code.mmBusy);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType2Code.mmBusy;
			owner_lazy = () -> ActionType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code
	 * ActionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CaptureCard"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code#mmCaptureCard
	 * ActionType7Code.mmCaptureCard}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType2Code#mmCaptureCard
	 * ActionType2Code.mmCaptureCard}</li>
	 * </ul>
	 */
	public static final MMCode mmCaptureCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CaptureCard";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ActionType7Code.mmCaptureCard);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType2Code.mmCaptureCard;
			owner_lazy = () -> ActionType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code
	 * ActionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisplayMessage"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code#mmDisplayMessage
	 * ActionType7Code.mmDisplayMessage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType2Code#mmDisplayMessage
	 * ActionType2Code.mmDisplayMessage}</li>
	 * </ul>
	 */
	public static final MMCode mmDisplayMessage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisplayMessage";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ActionType7Code.mmDisplayMessage);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType2Code.mmDisplayMessage;
			owner_lazy = () -> ActionType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code
	 * ActionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForbidOverride"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code#mmForbidOverride
	 * ActionType7Code.mmForbidOverride}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType2Code#mmForbidOverride
	 * ActionType2Code.mmForbidOverride}</li>
	 * </ul>
	 */
	public static final MMCode mmForbidOverride = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForbidOverride";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ActionType7Code.mmForbidOverride);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType2Code.mmForbidOverride;
			owner_lazy = () -> ActionType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code
	 * ActionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationRequired"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code#mmIdentificationRequired
	 * ActionType7Code.mmIdentificationRequired}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType2Code#mmIdentificationRequired
	 * ActionType2Code.mmIdentificationRequired}</li>
	 * </ul>
	 */
	public static final MMCode mmIdentificationRequired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationRequired";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ActionType7Code.mmIdentificationRequired);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType2Code.mmIdentificationRequired;
			owner_lazy = () -> ActionType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code
	 * ActionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINLastTry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code#mmPINLastTry
	 * ActionType7Code.mmPINLastTry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType2Code#mmPINLastTry
	 * ActionType2Code.mmPINLastTry}</li>
	 * </ul>
	 */
	public static final MMCode mmPINLastTry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINLastTry";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ActionType7Code.mmPINLastTry);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType2Code.mmPINLastTry;
			owner_lazy = () -> ActionType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code
	 * ActionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINRetry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code#mmPINRetry
	 * ActionType7Code.mmPINRetry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType2Code#mmPINRetry
	 * ActionType2Code.mmPINRetry}</li>
	 * </ul>
	 */
	public static final MMCode mmPINRetry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINRetry";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ActionType7Code.mmPINRetry);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType2Code.mmPINRetry;
			owner_lazy = () -> ActionType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code
	 * ActionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrintMessage"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code#mmPrintMessage
	 * ActionType7Code.mmPrintMessage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType2Code#mmPrintMessage
	 * ActionType2Code.mmPrintMessage}</li>
	 * </ul>
	 */
	public static final MMCode mmPrintMessage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrintMessage";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ActionType7Code.mmPrintMessage);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType2Code.mmPrintMessage;
			owner_lazy = () -> ActionType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code
	 * ActionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Referral"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code#mmReferral
	 * ActionType7Code.mmReferral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType2Code#mmReferral
	 * ActionType2Code.mmReferral}</li>
	 * </ul>
	 */
	public static final MMCode mmReferral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Referral";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ActionType7Code.mmReferral);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType2Code.mmReferral;
			owner_lazy = () -> ActionType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code
	 * ActionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code#mmRequestData
	 * ActionType7Code.mmRequestData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType2Code#mmRequestData
	 * ActionType2Code.mmRequestData}</li>
	 * </ul>
	 */
	public static final MMCode mmRequestData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestData";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ActionType7Code.mmRequestData);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ActionType2Code.mmRequestData;
			owner_lazy = () -> ActionType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionType3Code
	 * ActionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptCurrencyConversion"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ActionType7Code#mmAcceptCurrencyConversion
	 * ActionType7Code.mmAcceptCurrencyConversion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAcceptCurrencyConversion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptCurrencyConversion";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ActionType7Code.mmAcceptCurrencyConversion);
			owner_lazy = () -> ActionType3Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("BUSY");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ActionType3Code";
				definition = "Type of action to be performed by the point of interaction (POI).";
				nextVersions_lazy = () -> Arrays.asList(ActionType7Code.mmObject());
				previousVersion_lazy = () -> ActionType2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ActionType3Code.mmBusy, com.tools20022.repository.codeset.ActionType3Code.mmCaptureCard, com.tools20022.repository.codeset.ActionType3Code.mmDisplayMessage,
						com.tools20022.repository.codeset.ActionType3Code.mmForbidOverride, com.tools20022.repository.codeset.ActionType3Code.mmIdentificationRequired, com.tools20022.repository.codeset.ActionType3Code.mmPINLastTry,
						com.tools20022.repository.codeset.ActionType3Code.mmPINRetry, com.tools20022.repository.codeset.ActionType3Code.mmPrintMessage, com.tools20022.repository.codeset.ActionType3Code.mmReferral,
						com.tools20022.repository.codeset.ActionType3Code.mmRequestData, com.tools20022.repository.codeset.ActionType3Code.mmAcceptCurrencyConversion);
				trace_lazy = () -> ActionTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}