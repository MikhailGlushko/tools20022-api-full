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
import com.tools20022.repository.choice.AmountChoice;
import com.tools20022.repository.choice.MemberIdentificationChoice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.entity.Limit;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.RiskManagementLimit;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashBalanceDetails7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Characteristics and values set for a bilateral limit, including the
 * counterparty upon which the limit applies.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails3#mmCounterpartyIdentification
 * BilateralLimitDetails3.mmCounterpartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails3#mmLimitAmount
 * BilateralLimitDetails3.mmLimitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails3#mmCreditDebitIndicator
 * BilateralLimitDetails3.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails3#mmBilateralBalance
 * BilateralLimitDetails3.mmBilateralBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RiskManagementLimit
 * RiskManagementLimit}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BilateralLimitDetails3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Characteristics and values set for a bilateral limit, including the counterparty upon which the limit applies."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BilateralLimitDetails3", propOrder = {"counterpartyIdentification", "limitAmount", "creditDebitIndicator", "bilateralBalance"})
public class BilateralLimitDetails3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CtrPtyId", required = true)
	protected MemberIdentificationChoice counterpartyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MemberIdentificationChoice
	 * MemberIdentificationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails3
	 * BilateralLimitDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a member within a system, assigned using the member identification scheme of the system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BilateralLimitDetails3, MemberIdentificationChoice> mmCounterpartyIdentification = new MMMessageAttribute<BilateralLimitDetails3, MemberIdentificationChoice>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.BilateralLimitDetails3.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyIdentification";
			definition = "Unique and unambiguous identification of a member within a system, assigned using the member identification scheme of the system.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MemberIdentificationChoice.mmObject();
		}

		@Override
		public MemberIdentificationChoice getValue(BilateralLimitDetails3 obj) {
			return obj.getCounterpartyIdentification();
		}

		@Override
		public void setValue(BilateralLimitDetails3 obj, MemberIdentificationChoice value) {
			obj.setCounterpartyIdentification(value);
		}
	};
	@XmlElement(name = "LmtAmt", required = true)
	protected AmountChoice limitAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.choice.AmountChoice
	 * AmountChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmAmount
	 * Limit.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails3
	 * BilateralLimitDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money of the limit, expressed in an eligible currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BilateralLimitDetails3, AmountChoice> mmLimitAmount = new MMMessageAttribute<BilateralLimitDetails3, AmountChoice>() {
		{
			businessElementTrace_lazy = () -> Limit.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BilateralLimitDetails3.mmObject();
			isDerived = false;
			xmlTag = "LmtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitAmount";
			definition = "Amount of money of the limit, expressed in an eligible currency.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountChoice.mmObject();
		}

		@Override
		public AmountChoice getValue(BilateralLimitDetails3 obj) {
			return obj.getLimitAmount();
		}

		@Override
		public void setValue(BilateralLimitDetails3 obj, AmountChoice value) {
			obj.setLimitAmount(value);
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
	 * {@linkplain com.tools20022.repository.entity.Limit#mmCreditDebitIndicator
	 * Limit.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails3
	 * BilateralLimitDetails3}</li>
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
	 * definition} = "Specifies if a limit is a debit limit or a credit limit."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BilateralLimitDetails3, CreditDebitCode> mmCreditDebitIndicator = new MMMessageAttribute<BilateralLimitDetails3, CreditDebitCode>() {
		{
			businessElementTrace_lazy = () -> Limit.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.BilateralLimitDetails3.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies if a limit is a debit limit or a credit limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public CreditDebitCode getValue(BilateralLimitDetails3 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(BilateralLimitDetails3 obj, CreditDebitCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	@XmlElement(name = "BilBal")
	protected List<CashBalanceDetails7> bilateralBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashBalanceDetails7
	 * CashBalanceDetails7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashBalance
	 * CashAccount.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails3
	 * BilateralLimitDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BilBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance calculated with regard to one member in the system."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BilateralLimitDetails3, List<CashBalanceDetails7>> mmBilateralBalance = new MMMessageAssociationEnd<BilateralLimitDetails3, List<CashBalanceDetails7>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.BilateralLimitDetails3.mmObject();
			isDerived = false;
			xmlTag = "BilBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralBalance";
			definition = "Balance calculated with regard to one member in the system.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashBalanceDetails7.mmObject();
		}

		@Override
		public List<CashBalanceDetails7> getValue(BilateralLimitDetails3 obj) {
			return obj.getBilateralBalance();
		}

		@Override
		public void setValue(BilateralLimitDetails3 obj, List<CashBalanceDetails7> value) {
			obj.setBilateralBalance(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BilateralLimitDetails3.mmCounterpartyIdentification, com.tools20022.repository.msg.BilateralLimitDetails3.mmLimitAmount,
						com.tools20022.repository.msg.BilateralLimitDetails3.mmCreditDebitIndicator, com.tools20022.repository.msg.BilateralLimitDetails3.mmBilateralBalance);
				trace_lazy = () -> RiskManagementLimit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BilateralLimitDetails3";
				definition = "Characteristics and values set for a bilateral limit, including the counterparty upon which the limit applies.";
			}
		});
		return mmObject_lazy.get();
	}

	public MemberIdentificationChoice getCounterpartyIdentification() {
		return counterpartyIdentification;
	}

	public BilateralLimitDetails3 setCounterpartyIdentification(MemberIdentificationChoice counterpartyIdentification) {
		this.counterpartyIdentification = Objects.requireNonNull(counterpartyIdentification);
		return this;
	}

	public AmountChoice getLimitAmount() {
		return limitAmount;
	}

	public BilateralLimitDetails3 setLimitAmount(AmountChoice limitAmount) {
		this.limitAmount = Objects.requireNonNull(limitAmount);
		return this;
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public BilateralLimitDetails3 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public List<CashBalanceDetails7> getBilateralBalance() {
		return bilateralBalance == null ? bilateralBalance = new ArrayList<>() : bilateralBalance;
	}

	public BilateralLimitDetails3 setBilateralBalance(List<CashBalanceDetails7> bilateralBalance) {
		this.bilateralBalance = Objects.requireNonNull(bilateralBalance);
		return this;
	}
}