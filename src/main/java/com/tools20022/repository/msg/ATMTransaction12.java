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
import com.tools20022.repository.codeset.ATMOperation1Code;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Information about the reconciliation response.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction12#mmTypeOfOperation
 * ATMTransaction12.mmTypeOfOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction12#mmTransactionIdentification
 * ATMTransaction12.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction12#mmReconciliationIdentification
 * ATMTransaction12.mmReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction12#mmTransactionResponse
 * ATMTransaction12.mmTransactionResponse}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction12#mmCommand
 * ATMTransaction12.mmCommand}</li>
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
 * "ATMTransaction12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about the reconciliation response."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMTransaction10 ATMTransaction10}</li>
 * </ul>
 */
public class ATMTransaction12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ATMOperation1Code typeOfOperation;
	/**
	 * Type of logical or physical operation on the ATM for which the counters
	 * are computed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMOperation1Code
	 * ATMOperation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction12
	 * ATMTransaction12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpOfOpr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of logical or physical operation on the ATM for which the counters are computed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTypeOfOperation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction12.mmObject();
			isDerived = false;
			xmlTag = "TpOfOpr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfOperation";
			definition = "Type of logical or physical operation on the ATM for which the counters are computed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ATMOperation1Code.mmObject();
		}
	};
	protected TransactionIdentifier1 transactionIdentification;
	/**
	 * Identification of the reconciliation transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionIdentifier1
	 * TransactionIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction12
	 * ATMTransaction12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the reconciliation transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction12.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the reconciliation transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionIdentifier1.mmObject();
		}
	};
	protected Max35Text reconciliationIdentification;
	/**
	 * Identification of the reconciliation period assigned by the ATM.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction12
	 * ATMTransaction12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the reconciliation period assigned by the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction10#mmReconciliationIdentification
	 * ATMTransaction10.mmReconciliationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReconciliationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction12.mmObject();
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Identification of the reconciliation period assigned by the ATM.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction10.mmReconciliationIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ResponseType3 transactionResponse;
	/**
	 * Result of the reconciliation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType3
	 * ResponseType3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction12
	 * ATMTransaction12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of the reconciliation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction10#mmTransactionResponse
	 * ATMTransaction10.mmTransactionResponse}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionResponse = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction12.mmObject();
			isDerived = false;
			xmlTag = "TxRspn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionResponse";
			definition = "Result of the reconciliation.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction10.mmTransactionResponse;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ResponseType3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ATMCommand1> command;
	/**
	 * Maintenance command to perform on the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCommand1
	 * ATMCommand1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction12
	 * ATMTransaction12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Command"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maintenance command to perform on the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction10#mmCommand
	 * ATMTransaction10.mmCommand}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommand = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction12.mmObject();
			isDerived = false;
			xmlTag = "Cmd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Command";
			definition = "Maintenance command to perform on the ATM.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction10.mmCommand;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMCommand1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction12.mmTypeOfOperation, com.tools20022.repository.msg.ATMTransaction12.mmTransactionIdentification,
						com.tools20022.repository.msg.ATMTransaction12.mmReconciliationIdentification, com.tools20022.repository.msg.ATMTransaction12.mmTransactionResponse, com.tools20022.repository.msg.ATMTransaction12.mmCommand);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMTransaction12";
				definition = "Information about the reconciliation response.";
				previousVersion_lazy = () -> ATMTransaction10.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ATMOperation1Code getTypeOfOperation() {
		return typeOfOperation;
	}

	public void setTypeOfOperation(ATMOperation1Code typeOfOperation) {
		this.typeOfOperation = typeOfOperation;
	}

	public TransactionIdentifier1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(com.tools20022.repository.msg.TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	public Max35Text getReconciliationIdentification() {
		return reconciliationIdentification;
	}

	public void setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = reconciliationIdentification;
	}

	public ResponseType3 getTransactionResponse() {
		return transactionResponse;
	}

	public void setTransactionResponse(com.tools20022.repository.msg.ResponseType3 transactionResponse) {
		this.transactionResponse = transactionResponse;
	}

	public List<ATMCommand1> getCommand() {
		return command;
	}

	public void setCommand(List<com.tools20022.repository.msg.ATMCommand1> command) {
		this.command = command;
	}
}