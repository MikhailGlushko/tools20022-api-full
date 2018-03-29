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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CollateralValueCriteria2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Definition of the collateral value query criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralValueCriteriaDefinition2Choice#mmQueryName
 * CollateralValueCriteriaDefinition2Choice.mmQueryName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralValueCriteriaDefinition2Choice#mmNewCriteria
 * CollateralValueCriteriaDefinition2Choice.mmNewCriteria}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralValueCriteriaDefinition2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Definition of the collateral value query criteria."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.CollateralValueCriteriaDefinition1Choice
 * CollateralValueCriteriaDefinition1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralValueCriteriaDefinition2Choice", propOrder = {"queryName", "newCriteria"})
public class CollateralValueCriteriaDefinition2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "QryNm", required = true)
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
	 * {@linkplain com.tools20022.repository.choice.CollateralValueCriteriaDefinition2Choice
	 * CollateralValueCriteriaDefinition2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Recalls the criteria (search and return criteria) defined in a preceding query."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CollateralValueCriteriaDefinition1Choice#mmQueryName
	 * CollateralValueCriteriaDefinition1Choice.mmQueryName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralValueCriteriaDefinition2Choice, Max35Text> mmQueryName = new MMMessageAttribute<CollateralValueCriteriaDefinition2Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CollateralValueCriteriaDefinition2Choice.mmObject();
			isDerived = false;
			xmlTag = "QryNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryName";
			definition = "Recalls the criteria (search and return criteria) defined in a preceding query.";
			previousVersion_lazy = () -> CollateralValueCriteriaDefinition1Choice.mmQueryName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CollateralValueCriteriaDefinition2Choice obj) {
			return obj.getQueryName();
		}

		@Override
		public void setValue(CollateralValueCriteriaDefinition2Choice obj, Max35Text value) {
			obj.setQueryName(value);
		}
	};
	@XmlElement(name = "NewCrit", required = true)
	protected CollateralValueCriteria2 newCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValueCriteria2
	 * CollateralValueCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CollateralValueCriteriaDefinition2Choice
	 * CollateralValueCriteriaDefinition2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Explicitly defines the query criteria."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CollateralValueCriteriaDefinition1Choice#mmNewCriteria
	 * CollateralValueCriteriaDefinition1Choice.mmNewCriteria}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralValueCriteriaDefinition2Choice, CollateralValueCriteria2> mmNewCriteria = new MMMessageAssociationEnd<CollateralValueCriteriaDefinition2Choice, CollateralValueCriteria2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CollateralValueCriteriaDefinition2Choice.mmObject();
			isDerived = false;
			xmlTag = "NewCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewCriteria";
			definition = "Explicitly defines the query criteria.";
			previousVersion_lazy = () -> CollateralValueCriteriaDefinition1Choice.mmNewCriteria;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralValueCriteria2.mmObject();
		}

		@Override
		public CollateralValueCriteria2 getValue(CollateralValueCriteriaDefinition2Choice obj) {
			return obj.getNewCriteria();
		}

		@Override
		public void setValue(CollateralValueCriteriaDefinition2Choice obj, CollateralValueCriteria2 value) {
			obj.setNewCriteria(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CollateralValueCriteriaDefinition2Choice.mmQueryName, com.tools20022.repository.choice.CollateralValueCriteriaDefinition2Choice.mmNewCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralValueCriteriaDefinition2Choice";
				definition = "Definition of the collateral value query criteria.";
				previousVersion_lazy = () -> CollateralValueCriteriaDefinition1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getQueryName() {
		return queryName;
	}

	public CollateralValueCriteriaDefinition2Choice setQueryName(Max35Text queryName) {
		this.queryName = Objects.requireNonNull(queryName);
		return this;
	}

	public CollateralValueCriteria2 getNewCriteria() {
		return newCriteria;
	}

	public CollateralValueCriteriaDefinition2Choice setNewCriteria(CollateralValueCriteria2 newCriteria) {
		this.newCriteria = Objects.requireNonNull(newCriteria);
		return this;
	}
}