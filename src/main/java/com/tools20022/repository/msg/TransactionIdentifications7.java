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
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.entity.Entry;
import com.tools20022.repository.entity.SecuritiesTradeIdentification;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides transaction type and identification information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications7#mmAccountOwnerTransactionIdentification
 * TransactionIdentifications7.mmAccountOwnerTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications7#mmAccountServicerTransactionIdentification
 * TransactionIdentifications7.mmAccountServicerTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications7#mmMarketInfrastructureTransactionIdentification
 * TransactionIdentifications7.mmMarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications7#mmCommonIdentification
 * TransactionIdentifications7.mmCommonIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
 * SecuritiesTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forTransactionIdentifications7
 * ConstraintNoAccountOwnerTransactionIdentificationRule.
 * forTransactionIdentifications7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#forTransactionIdentifications7
 * ConstraintCoexistenceIdentificationRule.forTransactionIdentifications7}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionIdentifications7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides transaction type and identification information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionIdentifications7", propOrder = {"accountOwnerTransactionIdentification", "accountServicerTransactionIdentification", "marketInfrastructureTransactionIdentification", "commonIdentification"})
public class TransactionIdentifications7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctOwnrTxId", required = true)
	protected RestrictedFINXMax16Text accountOwnerTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.Entry#mmAccountOwnerTransactionIdentification
	 * Entry.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications7
	 * TransactionIdentifications7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::RELA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the account owner (or the instructing party managing the account)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionIdentifications7, RestrictedFINXMax16Text> mmAccountOwnerTransactionIdentification = new MMMessageAttribute<TransactionIdentifications7, RestrictedFINXMax16Text>() {
		{
			businessElementTrace_lazy = () -> Entry.mmAccountOwnerTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionIdentifications7.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnrTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::RELA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account owner (or the instructing party managing the account).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public RestrictedFINXMax16Text getValue(TransactionIdentifications7 obj) {
			return obj.getAccountOwnerTransactionIdentification();
		}

		@Override
		public void setValue(TransactionIdentifications7 obj, RestrictedFINXMax16Text value) {
			obj.setAccountOwnerTransactionIdentification(value);
		}
	};
	@XmlElement(name = "AcctSvcrTxId")
	protected RestrictedFINXMax16Text accountServicerTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.Entry#mmAccountServicerTransactionIdentification
	 * Entry.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications7
	 * TransactionIdentifications7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::ASRF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionIdentifications7, Optional<RestrictedFINXMax16Text>> mmAccountServicerTransactionIdentification = new MMMessageAttribute<TransactionIdentifications7, Optional<RestrictedFINXMax16Text>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmAccountServicerTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionIdentifications7.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::ASRF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax16Text> getValue(TransactionIdentifications7 obj) {
			return obj.getAccountServicerTransactionIdentification();
		}

		@Override
		public void setValue(TransactionIdentifications7 obj, Optional<RestrictedFINXMax16Text> value) {
			obj.setAccountServicerTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "MktInfrstrctrTxId")
	protected RestrictedFINXMax16Text marketInfrastructureTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmMarketInfrastructureTransactionIdentification
	 * SecuritiesTradeIdentification.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications7
	 * TransactionIdentifications7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktInfrstrctrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::MITI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketInfrastructureTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionIdentifications7, Optional<RestrictedFINXMax16Text>> mmMarketInfrastructureTransactionIdentification = new MMMessageAttribute<TransactionIdentifications7, Optional<RestrictedFINXMax16Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmMarketInfrastructureTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionIdentifications7.mmObject();
			isDerived = false;
			xmlTag = "MktInfrstrctrTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::MITI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketInfrastructureTransactionIdentification";
			definition = "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax16Text> getValue(TransactionIdentifications7 obj) {
			return obj.getMarketInfrastructureTransactionIdentification();
		}

		@Override
		public void setValue(TransactionIdentifications7 obj, Optional<RestrictedFINXMax16Text> value) {
			obj.setMarketInfrastructureTransactionIdentification(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications7
	 * TransactionIdentifications7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::COMM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference agreed upon by the two trade counterparties to identify the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionIdentifications7, Optional<RestrictedFINXMax16Text>> mmCommonIdentification = new MMMessageAttribute<TransactionIdentifications7, Optional<RestrictedFINXMax16Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCommonIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionIdentifications7.mmObject();
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
		public Optional<RestrictedFINXMax16Text> getValue(TransactionIdentifications7 obj) {
			return obj.getCommonIdentification();
		}

		@Override
		public void setValue(TransactionIdentifications7 obj, Optional<RestrictedFINXMax16Text> value) {
			obj.setCommonIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionIdentifications7.mmAccountOwnerTransactionIdentification,
						com.tools20022.repository.msg.TransactionIdentifications7.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications7.mmMarketInfrastructureTransactionIdentification,
						com.tools20022.repository.msg.TransactionIdentifications7.mmCommonIdentification);
				trace_lazy = () -> SecuritiesTradeIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forTransactionIdentifications7,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.forTransactionIdentifications7);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TransactionIdentifications7";
				definition = "Provides transaction type and identification information.";
			}
		});
		return mmObject_lazy.get();
	}

	public RestrictedFINXMax16Text getAccountOwnerTransactionIdentification() {
		return accountOwnerTransactionIdentification;
	}

	public TransactionIdentifications7 setAccountOwnerTransactionIdentification(RestrictedFINXMax16Text accountOwnerTransactionIdentification) {
		this.accountOwnerTransactionIdentification = Objects.requireNonNull(accountOwnerTransactionIdentification);
		return this;
	}

	public Optional<RestrictedFINXMax16Text> getAccountServicerTransactionIdentification() {
		return accountServicerTransactionIdentification == null ? Optional.empty() : Optional.of(accountServicerTransactionIdentification);
	}

	public TransactionIdentifications7 setAccountServicerTransactionIdentification(RestrictedFINXMax16Text accountServicerTransactionIdentification) {
		this.accountServicerTransactionIdentification = accountServicerTransactionIdentification;
		return this;
	}

	public Optional<RestrictedFINXMax16Text> getMarketInfrastructureTransactionIdentification() {
		return marketInfrastructureTransactionIdentification == null ? Optional.empty() : Optional.of(marketInfrastructureTransactionIdentification);
	}

	public TransactionIdentifications7 setMarketInfrastructureTransactionIdentification(RestrictedFINXMax16Text marketInfrastructureTransactionIdentification) {
		this.marketInfrastructureTransactionIdentification = marketInfrastructureTransactionIdentification;
		return this;
	}

	public Optional<RestrictedFINXMax16Text> getCommonIdentification() {
		return commonIdentification == null ? Optional.empty() : Optional.of(commonIdentification);
	}

	public TransactionIdentifications7 setCommonIdentification(RestrictedFINXMax16Text commonIdentification) {
		this.commonIdentification = commonIdentification;
		return this;
	}
}