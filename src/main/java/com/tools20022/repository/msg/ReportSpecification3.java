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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Country;
import com.tools20022.repository.entity.PaymentIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BICIdentification1;
import com.tools20022.repository.msg.PartyIdentification9;
import com.tools20022.repository.msg.PendingActivity1;
import com.tools20022.repository.msg.TransactionStatus1;
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
 * Specifies the parameters for which a transaction report must be generated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportSpecification3#mmTransactionIdentification
 * ReportSpecification3.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportSpecification3#mmTransactionStatus
 * ReportSpecification3.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportSpecification3#mmSubmitterTransactionReference
 * ReportSpecification3.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportSpecification3#mmEntitiesToBeReported
 * ReportSpecification3.mmEntitiesToBeReported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportSpecification3#mmCorrespondent
 * ReportSpecification3.mmCorrespondent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportSpecification3#mmBuyer
 * ReportSpecification3.mmBuyer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportSpecification3#mmSeller
 * ReportSpecification3.mmSeller}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportSpecification3#mmBuyerCountry
 * ReportSpecification3.mmBuyerCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportSpecification3#mmSellerCountry
 * ReportSpecification3.mmSellerCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportSpecification3#mmCorrespondentCountry
 * ReportSpecification3.mmCorrespondentCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportSpecification3#mmPendingRequestForAction
 * ReportSpecification3.mmPendingRequestForAction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReportSpecification3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the parameters for which a transaction report must be generated."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReportSpecification3", propOrder = {"transactionIdentification", "transactionStatus", "submitterTransactionReference", "entitiesToBeReported", "correspondent", "buyer", "seller", "buyerCountry", "sellerCountry",
		"correspondentCountry", "pendingRequestForAction"})
