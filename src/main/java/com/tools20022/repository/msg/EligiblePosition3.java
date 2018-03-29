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
import com.tools20022.repository.choice.PartyIdentification9Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.HoldingBalance6;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the voting entitlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligiblePosition3#mmAccountIdentification
 * EligiblePosition3.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligiblePosition3#mmAccountOwner
 * EligiblePosition3.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligiblePosition3#mmHoldingBalance
 * EligiblePosition3.mmHoldingBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligiblePosition3#mmRightsHolder
 * EligiblePosition3.mmRightsHolder}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline#forEligiblePosition3
 * ConstraintRightsHolderMultiplicty1Guideline.forEligiblePosition3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EligiblePosition3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the voting entitlement."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EligiblePosition5
 * EligiblePosition5}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EligiblePosition3", propOrder = {"accountIdentification", "accountOwner", "holdingBalance", "rightsHolder"})
public class EligiblePosition3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId")
	protected Max35Text accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition3
	 * EligiblePosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the securities account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition5#mmAccountIdentification
	 * EligiblePosition5.mmAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EligiblePosition3, Optional<Max35Text>> mmAccountIdentification = new MMMessageAttribute<EligiblePosition3, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.EligiblePosition3.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Identification of the securities account.";
			nextVersions_lazy = () -> Arrays.asList(EligiblePosition5.mmAccountIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(EligiblePosition3 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(EligiblePosition3 obj, Optional<Max35Text> value) {
			obj.setAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification9Choice accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification9Choice
	 * PartyIdentification9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition3
	 * EligiblePosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies party that legally owns the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition5#mmAccountOwner
	 * EligiblePosition5.mmAccountOwner}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EligiblePosition3, Optional<PartyIdentification9Choice>> mmAccountOwner = new MMMessageAssociationEnd<EligiblePosition3, Optional<PartyIdentification9Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.EligiblePosition3.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Identifies party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(EligiblePosition5.mmAccountOwner);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification9Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification9Choice> getValue(EligiblePosition3 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(EligiblePosition3 obj, Optional<PartyIdentification9Choice> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "HldgBal")
	protected List<HoldingBalance6> holdingBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.HoldingBalance6
	 * HoldingBalance6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition3
	 * EligiblePosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net position of a segregated holding of a single security within the overall position held in a securities account, eg, sub-balance per status."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition5#mmHoldingBalance
	 * EligiblePosition5.mmHoldingBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EligiblePosition3, List<HoldingBalance6>> mmHoldingBalance = new MMMessageAssociationEnd<EligiblePosition3, List<HoldingBalance6>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.EligiblePosition3.mmObject();
			isDerived = false;
			xmlTag = "HldgBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingBalance";
			definition = "Net position of a segregated holding of a single security within the overall position held in a securities account, eg, sub-balance per status.";
			nextVersions_lazy = () -> Arrays.asList(EligiblePosition5.mmHoldingBalance);
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> HoldingBalance6.mmObject();
		}

		@Override
		public List<HoldingBalance6> getValue(EligiblePosition3 obj) {
			return obj.getHoldingBalance();
		}

		@Override
		public void setValue(EligiblePosition3 obj, List<HoldingBalance6> value) {
			obj.setHoldingBalance(value);
		}
	};
	@XmlElement(name = "RghtsHldr")
	protected List<PartyIdentification9Choice> rightsHolder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification9Choice
	 * PartyIdentification9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition3
	 * EligiblePosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RghtsHldr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies owner of the voting rights."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligiblePosition5#mmRightsHolder
	 * EligiblePosition5.mmRightsHolder}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EligiblePosition3, List<PartyIdentification9Choice>> mmRightsHolder = new MMMessageAssociationEnd<EligiblePosition3, List<PartyIdentification9Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.EligiblePosition3.mmObject();
			isDerived = false;
			xmlTag = "RghtsHldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolder";
			definition = "Identifies owner of the voting rights.";
			nextVersions_lazy = () -> Arrays.asList(EligiblePosition5.mmRightsHolder);
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification9Choice.mmObject();
		}

		@Override
		public List<PartyIdentification9Choice> getValue(EligiblePosition3 obj) {
			return obj.getRightsHolder();
		}

		@Override
		public void setValue(EligiblePosition3 obj, List<PartyIdentification9Choice> value) {
			obj.setRightsHolder(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EligiblePosition3.mmAccountIdentification, com.tools20022.repository.msg.EligiblePosition3.mmAccountOwner,
						com.tools20022.repository.msg.EligiblePosition3.mmHoldingBalance, com.tools20022.repository.msg.EligiblePosition3.mmRightsHolder);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline.forEligiblePosition3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EligiblePosition3";
				definition = "Specifies the voting entitlement.";
				nextVersions_lazy = () -> Arrays.asList(EligiblePosition5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getAccountIdentification() {
		return accountIdentification == null ? Optional.empty() : Optional.of(accountIdentification);
	}

	public EligiblePosition3 setAccountIdentification(Max35Text accountIdentification) {
		this.accountIdentification = accountIdentification;
		return this;
	}

	public Optional<PartyIdentification9Choice> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public EligiblePosition3 setAccountOwner(PartyIdentification9Choice accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public List<HoldingBalance6> getHoldingBalance() {
		return holdingBalance == null ? holdingBalance = new ArrayList<>() : holdingBalance;
	}

	public EligiblePosition3 setHoldingBalance(List<HoldingBalance6> holdingBalance) {
		this.holdingBalance = Objects.requireNonNull(holdingBalance);
		return this;
	}

	public List<PartyIdentification9Choice> getRightsHolder() {
		return rightsHolder == null ? rightsHolder = new ArrayList<>() : rightsHolder;
	}

	public EligiblePosition3 setRightsHolder(List<PartyIdentification9Choice> rightsHolder) {
		this.rightsHolder = Objects.requireNonNull(rightsHolder);
		return this;
	}
}