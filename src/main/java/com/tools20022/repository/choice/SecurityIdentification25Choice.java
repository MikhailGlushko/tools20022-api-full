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
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.msg.AlternateSecurityIdentification7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of formats for the identification of a financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmISIN
 * SecurityIdentification25Choice.mmISIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmSEDOL
 * SecurityIdentification25Choice.mmSEDOL}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmCUSIP
 * SecurityIdentification25Choice.mmCUSIP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmRIC
 * SecurityIdentification25Choice.mmRIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmTickerSymbol
 * SecurityIdentification25Choice.mmTickerSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmBloomberg
 * SecurityIdentification25Choice.mmBloomberg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmCTA
 * SecurityIdentification25Choice.mmCTA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmQUICK
 * SecurityIdentification25Choice.mmQUICK}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmWertpapier
 * SecurityIdentification25Choice.mmWertpapier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmDutch
 * SecurityIdentification25Choice.mmDutch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmValoren
 * SecurityIdentification25Choice.mmValoren}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmSicovam
 * SecurityIdentification25Choice.mmSicovam}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmBelgian
 * SecurityIdentification25Choice.mmBelgian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmCommon
 * SecurityIdentification25Choice.mmCommon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmOtherProprietaryIdentification
 * SecurityIdentification25Choice.mmOtherProprietaryIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
 * SecuritiesIdentification}</li>
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
 * "SecurityIdentification25Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of formats for the identification of a financial instrument."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice
 * SecurityIdentification23Choice}</li>
 * </ul>
 */
