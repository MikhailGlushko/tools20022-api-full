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
 * Specifies the inquiry status of order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode#mmQueryUnconfirmedOrder
 * QueryOrderStatusCode.mmQueryUnconfirmedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode#mmQueryAllOrders
 * QueryOrderStatusCode.mmQueryAllOrders}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode#mmQueryPartiallyExecutedOrder
 * QueryOrderStatusCode.mmQueryPartiallyExecutedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode#mmQueryFullyExecutedOrder
 * QueryOrderStatusCode.mmQueryFullyExecutedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode#mmQueryOrdersForTheParty
 * QueryOrderStatusCode.mmQueryOrdersForTheParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.QueryOrderStatus1Code
 * QueryOrderStatus1Code}</li>
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
 * "QueryOrderStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the inquiry status of order."</li>
 * </ul>
 */
public class QueryOrderStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Query for orders which are not confirmed by a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode
	 * QueryOrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryUnconfirmedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query for orders which are not confirmed by a party."</li>
	 * </ul>
	 */
	public static final MMCode mmQueryUnconfirmedOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryUnconfirmedOrder";
			definition = "Query for orders which are not confirmed by a party.";
			owner_lazy = () -> QueryOrderStatusCode.mmObject();
			codeName = "QUCO";
		}
	};
	/**
	 * Query for all orders.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode
	 * QueryOrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUAO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryAllOrders"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query for all orders.\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmQueryAllOrders = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryAllOrders";
			definition = "Query for all orders.\r\n";
			owner_lazy = () -> QueryOrderStatusCode.mmObject();
			codeName = "QUAO";
		}
	};
	/**
	 * Query for orders have been partially executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode
	 * QueryOrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QPEO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryPartiallyExecutedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query for orders have been partially executed.  "</li>
	 * </ul>
	 */
	public static final MMCode mmQueryPartiallyExecutedOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryPartiallyExecutedOrder";
			definition = "Query for orders have been partially executed.  ";
			owner_lazy = () -> QueryOrderStatusCode.mmObject();
			codeName = "QPEO";
		}
	};
	/**
	 * Query for orders have been completely executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode
	 * QueryOrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QFEO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryFullyExecutedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query for orders have been completely executed.  "</li>
	 * </ul>
	 */
	public static final MMCode mmQueryFullyExecutedOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryFullyExecutedOrder";
			definition = "Query for orders have been completely executed.  ";
			owner_lazy = () -> QueryOrderStatusCode.mmObject();
			codeName = "QFEO";
		}
	};
	/**
	 * Query for all orders for a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatusCode
	 * QueryOrderStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QOFP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryOrdersForTheParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query for all orders for a party."</li>
	 * </ul>
	 */
	public static final MMCode mmQueryOrdersForTheParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryOrdersForTheParty";
			definition = "Query for all orders for a party.";
			owner_lazy = () -> QueryOrderStatusCode.mmObject();
			codeName = "QOFP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "QueryOrderStatusCode";
				definition = "Specifies the inquiry status of order.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QueryOrderStatusCode.mmQueryUnconfirmedOrder, com.tools20022.repository.codeset.QueryOrderStatusCode.mmQueryAllOrders,
						com.tools20022.repository.codeset.QueryOrderStatusCode.mmQueryPartiallyExecutedOrder, com.tools20022.repository.codeset.QueryOrderStatusCode.mmQueryFullyExecutedOrder,
						com.tools20022.repository.codeset.QueryOrderStatusCode.mmQueryOrdersForTheParty);
				derivation_lazy = () -> Arrays.asList(QueryOrderStatus1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}