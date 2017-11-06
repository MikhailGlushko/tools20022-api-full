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
import com.tools20022.repository.codeset.DemandStatusCode;
import com.tools20022.repository.codeset.ExternalUndertakingStatusCategoryCode;
import com.tools20022.repository.codeset.UndertakingStatusCode;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Status of the undertaking.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="UndertakingStatus" src="doc-files/UndertakingStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmUndertaking
 * UndertakingStatus.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmDemandStatus
 * UndertakingStatus.mmDemandStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UndertakingStatus#mmStatus
 * UndertakingStatus.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmUndertakingStatusReason
 * UndertakingStatus.mmUndertakingStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmStatusCategory
 * UndertakingStatus.mmStatusCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmPresentationStatus
 * UndertakingStatus.mmPresentationStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingStatus
 * Undertaking.mmUndertakingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason#mmUndertakingStatus
 * UndertakingStatusReason.mmUndertakingStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingTerminationNotice1#mmTerminationDetails
 * UndertakingTerminationNotice1.mmTerminationDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ExtendOrPayQuery2
 * ExtendOrPayQuery2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeStatusReport1
 * TradeStatusReport1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UndertakingTermination3
 * UndertakingTermination3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingNonExtensionStatusAdvice1
 * UndertakingNonExtensionStatusAdvice1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1
 * UndertakingStatusAdvice1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UndertakingTerminationNotice1
 * UndertakingTerminationNotice1}</li>
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
 * "UndertakingStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of the undertaking."</li>
 * </ul>
 */
