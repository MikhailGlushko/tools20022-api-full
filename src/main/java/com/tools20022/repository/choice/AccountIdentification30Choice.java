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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.AccountIdentification;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifier of an account, as assigned by the account servicer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmCard
 * AccountIdentification30Choice.mmCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmMSISDN
 * AccountIdentification30Choice.mmMSISDN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmEMail
 * AccountIdentification30Choice.mmEMail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmIBAN
 * AccountIdentification30Choice.mmIBAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmBBAN
 * AccountIdentification30Choice.mmBBAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmUPIC
 * AccountIdentification30Choice.mmUPIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmDomestic
 * AccountIdentification30Choice.mmDomestic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmOther
 * AccountIdentification30Choice.mmOther}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AccountIdentification
 * AccountIdentification}</li>
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
 * "AccountIdentification30Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifier of an account, as assigned by the account servicer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.AccountIdentification1Choice
 * AccountIdentification1Choice}</li>
 * </ul>
 */
public class AccountIdentification30Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Min8Max28NumericText card;
	/**
	 * PAN of the card identifying the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min8Max28NumericText
	 * Min8Max28NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice
	 * AccountIdentification30Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "PAN of the card identifying the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCard = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> AccountIdentification.mmObject();
			componentContext_lazy = () -> AccountIdentification30Choice.mmObject();
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "PAN of the card identifying the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Min8Max28NumericText.mmObject();
		}
	};
	protected Max16Text mSISDN;
	/**
	 * Mobile Subscriber Integrated Service Digital Network (i.e. mobile phone
	 * number of the SIM card).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice
	 * AccountIdentification30Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MSISDN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MSISDN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mobile Subscriber Integrated Service Digital Network (i.e. mobile phone number of the SIM card)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMSISDN = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> AccountIdentification.mmObject();
			componentContext_lazy = () -> AccountIdentification30Choice.mmObject();
			isDerived = false;
			xmlTag = "MSISDN";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MSISDN";
			definition = "Mobile Subscriber Integrated Service Digital Network (i.e. mobile phone number of the SIM card).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	protected Max35Text eMail;
	/**
	 * E-mail identifying the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice
	 * AccountIdentification30Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EMail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "E-mail identifying the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEMail = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> AccountIdentification.mmObject();
			componentContext_lazy = () -> AccountIdentification30Choice.mmObject();
			isDerived = false;
			xmlTag = "EMail";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMail";
			definition = "E-mail identifying the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected IBANIdentifier iBAN;
	/**
	 * International Bank Account Number (IBAN) - identifier used
	 * internationally by financial institutions to uniquely identify the
	 * account of a customer. Further specifications of the format and content
	 * of the IBAN can be found in the standard ISO 13616
	 * "Banking and related financial services - International Bank Account Number (IBAN)"
	 * version 1997-10-01, or later revisions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.IBANIdentifier
	 * IBANIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmIBAN
	 * AccountIdentification.mmIBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice
	 * AccountIdentification30Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification1Choice#mmIBAN
	 * AccountIdentification1Choice.mmIBAN}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIBAN = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmIBAN;
			componentContext_lazy = () -> AccountIdentification30Choice.mmObject();
			isDerived = false;
			xmlTag = "IBAN";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IBAN";
			definition = "International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.AccountIdentification1Choice.mmIBAN;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IBANIdentifier.mmObject();
		}
	};
	protected BBANIdentifier bBAN;
	/**
	 * Basic Bank Account Number (BBAN) - identifier used nationally by
	 * financial institutions, that is, in individual countries, generally as
	 * part of a National Account Numbering Scheme(s), to uniquely identify the
	 * account of a customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BBANIdentifier
	 * BBANIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmBBAN
	 * AccountIdentification.mmBBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice
	 * AccountIdentification30Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Basic Bank Account Number (BBAN) - identifier used nationally by financial institutions, that is, in individual countries, generally as part of a National Account Numbering Scheme(s), to uniquely identify the account of a customer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification1Choice#mmBBAN
	 * AccountIdentification1Choice.mmBBAN}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBBAN = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmBBAN;
			componentContext_lazy = () -> AccountIdentification30Choice.mmObject();
			isDerived = false;
			xmlTag = "BBAN";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BBAN";
			definition = "Basic Bank Account Number (BBAN) - identifier used nationally by financial institutions, that is, in individual countries, generally as part of a National Account Numbering Scheme(s), to uniquely identify the account of a customer.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.AccountIdentification1Choice.mmBBAN;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BBANIdentifier.mmObject();
		}
	};
	protected UPICIdentifier uPIC;
	/**
	 * Universal Payment Identification Code (UPIC) - identifier used by the New
	 * York Clearing House to mask confidential data, such as bank accounts and
	 * bank routing numbers. UPIC numbers remain with business customers,
	 * regardless of banking relationship changes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.UPICIdentifier
	 * UPICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmUPIC
	 * AccountIdentification.mmUPIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice
	 * AccountIdentification30Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UPIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UPIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Universal Payment Identification Code (UPIC) - identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification1Choice#mmUPIC
	 * AccountIdentification1Choice.mmUPIC}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUPIC = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmUPIC;
			componentContext_lazy = () -> AccountIdentification30Choice.mmObject();
			isDerived = false;
			xmlTag = "UPIC";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UPIC";
			definition = "Universal Payment Identification Code (UPIC) - identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.AccountIdentification1Choice.mmUPIC;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UPICIdentifier.mmObject();
		}
	};
	protected Max35Text domestic;
	/**
	 * Account number used by financial institutions in individual countries to
	 * identify an account of a customer, but not necessarily the bank and
	 * branch of the financial institution in which the account is held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice
	 * AccountIdentification30Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dmst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Domestic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account number used by financial institutions in individual countries to identify an account of a customer, but not necessarily the bank and branch of the financial institution in which the account is held."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDomestic = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> AccountIdentification.mmObject();
			componentContext_lazy = () -> AccountIdentification30Choice.mmObject();
			isDerived = false;
			xmlTag = "Dmst";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Domestic";
			definition = "Account number used by financial institutions in individual countries to identify an account of a customer, but not necessarily the bank and branch of the financial institution in which the account is held.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text other;
	/**
	 * Other identifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmProprietaryIdentification
	 * AccountIdentification.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice
	 * AccountIdentification30Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Othr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other identifier."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOther = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmProprietaryIdentification;
			componentContext_lazy = () -> AccountIdentification30Choice.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountIdentification30Choice.mmCard, com.tools20022.repository.choice.AccountIdentification30Choice.mmMSISDN,
						com.tools20022.repository.choice.AccountIdentification30Choice.mmEMail, com.tools20022.repository.choice.AccountIdentification30Choice.mmIBAN, com.tools20022.repository.choice.AccountIdentification30Choice.mmBBAN,
						com.tools20022.repository.choice.AccountIdentification30Choice.mmUPIC, com.tools20022.repository.choice.AccountIdentification30Choice.mmDomestic,
						com.tools20022.repository.choice.AccountIdentification30Choice.mmOther);
				trace_lazy = () -> AccountIdentification.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountIdentification30Choice";
				definition = "Identifier of an account, as assigned by the account servicer.";
				previousVersion_lazy = () -> AccountIdentification1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Min8Max28NumericText getCard() {
		return card;
	}

	public void setCard(Min8Max28NumericText card) {
		this.card = card;
	}

	public Max16Text getMSISDN() {
		return mSISDN;
	}

	public void setMSISDN(Max16Text mSISDN) {
		this.mSISDN = mSISDN;
	}

	public Max35Text getEMail() {
		return eMail;
	}

	public void setEMail(Max35Text eMail) {
		this.eMail = eMail;
	}

	public IBANIdentifier getIBAN() {
		return iBAN;
	}

	public void setIBAN(IBANIdentifier iBAN) {
		this.iBAN = iBAN;
	}

	public BBANIdentifier getBBAN() {
		return bBAN;
	}

	public void setBBAN(BBANIdentifier bBAN) {
		this.bBAN = bBAN;
	}

	public UPICIdentifier getUPIC() {
		return uPIC;
	}

	public void setUPIC(UPICIdentifier uPIC) {
		this.uPIC = uPIC;
	}

	public Max35Text getDomestic() {
		return domestic;
	}

	public void setDomestic(Max35Text domestic) {
		this.domestic = domestic;
	}

	public Max35Text getOther() {
		return other;
	}

	public void setOther(Max35Text other) {
		this.other = other;
	}
}