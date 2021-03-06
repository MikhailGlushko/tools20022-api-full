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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.RequestedIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashBalanceReturnCriteria;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to report on an account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmNameIndicator
 * CashAccountReturnCriteria3.mmNameIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmCurrencyIndicator
 * CashAccountReturnCriteria3.mmCurrencyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmTypeIndicator
 * CashAccountReturnCriteria3.mmTypeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmMultilateralLimitIndicator
 * CashAccountReturnCriteria3.mmMultilateralLimitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmMultilateralBalanceReturnCriteria
 * CashAccountReturnCriteria3.mmMultilateralBalanceReturnCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmBilateralLimitIndicator
 * CashAccountReturnCriteria3.mmBilateralLimitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmBilateralBalanceReturnCriteria
 * CashAccountReturnCriteria3.mmBilateralBalanceReturnCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmStandingOrderIndicator
 * CashAccountReturnCriteria3.mmStandingOrderIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmAccountOwnerIndicator
 * CashAccountReturnCriteria3.mmAccountOwnerIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3#mmAccountServicerIndicator
 * CashAccountReturnCriteria3.mmAccountServicerIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccountReturnCriteria3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to report on an account."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4
 * CashAccountReturnCriteria4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashAccountReturnCriteria3", propOrder = {"nameIndicator", "currencyIndicator", "typeIndicator", "multilateralLimitIndicator", "multilateralBalanceReturnCriteria", "bilateralLimitIndicator",
		"bilateralBalanceReturnCriteria", "standingOrderIndicator", "accountOwnerIndicator", "accountServicerIndicator"})
