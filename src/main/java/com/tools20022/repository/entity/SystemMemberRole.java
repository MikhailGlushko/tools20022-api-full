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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.MemberIdentification2Choice;
import com.tools20022.repository.choice.MemberIdentificationChoice;
import com.tools20022.repository.choice.MemberReportOrError1Choice;
import com.tools20022.repository.choice.MemberReportOrError2Choice;
import com.tools20022.repository.codeset.MemberTypeCode;
import com.tools20022.repository.entity.SystemPartyRole;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Information about the members of a system.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SystemMemberRole" src="doc-files/SystemMemberRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.DirectMember DirectMember}</li>
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
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SystemPartyRole
 * SystemPartyRole}</li>
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
 * "SystemMemberRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about the members of a system."</li>
 * </ul>
 */
public class SystemMemberRole extends SystemPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.CashBalance> cashBalance;
	/**
	 * Cash balance for which a counterparty is specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmCashBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SystemMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashBalance";
			definition = "Cash balance for which a counterparty is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.mmCounterparty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
		}
	};
	protected MemberTypeCode type;
	/**
	 * Nature of the relationship a member has with a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MemberTypeCode
	 * MemberTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MemberSearchCriteria.mmType, com.tools20022.repository.msg.MemberDetails.mmType, com.tools20022.repository.msg.MemberSearchCriteria2.mmType,
					com.tools20022.repository.msg.Member1.mmType);
			elementContext_lazy = () -> SystemMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of the relationship a member has with a system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MemberTypeCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SystemStatus> memberStatus;
	/**
	 * Specifies the status of a member.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
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
	public static final MMBusinessAssociationEnd mmMemberStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MemberSearchCriteria.mmStatus, com.tools20022.repository.msg.MemberSearchCriteria2.mmStatus);
			elementContext_lazy = () -> SystemMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MemberStatus";
			definition = "Specifies the status of a member.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemStatus.mmSystemMemberRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemStatus.mmObject();
		}
	};
	protected RiskManagementLimit limit;
	/**
	 * Cash management feature limiting the maximum risk a party accepts to take
	 * with respect to a counterparty or a set of counterparties. A risk
	 * management limit is either bilateral, ie, for a counterparty, or
	 * multilateral, ie, for a set of counterparties or all other members in a
	 * system.The limit may also apply to sponsored members, ie, indirect
	 * members. In principle, a risk management limit is calculated on the net
	 * position between two members and is expressed as a credit or debit limit,
	 * from the point of view of the party setting the limit.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmLimit = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SystemMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limit";
			definition = "Cash management feature limiting the maximum risk a party accepts to take with respect to a counterparty or a set of counterparties. A risk management limit is either bilateral, ie, for a counterparty, or multilateral, ie, for a set of counterparties or all other members in a system.The limit may also apply to sponsored members, ie, indirect members. In principle, a risk management limit is calculated on the net position between two members and is expressed as a credit or debit limit, from the point of view of the party setting the limit.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RiskManagementLimit.mmCounterparty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RiskManagementLimit.mmObject();
		}
	};
	protected Account account;
	/**
	 * Account owned by the member of a system with the system.<br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <p>
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
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SystemMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account owned by the member of a system with the system.\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmSystemMember;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemMemberRole";
				definition = "Information about the members of a system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmSystemMember, com.tools20022.repository.entity.RiskManagementLimit.mmCounterparty,
						com.tools20022.repository.entity.CashBalance.mmCounterparty, com.tools20022.repository.entity.SystemStatus.mmSystemMemberRole);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MemberSearchCriteria.mmIdentification, com.tools20022.repository.msg.MemberReport.mmMemberIdentification,
						com.tools20022.repository.msg.MemberReport.mmMemberInformation, com.tools20022.repository.msg.MemberReport2.mmMemberIdentification, com.tools20022.repository.msg.MemberReport2.mmMemberInformation,
						com.tools20022.repository.msg.MemberSearchCriteria2.mmIdentification, com.tools20022.repository.choice.MemberReportOrError2Choice.mmMember, com.tools20022.repository.msg.MemberReport3.mmMemberIdentification,
						com.tools20022.repository.msg.MemberReport3.mmMemberOrError, com.tools20022.repository.choice.MemberReportOrError1Choice.mmReport);
				subType_lazy = () -> Arrays.asList(DirectMember.mmObject());
				superType_lazy = () -> SystemPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemMemberRole.mmCashBalance, com.tools20022.repository.entity.SystemMemberRole.mmType, com.tools20022.repository.entity.SystemMemberRole.mmMemberStatus,
						com.tools20022.repository.entity.SystemMemberRole.mmLimit, com.tools20022.repository.entity.SystemMemberRole.mmAccount);
				derivationComponent_lazy = () -> Arrays.asList(MemberIdentificationChoice.mmObject(), MemberIdentification2Choice.mmObject(), SystemMember2.mmObject(), MemberSearchCriteria.mmObject(), MemberDetails.mmObject(),
						MemberReport.mmObject(), MemberReport2.mmObject(), MemberDetails1.mmObject(), MemberSearchCriteria2.mmObject(), Member1.mmObject(), MemberReportOrError2Choice.mmObject(), MemberReport3.mmObject(),
						MemberReportOrError1Choice.mmObject(), Member2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashBalance> getCashBalance() {
		return cashBalance;
	}

	public void setCashBalance(List<com.tools20022.repository.entity.CashBalance> cashBalance) {
		this.cashBalance = cashBalance;
	}

	public MemberTypeCode getType() {
		return type;
	}

	public void setType(MemberTypeCode type) {
		this.type = type;
	}

	public List<SystemStatus> getMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(List<com.tools20022.repository.entity.SystemStatus> memberStatus) {
		this.memberStatus = memberStatus;
	}

	public RiskManagementLimit getLimit() {
		return limit;
	}

	public void setLimit(com.tools20022.repository.entity.RiskManagementLimit limit) {
		this.limit = limit;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(com.tools20022.repository.entity.Account account) {
		this.account = account;
	}
}