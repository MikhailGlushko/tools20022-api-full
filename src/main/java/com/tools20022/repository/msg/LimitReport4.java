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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.LimitOrError1Choice;
import com.tools20022.repository.entity.RiskManagementLimit;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Reports either on the risk management limit or on a business error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitReport4#mmLimitIdentification
 * LimitReport4.mmLimitIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitReport4#mmLimitOrError
 * LimitReport4.mmLimitOrError}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RiskManagementLimit
 * RiskManagementLimit}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitReport4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reports either on the risk management limit or on a business error."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LimitReport5 LimitReport5}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class LimitReport4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected LimitIdentification1 limitIdentification;
	/**
	 * Identification of the limit on which information is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LimitIdentification1
	 * LimitIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitReport4 LimitReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the limit on which information is requested."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitReport5#mmLimitIdentification
	 * LimitReport5.mmLimitIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLimitIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			componentContext_lazy = () -> LimitReport4.mmObject();
			isDerived = false;
			xmlTag = "LmtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitIdentification";
			definition = "Identification of the limit on which information is requested.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitReport5.mmLimitIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LimitIdentification1.mmObject();
		}
	};
	protected LimitOrError1Choice limitOrError;
	/**
	 * Requested information on the limit or business error report when
	 * information has not been found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.LimitOrError1Choice
	 * LimitOrError1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitReport4 LimitReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtOrErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitOrError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested information on the limit or business error report when information has not been found."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitReport5#mmLimitOrError
	 * LimitReport5.mmLimitOrError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLimitOrError = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LimitReport4.mmObject();
			isDerived = false;
			xmlTag = "LmtOrErr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitOrError";
			definition = "Requested information on the limit or business error report when information has not been found.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitReport5.mmLimitOrError);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> LimitOrError1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitReport4.mmLimitIdentification, com.tools20022.repository.msg.LimitReport4.mmLimitOrError);
				trace_lazy = () -> RiskManagementLimit.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LimitReport4";
				definition = "Reports either on the risk management limit or on a business error.";
				nextVersions_lazy = () -> Arrays.asList(LimitReport5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public LimitIdentification1 getLimitIdentification() {
		return limitIdentification;
	}

	public void setLimitIdentification(com.tools20022.repository.msg.LimitIdentification1 limitIdentification) {
		this.limitIdentification = limitIdentification;
	}

	public LimitOrError1Choice getLimitOrError() {
		return limitOrError;
	}

	public void setLimitOrError(LimitOrError1Choice limitOrError) {
		this.limitOrError = limitOrError;
	}
}