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
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.msg.CorrectiveInterbankTransaction1;
import com.tools20022.repository.msg.CorrectivePaymentInitiation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the corrective transaction on which the investigation is processed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction1Choice#mmInitiation
 * CorrectiveTransaction1Choice.mmInitiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction1Choice#mmInterbank
 * CorrectiveTransaction1Choice.mmInterbank}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV03#mmCorrectionTransaction
 * ResolutionOfInvestigationV03.mmCorrectionTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV04#mmCorrectionTransaction
 * ResolutionOfInvestigationV04.mmCorrectionTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV05#mmCorrectionTransaction
 * ResolutionOfInvestigationV05.mmCorrectionTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV06#mmCorrectionTransaction
 * ResolutionOfInvestigationV06.mmCorrectionTransaction}</li>
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
 * "CorrectiveTransaction1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the corrective transaction on which the investigation is processed."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction2Choice
 * CorrectiveTransaction2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class CorrectiveTransaction1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected CorrectivePaymentInitiation1 initiation;
	/**
	 * Set of elements used to reference the details of the corrective payment
	 * initiation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation1
	 * CorrectivePaymentInitiation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
	 * Payment.mmPaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction1Choice
	 * CorrectiveTransaction1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Initn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Initiation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to reference the details of the corrective payment initiation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction2Choice#mmInitiation
	 * CorrectiveTransaction2Choice.mmInitiation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInitiation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmPaymentExecution;
			componentContext_lazy = () -> CorrectiveTransaction1Choice.mmObject();
			isDerived = false;
			xmlTag = "Initn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Initiation";
			definition = "Set of elements used to reference the details of the corrective payment initiation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorrectiveTransaction2Choice.mmInitiation);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorrectivePaymentInitiation1.mmObject();
		}
	};
	protected CorrectiveInterbankTransaction1 interbank;
	/**
	 * Set of elements used to reference the details of the corrective interbank
	 * payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1
	 * CorrectiveInterbankTransaction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction1Choice
	 * CorrectiveTransaction1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interbank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to reference the details of the corrective interbank payment transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction2Choice#mmInterbank
	 * CorrectiveTransaction2Choice.mmInterbank}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInterbank = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> CorrectiveTransaction1Choice.mmObject();
			isDerived = false;
			xmlTag = "IntrBk";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interbank";
			definition = "Set of elements used to reference the details of the corrective interbank payment transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorrectiveTransaction2Choice.mmInterbank);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorrectiveInterbankTransaction1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorrectiveTransaction1Choice.mmInitiation, com.tools20022.repository.choice.CorrectiveTransaction1Choice.mmInterbank);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ResolutionOfInvestigationV03.mmCorrectionTransaction,
						com.tools20022.repository.area.camt.ResolutionOfInvestigationV04.mmCorrectionTransaction, com.tools20022.repository.area.camt.ResolutionOfInvestigationV05.mmCorrectionTransaction,
						com.tools20022.repository.area.camt.ResolutionOfInvestigationV06.mmCorrectionTransaction);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorrectiveTransaction1Choice";
				definition = "Specifies the corrective transaction on which the investigation is processed.";
				nextVersions_lazy = () -> Arrays.asList(CorrectiveTransaction2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CorrectivePaymentInitiation1 getInitiation() {
		return initiation;
	}

	public void setInitiation(CorrectivePaymentInitiation1 initiation) {
		this.initiation = initiation;
	}

	public CorrectiveInterbankTransaction1 getInterbank() {
		return interbank;
	}

	public void setInterbank(CorrectiveInterbankTransaction1 interbank) {
		this.interbank = interbank;
	}
}