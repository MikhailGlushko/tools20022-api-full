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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ErrorHandling4;
import com.tools20022.repository.msg.Transactions6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between transactions and booked entries held at the transaction
 * administrator or an operational error when the requested data cannot be
 * retrieved.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionReportOrError2Choice#mmBusinessReport
 * TransactionReportOrError2Choice.mmBusinessReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransactionReportOrError2Choice#mmOperationalError
 * TransactionReportOrError2Choice.mmOperationalError}</li>
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
 * "TransactionReportOrError2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between transactions and booked entries held at the transaction administrator or an operational error when the requested data cannot be retrieved."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.TransactionReportOrError1Choice
 * TransactionReportOrError1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransactionReportOrError2Choice", propOrder = {"businessReport", "operationalError"})
public class TransactionReportOrError2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Transactions6 businessReport;
	/**
	 * Reports on payment transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Transactions6
	 * Transactions6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransactionReportOrError2Choice
	 * TransactionReportOrError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reports on payment transactions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.TransactionReportOrError1Choice#mmBusinessReport
	 * TransactionReportOrError1Choice.mmBusinessReport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBusinessReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionReportOrError2Choice.mmObject();
			isDerived = false;
			xmlTag = "BizRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessReport";
			definition = "Reports on payment transactions.";
			previousVersion_lazy = () -> TransactionReportOrError1Choice.mmBusinessReport;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Transactions6.mmObject();
		}
	};
	protected List<ErrorHandling4> operationalError;
	/**
	 * Indicates that an operational error has been issued during the processing
	 * of the related request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling4
	 * ErrorHandling4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TransactionReportOrError2Choice
	 * TransactionReportOrError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OprlErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperationalError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an operational error has been issued during the processing of the related request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.TransactionReportOrError1Choice#mmOperationalError
	 * TransactionReportOrError1Choice.mmOperationalError}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOperationalError = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionReportOrError2Choice.mmObject();
			isDerived = false;
			xmlTag = "OprlErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalError";
			definition = "Indicates that an operational error has been issued during the processing of the related request.";
			previousVersion_lazy = () -> TransactionReportOrError1Choice.mmOperationalError;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling4.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransactionReportOrError2Choice.mmBusinessReport, TransactionReportOrError2Choice.mmOperationalError);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionReportOrError2Choice";
				definition = "Choice between transactions and booked entries held at the transaction administrator or an operational error when the requested data cannot be retrieved.";
				previousVersion_lazy = () -> TransactionReportOrError1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "BizRpt", required = true)
	public Transactions6 getBusinessReport() {
		return businessReport;
	}

	public void setBusinessReport(Transactions6 businessReport) {
		this.businessReport = businessReport;
	}

	@XmlElement(name = "OprlErr", required = true)
	public List<ErrorHandling4> getOperationalError() {
		return operationalError;
	}

	public void setOperationalError(List<ErrorHandling4> operationalError) {
		this.operationalError = operationalError;
	}
}