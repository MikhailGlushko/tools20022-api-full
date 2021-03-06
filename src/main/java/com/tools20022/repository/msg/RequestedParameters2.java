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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericReportParameters;
import com.tools20022.repository.msg.StatementAttributes1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specification of the request for report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedParameters2#mmStatementByAccount
 * RequestedParameters2.mmStatementByAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedParameters2#mmStatementByAccountAndFinancialInstrument
 * RequestedParameters2.mmStatementByAccountAndFinancialInstrument}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequestedParameters2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specification of the request for report."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RequestedParameters2", propOrder = {"statementByAccount", "statementByAccountAndFinancialInstrument"})
public class RequestedParameters2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StmtByAcct", required = true)
	protected StatementAttributes1 statementByAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.StatementAttributes1
	 * StatementAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedParameters2
	 * RequestedParameters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtByAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementByAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account and statement parameters for which the statement is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestedParameters2, StatementAttributes1> mmStatementByAccount = new MMMessageAssociationEnd<RequestedParameters2, StatementAttributes1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedParameters2.mmObject();
			isDerived = false;
			xmlTag = "StmtByAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementByAccount";
			definition = "Account and statement parameters for which the statement is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> StatementAttributes1.mmObject();
		}

		@Override
		public StatementAttributes1 getValue(RequestedParameters2 obj) {
			return obj.getStatementByAccount();
		}

		@Override
		public void setValue(RequestedParameters2 obj, StatementAttributes1 value) {
			obj.setStatementByAccount(value);
		}
	};
	@XmlElement(name = "StmtByAcctAndFinInstrm", required = true)
	protected GenericReportParameters statementByAccountAndFinancialInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericReportParameters
	 * GenericReportParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedParameters2
	 * RequestedParameters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtByAcctAndFinInstrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementByAccountAndFinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account, financial instrument and statement parameters for which the statement is requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestedParameters2, GenericReportParameters> mmStatementByAccountAndFinancialInstrument = new MMMessageAssociationEnd<RequestedParameters2, GenericReportParameters>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestedParameters2.mmObject();
			isDerived = false;
			xmlTag = "StmtByAcctAndFinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementByAccountAndFinancialInstrument";
			definition = "Account, financial instrument and statement parameters for which the statement is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericReportParameters.mmObject();
		}

		@Override
		public GenericReportParameters getValue(RequestedParameters2 obj) {
			return obj.getStatementByAccountAndFinancialInstrument();
		}

		@Override
		public void setValue(RequestedParameters2 obj, GenericReportParameters value) {
			obj.setStatementByAccountAndFinancialInstrument(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestedParameters2.mmStatementByAccount, com.tools20022.repository.msg.RequestedParameters2.mmStatementByAccountAndFinancialInstrument);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "RequestedParameters2";
				definition = "Specification of the request for report.";
			}
		});
		return mmObject_lazy.get();
	}

	public StatementAttributes1 getStatementByAccount() {
		return statementByAccount;
	}

	public RequestedParameters2 setStatementByAccount(StatementAttributes1 statementByAccount) {
		this.statementByAccount = Objects.requireNonNull(statementByAccount);
		return this;
	}

	public GenericReportParameters getStatementByAccountAndFinancialInstrument() {
		return statementByAccountAndFinancialInstrument;
	}

	public RequestedParameters2 setStatementByAccountAndFinancialInstrument(GenericReportParameters statementByAccountAndFinancialInstrument) {
		this.statementByAccountAndFinancialInstrument = Objects.requireNonNull(statementByAccountAndFinancialInstrument);
		return this;
	}
}