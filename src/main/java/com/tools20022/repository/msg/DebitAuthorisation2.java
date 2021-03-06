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
import com.tools20022.repository.area.camt.DebitAuthorisationRequestV05;
import com.tools20022.repository.area.camt.DebitAuthorisationRequestV06;
import com.tools20022.repository.choice.CancellationReason33Choice;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.DebitAuthorisation;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the reason for requesting a debit authorisation as well as the
 * amount of the requested debit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation2#mmCancellationReason
 * DebitAuthorisation2.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation2#mmAmountToDebit
 * DebitAuthorisation2.mmAmountToDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation2#mmValueDateToDebit
 * DebitAuthorisation2.mmValueDateToDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation2#mmAdditionalCancellationReasonInformation
 * DebitAuthorisation2.mmAdditionalCancellationReasonInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV05#mmDetail
 * DebitAuthorisationRequestV05.mmDetail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV06#mmDetail
 * DebitAuthorisationRequestV06.mmDetail}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DebitAuthorisation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the reason for requesting a debit authorisation as well as the amount of the requested debit."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation1
 * DebitAuthorisation1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DebitAuthorisation2", propOrder = {"cancellationReason", "amountToDebit", "valueDateToDebit", "additionalCancellationReasonInformation"})
public class DebitAuthorisation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CxlRsn", required = true)
	protected CancellationReason33Choice cancellationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancellationReason33Choice
	 * CancellationReason33Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmCancellationReason
	 * PaymentStatus.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation2
	 * DebitAuthorisation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for the cancellation request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation1#mmCancellationReason
	 * DebitAuthorisation1.mmCancellationReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DebitAuthorisation2, CancellationReason33Choice> mmCancellationReason = new MMMessageAssociationEnd<DebitAuthorisation2, CancellationReason33Choice>() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.DebitAuthorisation2.mmObject();
			isDerived = false;
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Specifies the reason for the cancellation request.";
			previousVersion_lazy = () -> DebitAuthorisation1.mmCancellationReason;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancellationReason33Choice.mmObject();
		}

		@Override
		public CancellationReason33Choice getValue(DebitAuthorisation2 obj) {
			return obj.getCancellationReason();
		}

		@Override
		public void setValue(DebitAuthorisation2 obj, CancellationReason33Choice value) {
			obj.setCancellationReason(value);
		}
	};
	@XmlElement(name = "AmtToDbt")
	protected ActiveOrHistoricCurrencyAndAmount amountToDebit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmAmountToDebit
	 * DebitAuthorisation.mmAmountToDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation2
	 * DebitAuthorisation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtToDbt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountToDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money requested for debit authorisation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation1#mmAmountToDebit
	 * DebitAuthorisation1.mmAmountToDebit}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DebitAuthorisation2, Optional<ActiveOrHistoricCurrencyAndAmount>> mmAmountToDebit = new MMMessageAttribute<DebitAuthorisation2, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> DebitAuthorisation.mmAmountToDebit;
			componentContext_lazy = () -> com.tools20022.repository.msg.DebitAuthorisation2.mmObject();
			isDerived = false;
			xmlTag = "AmtToDbt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountToDebit";
			definition = "Amount of money requested for debit authorisation.";
			previousVersion_lazy = () -> DebitAuthorisation1.mmAmountToDebit;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(DebitAuthorisation2 obj) {
			return obj.getAmountToDebit();
		}

		@Override
		public void setValue(DebitAuthorisation2 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setAmountToDebit(value.orElse(null));
		}
	};
	@XmlElement(name = "ValDtToDbt")
	protected ISODate valueDateToDebit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmValueDateToDebit
	 * DebitAuthorisation.mmValueDateToDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation2
	 * DebitAuthorisation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDtToDbt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDateToDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value date for debiting the amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation1#mmValueDateToDebit
	 * DebitAuthorisation1.mmValueDateToDebit}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DebitAuthorisation2, Optional<ISODate>> mmValueDateToDebit = new MMMessageAttribute<DebitAuthorisation2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> DebitAuthorisation.mmValueDateToDebit;
			componentContext_lazy = () -> com.tools20022.repository.msg.DebitAuthorisation2.mmObject();
			isDerived = false;
			xmlTag = "ValDtToDbt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDateToDebit";
			definition = "Value date for debiting the amount.";
			previousVersion_lazy = () -> DebitAuthorisation1.mmValueDateToDebit;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(DebitAuthorisation2 obj) {
			return obj.getValueDateToDebit();
		}

		@Override
		public void setValue(DebitAuthorisation2 obj, Optional<ISODate> value) {
			obj.setValueDateToDebit(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlCxlRsnInf")
	protected List<Max105Text> additionalCancellationReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation2
	 * DebitAuthorisation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlCxlRsnInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalCancellationReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details on the cancellation request reason."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation1#mmAdditionalCancellationReasonInformation
	 * DebitAuthorisation1.mmAdditionalCancellationReasonInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DebitAuthorisation2, List<Max105Text>> mmAdditionalCancellationReasonInformation = new MMMessageAttribute<DebitAuthorisation2, List<Max105Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DebitAuthorisation2.mmObject();
			isDerived = false;
			xmlTag = "AddtlCxlRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalCancellationReasonInformation";
			definition = "Further details on the cancellation request reason.";
			previousVersion_lazy = () -> DebitAuthorisation1.mmAdditionalCancellationReasonInformation;
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		@Override
		public List<Max105Text> getValue(DebitAuthorisation2 obj) {
			return obj.getAdditionalCancellationReasonInformation();
		}

		@Override
		public void setValue(DebitAuthorisation2 obj, List<Max105Text> value) {
			obj.setAdditionalCancellationReasonInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DebitAuthorisation2.mmCancellationReason, com.tools20022.repository.msg.DebitAuthorisation2.mmAmountToDebit,
						com.tools20022.repository.msg.DebitAuthorisation2.mmValueDateToDebit, com.tools20022.repository.msg.DebitAuthorisation2.mmAdditionalCancellationReasonInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(DebitAuthorisationRequestV05.mmDetail, DebitAuthorisationRequestV06.mmDetail);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DebitAuthorisation2";
				definition = "Provides the reason for requesting a debit authorisation as well as the amount of the requested debit.";
				previousVersion_lazy = () -> DebitAuthorisation1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CancellationReason33Choice getCancellationReason() {
		return cancellationReason;
	}

	public DebitAuthorisation2 setCancellationReason(CancellationReason33Choice cancellationReason) {
		this.cancellationReason = Objects.requireNonNull(cancellationReason);
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getAmountToDebit() {
		return amountToDebit == null ? Optional.empty() : Optional.of(amountToDebit);
	}

	public DebitAuthorisation2 setAmountToDebit(ActiveOrHistoricCurrencyAndAmount amountToDebit) {
		this.amountToDebit = amountToDebit;
		return this;
	}

	public Optional<ISODate> getValueDateToDebit() {
		return valueDateToDebit == null ? Optional.empty() : Optional.of(valueDateToDebit);
	}

	public DebitAuthorisation2 setValueDateToDebit(ISODate valueDateToDebit) {
		this.valueDateToDebit = valueDateToDebit;
		return this;
	}

	public List<Max105Text> getAdditionalCancellationReasonInformation() {
		return additionalCancellationReasonInformation == null ? additionalCancellationReasonInformation = new ArrayList<>() : additionalCancellationReasonInformation;
	}

	public DebitAuthorisation2 setAdditionalCancellationReasonInformation(List<Max105Text> additionalCancellationReasonInformation) {
		this.additionalCancellationReasonInformation = Objects.requireNonNull(additionalCancellationReasonInformation);
		return this;
	}
}