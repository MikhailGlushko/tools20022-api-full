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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CorporateActionBalanceDetails30;
import com.tools20022.repository.msg.EventInformation9;
import com.tools20022.repository.msg.SecurityIdentification19;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Detailed account holdings information report for a corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance11#mmGeneralInformation
 * CorporateActionEventAndBalance11.mmGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance11#mmUnderlyingSecurity
 * CorporateActionEventAndBalance11.mmUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance11#mmBalance
 * CorporateActionEventAndBalance11.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance11#mmSupplementaryData
 * CorporateActionEventAndBalance11.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
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
 * "CorporateActionEventAndBalance11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Detailed account holdings information report for a corporate action event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance13
 * CorporateActionEventAndBalance13}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance9
 * CorporateActionEventAndBalance9}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionEventAndBalance11", propOrder = {"generalInformation", "underlyingSecurity", "balance", "supplementaryData"})
public class CorporateActionEventAndBalance11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GnlInf", required = true)
	protected EventInformation9 generalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EventInformation9
	 * EventInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance11
	 * CorporateActionEventAndBalance11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides general information related to a corporate action event."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance13#mmGeneralInformation
	 * CorporateActionEventAndBalance13.mmGeneralInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance9#mmGeneralInformation
	 * CorporateActionEventAndBalance9.mmGeneralInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionEventAndBalance11, EventInformation9> mmGeneralInformation = new MMMessageAssociationEnd<CorporateActionEventAndBalance11, EventInformation9>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionEventAndBalance11.mmObject();
			isDerived = false;
			xmlTag = "GnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneralInformation";
			definition = "Provides general information related to a corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventAndBalance13.mmGeneralInformation);
			previousVersion_lazy = () -> CorporateActionEventAndBalance9.mmGeneralInformation;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EventInformation9.mmObject();
		}

		@Override
		public EventInformation9 getValue(CorporateActionEventAndBalance11 obj) {
			return obj.getGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionEventAndBalance11 obj, EventInformation9 value) {
			obj.setGeneralInformation(value);
		}
	};
	@XmlElement(name = "UndrlygScty", required = true)
	protected SecurityIdentification19 underlyingSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnderlyingSecurity
	 * CorporateActionEvent.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance11
	 * CorporateActionEventAndBalance11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygScty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :35B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security concerned by the corporate action."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance13#mmUnderlyingSecurity
	 * CorporateActionEventAndBalance13.mmUnderlyingSecurity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance9#mmUnderlyingSecurity
	 * CorporateActionEventAndBalance9.mmUnderlyingSecurity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionEventAndBalance11, SecurityIdentification19> mmUnderlyingSecurity = new MMMessageAssociationEnd<CorporateActionEventAndBalance11, SecurityIdentification19>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmUnderlyingSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionEventAndBalance11.mmObject();
			isDerived = false;
			xmlTag = "UndrlygScty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":35B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingSecurity";
			definition = "Security concerned by the corporate action.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventAndBalance13.mmUnderlyingSecurity);
			previousVersion_lazy = () -> CorporateActionEventAndBalance9.mmUnderlyingSecurity;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityIdentification19.mmObject();
		}

		@Override
		public SecurityIdentification19 getValue(CorporateActionEventAndBalance11 obj) {
			return obj.getUnderlyingSecurity();
		}

		@Override
		public void setValue(CorporateActionEventAndBalance11 obj, SecurityIdentification19 value) {
			obj.setUnderlyingSecurity(value);
		}
	};
	@XmlElement(name = "Bal")
	protected CorporateActionBalanceDetails30 balance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
	 * CorporateActionBalanceDetails30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAggregateQuantityBalance
	 * SecuritiesQuantity.mmAggregateQuantityBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance11
	 * CorporateActionEventAndBalance11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the balance related to a corporate action."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance13#mmBalance
	 * CorporateActionEventAndBalance13.mmBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance9#mmBalance
	 * CorporateActionEventAndBalance9.mmBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionEventAndBalance11, Optional<CorporateActionBalanceDetails30>> mmBalance = new MMMessageAssociationEnd<CorporateActionEventAndBalance11, Optional<CorporateActionBalanceDetails30>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmAggregateQuantityBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionEventAndBalance11.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Provides information about the balance related to a corporate action.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventAndBalance13.mmBalance);
			previousVersion_lazy = () -> CorporateActionEventAndBalance9.mmBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionBalanceDetails30.mmObject();
		}

		@Override
		public Optional<CorporateActionBalanceDetails30> getValue(CorporateActionEventAndBalance11 obj) {
			return obj.getBalance();
		}

		@Override
		public void setValue(CorporateActionEventAndBalance11 obj, Optional<CorporateActionBalanceDetails30> value) {
			obj.setBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance11
	 * CorporateActionEventAndBalance11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information related to the event and the balance of the corporate action."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance13#mmSupplementaryData
	 * CorporateActionEventAndBalance13.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance9#mmSupplementaryData
	 * CorporateActionEventAndBalance9.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionEventAndBalance11, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<CorporateActionEventAndBalance11, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionEventAndBalance11.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Provides additional information related to the event and the balance of the corporate action.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventAndBalance13.mmSupplementaryData);
			previousVersion_lazy = () -> CorporateActionEventAndBalance9.mmSupplementaryData;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CorporateActionEventAndBalance11 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CorporateActionEventAndBalance11 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionEventAndBalance11.mmGeneralInformation, com.tools20022.repository.msg.CorporateActionEventAndBalance11.mmUnderlyingSecurity,
						com.tools20022.repository.msg.CorporateActionEventAndBalance11.mmBalance, com.tools20022.repository.msg.CorporateActionEventAndBalance11.mmSupplementaryData);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventAndBalance11";
				definition = "Detailed account holdings information report for a corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionEventAndBalance13.mmObject());
				previousVersion_lazy = () -> CorporateActionEventAndBalance9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public EventInformation9 getGeneralInformation() {
		return generalInformation;
	}

	public CorporateActionEventAndBalance11 setGeneralInformation(EventInformation9 generalInformation) {
		this.generalInformation = Objects.requireNonNull(generalInformation);
		return this;
	}

	public SecurityIdentification19 getUnderlyingSecurity() {
		return underlyingSecurity;
	}

	public CorporateActionEventAndBalance11 setUnderlyingSecurity(SecurityIdentification19 underlyingSecurity) {
		this.underlyingSecurity = Objects.requireNonNull(underlyingSecurity);
		return this;
	}

	public Optional<CorporateActionBalanceDetails30> getBalance() {
		return balance == null ? Optional.empty() : Optional.of(balance);
	}

	public CorporateActionEventAndBalance11 setBalance(CorporateActionBalanceDetails30 balance) {
		this.balance = balance;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CorporateActionEventAndBalance11 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}