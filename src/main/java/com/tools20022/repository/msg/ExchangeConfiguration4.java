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
import com.tools20022.repository.codeset.ExchangePolicy1Code;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.AcceptorConfiguration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Configuration parameters of data exchanges.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4#mmExchangePolicy
 * ExchangeConfiguration4.mmExchangePolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4#mmMaximumNumber
 * ExchangeConfiguration4.mmMaximumNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4#mmMaximumAmount
 * ExchangeConfiguration4.mmMaximumAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeConfiguration4#mmReTry
 * ExchangeConfiguration4.mmReTry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4#mmTimeCondition
 * ExchangeConfiguration4.mmTimeCondition}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
 * AcceptorConfiguration}</li>
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
 * "ExchangeConfiguration4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Configuration parameters of data exchanges."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeConfiguration6
 * ExchangeConfiguration6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration2
 * ExchangeConfiguration2}</li>
 * </ul>
 */
public class ExchangeConfiguration4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<ExchangePolicy1Code> exchangePolicy;
	/**
	 * Exchange policy between parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExchangePolicy1Code
	 * ExchangePolicy1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmExchangePolicy
	 * AcceptorConfiguration.mmExchangePolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4
	 * ExchangeConfiguration4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgPlcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangePolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange policy between parties."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration6#mmExchangePolicy
	 * ExchangeConfiguration6.mmExchangePolicy}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration2#mmExchangePolicy
	 * ExchangeConfiguration2.mmExchangePolicy}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangePolicy = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmExchangePolicy;
			componentContext_lazy = () -> ExchangeConfiguration4.mmObject();
			isDerived = false;
			xmlTag = "XchgPlcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangePolicy";
			definition = "Exchange policy between parties.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeConfiguration6.mmExchangePolicy);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration2.mmExchangePolicy;
			minOccurs = 1;
			simpleType_lazy = () -> ExchangePolicy1Code.mmObject();
		}
	};
	protected Number maximumNumber;
	/**
	 * Maximum number of transactions without exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmMaximumNumber
	 * AcceptorConfiguration.mmMaximumNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4
	 * ExchangeConfiguration4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum number of transactions without exchange."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration6#mmMaximumNumber
	 * ExchangeConfiguration6.mmMaximumNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration2#mmMaximumNumber
	 * ExchangeConfiguration2.mmMaximumNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmMaximumNumber;
			componentContext_lazy = () -> ExchangeConfiguration4.mmObject();
			isDerived = false;
			xmlTag = "MaxNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumNumber";
			definition = "Maximum number of transactions without exchange.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeConfiguration6.mmMaximumNumber);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration2.mmMaximumNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount maximumAmount;
	/**
	 * Maximum cumulative amount of the transactions without exchange.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmMaximumAmount
	 * AcceptorConfiguration.mmMaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4
	 * ExchangeConfiguration4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum cumulative amount of the transactions without exchange."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration6#mmMaximumAmount
	 * ExchangeConfiguration6.mmMaximumAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration2#mmMaximumAmount
	 * ExchangeConfiguration2.mmMaximumAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmMaximumAmount;
			componentContext_lazy = () -> ExchangeConfiguration4.mmObject();
			isDerived = false;
			xmlTag = "MaxAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum cumulative amount of the transactions without exchange.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeConfiguration6.mmMaximumAmount);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration2.mmMaximumAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected ProcessRetry2 reTry;
	/**
	 * Definition of retry process if activation of an action fails.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProcessRetry2
	 * ProcessRetry2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4
	 * ExchangeConfiguration4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReTry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReTry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Definition of retry process if activation of an action fails."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration6#mmReTry
	 * ExchangeConfiguration6.mmReTry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReTry = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ExchangeConfiguration4.mmObject();
			isDerived = false;
			xmlTag = "ReTry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReTry";
			definition = "Definition of retry process if activation of an action fails.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeConfiguration6.mmReTry);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProcessRetry2.mmObject();
		}
	};
	protected ProcessTiming3 timeCondition;
	/**
	 * Timing condition for periodic exchanges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProcessTiming3
	 * ProcessTiming3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4
	 * ExchangeConfiguration4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmCond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Timing condition for periodic exchanges."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration6#mmTimeCondition
	 * ExchangeConfiguration6.mmTimeCondition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration2#mmTimeCondition
	 * ExchangeConfiguration2.mmTimeCondition}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTimeCondition = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ExchangeConfiguration4.mmObject();
			isDerived = false;
			xmlTag = "TmCond";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeCondition";
			definition = "Timing condition for periodic exchanges.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeConfiguration6.mmTimeCondition);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration2.mmTimeCondition;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProcessTiming3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeConfiguration4.mmExchangePolicy, com.tools20022.repository.msg.ExchangeConfiguration4.mmMaximumNumber,
						com.tools20022.repository.msg.ExchangeConfiguration4.mmMaximumAmount, com.tools20022.repository.msg.ExchangeConfiguration4.mmReTry, com.tools20022.repository.msg.ExchangeConfiguration4.mmTimeCondition);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExchangeConfiguration4";
				definition = "Configuration parameters of data exchanges.";
				nextVersions_lazy = () -> Arrays.asList(ExchangeConfiguration6.mmObject());
				previousVersion_lazy = () -> ExchangeConfiguration2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<ExchangePolicy1Code> getExchangePolicy() {
		return exchangePolicy;
	}

	public void setExchangePolicy(List<ExchangePolicy1Code> exchangePolicy) {
		this.exchangePolicy = exchangePolicy;
	}

	public Number getMaximumNumber() {
		return maximumNumber;
	}

	public void setMaximumNumber(Number maximumNumber) {
		this.maximumNumber = maximumNumber;
	}

	public ImpliedCurrencyAndAmount getMaximumAmount() {
		return maximumAmount;
	}

	public void setMaximumAmount(ImpliedCurrencyAndAmount maximumAmount) {
		this.maximumAmount = maximumAmount;
	}

	public ProcessRetry2 getReTry() {
		return reTry;
	}

	public void setReTry(com.tools20022.repository.msg.ProcessRetry2 reTry) {
		this.reTry = reTry;
	}

	public ProcessTiming3 getTimeCondition() {
		return timeCondition;
	}

	public void setTimeCondition(com.tools20022.repository.msg.ProcessTiming3 timeCondition) {
		this.timeCondition = timeCondition;
	}
}