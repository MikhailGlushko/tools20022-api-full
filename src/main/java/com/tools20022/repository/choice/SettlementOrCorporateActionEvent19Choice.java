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
import com.tools20022.metamodel.MMMessageAttribute;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of transaction type, corporate action event or settlement transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent19Choice#mmSecuritiesTransactionType
 * SettlementOrCorporateActionEvent19Choice.mmSecuritiesTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent19Choice#mmCorporateActionEventType
 * SettlementOrCorporateActionEvent19Choice.mmCorporateActionEventType}</li>
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
 * "SettlementOrCorporateActionEvent19Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of transaction type, corporate action event or settlement transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent13Choice
 * SettlementOrCorporateActionEvent13Choice}</li>
 * </ul>
 */
public class SettlementOrCorporateActionEvent19Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesTransactionType18Choice securitiesTransactionType;
	/**
	 * Identifies the type of securities transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType18Choice
	 * SecuritiesTransactionType18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTransactionType
	 * SecuritiesTrade.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent19Choice
	 * SettlementOrCorporateActionEvent19Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesTxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of securities transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent13Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent13Choice.mmSecuritiesTransactionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesTransactionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTransactionType;
			componentContext_lazy = () -> SettlementOrCorporateActionEvent19Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesTxTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransactionType";
			definition = "Identifies the type of securities transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.SettlementOrCorporateActionEvent13Choice.mmSecuritiesTransactionType;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.choice.SecuritiesTransactionType18Choice.mmObject();
		}
	};
	protected CorporateActionEventType56Choice corporateActionEventType;
	/**
	 * Specifies the type of corporate event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType56Choice
	 * CorporateActionEventType56Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmType
	 * CorporateActionEvent.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent19Choice
	 * SettlementOrCorporateActionEvent19Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of corporate event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent13Choice#mmCorporateActionEventType
	 * SettlementOrCorporateActionEvent13Choice.mmCorporateActionEventType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCorporateActionEventType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmType;
			componentContext_lazy = () -> SettlementOrCorporateActionEvent19Choice.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventType";
			definition = "Specifies the type of corporate event.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.SettlementOrCorporateActionEvent13Choice.mmCorporateActionEventType;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.choice.CorporateActionEventType56Choice.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SettlementOrCorporateActionEvent19Choice.mmSecuritiesTransactionType,
						com.tools20022.repository.choice.SettlementOrCorporateActionEvent19Choice.mmCorporateActionEventType);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementOrCorporateActionEvent19Choice";
				definition = "Choice of transaction type, corporate action event or settlement transaction.";
				previousVersion_lazy = () -> SettlementOrCorporateActionEvent13Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesTransactionType18Choice getSecuritiesTransactionType() {
		return securitiesTransactionType;
	}

	public void setSecuritiesTransactionType(com.tools20022.repository.choice.SecuritiesTransactionType18Choice securitiesTransactionType) {
		this.securitiesTransactionType = securitiesTransactionType;
	}

	public CorporateActionEventType56Choice getCorporateActionEventType() {
		return corporateActionEventType;
	}

	public void setCorporateActionEventType(com.tools20022.repository.choice.CorporateActionEventType56Choice corporateActionEventType) {
		this.corporateActionEventType = corporateActionEventType;
	}
}