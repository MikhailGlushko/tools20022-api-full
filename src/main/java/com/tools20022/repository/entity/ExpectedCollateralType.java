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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.ExpectedCollateral1Choice;
import com.tools20022.repository.choice.ExpectedCollateral2Choice;
import com.tools20022.repository.codeset.CollateralTypeCode;
import com.tools20022.repository.msg.ExpectedCollateral1;
import com.tools20022.repository.msg.ExpectedCollateral2;
import com.tools20022.repository.msg.ExpectedCollateralMovement1;
import com.tools20022.repository.msg.ExpectedCollateralMovement2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Expected collateral type.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ExpectedCollateralType"
 * src="doc-files/ExpectedCollateralType.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#mmVariationMarginRelatedCall
 * ExpectedCollateralType.mmVariationMarginRelatedCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#mmDelivery
 * ExpectedCollateralType.mmDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#mmReturn
 * ExpectedCollateralType.mmReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#mmSegregatedIndependentAmountRelatedCall
 * ExpectedCollateralType.mmSegregatedIndependentAmountRelatedCall}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmExpectedVariationMarginType
 * MarginCall.mmExpectedVariationMarginType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmExpectedSegregatedIndependentAmountType
 * MarginCall.mmExpectedSegregatedIndependentAmountType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedCollateral1#mmVariationMargin
 * ExpectedCollateral1.mmVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedCollateral1#mmSegregatedIndependentAmount
 * ExpectedCollateral1.mmSegregatedIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral1Choice#mmExpectedCollateralDetails
 * ExpectedCollateral1Choice.mmExpectedCollateralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral1Choice#mmSegregatedIndependentAmount
 * ExpectedCollateral1Choice.mmSegregatedIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral2Choice#mmExpectedCollateralDetails
 * ExpectedCollateral2Choice.mmExpectedCollateralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral2Choice#mmSegregatedIndependentAmount
 * ExpectedCollateral2Choice.mmSegregatedIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall2#mmExpectedCollateralDueToA
 * MarginCall2.mmExpectedCollateralDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall2#mmExpectedCollateralDueToB
 * MarginCall2.mmExpectedCollateralDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedCollateral2#mmVariationMargin
 * ExpectedCollateral2.mmVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedCollateral2#mmSegregatedIndependentAmount
 * ExpectedCollateral2.mmSegregatedIndependentAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement1
 * ExpectedCollateralMovement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExpectedCollateral1
 * ExpectedCollateral1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExpectedCollateral1Choice
 * ExpectedCollateral1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExpectedCollateral2Choice
 * ExpectedCollateral2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExpectedCollateral2
 * ExpectedCollateral2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement2
 * ExpectedCollateralMovement2}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExpectedCollateralType"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Expected collateral type."</li>
 * </ul>
 */
