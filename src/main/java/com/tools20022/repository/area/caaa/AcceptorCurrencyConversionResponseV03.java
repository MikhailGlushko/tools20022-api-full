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

package com.tools20022.repository.area.caaa;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.AcceptortoAcquirerCardTransactionLatestVersion;
import com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3;
import com.tools20022.repository.msg.ContentInformationType15;
import com.tools20022.repository.msg.Header30;
import com.tools20022.repository.msgset.CAPEAcceptortoAcquirerMaintenance20152016;
import com.tools20022.repository.msgset.CardPaymentsExchangesAcceptortoAcquirerISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The AcceptorCurrencyConversionResponse message is sent by currency conversion
 * service provider to the card acceptor to return the result of a potential
 * currency conversion for the cardholder.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AcceptortoAcquirerCardTransactionLatestVersion
 * AcceptortoAcquirerCardTransactionLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CardPaymentsExchangesAcceptortoAcquirerISOLatestversion
 * CardPaymentsExchangesAcceptortoAcquirerISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CAPEAcceptortoAcquirerMaintenance20152016
 * CAPEAcceptortoAcquirerMaintenance20152016}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AccptrCcyConvsRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV03#mmHeader
 * AcceptorCurrencyConversionResponseV03.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV03#mmCurrencyConversionResponse
 * AcceptorCurrencyConversionResponseV03.mmCurrencyConversionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV03#mmSecurityTrailer
 * AcceptorCurrencyConversionResponseV03.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caaa.017.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorCurrencyConversionResponseV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AcceptorCurrencyConversionResponse message is sent by currency conversion service provider to the card acceptor to return the result of a potential currency conversion for the cardholder.\r\n"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV04
 * AcceptorCurrencyConversionResponseV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV02
 * AcceptorCurrencyConversionResponseV02}</li>
 * </ul>
 */
public class AcceptorCurrencyConversionResponseV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Header30 header;
	/**
	 * Currency conversion response message management information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header30
	 * Header30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency conversion response message management information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV04#mmHeader
	 * AcceptorCurrencyConversionResponseV04.mmHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV02#mmHeader
	 * AcceptorCurrencyConversionResponseV02.mmHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Currency conversion response message management information.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV04.mmHeader);
			previousVersion_lazy = () -> com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV02.mmHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header30.mmObject();
		}
	};
	protected AcceptorCurrencyConversionResponse3 currencyConversionResponse;
	/**
	 * Information related to the outcome of the currency conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3
	 * AcceptorCurrencyConversionResponse3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyConvsRspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the outcome of the currency conversion."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV04#mmCurrencyConversionResponse
	 * AcceptorCurrencyConversionResponseV04.mmCurrencyConversionResponse}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV02#mmCurrencyConversionResponse
	 * AcceptorCurrencyConversionResponseV02.mmCurrencyConversionResponse}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCurrencyConversionResponse = new MMMessageBuildingBlock() {
		{
			xmlTag = "CcyConvsRspn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionResponse";
			definition = "Information related to the outcome of the currency conversion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV04.mmCurrencyConversionResponse);
			previousVersion_lazy = () -> com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV02.mmCurrencyConversionResponse;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcceptorCurrencyConversionResponse3.mmObject();
		}
	};
	protected ContentInformationType15 securityTrailer;
	/**
	 * Trailer of the message containing a MAC (message authentication code).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType15
	 * ContentInformationType15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyTrlr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trailer of the message containing a MAC (message authentication code)."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV04#mmSecurityTrailer
	 * AcceptorCurrencyConversionResponseV04.mmSecurityTrailer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV02#mmSecurityTrailer
	 * AcceptorCurrencyConversionResponseV02.mmSecurityTrailer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecurityTrailer = new MMMessageBuildingBlock() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC (message authentication code).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV04.mmSecurityTrailer);
			previousVersion_lazy = () -> com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV02.mmSecurityTrailer;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType15.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AcceptorCurrencyConversionResponseV03";
				definition = "The AcceptorCurrencyConversionResponse message is sent by currency conversion service provider to the card acceptor to return the result of a potential currency conversion for the cardholder.\r\n";
				nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionResponseV04.mmObject());
				previousVersion_lazy = () -> AcceptorCurrencyConversionResponseV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(CardPaymentsExchangesAcceptortoAcquirerISOLatestversion.mmObject(), CAPEAcceptortoAcquirerMaintenance20152016.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrCcyConvsRspn";
				businessArea_lazy = () -> AcceptortoAcquirerCardTransactionLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV03.mmHeader,
						com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV03.mmCurrencyConversionResponse, com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV03.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caaa";
						messageFunctionality = "017";
						version = "03";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public Header30 getHeader() {
		return header;
	}

	public void setHeader(Header30 header) {
		this.header = header;
	}

	public AcceptorCurrencyConversionResponse3 getCurrencyConversionResponse() {
		return currencyConversionResponse;
	}

	public void setCurrencyConversionResponse(AcceptorCurrencyConversionResponse3 currencyConversionResponse) {
		this.currencyConversionResponse = currencyConversionResponse;
	}

	public ContentInformationType15 getSecurityTrailer() {
		return securityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType15 securityTrailer) {
		this.securityTrailer = securityTrailer;
	}
}