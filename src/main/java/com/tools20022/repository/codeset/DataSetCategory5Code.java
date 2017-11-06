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
import com.tools20022.repository.codeset.DataSetCategoryCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Maintenance services provided by a terminal manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
 * DataSetCategoryCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#mmAcquirerParameters
 * DataSetCategory5Code.mmAcquirerParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#mmApplicationParameters
 * DataSetCategory5Code.mmApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#mmMasterTerminalManager
 * DataSetCategory5Code.mmMasterTerminalManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#mmMerchantParameters
 * DataSetCategory5Code.mmMerchantParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#mmMonitoring
 * DataSetCategory5Code.mmMonitoring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#mmSecurityParameters
 * DataSetCategory5Code.mmSecurityParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#mmSoftwareModule
 * DataSetCategory5Code.mmSoftwareModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#mmTerminalParameters
 * DataSetCategory5Code.mmTerminalParameters}</li>
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
 * "DataSetCategory5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Maintenance services provided by a terminal manager."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DataSetCategory10Code
 * DataSetCategory10Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class DataSetCategory5Code extends DataSetCategoryCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code
	 * DataSetCategory5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#mmAcquirerParameters
	 * DataSetCategory10Code.mmAcquirerParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerParameters";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetCategory10Code.mmAcquirerParameters);
			owner_lazy = () -> DataSetCategory5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code
	 * DataSetCategory5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#mmApplicationParameters
	 * DataSetCategory10Code.mmApplicationParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmApplicationParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParameters";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetCategory10Code.mmApplicationParameters);
			owner_lazy = () -> DataSetCategory5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code
	 * DataSetCategory5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterTerminalManager"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#mmMasterTerminalManager
	 * DataSetCategory10Code.mmMasterTerminalManager}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMasterTerminalManager = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterTerminalManager";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetCategory10Code.mmMasterTerminalManager);
			owner_lazy = () -> DataSetCategory5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code
	 * DataSetCategory5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#mmMerchantParameters
	 * DataSetCategory10Code.mmMerchantParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMerchantParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantParameters";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetCategory10Code.mmMerchantParameters);
			owner_lazy = () -> DataSetCategory5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code
	 * DataSetCategory5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monitoring"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#mmMonitoring
	 * DataSetCategory10Code.mmMonitoring}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMonitoring = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Monitoring";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetCategory10Code.mmMonitoring);
			owner_lazy = () -> DataSetCategory5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code
	 * DataSetCategory5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#mmSecurityParameters
	 * DataSetCategory10Code.mmSecurityParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSecurityParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityParameters";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetCategory10Code.mmSecurityParameters);
			owner_lazy = () -> DataSetCategory5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code
	 * DataSetCategory5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftwareModule"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#mmSoftwareModule
	 * DataSetCategory10Code.mmSoftwareModule}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSoftwareModule = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftwareModule";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetCategory10Code.mmSoftwareModule);
			owner_lazy = () -> DataSetCategory5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code
	 * DataSetCategory5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#mmTerminalParameters
	 * DataSetCategory10Code.mmTerminalParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTerminalParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalParameters";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetCategory10Code.mmTerminalParameters);
			owner_lazy = () -> DataSetCategory5Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DataSetCategory5Code";
				definition = "Maintenance services provided by a terminal manager.";
				nextVersions_lazy = () -> Arrays.asList(DataSetCategory10Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetCategory5Code.mmAcquirerParameters, com.tools20022.repository.codeset.DataSetCategory5Code.mmApplicationParameters,
						com.tools20022.repository.codeset.DataSetCategory5Code.mmMasterTerminalManager, com.tools20022.repository.codeset.DataSetCategory5Code.mmMerchantParameters,
						com.tools20022.repository.codeset.DataSetCategory5Code.mmMonitoring, com.tools20022.repository.codeset.DataSetCategory5Code.mmSecurityParameters,
						com.tools20022.repository.codeset.DataSetCategory5Code.mmSoftwareModule, com.tools20022.repository.codeset.DataSetCategory5Code.mmTerminalParameters);
				trace_lazy = () -> DataSetCategoryCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}