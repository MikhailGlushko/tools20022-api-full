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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.MemberTypeCode;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Information about the members of a system.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SystemMemberRole" src="doc-files/SystemMemberRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SystemPartyRole
 * SystemPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#mmCashBalance
 * SystemMemberRole.mmCashBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemMemberRole#mmType
 * SystemMemberRole.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#mmMemberStatus
 * SystemMemberRole.mmMemberStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemMemberRole#mmLimit
 * SystemMemberRole.mmLimit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemMemberRole#mmAccount
 * SystemMemberRole.mmAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmSystemMember
 * Account.mmSystemMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit#mmCounterparty
 * RiskManagementLimit.mmCounterparty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#mmCounterparty
 * CashBalance.mmCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemStatus#mmSystemMemberRole
 * SystemStatus.mmSystemMemberRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberSearchCriteria#mmIdentification
 * MemberSearchCriteria.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberReport#mmMemberIdentification
 * MemberReport.mmMemberIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberReport#mmMemberInformation
 * MemberReport.mmMemberInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberReport2#mmMemberIdentification
 * MemberReport2.mmMemberIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberReport2#mmMemberInformation
 * MemberReport2.mmMemberInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberSearchCriteria2#mmIdentification
 * MemberSearchCriteria2.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MemberReportOrError2Choice#mmMember
 * MemberReportOrError2Choice.mmMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberReport3#mmMemberIdentification
 * MemberReport3.mmMemberIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MemberReport3#mmMemberOrError
 * MemberReport3.mmMemberOrError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MemberReportOrError1Choice#mmReport
 * MemberReportOrError1Choice.mmReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MemberReportOrError3Choice#mmReport
 * MemberReportOrError3Choice.mmReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberReport4#mmMemberIdentification
 * MemberReport4.mmMemberIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MemberReport4#mmMemberOrError
 * MemberReport4.mmMemberOrError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MemberReportOrError4Choice#mmMember
 * MemberReportOrError4Choice.mmMember}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.DirectMember DirectMember}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.MemberIdentificationChoice
 * MemberIdentificationChoice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MemberIdentification2Choice
 * MemberIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemMember2 SystemMember2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MemberSearchCriteria
 * MemberSearchCriteria}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MemberDetails MemberDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MemberReport MemberReport}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MemberReport2 MemberReport2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MemberDetails1 MemberDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MemberSearchCriteria2
 * MemberSearchCriteria2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Member1 Member1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MemberReportOrError2Choice
 * MemberReportOrError2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MemberReport3 MemberReport3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MemberReportOrError1Choice
 * MemberReportOrError1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Member2 Member2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Member3 Member3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MemberReportOrError3Choice
 * MemberReportOrError3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MemberReport4 MemberReport4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MemberReportOrError4Choice
 * MemberReportOrError4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Member4 Member4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemMemberRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about the members of a system."</li>
 * </ul>
 */
