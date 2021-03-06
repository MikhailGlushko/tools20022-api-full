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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashCollateral2;
import com.tools20022.repository.msg.OtherCollateral5;
import com.tools20022.repository.msg.SecuritiesCollateral5;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the collateral that will be either delivered, returned or
 * both.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral11#mmMarginCallRequestIdentification
 * Collateral11.mmMarginCallRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral11#mmMarginCallResponseIdentification
 * Collateral11.mmMarginCallResponseIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral11#mmStandardSettlementInstructions
 * Collateral11.mmStandardSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral11#mmCollateralProposalResponseIdentification
 * Collateral11.mmCollateralProposalResponseIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral11#mmSecuritiesCollateral
 * Collateral11.mmSecuritiesCollateral}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral11#mmCashCollateral
 * Collateral11.mmCashCollateral}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral11#mmOtherCollateral
 * Collateral11.mmOtherCollateral}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Collateral11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details on the collateral that will be either delivered, returned or both."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral17 Collateral17}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Collateral7
 * Collateral7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Collateral11", propOrder = {"marginCallRequestIdentification", "marginCallResponseIdentification", "standardSettlementInstructions", "collateralProposalResponseIdentification", "securitiesCollateral", "cashCollateral",
		"otherCollateral"})
