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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.msg.ProprietaryStatusJustification;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * A choice between payment status reasons.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice#mmUnmatchedStatusReason
 * PaymentStatusReasonCode3Choice.mmUnmatchedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice#mmCancelledStatusReason
 * PaymentStatusReasonCode3Choice.mmCancelledStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice#mmSuspendedStatusReason
 * PaymentStatusReasonCode3Choice.mmSuspendedStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice#mmPendingFailingSettlement
 * PaymentStatusReasonCode3Choice.mmPendingFailingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice#mmPendingSettlement
 * PaymentStatusReasonCode3Choice.mmPendingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice#mmProprietaryRejectionReason
 * PaymentStatusReasonCode3Choice.mmProprietaryRejectionReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentStatus
 * PaymentStatus}</li>
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
 * "PaymentStatusReasonCode3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "A choice between payment status reasons."</li>
 * </ul>
 */
public class PaymentStatusReasonCode3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected UnmatchedStatusReason1Code unmatchedStatusReason;
	/**
	 * Reason why the payment status is unmatched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice
	 * PaymentStatusReasonCode3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UmtchdStsRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnmatchedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the payment status is unmatched."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnmatchedStatusReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.StatusReason.mmReason;
			componentContext_lazy = () -> PaymentStatusReasonCode3Choice.mmObject();
			isDerived = false;
			xmlTag = "UmtchdStsRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnmatchedStatusReason";
			definition = "Reason why the payment status is unmatched.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnmatchedStatusReason1Code.mmObject();
		}
	};
	protected CancelledStatusReason1Code cancelledStatusReason;
	/**
	 * Reason why the payment status is cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason1Code
	 * CancelledStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice
	 * PaymentStatusReasonCode3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CancStsRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the payment status is cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancelledStatusReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentStatusReasonCode3Choice.mmObject();
			isDerived = false;
			xmlTag = "CancStsRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledStatusReason";
			definition = "Reason why the payment status is cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancelledStatusReason1Code.mmObject();
		}
	};
	protected SuspendedStatusReason1Code suspendedStatusReason;
	/**
	 * Reason why the payment status is suspended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReason1Code
	 * SuspendedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice
	 * PaymentStatusReasonCode3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SspdStsRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspendedStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the payment status is suspended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSuspendedStatusReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentStatusReasonCode3Choice.mmObject();
			isDerived = false;
			xmlTag = "SspdStsRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspendedStatusReason";
			definition = "Reason why the payment status is suspended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SuspendedStatusReason1Code.mmObject();
		}
	};
	protected PendingFailingSettlement1Code pendingFailingSettlement;
	/**
	 * Reason why the payment status is pending (failing settlement).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlement1Code
	 * PendingFailingSettlement1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmPendingFailingSettlement
	 * PaymentStatus.mmPendingFailingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice
	 * PaymentStatusReasonCode3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgFlngSttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingFailingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason why the payment status is pending (failing settlement)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingFailingSettlement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmPendingFailingSettlement;
			componentContext_lazy = () -> PaymentStatusReasonCode3Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgFlngSttlm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingFailingSettlement";
			definition = "Reason why the payment status is pending (failing settlement).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingFailingSettlement1Code.mmObject();
		}
	};
	protected PendingSettlement2Code pendingSettlement;
	/**
	 * Reason why the payment status is pending (settlement).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmPendingSettlement
	 * PaymentStatus.mmPendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice
	 * PaymentStatusReasonCode3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgSttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the payment status is pending (settlement)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingSettlement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmPendingSettlement;
			componentContext_lazy = () -> PaymentStatusReasonCode3Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgSttlm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingSettlement";
			definition = "Reason why the payment status is pending (settlement).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingSettlement2Code.mmObject();
		}
	};
	protected ProprietaryStatusJustification proprietaryRejectionReason;
	/**
	 * Defines the reason that has been used by the Target2 SSP system to reject
	 * the transaction
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusJustification
	 * ProprietaryStatusJustification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice
	 * PaymentStatusReasonCode3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryRjctnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryRejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the reason that has been used by the Target2 SSP system to reject the transaction"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietaryRejectionReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.mmStatusReason;
			componentContext_lazy = () -> PaymentStatusReasonCode3Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryRjctnRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryRejectionReason";
			definition = "Defines the reason that has been used by the Target2 SSP system to reject the transaction";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ProprietaryStatusJustification.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusReasonCode3Choice.mmUnmatchedStatusReason, com.tools20022.repository.choice.PaymentStatusReasonCode3Choice.mmCancelledStatusReason,
						com.tools20022.repository.choice.PaymentStatusReasonCode3Choice.mmSuspendedStatusReason, com.tools20022.repository.choice.PaymentStatusReasonCode3Choice.mmPendingFailingSettlement,
						com.tools20022.repository.choice.PaymentStatusReasonCode3Choice.mmPendingSettlement, com.tools20022.repository.choice.PaymentStatusReasonCode3Choice.mmProprietaryRejectionReason);
				trace_lazy = () -> PaymentStatus.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentStatusReasonCode3Choice";
				definition = "A choice between payment status reasons.";
			}
		});
		return mmObject_lazy.get();
	}

	public UnmatchedStatusReason1Code getUnmatchedStatusReason() {
		return unmatchedStatusReason;
	}

	public void setUnmatchedStatusReason(UnmatchedStatusReason1Code unmatchedStatusReason) {
		this.unmatchedStatusReason = unmatchedStatusReason;
	}

	public CancelledStatusReason1Code getCancelledStatusReason() {
		return cancelledStatusReason;
	}

	public void setCancelledStatusReason(CancelledStatusReason1Code cancelledStatusReason) {
		this.cancelledStatusReason = cancelledStatusReason;
	}

	public SuspendedStatusReason1Code getSuspendedStatusReason() {
		return suspendedStatusReason;
	}

	public void setSuspendedStatusReason(SuspendedStatusReason1Code suspendedStatusReason) {
		this.suspendedStatusReason = suspendedStatusReason;
	}

	public PendingFailingSettlement1Code getPendingFailingSettlement() {
		return pendingFailingSettlement;
	}

	public void setPendingFailingSettlement(PendingFailingSettlement1Code pendingFailingSettlement) {
		this.pendingFailingSettlement = pendingFailingSettlement;
	}

	public PendingSettlement2Code getPendingSettlement() {
		return pendingSettlement;
	}

	public void setPendingSettlement(PendingSettlement2Code pendingSettlement) {
		this.pendingSettlement = pendingSettlement;
	}

	public ProprietaryStatusJustification getProprietaryRejectionReason() {
		return proprietaryRejectionReason;
	}

	public void setProprietaryRejectionReason(ProprietaryStatusJustification proprietaryRejectionReason) {
		this.proprietaryRejectionReason = proprietaryRejectionReason;
	}
}