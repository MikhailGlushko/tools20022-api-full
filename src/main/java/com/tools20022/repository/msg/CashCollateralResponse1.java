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
import com.tools20022.repository.choice.AccountIdentification4Choice;
import com.tools20022.repository.codeset.RejectionReasonV021Code;
import com.tools20022.repository.codeset.Status4Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CollateralStatus;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides more details on the response such as the response type, the
 * collateral identification, and optionally further details in case of
 * rejection.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse1#mmResponseType
 * CashCollateralResponse1.mmResponseType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse1#mmCollateralIdentification
 * CashCollateralResponse1.mmCollateralIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse1#mmAssetNumber
 * CashCollateralResponse1.mmAssetNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse1#mmCashAccountIdentification
 * CashCollateralResponse1.mmCashAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse1#mmRejectionReason
 * CashCollateralResponse1.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse1#mmRejectionInformation
 * CashCollateralResponse1.mmRejectionInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralStatus
 * CollateralStatus}</li>
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
 * "CashCollateralResponse1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides more details on the response such as the response type, the collateral identification, and optionally further details in case of rejection."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateralResponse1
 * OtherCollateralResponse1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCollateralResponse1
 * SecuritiesCollateralResponse1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateralResponse2
 * CashCollateralResponse2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class CashCollateralResponse1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Status4Code responseType;
	/**
	 * Specifies the status of the collateral proposal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Status4Code
	 * Status4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmResponseStatus
	 * CollateralStatus.mmResponseStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse1
	 * CashCollateralResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the collateral proposal."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse1#mmResponseType
	 * OtherCollateralResponse1.mmResponseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateralResponse1#mmResponseType
	 * SecuritiesCollateralResponse1.mmResponseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse2#mmResponseType
	 * CashCollateralResponse2.mmResponseType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResponseType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CollateralStatus.mmResponseStatus;
			componentContext_lazy = () -> CashCollateralResponse1.mmObject();
			isDerived = false;
			xmlTag = "RspnTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseType";
			definition = "Specifies the status of the collateral proposal.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateralResponse1.mmResponseType, com.tools20022.repository.msg.SecuritiesCollateralResponse1.mmResponseType,
					com.tools20022.repository.msg.CashCollateralResponse2.mmResponseType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Status4Code.mmObject();
		}
	};
	protected Max35Text collateralIdentification;
	/**
	 * Provides the identification of the proposed collateral.
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
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse1
	 * CashCollateralResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the identification of the proposed collateral."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse1#mmCollateralIdentification
	 * OtherCollateralResponse1.mmCollateralIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateralResponse1#mmCollateralIdentification
	 * SecuritiesCollateralResponse1.mmCollateralIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse2#mmCollateralIdentification
	 * CashCollateralResponse2.mmCollateralIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashCollateralResponse1.mmObject();
			isDerived = false;
			xmlTag = "CollId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIdentification";
			definition = "Provides the identification of the proposed collateral.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateralResponse1.mmCollateralIdentification, com.tools20022.repository.msg.SecuritiesCollateralResponse1.mmCollateralIdentification,
					com.tools20022.repository.msg.CashCollateralResponse2.mmCollateralIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse1
	 * CashCollateralResponse1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse2#mmAssetNumber
	 * CashCollateralResponse2.mmAssetNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAssetNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashCollateralResponse1.mmObject();
			isDerived = false;
			xmlTag = "AsstNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetNumber";
			definition = "Identifies the register number of the collateral deposit assigned by the central counterparty.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashCollateralResponse2.mmAssetNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected AccountIdentification4Choice cashAccountIdentification;
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse1
	 * CashCollateralResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse2#mmCashAccountIdentification
	 * CashCollateralResponse2.mmCashAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashAccountIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Account.mmIdentification;
			componentContext_lazy = () -> CashCollateralResponse1.mmObject();
			isDerived = false;
			xmlTag = "CshAcctId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashCollateralResponse2.mmCashAccountIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentification4Choice.mmObject();
		}
	};
	protected RejectionReasonV021Code rejectionReason;
	/**
	 * Specifies the reason why the instruction/cancellation request has a
	 * rejected status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV021Code
	 * RejectionReasonV021Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse1
	 * CashCollateralResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction/cancellation request has a rejected status."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse1#mmRejectionReason
	 * OtherCollateralResponse1.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateralResponse1#mmRejectionReason
	 * SecuritiesCollateralResponse1.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse2#mmRejectionReason
	 * CashCollateralResponse2.mmRejectionReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRejectionReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.StatusReason.mmRejectionReason;
			componentContext_lazy = () -> CashCollateralResponse1.mmObject();
			isDerived = false;
			xmlTag = "RjctnRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Specifies the reason why the instruction/cancellation request has a rejected status.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateralResponse1.mmRejectionReason, com.tools20022.repository.msg.SecuritiesCollateralResponse1.mmRejectionReason,
					com.tools20022.repository.msg.CashCollateralResponse2.mmRejectionReason);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RejectionReasonV021Code.mmObject();
		}
	};
	protected Max35Text rejectionInformation;
	/**
	 * Additional information regarding why the collateral proposal has a
	 * rejected status.
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
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse1
	 * CashCollateralResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information regarding why the collateral proposal has a rejected status."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateralResponse1#mmRejectionInformation
	 * OtherCollateralResponse1.mmRejectionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateralResponse1#mmRejectionInformation
	 * SecuritiesCollateralResponse1.mmRejectionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateralResponse2#mmRejectionInformation
	 * CashCollateralResponse2.mmRejectionInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRejectionInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashCollateralResponse1.mmObject();
			isDerived = false;
			xmlTag = "RjctnInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionInformation";
			definition = "Additional information regarding why the collateral proposal has a rejected status.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCollateralResponse1.mmRejectionInformation, com.tools20022.repository.msg.SecuritiesCollateralResponse1.mmRejectionInformation,
					com.tools20022.repository.msg.CashCollateralResponse2.mmRejectionInformation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashCollateralResponse1.mmResponseType, com.tools20022.repository.msg.CashCollateralResponse1.mmCollateralIdentification,
						com.tools20022.repository.msg.CashCollateralResponse1.mmAssetNumber, com.tools20022.repository.msg.CashCollateralResponse1.mmCashAccountIdentification,
						com.tools20022.repository.msg.CashCollateralResponse1.mmRejectionReason, com.tools20022.repository.msg.CashCollateralResponse1.mmRejectionInformation);
				trace_lazy = () -> CollateralStatus.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashCollateralResponse1";
				definition = "Provides more details on the response such as the response type, the collateral identification, and optionally further details in case of rejection.";
				nextVersions_lazy = () -> Arrays.asList(OtherCollateralResponse1.mmObject(), SecuritiesCollateralResponse1.mmObject(), CashCollateralResponse2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Status4Code getResponseType() {
		return responseType;
	}

	public void setResponseType(Status4Code responseType) {
		this.responseType = responseType;
	}

	public Max35Text getCollateralIdentification() {
		return collateralIdentification;
	}

	public void setCollateralIdentification(Max35Text collateralIdentification) {
		this.collateralIdentification = collateralIdentification;
	}

	public Max35Text getAssetNumber() {
		return assetNumber;
	}

	public void setAssetNumber(Max35Text assetNumber) {
		this.assetNumber = assetNumber;
	}

	public AccountIdentification4Choice getCashAccountIdentification() {
		return cashAccountIdentification;
	}

	public void setCashAccountIdentification(AccountIdentification4Choice cashAccountIdentification) {
		this.cashAccountIdentification = cashAccountIdentification;
	}

	public RejectionReasonV021Code getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(RejectionReasonV021Code rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	public Max35Text getRejectionInformation() {
		return rejectionInformation;
	}

	public void setRejectionInformation(Max35Text rejectionInformation) {
		this.rejectionInformation = rejectionInformation;
	}
}