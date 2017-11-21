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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Order;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Document issued by a buyer and containing the details of a purchase,
 * including description of goods, transport information, payment terms, etc.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PurchaseOrder" src="doc-files/PurchaseOrder.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PurchaseOrder#mmTotalAmount
 * PurchaseOrder.mmTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmResultingCommercialTrade
 * PurchaseOrder.mmResultingCommercialTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PurchaseOrder#mmProduct
 * PurchaseOrder.mmProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmIdentification
 * PurchaseOrder.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Order Order}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ReportLine3 ReportLine3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportLine2 ReportLine2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportLine4 ReportLine4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportLine1 ReportLine1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportLine7 ReportLine7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportLine6 ReportLine6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportLine5 ReportLine5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedPurchaseOrder
 * GenericIdentification.mmRelatedPurchaseOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmPurchaseOrder
 * Product.mmPurchaseOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPurchaseOrder
 * CommercialTrade.mmPurchaseOrder}</li>
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
 * "PurchaseOrder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Document issued by a buyer and containing the details of a purchase, including description of goods, transport information, payment terms, etc."
 * </li>
 * </ul>
 */
public class PurchaseOrder extends Order {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount totalAmount;
	/**
	 * Line items total amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmOrderedAmount
	 * LineItemDetails5.mmOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem6#mmOrderedLineItemsTotalAmount
	 * LineItem6.mmOrderedLineItemsTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#mmOrderedAmount
	 * LineItemDetails8.mmOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem8#mmOrderedLineItemsTotalAmount
	 * LineItem8.mmOrderedLineItemsTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportLine1#mmPurchaseOrderTotalNetAmount
	 * ReportLine1.mmPurchaseOrderTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem14#mmOrderedLineItemsTotalAmount
	 * LineItem14.mmOrderedLineItemsTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#mmOrderedAmount
	 * LineItemDetails12.mmOrderedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder PurchaseOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line items total amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(LineItemDetails5.mmOrderedAmount, LineItem6.mmOrderedLineItemsTotalAmount, LineItemDetails8.mmOrderedAmount, LineItem8.mmOrderedLineItemsTotalAmount,
					ReportLine1.mmPurchaseOrderTotalNetAmount, LineItem14.mmOrderedLineItemsTotalAmount, LineItemDetails12.mmOrderedAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalAmount";
			definition = "Line items total amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PurchaseOrder.class.getMethod("getTotalAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CommercialTrade> resultingCommercialTrade;
	/**
	 * Execution of the purchase order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPurchaseOrder
	 * CommercialTrade.mmPurchaseOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder PurchaseOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultingCommercialTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Execution of the purchase order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmResultingCommercialTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResultingCommercialTrade";
			definition = "Execution of the purchase order.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmPurchaseOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Product> product;
	/**
	 * Specifies the items which are sold by the seller to the buyer in a
	 * commercial trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmPurchaseOrder
	 * Product.mmPurchaseOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder PurchaseOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the items which are sold by the seller to the buyer in a commercial trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProduct = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Specifies the items which are sold by the seller to the buyer in a commercial trade.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.mmPurchaseOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	protected GenericIdentification identification;
	/**
	 * Identification of the purchase order that can be used for reconciliation
	 * or to link tasks relating to the commercial trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedPurchaseOrder
	 * GenericIdentification.mmRelatedPurchaseOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline2#mmPurchaseOrderReference
	 * Baseline2.mmPurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline3#mmPurchaseOrderReference
	 * Baseline3.mmPurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem4#mmPurchaseOrderReference
	 * LineItem4.mmPurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportedGoods1#mmPurchaseOrderReference
	 * TransportedGoods1.mmPurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem9#mmPurchaseOrderReference
	 * LineItem9.mmPurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportLine3#mmPurchaseOrderReference
	 * ReportLine3.mmPurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportLine2#mmPurchaseOrderReference
	 * ReportLine2.mmPurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportLine1#mmPurchaseOrderReference
	 * ReportLine1.mmPurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmPurchaseOrderReference
	 * Baseline4.mmPurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportLine7#mmPurchaseOrderReference
	 * ReportLine7.mmPurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem12#mmPurchaseOrderReference
	 * LineItem12.mmPurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportLine5#mmPurchaseOrderReference
	 * ReportLine5.mmPurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline5#mmPurchaseOrderReference
	 * Baseline5.mmPurchaseOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem15#mmPurchaseOrderReference
	 * LineItem15.mmPurchaseOrderReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder PurchaseOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the purchase order that can be used for reconciliation or to link tasks relating to the commercial trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Baseline2.mmPurchaseOrderReference, Baseline3.mmPurchaseOrderReference, LineItem4.mmPurchaseOrderReference, TransportedGoods1.mmPurchaseOrderReference, LineItem9.mmPurchaseOrderReference,
					ReportLine3.mmPurchaseOrderReference, ReportLine2.mmPurchaseOrderReference, ReportLine1.mmPurchaseOrderReference, Baseline4.mmPurchaseOrderReference, ReportLine7.mmPurchaseOrderReference,
					LineItem12.mmPurchaseOrderReference, ReportLine5.mmPurchaseOrderReference, Baseline5.mmPurchaseOrderReference, LineItem15.mmPurchaseOrderReference);
			elementContext_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the purchase order that can be used for reconciliation or to link tasks relating to the commercial trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmRelatedPurchaseOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PurchaseOrder";
				definition = "Document issued by a buyer and containing the details of a purchase, including description of goods, transport information, payment terms, etc.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmRelatedPurchaseOrder, com.tools20022.repository.entity.Product.mmPurchaseOrder,
						com.tools20022.repository.entity.CommercialTrade.mmPurchaseOrder);
				superType_lazy = () -> Order.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PurchaseOrder.mmTotalAmount, com.tools20022.repository.entity.PurchaseOrder.mmResultingCommercialTrade,
						com.tools20022.repository.entity.PurchaseOrder.mmProduct, com.tools20022.repository.entity.PurchaseOrder.mmIdentification);
				derivationComponent_lazy = () -> Arrays.asList(ReportLine3.mmObject(), ReportLine2.mmObject(), ReportLine4.mmObject(), ReportLine1.mmObject(), ReportLine7.mmObject(), ReportLine6.mmObject(), ReportLine5.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PurchaseOrder.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(CurrencyAndAmount totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<CommercialTrade> getResultingCommercialTrade() {
		return resultingCommercialTrade;
	}

	public void setResultingCommercialTrade(List<com.tools20022.repository.entity.CommercialTrade> resultingCommercialTrade) {
		this.resultingCommercialTrade = resultingCommercialTrade;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<com.tools20022.repository.entity.Product> product) {
		this.product = product;
	}

	public GenericIdentification getIdentification() {
		return identification;
	}

	public void setIdentification(com.tools20022.repository.entity.GenericIdentification identification) {
		this.identification = identification;
	}
}