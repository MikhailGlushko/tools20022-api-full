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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Exact32AlphaNumericText;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max8Text;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides additional information regarding corporate action movement
 * securities movement rate details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmPlaceAndName
 * CorporateActionMovementSecuritiesMovementDetailsSD3.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmCreditDebitIndicator
 * CorporateActionMovementSecuritiesMovementDetailsSD3.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmPayoutType
 * CorporateActionMovementSecuritiesMovementDetailsSD3.mmPayoutType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmTransactionQuantity
 * CorporateActionMovementSecuritiesMovementDetailsSD3.mmTransactionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmReasonCode
 * CorporateActionMovementSecuritiesMovementDetailsSD3.mmReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmSubReasonCode
 * CorporateActionMovementSecuritiesMovementDetailsSD3.mmSubReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmContraParticipantNumber
 * CorporateActionMovementSecuritiesMovementDetailsSD3.mmContraParticipantNumber
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmEarliestPaymentDate
 * CorporateActionMovementSecuritiesMovementDetailsSD3.mmEarliestPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmNewSecuritiesIssuanceIndicator
 * CorporateActionMovementSecuritiesMovementDetailsSD3.
 * mmNewSecuritiesIssuanceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmTaxAdjustmentRate
 * CorporateActionMovementSecuritiesMovementDetailsSD3.mmTaxAdjustmentRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmRDPReferenceNumber
 * CorporateActionMovementSecuritiesMovementDetailsSD3.mmRDPReferenceNumber}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionMovementSecuritiesMovementDetailsSD3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action movement securities movement rate details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4
 * CorporateActionMovementSecuritiesMovementDetailsSD4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD2
 * CorporateActionMovementSecuritiesMovementDetailsSD2}</li>
 * </ul>
 */
