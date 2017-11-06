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
import com.tools20022.repository.datatype.RequestedIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines the criteria used to report on standing orders.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmStandingOrderIdentificationIndicator
 * StandingOrderReturnCriteria1.mmStandingOrderIdentificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmTypeIndicator
 * StandingOrderReturnCriteria1.mmTypeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmSystemMemberIndicator
 * StandingOrderReturnCriteria1.mmSystemMemberIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmResponsiblePartyIndicator
 * StandingOrderReturnCriteria1.mmResponsiblePartyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmCurrencyIndicator
 * StandingOrderReturnCriteria1.mmCurrencyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmDebtorAccountIndicator
 * StandingOrderReturnCriteria1.mmDebtorAccountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmCreditorAccountIndicator
 * StandingOrderReturnCriteria1.mmCreditorAccountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmAssociatedPoolAccount
 * StandingOrderReturnCriteria1.mmAssociatedPoolAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmFrequencyIndicator
 * StandingOrderReturnCriteria1.mmFrequencyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmExecutionTypeIndicator
 * StandingOrderReturnCriteria1.mmExecutionTypeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmValidityFromIndicator
 * StandingOrderReturnCriteria1.mmValidityFromIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmValidToIndicator
 * StandingOrderReturnCriteria1.mmValidToIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmLinkSetIdentificationIndicator
 * StandingOrderReturnCriteria1.mmLinkSetIdentificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmLinkSetOrderIdentificationIndicator
 * StandingOrderReturnCriteria1.mmLinkSetOrderIdentificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmLinkSetOrderSequenceIndicator
 * StandingOrderReturnCriteria1.mmLinkSetOrderSequenceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmTotalAmountIndicator
 * StandingOrderReturnCriteria1.mmTotalAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1#mmZeroSweepIndicator
 * StandingOrderReturnCriteria1.mmZeroSweepIndicator}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StandingOrderReturnCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to report on standing orders."</li>
 * </ul>
 */
