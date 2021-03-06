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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CollateralisationType1Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd20Amount;
import com.tools20022.repository.datatype.Max52Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of collateral agreement between counterparties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport4#mmCollateralisation
 * TradeCollateralReport4.mmCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport4#mmPortfolio
 * TradeCollateralReport4.mmPortfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport4#mmInitialMarginPosted
 * TradeCollateralReport4.mmInitialMarginPosted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport4#mmVariationMarginPosted
 * TradeCollateralReport4.mmVariationMarginPosted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport4#mmInitialMarginReceived
 * TradeCollateralReport4.mmInitialMarginReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport4#mmVariationMarginReceived
 * TradeCollateralReport4.mmVariationMarginReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport4#mmExcessCollateralPosted
 * TradeCollateralReport4.mmExcessCollateralPosted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport4#mmExcessCollateralReceived
 * TradeCollateralReport4.mmExcessCollateralReceived}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeCollateralReport4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of collateral agreement between counterparties."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeCollateralReport4", propOrder = {"collateralisation", "portfolio", "initialMarginPosted", "variationMarginPosted", "initialMarginReceived", "variationMarginReceived", "excessCollateralPosted",
		"excessCollateralReceived"})
public class TradeCollateralReport4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Collstn", required = true)
	protected CollateralisationType1Code collateralisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralisationType1Code
	 * CollateralisationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport4
	 * TradeCollateralReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Collstn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information indicating the type of collateral agreement existing between counterparties."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeCollateralReport4, CollateralisationType1Code> mmCollateralisation = new MMMessageAttribute<TradeCollateralReport4, CollateralisationType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCollateralReport4.mmObject();
			isDerived = false;
			xmlTag = "Collstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateralisation";
			definition = "Information indicating the type of collateral agreement existing between counterparties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralisationType1Code.mmObject();
		}

		@Override
		public CollateralisationType1Code getValue(TradeCollateralReport4 obj) {
			return obj.getCollateralisation();
		}

		@Override
		public void setValue(TradeCollateralReport4 obj, CollateralisationType1Code value) {
			obj.setCollateralisation(value);
		}
	};
	@XmlElement(name = "Prtfl")
	protected Max52Text portfolio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max52Text
	 * Max52Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport4
	 * TradeCollateralReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtfl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Portfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A unique code determined by the reporting counterparty to identify the portfolio if collateral is reported on a portfolio basis."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeCollateralReport4, Optional<Max52Text>> mmPortfolio = new MMMessageAttribute<TradeCollateralReport4, Optional<Max52Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCollateralReport4.mmObject();
			isDerived = false;
			xmlTag = "Prtfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Portfolio";
			definition = "A unique code determined by the reporting counterparty to identify the portfolio if collateral is reported on a portfolio basis.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max52Text.mmObject();
		}

		@Override
		public Optional<Max52Text> getValue(TradeCollateralReport4 obj) {
			return obj.getPortfolio();
		}

		@Override
		public void setValue(TradeCollateralReport4 obj, Optional<Max52Text> value) {
			obj.setPortfolio(value.orElse(null));
		}
	};
	@XmlElement(name = "InitlMrgnPstd")
	protected ActiveOrHistoricCurrencyAnd20Amount initialMarginPosted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd20Amount
	 * ActiveOrHistoricCurrencyAnd20Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport4
	 * TradeCollateralReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitlMrgnPstd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialMarginPosted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the initial margin posted by the reporting counterparty to the other counterparty. \r\n\r\nUsage: Where initial margin is posted on a portfolio basis, this field should include the overall value of initial margin posted for the portfolio."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeCollateralReport4, Optional<ActiveOrHistoricCurrencyAnd20Amount>> mmInitialMarginPosted = new MMMessageAttribute<TradeCollateralReport4, Optional<ActiveOrHistoricCurrencyAnd20Amount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCollateralReport4.mmObject();
			isDerived = false;
			xmlTag = "InitlMrgnPstd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialMarginPosted";
			definition = "Value of the initial margin posted by the reporting counterparty to the other counterparty. \r\n\r\nUsage: Where initial margin is posted on a portfolio basis, this field should include the overall value of initial margin posted for the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd20Amount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAnd20Amount> getValue(TradeCollateralReport4 obj) {
			return obj.getInitialMarginPosted();
		}

		@Override
		public void setValue(TradeCollateralReport4 obj, Optional<ActiveOrHistoricCurrencyAnd20Amount> value) {
			obj.setInitialMarginPosted(value.orElse(null));
		}
	};
	@XmlElement(name = "VartnMrgnPstd")
	protected ActiveOrHistoricCurrencyAnd20Amount variationMarginPosted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd20Amount
	 * ActiveOrHistoricCurrencyAnd20Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport4
	 * TradeCollateralReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VartnMrgnPstd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginPosted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the variation margin posted, including cash settled, by the reporting counterparty to the other counterparty. \r\n\r\nUsage: Where variation margin is posted on a portfolio basis, this field should include the overall value of variation margin posted for the portfolio."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeCollateralReport4, Optional<ActiveOrHistoricCurrencyAnd20Amount>> mmVariationMarginPosted = new MMMessageAttribute<TradeCollateralReport4, Optional<ActiveOrHistoricCurrencyAnd20Amount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCollateralReport4.mmObject();
			isDerived = false;
			xmlTag = "VartnMrgnPstd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginPosted";
			definition = "Value of the variation margin posted, including cash settled, by the reporting counterparty to the other counterparty. \r\n\r\nUsage: Where variation margin is posted on a portfolio basis, this field should include the overall value of variation margin posted for the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd20Amount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAnd20Amount> getValue(TradeCollateralReport4 obj) {
			return obj.getVariationMarginPosted();
		}

		@Override
		public void setValue(TradeCollateralReport4 obj, Optional<ActiveOrHistoricCurrencyAnd20Amount> value) {
			obj.setVariationMarginPosted(value.orElse(null));
		}
	};
	@XmlElement(name = "InitlMrgnRcvd")
	protected ActiveOrHistoricCurrencyAnd20Amount initialMarginReceived;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd20Amount
	 * ActiveOrHistoricCurrencyAnd20Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport4
	 * TradeCollateralReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitlMrgnRcvd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialMarginReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the initial margin received by the reporting counterparty from the other counterparty. \r\n\r\nUsage: Where initial margin is received on a portfolio basis, this field should include the overall value of initial margin received for the portfolio."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeCollateralReport4, Optional<ActiveOrHistoricCurrencyAnd20Amount>> mmInitialMarginReceived = new MMMessageAttribute<TradeCollateralReport4, Optional<ActiveOrHistoricCurrencyAnd20Amount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCollateralReport4.mmObject();
			isDerived = false;
			xmlTag = "InitlMrgnRcvd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialMarginReceived";
			definition = "Value of the initial margin received by the reporting counterparty from the other counterparty. \r\n\r\nUsage: Where initial margin is received on a portfolio basis, this field should include the overall value of initial margin received for the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd20Amount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAnd20Amount> getValue(TradeCollateralReport4 obj) {
			return obj.getInitialMarginReceived();
		}

		@Override
		public void setValue(TradeCollateralReport4 obj, Optional<ActiveOrHistoricCurrencyAnd20Amount> value) {
			obj.setInitialMarginReceived(value.orElse(null));
		}
	};
	@XmlElement(name = "VartnMrgnRcvd")
	protected ActiveOrHistoricCurrencyAnd20Amount variationMarginReceived;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd20Amount
	 * ActiveOrHistoricCurrencyAnd20Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport4
	 * TradeCollateralReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VartnMrgnRcvd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the variation margin received, including cash settled, by the reporting counterparty from the other counterparty. \r\n\r\nUsage: Where variation margin is received on a portfolio basis, this field should include the overall value of variation margin received for the portfolio.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeCollateralReport4, Optional<ActiveOrHistoricCurrencyAnd20Amount>> mmVariationMarginReceived = new MMMessageAttribute<TradeCollateralReport4, Optional<ActiveOrHistoricCurrencyAnd20Amount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCollateralReport4.mmObject();
			isDerived = false;
			xmlTag = "VartnMrgnRcvd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginReceived";
			definition = "Value of the variation margin received, including cash settled, by the reporting counterparty from the other counterparty. \r\n\r\nUsage: Where variation margin is received on a portfolio basis, this field should include the overall value of variation margin received for the portfolio.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd20Amount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAnd20Amount> getValue(TradeCollateralReport4 obj) {
			return obj.getVariationMarginReceived();
		}

		@Override
		public void setValue(TradeCollateralReport4 obj, Optional<ActiveOrHistoricCurrencyAnd20Amount> value) {
			obj.setVariationMarginReceived(value.orElse(null));
		}
	};
	@XmlElement(name = "XcssCollPstd")
	protected ActiveOrHistoricCurrencyAnd20Amount excessCollateralPosted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd20Amount
	 * ActiveOrHistoricCurrencyAnd20Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport4
	 * TradeCollateralReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XcssCollPstd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExcessCollateralPosted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of collateral posted in excess of the required collateral."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeCollateralReport4, Optional<ActiveOrHistoricCurrencyAnd20Amount>> mmExcessCollateralPosted = new MMMessageAttribute<TradeCollateralReport4, Optional<ActiveOrHistoricCurrencyAnd20Amount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCollateralReport4.mmObject();
			isDerived = false;
			xmlTag = "XcssCollPstd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExcessCollateralPosted";
			definition = "Value of collateral posted in excess of the required collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd20Amount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAnd20Amount> getValue(TradeCollateralReport4 obj) {
			return obj.getExcessCollateralPosted();
		}

		@Override
		public void setValue(TradeCollateralReport4 obj, Optional<ActiveOrHistoricCurrencyAnd20Amount> value) {
			obj.setExcessCollateralPosted(value.orElse(null));
		}
	};
	@XmlElement(name = "XcssCollRcvd")
	protected ActiveOrHistoricCurrencyAnd20Amount excessCollateralReceived;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd20Amount
	 * ActiveOrHistoricCurrencyAnd20Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport4
	 * TradeCollateralReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XcssCollRcvd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExcessCollateralReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of collateral received in excess of the required collateral."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeCollateralReport4, Optional<ActiveOrHistoricCurrencyAnd20Amount>> mmExcessCollateralReceived = new MMMessageAttribute<TradeCollateralReport4, Optional<ActiveOrHistoricCurrencyAnd20Amount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCollateralReport4.mmObject();
			isDerived = false;
			xmlTag = "XcssCollRcvd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExcessCollateralReceived";
			definition = "Value of collateral received in excess of the required collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd20Amount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAnd20Amount> getValue(TradeCollateralReport4 obj) {
			return obj.getExcessCollateralReceived();
		}

		@Override
		public void setValue(TradeCollateralReport4 obj, Optional<ActiveOrHistoricCurrencyAnd20Amount> value) {
			obj.setExcessCollateralReceived(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeCollateralReport4.mmCollateralisation, com.tools20022.repository.msg.TradeCollateralReport4.mmPortfolio,
						com.tools20022.repository.msg.TradeCollateralReport4.mmInitialMarginPosted, com.tools20022.repository.msg.TradeCollateralReport4.mmVariationMarginPosted,
						com.tools20022.repository.msg.TradeCollateralReport4.mmInitialMarginReceived, com.tools20022.repository.msg.TradeCollateralReport4.mmVariationMarginReceived,
						com.tools20022.repository.msg.TradeCollateralReport4.mmExcessCollateralPosted, com.tools20022.repository.msg.TradeCollateralReport4.mmExcessCollateralReceived);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeCollateralReport4";
				definition = "Details of collateral agreement between counterparties.";
			}
		});
		return mmObject_lazy.get();
	}

	public CollateralisationType1Code getCollateralisation() {
		return collateralisation;
	}

	public TradeCollateralReport4 setCollateralisation(CollateralisationType1Code collateralisation) {
		this.collateralisation = Objects.requireNonNull(collateralisation);
		return this;
	}

	public Optional<Max52Text> getPortfolio() {
		return portfolio == null ? Optional.empty() : Optional.of(portfolio);
	}

	public TradeCollateralReport4 setPortfolio(Max52Text portfolio) {
		this.portfolio = portfolio;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAnd20Amount> getInitialMarginPosted() {
		return initialMarginPosted == null ? Optional.empty() : Optional.of(initialMarginPosted);
	}

	public TradeCollateralReport4 setInitialMarginPosted(ActiveOrHistoricCurrencyAnd20Amount initialMarginPosted) {
		this.initialMarginPosted = initialMarginPosted;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAnd20Amount> getVariationMarginPosted() {
		return variationMarginPosted == null ? Optional.empty() : Optional.of(variationMarginPosted);
	}

	public TradeCollateralReport4 setVariationMarginPosted(ActiveOrHistoricCurrencyAnd20Amount variationMarginPosted) {
		this.variationMarginPosted = variationMarginPosted;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAnd20Amount> getInitialMarginReceived() {
		return initialMarginReceived == null ? Optional.empty() : Optional.of(initialMarginReceived);
	}

	public TradeCollateralReport4 setInitialMarginReceived(ActiveOrHistoricCurrencyAnd20Amount initialMarginReceived) {
		this.initialMarginReceived = initialMarginReceived;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAnd20Amount> getVariationMarginReceived() {
		return variationMarginReceived == null ? Optional.empty() : Optional.of(variationMarginReceived);
	}

	public TradeCollateralReport4 setVariationMarginReceived(ActiveOrHistoricCurrencyAnd20Amount variationMarginReceived) {
		this.variationMarginReceived = variationMarginReceived;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAnd20Amount> getExcessCollateralPosted() {
		return excessCollateralPosted == null ? Optional.empty() : Optional.of(excessCollateralPosted);
	}

	public TradeCollateralReport4 setExcessCollateralPosted(ActiveOrHistoricCurrencyAnd20Amount excessCollateralPosted) {
		this.excessCollateralPosted = excessCollateralPosted;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAnd20Amount> getExcessCollateralReceived() {
		return excessCollateralReceived == null ? Optional.empty() : Optional.of(excessCollateralReceived);
	}

	public TradeCollateralReport4 setExcessCollateralReceived(ActiveOrHistoricCurrencyAnd20Amount excessCollateralReceived) {
		this.excessCollateralReceived = excessCollateralReceived;
		return this;
	}
}