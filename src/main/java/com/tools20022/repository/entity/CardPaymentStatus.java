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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.FailureReasonCode;
import com.tools20022.repository.codeset.RejectReasonCode;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Status of a payment by card.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CardPaymentStatus" src="doc-files/CardPaymentStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#mmRejectionReason
 * CardPaymentStatus.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#mmFailureReason
 * CardPaymentStatus.mmFailureReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#mmCardPayment
 * CardPaymentStatus.mmCardPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentStatus
 * CardPayment.mmCardPaymentStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorRejection1
 * AcceptorRejection1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse1
 * AcceptorReconciliationResponse1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse2
 * AcceptorReconciliationResponse2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorRejection2
 * AcceptorRejection2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorRejection3
 * AcceptorRejection3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse3
 * AcceptorReconciliationResponse3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorRejection4
 * AcceptorRejection4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse4
 * AcceptorReconciliationResponse4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse5
 * AcceptorReconciliationResponse5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of a payment by card."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class CardPaymentStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected RejectReasonCode rejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode
	 * RejectReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection1#mmRejectReason
	 * AcceptorRejection1.mmRejectReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection2#mmRejectReason
	 * AcceptorRejection2.mmRejectReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection3#mmRejectReason
	 * AcceptorRejection3.mmRejectReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection4#mmRejectReason
	 * AcceptorRejection4.mmRejectReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus
	 * CardPaymentStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason of the rejection of a request or an advice."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentStatus, RejectReasonCode> mmRejectionReason = new MMBusinessAttribute<CardPaymentStatus, RejectReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AcceptorRejection1.mmRejectReason, AcceptorRejection2.mmRejectReason, AcceptorRejection3.mmRejectReason, AcceptorRejection4.mmRejectReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectionReason";
			definition = "Reason of the rejection of a request or an advice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectReasonCode.mmObject();
		}

		@Override
		public RejectReasonCode getValue(CardPaymentStatus obj) {
			return obj.getRejectionReason();
		}

		@Override
		public void setValue(CardPaymentStatus obj, RejectReasonCode value) {
			obj.setRejectionReason(value);
		}
	};
	protected FailureReasonCode failureReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#mmFailureReason
	 * CardPaymentTransaction4.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#mmFailureReason
	 * CardPaymentTransaction14.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction7#mmFailureReason
	 * CardPaymentTransaction7.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction16#mmFailureReason
	 * CardPaymentTransaction16.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction20#mmFailureReason
	 * CardPaymentTransaction20.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmFailureReason
	 * CardPaymentTransaction3.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#mmFailureReason
	 * CardPaymentTransaction13.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction28#mmFailureReason
	 * CardPaymentTransaction28.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmFailureReason
	 * CardPaymentTransaction29.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#mmFailureReason
	 * CardPaymentTransaction25.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction30#mmFailureReason
	 * CardPaymentTransaction30.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44#mmFailureReason
	 * CardPaymentTransaction44.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmFailureReason
	 * CardPaymentTransaction45.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction46#mmFailureReason
	 * CardPaymentTransaction46.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#mmFailureReason
	 * CardPaymentTransaction40.mmFailureReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction5#mmIncident
	 * ATMTransaction5.mmIncident}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmFailureReason
	 * CardPaymentTransaction60.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction61#mmFailureReason
	 * CardPaymentTransaction61.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction59#mmFailureReason
	 * CardPaymentTransaction59.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#mmFailureReason
	 * CardPaymentTransaction55.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction20#mmIncident
	 * ATMTransaction20.mmIncident}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#mmFailureReason
	 * CardPaymentTransaction75.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmFailureReason
	 * CardPaymentTransaction70.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmFailureReason
	 * CardPaymentTransaction69.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction83#mmFailureReason
	 * CardPaymentTransaction83.mmFailureReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction81#mmFailureReason
	 * CardPaymentTransaction81.mmFailureReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus
	 * CardPaymentStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailureReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of incidents during the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentStatus, FailureReasonCode> mmFailureReason = new MMBusinessAttribute<CardPaymentStatus, FailureReasonCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransaction4.mmFailureReason, CardPaymentTransaction14.mmFailureReason, CardPaymentTransaction7.mmFailureReason, CardPaymentTransaction16.mmFailureReason,
					CardPaymentTransaction20.mmFailureReason, CardPaymentTransaction3.mmFailureReason, CardPaymentTransaction13.mmFailureReason, CardPaymentTransaction28.mmFailureReason, CardPaymentTransaction29.mmFailureReason,
					CardPaymentTransaction25.mmFailureReason, CardPaymentTransaction30.mmFailureReason, CardPaymentTransaction44.mmFailureReason, CardPaymentTransaction45.mmFailureReason, CardPaymentTransaction46.mmFailureReason,
					CardPaymentTransaction40.mmFailureReason, ATMTransaction5.mmIncident, CardPaymentTransaction60.mmFailureReason, CardPaymentTransaction61.mmFailureReason, CardPaymentTransaction59.mmFailureReason,
					CardPaymentTransaction55.mmFailureReason, ATMTransaction20.mmIncident, CardPaymentTransaction75.mmFailureReason, CardPaymentTransaction70.mmFailureReason, CardPaymentTransaction69.mmFailureReason,
					CardPaymentTransaction83.mmFailureReason, CardPaymentTransaction81.mmFailureReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FailureReason";
			definition = "List of incidents during the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FailureReasonCode.mmObject();
		}

		@Override
		public FailureReasonCode getValue(CardPaymentStatus obj) {
			return obj.getFailureReason();
		}

		@Override
		public void setValue(CardPaymentStatus obj, FailureReasonCode value) {
			obj.setFailureReason(value);
		}
	};
	protected List<com.tools20022.repository.entity.CardPayment> cardPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardPayment
	 * CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentStatus
	 * CardPayment.mmCardPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse1#mmEnvironment
	 * AcceptorReconciliationResponse1.mmEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse2#mmEnvironment
	 * AcceptorReconciliationResponse2.mmEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse3#mmEnvironment
	 * AcceptorReconciliationResponse3.mmEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse4#mmEnvironment
	 * AcceptorReconciliationResponse4.mmEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse5#mmEnvironment
	 * AcceptorReconciliationResponse5.mmEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus
	 * CardPaymentStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card payment for which a status is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CardPaymentStatus, List<CardPayment>> mmCardPayment = new MMBusinessAssociationEnd<CardPaymentStatus, List<CardPayment>>() {
		{
			derivation_lazy = () -> Arrays.asList(AcceptorReconciliationResponse1.mmEnvironment, AcceptorReconciliationResponse2.mmEnvironment, AcceptorReconciliationResponse3.mmEnvironment, AcceptorReconciliationResponse4.mmEnvironment,
					AcceptorReconciliationResponse5.mmEnvironment);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPayment";
			definition = "Card payment for which a status is provided.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.mmCardPaymentStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
		}

		@Override
		public List<CardPayment> getValue(CardPaymentStatus obj) {
			return obj.getCardPayment();
		}

		@Override
		public void setValue(CardPaymentStatus obj, List<CardPayment> value) {
			obj.setCardPayment(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentStatus";
				definition = "Status of a payment by card.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPayment.mmCardPaymentStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentStatus.mmRejectionReason, com.tools20022.repository.entity.CardPaymentStatus.mmFailureReason,
						com.tools20022.repository.entity.CardPaymentStatus.mmCardPayment);
				derivationComponent_lazy = () -> Arrays.asList(AcceptorRejection1.mmObject(), AcceptorReconciliationResponse1.mmObject(), AcceptorReconciliationResponse2.mmObject(), AcceptorRejection2.mmObject(),
						AcceptorRejection3.mmObject(), AcceptorReconciliationResponse3.mmObject(), AcceptorRejection4.mmObject(), AcceptorReconciliationResponse4.mmObject(), AcceptorReconciliationResponse5.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CardPaymentStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public RejectReasonCode getRejectionReason() {
		return rejectionReason;
	}

	public CardPaymentStatus setRejectionReason(RejectReasonCode rejectionReason) {
		this.rejectionReason = Objects.requireNonNull(rejectionReason);
		return this;
	}

	public FailureReasonCode getFailureReason() {
		return failureReason;
	}

	public CardPaymentStatus setFailureReason(FailureReasonCode failureReason) {
		this.failureReason = Objects.requireNonNull(failureReason);
		return this;
	}

	public List<CardPayment> getCardPayment() {
		return cardPayment == null ? cardPayment = new ArrayList<>() : cardPayment;
	}

	public CardPaymentStatus setCardPayment(List<com.tools20022.repository.entity.CardPayment> cardPayment) {
		this.cardPayment = Objects.requireNonNull(cardPayment);
		return this;
	}
}