public class SystemMemberRole extends SystemPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.CashBalance> cashBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCounterparty
	 * CashBalance.mmCounterparty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashBalance
	 * CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash balance for which a counterparty is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SystemMemberRole, List<CashBalance>> mmCashBalance = new MMBusinessAssociationEnd<SystemMemberRole, List<CashBalance>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashBalance";
			definition = "Cash balance for which a counterparty is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.mmCounterparty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
		}

		@Override
		public List<CashBalance> getValue(SystemMemberRole obj) {
			return obj.getCashBalance();
		}

		@Override
		public void setValue(SystemMemberRole obj, List<CashBalance> value) {
			obj.setCashBalance(value);
		}
	};
	protected MemberTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MemberTypeCode
	 * MemberTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberSearchCriteria#mmType
	 * MemberSearchCriteria.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MemberDetails#mmType
	 * MemberDetails.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberSearchCriteria2#mmType
	 * MemberSearchCriteria2.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Member1#mmType
	 * Member1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Member4#mmType
	 * Member4.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature of the relationship a member has with a system."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SystemMemberRole, MemberTypeCode> mmType = new MMBusinessAttribute<SystemMemberRole, MemberTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(MemberSearchCriteria.mmType, MemberDetails.mmType, MemberSearchCriteria2.mmType, Member1.mmType, Member4.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of the relationship a member has with a system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MemberTypeCode.mmObject();
		}

		@Override
		public MemberTypeCode getValue(SystemMemberRole obj) {
			return obj.getType();
		}

		@Override
		public void setValue(SystemMemberRole obj, MemberTypeCode value) {
			obj.setType(value);
		}
	};
	protected List<SystemStatus> memberStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus#mmSystemMemberRole
	 * SystemStatus.mmSystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemStatus
	 * SystemStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberSearchCriteria#mmStatus
	 * MemberSearchCriteria.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberSearchCriteria2#mmStatus
	 * MemberSearchCriteria2.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a member."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SystemMemberRole, List<SystemStatus>> mmMemberStatus = new MMBusinessAssociationEnd<SystemMemberRole, List<SystemStatus>>() {
		{
			derivation_lazy = () -> Arrays.asList(MemberSearchCriteria.mmStatus, MemberSearchCriteria2.mmStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MemberStatus";
			definition = "Specifies the status of a member.";
			minOccurs = 0;
			opposite_lazy = () -> SystemStatus.mmSystemMemberRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SystemStatus.mmObject();
		}

		@Override
		public List<SystemStatus> getValue(SystemMemberRole obj) {
			return obj.getMemberStatus();
		}

		@Override
		public void setValue(SystemMemberRole obj, List<SystemStatus> value) {
			obj.setMemberStatus(value);
		}
	};
	protected RiskManagementLimit limit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit#mmCounterparty
	 * RiskManagementLimit.mmCounterparty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash management feature limiting the maximum risk a party accepts to take with respect to a counterparty or a set of counterparties. A risk management limit is either bilateral, ie, for a counterparty, or multilateral, ie, for a set of counterparties or all other members in a system.The limit may also apply to sponsored members, ie, indirect members. In principle, a risk management limit is calculated on the net position between two members and is expressed as a credit or debit limit, from the point of view of the party setting the limit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SystemMemberRole, RiskManagementLimit> mmLimit = new MMBusinessAssociationEnd<SystemMemberRole, RiskManagementLimit>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limit";
			definition = "Cash management feature limiting the maximum risk a party accepts to take with respect to a counterparty or a set of counterparties. A risk management limit is either bilateral, ie, for a counterparty, or multilateral, ie, for a set of counterparties or all other members in a system.The limit may also apply to sponsored members, ie, indirect members. In principle, a risk management limit is calculated on the net position between two members and is expressed as a credit or debit limit, from the point of view of the party setting the limit.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RiskManagementLimit.mmCounterparty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RiskManagementLimit.mmObject();
		}

		@Override
		public RiskManagementLimit getValue(SystemMemberRole obj) {
			return obj.getLimit();
		}

		@Override
		public void setValue(SystemMemberRole obj, RiskManagementLimit value) {
			obj.setLimit(value);
		}
	};
	protected Account account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmSystemMember
	 * Account.mmSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account owned by the member of a system with the system.\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SystemMemberRole, com.tools20022.repository.entity.Account> mmAccount = new MMBusinessAssociationEnd<SystemMemberRole, com.tools20022.repository.entity.Account>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account owned by the member of a system with the system.\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmSystemMember;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Account getValue(SystemMemberRole obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(SystemMemberRole obj, com.tools20022.repository.entity.Account value) {
			obj.setAccount(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemMemberRole";
				definition = "Information about the members of a system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmSystemMember, RiskManagementLimit.mmCounterparty, com.tools20022.repository.entity.CashBalance.mmCounterparty,
						SystemStatus.mmSystemMemberRole);
				derivationElement_lazy = () -> Arrays.asList(MemberSearchCriteria.mmIdentification, MemberReport.mmMemberIdentification, MemberReport.mmMemberInformation, MemberReport2.mmMemberIdentification,
						MemberReport2.mmMemberInformation, MemberSearchCriteria2.mmIdentification, MemberReportOrError2Choice.mmMember, MemberReport3.mmMemberIdentification, MemberReport3.mmMemberOrError,
						MemberReportOrError1Choice.mmReport, MemberReportOrError3Choice.mmReport, MemberReport4.mmMemberIdentification, MemberReport4.mmMemberOrError, MemberReportOrError4Choice.mmMember);
				subType_lazy = () -> Arrays.asList(DirectMember.mmObject());
				superType_lazy = () -> SystemPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemMemberRole.mmCashBalance, com.tools20022.repository.entity.SystemMemberRole.mmType, com.tools20022.repository.entity.SystemMemberRole.mmMemberStatus,
						com.tools20022.repository.entity.SystemMemberRole.mmLimit, com.tools20022.repository.entity.SystemMemberRole.mmAccount);
				derivationComponent_lazy = () -> Arrays.asList(MemberIdentificationChoice.mmObject(), MemberIdentification2Choice.mmObject(), SystemMember2.mmObject(), MemberSearchCriteria.mmObject(), MemberDetails.mmObject(),
						MemberReport.mmObject(), MemberReport2.mmObject(), MemberDetails1.mmObject(), MemberSearchCriteria2.mmObject(), Member1.mmObject(), MemberReportOrError2Choice.mmObject(), MemberReport3.mmObject(),
						MemberReportOrError1Choice.mmObject(), Member2.mmObject(), Member3.mmObject(), MemberReportOrError3Choice.mmObject(), MemberReport4.mmObject(), MemberReportOrError4Choice.mmObject(), Member4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SystemMemberRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashBalance> getCashBalance() {
		return cashBalance == null ? cashBalance = new ArrayList<>() : cashBalance;
	}

	public SystemMemberRole setCashBalance(List<com.tools20022.repository.entity.CashBalance> cashBalance) {
		this.cashBalance = Objects.requireNonNull(cashBalance);
		return this;
	}

	public MemberTypeCode getType() {
		return type;
	}

	public SystemMemberRole setType(MemberTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public List<SystemStatus> getMemberStatus() {
		return memberStatus == null ? memberStatus = new ArrayList<>() : memberStatus;
	}

	public SystemMemberRole setMemberStatus(List<SystemStatus> memberStatus) {
		this.memberStatus = Objects.requireNonNull(memberStatus);
		return this;
	}

	public RiskManagementLimit getLimit() {
		return limit;
	}

	public SystemMemberRole setLimit(RiskManagementLimit limit) {
		this.limit = Objects.requireNonNull(limit);
		return this;
	}

	public Account getAccount() {
		return account;
	}

	public SystemMemberRole setAccount(com.tools20022.repository.entity.Account account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}
}