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
import com.tools20022.repository.codeset.TransactionChannelCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the type of the communication channels used by the cardholder to
 * the acceptor system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
 * TransactionChannelCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code#mmMailOrder
 * TransactionChannel3Code.mmMailOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code#mmTelephoneOrder
 * TransactionChannel3Code.mmTelephoneOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code#mmElectronicCommerce
 * TransactionChannel3Code.mmElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code#mmTelevisionPayment
 * TransactionChannel3Code.mmTelevisionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code#mmSecuredElectronicCommerce
 * TransactionChannel3Code.mmSecuredElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code#mmMobilePayment
 * TransactionChannel3Code.mmMobilePayment}</li>
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
 * <li>"MAIL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionChannel3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the type of the communication channels used by the cardholder to the acceptor system."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TransactionChannel5Code
 * TransactionChannel5Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code
 * TransactionChannel1Code}</li>
 * </ul>
 */
public class TransactionChannel3Code extends TransactionChannelCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code
	 * TransactionChannel3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailOrder"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code#mmMailOrder
	 * TransactionChannel5Code.mmMailOrder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code#mmMailOrder
	 * TransactionChannel1Code.mmMailOrder}</li>
	 * </ul>
	 */
	public static final MMCode mmMailOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailOrder";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionChannel5Code.mmMailOrder);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TransactionChannel1Code.mmMailOrder;
			owner_lazy = () -> TransactionChannel3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code
	 * TransactionChannel3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelephoneOrder"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code#mmTelephoneOrder
	 * TransactionChannel5Code.mmTelephoneOrder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code#mmTelephoneOrder
	 * TransactionChannel1Code.mmTelephoneOrder}</li>
	 * </ul>
	 */
	public static final MMCode mmTelephoneOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TelephoneOrder";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionChannel5Code.mmTelephoneOrder);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TransactionChannel1Code.mmTelephoneOrder;
			owner_lazy = () -> TransactionChannel3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code
	 * TransactionChannel3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicCommerce"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code#mmElectronicCommerce
	 * TransactionChannel5Code.mmElectronicCommerce}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code#mmElectronicCommerce
	 * TransactionChannel1Code.mmElectronicCommerce}</li>
	 * </ul>
	 */
	public static final MMCode mmElectronicCommerce = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicCommerce";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionChannel5Code.mmElectronicCommerce);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TransactionChannel1Code.mmElectronicCommerce;
			owner_lazy = () -> TransactionChannel3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code
	 * TransactionChannel3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelevisionPayment"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code#mmTelevisionPayment
	 * TransactionChannel5Code.mmTelevisionPayment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code#mmTelevisionPayment
	 * TransactionChannel1Code.mmTelevisionPayment}</li>
	 * </ul>
	 */
	public static final MMCode mmTelevisionPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TelevisionPayment";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionChannel5Code.mmTelevisionPayment);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TransactionChannel1Code.mmTelevisionPayment;
			owner_lazy = () -> TransactionChannel3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code
	 * TransactionChannel3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredElectronicCommerce"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code#mmSecuredElectronicCommerce
	 * TransactionChannel5Code.mmSecuredElectronicCommerce}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSecuredElectronicCommerce = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredElectronicCommerce";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionChannel5Code.mmSecuredElectronicCommerce);
			owner_lazy = () -> TransactionChannel3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code
	 * TransactionChannel3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MobilePayment"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel5Code#mmMobilePayment
	 * TransactionChannel5Code.mmMobilePayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMobilePayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobilePayment";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionChannel5Code.mmMobilePayment);
			owner_lazy = () -> TransactionChannel3Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("MAIL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransactionChannel3Code";
				definition = "Identifies the type of the communication channels used by the cardholder to the acceptor system.";
				nextVersions_lazy = () -> Arrays.asList(TransactionChannel5Code.mmObject());
				previousVersion_lazy = () -> TransactionChannel1Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionChannel3Code.mmMailOrder, com.tools20022.repository.codeset.TransactionChannel3Code.mmTelephoneOrder,
						com.tools20022.repository.codeset.TransactionChannel3Code.mmElectronicCommerce, com.tools20022.repository.codeset.TransactionChannel3Code.mmTelevisionPayment,
						com.tools20022.repository.codeset.TransactionChannel3Code.mmSecuredElectronicCommerce, com.tools20022.repository.codeset.TransactionChannel3Code.mmMobilePayment);
				trace_lazy = () -> TransactionChannelCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}