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

package com.tools20022.repository.area.tsrv;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.TradeServicesLatestVersion;
import com.tools20022.repository.msg.PartyAndSignature2;
import com.tools20022.repository.msg.UndertakingAdvice2;
import com.tools20022.repository.msgset.DemandGuaranteesandStandbyLettersofCreditISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The UndertakingIssuanceNotification message is sent by the party that issued
 * the undertaking to the applicant to notify it of the contents of an
 * undertaking issued electronically or on paper. The undertaking that is
 * notified could be a demand guarantee, standby letter of credit,
 * counter-undertaking (counter-guarantee or counter-standby), or suretyship
 * undertaking. In addition to containing details on the applicable rules,
 * expiry date, the amount, required documents, and terms and conditions of the
 * undertaking, the message may provide information from the sender such as
 * confirmation details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesLatestVersion
 * TradeServicesLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.DemandGuaranteesandStandbyLettersofCreditISOLatestversion
 * DemandGuaranteesandStandbyLettersofCreditISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "UdrtkgIssncNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceNotificationV01#mmUndertakingIssuanceNotificationDetails
 * UndertakingIssuanceNotificationV01.mmUndertakingIssuanceNotificationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceNotificationV01#mmDigitalSignature
 * UndertakingIssuanceNotificationV01.mmDigitalSignature}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsrv.003.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingIssuanceNotificationV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The UndertakingIssuanceNotification message is sent by the party that issued the undertaking to the applicant to notify it of the contents of an undertaking issued electronically or on paper. The undertaking that is notified could be a demand guarantee, standby letter of credit, counter-undertaking (counter-guarantee or counter-standby), or suretyship undertaking. In addition to containing details on the applicable rules, expiry date, the amount, required documents, and terms and conditions of the undertaking, the message may provide information from the sender such as confirmation details."
 * </li>
 * </ul>
 */
public class UndertakingIssuanceNotificationV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected UndertakingAdvice2 undertakingIssuanceNotificationDetails;
	/**
	 * Details related to the notification of the issued undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice2
	 * UndertakingAdvice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgIssncNtfctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIssuanceNotificationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the notification of the issued undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmUndertakingIssuanceNotificationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "UdrtkgIssncNtfctnDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIssuanceNotificationDetails";
			definition = "Details related to the notification of the issued undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UndertakingAdvice2.mmObject();
		}
	};
	protected PartyAndSignature2 digitalSignature;
	/**
	 * Digital signature of the undertaking notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndSignature2
	 * PartyAndSignature2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgtlSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Digital signature of the undertaking notification."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDigitalSignature = new MMMessageBuildingBlock() {
		{
			xmlTag = "DgtlSgntr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Digital signature of the undertaking notification.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyAndSignature2.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UndertakingIssuanceNotificationV01";
				definition = "The UndertakingIssuanceNotification message is sent by the party that issued the undertaking to the applicant to notify it of the contents of an undertaking issued electronically or on paper. The undertaking that is notified could be a demand guarantee, standby letter of credit, counter-undertaking (counter-guarantee or counter-standby), or suretyship undertaking. In addition to containing details on the applicable rules, expiry date, the amount, required documents, and terms and conditions of the undertaking, the message may provide information from the sender such as confirmation details.";
				messageSet_lazy = () -> Arrays.asList(DemandGuaranteesandStandbyLettersofCreditISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "UdrtkgIssncNtfctn";
				businessArea_lazy = () -> TradeServicesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsrv.UndertakingIssuanceNotificationV01.mmUndertakingIssuanceNotificationDetails,
						com.tools20022.repository.area.tsrv.UndertakingIssuanceNotificationV01.mmDigitalSignature);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsrv";
						messageFunctionality = "003";
						version = "01";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public UndertakingAdvice2 getUndertakingIssuanceNotificationDetails() {
		return undertakingIssuanceNotificationDetails;
	}

	public void setUndertakingIssuanceNotificationDetails(UndertakingAdvice2 undertakingIssuanceNotificationDetails) {
		this.undertakingIssuanceNotificationDetails = undertakingIssuanceNotificationDetails;
	}

	public PartyAndSignature2 getDigitalSignature() {
		return digitalSignature;
	}

	public void setDigitalSignature(PartyAndSignature2 digitalSignature) {
		this.digitalSignature = digitalSignature;
	}
}