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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.choice.RejectedCancellationStatusReason1Choice;
import com.tools20022.repository.codeset.Status2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.SecuritiesTradeStatus;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;

/**
 * Identifies the transaction with a trade reference and provides its status. If
 * the status is rejected, a reason for this status must be given.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2#mmTypeOfStatusRule
 * TradeTransactionStatusAndReason2.mmTypeOfStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2#mmRelatedReference
 * TradeTransactionStatusAndReason2.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2#mmTradeReference
 * TradeTransactionStatusAndReason2.mmTradeReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2#mmStatus
 * TradeTransactionStatusAndReason2.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2#mmRejected
 * TradeTransactionStatusAndReason2.mmRejected}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
 * SecuritiesTradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01#mmIndividualTransactionCancellationStatus
 * RegulatoryTransactionReportCancellationStatusV01.
 * mmIndividualTransactionCancellationStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeTransactionStatusAndReason2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the transaction with a trade reference and provides its status. If the status is rejected, a reason for this status must be given."
 * </li>
 * </ul>
 */
public class TradeTransactionStatusAndReason2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text relatedReference;
	/**
	 * Provides the identification of the
	 * RegulatoryTransactionReportCancellationRequest document that was
	 * previously sent by the reporting institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2
	 * TradeTransactionStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the identification of the RegulatoryTransactionReportCancellationRequest document that was previously sent by the reporting institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRelatedReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeTransactionStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "RltdRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Provides the identification of the RegulatoryTransactionReportCancellationRequest document that was previously sent by the reporting institution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max70Text tradeReference;
	/**
	 * Unique identification assigned to a trade once it is received or matched
	 * by an executing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2
	 * TradeTransactionStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned to a trade once it is received or matched by an executing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmIdentification;
			componentContext_lazy = () -> TradeTransactionStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "TradRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeReference";
			definition = "Unique identification assigned to a trade once it is received or matched by an executing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Status2Code status;
	/**
	 * Indicates the status of an instruction, request or report message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Status2Code
	 * Status2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmInstructionProcessingStatus
	 * Status.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2
	 * TradeTransactionStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the status of an instruction, request or report message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.mmInstructionProcessingStatus;
			componentContext_lazy = () -> TradeTransactionStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Indicates the status of an instruction, request or report message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Status2Code.mmObject();
		}
	};
	protected List<RejectedCancellationStatusReason1Choice> rejected;
	/**
	 * Indicates that the cancellation is rejected and provides a reason why.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectedCancellationStatusReason1Choice
	 * RejectedCancellationStatusReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2
	 * TradeTransactionStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the cancellation is rejected and provides a reason why."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejected = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.mmStatusReason;
			componentContext_lazy = () -> TradeTransactionStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Indicates that the cancellation is rejected and provides a reason why.";
			maxOccurs = 100;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectedCancellationStatusReason1Choice.mmObject();
		}
	};
	/**
	 * Either Status or Rejected must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2#mmStatus
	 * TradeTransactionStatusAndReason2.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2#mmRejected
	 * TradeTransactionStatusAndReason2.mmRejected}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2
	 * TradeTransactionStatusAndReason2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Either Status or Rejected must be present, but not both."</li>
	 * </ul>
	 */
	public static final MMXor mmTypeOfStatusRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfStatusRule";
			definition = "Either Status or Rejected must be present, but not both.";
			messageComponent_lazy = () -> TradeTransactionStatusAndReason2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeTransactionStatusAndReason2.mmStatus, com.tools20022.repository.msg.TradeTransactionStatusAndReason2.mmRejected);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeTransactionStatusAndReason2.mmRelatedReference, com.tools20022.repository.msg.TradeTransactionStatusAndReason2.mmTradeReference,
						com.tools20022.repository.msg.TradeTransactionStatusAndReason2.mmStatus, com.tools20022.repository.msg.TradeTransactionStatusAndReason2.mmRejected);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01.mmIndividualTransactionCancellationStatus);
				trace_lazy = () -> SecuritiesTradeStatus.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TradeTransactionStatusAndReason2";
				definition = "Identifies the transaction with a trade reference and provides its status. If the status is rejected, a reason for this status must be given.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeTransactionStatusAndReason2.mmTypeOfStatusRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(Max35Text relatedReference) {
		this.relatedReference = relatedReference;
	}

	public Max70Text getTradeReference() {
		return tradeReference;
	}

	public void setTradeReference(Max70Text tradeReference) {
		this.tradeReference = tradeReference;
	}

	public Status2Code getStatus() {
		return status;
	}

	public void setStatus(Status2Code status) {
		this.status = status;
	}

	public List<RejectedCancellationStatusReason1Choice> getRejected() {
		return rejected;
	}

	public void setRejected(List<RejectedCancellationStatusReason1Choice> rejected) {
		this.rejected = rejected;
	}
}