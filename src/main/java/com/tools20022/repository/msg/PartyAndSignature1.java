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
import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification41;
import com.tools20022.repository.msg.ProprietaryData3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Entity involved in an activity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndSignature1#mmParty
 * PartyAndSignature1.mmParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndSignature1#mmSignature
 * PartyAndSignature1.mmSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountAdditionalInformationRequestV01#mmDigitalSignature
 * AccountAdditionalInformationRequestV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV01#mmDigitalSignature
 * AccountClosingAdditionalInformationRequestV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV01#mmDigitalSignature
 * AccountClosingAmendmentRequestV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV01#mmDigitalSignature
 * AccountClosingRequestV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV01#mmDigitalSignature
 * AccountExcludedMandateMaintenanceAmendmentRequestV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV01#mmDigitalSignature
 * AccountExcludedMandateMaintenanceRequestV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV01#mmDigitalSignature
 * AccountMandateMaintenanceAmendmentRequestV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01#mmDigitalSignature
 * AccountMandateMaintenanceRequestV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAdditionalInformationRequestV01#mmDigitalSignature
 * AccountOpeningAdditionalInformationRequestV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01#mmDigitalSignature
 * AccountOpeningAmendmentRequestV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningRequestV01#mmDigitalSignature
 * AccountOpeningRequestV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportRequestV01#mmDigitalSignature
 * AccountReportRequestV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportV01#mmDigitalSignature
 * AccountReportV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV01#mmDigitalSignature
 * AccountRequestAcknowledgementV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestRejectionV01#mmDigitalSignature
 * AccountRequestRejectionV01.mmDigitalSignature}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyAndSignature1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity involved in an activity."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyAndSignature1", propOrder = {"party", "signature"})
public class PartyAndSignature1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pty", required = true)
	protected PartyIdentification41 party;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification41
	 * PartyIdentification41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndSignature1
	 * PartyAndSignature1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity involved in an activity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyAndSignature1, PartyIdentification41> mmParty = new MMMessageAssociationEnd<PartyAndSignature1, PartyIdentification41>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyAndSignature1.mmObject();
			isDerived = false;
			xmlTag = "Pty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party";
			definition = "Entity involved in an activity.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification41.mmObject();
		}

		@Override
		public PartyIdentification41 getValue(PartyAndSignature1 obj) {
			return obj.getParty();
		}

		@Override
		public void setValue(PartyAndSignature1 obj, PartyIdentification41 value) {
			obj.setParty(value);
		}
	};
	@XmlElement(name = "Sgntr", required = true)
	protected ProprietaryData3 signature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryData3
	 * ProprietaryData3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmElectronicSignature
	 * Undertaking.mmElectronicSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndSignature1
	 * PartyAndSignature1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sgntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Signature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Signature of a party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyAndSignature1, ProprietaryData3> mmSignature = new MMMessageAssociationEnd<PartyAndSignature1, ProprietaryData3>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmElectronicSignature;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyAndSignature1.mmObject();
			isDerived = false;
			xmlTag = "Sgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Signature";
			definition = "Signature of a party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryData3.mmObject();
		}

		@Override
		public ProprietaryData3 getValue(PartyAndSignature1 obj) {
			return obj.getSignature();
		}

		@Override
		public void setValue(PartyAndSignature1 obj, ProprietaryData3 value) {
			obj.setSignature(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyAndSignature1.mmParty, com.tools20022.repository.msg.PartyAndSignature1.mmSignature);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountAdditionalInformationRequestV01.mmDigitalSignature, AccountClosingAdditionalInformationRequestV01.mmDigitalSignature,
						AccountClosingAmendmentRequestV01.mmDigitalSignature, AccountClosingRequestV01.mmDigitalSignature, AccountExcludedMandateMaintenanceAmendmentRequestV01.mmDigitalSignature,
						AccountExcludedMandateMaintenanceRequestV01.mmDigitalSignature, AccountMandateMaintenanceAmendmentRequestV01.mmDigitalSignature, AccountMandateMaintenanceRequestV01.mmDigitalSignature,
						AccountOpeningAdditionalInformationRequestV01.mmDigitalSignature, AccountOpeningAmendmentRequestV01.mmDigitalSignature, AccountOpeningRequestV01.mmDigitalSignature, AccountReportRequestV01.mmDigitalSignature,
						AccountReportV01.mmDigitalSignature, AccountRequestAcknowledgementV01.mmDigitalSignature, AccountRequestRejectionV01.mmDigitalSignature);
				trace_lazy = () -> Party.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyAndSignature1";
				definition = "Entity involved in an activity.";
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification41 getParty() {
		return party;
	}

	public PartyAndSignature1 setParty(PartyIdentification41 party) {
		this.party = Objects.requireNonNull(party);
		return this;
	}

	public ProprietaryData3 getSignature() {
		return signature;
	}

	public PartyAndSignature1 setSignature(ProprietaryData3 signature) {
		this.signature = Objects.requireNonNull(signature);
		return this;
	}
}