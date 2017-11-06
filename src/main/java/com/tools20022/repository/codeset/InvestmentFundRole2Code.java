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
import com.tools20022.repository.codeset.PartyRoleCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the role played by an actor in an investment fund transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode PartyRoleCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code#mmFundManagementCompany
 * InvestmentFundRole2Code.mmFundManagementCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code#mmRegistrar
 * InvestmentFundRole2Code.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code#mmTransferAgent
 * InvestmentFundRole2Code.mmTransferAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code#mmIntermediary
 * InvestmentFundRole2Code.mmIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code#mmDistributor
 * InvestmentFundRole2Code.mmDistributor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code#mmConcentrator
 * InvestmentFundRole2Code.mmConcentrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code#mmUnderlyingClient1
 * InvestmentFundRole2Code.mmUnderlyingClient1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code#mmUnderlyingClient2
 * InvestmentFundRole2Code.mmUnderlyingClient2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code#mmTransmittingAgent
 * InvestmentFundRole2Code.mmTransmittingAgent}</li>
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
 * <li>"FMCO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentFundRole2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the role played by an actor in an investment fund transaction."</li>
 * </ul>
 */
public class InvestmentFundRole2Code extends PartyRoleCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code
	 * InvestmentFundRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundManagementCompany"</li>
	 * </ul>
	 */
	public static final MMCode mmFundManagementCompany = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundManagementCompany";
			owner_lazy = () -> InvestmentFundRole2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code
	 * InvestmentFundRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registrar"</li>
	 * </ul>
	 */
	public static final MMCode mmRegistrar = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registrar";
			owner_lazy = () -> InvestmentFundRole2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code
	 * InvestmentFundRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAgent"</li>
	 * </ul>
	 */
	public static final MMCode mmTransferAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgent";
			owner_lazy = () -> InvestmentFundRole2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code
	 * InvestmentFundRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * </ul>
	 */
	public static final MMCode mmIntermediary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			owner_lazy = () -> InvestmentFundRole2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code
	 * InvestmentFundRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distributor"</li>
	 * </ul>
	 */
	public static final MMCode mmDistributor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Distributor";
			owner_lazy = () -> InvestmentFundRole2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code
	 * InvestmentFundRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Concentrator"</li>
	 * </ul>
	 */
	public static final MMCode mmConcentrator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Concentrator";
			owner_lazy = () -> InvestmentFundRole2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code
	 * InvestmentFundRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingClient1"</li>
	 * </ul>
	 */
	public static final MMCode mmUnderlyingClient1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingClient1";
			owner_lazy = () -> InvestmentFundRole2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code
	 * InvestmentFundRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingClient2"</li>
	 * </ul>
	 */
	public static final MMCode mmUnderlyingClient2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingClient2";
			owner_lazy = () -> InvestmentFundRole2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code
	 * InvestmentFundRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransmittingAgent"</li>
	 * </ul>
	 */
	public static final MMCode mmTransmittingAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransmittingAgent";
			owner_lazy = () -> InvestmentFundRole2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("FMCO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundRole2Code";
				definition = "Specifies the role played by an actor in an investment fund transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestmentFundRole2Code.mmFundManagementCompany, com.tools20022.repository.codeset.InvestmentFundRole2Code.mmRegistrar,
						com.tools20022.repository.codeset.InvestmentFundRole2Code.mmTransferAgent, com.tools20022.repository.codeset.InvestmentFundRole2Code.mmIntermediary,
						com.tools20022.repository.codeset.InvestmentFundRole2Code.mmDistributor, com.tools20022.repository.codeset.InvestmentFundRole2Code.mmConcentrator,
						com.tools20022.repository.codeset.InvestmentFundRole2Code.mmUnderlyingClient1, com.tools20022.repository.codeset.InvestmentFundRole2Code.mmUnderlyingClient2,
						com.tools20022.repository.codeset.InvestmentFundRole2Code.mmTransmittingAgent);
				trace_lazy = () -> PartyRoleCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}