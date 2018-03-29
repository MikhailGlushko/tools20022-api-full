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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.cain.NetworkManagementResponse;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardTransaction12;
import com.tools20022.repository.msg.CardTransactionEnvironment6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the response to the network management.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerNetworkManagementResponse1#mmEnvironment
 * AcquirerNetworkManagementResponse1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerNetworkManagementResponse1#mmTransaction
 * AcquirerNetworkManagementResponse1.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.NetworkManagementResponse#mmNetworkManagementResponse
 * NetworkManagementResponse.mmNetworkManagementResponse}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcquirerNetworkManagementResponse1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the response to the network management."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcquirerNetworkManagementResponse1", propOrder = {"environment", "transaction"})
public class AcquirerNetworkManagementResponse1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected CardTransactionEnvironment6 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment6
	 * CardTransactionEnvironment6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerNetworkManagementResponse1
	 * AcquirerNetworkManagementResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Environment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Environment of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcquirerNetworkManagementResponse1, CardTransactionEnvironment6> mmEnvironment = new MMMessageAssociationEnd<AcquirerNetworkManagementResponse1, CardTransactionEnvironment6>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerNetworkManagementResponse1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardTransactionEnvironment6.mmObject();
		}

		@Override
		public CardTransactionEnvironment6 getValue(AcquirerNetworkManagementResponse1 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(AcquirerNetworkManagementResponse1 obj, CardTransactionEnvironment6 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected CardTransaction12 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardTransaction12
	 * CardTransaction12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerNetworkManagementResponse1
	 * AcquirerNetworkManagementResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Network management transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcquirerNetworkManagementResponse1, CardTransaction12> mmTransaction = new MMMessageAssociationEnd<AcquirerNetworkManagementResponse1, CardTransaction12>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerNetworkManagementResponse1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Network management transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardTransaction12.mmObject();
		}

		@Override
		public CardTransaction12 getValue(AcquirerNetworkManagementResponse1 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(AcquirerNetworkManagementResponse1 obj, CardTransaction12 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerNetworkManagementResponse1.mmEnvironment, com.tools20022.repository.msg.AcquirerNetworkManagementResponse1.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(NetworkManagementResponse.mmNetworkManagementResponse);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcquirerNetworkManagementResponse1";
				definition = "Information related to the response to the network management.";
			}
		});
		return mmObject_lazy.get();
	}

	public CardTransactionEnvironment6 getEnvironment() {
		return environment;
	}

	public AcquirerNetworkManagementResponse1 setEnvironment(CardTransactionEnvironment6 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public CardTransaction12 getTransaction() {
		return transaction;
	}

	public AcquirerNetworkManagementResponse1 setTransaction(CardTransaction12 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}