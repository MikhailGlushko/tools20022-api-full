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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Item that is offered for sale. Products can be services or goods.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Product" src="doc-files/Product.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmCardPayment
 * Product.mmCardPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmUnitPrice
 * Product.mmUnitPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmProductCategory
 * Product.mmProductCategory}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmLineItem
 * Product.mmLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Product#mmProductIdentification
 * Product.mmProductIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmName
 * Product.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmDescription
 * Product.mmDescription}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmOrigin
 * Product.mmOrigin}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmCharacteristics
 * Product.mmCharacteristics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmNetPrice
 * Product.mmNetPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmQuantity
 * Product.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmGrossPrice
 * Product.mmGrossPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmQuality
 * Product.mmQuality}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmDelivery
 * Product.mmDelivery}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmPurchaseOrder
 * Product.mmPurchaseOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmTax Product.mmTax}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmProducedProducts
 * Country.mmProducedProducts}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmProduct Tax.mmProduct}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#mmProduct
 * CardPayment.mmProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmUnitPriceProduct
 * Price.mmUnitPriceProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmNetPriceProduct
 * Price.mmNetPriceProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmGrossPriceProduct
 * Price.mmGrossPriceProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductIdentification#mmProduct
 * ProductIdentification.mmProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductQuantity#mmProduct
 * ProductQuantity.mmProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductCategory#mmProduct
 * ProductCategory.mmProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmInvoicedProduct
 * LineItem.mmInvoicedProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDelivery#mmProduct
 * ProductDelivery.mmProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics#mmProduct
 * ProductCharacteristics.mmProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PurchaseOrder#mmProduct
 * PurchaseOrder.mmProduct}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Service Service}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Goods Goods}</li>
 * <li>{@linkplain com.tools20022.repository.entity.FinancialProduct
 * FinancialProduct}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Product2 Product2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product1 Product1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct1 TradeProduct1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice
 * CertifiedCharacteristics1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ServiceItemTotals1
 * ServiceItemTotals1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice
 * CertifiedCharacteristics2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product3 Product3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product4 Product4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Product5 Product5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct2 TradeProduct2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct3 TradeProduct3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Product"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Item that is offered for sale. Products can be services or goods."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class Product {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CardPayment cardPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardPayment
	 * CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmProduct
	 * CardPayment.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card payment for which a product was specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Product, CardPayment> mmCardPayment = new MMBusinessAssociationEnd<Product, CardPayment>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardPayment";
			definition = "Card payment for which a product was specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CardPayment.mmProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CardPayment.mmObject();
		}

		@Override
		public CardPayment getValue(Product obj) {
			return obj.getCardPayment();
		}

		@Override
		public void setValue(Product obj, CardPayment value) {
			obj.setCardPayment(value);
		}
	};
	protected List<Price> unitPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmUnitPriceProduct
	 * Price.mmUnitPriceProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Product2#mmUnitPrice
	 * Product2.mmUnitPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product1#mmUnitPrice
	 * Product1.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#mmUnitPrice
	 * LineItemDetails4.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmUnitPrice
	 * LineItemDetails7.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#mmUnitPrice
	 * LineItemDetails6.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#mmUnitPrice
	 * LineItemDetails9.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount1#mmPricingAmount
	 * BillingServicesAmount1.mmPricingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount2#mmPricingAmount
	 * BillingServicesAmount2.mmPricingAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingService1#mmPrice
	 * BillingService1.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService1#mmOriginalChargePrice
	 * BillingService1.mmOriginalChargePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters2#mmUnitPrice
	 * BillingServiceParameters2.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmPriceChange
	 * BillingServiceAdjustment1.mmPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmOriginalPrice
	 * BillingServiceAdjustment1.mmOriginalPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmNewPrice
	 * BillingServiceAdjustment1.mmNewPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmUnitPrice
	 * LineItemDetails10.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#mmUnitPrice
	 * LineItemDetails11.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmUnitPrice
	 * LineItemDetails13.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#mmUnitPrice
	 * LineItemDetails14.mmUnitPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingService2#mmPrice
	 * BillingService2.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#mmOriginalChargePrice
	 * BillingService2.mmOriginalChargePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product3#mmUnitPrice
	 * Product3.mmUnitPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price per unit of product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Product, List<Price>> mmUnitPrice = new MMBusinessAssociationEnd<Product, List<Price>>() {
		{
			derivation_lazy = () -> Arrays.asList(Product2.mmUnitPrice, Product1.mmUnitPrice, LineItemDetails4.mmUnitPrice, LineItemDetails7.mmUnitPrice, LineItemDetails6.mmUnitPrice, LineItemDetails9.mmUnitPrice,
					BillingServicesAmount1.mmPricingAmount, BillingServicesAmount2.mmPricingAmount, BillingService1.mmPrice, BillingService1.mmOriginalChargePrice, BillingServiceParameters2.mmUnitPrice,
					BillingServiceAdjustment1.mmPriceChange, BillingServiceAdjustment1.mmOriginalPrice, BillingServiceAdjustment1.mmNewPrice, LineItemDetails10.mmUnitPrice, LineItemDetails11.mmUnitPrice, LineItemDetails13.mmUnitPrice,
					LineItemDetails14.mmUnitPrice, BillingService2.mmPrice, BillingService2.mmOriginalChargePrice, Product3.mmUnitPrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnitPrice";
			definition = "Price per unit of product.";
			minOccurs = 0;
			opposite_lazy = () -> Price.mmUnitPriceProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Price.mmObject();
		}

		@Override
		public List<Price> getValue(Product obj) {
			return obj.getUnitPrice();
		}

		@Override
		public void setValue(Product obj, List<Price> value) {
			obj.setUnitPrice(value);
		}
	};
	protected List<ProductCategory> productCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductCategory
	 * ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductCategory#mmProduct
	 * ProductCategory.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData4#mmProductType
	 * TradeData4.mmProductType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData5#mmProductType
	 * TradeData5.mmProductType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData6#mmProductType
	 * TradeData6.mmProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmProductCategory
	 * TradeProduct1.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#mmProductCategory
	 * LineItemDetails4.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmProductCategory
	 * LineItemDetails7.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmProductCategory
	 * LineItemDetails5.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#mmProductCategory
	 * LineItemDetails8.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#mmProductCategory
	 * LineItemDetails6.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#mmProductCategory
	 * LineItemDetails9.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmProductCategory
	 * LineItemDetails10.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#mmProductCategory
	 * LineItemDetails11.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmProductCategory
	 * LineItemDetails13.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#mmProductCategory
	 * LineItemDetails12.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#mmProductCategory
	 * LineItemDetails14.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmProductCategory
	 * TradeProduct2.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAdditionalQueryCriteria3#mmProductClassification
	 * TradeAdditionalQueryCriteria3.mmProductClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct3#mmProductCategory
	 * TradeProduct3.mmProductCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Category of the product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Product, List<ProductCategory>> mmProductCategory = new MMBusinessAssociationEnd<Product, List<ProductCategory>>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeData4.mmProductType, TradeData5.mmProductType, TradeData6.mmProductType, TradeProduct1.mmProductCategory, LineItemDetails4.mmProductCategory, LineItemDetails7.mmProductCategory,
					LineItemDetails5.mmProductCategory, LineItemDetails8.mmProductCategory, LineItemDetails6.mmProductCategory, LineItemDetails9.mmProductCategory, LineItemDetails10.mmProductCategory, LineItemDetails11.mmProductCategory,
					LineItemDetails13.mmProductCategory, LineItemDetails12.mmProductCategory, LineItemDetails14.mmProductCategory, TradeProduct2.mmProductCategory, TradeAdditionalQueryCriteria3.mmProductClassification,
					TradeProduct3.mmProductCategory);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProductCategory";
			definition = "Category of the product.";
			minOccurs = 0;
			opposite_lazy = () -> ProductCategory.mmProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductCategory.mmObject();
		}

		@Override
		public List<ProductCategory> getValue(Product obj) {
			return obj.getProductCategory();
		}

		@Override
		public void setValue(Product obj, List<ProductCategory> value) {
			obj.setProductCategory(value);
		}
	};
	protected LineItem lineItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmInvoicedProduct
	 * LineItem.mmInvoicedProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the line item in which the product is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Product, Optional<LineItem>> mmLineItem = new MMBusinessAssociationEnd<Product, Optional<LineItem>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LineItem";
			definition = "Specifies the line item in which the product is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> LineItem.mmInvoicedProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}

		@Override
		public Optional<LineItem> getValue(Product obj) {
			return obj.getLineItem();
		}

		@Override
		public void setValue(Product obj, Optional<LineItem> value) {
			obj.setLineItem(value.orElse(null));
		}
	};
	protected List<ProductIdentification> productIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ProductIdentification
	 * ProductIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductIdentification#mmProduct
	 * ProductIdentification.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmIdentification
	 * TradeProduct1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#mmProductIdentifier
	 * LineItemDetails4.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmProductIdentifier
	 * LineItemDetails7.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmProductIdentifier
	 * LineItemDetails5.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#mmProductIdentifier
	 * LineItemDetails8.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#mmProductIdentifier
	 * LineItemDetails6.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#mmProductIdentifier
	 * LineItemDetails9.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmProductIdentifier
	 * LineItemDetails10.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#mmProductIdentifier
	 * LineItemDetails11.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmProductIdentifier
	 * LineItemDetails13.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#mmProductIdentifier
	 * LineItemDetails12.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#mmProductIdentifier
	 * LineItemDetails14.mmProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProductClassificationCriteria1#mmUniqueProductIdentifier
	 * ProductClassificationCriteria1.mmUniqueProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProductClassification1Choice#mmUniqueProductIdentifier
	 * ProductClassification1Choice.mmUniqueProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification19Choice#mmUniqueProductIdentifier
	 * SecurityIdentification19Choice.mmUniqueProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmIdentification
	 * TradeProduct2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentificationQuery3Choice#mmUniqueProductIdentifier
	 * SecurityIdentificationQuery3Choice.mmUniqueProductIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct3#mmIdentification
	 * TradeProduct3.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Product, List<ProductIdentification>> mmProductIdentification = new MMBusinessAssociationEnd<Product, List<ProductIdentification>>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeProduct1.mmIdentification, LineItemDetails4.mmProductIdentifier, LineItemDetails7.mmProductIdentifier, LineItemDetails5.mmProductIdentifier, LineItemDetails8.mmProductIdentifier,
					LineItemDetails6.mmProductIdentifier, LineItemDetails9.mmProductIdentifier, LineItemDetails10.mmProductIdentifier, LineItemDetails11.mmProductIdentifier, LineItemDetails13.mmProductIdentifier,
					LineItemDetails12.mmProductIdentifier, LineItemDetails14.mmProductIdentifier, ProductClassificationCriteria1.mmUniqueProductIdentifier, ProductClassification1Choice.mmUniqueProductIdentifier,
					SecurityIdentification19Choice.mmUniqueProductIdentifier, TradeProduct2.mmIdentification, SecurityIdentificationQuery3Choice.mmUniqueProductIdentifier, TradeProduct3.mmIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProductIdentification";
			definition = "Identification of the product.";
			minOccurs = 0;
			opposite_lazy = () -> ProductIdentification.mmProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductIdentification.mmObject();
		}

		@Override
		public List<ProductIdentification> getValue(Product obj) {
			return obj.getProductIdentification();
		}

		@Override
		public void setValue(Product obj, List<ProductIdentification> value) {
			obj.setProductIdentification(value);
		}
	};
	protected Max35Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct1#mmName
	 * TradeProduct1.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#mmProductName
	 * LineItemDetails4.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmProductName
	 * LineItemDetails7.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmProductName
	 * LineItemDetails5.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#mmProductName
	 * LineItemDetails8.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#mmProductName
	 * LineItemDetails6.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#mmProductName
	 * LineItemDetails9.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification1#mmIdentification
	 * BillingServiceIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmProductName
	 * LineItemDetails10.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#mmProductName
	 * LineItemDetails11.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmProductName
	 * LineItemDetails13.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#mmProductName
	 * LineItemDetails12.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#mmProductName
	 * LineItemDetails14.mmProductName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3#mmIdentification
	 * BillingServiceIdentification3.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct2#mmName
	 * TradeProduct2.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct3#mmName
	 * TradeProduct3.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Product, Max35Text> mmName = new MMBusinessAttribute<Product, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeProduct1.mmName, LineItemDetails4.mmProductName, LineItemDetails7.mmProductName, LineItemDetails5.mmProductName, LineItemDetails8.mmProductName, LineItemDetails6.mmProductName,
					LineItemDetails9.mmProductName, BillingServiceIdentification1.mmIdentification, LineItemDetails10.mmProductName, LineItemDetails11.mmProductName, LineItemDetails13.mmProductName, LineItemDetails12.mmProductName,
					LineItemDetails14.mmProductName, BillingServiceIdentification3.mmIdentification, TradeProduct2.mmName, TradeProduct3.mmName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of a product.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Product obj) {
			return obj.getName();
		}

		@Override
		public void setValue(Product obj, Max35Text value) {
			obj.setName(value);
		}
	};
	protected Max140Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmDescription
	 * TradeProduct1.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem5#mmGoodsDescription
	 * LineItem5.mmGoodsDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem7#mmGoodsDescription
	 * LineItem7.mmGoodsDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportedGoods1#mmGoodsDescription
	 * TransportedGoods1.mmGoodsDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmInsuredGoodsDescription
	 * InsuranceDataSet1.mmInsuredGoodsDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmGoodsDescription
	 * CertificateDataSet1.mmGoodsDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmGoodsDescription
	 * LineItem11.mmGoodsDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmGoodsDescription
	 * CertificateDataSet2.mmGoodsDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem13#mmGoodsAndOrServicesDescription
	 * LineItem13.mmGoodsAndOrServicesDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmDescription
	 * TradeProduct2.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct3#mmDescription
	 * TradeProduct3.mmDescription}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the goods and/or services of a trade transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Product, Max140Text> mmDescription = new MMBusinessAttribute<Product, Max140Text>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeProduct1.mmDescription, LineItem5.mmGoodsDescription, LineItem7.mmGoodsDescription, TransportedGoods1.mmGoodsDescription, InsuranceDataSet1.mmInsuredGoodsDescription,
					CertificateDataSet1.mmGoodsDescription, LineItem11.mmGoodsDescription, CertificateDataSet2.mmGoodsDescription, LineItem13.mmGoodsAndOrServicesDescription, TradeProduct2.mmDescription, TradeProduct3.mmDescription);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Information about the goods and/or services of a trade transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(Product obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(Product obj, Max140Text value) {
			obj.setDescription(value);
		}
	};
	protected Country origin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmProducedProducts
	 * Country.mmProducedProducts}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmCountryOfOrigin
	 * TradeProduct1.mmCountryOfOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmOrigin
	 * CertifiedCharacteristics1Choice.mmOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmOrigin
	 * CertifiedCharacteristics2Choice.mmOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmCountryOfOrigin
	 * TradeProduct2.mmCountryOfOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct3#mmCountryOfOrigin
	 * TradeProduct3.mmCountryOfOrigin}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Origin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country from which the product originates."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Product, Country> mmOrigin = new MMBusinessAssociationEnd<Product, Country>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeProduct1.mmCountryOfOrigin, CertifiedCharacteristics1Choice.mmOrigin, CertifiedCharacteristics2Choice.mmOrigin, TradeProduct2.mmCountryOfOrigin, TradeProduct3.mmCountryOfOrigin);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Origin";
			definition = "Country from which the product originates.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Country.mmProducedProducts;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Country.mmObject();
		}

		@Override
		public Country getValue(Product obj) {
			return obj.getOrigin();
		}

		@Override
		public void setValue(Product obj, Country value) {
			obj.setOrigin(value);
		}
	};
	protected List<ProductCharacteristics> characteristics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics
	 * ProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics#mmProduct
	 * ProductCharacteristics.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmProductCharacteristics
	 * TradeProduct1.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#mmProductCharacteristics
	 * LineItemDetails4.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmProductCharacteristics
	 * LineItemDetails7.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmProductCharacteristics
	 * LineItemDetails5.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#mmProductCharacteristics
	 * LineItemDetails8.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#mmProductCharacteristics
	 * LineItemDetails6.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#mmProductCharacteristics
	 * LineItemDetails9.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmProductCharacteristics
	 * LineItemDetails10.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#mmProductCharacteristics
	 * LineItemDetails11.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmProductCharacteristics
	 * LineItemDetails13.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#mmProductCharacteristics
	 * LineItemDetails12.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#mmProductCharacteristics
	 * LineItemDetails14.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmProductCharacteristics
	 * TradeProduct2.mmProductCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct3#mmProductCharacteristics
	 * TradeProduct3.mmProductCharacteristics}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Characteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Characteristics of the product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Product, List<ProductCharacteristics>> mmCharacteristics = new MMBusinessAssociationEnd<Product, List<ProductCharacteristics>>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeProduct1.mmProductCharacteristics, LineItemDetails4.mmProductCharacteristics, LineItemDetails7.mmProductCharacteristics, LineItemDetails5.mmProductCharacteristics,
					LineItemDetails8.mmProductCharacteristics, LineItemDetails6.mmProductCharacteristics, LineItemDetails9.mmProductCharacteristics, LineItemDetails10.mmProductCharacteristics, LineItemDetails11.mmProductCharacteristics,
					LineItemDetails13.mmProductCharacteristics, LineItemDetails12.mmProductCharacteristics, LineItemDetails14.mmProductCharacteristics, TradeProduct2.mmProductCharacteristics, TradeProduct3.mmProductCharacteristics);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Characteristics";
			definition = "Characteristics of the product.";
			minOccurs = 0;
			opposite_lazy = () -> ProductCharacteristics.mmProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductCharacteristics.mmObject();
		}

		@Override
		public List<ProductCharacteristics> getValue(Product obj) {
			return obj.getCharacteristics();
		}

		@Override
		public void setValue(Product obj, List<ProductCharacteristics> value) {
			obj.setCharacteristics(value);
		}
	};
	protected Price netPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmNetPriceProduct
	 * Price.mmNetPriceProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmNetPrice
	 * LineItem10.mmNetPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmNetPrice
	 * LineItem16.mmNetPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice9Choice#mmMonetaryValue
	 * SecuritiesTransactionPrice9Choice.mmMonetaryValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice8Choice#mmMonetaryValue
	 * SecuritiesTransactionPrice8Choice.mmMonetaryValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem17#mmNetPrice
	 * LineItem17.mmNetPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net price of the goods and/or service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Product, Optional<Price>> mmNetPrice = new MMBusinessAssociationEnd<Product, Optional<Price>>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem10.mmNetPrice, LineItem16.mmNetPrice, SecuritiesTransactionPrice9Choice.mmMonetaryValue, SecuritiesTransactionPrice8Choice.mmMonetaryValue, LineItem17.mmNetPrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetPrice";
			definition = "Net price of the goods and/or service.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Price.mmNetPriceProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Price.mmObject();
		}

		@Override
		public Optional<Price> getValue(Product obj) {
			return obj.getNetPrice();
		}

		@Override
		public void setValue(Product obj, Optional<Price> value) {
			obj.setNetPrice(value.orElse(null));
		}
	};
	protected List<ProductQuantity> quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmProduct
	 * ProductQuantity.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmNetPriceQuantity
	 * LineItem10.mmNetPriceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmGrossPriceQuantity
	 * LineItem10.mmGrossPriceQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmGrossWeight
	 * LineItem10.mmGrossWeight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmQuantity
	 * LineItemDetails7.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmOrderedQuantity
	 * LineItemDetails5.mmOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#mmOrderedQuantity
	 * LineItemDetails8.mmOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#mmQuantity
	 * LineItemDetails6.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#mmQuantity
	 * LineItemDetails9.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmWeight
	 * CertifiedCharacteristics1Choice.mmWeight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmQuantity
	 * CertifiedCharacteristics1Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmQuantity
	 * LineItemDetails10.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#mmQuantity
	 * LineItemDetails11.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmWeight
	 * CertifiedCharacteristics2Choice.mmWeight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmQuantity
	 * CertifiedCharacteristics2Choice.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmQuantity
	 * LineItemDetails13.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#mmOrderedQuantity
	 * LineItemDetails12.mmOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#mmQuantity
	 * LineItemDetails14.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmNetPriceQuantity
	 * LineItem16.mmNetPriceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmGrossPriceQuantity
	 * LineItem16.mmGrossPriceQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmGrossWeight
	 * LineItem16.mmGrossWeight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem17#mmNetPriceQuantity
	 * LineItem17.mmNetPriceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem17#mmGrossPriceQuantity
	 * LineItem17.mmGrossPriceQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem17#mmGrossWeight
	 * LineItem17.mmGrossWeight}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the quantity of the product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Product, List<ProductQuantity>> mmQuantity = new MMBusinessAssociationEnd<Product, List<ProductQuantity>>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem10.mmNetPriceQuantity, LineItem10.mmGrossPriceQuantity, LineItem10.mmGrossWeight, LineItemDetails7.mmQuantity, LineItemDetails5.mmOrderedQuantity,
					LineItemDetails8.mmOrderedQuantity, LineItemDetails6.mmQuantity, LineItemDetails9.mmQuantity, CertifiedCharacteristics1Choice.mmWeight, CertifiedCharacteristics1Choice.mmQuantity, LineItemDetails10.mmQuantity,
					LineItemDetails11.mmQuantity, CertifiedCharacteristics2Choice.mmWeight, CertifiedCharacteristics2Choice.mmQuantity, LineItemDetails13.mmQuantity, LineItemDetails12.mmOrderedQuantity, LineItemDetails14.mmQuantity,
					LineItem16.mmNetPriceQuantity, LineItem16.mmGrossPriceQuantity, LineItem16.mmGrossWeight, LineItem17.mmNetPriceQuantity, LineItem17.mmGrossPriceQuantity, LineItem17.mmGrossWeight);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Specifies the quantity of the product.";
			minOccurs = 0;
			opposite_lazy = () -> ProductQuantity.mmProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}

		@Override
		public List<ProductQuantity> getValue(Product obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(Product obj, List<ProductQuantity> value) {
			obj.setQuantity(value);
		}
	};
	protected Price grossPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmGrossPriceProduct
	 * Price.mmGrossPriceProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmGrossPrice
	 * LineItem10.mmGrossPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmGrossPrice
	 * LineItem16.mmGrossPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem17#mmGrossPrice
	 * LineItem17.mmGrossPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Gross price of the goods and/or service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Product, Optional<Price>> mmGrossPrice = new MMBusinessAssociationEnd<Product, Optional<Price>>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem10.mmGrossPrice, LineItem16.mmGrossPrice, LineItem17.mmGrossPrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossPrice";
			definition = "Gross price of the goods and/or service.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Price.mmGrossPriceProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Price.mmObject();
		}

		@Override
		public Optional<Price> getValue(Product obj) {
			return obj.getGrossPrice();
		}

		@Override
		public void setValue(Product obj, Optional<Price> value) {
			obj.setGrossPrice(value.orElse(null));
		}
	};
	protected Max70Text quality;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmQuality
	 * CertifiedCharacteristics1Choice.mmQuality}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmQuality
	 * CertifiedCharacteristics2Choice.mmQuality}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quality of the product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Product, Max70Text> mmQuality = new MMBusinessAttribute<Product, Max70Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CertifiedCharacteristics1Choice.mmQuality, CertifiedCharacteristics2Choice.mmQuality);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quality";
			definition = "Quality of the product.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(Product obj) {
			return obj.getQuality();
		}

		@Override
		public void setValue(Product obj, Max70Text value) {
			obj.setQuality(value);
		}
	};
	protected ProductDelivery delivery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmProduct
	 * ProductDelivery.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivery process of a product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Product, ProductDelivery> mmDelivery = new MMBusinessAssociationEnd<Product, ProductDelivery>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Delivery";
			definition = "Delivery process of a product";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ProductDelivery.mmProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductDelivery.mmObject();
		}

		@Override
		public ProductDelivery getValue(Product obj) {
			return obj.getDelivery();
		}

		@Override
		public void setValue(Product obj, ProductDelivery value) {
			obj.setDelivery(value);
		}
	};
	protected List<PurchaseOrder> purchaseOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PurchaseOrder
	 * PurchaseOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmProduct
	 * PurchaseOrder.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the purchase order in which a specific product is ordered."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Product, List<PurchaseOrder>> mmPurchaseOrder = new MMBusinessAssociationEnd<Product, List<PurchaseOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PurchaseOrder";
			definition = "Specifies the purchase order in which a specific product is ordered.";
			minOccurs = 0;
			opposite_lazy = () -> PurchaseOrder.mmProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PurchaseOrder.mmObject();
		}

		@Override
		public List<PurchaseOrder> getValue(Product obj) {
			return obj.getPurchaseOrder();
		}

		@Override
		public void setValue(Product obj, List<PurchaseOrder> value) {
			obj.setPurchaseOrder(value);
		}
	};
	protected List<Tax> tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#mmProduct
	 * Tax.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement1#mmTax
	 * TradeSettlement1.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmSubTotalCalculatedTax
	 * TradeSettlement1.mmSubTotalCalculatedTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmTax
	 * LineItem10.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails4#mmTax
	 * LineItemDetails4.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#mmTax
	 * LineItem5.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails7#mmTax
	 * LineItemDetails7.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem7#mmTax
	 * LineItem7.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails6#mmTax
	 * LineItemDetails6.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem4#mmTax
	 * LineItem4.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails9#mmTax
	 * LineItemDetails9.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem9#mmTax
	 * LineItem9.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService1#mmTaxCalculation
	 * BillingService1.mmTaxCalculation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem11#mmTax
	 * LineItem11.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails10#mmTax
	 * LineItemDetails10.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem12#mmTax
	 * LineItem12.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails11#mmTax
	 * LineItemDetails11.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails13#mmTax
	 * LineItemDetails13.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmTax
	 * LineItem13.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem15#mmTax
	 * LineItem15.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails14#mmTax
	 * LineItemDetails14.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#mmTaxCalculation
	 * BillingService2.mmTaxCalculation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmTax
	 * LineItem16.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem17#mmTax
	 * LineItem17.mmTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Product
	 * Product}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money due to the government or tax authority, according to various pre-defined parameters linked to the value of the goods and services in a trade transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Product, List<Tax>> mmTax = new MMBusinessAssociationEnd<Product, List<Tax>>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeSettlement1.mmTax, TradeSettlement1.mmSubTotalCalculatedTax, LineItem10.mmTax, LineItemDetails4.mmTax, LineItem5.mmTax, LineItemDetails7.mmTax, LineItem7.mmTax, LineItemDetails6.mmTax,
					LineItem4.mmTax, LineItemDetails9.mmTax, LineItem9.mmTax, BillingService1.mmTaxCalculation, LineItem11.mmTax, LineItemDetails10.mmTax, LineItem12.mmTax, LineItemDetails11.mmTax, LineItemDetails13.mmTax,
					LineItem13.mmTax, LineItem15.mmTax, LineItemDetails14.mmTax, BillingService2.mmTaxCalculation, LineItem16.mmTax, LineItem17.mmTax);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters linked to the value of the goods and services in a trade transaction.";
			minOccurs = 0;
			opposite_lazy = () -> Tax.mmProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}

		@Override
		public List<Tax> getValue(Product obj) {
			return obj.getTax();
		}

		@Override
		public void setValue(Product obj, List<Tax> value) {
			obj.setTax(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Product";
				definition = "Item that is offered for sale. Products can be services or goods.";
				associationDomain_lazy = () -> Arrays.asList(Country.mmProducedProducts, Tax.mmProduct, CardPayment.mmProduct, Price.mmUnitPriceProduct, Price.mmNetPriceProduct, Price.mmGrossPriceProduct, ProductIdentification.mmProduct,
						ProductQuantity.mmProduct, ProductCategory.mmProduct, LineItem.mmInvoicedProduct, ProductDelivery.mmProduct, ProductCharacteristics.mmProduct, PurchaseOrder.mmProduct);
				subType_lazy = () -> Arrays.asList(Service.mmObject(), Goods.mmObject(), FinancialProduct.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.mmCardPayment, com.tools20022.repository.entity.Product.mmUnitPrice, com.tools20022.repository.entity.Product.mmProductCategory,
						com.tools20022.repository.entity.Product.mmLineItem, com.tools20022.repository.entity.Product.mmProductIdentification, com.tools20022.repository.entity.Product.mmName,
						com.tools20022.repository.entity.Product.mmDescription, com.tools20022.repository.entity.Product.mmOrigin, com.tools20022.repository.entity.Product.mmCharacteristics,
						com.tools20022.repository.entity.Product.mmNetPrice, com.tools20022.repository.entity.Product.mmQuantity, com.tools20022.repository.entity.Product.mmGrossPrice, com.tools20022.repository.entity.Product.mmQuality,
						com.tools20022.repository.entity.Product.mmDelivery, com.tools20022.repository.entity.Product.mmPurchaseOrder, com.tools20022.repository.entity.Product.mmTax);
				derivationComponent_lazy = () -> Arrays.asList(Product2.mmObject(), Product1.mmObject(), TradeProduct1.mmObject(), CertifiedCharacteristics1Choice.mmObject(), ServiceItemTotals1.mmObject(),
						CertifiedCharacteristics2Choice.mmObject(), Product3.mmObject(), Product4.mmObject(), Product5.mmObject(), TradeProduct2.mmObject(), TradeProduct3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Product.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CardPayment getCardPayment() {
		return cardPayment;
	}

	public Product setCardPayment(CardPayment cardPayment) {
		this.cardPayment = Objects.requireNonNull(cardPayment);
		return this;
	}

	public List<Price> getUnitPrice() {
		return unitPrice == null ? unitPrice = new ArrayList<>() : unitPrice;
	}

	public Product setUnitPrice(List<Price> unitPrice) {
		this.unitPrice = Objects.requireNonNull(unitPrice);
		return this;
	}

	public List<ProductCategory> getProductCategory() {
		return productCategory == null ? productCategory = new ArrayList<>() : productCategory;
	}

	public Product setProductCategory(List<ProductCategory> productCategory) {
		this.productCategory = Objects.requireNonNull(productCategory);
		return this;
	}

	public Optional<LineItem> getLineItem() {
		return lineItem == null ? Optional.empty() : Optional.of(lineItem);
	}

	public Product setLineItem(LineItem lineItem) {
		this.lineItem = lineItem;
		return this;
	}

	public List<ProductIdentification> getProductIdentification() {
		return productIdentification == null ? productIdentification = new ArrayList<>() : productIdentification;
	}

	public Product setProductIdentification(List<ProductIdentification> productIdentification) {
		this.productIdentification = Objects.requireNonNull(productIdentification);
		return this;
	}

	public Max35Text getName() {
		return name;
	}

	public Product setName(Max35Text name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public Max140Text getDescription() {
		return description;
	}

	public Product setDescription(Max140Text description) {
		this.description = Objects.requireNonNull(description);
		return this;
	}

	public Country getOrigin() {
		return origin;
	}

	public Product setOrigin(Country origin) {
		this.origin = Objects.requireNonNull(origin);
		return this;
	}

	public List<ProductCharacteristics> getCharacteristics() {
		return characteristics == null ? characteristics = new ArrayList<>() : characteristics;
	}

	public Product setCharacteristics(List<ProductCharacteristics> characteristics) {
		this.characteristics = Objects.requireNonNull(characteristics);
		return this;
	}

	public Optional<Price> getNetPrice() {
		return netPrice == null ? Optional.empty() : Optional.of(netPrice);
	}

	public Product setNetPrice(Price netPrice) {
		this.netPrice = netPrice;
		return this;
	}

	public List<ProductQuantity> getQuantity() {
		return quantity == null ? quantity = new ArrayList<>() : quantity;
	}

	public Product setQuantity(List<ProductQuantity> quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public Optional<Price> getGrossPrice() {
		return grossPrice == null ? Optional.empty() : Optional.of(grossPrice);
	}

	public Product setGrossPrice(Price grossPrice) {
		this.grossPrice = grossPrice;
		return this;
	}

	public Max70Text getQuality() {
		return quality;
	}

	public Product setQuality(Max70Text quality) {
		this.quality = Objects.requireNonNull(quality);
		return this;
	}

	public ProductDelivery getDelivery() {
		return delivery;
	}

	public Product setDelivery(ProductDelivery delivery) {
		this.delivery = Objects.requireNonNull(delivery);
		return this;
	}

	public List<PurchaseOrder> getPurchaseOrder() {
		return purchaseOrder == null ? purchaseOrder = new ArrayList<>() : purchaseOrder;
	}

	public Product setPurchaseOrder(List<PurchaseOrder> purchaseOrder) {
		this.purchaseOrder = Objects.requireNonNull(purchaseOrder);
		return this;
	}

	public List<Tax> getTax() {
		return tax == null ? tax = new ArrayList<>() : tax;
	}

	public Product setTax(List<Tax> tax) {
		this.tax = Objects.requireNonNull(tax);
		return this;
	}
}