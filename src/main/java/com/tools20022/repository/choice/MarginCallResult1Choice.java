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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MarginCallResult2;
import com.tools20022.repository.msg.Result1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice to provide the summation of the call amounts for the variation margin
 * and the segregated independent amount, or the segregated independent amount
 * only.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginCallResult1Choice#mmMarginCallResultDetails
 * MarginCallResult1Choice.mmMarginCallResultDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginCallResult1Choice#mmSegregatedIndependentAmount
 * MarginCallResult1Choice.mmSegregatedIndependentAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginCallResult1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice to provide the summation of the call amounts for the variation margin and the segregated independent amount, or the segregated independent amount only."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MarginCallResult1Choice", propOrder = {"marginCallResultDetails", "segregatedIndependentAmount"})
public class MarginCallResult1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MrgnCallRsltDtls", required = true)
	protected MarginCallResult2 marginCallResultDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarginCallResult2
	 * MarginCallResult2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MarginCallResult1Choice
	 * MarginCallResult1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnCallRsltDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallResultDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the summation of the call amounts for the variation margin and optionaly the segregated independent amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MarginCallResult1Choice, MarginCallResult2> mmMarginCallResultDetails = new MMMessageAssociationEnd<MarginCallResult1Choice, MarginCallResult2>() {
		{
			businessComponentTrace_lazy = () -> MarginCall.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.MarginCallResult1Choice.mmObject();
			isDerived = false;
			xmlTag = "MrgnCallRsltDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallResultDetails";
			definition = "Provides the summation of the call amounts for the variation margin and optionaly the segregated independent amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MarginCallResult2.mmObject();
		}

		@Override
		public MarginCallResult2 getValue(MarginCallResult1Choice obj) {
			return obj.getMarginCallResultDetails();
		}

		@Override
		public void setValue(MarginCallResult1Choice obj, MarginCallResult2 value) {
			obj.setMarginCallResultDetails(value);
		}
	};
	@XmlElement(name = "SgrtdIndpdntAmt", required = true)
	protected Result1 segregatedIndependentAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Result1 Result1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmSegregatedIndependentAmount
	 * MarginCall.mmSegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MarginCallResult1Choice
	 * MarginCallResult1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgrtdIndpdntAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the summation of the call amounts for the segregated independent amount only."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MarginCallResult1Choice, Result1> mmSegregatedIndependentAmount = new MMMessageAssociationEnd<MarginCallResult1Choice, Result1>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmSegregatedIndependentAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.MarginCallResult1Choice.mmObject();
			isDerived = false;
			xmlTag = "SgrtdIndpdntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmount";
			definition = "Provides the summation of the call amounts for the segregated independent amount only.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Result1.mmObject();
		}

		@Override
		public Result1 getValue(MarginCallResult1Choice obj) {
			return obj.getSegregatedIndependentAmount();
		}

		@Override
		public void setValue(MarginCallResult1Choice obj, Result1 value) {
			obj.setSegregatedIndependentAmount(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MarginCallResult1Choice.mmMarginCallResultDetails, com.tools20022.repository.choice.MarginCallResult1Choice.mmSegregatedIndependentAmount);
				trace_lazy = () -> MarginCall.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MarginCallResult1Choice";
				definition = "Choice to provide the summation of the call amounts for the variation margin and the segregated independent amount, or the segregated independent amount only.";
			}
		});
		return mmObject_lazy.get();
	}

	public MarginCallResult2 getMarginCallResultDetails() {
		return marginCallResultDetails;
	}

	public MarginCallResult1Choice setMarginCallResultDetails(MarginCallResult2 marginCallResultDetails) {
		this.marginCallResultDetails = Objects.requireNonNull(marginCallResultDetails);
		return this;
	}

	public Result1 getSegregatedIndependentAmount() {
		return segregatedIndependentAmount;
	}

	public MarginCallResult1Choice setSegregatedIndependentAmount(Result1 segregatedIndependentAmount) {
		this.segregatedIndependentAmount = Objects.requireNonNull(segregatedIndependentAmount);
		return this;
	}
}