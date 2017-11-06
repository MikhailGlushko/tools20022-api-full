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
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.ProductCategory1Choice;
import com.tools20022.repository.codeset.ProductCategoryCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.ProductCategory1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the category of the product.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ProductCategory" src="doc-files/ProductCategory.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ProductCategory#mmProduct
 * ProductCategory.mmProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductCategory#mmType
 * ProductCategory.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductCategory#mmCategory
 * ProductCategory.mmCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductCategory#mmRelatedCardPaymentValidation
 * ProductCategory.mmRelatedCardPaymentValidation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmProductCategory
 * Product.mmProductCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmDeclinedProductCode
 * CardPaymentValidation.mmDeclinedProductCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProductCategory1Choice#mmStructuredProductCategory
 * ProductCategory1Choice.mmStructuredProductCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProductCategory1Choice#mmOtherProductCategory
 * ProductCategory1Choice.mmOtherProductCategory}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProductCategory1
 * ProductCategory1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProductCategory1Choice
 * ProductCategory1Choice}</li>
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
 * "ProductCategory"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the category of the product."</li>
 * </ul>
 */
public class ProductCategory {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Product product;
	/**
	 * Specifies the product for which a category is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmProductCategory
	 * Product.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductCategory
	 * ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the product for which a category is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProduct = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductCategory.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Specifies the product for which a category is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.mmProductCategory;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	protected ProductCategoryCode type;
	/**
	 * Specifies the type of product category by means of a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProductCategoryCode
	 * ProductCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductCategory
	 * ProductCategory}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ProductCategory1#mmType
	 * ProductCategory1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceItemTotals1#mmItemType
	 * ServiceItemTotals1.mmItemType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of product category by means of a code."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProductCategory1.mmType, com.tools20022.repository.msg.ServiceItemTotals1.mmItemType);
			elementContext_lazy = () -> ProductCategory.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of product category by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProductCategoryCode.mmObject();
		}
	};
	protected Max35Text category;
	/**
	 * Specifies the category of a product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductCategory
	 * ProductCategory}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProductCategory1#mmCategory
	 * ProductCategory1.mmCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Category"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the category of a product."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCategory = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProductCategory1.mmCategory);
			elementContext_lazy = () -> ProductCategory.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Category";
			definition = "Specifies the category of a product.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CardPaymentValidation relatedCardPaymentValidation;
	/**
	 * Validation process which declined a product code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmDeclinedProductCode
	 * CardPaymentValidation.mmDeclinedProductCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductCategory
	 * ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCardPaymentValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Validation process which declined a product code."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCardPaymentValidation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductCategory.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPaymentValidation";
			definition = "Validation process which declined a product code.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmDeclinedProductCode;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProductCategory";
				definition = "Specifies the category of the product.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.mmProductCategory, com.tools20022.repository.entity.CardPaymentValidation.mmDeclinedProductCode);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ProductCategory1Choice.mmStructuredProductCategory, com.tools20022.repository.choice.ProductCategory1Choice.mmOtherProductCategory);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProductCategory.mmProduct, com.tools20022.repository.entity.ProductCategory.mmType, com.tools20022.repository.entity.ProductCategory.mmCategory,
						com.tools20022.repository.entity.ProductCategory.mmRelatedCardPaymentValidation);
				derivationComponent_lazy = () -> Arrays.asList(ProductCategory1.mmObject(), ProductCategory1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(com.tools20022.repository.entity.Product product) {
		this.product = product;
	}

	public ProductCategoryCode getType() {
		return type;
	}

	public void setType(ProductCategoryCode type) {
		this.type = type;
	}

	public Max35Text getCategory() {
		return category;
	}

	public void setCategory(Max35Text category) {
		this.category = category;
	}

	public CardPaymentValidation getRelatedCardPaymentValidation() {
		return relatedCardPaymentValidation;
	}

	public void setRelatedCardPaymentValidation(com.tools20022.repository.entity.CardPaymentValidation relatedCardPaymentValidation) {
		this.relatedCardPaymentValidation = relatedCardPaymentValidation;
	}
}