public class CorporateActionMovementSecuritiesMovementDetailsSD3 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3
	 * CorporateActionMovementSecuritiesMovementDetailsSD3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4#mmPlaceAndName
	 * CorporateActionMovementSecuritiesMovementDetailsSD4.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD2#mmPlaceAndName
	 * CorporateActionMovementSecuritiesMovementDetailsSD2.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmPlaceAndName);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD2.mmPlaceAndName;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3
	 * CorporateActionMovementSecuritiesMovementDetailsSD3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4#mmCreditDebitIndicator
	 * CorporateActionMovementSecuritiesMovementDetailsSD4.
	 * mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD2#mmCreditDebitIndicator
	 * CorporateActionMovementSecuritiesMovementDetailsSD2.
	 * mmCreditDebitIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditDebitIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the value is a debit or a credit.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmCreditDebitIndicator);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD2.mmCreditDebitIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}
	};
	protected DTCCPayoutType4Code payoutType;
	/**
	 * Specifies the type of payout associated with the event (for example:
	 * principal, long term capital gain).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType4Code
	 * DTCCPayoutType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3
	 * CorporateActionMovementSecuritiesMovementDetailsSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyoutTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayoutType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of payout associated with the event (for example:  principal, long term capital gain)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4#mmPayoutType
	 * CorporateActionMovementSecuritiesMovementDetailsSD4.mmPayoutType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayoutType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "PyoutTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayoutType";
			definition = "Specifies the type of payout associated with the event (for example:  principal, long term capital gain).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmPayoutType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DTCCPayoutType4Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3
	 * CorporateActionMovementSecuritiesMovementDetailsSD3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4#mmTransactionQuantity
	 * CorporateActionMovementSecuritiesMovementDetailsSD4.mmTransactionQuantity
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD2#mmTransactionQuantity
	 * CorporateActionMovementSecuritiesMovementDetailsSD2.mmTransactionQuantity
	 * }</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "TxQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionQuantity";
			definition = "Resulting quantity of securities concerned in this transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmTransactionQuantity);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD2.mmTransactionQuantity;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3
	 * CorporateActionMovementSecuritiesMovementDetailsSD3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4#mmReasonCode
	 * CorporateActionMovementSecuritiesMovementDetailsSD4.mmReasonCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD2#mmReasonCode
	 * CorporateActionMovementSecuritiesMovementDetailsSD2.mmReasonCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReasonCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "RsnCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonCode";
			definition = "Transaction reason.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmReasonCode);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD2.mmReasonCode;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3
	 * CorporateActionMovementSecuritiesMovementDetailsSD3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4#mmSubReasonCode
	 * CorporateActionMovementSecuritiesMovementDetailsSD4.mmSubReasonCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD2#mmSubReasonCode
	 * CorporateActionMovementSecuritiesMovementDetailsSD2.mmSubReasonCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubReasonCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "SubRsnCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubReasonCode";
			definition = "Transaction sub reason.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmSubReasonCode);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD2.mmSubReasonCode;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3
	 * CorporateActionMovementSecuritiesMovementDetailsSD3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4#mmContraParticipantNumber
	 * CorporateActionMovementSecuritiesMovementDetailsSD4.
	 * mmContraParticipantNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD2#mmContraParticipantNumber
	 * CorporateActionMovementSecuritiesMovementDetailsSD2.
	 * mmContraParticipantNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContraParticipantNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "ContraPtcptNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraParticipantNumber";
			definition = "Transaction contra participant identification when shares are distributed / delivered to / from another participant.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmContraParticipantNumber);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD2.mmContraParticipantNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max8Text.mmObject();
		}
	};
	protected DateFormat28Choice earliestPaymentDate;
	/**
	 * Date/Time on which the posting / draft of the securities is scheduled to
	 * take place for a transaction.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3
	 * CorporateActionMovementSecuritiesMovementDetailsSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlstPmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/Time on which the posting / draft of the securities is scheduled to take place for a transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4#mmEarliestPaymentDate
	 * CorporateActionMovementSecuritiesMovementDetailsSD4.mmEarliestPaymentDate
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD2#mmEarliestPaymentDate
	 * CorporateActionMovementSecuritiesMovementDetailsSD2.mmEarliestPaymentDate
	 * }</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEarliestPaymentDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "EarlstPmtDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPaymentDate";
			definition = "Date/Time on which the posting / draft of the securities is scheduled to take place for a transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmEarliestPaymentDate);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD2.mmEarliestPaymentDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat28Choice.mmObject();
		}
	};
	protected NewSecuritiesIssuanceType4Code newSecuritiesIssuanceIndicator;
	/**
	 * Indicates whether the securities are newly issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType4Code
	 * NewSecuritiesIssuanceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3
	 * CorporateActionMovementSecuritiesMovementDetailsSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewSctiesIssncInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewSecuritiesIssuanceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the securities are newly issued.  "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewSecuritiesIssuanceIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "NewSctiesIssncInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewSecuritiesIssuanceIndicator";
			definition = "Indicates whether the securities are newly issued.  ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NewSecuritiesIssuanceType4Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3
	 * CorporateActionMovementSecuritiesMovementDetailsSD3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4#mmTaxAdjustmentRate
	 * CorporateActionMovementSecuritiesMovementDetailsSD4.mmTaxAdjustmentRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD2#mmTaxAdjustmentRate
	 * CorporateActionMovementSecuritiesMovementDetailsSD2.mmTaxAdjustmentRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxAdjustmentRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "TaxAdjstmntRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAdjustmentRate";
			definition = "Set of the DTC legacy sub reason codes representing tax rate. Used with reason codes ‘TJXD’ ‘TJXF’ ‘TJXI’ ‘TJXL’ ‘TJXR’ ‘TJXT’ ‘TJXU’ to identify the correct tax rate.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmTaxAdjustmentRate);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD2.mmTaxAdjustmentRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected Exact32AlphaNumericText rDPReferenceNumber;
	/**
	 * Unique DTCC legacy reference used for matching and reconciling legacy CCF
	 * records. The element will be populated to all levels of the message
	 * (Event Details, Options, Movements) where applicable to indicate how
	 * values are sourced from CCF legacy files. For example: event has 2
	 * related Activity Types 74, and 54. If event details and cash option are
	 * sourced from the Activity Type 74, then Activity Type 74 will be in RDP
	 * Reference Number in event details, and also on the cash option. The
	 * activity type 54 will be "on" the security option. Also, usage rules will
	 * specify the different layouts of the RDP Reference Number based on DTCC
	 * event group (reorganization, distribution, or redemption).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact32AlphaNumericText
	 * Exact32AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3
	 * CorporateActionMovementSecuritiesMovementDetailsSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RDPRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RDPReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique DTCC legacy reference used for matching and reconciling legacy CCF records. The element will be populated to all levels of the message (Event Details, Options, Movements) where applicable to indicate how values are sourced from CCF legacy files.  For example: event has 2 related Activity Types 74, and 54. If event details and cash option are sourced from the Activity Type 74, then Activity Type 74 will be in RDP Reference Number in event details, and also on the cash option. The activity type 54 will be \"on\" the security option.  Also, usage rules will specify the different layouts of the   RDP Reference Number based on DTCC event group (reorganization, distribution, or redemption).  "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4#mmRDPReferenceNumber
	 * CorporateActionMovementSecuritiesMovementDetailsSD4.mmRDPReferenceNumber}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRDPReferenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "RDPRefNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RDPReferenceNumber";
			definition = "Unique DTCC legacy reference used for matching and reconciling legacy CCF records. The element will be populated to all levels of the message (Event Details, Options, Movements) where applicable to indicate how values are sourced from CCF legacy files.  For example: event has 2 related Activity Types 74, and 54. If event details and cash option are sourced from the Activity Type 74, then Activity Type 74 will be in RDP Reference Number in event details, and also on the cash option. The activity type 54 will be \"on\" the security option.  Also, usage rules will specify the different layouts of the   RDP Reference Number based on DTCC event group (reorganization, distribution, or redemption).  ";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmRDPReferenceNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact32AlphaNumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3.mmPlaceAndName,
						com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3.mmCreditDebitIndicator, com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3.mmPayoutType,
						com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3.mmTransactionQuantity, com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3.mmReasonCode,
						com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3.mmSubReasonCode, com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3.mmContraParticipantNumber,
						com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3.mmEarliestPaymentDate,
						com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3.mmNewSecuritiesIssuanceIndicator,
						com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3.mmTaxAdjustmentRate, com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3.mmRDPReferenceNumber);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionMovementSecuritiesMovementDetailsSD3";
				definition = "Provides additional information regarding corporate action movement securities movement rate details.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementSecuritiesMovementDetailsSD4.mmObject());
				previousVersion_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD2.mmObject();
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

	public DTCCPayoutType4Code getPayoutType() {
		return payoutType;
	}

	public void setPayoutType(DTCCPayoutType4Code payoutType) {
		this.payoutType = payoutType;
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

	public DateFormat28Choice getEarliestPaymentDate() {
		return earliestPaymentDate;
	}

	public void setEarliestPaymentDate(DateFormat28Choice earliestPaymentDate) {
		this.earliestPaymentDate = earliestPaymentDate;
	}

	public NewSecuritiesIssuanceType4Code getNewSecuritiesIssuanceIndicator() {
		return newSecuritiesIssuanceIndicator;
	}

	public void setNewSecuritiesIssuanceIndicator(NewSecuritiesIssuanceType4Code newSecuritiesIssuanceIndicator) {
		this.newSecuritiesIssuanceIndicator = newSecuritiesIssuanceIndicator;
	}

	public PercentageRate getTaxAdjustmentRate() {
		return taxAdjustmentRate;
	}

	public void setTaxAdjustmentRate(PercentageRate taxAdjustmentRate) {
		this.taxAdjustmentRate = taxAdjustmentRate;
	}

	public Exact32AlphaNumericText getRDPReferenceNumber() {
		return rDPReferenceNumber;
	}

	public void setRDPReferenceNumber(Exact32AlphaNumericText rDPReferenceNumber) {
		this.rDPReferenceNumber = rDPReferenceNumber;
	}
}