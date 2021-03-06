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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.TypeTransactionTotals2Code;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.ReconciliationTransaction;
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
 * Transaction totals during the reconciliation period, for a certain type of
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals3#mmPOIGroupIdentification
 * TransactionTotals3.mmPOIGroupIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals3#mmCardProductProfile
 * TransactionTotals3.mmCardProductProfile}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals3#mmCurrency
 * TransactionTotals3.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals3#mmType
 * TransactionTotals3.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals3#mmTotalNumber
 * TransactionTotals3.mmTotalNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals3#mmCumulativeAmount
 * TransactionTotals3.mmCumulativeAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionTotals3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transaction totals during the reconciliation period, for a certain type of transaction."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals4
 * TransactionTotals4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals7
 * TransactionTotals7}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TransactionTotals2
 * TransactionTotals2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionTotals3", propOrder = {"pOIGroupIdentification", "cardProductProfile", "currency", "type", "totalNumber", "cumulativeAmount"})
public class TransactionTotals3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "POIGrpId")
	protected Max35Text pOIGroupIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals3
	 * TransactionTotals3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIGrpId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIGroupIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier assigned by the merchant identifying a set of POI terminals performing some categories of transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals7#mmPOIGroupIdentification
	 * TransactionTotals7.mmPOIGroupIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals2#mmPOIGroupIdentification
	 * TransactionTotals2.mmPOIGroupIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionTotals3, Optional<Max35Text>> mmPOIGroupIdentification = new MMMessageAttribute<TransactionTotals3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals3.mmObject();
			isDerived = false;
			xmlTag = "POIGrpId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIGroupIdentification";
			definition = "Identifier assigned by the merchant identifying a set of POI terminals performing some categories of transactions.";
			nextVersions_lazy = () -> Arrays.asList(TransactionTotals7.mmPOIGroupIdentification);
			previousVersion_lazy = () -> TransactionTotals2.mmPOIGroupIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TransactionTotals3 obj) {
			return obj.getPOIGroupIdentification();
		}

		@Override
		public void setValue(TransactionTotals3 obj, Optional<Max35Text> value) {
			obj.setPOIGroupIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CardPdctPrfl")
	protected Max35Text cardProductProfile;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals3
	 * TransactionTotals3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardPdctPrfl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardProductProfile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Category of cards related the acceptance processing rules defined by the acquirer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals7#mmCardProductProfile
	 * TransactionTotals7.mmCardProductProfile}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals2#mmCardProductProfile
	 * TransactionTotals2.mmCardProductProfile}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionTotals3, Optional<Max35Text>> mmCardProductProfile = new MMMessageAttribute<TransactionTotals3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals3.mmObject();
			isDerived = false;
			xmlTag = "CardPdctPrfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardProductProfile";
			definition = "Category of cards related the acceptance processing rules defined by the acquirer.";
			nextVersions_lazy = () -> Arrays.asList(TransactionTotals7.mmCardProductProfile);
			previousVersion_lazy = () -> TransactionTotals2.mmCardProductProfile;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TransactionTotals3 obj) {
			return obj.getCardProductProfile();
		}

		@Override
		public void setValue(TransactionTotals3 obj, Optional<Max35Text> value) {
			obj.setCardProductProfile(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy")
	protected CurrencyCode currency;
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
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmCurrency
	 * ReconciliationTransaction.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals3
	 * TransactionTotals3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency associated with the transaction totals."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals7#mmCurrency
	 * TransactionTotals7.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals2#mmCurrency
	 * TransactionTotals2.mmCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionTotals3, Optional<CurrencyCode>> mmCurrency = new MMMessageAttribute<TransactionTotals3, Optional<CurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals3.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency associated with the transaction totals.";
			nextVersions_lazy = () -> Arrays.asList(TransactionTotals7.mmCurrency);
			previousVersion_lazy = () -> TransactionTotals2.mmCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public Optional<CurrencyCode> getValue(TransactionTotals3 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(TransactionTotals3 obj, Optional<CurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected TypeTransactionTotals2Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotals2Code
	 * TypeTransactionTotals2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmTransactionType
	 * ReconciliationTransaction.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals3
	 * TransactionTotals3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the type of transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals7#mmType
	 * TransactionTotals7.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals2#mmType
	 * TransactionTotals2.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionTotals3, TypeTransactionTotals2Code> mmType = new MMMessageAttribute<TransactionTotals3, TypeTransactionTotals2Code>() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmTransactionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals3.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Identification of the type of transaction.";
			nextVersions_lazy = () -> Arrays.asList(TransactionTotals7.mmType);
			previousVersion_lazy = () -> TransactionTotals2.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeTransactionTotals2Code.mmObject();
		}

		@Override
		public TypeTransactionTotals2Code getValue(TransactionTotals3 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(TransactionTotals3 obj, TypeTransactionTotals2Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "TtlNb", required = true)
	protected Number totalNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals3
	 * TransactionTotals3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of transactions during a reconciliation period."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals7#mmTotalNumber
	 * TransactionTotals7.mmTotalNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals2#mmTotalNumber
	 * TransactionTotals2.mmTotalNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionTotals3, Number> mmTotalNumber = new MMMessageAttribute<TransactionTotals3, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals3.mmObject();
			isDerived = false;
			xmlTag = "TtlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumber";
			definition = "Total number of transactions during a reconciliation period.";
			nextVersions_lazy = () -> Arrays.asList(TransactionTotals7.mmTotalNumber);
			previousVersion_lazy = () -> TransactionTotals2.mmTotalNumber;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(TransactionTotals3 obj) {
			return obj.getTotalNumber();
		}

		@Override
		public void setValue(TransactionTotals3 obj, Number value) {
			obj.setTotalNumber(value);
		}
	};
	@XmlElement(name = "CmltvAmt", required = true)
	protected ImpliedCurrencyAndAmount cumulativeAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmCumulativeAmount
	 * ReconciliationTransaction.mmCumulativeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals3
	 * TransactionTotals3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmltvAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumulativeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of a collection of transactions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals7#mmCumulativeAmount
	 * TransactionTotals7.mmCumulativeAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals2#mmCumulativeAmount
	 * TransactionTotals2.mmCumulativeAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionTotals3, ImpliedCurrencyAndAmount> mmCumulativeAmount = new MMMessageAttribute<TransactionTotals3, ImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmCumulativeAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals3.mmObject();
			isDerived = false;
			xmlTag = "CmltvAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumulativeAmount";
			definition = "Total amount of a collection of transactions.";
			nextVersions_lazy = () -> Arrays.asList(TransactionTotals7.mmCumulativeAmount);
			previousVersion_lazy = () -> TransactionTotals2.mmCumulativeAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(TransactionTotals3 obj) {
			return obj.getCumulativeAmount();
		}

		@Override
		public void setValue(TransactionTotals3 obj, ImpliedCurrencyAndAmount value) {
			obj.setCumulativeAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionTotals3.mmPOIGroupIdentification, com.tools20022.repository.msg.TransactionTotals3.mmCardProductProfile,
						com.tools20022.repository.msg.TransactionTotals3.mmCurrency, com.tools20022.repository.msg.TransactionTotals3.mmType, com.tools20022.repository.msg.TransactionTotals3.mmTotalNumber,
						com.tools20022.repository.msg.TransactionTotals3.mmCumulativeAmount);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TransactionTotals3";
				definition = "Transaction totals during the reconciliation period, for a certain type of transaction.";
				nextVersions_lazy = () -> Arrays.asList(TransactionTotals4.mmObject(), TransactionTotals7.mmObject());
				previousVersion_lazy = () -> TransactionTotals2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getPOIGroupIdentification() {
		return pOIGroupIdentification == null ? Optional.empty() : Optional.of(pOIGroupIdentification);
	}

	public TransactionTotals3 setPOIGroupIdentification(Max35Text pOIGroupIdentification) {
		this.pOIGroupIdentification = pOIGroupIdentification;
		return this;
	}

	public Optional<Max35Text> getCardProductProfile() {
		return cardProductProfile == null ? Optional.empty() : Optional.of(cardProductProfile);
	}

	public TransactionTotals3 setCardProductProfile(Max35Text cardProductProfile) {
		this.cardProductProfile = cardProductProfile;
		return this;
	}

	public Optional<CurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public TransactionTotals3 setCurrency(CurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public TypeTransactionTotals2Code getType() {
		return type;
	}

	public TransactionTotals3 setType(TypeTransactionTotals2Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Number getTotalNumber() {
		return totalNumber;
	}

	public TransactionTotals3 setTotalNumber(Number totalNumber) {
		this.totalNumber = Objects.requireNonNull(totalNumber);
		return this;
	}

	public ImpliedCurrencyAndAmount getCumulativeAmount() {
		return cumulativeAmount;
	}

	public TransactionTotals3 setCumulativeAmount(ImpliedCurrencyAndAmount cumulativeAmount) {
		this.cumulativeAmount = Objects.requireNonNull(cumulativeAmount);
		return this;
	}
}