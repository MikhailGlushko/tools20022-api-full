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
import com.tools20022.repository.choice.DateFormat28Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code;
import com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max8Text;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides additional information regarding corporate action confirmation
 * securities movement details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2#mmPlaceAndName
 * CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2#mmCreditDebitIndicator
 * CorporateActionConfirmationSecuritiesMovementDetailsSD2.
 * mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2#mmTransactionQuantity
 * CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmTransactionQuantity
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2#mmReasonCode
 * CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2#mmSubReasonCode
 * CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmSubReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2#mmContraParticipantNumber
 * CorporateActionConfirmationSecuritiesMovementDetailsSD2.
 * mmContraParticipantNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2#mmMaturityDate
 * CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2#mmPostingDate
 * CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmPostingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2#mmTaxAdjustmentRate
 * CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmTaxAdjustmentRate}</li>
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
 * "CorporateActionConfirmationSecuritiesMovementDetailsSD2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action confirmation securities movement details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3
 * CorporateActionConfirmationSecuritiesMovementDetailsSD3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD1
 * CorporateActionConfirmationSecuritiesMovementDetailsSD1}</li>
 * </ul>
 */
public class CorporateActionConfirmationSecuritiesMovementDetailsSD2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3#mmPlaceAndName
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD1#mmPlaceAndName
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD1.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmPlaceAndName);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD1.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * Indicates whether the value is a debit or a credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the value is a debit or a credit."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3#mmCreditDebitIndicator
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD3.
	 * mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD1#mmCreditDebitIndicator
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD1.
	 * mmCreditDebitIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditDebitIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the value is a debit or a credit.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmCreditDebitIndicator);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD1.mmCreditDebitIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}
	};
	protected FinancialInstrumentQuantity15Choice transactionQuantity;
	/**
	 * Resulting quantity of securities concerned in this transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Resulting quantity of securities concerned in this transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3#mmTransactionQuantity
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD3.
	 * mmTransactionQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD1#mmTransactionQuantity
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD1.
	 * mmTransactionQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionQuantity";
			definition = "Resulting quantity of securities concerned in this transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmTransactionQuantity);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD1.mmTransactionQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	protected DTCAdjustmentPaymentType2Code reasonCode;
	/**
	 * Transaction reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction reason."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3#mmReasonCode
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmReasonCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD1#mmReasonCode
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD1.mmReasonCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReasonCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "RsnCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonCode";
			definition = "Transaction reason.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmReasonCode);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD1.mmReasonCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAdjustmentPaymentType2Code.mmObject();
		}
	};
	protected DTCAdjustmentPaymentSubReason1Code subReasonCode;
	/**
	 * Transaction sub reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubRsnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction sub reason."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3#mmSubReasonCode
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmSubReasonCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubReasonCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "SubRsnCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubReasonCode";
			definition = "Transaction sub reason.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmSubReasonCode);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAdjustmentPaymentSubReason1Code.mmObject();
		}
	};
	protected Max8Text contraParticipantNumber;
	/**
	 * Transaction contra participant identification when shares are distributed
	 * / delivered to / from another participant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max8Text
	 * Max8Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ContraPtcptNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContraParticipantNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction contra participant identification when shares are distributed / delivered to / from another participant."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3#mmContraParticipantNumber
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD3.
	 * mmContraParticipantNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD1#mmContraParticipantNumber
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD1.
	 * mmContraParticipantNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContraParticipantNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "ContraPtcptNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraParticipantNumber";
			definition = "Transaction contra participant identification when shares are distributed / delivered to / from another participant.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmContraParticipantNumber);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD1.mmContraParticipantNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max8Text.mmObject();
		}
	};
	protected ISODate maturityDate;
	/**
	 * Date on which a financial instrument becomes due and assets are to be
	 * repaid.
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
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which a financial instrument becomes due and assets are to be repaid."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3#mmMaturityDate
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmMaturityDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Asset.mmMaturityDate;
			componentContext_lazy = () -> CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Date on which a financial instrument becomes due and assets are to be repaid.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmMaturityDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected DateFormat28Choice postingDate;
	/**
	 * Date/Time on which the posting /draft of the securities took place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat28Choice
	 * DateFormat28Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstngDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/Time on which the posting /draft of the securities took place."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3#mmPostingDate
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmPostingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD1#mmPostingDate
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD1.mmPostingDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPostingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PstngDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostingDate";
			definition = "Date/Time on which the posting /draft of the securities took place.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmPostingDate);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD1.mmPostingDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat28Choice.mmObject();
		}
	};
	protected PercentageRate taxAdjustmentRate;
	/**
	 * Set of the DTC legacy sub reason codes representing tax rate. Used with
	 * reason codes ‘TJXD’ ‘TJXF’ ‘TJXI’ ‘TJXL’ ‘TJXR’ ‘TJXT’ ‘TJXU’ to identify
	 * the correct tax rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxAdjstmntRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAdjustmentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of the DTC legacy sub reason codes representing tax rate. Used with reason codes ‘TJXD’ ‘TJXF’ ‘TJXI’ ‘TJXL’ ‘TJXR’ ‘TJXT’ ‘TJXU’ to identify the correct tax rate."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3#mmTaxAdjustmentRate
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD3.
	 * mmTaxAdjustmentRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxAdjustmentRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TaxAdjstmntRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAdjustmentRate";
			definition = "Set of the DTC legacy sub reason codes representing tax rate. Used with reason codes ‘TJXD’ ‘TJXF’ ‘TJXI’ ‘TJXL’ ‘TJXR’ ‘TJXT’ ‘TJXU’ to identify the correct tax rate.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmTaxAdjustmentRate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmPlaceAndName,
						com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmCreditDebitIndicator,
						com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmTransactionQuantity, com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmReasonCode,
						com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmSubReasonCode, com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmContraParticipantNumber,
						com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmMaturityDate, com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmPostingDate,
						com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmTaxAdjustmentRate);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionConfirmationSecuritiesMovementDetailsSD2";
				definition = "Provides additional information regarding corporate action confirmation securities movement details.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmObject());
				previousVersion_lazy = () -> CorporateActionConfirmationSecuritiesMovementDetailsSD1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	public FinancialInstrumentQuantity15Choice getTransactionQuantity() {
		return transactionQuantity;
	}

	public void setTransactionQuantity(FinancialInstrumentQuantity15Choice transactionQuantity) {
		this.transactionQuantity = transactionQuantity;
	}

	public DTCAdjustmentPaymentType2Code getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(DTCAdjustmentPaymentType2Code reasonCode) {
		this.reasonCode = reasonCode;
	}

	public DTCAdjustmentPaymentSubReason1Code getSubReasonCode() {
		return subReasonCode;
	}

	public void setSubReasonCode(DTCAdjustmentPaymentSubReason1Code subReasonCode) {
		this.subReasonCode = subReasonCode;
	}

	public Max8Text getContraParticipantNumber() {
		return contraParticipantNumber;
	}

	public void setContraParticipantNumber(Max8Text contraParticipantNumber) {
		this.contraParticipantNumber = contraParticipantNumber;
	}

	public ISODate getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(ISODate maturityDate) {
		this.maturityDate = maturityDate;
	}

	public DateFormat28Choice getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(DateFormat28Choice postingDate) {
		this.postingDate = postingDate;
	}

	public PercentageRate getTaxAdjustmentRate() {
		return taxAdjustmentRate;
	}

	public void setTaxAdjustmentRate(PercentageRate taxAdjustmentRate) {
		this.taxAdjustmentRate = taxAdjustmentRate;
	}
}