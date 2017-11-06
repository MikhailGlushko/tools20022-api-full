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
import com.tools20022.repository.codeset.HoldingTransferable1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Investment restrictions linked to the instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2#mmMinimumInitialSubscriptionAmount
 * InvestmentRestrictions2.mmMinimumInitialSubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2#mmMinimumInitialSubscriptionUnits
 * InvestmentRestrictions2.mmMinimumInitialSubscriptionUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2#mmMinimumSubsequentSubscriptionAmount
 * InvestmentRestrictions2.mmMinimumSubsequentSubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2#mmMinimumSubsequentSubscriptionUnits
 * InvestmentRestrictions2.mmMinimumSubsequentSubscriptionUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2#mmMaximumRedemptionAmount
 * InvestmentRestrictions2.mmMaximumRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2#mmMaximumRedemptionUnits
 * InvestmentRestrictions2.mmMaximumRedemptionUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2#mmOtherRedemptionRestrictions
 * InvestmentRestrictions2.mmOtherRedemptionRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2#mmMinimumHoldingAmount
 * InvestmentRestrictions2.mmMinimumHoldingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2#mmMinimumHoldingUnits
 * InvestmentRestrictions2.mmMinimumHoldingUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2#mmMinimumHoldingPeriod
 * InvestmentRestrictions2.mmMinimumHoldingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2#mmHoldingTransferable
 * InvestmentRestrictions2.mmHoldingTransferable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
 * InvestmentFundClassProcessingCharacteristics}</li>
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
 * "InvestmentRestrictions2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Investment restrictions linked to the instrument."</li>
 * </ul>
 */
