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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV04;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.CardPaymentValidation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardPaymentEnvironment33;
import com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse4;
import com.tools20022.repository.msg.TMSTrigger1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Cancellation advice response from the acquirer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4#mmEnvironment
 * AcceptorCancellationAdviceResponse4.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4#mmTransaction
 * AcceptorCancellationAdviceResponse4.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4#mmTMSTrigger
 * AcceptorCancellationAdviceResponse4.mmTMSTrigger}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV04#mmCancellationAdviceResponse
 * AcceptorCancellationAdviceResponseV04.mmCancellationAdviceResponse}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorCancellationAdviceResponse4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Cancellation advice response from the acquirer."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse5
 * AcceptorCancellationAdviceResponse5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse3
 * AcceptorCancellationAdviceResponse3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorCancellationAdviceResponse4", propOrder = {"environment", "transaction", "tMSTrigger"})
public class AcceptorCancellationAdviceResponse4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected CardPaymentEnvironment33 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment33
	 * CardPaymentEnvironment33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4
	 * AcceptorCancellationAdviceResponse4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Environment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Environment of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse5#mmEnvironment
	 * AcceptorCancellationAdviceResponse5.mmEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse3#mmEnvironment
	 * AcceptorCancellationAdviceResponse3.mmEnvironment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorCancellationAdviceResponse4, CardPaymentEnvironment33> mmEnvironment = new MMMessageAssociationEnd<AcceptorCancellationAdviceResponse4, CardPaymentEnvironment33>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCancellationAdviceResponse5.mmEnvironment);
			previousVersion_lazy = () -> AcceptorCancellationAdviceResponse3.mmEnvironment;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentEnvironment33.mmObject();
		}

		@Override
		public CardPaymentEnvironment33 getValue(AcceptorCancellationAdviceResponse4 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(AcceptorCancellationAdviceResponse4 obj, CardPaymentEnvironment33 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected CardPaymentTransactionAdviceResponse4 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse4
	 * CardPaymentTransactionAdviceResponse4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmResponse
	 * CardPaymentValidation.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4
	 * AcceptorCancellationAdviceResponse4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation transaction from an acceptor to the acquirer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse5#mmTransaction
	 * AcceptorCancellationAdviceResponse5.mmTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse3#mmTransaction
	 * AcceptorCancellationAdviceResponse3.mmTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorCancellationAdviceResponse4, CardPaymentTransactionAdviceResponse4> mmTransaction = new MMMessageAssociationEnd<AcceptorCancellationAdviceResponse4, CardPaymentTransactionAdviceResponse4>() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmResponse;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Cancellation transaction from an acceptor to the acquirer.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCancellationAdviceResponse5.mmTransaction);
			previousVersion_lazy = () -> AcceptorCancellationAdviceResponse3.mmTransaction;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentTransactionAdviceResponse4.mmObject();
		}

		@Override
		public CardPaymentTransactionAdviceResponse4 getValue(AcceptorCancellationAdviceResponse4 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(AcceptorCancellationAdviceResponse4 obj, CardPaymentTransactionAdviceResponse4 value) {
			obj.setTransaction(value);
		}
	};
	@XmlElement(name = "TMSTrggr")
	protected TMSTrigger1 tMSTrigger;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TMSTrigger1
	 * TMSTrigger1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTMSTrigger
	 * CardPaymentAcquiring.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4
	 * AcceptorCancellationAdviceResponse4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMSTrggr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSTrigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instructions for contacting the terminal management host."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse5#mmTMSTrigger
	 * AcceptorCancellationAdviceResponse5.mmTMSTrigger}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse3#mmTMSTrigger
	 * AcceptorCancellationAdviceResponse3.mmTMSTrigger}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorCancellationAdviceResponse4, Optional<TMSTrigger1>> mmTMSTrigger = new MMMessageAssociationEnd<AcceptorCancellationAdviceResponse4, Optional<TMSTrigger1>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTMSTrigger;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4.mmObject();
			isDerived = false;
			xmlTag = "TMSTrggr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSTrigger";
			definition = "Instructions for contacting the terminal management host.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCancellationAdviceResponse5.mmTMSTrigger);
			previousVersion_lazy = () -> AcceptorCancellationAdviceResponse3.mmTMSTrigger;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TMSTrigger1.mmObject();
		}

		@Override
		public Optional<TMSTrigger1> getValue(AcceptorCancellationAdviceResponse4 obj) {
			return obj.getTMSTrigger();
		}

		@Override
		public void setValue(AcceptorCancellationAdviceResponse4 obj, Optional<TMSTrigger1> value) {
			obj.setTMSTrigger(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4.mmEnvironment, com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4.mmTransaction,
						com.tools20022.repository.msg.AcceptorCancellationAdviceResponse4.mmTMSTrigger);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorCancellationAdviceResponseV04.mmCancellationAdviceResponse);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorCancellationAdviceResponse4";
				definition = "Cancellation advice response from the acquirer.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorCancellationAdviceResponse5.mmObject());
				previousVersion_lazy = () -> AcceptorCancellationAdviceResponse3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CardPaymentEnvironment33 getEnvironment() {
		return environment;
	}

	public AcceptorCancellationAdviceResponse4 setEnvironment(CardPaymentEnvironment33 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public CardPaymentTransactionAdviceResponse4 getTransaction() {
		return transaction;
	}

	public AcceptorCancellationAdviceResponse4 setTransaction(CardPaymentTransactionAdviceResponse4 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}

	public Optional<TMSTrigger1> getTMSTrigger() {
		return tMSTrigger == null ? Optional.empty() : Optional.of(tMSTrigger);
	}

	public AcceptorCancellationAdviceResponse4 setTMSTrigger(TMSTrigger1 tMSTrigger) {
		this.tMSTrigger = tMSTrigger;
		return this;
	}
}