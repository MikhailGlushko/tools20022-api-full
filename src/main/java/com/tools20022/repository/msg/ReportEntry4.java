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
import com.tools20022.repository.choice.TechnicalInputChannel1Choice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.EntryStatus2Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details on an entry in the report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#mmEntryReference
 * ReportEntry4.mmEntryReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#mmAmount
 * ReportEntry4.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportEntry4#mmCreditDebitIndicator
 * ReportEntry4.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportEntry4#mmReversalIndicator
 * ReportEntry4.mmReversalIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#mmStatus
 * ReportEntry4.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#mmBookingDate
 * ReportEntry4.mmBookingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#mmValueDate
 * ReportEntry4.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportEntry4#mmAccountServicerReference
 * ReportEntry4.mmAccountServicerReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#mmAvailability
 * ReportEntry4.mmAvailability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportEntry4#mmBankTransactionCode
 * ReportEntry4.mmBankTransactionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportEntry4#mmCommissionWaiverIndicator
 * ReportEntry4.mmCommissionWaiverIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportEntry4#mmAdditionalInformationIndicator
 * ReportEntry4.mmAdditionalInformationIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#mmAmountDetails
 * ReportEntry4.mmAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#mmCharges
 * ReportEntry4.mmCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportEntry4#mmTechnicalInputChannel
 * ReportEntry4.mmTechnicalInputChannel}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#mmInterest
 * ReportEntry4.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#mmCardTransaction
 * ReportEntry4.mmCardTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#mmEntryDetails
 * ReportEntry4.mmEntryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportEntry4#mmAdditionalEntryInformation
 * ReportEntry4.mmAdditionalEntryInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReportEntry4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides further details on an entry in the report."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReferenceGuideline#forReportEntry4
 * ConstraintReferenceGuideline.forReportEntry4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7 ReportEntry7}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ReportEntry3
 * ReportEntry3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReportEntry4", propOrder = {"entryReference", "amount", "creditDebitIndicator", "reversalIndicator", "status", "bookingDate", "valueDate", "accountServicerReference", "availability", "bankTransactionCode",
		"commissionWaiverIndicator", "additionalInformationIndicator", "amountDetails", "charges", "technicalInputChannel", "interest", "cardTransaction", "entryDetails", "additionalEntryInformation"})
