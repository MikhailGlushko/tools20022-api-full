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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.entity.CorporateActionPrice;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies prices related to a corporate action option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66#mmIndicativeOrMarketPrice
 * CorporateActionPrice66.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66#mmCashInLieuOfSharePrice
 * CorporateActionPrice66.mmCashInLieuOfSharePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66#mmCashValueForTax
 * CorporateActionPrice66.mmCashValueForTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66#mmGenericCashPricePaidPerProduct
 * CorporateActionPrice66.mmGenericCashPricePaidPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66#mmGenericCashPriceReceivedPerProduct
 * CorporateActionPrice66.mmGenericCashPriceReceivedPerProduct}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionPrice
 * CorporateActionPrice}</li>
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
 * "CorporateActionPrice66"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies prices related to a corporate action option."</li>
 * </ul>
 */
public class CorporateActionPrice66 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected IndicativeOrMarketPrice11Choice indicativeOrMarketPrice;
	/**
	 * Indicates whether the price is an indicative price or a market price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice11Choice
	 * IndicativeOrMarketPrice11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66
	 * CorporateActionPrice66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndctvOrMktPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndicativeOrMarketPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the price is an indicative price or a market price."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIndicativeOrMarketPrice = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionPrice.mmObject();
			componentContext_lazy = () -> CorporateActionPrice66.mmObject();
			isDerived = false;
			xmlTag = "IndctvOrMktPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndicativeOrMarketPrice";
			definition = "Indicates whether the price is an indicative price or a market price.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IndicativeOrMarketPrice11Choice.mmObject();
		}
	};
	protected PriceFormat57Choice cashInLieuOfSharePrice;
	/**
	 * Cash disbursement in lieu of equities; usually in lieu of fractional
	 * quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat57Choice
	 * PriceFormat57Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashInLieuOfSharePrice
	 * CorporateActionPrice.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66
	 * CorporateActionPrice66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInLieuOfShrPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfSharePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash disbursement in lieu of equities; usually in lieu of fractional quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashInLieuOfSharePrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmCashInLieuOfSharePrice;
			componentContext_lazy = () -> CorporateActionPrice66.mmObject();
			isDerived = false;
			xmlTag = "CshInLieuOfShrPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfSharePrice";
			definition = "Cash disbursement in lieu of equities; usually in lieu of fractional quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat57Choice.mmObject();
		}
	};
	protected PriceFormat58Choice cashValueForTax;
	/**
	 * Cash value of resulting securities proceeds for tax calculation and/or
	 * reporting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat58Choice
	 * PriceFormat58Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashValueForTax
	 * CorporateActionPrice.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66
	 * CorporateActionPrice66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshValForTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashValueForTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash value of resulting securities proceeds for tax calculation and/or reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashValueForTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmCashValueForTax;
			componentContext_lazy = () -> CorporateActionPrice66.mmObject();
			isDerived = false;
			xmlTag = "CshValForTax";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashValueForTax";
			definition = "Cash value of resulting securities proceeds for tax calculation and/or reporting.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormat58Choice.mmObject();
		}
	};
	protected PriceFormat59Choice genericCashPricePaidPerProduct;
	/**
	 * Generic cash price paid per product by the underlying security holder
	 * either as a percentage or an amount or a number of points above an index,
	 * for example, reinvestment price, strike price and exercise price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat59Choice
	 * PriceFormat59Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66
	 * CorporateActionPrice66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GncCshPricPdPerPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePaidPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic cash price paid per product by the underlying security holder either as a percentage or an amount or a number of points above an index, for example, reinvestment price, strike price and exercise price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGenericCashPricePaidPerProduct = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmGenericCashPricePaidPerProduct;
			componentContext_lazy = () -> CorporateActionPrice66.mmObject();
			isDerived = false;
			xmlTag = "GncCshPricPdPerPdct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePaidPerProduct";
			definition = "Generic cash price paid per product by the underlying security holder either as a percentage or an amount or a number of points above an index, for example, reinvestment price, strike price and exercise price.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat59Choice.mmObject();
		}
	};
	protected PriceFormat60Choice genericCashPriceReceivedPerProduct;
	/**
	 * Generic cash price received per product by the underlying security holder
	 * either as a percentage or an amount, for example, redemption price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat60Choice
	 * PriceFormat60Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66
	 * CorporateActionPrice66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GncCshPricRcvdPerPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic cash price received per product by the underlying security holder either as a percentage or an amount, for example, redemption price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGenericCashPriceReceivedPerProduct = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmGenericCashPriceReceivedPerProduct;
			componentContext_lazy = () -> CorporateActionPrice66.mmObject();
			isDerived = false;
			xmlTag = "GncCshPricRcvdPerPdct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPriceReceivedPerProduct";
			definition = "Generic cash price received per product by the underlying security holder either as a percentage or an amount, for example, redemption price.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat60Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice66.mmIndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice66.mmCashInLieuOfSharePrice,
						com.tools20022.repository.msg.CorporateActionPrice66.mmCashValueForTax, com.tools20022.repository.msg.CorporateActionPrice66.mmGenericCashPricePaidPerProduct,
						com.tools20022.repository.msg.CorporateActionPrice66.mmGenericCashPriceReceivedPerProduct);
				trace_lazy = () -> CorporateActionPrice.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice66";
				definition = "Specifies prices related to a corporate action option.";
			}
		});
		return mmObject_lazy.get();
	}

	public IndicativeOrMarketPrice11Choice getIndicativeOrMarketPrice() {
		return indicativeOrMarketPrice;
	}

	public void setIndicativeOrMarketPrice(IndicativeOrMarketPrice11Choice indicativeOrMarketPrice) {
		this.indicativeOrMarketPrice = indicativeOrMarketPrice;
	}

	public PriceFormat57Choice getCashInLieuOfSharePrice() {
		return cashInLieuOfSharePrice;
	}

	public void setCashInLieuOfSharePrice(PriceFormat57Choice cashInLieuOfSharePrice) {
		this.cashInLieuOfSharePrice = cashInLieuOfSharePrice;
	}

	public PriceFormat58Choice getCashValueForTax() {
		return cashValueForTax;
	}

	public void setCashValueForTax(PriceFormat58Choice cashValueForTax) {
		this.cashValueForTax = cashValueForTax;
	}

	public PriceFormat59Choice getGenericCashPricePaidPerProduct() {
		return genericCashPricePaidPerProduct;
	}

	public void setGenericCashPricePaidPerProduct(PriceFormat59Choice genericCashPricePaidPerProduct) {
		this.genericCashPricePaidPerProduct = genericCashPricePaidPerProduct;
	}

	public PriceFormat60Choice getGenericCashPriceReceivedPerProduct() {
		return genericCashPriceReceivedPerProduct;
	}

	public void setGenericCashPriceReceivedPerProduct(PriceFormat60Choice genericCashPriceReceivedPerProduct) {
		this.genericCashPriceReceivedPerProduct = genericCashPriceReceivedPerProduct;
	}
}