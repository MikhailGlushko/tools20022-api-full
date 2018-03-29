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
import com.tools20022.repository.area.cain.AcquirerReversalInitiation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardTransaction7;
import com.tools20022.repository.msg.CardTransactionEnvironment3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the reversal.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerReversalInitiation1#mmEnvironment
 * AcquirerReversalInitiation1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerReversalInitiation1#mmTransaction
 * AcquirerReversalInitiation1.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerReversalInitiation#mmReversalInitiation
 * AcquirerReversalInitiation.mmReversalInitiation}</li>
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
 * "AcquirerReversalInitiation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the reversal."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcquirerReversalInitiation1", propOrder = {"environment", "transaction"})
public class AcquirerReversalInitiation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected CardTransactionEnvironment3 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment3
	 * CardTransactionEnvironment3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerReversalInitiation1
	 * AcquirerReversalInitiation1}</li>
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
	public static final MMMessageAssociationEnd<AcquirerReversalInitiation1, CardTransactionEnvironment3> mmEnvironment = new MMMessageAssociationEnd<AcquirerReversalInitiation1, CardTransactionEnvironment3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerReversalInitiation1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardTransactionEnvironment3.mmObject();
		}

		@Override
		public CardTransactionEnvironment3 getValue(AcquirerReversalInitiation1 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(AcquirerReversalInitiation1 obj, CardTransactionEnvironment3 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected CardTransaction7 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardTransaction7
	 * CardTransaction7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerReversalInitiation1
	 * AcquirerReversalInitiation1}</li>
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
	 * definition} = "Reversal transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcquirerReversalInitiation1, CardTransaction7> mmTransaction = new MMMessageAssociationEnd<AcquirerReversalInitiation1, CardTransaction7>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerReversalInitiation1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Reversal transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardTransaction7.mmObject();
		}

		@Override
		public CardTransaction7 getValue(AcquirerReversalInitiation1 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(AcquirerReversalInitiation1 obj, CardTransaction7 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerReversalInitiation1.mmEnvironment, com.tools20022.repository.msg.AcquirerReversalInitiation1.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcquirerReversalInitiation.mmReversalInitiation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcquirerReversalInitiation1";
				definition = "Information related to the reversal.";
			}
		});
		return mmObject_lazy.get();
	}

	public CardTransactionEnvironment3 getEnvironment() {
		return environment;
	}

	public AcquirerReversalInitiation1 setEnvironment(CardTransactionEnvironment3 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public CardTransaction7 getTransaction() {
		return transaction;
	}

	public AcquirerReversalInitiation1 setTransaction(CardTransaction7 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}