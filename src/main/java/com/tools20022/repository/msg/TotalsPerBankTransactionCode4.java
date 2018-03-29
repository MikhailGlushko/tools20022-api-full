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
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.BankTransaction;
import com.tools20022.repository.entity.CashBalance;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection35;
import com.tools20022.repository.msg.BankTransactionCodeStructure4;
import com.tools20022.repository.msg.CashAvailability1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide the total sum of entries per bank transaction
 * code.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode4#mmNumberOfEntries
 * TotalsPerBankTransactionCode4.mmNumberOfEntries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode4#mmSum
 * TotalsPerBankTransactionCode4.mmSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode4#mmTotalNetEntry
 * TotalsPerBankTransactionCode4.mmTotalNetEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode4#mmForecastIndicator
 * TotalsPerBankTransactionCode4.mmForecastIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode4#mmBankTransactionCode
 * TotalsPerBankTransactionCode4.mmBankTransactionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode4#mmAvailability
 * TotalsPerBankTransactionCode4.mmAvailability}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TotalsPerBankTransactionCode4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide the total sum of entries per bank transaction code."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode5
 * TotalsPerBankTransactionCode5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode3
 * TotalsPerBankTransactionCode3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TotalsPerBankTransactionCode4", propOrder = {"numberOfEntries", "sum", "totalNetEntry", "forecastIndicator", "bankTransactionCode", "availability"})
