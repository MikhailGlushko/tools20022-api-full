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
import com.tools20022.repository.choice.DateFormat14Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.PartyIdentification33Choice;
import com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.entity.SafekeepingPlace;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides details about the letter of credit or bank guarantee, or other
 * collateral, posted as collateral.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral3#mmAssetNumber
 * OtherCollateral3.mmAssetNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmLetterOfCreditIdentification
 * OtherCollateral3.mmLetterOfCreditIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmLetterOfCreditAmount
 * OtherCollateral3.mmLetterOfCreditAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmGuaranteeAmount
 * OtherCollateral3.mmGuaranteeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmOtherTypeOfCollateral
 * OtherCollateral3.mmOtherTypeOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmCollateralOwnership
 * OtherCollateral3.mmCollateralOwnership}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral3#mmIssueDate
 * OtherCollateral3.mmIssueDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral3#mmExpiryDate
 * OtherCollateral3.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmLimitedCoverageIndicator
 * OtherCollateral3.mmLimitedCoverageIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral3#mmIssuer
 * OtherCollateral3.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmBlockedQuantity
 * OtherCollateral3.mmBlockedQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral3#mmValueDate
 * OtherCollateral3.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmExchangeRate
 * OtherCollateral3.mmExchangeRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral3#mmMarketValue
 * OtherCollateral3.mmMarketValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral3#mmHaircut
 * OtherCollateral3.mmHaircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmCollateralValue
 * OtherCollateral3.mmCollateralValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmSafekeepingPlace
 * OtherCollateral3.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmSafekeepingAccount
 * OtherCollateral3.mmSafekeepingAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
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
 * "OtherCollateral3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about the letter of credit or bank guarantee, or other collateral, posted as collateral."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral6
 * OtherCollateral6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.OtherCollateral2 OtherCollateral2}</li>
 * </ul>
 */