public class ReportEntry4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NtryRef")
	protected Max35Text entryReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmIdentification
	 * Entry.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique reference for the entry."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmEntryReference
	 * ReportEntry7.mmEntryReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportEntry4, Optional<Max35Text>> mmEntryReference = new MMMessageAttribute<ReportEntry4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportEntry4.mmObject();
			isDerived = false;
			xmlTag = "NtryRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryReference";
			definition = "Unique reference for the entry.";
			nextVersions_lazy = () -> Arrays.asList(ReportEntry7.mmEntryReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ReportEntry4 obj) {
			return obj.getEntryReference();
		}

		@Override
		public void setValue(ReportEntry4 obj, Optional<Max35Text> value) {
			obj.setEntryReference(value.orElse(null));
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected ActiveOrHistoricCurrencyAndAmount amount;
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
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAmount
	 * CashEntry.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money in the cash entry."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#mmAmount
	 * ReportEntry7.mmAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportEntry4, ActiveOrHistoricCurrencyAndAmount> mmAmount = new MMMessageAttribute<ReportEntry4, ActiveOrHistoricCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportEntry4.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money in the cash entry.";
			nextVersions_lazy = () -> Arrays.asList(ReportEntry7.mmAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(ReportEntry4 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(ReportEntry4 obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "CdtDbtInd", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the entry is a credit or a debit entry."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmCreditDebitIndicator
	 * ReportEntry7.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportEntry4, CreditDebitCode> mmCreditDebitIndicator = new MMMessageAttribute<ReportEntry4, CreditDebitCode>() {
		{
			businessElementTrace_lazy = () -> Entry.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportEntry4.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the entry is a credit or a debit entry.";
			nextVersions_lazy = () -> Arrays.asList(ReportEntry7.mmCreditDebitIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public CreditDebitCode getValue(ReportEntry4 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(ReportEntry4 obj, CreditDebitCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	@XmlElement(name = "RvslInd")
	protected TrueFalseIndicator reversalIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmReversalIndicator
	 * Entry.mmReversalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not the entry is the result of a reversal.\nUsage: This element should only be present if the entry is the result of a reversal.\nIf the CreditDebitIndicator is CRDT and ReversalIndicator is Yes, the original operation was a debit entry.\nIf the CreditDebitIndicator is DBIT and ReversalIndicator is Yes, the original operation was a credit entry."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmReversalIndicator
	 * ReportEntry7.mmReversalIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportEntry4, Optional<TrueFalseIndicator>> mmReversalIndicator = new MMMessageAttribute<ReportEntry4, Optional<TrueFalseIndicator>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmReversalIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportEntry4.mmObject();
			isDerived = false;
			xmlTag = "RvslInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalIndicator";
			definition = "Indicates whether or not the entry is the result of a reversal.\nUsage: This element should only be present if the entry is the result of a reversal.\nIf the CreditDebitIndicator is CRDT and ReversalIndicator is Yes, the original operation was a debit entry.\nIf the CreditDebitIndicator is DBIT and ReversalIndicator is Yes, the original operation was a credit entry.";
			nextVersions_lazy = () -> Arrays.asList(ReportEntry7.mmReversalIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(ReportEntry4 obj) {
			return obj.getReversalIndicator();
		}

		@Override
		public void setValue(ReportEntry4 obj, Optional<TrueFalseIndicator> value) {
			obj.setReversalIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected EntryStatus2Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EntryStatus2Code
	 * EntryStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus#mmEntryStatus
	 * AccountStatus.mmEntryStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of an entry on the books of the account servicer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#mmStatus
	 * ReportEntry7.mmStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportEntry4, EntryStatus2Code> mmStatus = new MMMessageAttribute<ReportEntry4, EntryStatus2Code>() {
		{
			businessElementTrace_lazy = () -> AccountStatus.mmEntryStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportEntry4.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of an entry on the books of the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(ReportEntry7.mmStatus);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EntryStatus2Code.mmObject();
		}

		@Override
		public EntryStatus2Code getValue(ReportEntry4 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(ReportEntry4 obj, EntryStatus2Code value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "BookgDt")
	protected DateAndDateTimeChoice bookingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BookgDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time when an entry is posted to an account on the account servicer's books.\n\nUsage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#mmBookingDate
	 * ReportEntry7.mmBookingDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry4, Optional<DateAndDateTimeChoice>> mmBookingDate = new MMMessageAssociationEnd<ReportEntry4, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmEntryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportEntry4.mmObject();
			isDerived = false;
			xmlTag = "BookgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookingDate";
			definition = "Date and time when an entry is posted to an account on the account servicer's books.\n\nUsage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date.";
			nextVersions_lazy = () -> Arrays.asList(ReportEntry7.mmBookingDate);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(ReportEntry4 obj) {
			return obj.getBookingDate();
		}

		@Override
		public void setValue(ReportEntry4 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setBookingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ValDt")
	protected DateAndDateTimeChoice valueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmValueDate
	 * Entry.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit entry.\nUsage: If entry status is pending and value date is present, then the value date refers to an expected/requested value date.\nFor entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#mmValueDate
	 * ReportEntry7.mmValueDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry4, Optional<DateAndDateTimeChoice>> mmValueDate = new MMMessageAssociationEnd<ReportEntry4, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportEntry4.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit entry.\nUsage: If entry status is pending and value date is present, then the value date refers to an expected/requested value date.\nFor entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days.";
			nextVersions_lazy = () -> Arrays.asList(ReportEntry7.mmValueDate);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(ReportEntry4 obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(ReportEntry4 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setValueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcrRef")
	protected Max35Text accountServicerReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmAccountServicerTransactionIdentification
	 * Entry.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference as assigned by the account servicing institution to unambiguously identify the entry."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmAccountServicerReference
	 * ReportEntry7.mmAccountServicerReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportEntry4, Optional<Max35Text>> mmAccountServicerReference = new MMMessageAttribute<ReportEntry4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmAccountServicerTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportEntry4.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerReference";
			definition = "Unique reference as assigned by the account servicing institution to unambiguously identify the entry.";
			nextVersions_lazy = () -> Arrays.asList(ReportEntry7.mmAccountServicerReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ReportEntry4 obj) {
			return obj.getAccountServicerReference();
		}

		@Override
		public void setValue(ReportEntry4 obj, Optional<Max35Text> value) {
			obj.setAccountServicerReference(value.orElse(null));
		}
	};
	@XmlElement(name = "Avlbty")
	protected List<CashBalanceAvailability2> availability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailability2
	 * CashBalanceAvailability2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmAvailability
	 * CashBalance.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Avlbty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Availability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates when the booked amount of money will become available, that is can be accessed and starts generating interest. \n\nUsage: This type of information is used in the US and is linked to particular instruments such as cheques.\nExample: When a cheque is deposited, it will be booked on the deposit day, but the amount of money will only be accessible as of the indicated availability day (according to national banking regulations)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmAvailability
	 * ReportEntry7.mmAvailability}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry4, List<CashBalanceAvailability2>> mmAvailability = new MMMessageAssociationEnd<ReportEntry4, List<CashBalanceAvailability2>>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmAvailability;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportEntry4.mmObject();
			isDerived = false;
			xmlTag = "Avlbty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Availability";
			definition = "Indicates when the booked amount of money will become available, that is can be accessed and starts generating interest. \n\nUsage: This type of information is used in the US and is linked to particular instruments such as cheques.\nExample: When a cheque is deposited, it will be booked on the deposit day, but the amount of money will only be accessible as of the indicated availability day (according to national banking regulations).";
			nextVersions_lazy = () -> Arrays.asList(ReportEntry7.mmAvailability);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashBalanceAvailability2.mmObject();
		}

		@Override
		public List<CashBalanceAvailability2> getValue(ReportEntry4 obj) {
			return obj.getAvailability();
		}

		@Override
		public void setValue(ReportEntry4 obj, List<CashBalanceAvailability2> value) {
			obj.setAvailability(value);
		}
	};
	@XmlElement(name = "BkTxCd", required = true)
	protected BankTransactionCodeStructure4 bankTransactionCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure4
	 * BankTransactionCodeStructure4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmBankTransactionCode
	 * Entry.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkTxCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankTransactionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to fully identify the type of underlying transaction resulting in an entry."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmBankTransactionCode
	 * ReportEntry7.mmBankTransactionCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry4, BankTransactionCodeStructure4> mmBankTransactionCode = new MMMessageAssociationEnd<ReportEntry4, BankTransactionCodeStructure4>() {
		{
			businessElementTrace_lazy = () -> Entry.mmBankTransactionCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportEntry4.mmObject();
			isDerived = false;
			xmlTag = "BkTxCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankTransactionCode";
			definition = "Set of elements used to fully identify the type of underlying transaction resulting in an entry.";
			nextVersions_lazy = () -> Arrays.asList(ReportEntry7.mmBankTransactionCode);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BankTransactionCodeStructure4.mmObject();
		}

		@Override
		public BankTransactionCodeStructure4 getValue(ReportEntry4 obj) {
			return obj.getBankTransactionCode();
		}

		@Override
		public void setValue(ReportEntry4 obj, BankTransactionCodeStructure4 value) {
			obj.setBankTransactionCode(value);
		}
	};
	@XmlElement(name = "ComssnWvrInd")
	protected YesNoIndicator commissionWaiverIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmCommissionWaiverIndicator
	 * Entry.mmCommissionWaiverIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnWvrInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionWaiverIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction is exempt from commission."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmCommissionWaiverIndicator
	 * ReportEntry7.mmCommissionWaiverIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportEntry4, Optional<YesNoIndicator>> mmCommissionWaiverIndicator = new MMMessageAttribute<ReportEntry4, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmCommissionWaiverIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportEntry4.mmObject();
			isDerived = false;
			xmlTag = "ComssnWvrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionWaiverIndicator";
			definition = "Indicates whether the transaction is exempt from commission.";
			nextVersions_lazy = () -> Arrays.asList(ReportEntry7.mmCommissionWaiverIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(ReportEntry4 obj) {
			return obj.getCommissionWaiverIndicator();
		}

		@Override
		public void setValue(ReportEntry4 obj, Optional<YesNoIndicator> value) {
			obj.setCommissionWaiverIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInfInd")
	protected MessageIdentification2 additionalInformationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification2
	 * MessageIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInfInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the underlying transaction details are provided through a separate message, as in the case of aggregate bookings."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmAdditionalInformationIndicator
	 * ReportEntry7.mmAdditionalInformationIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry4, Optional<MessageIdentification2>> mmAdditionalInformationIndicator = new MMMessageAssociationEnd<ReportEntry4, Optional<MessageIdentification2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportEntry4.mmObject();
			isDerived = false;
			xmlTag = "AddtlInfInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationIndicator";
			definition = "Indicates whether the underlying transaction details are provided through a separate message, as in the case of aggregate bookings.";
			nextVersions_lazy = () -> Arrays.asList(ReportEntry7.mmAdditionalInformationIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MessageIdentification2.mmObject();
		}

		@Override
		public Optional<MessageIdentification2> getValue(ReportEntry4 obj) {
			return obj.getAdditionalInformationIndicator();
		}

		@Override
		public void setValue(ReportEntry4 obj, Optional<MessageIdentification2> value) {
			obj.setAdditionalInformationIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AmtDtls")
	protected AmountAndCurrencyExchange3 amountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3
	 * AmountAndCurrencyExchange3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAmount
	 * CashEntry.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the original amount.\n\nUsage: This component (on entry level) should be used when a total original batch or aggregate amount has to be provided. If required, the individual original amounts can be included in the same component on transaction details level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmAmountDetails
	 * ReportEntry7.mmAmountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry4, Optional<AmountAndCurrencyExchange3>> mmAmountDetails = new MMMessageAssociationEnd<ReportEntry4, Optional<AmountAndCurrencyExchange3>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportEntry4.mmObject();
			isDerived = false;
			xmlTag = "AmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountDetails";
			definition = "Provides information on the original amount.\n\nUsage: This component (on entry level) should be used when a total original batch or aggregate amount has to be provided. If required, the individual original amounts can be included in the same component on transaction details level.";
			nextVersions_lazy = () -> Arrays.asList(ReportEntry7.mmAmountDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndCurrencyExchange3.mmObject();
		}

		@Override
		public Optional<AmountAndCurrencyExchange3> getValue(ReportEntry4 obj) {
			return obj.getAmountDetails();
		}

		@Override
		public void setValue(ReportEntry4 obj, Optional<AmountAndCurrencyExchange3> value) {
			obj.setAmountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "Chrgs")
	protected Charges4 charges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charges4 Charges4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCharges
	 * CashEntry.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Chrgs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the charges, pre-advised or included in the entry amount.\r\n\r\nUsage: This component is used on entry level in case of batch or aggregate bookings.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#mmCharges
	 * ReportEntry7.mmCharges}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry4, Optional<Charges4>> mmCharges = new MMMessageAssociationEnd<ReportEntry4, Optional<Charges4>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCharges;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportEntry4.mmObject();
			isDerived = false;
			xmlTag = "Chrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charges";
			definition = "Provides information on the charges, pre-advised or included in the entry amount.\r\n\r\nUsage: This component is used on entry level in case of batch or aggregate bookings.\r\n";
			nextVersions_lazy = () -> Arrays.asList(ReportEntry7.mmCharges);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Charges4.mmObject();
		}

		@Override
		public Optional<Charges4> getValue(ReportEntry4 obj) {
			return obj.getCharges();
		}

		@Override
		public void setValue(ReportEntry4 obj, Optional<Charges4> value) {
			obj.setCharges(value.orElse(null));
		}
	};
	@XmlElement(name = "TechInptChanl")
	protected TechnicalInputChannel1Choice technicalInputChannel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TechnicalInputChannel1Choice
	 * TechnicalInputChannel1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TechInptChanl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalInputChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Channel used to technically input the instruction related to the entry."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmTechnicalInputChannel
	 * ReportEntry7.mmTechnicalInputChannel}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry4, Optional<TechnicalInputChannel1Choice>> mmTechnicalInputChannel = new MMMessageAssociationEnd<ReportEntry4, Optional<TechnicalInputChannel1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportEntry4.mmObject();
			isDerived = false;
			xmlTag = "TechInptChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalInputChannel";
			definition = "Channel used to technically input the instruction related to the entry.";
			nextVersions_lazy = () -> Arrays.asList(ReportEntry7.mmTechnicalInputChannel);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TechnicalInputChannel1Choice.mmObject();
		}

		@Override
		public Optional<TechnicalInputChannel1Choice> getValue(ReportEntry4 obj) {
			return obj.getTechnicalInputChannel();
		}

		@Override
		public void setValue(ReportEntry4 obj, Optional<TechnicalInputChannel1Choice> value) {
			obj.setTechnicalInputChannel(value.orElse(null));
		}
	};
	@XmlElement(name = "Intrst")
	protected TransactionInterest3 interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionInterest3
	 * TransactionInterest3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
	 * Interest.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details of the interest amount included in the entry amount.\n\nUsage: This component is used on entry level in the case of batch or aggregate bookings."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#mmInterest
	 * ReportEntry7.mmInterest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry4, Optional<TransactionInterest3>> mmInterest = new MMMessageAssociationEnd<ReportEntry4, Optional<TransactionInterest3>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestCalculation;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportEntry4.mmObject();
			isDerived = false;
			xmlTag = "Intrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Provides details of the interest amount included in the entry amount.\n\nUsage: This component is used on entry level in the case of batch or aggregate bookings.";
			nextVersions_lazy = () -> Arrays.asList(ReportEntry7.mmInterest);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionInterest3.mmObject();
		}

		@Override
		public Optional<TransactionInterest3> getValue(ReportEntry4 obj) {
			return obj.getInterest();
		}

		@Override
		public void setValue(ReportEntry4 obj, Optional<TransactionInterest3> value) {
			obj.setInterest(value.orElse(null));
		}
	};
	@XmlElement(name = "CardTx")
	protected CardEntry1 cardTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardEntry1 CardEntry1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardTx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details of the card transaction included in the entry amount, when globalised by the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmCardTransaction
	 * ReportEntry7.mmCardTransaction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry4, Optional<CardEntry1>> mmCardTransaction = new MMMessageAssociationEnd<ReportEntry4, Optional<CardEntry1>>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportEntry4.mmObject();
			isDerived = false;
			xmlTag = "CardTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardTransaction";
			definition = "Provides details of the card transaction included in the entry amount, when globalised by the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(ReportEntry7.mmCardTransaction);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardEntry1.mmObject();
		}

		@Override
		public Optional<CardEntry1> getValue(ReportEntry4 obj) {
			return obj.getCardTransaction();
		}

		@Override
		public void setValue(ReportEntry4 obj, Optional<CardEntry1> value) {
			obj.setCardTransaction(value.orElse(null));
		}
	};
	@XmlElement(name = "NtryDtls")
	protected List<EntryDetails3> entryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EntryDetails3
	 * EntryDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the entry."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmEntryDetails
	 * ReportEntry7.mmEntryDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry4, List<EntryDetails3>> mmEntryDetails = new MMMessageAssociationEnd<ReportEntry4, List<EntryDetails3>>() {
		{
			businessComponentTrace_lazy = () -> CashEntry.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportEntry4.mmObject();
			isDerived = false;
			xmlTag = "NtryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryDetails";
			definition = "Provides details on the entry.";
			nextVersions_lazy = () -> Arrays.asList(ReportEntry7.mmEntryDetails);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> EntryDetails3.mmObject();
		}

		@Override
		public List<EntryDetails3> getValue(ReportEntry4 obj) {
			return obj.getEntryDetails();
		}

		@Override
		public void setValue(ReportEntry4 obj, List<EntryDetails3> value) {
			obj.setEntryDetails(value);
		}
	};
	@XmlElement(name = "AddtlNtryInf")
	protected Max500Text additionalEntryInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlNtryInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalEntryInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details of the entry."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmAdditionalEntryInformation
	 * ReportEntry7.mmAdditionalEntryInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportEntry4, Optional<Max500Text>> mmAdditionalEntryInformation = new MMMessageAttribute<ReportEntry4, Optional<Max500Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportEntry4.mmObject();
			isDerived = false;
			xmlTag = "AddtlNtryInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalEntryInformation";
			definition = "Further details of the entry.";
			nextVersions_lazy = () -> Arrays.asList(ReportEntry7.mmAdditionalEntryInformation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}

		@Override
		public Optional<Max500Text> getValue(ReportEntry4 obj) {
			return obj.getAdditionalEntryInformation();
		}

		@Override
		public void setValue(ReportEntry4 obj, Optional<Max500Text> value) {
			obj.setAdditionalEntryInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportEntry4.mmEntryReference, com.tools20022.repository.msg.ReportEntry4.mmAmount, com.tools20022.repository.msg.ReportEntry4.mmCreditDebitIndicator,
						com.tools20022.repository.msg.ReportEntry4.mmReversalIndicator, com.tools20022.repository.msg.ReportEntry4.mmStatus, com.tools20022.repository.msg.ReportEntry4.mmBookingDate,
						com.tools20022.repository.msg.ReportEntry4.mmValueDate, com.tools20022.repository.msg.ReportEntry4.mmAccountServicerReference, com.tools20022.repository.msg.ReportEntry4.mmAvailability,
						com.tools20022.repository.msg.ReportEntry4.mmBankTransactionCode, com.tools20022.repository.msg.ReportEntry4.mmCommissionWaiverIndicator, com.tools20022.repository.msg.ReportEntry4.mmAdditionalInformationIndicator,
						com.tools20022.repository.msg.ReportEntry4.mmAmountDetails, com.tools20022.repository.msg.ReportEntry4.mmCharges, com.tools20022.repository.msg.ReportEntry4.mmTechnicalInputChannel,
						com.tools20022.repository.msg.ReportEntry4.mmInterest, com.tools20022.repository.msg.ReportEntry4.mmCardTransaction, com.tools20022.repository.msg.ReportEntry4.mmEntryDetails,
						com.tools20022.repository.msg.ReportEntry4.mmAdditionalEntryInformation);
				trace_lazy = () -> CashEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReferenceGuideline.forReportEntry4);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportEntry4";
				definition = "Provides further details on an entry in the report.";
				nextVersions_lazy = () -> Arrays.asList(ReportEntry7.mmObject());
				previousVersion_lazy = () -> ReportEntry3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getEntryReference() {
		return entryReference == null ? Optional.empty() : Optional.of(entryReference);
	}

	public ReportEntry4 setEntryReference(Max35Text entryReference) {
		this.entryReference = entryReference;
		return this;
	}

	public ActiveOrHistoricCurrencyAndAmount getAmount() {
		return amount;
	}

	public ReportEntry4 setAmount(ActiveOrHistoricCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public ReportEntry4 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public Optional<TrueFalseIndicator> getReversalIndicator() {
		return reversalIndicator == null ? Optional.empty() : Optional.of(reversalIndicator);
	}

	public ReportEntry4 setReversalIndicator(TrueFalseIndicator reversalIndicator) {
		this.reversalIndicator = reversalIndicator;
		return this;
	}

	public EntryStatus2Code getStatus() {
		return status;
	}

	public ReportEntry4 setStatus(EntryStatus2Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Optional<DateAndDateTimeChoice> getBookingDate() {
		return bookingDate == null ? Optional.empty() : Optional.of(bookingDate);
	}

	public ReportEntry4 setBookingDate(DateAndDateTimeChoice bookingDate) {
		this.bookingDate = bookingDate;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getValueDate() {
		return valueDate == null ? Optional.empty() : Optional.of(valueDate);
	}

	public ReportEntry4 setValueDate(DateAndDateTimeChoice valueDate) {
		this.valueDate = valueDate;
		return this;
	}

	public Optional<Max35Text> getAccountServicerReference() {
		return accountServicerReference == null ? Optional.empty() : Optional.of(accountServicerReference);
	}

	public ReportEntry4 setAccountServicerReference(Max35Text accountServicerReference) {
		this.accountServicerReference = accountServicerReference;
		return this;
	}

	public List<CashBalanceAvailability2> getAvailability() {
		return availability == null ? availability = new ArrayList<>() : availability;
	}

	public ReportEntry4 setAvailability(List<CashBalanceAvailability2> availability) {
		this.availability = Objects.requireNonNull(availability);
		return this;
	}

	public BankTransactionCodeStructure4 getBankTransactionCode() {
		return bankTransactionCode;
	}

	public ReportEntry4 setBankTransactionCode(BankTransactionCodeStructure4 bankTransactionCode) {
		this.bankTransactionCode = Objects.requireNonNull(bankTransactionCode);
		return this;
	}

	public Optional<YesNoIndicator> getCommissionWaiverIndicator() {
		return commissionWaiverIndicator == null ? Optional.empty() : Optional.of(commissionWaiverIndicator);
	}

	public ReportEntry4 setCommissionWaiverIndicator(YesNoIndicator commissionWaiverIndicator) {
		this.commissionWaiverIndicator = commissionWaiverIndicator;
		return this;
	}

	public Optional<MessageIdentification2> getAdditionalInformationIndicator() {
		return additionalInformationIndicator == null ? Optional.empty() : Optional.of(additionalInformationIndicator);
	}

	public ReportEntry4 setAdditionalInformationIndicator(MessageIdentification2 additionalInformationIndicator) {
		this.additionalInformationIndicator = additionalInformationIndicator;
		return this;
	}

	public Optional<AmountAndCurrencyExchange3> getAmountDetails() {
		return amountDetails == null ? Optional.empty() : Optional.of(amountDetails);
	}

	public ReportEntry4 setAmountDetails(AmountAndCurrencyExchange3 amountDetails) {
		this.amountDetails = amountDetails;
		return this;
	}

	public Optional<Charges4> getCharges() {
		return charges == null ? Optional.empty() : Optional.of(charges);
	}

	public ReportEntry4 setCharges(Charges4 charges) {
		this.charges = charges;
		return this;
	}

	public Optional<TechnicalInputChannel1Choice> getTechnicalInputChannel() {
		return technicalInputChannel == null ? Optional.empty() : Optional.of(technicalInputChannel);
	}

	public ReportEntry4 setTechnicalInputChannel(TechnicalInputChannel1Choice technicalInputChannel) {
		this.technicalInputChannel = technicalInputChannel;
		return this;
	}

	public Optional<TransactionInterest3> getInterest() {
		return interest == null ? Optional.empty() : Optional.of(interest);
	}

	public ReportEntry4 setInterest(TransactionInterest3 interest) {
		this.interest = interest;
		return this;
	}

	public Optional<CardEntry1> getCardTransaction() {
		return cardTransaction == null ? Optional.empty() : Optional.of(cardTransaction);
	}

	public ReportEntry4 setCardTransaction(CardEntry1 cardTransaction) {
		this.cardTransaction = cardTransaction;
		return this;
	}

	public List<EntryDetails3> getEntryDetails() {
		return entryDetails == null ? entryDetails = new ArrayList<>() : entryDetails;
	}

	public ReportEntry4 setEntryDetails(List<EntryDetails3> entryDetails) {
		this.entryDetails = Objects.requireNonNull(entryDetails);
		return this;
	}

	public Optional<Max500Text> getAdditionalEntryInformation() {
		return additionalEntryInformation == null ? Optional.empty() : Optional.of(additionalEntryInformation);
	}

	public ReportEntry4 setAdditionalEntryInformation(Max500Text additionalEntryInformation) {
		this.additionalEntryInformation = additionalEntryInformation;
		return this;
	}
}