public class UndertakingStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Undertaking undertaking;
	/**
	 * Undertaking for which a status is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingStatus
	 * Undertaking.mmUndertakingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus
	 * UndertakingStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DemandRefusal1#mmUndertakingIdentification
	 * DemandRefusal1.mmUndertakingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery2#mmUndertakingIdentification
	 * ExtendOrPayQuery2.mmUndertakingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingNonExtensionStatusAdvice1#mmUndertakingIdentification
	 * UndertakingNonExtensionStatusAdvice1.mmUndertakingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1#mmUndertakingIdentification
	 * UndertakingStatusAdvice1.mmUndertakingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingTerminationNotice1#mmUndertakingIdentification
	 * UndertakingTerminationNotice1.mmUndertakingIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking for which a status is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUndertaking = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DemandRefusal1.mmUndertakingIdentification, com.tools20022.repository.msg.ExtendOrPayQuery2.mmUndertakingIdentification,
					com.tools20022.repository.msg.UndertakingNonExtensionStatusAdvice1.mmUndertakingIdentification, com.tools20022.repository.msg.UndertakingStatusAdvice1.mmUndertakingIdentification,
					com.tools20022.repository.msg.UndertakingTerminationNotice1.mmUndertakingIdentification);
			elementContext_lazy = () -> UndertakingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which a status is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.mmUndertakingStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	protected DemandStatusCode demandStatus;
	/**
	 * Processing status reported by the applicant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DemandStatusCode
	 * DemandStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus
	 * UndertakingStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.DemandRefusal1#mmStatus
	 * DemandRefusal1.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ExtendOrPayQuery2#mmStatus
	 * ExtendOrPayQuery2.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DemandStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing status reported by the applicant."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDemandStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DemandRefusal1.mmStatus, com.tools20022.repository.msg.ExtendOrPayQuery2.mmStatus);
			elementContext_lazy = () -> UndertakingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DemandStatus";
			definition = "Processing status reported by the applicant.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DemandStatusCode.mmObject();
		}
	};
	protected UndertakingStatusCode status;
	/**
	 * Status of the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode
	 * UndertakingStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus
	 * UndertakingStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeStatusReport1#mmStatus
	 * TradeStatusReport1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1#mmStatus
	 * UndertakingStatusAdvice1.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeStatusReport1.mmStatus, com.tools20022.repository.msg.UndertakingStatusAdvice1.mmStatus);
			elementContext_lazy = () -> UndertakingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UndertakingStatusCode.mmObject();
		}
	};
	protected UndertakingStatusReason undertakingStatusReason;
	/**
	 * Specifies the reason for the status. it is derived from the association
	 * between Status and StatusReason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason#mmUndertakingStatus
	 * UndertakingStatusReason.mmUndertakingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason
	 * UndertakingStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus
	 * UndertakingStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeStatusReport1#mmStatusReason
	 * TradeStatusReport1.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1#mmStatusReason
	 * UndertakingStatusAdvice1.mmStatusReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason for the status. it is derived from the association between Status and StatusReason."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUndertakingStatusReason = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeStatusReport1.mmStatusReason, com.tools20022.repository.msg.UndertakingStatusAdvice1.mmStatusReason);
			elementContext_lazy = () -> UndertakingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UndertakingStatusReason";
			definition = "Specifies the reason for the status. it is derived from the association between Status and StatusReason.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingStatusReason.mmUndertakingStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingStatusReason.mmObject();
		}
	};
	protected ExternalUndertakingStatusCategoryCode statusCategory;
	/**
	 * Specifies the category of the status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalUndertakingStatusCategoryCode
	 * ExternalUndertakingStatusCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus
	 * UndertakingStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingStatusAdvice1#mmStatusCategory
	 * UndertakingStatusAdvice1.mmStatusCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the category of the status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStatusCategory = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UndertakingStatusAdvice1.mmStatusCategory);
			elementContext_lazy = () -> UndertakingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusCategory";
			definition = "Specifies the category of the status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalUndertakingStatusCategoryCode.mmObject();
		}
	};
	protected UndertakingStatusCode presentationStatus;
	/**
	 * Status of the presentation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode
	 * UndertakingStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus
	 * UndertakingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the presentation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPresentationStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> UndertakingStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PresentationStatus";
			definition = "Status of the presentation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UndertakingStatusCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UndertakingStatus";
				definition = "Status of the undertaking.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.mmUndertakingStatus, com.tools20022.repository.entity.UndertakingStatusReason.mmUndertakingStatus);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UndertakingTerminationNotice1.mmTerminationDetails);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UndertakingStatus.mmUndertaking, com.tools20022.repository.entity.UndertakingStatus.mmDemandStatus,
						com.tools20022.repository.entity.UndertakingStatus.mmStatus, com.tools20022.repository.entity.UndertakingStatus.mmUndertakingStatusReason, com.tools20022.repository.entity.UndertakingStatus.mmStatusCategory,
						com.tools20022.repository.entity.UndertakingStatus.mmPresentationStatus);
				derivationComponent_lazy = () -> Arrays.asList(ExtendOrPayQuery2.mmObject(), TradeStatusReport1.mmObject(), UndertakingTermination3.mmObject(), UndertakingNonExtensionStatusAdvice1.mmObject(),
						UndertakingStatusAdvice1.mmObject(), UndertakingTerminationNotice1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Undertaking getUndertaking() {
		return undertaking;
	}

	public void setUndertaking(com.tools20022.repository.entity.Undertaking undertaking) {
		this.undertaking = undertaking;
	}

	public DemandStatusCode getDemandStatus() {
		return demandStatus;
	}

	public void setDemandStatus(DemandStatusCode demandStatus) {
		this.demandStatus = demandStatus;
	}

	public UndertakingStatusCode getStatus() {
		return status;
	}

	public void setStatus(UndertakingStatusCode status) {
		this.status = status;
	}

	public UndertakingStatusReason getUndertakingStatusReason() {
		return undertakingStatusReason;
	}

	public void setUndertakingStatusReason(com.tools20022.repository.entity.UndertakingStatusReason undertakingStatusReason) {
		this.undertakingStatusReason = undertakingStatusReason;
	}

	public ExternalUndertakingStatusCategoryCode getStatusCategory() {
		return statusCategory;
	}

	public void setStatusCategory(ExternalUndertakingStatusCategoryCode statusCategory) {
		this.statusCategory = statusCategory;
	}

	public UndertakingStatusCode getPresentationStatus() {
		return presentationStatus;
	}

	public void setPresentationStatus(UndertakingStatusCode presentationStatus) {
		this.presentationStatus = presentationStatus;
	}
}