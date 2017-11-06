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
import com.tools20022.repository.datatype.ISODate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Record where all transactions are originally entered. The journal details
 * which transactions occurred and what accounts were affected.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LimitJournal1#mmLimit
 * LimitJournal1.mmLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitJournal1#mmJournalActivityDate
 * LimitJournal1.mmJournalActivityDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitJournal1#mmJournalEntry
 * LimitJournal1.mmJournalEntry}</li>
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
 * "LimitJournal1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Record where all transactions are originally entered.  The journal details which transactions occurred and what accounts were affected."
 * </li>
 * </ul>
 */
public class LimitJournal1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected LimitAmount1 limit;
	/**
	 * Maximum value used for risk containment in a system or towards
	 * counterparts. The limit may be a current limit or a default limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LimitAmount1
	 * LimitAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitJournal1 LimitJournal1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum value used for risk containment in a system or towards counterparts. The limit may be a current limit or a default limit. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLimit = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LimitJournal1.mmObject();
			isDerived = false;
			xmlTag = "Lmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limit";
			definition = "Maximum value used for risk containment in a system or towards counterparts. The limit may be a current limit or a default limit. ";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LimitAmount1.mmObject();
		}
	};
	protected ISODate journalActivityDate;
	/**
	 * Date upon which journal activity takes place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitJournal1 LimitJournal1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "JrnlActvtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JournalActivityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date upon which journal activity takes place."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmJournalActivityDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LimitJournal1.mmObject();
			isDerived = false;
			xmlTag = "JrnlActvtyDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JournalActivityDate";
			definition = "Date upon which journal activity takes place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.LimitJournalEntry1> journalEntry;
	/**
	 * Recording of transaction data pertaining to a transaction in a journal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LimitJournalEntry1
	 * LimitJournalEntry1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitJournal1 LimitJournal1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "JrnlNtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JournalEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Recording of transaction data pertaining to a transaction in a journal."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmJournalEntry = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LimitJournal1.mmObject();
			isDerived = false;
			xmlTag = "JrnlNtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JournalEntry";
			definition = "Recording of transaction data pertaining to a transaction in a journal.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LimitJournalEntry1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitJournal1.mmLimit, com.tools20022.repository.msg.LimitJournal1.mmJournalActivityDate, com.tools20022.repository.msg.LimitJournal1.mmJournalEntry);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LimitJournal1";
				definition = "Record where all transactions are originally entered.  The journal details which transactions occurred and what accounts were affected.";
			}
		});
		return mmObject_lazy.get();
	}

	public LimitAmount1 getLimit() {
		return limit;
	}

	public void setLimit(com.tools20022.repository.msg.LimitAmount1 limit) {
		this.limit = limit;
	}

	public ISODate getJournalActivityDate() {
		return journalActivityDate;
	}

	public void setJournalActivityDate(ISODate journalActivityDate) {
		this.journalActivityDate = journalActivityDate;
	}

	public List<LimitJournalEntry1> getJournalEntry() {
		return journalEntry;
	}

	public void setJournalEntry(List<com.tools20022.repository.msg.LimitJournalEntry1> journalEntry) {
		this.journalEntry = journalEntry;
	}
}