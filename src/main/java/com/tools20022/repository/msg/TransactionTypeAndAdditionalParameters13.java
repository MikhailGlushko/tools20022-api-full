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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06;
import com.tools20022.repository.codeset.DeliveryReceiptType2Code;
import com.tools20022.repository.codeset.SecuritiesFinancingTransactionType1Code;
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesSettlement;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Securities financing transaction identification information, type (repurchase
 * agreement, reverse repurchase agreement, securities lending or securities
 * borrowing) and other parameters.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13#mmSecuritiesFinancingTransactionType
 * TransactionTypeAndAdditionalParameters13.mmSecuritiesFinancingTransactionType
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13#mmPayment
 * TransactionTypeAndAdditionalParameters13.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13#mmCommonIdentification
 * TransactionTypeAndAdditionalParameters13.mmCommonIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13#mmReconciliationIndicator
 * TransactionTypeAndAdditionalParameters13.mmReconciliationIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmTransactionTypeAndAdditionalParameters
 * SecuritiesFinancingInstruction002V06.mmTransactionTypeAndAdditionalParameters
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionTypeAndAdditionalParameters13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Securities financing transaction identification information, type (repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing) and other parameters."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionTypeAndAdditionalParameters13", propOrder = {"securitiesFinancingTransactionType", "payment", "commonIdentification", "reconciliationIndicator"})
public class TransactionTypeAndAdditionalParameters13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesFincgTxTp", required = true)
	protected SecuritiesFinancingTransactionType1Code securitiesFinancingTransactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType1Code
	 * SecuritiesFinancingTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTransactionType
	 * SecuritiesTrade.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13
	 * TransactionTypeAndAdditionalParameters13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgTxTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of securities financing transaction, that is, repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::REPT (repo) or :22F::SETR
	 * (lending/borrowing)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionTypeAndAdditionalParameters13, SecuritiesFinancingTransactionType1Code> mmSecuritiesFinancingTransactionType = new MMMessageAttribute<TransactionTypeAndAdditionalParameters13, SecuritiesFinancingTransactionType1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTransactionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13.mmObject();
			isDerived = false;
			xmlTag = "SctiesFincgTxTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::REPT (repo) or :22F::SETR (lending/borrowing)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingTransactionType";
			definition = "Specifies the type of securities financing transaction, that is, repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesFinancingTransactionType1Code.mmObject();
		}

		@Override
		public SecuritiesFinancingTransactionType1Code getValue(TransactionTypeAndAdditionalParameters13 obj) {
			return obj.getSecuritiesFinancingTransactionType();
		}

		@Override
		public void setValue(TransactionTypeAndAdditionalParameters13 obj, SecuritiesFinancingTransactionType1Code value) {
			obj.setSecuritiesFinancingTransactionType(value);
		}
	};
	@XmlElement(name = "Pmt", required = true)
	protected DeliveryReceiptType2Code payment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType2Code
	 * DeliveryReceiptType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementType
	 * SecuritiesSettlement.mmSettlementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13
	 * TransactionTypeAndAdditionalParameters13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the transaction is to be settled, for example, against payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::PAYM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionTypeAndAdditionalParameters13, DeliveryReceiptType2Code> mmPayment = new MMMessageAttribute<TransactionTypeAndAdditionalParameters13, DeliveryReceiptType2Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementType;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13.mmObject();
			isDerived = false;
			xmlTag = "Pmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::PAYM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			definition = "Specifies how the transaction is to be settled, for example, against payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeliveryReceiptType2Code.mmObject();
		}

		@Override
		public DeliveryReceiptType2Code getValue(TransactionTypeAndAdditionalParameters13 obj) {
			return obj.getPayment();
		}

		@Override
		public void setValue(TransactionTypeAndAdditionalParameters13 obj, DeliveryReceiptType2Code value) {
			obj.setPayment(value);
		}
	};
	@XmlElement(name = "CmonId")
	protected RestrictedFINXMax16Text commonIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCommonIdentification
	 * TradeIdentification.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13
	 * TransactionTypeAndAdditionalParameters13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference agreed upon by the two trade counterparties to identify the trade."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::COMM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionTypeAndAdditionalParameters13, Optional<RestrictedFINXMax16Text>> mmCommonIdentification = new MMMessageAttribute<TransactionTypeAndAdditionalParameters13, Optional<RestrictedFINXMax16Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCommonIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13.mmObject();
			isDerived = false;
			xmlTag = "CmonId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::COMM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonIdentification";
			definition = "Unique reference agreed upon by the two trade counterparties to identify the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax16Text> getValue(TransactionTypeAndAdditionalParameters13 obj) {
			return obj.getCommonIdentification();
		}

		@Override
		public void setValue(TransactionTypeAndAdditionalParameters13 obj, Optional<RestrictedFINXMax16Text> value) {
			obj.setCommonIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RcncltnInd")
	protected YesNoIndicator reconciliationIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13
	 * TransactionTypeAndAdditionalParameters13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement transaction has already been sent on the market. It is sent by an account owner to an account servicer for reconciliation purposes."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :23G:4!c/RECO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionTypeAndAdditionalParameters13, Optional<YesNoIndicator>> mmReconciliationIndicator = new MMMessageAttribute<TransactionTypeAndAdditionalParameters13, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13.mmObject();
			isDerived = false;
			xmlTag = "RcncltnInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":23G:4!c/RECO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIndicator";
			definition = "Settlement transaction has already been sent on the market. It is sent by an account owner to an account servicer for reconciliation purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(TransactionTypeAndAdditionalParameters13 obj) {
			return obj.getReconciliationIndicator();
		}

		@Override
		public void setValue(TransactionTypeAndAdditionalParameters13 obj, Optional<YesNoIndicator> value) {
			obj.setReconciliationIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13.mmSecuritiesFinancingTransactionType,
						com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13.mmPayment, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13.mmCommonIdentification,
						com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters13.mmReconciliationIndicator);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesFinancingInstruction002V06.mmTransactionTypeAndAdditionalParameters);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionTypeAndAdditionalParameters13";
				definition = "Securities financing transaction identification information, type (repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing) and other parameters.";
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesFinancingTransactionType1Code getSecuritiesFinancingTransactionType() {
		return securitiesFinancingTransactionType;
	}

	public TransactionTypeAndAdditionalParameters13 setSecuritiesFinancingTransactionType(SecuritiesFinancingTransactionType1Code securitiesFinancingTransactionType) {
		this.securitiesFinancingTransactionType = Objects.requireNonNull(securitiesFinancingTransactionType);
		return this;
	}

	public DeliveryReceiptType2Code getPayment() {
		return payment;
	}

	public TransactionTypeAndAdditionalParameters13 setPayment(DeliveryReceiptType2Code payment) {
		this.payment = Objects.requireNonNull(payment);
		return this;
	}

	public Optional<RestrictedFINXMax16Text> getCommonIdentification() {
		return commonIdentification == null ? Optional.empty() : Optional.of(commonIdentification);
	}

	public TransactionTypeAndAdditionalParameters13 setCommonIdentification(RestrictedFINXMax16Text commonIdentification) {
		this.commonIdentification = commonIdentification;
		return this;
	}

	public Optional<YesNoIndicator> getReconciliationIndicator() {
		return reconciliationIndicator == null ? Optional.empty() : Optional.of(reconciliationIndicator);
	}

	public TransactionTypeAndAdditionalParameters13 setReconciliationIndicator(YesNoIndicator reconciliationIndicator) {
		this.reconciliationIndicator = reconciliationIndicator;
		return this;
	}
}