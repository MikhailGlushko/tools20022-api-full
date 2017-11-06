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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CashAccountContract;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies target and actual dates dates related to account opening and
 * closing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountContract3#mmTargetGoLiveDate
 * AccountContract3.mmTargetGoLiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountContract3#mmTargetClosingDate
 * AccountContract3.mmTargetClosingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountContract3#mmGoLiveDate
 * AccountContract3.mmGoLiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountContract3#mmClosingDate
 * AccountContract3.mmClosingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountContract3#mmUrgencyFlag
 * AccountContract3.mmUrgencyFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountContract3#mmRemovalIndicator
 * AccountContract3.mmRemovalIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccountContract
 * CashAccountContract}</li>
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
 * "AccountContract3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies target and actual dates dates related to account opening and closing."
 * </li>
 * </ul>
 */
public class AccountContract3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate targetGoLiveDate;
	/**
	 * Date on which the account and related basic services are expected to be
	 * operational for the account owner.
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
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmTargetGoLiveDate
	 * AccountContract.mmTargetGoLiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract3
	 * AccountContract3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrgtGoLiveDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetGoLiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account and related basic services  are expected to be operational for the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTargetGoLiveDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AccountContract.mmTargetGoLiveDate;
			componentContext_lazy = () -> AccountContract3.mmObject();
			isDerived = false;
			xmlTag = "TrgtGoLiveDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetGoLiveDate";
			definition = "Date on which the account and related basic services  are expected to be operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate targetClosingDate;
	/**
	 * Date on which the account and related services are expected to cease to
	 * be operational for the account owner.
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
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmTargetClosingDate
	 * AccountContract.mmTargetClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract3
	 * AccountContract3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrgtClsgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account and related services are expected to cease to be operational for the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTargetClosingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AccountContract.mmTargetClosingDate;
			componentContext_lazy = () -> AccountContract3.mmObject();
			isDerived = false;
			xmlTag = "TrgtClsgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetClosingDate";
			definition = "Date on which the account and related services are expected to cease to be operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate goLiveDate;
	/**
	 * Date on which the account and related basic services are effectively
	 * operational for the account owner.
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
	 * {@linkplain com.tools20022.repository.entity.Account#mmLiveDate
	 * Account.mmLiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract3
	 * AccountContract3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GoLiveDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoLiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account and related basic services are effectively operational for the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGoLiveDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Account.mmLiveDate;
			componentContext_lazy = () -> AccountContract3.mmObject();
			isDerived = false;
			xmlTag = "GoLiveDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoLiveDate";
			definition = "Date on which the account and related basic services are effectively operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate closingDate;
	/**
	 * Date on which the account and related services cease effectively to be
	 * operational for the account owner.
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
	 * {@linkplain com.tools20022.repository.entity.Account#mmClosingDate
	 * Account.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract3
	 * AccountContract3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account and related services cease effectively to be operational for the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClosingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Account.mmClosingDate;
			componentContext_lazy = () -> AccountContract3.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Date on which the account and related services cease effectively to be operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected YesNoIndicator urgencyFlag;
	/**
	 * Indicator that the account opening/maintenance/closing process needs to
	 * be treated urgently, that is, sooner than the terms established by the
	 * service level agreed between the account holder customer and the account
	 * servicing institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmUrgencyFlag
	 * AccountContract.mmUrgencyFlag}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract3
	 * AccountContract3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UrgcyFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UrgencyFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator that the account opening/maintenance/closing process needs to be treated urgently, that is, sooner than the terms established by the service level agreed between the account holder customer and the account servicing institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUrgencyFlag = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AccountContract.mmUrgencyFlag;
			componentContext_lazy = () -> AccountContract3.mmObject();
			isDerived = false;
			xmlTag = "UrgcyFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UrgencyFlag";
			definition = "Indicator that the account opening/maintenance/closing process needs to be treated urgently, that is, sooner than the terms established by the service level agreed between the account holder customer and the account servicing institution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator removalIndicator;
	/**
	 * Indicates removal of the account. After removal, an account will not
	 * appear anymore in reports.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmRemovalIndicator
	 * AccountContract.mmRemovalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract3
	 * AccountContract3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmvlInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemovalIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates removal of the account. After removal, an account will not appear anymore in reports."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemovalIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AccountContract.mmRemovalIndicator;
			componentContext_lazy = () -> AccountContract3.mmObject();
			isDerived = false;
			xmlTag = "RmvlInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemovalIndicator";
			definition = "Indicates removal of the account. After removal, an account will not appear anymore in reports.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountContract3.mmTargetGoLiveDate, com.tools20022.repository.msg.AccountContract3.mmTargetClosingDate,
						com.tools20022.repository.msg.AccountContract3.mmGoLiveDate, com.tools20022.repository.msg.AccountContract3.mmClosingDate, com.tools20022.repository.msg.AccountContract3.mmUrgencyFlag,
						com.tools20022.repository.msg.AccountContract3.mmRemovalIndicator);
				trace_lazy = () -> CashAccountContract.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountContract3";
				definition = "Specifies target and actual dates dates related to account opening and closing.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getTargetGoLiveDate() {
		return targetGoLiveDate;
	}

	public void setTargetGoLiveDate(ISODate targetGoLiveDate) {
		this.targetGoLiveDate = targetGoLiveDate;
	}

	public ISODate getTargetClosingDate() {
		return targetClosingDate;
	}

	public void setTargetClosingDate(ISODate targetClosingDate) {
		this.targetClosingDate = targetClosingDate;
	}

	public ISODate getGoLiveDate() {
		return goLiveDate;
	}

	public void setGoLiveDate(ISODate goLiveDate) {
		this.goLiveDate = goLiveDate;
	}

	public ISODate getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(ISODate closingDate) {
		this.closingDate = closingDate;
	}

	public YesNoIndicator getUrgencyFlag() {
		return urgencyFlag;
	}

	public void setUrgencyFlag(YesNoIndicator urgencyFlag) {
		this.urgencyFlag = urgencyFlag;
	}

	public YesNoIndicator getRemovalIndicator() {
		return removalIndicator;
	}

	public void setRemovalIndicator(YesNoIndicator removalIndicator) {
		this.removalIndicator = removalIndicator;
	}
}