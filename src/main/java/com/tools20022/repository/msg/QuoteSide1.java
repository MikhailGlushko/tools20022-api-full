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
import com.tools20022.repository.choice.FinancialInstrumentQuantityChoice;
import com.tools20022.repository.choice.PartyIdentification25Choice;
import com.tools20022.repository.entity.Quote;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Indicates whether the quote details are indicated as an offer, a bid or a mid
 * of a security, commodity, currency (the latter being an average of the offer
 * and the bid).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSide1#mmPrice
 * QuoteSide1.mmPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSide1#mmMarketPrice
 * QuoteSide1.mmMarketPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSide1#mmMinimumQuantity
 * QuoteSide1.mmMinimumQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSide1#mmQuantity
 * QuoteSide1.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSide1#mmMaximumQuantity
 * QuoteSide1.mmMaximumQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteSide1#mmSourceOfQuote
 * QuoteSide1.mmSourceOfQuote}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuoteSide1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates whether the quote details are indicated as an offer, a bid or a mid of a security, commodity, currency (the latter being an average of the offer and the bid)."
 * </li>
 * </ul>
 */
public class QuoteSide1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Price1 price;
	/**
	 * Indicates the price of the instrument, applicable to the quote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmPrice Quote.mmPrice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.QuoteSide1
	 * QuoteSide1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the price of the instrument, applicable to the quote."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Quote.mmPrice;
			componentContext_lazy = () -> QuoteSide1.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Indicates the price of the instrument, applicable to the quote.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.Price1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Price1> marketPrice;
	/**
	 * Used by markets to indicate the current best bid and offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmMarketPrice
	 * Quote.mmMarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.QuoteSide1
	 * QuoteSide1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used by markets to indicate the current best bid and offer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMarketPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Quote.mmMarketPrice;
			componentContext_lazy = () -> QuoteSide1.mmObject();
			isDerived = false;
			xmlTag = "MktPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPrice";
			definition = "Used by markets to indicate the current best bid and offer.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price1.mmObject();
		}
	};
	protected List<FinancialInstrumentQuantityChoice> minimumQuantity;
	/**
	 * Specifies the minimal quantity of the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmMinimumQuantity
	 * Quote.mmMinimumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.QuoteSide1
	 * QuoteSide1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the minimal quantity of the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Quote.mmMinimumQuantity;
			componentContext_lazy = () -> QuoteSide1.mmObject();
			isDerived = false;
			xmlTag = "MinQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumQuantity";
			definition = "Specifies the minimal quantity of the financial instrument.";
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	protected FinancialInstrumentQuantityChoice quantity;
	/**
	 * Quantity of a Financial Instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmQuantity
	 * Quote.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.QuoteSide1
	 * QuoteSide1}</li>
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
	 * definition} = "Quantity of a Financial Instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Quote.mmQuantity;
			componentContext_lazy = () -> QuoteSide1.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Quantity of a Financial Instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	protected FinancialInstrumentQuantityChoice maximumQuantity;
	/**
	 * Specifies the maximum quantity of the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmMaximumQuantity
	 * Quote.mmMaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.QuoteSide1
	 * QuoteSide1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the maximum quantity of the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Quote.mmMaximumQuantity;
			componentContext_lazy = () -> QuoteSide1.mmObject();
			isDerived = false;
			xmlTag = "MaxQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumQuantity";
			definition = "Specifies the maximum quantity of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	protected PartyIdentification25Choice sourceOfQuote;
	/**
	 * Source of the quote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification25Choice
	 * PartyIdentification25Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.QuoteSide1
	 * QuoteSide1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrcOfQt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceOfQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Source of the quote."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSourceOfQuote = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> QuoteSide1.mmObject();
			isDerived = false;
			xmlTag = "SrcOfQt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceOfQuote";
			definition = "Source of the quote.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification25Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuoteSide1.mmPrice, com.tools20022.repository.msg.QuoteSide1.mmMarketPrice, com.tools20022.repository.msg.QuoteSide1.mmMinimumQuantity,
						com.tools20022.repository.msg.QuoteSide1.mmQuantity, com.tools20022.repository.msg.QuoteSide1.mmMaximumQuantity, com.tools20022.repository.msg.QuoteSide1.mmSourceOfQuote);
				trace_lazy = () -> Quote.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "QuoteSide1";
				definition = "Indicates whether the quote details are indicated as an offer, a bid or a mid of a security, commodity, currency (the latter being an average of the offer and the bid).";
			}
		});
		return mmObject_lazy.get();
	}

	public Price1 getPrice() {
		return price;
	}

	public void setPrice(com.tools20022.repository.msg.Price1 price) {
		this.price = price;
	}

	public List<Price1> getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(List<com.tools20022.repository.msg.Price1> marketPrice) {
		this.marketPrice = marketPrice;
	}

	public List<FinancialInstrumentQuantityChoice> getMinimumQuantity() {
		return minimumQuantity;
	}

	public void setMinimumQuantity(List<FinancialInstrumentQuantityChoice> minimumQuantity) {
		this.minimumQuantity = minimumQuantity;
	}

	public FinancialInstrumentQuantityChoice getQuantity() {
		return quantity;
	}

	public void setQuantity(FinancialInstrumentQuantityChoice quantity) {
		this.quantity = quantity;
	}

	public FinancialInstrumentQuantityChoice getMaximumQuantity() {
		return maximumQuantity;
	}

	public void setMaximumQuantity(FinancialInstrumentQuantityChoice maximumQuantity) {
		this.maximumQuantity = maximumQuantity;
	}

	public PartyIdentification25Choice getSourceOfQuote() {
		return sourceOfQuote;
	}

	public void setSourceOfQuote(PartyIdentification25Choice sourceOfQuote) {
		this.sourceOfQuote = sourceOfQuote;
	}
}