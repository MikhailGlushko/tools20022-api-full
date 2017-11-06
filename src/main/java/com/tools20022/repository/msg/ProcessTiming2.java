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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max9NumericText;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Parameters defining the timing conditions to process an action.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProcessTiming2#mmWaitingTime
 * ProcessTiming2.mmWaitingTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProcessTiming2#mmStartTime
 * ProcessTiming2.mmStartTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProcessTiming2#mmEndTime
 * ProcessTiming2.mmEndTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProcessTiming2#mmPeriod
 * ProcessTiming2.mmPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProcessTiming2#mmMaximumNumber
 * ProcessTiming2.mmMaximumNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProcessTiming2#mmReTry
 * ProcessTiming2.mmReTry}</li>
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
 * "ProcessTiming2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parameters defining the timing conditions to process an action."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProcessTiming3 ProcessTiming3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ProcessTiming1
 * ProcessTiming1}</li>
 * </ul>
 */
public class ProcessTiming2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max9NumericText waitingTime;
	/**
	 * Waiting time after the previous action in months, days, hours and
	 * minutes, leading zeros could be omitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max9NumericText
	 * Max9NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessTiming2 ProcessTiming2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WtgTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaitingTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Waiting time after the previous action in months, days, hours and minutes, leading zeros could be omitted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProcessTiming3#mmWaitingTime
	 * ProcessTiming3.mmWaitingTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWaitingTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ProcessTiming2.mmObject();
			isDerived = false;
			xmlTag = "WtgTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaitingTime";
			definition = "Waiting time after the previous action in months, days, hours and minutes, leading zeros could be omitted.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProcessTiming3.mmWaitingTime);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max9NumericText.mmObject();
		}
	};
	protected ISODateTime startTime;
	/**
	 * Date and time to start the action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessTiming2 ProcessTiming2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StartTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time to start the action."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ProcessTiming3#mmStartTime
	 * ProcessTiming3.mmStartTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStartTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ProcessTiming2.mmObject();
			isDerived = false;
			xmlTag = "StartTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartTime";
			definition = "Date and time to start the action.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProcessTiming3.mmStartTime);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime endTime;
	/**
	 * Date and time after which the action cannot be processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessTiming2 ProcessTiming2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time after which the action cannot be processed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ProcessTiming3#mmEndTime
	 * ProcessTiming3.mmEndTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEndTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ProcessTiming2.mmObject();
			isDerived = false;
			xmlTag = "EndTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndTime";
			definition = "Date and time after which the action cannot be processed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProcessTiming3.mmEndTime);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Max9NumericText period;
	/**
	 * Period delay between cyclic action activation in months, days, hours and
	 * minutes, leading zeros could be omitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max9NumericText
	 * Max9NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessTiming2 ProcessTiming2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Period"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period delay between cyclic action activation in months, days, hours and minutes, leading zeros could be omitted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ProcessTiming3#mmPeriod
	 * ProcessTiming3.mmPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ProcessTiming2.mmObject();
			isDerived = false;
			xmlTag = "Prd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Period";
			definition = "Period delay between cyclic action activation in months, days, hours and minutes, leading zeros could be omitted.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProcessTiming3.mmPeriod);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max9NumericText.mmObject();
		}
	};
	protected Number maximumNumber;
	/**
	 * Maximum number of cyclic calls.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessTiming2 ProcessTiming2}</li>
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
	 * definition} = "Maximum number of cyclic calls."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProcessTiming3#mmMaximumNumber
	 * ProcessTiming3.mmMaximumNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ProcessTiming2.mmObject();
			isDerived = false;
			xmlTag = "MaxNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumNumber";
			definition = "Maximum number of cyclic calls.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProcessTiming3.mmMaximumNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ProcessRetry2 reTry;
	/**
	 * Definition of retry process if activation of the action fails.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProcessRetry2
	 * ProcessRetry2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessTiming2 ProcessTiming2}</li>
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
	 * "Definition of retry process if activation of the action fails."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReTry = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ProcessTiming2.mmObject();
			isDerived = false;
			xmlTag = "ReTry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReTry";
			definition = "Definition of retry process if activation of the action fails.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProcessRetry2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProcessTiming2.mmWaitingTime, com.tools20022.repository.msg.ProcessTiming2.mmStartTime, com.tools20022.repository.msg.ProcessTiming2.mmEndTime,
						com.tools20022.repository.msg.ProcessTiming2.mmPeriod, com.tools20022.repository.msg.ProcessTiming2.mmMaximumNumber, com.tools20022.repository.msg.ProcessTiming2.mmReTry);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProcessTiming2";
				definition = "Parameters defining the timing conditions to process an action.";
				nextVersions_lazy = () -> Arrays.asList(ProcessTiming3.mmObject());
				previousVersion_lazy = () -> ProcessTiming1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max9NumericText getWaitingTime() {
		return waitingTime;
	}

	public void setWaitingTime(Max9NumericText waitingTime) {
		this.waitingTime = waitingTime;
	}

	public ISODateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(ISODateTime startTime) {
		this.startTime = startTime;
	}

	public ISODateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(ISODateTime endTime) {
		this.endTime = endTime;
	}

	public Max9NumericText getPeriod() {
		return period;
	}

	public void setPeriod(Max9NumericText period) {
		this.period = period;
	}

	public Number getMaximumNumber() {
		return maximumNumber;
	}

	public void setMaximumNumber(Number maximumNumber) {
		this.maximumNumber = maximumNumber;
	}

	public ProcessRetry2 getReTry() {
		return reTry;
	}

	public void setReTry(com.tools20022.repository.msg.ProcessRetry2 reTry) {
		this.reTry = reTry;
	}
}