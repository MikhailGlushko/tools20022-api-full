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
import com.tools20022.repository.codeset.Frequency1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.DirectDebitMandate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amendment information details providing the list of direct debit mandate
 * elements that have been modified when the amendment indicator has been set.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5#mmOriginalMandateIdentification
 * AmendmentInformationDetails5.mmOriginalMandateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5#mmOriginalCreditorSchemeIdentification
 * AmendmentInformationDetails5.mmOriginalCreditorSchemeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5#mmOriginalCreditorAgent
 * AmendmentInformationDetails5.mmOriginalCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5#mmOriginalCreditorAgentAccount
 * AmendmentInformationDetails5.mmOriginalCreditorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5#mmOriginalDebtor
 * AmendmentInformationDetails5.mmOriginalDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5#mmOriginalDebtorAccount
 * AmendmentInformationDetails5.mmOriginalDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5#mmOriginalDebtorAgent
 * AmendmentInformationDetails5.mmOriginalDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5#mmOriginalDebtorAgentAccount
 * AmendmentInformationDetails5.mmOriginalDebtorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5#mmOriginalFinalCollectionDate
 * AmendmentInformationDetails5.mmOriginalFinalCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5#mmOriginalFrequency
 * AmendmentInformationDetails5.mmOriginalFrequency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DirectDebitMandate
 * DirectDebitMandate}</li>
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
 * "AmendmentInformationDetails5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amendment information details providing the list of direct debit mandate elements that have been modified when the amendment indicator has been set."
 * </li>
 * </ul>
 */
