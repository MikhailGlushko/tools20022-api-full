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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.TechnicalInputChannel1Choice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.EntryStatus2Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CashEntry;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Provides further details on an entry in the report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#mmEntryReference
 * ReportEntry3.mmEntryReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#mmAmount
 * ReportEntry3.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportEntry3#mmCreditDebitIndicator
 * ReportEntry3.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportEntry3#mmReversalIndicator
 * ReportEntry3.mmReversalIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#mmStatus
 * ReportEntry3.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#mmBookingDate
 * ReportEntry3.mmBookingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#mmValueDate
 * ReportEntry3.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportEntry3#mmAccountServicerReference
 * ReportEntry3.mmAccountServicerReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#mmAvailability
 * ReportEntry3.mmAvailability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportEntry3#mmBankTransactionCode
 * ReportEntry3.mmBankTransactionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportEntry3#mmCommissionWaiverIndicator
 * ReportEntry3.mmCommissionWaiverIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportEntry3#mmAdditionalInformationIndicator
 * ReportEntry3.mmAdditionalInformationIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#mmAmountDetails
 * ReportEntry3.mmAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#mmCharges
 * ReportEntry3.mmCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportEntry3#mmTechnicalInputChannel
 * ReportEntry3.mmTechnicalInputChannel}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#mmInterest
 * ReportEntry3.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#mmCardTransaction
 * ReportEntry3.mmCardTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#mmEntryDetails
 * ReportEntry3.mmEntryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportEntry3#mmAdditionalEntryInformation
 * ReportEntry3.mmAdditionalEntryInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
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
 * "ReportEntry3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides further details on an entry in the report."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4 ReportEntry4}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class ReportEntry3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text entryReference;
	/**
	 * Unique reference for the entry.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique reference for the entry."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntryReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Entry.mmIdentification;
			componentContext_lazy = () -> ReportEntry3.mmObject();
			isDerived = false;
			xmlTag = "NtryRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryReference";
			definition = "Unique reference for the entry.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount amount;
	/**
	 * Amount of money in the cash entry.
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
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAmount
	 * CashEntry.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money in the cash entry."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashEntry.mmAmount;
			componentContext_lazy = () -> ReportEntry3.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money in the cash entry.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * Indicates whether the entry is a credit or a debit entry.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the entry is a credit or a debit entry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditDebitIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Entry.mmCreditDebitIndicator;
			componentContext_lazy = () -> ReportEntry3.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the entry is a credit or a debit entry.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}
	};
	protected TrueFalseIndicator reversalIndicator;
	/**
	 * Indicates whether or not the entry is the result of a reversal. Usage:
	 * This element should only be present if the entry is the result of a
	 * reversal. If the CreditDebitIndicator is CRDT and ReversalIndicator is
	 * Yes, the original operation was a debit entry. If the
	 * CreditDebitIndicator is DBIT and ReversalIndicator is Yes, the original
	 * operation was a credit entry.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not the entry is the result of a reversal.\nUsage: This element should only be present if the entry is the result of a reversal.\nIf the CreditDebitIndicator is CRDT and ReversalIndicator is Yes, the original operation was a debit entry.\nIf the CreditDebitIndicator is DBIT and ReversalIndicator is Yes, the original operation was a credit entry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReversalIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Entry.mmReversalIndicator;
			componentContext_lazy = () -> ReportEntry3.mmObject();
			isDerived = false;
			xmlTag = "RvslInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalIndicator";
			definition = "Indicates whether or not the entry is the result of a reversal.\nUsage: This element should only be present if the entry is the result of a reversal.\nIf the CreditDebitIndicator is CRDT and ReversalIndicator is Yes, the original operation was a debit entry.\nIf the CreditDebitIndicator is DBIT and ReversalIndicator is Yes, the original operation was a credit entry.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected EntryStatus2Code status;
	/**
	 * Status of an entry on the books of the account servicer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
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
	 * definition} = "Status of an entry on the books of the account servicer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AccountStatus.mmEntryStatus;
			componentContext_lazy = () -> ReportEntry3.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of an entry on the books of the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EntryStatus2Code.mmObject();
		}
	};
	protected DateAndDateTimeChoice bookingDate;
	/**
	 * Date and time when an entry is posted to an account on the account
	 * servicer's books.
	 * 
	 * Usage: Booking date is the expected booking date, unless the status is
	 * booked, in which case it is the actual booking date.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BookgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time when an entry is posted to an account on the account servicer's books.\n\nUsage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBookingDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Entry.mmEntryDate;
			componentContext_lazy = () -> ReportEntry3.mmObject();
			isDerived = false;
			xmlTag = "BookgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookingDate";
			definition = "Date and time when an entry is posted to an account on the account servicer's books.\n\nUsage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected DateAndDateTimeChoice valueDate;
	/**
	 * Date and time at which assets become available to the account owner in
	 * case of a credit entry, or cease to be available to the account owner in
	 * case of a debit entry. Usage: If entry status is pending and value date
	 * is present, then the value date refers to an expected/requested value
	 * date. For entries subject to availability/float and for which
	 * availability information is provided, the value date must not be used. In
	 * this case the availability component identifies the number of
	 * availability days.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit entry.\nUsage: If entry status is pending and value date is present, then the value date refers to an expected/requested value date.\nFor entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmValueDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Entry.mmValueDate;
			componentContext_lazy = () -> ReportEntry3.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit entry.\nUsage: If entry status is pending and value date is present, then the value date refers to an expected/requested value date.\nFor entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected Max35Text accountServicerReference;
	/**
	 * Unique reference as assigned by the account servicing institution to
	 * unambiguously identify the entry.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference as assigned by the account servicing institution to unambiguously identify the entry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountServicerReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Entry.mmIdentification;
			componentContext_lazy = () -> ReportEntry3.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerReference";
			definition = "Unique reference as assigned by the account servicing institution to unambiguously identify the entry.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashBalanceAvailability2> availability;
	/**
	 * Indicates when the booked amount of money will become available, that is
	 * can be accessed and starts generating interest.
	 * 
	 * Usage: This type of information is used in the US and is linked to
	 * particular instruments such as cheques. Example: When a cheque is
	 * deposited, it will be booked on the deposit day, but the amount of money
	 * will only be accessible as of the indicated availability day (according
	 * to national banking regulations).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailability2
	 * CashBalanceAvailability2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAvailability
	 * CashEntry.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Avlbty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Availability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates when the booked amount of money will become available, that is can be accessed and starts generating interest. \n\nUsage: This type of information is used in the US and is linked to particular instruments such as cheques.\nExample: When a cheque is deposited, it will be booked on the deposit day, but the amount of money will only be accessible as of the indicated availability day (according to national banking regulations)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAvailability = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashEntry.mmAvailability;
			componentContext_lazy = () -> ReportEntry3.mmObject();
			isDerived = false;
			xmlTag = "Avlbty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Availability";
			definition = "Indicates when the booked amount of money will become available, that is can be accessed and starts generating interest. \n\nUsage: This type of information is used in the US and is linked to particular instruments such as cheques.\nExample: When a cheque is deposited, it will be booked on the deposit day, but the amount of money will only be accessible as of the indicated availability day (according to national banking regulations).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashBalanceAvailability2.mmObject();
		}
	};
	protected BankTransactionCodeStructure4 bankTransactionCode;
	/**
	 * Set of elements used to fully identify the type of underlying transaction
	 * resulting in an entry.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkTxCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankTransactionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to fully identify the type of underlying transaction resulting in an entry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBankTransactionCode = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Entry.mmBankTransactionCode;
			componentContext_lazy = () -> ReportEntry3.mmObject();
			isDerived = false;
			xmlTag = "BkTxCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankTransactionCode";
			definition = "Set of elements used to fully identify the type of underlying transaction resulting in an entry.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BankTransactionCodeStructure4.mmObject();
		}
	};
	protected YesNoIndicator commissionWaiverIndicator;
	/**
	 * Indicates whether the transaction is exempt from commission.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnWvrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionWaiverIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction is exempt from commission."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCommissionWaiverIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Entry.mmCommissionWaiverIndicator;
			componentContext_lazy = () -> ReportEntry3.mmObject();
			isDerived = false;
			xmlTag = "ComssnWvrInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionWaiverIndicator";
			definition = "Indicates whether the transaction is exempt from commission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected MessageIdentification2 additionalInformationIndicator;
	/**
	 * Indicates whether the underlying transaction details are provided through
	 * a separate message, as in the case of aggregate bookings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification2
	 * MessageIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInfInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the underlying transaction details are provided through a separate message, as in the case of aggregate bookings."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalInformationIndicator = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ReportEntry3.mmObject();
			isDerived = false;
			xmlTag = "AddtlInfInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationIndicator";
			definition = "Indicates whether the underlying transaction details are provided through a separate message, as in the case of aggregate bookings.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MessageIdentification2.mmObject();
		}
	};
	protected AmountAndCurrencyExchange3 amountDetails;
	/**
	 * Provides information on the original amount.
	 * 
	 * Usage: This component (on entry level) should be used when a total
	 * original batch or aggregate amount has to be provided. If required, the
	 * individual original amounts can be included in the same component on
	 * transaction details level.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the original amount.\n\nUsage: This component (on entry level) should be used when a total original batch or aggregate amount has to be provided. If required, the individual original amounts can be included in the same component on transaction details level."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashEntry.mmAmount;
			componentContext_lazy = () -> ReportEntry3.mmObject();
			isDerived = false;
			xmlTag = "AmtDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountDetails";
			definition = "Provides information on the original amount.\n\nUsage: This component (on entry level) should be used when a total original batch or aggregate amount has to be provided. If required, the individual original amounts can be included in the same component on transaction details level.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchange3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Charges3> charges;
	/**
	 * Provides information on the charges included in the entry amount.
	 * 
	 * Usage: This component is used on entry level in case of batch or
	 * aggregate bookings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charges3 Charges3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCharges
	 * CashEntry.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Chrgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the charges included in the entry amount.\n\nUsage: This component is used on entry level in case of batch or aggregate bookings."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCharges = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashEntry.mmCharges;
			componentContext_lazy = () -> ReportEntry3.mmObject();
			isDerived = false;
			xmlTag = "Chrgs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charges";
			definition = "Provides information on the charges included in the entry amount.\n\nUsage: This component is used on entry level in case of batch or aggregate bookings.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Charges3.mmObject();
		}
	};
	protected TechnicalInputChannel1Choice technicalInputChannel;
	/**
	 * Channel used to technically input the instruction related to the entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TechnicalInputChannel1Choice
	 * TechnicalInputChannel1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TechInptChanl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalInputChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Channel used to technically input the instruction related to the entry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTechnicalInputChannel = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ReportEntry3.mmObject();
			isDerived = false;
			xmlTag = "TechInptChanl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalInputChannel";
			definition = "Channel used to technically input the instruction related to the entry.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TechnicalInputChannel1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TransactionInterest3> interest;
	/**
	 * Provides details of the interest amount included in the entry amount.
	 * 
	 * Usage: This component is used on entry level in the case of batch or
	 * aggregate bookings.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details of the interest amount included in the entry amount.\n\nUsage: This component is used on entry level in the case of batch or aggregate bookings."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInterest = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Interest.mmInterestCalculation;
			componentContext_lazy = () -> ReportEntry3.mmObject();
			isDerived = false;
			xmlTag = "Intrst";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Provides details of the interest amount included in the entry amount.\n\nUsage: This component is used on entry level in the case of batch or aggregate bookings.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionInterest3.mmObject();
		}
	};
	protected CardEntry1 cardTransaction;
	/**
	 * Provides details of the card transaction included in the entry amount,
	 * when globalised by the account servicer .
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details of the card transaction included in the entry amount, when globalised by the account servicer ."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCardTransaction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> ReportEntry3.mmObject();
			isDerived = false;
			xmlTag = "CardTx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardTransaction";
			definition = "Provides details of the card transaction included in the entry amount, when globalised by the account servicer .";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardEntry1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.EntryDetails2> entryDetails;
	/**
	 * Provides details on the entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EntryDetails2
	 * EntryDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the entry."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEntryDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashEntry.mmObject();
			componentContext_lazy = () -> ReportEntry3.mmObject();
			isDerived = false;
			xmlTag = "NtryDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryDetails";
			definition = "Provides details on the entry.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.EntryDetails2.mmObject();
		}
	};
	protected Max500Text additionalEntryInformation;
	/**
	 * Further details of the entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportEntry3 ReportEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlNtryInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalEntryInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details of the entry."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalEntryInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ReportEntry3.mmObject();
			isDerived = false;
			xmlTag = "AddtlNtryInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalEntryInformation";
			definition = "Further details of the entry.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportEntry3.mmEntryReference, com.tools20022.repository.msg.ReportEntry3.mmAmount, com.tools20022.repository.msg.ReportEntry3.mmCreditDebitIndicator,
						com.tools20022.repository.msg.ReportEntry3.mmReversalIndicator, com.tools20022.repository.msg.ReportEntry3.mmStatus, com.tools20022.repository.msg.ReportEntry3.mmBookingDate,
						com.tools20022.repository.msg.ReportEntry3.mmValueDate, com.tools20022.repository.msg.ReportEntry3.mmAccountServicerReference, com.tools20022.repository.msg.ReportEntry3.mmAvailability,
						com.tools20022.repository.msg.ReportEntry3.mmBankTransactionCode, com.tools20022.repository.msg.ReportEntry3.mmCommissionWaiverIndicator, com.tools20022.repository.msg.ReportEntry3.mmAdditionalInformationIndicator,
						com.tools20022.repository.msg.ReportEntry3.mmAmountDetails, com.tools20022.repository.msg.ReportEntry3.mmCharges, com.tools20022.repository.msg.ReportEntry3.mmTechnicalInputChannel,
						com.tools20022.repository.msg.ReportEntry3.mmInterest, com.tools20022.repository.msg.ReportEntry3.mmCardTransaction, com.tools20022.repository.msg.ReportEntry3.mmEntryDetails,
						com.tools20022.repository.msg.ReportEntry3.mmAdditionalEntryInformation);
				trace_lazy = () -> CashEntry.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReportEntry3";
				definition = "Provides further details on an entry in the report.";
				nextVersions_lazy = () -> Arrays.asList(ReportEntry4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getEntryReference() {
		return entryReference;
	}

	public void setEntryReference(Max35Text entryReference) {
		this.entryReference = entryReference;
	}

	public ActiveOrHistoricCurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(ActiveOrHistoricCurrencyAndAmount amount) {
		this.amount = amount;
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	public TrueFalseIndicator getReversalIndicator() {
		return reversalIndicator;
	}

	public void setReversalIndicator(TrueFalseIndicator reversalIndicator) {
		this.reversalIndicator = reversalIndicator;
	}

	public EntryStatus2Code getStatus() {
		return status;
	}

	public void setStatus(EntryStatus2Code status) {
		this.status = status;
	}

	public DateAndDateTimeChoice getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(DateAndDateTimeChoice bookingDate) {
		this.bookingDate = bookingDate;
	}

	public DateAndDateTimeChoice getValueDate() {
		return valueDate;
	}

	public void setValueDate(DateAndDateTimeChoice valueDate) {
		this.valueDate = valueDate;
	}

	public Max35Text getAccountServicerReference() {
		return accountServicerReference;
	}

	public void setAccountServicerReference(Max35Text accountServicerReference) {
		this.accountServicerReference = accountServicerReference;
	}

	public List<CashBalanceAvailability2> getAvailability() {
		return availability;
	}

	public void setAvailability(List<com.tools20022.repository.msg.CashBalanceAvailability2> availability) {
		this.availability = availability;
	}

	public BankTransactionCodeStructure4 getBankTransactionCode() {
		return bankTransactionCode;
	}

	public void setBankTransactionCode(com.tools20022.repository.msg.BankTransactionCodeStructure4 bankTransactionCode) {
		this.bankTransactionCode = bankTransactionCode;
	}

	public YesNoIndicator getCommissionWaiverIndicator() {
		return commissionWaiverIndicator;
	}

	public void setCommissionWaiverIndicator(YesNoIndicator commissionWaiverIndicator) {
		this.commissionWaiverIndicator = commissionWaiverIndicator;
	}

	public MessageIdentification2 getAdditionalInformationIndicator() {
		return additionalInformationIndicator;
	}

	public void setAdditionalInformationIndicator(com.tools20022.repository.msg.MessageIdentification2 additionalInformationIndicator) {
		this.additionalInformationIndicator = additionalInformationIndicator;
	}

	public AmountAndCurrencyExchange3 getAmountDetails() {
		return amountDetails;
	}

	public void setAmountDetails(com.tools20022.repository.msg.AmountAndCurrencyExchange3 amountDetails) {
		this.amountDetails = amountDetails;
	}

	public List<Charges3> getCharges() {
		return charges;
	}

	public void setCharges(List<com.tools20022.repository.msg.Charges3> charges) {
		this.charges = charges;
	}

	public TechnicalInputChannel1Choice getTechnicalInputChannel() {
		return technicalInputChannel;
	}

	public void setTechnicalInputChannel(TechnicalInputChannel1Choice technicalInputChannel) {
		this.technicalInputChannel = technicalInputChannel;
	}

	public List<TransactionInterest3> getInterest() {
		return interest;
	}

	public void setInterest(List<com.tools20022.repository.msg.TransactionInterest3> interest) {
		this.interest = interest;
	}

	public CardEntry1 getCardTransaction() {
		return cardTransaction;
	}

	public void setCardTransaction(com.tools20022.repository.msg.CardEntry1 cardTransaction) {
		this.cardTransaction = cardTransaction;
	}

	public List<EntryDetails2> getEntryDetails() {
		return entryDetails;
	}

	public void setEntryDetails(List<com.tools20022.repository.msg.EntryDetails2> entryDetails) {
		this.entryDetails = entryDetails;
	}

	public Max500Text getAdditionalEntryInformation() {
		return additionalEntryInformation;
	}

	public void setAdditionalEntryInformation(Max500Text additionalEntryInformation) {
		this.additionalEntryInformation = additionalEntryInformation;
	}
}