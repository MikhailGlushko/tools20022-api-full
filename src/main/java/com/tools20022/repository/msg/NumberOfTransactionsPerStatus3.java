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
import com.tools20022.repository.codeset.TransactionIndividualStatus3Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
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
 * Set of elements used to provide detailed information on the number of
 * transactions that are reported with a specific transaction status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3#mmDetailedNumberOfTransactions
 * NumberOfTransactionsPerStatus3.mmDetailedNumberOfTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3#mmDetailedStatus
 * NumberOfTransactionsPerStatus3.mmDetailedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3#mmDetailedControlSum
 * NumberOfTransactionsPerStatus3.mmDetailedControlSum}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NumberOfTransactionsPerStatus3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide detailed information on the number of transactions that are reported with a specific transaction status."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NumberOfItemsPerStatus1
 * NumberOfItemsPerStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus5
 * NumberOfTransactionsPerStatus5}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NumberOfTransactionsPerStatus3", propOrder = {"detailedNumberOfTransactions", "detailedStatus", "detailedControlSum"})
public class NumberOfTransactionsPerStatus3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DtldNbOfTxs", required = true)
	protected Max15NumericText detailedNumberOfTransactions;
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
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3
	 * NumberOfTransactionsPerStatus3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtldNbOfTxs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedNumberOfTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of individual transactions contained in the message, detailed per status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NumberOfItemsPerStatus1#mmNumberOfItems
	 * NumberOfItemsPerStatus1.mmNumberOfItems}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus5#mmDetailedNumberOfTransactions
	 * NumberOfTransactionsPerStatus5.mmDetailedNumberOfTransactions}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NumberOfTransactionsPerStatus3, Max15NumericText> mmDetailedNumberOfTransactions = new MMMessageAttribute<NumberOfTransactionsPerStatus3, Max15NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NumberOfTransactionsPerStatus3.mmObject();
			isDerived = false;
			xmlTag = "DtldNbOfTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedNumberOfTransactions";
			definition = "Number of individual transactions contained in the message, detailed per status.";
			nextVersions_lazy = () -> Arrays.asList(NumberOfItemsPerStatus1.mmNumberOfItems, NumberOfTransactionsPerStatus5.mmDetailedNumberOfTransactions);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Max15NumericText getValue(NumberOfTransactionsPerStatus3 obj) {
			return obj.getDetailedNumberOfTransactions();
		}

		@Override
		public void setValue(NumberOfTransactionsPerStatus3 obj, Max15NumericText value) {
			obj.setDetailedNumberOfTransactions(value);
		}
	};
	@XmlElement(name = "DtldSts", required = true)
	protected TransactionIndividualStatus3Code detailedStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionIndividualStatus3Code
	 * TransactionIndividualStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3
	 * NumberOfTransactionsPerStatus3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtldSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common transaction status for all individual transactions reported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NumberOfItemsPerStatus1#mmStatus
	 * NumberOfItemsPerStatus1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus5#mmDetailedStatus
	 * NumberOfTransactionsPerStatus5.mmDetailedStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NumberOfTransactionsPerStatus3, TransactionIndividualStatus3Code> mmDetailedStatus = new MMMessageAttribute<NumberOfTransactionsPerStatus3, TransactionIndividualStatus3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NumberOfTransactionsPerStatus3.mmObject();
			isDerived = false;
			xmlTag = "DtldSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedStatus";
			definition = "Common transaction status for all individual transactions reported.";
			nextVersions_lazy = () -> Arrays.asList(NumberOfItemsPerStatus1.mmStatus, NumberOfTransactionsPerStatus5.mmDetailedStatus);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionIndividualStatus3Code.mmObject();
		}

		@Override
		public TransactionIndividualStatus3Code getValue(NumberOfTransactionsPerStatus3 obj) {
			return obj.getDetailedStatus();
		}

		@Override
		public void setValue(NumberOfTransactionsPerStatus3 obj, TransactionIndividualStatus3Code value) {
			obj.setDetailedStatus(value);
		}
	};
	@XmlElement(name = "DtldCtrlSum")
	protected DecimalNumber detailedControlSum;
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
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3
	 * NumberOfTransactionsPerStatus3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtldCtrlSum"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedControlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total of all individual amounts included in the message, irrespective of currencies, detailed per status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus5#mmDetailedControlSum
	 * NumberOfTransactionsPerStatus5.mmDetailedControlSum}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NumberOfTransactionsPerStatus3, Optional<DecimalNumber>> mmDetailedControlSum = new MMMessageAttribute<NumberOfTransactionsPerStatus3, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NumberOfTransactionsPerStatus3.mmObject();
			isDerived = false;
			xmlTag = "DtldCtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedControlSum";
			definition = "Total of all individual amounts included in the message, irrespective of currencies, detailed per status.";
			nextVersions_lazy = () -> Arrays.asList(NumberOfTransactionsPerStatus5.mmDetailedControlSum);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(NumberOfTransactionsPerStatus3 obj) {
			return obj.getDetailedControlSum();
		}

		@Override
		public void setValue(NumberOfTransactionsPerStatus3 obj, Optional<DecimalNumber> value) {
			obj.setDetailedControlSum(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NumberOfTransactionsPerStatus3.mmDetailedNumberOfTransactions, com.tools20022.repository.msg.NumberOfTransactionsPerStatus3.mmDetailedStatus,
						com.tools20022.repository.msg.NumberOfTransactionsPerStatus3.mmDetailedControlSum);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NumberOfTransactionsPerStatus3";
				definition = "Set of elements used to provide detailed information on the number of transactions that are reported with a specific transaction status.";
				nextVersions_lazy = () -> Arrays.asList(NumberOfItemsPerStatus1.mmObject(), NumberOfTransactionsPerStatus5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max15NumericText getDetailedNumberOfTransactions() {
		return detailedNumberOfTransactions;
	}

	public NumberOfTransactionsPerStatus3 setDetailedNumberOfTransactions(Max15NumericText detailedNumberOfTransactions) {
		this.detailedNumberOfTransactions = Objects.requireNonNull(detailedNumberOfTransactions);
		return this;
	}

	public TransactionIndividualStatus3Code getDetailedStatus() {
		return detailedStatus;
	}

	public NumberOfTransactionsPerStatus3 setDetailedStatus(TransactionIndividualStatus3Code detailedStatus) {
		this.detailedStatus = Objects.requireNonNull(detailedStatus);
		return this;
	}

	public Optional<DecimalNumber> getDetailedControlSum() {
		return detailedControlSum == null ? Optional.empty() : Optional.of(detailedControlSum);
	}

	public NumberOfTransactionsPerStatus3 setDetailedControlSum(DecimalNumber detailedControlSum) {
		this.detailedControlSum = detailedControlSum;
		return this;
	}
}