public class ExpectedCollateralType {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected MarginCall variationMarginRelatedCall;
	/**
	 * Call for which a variation margin type is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmExpectedVariationMarginType
	 * MarginCall.mmExpectedVariationMarginType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MarginCall
	 * MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginRelatedCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Call for which a variation margin type is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmVariationMarginRelatedCall = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ExpectedCollateralType.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginRelatedCall";
			definition = "Call for which a variation margin type is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.mmExpectedVariationMarginType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
		}
	};
	protected CollateralTypeCode delivery;
	/**
	 * Type of collateral that will be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode
	 * CollateralTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement1#mmDelivery
	 * ExpectedCollateralMovement1.mmDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement2#mmDelivery
	 * ExpectedCollateralMovement2.mmDelivery}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of collateral that will be delivered."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDelivery = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExpectedCollateralMovement1.mmDelivery, com.tools20022.repository.msg.ExpectedCollateralMovement2.mmDelivery);
			elementContext_lazy = () -> ExpectedCollateralType.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delivery";
			definition = "Type of collateral that will be delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralTypeCode.mmObject();
		}
	};
	protected CollateralTypeCode return_;
	/**
	 * Type of collateral that will be returned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode
	 * CollateralTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement1#mmReturn
	 * ExpectedCollateralMovement1.mmReturn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement2#mmReturn
	 * ExpectedCollateralMovement2.mmReturn}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Return"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of collateral that will be returned."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReturn = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExpectedCollateralMovement1.mmReturn, com.tools20022.repository.msg.ExpectedCollateralMovement2.mmReturn);
			elementContext_lazy = () -> ExpectedCollateralType.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Return";
			definition = "Type of collateral that will be returned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralTypeCode.mmObject();
		}
	};
	protected MarginCall segregatedIndependentAmountRelatedCall;
	/**
	 * Call for which a segregated independent amount type is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmExpectedSegregatedIndependentAmountType
	 * MarginCall.mmExpectedSegregatedIndependentAmountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MarginCall
	 * MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmountRelatedCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Call for which a segregated independent amount type is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSegregatedIndependentAmountRelatedCall = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ExpectedCollateralType.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmountRelatedCall";
			definition = "Call for which a segregated independent amount type is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.mmExpectedSegregatedIndependentAmountType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ExpectedCollateralType";
				definition = "Expected collateral type.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MarginCall.mmExpectedVariationMarginType, com.tools20022.repository.entity.MarginCall.mmExpectedSegregatedIndependentAmountType);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExpectedCollateral1.mmVariationMargin, com.tools20022.repository.msg.ExpectedCollateral1.mmSegregatedIndependentAmount,
						com.tools20022.repository.choice.ExpectedCollateral1Choice.mmExpectedCollateralDetails, com.tools20022.repository.choice.ExpectedCollateral1Choice.mmSegregatedIndependentAmount,
						com.tools20022.repository.choice.ExpectedCollateral2Choice.mmExpectedCollateralDetails, com.tools20022.repository.choice.ExpectedCollateral2Choice.mmSegregatedIndependentAmount,
						com.tools20022.repository.msg.MarginCall2.mmExpectedCollateralDueToA, com.tools20022.repository.msg.MarginCall2.mmExpectedCollateralDueToB, com.tools20022.repository.msg.ExpectedCollateral2.mmVariationMargin,
						com.tools20022.repository.msg.ExpectedCollateral2.mmSegregatedIndependentAmount);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExpectedCollateralType.mmVariationMarginRelatedCall, com.tools20022.repository.entity.ExpectedCollateralType.mmDelivery,
						com.tools20022.repository.entity.ExpectedCollateralType.mmReturn, com.tools20022.repository.entity.ExpectedCollateralType.mmSegregatedIndependentAmountRelatedCall);
				derivationComponent_lazy = () -> Arrays.asList(ExpectedCollateralMovement1.mmObject(), ExpectedCollateral1.mmObject(), ExpectedCollateral1Choice.mmObject(), ExpectedCollateral2Choice.mmObject(),
						ExpectedCollateral2.mmObject(), ExpectedCollateralMovement2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public MarginCall getVariationMarginRelatedCall() {
		return variationMarginRelatedCall;
	}

	public void setVariationMarginRelatedCall(com.tools20022.repository.entity.MarginCall variationMarginRelatedCall) {
		this.variationMarginRelatedCall = variationMarginRelatedCall;
	}

	public CollateralTypeCode getDelivery() {
		return delivery;
	}

	public void setDelivery(CollateralTypeCode delivery) {
		this.delivery = delivery;
	}

	public CollateralTypeCode getReturn() {
		return return_;
	}

	public void setReturn(CollateralTypeCode return_) {
		this.return_ = return_;
	}

	public MarginCall getSegregatedIndependentAmountRelatedCall() {
		return segregatedIndependentAmountRelatedCall;
	}

	public void setSegregatedIndependentAmountRelatedCall(com.tools20022.repository.entity.MarginCall segregatedIndependentAmountRelatedCall) {
		this.segregatedIndependentAmountRelatedCall = segregatedIndependentAmountRelatedCall;
	}
}