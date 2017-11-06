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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.ISOYearMonth;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the implementation and version.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MarketPracticeVersion1#mmName
 * MarketPracticeVersion1.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketPracticeVersion1#mmDate
 * MarketPracticeVersion1.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1#mmNumber
 * MarketPracticeVersion1.mmNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmMarketPracticeVersion
 * AccountDetailsConfirmationV04.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmMarketPracticeVersion
 * AccountModificationInstructionV04.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmMarketPracticeVersion
 * AccountOpeningInstructionV04.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV05#mmMarketPracticeVersion
 * ReversalOfTransferInConfirmationV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV05#mmMarketPracticeVersion
 * TransferInConfirmationV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV04#mmMarketPracticeVersion
 * TransferInstructionStatusReportV04.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmMarketPracticeVersion
 * AccountHoldingInformationRequestV03.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV05#mmMarketPracticeVersion
 * TransferOutInstructionV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmMarketPracticeVersion
 * AccountHoldingInformationV04.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05#mmMarketPracticeVersion
 * PortfolioTransferCancellationRequestV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV04#mmMarketPracticeVersion
 * TransferCancellationStatusReportV04.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#mmMarketPracticeVersion
 * PortfolioTransferInstructionV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV05#mmMarketPracticeVersion
 * TransferInInstructionV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV05#mmMarketPracticeVersion
 * TransferInCancellationRequestV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmMarketPracticeVersion
 * PortfolioTransferConfirmationV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV05#mmMarketPracticeVersion
 * TransferOutConfirmationV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV04#mmMarketPracticeVersion
 * RequestForTransferStatusReportV04.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV05#mmMarketPracticeVersion
 * ReversalOfTransferOutConfirmationV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV05#mmMarketPracticeVersion
 * TransferOutCancellationRequestV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV04#mmMarketPracticeVersion
 * AccountManagementStatusReportV04.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmMarketPracticeVersion
 * AccountOpeningInstructionV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmMarketPracticeVersion
 * AccountModificationInstructionV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmMarketPracticeVersion
 * AccountDetailsConfirmationV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06#mmMarketPracticeVersion
 * PortfolioTransferCancellationRequestV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmMarketPracticeVersion
 * PortfolioTransferConfirmationV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#mmMarketPracticeVersion
 * PortfolioTransferInstructionV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV06#mmMarketPracticeVersion
 * TransferInInstructionV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV06#mmMarketPracticeVersion
 * TransferOutConfirmationV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV06#mmMarketPracticeVersion
 * TransferOutInstructionV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV06#mmMarketPracticeVersion
 * TransferOutCancellationRequestV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV06#mmMarketPracticeVersion
 * TransferInConfirmationV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV06#mmMarketPracticeVersion
 * ReversalOfTransferOutConfirmationV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV06#mmMarketPracticeVersion
 * TransferInCancellationRequestV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV06#mmMarketPracticeVersion
 * ReversalOfTransferInConfirmationV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#mmMarketPracticeVersion
 * PortfolioTransferInstructionV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV07#mmMarketPracticeVersion
 * ReversalOfTransferOutConfirmationV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV07#mmMarketPracticeVersion
 * TransferOutCancellationRequestV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmMarketPracticeVersion
 * AccountHoldingInformationV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV07#mmMarketPracticeVersion
 * PortfolioTransferCancellationRequestV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV05#mmMarketPracticeVersion
 * TransferInstructionStatusReportV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#mmMarketPracticeVersion
 * TransferInConfirmationV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmMarketPracticeVersion
 * AccountOpeningInstructionV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV07#mmMarketPracticeVersion
 * TransferOutConfirmationV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV05#mmMarketPracticeVersion
 * RequestForTransferStatusReportV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmMarketPracticeVersion
 * AccountDetailsConfirmationV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV07#mmMarketPracticeVersion
 * TransferInCancellationRequestV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmMarketPracticeVersion
 * PortfolioTransferConfirmationV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV05#mmMarketPracticeVersion
 * TransferCancellationStatusReportV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV07#mmMarketPracticeVersion
 * TransferOutInstructionV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV05#mmMarketPracticeVersion
 * AccountManagementStatusReportV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmMarketPracticeVersion
 * AccountModificationInstructionV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV07#mmMarketPracticeVersion
 * TransferInInstructionV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmMarketPracticeVersion
 * AccountHoldingInformationRequestV04.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV07#mmMarketPracticeVersion
 * ReversalOfTransferInConfirmationV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmMarketPracticeVersion
 * AccountDetailsConfirmationV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmMarketPracticeVersion
 * AccountModificationInstructionV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmMarketPracticeVersion
 * AccountOpeningInstructionV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV06#mmMarketPracticeVersion
 * AccountManagementStatusReportV06.mmMarketPracticeVersion}</li>
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
 * "MarketPracticeVersion1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the implementation and version."</li>
 * </ul>
 */