public class SecurityIdentification25Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected ISINOct2015Identifier iSIN;
	/**
	 * International Securities Identification Number (ISIN). A numbering system
	 * designed by the United Nation's International Organisation for
	 * Standardisation (ISO). The ISIN is composed of a 2-character prefix
	 * representing the country of issue, followed by the national security
	 * number (if one exists), and a check digit. Each country has a national
	 * numbering agency that assigns ISIN numbers for securities in that
	 * country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISINOct2015Identifier
	 * ISINOct2015Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
	 * SecuritiesIdentification.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
	 * SecurityIdentification25Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Securities Identification Number (ISIN). A numbering system designed by the United Nation's International Organisation for Standardisation (ISO). The ISIN is composed of a 2-character prefix representing the country of issue, followed by the national security number (if one exists), and a check digit. Each country has a national numbering agency that assigns ISIN numbers for securities in that country."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmISIN
	 * SecurityIdentification23Choice.mmISIN}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmISIN = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> SecurityIdentification25Choice.mmObject();
			isDerived = false;
			xmlTag = "ISIN";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISIN";
			definition = "International Securities Identification Number (ISIN). A numbering system designed by the United Nation's International Organisation for Standardisation (ISO). The ISIN is composed of a 2-character prefix representing the country of issue, followed by the national security number (if one exists), and a check digit. Each country has a national numbering agency that assigns ISIN numbers for securities in that country.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.SecurityIdentification23Choice.mmISIN;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}
	};
	protected SEDOLIdentifier sEDOL;
	/**
	 * Stock Exchange Daily Official List (SEDOL) number. A code used by the
	 * London Stock Exchange to identify foreign stocks, especially those that
	 * aren't actively traded in the US and don't have a CUSIP number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SEDOLIdentifier
	 * SEDOLIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSEDOL
	 * SecuritiesIdentification.mmSEDOL}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
	 * SecurityIdentification25Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SEDOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SEDOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Stock Exchange Daily Official List (SEDOL) number.  A code used by the London Stock Exchange to identify foreign stocks, especially those that aren't actively traded in the US and don't have a CUSIP number."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmSEDOL
	 * SecurityIdentification23Choice.mmSEDOL}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSEDOL = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmSEDOL;
			componentContext_lazy = () -> SecurityIdentification25Choice.mmObject();
			isDerived = false;
			xmlTag = "SEDOL";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SEDOL";
			definition = "Stock Exchange Daily Official List (SEDOL) number.  A code used by the London Stock Exchange to identify foreign stocks, especially those that aren't actively traded in the US and don't have a CUSIP number.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.SecurityIdentification23Choice.mmSEDOL;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SEDOLIdentifier.mmObject();
		}
	};
	protected CUSIPIdentifier cUSIP;
	/**
	 * Committee on Uniform Securities and Identification Procedures (CUSIP).
	 * The standards body that created and maintains the securities
	 * classification system in the US. The CUSIP is composed of a 9-character
	 * number that uniquely identifies a particular security. Non-US securities
	 * have a similar number called the CINS number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CUSIPIdentifier
	 * CUSIPIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmCUSIP
	 * SecuritiesIdentification.mmCUSIP}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
	 * SecurityIdentification25Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CUSIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CUSIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Committee on Uniform Securities and Identification Procedures (CUSIP). The standards body that created and maintains the securities classification system in the US. The CUSIP is composed of a 9-character number that uniquely identifies a particular security. Non-US securities have a similar number called the CINS number."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmCUSIP
	 * SecurityIdentification23Choice.mmCUSIP}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCUSIP = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmCUSIP;
			componentContext_lazy = () -> SecurityIdentification25Choice.mmObject();
			isDerived = false;
			xmlTag = "CUSIP";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CUSIP";
			definition = "Committee on Uniform Securities and Identification Procedures (CUSIP). The standards body that created and maintains the securities classification system in the US. The CUSIP is composed of a 9-character number that uniquely identifies a particular security. Non-US securities have a similar number called the CINS number.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.SecurityIdentification23Choice.mmCUSIP;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CUSIPIdentifier.mmObject();
		}
	};
	protected RICIdentifier rIC;
	/**
	 * Reuters Identification Code (RIC). A numbering system used within the
	 * Reuters system to identify instruments worldwide. The RIC contains an
	 * X-character market specific code (can be the CUSIP or EPIC codes)
	 * followed by a full stop, then the two-digit ISO country code, for
	 * example, IBM in UK is IBM.UK.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RICIdentifier
	 * RICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmRIC
	 * SecuritiesIdentification.mmRIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
	 * SecurityIdentification25Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reuters Identification Code (RIC). A numbering system used within the Reuters system to identify instruments worldwide. The RIC contains an X-character market specific code (can be the CUSIP or EPIC codes) followed by a full stop, then the two-digit ISO country code, for example, IBM in UK is IBM.UK."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmRIC
	 * SecurityIdentification23Choice.mmRIC}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRIC = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmRIC;
			componentContext_lazy = () -> SecurityIdentification25Choice.mmObject();
			isDerived = false;
			xmlTag = "RIC";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RIC";
			definition = "Reuters Identification Code (RIC). A numbering system used within the Reuters system to identify instruments worldwide. The RIC contains an X-character market specific code (can be the CUSIP or EPIC codes) followed by a full stop, then the two-digit ISO country code, for example, IBM in UK is IBM.UK.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.SecurityIdentification23Choice.mmRIC;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RICIdentifier.mmObject();
		}
	};
	protected TickerIdentifier tickerSymbol;
	/**
	 * Letters that identify a stock traded on a stock exchange. The Ticker
	 * Symbol is a short and convenient way of identifying a stock, for example,
	 * RTR.L for Reuters quoted in London.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TickerIdentifier
	 * TickerIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmTickerSymbol
	 * SecuritiesIdentification.mmTickerSymbol}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
	 * SecurityIdentification25Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TckrSymb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TickerSymbol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Letters that identify a stock traded on a stock exchange. The Ticker Symbol is a short and convenient way of identifying a stock, for example, RTR.L for Reuters quoted in London."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmTickerSymbol
	 * SecurityIdentification23Choice.mmTickerSymbol}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTickerSymbol = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmTickerSymbol;
			componentContext_lazy = () -> SecurityIdentification25Choice.mmObject();
			isDerived = false;
			xmlTag = "TckrSymb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TickerSymbol";
			definition = "Letters that identify a stock traded on a stock exchange. The Ticker Symbol is a short and convenient way of identifying a stock, for example, RTR.L for Reuters quoted in London.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.SecurityIdentification23Choice.mmTickerSymbol;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TickerIdentifier.mmObject();
		}
	};
	protected Bloomberg2Identifier bloomberg;
	/**
	 * Identifier of a security assigned by the Bloomberg organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Bloomberg2Identifier
	 * Bloomberg2Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmBloomberg
	 * SecuritiesIdentification.mmBloomberg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
	 * SecurityIdentification25Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Blmbrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bloomberg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of a security assigned by the Bloomberg organisation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmBloomberg
	 * SecurityIdentification23Choice.mmBloomberg}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBloomberg = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmBloomberg;
			componentContext_lazy = () -> SecurityIdentification25Choice.mmObject();
			isDerived = false;
			xmlTag = "Blmbrg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bloomberg";
			definition = "Identifier of a security assigned by the Bloomberg organisation.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.SecurityIdentification23Choice.mmBloomberg;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Bloomberg2Identifier.mmObject();
		}
	};
	protected ConsolidatedTapeAssociationIdentifier cTA;
	/**
	 * Identifier of a security assigned by the Consolidated Tape Association.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ConsolidatedTapeAssociationIdentifier
	 * ConsolidatedTapeAssociationIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmCTA
	 * SecuritiesIdentification.mmCTA}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
	 * SecurityIdentification25Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of a security assigned by the Consolidated Tape Association."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmCTA
	 * SecurityIdentification23Choice.mmCTA}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCTA = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmCTA;
			componentContext_lazy = () -> SecurityIdentification25Choice.mmObject();
			isDerived = false;
			xmlTag = "CTA";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CTA";
			definition = "Identifier of a security assigned by the Consolidated Tape Association.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.SecurityIdentification23Choice.mmCTA;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConsolidatedTapeAssociationIdentifier.mmObject();
		}
	};
	protected QUICKIdentifier qUICK;
	/**
	 * Identifier of a security assigned by the Japanese QUICK identification
	 * scheme for financial instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.QUICKIdentifier
	 * QUICKIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmQUICK
	 * SecuritiesIdentification.mmQUICK}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
	 * SecurityIdentification25Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QUICK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QUICK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of a security assigned by the Japanese QUICK identification scheme for financial instruments."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmQUICK
	 * SecurityIdentification23Choice.mmQUICK}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQUICK = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmQUICK;
			componentContext_lazy = () -> SecurityIdentification25Choice.mmObject();
			isDerived = false;
			xmlTag = "QUICK";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QUICK";
			definition = "Identifier of a security assigned by the Japanese QUICK identification scheme for financial instruments.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.SecurityIdentification23Choice.mmQUICK;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QUICKIdentifier.mmObject();
		}
	};
	protected WertpapierIdentifier wertpapier;
	/**
	 * Wertpapier Kenn-nummer. A number issued in Germany by the Wertpapier
	 * Mitteilungen. The Wertpapier Kenn-nummer, sometimes called WPK, contains
	 * 6-digits, but no check digit. There are different ranges of numbers
	 * representing different classes of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.WertpapierIdentifier
	 * WertpapierIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmWertpapier
	 * SecuritiesIdentification.mmWertpapier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
	 * SecurityIdentification25Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Wrtppr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Wertpapier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Wertpapier Kenn-nummer.  A number issued in Germany by the Wertpapier Mitteilungen. The Wertpapier Kenn-nummer, sometimes called WPK, contains 6-digits, but no check digit. There are different ranges of numbers representing different classes of securities."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmWertpapier
	 * SecurityIdentification23Choice.mmWertpapier}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWertpapier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmWertpapier;
			componentContext_lazy = () -> SecurityIdentification25Choice.mmObject();
			isDerived = false;
			xmlTag = "Wrtppr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Wertpapier";
			definition = "Wertpapier Kenn-nummer.  A number issued in Germany by the Wertpapier Mitteilungen. The Wertpapier Kenn-nummer, sometimes called WPK, contains 6-digits, but no check digit. There are different ranges of numbers representing different classes of securities.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.SecurityIdentification23Choice.mmWertpapier;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> WertpapierIdentifier.mmObject();
		}
	};
	protected DutchIdentifier dutch;
	/**
	 * Identifier for Dutch securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DutchIdentifier
	 * DutchIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmDutch
	 * SecuritiesIdentification.mmDutch}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
	 * SecurityIdentification25Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dtch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dutch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier for Dutch securities."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmDutch
	 * SecurityIdentification23Choice.mmDutch}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDutch = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmDutch;
			componentContext_lazy = () -> SecurityIdentification25Choice.mmObject();
			isDerived = false;
			xmlTag = "Dtch";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dutch";
			definition = "Identifier for Dutch securities.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.SecurityIdentification23Choice.mmDutch;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DutchIdentifier.mmObject();
		}
	};
	protected ValorenIdentifier valoren;
	/**
	 * Identifier for Swiss securities assigned by Telekurs Financial, the Swiss
	 * numbering agency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ValorenIdentifier
	 * ValorenIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmValoren
	 * SecuritiesIdentification.mmValoren}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
	 * SecurityIdentification25Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vlrn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Valoren"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier for Swiss securities assigned by Telekurs Financial, the Swiss numbering agency."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmValoren
	 * SecurityIdentification23Choice.mmValoren}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValoren = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmValoren;
			componentContext_lazy = () -> SecurityIdentification25Choice.mmObject();
			isDerived = false;
			xmlTag = "Vlrn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Valoren";
			definition = "Identifier for Swiss securities assigned by Telekurs Financial, the Swiss numbering agency.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.SecurityIdentification23Choice.mmValoren;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ValorenIdentifier.mmObject();
		}
	};
	protected SicovamIdentifier sicovam;
	/**
	 * Identifier for French securities assigned by the Societe
	 * Interprofessionnelle Pour La Compensation des Valeurs Mobilieres in
	 * France. The Sicovam is composed of 5-digits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SicovamIdentifier
	 * SicovamIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSicovam
	 * SecuritiesIdentification.mmSicovam}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
	 * SecurityIdentification25Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SCVM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sicovam"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier for French securities assigned by the Societe Interprofessionnelle Pour La Compensation des Valeurs Mobilieres in France. The Sicovam is composed of 5-digits."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmSicovam
	 * SecurityIdentification23Choice.mmSicovam}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSicovam = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmSicovam;
			componentContext_lazy = () -> SecurityIdentification25Choice.mmObject();
			isDerived = false;
			xmlTag = "SCVM";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sicovam";
			definition = "Identifier for French securities assigned by the Societe Interprofessionnelle Pour La Compensation des Valeurs Mobilieres in France. The Sicovam is composed of 5-digits.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.SecurityIdentification23Choice.mmSicovam;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SicovamIdentifier.mmObject();
		}
	};
	protected BelgianIdentifier belgian;
	/**
	 * Identifier for Belgian securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BelgianIdentifier
	 * BelgianIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmBelgian
	 * SecuritiesIdentification.mmBelgian}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
	 * SecurityIdentification25Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Belgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Belgian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier for Belgian securities."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmBelgian
	 * SecurityIdentification23Choice.mmBelgian}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBelgian = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmBelgian;
			componentContext_lazy = () -> SecurityIdentification25Choice.mmObject();
			isDerived = false;
			xmlTag = "Belgn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Belgian";
			definition = "Identifier for Belgian securities.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.SecurityIdentification23Choice.mmBelgian;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BelgianIdentifier.mmObject();
		}
	};
	protected EuroclearClearstreamIdentifier common;
	/**
	 * Identifier of securities issued in Luxembourg. The common code is a
	 * 9-digit code that replaces the CEDEL (Clearstream) and Euroclear codes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.EuroclearClearstreamIdentifier
	 * EuroclearClearstreamIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmCommon
	 * SecuritiesIdentification.mmCommon}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
	 * SecurityIdentification25Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Common"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of securities issued in Luxembourg. The common code is a 9-digit code that replaces the CEDEL (Clearstream) and Euroclear codes."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmCommon
	 * SecurityIdentification23Choice.mmCommon}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCommon = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmCommon;
			componentContext_lazy = () -> SecurityIdentification25Choice.mmObject();
			isDerived = false;
			xmlTag = "Cmon";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Common";
			definition = "Identifier of securities issued in Luxembourg. The common code is a 9-digit code that replaces the CEDEL (Clearstream) and Euroclear codes.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.SecurityIdentification23Choice.mmCommon;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EuroclearClearstreamIdentifier.mmObject();
		}
	};
	protected AlternateSecurityIdentification7 otherProprietaryIdentification;
	/**
	 * Proprietary identification of the security assigned by an institution or
	 * organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification7
	 * AlternateSecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
	 * SecurityIdentification25Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPrtryId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary identification of the security assigned by an institution or organisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmOtherProprietaryIdentification
	 * SecurityIdentification23Choice.mmOtherProprietaryIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherProprietaryIdentification = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> SecurityIdentification25Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrPrtryId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProprietaryIdentification";
			definition = "Proprietary identification of the security assigned by an institution or organisation.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.SecurityIdentification23Choice.mmOtherProprietaryIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AlternateSecurityIdentification7.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification25Choice.mmISIN, com.tools20022.repository.choice.SecurityIdentification25Choice.mmSEDOL,
						com.tools20022.repository.choice.SecurityIdentification25Choice.mmCUSIP, com.tools20022.repository.choice.SecurityIdentification25Choice.mmRIC,
						com.tools20022.repository.choice.SecurityIdentification25Choice.mmTickerSymbol, com.tools20022.repository.choice.SecurityIdentification25Choice.mmBloomberg,
						com.tools20022.repository.choice.SecurityIdentification25Choice.mmCTA, com.tools20022.repository.choice.SecurityIdentification25Choice.mmQUICK,
						com.tools20022.repository.choice.SecurityIdentification25Choice.mmWertpapier, com.tools20022.repository.choice.SecurityIdentification25Choice.mmDutch,
						com.tools20022.repository.choice.SecurityIdentification25Choice.mmValoren, com.tools20022.repository.choice.SecurityIdentification25Choice.mmSicovam,
						com.tools20022.repository.choice.SecurityIdentification25Choice.mmBelgian, com.tools20022.repository.choice.SecurityIdentification25Choice.mmCommon,
						com.tools20022.repository.choice.SecurityIdentification25Choice.mmOtherProprietaryIdentification);
				trace_lazy = () -> SecuritiesIdentification.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecurityIdentification25Choice";
				definition = "Choice of formats for the identification of a financial instrument.";
				previousVersion_lazy = () -> SecurityIdentification23Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ISINOct2015Identifier getISIN() {
		return iSIN;
	}

	public void setISIN(ISINOct2015Identifier iSIN) {
		this.iSIN = iSIN;
	}

	public SEDOLIdentifier getSEDOL() {
		return sEDOL;
	}

	public void setSEDOL(SEDOLIdentifier sEDOL) {
		this.sEDOL = sEDOL;
	}

	public CUSIPIdentifier getCUSIP() {
		return cUSIP;
	}

	public void setCUSIP(CUSIPIdentifier cUSIP) {
		this.cUSIP = cUSIP;
	}

	public RICIdentifier getRIC() {
		return rIC;
	}

	public void setRIC(RICIdentifier rIC) {
		this.rIC = rIC;
	}

	public TickerIdentifier getTickerSymbol() {
		return tickerSymbol;
	}

	public void setTickerSymbol(TickerIdentifier tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
	}

	public Bloomberg2Identifier getBloomberg() {
		return bloomberg;
	}

	public void setBloomberg(Bloomberg2Identifier bloomberg) {
		this.bloomberg = bloomberg;
	}

	public ConsolidatedTapeAssociationIdentifier getCTA() {
		return cTA;
	}

	public void setCTA(ConsolidatedTapeAssociationIdentifier cTA) {
		this.cTA = cTA;
	}

	public QUICKIdentifier getQUICK() {
		return qUICK;
	}

	public void setQUICK(QUICKIdentifier qUICK) {
		this.qUICK = qUICK;
	}

	public WertpapierIdentifier getWertpapier() {
		return wertpapier;
	}

	public void setWertpapier(WertpapierIdentifier wertpapier) {
		this.wertpapier = wertpapier;
	}

	public DutchIdentifier getDutch() {
		return dutch;
	}

	public void setDutch(DutchIdentifier dutch) {
		this.dutch = dutch;
	}

	public ValorenIdentifier getValoren() {
		return valoren;
	}

	public void setValoren(ValorenIdentifier valoren) {
		this.valoren = valoren;
	}

	public SicovamIdentifier getSicovam() {
		return sicovam;
	}

	public void setSicovam(SicovamIdentifier sicovam) {
		this.sicovam = sicovam;
	}

	public BelgianIdentifier getBelgian() {
		return belgian;
	}

	public void setBelgian(BelgianIdentifier belgian) {
		this.belgian = belgian;
	}

	public EuroclearClearstreamIdentifier getCommon() {
		return common;
	}

	public void setCommon(EuroclearClearstreamIdentifier common) {
		this.common = common;
	}

	public AlternateSecurityIdentification7 getOtherProprietaryIdentification() {
		return otherProprietaryIdentification;
	}

	public void setOtherProprietaryIdentification(AlternateSecurityIdentification7 otherProprietaryIdentification) {
		this.otherProprietaryIdentification = otherProprietaryIdentification;
	}
}