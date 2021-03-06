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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.PaymentOrigin1Choice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.entity.Entry;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.PaymentExecution;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PaymentStatus2;
import com.tools20022.repository.msg.System1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Common details for all payment instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCommon2#mmPaymentFrom
 * PaymentCommon2.mmPaymentFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCommon2#mmPaymentTo
 * PaymentCommon2.mmPaymentTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCommon2#mmCommonStatus
 * PaymentCommon2.mmCommonStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCommon2#mmRequestedExecutionDate
 * PaymentCommon2.mmRequestedExecutionDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCommon2#mmEntryDate
 * PaymentCommon2.mmEntryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCommon2#mmCreditDebitIndicator
 * PaymentCommon2.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCommon2#mmPaymentMethod
 * PaymentCommon2.mmPaymentMethod}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentCommon2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Common details for all payment instruction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCommon3 PaymentCommon3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PaymentCommon1
 * PaymentCommon1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentCommon2", propOrder = {"paymentFrom", "paymentTo", "commonStatus", "requestedExecutionDate", "entryDate", "creditDebitIndicator", "paymentMethod"})
public class PaymentCommon2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtFr")
	protected System1 paymentFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.System1 System1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon2 PaymentCommon2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtFr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Origin of the payment (be it a member or a system or both)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon3#mmPaymentFrom
	 * PaymentCommon3.mmPaymentFrom}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon1#mmPaymentFrom
	 * PaymentCommon1.mmPaymentFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentCommon2, Optional<System1>> mmPaymentFrom = new MMMessageAssociationEnd<PaymentCommon2, Optional<System1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCommon2.mmObject();
			isDerived = false;
			xmlTag = "PmtFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFrom";
			definition = "Origin of the payment (be it a member or a system or both).";
			nextVersions_lazy = () -> Arrays.asList(PaymentCommon3.mmPaymentFrom);
			previousVersion_lazy = () -> PaymentCommon1.mmPaymentFrom;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> System1.mmObject();
		}

		@Override
		public Optional<System1> getValue(PaymentCommon2 obj) {
			return obj.getPaymentFrom();
		}

		@Override
		public void setValue(PaymentCommon2 obj, Optional<System1> value) {
			obj.setPaymentFrom(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtTo")
	protected System1 paymentTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.System1 System1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon2 PaymentCommon2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Destination of the payment (be it a member or a system or both)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCommon3#mmPaymentTo
	 * PaymentCommon3.mmPaymentTo}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon1#mmPaymentTo
	 * PaymentCommon1.mmPaymentTo}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentCommon2, Optional<System1>> mmPaymentTo = new MMMessageAssociationEnd<PaymentCommon2, Optional<System1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCommon2.mmObject();
			isDerived = false;
			xmlTag = "PmtTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTo";
			definition = "Destination of the payment (be it a member or a system or both).";
			nextVersions_lazy = () -> Arrays.asList(PaymentCommon3.mmPaymentTo);
			previousVersion_lazy = () -> PaymentCommon1.mmPaymentTo;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> System1.mmObject();
		}

		@Override
		public Optional<System1> getValue(PaymentCommon2 obj) {
			return obj.getPaymentTo();
		}

		@Override
		public void setValue(PaymentCommon2 obj, Optional<System1> value) {
			obj.setPaymentTo(value.orElse(null));
		}
	};
	@XmlElement(name = "CmonSts")
	protected List<PaymentStatus2> commonStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentStatus2
	 * PaymentStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
	 * Payment.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon2 PaymentCommon2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of a transfer.\n."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon3#mmCommonStatus
	 * PaymentCommon3.mmCommonStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon1#mmCommonStatus
	 * PaymentCommon1.mmCommonStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentCommon2, List<PaymentStatus2>> mmCommonStatus = new MMMessageAssociationEnd<PaymentCommon2, List<PaymentStatus2>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCommon2.mmObject();
			isDerived = false;
			xmlTag = "CmonSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonStatus";
			definition = "Status of a transfer.\n.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCommon3.mmCommonStatus);
			previousVersion_lazy = () -> PaymentCommon1.mmCommonStatus;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentStatus2.mmObject();
		}

		@Override
		public List<PaymentStatus2> getValue(PaymentCommon2 obj) {
			return obj.getCommonStatus();
		}

		@Override
		public void setValue(PaymentCommon2 obj, List<PaymentStatus2> value) {
			obj.setCommonStatus(value);
		}
	};
	@XmlElement(name = "ReqdExctnDt")
	protected DateAndDateTimeChoice requestedExecutionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRequestedExecutionDate
	 * PaymentExecution.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon2 PaymentCommon2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdExctnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the cash is at the disposal of the credit account owner, or ceases to be at the disposal of the debit account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon3#mmRequestedExecutionDate
	 * PaymentCommon3.mmRequestedExecutionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon1#mmRequestedExecutionDate
	 * PaymentCommon1.mmRequestedExecutionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCommon2, Optional<DateAndDateTimeChoice>> mmRequestedExecutionDate = new MMMessageAttribute<PaymentCommon2, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmRequestedExecutionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCommon2.mmObject();
			isDerived = false;
			xmlTag = "ReqdExctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date and time at which the cash is at the disposal of the credit account owner, or ceases to be at the disposal of the debit account owner.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCommon3.mmRequestedExecutionDate);
			previousVersion_lazy = () -> PaymentCommon1.mmRequestedExecutionDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(PaymentCommon2 obj) {
			return obj.getRequestedExecutionDate();
		}

		@Override
		public void setValue(PaymentCommon2 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setRequestedExecutionDate(value.orElse(null));
		}
	};
	@XmlElement(name = "NtryDt")
	protected DateAndDateTimeChoice entryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmEntryDate
	 * Entry.mmEntryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon2 PaymentCommon2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which an entry is posted to an account on the account servicer's books."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCommon3#mmEntryDate
	 * PaymentCommon3.mmEntryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon1#mmEntryDate
	 * PaymentCommon1.mmEntryDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCommon2, Optional<DateAndDateTimeChoice>> mmEntryDate = new MMMessageAttribute<PaymentCommon2, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmEntryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCommon2.mmObject();
			isDerived = false;
			xmlTag = "NtryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryDate";
			definition = "Date and time at which an entry is posted to an account on the account servicer's books.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCommon3.mmEntryDate);
			previousVersion_lazy = () -> PaymentCommon1.mmEntryDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(PaymentCommon2 obj) {
			return obj.getEntryDate();
		}

		@Override
		public void setValue(PaymentCommon2 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setEntryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtDbtInd")
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmCreditDebitIndicator
	 * Entry.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon2 PaymentCommon2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the payment instruction is a debit or a credit.\n."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon3#mmCreditDebitIndicator
	 * PaymentCommon3.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon1#mmCreditDebitIndicator
	 * PaymentCommon1.mmCreditDebitIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCommon2, Optional<CreditDebitCode>> mmCreditDebitIndicator = new MMMessageAttribute<PaymentCommon2, Optional<CreditDebitCode>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCommon2.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the payment instruction is a debit or a credit.\n.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCommon3.mmCreditDebitIndicator);
			previousVersion_lazy = () -> PaymentCommon1.mmCreditDebitIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public Optional<CreditDebitCode> getValue(PaymentCommon2 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(PaymentCommon2 obj, Optional<CreditDebitCode> value) {
			obj.setCreditDebitIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtMtd")
	protected PaymentOrigin1Choice paymentMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentOrigin1Choice
	 * PaymentOrigin1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmPayment
	 * PaymentExecution.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon2 PaymentCommon2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMtd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the message or event from which an instruction has been initiated."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon3#mmPaymentMethod
	 * PaymentCommon3.mmPaymentMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon1#mmPaymentMethod
	 * PaymentCommon1.mmPaymentMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentCommon2, Optional<PaymentOrigin1Choice>> mmPaymentMethod = new MMMessageAssociationEnd<PaymentCommon2, Optional<PaymentOrigin1Choice>>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCommon2.mmObject();
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "Indicates the message or event from which an instruction has been initiated.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCommon3.mmPaymentMethod);
			previousVersion_lazy = () -> PaymentCommon1.mmPaymentMethod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentOrigin1Choice.mmObject();
		}

		@Override
		public Optional<PaymentOrigin1Choice> getValue(PaymentCommon2 obj) {
			return obj.getPaymentMethod();
		}

		@Override
		public void setValue(PaymentCommon2 obj, Optional<PaymentOrigin1Choice> value) {
			obj.setPaymentMethod(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCommon2.mmPaymentFrom, com.tools20022.repository.msg.PaymentCommon2.mmPaymentTo, com.tools20022.repository.msg.PaymentCommon2.mmCommonStatus,
						com.tools20022.repository.msg.PaymentCommon2.mmRequestedExecutionDate, com.tools20022.repository.msg.PaymentCommon2.mmEntryDate, com.tools20022.repository.msg.PaymentCommon2.mmCreditDebitIndicator,
						com.tools20022.repository.msg.PaymentCommon2.mmPaymentMethod);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCommon2";
				definition = "Common details for all payment instruction.";
				nextVersions_lazy = () -> Arrays.asList(PaymentCommon3.mmObject());
				previousVersion_lazy = () -> PaymentCommon1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<System1> getPaymentFrom() {
		return paymentFrom == null ? Optional.empty() : Optional.of(paymentFrom);
	}

	public PaymentCommon2 setPaymentFrom(System1 paymentFrom) {
		this.paymentFrom = paymentFrom;
		return this;
	}

	public Optional<System1> getPaymentTo() {
		return paymentTo == null ? Optional.empty() : Optional.of(paymentTo);
	}

	public PaymentCommon2 setPaymentTo(System1 paymentTo) {
		this.paymentTo = paymentTo;
		return this;
	}

	public List<PaymentStatus2> getCommonStatus() {
		return commonStatus == null ? commonStatus = new ArrayList<>() : commonStatus;
	}

	public PaymentCommon2 setCommonStatus(List<PaymentStatus2> commonStatus) {
		this.commonStatus = Objects.requireNonNull(commonStatus);
		return this;
	}

	public Optional<DateAndDateTimeChoice> getRequestedExecutionDate() {
		return requestedExecutionDate == null ? Optional.empty() : Optional.of(requestedExecutionDate);
	}

	public PaymentCommon2 setRequestedExecutionDate(DateAndDateTimeChoice requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getEntryDate() {
		return entryDate == null ? Optional.empty() : Optional.of(entryDate);
	}

	public PaymentCommon2 setEntryDate(DateAndDateTimeChoice entryDate) {
		this.entryDate = entryDate;
		return this;
	}

	public Optional<CreditDebitCode> getCreditDebitIndicator() {
		return creditDebitIndicator == null ? Optional.empty() : Optional.of(creditDebitIndicator);
	}

	public PaymentCommon2 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
		return this;
	}

	public Optional<PaymentOrigin1Choice> getPaymentMethod() {
		return paymentMethod == null ? Optional.empty() : Optional.of(paymentMethod);
	}

	public PaymentCommon2 setPaymentMethod(PaymentOrigin1Choice paymentMethod) {
		this.paymentMethod = paymentMethod;
		return this;
	}
}