public class AmendmentInformationDetails5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text originalMandateIdentification;
	/**
	 * Original mandate identification that has been modified.
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
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmMandateIdentification
	 * Mandate.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5
	 * AmendmentInformationDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMndtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMandateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original mandate identification that has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalMandateIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.mmMandateIdentification;
			componentContext_lazy = () -> AmendmentInformationDetails5.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMndtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMandateIdentification";
			definition = "Original mandate identification that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification18 originalCreditorSchemeIdentification;
	/**
	 * Original creditor scheme identification that has been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification18
	 * PartyIdentification18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5
	 * AmendmentInformationDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCdtrSchmeId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCreditorSchemeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original creditor scheme identification that has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalCreditorSchemeIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> AmendmentInformationDetails5.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrSchmeId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorSchemeIdentification";
			definition = "Original creditor scheme identification that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification18.mmObject();
		}
	};
	protected FinancialInstitution2 originalCreditorAgent;
	/**
	 * Original creditor agent that has been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstitution2
	 * FinancialInstitution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5
	 * AmendmentInformationDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCdtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original creditor agent that has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalCreditorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> AmendmentInformationDetails5.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorAgent";
			definition = "Original creditor agent that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitution2.mmObject();
		}
	};
	protected CashAccount7 originalCreditorAgentAccount;
	/**
	 * Original creditor agent acount that has been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5
	 * AmendmentInformationDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCdtrAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCreditorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original creditor agent acount that has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalCreditorAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> AmendmentInformationDetails5.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrAgtAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorAgentAccount";
			definition = "Original creditor agent acount that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount7.mmObject();
		}
	};
	protected PartyIdentification20 originalDebtor;
	/**
	 * Original debtor that has been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification20
	 * PartyIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5
	 * AmendmentInformationDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlDbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original debtor that has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalDebtor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> AmendmentInformationDetails5.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtor";
			definition = "Original debtor that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification20.mmObject();
		}
	};
	protected CashAccount8 originalDebtorAccount;
	/**
	 * Original debtor account that has been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount8
	 * CashAccount8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5
	 * AmendmentInformationDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlDbtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original debtor account that has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalDebtorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> AmendmentInformationDetails5.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAccount";
			definition = "Original debtor account that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount8.mmObject();
		}
	};
	protected FinancialInstitution3 originalDebtorAgent;
	/**
	 * Original debtor's agent that has been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstitution3
	 * FinancialInstitution3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5
	 * AmendmentInformationDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlDbtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original debtor's agent that has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalDebtorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> AmendmentInformationDetails5.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAgent";
			definition = "Original debtor's agent that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitution3.mmObject();
		}
	};
	protected CashAccount7 originalDebtorAgentAccount;
	/**
	 * Original debtor agent account that has been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5
	 * AmendmentInformationDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlDbtrAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDebtorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original debtor agent account that has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalDebtorAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> AmendmentInformationDetails5.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAgtAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAgentAccount";
			definition = "Original debtor agent account that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount7.mmObject();
		}
	};
	protected ISODate originalFinalCollectionDate;
	/**
	 * Original final collection date that has been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFinalCollectionDate
	 * DirectDebitMandate.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5
	 * AmendmentInformationDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlFnlColltnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalFinalCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original final collection date that has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalFinalCollectionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmFinalCollectionDate;
			componentContext_lazy = () -> AmendmentInformationDetails5.mmObject();
			isDerived = false;
			xmlTag = "OrgnlFnlColltnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalFinalCollectionDate";
			definition = "Original final collection date that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Frequency1Code originalFrequency;
	/**
	 * Original frequency that has been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency1Code
	 * Frequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFrequency
	 * DirectDebitMandate.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails5
	 * AmendmentInformationDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original frequency that has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmFrequency;
			componentContext_lazy = () -> AmendmentInformationDetails5.mmObject();
			isDerived = false;
			xmlTag = "OrgnlFrqcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalFrequency";
			definition = "Original frequency that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails5.mmOriginalMandateIdentification,
						com.tools20022.repository.msg.AmendmentInformationDetails5.mmOriginalCreditorSchemeIdentification, com.tools20022.repository.msg.AmendmentInformationDetails5.mmOriginalCreditorAgent,
						com.tools20022.repository.msg.AmendmentInformationDetails5.mmOriginalCreditorAgentAccount, com.tools20022.repository.msg.AmendmentInformationDetails5.mmOriginalDebtor,
						com.tools20022.repository.msg.AmendmentInformationDetails5.mmOriginalDebtorAccount, com.tools20022.repository.msg.AmendmentInformationDetails5.mmOriginalDebtorAgent,
						com.tools20022.repository.msg.AmendmentInformationDetails5.mmOriginalDebtorAgentAccount, com.tools20022.repository.msg.AmendmentInformationDetails5.mmOriginalFinalCollectionDate,
						com.tools20022.repository.msg.AmendmentInformationDetails5.mmOriginalFrequency);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AmendmentInformationDetails5";
				definition = "Amendment information details providing the list of direct debit mandate elements that have been modified when the amendment indicator has been set.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOriginalMandateIdentification() {
		return originalMandateIdentification;
	}

	public void setOriginalMandateIdentification(Max35Text originalMandateIdentification) {
		this.originalMandateIdentification = originalMandateIdentification;
	}

	public PartyIdentification18 getOriginalCreditorSchemeIdentification() {
		return originalCreditorSchemeIdentification;
	}

	public void setOriginalCreditorSchemeIdentification(com.tools20022.repository.msg.PartyIdentification18 originalCreditorSchemeIdentification) {
		this.originalCreditorSchemeIdentification = originalCreditorSchemeIdentification;
	}

	public FinancialInstitution2 getOriginalCreditorAgent() {
		return originalCreditorAgent;
	}

	public void setOriginalCreditorAgent(com.tools20022.repository.msg.FinancialInstitution2 originalCreditorAgent) {
		this.originalCreditorAgent = originalCreditorAgent;
	}

	public CashAccount7 getOriginalCreditorAgentAccount() {
		return originalCreditorAgentAccount;
	}

	public void setOriginalCreditorAgentAccount(com.tools20022.repository.msg.CashAccount7 originalCreditorAgentAccount) {
		this.originalCreditorAgentAccount = originalCreditorAgentAccount;
	}

	public PartyIdentification20 getOriginalDebtor() {
		return originalDebtor;
	}

	public void setOriginalDebtor(com.tools20022.repository.msg.PartyIdentification20 originalDebtor) {
		this.originalDebtor = originalDebtor;
	}

	public CashAccount8 getOriginalDebtorAccount() {
		return originalDebtorAccount;
	}

	public void setOriginalDebtorAccount(com.tools20022.repository.msg.CashAccount8 originalDebtorAccount) {
		this.originalDebtorAccount = originalDebtorAccount;
	}

	public FinancialInstitution3 getOriginalDebtorAgent() {
		return originalDebtorAgent;
	}

	public void setOriginalDebtorAgent(com.tools20022.repository.msg.FinancialInstitution3 originalDebtorAgent) {
		this.originalDebtorAgent = originalDebtorAgent;
	}

	public CashAccount7 getOriginalDebtorAgentAccount() {
		return originalDebtorAgentAccount;
	}

	public void setOriginalDebtorAgentAccount(com.tools20022.repository.msg.CashAccount7 originalDebtorAgentAccount) {
		this.originalDebtorAgentAccount = originalDebtorAgentAccount;
	}

	public ISODate getOriginalFinalCollectionDate() {
		return originalFinalCollectionDate;
	}

	public void setOriginalFinalCollectionDate(ISODate originalFinalCollectionDate) {
		this.originalFinalCollectionDate = originalFinalCollectionDate;
	}

	public Frequency1Code getOriginalFrequency() {
		return originalFrequency;
	}

	public void setOriginalFrequency(Frequency1Code originalFrequency) {
		this.originalFrequency = originalFrequency;
	}
}