public class MarketPracticeVersion1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text name;
	/**
	 * Market practice, for example, “UKTRANSFERS”, “FINDELSLT”.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market practice, for example, “UKTRANSFERS”, “FINDELSLT”."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MarketPracticeVersion1.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Market practice, for example, “UKTRANSFERS”, “FINDELSLT”.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISOYearMonth date;
	/**
	 * Year and month, for example, 2013-06
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Year and month, for example, 2013-06"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MarketPracticeVersion1.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Year and month, for example, 2013-06";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}
	};
	protected Max35Text number;
	/**
	 * Version of the market practice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the market practice."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MarketPracticeVersion1.mmObject();
			isDerived = false;
			xmlTag = "Nb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Number";
			definition = "Version of the market practice.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MarketPracticeVersion1.mmName, com.tools20022.repository.msg.MarketPracticeVersion1.mmDate,
						com.tools20022.repository.msg.MarketPracticeVersion1.mmNumber);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04.mmMarketPracticeVersion,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV04.mmMarketPracticeVersion, com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV05.mmMarketPracticeVersion, com.tools20022.repository.area.sese.TransferInConfirmationV05.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferInstructionStatusReportV04.mmMarketPracticeVersion, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferOutInstructionV05.mmMarketPracticeVersion, com.tools20022.repository.area.sese.AccountHoldingInformationV04.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05.mmMarketPracticeVersion, com.tools20022.repository.area.sese.TransferCancellationStatusReportV04.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV05.mmMarketPracticeVersion, com.tools20022.repository.area.sese.TransferInInstructionV05.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferInCancellationRequestV05.mmMarketPracticeVersion, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferOutConfirmationV05.mmMarketPracticeVersion, com.tools20022.repository.area.sese.RequestForTransferStatusReportV04.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV05.mmMarketPracticeVersion, com.tools20022.repository.area.sese.TransferOutCancellationRequestV05.mmMarketPracticeVersion,
						com.tools20022.repository.area.acmt.AccountManagementStatusReportV04.mmMarketPracticeVersion, com.tools20022.repository.area.acmt.AccountOpeningInstructionV05.mmMarketPracticeVersion,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV05.mmMarketPracticeVersion, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06.mmMarketPracticeVersion, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV06.mmMarketPracticeVersion, com.tools20022.repository.area.sese.TransferInInstructionV06.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferOutConfirmationV06.mmMarketPracticeVersion, com.tools20022.repository.area.sese.TransferOutInstructionV06.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferOutCancellationRequestV06.mmMarketPracticeVersion, com.tools20022.repository.area.sese.TransferInConfirmationV06.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV06.mmMarketPracticeVersion, com.tools20022.repository.area.sese.TransferInCancellationRequestV06.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV06.mmMarketPracticeVersion, com.tools20022.repository.area.sese.PortfolioTransferInstructionV07.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV07.mmMarketPracticeVersion, com.tools20022.repository.area.sese.TransferOutCancellationRequestV07.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmMarketPracticeVersion, com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV07.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferInstructionStatusReportV05.mmMarketPracticeVersion, com.tools20022.repository.area.sese.TransferInConfirmationV07.mmMarketPracticeVersion,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.mmMarketPracticeVersion, com.tools20022.repository.area.sese.TransferOutConfirmationV07.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.RequestForTransferStatusReportV05.mmMarketPracticeVersion, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferInCancellationRequestV07.mmMarketPracticeVersion, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferCancellationStatusReportV05.mmMarketPracticeVersion, com.tools20022.repository.area.sese.TransferOutInstructionV07.mmMarketPracticeVersion,
						com.tools20022.repository.area.acmt.AccountManagementStatusReportV05.mmMarketPracticeVersion, com.tools20022.repository.area.acmt.AccountModificationInstructionV06.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferInInstructionV07.mmMarketPracticeVersion, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV07.mmMarketPracticeVersion, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.mmMarketPracticeVersion,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV07.mmMarketPracticeVersion, com.tools20022.repository.area.acmt.AccountOpeningInstructionV07.mmMarketPracticeVersion,
						com.tools20022.repository.area.acmt.AccountManagementStatusReportV06.mmMarketPracticeVersion);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MarketPracticeVersion1";
				definition = "Identifies the implementation and version.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getName() {
		return name;
	}

	public void setName(Max35Text name) {
		this.name = name;
	}

	public ISOYearMonth getDate() {
		return date;
	}

	public void setDate(ISOYearMonth date) {
		this.date = date;
	}

	public Max35Text getNumber() {
		return number;
	}

	public void setNumber(Max35Text number) {
		this.number = number;
	}
}