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
import com.tools20022.repository.codeset.PhysicalTransferType1Code;
import com.tools20022.repository.codeset.StampDutyType2Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InvestmentFundTax;
import com.tools20022.repository.entity.SecuritiesSettlement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Parameters applied to the settlement of a security transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmRequestedSettlementDate
 * DeliverInformation13.mmRequestedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmSettlementAmount
 * DeliverInformation13.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmStampDuty
 * DeliverInformation13.mmStampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmNetAmount
 * DeliverInformation13.mmNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmSettlementPartiesDetails
 * DeliverInformation13.mmSettlementPartiesDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmChargeDetails
 * DeliverInformation13.mmChargeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmCommissionDetails
 * DeliverInformation13.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmTaxDetails
 * DeliverInformation13.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmForeignExchangeDetails
 * DeliverInformation13.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmPhysicalTransfer
 * DeliverInformation13.mmPhysicalTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmPhysicalTransferDetails
 * DeliverInformation13.mmPhysicalTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmClientReference
 * DeliverInformation13.mmClientReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV05#mmSettlementDetails
 * TransferInInstructionV05.mmSettlementDetails}</li>
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
 * "DeliverInformation13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters applied to the settlement of a security transfer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DeliverInformation15
 * DeliverInformation15}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.DeliverInformation9
 * DeliverInformation9}</li>
 * </ul>
 */
