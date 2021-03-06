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
import com.tools20022.repository.area.tsin.FinancialInvoiceV01;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Trade settlement details for this invoice which involves the payment of an
 * outstanding debt, account, or charge.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmDuePayableAmount
 * TradeSettlement1.mmDuePayableAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmCreditorReference
 * TradeSettlement1.mmCreditorReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmPaymentReference
 * TradeSettlement1.mmPaymentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmInvoiceCurrencyCode
 * TradeSettlement1.mmInvoiceCurrencyCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement1#mmInvoicer
 * TradeSettlement1.mmInvoicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement1#mmInvoicee
 * TradeSettlement1.mmInvoicee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement1#mmPayee
 * TradeSettlement1.mmPayee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement1#mmPayer
 * TradeSettlement1.mmPayer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmTaxCurrencyExchange
 * TradeSettlement1.mmTaxCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmInvoiceCurrencyExchange
 * TradeSettlement1.mmInvoiceCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmPaymentCurrencyExchange
 * TradeSettlement1.mmPaymentCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmPaymentMeans
 * TradeSettlement1.mmPaymentMeans}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement1#mmTax
 * TradeSettlement1.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmBillingPeriod
 * TradeSettlement1.mmBillingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmAllowanceCharge
 * TradeSettlement1.mmAllowanceCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmSubTotalCalculatedTax
 * TradeSettlement1.mmSubTotalCalculatedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmLogisticsCharge
 * TradeSettlement1.mmLogisticsCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmPaymentTerms
 * TradeSettlement1.mmPaymentTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmMonetarySummation
 * TradeSettlement1.mmMonetarySummation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmAdjustmentAmountAndReason
 * TradeSettlement1.mmAdjustmentAmountAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmInvoiceReferencedDocument
 * TradeSettlement1.mmInvoiceReferencedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmProformaInvoiceReferencedDocument
 * TradeSettlement1.mmProformaInvoiceReferencedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmLetterOfCreditReferencedDocument
 * TradeSettlement1.mmLetterOfCreditReferencedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmFinancialCard
 * TradeSettlement1.mmFinancialCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmPurchaseAccountingAccount
 * TradeSettlement1.mmPurchaseAccountingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmIssuerFactoringListIdentification
 * TradeSettlement1.mmIssuerFactoringListIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmIssuerFactoringAgreementIdentification
 * TradeSettlement1.mmIssuerFactoringAgreementIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement
 * CommercialTradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.FinancialInvoiceV01#mmTradeSettlement
 * FinancialInvoiceV01.mmTradeSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeSettlement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Trade settlement details for this invoice which involves the payment of an outstanding debt, account, or charge."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement2
 * TradeSettlement2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeSettlement1", propOrder = {"duePayableAmount", "creditorReference", "paymentReference", "invoiceCurrencyCode", "invoicer", "invoicee", "payee", "payer", "taxCurrencyExchange", "invoiceCurrencyExchange",
		"paymentCurrencyExchange", "paymentMeans", "tax", "billingPeriod", "allowanceCharge", "subTotalCalculatedTax", "logisticsCharge", "paymentTerms", "monetarySummation", "adjustmentAmountAndReason", "invoiceReferencedDocument",
		"proformaInvoiceReferencedDocument", "letterOfCreditReferencedDocument", "financialCard", "purchaseAccountingAccount", "issuerFactoringListIdentification", "issuerFactoringAgreementIdentification"})
