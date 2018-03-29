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
import com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CurrencyOption;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Option3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of data which contains the link to a previously notified option trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OptionData2#mmTradeDate
 * OptionData2.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionData2#mmNotificationIdentification
 * OptionData2.mmNotificationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OptionData2#mmCommonReference
 * OptionData2.mmCommonReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OptionData2#mmRelatedReference
 * OptionData2.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionData2#mmAmendOrCancelReason
 * OptionData2.mmAmendOrCancelReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OptionData2#mmOption
 * OptionData2.mmOption}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CurrencyOption
 * CurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02#mmOptionData
 * ForeignExchangeOptionNotificationV02.mmOptionData}</li>
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
 * "OptionData2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of data which contains the link to a previously notified option trade."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OptionData2", propOrder = {"tradeDate", "notificationIdentification", "commonReference", "relatedReference", "amendOrCancelReason", "option"})
public class OptionData2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradDt", required = true)
	protected ISODate tradeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionData2 OptionData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the trading parties have agreed on an option trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OptionData2, ISODate> mmTradeDate = new MMMessageAttribute<OptionData2, ISODate>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionData2.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Date at which the trading parties have agreed on an option trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(OptionData2 obj) {
			return obj.getTradeDate();
		}

		@Override
		public void setValue(OptionData2 obj, ISODate value) {
			obj.setTradeDate(value);
		}
	};
	@XmlElement(name = "NtfctnId", required = true)
	protected Max35Text notificationIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionData2 OptionData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Refers to the identification of a trade assigned by the trading side of a foreign exchange option trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OptionData2, Max35Text> mmNotificationIdentification = new MMMessageAttribute<OptionData2, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionData2.mmObject();
			isDerived = false;
			xmlTag = "NtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationIdentification";
			definition = "Refers to the identification of a trade assigned by the trading side of a foreign exchange option trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OptionData2 obj) {
			return obj.getNotificationIdentification();
		}

		@Override
		public void setValue(OptionData2 obj, Max35Text value) {
			obj.setNotificationIdentification(value);
		}
	};
	@XmlElement(name = "CmonRef")
	protected Max35Text commonReference;
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCommonIdentification
	 * TradeIdentification.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionData2 OptionData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference common to the parties of a trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OptionData2, Optional<Max35Text>> mmCommonReference = new MMMessageAttribute<OptionData2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCommonIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionData2.mmObject();
			isDerived = false;
			xmlTag = "CmonRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReference";
			definition = "Reference common to the parties of a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(OptionData2 obj) {
			return obj.getCommonReference();
		}

		@Override
		public void setValue(OptionData2 obj, Optional<Max35Text> value) {
			obj.setCommonReference(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdRef")
	protected Max35Text relatedReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionData2 OptionData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Refers to the identification of a previous event in the life of a foreign exchange option trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OptionData2, Optional<Max35Text>> mmRelatedReference = new MMMessageAttribute<OptionData2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionData2.mmObject();
			isDerived = false;
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Refers to the identification of a previous event in the life of a foreign exchange option trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(OptionData2 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(OptionData2 obj, Optional<Max35Text> value) {
			obj.setRelatedReference(value.orElse(null));
		}
	};
	@XmlElement(name = "AmdOrCclRsn")
	protected Max35Text amendOrCancelReason;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionData2 OptionData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdOrCclRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendOrCancelReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the reason for the cancellation or the amendment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OptionData2, Optional<Max35Text>> mmAmendOrCancelReason = new MMMessageAttribute<OptionData2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionData2.mmObject();
			isDerived = false;
			xmlTag = "AmdOrCclRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendOrCancelReason";
			definition = "Describes the reason for the cancellation or the amendment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(OptionData2 obj) {
			return obj.getAmendOrCancelReason();
		}

		@Override
		public void setValue(OptionData2 obj, Optional<Max35Text> value) {
			obj.setAmendOrCancelReason(value.orElse(null));
		}
	};
	@XmlElement(name = "Optn", required = true)
	protected Option3 option;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Option3 Option3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionData2 OptionData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Optn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of data defining a foreign exchange option sold."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OptionData2, Option3> mmOption = new MMMessageAssociationEnd<OptionData2, Option3>() {
		{
			businessComponentTrace_lazy = () -> CurrencyOption.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionData2.mmObject();
			isDerived = false;
			xmlTag = "Optn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Option";
			definition = "Set of data defining a foreign exchange option sold.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Option3.mmObject();
		}

		@Override
		public Option3 getValue(OptionData2 obj) {
			return obj.getOption();
		}

		@Override
		public void setValue(OptionData2 obj, Option3 value) {
			obj.setOption(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OptionData2.mmTradeDate, com.tools20022.repository.msg.OptionData2.mmNotificationIdentification,
						com.tools20022.repository.msg.OptionData2.mmCommonReference, com.tools20022.repository.msg.OptionData2.mmRelatedReference, com.tools20022.repository.msg.OptionData2.mmAmendOrCancelReason,
						com.tools20022.repository.msg.OptionData2.mmOption);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeOptionNotificationV02.mmOptionData);
				trace_lazy = () -> CurrencyOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionData2";
				definition = "Set of data which contains the link to a previously notified option trade.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getTradeDate() {
		return tradeDate;
	}

	public OptionData2 setTradeDate(ISODate tradeDate) {
		this.tradeDate = Objects.requireNonNull(tradeDate);
		return this;
	}

	public Max35Text getNotificationIdentification() {
		return notificationIdentification;
	}

	public OptionData2 setNotificationIdentification(Max35Text notificationIdentification) {
		this.notificationIdentification = Objects.requireNonNull(notificationIdentification);
		return this;
	}

	public Optional<Max35Text> getCommonReference() {
		return commonReference == null ? Optional.empty() : Optional.of(commonReference);
	}

	public OptionData2 setCommonReference(Max35Text commonReference) {
		this.commonReference = commonReference;
		return this;
	}

	public Optional<Max35Text> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public OptionData2 setRelatedReference(Max35Text relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public Optional<Max35Text> getAmendOrCancelReason() {
		return amendOrCancelReason == null ? Optional.empty() : Optional.of(amendOrCancelReason);
	}

	public OptionData2 setAmendOrCancelReason(Max35Text amendOrCancelReason) {
		this.amendOrCancelReason = amendOrCancelReason;
		return this;
	}

	public Option3 getOption() {
		return option;
	}

	public OptionData2 setOption(Option3 option) {
		this.option = Objects.requireNonNull(option);
		return this;
	}
}