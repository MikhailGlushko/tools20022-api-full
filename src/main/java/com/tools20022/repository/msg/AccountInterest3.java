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
import com.tools20022.repository.choice.InterestType1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.entity.InterestCalculation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DateTimePeriodDetails;
import com.tools20022.repository.msg.Rate3;
import com.tools20022.repository.msg.TaxCharges2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details on the interest that applies to the account at a
 * particular moment in time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest3#mmType
 * AccountInterest3.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest3#mmRate
 * AccountInterest3.mmRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest3#mmFromToDate
 * AccountInterest3.mmFromToDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest3#mmReason
 * AccountInterest3.mmReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest3#mmTax
 * AccountInterest3.mmTax}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InterestCalculation
 * InterestCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountInterest3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides further details on the interest that applies to the account at a particular moment in time."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest4
 * AccountInterest4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountInterest3", propOrder = {"type", "rate", "fromToDate", "reason", "tax"})
public class AccountInterest3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp")
	protected InterestType1Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.InterestType1Choice
	 * InterestType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestType
	 * InterestCalculation.mmInterestType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountInterest3
	 * AccountInterest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of interest."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest4#mmType
	 * AccountInterest4.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountInterest3, Optional<InterestType1Choice>> mmType = new MMMessageAssociationEnd<AccountInterest3, Optional<InterestType1Choice>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmInterestType;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountInterest3.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of interest.";
			nextVersions_lazy = () -> Arrays.asList(AccountInterest4.mmType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestType1Choice.mmObject();
		}

		@Override
		public Optional<InterestType1Choice> getValue(AccountInterest3 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(AccountInterest3 obj, Optional<InterestType1Choice> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Rate")
	protected List<Rate3> rate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Rate3 Rate3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRate
	 * InterestCalculation.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountInterest3
	 * AccountInterest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of elements used to qualify the interest rate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest4#mmRate
	 * AccountInterest4.mmRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountInterest3, List<Rate3>> mmRate = new MMMessageAssociationEnd<AccountInterest3, List<Rate3>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountInterest3.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Set of elements used to qualify the interest rate.";
			nextVersions_lazy = () -> Arrays.asList(AccountInterest4.mmRate);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Rate3.mmObject();
		}

		@Override
		public List<Rate3> getValue(AccountInterest3 obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(AccountInterest3 obj, List<Rate3> value) {
			obj.setRate(value);
		}
	};
	@XmlElement(name = "FrToDt")
	protected DateTimePeriodDetails fromToDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails
	 * DateTimePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestPeriod
	 * InterestCalculation.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountInterest3
	 * AccountInterest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrToDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromToDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Range of time between a start date and an end date for the calculation of the interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountInterest4#mmFromToDate
	 * AccountInterest4.mmFromToDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountInterest3, Optional<DateTimePeriodDetails>> mmFromToDate = new MMMessageAssociationEnd<AccountInterest3, Optional<DateTimePeriodDetails>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmInterestPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountInterest3.mmObject();
			isDerived = false;
			xmlTag = "FrToDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToDate";
			definition = "Range of time between a start date and an end date for the calculation of the interest.";
			nextVersions_lazy = () -> Arrays.asList(AccountInterest4.mmFromToDate);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateTimePeriodDetails.mmObject();
		}

		@Override
		public Optional<DateTimePeriodDetails> getValue(AccountInterest3 obj) {
			return obj.getFromToDate();
		}

		@Override
		public void setValue(AccountInterest3 obj, Optional<DateTimePeriodDetails> value) {
			obj.setFromToDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Rsn")
	protected Max35Text reason;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountInterest3
	 * AccountInterest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for the interest."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest4#mmReason
	 * AccountInterest4.mmReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountInterest3, Optional<Max35Text>> mmReason = new MMMessageAttribute<AccountInterest3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountInterest3.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Specifies the reason for the interest.";
			nextVersions_lazy = () -> Arrays.asList(AccountInterest4.mmReason);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AccountInterest3 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(AccountInterest3 obj, Optional<Max35Text> value) {
			obj.setReason(value.orElse(null));
		}
	};
	@XmlElement(name = "Tax")
	protected TaxCharges2 tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TaxCharges2
	 * TaxCharges2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestTax
	 * Interest.mmInterestTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountInterest3
	 * AccountInterest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the tax applied to charges."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountInterest4#mmTax
	 * AccountInterest4.mmTax}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountInterest3, Optional<TaxCharges2>> mmTax = new MMMessageAttribute<AccountInterest3, Optional<TaxCharges2>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountInterest3.mmObject();
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Provides details on the tax applied to charges.";
			nextVersions_lazy = () -> Arrays.asList(AccountInterest4.mmTax);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TaxCharges2.mmObject();
		}

		@Override
		public Optional<TaxCharges2> getValue(AccountInterest3 obj) {
			return obj.getTax();
		}

		@Override
		public void setValue(AccountInterest3 obj, Optional<TaxCharges2> value) {
			obj.setTax(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountInterest3.mmType, com.tools20022.repository.msg.AccountInterest3.mmRate, com.tools20022.repository.msg.AccountInterest3.mmFromToDate,
						com.tools20022.repository.msg.AccountInterest3.mmReason, com.tools20022.repository.msg.AccountInterest3.mmTax);
				trace_lazy = () -> InterestCalculation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountInterest3";
				definition = "Provides further details on the interest that applies to the account at a particular moment in time.";
				nextVersions_lazy = () -> Arrays.asList(AccountInterest4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<InterestType1Choice> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public AccountInterest3 setType(InterestType1Choice type) {
		this.type = type;
		return this;
	}

	public List<Rate3> getRate() {
		return rate == null ? rate = new ArrayList<>() : rate;
	}

	public AccountInterest3 setRate(List<Rate3> rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public Optional<DateTimePeriodDetails> getFromToDate() {
		return fromToDate == null ? Optional.empty() : Optional.of(fromToDate);
	}

	public AccountInterest3 setFromToDate(DateTimePeriodDetails fromToDate) {
		this.fromToDate = fromToDate;
		return this;
	}

	public Optional<Max35Text> getReason() {
		return reason == null ? Optional.empty() : Optional.of(reason);
	}

	public AccountInterest3 setReason(Max35Text reason) {
		this.reason = reason;
		return this;
	}

	public Optional<TaxCharges2> getTax() {
		return tax == null ? Optional.empty() : Optional.of(tax);
	}

	public AccountInterest3 setTax(TaxCharges2 tax) {
		this.tax = tax;
		return this;
	}
}