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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Context in which the transaction is performed (payment and sale).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext10#mmPaymentContext
 * CardPaymentContext10.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext10#mmSaleContext
 * CardPaymentContext10.mmSaleContext}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
 * CardPaymentAcquiring}</li>
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
 * "CardPaymentContext10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Context in which the transaction is performed (payment and sale)."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentContext16
 * CardPaymentContext16}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentContext1
 * CardPaymentContext1}</li>
 * </ul>
 */
public class CardPaymentContext10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentContext10 paymentContext;
	/**
	 * Context of the card payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentContext10
	 * PaymentContext10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentContext10
	 * CardPaymentContext10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtCntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Context of the card payment transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentContext16#mmPaymentContext
	 * CardPaymentContext16.mmPaymentContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentContext1#mmPaymentContext
	 * CardPaymentContext1.mmPaymentContext}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentContext = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPaymentAcquiring.mmObject();
			componentContext_lazy = () -> CardPaymentContext10.mmObject();
			isDerived = false;
			xmlTag = "PmtCntxt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentContext";
			definition = "Context of the card payment transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentContext16.mmPaymentContext);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentContext1.mmPaymentContext;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentContext10.mmObject();
		}
	};
	protected SaleContext1 saleContext;
	/**
	 * Context of the sale involving the card payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SaleContext1
	 * SaleContext1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentContext10
	 * CardPaymentContext10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaleCntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Context of the sale involving the card payment transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentContext16#mmSaleContext
	 * CardPaymentContext16.mmSaleContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentContext1#mmSaleContext
	 * CardPaymentContext1.mmSaleContext}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSaleContext = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPaymentAcquiring.mmObject();
			componentContext_lazy = () -> CardPaymentContext10.mmObject();
			isDerived = false;
			xmlTag = "SaleCntxt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleContext";
			definition = "Context of the sale involving the card payment transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentContext16.mmSaleContext);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentContext1.mmSaleContext;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SaleContext1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentContext10.mmPaymentContext, com.tools20022.repository.msg.CardPaymentContext10.mmSaleContext);
				trace_lazy = () -> CardPaymentAcquiring.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPaymentContext10";
				definition = "Context in which the transaction is performed (payment and sale).";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentContext16.mmObject());
				previousVersion_lazy = () -> CardPaymentContext1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentContext10 getPaymentContext() {
		return paymentContext;
	}

	public void setPaymentContext(com.tools20022.repository.msg.PaymentContext10 paymentContext) {
		this.paymentContext = paymentContext;
	}

	public SaleContext1 getSaleContext() {
		return saleContext;
	}

	public void setSaleContext(com.tools20022.repository.msg.SaleContext1 saleContext) {
		this.saleContext = saleContext;
	}
}