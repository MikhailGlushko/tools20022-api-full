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
import com.tools20022.repository.choice.SortCriteria1Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ForecastParameter2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Criterion by which the cash movements are broken down.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashSortingCriterion2#mmSortingCriterionType
 * CashSortingCriterion2.mmSortingCriterionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashSortingCriterion2#mmForecastBreakdownDetails
 * CashSortingCriterion2.mmForecastBreakdownDetails}</li>
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
 * "CashSortingCriterion2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Criterion by which the cash movements are broken down."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashSortingCriterion2", propOrder = {"sortingCriterionType", "forecastBreakdownDetails"})
public class CashSortingCriterion2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SrtgCritnTp", required = true)
	protected SortCriteria1Choice sortingCriterionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SortCriteria1Choice
	 * SortCriteria1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashSortingCriterion2
	 * CashSortingCriterion2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrtgCritnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SortingCriterionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of criterion by which the cash flow is being broken down, ie, country, institution, currency code or a user defined type, such as a region or distribution channel."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashSortingCriterion2, SortCriteria1Choice> mmSortingCriterionType = new MMMessageAttribute<CashSortingCriterion2, SortCriteria1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashSortingCriterion2.mmObject();
			isDerived = false;
			xmlTag = "SrtgCritnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SortingCriterionType";
			definition = "Type of criterion by which the cash flow is being broken down, ie, country, institution, currency code or a user defined type, such as a region or distribution channel.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SortCriteria1Choice.mmObject();
		}

		@Override
		public SortCriteria1Choice getValue(CashSortingCriterion2 obj) {
			return obj.getSortingCriterionType();
		}

		@Override
		public void setValue(CashSortingCriterion2 obj, SortCriteria1Choice value) {
			obj.setSortingCriterionType(value);
		}
	};
	@XmlElement(name = "FcstBrkdwnDtls", required = true)
	protected List<ForecastParameter2> forecastBreakdownDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForecastParameter2
	 * ForecastParameter2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashSortingCriterion2
	 * CashSortingCriterion2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FcstBrkdwnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForecastBreakdownDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameter for which the cash movements are reported."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashSortingCriterion2, List<ForecastParameter2>> mmForecastBreakdownDetails = new MMMessageAssociationEnd<CashSortingCriterion2, List<ForecastParameter2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashSortingCriterion2.mmObject();
			isDerived = false;
			xmlTag = "FcstBrkdwnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForecastBreakdownDetails";
			definition = "Parameter for which the cash movements are reported.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ForecastParameter2.mmObject();
		}

		@Override
		public List<ForecastParameter2> getValue(CashSortingCriterion2 obj) {
			return obj.getForecastBreakdownDetails();
		}

		@Override
		public void setValue(CashSortingCriterion2 obj, List<ForecastParameter2> value) {
			obj.setForecastBreakdownDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashSortingCriterion2.mmSortingCriterionType, com.tools20022.repository.msg.CashSortingCriterion2.mmForecastBreakdownDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashSortingCriterion2";
				definition = "Criterion by which the cash movements are broken down.";
			}
		});
		return mmObject_lazy.get();
	}

	public SortCriteria1Choice getSortingCriterionType() {
		return sortingCriterionType;
	}

	public CashSortingCriterion2 setSortingCriterionType(SortCriteria1Choice sortingCriterionType) {
		this.sortingCriterionType = Objects.requireNonNull(sortingCriterionType);
		return this;
	}

	public List<ForecastParameter2> getForecastBreakdownDetails() {
		return forecastBreakdownDetails == null ? forecastBreakdownDetails = new ArrayList<>() : forecastBreakdownDetails;
	}

	public CashSortingCriterion2 setForecastBreakdownDetails(List<ForecastParameter2> forecastBreakdownDetails) {
		this.forecastBreakdownDetails = Objects.requireNonNull(forecastBreakdownDetails);
		return this;
	}
}