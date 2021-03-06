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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.ReturnCurrencyExchangeRateV03;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CurrencyExchangeReport3;
import com.tools20022.repository.msg.ErrorHandling3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * It is used to provide information on static data maintained by the
 * transaction administrator and related to currency exchange details as
 * maintained for system operations by the transaction administrator.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ExchangeRateReportOrError1Choice#mmCurrencyExchangeReport
 * ExchangeRateReportOrError1Choice.mmCurrencyExchangeReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ExchangeRateReportOrError1Choice#mmOperationalError
 * ExchangeRateReportOrError1Choice.mmOperationalError}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnCurrencyExchangeRateV03#mmReportOrError
 * ReturnCurrencyExchangeRateV03.mmReportOrError}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExchangeRateReportOrError1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "It is used to provide information on static data maintained by the transaction administrator and related to currency exchange details as maintained for system operations by the transaction administrator."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ExchangeRateReportOrError1Choice", propOrder = {"currencyExchangeReport", "operationalError"})
public class ExchangeRateReportOrError1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CcyXchgRpt", required = true)
	protected List<CurrencyExchangeReport3> currencyExchangeReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport3
	 * CurrencyExchangeReport3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ExchangeRateReportOrError1Choice
	 * ExchangeRateReportOrError1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyXchgRpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reports on currency exchange information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ExchangeRateReportOrError1Choice, List<CurrencyExchangeReport3>> mmCurrencyExchangeReport = new MMMessageAssociationEnd<ExchangeRateReportOrError1Choice, List<CurrencyExchangeReport3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.ExchangeRateReportOrError1Choice.mmObject();
			isDerived = false;
			xmlTag = "CcyXchgRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchangeReport";
			definition = "Reports on currency exchange information.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CurrencyExchangeReport3.mmObject();
		}

		@Override
		public List<CurrencyExchangeReport3> getValue(ExchangeRateReportOrError1Choice obj) {
			return obj.getCurrencyExchangeReport();
		}

		@Override
		public void setValue(ExchangeRateReportOrError1Choice obj, List<CurrencyExchangeReport3> value) {
			obj.setCurrencyExchangeReport(value);
		}
	};
	@XmlElement(name = "OprlErr", required = true)
	protected List<ErrorHandling3> operationalError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling3
	 * ErrorHandling3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ExchangeRateReportOrError1Choice
	 * ExchangeRateReportOrError1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OprlErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperationalError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an operational error has been issued during the processing of the related request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ExchangeRateReportOrError1Choice, List<ErrorHandling3>> mmOperationalError = new MMMessageAssociationEnd<ExchangeRateReportOrError1Choice, List<ErrorHandling3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.ExchangeRateReportOrError1Choice.mmObject();
			isDerived = false;
			xmlTag = "OprlErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalError";
			definition = "Indicates that an operational error has been issued during the processing of the related request.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling3.mmObject();
		}

		@Override
		public List<ErrorHandling3> getValue(ExchangeRateReportOrError1Choice obj) {
			return obj.getOperationalError();
		}

		@Override
		public void setValue(ExchangeRateReportOrError1Choice obj, List<ErrorHandling3> value) {
			obj.setOperationalError(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ExchangeRateReportOrError1Choice.mmCurrencyExchangeReport, com.tools20022.repository.choice.ExchangeRateReportOrError1Choice.mmOperationalError);
				messageBuildingBlock_lazy = () -> Arrays.asList(ReturnCurrencyExchangeRateV03.mmReportOrError);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExchangeRateReportOrError1Choice";
				definition = "It is used to provide information on static data maintained by the transaction administrator and related to currency exchange details as maintained for system operations by the transaction administrator.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<CurrencyExchangeReport3> getCurrencyExchangeReport() {
		return currencyExchangeReport == null ? currencyExchangeReport = new ArrayList<>() : currencyExchangeReport;
	}

	public ExchangeRateReportOrError1Choice setCurrencyExchangeReport(List<CurrencyExchangeReport3> currencyExchangeReport) {
		this.currencyExchangeReport = Objects.requireNonNull(currencyExchangeReport);
		return this;
	}

	public List<ErrorHandling3> getOperationalError() {
		return operationalError == null ? operationalError = new ArrayList<>() : operationalError;
	}

	public ExchangeRateReportOrError1Choice setOperationalError(List<ErrorHandling3> operationalError) {
		this.operationalError = Objects.requireNonNull(operationalError);
		return this;
	}
}