public class DeliverInformation13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate requestedSettlementDate;
	/**
	 * Date and time at which the securities are to be exchanged at the
	 * International Central Securities Depository (ICSD) or Central Securities
	 * Depository (CSD).
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
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13
	 * DeliverInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the securities are to be exchanged at the International Central Securities Depository (ICSD) or Central Securities Depository (CSD)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmRequestedSettlementDate
	 * DeliverInformation15.mmRequestedSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#mmRequestedSettlementDate
	 * DeliverInformation9.mmRequestedSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> DeliverInformation13.mmObject();
			isDerived = false;
			xmlTag = "ReqdSttlmDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDate";
			definition = "Date and time at which the securities are to be exchanged at the International Central Securities Depository (ICSD) or Central Securities Depository (CSD).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation15.mmRequestedSettlementDate);
			previousVersion_lazy = () -> com.tools20022.repository.msg.DeliverInformation9.mmRequestedSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount settlementAmount;
	/**
	 * Total amount of money paid /to be paid or received in exchange for the
	 * financial instrument in the individual order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementAmount
	 * SecuritiesSettlement.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13
	 * DeliverInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money paid /to be paid or received in exchange for the financial instrument in the individual order."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmSettlementAmount
	 * DeliverInformation15.mmSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#mmSettlementAmount
	 * DeliverInformation9.mmSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> DeliverInformation13.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money paid /to be paid or received in exchange for the financial instrument in the individual order.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation15.mmSettlementAmount);
			previousVersion_lazy = () -> com.tools20022.repository.msg.DeliverInformation9.mmSettlementAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected StampDutyType2Code stampDuty;
	/**
	 * Indicates whether the settlement amount includes the stamp duty amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StampDutyType2Code
	 * StampDutyType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmStampDutyType
	 * SecuritiesTax.mmStampDutyType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13
	 * DeliverInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmpDty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDuty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the settlement amount includes the stamp duty amount."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmStampDuty
	 * DeliverInformation15.mmStampDuty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#mmStampDuty
	 * DeliverInformation9.mmStampDuty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStampDuty = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmStampDutyType;
			componentContext_lazy = () -> DeliverInformation13.mmObject();
			isDerived = false;
			xmlTag = "StmpDty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			definition = "Indicates whether the settlement amount includes the stamp duty amount.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation15.mmStampDuty);
			previousVersion_lazy = () -> com.tools20022.repository.msg.DeliverInformation9.mmStampDuty;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> StampDutyType2Code.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount netAmount;
	/**
	 * Deal amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeAmount
	 * SecuritiesTrade.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13
	 * DeliverInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deal amount."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmNetAmount
	 * DeliverInformation15.mmNetAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#mmNetAmount
	 * DeliverInformation9.mmNetAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmTradeAmount;
			componentContext_lazy = () -> DeliverInformation13.mmObject();
			isDerived = false;
			xmlTag = "NetAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			definition = "Deal amount.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation15.mmNetAmount);
			previousVersion_lazy = () -> com.tools20022.repository.msg.DeliverInformation9.mmNetAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected DeliveringPartiesAndAccount9 settlementPartiesDetails;
	/**
	 * Chain of parties involved in the settlement of a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9
	 * DeliveringPartiesAndAccount9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
	 * SecuritiesSettlement.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13
	 * DeliverInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmPtiesDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPartiesDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmSettlementPartiesDetails
	 * DeliverInformation15.mmSettlementPartiesDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#mmSettlementPartiesDetails
	 * DeliverInformation9.mmSettlementPartiesDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementPartiesDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmPartyRole;
			componentContext_lazy = () -> DeliverInformation13.mmObject();
			isDerived = false;
			xmlTag = "SttlmPtiesDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPartiesDetails";
			definition = "Chain of parties involved in the settlement of a transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation15.mmSettlementPartiesDetails);
			previousVersion_lazy = () -> com.tools20022.repository.msg.DeliverInformation9.mmSettlementPartiesDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount9.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Charge20> chargeDetails;
	/**
	 * Charge related to the transfer of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge20 Charge20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmFees
	 * Security.mmFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13
	 * DeliverInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge related to the transfer of a financial instrument."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmChargeDetails
	 * DeliverInformation15.mmChargeDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#mmChargeDetails
	 * DeliverInformation9.mmChargeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChargeDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.mmFees;
			componentContext_lazy = () -> DeliverInformation13.mmObject();
			isDerived = false;
			xmlTag = "ChrgDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeDetails";
			definition = "Charge related to the transfer of a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation15.mmChargeDetails);
			previousVersion_lazy = () -> com.tools20022.repository.msg.DeliverInformation9.mmChargeDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Charge20.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Commission17> commissionDetails;
	/**
	 * Commission related to the transfer of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Commission17
	 * Commission17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeCommission
	 * Trade.mmTradeCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13
	 * DeliverInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission related to the transfer of a financial instrument."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmCommissionDetails
	 * DeliverInformation15.mmCommissionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#mmCommissionDetails
	 * DeliverInformation9.mmCommissionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommissionDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Trade.mmTradeCommission;
			componentContext_lazy = () -> DeliverInformation13.mmObject();
			isDerived = false;
			xmlTag = "ComssnDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDetails";
			definition = "Commission related to the transfer of a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation15.mmCommissionDetails);
			previousVersion_lazy = () -> com.tools20022.repository.msg.DeliverInformation9.mmCommissionDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Commission17.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Tax21> taxDetails;
	/**
	 * Tax related to the transfer of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax21 Tax21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13
	 * DeliverInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax related to the transfer of a financial instrument."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmTaxDetails
	 * DeliverInformation15.mmTaxDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#mmTaxDetails
	 * DeliverInformation9.mmTaxDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> DeliverInformation13.mmObject();
			isDerived = false;
			xmlTag = "TaxDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDetails";
			definition = "Tax related to the transfer of a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation15.mmTaxDetails);
			previousVersion_lazy = () -> com.tools20022.repository.msg.DeliverInformation9.mmTaxDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Tax21.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ForeignExchangeTerms7> foreignExchangeDetails;
	/**
	 * Specifies foreign exchange details applied to the payment of charges,
	 * taxes and commissions as a result of the transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7
	 * ForeignExchangeTerms7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
	 * ForeignExchangeTrade.mmAgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13
	 * DeliverInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies foreign exchange details applied to the payment of charges, taxes and commissions as a result of the transfer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmForeignExchangeDetails
	 * DeliverInformation15.mmForeignExchangeDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmForeignExchangeDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmAgreedRate;
			componentContext_lazy = () -> DeliverInformation13.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Specifies foreign exchange details applied to the payment of charges, taxes and commissions as a result of the transfer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation15.mmForeignExchangeDetails);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms7.mmObject();
		}
	};
	protected PhysicalTransferType1Code physicalTransfer;
	/**
	 * Indicates whether the financial instrument is to be physically delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferType1Code
	 * PhysicalTransferType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmType
	 * PhysicalDelivery.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13
	 * DeliverInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysTrf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the financial instrument is to be physically delivered."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmPhysicalTransfer
	 * DeliverInformation15.mmPhysicalTransfer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#mmPhysicalTransfer
	 * DeliverInformation9.mmPhysicalTransfer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPhysicalTransfer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.mmType;
			componentContext_lazy = () -> DeliverInformation13.mmObject();
			isDerived = false;
			xmlTag = "PhysTrf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransfer";
			definition = "Indicates whether the financial instrument is to be physically delivered.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation15.mmPhysicalTransfer);
			previousVersion_lazy = () -> com.tools20022.repository.msg.DeliverInformation9.mmPhysicalTransfer;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PhysicalTransferType1Code.mmObject();
		}
	};
	protected DeliveryParameters4 physicalTransferDetails;
	/**
	 * Parameters of a physical delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DeliveryParameters4
	 * DeliveryParameters4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmPhysicalDelivery
	 * SecuritiesTransfer.mmPhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13
	 * DeliverInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysTrfDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters of a physical delivery."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmPhysicalTransferDetails
	 * DeliverInformation15.mmPhysicalTransferDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#mmPhysicalTransferDetails
	 * DeliverInformation9.mmPhysicalTransferDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPhysicalTransferDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmPhysicalDelivery;
			componentContext_lazy = () -> DeliverInformation13.mmObject();
			isDerived = false;
			xmlTag = "PhysTrfDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetails";
			definition = "Parameters of a physical delivery.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation15.mmPhysicalTransferDetails);
			previousVersion_lazy = () -> com.tools20022.repository.msg.DeliverInformation9.mmPhysicalTransferDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DeliveryParameters4.mmObject();
		}
	};
	protected Max35Text clientReference;
	/**
	 * Unique and unambiguous investor's identification of a transfer. This
	 * reference can typically be used in a hub scenario to give the reference
	 * of the transfer as assigned by the underlying client.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmClientReference
	 * InvestmentFundTransaction.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13
	 * DeliverInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous investor's identification of a transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmClientReference
	 * DeliverInformation15.mmClientReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> DeliverInformation13.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of a transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation15.mmClientReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation13.mmRequestedSettlementDate, com.tools20022.repository.msg.DeliverInformation13.mmSettlementAmount,
						com.tools20022.repository.msg.DeliverInformation13.mmStampDuty, com.tools20022.repository.msg.DeliverInformation13.mmNetAmount, com.tools20022.repository.msg.DeliverInformation13.mmSettlementPartiesDetails,
						com.tools20022.repository.msg.DeliverInformation13.mmChargeDetails, com.tools20022.repository.msg.DeliverInformation13.mmCommissionDetails, com.tools20022.repository.msg.DeliverInformation13.mmTaxDetails,
						com.tools20022.repository.msg.DeliverInformation13.mmForeignExchangeDetails, com.tools20022.repository.msg.DeliverInformation13.mmPhysicalTransfer,
						com.tools20022.repository.msg.DeliverInformation13.mmPhysicalTransferDetails, com.tools20022.repository.msg.DeliverInformation13.mmClientReference);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.TransferInInstructionV05.mmSettlementDetails);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DeliverInformation13";
				definition = "Parameters applied to the settlement of a security transfer.";
				nextVersions_lazy = () -> Arrays.asList(DeliverInformation15.mmObject());
				previousVersion_lazy = () -> DeliverInformation9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getRequestedSettlementDate() {
		return requestedSettlementDate;
	}

	public void setRequestedSettlementDate(ISODate requestedSettlementDate) {
		this.requestedSettlementDate = requestedSettlementDate;
	}

	public ActiveCurrencyAndAmount getSettlementAmount() {
		return settlementAmount;
	}

	public void setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	public StampDutyType2Code getStampDuty() {
		return stampDuty;
	}

	public void setStampDuty(StampDutyType2Code stampDuty) {
		this.stampDuty = stampDuty;
	}

	public ActiveCurrencyAndAmount getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(ActiveCurrencyAndAmount netAmount) {
		this.netAmount = netAmount;
	}

	public DeliveringPartiesAndAccount9 getSettlementPartiesDetails() {
		return settlementPartiesDetails;
	}

	public void setSettlementPartiesDetails(com.tools20022.repository.msg.DeliveringPartiesAndAccount9 settlementPartiesDetails) {
		this.settlementPartiesDetails = settlementPartiesDetails;
	}

	public List<Charge20> getChargeDetails() {
		return chargeDetails;
	}

	public void setChargeDetails(List<com.tools20022.repository.msg.Charge20> chargeDetails) {
		this.chargeDetails = chargeDetails;
	}

	public List<Commission17> getCommissionDetails() {
		return commissionDetails;
	}

	public void setCommissionDetails(List<com.tools20022.repository.msg.Commission17> commissionDetails) {
		this.commissionDetails = commissionDetails;
	}

	public List<Tax21> getTaxDetails() {
		return taxDetails;
	}

	public void setTaxDetails(List<com.tools20022.repository.msg.Tax21> taxDetails) {
		this.taxDetails = taxDetails;
	}

	public List<ForeignExchangeTerms7> getForeignExchangeDetails() {
		return foreignExchangeDetails;
	}

	public void setForeignExchangeDetails(List<com.tools20022.repository.msg.ForeignExchangeTerms7> foreignExchangeDetails) {
		this.foreignExchangeDetails = foreignExchangeDetails;
	}

	public PhysicalTransferType1Code getPhysicalTransfer() {
		return physicalTransfer;
	}

	public void setPhysicalTransfer(PhysicalTransferType1Code physicalTransfer) {
		this.physicalTransfer = physicalTransfer;
	}

	public DeliveryParameters4 getPhysicalTransferDetails() {
		return physicalTransferDetails;
	}

	public void setPhysicalTransferDetails(com.tools20022.repository.msg.DeliveryParameters4 physicalTransferDetails) {
		this.physicalTransferDetails = physicalTransferDetails;
	}

	public Max35Text getClientReference() {
		return clientReference;
	}

	public void setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
	}
}