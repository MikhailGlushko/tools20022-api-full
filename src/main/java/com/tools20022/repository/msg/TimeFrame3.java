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
import com.tools20022.repository.codeset.BusinessDayConvention1Code;
import com.tools20022.repository.codeset.ReferToFundOrderDesk1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.TimeFrame;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * TimeFrame elements that define a period as number of days before or after a
 * activity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TimeFrame3#mmOtherTimeFrameDescription
 * TimeFrame3.mmOtherTimeFrameDescription}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TimeFrame3#mmTradeMinus
 * TimeFrame3.mmTradeMinus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TimeFrame3#mmNonWorkingDayAdjustment
 * TimeFrame3.mmNonWorkingDayAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TimeFrame3#mmReferToOrderDesk
 * TimeFrame3.mmReferToOrderDesk}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TimeFrame TimeFrame}</li>
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
 * "TimeFrame3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "TimeFrame elements that define a period as number of days before or after a activity."
 * </li>
 * </ul>
 */
public class TimeFrame3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text otherTimeFrameDescription;
	/**
	 * Specifies a description of any other TimeFrame that may be used for the
	 * DealingCutOffTimeFrame
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmOtherTimeFrameDescription
	 * TimeFrame.mmOtherTimeFrameDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TimeFrame3
	 * TimeFrame3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrTmFrameDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherTimeFrameDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a description of any other TimeFrame that may be used for the DealingCutOffTimeFrame"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherTimeFrameDescription = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TimeFrame.mmOtherTimeFrameDescription;
			componentContext_lazy = () -> TimeFrame3.mmObject();
			isDerived = false;
			xmlTag = "OthrTmFrameDesc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherTimeFrameDescription";
			definition = "Specifies a description of any other TimeFrame that may be used for the DealingCutOffTimeFrame";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Number tradeMinus;
	/**
	 * An agreed number of days before the Trade date (T) used to define
	 * standard timeframes e.g. T-1 Dealing cut off or T-2 prepayment condition
	 * 
	 * Where = T is the date that the price is applied to a transaction,
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmTradeMinus
	 * TimeFrame.mmTradeMinus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TimeFrame3
	 * TimeFrame3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeMinus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An agreed number of days before the Trade date (T) used to define standard timeframes e.g. T-1 Dealing cut off or T-2 prepayment condition\n\nWhere = T is the date that the price is applied to a transaction,"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeMinus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TimeFrame.mmTradeMinus;
			componentContext_lazy = () -> TimeFrame3.mmObject();
			isDerived = false;
			xmlTag = "TMns";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeMinus";
			definition = "An agreed number of days before the Trade date (T) used to define standard timeframes e.g. T-1 Dealing cut off or T-2 prepayment condition\n\nWhere = T is the date that the price is applied to a transaction,";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected BusinessDayConvention1Code nonWorkingDayAdjustment;
	/**
	 * Convention used for adjusting a date when it is not a business day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessDayConvention1Code
	 * BusinessDayConvention1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmBusinessDayConvention
	 * RedemptionSchedule.mmBusinessDayConvention}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TimeFrame3
	 * TimeFrame3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonWorkgDayAdjstmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonWorkingDayAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Convention used for adjusting a date when it is not a business day."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonWorkingDayAdjustment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmBusinessDayConvention;
			componentContext_lazy = () -> TimeFrame3.mmObject();
			isDerived = false;
			xmlTag = "NonWorkgDayAdjstmnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonWorkingDayAdjustment";
			definition = "Convention used for adjusting a date when it is not a business day.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BusinessDayConvention1Code.mmObject();
		}
	};
	protected ReferToFundOrderDesk1Code referToOrderDesk;
	/**
	 * Refer to Order Desk
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReferToFundOrderDesk1Code
	 * ReferToFundOrderDesk1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TimeFrame3
	 * TimeFrame3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefrToOrdrDsk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferToOrderDesk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Refer to Order Desk"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferToOrderDesk = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TimeFrame3.mmObject();
			isDerived = false;
			xmlTag = "RefrToOrdrDsk";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferToOrderDesk";
			definition = "Refer to Order Desk";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ReferToFundOrderDesk1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TimeFrame3.mmOtherTimeFrameDescription, com.tools20022.repository.msg.TimeFrame3.mmTradeMinus,
						com.tools20022.repository.msg.TimeFrame3.mmNonWorkingDayAdjustment, com.tools20022.repository.msg.TimeFrame3.mmReferToOrderDesk);
				trace_lazy = () -> TimeFrame.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TimeFrame3";
				definition = "TimeFrame elements that define a period as number of days before or after a activity.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getOtherTimeFrameDescription() {
		return otherTimeFrameDescription;
	}

	public void setOtherTimeFrameDescription(Max350Text otherTimeFrameDescription) {
		this.otherTimeFrameDescription = otherTimeFrameDescription;
	}

	public Number getTradeMinus() {
		return tradeMinus;
	}

	public void setTradeMinus(Number tradeMinus) {
		this.tradeMinus = tradeMinus;
	}

	public BusinessDayConvention1Code getNonWorkingDayAdjustment() {
		return nonWorkingDayAdjustment;
	}

	public void setNonWorkingDayAdjustment(BusinessDayConvention1Code nonWorkingDayAdjustment) {
		this.nonWorkingDayAdjustment = nonWorkingDayAdjustment;
	}

	public ReferToFundOrderDesk1Code getReferToOrderDesk() {
		return referToOrderDesk;
	}

	public void setReferToOrderDesk(ReferToFundOrderDesk1Code referToOrderDesk) {
		this.referToOrderDesk = referToOrderDesk;
	}
}