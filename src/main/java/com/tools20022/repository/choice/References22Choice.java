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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SecuritiesTradeIdentification;
import com.tools20022.repository.msg.GenericDocumentIdentification1;
import com.tools20022.repository.msg.SettlementTypeAndIdentification13;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Choice of reference.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References22Choice#mmOtherTransactionIdentification
 * References22Choice.mmOtherTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References22Choice#mmSecuritiesFinancingTransactionIdentification
 * References22Choice.mmSecuritiesFinancingTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References22Choice#mmSecuritiesSettlementTransactionIdentification
 * References22Choice.mmSecuritiesSettlementTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References22Choice#mmIntraPositionMovementIdentification
 * References22Choice.mmIntraPositionMovementIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
 * SecuritiesTradeIdentification}</li>
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
 * "References22Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of reference."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.References44Choice
 * References44Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class References22Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericDocumentIdentification1 otherTransactionIdentification;
	/**
	 * Reference to a transaction that cannot be identified using a standard
	 * reference element present in the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericDocumentIdentification1
	 * GenericDocumentIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References22Choice
	 * References22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a transaction that cannot be identified using a standard reference element present in the message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References44Choice#mmOtherTransactionIdentification
	 * References44Choice.mmOtherTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherTransactionIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmIdentification;
			componentContext_lazy = () -> References22Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrTxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherTransactionIdentification";
			definition = "Reference to a transaction that cannot be identified using a standard reference element present in the message.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.References44Choice.mmOtherTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericDocumentIdentification1.mmObject();
		}
	};
	protected SettlementTypeAndIdentification13 securitiesFinancingTransactionIdentification;
	/**
	 * Unambiguous identification of the underlying securities financing
	 * transaction (not the underlying securities financing trade) as assigned
	 * by the instructing party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification13
	 * SettlementTypeAndIdentification13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References22Choice
	 * References22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the underlying securities financing transaction (not the underlying securities financing trade) as assigned by the instructing party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References44Choice#mmSecuritiesFinancingTransactionIdentification
	 * References44Choice.mmSecuritiesFinancingTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesFinancingTransactionIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> References22Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesFincgTxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingTransactionIdentification";
			definition = "Unambiguous identification of the underlying securities financing transaction (not the underlying securities financing trade) as assigned by the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.References44Choice.mmSecuritiesFinancingTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementTypeAndIdentification13.mmObject();
		}
	};
	protected SettlementTypeAndIdentification13 securitiesSettlementTransactionIdentification;
	/**
	 * Unambiguous identification of the securities settlement transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification13
	 * SettlementTypeAndIdentification13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References22Choice
	 * References22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSttlmTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the securities settlement transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References44Choice#mmSecuritiesSettlementTransactionIdentification
	 * References44Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesSettlementTransactionIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> References22Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmTxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionIdentification";
			definition = "Unambiguous identification of the securities settlement transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.References44Choice.mmSecuritiesSettlementTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementTypeAndIdentification13.mmObject();
		}
	};
	protected Max35Text intraPositionMovementIdentification;
	/**
	 * Reference to the intra-position movement transaction requested to be
	 * cancelled as known by the account owner (or instructing party acting on
	 * its behalf).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References22Choice
	 * References22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntraPosMvmntId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraPositionMovementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the intra-position movement transaction requested to be cancelled as known by the account owner (or instructing party acting on its behalf)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References44Choice#mmIntraPositionMovementIdentification
	 * References44Choice.mmIntraPositionMovementIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntraPositionMovementIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> References22Choice.mmObject();
			isDerived = false;
			xmlTag = "IntraPosMvmntId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraPositionMovementIdentification";
			definition = "Reference to the intra-position movement transaction requested to be cancelled as known by the account owner (or instructing party acting on its behalf).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.References44Choice.mmIntraPositionMovementIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.References22Choice.mmOtherTransactionIdentification,
						com.tools20022.repository.choice.References22Choice.mmSecuritiesFinancingTransactionIdentification, com.tools20022.repository.choice.References22Choice.mmSecuritiesSettlementTransactionIdentification,
						com.tools20022.repository.choice.References22Choice.mmIntraPositionMovementIdentification);
				trace_lazy = () -> SecuritiesTradeIdentification.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "References22Choice";
				definition = "Choice of reference.";
				nextVersions_lazy = () -> Arrays.asList(References44Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public GenericDocumentIdentification1 getOtherTransactionIdentification() {
		return otherTransactionIdentification;
	}

	public void setOtherTransactionIdentification(GenericDocumentIdentification1 otherTransactionIdentification) {
		this.otherTransactionIdentification = otherTransactionIdentification;
	}

	public SettlementTypeAndIdentification13 getSecuritiesFinancingTransactionIdentification() {
		return securitiesFinancingTransactionIdentification;
	}

	public void setSecuritiesFinancingTransactionIdentification(SettlementTypeAndIdentification13 securitiesFinancingTransactionIdentification) {
		this.securitiesFinancingTransactionIdentification = securitiesFinancingTransactionIdentification;
	}

	public SettlementTypeAndIdentification13 getSecuritiesSettlementTransactionIdentification() {
		return securitiesSettlementTransactionIdentification;
	}

	public void setSecuritiesSettlementTransactionIdentification(SettlementTypeAndIdentification13 securitiesSettlementTransactionIdentification) {
		this.securitiesSettlementTransactionIdentification = securitiesSettlementTransactionIdentification;
	}

	public Max35Text getIntraPositionMovementIdentification() {
		return intraPositionMovementIdentification;
	}

	public void setIntraPositionMovementIdentification(Max35Text intraPositionMovementIdentification) {
		this.intraPositionMovementIdentification = intraPositionMovementIdentification;
	}
}