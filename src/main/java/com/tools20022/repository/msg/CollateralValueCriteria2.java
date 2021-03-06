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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashAccountReturnCriteria2;
import com.tools20022.repository.msg.CollateralValueSearchCriteria2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria which are used to search for an account and to report on
 * the account. A name may be given to the new query.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueCriteria2#mmQueryName
 * CollateralValueCriteria2.mmQueryName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueCriteria2#mmSearchCriteria
 * CollateralValueCriteria2.mmSearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValueCriteria2#mmReturnCriteria
 * CollateralValueCriteria2.mmReturnCriteria}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralValueCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria which are used to search for an account and to report on the account. A name may be given to the new query."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CollateralValueCriteria1
 * CollateralValueCriteria1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralValueCriteria2", propOrder = {"queryName", "searchCriteria", "returnCriteria"})
public class CollateralValueCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "QryNm")
	protected Max35Text queryName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueCriteria2
	 * CollateralValueCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the query defined by the search criteria and return criteria."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueCriteria1#mmQueryName
	 * CollateralValueCriteria1.mmQueryName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValueCriteria2, Optional<Max35Text>> mmQueryName = new MMMessageAttribute<CollateralValueCriteria2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueCriteria2.mmObject();
			isDerived = false;
			xmlTag = "QryNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryName";
			definition = "Name of the query defined by the search criteria and return criteria.";
			previousVersion_lazy = () -> CollateralValueCriteria1.mmQueryName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CollateralValueCriteria2 obj) {
			return obj.getQueryName();
		}

		@Override
		public void setValue(CollateralValueCriteria2 obj, Optional<Max35Text> value) {
			obj.setQueryName(value.orElse(null));
		}
	};
	@XmlElement(name = "SchCrit")
	protected CollateralValueSearchCriteria2 searchCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueSearchCriteria2
	 * CollateralValueSearchCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueCriteria2
	 * CollateralValueCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SearchCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria to be used to extract the account information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueCriteria1#mmSearchCriteria
	 * CollateralValueCriteria1.mmSearchCriteria}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralValueCriteria2, Optional<CollateralValueSearchCriteria2>> mmSearchCriteria = new MMMessageAssociationEnd<CollateralValueCriteria2, Optional<CollateralValueSearchCriteria2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SchCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SearchCriteria";
			definition = "Defines the criteria to be used to extract the account information.";
			previousVersion_lazy = () -> CollateralValueCriteria1.mmSearchCriteria;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CollateralValueSearchCriteria2.mmObject();
		}

		@Override
		public Optional<CollateralValueSearchCriteria2> getValue(CollateralValueCriteria2 obj) {
			return obj.getSearchCriteria();
		}

		@Override
		public void setValue(CollateralValueCriteria2 obj, Optional<CollateralValueSearchCriteria2> value) {
			obj.setSearchCriteria(value.orElse(null));
		}
	};
	@XmlElement(name = "RtrCrit")
	protected CashAccountReturnCriteria2 returnCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria2
	 * CashAccountReturnCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueCriteria2
	 * CollateralValueCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the expected account report."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueCriteria1#mmReturnCriteria
	 * CollateralValueCriteria1.mmReturnCriteria}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralValueCriteria2, Optional<CashAccountReturnCriteria2>> mmReturnCriteria = new MMMessageAssociationEnd<CollateralValueCriteria2, Optional<CashAccountReturnCriteria2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValueCriteria2.mmObject();
			isDerived = false;
			xmlTag = "RtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnCriteria";
			definition = "Defines the expected account report.";
			previousVersion_lazy = () -> CollateralValueCriteria1.mmReturnCriteria;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccountReturnCriteria2.mmObject();
		}

		@Override
		public Optional<CashAccountReturnCriteria2> getValue(CollateralValueCriteria2 obj) {
			return obj.getReturnCriteria();
		}

		@Override
		public void setValue(CollateralValueCriteria2 obj, Optional<CashAccountReturnCriteria2> value) {
			obj.setReturnCriteria(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralValueCriteria2.mmQueryName, com.tools20022.repository.msg.CollateralValueCriteria2.mmSearchCriteria,
						com.tools20022.repository.msg.CollateralValueCriteria2.mmReturnCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralValueCriteria2";
				definition = "Defines the criteria which are used to search for an account and to report on the account. A name may be given to the new query.";
				previousVersion_lazy = () -> CollateralValueCriteria1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getQueryName() {
		return queryName == null ? Optional.empty() : Optional.of(queryName);
	}

	public CollateralValueCriteria2 setQueryName(Max35Text queryName) {
		this.queryName = queryName;
		return this;
	}

	public Optional<CollateralValueSearchCriteria2> getSearchCriteria() {
		return searchCriteria == null ? Optional.empty() : Optional.of(searchCriteria);
	}

	public CollateralValueCriteria2 setSearchCriteria(CollateralValueSearchCriteria2 searchCriteria) {
		this.searchCriteria = searchCriteria;
		return this;
	}

	public Optional<CashAccountReturnCriteria2> getReturnCriteria() {
		return returnCriteria == null ? Optional.empty() : Optional.of(returnCriteria);
	}

	public CollateralValueCriteria2 setReturnCriteria(CashAccountReturnCriteria2 returnCriteria) {
		this.returnCriteria = returnCriteria;
		return this;
	}
}