public class TotalsPerBankTransactionCode4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NbOfNtries")
	protected Max15NumericText numberOfEntries;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode4
	 * TotalsPerBankTransactionCode4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfNtries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfEntries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of individual entries for the bank transaction code."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode5#mmNumberOfEntries
	 * TotalsPerBankTransactionCode5.mmNumberOfEntries}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode3#mmNumberOfEntries
	 * TotalsPerBankTransactionCode3.mmNumberOfEntries}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalsPerBankTransactionCode4, Optional<Max15NumericText>> mmNumberOfEntries = new MMMessageAttribute<TotalsPerBankTransactionCode4, Optional<Max15NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalsPerBankTransactionCode4.mmObject();
			isDerived = false;
			xmlTag = "NbOfNtries";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfEntries";
			definition = "Number of individual entries for the bank transaction code.";
			nextVersions_lazy = () -> Arrays.asList(TotalsPerBankTransactionCode5.mmNumberOfEntries);
			previousVersion_lazy = () -> TotalsPerBankTransactionCode3.mmNumberOfEntries;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Optional<Max15NumericText> getValue(TotalsPerBankTransactionCode4 obj) {
			return obj.getNumberOfEntries();
		}

		@Override
		public void setValue(TotalsPerBankTransactionCode4 obj, Optional<Max15NumericText> value) {
			obj.setNumberOfEntries(value.orElse(null));
		}
	};
	@XmlElement(name = "Sum")
	protected DecimalNumber sum;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode4
	 * TotalsPerBankTransactionCode4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total of all individual entries included in the report."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode5#mmSum
	 * TotalsPerBankTransactionCode5.mmSum}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode3#mmSum
	 * TotalsPerBankTransactionCode3.mmSum}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalsPerBankTransactionCode4, Optional<DecimalNumber>> mmSum = new MMMessageAttribute<TotalsPerBankTransactionCode4, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalsPerBankTransactionCode4.mmObject();
			isDerived = false;
			xmlTag = "Sum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sum";
			definition = "Total of all individual entries included in the report.";
			nextVersions_lazy = () -> Arrays.asList(TotalsPerBankTransactionCode5.mmSum);
			previousVersion_lazy = () -> TotalsPerBankTransactionCode3.mmSum;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(TotalsPerBankTransactionCode4 obj) {
			return obj.getSum();
		}

		@Override
		public void setValue(TotalsPerBankTransactionCode4 obj, Optional<DecimalNumber> value) {
			obj.setSum(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlNetNtry")
	protected AmountAndDirection35 totalNetEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection35
	 * AmountAndDirection35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode4
	 * TotalsPerBankTransactionCode4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNetNtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNetEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total debit or credit amount that is the result of the netted amounts for all debit and credit entries per bank transaction code."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode5#mmTotalNetEntry
	 * TotalsPerBankTransactionCode5.mmTotalNetEntry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode3#mmTotalNetEntry
	 * TotalsPerBankTransactionCode3.mmTotalNetEntry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalsPerBankTransactionCode4, Optional<AmountAndDirection35>> mmTotalNetEntry = new MMMessageAttribute<TotalsPerBankTransactionCode4, Optional<AmountAndDirection35>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalsPerBankTransactionCode4.mmObject();
			isDerived = false;
			xmlTag = "TtlNetNtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNetEntry";
			definition = "Total debit or credit amount that is the result of the netted amounts for all debit and credit entries per bank transaction code.";
			nextVersions_lazy = () -> Arrays.asList(TotalsPerBankTransactionCode5.mmTotalNetEntry);
			previousVersion_lazy = () -> TotalsPerBankTransactionCode3.mmTotalNetEntry;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection35.mmObject();
		}

		@Override
		public Optional<AmountAndDirection35> getValue(TotalsPerBankTransactionCode4 obj) {
			return obj.getTotalNetEntry();
		}

		@Override
		public void setValue(TotalsPerBankTransactionCode4 obj, Optional<AmountAndDirection35> value) {
			obj.setTotalNetEntry(value.orElse(null));
		}
	};
	@XmlElement(name = "FcstInd")
	protected TrueFalseIndicator forecastIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode4
	 * TotalsPerBankTransactionCode4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FcstInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForecastIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the bank transaction code is related to booked or forecast items."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode5#mmForecastIndicator
	 * TotalsPerBankTransactionCode5.mmForecastIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode3#mmForecastIndicator
	 * TotalsPerBankTransactionCode3.mmForecastIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalsPerBankTransactionCode4, Optional<TrueFalseIndicator>> mmForecastIndicator = new MMMessageAttribute<TotalsPerBankTransactionCode4, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalsPerBankTransactionCode4.mmObject();
			isDerived = false;
			xmlTag = "FcstInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForecastIndicator";
			definition = "Indicates whether the bank transaction code is related to booked or forecast items.";
			nextVersions_lazy = () -> Arrays.asList(TotalsPerBankTransactionCode5.mmForecastIndicator);
			previousVersion_lazy = () -> TotalsPerBankTransactionCode3.mmForecastIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(TotalsPerBankTransactionCode4 obj) {
			return obj.getForecastIndicator();
		}

		@Override
		public void setValue(TotalsPerBankTransactionCode4 obj, Optional<TrueFalseIndicator> value) {
			obj.setForecastIndicator(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction
	 * BankTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode4
	 * TotalsPerBankTransactionCode4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode5#mmBankTransactionCode
	 * TotalsPerBankTransactionCode5.mmBankTransactionCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode3#mmBankTransactionCode
	 * TotalsPerBankTransactionCode3.mmBankTransactionCode}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TotalsPerBankTransactionCode4, BankTransactionCodeStructure4> mmBankTransactionCode = new MMMessageAssociationEnd<TotalsPerBankTransactionCode4, BankTransactionCodeStructure4>() {
		{
			businessComponentTrace_lazy = () -> BankTransaction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalsPerBankTransactionCode4.mmObject();
			isDerived = false;
			xmlTag = "BkTxCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankTransactionCode";
			definition = "Set of elements used to fully identify the type of underlying transaction resulting in an entry.";
			nextVersions_lazy = () -> Arrays.asList(TotalsPerBankTransactionCode5.mmBankTransactionCode);
			previousVersion_lazy = () -> TotalsPerBankTransactionCode3.mmBankTransactionCode;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BankTransactionCodeStructure4.mmObject();
		}

		@Override
		public BankTransactionCodeStructure4 getValue(TotalsPerBankTransactionCode4 obj) {
			return obj.getBankTransactionCode();
		}

		@Override
		public void setValue(TotalsPerBankTransactionCode4 obj, BankTransactionCodeStructure4 value) {
			obj.setBankTransactionCode(value);
		}
	};
	@XmlElement(name = "Avlbty")
	protected List<CashAvailability1> availability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAvailability1
	 * CashAvailability1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmAvailability
	 * CashBalance.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode4
	 * TotalsPerBankTransactionCode4}</li>
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
	 * "Set of elements used to indicate when the booked amount of money will become available, that is can be accessed and starts generating interest."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode5#mmAvailability
	 * TotalsPerBankTransactionCode5.mmAvailability}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode3#mmAvailability
	 * TotalsPerBankTransactionCode3.mmAvailability}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TotalsPerBankTransactionCode4, List<CashAvailability1>> mmAvailability = new MMMessageAssociationEnd<TotalsPerBankTransactionCode4, List<CashAvailability1>>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmAvailability;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalsPerBankTransactionCode4.mmObject();
			isDerived = false;
			xmlTag = "Avlbty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Availability";
			definition = "Set of elements used to indicate when the booked amount of money will become available, that is can be accessed and starts generating interest.";
			nextVersions_lazy = () -> Arrays.asList(TotalsPerBankTransactionCode5.mmAvailability);
			previousVersion_lazy = () -> TotalsPerBankTransactionCode3.mmAvailability;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAvailability1.mmObject();
		}

		@Override
		public List<CashAvailability1> getValue(TotalsPerBankTransactionCode4 obj) {
			return obj.getAvailability();
		}

		@Override
		public void setValue(TotalsPerBankTransactionCode4 obj, List<CashAvailability1> value) {
			obj.setAvailability(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalsPerBankTransactionCode4.mmNumberOfEntries, com.tools20022.repository.msg.TotalsPerBankTransactionCode4.mmSum,
						com.tools20022.repository.msg.TotalsPerBankTransactionCode4.mmTotalNetEntry, com.tools20022.repository.msg.TotalsPerBankTransactionCode4.mmForecastIndicator,
						com.tools20022.repository.msg.TotalsPerBankTransactionCode4.mmBankTransactionCode, com.tools20022.repository.msg.TotalsPerBankTransactionCode4.mmAvailability);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TotalsPerBankTransactionCode4";
				definition = "Set of elements used to provide the total sum of entries per bank transaction code.";
				nextVersions_lazy = () -> Arrays.asList(TotalsPerBankTransactionCode5.mmObject());
				previousVersion_lazy = () -> TotalsPerBankTransactionCode3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max15NumericText> getNumberOfEntries() {
		return numberOfEntries == null ? Optional.empty() : Optional.of(numberOfEntries);
	}

	public TotalsPerBankTransactionCode4 setNumberOfEntries(Max15NumericText numberOfEntries) {
		this.numberOfEntries = numberOfEntries;
		return this;
	}

	public Optional<DecimalNumber> getSum() {
		return sum == null ? Optional.empty() : Optional.of(sum);
	}

	public TotalsPerBankTransactionCode4 setSum(DecimalNumber sum) {
		this.sum = sum;
		return this;
	}

	public Optional<AmountAndDirection35> getTotalNetEntry() {
		return totalNetEntry == null ? Optional.empty() : Optional.of(totalNetEntry);
	}

	public TotalsPerBankTransactionCode4 setTotalNetEntry(AmountAndDirection35 totalNetEntry) {
		this.totalNetEntry = totalNetEntry;
		return this;
	}

	public Optional<TrueFalseIndicator> getForecastIndicator() {
		return forecastIndicator == null ? Optional.empty() : Optional.of(forecastIndicator);
	}

	public TotalsPerBankTransactionCode4 setForecastIndicator(TrueFalseIndicator forecastIndicator) {
		this.forecastIndicator = forecastIndicator;
		return this;
	}

	public BankTransactionCodeStructure4 getBankTransactionCode() {
		return bankTransactionCode;
	}

	public TotalsPerBankTransactionCode4 setBankTransactionCode(BankTransactionCodeStructure4 bankTransactionCode) {
		this.bankTransactionCode = Objects.requireNonNull(bankTransactionCode);
		return this;
	}

	public List<CashAvailability1> getAvailability() {
		return availability == null ? availability = new ArrayList<>() : availability;
	}

	public TotalsPerBankTransactionCode4 setAvailability(List<CashAvailability1> availability) {
		this.availability = Objects.requireNonNull(availability);
		return this;
	}
}