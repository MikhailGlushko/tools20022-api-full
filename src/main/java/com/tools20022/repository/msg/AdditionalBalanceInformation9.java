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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.SubBalanceQuantity3Choice;
import com.tools20022.repository.choice.SubBalanceType6Choice;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Subbalances providing additional information on a specific position but that
 * is not to be accounted for in the building of the aggregate balance, for
 * example, registered.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation9#mmSubBalanceType
 * AdditionalBalanceInformation9.mmSubBalanceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation9#mmQuantity
 * AdditionalBalanceInformation9.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation9#mmSubBalanceAdditionalDetails
 * AdditionalBalanceInformation9.mmSubBalanceAdditionalDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation9#mmQuantityBreakdown
 * AdditionalBalanceInformation9.mmQuantityBreakdown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalBalanceInformation9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Subbalances providing additional information on a specific position but that is not to be accounted for in the building of the aggregate balance, for example, registered."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation11
 * AdditionalBalanceInformation11}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation5
 * AdditionalBalanceInformation5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AdditionalBalanceInformation9", propOrder = {"subBalanceType", "quantity", "subBalanceAdditionalDetails", "quantityBreakdown"})
public class AdditionalBalanceInformation9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SubBalanceType6Choice subBalanceType;
	/**
	 * Reason for the sub-balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType6Choice
	 * SubBalanceType6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesBalanceType
	 * SecuritiesBalance.mmSecuritiesBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation9
	 * AdditionalBalanceInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubBalTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the sub-balance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubBalanceType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesBalanceType;
			componentContext_lazy = () -> AdditionalBalanceInformation9.mmObject();
			isDerived = false;
			xmlTag = "SubBalTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceType";
			definition = "Reason for the sub-balance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SubBalanceType6Choice.mmObject();
		}
	};
	protected SubBalanceQuantity3Choice quantity;
	/**
	 * Quantity of securities in the sub-balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity3Choice
	 * SubBalanceQuantity3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSubBalanceQuantity
	 * SecuritiesBalance.mmSubBalanceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation9
	 * AdditionalBalanceInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSubBalanceQuantity;
			componentContext_lazy = () -> AdditionalBalanceInformation9.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Quantity of securities in the sub-balance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SubBalanceQuantity3Choice.mmObject();
		}
	};
	protected Max140Text subBalanceAdditionalDetails;
	/**
	 * Provides additional subbalance information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation9
	 * AdditionalBalanceInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubBalAddtlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional subbalance information."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubBalanceAdditionalDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AdditionalBalanceInformation9.mmObject();
			isDerived = false;
			xmlTag = "SubBalAddtlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetails";
			definition = "Provides additional subbalance information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QuantityBreakdown13> quantityBreakdown;
	/**
	 * Breakdown of the aggregate quantity reported into significant lots, for
	 * example, tax lots.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuantityBreakdown13
	 * QuantityBreakdown13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLotBreakdown
	 * SecuritiesQuantity.mmLotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation9
	 * AdditionalBalanceInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyBrkdwn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of the aggregate quantity reported into significant lots, for example, tax lots."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuantityBreakdown = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmLotBreakdown;
			componentContext_lazy = () -> AdditionalBalanceInformation9.mmObject();
			isDerived = false;
			xmlTag = "QtyBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityBreakdown";
			definition = "Breakdown of the aggregate quantity reported into significant lots, for example, tax lots.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QuantityBreakdown13.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AdditionalBalanceInformation9.mmSubBalanceType, AdditionalBalanceInformation9.mmQuantity, AdditionalBalanceInformation9.mmSubBalanceAdditionalDetails,
						AdditionalBalanceInformation9.mmQuantityBreakdown);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "AdditionalBalanceInformation9";
				definition = "Subbalances providing additional information on a specific position but that is not to be accounted for in the building of the aggregate balance, for example, registered.";
				nextVersions_lazy = () -> Arrays.asList(AdditionalBalanceInformation11.mmObject());
				previousVersion_lazy = () -> AdditionalBalanceInformation5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SubBalTp", required = true)
	public SubBalanceType6Choice getSubBalanceType() {
		return subBalanceType;
	}

	public void setSubBalanceType(SubBalanceType6Choice subBalanceType) {
		this.subBalanceType = subBalanceType;
	}

	@XmlElement(name = "Qty", required = true)
	public SubBalanceQuantity3Choice getQuantity() {
		return quantity;
	}

	public void setQuantity(SubBalanceQuantity3Choice quantity) {
		this.quantity = quantity;
	}

	@XmlElement(name = "SubBalAddtlDtls")
	public Max140Text getSubBalanceAdditionalDetails() {
		return subBalanceAdditionalDetails;
	}

	public void setSubBalanceAdditionalDetails(Max140Text subBalanceAdditionalDetails) {
		this.subBalanceAdditionalDetails = subBalanceAdditionalDetails;
	}

	@XmlElement(name = "QtyBrkdwn")
	public List<QuantityBreakdown13> getQuantityBreakdown() {
		return quantityBreakdown;
	}

	public void setQuantityBreakdown(List<com.tools20022.repository.msg.QuantityBreakdown13> quantityBreakdown) {
		this.quantityBreakdown = quantityBreakdown;
	}
}