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
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Prices related to a corporate action.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionPrice" src="doc-files/CorporateActionPrice.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCorporateActionEvent
 * CorporateActionPrice.mmCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCorporateActionExercisePrice
 * CorporateActionPrice.mmCorporateActionExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPriceReceivedPerProduct
 * CorporateActionPrice.mmGenericCashPriceReceivedPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPricePaidPerProduct
 * CorporateActionPrice.mmGenericCashPricePaidPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashInLieuOfSharePrice
 * CorporateActionPrice.mmCashInLieuOfSharePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmOverSubscriptionDepositPrice
 * CorporateActionPrice.mmOverSubscriptionDepositPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashValueForTax
 * CorporateActionPrice.mmCashValueForTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmPricingCalculation
 * CorporateActionPrice.mmPricingCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmExercisePriceRelatedEvent
 * SecuritiesPricing.mmExercisePriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmGenericCashPriceReceivedPerProductRelatedEvent
 * SecuritiesPricing.mmGenericCashPriceReceivedPerProductRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmGenericCashPricePaidPerProductRelatedEvent
 * SecuritiesPricing.mmGenericCashPricePaidPerProductRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashInLieuOfSharePriceRelatedEvent
 * SecuritiesPricing.mmCashInLieuOfSharePriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmOverSubscriptionDepositPriceRelatedEvent
 * SecuritiesPricing.mmOverSubscriptionDepositPriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashValueForTaxRelatedEvent
 * SecuritiesPricing.mmCashValueForTaxRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedCorporateActionPrice
 * SecuritiesPricing.mmRelatedCorporateActionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
 * CorporateActionEvent.mmCorporateActionPrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice8#mmIndicativeOrMarketPrice
 * CorporateActionPrice8.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice11#mmIndicativeOrMarketPrice
 * CorporateActionPrice11.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice19#mmIndicativeOrMarketPrice
 * CorporateActionPrice19.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice20#mmIndicativeOrMarketPrice
 * CorporateActionPrice20.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice29#mmIndicativeOrMarketPrice
 * CorporateActionPrice29.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice35#mmIndicativeOrMarketPrice
 * CorporateActionPrice35.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice9#mmIndicativeOrMarketPrice
 * CorporateActionPrice9.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice12#mmIndicativeOrMarketPrice
 * CorporateActionPrice12.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice27#mmIndicativeOrMarketPrice
 * CorporateActionPrice27.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice33#mmIndicativeOrMarketPrice
 * CorporateActionPrice33.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice39#mmIndicativeOrMarketPrice
 * CorporateActionPrice39.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice40#mmIndicativeOrMarketPrice
 * CorporateActionPrice40.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice10#mmIndicativeOrMarketPrice
 * CorporateActionPrice10.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice13#mmIndicativeOrMarketPrice
 * CorporateActionPrice13.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice18#mmIndicativeOrMarketPrice
 * CorporateActionPrice18.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice24#mmIndicativeOrMarketPrice
 * CorporateActionPrice24.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice26#mmIndicativeOrMarketPrice
 * CorporateActionPrice26.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice32#mmIndicativeOrMarketPrice
 * CorporateActionPrice32.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice38#mmIndicativeOrMarketPrice
 * CorporateActionPrice38.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice41#mmIndicativeOrMarketPrice
 * CorporateActionPrice41.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice31#mmIndicativeOrMarketPrice
 * CorporateActionPrice31.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice37#mmIndicativeOrMarketPrice
 * CorporateActionPrice37.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice4#mmIndicativePrice
 * CorporateActionPrice4.mmIndicativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice4#mmMarketPrice
 * CorporateActionPrice4.mmMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43#mmIndicativeOrMarketPrice
 * CorporateActionPrice43.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice44#mmIndicativeOrMarketPrice
 * CorporateActionPrice44.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice45#mmIndicativeOrMarketPrice
 * CorporateActionPrice45.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice52#mmIndicativeOrMarketPrice
 * CorporateActionPrice52.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice55#mmIndicativeOrMarketPrice
 * CorporateActionPrice55.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice51#mmIndicativeOrMarketPrice
 * CorporateActionPrice51.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#mmIndicativeOrMarketPrice
 * CorporateActionPrice59.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#mmIndicativeOrMarketPrice
 * CorporateActionPrice56.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice60#mmIndicativeOrMarketPrice
 * CorporateActionPrice60.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice62#mmIndicativeOrMarketPrice
 * CorporateActionPrice62.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66#mmIndicativeOrMarketPrice
 * CorporateActionPrice66.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice64#mmIndicativeOrMarketPrice
 * CorporateActionPrice64.mmIndicativeOrMarketPrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice8
 * CorporateActionPrice8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice11
 * CorporateActionPrice11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice19
 * CorporateActionPrice19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice20
 * CorporateActionPrice20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice29
 * CorporateActionPrice29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice35
 * CorporateActionPrice35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice5
 * CorporateActionPrice5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice9
 * CorporateActionPrice9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice7
 * CorporateActionPrice7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice12
 * CorporateActionPrice12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice21
 * CorporateActionPrice21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice22
 * CorporateActionPrice22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice30
 * CorporateActionPrice30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice27
 * CorporateActionPrice27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice36
 * CorporateActionPrice36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice33
 * CorporateActionPrice33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice39
 * CorporateActionPrice39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice40
 * CorporateActionPrice40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice6
 * CorporateActionPrice6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice10
 * CorporateActionPrice10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice14
 * CorporateActionPrice14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice13
 * CorporateActionPrice13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice16
 * CorporateActionPrice16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice18
 * CorporateActionPrice18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice23
 * CorporateActionPrice23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice24
 * CorporateActionPrice24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice28
 * CorporateActionPrice28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice26
 * CorporateActionPrice26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice34
 * CorporateActionPrice34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice32
 * CorporateActionPrice32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice38
 * CorporateActionPrice38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice41
 * CorporateActionPrice41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice3
 * CorporateActionPrice3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice15
 * CorporateActionPrice15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice17
 * CorporateActionPrice17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice25
 * CorporateActionPrice25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice31
 * CorporateActionPrice31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice37
 * CorporateActionPrice37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice2
 * CorporateActionPrice2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice1
 * CorporateActionPrice1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice4
 * CorporateActionPrice4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice42
 * CorporateActionPrice42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice43
 * CorporateActionPrice43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice44
 * CorporateActionPrice44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice45
 * CorporateActionPrice45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice50
 * CorporateActionPrice50}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice52
 * CorporateActionPrice52}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice55
 * CorporateActionPrice55}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice51
 * CorporateActionPrice51}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice59
 * CorporateActionPrice59}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice56
 * CorporateActionPrice56}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice60
 * CorporateActionPrice60}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice58
 * CorporateActionPrice58}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice61
 * CorporateActionPrice61}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice57
 * CorporateActionPrice57}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice63
 * CorporateActionPrice63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice65
 * CorporateActionPrice65}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice62
 * CorporateActionPrice62}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice66
 * CorporateActionPrice66}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice67
 * CorporateActionPrice67}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice64
 * CorporateActionPrice64}</li>
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
 * "CorporateActionPrice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Prices related to a corporate action."</li>
 * </ul>
 */
