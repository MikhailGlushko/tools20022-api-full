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
import com.tools20022.repository.codeset.CollateralSubstitutionTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Substitution of collateral by specifying the collateral to be returned and
 * proposing the new type(s) of collateral to be delivered.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CollateralSubstitution"
 * src="doc-files/CollateralSubstitution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#mmType
 * CollateralSubstitution.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#mmAcceptedAmount
 * CollateralSubstitution.mmAcceptedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#mmRejectedAmount
 * CollateralSubstitution.mmRejectedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#mmRelatedManagementProcess
 * CollateralSubstitution.mmRelatedManagementProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#mmNewCollateral
 * CollateralSubstitution.mmNewCollateral}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmRelatedCollateralSubstitution
 * Collateral.mmRelatedCollateralSubstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateralSubstitution
 * CollateralManagement.mmCollateralSubstitution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubstitutionResponse1#mmCollateralSubstitutionAcceptanceDetails
 * SubstitutionResponse1.mmCollateralSubstitutionAcceptanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubstitutionResponse1#mmCollateralSubstitutionRejectionDetails
 * SubstitutionResponse1.mmCollateralSubstitutionRejectionDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralSubstitution1
 * CollateralSubstitution1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse1
 * CollateralSubstitutionResponse1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse2
 * CollateralSubstitutionResponse2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubstitutionResponse1
 * SubstitutionResponse1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralSubstitution2
 * CollateralSubstitution2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralSubstitution3
 * CollateralSubstitution3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralSubstitution5
 * CollateralSubstitution5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralSubstitution4
 * CollateralSubstitution4}</li>
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
 * "CollateralSubstitution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Substitution of collateral by specifying the collateral to be returned and proposing the new type(s) of collateral to be delivered."
 * </li>
 * </ul>
 */
public class CollateralSubstitution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CollateralSubstitutionTypeCode type;
	/**
	 * Specifies if the collateral that is substituted was posted against the
	 * variation margin or the independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionTypeCode
	 * CollateralSubstitutionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution
	 * CollateralSubstitution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1#mmCollateralSubstitutionType
	 * CollateralSubstitution1.mmCollateralSubstitutionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution2#mmCollateralSubstitutionType
	 * CollateralSubstitution2.mmCollateralSubstitutionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution3#mmCollateralSubstitutionType
	 * CollateralSubstitution3.mmCollateralSubstitutionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5#mmCollateralSubstitutionType
	 * CollateralSubstitution5.mmCollateralSubstitutionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution4#mmCollateralSubstitutionType
	 * CollateralSubstitution4.mmCollateralSubstitutionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the collateral that is substituted was posted against the variation margin or the independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralSubstitution1.mmCollateralSubstitutionType, com.tools20022.repository.msg.CollateralSubstitution2.mmCollateralSubstitutionType,
					com.tools20022.repository.msg.CollateralSubstitution3.mmCollateralSubstitutionType, com.tools20022.repository.msg.CollateralSubstitution5.mmCollateralSubstitutionType,
					com.tools20022.repository.msg.CollateralSubstitution4.mmCollateralSubstitutionType);
			elementContext_lazy = () -> CollateralSubstitution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies if the collateral that is substituted was posted against the variation margin or the independent amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralSubstitutionTypeCode.mmObject();
		}
	};
	protected CurrencyAndAmount acceptedAmount;
	/**
	 * Provides the accepted collateral substitution amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution
	 * CollateralSubstitution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse1#mmAcceptedAmount
	 * CollateralSubstitutionResponse1.mmAcceptedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the accepted collateral substitution amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAcceptedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralSubstitutionResponse1.mmAcceptedAmount);
			elementContext_lazy = () -> CollateralSubstitution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedAmount";
			definition = "Provides the accepted collateral substitution amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount rejectedAmount;
	/**
	 * Specifies the collateral substitution amount that is rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution
	 * CollateralSubstitution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse2#mmRejectedAmount
	 * CollateralSubstitutionResponse2.mmRejectedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the collateral substitution amount that is rejected."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRejectedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralSubstitutionResponse2.mmRejectedAmount);
			elementContext_lazy = () -> CollateralSubstitution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedAmount";
			definition = "Specifies the collateral substitution amount that is rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CollateralManagement relatedManagementProcess;
	/**
	 * Process which groups the activities related to collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateralSubstitution
	 * CollateralManagement.mmCollateralSubstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution
	 * CollateralSubstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedManagementProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedManagementProcess = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralSubstitution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedManagementProcess";
			definition = "Process which groups the activities related to collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmCollateralSubstitution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Collateral> newCollateral;
	/**
	 * Specifies the collateral which is replacing the returned one.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmRelatedCollateralSubstitution
	 * Collateral.mmRelatedCollateralSubstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution
	 * CollateralSubstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the collateral which is replacing the returned one."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNewCollateral = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralSubstitution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewCollateral";
			definition = "Specifies the collateral which is replacing the returned one.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.mmRelatedCollateralSubstitution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralSubstitution";
				definition = "Substitution of collateral by specifying the collateral to be returned and proposing the new type(s) of collateral to be delivered.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Collateral.mmRelatedCollateralSubstitution, com.tools20022.repository.entity.CollateralManagement.mmCollateralSubstitution);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubstitutionResponse1.mmCollateralSubstitutionAcceptanceDetails,
						com.tools20022.repository.msg.SubstitutionResponse1.mmCollateralSubstitutionRejectionDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralSubstitution.mmType, com.tools20022.repository.entity.CollateralSubstitution.mmAcceptedAmount,
						com.tools20022.repository.entity.CollateralSubstitution.mmRejectedAmount, com.tools20022.repository.entity.CollateralSubstitution.mmRelatedManagementProcess,
						com.tools20022.repository.entity.CollateralSubstitution.mmNewCollateral);
				derivationComponent_lazy = () -> Arrays.asList(CollateralSubstitution1.mmObject(), CollateralSubstitutionResponse1.mmObject(), CollateralSubstitutionResponse2.mmObject(), SubstitutionResponse1.mmObject(),
						CollateralSubstitution2.mmObject(), CollateralSubstitution3.mmObject(), CollateralSubstitution5.mmObject(), CollateralSubstitution4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CollateralSubstitutionTypeCode getType() {
		return type;
	}

	public void setType(CollateralSubstitutionTypeCode type) {
		this.type = type;
	}

	public CurrencyAndAmount getAcceptedAmount() {
		return acceptedAmount;
	}

	public void setAcceptedAmount(CurrencyAndAmount acceptedAmount) {
		this.acceptedAmount = acceptedAmount;
	}

	public CurrencyAndAmount getRejectedAmount() {
		return rejectedAmount;
	}

	public void setRejectedAmount(CurrencyAndAmount rejectedAmount) {
		this.rejectedAmount = rejectedAmount;
	}

	public CollateralManagement getRelatedManagementProcess() {
		return relatedManagementProcess;
	}

	public void setRelatedManagementProcess(com.tools20022.repository.entity.CollateralManagement relatedManagementProcess) {
		this.relatedManagementProcess = relatedManagementProcess;
	}

	public List<Collateral> getNewCollateral() {
		return newCollateral;
	}

	public void setNewCollateral(List<com.tools20022.repository.entity.Collateral> newCollateral) {
		this.newCollateral = newCollateral;
	}
}