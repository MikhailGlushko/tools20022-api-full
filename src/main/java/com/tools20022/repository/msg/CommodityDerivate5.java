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
import com.tools20022.repository.datatype.Max25Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Transparency calculation specific details for a freight commodity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CommodityDerivate5#mmSize
 * CommodityDerivate5.mmSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommodityDerivate5#mmAverageTimeCharter
 * CommodityDerivate5.mmAverageTimeCharter}</li>
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
 * "CommodityDerivate5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transparency calculation specific details for a freight commodity."</li>
 * </ul>
 */
public class CommodityDerivate5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max25Text size;
	/**
	 * Specification of the size related to the freight sub type. Field to be
	 * populated when the base product field is equal to freight.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max25Text
	 * Max25Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommodityDerivate5
	 * CommodityDerivate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Size"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specification of the size related to the freight sub type. Field to be populated when the base product field is equal to freight."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSize = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CommodityDerivate5.mmObject();
			isDerived = false;
			xmlTag = "Sz";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Size";
			definition = "Specification of the size related to the freight sub type. Field to be populated when the base product field is equal to freight.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max25Text.mmObject();
		}
	};
	protected Max25Text averageTimeCharter;
	/**
	 * Details the specific route or time charter average. Field to be populated
	 * when the base product field is equal to freight.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max25Text
	 * Max25Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommodityDerivate5
	 * CommodityDerivate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgTmChrtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageTimeCharter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details the specific route or time charter average. Field to be populated when the base product field is equal to freight."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAverageTimeCharter = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CommodityDerivate5.mmObject();
			isDerived = false;
			xmlTag = "AvrgTmChrtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageTimeCharter";
			definition = "Details the specific route or time charter average. Field to be populated when the base product field is equal to freight.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max25Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CommodityDerivate5.mmSize, com.tools20022.repository.msg.CommodityDerivate5.mmAverageTimeCharter);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CommodityDerivate5";
				definition = "Transparency calculation specific details for a freight commodity.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max25Text getSize() {
		return size;
	}

	public void setSize(Max25Text size) {
		this.size = size;
	}

	public Max25Text getAverageTimeCharter() {
		return averageTimeCharter;
	}

	public void setAverageTimeCharter(Max25Text averageTimeCharter) {
		this.averageTimeCharter = averageTimeCharter;
	}
}