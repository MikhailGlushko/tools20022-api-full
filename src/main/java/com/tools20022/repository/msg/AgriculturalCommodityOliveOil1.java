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
import com.tools20022.repository.codeset.AssetClassDetailedSubProductType4Code;
import com.tools20022.repository.codeset.AssetClassProductType1Code;
import com.tools20022.repository.codeset.AssetClassSubProductType3Code;
import com.tools20022.repository.entity.Commodity;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines commodity sub-product attributes of an agricultural derivative of
 * type olive oil.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityOliveOil1#mmBaseProduct
 * AgriculturalCommodityOliveOil1.mmBaseProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityOliveOil1#mmSubProduct
 * AgriculturalCommodityOliveOil1.mmSubProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityOliveOil1#mmAdditionalSubProduct
 * AgriculturalCommodityOliveOil1.mmAdditionalSubProduct}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Commodity Commodity}</li>
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
 * "AgriculturalCommodityOliveOil1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity sub-product attributes of an agricultural derivative of type olive oil."
 * </li>
 * </ul>
 */
public class AgriculturalCommodityOliveOil1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AssetClassProductType1Code baseProduct;
	/**
	 * Base product for the underlying asset class as specified in the
	 * classification of commodities derivatives table.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductType1Code
	 * AssetClassProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityOliveOil1
	 * AgriculturalCommodityOliveOil1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BasePdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Base product for the underlying asset class as specified in the classification of commodities derivatives table."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBaseProduct = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.mmBaseProduct;
			componentContext_lazy = () -> AgriculturalCommodityOliveOil1.mmObject();
			isDerived = false;
			xmlTag = "BasePdct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseProduct";
			definition = "Base product for the underlying asset class as specified in the classification of commodities derivatives table.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssetClassProductType1Code.mmObject();
		}
	};
	protected AssetClassSubProductType3Code subProduct;
	/**
	 * Sub-product for the underlying asset class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType3Code
	 * AssetClassSubProductType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityOliveOil1
	 * AgriculturalCommodityOliveOil1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sub-product for the underlying asset class."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubProduct = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.mmSubProduct;
			componentContext_lazy = () -> AgriculturalCommodityOliveOil1.mmObject();
			isDerived = false;
			xmlTag = "SubPdct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubProduct";
			definition = "Sub-product for the underlying asset class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssetClassSubProductType3Code.mmObject();
		}
	};
	protected AssetClassDetailedSubProductType4Code additionalSubProduct;
	/**
	 * Further subproduct type related to instruments that have a non-financial
	 * instrument or commodity as underlying.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType4Code
	 * AssetClassDetailedSubProductType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AgriculturalCommodityOliveOil1
	 * AgriculturalCommodityOliveOil1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlSubPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalSubProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further subproduct type related to instruments that have a non-financial instrument or commodity as underlying."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalSubProduct = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AgriculturalCommodityOliveOil1.mmObject();
			isDerived = false;
			xmlTag = "AddtlSubPdct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalSubProduct";
			definition = "Further subproduct type related to instruments that have a non-financial instrument or commodity as underlying.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AssetClassDetailedSubProductType4Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AgriculturalCommodityOliveOil1.mmBaseProduct, com.tools20022.repository.msg.AgriculturalCommodityOliveOil1.mmSubProduct,
						com.tools20022.repository.msg.AgriculturalCommodityOliveOil1.mmAdditionalSubProduct);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AgriculturalCommodityOliveOil1";
				definition = "Defines commodity sub-product attributes of an agricultural derivative of type olive oil.";
			}
		});
		return mmObject_lazy.get();
	}

	public AssetClassProductType1Code getBaseProduct() {
		return baseProduct;
	}

	public void setBaseProduct(AssetClassProductType1Code baseProduct) {
		this.baseProduct = baseProduct;
	}

	public AssetClassSubProductType3Code getSubProduct() {
		return subProduct;
	}

	public void setSubProduct(AssetClassSubProductType3Code subProduct) {
		this.subProduct = subProduct;
	}

	public AssetClassDetailedSubProductType4Code getAdditionalSubProduct() {
		return additionalSubProduct;
	}

	public void setAdditionalSubProduct(AssetClassDetailedSubProductType4Code additionalSubProduct) {
		this.additionalSubProduct = additionalSubProduct;
	}
}