public class OtherCollateral3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text assetNumber;
	/**
	 * Identifies the register number of the collateral deposit assigned by the
	 * central counterparty.
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
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3
	 * OtherCollateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AsstNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the register number of the collateral deposit assigned by the central counterparty."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmAssetNumber
	 * OtherCollateral6.mmAssetNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAssetNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OtherCollateral3.mmObject();
			isDerived = false;
			xmlTag = "AsstNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetNumber";
			definition = "Identifies the register number of the collateral deposit assigned by the central counterparty.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateral6.mmAssetNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text letterOfCreditIdentification;
	/**
	 * Provides the unique identification of the letter of credit.
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
	 * {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3
	 * OtherCollateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrOfCdtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfCreditIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the unique identification of the letter of credit."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmLetterOfCreditIdentification
	 * OtherCollateral6.mmLetterOfCreditIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLetterOfCreditIdentification = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Asset.mmObject();
			componentContext_lazy = () -> OtherCollateral3.mmObject();
			isDerived = false;
			xmlTag = "LttrOfCdtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfCreditIdentification";
			definition = "Provides the unique identification of the letter of credit.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateral6.mmLetterOfCreditIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount letterOfCreditAmount;
	/**
	 * Amount of the letter/documentary credit.
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
	 * {@linkplain com.tools20022.repository.entity.LetterOfCredit#mmAmount
	 * LetterOfCredit.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3
	 * OtherCollateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrOfCdtAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfCreditAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the letter/documentary credit."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmLetterOfCreditAmount
	 * OtherCollateral6.mmLetterOfCreditAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmLetterOfCreditAmount
	 * OtherCollateral2.mmLetterOfCreditAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLetterOfCreditAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.LetterOfCredit.mmAmount;
			componentContext_lazy = () -> OtherCollateral3.mmObject();
			isDerived = false;
			xmlTag = "LttrOfCdtAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfCreditAmount";
			definition = "Amount of the letter/documentary credit.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateral6.mmLetterOfCreditAmount);
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherCollateral2.mmLetterOfCreditAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount guaranteeAmount;
	/**
	 * Amount of the bank guarantee.
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
	 * {@linkplain com.tools20022.repository.entity.Guarantee#mmCoveredAmount
	 * Guarantee.mmCoveredAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3
	 * OtherCollateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrntAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the bank guarantee."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmGuaranteeAmount
	 * OtherCollateral6.mmGuaranteeAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmGuaranteeAmount
	 * OtherCollateral2.mmGuaranteeAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGuaranteeAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Guarantee.mmCoveredAmount;
			componentContext_lazy = () -> OtherCollateral3.mmObject();
			isDerived = false;
			xmlTag = "GrntAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteeAmount";
			definition = "Amount of the bank guarantee.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateral6.mmGuaranteeAmount);
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherCollateral2.mmGuaranteeAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected OtherTypeOfCollateral2 otherTypeOfCollateral;
	/**
	 * Provides a description and an amount of another type of collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherTypeOfCollateral2
	 * OtherTypeOfCollateral2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3
	 * OtherCollateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrTpOfColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherTypeOfCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides a description and an amount of another type of collateral."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmOtherTypeOfCollateral
	 * OtherCollateral6.mmOtherTypeOfCollateral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmOtherTypeOfCollateral
	 * OtherCollateral2.mmOtherTypeOfCollateral}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherTypeOfCollateral = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Asset.mmObject();
			componentContext_lazy = () -> OtherCollateral3.mmObject();
			isDerived = false;
			xmlTag = "OthrTpOfColl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherTypeOfCollateral";
			definition = "Provides a description and an amount of another type of collateral.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateral6.mmOtherTypeOfCollateral);
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherCollateral2.mmOtherTypeOfCollateral;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OtherTypeOfCollateral2.mmObject();
		}
	};
	protected CollateralOwnership1 collateralOwnership;
	/**
	 * Indicates whether the collateral is proprietarily owned or client owned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralOwnership1
	 * CollateralOwnership1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralOwnership
	 * Collateral.mmCollateralOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3
	 * OtherCollateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollOwnrsh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOwnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the collateral is proprietarily owned or client owned."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmCollateralOwnership
	 * OtherCollateral6.mmCollateralOwnership}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCollateralOwnership = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Collateral.mmCollateralOwnership;
			componentContext_lazy = () -> OtherCollateral3.mmObject();
			isDerived = false;
			xmlTag = "CollOwnrsh";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOwnership";
			definition = "Indicates whether the collateral is proprietarily owned or client owned.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateral6.mmCollateralOwnership);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CollateralOwnership1.mmObject();
		}
	};
	protected DateFormat14Choice issueDate;
	/**
	 * Date on which the other collateral was issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat14Choice
	 * DateFormat14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueDate
	 * Issuance.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3
	 * OtherCollateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the other collateral was issued."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmIssueDate
	 * OtherCollateral6.mmIssueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmIssueDate
	 * OtherCollateral2.mmIssueDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssueDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Issuance.mmIssueDate;
			componentContext_lazy = () -> OtherCollateral3.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date on which the other collateral was issued.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateral6.mmIssueDate);
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherCollateral2.mmIssueDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat14Choice.mmObject();
		}
	};
	protected DateFormat14Choice expiryDate;
	/**
	 * Date on which the other collateral expires.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat14Choice
	 * DateFormat14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmExpiryDate
	 * Asset.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3
	 * OtherCollateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the other collateral expires."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmExpiryDate
	 * OtherCollateral6.mmExpiryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmExpiryDate
	 * OtherCollateral2.mmExpiryDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExpiryDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Asset.mmExpiryDate;
			componentContext_lazy = () -> OtherCollateral3.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date on which the other collateral expires.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateral6.mmExpiryDate);
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherCollateral2.mmExpiryDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat14Choice.mmObject();
		}
	};
	protected YesNoIndicator limitedCoverageIndicator;
	/**
	 * Indicates that the collateral posted in the clearing house covers the
	 * margin until a specific timeframe.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3
	 * OtherCollateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LtdCvrgInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedCoverageIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the collateral posted in the clearing house covers the margin until a specific timeframe."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmLimitedCoverageIndicator
	 * OtherCollateral6.mmLimitedCoverageIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLimitedCoverageIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OtherCollateral3.mmObject();
			isDerived = false;
			xmlTag = "LtdCvrgInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedCoverageIndicator";
			definition = "Indicates that the collateral posted in the clearing house covers the margin until a specific timeframe.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateral6.mmLimitedCoverageIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected PartyIdentification33Choice issuer;
	/**
	 * Party that issues the bank guarantee or letter of / documentary credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification33Choice
	 * PartyIdentification33Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3
	 * OtherCollateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that issues the bank guarantee or letter of / documentary credit."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral6#mmIssuer
	 * OtherCollateral6.mmIssuer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmIssuer
	 * OtherCollateral2.mmIssuer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssuer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> OtherCollateral3.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Party that issues the bank guarantee or letter of / documentary credit.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateral6.mmIssuer);
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherCollateral2.mmIssuer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification33Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice blockedQuantity;
	/**
	 * Quantity blocked by the central counterparty for any reasonable reason (
	 * for example for judicial reasons). In this case the investor can not
	 * withdraw or distribute this collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
	 * Security.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3
	 * OtherCollateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity blocked by the central counterparty for any reasonable reason ( for example for judicial reasons). In this case the investor can not withdraw or distribute this collateral. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmBlockedQuantity
	 * OtherCollateral6.mmBlockedQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBlockedQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesQuantity;
			componentContext_lazy = () -> OtherCollateral3.mmObject();
			isDerived = false;
			xmlTag = "BlckdQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedQuantity";
			definition = "Quantity blocked by the central counterparty for any reasonable reason ( for example for judicial reasons). In this case the investor can not withdraw or distribute this collateral. ";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateral6.mmBlockedQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected ISODate valueDate;
	/**
	 * Valuation date of the other collateral when it was taken as collateral.
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
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateralValuationDate
	 * CollateralValuation.mmCollateralValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3
	 * OtherCollateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation date of the other collateral when it was taken as collateral."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmValueDate
	 * OtherCollateral6.mmValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmValueDate
	 * OtherCollateral2.mmValueDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmCollateralValuationDate;
			componentContext_lazy = () -> OtherCollateral3.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Valuation date of the other collateral when it was taken as collateral.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateral6.mmValueDate);
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherCollateral2.mmValueDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected BaseOneRate exchangeRate;
	/**
	 * Exchange rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmExchangeRate
	 * AssetHolding.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3
	 * OtherCollateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange rate."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmExchangeRate
	 * OtherCollateral6.mmExchangeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmExchangeRate
	 * OtherCollateral2.mmExchangeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmExchangeRate;
			componentContext_lazy = () -> OtherCollateral3.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "Exchange rate.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateral6.mmExchangeRate);
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherCollateral2.mmExchangeRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount marketValue;
	/**
	 * Value of the collateral based on current market prices.
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmMarketValue
	 * AssetHolding.mmMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3
	 * OtherCollateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the collateral based on current market prices."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmMarketValue
	 * OtherCollateral6.mmMarketValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmMarketValue
	 * OtherCollateral2.mmMarketValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMarketValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmMarketValue;
			componentContext_lazy = () -> OtherCollateral3.mmObject();
			isDerived = false;
			xmlTag = "MktVal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketValue";
			definition = "Value of the collateral based on current market prices.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateral6.mmMarketValue);
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherCollateral2.mmMarketValue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate haircut;
	/**
	 * Haircut or valuation factor on the collateral expressed as a percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.HaircutValuation#mmHaircut
	 * HaircutValuation.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3
	 * OtherCollateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hrcut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Haircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Haircut or valuation factor on the collateral expressed as a percentage."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral6#mmHaircut
	 * OtherCollateral6.mmHaircut}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmHaircut
	 * OtherCollateral2.mmHaircut}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHaircut = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.HaircutValuation.mmHaircut;
			componentContext_lazy = () -> OtherCollateral3.mmObject();
			isDerived = false;
			xmlTag = "Hrcut";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Haircut";
			definition = "Haircut or valuation factor on the collateral expressed as a percentage.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateral6.mmHaircut);
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherCollateral2.mmHaircut;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount collateralValue;
	/**
	 * Value of the collateral after taking into account the haircut, if any.
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmRiskAdjustedValue
	 * AssetHolding.mmRiskAdjustedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3
	 * OtherCollateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the collateral after taking into account the haircut, if any."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmCollateralValue
	 * OtherCollateral6.mmCollateralValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmCollateralValue
	 * OtherCollateral2.mmCollateralValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmRiskAdjustedValue;
			componentContext_lazy = () -> OtherCollateral3.mmObject();
			isDerived = false;
			xmlTag = "CollVal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValue";
			definition = "Value of the collateral after taking into account the haircut, if any.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateral6.mmCollateralValue);
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherCollateral2.mmCollateralValue;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected SafekeepingPlaceFormat7Choice safekeepingPlace;
	/**
	 * Place where the securities are safe-kept, physically or notionally. This
	 * place can be, for example, a local custodian, a Central Securities
	 * Depository (CSD) or an International Central Securities Depository
	 * (ICSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice
	 * SafekeepingPlaceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3
	 * OtherCollateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmSafekeepingPlace
	 * OtherCollateral6.mmSafekeepingPlace}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmSafekeepingPlace
	 * OtherCollateral2.mmSafekeepingPlace}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSafekeepingPlace = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> OtherCollateral3.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateral6.mmSafekeepingPlace);
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherCollateral2.mmSafekeepingPlace;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SafekeepingPlaceFormat7Choice.mmObject();
		}
	};
	protected SecuritiesAccount19 safekeepingAccount;
	/**
	 * Account to or from which a securities entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesAccount
	 * Security.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3
	 * OtherCollateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmSafekeepingAccount
	 * OtherCollateral6.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmSafekeepingAccount
	 * OtherCollateral2.mmSafekeepingAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSafekeepingAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesAccount;
			componentContext_lazy = () -> OtherCollateral3.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateral6.mmSafekeepingAccount);
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherCollateral2.mmSafekeepingAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount19.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateral3.mmAssetNumber, com.tools20022.repository.msg.OtherCollateral3.mmLetterOfCreditIdentification,
						com.tools20022.repository.msg.OtherCollateral3.mmLetterOfCreditAmount, com.tools20022.repository.msg.OtherCollateral3.mmGuaranteeAmount, com.tools20022.repository.msg.OtherCollateral3.mmOtherTypeOfCollateral,
						com.tools20022.repository.msg.OtherCollateral3.mmCollateralOwnership, com.tools20022.repository.msg.OtherCollateral3.mmIssueDate, com.tools20022.repository.msg.OtherCollateral3.mmExpiryDate,
						com.tools20022.repository.msg.OtherCollateral3.mmLimitedCoverageIndicator, com.tools20022.repository.msg.OtherCollateral3.mmIssuer, com.tools20022.repository.msg.OtherCollateral3.mmBlockedQuantity,
						com.tools20022.repository.msg.OtherCollateral3.mmValueDate, com.tools20022.repository.msg.OtherCollateral3.mmExchangeRate, com.tools20022.repository.msg.OtherCollateral3.mmMarketValue,
						com.tools20022.repository.msg.OtherCollateral3.mmHaircut, com.tools20022.repository.msg.OtherCollateral3.mmCollateralValue, com.tools20022.repository.msg.OtherCollateral3.mmSafekeepingPlace,
						com.tools20022.repository.msg.OtherCollateral3.mmSafekeepingAccount);
				trace_lazy = () -> Asset.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OtherCollateral3";
				definition = "Provides details about the letter of credit or bank guarantee, or other collateral, posted as collateral.";
				nextVersions_lazy = () -> Arrays.asList(OtherCollateral6.mmObject());
				previousVersion_lazy = () -> OtherCollateral2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getAssetNumber() {
		return assetNumber;
	}

	public void setAssetNumber(Max35Text assetNumber) {
		this.assetNumber = assetNumber;
	}

	public Max35Text getLetterOfCreditIdentification() {
		return letterOfCreditIdentification;
	}

	public void setLetterOfCreditIdentification(Max35Text letterOfCreditIdentification) {
		this.letterOfCreditIdentification = letterOfCreditIdentification;
	}

	public ActiveCurrencyAndAmount getLetterOfCreditAmount() {
		return letterOfCreditAmount;
	}

	public void setLetterOfCreditAmount(ActiveCurrencyAndAmount letterOfCreditAmount) {
		this.letterOfCreditAmount = letterOfCreditAmount;
	}

	public ActiveCurrencyAndAmount getGuaranteeAmount() {
		return guaranteeAmount;
	}

	public void setGuaranteeAmount(ActiveCurrencyAndAmount guaranteeAmount) {
		this.guaranteeAmount = guaranteeAmount;
	}

	public OtherTypeOfCollateral2 getOtherTypeOfCollateral() {
		return otherTypeOfCollateral;
	}

	public void setOtherTypeOfCollateral(com.tools20022.repository.msg.OtherTypeOfCollateral2 otherTypeOfCollateral) {
		this.otherTypeOfCollateral = otherTypeOfCollateral;
	}

	public CollateralOwnership1 getCollateralOwnership() {
		return collateralOwnership;
	}

	public void setCollateralOwnership(com.tools20022.repository.msg.CollateralOwnership1 collateralOwnership) {
		this.collateralOwnership = collateralOwnership;
	}

	public DateFormat14Choice getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(DateFormat14Choice issueDate) {
		this.issueDate = issueDate;
	}

	public DateFormat14Choice getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(DateFormat14Choice expiryDate) {
		this.expiryDate = expiryDate;
	}

	public YesNoIndicator getLimitedCoverageIndicator() {
		return limitedCoverageIndicator;
	}

	public void setLimitedCoverageIndicator(YesNoIndicator limitedCoverageIndicator) {
		this.limitedCoverageIndicator = limitedCoverageIndicator;
	}

	public PartyIdentification33Choice getIssuer() {
		return issuer;
	}

	public void setIssuer(PartyIdentification33Choice issuer) {
		this.issuer = issuer;
	}

	public FinancialInstrumentQuantity1Choice getBlockedQuantity() {
		return blockedQuantity;
	}

	public void setBlockedQuantity(FinancialInstrumentQuantity1Choice blockedQuantity) {
		this.blockedQuantity = blockedQuantity;
	}

	public ISODate getValueDate() {
		return valueDate;
	}

	public void setValueDate(ISODate valueDate) {
		this.valueDate = valueDate;
	}

	public BaseOneRate getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BaseOneRate exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public ActiveCurrencyAndAmount getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(ActiveCurrencyAndAmount marketValue) {
		this.marketValue = marketValue;
	}

	public PercentageRate getHaircut() {
		return haircut;
	}

	public void setHaircut(PercentageRate haircut) {
		this.haircut = haircut;
	}

	public ActiveCurrencyAndAmount getCollateralValue() {
		return collateralValue;
	}

	public void setCollateralValue(ActiveCurrencyAndAmount collateralValue) {
		this.collateralValue = collateralValue;
	}

	public SafekeepingPlaceFormat7Choice getSafekeepingPlace() {
		return safekeepingPlace;
	}

	public void setSafekeepingPlace(SafekeepingPlaceFormat7Choice safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
	}

	public SecuritiesAccount19 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public void setSafekeepingAccount(com.tools20022.repository.msg.SecuritiesAccount19 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
	}
}