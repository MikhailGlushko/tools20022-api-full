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
import com.tools20022.repository.choice.SortCriteria1Choice;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.CashSortingCriterion1#mmSortingCriterionType
 * CashSortingCriterion1.mmSortingCriterionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashSortingCriterion1#mmForecastBreakdownDetails
 * CashSortingCriterion1.mmForecastBreakdownDetails}</li>
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
 * "CashSortingCriterion1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Criterion by which the cash movements are broken down."</li>
 * </ul>
 */
public class CashSortingCriterion1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SortCriteria1Choice sortingCriterionType;
	/**
	 * Type of criterion by which the estimated cash flow is being broken down,
	 * ie, country, institution, currency code or a user defined type, such as a
	 * region or distribution channel.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashSortingCriterion1
	 * CashSortingCriterion1}</li>
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
	 * "Type of criterion by which the estimated cash flow is being broken down, ie, country, institution, currency code or a user defined type, such as a region or distribution channel."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSortingCriterionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashSortingCriterion1.mmObject();
			isDerived = false;
			xmlTag = "SrtgCritnTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SortingCriterionType";
			definition = "Type of criterion by which the estimated cash flow is being broken down, ie, country, institution, currency code or a user defined type, such as a region or distribution channel.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SortCriteria1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ForecastParameter1> forecastBreakdownDetails;
	/**
	 * Parameter for which the cash movements are reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForecastParameter1
	 * ForecastParameter1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashSortingCriterion1
	 * CashSortingCriterion1}</li>
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
	public static final MMMessageAssociationEnd mmForecastBreakdownDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CashSortingCriterion1.mmObject();
			isDerived = false;
			xmlTag = "FcstBrkdwnDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForecastBreakdownDetails";
			definition = "Parameter for which the cash movements are reported.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ForecastParameter1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashSortingCriterion1.mmSortingCriterionType, com.tools20022.repository.msg.CashSortingCriterion1.mmForecastBreakdownDetails);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashSortingCriterion1";
				definition = "Criterion by which the cash movements are broken down.";
			}
		});
		return mmObject_lazy.get();
	}

	public SortCriteria1Choice getSortingCriterionType() {
		return sortingCriterionType;
	}

	public void setSortingCriterionType(SortCriteria1Choice sortingCriterionType) {
		this.sortingCriterionType = sortingCriterionType;
	}

	public List<ForecastParameter1> getForecastBreakdownDetails() {
		return forecastBreakdownDetails;
	}

	public void setForecastBreakdownDetails(List<com.tools20022.repository.msg.ForecastParameter1> forecastBreakdownDetails) {
		this.forecastBreakdownDetails = forecastBreakdownDetails;
	}
}