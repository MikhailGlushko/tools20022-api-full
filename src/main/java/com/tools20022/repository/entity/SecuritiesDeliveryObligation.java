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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.SettlementDateCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Obligation;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Obligation for one party to deliver securities to another party.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesDeliveryObligation"
 * src="doc-files/SecuritiesDeliveryObligation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmCCPEligibility
 * SecuritiesDeliveryObligation.mmCCPEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmNettingEligibility
 * SecuritiesDeliveryObligation.mmNettingEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmTransferInstructionDate
 * SecuritiesDeliveryObligation.mmTransferInstructionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmTransferCurrency
 * SecuritiesDeliveryObligation.mmTransferCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmRelatedCorporateAction
 * SecuritiesDeliveryObligation.mmRelatedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmRelatedCollateralMovement
 * SecuritiesDeliveryObligation.mmRelatedCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmSecuritiesTradeExecution
 * SecuritiesDeliveryObligation.mmSecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmRelatedPortfolioTransfer
 * SecuritiesDeliveryObligation.mmRelatedPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmSecuritiesTransfer
 * SecuritiesDeliveryObligation.mmSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmSettlementInstructionGeneration
 * SecuritiesDeliveryObligation.mmSettlementInstructionGeneration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmSettlementDateCode
 * SecuritiesDeliveryObligation.mmSettlementDateCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmSecuritiesLending
 * SecuritiesDeliveryObligation.mmSecuritiesLending}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmSecuritiesDeliveryObligation
 * SecuritiesTransfer.mmSecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmSecuritiesDeliveryObligation
 * PortfolioTransfer.mmSecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesDeliveryObligation
 * SecuritiesTradeExecution.mmSecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmSecuritiesProceedsMovement
 * CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmSecuritiesDeliveryObligation
 * SecuritiesLending.mmSecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmSecuritiesCollateralMovement
 * CollateralMovement.mmSecuritiesCollateralMovement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Obligation
 * Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.NettingEligibility1Choice
 * NettingEligibility1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.NettingEligibility2Choice
 * NettingEligibility2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.NettingEligibility3Choice
 * NettingEligibility3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.NettingEligibility4Choice
 * NettingEligibility4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.NettingEligibility5Choice
 * NettingEligibility5Choice}</li>
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
 * "SecuritiesDeliveryObligation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Obligation for one party to deliver securities to another party."</li>
 * </ul>
 */