public class StandingOrderReturnCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RequestedIndicator standingOrderIdentificationIndicator;
	/**
	 * Defines the criteria used to report on a multilateral balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgOrdrIdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrderIdentificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria used to report on a multilateral balance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStandingOrderIdentificationIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "StgOrdrIdInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderIdentificationIndicator";
			definition = "Defines the criteria used to report on a multilateral balance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator typeIndicator;
	/**
	 * Indicates whether the standing order type is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the standing order type is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTypeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "TpInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeIndicator";
			definition = "Indicates whether the standing order type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator systemMemberIndicator;
	/**
	 * Indicates whether the system member identification is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysMmbInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemMemberIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the system member identification is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSystemMemberIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SysMmbInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemMemberIndicator";
			definition = "Indicates whether the system member identification is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator responsiblePartyIndicator;
	/**
	 * Indicates whether the responsible party identification is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnsblPtyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponsiblePartyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the responsible party identification is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResponsiblePartyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RspnsblPtyInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponsiblePartyIndicator";
			definition = "Indicates whether the responsible party identification is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator currencyIndicator;
	/**
	 * Indicates whether the account currency is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the account currency is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrencyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CcyInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyIndicator";
			definition = "Indicates whether the account currency is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator debtorAccountIndicator;
	/**
	 * Indicates whether the account type is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAcctInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAccountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the account type is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDebtorAccountIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcctInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccountIndicator";
			definition = "Indicates whether the account type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator creditorAccountIndicator;
	/**
	 * Indicates whether the multilateral limit is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAcctInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAccountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the multilateral limit is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditorAccountIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CdtrAcctInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccountIndicator";
			definition = "Indicates whether the multilateral limit is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator associatedPoolAccount;
	/**
	 * Indicates whether the associated pool account is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AssoctdPoolAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssociatedPoolAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the associated pool account is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAssociatedPoolAccount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "AssoctdPoolAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedPoolAccount";
			definition = "Indicates whether the associated pool account is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator frequencyIndicator;
	/**
	 * Indicates whether the frequency is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrqcyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrequencyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the frequency is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrequencyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "FrqcyInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrequencyIndicator";
			definition = "Indicates whether the frequency is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator executionTypeIndicator;
	/**
	 * Indicates whether the execution type is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctnTpInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionTypeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the execution type is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutionTypeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ExctnTpInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionTypeIndicator";
			definition = "Indicates whether the execution type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator validityFromIndicator;
	/**
	 * Indicates whether the account standing order is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtyFrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityFromIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the account standing order is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidityFromIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "VldtyFrInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityFromIndicator";
			definition = "Indicates whether the account standing order is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator validToIndicator;
	/**
	 * Indicates whether the account owner information is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldToInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidToIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the account owner information is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidToIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "VldToInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidToIndicator";
			definition = "Indicates whether the account owner information is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator linkSetIdentificationIndicator;
	/**
	 * Indicates whether the link set identification is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkSetIdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkSetIdentificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the link set identification is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkSetIdentificationIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "LkSetIdInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkSetIdentificationIndicator";
			definition = "Indicates whether the link set identification is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator linkSetOrderIdentificationIndicator;
	/**
	 * Indicates whether the identification of a standing order within a link
	 * set is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkSetOrdrIdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkSetOrderIdentificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the identification of a standing order within a link set is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkSetOrderIdentificationIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "LkSetOrdrIdInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkSetOrderIdentificationIndicator";
			definition = "Indicates whether the identification of a standing order within a link set is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator linkSetOrderSequenceIndicator;
	/**
	 * Indicates whether the sequence of a standing order within a link set is
	 * requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkSetOrdrSeqInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkSetOrderSequenceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the sequence of a standing order within a link set is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkSetOrderSequenceIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "LkSetOrdrSeqInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkSetOrderSequenceIndicator";
			definition = "Indicates whether the sequence of a standing order within a link set is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator totalAmountIndicator;
	/**
	 * Indicates whether the total amount per standing order type is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAmtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the total amount per standing order type is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalAmountIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "TtlAmtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountIndicator";
			definition = "Indicates whether the total amount per standing order type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator zeroSweepIndicator;
	/**
	 * Indicates whether the zero sweeping indicator is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderReturnCriteria1
	 * StandingOrderReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ZeroSweepInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZeroSweepIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the zero sweeping indicator is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmZeroSweepIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StandingOrderReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ZeroSweepInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZeroSweepIndicator";
			definition = "Indicates whether the zero sweeping indicator is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmStandingOrderIdentificationIndicator, com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmTypeIndicator,
						com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmSystemMemberIndicator, com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmResponsiblePartyIndicator,
						com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmCurrencyIndicator, com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmDebtorAccountIndicator,
						com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmCreditorAccountIndicator, com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmAssociatedPoolAccount,
						com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmFrequencyIndicator, com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmExecutionTypeIndicator,
						com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmValidityFromIndicator, com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmValidToIndicator,
						com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmLinkSetIdentificationIndicator, com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmLinkSetOrderIdentificationIndicator,
						com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmLinkSetOrderSequenceIndicator, com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmTotalAmountIndicator,
						com.tools20022.repository.msg.StandingOrderReturnCriteria1.mmZeroSweepIndicator);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "StandingOrderReturnCriteria1";
				definition = "Defines the criteria used to report on standing orders.";
			}
		});
		return mmObject_lazy.get();
	}

	public RequestedIndicator getStandingOrderIdentificationIndicator() {
		return standingOrderIdentificationIndicator;
	}

	public void setStandingOrderIdentificationIndicator(RequestedIndicator standingOrderIdentificationIndicator) {
		this.standingOrderIdentificationIndicator = standingOrderIdentificationIndicator;
	}

	public RequestedIndicator getTypeIndicator() {
		return typeIndicator;
	}

	public void setTypeIndicator(RequestedIndicator typeIndicator) {
		this.typeIndicator = typeIndicator;
	}

	public RequestedIndicator getSystemMemberIndicator() {
		return systemMemberIndicator;
	}

	public void setSystemMemberIndicator(RequestedIndicator systemMemberIndicator) {
		this.systemMemberIndicator = systemMemberIndicator;
	}

	public RequestedIndicator getResponsiblePartyIndicator() {
		return responsiblePartyIndicator;
	}

	public void setResponsiblePartyIndicator(RequestedIndicator responsiblePartyIndicator) {
		this.responsiblePartyIndicator = responsiblePartyIndicator;
	}

	public RequestedIndicator getCurrencyIndicator() {
		return currencyIndicator;
	}

	public void setCurrencyIndicator(RequestedIndicator currencyIndicator) {
		this.currencyIndicator = currencyIndicator;
	}

	public RequestedIndicator getDebtorAccountIndicator() {
		return debtorAccountIndicator;
	}

	public void setDebtorAccountIndicator(RequestedIndicator debtorAccountIndicator) {
		this.debtorAccountIndicator = debtorAccountIndicator;
	}

	public RequestedIndicator getCreditorAccountIndicator() {
		return creditorAccountIndicator;
	}

	public void setCreditorAccountIndicator(RequestedIndicator creditorAccountIndicator) {
		this.creditorAccountIndicator = creditorAccountIndicator;
	}

	public RequestedIndicator getAssociatedPoolAccount() {
		return associatedPoolAccount;
	}

	public void setAssociatedPoolAccount(RequestedIndicator associatedPoolAccount) {
		this.associatedPoolAccount = associatedPoolAccount;
	}

	public RequestedIndicator getFrequencyIndicator() {
		return frequencyIndicator;
	}

	public void setFrequencyIndicator(RequestedIndicator frequencyIndicator) {
		this.frequencyIndicator = frequencyIndicator;
	}

	public RequestedIndicator getExecutionTypeIndicator() {
		return executionTypeIndicator;
	}

	public void setExecutionTypeIndicator(RequestedIndicator executionTypeIndicator) {
		this.executionTypeIndicator = executionTypeIndicator;
	}

	public RequestedIndicator getValidityFromIndicator() {
		return validityFromIndicator;
	}

	public void setValidityFromIndicator(RequestedIndicator validityFromIndicator) {
		this.validityFromIndicator = validityFromIndicator;
	}

	public RequestedIndicator getValidToIndicator() {
		return validToIndicator;
	}

	public void setValidToIndicator(RequestedIndicator validToIndicator) {
		this.validToIndicator = validToIndicator;
	}

	public RequestedIndicator getLinkSetIdentificationIndicator() {
		return linkSetIdentificationIndicator;
	}

	public void setLinkSetIdentificationIndicator(RequestedIndicator linkSetIdentificationIndicator) {
		this.linkSetIdentificationIndicator = linkSetIdentificationIndicator;
	}

	public RequestedIndicator getLinkSetOrderIdentificationIndicator() {
		return linkSetOrderIdentificationIndicator;
	}

	public void setLinkSetOrderIdentificationIndicator(RequestedIndicator linkSetOrderIdentificationIndicator) {
		this.linkSetOrderIdentificationIndicator = linkSetOrderIdentificationIndicator;
	}

	public RequestedIndicator getLinkSetOrderSequenceIndicator() {
		return linkSetOrderSequenceIndicator;
	}

	public void setLinkSetOrderSequenceIndicator(RequestedIndicator linkSetOrderSequenceIndicator) {
		this.linkSetOrderSequenceIndicator = linkSetOrderSequenceIndicator;
	}

	public RequestedIndicator getTotalAmountIndicator() {
		return totalAmountIndicator;
	}

	public void setTotalAmountIndicator(RequestedIndicator totalAmountIndicator) {
		this.totalAmountIndicator = totalAmountIndicator;
	}

	public RequestedIndicator getZeroSweepIndicator() {
		return zeroSweepIndicator;
	}

	public void setZeroSweepIndicator(RequestedIndicator zeroSweepIndicator) {
		this.zeroSweepIndicator = zeroSweepIndicator;
	}
}