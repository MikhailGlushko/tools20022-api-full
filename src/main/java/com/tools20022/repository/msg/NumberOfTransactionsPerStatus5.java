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
import com.tools20022.repository.codeset.ExternalPaymentTransactionStatus1Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus5#mmDetailedNumberOfTransactions
 * NumberOfTransactionsPerStatus5.mmDetailedNumberOfTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus5#mmDetailedStatus
 * NumberOfTransactionsPerStatus5.mmDetailedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus5#mmDetailedControlSum
 * NumberOfTransactionsPerStatus5.mmDetailedControlSum}</li>
 * </ul>
 * </li>
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
 * "NumberOfTransactionsPerStatus5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide detailed information on the number of transactions that are reported with a specific transaction status."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3
 * NumberOfTransactionsPerStatus3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "NumberOfTransactionsPerStatus5", propOrder = {"detailedNumberOfTransactions", "detailedStatus", "detailedControlSum"})
public class NumberOfTransactionsPerStatus5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max15NumericText detailedNumberOfTransactions;
	/**
	 * Number of individual transactions contained in the message, detailed per
	 * status.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus5
	 * NumberOfTransactionsPerStatus5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtldNbOfTxs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedNumberOfTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of individual transactions contained in the message, detailed per status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3#mmDetailedNumberOfTransactions
	 * NumberOfTransactionsPerStatus3.mmDetailedNumberOfTransactions}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDetailedNumberOfTransactions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NumberOfTransactionsPerStatus5.mmObject();
			isDerived = false;
			xmlTag = "DtldNbOfTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedNumberOfTransactions";
			definition = "Number of individual transactions contained in the message, detailed per status.";
			previousVersion_lazy = () -> NumberOfTransactionsPerStatus3.mmDetailedNumberOfTransactions;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	protected ExternalPaymentTransactionStatus1Code detailedStatus;
	/**
	 * Common transaction status for all individual transactions reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalPaymentTransactionStatus1Code
	 * ExternalPaymentTransactionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus5
	 * NumberOfTransactionsPerStatus5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtldSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common transaction status for all individual transactions reported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3#mmDetailedStatus
	 * NumberOfTransactionsPerStatus3.mmDetailedStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDetailedStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NumberOfTransactionsPerStatus5.mmObject();
			isDerived = false;
			xmlTag = "DtldSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedStatus";
			definition = "Common transaction status for all individual transactions reported.";
			previousVersion_lazy = () -> NumberOfTransactionsPerStatus3.mmDetailedStatus;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalPaymentTransactionStatus1Code.mmObject();
		}
	};
	protected DecimalNumber detailedControlSum;
	/**
	 * Total of all individual amounts included in the message, irrespective of
	 * currencies, detailed per status.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus5
	 * NumberOfTransactionsPerStatus5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtldCtrlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedControlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total of all individual amounts included in the message, irrespective of currencies, detailed per status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3#mmDetailedControlSum
	 * NumberOfTransactionsPerStatus3.mmDetailedControlSum}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDetailedControlSum = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NumberOfTransactionsPerStatus5.mmObject();
			isDerived = false;
			xmlTag = "DtldCtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedControlSum";
			definition = "Total of all individual amounts included in the message, irrespective of currencies, detailed per status.";
			previousVersion_lazy = () -> NumberOfTransactionsPerStatus3.mmDetailedControlSum;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(NumberOfTransactionsPerStatus5.mmDetailedNumberOfTransactions, NumberOfTransactionsPerStatus5.mmDetailedStatus, NumberOfTransactionsPerStatus5.mmDetailedControlSum);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NumberOfTransactionsPerStatus5";
				definition = "Set of elements used to provide detailed information on the number of transactions that are reported with a specific transaction status.";
				previousVersion_lazy = () -> NumberOfTransactionsPerStatus3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DtldNbOfTxs", required = true)
	public Max15NumericText getDetailedNumberOfTransactions() {
		return detailedNumberOfTransactions;
	}

	public void setDetailedNumberOfTransactions(Max15NumericText detailedNumberOfTransactions) {
		this.detailedNumberOfTransactions = detailedNumberOfTransactions;
	}

	@XmlElement(name = "DtldSts", required = true)
	public ExternalPaymentTransactionStatus1Code getDetailedStatus() {
		return detailedStatus;
	}

	public void setDetailedStatus(ExternalPaymentTransactionStatus1Code detailedStatus) {
		this.detailedStatus = detailedStatus;
	}

	@XmlElement(name = "DtldCtrlSum")
	public DecimalNumber getDetailedControlSum() {
		return detailedControlSum;
	}

	public void setDetailedControlSum(DecimalNumber detailedControlSum) {
		this.detailedControlSum = detailedControlSum;
	}
}