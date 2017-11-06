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
import com.tools20022.repository.msg.ErrorHandling3;
import com.tools20022.repository.msg.LimitJournal1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Defines the limit business report as either a limit report or a business
 * error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LimitJournalReportOrError2Choice#mmLimitJournal
 * LimitJournalReportOrError2Choice.mmLimitJournal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LimitJournalReportOrError2Choice#mmBusinessError
 * LimitJournalReportOrError2Choice.mmBusinessError}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitJournalReportOrError2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the limit business report as either a limit report or a business error."
 * </li>
 * </ul>
 */
public class LimitJournalReportOrError2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected LimitJournal1 limitJournal;
	/**
	 * Requested information on the limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LimitJournal1
	 * LimitJournal1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.LimitJournalReportOrError2Choice
	 * LimitJournalReportOrError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtJrnl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitJournal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested information on the limit."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLimitJournal = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LimitJournalReportOrError2Choice.mmObject();
			isDerived = false;
			xmlTag = "LmtJrnl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitJournal";
			definition = "Requested information on the limit.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> LimitJournal1.mmObject();
		}
	};
	protected List<ErrorHandling3> businessError;
	/**
	 * Reason the requested business information is not given.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling3
	 * ErrorHandling3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.LimitJournalReportOrError2Choice
	 * LimitJournalReportOrError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason the requested business information is not given."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBusinessError = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LimitJournalReportOrError2Choice.mmObject();
			isDerived = false;
			xmlTag = "BizErr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessError";
			definition = "Reason the requested business information is not given.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling3.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.LimitJournalReportOrError2Choice.mmLimitJournal, com.tools20022.repository.choice.LimitJournalReportOrError2Choice.mmBusinessError);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LimitJournalReportOrError2Choice";
				definition = "Defines the limit business report as either a limit report or a business error.";
			}
		});
		return mmObject_lazy.get();
	}

	public LimitJournal1 getLimitJournal() {
		return limitJournal;
	}

	public void setLimitJournal(LimitJournal1 limitJournal) {
		this.limitJournal = limitJournal;
	}

	public List<ErrorHandling3> getBusinessError() {
		return businessError;
	}

	public void setBusinessError(List<ErrorHandling3> businessError) {
		this.businessError = businessError;
	}
}