public class InvestmentRestrictions2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount minimumInitialSubscriptionAmount;
	/**
	 * Minimum initial quantity of securities, expressed as an amount that must
	 * be purchased at subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumInitialSubscriptionAmount
	 * InvestmentFundClassProcessingCharacteristics.
	 * mmMinimumInitialSubscriptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2
	 * InvestmentRestrictions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinInitlSbcptAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumInitialSubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum initial quantity of securities, expressed as an amount that must be purchased at subscription."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumInitialSubscriptionAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmMinimumInitialSubscriptionAmount;
			componentContext_lazy = () -> InvestmentRestrictions2.mmObject();
			isDerived = false;
			xmlTag = "MinInitlSbcptAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumInitialSubscriptionAmount";
			definition = "Minimum initial quantity of securities, expressed as an amount that must be purchased at subscription.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected Number minimumInitialSubscriptionUnits;
	/**
	 * Minimum initial number of units/shares that must be purchased.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumInitialSubscriptionUnits
	 * InvestmentFundClassProcessingCharacteristics.
	 * mmMinimumInitialSubscriptionUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2
	 * InvestmentRestrictions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinInitlSbcptUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumInitialSubscriptionUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum initial number of units/shares that must be purchased."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumInitialSubscriptionUnits = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmMinimumInitialSubscriptionUnits;
			componentContext_lazy = () -> InvestmentRestrictions2.mmObject();
			isDerived = false;
			xmlTag = "MinInitlSbcptUnits";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumInitialSubscriptionUnits";
			definition = "Minimum initial number of units/shares that must be purchased.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount minimumSubsequentSubscriptionAmount;
	/**
	 * Minimum quantity of securities, expressed as an amount that must be
	 * purchased.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumSubscriptionAmount
	 * InvestmentFundClassProcessingCharacteristics.mmMinimumSubscriptionAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2
	 * InvestmentRestrictions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinSbsqntSbcptAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSubsequentSubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities, expressed as an amount that must be purchased."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumSubsequentSubscriptionAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmMinimumSubscriptionAmount;
			componentContext_lazy = () -> InvestmentRestrictions2.mmObject();
			isDerived = false;
			xmlTag = "MinSbsqntSbcptAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSubsequentSubscriptionAmount";
			definition = "Minimum quantity of securities, expressed as an amount that must be purchased.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected Number minimumSubsequentSubscriptionUnits;
	/**
	 * Minimum quantity of securities, expressed as number of units/shares that
	 * must be purchased.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumSubscriptionUnits
	 * InvestmentFundClassProcessingCharacteristics.mmMinimumSubscriptionUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2
	 * InvestmentRestrictions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinSbsqntSbcptUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSubsequentSubscriptionUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities, expressed as number of units/shares that must be purchased."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumSubsequentSubscriptionUnits = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmMinimumSubscriptionUnits;
			componentContext_lazy = () -> InvestmentRestrictions2.mmObject();
			isDerived = false;
			xmlTag = "MinSbsqntSbcptUnits";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSubsequentSubscriptionUnits";
			definition = "Minimum quantity of securities, expressed as number of units/shares that must be purchased.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount maximumRedemptionAmount;
	/**
	 * Maximum quantity of securities, expressed as an amount that can be sold.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMaximumRedemptionAmount
	 * InvestmentFundClassProcessingCharacteristics.mmMaximumRedemptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2
	 * InvestmentRestrictions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxRedAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumRedemptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum quantity of securities, expressed as an amount that can be sold."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumRedemptionAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmMaximumRedemptionAmount;
			componentContext_lazy = () -> InvestmentRestrictions2.mmObject();
			isDerived = false;
			xmlTag = "MaxRedAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumRedemptionAmount";
			definition = "Maximum quantity of securities, expressed as an amount that can be sold.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected Number maximumRedemptionUnits;
	/**
	 * Maximum number of shares/units that may be redeemed on a single dealing
	 * day.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMaximumRedemptionUnits
	 * InvestmentFundClassProcessingCharacteristics.mmMaximumRedemptionUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2
	 * InvestmentRestrictions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxRedUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumRedemptionUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum number of shares/units that may be redeemed on a single dealing day."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumRedemptionUnits = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmMaximumRedemptionUnits;
			componentContext_lazy = () -> InvestmentRestrictions2.mmObject();
			isDerived = false;
			xmlTag = "MaxRedUnits";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumRedemptionUnits";
			definition = "Maximum number of shares/units that may be redeemed on a single dealing day.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Max350Text otherRedemptionRestrictions;
	/**
	 * Specifies any other restrictions that may limit an investor's ability to
	 * redeem.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2
	 * InvestmentRestrictions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrRedRstrctns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherRedemptionRestrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies any other restrictions that may limit an investor's ability to redeem."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherRedemptionRestrictions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentRestrictions2.mmObject();
			isDerived = false;
			xmlTag = "OthrRedRstrctns";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherRedemptionRestrictions";
			definition = "Specifies any other restrictions that may limit an investor's ability to redeem.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount minimumHoldingAmount;
	/**
	 * Minimum value of units that must be maintained to avoid automatic
	 * redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumHoldingAmount
	 * InvestmentFundClassProcessingCharacteristics.mmMinimumHoldingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2
	 * InvestmentRestrictions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinHldgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumHoldingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum value of units that must be maintained to avoid automatic redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumHoldingAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmMinimumHoldingAmount;
			componentContext_lazy = () -> InvestmentRestrictions2.mmObject();
			isDerived = false;
			xmlTag = "MinHldgAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumHoldingAmount";
			definition = "Minimum value of units that must be maintained to avoid automatic redemption.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected DecimalNumber minimumHoldingUnits;
	/**
	 * Minimum number of units that must be maintained to avoid automatic
	 * redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumHoldingUnits
	 * InvestmentFundClassProcessingCharacteristics.mmMinimumHoldingUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2
	 * InvestmentRestrictions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinHldgUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumHoldingUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of units that must be maintained to avoid automatic redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumHoldingUnits = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmMinimumHoldingUnits;
			componentContext_lazy = () -> InvestmentRestrictions2.mmObject();
			isDerived = false;
			xmlTag = "MinHldgUnits";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumHoldingUnits";
			definition = "Minimum number of units that must be maintained to avoid automatic redemption.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected Max70Text minimumHoldingPeriod;
	/**
	 * Description of a period, that may be a number of days, weeks or
	 * descriptive period during which the units/shares must be held following
	 * their issue before redemption will be permitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumHoldingPeriod
	 * InvestmentFundClassProcessingCharacteristics.mmMinimumHoldingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2
	 * InvestmentRestrictions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinHldgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumHoldingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of a period, that may be a number of days, weeks or descriptive period during which the units/shares must be held following their issue before redemption will be permitted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumHoldingPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmMinimumHoldingPeriod;
			componentContext_lazy = () -> InvestmentRestrictions2.mmObject();
			isDerived = false;
			xmlTag = "MinHldgPrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumHoldingPeriod";
			definition = "Description of a period, that may be a number of days, weeks or descriptive period during which the units/shares must be held following their issue before redemption will be permitted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected HoldingTransferable1Code holdingTransferable;
	/**
	 * Indicates whether registered investors are able to transfer some or all
	 * of their holdings to third parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingTransferable1Code
	 * HoldingTransferable1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmHoldingTransferable
	 * InvestmentFundClassProcessingCharacteristics.mmHoldingTransferable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions2
	 * InvestmentRestrictions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgTrfbl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingTransferable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether registered investors are able to transfer some or all of their holdings to third parties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHoldingTransferable = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmHoldingTransferable;
			componentContext_lazy = () -> InvestmentRestrictions2.mmObject();
			isDerived = false;
			xmlTag = "HldgTrfbl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingTransferable";
			definition = "Indicates whether registered investors are able to transfer some or all of their holdings to third parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> HoldingTransferable1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentRestrictions2.mmMinimumInitialSubscriptionAmount, com.tools20022.repository.msg.InvestmentRestrictions2.mmMinimumInitialSubscriptionUnits,
						com.tools20022.repository.msg.InvestmentRestrictions2.mmMinimumSubsequentSubscriptionAmount, com.tools20022.repository.msg.InvestmentRestrictions2.mmMinimumSubsequentSubscriptionUnits,
						com.tools20022.repository.msg.InvestmentRestrictions2.mmMaximumRedemptionAmount, com.tools20022.repository.msg.InvestmentRestrictions2.mmMaximumRedemptionUnits,
						com.tools20022.repository.msg.InvestmentRestrictions2.mmOtherRedemptionRestrictions, com.tools20022.repository.msg.InvestmentRestrictions2.mmMinimumHoldingAmount,
						com.tools20022.repository.msg.InvestmentRestrictions2.mmMinimumHoldingUnits, com.tools20022.repository.msg.InvestmentRestrictions2.mmMinimumHoldingPeriod,
						com.tools20022.repository.msg.InvestmentRestrictions2.mmHoldingTransferable);
				trace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentRestrictions2";
				definition = "Investment restrictions linked to the instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getMinimumInitialSubscriptionAmount() {
		return minimumInitialSubscriptionAmount;
	}

	public void setMinimumInitialSubscriptionAmount(ActiveCurrencyAndAmount minimumInitialSubscriptionAmount) {
		this.minimumInitialSubscriptionAmount = minimumInitialSubscriptionAmount;
	}

	public Number getMinimumInitialSubscriptionUnits() {
		return minimumInitialSubscriptionUnits;
	}

	public void setMinimumInitialSubscriptionUnits(Number minimumInitialSubscriptionUnits) {
		this.minimumInitialSubscriptionUnits = minimumInitialSubscriptionUnits;
	}

	public ActiveCurrencyAndAmount getMinimumSubsequentSubscriptionAmount() {
		return minimumSubsequentSubscriptionAmount;
	}

	public void setMinimumSubsequentSubscriptionAmount(ActiveCurrencyAndAmount minimumSubsequentSubscriptionAmount) {
		this.minimumSubsequentSubscriptionAmount = minimumSubsequentSubscriptionAmount;
	}

	public Number getMinimumSubsequentSubscriptionUnits() {
		return minimumSubsequentSubscriptionUnits;
	}

	public void setMinimumSubsequentSubscriptionUnits(Number minimumSubsequentSubscriptionUnits) {
		this.minimumSubsequentSubscriptionUnits = minimumSubsequentSubscriptionUnits;
	}

	public ActiveCurrencyAndAmount getMaximumRedemptionAmount() {
		return maximumRedemptionAmount;
	}

	public void setMaximumRedemptionAmount(ActiveCurrencyAndAmount maximumRedemptionAmount) {
		this.maximumRedemptionAmount = maximumRedemptionAmount;
	}

	public Number getMaximumRedemptionUnits() {
		return maximumRedemptionUnits;
	}

	public void setMaximumRedemptionUnits(Number maximumRedemptionUnits) {
		this.maximumRedemptionUnits = maximumRedemptionUnits;
	}

	public Max350Text getOtherRedemptionRestrictions() {
		return otherRedemptionRestrictions;
	}

	public void setOtherRedemptionRestrictions(Max350Text otherRedemptionRestrictions) {
		this.otherRedemptionRestrictions = otherRedemptionRestrictions;
	}

	public ActiveCurrencyAndAmount getMinimumHoldingAmount() {
		return minimumHoldingAmount;
	}

	public void setMinimumHoldingAmount(ActiveCurrencyAndAmount minimumHoldingAmount) {
		this.minimumHoldingAmount = minimumHoldingAmount;
	}

	public DecimalNumber getMinimumHoldingUnits() {
		return minimumHoldingUnits;
	}

	public void setMinimumHoldingUnits(DecimalNumber minimumHoldingUnits) {
		this.minimumHoldingUnits = minimumHoldingUnits;
	}

	public Max70Text getMinimumHoldingPeriod() {
		return minimumHoldingPeriod;
	}

	public void setMinimumHoldingPeriod(Max70Text minimumHoldingPeriod) {
		this.minimumHoldingPeriod = minimumHoldingPeriod;
	}

	public HoldingTransferable1Code getHoldingTransferable() {
		return holdingTransferable;
	}

	public void setHoldingTransferable(HoldingTransferable1Code holdingTransferable) {
		this.holdingTransferable = holdingTransferable;
	}
}