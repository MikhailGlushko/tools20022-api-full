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
import com.tools20022.repository.choice.DataFormat2Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.CountryCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the cash-in and cash-out flows by a user defined parameter/s.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3#mmParty
 * BreakdownByUserDefinedParameter3.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3#mmCountry
 * BreakdownByUserDefinedParameter3.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3#mmCurrency
 * BreakdownByUserDefinedParameter3.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3#mmUserDefined
 * BreakdownByUserDefinedParameter3.mmUserDefined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3#mmCashInForecast
 * BreakdownByUserDefinedParameter3.mmCashInForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3#mmCashOutForecast
 * BreakdownByUserDefinedParameter3.mmCashOutForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3#mmNetCashForecast
 * BreakdownByUserDefinedParameter3.mmNetCashForecast}</li>
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
 * "BreakdownByUserDefinedParameter3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the cash-in and cash-out flows by a user defined parameter/s."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter1
 * BreakdownByUserDefinedParameter1}</li>
 * </ul>
 */
public class BreakdownByUserDefinedParameter3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected InvestmentAccount42 party;
	/**
	 * Party for which the cash flow is being reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount42
	 * InvestmentAccount42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3
	 * BreakdownByUserDefinedParameter3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party for which the cash flow is being reported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter1#mmParty
	 * BreakdownByUserDefinedParameter1.mmParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParty = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BreakdownByUserDefinedParameter3.mmObject();
			isDerived = false;
			xmlTag = "Pty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party";
			definition = "Party for which the cash flow is being reported.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BreakdownByUserDefinedParameter1.mmParty;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.InvestmentAccount42.mmObject();
		}
	};
	protected CountryCode country;
	/**
	 * Country for which the cash flow is being reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3
	 * BreakdownByUserDefinedParameter3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country for which the cash flow is being reported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter1#mmCountry
	 * BreakdownByUserDefinedParameter1.mmCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountry = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BreakdownByUserDefinedParameter3.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Country for which the cash flow is being reported.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BreakdownByUserDefinedParameter1.mmCountry;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode currency;
	/**
	 * Currency for which the cash flow is being reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3
	 * BreakdownByUserDefinedParameter3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency for which the cash flow is being reported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter1#mmCurrency
	 * BreakdownByUserDefinedParameter1.mmCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BreakdownByUserDefinedParameter3.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency for which the cash flow is being reported.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BreakdownByUserDefinedParameter1.mmCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected DataFormat2Choice userDefined;
	/**
	 * Parameter for which the cash flow is being reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DataFormat2Choice
	 * DataFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3
	 * BreakdownByUserDefinedParameter3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsrDfnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserDefined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameter for which the cash flow is being reported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter1#mmUserDefined
	 * BreakdownByUserDefinedParameter1.mmUserDefined}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUserDefined = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BreakdownByUserDefinedParameter3.mmObject();
			isDerived = false;
			xmlTag = "UsrDfnd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserDefined";
			definition = "Parameter for which the cash flow is being reported.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BreakdownByUserDefinedParameter1.mmUserDefined;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DataFormat2Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashInForecast5> cashInForecast;
	/**
	 * Cash movement into the fund as a result of transactions in shares in an
	 * investment fund, for example, subscriptions or switch-ins.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashInForecast5
	 * CashInForecast5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3
	 * BreakdownByUserDefinedParameter3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInFcst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash movement into the fund as a result of transactions in shares in an investment fund, for example, subscriptions or switch-ins."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter1#mmCashInForecast
	 * BreakdownByUserDefinedParameter1.mmCashInForecast}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashInForecast = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BreakdownByUserDefinedParameter3.mmObject();
			isDerived = false;
			xmlTag = "CshInFcst";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInForecast";
			definition = "Cash movement into the fund as a result of transactions in shares in an investment fund, for example, subscriptions or switch-ins.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BreakdownByUserDefinedParameter1.mmCashInForecast;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashInForecast5.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashOutForecast5> cashOutForecast;
	/**
	 * Cash movement out of the fund as a result of transactions in shares in an
	 * investment fund, for example, redemptions or switch-outs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashOutForecast5
	 * CashOutForecast5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3
	 * BreakdownByUserDefinedParameter3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshOutFcst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashOutForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash movement out of the fund as a result of transactions in shares in an investment fund, for example, redemptions or switch-outs."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter1#mmCashOutForecast
	 * BreakdownByUserDefinedParameter1.mmCashOutForecast}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashOutForecast = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BreakdownByUserDefinedParameter3.mmObject();
			isDerived = false;
			xmlTag = "CshOutFcst";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashOutForecast";
			definition = "Cash movement out of the fund as a result of transactions in shares in an investment fund, for example, redemptions or switch-outs.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BreakdownByUserDefinedParameter1.mmCashOutForecast;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashOutForecast5.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.NetCashForecast4> netCashForecast;
	/**
	 * Net cash as a result of the cash-in and cash-out flows specified for the
	 * user defined parameter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetCashForecast4
	 * NetCashForecast4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3
	 * BreakdownByUserDefinedParameter3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetCshFcst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetCashForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net cash as a result of the cash-in and cash-out flows specified for the user defined parameter."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter1#mmNetCashForecast
	 * BreakdownByUserDefinedParameter1.mmNetCashForecast}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNetCashForecast = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BreakdownByUserDefinedParameter3.mmObject();
			isDerived = false;
			xmlTag = "NetCshFcst";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetCashForecast";
			definition = "Net cash as a result of the cash-in and cash-out flows specified for the user defined parameter.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BreakdownByUserDefinedParameter1.mmNetCashForecast;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NetCashForecast4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmParty, com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmCountry,
						com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmCurrency, com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmUserDefined,
						com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmCashInForecast, com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmCashOutForecast,
						com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmNetCashForecast);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BreakdownByUserDefinedParameter3";
				definition = "Specifies the cash-in and cash-out flows by a user defined parameter/s.";
				previousVersion_lazy = () -> BreakdownByUserDefinedParameter1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public InvestmentAccount42 getParty() {
		return party;
	}

	public void setParty(com.tools20022.repository.msg.InvestmentAccount42 party) {
		this.party = party;
	}

	public CountryCode getCountry() {
		return country;
	}

	public void setCountry(CountryCode country) {
		this.country = country;
	}

	public ActiveOrHistoricCurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(ActiveOrHistoricCurrencyCode currency) {
		this.currency = currency;
	}

	public DataFormat2Choice getUserDefined() {
		return userDefined;
	}

	public void setUserDefined(DataFormat2Choice userDefined) {
		this.userDefined = userDefined;
	}

	public List<CashInForecast5> getCashInForecast() {
		return cashInForecast;
	}

	public void setCashInForecast(List<com.tools20022.repository.msg.CashInForecast5> cashInForecast) {
		this.cashInForecast = cashInForecast;
	}

	public List<CashOutForecast5> getCashOutForecast() {
		return cashOutForecast;
	}

	public void setCashOutForecast(List<com.tools20022.repository.msg.CashOutForecast5> cashOutForecast) {
		this.cashOutForecast = cashOutForecast;
	}

	public List<NetCashForecast4> getNetCashForecast() {
		return netCashForecast;
	}

	public void setNetCashForecast(List<com.tools20022.repository.msg.NetCashForecast4> netCashForecast) {
		this.netCashForecast = netCashForecast;
	}
}