public class CorporateActionPrice {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionEvent corporateActionEvent;
	/**
	 * Corporate event for which a price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate event for which a price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate event for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected SecuritiesPricing corporateActionExercisePrice;
	/**
	 * 1. Price at which security will be purchased/sold if warrant is
	 * exercised, either as an actual amount or a percentage.<br>
	 * 2. Price at which a bond is converted to underlying security either as an
	 * actual amount or a percentage.<br>
	 * 3. Strike price of an option, represented either as an actual amount or a
	 * percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmExercisePriceRelatedEvent
	 * SecuritiesPricing.mmExercisePriceRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice8#mmExercisePrice
	 * CorporateActionPrice8.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice11#mmExercisePrice
	 * CorporateActionPrice11.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice19#mmExercisePrice
	 * CorporateActionPrice19.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice20#mmExercisePrice
	 * CorporateActionPrice20.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#mmExercisePrice
	 * CorporateActionPrice5.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice7#mmExercisePrice
	 * CorporateActionPrice7.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice6#mmExercisePrice
	 * CorporateActionPrice6.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#mmExercisePrice
	 * CorporateActionPrice14.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmExercisePrice
	 * CorporateActionPrice1.mmExercisePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionExercisePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "1. Price at which security will be purchased/sold if warrant is exercised, either as an actual amount or a percentage.\r\n2. Price at which a bond is converted to underlying security either as an actual amount or a percentage.\r\n3. Strike price of an option, represented either as an actual amount or a percentage."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionExercisePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice8.mmExercisePrice, com.tools20022.repository.msg.CorporateActionPrice11.mmExercisePrice,
					com.tools20022.repository.msg.CorporateActionPrice19.mmExercisePrice, com.tools20022.repository.msg.CorporateActionPrice20.mmExercisePrice, com.tools20022.repository.msg.CorporateActionPrice5.mmExercisePrice,
					com.tools20022.repository.msg.CorporateActionPrice7.mmExercisePrice, com.tools20022.repository.msg.CorporateActionPrice6.mmExercisePrice, com.tools20022.repository.msg.CorporateActionPrice14.mmExercisePrice,
					com.tools20022.repository.msg.CorporateActionPrice1.mmExercisePrice);
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionExercisePrice";
			definition = "1. Price at which security will be purchased/sold if warrant is exercised, either as an actual amount or a percentage.\r\n2. Price at which a bond is converted to underlying security either as an actual amount or a percentage.\r\n3. Strike price of an option, represented either as an actual amount or a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmExercisePriceRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing genericCashPriceReceivedPerProduct;
	/**
	 * Generic cash price received per product by the underlying security holder
	 * either as a percentage or an amount, eg, redemption price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmGenericCashPriceReceivedPerProductRelatedEvent
	 * SecuritiesPricing.mmGenericCashPriceReceivedPerProductRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice8#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice8.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice11#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice11.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice19#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice19.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice20#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice20.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice29#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice29.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice35#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice35.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice5.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption2#mmGenericCashPriceReceivedPerProduct
	 * CashOption2.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice7#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice7.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption9#mmGenericCashPriceReceivedPerProduct
	 * CashOption9.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice21#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice21.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails2#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails2.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice22#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice22.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails4#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails4.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice27#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice27.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails7#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails7.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice33#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice33.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails9#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails9.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice39#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice39.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails11#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails11.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice40#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice40.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails12#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails12.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice6#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice6.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption3#mmGenericCashPriceReceivedPerProduct
	 * CashOption3.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice14.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption6#mmGenericCashPriceReceivedPerProduct
	 * CashOption6.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice16#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice16.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails3#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails3.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice23#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice23.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails5#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails5.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice26#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice26.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails6#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails6.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice32#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice32.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails8#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails8.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice38#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice38.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails10#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails10.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice41#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice41.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails13#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails13.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption4#mmGenericCashPriceReceivedPerProduct
	 * CashOption4.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption8#mmGenericCashPriceReceivedPerProduct
	 * CashOption8.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice31#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice31.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice37#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice37.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice1.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails14#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails14.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice43.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice44#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice44.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice45#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice45.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails15#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails15.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails18#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails18.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails21#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails21.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice52#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice52.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice55#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice55.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice51#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice51.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice59.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails23#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails23.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice56.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice60#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice60.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails22#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails22.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails24#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails24.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails25#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails25.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice62#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice62.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice66.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice64#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice64.mmGenericCashPriceReceivedPerProduct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic cash price received per product by the underlying security holder either as a percentage or an amount, eg, redemption price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGenericCashPriceReceivedPerProduct = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice8.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CorporateActionPrice11.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice19.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CorporateActionPrice20.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice29.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CorporateActionPrice35.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice5.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CashOption2.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice7.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CashOption9.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice21.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails2.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice22.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails4.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice27.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails7.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice33.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails9.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice39.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails11.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice40.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails12.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice6.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CashOption3.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice14.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CashOption6.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice16.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails3.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice23.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails5.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice26.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails6.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice32.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails8.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice38.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails10.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice41.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails13.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CashOption4.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CashOption8.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice31.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CorporateActionPrice37.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice1.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails14.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice43.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CorporateActionPrice44.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice45.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails15.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.PriceDetails18.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails21.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice52.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CorporateActionPrice55.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice51.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CorporateActionPrice59.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.PriceDetails23.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CorporateActionPrice56.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice60.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails22.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.PriceDetails24.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails25.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice62.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CorporateActionPrice66.mmGenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice64.mmGenericCashPriceReceivedPerProduct);
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GenericCashPriceReceivedPerProduct";
			definition = "Generic cash price received per product by the underlying security holder either as a percentage or an amount, eg, redemption price.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmGenericCashPriceReceivedPerProductRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing genericCashPricePaidPerProduct;
	/**
	 * Amount included in the dividend/NAV that is identified as gains directly
	 * or indirectly derived from interest payments within the scope of the EU
	 * Savings directive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmGenericCashPricePaidPerProductRelatedEvent
	 * SecuritiesPricing.mmGenericCashPricePaidPerProductRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice8#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice8.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice11#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice11.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice19#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice19.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice20#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice20.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice29#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice29.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice35#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice35.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice5.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice7#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice7.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails2#mmGenericCashPricePaidPerProduct
	 * PriceDetails2.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails4#mmGenericCashPricePaidPerProduct
	 * PriceDetails4.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice27#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice27.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails7#mmGenericCashPricePaidPerProduct
	 * PriceDetails7.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice33#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice33.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails9#mmGenericCashPricePaidPerProduct
	 * PriceDetails9.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice39#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice39.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails11#mmGenericCashPricePaidPerProduct
	 * PriceDetails11.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice40#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice40.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails12#mmGenericCashPricePaidPerProduct
	 * PriceDetails12.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice6#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice6.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice14.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails3#mmGenericCashPricePaidPerProduct
	 * PriceDetails3.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails5#mmGenericCashPricePaidPerProduct
	 * PriceDetails5.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice26#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice26.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails6#mmGenericCashPricePaidPerProduct
	 * PriceDetails6.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice32#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice32.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails8#mmGenericCashPricePaidPerProduct
	 * PriceDetails8.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice38#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice38.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails10#mmGenericCashPricePaidPerProduct
	 * PriceDetails10.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice41#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice41.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails13#mmGenericCashPricePaidPerProduct
	 * PriceDetails13.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice31#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice31.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice37#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice37.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice1.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails14#mmGenericCashPricePaidPerProduct
	 * PriceDetails14.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice43.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice44#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice44.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice45#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice45.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails15#mmGenericCashPricePaidPerProduct
	 * PriceDetails15.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails18#mmGenericCashPricePaidPerProduct
	 * PriceDetails18.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails21#mmGenericCashPricePaidPerProduct
	 * PriceDetails21.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice52#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice52.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice55#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice55.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice51#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice51.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice59.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails23#mmGenericCashPricePaidPerProduct
	 * PriceDetails23.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice56.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice60#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice60.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails22#mmGenericCashPricePaidPerProduct
	 * PriceDetails22.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails24#mmGenericCashPricePaidPerProduct
	 * PriceDetails24.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails25#mmGenericCashPricePaidPerProduct
	 * PriceDetails25.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice62#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice62.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice66.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice64#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice64.mmGenericCashPricePaidPerProduct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePaidPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGenericCashPricePaidPerProduct = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice8.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice11.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice19.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice20.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice29.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice35.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice5.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice7.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.PriceDetails2.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails4.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice27.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails7.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice33.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails9.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice39.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails11.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice40.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails12.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice6.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice14.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.PriceDetails3.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails5.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice26.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails6.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice32.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails8.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice38.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails10.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice41.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails13.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice31.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice37.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice1.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails14.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice43.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice44.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice45.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails15.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.PriceDetails18.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails21.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice52.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice55.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice51.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice59.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.PriceDetails23.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice56.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice60.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails22.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.PriceDetails24.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails25.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice62.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice66.mmGenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice64.mmGenericCashPricePaidPerProduct);
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GenericCashPricePaidPerProduct";
			definition = "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmGenericCashPricePaidPerProductRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing cashInLieuOfSharePrice;
	/**
	 * Cash disbursement in lieu of equities; usually in lieu of fractional
	 * quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashInLieuOfSharePriceRelatedEvent
	 * SecuritiesPricing.mmCashInLieuOfSharePriceRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#mmCashInLieuOfSharePrice
	 * CorporateActionPrice5.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice9#mmCashInLieuOfSharePrice
	 * CorporateActionPrice9.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice7#mmCashInLieuOfSharePrice
	 * CorporateActionPrice7.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice12#mmCashInLieuOfSharePrice
	 * CorporateActionPrice12.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice21#mmCashInLieuOfSharePrice
	 * CorporateActionPrice21.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice22#mmCashInLieuOfSharePrice
	 * CorporateActionPrice22.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice30#mmCashInLieuOfSharePrice
	 * CorporateActionPrice30.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice27#mmCashInLieuOfSharePrice
	 * CorporateActionPrice27.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice36#mmCashInLieuOfSharePrice
	 * CorporateActionPrice36.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice33#mmCashInLieuOfSharePrice
	 * CorporateActionPrice33.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice39#mmCashInLieuOfSharePrice
	 * CorporateActionPrice39.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice40#mmCashInLieuOfSharePrice
	 * CorporateActionPrice40.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice6#mmCashInLieuOfSharePrice
	 * CorporateActionPrice6.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice10#mmCashInLieuOfSharePrice
	 * CorporateActionPrice10.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#mmCashInLieuOfSharePrice
	 * CorporateActionPrice14.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice13#mmCashInLieuOfSharePrice
	 * CorporateActionPrice13.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice16#mmCashInLieuOfSharePrice
	 * CorporateActionPrice16.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice18#mmCashInLieuOfSharePrice
	 * CorporateActionPrice18.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice23#mmCashInLieuOfSharePrice
	 * CorporateActionPrice23.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice24#mmCashInLieuOfSharePrice
	 * CorporateActionPrice24.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice28#mmCashInLieuOfSharePrice
	 * CorporateActionPrice28.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice26#mmCashInLieuOfSharePrice
	 * CorporateActionPrice26.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice34#mmCashInLieuOfSharePrice
	 * CorporateActionPrice34.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice32#mmCashInLieuOfSharePrice
	 * CorporateActionPrice32.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice38#mmCashInLieuOfSharePrice
	 * CorporateActionPrice38.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice41#mmCashInLieuOfSharePrice
	 * CorporateActionPrice41.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice31#mmCashInLieuOfSharePrice
	 * CorporateActionPrice31.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice37#mmCashInLieuOfSharePrice
	 * CorporateActionPrice37.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmCashInLieuOfSharePrice
	 * CorporateActionPrice1.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43#mmCashInLieuOfSharePrice
	 * CorporateActionPrice43.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice45#mmCashInLieuOfSharePrice
	 * CorporateActionPrice45.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice55#mmCashInLieuOfSharePrice
	 * CorporateActionPrice55.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice51#mmCashInLieuOfSharePrice
	 * CorporateActionPrice51.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#mmCashInLieuOfSharePrice
	 * CorporateActionPrice59.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#mmCashInLieuOfSharePrice
	 * CorporateActionPrice56.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice58#mmCashInLieuOfSharePrice
	 * CorporateActionPrice58.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice61#mmCashInLieuOfSharePrice
	 * CorporateActionPrice61.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice63#mmCashInLieuOfSharePrice
	 * CorporateActionPrice63.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice65#mmCashInLieuOfSharePrice
	 * CorporateActionPrice65.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66#mmCashInLieuOfSharePrice
	 * CorporateActionPrice66.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice64#mmCashInLieuOfSharePrice
	 * CorporateActionPrice64.mmCashInLieuOfSharePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfSharePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash disbursement in lieu of equities; usually in lieu of fractional quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashInLieuOfSharePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice5.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice9.mmCashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice7.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice12.mmCashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice21.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice22.mmCashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice30.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice27.mmCashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice36.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice33.mmCashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice39.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice40.mmCashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice6.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice10.mmCashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice14.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice13.mmCashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice16.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice18.mmCashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice23.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice24.mmCashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice28.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice26.mmCashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice34.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice32.mmCashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice38.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice41.mmCashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice31.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice37.mmCashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice1.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice43.mmCashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice45.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice55.mmCashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice51.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice59.mmCashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice56.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice58.mmCashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice61.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice63.mmCashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice65.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice66.mmCashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice64.mmCashInLieuOfSharePrice);
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashInLieuOfSharePrice";
			definition = "Cash disbursement in lieu of equities; usually in lieu of fractional quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmCashInLieuOfSharePriceRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing overSubscriptionDepositPrice;
	/**
	 * Amount of money required per over-subscribed equity as defined by the
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmOverSubscriptionDepositPriceRelatedEvent
	 * SecuritiesPricing.mmOverSubscriptionDepositPriceRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice5.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice7#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice7.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice21#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice21.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice22#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice22.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice30#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice30.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice36#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice36.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice6#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice6.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice14.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice16#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice16.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice23#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice23.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice28#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice28.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice34#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice34.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice1.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice58#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice58.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice61#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice61.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice63#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice63.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice65#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice65.mmOverSubscriptionDepositPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverSubscriptionDepositPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money required per over-subscribed equity as defined by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOverSubscriptionDepositPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice5.mmOverSubscriptionDepositPrice, com.tools20022.repository.msg.CorporateActionPrice7.mmOverSubscriptionDepositPrice,
					com.tools20022.repository.msg.CorporateActionPrice21.mmOverSubscriptionDepositPrice, com.tools20022.repository.msg.CorporateActionPrice22.mmOverSubscriptionDepositPrice,
					com.tools20022.repository.msg.CorporateActionPrice30.mmOverSubscriptionDepositPrice, com.tools20022.repository.msg.CorporateActionPrice36.mmOverSubscriptionDepositPrice,
					com.tools20022.repository.msg.CorporateActionPrice6.mmOverSubscriptionDepositPrice, com.tools20022.repository.msg.CorporateActionPrice14.mmOverSubscriptionDepositPrice,
					com.tools20022.repository.msg.CorporateActionPrice16.mmOverSubscriptionDepositPrice, com.tools20022.repository.msg.CorporateActionPrice23.mmOverSubscriptionDepositPrice,
					com.tools20022.repository.msg.CorporateActionPrice28.mmOverSubscriptionDepositPrice, com.tools20022.repository.msg.CorporateActionPrice34.mmOverSubscriptionDepositPrice,
					com.tools20022.repository.msg.CorporateActionPrice1.mmOverSubscriptionDepositPrice, com.tools20022.repository.msg.CorporateActionPrice58.mmOverSubscriptionDepositPrice,
					com.tools20022.repository.msg.CorporateActionPrice61.mmOverSubscriptionDepositPrice, com.tools20022.repository.msg.CorporateActionPrice63.mmOverSubscriptionDepositPrice,
					com.tools20022.repository.msg.CorporateActionPrice65.mmOverSubscriptionDepositPrice);
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverSubscriptionDepositPrice";
			definition = "Amount of money required per over-subscribed equity as defined by the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmOverSubscriptionDepositPriceRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing cashValueForTax;
	/**
	 * Cash value of resulting securities proceeds for tax calculation and/or
	 * reporting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashValueForTaxRelatedEvent
	 * SecuritiesPricing.mmCashValueForTaxRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice27#mmCashValueForTax
	 * CorporateActionPrice27.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice33#mmCashValueForTax
	 * CorporateActionPrice33.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice39#mmCashValueForTax
	 * CorporateActionPrice39.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice40#mmCashValueForTax
	 * CorporateActionPrice40.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice26#mmCashValueForTax
	 * CorporateActionPrice26.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice32#mmCashValueForTax
	 * CorporateActionPrice32.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice38#mmCashValueForTax
	 * CorporateActionPrice38.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice41#mmCashValueForTax
	 * CorporateActionPrice41.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice31#mmCashValueForTax
	 * CorporateActionPrice31.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice37#mmCashValueForTax
	 * CorporateActionPrice37.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43#mmCashValueForTax
	 * CorporateActionPrice43.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice45#mmCashValueForTax
	 * CorporateActionPrice45.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice55#mmCashValueForTax
	 * CorporateActionPrice55.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice51#mmCashValueForTax
	 * CorporateActionPrice51.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#mmCashValueForTax
	 * CorporateActionPrice59.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#mmCashValueForTax
	 * CorporateActionPrice56.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66#mmCashValueForTax
	 * CorporateActionPrice66.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice64#mmCashValueForTax
	 * CorporateActionPrice64.mmCashValueForTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashValueForTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash value of resulting securities proceeds for tax calculation and/or reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashValueForTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice27.mmCashValueForTax, com.tools20022.repository.msg.CorporateActionPrice33.mmCashValueForTax,
					com.tools20022.repository.msg.CorporateActionPrice39.mmCashValueForTax, com.tools20022.repository.msg.CorporateActionPrice40.mmCashValueForTax, com.tools20022.repository.msg.CorporateActionPrice26.mmCashValueForTax,
					com.tools20022.repository.msg.CorporateActionPrice32.mmCashValueForTax, com.tools20022.repository.msg.CorporateActionPrice38.mmCashValueForTax, com.tools20022.repository.msg.CorporateActionPrice41.mmCashValueForTax,
					com.tools20022.repository.msg.CorporateActionPrice31.mmCashValueForTax, com.tools20022.repository.msg.CorporateActionPrice37.mmCashValueForTax, com.tools20022.repository.msg.CorporateActionPrice43.mmCashValueForTax,
					com.tools20022.repository.msg.CorporateActionPrice45.mmCashValueForTax, com.tools20022.repository.msg.CorporateActionPrice55.mmCashValueForTax, com.tools20022.repository.msg.CorporateActionPrice51.mmCashValueForTax,
					com.tools20022.repository.msg.CorporateActionPrice59.mmCashValueForTax, com.tools20022.repository.msg.CorporateActionPrice56.mmCashValueForTax, com.tools20022.repository.msg.CorporateActionPrice66.mmCashValueForTax,
					com.tools20022.repository.msg.CorporateActionPrice64.mmCashValueForTax);
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashValueForTax";
			definition = "Cash value of resulting securities proceeds for tax calculation and/or reporting.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmCashValueForTaxRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing pricingCalculation;
	/**
	 * Specifies the parameters taken into account to calculate the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedCorporateActionPrice
	 * SecuritiesPricing.mmRelatedCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PricingCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the parameters taken into account to calculate the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPricingCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PricingCalculation";
			definition = "Specifies the parameters taken into account to calculate the price.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmRelatedCorporateActionPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice";
				definition = "Prices related to a corporate action.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmExercisePriceRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.mmGenericCashPriceReceivedPerProductRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmGenericCashPricePaidPerProductRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.mmCashInLieuOfSharePriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmOverSubscriptionDepositPriceRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.mmCashValueForTaxRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmRelatedCorporateActionPrice,
						com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionPrice);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice8.mmIndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice11.mmIndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice19.mmIndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice20.mmIndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice29.mmIndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice35.mmIndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice9.mmIndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice12.mmIndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice27.mmIndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice33.mmIndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice39.mmIndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice40.mmIndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice10.mmIndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice13.mmIndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice18.mmIndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice24.mmIndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice26.mmIndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice32.mmIndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice38.mmIndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice41.mmIndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice31.mmIndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice37.mmIndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice4.mmIndicativePrice, com.tools20022.repository.msg.CorporateActionPrice4.mmMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice43.mmIndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice44.mmIndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice45.mmIndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice52.mmIndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice55.mmIndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice51.mmIndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice59.mmIndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice56.mmIndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice60.mmIndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice62.mmIndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice66.mmIndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice64.mmIndicativeOrMarketPrice);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionPrice.mmCorporateActionEvent, com.tools20022.repository.entity.CorporateActionPrice.mmCorporateActionExercisePrice,
						com.tools20022.repository.entity.CorporateActionPrice.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.entity.CorporateActionPrice.mmGenericCashPricePaidPerProduct,
						com.tools20022.repository.entity.CorporateActionPrice.mmCashInLieuOfSharePrice, com.tools20022.repository.entity.CorporateActionPrice.mmOverSubscriptionDepositPrice,
						com.tools20022.repository.entity.CorporateActionPrice.mmCashValueForTax, com.tools20022.repository.entity.CorporateActionPrice.mmPricingCalculation);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionPrice8.mmObject(), CorporateActionPrice11.mmObject(), CorporateActionPrice19.mmObject(), CorporateActionPrice20.mmObject(), CorporateActionPrice29.mmObject(),
						CorporateActionPrice35.mmObject(), CorporateActionPrice5.mmObject(), CorporateActionPrice9.mmObject(), CorporateActionPrice7.mmObject(), CorporateActionPrice12.mmObject(), CorporateActionPrice21.mmObject(),
						CorporateActionPrice22.mmObject(), CorporateActionPrice30.mmObject(), CorporateActionPrice27.mmObject(), CorporateActionPrice36.mmObject(), CorporateActionPrice33.mmObject(), CorporateActionPrice39.mmObject(),
						CorporateActionPrice40.mmObject(), CorporateActionPrice6.mmObject(), CorporateActionPrice10.mmObject(), CorporateActionPrice14.mmObject(), CorporateActionPrice13.mmObject(), CorporateActionPrice16.mmObject(),
						CorporateActionPrice18.mmObject(), CorporateActionPrice23.mmObject(), CorporateActionPrice24.mmObject(), CorporateActionPrice28.mmObject(), CorporateActionPrice26.mmObject(), CorporateActionPrice34.mmObject(),
						CorporateActionPrice32.mmObject(), CorporateActionPrice38.mmObject(), CorporateActionPrice41.mmObject(), CorporateActionPrice3.mmObject(), CorporateActionPrice15.mmObject(), CorporateActionPrice17.mmObject(),
						CorporateActionPrice25.mmObject(), CorporateActionPrice31.mmObject(), CorporateActionPrice37.mmObject(), CorporateActionPrice2.mmObject(), CorporateActionPrice1.mmObject(), CorporateActionPrice4.mmObject(),
						CorporateActionPrice42.mmObject(), CorporateActionPrice43.mmObject(), CorporateActionPrice44.mmObject(), CorporateActionPrice45.mmObject(), CorporateActionPrice50.mmObject(), CorporateActionPrice52.mmObject(),
						CorporateActionPrice55.mmObject(), CorporateActionPrice51.mmObject(), CorporateActionPrice59.mmObject(), CorporateActionPrice56.mmObject(), CorporateActionPrice60.mmObject(), CorporateActionPrice58.mmObject(),
						CorporateActionPrice61.mmObject(), CorporateActionPrice57.mmObject(), CorporateActionPrice63.mmObject(), CorporateActionPrice65.mmObject(), CorporateActionPrice62.mmObject(), CorporateActionPrice66.mmObject(),
						CorporateActionPrice67.mmObject(), CorporateActionPrice64.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionEvent getCorporateActionEvent() {
		return corporateActionEvent;
	}

	public void setCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent corporateActionEvent) {
		this.corporateActionEvent = corporateActionEvent;
	}

	public SecuritiesPricing getCorporateActionExercisePrice() {
		return corporateActionExercisePrice;
	}

	public void setCorporateActionExercisePrice(com.tools20022.repository.entity.SecuritiesPricing corporateActionExercisePrice) {
		this.corporateActionExercisePrice = corporateActionExercisePrice;
	}

	public SecuritiesPricing getGenericCashPriceReceivedPerProduct() {
		return genericCashPriceReceivedPerProduct;
	}

	public void setGenericCashPriceReceivedPerProduct(com.tools20022.repository.entity.SecuritiesPricing genericCashPriceReceivedPerProduct) {
		this.genericCashPriceReceivedPerProduct = genericCashPriceReceivedPerProduct;
	}

	public SecuritiesPricing getGenericCashPricePaidPerProduct() {
		return genericCashPricePaidPerProduct;
	}

	public void setGenericCashPricePaidPerProduct(com.tools20022.repository.entity.SecuritiesPricing genericCashPricePaidPerProduct) {
		this.genericCashPricePaidPerProduct = genericCashPricePaidPerProduct;
	}

	public SecuritiesPricing getCashInLieuOfSharePrice() {
		return cashInLieuOfSharePrice;
	}

	public void setCashInLieuOfSharePrice(com.tools20022.repository.entity.SecuritiesPricing cashInLieuOfSharePrice) {
		this.cashInLieuOfSharePrice = cashInLieuOfSharePrice;
	}

	public SecuritiesPricing getOverSubscriptionDepositPrice() {
		return overSubscriptionDepositPrice;
	}

	public void setOverSubscriptionDepositPrice(com.tools20022.repository.entity.SecuritiesPricing overSubscriptionDepositPrice) {
		this.overSubscriptionDepositPrice = overSubscriptionDepositPrice;
	}

	public SecuritiesPricing getCashValueForTax() {
		return cashValueForTax;
	}

	public void setCashValueForTax(com.tools20022.repository.entity.SecuritiesPricing cashValueForTax) {
		this.cashValueForTax = cashValueForTax;
	}

	public SecuritiesPricing getPricingCalculation() {
		return pricingCalculation;
	}

	public void setPricingCalculation(com.tools20022.repository.entity.SecuritiesPricing pricingCalculation) {
		this.pricingCalculation = pricingCalculation;
	}
}