public class TradeSettlement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DuePyblAmt")
	protected List<CurrencyAndAmount> duePayableAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAmount
	 * PaymentObligation.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DuePyblAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuePayableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value that is an exact amount due and payable, such as the amount due to the creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmDuePayableAmount
	 * TradeSettlement2.mmDuePayableAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeSettlement1, List<CurrencyAndAmount>> mmDuePayableAmount = new MMMessageAttribute<TradeSettlement1, List<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "DuePyblAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuePayableAmount";
			definition = "Monetary value that is an exact amount due and payable, such as the amount due to the creditor.";
			nextVersions_lazy = () -> Arrays.asList(TradeSettlement2.mmDuePayableAmount);
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public List<CurrencyAndAmount> getValue(TradeSettlement1 obj) {
			return obj.getDuePayableAmount();
		}

		@Override
		public void setValue(TradeSettlement1 obj, List<CurrencyAndAmount> value) {
			obj.setDuePayableAmount(value);
		}
	};
	@XmlElement(name = "CdtrRef")
	protected List<CreditorReferenceInformation2> creditorReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceInformation2
	 * CreditorReferenceInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmCreditorReference
	 * PaymentIdentification.mmCreditorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous reference assigned by the creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeSettlement1, List<CreditorReferenceInformation2>> mmCreditorReference = new MMMessageAttribute<TradeSettlement1, List<CreditorReferenceInformation2>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmCreditorReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "CdtrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorReference";
			definition = "Unique and unambiguous reference assigned by the creditor.";
			minOccurs = 0;
			complexType_lazy = () -> CreditorReferenceInformation2.mmObject();
		}

		@Override
		public List<CreditorReferenceInformation2> getValue(TradeSettlement1 obj) {
			return obj.getCreditorReference();
		}

		@Override
		public void setValue(TradeSettlement1 obj, List<CreditorReferenceInformation2> value) {
			obj.setCreditorReference(value);
		}
	};
	@XmlElement(name = "PmtRef")
	protected List<Max35Text> paymentReference;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmEndToEndIdentification
	 * PaymentIdentification.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment transaction, as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeSettlement1, List<Max35Text>> mmPaymentReference = new MMMessageAttribute<TradeSettlement1, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "PmtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentReference";
			definition = "Unique and unambiguous identifier for a payment transaction, as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment transaction.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(TradeSettlement1 obj) {
			return obj.getPaymentReference();
		}

		@Override
		public void setValue(TradeSettlement1 obj, List<Max35Text> value) {
			obj.setPaymentReference(value);
		}
	};
	@XmlElement(name = "InvcCcyCd")
	protected CurrencyCode invoiceCurrencyCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmInvoiceCurrency
	 * Invoice.mmInvoiceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcCcyCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceCurrencyCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code specifying the currency of the invoice."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeSettlement1, Optional<CurrencyCode>> mmInvoiceCurrencyCode = new MMMessageAttribute<TradeSettlement1, Optional<CurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmInvoiceCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "InvcCcyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceCurrencyCode";
			definition = "Code specifying the currency of the invoice.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public Optional<CurrencyCode> getValue(TradeSettlement1 obj) {
			return obj.getInvoiceCurrencyCode();
		}

		@Override
		public void setValue(TradeSettlement1 obj, Optional<CurrencyCode> value) {
			obj.setInvoiceCurrencyCode(value.orElse(null));
		}
	};
	@XmlElement(name = "Invcr")
	protected TradeParty1 invoicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty1
	 * TradeParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoicerRole InvoicerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Invcr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invoicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Organization issuing the invoice."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeSettlement1, Optional<TradeParty1>> mmInvoicer = new MMMessageAssociationEnd<TradeSettlement1, Optional<TradeParty1>>() {
		{
			businessComponentTrace_lazy = () -> InvoicerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "Invcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicer";
			definition = "Organization issuing the invoice.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeParty1.mmObject();
		}

		@Override
		public Optional<TradeParty1> getValue(TradeSettlement1 obj) {
			return obj.getInvoicer();
		}

		@Override
		public void setValue(TradeSettlement1 obj, Optional<TradeParty1> value) {
			obj.setInvoicer(value.orElse(null));
		}
	};
	@XmlElement(name = "Invcee")
	protected TradeParty1 invoicee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty1
	 * TradeParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceeRole InvoiceeRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Invcee"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invoicee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to whom the invoice was issued."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeSettlement1, Optional<TradeParty1>> mmInvoicee = new MMMessageAssociationEnd<TradeSettlement1, Optional<TradeParty1>>() {
		{
			businessComponentTrace_lazy = () -> InvoiceeRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "Invcee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicee";
			definition = "Party to whom the invoice was issued.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeParty1.mmObject();
		}

		@Override
		public Optional<TradeParty1> getValue(TradeSettlement1 obj) {
			return obj.getInvoicee();
		}

		@Override
		public void setValue(TradeSettlement1 obj, Optional<TradeParty1> value) {
			obj.setInvoicee(value.orElse(null));
		}
	};
	@XmlElement(name = "Pyee")
	protected TradeParty1 payee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty1
	 * TradeParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyerRole BuyerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pyee"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party specified to receive payment for the invoice."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeSettlement1, Optional<TradeParty1>> mmPayee = new MMMessageAssociationEnd<TradeSettlement1, Optional<TradeParty1>>() {
		{
			businessComponentTrace_lazy = () -> BuyerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "Pyee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payee";
			definition = "Party specified to receive payment for the invoice.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeParty1.mmObject();
		}

		@Override
		public Optional<TradeParty1> getValue(TradeSettlement1 obj) {
			return obj.getPayee();
		}

		@Override
		public void setValue(TradeSettlement1 obj, Optional<TradeParty1> value) {
			obj.setPayee(value.orElse(null));
		}
	};
	@XmlElement(name = "Pyer")
	protected TradeParty1 payer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty1
	 * TradeParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SellerRole SellerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pyer"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party specified to initiate payment for the invoice."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeSettlement1, Optional<TradeParty1>> mmPayer = new MMMessageAssociationEnd<TradeSettlement1, Optional<TradeParty1>>() {
		{
			businessComponentTrace_lazy = () -> SellerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "Pyer";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payer";
			definition = "Party specified to initiate payment for the invoice.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeParty1.mmObject();
		}

		@Override
		public Optional<TradeParty1> getValue(TradeSettlement1 obj) {
			return obj.getPayer();
		}

		@Override
		public void setValue(TradeSettlement1 obj, Optional<TradeParty1> value) {
			obj.setPayer(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxCcyXchg")
	protected CurrencyReference2 taxCurrencyExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyReference2
	 * CurrencyReference2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmCurrencyExchange
	 * Tax.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxCcyXchg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency exchange applicable to a tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeSettlement1, Optional<CurrencyReference2>> mmTaxCurrencyExchange = new MMMessageAssociationEnd<TradeSettlement1, Optional<CurrencyReference2>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmCurrencyExchange;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "TaxCcyXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCurrencyExchange";
			definition = "Currency exchange applicable to a tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CurrencyReference2.mmObject();
		}

		@Override
		public Optional<CurrencyReference2> getValue(TradeSettlement1 obj) {
			return obj.getTaxCurrencyExchange();
		}

		@Override
		public void setValue(TradeSettlement1 obj, Optional<CurrencyReference2> value) {
			obj.setTaxCurrencyExchange(value.orElse(null));
		}
	};
	@XmlElement(name = "InvcCcyXchg")
	protected CurrencyReference2 invoiceCurrencyExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyReference2
	 * CurrencyReference2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmCurrencyExchange
	 * Invoice.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcCcyXchg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceCurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency exchange applicable to the invoice."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeSettlement1, Optional<CurrencyReference2>> mmInvoiceCurrencyExchange = new MMMessageAssociationEnd<TradeSettlement1, Optional<CurrencyReference2>>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmCurrencyExchange;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "InvcCcyXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceCurrencyExchange";
			definition = "Currency exchange applicable to the invoice.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CurrencyReference2.mmObject();
		}

		@Override
		public Optional<CurrencyReference2> getValue(TradeSettlement1 obj) {
			return obj.getInvoiceCurrencyExchange();
		}

		@Override
		public void setValue(TradeSettlement1 obj, Optional<CurrencyReference2> value) {
			obj.setInvoiceCurrencyExchange(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtCcyXchg")
	protected CurrencyReference2 paymentCurrencyExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyReference2
	 * CurrencyReference2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
	 * Payment.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtCcyXchg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency exchange applicable to the payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeSettlement1, Optional<CurrencyReference2>> mmPaymentCurrencyExchange = new MMMessageAssociationEnd<TradeSettlement1, Optional<CurrencyReference2>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyExchange;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "PmtCcyXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCurrencyExchange";
			definition = "Currency exchange applicable to the payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CurrencyReference2.mmObject();
		}

		@Override
		public Optional<CurrencyReference2> getValue(TradeSettlement1 obj) {
			return obj.getPaymentCurrencyExchange();
		}

		@Override
		public void setValue(TradeSettlement1 obj, Optional<CurrencyReference2> value) {
			obj.setPaymentCurrencyExchange(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtMeans")
	protected List<PaymentMeans1> paymentMeans;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentMeans1
	 * PaymentMeans1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmPayment
	 * CommercialTradeSettlement.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMeans"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMeans"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Means of payment (for example, credit transfer, cheque, money order, or credit card) specified to initiate payment of the invoice."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeSettlement1, List<PaymentMeans1>> mmPaymentMeans = new MMMessageAssociationEnd<TradeSettlement1, List<PaymentMeans1>>() {
		{
			businessElementTrace_lazy = () -> CommercialTradeSettlement.mmPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "PmtMeans";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMeans";
			definition = "Means of payment (for example, credit transfer, cheque, money order, or credit card) specified to initiate payment of the invoice.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentMeans1.mmObject();
		}

		@Override
		public List<PaymentMeans1> getValue(TradeSettlement1 obj) {
			return obj.getPaymentMeans();
		}

		@Override
		public void setValue(TradeSettlement1 obj, List<PaymentMeans1> value) {
			obj.setPaymentMeans(value);
		}
	};
	@XmlElement(name = "Tax")
	protected List<SettlementTax1> tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementTax1
	 * SettlementTax1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmTax Product.mmTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeSettlement1, List<SettlementTax1>> mmTax = new MMMessageAssociationEnd<TradeSettlement1, List<SettlementTax1>>() {
		{
			businessElementTrace_lazy = () -> Product.mmTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementTax1.mmObject();
		}

		@Override
		public List<SettlementTax1> getValue(TradeSettlement1 obj) {
			return obj.getTax();
		}

		@Override
		public void setValue(TradeSettlement1 obj, List<SettlementTax1> value) {
			obj.setTax(value);
		}
	};
	@XmlElement(name = "BllgPrd")
	protected Period1 billingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period1 Period1}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmPeriodCovered
	 * Invoice.mmPeriodCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BllgPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the applicable billing period."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeSettlement1, Optional<Period1>> mmBillingPeriod = new MMMessageAttribute<TradeSettlement1, Optional<Period1>>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmPeriodCovered;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "BllgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingPeriod";
			definition = "Specifies the applicable billing period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period1.mmObject();
		}

		@Override
		public Optional<Period1> getValue(TradeSettlement1 obj) {
			return obj.getBillingPeriod();
		}

		@Override
		public void setValue(TradeSettlement1 obj, Optional<Period1> value) {
			obj.setBillingPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "AllwncChrg")
	protected List<SettlementAllowanceCharge1> allowanceCharge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementAllowanceCharge1
	 * SettlementAllowanceCharge1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Allowance Allowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllwncChrg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowanceCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allowance or charge specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeSettlement1, List<SettlementAllowanceCharge1>> mmAllowanceCharge = new MMMessageAssociationEnd<TradeSettlement1, List<SettlementAllowanceCharge1>>() {
		{
			businessComponentTrace_lazy = () -> Allowance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "AllwncChrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllowanceCharge";
			definition = "Allowance or charge specified.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementAllowanceCharge1.mmObject();
		}

		@Override
		public List<SettlementAllowanceCharge1> getValue(TradeSettlement1 obj) {
			return obj.getAllowanceCharge();
		}

		@Override
		public void setValue(TradeSettlement1 obj, List<SettlementAllowanceCharge1> value) {
			obj.setAllowanceCharge(value);
		}
	};
	@XmlElement(name = "SubTtlClctdTax")
	protected List<SettlementSubTotalCalculatedTax1> subTotalCalculatedTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1
	 * SettlementSubTotalCalculatedTax1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmTax Product.mmTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubTtlClctdTax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubTotalCalculatedTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax subtotal calculated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmSubTotalCalculatedTax
	 * TradeSettlement2.mmSubTotalCalculatedTax}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeSettlement1, List<SettlementSubTotalCalculatedTax1>> mmSubTotalCalculatedTax = new MMMessageAssociationEnd<TradeSettlement1, List<SettlementSubTotalCalculatedTax1>>() {
		{
			businessElementTrace_lazy = () -> Product.mmTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "SubTtlClctdTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubTotalCalculatedTax";
			definition = "Tax subtotal calculated.";
			nextVersions_lazy = () -> Arrays.asList(TradeSettlement2.mmSubTotalCalculatedTax);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementSubTotalCalculatedTax1.mmObject();
		}

		@Override
		public List<SettlementSubTotalCalculatedTax1> getValue(TradeSettlement1 obj) {
			return obj.getSubTotalCalculatedTax();
		}

		@Override
		public void setValue(TradeSettlement1 obj, List<SettlementSubTotalCalculatedTax1> value) {
			obj.setSubTotalCalculatedTax(value);
		}
	};
	@XmlElement(name = "LogstcsChrg")
	protected List<ChargesDetails2> logisticsCharge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ChargesDetails2
	 * ChargesDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmLogisticsCharge
	 * LineItem.mmLogisticsCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LogstcsChrg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LogisticsCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Logistics service charge specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeSettlement1, List<ChargesDetails2>> mmLogisticsCharge = new MMMessageAttribute<TradeSettlement1, List<ChargesDetails2>>() {
		{
			businessElementTrace_lazy = () -> LineItem.mmLogisticsCharge;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "LogstcsChrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LogisticsCharge";
			definition = "Logistics service charge specified.";
			minOccurs = 0;
			complexType_lazy = () -> ChargesDetails2.mmObject();
		}

		@Override
		public List<ChargesDetails2> getValue(TradeSettlement1 obj) {
			return obj.getLogisticsCharge();
		}

		@Override
		public void setValue(TradeSettlement1 obj, List<ChargesDetails2> value) {
			obj.setLogisticsCharge(value);
		}
	};
	@XmlElement(name = "PmtTerms")
	protected List<PaymentTerms3> paymentTerms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTerms3
	 * PaymentTerms3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentObligation
	 * Payment.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTerms"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment terms."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeSettlement1, List<PaymentTerms3>> mmPaymentTerms = new MMMessageAssociationEnd<TradeSettlement1, List<PaymentTerms3>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentObligation;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "PmtTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTerms";
			definition = "Payment terms.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTerms3.mmObject();
		}

		@Override
		public List<PaymentTerms3> getValue(TradeSettlement1 obj) {
			return obj.getPaymentTerms();
		}

		@Override
		public void setValue(TradeSettlement1 obj, List<PaymentTerms3> value) {
			obj.setPaymentTerms(value);
		}
	};
	@XmlElement(name = "MntrySummtn", required = true)
	protected SettlementMonetarySummation1 monetarySummation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1
	 * SettlementMonetarySummation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmInvoice
	 * CommercialTradeSettlement.mmInvoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MntrySummtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonetarySummation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Monetary totals specified for the invoice."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeSettlement1, SettlementMonetarySummation1> mmMonetarySummation = new MMMessageAssociationEnd<TradeSettlement1, SettlementMonetarySummation1>() {
		{
			businessElementTrace_lazy = () -> CommercialTradeSettlement.mmInvoice;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "MntrySummtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonetarySummation";
			definition = "Monetary totals specified for the invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementMonetarySummation1.mmObject();
		}

		@Override
		public SettlementMonetarySummation1 getValue(TradeSettlement1 obj) {
			return obj.getMonetarySummation();
		}

		@Override
		public void setValue(TradeSettlement1 obj, SettlementMonetarySummation1 value) {
			obj.setMonetarySummation(value);
		}
	};
	@XmlElement(name = "AdjstmntAmtAndRsn")
	protected List<DocumentAdjustment2> adjustmentAmountAndReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentAdjustment2
	 * DocumentAdjustment2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmFinancialAdjustment
	 * LineItem.mmFinancialAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdjstmntAmtAndRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentAmountAndReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial adjustment specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeSettlement1, List<DocumentAdjustment2>> mmAdjustmentAmountAndReason = new MMMessageAttribute<TradeSettlement1, List<DocumentAdjustment2>>() {
		{
			businessElementTrace_lazy = () -> LineItem.mmFinancialAdjustment;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "AdjstmntAmtAndRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentAmountAndReason";
			definition = "Financial adjustment specified.";
			minOccurs = 0;
			complexType_lazy = () -> DocumentAdjustment2.mmObject();
		}

		@Override
		public List<DocumentAdjustment2> getValue(TradeSettlement1 obj) {
			return obj.getAdjustmentAmountAndReason();
		}

		@Override
		public void setValue(TradeSettlement1 obj, List<DocumentAdjustment2> value) {
			obj.setAdjustmentAmountAndReason(value);
		}
	};
	@XmlElement(name = "InvcRefdDoc")
	protected DocumentIdentification22 invoiceReferencedDocument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22
	 * DocumentIdentification22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmInvoice
	 * CommercialTradeSettlement.mmInvoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcRefdDoc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceReferencedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invoice document referenced."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeSettlement1, Optional<DocumentIdentification22>> mmInvoiceReferencedDocument = new MMMessageAttribute<TradeSettlement1, Optional<DocumentIdentification22>>() {
		{
			businessElementTrace_lazy = () -> CommercialTradeSettlement.mmInvoice;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "InvcRefdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceReferencedDocument";
			definition = "Invoice document referenced.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification22.mmObject();
		}

		@Override
		public Optional<DocumentIdentification22> getValue(TradeSettlement1 obj) {
			return obj.getInvoiceReferencedDocument();
		}

		@Override
		public void setValue(TradeSettlement1 obj, Optional<DocumentIdentification22> value) {
			obj.setInvoiceReferencedDocument(value.orElse(null));
		}
	};
	@XmlElement(name = "ProfrmInvcRefdDoc")
	protected DocumentIdentification22 proformaInvoiceReferencedDocument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22
	 * DocumentIdentification22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmInvoice
	 * CommercialTradeSettlement.mmInvoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ProfrmInvcRefdDoc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProformaInvoiceReferencedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pro-forma invoice document referenced."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeSettlement1, Optional<DocumentIdentification22>> mmProformaInvoiceReferencedDocument = new MMMessageAttribute<TradeSettlement1, Optional<DocumentIdentification22>>() {
		{
			businessElementTrace_lazy = () -> CommercialTradeSettlement.mmInvoice;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "ProfrmInvcRefdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProformaInvoiceReferencedDocument";
			definition = "Pro-forma invoice document referenced.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification22.mmObject();
		}

		@Override
		public Optional<DocumentIdentification22> getValue(TradeSettlement1 obj) {
			return obj.getProformaInvoiceReferencedDocument();
		}

		@Override
		public void setValue(TradeSettlement1 obj, Optional<DocumentIdentification22> value) {
			obj.setProformaInvoiceReferencedDocument(value.orElse(null));
		}
	};
	@XmlElement(name = "LttrOfCdtRefdDoc")
	protected DocumentIdentification7 letterOfCreditReferencedDocument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification7
	 * DocumentIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrOfCdtRefdDoc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfCreditReferencedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Letter of credit document referenced."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeSettlement1, Optional<DocumentIdentification7>> mmLetterOfCreditReferencedDocument = new MMMessageAttribute<TradeSettlement1, Optional<DocumentIdentification7>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "LttrOfCdtRefdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfCreditReferencedDocument";
			definition = "Letter of credit document referenced.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification7.mmObject();
		}

		@Override
		public Optional<DocumentIdentification7> getValue(TradeSettlement1 obj) {
			return obj.getLetterOfCreditReferencedDocument();
		}

		@Override
		public void setValue(TradeSettlement1 obj, Optional<DocumentIdentification7> value) {
			obj.setLetterOfCreditReferencedDocument(value.orElse(null));
		}
	};
	@XmlElement(name = "FinCard")
	protected List<FinancialCard1> financialCard;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialCard1
	 * FinancialCard1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
	 * CardPayment.mmPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinCard"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial card specified. The card is used to represent a financial account for the purpose of payment settlement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeSettlement1, List<FinancialCard1>> mmFinancialCard = new MMMessageAssociationEnd<TradeSettlement1, List<FinancialCard1>>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmPaymentCard;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "FinCard";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialCard";
			definition = "Financial card specified. The card is used to represent a financial account for the purpose of payment settlement.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialCard1.mmObject();
		}

		@Override
		public List<FinancialCard1> getValue(TradeSettlement1 obj) {
			return obj.getFinancialCard();
		}

		@Override
		public void setValue(TradeSettlement1 obj, List<FinancialCard1> value) {
			obj.setFinancialCard(value);
		}
	};
	@XmlElement(name = "PurchsAcctgAcct")
	protected List<AccountingAccount1> purchaseAccountingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountingAccount1
	 * AccountingAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPurchaseAccount
	 * CommercialTrade.mmPurchaseAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PurchsAcctgAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseAccountingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific purchase account for recording debits and credits for accounting purposes."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeSettlement1, List<AccountingAccount1>> mmPurchaseAccountingAccount = new MMMessageAssociationEnd<TradeSettlement1, List<AccountingAccount1>>() {
		{
			businessElementTrace_lazy = () -> CommercialTrade.mmPurchaseAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "PurchsAcctgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseAccountingAccount";
			definition = "Specific purchase account for recording debits and credits for accounting purposes.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountingAccount1.mmObject();
		}

		@Override
		public List<AccountingAccount1> getValue(TradeSettlement1 obj) {
			return obj.getPurchaseAccountingAccount();
		}

		@Override
		public void setValue(TradeSettlement1 obj, List<AccountingAccount1> value) {
			obj.setPurchaseAccountingAccount(value);
		}
	};
	@XmlElement(name = "IssrFactrgListId")
	protected List<Max35Text> issuerFactoringListIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrFactrgListId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerFactoringListIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Factoring list document referenced."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeSettlement1, List<Max35Text>> mmIssuerFactoringListIdentification = new MMMessageAttribute<TradeSettlement1, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "IssrFactrgListId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerFactoringListIdentification";
			definition = "Factoring list document referenced.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(TradeSettlement1 obj) {
			return obj.getIssuerFactoringListIdentification();
		}

		@Override
		public void setValue(TradeSettlement1 obj, List<Max35Text> value) {
			obj.setIssuerFactoringListIdentification(value);
		}
	};
	@XmlElement(name = "IssrFactrgAgrmtId")
	protected List<Max35Text> issuerFactoringAgreementIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmIdentification
	 * InvoiceFinancingAgreement.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrFactrgAgrmtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerFactoringAgreementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Factoring agreement document referenced."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeSettlement1, List<Max35Text>> mmIssuerFactoringAgreementIdentification = new MMMessageAttribute<TradeSettlement1, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "IssrFactrgAgrmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerFactoringAgreementIdentification";
			definition = "Factoring agreement document referenced.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(TradeSettlement1 obj) {
			return obj.getIssuerFactoringAgreementIdentification();
		}

		@Override
		public void setValue(TradeSettlement1 obj, List<Max35Text> value) {
			obj.setIssuerFactoringAgreementIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeSettlement1.mmDuePayableAmount, com.tools20022.repository.msg.TradeSettlement1.mmCreditorReference,
						com.tools20022.repository.msg.TradeSettlement1.mmPaymentReference, com.tools20022.repository.msg.TradeSettlement1.mmInvoiceCurrencyCode, com.tools20022.repository.msg.TradeSettlement1.mmInvoicer,
						com.tools20022.repository.msg.TradeSettlement1.mmInvoicee, com.tools20022.repository.msg.TradeSettlement1.mmPayee, com.tools20022.repository.msg.TradeSettlement1.mmPayer,
						com.tools20022.repository.msg.TradeSettlement1.mmTaxCurrencyExchange, com.tools20022.repository.msg.TradeSettlement1.mmInvoiceCurrencyExchange,
						com.tools20022.repository.msg.TradeSettlement1.mmPaymentCurrencyExchange, com.tools20022.repository.msg.TradeSettlement1.mmPaymentMeans, com.tools20022.repository.msg.TradeSettlement1.mmTax,
						com.tools20022.repository.msg.TradeSettlement1.mmBillingPeriod, com.tools20022.repository.msg.TradeSettlement1.mmAllowanceCharge, com.tools20022.repository.msg.TradeSettlement1.mmSubTotalCalculatedTax,
						com.tools20022.repository.msg.TradeSettlement1.mmLogisticsCharge, com.tools20022.repository.msg.TradeSettlement1.mmPaymentTerms, com.tools20022.repository.msg.TradeSettlement1.mmMonetarySummation,
						com.tools20022.repository.msg.TradeSettlement1.mmAdjustmentAmountAndReason, com.tools20022.repository.msg.TradeSettlement1.mmInvoiceReferencedDocument,
						com.tools20022.repository.msg.TradeSettlement1.mmProformaInvoiceReferencedDocument, com.tools20022.repository.msg.TradeSettlement1.mmLetterOfCreditReferencedDocument,
						com.tools20022.repository.msg.TradeSettlement1.mmFinancialCard, com.tools20022.repository.msg.TradeSettlement1.mmPurchaseAccountingAccount,
						com.tools20022.repository.msg.TradeSettlement1.mmIssuerFactoringListIdentification, com.tools20022.repository.msg.TradeSettlement1.mmIssuerFactoringAgreementIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInvoiceV01.mmTradeSettlement);
				trace_lazy = () -> CommercialTradeSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TradeSettlement1";
				definition = "Trade settlement details for this invoice which involves the payment of an outstanding debt, account, or charge.";
				nextVersions_lazy = () -> Arrays.asList(TradeSettlement2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<CurrencyAndAmount> getDuePayableAmount() {
		return duePayableAmount == null ? duePayableAmount = new ArrayList<>() : duePayableAmount;
	}

	public TradeSettlement1 setDuePayableAmount(List<CurrencyAndAmount> duePayableAmount) {
		this.duePayableAmount = Objects.requireNonNull(duePayableAmount);
		return this;
	}

	public List<CreditorReferenceInformation2> getCreditorReference() {
		return creditorReference == null ? creditorReference = new ArrayList<>() : creditorReference;
	}

	public TradeSettlement1 setCreditorReference(List<CreditorReferenceInformation2> creditorReference) {
		this.creditorReference = Objects.requireNonNull(creditorReference);
		return this;
	}

	public List<Max35Text> getPaymentReference() {
		return paymentReference == null ? paymentReference = new ArrayList<>() : paymentReference;
	}

	public TradeSettlement1 setPaymentReference(List<Max35Text> paymentReference) {
		this.paymentReference = Objects.requireNonNull(paymentReference);
		return this;
	}

	public Optional<CurrencyCode> getInvoiceCurrencyCode() {
		return invoiceCurrencyCode == null ? Optional.empty() : Optional.of(invoiceCurrencyCode);
	}

	public TradeSettlement1 setInvoiceCurrencyCode(CurrencyCode invoiceCurrencyCode) {
		this.invoiceCurrencyCode = invoiceCurrencyCode;
		return this;
	}

	public Optional<TradeParty1> getInvoicer() {
		return invoicer == null ? Optional.empty() : Optional.of(invoicer);
	}

	public TradeSettlement1 setInvoicer(TradeParty1 invoicer) {
		this.invoicer = invoicer;
		return this;
	}

	public Optional<TradeParty1> getInvoicee() {
		return invoicee == null ? Optional.empty() : Optional.of(invoicee);
	}

	public TradeSettlement1 setInvoicee(TradeParty1 invoicee) {
		this.invoicee = invoicee;
		return this;
	}

	public Optional<TradeParty1> getPayee() {
		return payee == null ? Optional.empty() : Optional.of(payee);
	}

	public TradeSettlement1 setPayee(TradeParty1 payee) {
		this.payee = payee;
		return this;
	}

	public Optional<TradeParty1> getPayer() {
		return payer == null ? Optional.empty() : Optional.of(payer);
	}

	public TradeSettlement1 setPayer(TradeParty1 payer) {
		this.payer = payer;
		return this;
	}

	public Optional<CurrencyReference2> getTaxCurrencyExchange() {
		return taxCurrencyExchange == null ? Optional.empty() : Optional.of(taxCurrencyExchange);
	}

	public TradeSettlement1 setTaxCurrencyExchange(CurrencyReference2 taxCurrencyExchange) {
		this.taxCurrencyExchange = taxCurrencyExchange;
		return this;
	}

	public Optional<CurrencyReference2> getInvoiceCurrencyExchange() {
		return invoiceCurrencyExchange == null ? Optional.empty() : Optional.of(invoiceCurrencyExchange);
	}

	public TradeSettlement1 setInvoiceCurrencyExchange(CurrencyReference2 invoiceCurrencyExchange) {
		this.invoiceCurrencyExchange = invoiceCurrencyExchange;
		return this;
	}

	public Optional<CurrencyReference2> getPaymentCurrencyExchange() {
		return paymentCurrencyExchange == null ? Optional.empty() : Optional.of(paymentCurrencyExchange);
	}

	public TradeSettlement1 setPaymentCurrencyExchange(CurrencyReference2 paymentCurrencyExchange) {
		this.paymentCurrencyExchange = paymentCurrencyExchange;
		return this;
	}

	public List<PaymentMeans1> getPaymentMeans() {
		return paymentMeans == null ? paymentMeans = new ArrayList<>() : paymentMeans;
	}

	public TradeSettlement1 setPaymentMeans(List<PaymentMeans1> paymentMeans) {
		this.paymentMeans = Objects.requireNonNull(paymentMeans);
		return this;
	}

	public List<SettlementTax1> getTax() {
		return tax == null ? tax = new ArrayList<>() : tax;
	}

	public TradeSettlement1 setTax(List<SettlementTax1> tax) {
		this.tax = Objects.requireNonNull(tax);
		return this;
	}

	public Optional<Period1> getBillingPeriod() {
		return billingPeriod == null ? Optional.empty() : Optional.of(billingPeriod);
	}

	public TradeSettlement1 setBillingPeriod(Period1 billingPeriod) {
		this.billingPeriod = billingPeriod;
		return this;
	}

	public List<SettlementAllowanceCharge1> getAllowanceCharge() {
		return allowanceCharge == null ? allowanceCharge = new ArrayList<>() : allowanceCharge;
	}

	public TradeSettlement1 setAllowanceCharge(List<SettlementAllowanceCharge1> allowanceCharge) {
		this.allowanceCharge = Objects.requireNonNull(allowanceCharge);
		return this;
	}

	public List<SettlementSubTotalCalculatedTax1> getSubTotalCalculatedTax() {
		return subTotalCalculatedTax == null ? subTotalCalculatedTax = new ArrayList<>() : subTotalCalculatedTax;
	}

	public TradeSettlement1 setSubTotalCalculatedTax(List<SettlementSubTotalCalculatedTax1> subTotalCalculatedTax) {
		this.subTotalCalculatedTax = Objects.requireNonNull(subTotalCalculatedTax);
		return this;
	}

	public List<ChargesDetails2> getLogisticsCharge() {
		return logisticsCharge == null ? logisticsCharge = new ArrayList<>() : logisticsCharge;
	}

	public TradeSettlement1 setLogisticsCharge(List<ChargesDetails2> logisticsCharge) {
		this.logisticsCharge = Objects.requireNonNull(logisticsCharge);
		return this;
	}

	public List<PaymentTerms3> getPaymentTerms() {
		return paymentTerms == null ? paymentTerms = new ArrayList<>() : paymentTerms;
	}

	public TradeSettlement1 setPaymentTerms(List<PaymentTerms3> paymentTerms) {
		this.paymentTerms = Objects.requireNonNull(paymentTerms);
		return this;
	}

	public SettlementMonetarySummation1 getMonetarySummation() {
		return monetarySummation;
	}

	public TradeSettlement1 setMonetarySummation(SettlementMonetarySummation1 monetarySummation) {
		this.monetarySummation = Objects.requireNonNull(monetarySummation);
		return this;
	}

	public List<DocumentAdjustment2> getAdjustmentAmountAndReason() {
		return adjustmentAmountAndReason == null ? adjustmentAmountAndReason = new ArrayList<>() : adjustmentAmountAndReason;
	}

	public TradeSettlement1 setAdjustmentAmountAndReason(List<DocumentAdjustment2> adjustmentAmountAndReason) {
		this.adjustmentAmountAndReason = Objects.requireNonNull(adjustmentAmountAndReason);
		return this;
	}

	public Optional<DocumentIdentification22> getInvoiceReferencedDocument() {
		return invoiceReferencedDocument == null ? Optional.empty() : Optional.of(invoiceReferencedDocument);
	}

	public TradeSettlement1 setInvoiceReferencedDocument(DocumentIdentification22 invoiceReferencedDocument) {
		this.invoiceReferencedDocument = invoiceReferencedDocument;
		return this;
	}

	public Optional<DocumentIdentification22> getProformaInvoiceReferencedDocument() {
		return proformaInvoiceReferencedDocument == null ? Optional.empty() : Optional.of(proformaInvoiceReferencedDocument);
	}

	public TradeSettlement1 setProformaInvoiceReferencedDocument(DocumentIdentification22 proformaInvoiceReferencedDocument) {
		this.proformaInvoiceReferencedDocument = proformaInvoiceReferencedDocument;
		return this;
	}

	public Optional<DocumentIdentification7> getLetterOfCreditReferencedDocument() {
		return letterOfCreditReferencedDocument == null ? Optional.empty() : Optional.of(letterOfCreditReferencedDocument);
	}

	public TradeSettlement1 setLetterOfCreditReferencedDocument(DocumentIdentification7 letterOfCreditReferencedDocument) {
		this.letterOfCreditReferencedDocument = letterOfCreditReferencedDocument;
		return this;
	}

	public List<FinancialCard1> getFinancialCard() {
		return financialCard == null ? financialCard = new ArrayList<>() : financialCard;
	}

	public TradeSettlement1 setFinancialCard(List<FinancialCard1> financialCard) {
		this.financialCard = Objects.requireNonNull(financialCard);
		return this;
	}

	public List<AccountingAccount1> getPurchaseAccountingAccount() {
		return purchaseAccountingAccount == null ? purchaseAccountingAccount = new ArrayList<>() : purchaseAccountingAccount;
	}

	public TradeSettlement1 setPurchaseAccountingAccount(List<AccountingAccount1> purchaseAccountingAccount) {
		this.purchaseAccountingAccount = Objects.requireNonNull(purchaseAccountingAccount);
		return this;
	}

	public List<Max35Text> getIssuerFactoringListIdentification() {
		return issuerFactoringListIdentification == null ? issuerFactoringListIdentification = new ArrayList<>() : issuerFactoringListIdentification;
	}

	public TradeSettlement1 setIssuerFactoringListIdentification(List<Max35Text> issuerFactoringListIdentification) {
		this.issuerFactoringListIdentification = Objects.requireNonNull(issuerFactoringListIdentification);
		return this;
	}

	public List<Max35Text> getIssuerFactoringAgreementIdentification() {
		return issuerFactoringAgreementIdentification == null ? issuerFactoringAgreementIdentification = new ArrayList<>() : issuerFactoringAgreementIdentification;
	}

	public TradeSettlement1 setIssuerFactoringAgreementIdentification(List<Max35Text> issuerFactoringAgreementIdentification) {
		this.issuerFactoringAgreementIdentification = Objects.requireNonNull(issuerFactoringAgreementIdentification);
		return this;
	}
}