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
import com.tools20022.repository.choice.CancellationStatusReason2Choice;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.InvestigationCase;
import com.tools20022.repository.entity.InvestigationCaseStatus;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification43;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details on the status of the cancellation request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason2#mmOriginator
 * CancellationStatusReason2.mmOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason2#mmReason
 * CancellationStatusReason2.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason2#mmAdditionalInformation
 * CancellationStatusReason2.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestigationCaseStatus
 * InvestigationCaseStatus}</li>
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
 * "CancellationStatusReason2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides further details on the status of the cancellation request."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ModificationStatusReason1
 * ModificationStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationStatusReason3
 * CancellationStatusReason3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CancellationStatusReason2", propOrder = {"originator", "reason", "additionalInformation"})
public class CancellationStatusReason2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Orgtr")
	protected PartyIdentification43 originator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason2
	 * CancellationStatusReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Orgtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Originator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that issues the cancellation status."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ModificationStatusReason1#mmOriginator
	 * ModificationStatusReason1.mmOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason3#mmOriginator
	 * CancellationStatusReason3.mmOriginator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CancellationStatusReason2, Optional<PartyIdentification43>> mmOriginator = new MMMessageAssociationEnd<CancellationStatusReason2, Optional<PartyIdentification43>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CancellationStatusReason2.mmObject();
			isDerived = false;
			xmlTag = "Orgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Originator";
			definition = "Party that issues the cancellation status.";
			nextVersions_lazy = () -> Arrays.asList(ModificationStatusReason1.mmOriginator, CancellationStatusReason3.mmOriginator);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public Optional<PartyIdentification43> getValue(CancellationStatusReason2 obj) {
			return obj.getOriginator();
		}

		@Override
		public void setValue(CancellationStatusReason2 obj, Optional<PartyIdentification43> value) {
			obj.setOriginator(value.orElse(null));
		}
	};
	@XmlElement(name = "Rsn")
	protected CancellationStatusReason2Choice reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancellationStatusReason2Choice
	 * CancellationStatusReason2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmInvestigationResolution
	 * InvestigationCase.mmInvestigationResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason2
	 * CancellationStatusReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for the status report."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ModificationStatusReason1#mmReason
	 * ModificationStatusReason1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason3#mmReason
	 * CancellationStatusReason3.mmReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CancellationStatusReason2, Optional<CancellationStatusReason2Choice>> mmReason = new MMMessageAssociationEnd<CancellationStatusReason2, Optional<CancellationStatusReason2Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestigationCase.mmInvestigationResolution;
			componentContext_lazy = () -> com.tools20022.repository.msg.CancellationStatusReason2.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Specifies the reason for the status report.";
			nextVersions_lazy = () -> Arrays.asList(ModificationStatusReason1.mmReason, CancellationStatusReason3.mmReason);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CancellationStatusReason2Choice.mmObject();
		}

		@Override
		public Optional<CancellationStatusReason2Choice> getValue(CancellationStatusReason2 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(CancellationStatusReason2 obj, Optional<CancellationStatusReason2Choice> value) {
			obj.setReason(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<Max105Text> additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason2
	 * CancellationStatusReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details on the cancellation status reason."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ModificationStatusReason1#mmAdditionalInformation
	 * ModificationStatusReason1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason3#mmAdditionalInformation
	 * CancellationStatusReason3.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CancellationStatusReason2, List<Max105Text>> mmAdditionalInformation = new MMMessageAttribute<CancellationStatusReason2, List<Max105Text>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CancellationStatusReason2.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Further details on the cancellation status reason.";
			nextVersions_lazy = () -> Arrays.asList(ModificationStatusReason1.mmAdditionalInformation, CancellationStatusReason3.mmAdditionalInformation);
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		@Override
		public List<Max105Text> getValue(CancellationStatusReason2 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(CancellationStatusReason2 obj, List<Max105Text> value) {
			obj.setAdditionalInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CancellationStatusReason2.mmOriginator, com.tools20022.repository.msg.CancellationStatusReason2.mmReason,
						com.tools20022.repository.msg.CancellationStatusReason2.mmAdditionalInformation);
				trace_lazy = () -> InvestigationCaseStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancellationStatusReason2";
				definition = "Provides further details on the status of the cancellation request.";
				nextVersions_lazy = () -> Arrays.asList(ModificationStatusReason1.mmObject(), CancellationStatusReason3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PartyIdentification43> getOriginator() {
		return originator == null ? Optional.empty() : Optional.of(originator);
	}

	public CancellationStatusReason2 setOriginator(PartyIdentification43 originator) {
		this.originator = originator;
		return this;
	}

	public Optional<CancellationStatusReason2Choice> getReason() {
		return reason == null ? Optional.empty() : Optional.of(reason);
	}

	public CancellationStatusReason2 setReason(CancellationStatusReason2Choice reason) {
		this.reason = reason;
		return this;
	}

	public List<Max105Text> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public CancellationStatusReason2 setAdditionalInformation(List<Max105Text> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}