public class CashAccountReturnCriteria3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NmInd")
	protected RequestedIndicator nameIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
	 * CashAccountReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the account name is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4#mmNameIndicator
	 * CashAccountReturnCriteria4.mmNameIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountReturnCriteria3, Optional<RequestedIndicator>> mmNameIndicator = new MMMessageAttribute<CashAccountReturnCriteria3, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "NmInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameIndicator";
			definition = "Indicates whether the account name is requested.";
			nextVersions_lazy = () -> Arrays.asList(CashAccountReturnCriteria4.mmNameIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(CashAccountReturnCriteria3 obj) {
			return obj.getNameIndicator();
		}

		@Override
		public void setValue(CashAccountReturnCriteria3 obj, Optional<RequestedIndicator> value) {
			obj.setNameIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CcyInd")
	protected RequestedIndicator currencyIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
	 * CashAccountReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the account currency is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4#mmCurrencyIndicator
	 * CashAccountReturnCriteria4.mmCurrencyIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountReturnCriteria3, Optional<RequestedIndicator>> mmCurrencyIndicator = new MMMessageAttribute<CashAccountReturnCriteria3, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "CcyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyIndicator";
			definition = "Indicates whether the account currency is requested.";
			nextVersions_lazy = () -> Arrays.asList(CashAccountReturnCriteria4.mmCurrencyIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(CashAccountReturnCriteria3 obj) {
			return obj.getCurrencyIndicator();
		}

		@Override
		public void setValue(CashAccountReturnCriteria3 obj, Optional<RequestedIndicator> value) {
			obj.setCurrencyIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "TpInd")
	protected RequestedIndicator typeIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
	 * CashAccountReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the account type is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4#mmTypeIndicator
	 * CashAccountReturnCriteria4.mmTypeIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountReturnCriteria3, Optional<RequestedIndicator>> mmTypeIndicator = new MMMessageAttribute<CashAccountReturnCriteria3, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "TpInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeIndicator";
			definition = "Indicates whether the account type is requested.";
			nextVersions_lazy = () -> Arrays.asList(CashAccountReturnCriteria4.mmTypeIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(CashAccountReturnCriteria3 obj) {
			return obj.getTypeIndicator();
		}

		@Override
		public void setValue(CashAccountReturnCriteria3 obj, Optional<RequestedIndicator> value) {
			obj.setTypeIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "MulLmtInd")
	protected RequestedIndicator multilateralLimitIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
	 * CashAccountReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MulLmtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultilateralLimitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the multilateral limit is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4#mmMultilateralLimitIndicator
	 * CashAccountReturnCriteria4.mmMultilateralLimitIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountReturnCriteria3, Optional<RequestedIndicator>> mmMultilateralLimitIndicator = new MMMessageAttribute<CashAccountReturnCriteria3, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "MulLmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultilateralLimitIndicator";
			definition = "Indicates whether the multilateral limit is requested.";
			nextVersions_lazy = () -> Arrays.asList(CashAccountReturnCriteria4.mmMultilateralLimitIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(CashAccountReturnCriteria3 obj) {
			return obj.getMultilateralLimitIndicator();
		}

		@Override
		public void setValue(CashAccountReturnCriteria3 obj, Optional<RequestedIndicator> value) {
			obj.setMultilateralLimitIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "MulBalRtrCrit")
	protected CashBalanceReturnCriteria multilateralBalanceReturnCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria
	 * CashBalanceReturnCriteria}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
	 * CashAccountReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MulBalRtrCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultilateralBalanceReturnCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria used to report on a multilateral balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4#mmMultilateralBalanceReturnCriteria
	 * CashAccountReturnCriteria4.mmMultilateralBalanceReturnCriteria}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccountReturnCriteria3, Optional<CashBalanceReturnCriteria>> mmMultilateralBalanceReturnCriteria = new MMMessageAssociationEnd<CashAccountReturnCriteria3, Optional<CashBalanceReturnCriteria>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "MulBalRtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultilateralBalanceReturnCriteria";
			definition = "Defines the criteria used to report on a multilateral balance.";
			nextVersions_lazy = () -> Arrays.asList(CashAccountReturnCriteria4.mmMultilateralBalanceReturnCriteria);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashBalanceReturnCriteria.mmObject();
		}

		@Override
		public Optional<CashBalanceReturnCriteria> getValue(CashAccountReturnCriteria3 obj) {
			return obj.getMultilateralBalanceReturnCriteria();
		}

		@Override
		public void setValue(CashAccountReturnCriteria3 obj, Optional<CashBalanceReturnCriteria> value) {
			obj.setMultilateralBalanceReturnCriteria(value.orElse(null));
		}
	};
	@XmlElement(name = "BilLmtInd")
	protected RequestedIndicator bilateralLimitIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
	 * CashAccountReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BilLmtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralLimitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the bilateral limit is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4#mmBilateralLimitIndicator
	 * CashAccountReturnCriteria4.mmBilateralLimitIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountReturnCriteria3, Optional<RequestedIndicator>> mmBilateralLimitIndicator = new MMMessageAttribute<CashAccountReturnCriteria3, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "BilLmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralLimitIndicator";
			definition = "Indicates whether the bilateral limit is requested.";
			nextVersions_lazy = () -> Arrays.asList(CashAccountReturnCriteria4.mmBilateralLimitIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(CashAccountReturnCriteria3 obj) {
			return obj.getBilateralLimitIndicator();
		}

		@Override
		public void setValue(CashAccountReturnCriteria3 obj, Optional<RequestedIndicator> value) {
			obj.setBilateralLimitIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "BilBalRtrCrit")
	protected CashBalanceReturnCriteria bilateralBalanceReturnCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria
	 * CashBalanceReturnCriteria}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
	 * CashAccountReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BilBalRtrCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralBalanceReturnCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria used to report on a bilateral balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4#mmBilateralBalanceReturnCriteria
	 * CashAccountReturnCriteria4.mmBilateralBalanceReturnCriteria}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccountReturnCriteria3, Optional<CashBalanceReturnCriteria>> mmBilateralBalanceReturnCriteria = new MMMessageAssociationEnd<CashAccountReturnCriteria3, Optional<CashBalanceReturnCriteria>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "BilBalRtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralBalanceReturnCriteria";
			definition = "Defines the criteria used to report on a bilateral balance.";
			nextVersions_lazy = () -> Arrays.asList(CashAccountReturnCriteria4.mmBilateralBalanceReturnCriteria);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashBalanceReturnCriteria.mmObject();
		}

		@Override
		public Optional<CashBalanceReturnCriteria> getValue(CashAccountReturnCriteria3 obj) {
			return obj.getBilateralBalanceReturnCriteria();
		}

		@Override
		public void setValue(CashAccountReturnCriteria3 obj, Optional<CashBalanceReturnCriteria> value) {
			obj.setBilateralBalanceReturnCriteria(value.orElse(null));
		}
	};
	@XmlElement(name = "StgOrdrInd")
	protected RequestedIndicator standingOrderIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
	 * CashAccountReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgOrdrInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrderIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the account standing order is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4#mmStandingOrderIndicator
	 * CashAccountReturnCriteria4.mmStandingOrderIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountReturnCriteria3, Optional<RequestedIndicator>> mmStandingOrderIndicator = new MMMessageAttribute<CashAccountReturnCriteria3, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "StgOrdrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderIndicator";
			definition = "Indicates whether the account standing order is requested.";
			nextVersions_lazy = () -> Arrays.asList(CashAccountReturnCriteria4.mmStandingOrderIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(CashAccountReturnCriteria3 obj) {
			return obj.getStandingOrderIndicator();
		}

		@Override
		public void setValue(CashAccountReturnCriteria3 obj, Optional<RequestedIndicator> value) {
			obj.setStandingOrderIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnrInd")
	protected RequestedIndicator accountOwnerIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
	 * CashAccountReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnrInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the account owner information is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4#mmAccountOwnerIndicator
	 * CashAccountReturnCriteria4.mmAccountOwnerIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountReturnCriteria3, Optional<RequestedIndicator>> mmAccountOwnerIndicator = new MMMessageAttribute<CashAccountReturnCriteria3, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerIndicator";
			definition = "Indicates whether the account owner information is requested.";
			nextVersions_lazy = () -> Arrays.asList(CashAccountReturnCriteria4.mmAccountOwnerIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(CashAccountReturnCriteria3 obj) {
			return obj.getAccountOwnerIndicator();
		}

		@Override
		public void setValue(CashAccountReturnCriteria3 obj, Optional<RequestedIndicator> value) {
			obj.setAccountOwnerIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcrInd")
	protected RequestedIndicator accountServicerIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria3
	 * CashAccountReturnCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the account servicer information is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountReturnCriteria4#mmAccountServicerIndicator
	 * CashAccountReturnCriteria4.mmAccountServicerIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountReturnCriteria3, Optional<RequestedIndicator>> mmAccountServicerIndicator = new MMMessageAttribute<CashAccountReturnCriteria3, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountReturnCriteria3.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerIndicator";
			definition = "Indicates whether the account servicer information is requested.";
			nextVersions_lazy = () -> Arrays.asList(CashAccountReturnCriteria4.mmAccountServicerIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(CashAccountReturnCriteria3 obj) {
			return obj.getAccountServicerIndicator();
		}

		@Override
		public void setValue(CashAccountReturnCriteria3 obj, Optional<RequestedIndicator> value) {
			obj.setAccountServicerIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountReturnCriteria3.mmNameIndicator, com.tools20022.repository.msg.CashAccountReturnCriteria3.mmCurrencyIndicator,
						com.tools20022.repository.msg.CashAccountReturnCriteria3.mmTypeIndicator, com.tools20022.repository.msg.CashAccountReturnCriteria3.mmMultilateralLimitIndicator,
						com.tools20022.repository.msg.CashAccountReturnCriteria3.mmMultilateralBalanceReturnCriteria, com.tools20022.repository.msg.CashAccountReturnCriteria3.mmBilateralLimitIndicator,
						com.tools20022.repository.msg.CashAccountReturnCriteria3.mmBilateralBalanceReturnCriteria, com.tools20022.repository.msg.CashAccountReturnCriteria3.mmStandingOrderIndicator,
						com.tools20022.repository.msg.CashAccountReturnCriteria3.mmAccountOwnerIndicator, com.tools20022.repository.msg.CashAccountReturnCriteria3.mmAccountServicerIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CashAccountReturnCriteria3";
				definition = "Defines the criteria used to report on an account.";
				nextVersions_lazy = () -> Arrays.asList(CashAccountReturnCriteria4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RequestedIndicator> getNameIndicator() {
		return nameIndicator == null ? Optional.empty() : Optional.of(nameIndicator);
	}

	public CashAccountReturnCriteria3 setNameIndicator(RequestedIndicator nameIndicator) {
		this.nameIndicator = nameIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getCurrencyIndicator() {
		return currencyIndicator == null ? Optional.empty() : Optional.of(currencyIndicator);
	}

	public CashAccountReturnCriteria3 setCurrencyIndicator(RequestedIndicator currencyIndicator) {
		this.currencyIndicator = currencyIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getTypeIndicator() {
		return typeIndicator == null ? Optional.empty() : Optional.of(typeIndicator);
	}

	public CashAccountReturnCriteria3 setTypeIndicator(RequestedIndicator typeIndicator) {
		this.typeIndicator = typeIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getMultilateralLimitIndicator() {
		return multilateralLimitIndicator == null ? Optional.empty() : Optional.of(multilateralLimitIndicator);
	}

	public CashAccountReturnCriteria3 setMultilateralLimitIndicator(RequestedIndicator multilateralLimitIndicator) {
		this.multilateralLimitIndicator = multilateralLimitIndicator;
		return this;
	}

	public Optional<CashBalanceReturnCriteria> getMultilateralBalanceReturnCriteria() {
		return multilateralBalanceReturnCriteria == null ? Optional.empty() : Optional.of(multilateralBalanceReturnCriteria);
	}

	public CashAccountReturnCriteria3 setMultilateralBalanceReturnCriteria(CashBalanceReturnCriteria multilateralBalanceReturnCriteria) {
		this.multilateralBalanceReturnCriteria = multilateralBalanceReturnCriteria;
		return this;
	}

	public Optional<RequestedIndicator> getBilateralLimitIndicator() {
		return bilateralLimitIndicator == null ? Optional.empty() : Optional.of(bilateralLimitIndicator);
	}

	public CashAccountReturnCriteria3 setBilateralLimitIndicator(RequestedIndicator bilateralLimitIndicator) {
		this.bilateralLimitIndicator = bilateralLimitIndicator;
		return this;
	}

	public Optional<CashBalanceReturnCriteria> getBilateralBalanceReturnCriteria() {
		return bilateralBalanceReturnCriteria == null ? Optional.empty() : Optional.of(bilateralBalanceReturnCriteria);
	}

	public CashAccountReturnCriteria3 setBilateralBalanceReturnCriteria(CashBalanceReturnCriteria bilateralBalanceReturnCriteria) {
		this.bilateralBalanceReturnCriteria = bilateralBalanceReturnCriteria;
		return this;
	}

	public Optional<RequestedIndicator> getStandingOrderIndicator() {
		return standingOrderIndicator == null ? Optional.empty() : Optional.of(standingOrderIndicator);
	}

	public CashAccountReturnCriteria3 setStandingOrderIndicator(RequestedIndicator standingOrderIndicator) {
		this.standingOrderIndicator = standingOrderIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getAccountOwnerIndicator() {
		return accountOwnerIndicator == null ? Optional.empty() : Optional.of(accountOwnerIndicator);
	}

	public CashAccountReturnCriteria3 setAccountOwnerIndicator(RequestedIndicator accountOwnerIndicator) {
		this.accountOwnerIndicator = accountOwnerIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getAccountServicerIndicator() {
		return accountServicerIndicator == null ? Optional.empty() : Optional.of(accountServicerIndicator);
	}

	public CashAccountReturnCriteria3 setAccountServicerIndicator(RequestedIndicator accountServicerIndicator) {
		this.accountServicerIndicator = accountServicerIndicator;
		return this;
	}
}