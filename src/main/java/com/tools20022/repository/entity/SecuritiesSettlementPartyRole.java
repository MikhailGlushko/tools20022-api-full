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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.SettlingCapacityCode;
import com.tools20022.repository.codeset.TaxLiabilityCode;
import com.tools20022.repository.entity.SecuritiesSettlement;
import com.tools20022.repository.entity.SecuritiesSettlementSystem;
import com.tools20022.repository.entity.SettlementPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Role played by a party in the context of the settlement of securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesSettlementPartyRole"
 * src="doc-files/SecuritiesSettlementPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole
 * SettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSecuritiesSettlement
 * SecuritiesSettlementPartyRole.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSecuritiesSettlementSystem
 * SecuritiesSettlementPartyRole.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSettlingCapacity
 * SecuritiesSettlementPartyRole.mmSettlingCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmTaxCapacity
 * SecuritiesSettlementPartyRole.mmTaxCapacity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
 * SecuritiesSettlement.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem#mmSettlementParty
 * SecuritiesSettlementSystem.mmSettlementParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount7#mmParty1
 * ReceivingPartiesAndAccount7.mmParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount7#mmParty2
 * ReceivingPartiesAndAccount7.mmParty2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementParties32#mmDepository
 * SettlementParties32.mmDepository}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#mmParty1
 * SettlementParties32.mmParty1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#mmParty2
 * SettlementParties32.mmParty2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#mmParty3
 * SettlementParties32.mmParty3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#mmParty4
 * SettlementParties32.mmParty4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#mmParty5
 * SettlementParties32.mmParty5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount10#mmParty1
 * ReceivingPartiesAndAccount10.mmParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount10#mmParty2
 * ReceivingPartiesAndAccount10.mmParty2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount11#mmParty1
 * ReceivingPartiesAndAccount11.mmParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount11#mmParty2
 * ReceivingPartiesAndAccount11.mmParty2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#mmSettlementPartiesDetails
 * InvestmentAccount54.mmSettlementPartiesDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount15#mmParty1
 * ReceivingPartiesAndAccount15.mmParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount15#mmParty2
 * ReceivingPartiesAndAccount15.mmParty2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount66#mmSettlementPartiesDetails
 * InvestmentAccount66.mmSettlementPartiesDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
 * ReceivingSettlementParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
 * DeliveringSettlementParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ReceivingAgent
 * ReceivingAgent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LocalSettlementAgentRole
 * LocalSettlementAgentRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DeliverersCustodian
 * DeliverersCustodian}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DeliverersIntermediary
 * DeliverersIntermediary}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DeliveringAgent
 * DeliveringAgent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PlaceOfSettlement
 * PlaceOfSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ReceiversCustodian
 * ReceiversCustodian}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ReceiversIntermediary
 * ReceiversIntermediary}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount1
 * DeliveringPartiesAndAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount4
 * DeliveringPartiesAndAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount8
 * DeliveringPartiesAndAccount8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1
 * ReceivingPartiesAndAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount4
 * ReceivingPartiesAndAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount8
 * ReceivingPartiesAndAccount8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties2
 * SettlementParties2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties13
 * SettlementParties13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCapacityParty1Choice
 * TaxCapacityParty1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties5
 * SettlementParties5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties11
 * SettlementParties11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties26
 * SettlementParties26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties12
 * SettlementParties12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties19
 * SettlementParties19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties21
 * SettlementParties21}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCapacityParty2Choice
 * TaxCapacityParty2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties18
 * SettlementParties18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties27
 * SettlementParties27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties4
 * SettlementParties4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties8
 * SettlementParties8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties15
 * SettlementParties15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties16
 * SettlementParties16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties24
 * SettlementParties24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties28
 * SettlementParties28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties7
 * SettlementParties7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties10
 * SettlementParties10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties17
 * SettlementParties17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties6
 * SettlementParties6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties3
 * SettlementParties3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties23
 * SettlementParties23}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCapacityParty3Choice
 * TaxCapacityParty3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount3
 * ReceivingPartiesAndAccount3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount3
 * DeliveringPartiesAndAccount3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties14
 * SettlementParties14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties20
 * SettlementParties20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties22
 * SettlementParties22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount5
 * DeliveringPartiesAndAccount5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount6
 * ReceivingPartiesAndAccount6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount7
 * DeliveringPartiesAndAccount7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount7
 * ReceivingPartiesAndAccount7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementParties2Choice
 * SettlementParties2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount6
 * DeliveringPartiesAndAccount6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount5
 * ReceivingPartiesAndAccount5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9
 * ReceivingPartiesAndAccount9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9
 * DeliveringPartiesAndAccount9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32
 * SettlementParties32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount10
 * DeliveringPartiesAndAccount10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount10
 * ReceivingPartiesAndAccount10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementParties3Choice
 * SettlementParties3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount11
 * ReceivingPartiesAndAccount11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount11
 * DeliveringPartiesAndAccount11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementParties4Choice
 * SettlementParties4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties36
 * SettlementParties36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties39
 * SettlementParties39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties40
 * SettlementParties40}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCapacityParty4Choice
 * TaxCapacityParty4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties42
 * SettlementParties42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14
 * DeliveringPartiesAndAccount14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13
 * DeliveringPartiesAndAccount13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount14
 * ReceivingPartiesAndAccount14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13
 * ReceivingPartiesAndAccount13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementParties5Choice
 * SettlementParties5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount15
 * ReceivingPartiesAndAccount15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount15
 * DeliveringPartiesAndAccount15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties43
 * SettlementParties43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties44
 * SettlementParties44}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCapacityParty5Choice
 * TaxCapacityParty5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties49
 * SettlementParties49}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties58
 * SettlementParties58}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16
 * ReceivingPartiesAndAccount16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount16
 * DeliveringPartiesAndAccount16}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementParties7Choice
 * SettlementParties7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties61
 * SettlementParties61}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount18
 * DeliveringPartiesAndAccount18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount17
 * DeliveringPartiesAndAccount17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount17
 * ReceivingPartiesAndAccount17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount18
 * ReceivingPartiesAndAccount18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties62
 * SettlementParties62}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties63
 * SettlementParties63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties64
 * SettlementParties64}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties73
 * SettlementParties73}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Role played by a party in the context of the settlement of securities."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class SecuritiesSettlementPartyRole extends SettlementPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
	 * SecuritiesSettlement.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement process in which a party plays a role."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesSettlementPartyRole, List<SecuritiesSettlement>> mmSecuritiesSettlement = new MMBusinessAssociationEnd<SecuritiesSettlementPartyRole, List<SecuritiesSettlement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Specifies the settlement process in which a party plays a role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}

		@Override
		public List<SecuritiesSettlement> getValue(SecuritiesSettlementPartyRole obj) {
			return obj.getSecuritiesSettlement();
		}

		@Override
		public void setValue(SecuritiesSettlementPartyRole obj, List<SecuritiesSettlement> value) {
			obj.setSecuritiesSettlement(value);
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesSettlementSystem> securitiesSettlementSystem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem
	 * SecuritiesSettlementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem#mmSettlementParty
	 * SecuritiesSettlementSystem.mmSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the system which may be used by a party in a settlement process."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesSettlementPartyRole, List<SecuritiesSettlementSystem>> mmSecuritiesSettlementSystem = new MMBusinessAssociationEnd<SecuritiesSettlementPartyRole, List<SecuritiesSettlementSystem>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlementSystem";
			definition = "Specifies the system which may be used by a party in a settlement process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementSystem.mmSettlementParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementSystem.mmObject();
		}

		@Override
		public List<SecuritiesSettlementSystem> getValue(SecuritiesSettlementPartyRole obj) {
			return obj.getSecuritiesSettlementSystem();
		}

		@Override
		public void setValue(SecuritiesSettlementPartyRole obj, List<SecuritiesSettlementSystem> value) {
			obj.setSecuritiesSettlementSystem(value);
		}
	};
	protected SettlingCapacityCode settlingCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode
	 * SettlingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmSettlingCapacity
	 * SettlementDetails50.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmSettlingCapacity
	 * SettlementDetails51.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#mmSettlingCapacity
	 * SettlementDetails9.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#mmSettlingCapacity
	 * SettlementDetails17.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#mmSettlingCapacity
	 * SettlementDetails30.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#mmSettlingCapacity
	 * SettlementDetails32.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#mmSettlingCapacity
	 * SettlementDetails60.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#mmSettlingCapacity
	 * SettlementDetails64.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#mmSettlingCapacity
	 * SettlementDetails3.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#mmSettlingCapacity
	 * SettlementDetails16.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#mmSettlingCapacity
	 * SettlementDetails31.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#mmSettlingCapacity
	 * SettlementDetails40.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmSettlingCapacity
	 * SettlementDetails62.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#mmSettlingCapacity
	 * SettlementDetails63.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmSettlingCapacity
	 * SettlementDetails6.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmSettlingCapacity
	 * SettlementDetails20.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmSettlingCapacity
	 * SettlementDetails24.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmSettlingCapacity
	 * SettlementDetails33.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmSettlingCapacity
	 * SettlementDetails45.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmSettlingCapacity
	 * SettlementDetails54.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmSettlingCapacity
	 * SettlementDetails1.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmSettlingCapacity
	 * SettlementDetails19.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmSettlingCapacity
	 * SettlementDetails22.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmSettlingCapacity
	 * SettlementDetails35.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmSettlingCapacity
	 * SettlementDetails42.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmSettlingCapacity
	 * SettlementDetails52.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmSettlingCapacity
	 * SettlementDetails8.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmSettlingCapacity
	 * SettlementDetails11.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmSettlingCapacity
	 * SettlementDetails23.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmSettlingCapacity
	 * SettlementDetails37.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmSettlingCapacity
	 * SettlementDetails44.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmSettlingCapacity
	 * SettlementDetails53.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#mmSettlingCapacity
	 * SettlementDetails7.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#mmSettlingCapacity
	 * SettlementDetails12.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#mmSettlingCapacity
	 * SettlementDetails28.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#mmSettlingCapacity
	 * SettlementDetails38.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#mmSettlingCapacity
	 * SettlementDetails47.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#mmSettlingCapacity
	 * SettlementDetails56.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#mmSettlingCapacity
	 * SettlementDetails2.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#mmSettlingCapacity
	 * SettlementDetails13.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#mmSettlingCapacity
	 * SettlementDetails27.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#mmSettlingCapacity
	 * SettlementDetails39.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#mmSettlingCapacity
	 * SettlementDetails48.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#mmSettlingCapacity
	 * SettlementDetails57.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmSettlingCapacity
	 * SettlementDetails43.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#mmSettlingCapacity
	 * SettlementDetails10.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#mmSettlingCapacity
	 * SettlementDetails29.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#mmSettlingCapacity
	 * SettlementDetails5.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmSettlingCapacity
	 * SettlementDetails26.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#mmSettlingCapacity
	 * SettlementDetails65.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#mmSettlingCapacity
	 * SettlementDetails14.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#mmSettlingCapacity
	 * SettlementDetails41.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#mmSettlingCapacity
	 * SettlementDetails61.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#mmSettlingCapacity
	 * SettlementDetails59.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#mmSettlingCapacity
	 * SettlementDetails15.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmSettlingCapacity
	 * SettlementDetails36.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#mmSettlingCapacity
	 * SettlementDetails66.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmSettlingCapacity
	 * SettlementDetails67.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmSettlingCapacity
	 * SettlementDetails70.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmSettlingCapacity
	 * SettlementDetails68.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmSettlingCapacity
	 * SettlementDetails69.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#mmSettlingCapacity
	 * SettlementDetails71.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmSettlingCapacity
	 * SettlementDetails72.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#mmSettlingCapacity
	 * SettlementDetails75.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#mmSettlingCapacity
	 * SettlementDetails73.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#mmSettlingCapacity
	 * SettlementDetails74.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmSettlingCapacity
	 * SettlementDetails81.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#mmSettlingCapacity
	 * SettlementDetails76.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmSettlingCapacity
	 * SettlementDetails80.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#mmSettlingCapacity
	 * SettlementDetails78.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#mmSettlingCapacity
	 * SettlementDetails77.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#mmSettlingCapacity
	 * SettlementDetails79.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#mmSettlingCapacity
	 * SettlementDetails87.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmSettlingCapacity
	 * SettlementDetails83.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#mmSettlingCapacity
	 * SettlementDetails86.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmSettlingCapacity
	 * SettlementDetails85.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmSettlingCapacity
	 * SettlementDetails93.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmSettlingCapacity
	 * SettlementDetails90.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmSettlingCapacity
	 * SettlementDetails96.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmSettlingCapacity
	 * SettlementDetails97.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmSettlingCapacity
	 * SettlementDetails94.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmSettlingCapacity
	 * SettlementDetails95.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#mmSettlingCapacity
	 * SettlementDetails91.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#mmSettlingCapacity
	 * SettlementDetails92.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmSettlingCapacity
	 * SettlementDetails98.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmSettlingCapacity
	 * SettlementDetails101.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#mmSettlingCapacity
	 * SettlementDetails105.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#mmSettlingCapacity
	 * SettlementDetails106.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#mmSettlingCapacity
	 * SettlementDetails104.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmSettlingCapacity
	 * SettlementDetails111.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmSettlingCapacity
	 * SettlementDetails112.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmSettlingCapacity
	 * SettlementDetails110.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#mmSettlingCapacity
	 * SettlementDetails107.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmSettlingCapacity
	 * SettlementDetails115.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#mmSettlingCapacity
	 * SettlementDetails117.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#mmSettlingCapacity
	 * SettlementDetails116.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmSettlingCapacity
	 * SettlementDetails113.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmSettlingCapacity
	 * SettlementDetails128.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmSettlingCapacity
	 * SettlementDetails120.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmSettlingCapacity
	 * SettlementDetails119.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmSettlingCapacity
	 * SettlementDetails126.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmSettlingCapacity
	 * SettlementDetails122.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmSettlingCapacity
	 * SettlementDetails127.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmSettlingCapacity
	 * SettlementDetails121.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmSettlingCapacity
	 * SettlementDetails134.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmSettlingCapacity
	 * SettlementDetails137.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmSettlingCapacity
	 * SettlementDetails132.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmSettlingCapacity
	 * SettlementDetails138.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#mmSettlingCapacity
	 * SettlementDetails130.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmSettlingCapacity
	 * SettlementDetails133.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#mmSettlingCapacity
	 * SettlementDetails139.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmSettlingCapacity
	 * SettlementDetails140.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmSettlingCapacity
	 * SettlementDetails147.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmSettlingCapacity
	 * SettlementDetails142.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmSettlingCapacity
	 * SettlementDetails144.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmSettlingCapacity
	 * SettlementDetails148.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmSettlingCapacity
	 * SettlementDetails145.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmSettlingCapacity
	 * SettlementDetails146.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmSettlingCapacity
	 * SettlementDetails143.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmSettlingCapacity
	 * SettlementDetails149.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmSettlingCapacity
	 * SettlementDetails150.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails151#mmSettlingCapacity
	 * SettlementDetails151.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails152#mmSettlingCapacity
	 * SettlementDetails152.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails155#mmSettlingCapacity
	 * SettlementDetails155.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmSettlingCapacity
	 * SettlementDetails156.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmSettlingCapacity
	 * SettlementDetails157.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails158#mmSettlingCapacity
	 * SettlementDetails158.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails160#mmSettlingCapacity
	 * SettlementDetails160.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails161#mmSettlingCapacity
	 * SettlementDetails161.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails162#mmSettlingCapacity
	 * SettlementDetails162.mmSettlingCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role of a party in the settlement of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRCA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesSettlementPartyRole, SettlingCapacityCode> mmSettlingCapacity = new MMBusinessAttribute<SecuritiesSettlementPartyRole, SettlingCapacityCode>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails50.mmSettlingCapacity, SettlementDetails51.mmSettlingCapacity, SettlementDetails9.mmSettlingCapacity, SettlementDetails17.mmSettlingCapacity,
					SettlementDetails30.mmSettlingCapacity, SettlementDetails32.mmSettlingCapacity, SettlementDetails60.mmSettlingCapacity, SettlementDetails64.mmSettlingCapacity, SettlementDetails3.mmSettlingCapacity,
					SettlementDetails16.mmSettlingCapacity, SettlementDetails31.mmSettlingCapacity, SettlementDetails40.mmSettlingCapacity, SettlementDetails62.mmSettlingCapacity, SettlementDetails63.mmSettlingCapacity,
					SettlementDetails6.mmSettlingCapacity, SettlementDetails20.mmSettlingCapacity, SettlementDetails24.mmSettlingCapacity, SettlementDetails33.mmSettlingCapacity, SettlementDetails45.mmSettlingCapacity,
					SettlementDetails54.mmSettlingCapacity, SettlementDetails1.mmSettlingCapacity, SettlementDetails19.mmSettlingCapacity, SettlementDetails22.mmSettlingCapacity, SettlementDetails35.mmSettlingCapacity,
					SettlementDetails42.mmSettlingCapacity, SettlementDetails52.mmSettlingCapacity, SettlementDetails8.mmSettlingCapacity, SettlementDetails11.mmSettlingCapacity, SettlementDetails23.mmSettlingCapacity,
					SettlementDetails37.mmSettlingCapacity, SettlementDetails44.mmSettlingCapacity, SettlementDetails53.mmSettlingCapacity, SettlementDetails7.mmSettlingCapacity, SettlementDetails12.mmSettlingCapacity,
					SettlementDetails28.mmSettlingCapacity, SettlementDetails38.mmSettlingCapacity, SettlementDetails47.mmSettlingCapacity, SettlementDetails56.mmSettlingCapacity, SettlementDetails2.mmSettlingCapacity,
					SettlementDetails13.mmSettlingCapacity, SettlementDetails27.mmSettlingCapacity, SettlementDetails39.mmSettlingCapacity, SettlementDetails48.mmSettlingCapacity, SettlementDetails57.mmSettlingCapacity,
					SettlementDetails43.mmSettlingCapacity, SettlementDetails10.mmSettlingCapacity, SettlementDetails29.mmSettlingCapacity, SettlementDetails5.mmSettlingCapacity, SettlementDetails26.mmSettlingCapacity,
					SettlementDetails65.mmSettlingCapacity, SettlementDetails14.mmSettlingCapacity, SettlementDetails41.mmSettlingCapacity, SettlementDetails61.mmSettlingCapacity, SettlementDetails59.mmSettlingCapacity,
					SettlementDetails15.mmSettlingCapacity, SettlementDetails36.mmSettlingCapacity, SettlementDetails66.mmSettlingCapacity, SettlementDetails67.mmSettlingCapacity, SettlementDetails70.mmSettlingCapacity,
					SettlementDetails68.mmSettlingCapacity, SettlementDetails69.mmSettlingCapacity, SettlementDetails71.mmSettlingCapacity, SettlementDetails72.mmSettlingCapacity, SettlementDetails75.mmSettlingCapacity,
					SettlementDetails73.mmSettlingCapacity, SettlementDetails74.mmSettlingCapacity, SettlementDetails81.mmSettlingCapacity, SettlementDetails76.mmSettlingCapacity, SettlementDetails80.mmSettlingCapacity,
					SettlementDetails78.mmSettlingCapacity, SettlementDetails77.mmSettlingCapacity, SettlementDetails79.mmSettlingCapacity, SettlementDetails87.mmSettlingCapacity, SettlementDetails83.mmSettlingCapacity,
					SettlementDetails86.mmSettlingCapacity, SettlementDetails85.mmSettlingCapacity, SettlementDetails93.mmSettlingCapacity, SettlementDetails90.mmSettlingCapacity, SettlementDetails96.mmSettlingCapacity,
					SettlementDetails97.mmSettlingCapacity, SettlementDetails94.mmSettlingCapacity, SettlementDetails95.mmSettlingCapacity, SettlementDetails91.mmSettlingCapacity, SettlementDetails92.mmSettlingCapacity,
					SettlementDetails98.mmSettlingCapacity, SettlementDetails101.mmSettlingCapacity, SettlementDetails105.mmSettlingCapacity, SettlementDetails106.mmSettlingCapacity, SettlementDetails104.mmSettlingCapacity,
					SettlementDetails111.mmSettlingCapacity, SettlementDetails112.mmSettlingCapacity, SettlementDetails110.mmSettlingCapacity, SettlementDetails107.mmSettlingCapacity, SettlementDetails115.mmSettlingCapacity,
					SettlementDetails117.mmSettlingCapacity, SettlementDetails116.mmSettlingCapacity, SettlementDetails113.mmSettlingCapacity, SettlementDetails128.mmSettlingCapacity, SettlementDetails120.mmSettlingCapacity,
					SettlementDetails119.mmSettlingCapacity, SettlementDetails126.mmSettlingCapacity, SettlementDetails122.mmSettlingCapacity, SettlementDetails127.mmSettlingCapacity, SettlementDetails121.mmSettlingCapacity,
					SettlementDetails134.mmSettlingCapacity, SettlementDetails137.mmSettlingCapacity, SettlementDetails132.mmSettlingCapacity, SettlementDetails138.mmSettlingCapacity, SettlementDetails130.mmSettlingCapacity,
					SettlementDetails133.mmSettlingCapacity, SettlementDetails139.mmSettlingCapacity, SettlementDetails140.mmSettlingCapacity, SettlementDetails147.mmSettlingCapacity, SettlementDetails142.mmSettlingCapacity,
					SettlementDetails144.mmSettlingCapacity, SettlementDetails148.mmSettlingCapacity, SettlementDetails145.mmSettlingCapacity, SettlementDetails146.mmSettlingCapacity, SettlementDetails143.mmSettlingCapacity,
					SettlementDetails149.mmSettlingCapacity, SettlementDetails150.mmSettlingCapacity, SettlementDetails151.mmSettlingCapacity, SettlementDetails152.mmSettlingCapacity, SettlementDetails155.mmSettlingCapacity,
					SettlementDetails156.mmSettlingCapacity, SettlementDetails157.mmSettlingCapacity, SettlementDetails158.mmSettlingCapacity, SettlementDetails160.mmSettlingCapacity, SettlementDetails161.mmSettlingCapacity,
					SettlementDetails162.mmSettlingCapacity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRCA"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlingCapacity";
			definition = "Role of a party in the settlement of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlingCapacityCode.mmObject();
		}

		@Override
		public SettlingCapacityCode getValue(SecuritiesSettlementPartyRole obj) {
			return obj.getSettlingCapacity();
		}

		@Override
		public void setValue(SecuritiesSettlementPartyRole obj, SettlingCapacityCode value) {
			obj.setSettlingCapacity(value);
		}
	};
	protected TaxLiabilityCode taxCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxLiabilityCode
	 * TaxLiabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty1Choice#mmCode
	 * TaxCapacityParty1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty1Choice#mmProprietary
	 * TaxCapacityParty1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmTaxCapacity
	 * SettlementDetails50.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty2Choice#mmCode
	 * TaxCapacityParty2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty2Choice#mmProprietary
	 * TaxCapacityParty2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmTaxCapacity
	 * SettlementDetails51.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#mmTaxCapacity
	 * SettlementDetails9.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#mmTaxCapacity
	 * SettlementDetails17.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#mmTaxCapacity
	 * SettlementDetails30.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#mmTaxCapacity
	 * SettlementDetails32.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#mmTaxCapacity
	 * SettlementDetails60.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#mmTaxCapacity
	 * SettlementDetails64.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#mmTaxCapacity
	 * SettlementDetails3.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#mmTaxCapacity
	 * SettlementDetails16.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#mmTaxCapacity
	 * SettlementDetails31.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#mmTaxCapacity
	 * SettlementDetails40.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmTaxCapacity
	 * SettlementDetails62.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#mmTaxCapacity
	 * SettlementDetails63.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmTaxCapacity
	 * SettlementDetails6.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmTaxCapacity
	 * SettlementDetails20.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmTaxCapacity
	 * SettlementDetails24.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmTaxCapacity
	 * SettlementDetails33.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmTaxCapacity
	 * SettlementDetails45.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmTaxCapacity
	 * SettlementDetails54.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmTaxCapacity
	 * SettlementDetails1.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmTaxCapacity
	 * SettlementDetails19.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmTaxCapacity
	 * SettlementDetails22.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmTaxCapacity
	 * SettlementDetails35.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmTaxCapacity
	 * SettlementDetails42.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmTaxCapacity
	 * SettlementDetails52.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmTaxCapacity
	 * SettlementDetails8.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmTaxCapacity
	 * SettlementDetails11.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmTaxCapacity
	 * SettlementDetails23.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmTaxCapacity
	 * SettlementDetails37.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmTaxCapacity
	 * SettlementDetails44.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmTaxCapacity
	 * SettlementDetails53.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#mmTaxCapacity
	 * SettlementDetails7.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#mmTaxCapacity
	 * SettlementDetails12.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#mmTaxCapacity
	 * SettlementDetails28.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#mmTaxCapacity
	 * SettlementDetails38.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#mmTaxCapacity
	 * SettlementDetails47.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#mmTaxCapacity
	 * SettlementDetails56.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#mmTaxCapacity
	 * SettlementDetails2.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#mmTaxCapacity
	 * SettlementDetails13.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#mmTaxCapacity
	 * SettlementDetails27.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#mmTaxCapacity
	 * SettlementDetails39.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#mmTaxCapacity
	 * SettlementDetails48.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#mmTaxCapacity
	 * SettlementDetails57.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty3Choice#mmCode
	 * TaxCapacityParty3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty3Choice#mmProprietary
	 * TaxCapacityParty3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmTaxCapacity
	 * SettlementDetails43.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails4#mmTaxCapacity
	 * SettlementDetails4.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#mmTaxCapacity
	 * SettlementDetails10.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#mmTaxCapacity
	 * SettlementDetails29.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#mmTaxCapacity
	 * SettlementDetails5.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmTaxCapacity
	 * SettlementDetails26.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#mmTaxCapacity
	 * SettlementDetails65.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#mmTaxCapacity
	 * SettlementDetails14.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#mmTaxCapacity
	 * SettlementDetails41.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#mmTaxCapacity
	 * SettlementDetails61.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#mmTaxCapacity
	 * SettlementDetails59.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#mmTaxCapacity
	 * SettlementDetails15.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmTaxCapacity
	 * SettlementDetails36.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails18#mmTaxCapacity
	 * SettlementDetails18.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#mmTaxCapacity
	 * SettlementDetails66.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmTaxCapacity
	 * SettlementDetails67.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmTaxCapacity
	 * SettlementDetails70.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmTaxCapacity
	 * SettlementDetails68.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmTaxCapacity
	 * SettlementDetails69.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#mmTaxCapacity
	 * SettlementDetails71.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmTaxCapacity
	 * SettlementDetails72.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#mmTaxCapacity
	 * SettlementDetails75.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#mmTaxCapacity
	 * SettlementDetails73.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#mmTaxCapacity
	 * SettlementDetails74.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmTaxCapacity
	 * SettlementDetails81.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#mmTaxCapacity
	 * SettlementDetails76.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmTaxCapacity
	 * SettlementDetails80.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#mmTaxCapacity
	 * SettlementDetails78.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#mmTaxCapacity
	 * SettlementDetails77.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#mmTaxCapacity
	 * SettlementDetails79.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#mmTaxCapacity
	 * SettlementDetails87.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmTaxCapacity
	 * SettlementDetails83.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#mmTaxCapacity
	 * SettlementDetails86.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmTaxCapacity
	 * SettlementDetails85.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmTaxCapacity
	 * SettlementDetails93.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmTaxCapacity
	 * SettlementDetails90.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmTaxCapacity
	 * SettlementDetails96.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmTaxCapacity
	 * SettlementDetails97.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmTaxCapacity
	 * SettlementDetails94.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#mmTaxCapacity
	 * SettlementDetails100.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty4Choice#mmCode
	 * TaxCapacityParty4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty4Choice#mmProprietary
	 * TaxCapacityParty4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmTaxCapacity
	 * SettlementDetails95.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#mmTaxCapacity
	 * SettlementDetails91.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#mmTaxCapacity
	 * SettlementDetails92.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmTaxCapacity
	 * SettlementDetails98.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmTaxCapacity
	 * SettlementDetails101.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#mmTaxCapacity
	 * SettlementDetails105.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#mmTaxCapacity
	 * SettlementDetails106.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#mmTaxCapacity
	 * SettlementDetails104.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmTaxCapacity
	 * SettlementDetails111.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmTaxCapacity
	 * SettlementDetails112.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmTaxCapacity
	 * SettlementDetails110.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails103#mmTaxCapacity
	 * SettlementDetails103.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#mmTaxCapacity
	 * SettlementDetails107.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmTaxCapacity
	 * SettlementDetails115.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#mmTaxCapacity
	 * SettlementDetails117.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty5Choice#mmCode
	 * TaxCapacityParty5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty5Choice#mmProprietary
	 * TaxCapacityParty5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#mmTaxCapacity
	 * SettlementDetails116.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmTaxCapacity
	 * SettlementDetails113.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmTaxCapacity
	 * SettlementDetails128.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmTaxCapacity
	 * SettlementDetails120.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmTaxCapacity
	 * SettlementDetails119.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmTaxCapacity
	 * SettlementDetails126.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmTaxCapacity
	 * SettlementDetails122.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmTaxCapacity
	 * SettlementDetails127.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmTaxCapacity
	 * SettlementDetails121.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmTaxCapacity
	 * SettlementDetails134.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmTaxCapacity
	 * SettlementDetails137.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmTaxCapacity
	 * SettlementDetails132.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmTaxCapacity
	 * SettlementDetails138.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#mmTaxCapacity
	 * SettlementDetails130.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmTaxCapacity
	 * SettlementDetails133.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#mmTaxCapacity
	 * SettlementDetails139.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmTaxCapacity
	 * SettlementDetails140.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmTaxCapacity
	 * SettlementDetails147.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmTaxCapacity
	 * SettlementDetails142.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmTaxCapacity
	 * SettlementDetails144.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmTaxCapacity
	 * SettlementDetails148.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmTaxCapacity
	 * SettlementDetails145.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmTaxCapacity
	 * SettlementDetails146.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmTaxCapacity
	 * SettlementDetails143.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmTaxCapacity
	 * SettlementDetails149.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmTaxCapacity
	 * SettlementDetails150.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails151#mmTaxCapacity
	 * SettlementDetails151.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails152#mmTaxCapacity
	 * SettlementDetails152.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails155#mmTaxCapacity
	 * SettlementDetails155.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmTaxCapacity
	 * SettlementDetails156.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmTaxCapacity
	 * SettlementDetails157.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails158#mmTaxCapacity
	 * SettlementDetails158.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails160#mmTaxCapacity
	 * SettlementDetails160.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails161#mmTaxCapacity
	 * SettlementDetails161.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails162#mmTaxCapacity
	 * SettlementDetails162.mmTaxCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax role capacity of the instructing party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TCPI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesSettlementPartyRole, TaxLiabilityCode> mmTaxCapacity = new MMBusinessAttribute<SecuritiesSettlementPartyRole, TaxLiabilityCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxCapacityParty1Choice.mmCode, TaxCapacityParty1Choice.mmProprietary, SettlementDetails50.mmTaxCapacity, TaxCapacityParty2Choice.mmCode, TaxCapacityParty2Choice.mmProprietary,
					SettlementDetails51.mmTaxCapacity, SettlementDetails9.mmTaxCapacity, SettlementDetails17.mmTaxCapacity, SettlementDetails30.mmTaxCapacity, SettlementDetails32.mmTaxCapacity, SettlementDetails60.mmTaxCapacity,
					SettlementDetails64.mmTaxCapacity, SettlementDetails3.mmTaxCapacity, SettlementDetails16.mmTaxCapacity, SettlementDetails31.mmTaxCapacity, SettlementDetails40.mmTaxCapacity, SettlementDetails62.mmTaxCapacity,
					SettlementDetails63.mmTaxCapacity, SettlementDetails6.mmTaxCapacity, SettlementDetails20.mmTaxCapacity, SettlementDetails24.mmTaxCapacity, SettlementDetails33.mmTaxCapacity, SettlementDetails45.mmTaxCapacity,
					SettlementDetails54.mmTaxCapacity, SettlementDetails1.mmTaxCapacity, SettlementDetails19.mmTaxCapacity, SettlementDetails22.mmTaxCapacity, SettlementDetails35.mmTaxCapacity, SettlementDetails42.mmTaxCapacity,
					SettlementDetails52.mmTaxCapacity, SettlementDetails8.mmTaxCapacity, SettlementDetails11.mmTaxCapacity, SettlementDetails23.mmTaxCapacity, SettlementDetails37.mmTaxCapacity, SettlementDetails44.mmTaxCapacity,
					SettlementDetails53.mmTaxCapacity, SettlementDetails7.mmTaxCapacity, SettlementDetails12.mmTaxCapacity, SettlementDetails28.mmTaxCapacity, SettlementDetails38.mmTaxCapacity, SettlementDetails47.mmTaxCapacity,
					SettlementDetails56.mmTaxCapacity, SettlementDetails2.mmTaxCapacity, SettlementDetails13.mmTaxCapacity, SettlementDetails27.mmTaxCapacity, SettlementDetails39.mmTaxCapacity, SettlementDetails48.mmTaxCapacity,
					SettlementDetails57.mmTaxCapacity, TaxCapacityParty3Choice.mmCode, TaxCapacityParty3Choice.mmProprietary, SettlementDetails43.mmTaxCapacity, SettlementDetails4.mmTaxCapacity, SettlementDetails10.mmTaxCapacity,
					SettlementDetails29.mmTaxCapacity, SettlementDetails5.mmTaxCapacity, SettlementDetails26.mmTaxCapacity, SettlementDetails65.mmTaxCapacity, SettlementDetails14.mmTaxCapacity, SettlementDetails41.mmTaxCapacity,
					SettlementDetails61.mmTaxCapacity, SettlementDetails59.mmTaxCapacity, SettlementDetails15.mmTaxCapacity, SettlementDetails36.mmTaxCapacity, SettlementDetails18.mmTaxCapacity, SettlementDetails66.mmTaxCapacity,
					SettlementDetails67.mmTaxCapacity, SettlementDetails70.mmTaxCapacity, SettlementDetails68.mmTaxCapacity, SettlementDetails69.mmTaxCapacity, SettlementDetails71.mmTaxCapacity, SettlementDetails72.mmTaxCapacity,
					SettlementDetails75.mmTaxCapacity, SettlementDetails73.mmTaxCapacity, SettlementDetails74.mmTaxCapacity, SettlementDetails81.mmTaxCapacity, SettlementDetails76.mmTaxCapacity, SettlementDetails80.mmTaxCapacity,
					SettlementDetails78.mmTaxCapacity, SettlementDetails77.mmTaxCapacity, SettlementDetails79.mmTaxCapacity, SettlementDetails87.mmTaxCapacity, SettlementDetails83.mmTaxCapacity, SettlementDetails86.mmTaxCapacity,
					SettlementDetails85.mmTaxCapacity, SettlementDetails93.mmTaxCapacity, SettlementDetails90.mmTaxCapacity, SettlementDetails96.mmTaxCapacity, SettlementDetails97.mmTaxCapacity, SettlementDetails94.mmTaxCapacity,
					SettlementDetails100.mmTaxCapacity, TaxCapacityParty4Choice.mmCode, TaxCapacityParty4Choice.mmProprietary, SettlementDetails95.mmTaxCapacity, SettlementDetails91.mmTaxCapacity, SettlementDetails92.mmTaxCapacity,
					SettlementDetails98.mmTaxCapacity, SettlementDetails101.mmTaxCapacity, SettlementDetails105.mmTaxCapacity, SettlementDetails106.mmTaxCapacity, SettlementDetails104.mmTaxCapacity, SettlementDetails111.mmTaxCapacity,
					SettlementDetails112.mmTaxCapacity, SettlementDetails110.mmTaxCapacity, SettlementDetails103.mmTaxCapacity, SettlementDetails107.mmTaxCapacity, SettlementDetails115.mmTaxCapacity, SettlementDetails117.mmTaxCapacity,
					TaxCapacityParty5Choice.mmCode, TaxCapacityParty5Choice.mmProprietary, SettlementDetails116.mmTaxCapacity, SettlementDetails113.mmTaxCapacity, SettlementDetails128.mmTaxCapacity, SettlementDetails120.mmTaxCapacity,
					SettlementDetails119.mmTaxCapacity, SettlementDetails126.mmTaxCapacity, SettlementDetails122.mmTaxCapacity, SettlementDetails127.mmTaxCapacity, SettlementDetails121.mmTaxCapacity, SettlementDetails134.mmTaxCapacity,
					SettlementDetails137.mmTaxCapacity, SettlementDetails132.mmTaxCapacity, SettlementDetails138.mmTaxCapacity, SettlementDetails130.mmTaxCapacity, SettlementDetails133.mmTaxCapacity, SettlementDetails139.mmTaxCapacity,
					SettlementDetails140.mmTaxCapacity, SettlementDetails147.mmTaxCapacity, SettlementDetails142.mmTaxCapacity, SettlementDetails144.mmTaxCapacity, SettlementDetails148.mmTaxCapacity, SettlementDetails145.mmTaxCapacity,
					SettlementDetails146.mmTaxCapacity, SettlementDetails143.mmTaxCapacity, SettlementDetails149.mmTaxCapacity, SettlementDetails150.mmTaxCapacity, SettlementDetails151.mmTaxCapacity, SettlementDetails152.mmTaxCapacity,
					SettlementDetails155.mmTaxCapacity, SettlementDetails156.mmTaxCapacity, SettlementDetails157.mmTaxCapacity, SettlementDetails158.mmTaxCapacity, SettlementDetails160.mmTaxCapacity, SettlementDetails161.mmTaxCapacity,
					SettlementDetails162.mmTaxCapacity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TCPI"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxCapacity";
			definition = "Tax role capacity of the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxLiabilityCode.mmObject();
		}

		@Override
		public TaxLiabilityCode getValue(SecuritiesSettlementPartyRole obj) {
			return obj.getTaxCapacity();
		}

		@Override
		public void setValue(SecuritiesSettlementPartyRole obj, TaxLiabilityCode value) {
			obj.setTaxCapacity(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementPartyRole";
				definition = "Role played by a party in the context of the settlement of securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlement.mmPartyRole, com.tools20022.repository.entity.SecuritiesSettlementSystem.mmSettlementParty);
				derivationElement_lazy = () -> Arrays.asList(ReceivingPartiesAndAccount7.mmParty1, ReceivingPartiesAndAccount7.mmParty2, SettlementParties32.mmDepository, SettlementParties32.mmParty1, SettlementParties32.mmParty2,
						SettlementParties32.mmParty3, SettlementParties32.mmParty4, SettlementParties32.mmParty5, ReceivingPartiesAndAccount10.mmParty1, ReceivingPartiesAndAccount10.mmParty2, ReceivingPartiesAndAccount11.mmParty1,
						ReceivingPartiesAndAccount11.mmParty2, InvestmentAccount54.mmSettlementPartiesDetails, ReceivingPartiesAndAccount15.mmParty1, ReceivingPartiesAndAccount15.mmParty2, InvestmentAccount66.mmSettlementPartiesDetails);
				subType_lazy = () -> Arrays.asList(ReceivingSettlementParty.mmObject(), DeliveringSettlementParty.mmObject(), ReceivingAgent.mmObject(), LocalSettlementAgentRole.mmObject(), DeliverersCustodian.mmObject(),
						DeliverersIntermediary.mmObject(), DeliveringAgent.mmObject(), PlaceOfSettlement.mmObject(), ReceiversCustodian.mmObject(), ReceiversIntermediary.mmObject());
				superType_lazy = () -> SettlementPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSecuritiesSettlement, com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSecuritiesSettlementSystem,
						com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSettlingCapacity, com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmTaxCapacity);
				derivationComponent_lazy = () -> Arrays.asList(DeliveringPartiesAndAccount1.mmObject(), DeliveringPartiesAndAccount4.mmObject(), DeliveringPartiesAndAccount8.mmObject(), ReceivingPartiesAndAccount1.mmObject(),
						ReceivingPartiesAndAccount4.mmObject(), ReceivingPartiesAndAccount8.mmObject(), SettlementParties2.mmObject(), SettlementParties13.mmObject(), TaxCapacityParty1Choice.mmObject(), SettlementParties5.mmObject(),
						SettlementParties11.mmObject(), SettlementParties26.mmObject(), SettlementParties12.mmObject(), SettlementParties19.mmObject(), SettlementParties21.mmObject(), TaxCapacityParty2Choice.mmObject(),
						SettlementParties18.mmObject(), SettlementParties27.mmObject(), SettlementParties4.mmObject(), SettlementParties8.mmObject(), SettlementParties15.mmObject(), SettlementParties16.mmObject(),
						SettlementParties24.mmObject(), SettlementParties28.mmObject(), SettlementParties7.mmObject(), SettlementParties10.mmObject(), SettlementParties17.mmObject(), SettlementParties6.mmObject(),
						SettlementParties3.mmObject(), SettlementParties23.mmObject(), TaxCapacityParty3Choice.mmObject(), ReceivingPartiesAndAccount3.mmObject(), DeliveringPartiesAndAccount3.mmObject(), SettlementParties14.mmObject(),
						SettlementParties20.mmObject(), SettlementParties22.mmObject(), DeliveringPartiesAndAccount5.mmObject(), ReceivingPartiesAndAccount6.mmObject(), DeliveringPartiesAndAccount7.mmObject(),
						ReceivingPartiesAndAccount7.mmObject(), SettlementParties2Choice.mmObject(), DeliveringPartiesAndAccount6.mmObject(), ReceivingPartiesAndAccount5.mmObject(), ReceivingPartiesAndAccount9.mmObject(),
						DeliveringPartiesAndAccount9.mmObject(), SettlementParties32.mmObject(), DeliveringPartiesAndAccount10.mmObject(), ReceivingPartiesAndAccount10.mmObject(), SettlementParties3Choice.mmObject(),
						ReceivingPartiesAndAccount11.mmObject(), DeliveringPartiesAndAccount11.mmObject(), SettlementParties4Choice.mmObject(), SettlementParties36.mmObject(), SettlementParties39.mmObject(), SettlementParties40.mmObject(),
						TaxCapacityParty4Choice.mmObject(), SettlementParties42.mmObject(), DeliveringPartiesAndAccount14.mmObject(), DeliveringPartiesAndAccount13.mmObject(), ReceivingPartiesAndAccount14.mmObject(),
						ReceivingPartiesAndAccount13.mmObject(), SettlementParties5Choice.mmObject(), ReceivingPartiesAndAccount15.mmObject(), DeliveringPartiesAndAccount15.mmObject(), SettlementParties43.mmObject(),
						SettlementParties44.mmObject(), TaxCapacityParty5Choice.mmObject(), SettlementParties49.mmObject(), SettlementParties58.mmObject(), ReceivingPartiesAndAccount16.mmObject(), DeliveringPartiesAndAccount16.mmObject(),
						SettlementParties7Choice.mmObject(), SettlementParties61.mmObject(), DeliveringPartiesAndAccount18.mmObject(), DeliveringPartiesAndAccount17.mmObject(), ReceivingPartiesAndAccount17.mmObject(),
						ReceivingPartiesAndAccount18.mmObject(), SettlementParties62.mmObject(), SettlementParties63.mmObject(), SettlementParties64.mmObject(), SettlementParties73.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementPartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesSettlement> getSecuritiesSettlement() {
		return securitiesSettlement == null ? securitiesSettlement = new ArrayList<>() : securitiesSettlement;
	}

	public SecuritiesSettlementPartyRole setSecuritiesSettlement(List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement) {
		this.securitiesSettlement = Objects.requireNonNull(securitiesSettlement);
		return this;
	}

	public List<SecuritiesSettlementSystem> getSecuritiesSettlementSystem() {
		return securitiesSettlementSystem == null ? securitiesSettlementSystem = new ArrayList<>() : securitiesSettlementSystem;
	}

	public SecuritiesSettlementPartyRole setSecuritiesSettlementSystem(List<com.tools20022.repository.entity.SecuritiesSettlementSystem> securitiesSettlementSystem) {
		this.securitiesSettlementSystem = Objects.requireNonNull(securitiesSettlementSystem);
		return this;
	}

	public SettlingCapacityCode getSettlingCapacity() {
		return settlingCapacity;
	}

	public SecuritiesSettlementPartyRole setSettlingCapacity(SettlingCapacityCode settlingCapacity) {
		this.settlingCapacity = Objects.requireNonNull(settlingCapacity);
		return this;
	}

	public TaxLiabilityCode getTaxCapacity() {
		return taxCapacity;
	}

	public SecuritiesSettlementPartyRole setTaxCapacity(TaxLiabilityCode taxCapacity) {
		this.taxCapacity = Objects.requireNonNull(taxCapacity);
		return this;
	}
}