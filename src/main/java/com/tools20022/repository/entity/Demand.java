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
import com.tools20022.repository.codeset.DemandTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Document signed by the beneficiary demanding payment under a demand guarantee
 * or standby letter of credit.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Demand" src="doc-files/Demand.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#mmUndertaking
 * Demand.mmUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#mmSubmissionDateTime
 * Demand.mmSubmissionDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#mmDemandAmount
 * Demand.mmDemandAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#mmType Demand.mmType}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#mmTotalClaimAmount
 * Demand.mmTotalClaimAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#mmPayment
 * Demand.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#mmAssociatedDocument
 * Demand.mmAssociatedDocument}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourceUndertakingDemand
 * PaymentObligation.mmPaymentSourceUndertakingDemand}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmDemand
 * Undertaking.mmDemand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#mmDemand
 * UndertakingDocument.mmDemand}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingDemandWithdrawal1#mmDemandDetails
 * UndertakingDemandWithdrawal1.mmDemandDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Demand2 Demand2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Demand3 Demand3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UndertakingDemandWithdrawal1
 * UndertakingDemandWithdrawal1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Demand4 Demand4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Demand1 Demand1}</li>
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
 * "Demand"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Document signed by the beneficiary demanding payment under a demand guarantee or standby letter of credit."
 * </li>
 * </ul>
 */
public class Demand {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Undertaking undertaking;
	/**
	 * Undertaking for which a document signed by the beneficiary demanding
	 * payment is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmDemand
	 * Undertaking.mmDemand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Demand
	 * Demand}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingDemandWithdrawal1#mmUndertakingIdentification
	 * UndertakingDemandWithdrawal1.mmUndertakingIdentification}</li>
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
	 * definition} =
	 * "Undertaking for which a document signed by the beneficiary demanding payment is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUndertaking = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UndertakingDemandWithdrawal1.mmUndertakingIdentification);
			elementContext_lazy = () -> Demand.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which a document signed by the beneficiary demanding payment is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.mmDemand;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	protected ISODateTime submissionDateTime;
	/**
	 * Date and time the demand is submitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Demand
	 * Demand}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Demand2#mmSubmissionDateTime
	 * Demand2.mmSubmissionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Demand3#mmSubmissionDateTime
	 * Demand3.mmSubmissionDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmissionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time the demand is submitted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSubmissionDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Demand2.mmSubmissionDateTime, com.tools20022.repository.msg.Demand3.mmSubmissionDateTime);
			elementContext_lazy = () -> Demand.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubmissionDateTime";
			definition = "Date and time the demand is submitted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected CurrencyAndAmount demandAmount;
	/**
	 * Amount to be paid.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Demand
	 * Demand}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Demand2#mmAmount
	 * Demand2.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Demand3#mmAmount
	 * Demand3.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Demand4#mmAmount
	 * Demand4.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Demand1#mmDemandAmount
	 * Demand1.mmDemandAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DemandAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount to be paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDemandAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Demand2.mmAmount, com.tools20022.repository.msg.Demand3.mmAmount, com.tools20022.repository.msg.Demand4.mmAmount,
					com.tools20022.repository.msg.Demand1.mmDemandAmount);
			elementContext_lazy = () -> Demand.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DemandAmount";
			definition = "Amount to be paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected DemandTypeCode type;
	/**
	 * Type of demand, for example, pay or extend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DemandTypeCode
	 * DemandTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Demand
	 * Demand}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Demand1#mmType
	 * Demand1.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of demand, for example, pay or extend."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Demand1.mmType);
			elementContext_lazy = () -> Demand.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of demand, for example, pay or extend.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DemandTypeCode.mmObject();
		}
	};
	protected CurrencyAndAmount totalClaimAmount;
	/**
	 * Amount and currency of the total amount claimed (sum of the demand amount
	 * plus counterparty commission and charges).
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Demand
	 * Demand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalClaimAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount and currency of the total amount claimed (sum of the demand amount plus counterparty commission and charges)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalClaimAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Demand.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalClaimAmount";
			definition = "Amount and currency of the total amount claimed (sum of the demand amount plus counterparty commission and charges).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected PaymentObligation payment;
	/**
	 * Payment of the demand.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourceUndertakingDemand
	 * PaymentObligation.mmPaymentSourceUndertakingDemand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Demand
	 * Demand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment of the demand."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Demand.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment of the demand.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmPaymentSourceUndertakingDemand;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected UndertakingDocument associatedDocument;
	/**
	 * Documents which are associated with a demand.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#mmDemand
	 * UndertakingDocument.mmDemand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UndertakingDocument
	 * UndertakingDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Demand
	 * Demand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssociatedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Documents which are associated with a demand."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAssociatedDocument = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Demand.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssociatedDocument";
			definition = "Documents which are associated with a demand.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingDocument.mmDemand;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingDocument.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Demand";
				definition = "Document signed by the beneficiary demanding payment under a demand guarantee or standby letter of credit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.mmPaymentSourceUndertakingDemand, com.tools20022.repository.entity.Undertaking.mmDemand,
						com.tools20022.repository.entity.UndertakingDocument.mmDemand);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UndertakingDemandWithdrawal1.mmDemandDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Demand.mmUndertaking, com.tools20022.repository.entity.Demand.mmSubmissionDateTime, com.tools20022.repository.entity.Demand.mmDemandAmount,
						com.tools20022.repository.entity.Demand.mmType, com.tools20022.repository.entity.Demand.mmTotalClaimAmount, com.tools20022.repository.entity.Demand.mmPayment,
						com.tools20022.repository.entity.Demand.mmAssociatedDocument);
				derivationComponent_lazy = () -> Arrays.asList(Demand2.mmObject(), Demand3.mmObject(), UndertakingDemandWithdrawal1.mmObject(), Demand4.mmObject(), Demand1.mmObject());
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

	public ISODateTime getSubmissionDateTime() {
		return submissionDateTime;
	}

	public void setSubmissionDateTime(ISODateTime submissionDateTime) {
		this.submissionDateTime = submissionDateTime;
	}

	public CurrencyAndAmount getDemandAmount() {
		return demandAmount;
	}

	public void setDemandAmount(CurrencyAndAmount demandAmount) {
		this.demandAmount = demandAmount;
	}

	public DemandTypeCode getType() {
		return type;
	}

	public void setType(DemandTypeCode type) {
		this.type = type;
	}

	public CurrencyAndAmount getTotalClaimAmount() {
		return totalClaimAmount;
	}

	public void setTotalClaimAmount(CurrencyAndAmount totalClaimAmount) {
		this.totalClaimAmount = totalClaimAmount;
	}

	public PaymentObligation getPayment() {
		return payment;
	}

	public void setPayment(com.tools20022.repository.entity.PaymentObligation payment) {
		this.payment = payment;
	}

	public UndertakingDocument getAssociatedDocument() {
		return associatedDocument;
	}

	public void setAssociatedDocument(com.tools20022.repository.entity.UndertakingDocument associatedDocument) {
		this.associatedDocument = associatedDocument;
	}
}