public class Collateral11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MrgnCallReqId", required = true)
	protected Max35Text marginCallRequestIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Collateral11 Collateral11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnCallReqId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reference to the unambiguous identification of the margin call request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral17#mmMarginCallRequestIdentification
	 * Collateral17.mmMarginCallRequestIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Collateral7#mmMarginCallRequestIdentification
	 * Collateral7.mmMarginCallRequestIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Collateral11, Max35Text> mmMarginCallRequestIdentification = new MMMessageAttribute<Collateral11, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Collateral11.mmObject();
			isDerived = false;
			xmlTag = "MrgnCallReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallRequestIdentification";
			definition = "Specifies the reference to the unambiguous identification of the margin call request.";
			nextVersions_lazy = () -> Arrays.asList(Collateral17.mmMarginCallRequestIdentification);
			previousVersion_lazy = () -> Collateral7.mmMarginCallRequestIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Collateral11 obj) {
			return obj.getMarginCallRequestIdentification();
		}

		@Override
		public void setValue(Collateral11 obj, Max35Text value) {
			obj.setMarginCallRequestIdentification(value);
		}
	};
	@XmlElement(name = "MrgnCallRspnId")
	protected Max35Text marginCallResponseIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Collateral11 Collateral11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnCallRspnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallResponseIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reference to the unambiguous identification of the margin call response."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral17#mmMarginCallResponseIdentification
	 * Collateral17.mmMarginCallResponseIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Collateral7#mmMarginCallResponseIdentification
	 * Collateral7.mmMarginCallResponseIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Collateral11, Optional<Max35Text>> mmMarginCallResponseIdentification = new MMMessageAttribute<Collateral11, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Collateral11.mmObject();
			isDerived = false;
			xmlTag = "MrgnCallRspnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallResponseIdentification";
			definition = "Specifies the reference to the unambiguous identification of the margin call response.";
			nextVersions_lazy = () -> Arrays.asList(Collateral17.mmMarginCallResponseIdentification);
			previousVersion_lazy = () -> Collateral7.mmMarginCallResponseIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Collateral11 obj) {
			return obj.getMarginCallResponseIdentification();
		}

		@Override
		public void setValue(Collateral11 obj, Optional<Max35Text> value) {
			obj.setMarginCallResponseIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "StdSttlmInstrs")
	protected Max140Text standardSettlementInstructions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmStandingSettlementInstructions
	 * CollateralAgreement.mmStandingSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Collateral11 Collateral11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StdSttlmInstrs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardSettlementInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the standard settlement instructions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral17#mmStandardSettlementInstructions
	 * Collateral17.mmStandardSettlementInstructions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Collateral7#mmStandardSettlementInstructions
	 * Collateral7.mmStandardSettlementInstructions}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Collateral11, Optional<Max140Text>> mmStandardSettlementInstructions = new MMMessageAttribute<Collateral11, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> CollateralAgreement.mmStandingSettlementInstructions;
			componentContext_lazy = () -> com.tools20022.repository.msg.Collateral11.mmObject();
			isDerived = false;
			xmlTag = "StdSttlmInstrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardSettlementInstructions";
			definition = "Specifies the standard settlement instructions.";
			nextVersions_lazy = () -> Arrays.asList(Collateral17.mmStandardSettlementInstructions);
			previousVersion_lazy = () -> Collateral7.mmStandardSettlementInstructions;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(Collateral11 obj) {
			return obj.getStandardSettlementInstructions();
		}

		@Override
		public void setValue(Collateral11 obj, Optional<Max140Text> value) {
			obj.setStandardSettlementInstructions(value.orElse(null));
		}
	};
	@XmlElement(name = "CollPrpslRspnId")
	protected Max35Text collateralProposalResponseIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Collateral11 Collateral11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollPrpslRspnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralProposalResponseIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reference to the unambiguous identification of the collateral proposal response (in case of counter proposal)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral17#mmCollateralProposalResponseIdentification
	 * Collateral17.mmCollateralProposalResponseIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Collateral7#mmCollateralProposalResponseIdentification
	 * Collateral7.mmCollateralProposalResponseIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Collateral11, Optional<Max35Text>> mmCollateralProposalResponseIdentification = new MMMessageAttribute<Collateral11, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Collateral11.mmObject();
			isDerived = false;
			xmlTag = "CollPrpslRspnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralProposalResponseIdentification";
			definition = "Specifies the reference to the unambiguous identification of the collateral proposal response (in case of counter proposal).";
			nextVersions_lazy = () -> Arrays.asList(Collateral17.mmCollateralProposalResponseIdentification);
			previousVersion_lazy = () -> Collateral7.mmCollateralProposalResponseIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Collateral11 obj) {
			return obj.getCollateralProposalResponseIdentification();
		}

		@Override
		public void setValue(Collateral11 obj, Optional<Max35Text> value) {
			obj.setCollateralProposalResponseIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesColl")
	protected List<SecuritiesCollateral5> securitiesCollateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5
	 * SecuritiesCollateral5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Collateral11 Collateral11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesColl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral type is securities."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral17#mmSecuritiesCollateral
	 * Collateral17.mmSecuritiesCollateral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Collateral7#mmSecuritiesCollateral
	 * Collateral7.mmSecuritiesCollateral}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Collateral11, List<SecuritiesCollateral5>> mmSecuritiesCollateral = new MMMessageAssociationEnd<Collateral11, List<SecuritiesCollateral5>>() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Collateral11.mmObject();
			isDerived = false;
			xmlTag = "SctiesColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCollateral";
			definition = "Collateral type is securities.";
			nextVersions_lazy = () -> Arrays.asList(Collateral17.mmSecuritiesCollateral);
			previousVersion_lazy = () -> Collateral7.mmSecuritiesCollateral;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesCollateral5.mmObject();
		}

		@Override
		public List<SecuritiesCollateral5> getValue(Collateral11 obj) {
			return obj.getSecuritiesCollateral();
		}

		@Override
		public void setValue(Collateral11 obj, List<SecuritiesCollateral5> value) {
			obj.setSecuritiesCollateral(value);
		}
	};
	@XmlElement(name = "CshColl")
	protected List<CashCollateral2> cashCollateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashCollateral2
	 * CashCollateral2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Money Money}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Collateral11 Collateral11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshColl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral type is cash."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral17#mmCashCollateral
	 * Collateral17.mmCashCollateral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Collateral7#mmCashCollateral
	 * Collateral7.mmCashCollateral}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Collateral11, List<CashCollateral2>> mmCashCollateral = new MMMessageAssociationEnd<Collateral11, List<CashCollateral2>>() {
		{
			businessComponentTrace_lazy = () -> Money.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Collateral11.mmObject();
			isDerived = false;
			xmlTag = "CshColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashCollateral";
			definition = "Collateral type is cash.";
			nextVersions_lazy = () -> Arrays.asList(Collateral17.mmCashCollateral);
			previousVersion_lazy = () -> Collateral7.mmCashCollateral;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashCollateral2.mmObject();
		}

		@Override
		public List<CashCollateral2> getValue(Collateral11 obj) {
			return obj.getCashCollateral();
		}

		@Override
		public void setValue(Collateral11 obj, List<CashCollateral2> value) {
			obj.setCashCollateral(value);
		}
	};
	@XmlElement(name = "OthrColl")
	protected List<OtherCollateral5> otherCollateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherCollateral5
	 * OtherCollateral5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmAsset
	 * AssetHolding.mmAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Collateral11 Collateral11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrColl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral type is other than securities or cash for example letter of credit."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral17#mmOtherCollateral
	 * Collateral17.mmOtherCollateral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Collateral7#mmOtherCollateral
	 * Collateral7.mmOtherCollateral}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Collateral11, List<OtherCollateral5>> mmOtherCollateral = new MMMessageAssociationEnd<Collateral11, List<OtherCollateral5>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmAsset;
			componentContext_lazy = () -> com.tools20022.repository.msg.Collateral11.mmObject();
			isDerived = false;
			xmlTag = "OthrColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCollateral";
			definition = "Collateral type is other than securities or cash for example letter of credit.";
			nextVersions_lazy = () -> Arrays.asList(Collateral17.mmOtherCollateral);
			previousVersion_lazy = () -> Collateral7.mmOtherCollateral;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherCollateral5.mmObject();
		}

		@Override
		public List<OtherCollateral5> getValue(Collateral11 obj) {
			return obj.getOtherCollateral();
		}

		@Override
		public void setValue(Collateral11 obj, List<OtherCollateral5> value) {
			obj.setOtherCollateral(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Collateral11.mmMarginCallRequestIdentification, com.tools20022.repository.msg.Collateral11.mmMarginCallResponseIdentification,
						com.tools20022.repository.msg.Collateral11.mmStandardSettlementInstructions, com.tools20022.repository.msg.Collateral11.mmCollateralProposalResponseIdentification,
						com.tools20022.repository.msg.Collateral11.mmSecuritiesCollateral, com.tools20022.repository.msg.Collateral11.mmCashCollateral, com.tools20022.repository.msg.Collateral11.mmOtherCollateral);
				trace_lazy = () -> Collateral.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Collateral11";
				definition = "Provides details on the collateral that will be either delivered, returned or both.";
				nextVersions_lazy = () -> Arrays.asList(Collateral17.mmObject());
				previousVersion_lazy = () -> Collateral7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMarginCallRequestIdentification() {
		return marginCallRequestIdentification;
	}

	public Collateral11 setMarginCallRequestIdentification(Max35Text marginCallRequestIdentification) {
		this.marginCallRequestIdentification = Objects.requireNonNull(marginCallRequestIdentification);
		return this;
	}

	public Optional<Max35Text> getMarginCallResponseIdentification() {
		return marginCallResponseIdentification == null ? Optional.empty() : Optional.of(marginCallResponseIdentification);
	}

	public Collateral11 setMarginCallResponseIdentification(Max35Text marginCallResponseIdentification) {
		this.marginCallResponseIdentification = marginCallResponseIdentification;
		return this;
	}

	public Optional<Max140Text> getStandardSettlementInstructions() {
		return standardSettlementInstructions == null ? Optional.empty() : Optional.of(standardSettlementInstructions);
	}

	public Collateral11 setStandardSettlementInstructions(Max140Text standardSettlementInstructions) {
		this.standardSettlementInstructions = standardSettlementInstructions;
		return this;
	}

	public Optional<Max35Text> getCollateralProposalResponseIdentification() {
		return collateralProposalResponseIdentification == null ? Optional.empty() : Optional.of(collateralProposalResponseIdentification);
	}

	public Collateral11 setCollateralProposalResponseIdentification(Max35Text collateralProposalResponseIdentification) {
		this.collateralProposalResponseIdentification = collateralProposalResponseIdentification;
		return this;
	}

	public List<SecuritiesCollateral5> getSecuritiesCollateral() {
		return securitiesCollateral == null ? securitiesCollateral = new ArrayList<>() : securitiesCollateral;
	}

	public Collateral11 setSecuritiesCollateral(List<SecuritiesCollateral5> securitiesCollateral) {
		this.securitiesCollateral = Objects.requireNonNull(securitiesCollateral);
		return this;
	}

	public List<CashCollateral2> getCashCollateral() {
		return cashCollateral == null ? cashCollateral = new ArrayList<>() : cashCollateral;
	}

	public Collateral11 setCashCollateral(List<CashCollateral2> cashCollateral) {
		this.cashCollateral = Objects.requireNonNull(cashCollateral);
		return this;
	}

	public List<OtherCollateral5> getOtherCollateral() {
		return otherCollateral == null ? otherCollateral = new ArrayList<>() : otherCollateral;
	}

	public Collateral11 setOtherCollateral(List<OtherCollateral5> otherCollateral) {
		this.otherCollateral = Objects.requireNonNull(otherCollateral);
		return this;
	}
}