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
import com.tools20022.repository.area.camt.DebitAuthorisationRequestV04;
import com.tools20022.repository.choice.CancellationReason14Choice;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.DebitAuthorisation;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation1#mmCancellationReason
 * DebitAuthorisation1.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation1#mmAmountToDebit
 * DebitAuthorisation1.mmAmountToDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation1#mmValueDateToDebit
 * DebitAuthorisation1.mmValueDateToDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation1#mmAdditionalCancellationReasonInformation
 * DebitAuthorisation1.mmAdditionalCancellationReasonInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV04#mmDetail
 * DebitAuthorisationRequestV04.mmDetail}</li>
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
 * "DebitAuthorisation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the reason for requesting a debit authorisation as well as the amount of the requested debit."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DebitAuthorisation2
 * DebitAuthorisation2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DebitAuthorisation1", propOrder = {"cancellationReason", "amountToDebit", "valueDateToDebit", "additionalCancellationReasonInformation"})
public class DebitAuthorisation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CancellationReason14Choice cancellationReason;
	/**
	 * Specifies the reason for the cancellation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancellationReason14Choice
	 * CancellationReason14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmCancellationReason
	 * PaymentStatus.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation1
	 * DebitAuthorisation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for the cancellation request."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation2#mmCancellationReason
	 * DebitAuthorisation2.mmCancellationReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmCancellationReason;
			componentContext_lazy = () -> DebitAuthorisation1.mmObject();
			isDerived = false;
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Specifies the reason for the cancellation request.";
			nextVersions_lazy = () -> Arrays.asList(DebitAuthorisation2.mmCancellationReason);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancellationReason14Choice.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount amountToDebit;
	/**
	 * Amount of money requested for debit authorisation.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation1
	 * DebitAuthorisation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtToDbt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountToDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money requested for debit authorisation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation2#mmAmountToDebit
	 * DebitAuthorisation2.mmAmountToDebit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmountToDebit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DebitAuthorisation.mmAmountToDebit;
			componentContext_lazy = () -> DebitAuthorisation1.mmObject();
			isDerived = false;
			xmlTag = "AmtToDbt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountToDebit";
			definition = "Amount of money requested for debit authorisation.";
			nextVersions_lazy = () -> Arrays.asList(DebitAuthorisation2.mmAmountToDebit);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected ISODate valueDateToDebit;
	/**
	 * Value date for debiting the amount.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation1
	 * DebitAuthorisation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDtToDbt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDateToDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value date for debiting the amount."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation2#mmValueDateToDebit
	 * DebitAuthorisation2.mmValueDateToDebit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueDateToDebit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DebitAuthorisation.mmValueDateToDebit;
			componentContext_lazy = () -> DebitAuthorisation1.mmObject();
			isDerived = false;
			xmlTag = "ValDtToDbt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDateToDebit";
			definition = "Value date for debiting the amount.";
			nextVersions_lazy = () -> Arrays.asList(DebitAuthorisation2.mmValueDateToDebit);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected List<Max105Text> additionalCancellationReasonInformation;
	/**
	 * Further details on the cancellation request reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation1
	 * DebitAuthorisation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlCxlRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalCancellationReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details on the cancellation request reason."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation2#mmAdditionalCancellationReasonInformation
	 * DebitAuthorisation2.mmAdditionalCancellationReasonInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalCancellationReasonInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DebitAuthorisation1.mmObject();
			isDerived = false;
			xmlTag = "AddtlCxlRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalCancellationReasonInformation";
			definition = "Further details on the cancellation request reason.";
			nextVersions_lazy = () -> Arrays.asList(DebitAuthorisation2.mmAdditionalCancellationReasonInformation);
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DebitAuthorisation1.mmCancellationReason, DebitAuthorisation1.mmAmountToDebit, DebitAuthorisation1.mmValueDateToDebit, DebitAuthorisation1.mmAdditionalCancellationReasonInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(DebitAuthorisationRequestV04.mmDetail);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DebitAuthorisation1";
				definition = "Provides the reason for requesting a debit authorisation as well as the amount of the requested debit.";
				nextVersions_lazy = () -> Arrays.asList(DebitAuthorisation2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CxlRsn", required = true)
	public CancellationReason14Choice getCancellationReason() {
		return cancellationReason;
	}

	public void setCancellationReason(CancellationReason14Choice cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	@XmlElement(name = "AmtToDbt")
	public ActiveOrHistoricCurrencyAndAmount getAmountToDebit() {
		return amountToDebit;
	}

	public void setAmountToDebit(ActiveOrHistoricCurrencyAndAmount amountToDebit) {
		this.amountToDebit = amountToDebit;
	}

	@XmlElement(name = "ValDtToDbt")
	public ISODate getValueDateToDebit() {
		return valueDateToDebit;
	}

	public void setValueDateToDebit(ISODate valueDateToDebit) {
		this.valueDateToDebit = valueDateToDebit;
	}

	@XmlElement(name = "AddtlCxlRsnInf")
	public List<Max105Text> getAdditionalCancellationReasonInformation() {
		return additionalCancellationReasonInformation;
	}

	public void setAdditionalCancellationReasonInformation(List<Max105Text> additionalCancellationReasonInformation) {
		this.additionalCancellationReasonInformation = additionalCancellationReasonInformation;
	}
}