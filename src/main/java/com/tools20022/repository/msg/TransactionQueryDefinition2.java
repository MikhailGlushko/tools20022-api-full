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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.TransactionCriteriaDefinition2Choice;
import com.tools20022.repository.codeset.QueryType1Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the query criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionQueryDefinition2#mmQueryType
 * TransactionQueryDefinition2.mmQueryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionQueryDefinition2#mmTransactionCriteria
 * TransactionQueryDefinition2.mmTransactionCriteria}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionQueryDefinition2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the query criteria."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionQueryDefinition2", propOrder = {"queryType", "transactionCriteria"})
public class TransactionQueryDefinition2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "QryTp")
	protected QueryType1Code queryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QueryType1Code
	 * QueryType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionQueryDefinition2
	 * TransactionQueryDefinition2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if all matching items or only the new matching items since the latest query are returned."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionQueryDefinition2, Optional<QueryType1Code>> mmQueryType = new MMMessageAttribute<TransactionQueryDefinition2, Optional<QueryType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionQueryDefinition2.mmObject();
			isDerived = false;
			xmlTag = "QryTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryType";
			definition = "Specifies if all matching items or only the new matching items since the latest query are returned.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> QueryType1Code.mmObject();
		}

		@Override
		public Optional<QueryType1Code> getValue(TransactionQueryDefinition2 obj) {
			return obj.getQueryType();
		}

		@Override
		public void setValue(TransactionQueryDefinition2 obj, Optional<QueryType1Code> value) {
			obj.setQueryType(value.orElse(null));
		}
	};
	@XmlElement(name = "TxCrit")
	protected TransactionCriteriaDefinition2Choice transactionCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransactionCriteriaDefinition2Choice
	 * TransactionCriteriaDefinition2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionQueryDefinition2
	 * TransactionQueryDefinition2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the transaction query criteria."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionQueryDefinition2, Optional<TransactionCriteriaDefinition2Choice>> mmTransactionCriteria = new MMMessageAssociationEnd<TransactionQueryDefinition2, Optional<TransactionCriteriaDefinition2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionQueryDefinition2.mmObject();
			isDerived = false;
			xmlTag = "TxCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCriteria";
			definition = "Defines the transaction query criteria.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionCriteriaDefinition2Choice.mmObject();
		}

		@Override
		public Optional<TransactionCriteriaDefinition2Choice> getValue(TransactionQueryDefinition2 obj) {
			return obj.getTransactionCriteria();
		}

		@Override
		public void setValue(TransactionQueryDefinition2 obj, Optional<TransactionCriteriaDefinition2Choice> value) {
			obj.setTransactionCriteria(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionQueryDefinition2.mmQueryType, com.tools20022.repository.msg.TransactionQueryDefinition2.mmTransactionCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TransactionQueryDefinition2";
				definition = "Defines the query criteria.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<QueryType1Code> getQueryType() {
		return queryType == null ? Optional.empty() : Optional.of(queryType);
	}

	public TransactionQueryDefinition2 setQueryType(QueryType1Code queryType) {
		this.queryType = queryType;
		return this;
	}

	public Optional<TransactionCriteriaDefinition2Choice> getTransactionCriteria() {
		return transactionCriteria == null ? Optional.empty() : Optional.of(transactionCriteria);
	}

	public TransactionQueryDefinition2 setTransactionCriteria(TransactionCriteriaDefinition2Choice transactionCriteria) {
		this.transactionCriteria = transactionCriteria;
		return this;
	}
}