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
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Market maker profile.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketMakerProfile1#mmContractPeriod
 * MarketMakerProfile1.mmContractPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketMakerProfile1#mmCompliance
 * MarketMakerProfile1.mmCompliance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketMakerProfile1#mmMaximumSpread
 * MarketMakerProfile1.mmMaximumSpread}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketMakerProfile1#mmDiscount
 * MarketMakerProfile1.mmDiscount}</li>
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
 * "MarketMakerProfile1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Market maker profile."</li>
 * </ul>
 */
public class MarketMakerProfile1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DateTimePeriodDetails1 contractPeriod;
	/**
	 * Period of the contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails1
	 * DateTimePeriodDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketMakerProfile1
	 * MarketMakerProfile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period of the contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmContractPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MarketMakerProfile1.mmObject();
			isDerived = false;
			xmlTag = "CtrctPrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractPeriod";
			definition = "Period of the contract.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DateTimePeriodDetails1.mmObject();
		}
	};
	protected YesNoIndicator compliance;
	/**
	 * Indicates whether the market maker is obligated to comply with the
	 * requirements of the contract it holds with the exchange or is exempt from
	 * these obligations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketMakerProfile1
	 * MarketMakerProfile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmplc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Compliance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the market maker is obligated to comply with the requirements of the contract it holds with the  exchange or is exempt from these obligations."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCompliance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MarketMakerProfile1.mmObject();
			isDerived = false;
			xmlTag = "Cmplc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compliance";
			definition = "Indicates whether the market maker is obligated to comply with the requirements of the contract it holds with the  exchange or is exempt from these obligations.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected PercentageRate maximumSpread;
	/**
	 * Percentage of the variation between the maximum accepted minimum and
	 * maximum value of an action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketMakerProfile1
	 * MarketMakerProfile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxSprd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumSpread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the variation between the maximum accepted minimum and maximum value of an action."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumSpread = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MarketMakerProfile1.mmObject();
			isDerived = false;
			xmlTag = "MaxSprd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumSpread";
			definition = "Percentage of the variation between the maximum accepted minimum and maximum value of an action.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate discount;
	/**
	 * Rate of discount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketMakerProfile1
	 * MarketMakerProfile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dscnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of discount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDiscount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MarketMakerProfile1.mmObject();
			isDerived = false;
			xmlTag = "Dscnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discount";
			definition = "Rate of discount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MarketMakerProfile1.mmContractPeriod, com.tools20022.repository.msg.MarketMakerProfile1.mmCompliance,
						com.tools20022.repository.msg.MarketMakerProfile1.mmMaximumSpread, com.tools20022.repository.msg.MarketMakerProfile1.mmDiscount);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MarketMakerProfile1";
				definition = "Market maker profile.";
			}
		});
		return mmObject_lazy.get();
	}

	public DateTimePeriodDetails1 getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(com.tools20022.repository.msg.DateTimePeriodDetails1 contractPeriod) {
		this.contractPeriod = contractPeriod;
	}

	public YesNoIndicator getCompliance() {
		return compliance;
	}

	public void setCompliance(YesNoIndicator compliance) {
		this.compliance = compliance;
	}

	public PercentageRate getMaximumSpread() {
		return maximumSpread;
	}

	public void setMaximumSpread(PercentageRate maximumSpread) {
		this.maximumSpread = maximumSpread;
	}

	public PercentageRate getDiscount() {
		return discount;
	}

	public void setDiscount(PercentageRate discount) {
		this.discount = discount;
	}
}