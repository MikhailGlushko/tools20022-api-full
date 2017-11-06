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
import com.tools20022.repository.choice.SystemIdentificationChoice;
import com.tools20022.repository.codeset.LiquidityLimitType1Code;
import com.tools20022.repository.entity.LiquidityManagementLimit;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Cash management feature limiting the amount of liquidity needed to perform
 * clearing and settlement operations. At any point in time during the process,
 * the limit imposes the maximum amount of liquidity available for operations
 * concerning the system or other managed elements, eg, transaction amount or
 * counterparty.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityManagementLimitIdentificationDetails#mmSystemIdentification
 * LiquidityManagementLimitIdentificationDetails.mmSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityManagementLimitIdentificationDetails#mmType
 * LiquidityManagementLimitIdentificationDetails.mmType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit
 * LiquidityManagementLimit}</li>
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
 * "LiquidityManagementLimitIdentificationDetails"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash management feature limiting the amount of liquidity needed to perform clearing and settlement operations. At any point in time during the process, the limit imposes the maximum amount of liquidity available for operations concerning the system or other managed elements, eg, transaction amount or counterparty."
 * </li>
 * </ul>
 */
public class LiquidityManagementLimitIdentificationDetails {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SystemIdentificationChoice systemIdentification;
	/**
	 * Identification of a particular cash clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SystemIdentificationChoice
	 * SystemIdentificationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmCashClearingSystem
	 * TransactionAdministrator.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityManagementLimitIdentificationDetails
	 * LiquidityManagementLimitIdentificationDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a particular cash clearing system. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSystemIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmCashClearingSystem;
			componentContext_lazy = () -> LiquidityManagementLimitIdentificationDetails.mmObject();
			isDerived = false;
			xmlTag = "SysId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemIdentification";
			definition = "Identification of a particular cash clearing system. ";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SystemIdentificationChoice.mmObject();
		}
	};
	protected LiquidityLimitType1Code type;
	/**
	 * Type of liquidity management limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityLimitType1Code
	 * LiquidityLimitType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#mmLiquidityLimitType
	 * LiquidityManagementLimit.mmLiquidityLimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityManagementLimitIdentificationDetails
	 * LiquidityManagementLimitIdentificationDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of liquidity management limit."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.mmLiquidityLimitType;
			componentContext_lazy = () -> LiquidityManagementLimitIdentificationDetails.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of liquidity management limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LiquidityLimitType1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LiquidityManagementLimitIdentificationDetails.mmSystemIdentification,
						com.tools20022.repository.msg.LiquidityManagementLimitIdentificationDetails.mmType);
				trace_lazy = () -> LiquidityManagementLimit.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LiquidityManagementLimitIdentificationDetails";
				definition = "Cash management feature limiting the amount of liquidity needed to perform clearing and settlement operations. At any point in time during the process, the limit imposes the maximum amount of liquidity available for operations concerning the system or other managed elements, eg, transaction amount or counterparty.";
			}
		});
		return mmObject_lazy.get();
	}

	public SystemIdentificationChoice getSystemIdentification() {
		return systemIdentification;
	}

	public void setSystemIdentification(SystemIdentificationChoice systemIdentification) {
		this.systemIdentification = systemIdentification;
	}

	public LiquidityLimitType1Code getType() {
		return type;
	}

	public void setType(LiquidityLimitType1Code type) {
		this.type = type;
	}
}