public class SecuritiesDeliveryObligation extends Obligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator cCPEligibility;
	/**
	 * Specifies whether the settlement transaction is CCP (Central
	 * Counterparty) eligible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmCCPEligibility
	 * SettlementDetails50.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmCCPEligibility
	 * SettlementDetails51.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#mmCCPEligibility
	 * SettlementDetails9.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#mmCCPEligibility
	 * SettlementDetails17.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#mmCCPEligibility
	 * SettlementDetails30.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#mmCCPEligibility
	 * SettlementDetails32.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#mmCCPEligibility
	 * SettlementDetails60.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#mmCCPEligibility
	 * SettlementDetails64.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#mmCCPEligibility
	 * SettlementDetails3.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#mmCCPEligibility
	 * SettlementDetails16.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#mmCCPEligibility
	 * SettlementDetails31.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#mmCCPEligibility
	 * SettlementDetails40.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmCCPEligibility
	 * SettlementDetails62.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#mmCCPEligibility
	 * SettlementDetails63.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmCCPEligibility
	 * SettlementDetails6.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmCCPEligibility
	 * SettlementDetails20.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmCCPEligibility
	 * SettlementDetails24.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmCCPEligibility
	 * SettlementDetails33.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmCCPEligibility
	 * SettlementDetails45.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmCCPEligibility
	 * SettlementDetails54.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmCCPEligibility
	 * SettlementDetails1.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmCCPEligibility
	 * SettlementDetails19.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmCCPEligibility
	 * SettlementDetails22.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmCCPEligibility
	 * SettlementDetails35.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmCCPEligibility
	 * SettlementDetails42.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmCCPEligibility
	 * SettlementDetails52.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmCCPEligibility
	 * SettlementDetails8.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmCCPEligibility
	 * SettlementDetails11.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmCCPEligibility
	 * SettlementDetails23.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmCCPEligibility
	 * SettlementDetails37.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmCCPEligibility
	 * SettlementDetails44.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmCCPEligibility
	 * SettlementDetails53.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#mmCCPEligibility
	 * SettlementDetails7.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#mmCCPEligibility
	 * SettlementDetails12.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#mmCCPEligibility
	 * SettlementDetails28.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#mmCCPEligibility
	 * SettlementDetails38.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#mmCCPEligibility
	 * SettlementDetails47.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#mmCCPEligibility
	 * SettlementDetails56.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#mmCCPEligibility
	 * SettlementDetails2.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#mmCCPEligibility
	 * SettlementDetails13.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#mmCCPEligibility
	 * SettlementDetails27.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#mmCCPEligibility
	 * SettlementDetails39.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#mmCCPEligibility
	 * SettlementDetails48.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#mmCCPEligibility
	 * SettlementDetails57.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmCCPEligibility
	 * SettlementDetails43.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#mmCCPEligibility
	 * SettlementDetails10.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#mmCCPEligibility
	 * SettlementDetails29.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#mmCCPEligibility
	 * SettlementDetails5.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmCCPEligibility
	 * SettlementDetails26.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#mmCCPEligibility
	 * SettlementDetails65.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#mmCCPEligibility
	 * SettlementDetails14.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#mmCCPEligibility
	 * SettlementDetails41.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#mmCCPEligibility
	 * SettlementDetails61.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#mmCCPEligibility
	 * SettlementDetails59.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#mmCCPEligibility
	 * SettlementDetails15.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmCCPEligibility
	 * SettlementDetails36.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#mmCCPEligibility
	 * SettlementDetails66.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmCCPEligibility
	 * SettlementDetails67.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmCCPEligibility
	 * SettlementDetails70.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmCCPEligibility
	 * SettlementDetails68.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmCCPEligibility
	 * SettlementDetails69.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#mmCCPEligibility
	 * SettlementDetails71.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmCCPEligibility
	 * SettlementDetails72.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#mmCCPEligibility
	 * SettlementDetails75.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#mmCCPEligibility
	 * SettlementDetails73.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#mmCCPEligibility
	 * SettlementDetails74.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmCCPEligibility
	 * SettlementDetails81.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#mmCCPEligibility
	 * SettlementDetails76.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmCCPEligibility
	 * SettlementDetails80.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#mmCCPEligibility
	 * SettlementDetails78.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#mmCCPEligibility
	 * SettlementDetails77.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#mmCCPEligibility
	 * SettlementDetails79.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#mmCCPEligibility
	 * SettlementDetails87.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmCCPEligibility
	 * SettlementDetails83.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#mmCCPEligibility
	 * SettlementDetails86.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmCCPEligibility
	 * SettlementDetails85.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmCCPEligibility
	 * SettlementDetails93.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmCCPEligibility
	 * SettlementDetails90.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmCCPEligibility
	 * SettlementDetails96.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmCCPEligibility
	 * SettlementDetails97.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmCCPEligibility
	 * SettlementDetails94.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmCCPEligibility
	 * SettlementDetails95.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#mmCCPEligibility
	 * SettlementDetails91.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#mmCCPEligibility
	 * SettlementDetails92.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmCCPEligibility
	 * SettlementDetails98.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmCCPEligibility
	 * SettlementDetails101.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#mmCCPEligibility
	 * SettlementDetails105.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#mmCCPEligibility
	 * SettlementDetails106.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#mmCCPEligibility
	 * SettlementDetails104.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmCCPEligibility
	 * SettlementDetails111.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmCCPEligibility
	 * SettlementDetails112.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmCCPEligibility
	 * SettlementDetails110.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#mmCCPEligibility
	 * SettlementDetails107.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmCCPEligibility
	 * SettlementDetails115.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#mmCCPEligibility
	 * SettlementDetails117.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#mmCCPEligibility
	 * SettlementDetails116.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmCCPEligibility
	 * SettlementDetails113.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmCCPEligibility
	 * SettlementDetails128.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmCCPEligibility
	 * SettlementDetails120.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmCCPEligibility
	 * SettlementDetails119.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmCCPEligibility
	 * SettlementDetails126.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmCCPEligibility
	 * SettlementDetails122.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmCCPEligibility
	 * SettlementDetails127.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmCCPEligibility
	 * SettlementDetails121.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmCCPEligibility
	 * SettlementDetails134.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmCCPEligibility
	 * SettlementDetails137.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmCCPEligibility
	 * SettlementDetails132.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmCCPEligibility
	 * SettlementDetails138.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#mmCCPEligibility
	 * SettlementDetails130.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmCCPEligibility
	 * SettlementDetails133.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#mmCCPEligibility
	 * SettlementDetails139.mmCCPEligibility}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCCPEligibility = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails50.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails51.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails9.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails17.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails30.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails32.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails60.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails64.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails3.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails16.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails31.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails40.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails62.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails63.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails6.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails20.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails24.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails33.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails45.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails54.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails1.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails19.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails22.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails35.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails42.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails52.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails8.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails11.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails23.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails37.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails44.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails53.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails7.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails12.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails28.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails38.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails47.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails56.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails2.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails13.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails27.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails39.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails48.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails57.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails43.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails10.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails29.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails5.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails26.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails65.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails14.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails41.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails61.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails59.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails15.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails36.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails66.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails67.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails70.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails68.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails69.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails71.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails72.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails75.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails73.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails74.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails81.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails76.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails80.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails78.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails77.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails79.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails87.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails83.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails86.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails85.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails93.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails90.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails96.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails97.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails94.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails95.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails91.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails92.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails98.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails101.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails105.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails106.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails104.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails111.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails112.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails110.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails107.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails115.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails117.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails116.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails113.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails128.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails120.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails119.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails126.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails122.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails127.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails121.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails134.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails137.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails132.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails138.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails130.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails133.mmCCPEligibility,
					com.tools20022.repository.msg.SettlementDetails139.mmCCPEligibility);
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CCPEligibility";
			definition = "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator nettingEligibility;
	/**
	 * Specifies whether the settlement transaction is eligible for netting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NettingEligibility1Choice#mmIndicator
	 * NettingEligibility1Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmNettingEligibility
	 * SettlementDetails50.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NettingEligibility2Choice#mmIndicator
	 * NettingEligibility2Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmNettingEligibility
	 * SettlementDetails51.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#mmNettingEligibility
	 * SettlementDetails9.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#mmNettingEligibility
	 * SettlementDetails17.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#mmNettingEligibility
	 * SettlementDetails30.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#mmNettingEligibility
	 * SettlementDetails32.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#mmNettingEligibility
	 * SettlementDetails60.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#mmNettingEligibility
	 * SettlementDetails64.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#mmNettingEligibility
	 * SettlementDetails3.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#mmNettingEligibility
	 * SettlementDetails16.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#mmNettingEligibility
	 * SettlementDetails31.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#mmNettingEligibility
	 * SettlementDetails40.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmNettingEligibility
	 * SettlementDetails62.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#mmNettingEligibility
	 * SettlementDetails63.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmNettingEligibility
	 * SettlementDetails6.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmNettingEligibility
	 * SettlementDetails20.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmNettingEligibility
	 * SettlementDetails24.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmNettingEligibility
	 * SettlementDetails33.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmNettingEligibility
	 * SettlementDetails45.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmNettingEligibility
	 * SettlementDetails54.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmNettingEligibility
	 * SettlementDetails1.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmNettingEligibility
	 * SettlementDetails19.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmNettingEligibility
	 * SettlementDetails22.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmNettingEligibility
	 * SettlementDetails35.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmNettingEligibility
	 * SettlementDetails42.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmNettingEligibility
	 * SettlementDetails52.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmNettingEligibility
	 * SettlementDetails8.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmNettingEligibility
	 * SettlementDetails11.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmNettingEligibility
	 * SettlementDetails23.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmNettingEligibility
	 * SettlementDetails37.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmNettingEligibility
	 * SettlementDetails44.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmNettingEligibility
	 * SettlementDetails53.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#mmNettingEligibility
	 * SettlementDetails7.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#mmNettingEligibility
	 * SettlementDetails12.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#mmNettingEligibility
	 * SettlementDetails28.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#mmNettingEligibility
	 * SettlementDetails38.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#mmNettingEligibility
	 * SettlementDetails47.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#mmNettingEligibility
	 * SettlementDetails56.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#mmNettingEligibility
	 * SettlementDetails2.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#mmNettingEligibility
	 * SettlementDetails13.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#mmNettingEligibility
	 * SettlementDetails27.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#mmNettingEligibility
	 * SettlementDetails39.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#mmNettingEligibility
	 * SettlementDetails48.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#mmNettingEligibility
	 * SettlementDetails57.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NettingEligibility3Choice#mmIndicator
	 * NettingEligibility3Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmNettingEligibility
	 * SettlementDetails43.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#mmNettingEligibility
	 * SettlementDetails10.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#mmNettingEligibility
	 * SettlementDetails29.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#mmNettingEligibility
	 * SettlementDetails5.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmNettingEligibility
	 * SettlementDetails26.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#mmNettingEligibility
	 * SettlementDetails65.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#mmNettingEligibility
	 * SettlementDetails14.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#mmNettingEligibility
	 * SettlementDetails41.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#mmNettingEligibility
	 * SettlementDetails61.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#mmNettingEligibility
	 * SettlementDetails59.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#mmNettingEligibility
	 * SettlementDetails15.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmNettingEligibility
	 * SettlementDetails36.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#mmNettingEligibility
	 * SettlementDetails66.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmNettingEligibility
	 * SettlementDetails67.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmNettingEligibility
	 * SettlementDetails70.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmNettingEligibility
	 * SettlementDetails68.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmNettingEligibility
	 * SettlementDetails69.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#mmNettingEligibility
	 * SettlementDetails71.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmNettingEligibility
	 * SettlementDetails72.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#mmNettingEligibility
	 * SettlementDetails75.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#mmNettingEligibility
	 * SettlementDetails73.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#mmNettingEligibility
	 * SettlementDetails74.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmNettingEligibility
	 * SettlementDetails81.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#mmNettingEligibility
	 * SettlementDetails76.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmNettingEligibility
	 * SettlementDetails80.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#mmNettingEligibility
	 * SettlementDetails78.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#mmNettingEligibility
	 * SettlementDetails77.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#mmNettingEligibility
	 * SettlementDetails79.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#mmNettingEligibility
	 * SettlementDetails87.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmNettingEligibility
	 * SettlementDetails83.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#mmNettingEligibility
	 * SettlementDetails86.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmNettingEligibility
	 * SettlementDetails85.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmNettingEligibility
	 * SettlementDetails93.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmNettingEligibility
	 * SettlementDetails90.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmNettingEligibility
	 * SettlementDetails96.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmNettingEligibility
	 * SettlementDetails97.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmNettingEligibility
	 * SettlementDetails94.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NettingEligibility4Choice#mmIndicator
	 * NettingEligibility4Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmNettingEligibility
	 * SettlementDetails95.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#mmNettingEligibility
	 * SettlementDetails91.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#mmNettingEligibility
	 * SettlementDetails92.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmNettingEligibility
	 * SettlementDetails98.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmNettingEligibility
	 * SettlementDetails101.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#mmNettingEligibility
	 * SettlementDetails105.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#mmNettingEligibility
	 * SettlementDetails106.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#mmNettingEligibility
	 * SettlementDetails104.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmNettingEligibility
	 * SettlementDetails111.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmNettingEligibility
	 * SettlementDetails112.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmNettingEligibility
	 * SettlementDetails110.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#mmNettingEligibility
	 * SettlementDetails107.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmNettingEligibility
	 * SettlementDetails115.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#mmNettingEligibility
	 * SettlementDetails117.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#mmNettingEligibility
	 * SettlementDetails116.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NettingEligibility5Choice#mmIndicator
	 * NettingEligibility5Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmNettingEligibility
	 * SettlementDetails113.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmNettingEligibility
	 * SettlementDetails128.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmNettingEligibility
	 * SettlementDetails120.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmNettingEligibility
	 * SettlementDetails119.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmNettingEligibility
	 * SettlementDetails126.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmNettingEligibility
	 * SettlementDetails122.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmNettingEligibility
	 * SettlementDetails127.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmNettingEligibility
	 * SettlementDetails121.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmNettingEligibility
	 * SettlementDetails134.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmNettingEligibility
	 * SettlementDetails137.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmNettingEligibility
	 * SettlementDetails132.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmNettingEligibility
	 * SettlementDetails138.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#mmNettingEligibility
	 * SettlementDetails130.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmNettingEligibility
	 * SettlementDetails133.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#mmNettingEligibility
	 * SettlementDetails139.mmNettingEligibility}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettingEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is eligible for netting."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNettingEligibility = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.NettingEligibility1Choice.mmIndicator, com.tools20022.repository.msg.SettlementDetails50.mmNettingEligibility,
					com.tools20022.repository.choice.NettingEligibility2Choice.mmIndicator, com.tools20022.repository.msg.SettlementDetails51.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails9.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails17.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails30.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails32.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails60.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails64.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails3.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails16.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails31.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails40.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails62.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails63.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails6.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails20.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails24.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails33.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails45.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails54.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails1.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails19.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails22.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails35.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails42.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails52.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails8.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails11.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails23.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails37.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails44.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails53.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails7.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails12.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails28.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails38.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails47.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails56.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails2.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails13.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails27.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails39.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails48.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails57.mmNettingEligibility, com.tools20022.repository.choice.NettingEligibility3Choice.mmIndicator,
					com.tools20022.repository.msg.SettlementDetails43.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails10.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails29.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails5.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails26.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails65.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails14.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails41.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails61.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails59.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails15.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails36.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails66.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails67.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails70.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails68.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails69.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails71.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails72.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails75.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails73.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails74.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails81.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails76.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails80.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails78.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails77.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails79.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails87.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails83.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails86.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails85.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails93.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails90.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails96.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails97.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails94.mmNettingEligibility, com.tools20022.repository.choice.NettingEligibility4Choice.mmIndicator, com.tools20022.repository.msg.SettlementDetails95.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails91.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails92.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails98.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails101.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails105.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails106.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails104.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails111.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails112.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails110.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails107.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails115.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails117.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails116.mmNettingEligibility, com.tools20022.repository.choice.NettingEligibility5Choice.mmIndicator,
					com.tools20022.repository.msg.SettlementDetails113.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails128.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails120.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails119.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails126.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails122.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails127.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails121.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails134.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails137.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails132.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails138.mmNettingEligibility,
					com.tools20022.repository.msg.SettlementDetails130.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails133.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails139.mmNettingEligibility);
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NettingEligibility";
			definition = "Specifies whether the settlement transaction is eligible for netting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ISODateTime transferInstructionDate;
	/**
	 * Date at which the instructing party places the transfer instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer3#mmTransferDate
	 * Transfer3.mmTransferDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer6#mmTransferDate
	 * Transfer6.mmTransferDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer16#mmTransferDate
	 * Transfer16.mmTransferDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer22#mmTransferDate
	 * Transfer22.mmTransferDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer5#mmTransferDate
	 * Transfer5.mmTransferDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer15#mmTransferDate
	 * Transfer15.mmTransferDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer21#mmTransferDate
	 * Transfer21.mmTransferDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer32#mmTransferDate
	 * Transfer32.mmTransferDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferInstructionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the instructing party places the transfer instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransferInstructionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transfer3.mmTransferDate, com.tools20022.repository.msg.Transfer6.mmTransferDate, com.tools20022.repository.msg.Transfer16.mmTransferDate,
					com.tools20022.repository.msg.Transfer22.mmTransferDate, com.tools20022.repository.msg.Transfer5.mmTransferDate, com.tools20022.repository.msg.Transfer15.mmTransferDate,
					com.tools20022.repository.msg.Transfer21.mmTransferDate, com.tools20022.repository.msg.Transfer32.mmTransferDate);
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferInstructionDate";
			definition = "Date at which the instructing party places the transfer instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected CurrencyCode transferCurrency;
	/**
	 * Identifies the currency to be used to transfer the holdings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer18#mmTransferCurrency
	 * Transfer18.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#mmTransferCurrency
	 * Transfer26.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer13#mmTransferCurrency
	 * Transfer13.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#mmTransferCurrency
	 * Transfer23.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer11#mmTransferCurrency
	 * Transfer11.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer19#mmTransferCurrency
	 * Transfer19.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#mmTransferCurrency
	 * Transfer27.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmTransferCurrency
	 * Transfer28.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmTransferCurrency
	 * Transfer29.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument40#mmTransferCurrency
	 * FinancialInstrument40.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#mmTransferCurrency
	 * FinancialInstrument39.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmTransferCurrency
	 * Transfer31.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmTransferCurrency
	 * Transfer30.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmTransferCurrency
	 * Transfer33.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#mmTransferCurrency
	 * FinancialInstrument48.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmTransferCurrency
	 * FinancialInstrument46.mmTransferCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the currency to be used to transfer the holdings."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransferCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transfer18.mmTransferCurrency, com.tools20022.repository.msg.Transfer26.mmTransferCurrency, com.tools20022.repository.msg.Transfer13.mmTransferCurrency,
					com.tools20022.repository.msg.Transfer23.mmTransferCurrency, com.tools20022.repository.msg.Transfer11.mmTransferCurrency, com.tools20022.repository.msg.Transfer19.mmTransferCurrency,
					com.tools20022.repository.msg.Transfer27.mmTransferCurrency, com.tools20022.repository.msg.Transfer28.mmTransferCurrency, com.tools20022.repository.msg.Transfer29.mmTransferCurrency,
					com.tools20022.repository.msg.FinancialInstrument40.mmTransferCurrency, com.tools20022.repository.msg.FinancialInstrument39.mmTransferCurrency, com.tools20022.repository.msg.Transfer31.mmTransferCurrency,
					com.tools20022.repository.msg.Transfer30.mmTransferCurrency, com.tools20022.repository.msg.Transfer33.mmTransferCurrency, com.tools20022.repository.msg.FinancialInstrument48.mmTransferCurrency,
					com.tools20022.repository.msg.FinancialInstrument46.mmTransferCurrency);
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferCurrency";
			definition = "Identifies the currency to be used to transfer the holdings.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected CorporateActionProceedsDeliveryInstruction relatedCorporateAction;
	/**
	 * Corporate action processes which are the source of the securities
	 * delivery obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmSecuritiesProceedsMovement
	 * CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action processes which are the source of the securities delivery obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCorporateAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateAction";
			definition = "Corporate action processes which are the source of the securities delivery obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmObject();
		}
	};
	protected CollateralMovement relatedCollateralMovement;
	/**
	 * Collateral movement which is the source of the obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmSecuritiesCollateralMovement
	 * CollateralMovement.mmSecuritiesCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral movement which is the source of the obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCollateralMovement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralMovement";
			definition = "Collateral movement which is the source of the obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmSecuritiesCollateralMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmObject();
		}
	};
	protected SecuritiesTradeExecution securitiesTradeExecution;
	/**
	 * Specifies the trade which originates the delivery obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesDeliveryObligation
	 * SecuritiesTradeExecution.mmSecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade which originates the delivery obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesTradeExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Specifies the trade which originates the delivery obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmSecuritiesDeliveryObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PortfolioTransfer> relatedPortfolioTransfer;
	/**
	 * Portfolio transfer which is the source of the securities delivery
	 * obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmSecuritiesDeliveryObligation
	 * PortfolioTransfer.mmSecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPortfolioTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portfolio transfer which is the source of the securities delivery obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPortfolioTransfer";
			definition = "Portfolio transfer which is the source of the securities delivery obligation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmSecuritiesDeliveryObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesTransfer> securitiesTransfer;
	/**
	 * Completion of a securities settlement instruction, wherein securities are
	 * delivered/debited from a securities account and received/credited to the
	 * designated securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmSecuritiesDeliveryObligation
	 * SecuritiesTransfer.mmSecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmSecuritiesMovementDetails
	 * CorporateActionElection3.mmSecuritiesMovementDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionElection3.mmSecuritiesMovementDetails);
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmSecuritiesDeliveryObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
		}
	};
	protected YesNoIndicator settlementInstructionGeneration;
	/**
	 * Specifies whether the ETC provider should generate settlement
	 * instructions or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstructionGeneration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the ETC provider should generate settlement instructions or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettlementInstructionGeneration = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementInstructionGeneration";
			definition = "Specifies whether the ETC provider should generate settlement instructions or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected SettlementDateCode settlementDateCode;
	/**
	 * Requested date of trade settlement, in coded form, for example, trade
	 * date +1).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegSettlementDateCode
	 * InstrumentLeg2.mmLegSettlementDateCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDateCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested date of trade settlement, in coded form, for example, trade date +1)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettlementDateCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstrumentLeg2.mmLegSettlementDateCode);
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementDateCode";
			definition = "Requested date of trade settlement, in coded form, for example, trade date +1).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
		}
	};
	protected SecuritiesLending securitiesLending;
	/**
	 * Securities lending process which covers the delivery of securities by the
	 * seller.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#mmSecuritiesDeliveryObligation
	 * SecuritiesLending.mmSecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities lending process which covers the delivery of securities by the seller."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesLending = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesLending";
			definition = "Securities lending process which covers the delivery of securities by the seller.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.mmSecuritiesDeliveryObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesDeliveryObligation";
				definition = "Obligation for one party to deliver securities to another party.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTransfer.mmSecuritiesDeliveryObligation, com.tools20022.repository.entity.PortfolioTransfer.mmSecuritiesDeliveryObligation,
						com.tools20022.repository.entity.SecuritiesTradeExecution.mmSecuritiesDeliveryObligation, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement,
						com.tools20022.repository.entity.SecuritiesLending.mmSecuritiesDeliveryObligation, com.tools20022.repository.entity.CollateralMovement.mmSecuritiesCollateralMovement);
				superType_lazy = () -> Obligation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmCCPEligibility, com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmNettingEligibility,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmTransferInstructionDate, com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmTransferCurrency,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmRelatedCorporateAction, com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmRelatedCollateralMovement,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmSecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmRelatedPortfolioTransfer,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmSecuritiesTransfer, com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmSettlementInstructionGeneration,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmSettlementDateCode, com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmSecuritiesLending);
				derivationComponent_lazy = () -> Arrays.asList(NettingEligibility1Choice.mmObject(), NettingEligibility2Choice.mmObject(), NettingEligibility3Choice.mmObject(), NettingEligibility4Choice.mmObject(),
						NettingEligibility5Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getCCPEligibility() {
		return cCPEligibility;
	}

	public void setCCPEligibility(YesNoIndicator cCPEligibility) {
		this.cCPEligibility = cCPEligibility;
	}

	public YesNoIndicator getNettingEligibility() {
		return nettingEligibility;
	}

	public void setNettingEligibility(YesNoIndicator nettingEligibility) {
		this.nettingEligibility = nettingEligibility;
	}

	public ISODateTime getTransferInstructionDate() {
		return transferInstructionDate;
	}

	public void setTransferInstructionDate(ISODateTime transferInstructionDate) {
		this.transferInstructionDate = transferInstructionDate;
	}

	public CurrencyCode getTransferCurrency() {
		return transferCurrency;
	}

	public void setTransferCurrency(CurrencyCode transferCurrency) {
		this.transferCurrency = transferCurrency;
	}

	public CorporateActionProceedsDeliveryInstruction getRelatedCorporateAction() {
		return relatedCorporateAction;
	}

	public void setRelatedCorporateAction(com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction relatedCorporateAction) {
		this.relatedCorporateAction = relatedCorporateAction;
	}

	public CollateralMovement getRelatedCollateralMovement() {
		return relatedCollateralMovement;
	}

	public void setRelatedCollateralMovement(com.tools20022.repository.entity.CollateralMovement relatedCollateralMovement) {
		this.relatedCollateralMovement = relatedCollateralMovement;
	}

	public SecuritiesTradeExecution getSecuritiesTradeExecution() {
		return securitiesTradeExecution;
	}

	public void setSecuritiesTradeExecution(com.tools20022.repository.entity.SecuritiesTradeExecution securitiesTradeExecution) {
		this.securitiesTradeExecution = securitiesTradeExecution;
	}

	public List<PortfolioTransfer> getRelatedPortfolioTransfer() {
		return relatedPortfolioTransfer;
	}

	public void setRelatedPortfolioTransfer(List<com.tools20022.repository.entity.PortfolioTransfer> relatedPortfolioTransfer) {
		this.relatedPortfolioTransfer = relatedPortfolioTransfer;
	}

	public List<SecuritiesTransfer> getSecuritiesTransfer() {
		return securitiesTransfer;
	}

	public void setSecuritiesTransfer(List<com.tools20022.repository.entity.SecuritiesTransfer> securitiesTransfer) {
		this.securitiesTransfer = securitiesTransfer;
	}

	public YesNoIndicator getSettlementInstructionGeneration() {
		return settlementInstructionGeneration;
	}

	public void setSettlementInstructionGeneration(YesNoIndicator settlementInstructionGeneration) {
		this.settlementInstructionGeneration = settlementInstructionGeneration;
	}

	public SettlementDateCode getSettlementDateCode() {
		return settlementDateCode;
	}

	public void setSettlementDateCode(com.tools20022.repository.codeset.SettlementDateCode settlementDateCode) {
		this.settlementDateCode = settlementDateCode;
	}

	public SecuritiesLending getSecuritiesLending() {
		return securitiesLending;
	}

	public void setSecuritiesLending(com.tools20022.repository.entity.SecuritiesLending securitiesLending) {
		this.securitiesLending = securitiesLending;
	}
}