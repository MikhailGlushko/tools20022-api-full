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
import com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06;
import com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07;
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06;
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07;
import com.tools20022.repository.choice.CorporateActionEventStageFormat14Choice;
import com.tools20022.repository.choice.LotteryTypeFormat4Choice;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Lottery;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CorporateActionDate49;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction34#mmDateDetails
 * CorporateAction34.mmDateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction34#mmEventStage
 * CorporateAction34.mmEventStage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction34#mmLotteryType
 * CorporateAction34.mmLotteryType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV06#mmCorporateActionDetails
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.
 * mmCorporateActionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV06#mmCorporateActionDetails
 * CorporateActionCancellationAdviceV06.mmCorporateActionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#mmCorporateActionDetails
 * CorporateActionCancellationAdviceV07.mmCorporateActionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV07#mmCorporateActionDetails
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.
 * mmCorporateActionDetails}</li>
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
 * "CorporateAction34"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the corporate action event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction43
 * CorporateAction43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction45
 * CorporateAction45}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateAction34", propOrder = {"dateDetails", "eventStage", "lotteryType"})
public class CorporateAction34 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DtDtls")
	protected CorporateActionDate49 dateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionDate49
	 * CorporateActionDate49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction34
	 * CorporateAction34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the dates related to a corporate action event."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction43#mmDateDetails
	 * CorporateAction43.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction45#mmDateDetails
	 * CorporateAction45.mmDateDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction34, Optional<CorporateActionDate49>> mmDateDetails = new MMMessageAssociationEnd<CorporateAction34, Optional<CorporateActionDate49>>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction34.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction43.mmDateDetails, CorporateAction45.mmDateDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionDate49.mmObject();
		}

		@Override
		public Optional<CorporateActionDate49> getValue(CorporateAction34 obj) {
			return obj.getDateDetails();
		}

		@Override
		public void setValue(CorporateAction34 obj, Optional<CorporateActionDate49> value) {
			obj.setDateDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "EvtStag")
	protected CorporateActionEventStageFormat14Choice eventStage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat14Choice
	 * CorporateActionEventStageFormat14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEventStage
	 * CorporateActionEvent.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction34
	 * CorporateAction34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtStag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventStage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stage in the corporate action event life cycle."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction43#mmEventStage
	 * CorporateAction43.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction45#mmEventStage
	 * CorporateAction45.mmEventStage}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction34, Optional<CorporateActionEventStageFormat14Choice>> mmEventStage = new MMMessageAssociationEnd<CorporateAction34, Optional<CorporateActionEventStageFormat14Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmEventStage;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction34.mmObject();
			isDerived = false;
			xmlTag = "EvtStag";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventStage";
			definition = "Stage in the corporate action event life cycle.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction43.mmEventStage, CorporateAction45.mmEventStage);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionEventStageFormat14Choice.mmObject();
		}

		@Override
		public Optional<CorporateActionEventStageFormat14Choice> getValue(CorporateAction34 obj) {
			return obj.getEventStage();
		}

		@Override
		public void setValue(CorporateAction34 obj, Optional<CorporateActionEventStageFormat14Choice> value) {
			obj.setEventStage(value.orElse(null));
		}
	};
	@XmlElement(name = "LtryTp")
	protected LotteryTypeFormat4Choice lotteryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat4Choice
	 * LotteryTypeFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#mmLotteryType
	 * Lottery.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction34
	 * CorporateAction34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LtryTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LOTO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of lottery announced."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction43#mmLotteryType
	 * CorporateAction43.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction45#mmLotteryType
	 * CorporateAction45.mmLotteryType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction34, Optional<LotteryTypeFormat4Choice>> mmLotteryType = new MMMessageAssociationEnd<CorporateAction34, Optional<LotteryTypeFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> Lottery.mmLotteryType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction34.mmObject();
			isDerived = false;
			xmlTag = "LtryTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LOTO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotteryType";
			definition = "Specifies the type of lottery announced.";
			nextVersions_lazy = () -> Arrays.asList(CorporateAction43.mmLotteryType, CorporateAction45.mmLotteryType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LotteryTypeFormat4Choice.mmObject();
		}

		@Override
		public Optional<LotteryTypeFormat4Choice> getValue(CorporateAction34 obj) {
			return obj.getLotteryType();
		}

		@Override
		public void setValue(CorporateAction34 obj, Optional<LotteryTypeFormat4Choice> value) {
			obj.setLotteryType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateAction34.mmDateDetails, com.tools20022.repository.msg.CorporateAction34.mmEventStage,
						com.tools20022.repository.msg.CorporateAction34.mmLotteryType);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdviceV06.mmCorporateActionDetails, CorporateActionCancellationAdviceV06.mmCorporateActionDetails,
						CorporateActionCancellationAdviceV07.mmCorporateActionDetails, CorporateActionMovementPreliminaryAdviceCancellationAdviceV07.mmCorporateActionDetails);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateAction34";
				definition = "Provides information about the corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(CorporateAction43.mmObject(), CorporateAction45.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CorporateActionDate49> getDateDetails() {
		return dateDetails == null ? Optional.empty() : Optional.of(dateDetails);
	}

	public CorporateAction34 setDateDetails(CorporateActionDate49 dateDetails) {
		this.dateDetails = dateDetails;
		return this;
	}

	public Optional<CorporateActionEventStageFormat14Choice> getEventStage() {
		return eventStage == null ? Optional.empty() : Optional.of(eventStage);
	}

	public CorporateAction34 setEventStage(CorporateActionEventStageFormat14Choice eventStage) {
		this.eventStage = eventStage;
		return this;
	}

	public Optional<LotteryTypeFormat4Choice> getLotteryType() {
		return lotteryType == null ? Optional.empty() : Optional.of(lotteryType);
	}

	public CorporateAction34 setLotteryType(LotteryTypeFormat4Choice lotteryType) {
		this.lotteryType = lotteryType;
		return this;
	}
}