public class ReportSpecification3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId")
	protected List<Max35Text> transactionIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification3
	 * ReportSpecification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by the TSU to a transaction, for which the TSU must generate a report."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportSpecification3, List<Max35Text>> mmTransactionIdentification = new MMMessageAttribute<ReportSpecification3, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportSpecification3.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the TSU to a transaction, for which the TSU must generate a report.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(ReportSpecification3 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(ReportSpecification3 obj, List<Max35Text> value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "TxSts")
	protected List<TransactionStatus1> transactionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionStatus1
	 * TransactionStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification3
	 * ReportSpecification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the status of the transaction by means of a code."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportSpecification3, List<TransactionStatus1>> mmTransactionStatus = new MMMessageAssociationEnd<ReportSpecification3, List<TransactionStatus1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportSpecification3.mmObject();
			isDerived = false;
			xmlTag = "TxSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionStatus";
			definition = "Identifies the status of the transaction by means of a code.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionStatus1.mmObject();
		}

		@Override
		public List<TransactionStatus1> getValue(ReportSpecification3 obj) {
			return obj.getTransactionStatus();
		}

		@Override
		public void setValue(ReportSpecification3 obj, List<TransactionStatus1> value) {
			obj.setTransactionStatus(value);
		}
	};
	@XmlElement(name = "SubmitrTxRef")
	protected List<Max35Text> submitterTransactionReference;
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
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification3
	 * ReportSpecification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmitrTxRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmitterTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the identification of a transaction of a user, for which the TSU must generate a report."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportSpecification3, List<Max35Text>> mmSubmitterTransactionReference = new MMMessageAttribute<ReportSpecification3, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportSpecification3.mmObject();
			isDerived = false;
			xmlTag = "SubmitrTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitterTransactionReference";
			definition = "Reference to the identification of a transaction of a user, for which the TSU must generate a report.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(ReportSpecification3 obj) {
			return obj.getSubmitterTransactionReference();
		}

		@Override
		public void setValue(ReportSpecification3 obj, List<Max35Text> value) {
			obj.setSubmitterTransactionReference(value);
		}
	};
	@XmlElement(name = "NttiesToBeRptd")
	protected List<BICIdentification1> entitiesToBeReported;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification3
	 * ReportSpecification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NttiesToBeRptd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitiesToBeReported"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a list of entities for which the TSU must generate a report."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportSpecification3, List<BICIdentification1>> mmEntitiesToBeReported = new MMMessageAssociationEnd<ReportSpecification3, List<BICIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportSpecification3.mmObject();
			isDerived = false;
			xmlTag = "NttiesToBeRptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitiesToBeReported";
			definition = "Specifies a list of entities for which the TSU must generate a report.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BICIdentification1.mmObject();
		}

		@Override
		public List<BICIdentification1> getValue(ReportSpecification3 obj) {
			return obj.getEntitiesToBeReported();
		}

		@Override
		public void setValue(ReportSpecification3 obj, List<BICIdentification1> value) {
			obj.setEntitiesToBeReported(value);
		}
	};
	@XmlElement(name = "Crspdt")
	protected List<BICIdentification1> correspondent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification3
	 * ReportSpecification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Crspdt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Correspondent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that is the counterparty to the trade transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportSpecification3, List<BICIdentification1>> mmCorrespondent = new MMMessageAssociationEnd<ReportSpecification3, List<BICIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportSpecification3.mmObject();
			isDerived = false;
			xmlTag = "Crspdt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Correspondent";
			definition = "Financial institution that is the counterparty to the trade transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BICIdentification1.mmObject();
		}

		@Override
		public List<BICIdentification1> getValue(ReportSpecification3 obj) {
			return obj.getCorrespondent();
		}

		@Override
		public void setValue(ReportSpecification3 obj, List<BICIdentification1> value) {
			obj.setCorrespondent(value);
		}
	};
	@XmlElement(name = "Buyr")
	protected List<PartyIdentification9> buyer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification9
	 * PartyIdentification9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification3
	 * ReportSpecification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Buyr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that buys goods or services, or a financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportSpecification3, List<PartyIdentification9>> mmBuyer = new MMMessageAssociationEnd<ReportSpecification3, List<PartyIdentification9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportSpecification3.mmObject();
			isDerived = false;
			xmlTag = "Buyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Party that buys goods or services, or a financial instrument.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification9.mmObject();
		}

		@Override
		public List<PartyIdentification9> getValue(ReportSpecification3 obj) {
			return obj.getBuyer();
		}

		@Override
		public void setValue(ReportSpecification3 obj, List<PartyIdentification9> value) {
			obj.setBuyer(value);
		}
	};
	@XmlElement(name = "Sellr")
	protected List<PartyIdentification9> seller;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification9
	 * PartyIdentification9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification3
	 * ReportSpecification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sellr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that sells goods or services, or a financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportSpecification3, List<PartyIdentification9>> mmSeller = new MMMessageAssociationEnd<ReportSpecification3, List<PartyIdentification9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportSpecification3.mmObject();
			isDerived = false;
			xmlTag = "Sellr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Party that sells goods or services, or a financial instrument.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification9.mmObject();
		}

		@Override
		public List<PartyIdentification9> getValue(ReportSpecification3 obj) {
			return obj.getSeller();
		}

		@Override
		public void setValue(ReportSpecification3 obj, List<PartyIdentification9> value) {
			obj.setSeller(value);
		}
	};
	@XmlElement(name = "BuyrCtry")
	protected List<CountryCode> buyerCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification3
	 * ReportSpecification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrCtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the buyer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportSpecification3, List<CountryCode>> mmBuyerCountry = new MMMessageAttribute<ReportSpecification3, List<CountryCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportSpecification3.mmObject();
			isDerived = false;
			xmlTag = "BuyrCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerCountry";
			definition = "Country of the buyer.";
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public List<CountryCode> getValue(ReportSpecification3 obj) {
			return obj.getBuyerCountry();
		}

		@Override
		public void setValue(ReportSpecification3 obj, List<CountryCode> value) {
			obj.setBuyerCountry(value);
		}
	};
	@XmlElement(name = "SellrCtry")
	protected List<CountryCode> sellerCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification3
	 * ReportSpecification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrCtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the seller."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportSpecification3, List<CountryCode>> mmSellerCountry = new MMMessageAttribute<ReportSpecification3, List<CountryCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportSpecification3.mmObject();
			isDerived = false;
			xmlTag = "SellrCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerCountry";
			definition = "Country of the seller.";
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public List<CountryCode> getValue(ReportSpecification3 obj) {
			return obj.getSellerCountry();
		}

		@Override
		public void setValue(ReportSpecification3 obj, List<CountryCode> value) {
			obj.setSellerCountry(value);
		}
	};
	@XmlElement(name = "CrspdtCtry")
	protected List<CountryCode> correspondentCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification3
	 * ReportSpecification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrspdtCtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country of the financial institution which is the other party to the trade."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportSpecification3, List<CountryCode>> mmCorrespondentCountry = new MMMessageAttribute<ReportSpecification3, List<CountryCode>>() {
		{
			businessComponentTrace_lazy = () -> Country.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportSpecification3.mmObject();
			isDerived = false;
			xmlTag = "CrspdtCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentCountry";
			definition = "Country of the financial institution which is the other party to the trade.";
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public List<CountryCode> getValue(ReportSpecification3 obj) {
			return obj.getCorrespondentCountry();
		}

		@Override
		public void setValue(ReportSpecification3 obj, List<CountryCode> value) {
			obj.setCorrespondentCountry(value);
		}
	};
	@XmlElement(name = "PdgReqForActn")
	protected List<PendingActivity1> pendingRequestForAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PendingActivity1
	 * PendingActivity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification3
	 * ReportSpecification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgReqForActn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingRequestForAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a pending request for action for which the TSU must generate a report."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportSpecification3, List<PendingActivity1>> mmPendingRequestForAction = new MMMessageAssociationEnd<ReportSpecification3, List<PendingActivity1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportSpecification3.mmObject();
			isDerived = false;
			xmlTag = "PdgReqForActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingRequestForAction";
			definition = "Specifies a pending request for action for which the TSU must generate a report.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PendingActivity1.mmObject();
		}

		@Override
		public List<PendingActivity1> getValue(ReportSpecification3 obj) {
			return obj.getPendingRequestForAction();
		}

		@Override
		public void setValue(ReportSpecification3 obj, List<PendingActivity1> value) {
			obj.setPendingRequestForAction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportSpecification3.mmTransactionIdentification, com.tools20022.repository.msg.ReportSpecification3.mmTransactionStatus,
						com.tools20022.repository.msg.ReportSpecification3.mmSubmitterTransactionReference, com.tools20022.repository.msg.ReportSpecification3.mmEntitiesToBeReported,
						com.tools20022.repository.msg.ReportSpecification3.mmCorrespondent, com.tools20022.repository.msg.ReportSpecification3.mmBuyer, com.tools20022.repository.msg.ReportSpecification3.mmSeller,
						com.tools20022.repository.msg.ReportSpecification3.mmBuyerCountry, com.tools20022.repository.msg.ReportSpecification3.mmSellerCountry, com.tools20022.repository.msg.ReportSpecification3.mmCorrespondentCountry,
						com.tools20022.repository.msg.ReportSpecification3.mmPendingRequestForAction);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ReportSpecification3";
				definition = "Specifies the parameters for which a transaction report must be generated.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<Max35Text> getTransactionIdentification() {
		return transactionIdentification == null ? transactionIdentification = new ArrayList<>() : transactionIdentification;
	}

	public ReportSpecification3 setTransactionIdentification(List<Max35Text> transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public List<TransactionStatus1> getTransactionStatus() {
		return transactionStatus == null ? transactionStatus = new ArrayList<>() : transactionStatus;
	}

	public ReportSpecification3 setTransactionStatus(List<TransactionStatus1> transactionStatus) {
		this.transactionStatus = Objects.requireNonNull(transactionStatus);
		return this;
	}

	public List<Max35Text> getSubmitterTransactionReference() {
		return submitterTransactionReference == null ? submitterTransactionReference = new ArrayList<>() : submitterTransactionReference;
	}

	public ReportSpecification3 setSubmitterTransactionReference(List<Max35Text> submitterTransactionReference) {
		this.submitterTransactionReference = Objects.requireNonNull(submitterTransactionReference);
		return this;
	}

	public List<BICIdentification1> getEntitiesToBeReported() {
		return entitiesToBeReported == null ? entitiesToBeReported = new ArrayList<>() : entitiesToBeReported;
	}

	public ReportSpecification3 setEntitiesToBeReported(List<BICIdentification1> entitiesToBeReported) {
		this.entitiesToBeReported = Objects.requireNonNull(entitiesToBeReported);
		return this;
	}

	public List<BICIdentification1> getCorrespondent() {
		return correspondent == null ? correspondent = new ArrayList<>() : correspondent;
	}

	public ReportSpecification3 setCorrespondent(List<BICIdentification1> correspondent) {
		this.correspondent = Objects.requireNonNull(correspondent);
		return this;
	}

	public List<PartyIdentification9> getBuyer() {
		return buyer == null ? buyer = new ArrayList<>() : buyer;
	}

	public ReportSpecification3 setBuyer(List<PartyIdentification9> buyer) {
		this.buyer = Objects.requireNonNull(buyer);
		return this;
	}

	public List<PartyIdentification9> getSeller() {
		return seller == null ? seller = new ArrayList<>() : seller;
	}

	public ReportSpecification3 setSeller(List<PartyIdentification9> seller) {
		this.seller = Objects.requireNonNull(seller);
		return this;
	}

	public List<CountryCode> getBuyerCountry() {
		return buyerCountry == null ? buyerCountry = new ArrayList<>() : buyerCountry;
	}

	public ReportSpecification3 setBuyerCountry(List<CountryCode> buyerCountry) {
		this.buyerCountry = Objects.requireNonNull(buyerCountry);
		return this;
	}

	public List<CountryCode> getSellerCountry() {
		return sellerCountry == null ? sellerCountry = new ArrayList<>() : sellerCountry;
	}

	public ReportSpecification3 setSellerCountry(List<CountryCode> sellerCountry) {
		this.sellerCountry = Objects.requireNonNull(sellerCountry);
		return this;
	}

	public List<CountryCode> getCorrespondentCountry() {
		return correspondentCountry == null ? correspondentCountry = new ArrayList<>() : correspondentCountry;
	}

	public ReportSpecification3 setCorrespondentCountry(List<CountryCode> correspondentCountry) {
		this.correspondentCountry = Objects.requireNonNull(correspondentCountry);
		return this;
	}

	public List<PendingActivity1> getPendingRequestForAction() {
		return pendingRequestForAction == null ? pendingRequestForAction = new ArrayList<>() : pendingRequestForAction;
	}

	public ReportSpecification3 setPendingRequestForAction(List<PendingActivity1> pendingRequestForAction) {
		this.pendingRequestForAction = Objects.requireNonNull(pendingRequestForAction);
		return this;
	}
}