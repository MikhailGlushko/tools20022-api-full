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
import com.tools20022.repository.choice.TransportMeans1Choice;
import com.tools20022.repository.choice.TransportMeans2Choice;
import com.tools20022.repository.codeset.FreightChargesCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Moving of goods or people from one place to another by vehicle.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Transport" src="doc-files/Transport.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmIncoterms
 * Transport.mmIncoterms}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmIdentification
 * Transport.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmPackaging
 * Transport.mmPackaging}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmArrivalDateTime
 * Transport.mmArrivalDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmPartialShipment
 * Transport.mmPartialShipment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmTransShipment
 * Transport.mmTransShipment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmProductDelivery
 * Transport.mmProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDeparture
 * Transport.mmPlaceOfDeparture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDestination
 * Transport.mmPlaceOfDestination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportCharges
 * Transport.mmTransportCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmFreightChargesPrepaidOrCollect
 * Transport.mmFreightChargesPrepaidOrCollect}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmShipmentDates
 * Transport.mmShipmentDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportedGoods
 * Transport.mmTransportedGoods}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmPartyRole
 * Transport.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmTransitLocation
 * Transport.mmTransitLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportDocuments
 * Transport.mmTransportDocuments}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.TransportByAir
 * TransportByAir}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransportBySea
 * TransportBySea}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransportByRoad
 * TransportByRoad}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransportByRail
 * TransportByRail}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#mmDepartureTransportParameters
 * Location.mmDepartureTransportParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#mmDestinationTransportParameters
 * Location.mmDestinationTransportParameters}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmRelatedTransport
 * Location.mmRelatedTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmTransport
 * Document.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmTransport
 * Charges.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Incoterms#mmTransport
 * Incoterms.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Goods#mmTransport
 * Goods.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDelivery#mmRouting
 * ProductDelivery.mmRouting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#mmTransport
 * Packaging.mmTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransportPartyRole#mmTransport
 * TransportPartyRole.mmTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmRelatedTransport
 * ShipmentDateRange.mmRelatedTransport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransportMeans3#mmModeCode
 * TransportMeans3.mmModeCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment2#mmTransportMeans
 * Consignment2.mmTransportMeans}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransportMeans1Choice#mmIndividualTransport
 * TransportMeans1Choice.mmIndividualTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransportMeans1Choice#mmMultimodalTransport
 * TransportMeans1Choice.mmMultimodalTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans1#mmIndividualTransport
 * TransportMeans1.mmIndividualTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans1#mmMultimodalTransport
 * TransportMeans1.mmMultimodalTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransportMeans2Choice#mmIndividualTransport
 * TransportMeans2Choice.mmIndividualTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransportMeans2Choice#mmMultimodalTransport
 * TransportMeans2Choice.mmMultimodalTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails1#mmRoutingSummary
 * TransportDetails1.mmRoutingSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDataSet2#mmTransportInformation
 * TransportDataSet2.mmTransportInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans2#mmIndividualTransport
 * TransportMeans2.mmIndividualTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans2#mmMultimodalTransport
 * TransportMeans2.mmMultimodalTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmRoutingSummary
 * TransportDetails2.mmRoutingSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDataSet3#mmTransportInformation
 * TransportDataSet3.mmTransportInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDataSet4#mmTransportInformation
 * TransportDataSet4.mmTransportInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmRoutingSummary
 * TransportDetails3.mmRoutingSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans4#mmIndividualTransport
 * TransportMeans4.mmIndividualTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans4#mmMultimodalTransport
 * TransportMeans4.mmMultimodalTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans5#mmIndividualTransport
 * TransportMeans5.mmIndividualTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans5#mmMultimodalTransport
 * TransportMeans5.mmMultimodalTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDataSet5#mmTransportInformation
 * TransportDataSet5.mmTransportInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans6#mmIndividualTransport
 * TransportMeans6.mmIndividualTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans6#mmMultimodalTransport
 * TransportMeans6.mmMultimodalTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmRoutingSummary
 * TransportDetails4.mmRoutingSummary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment4#mmTransportMeans
 * Consignment4.mmTransportMeans}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransportMeans3
 * TransportMeans3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment2 Consignment2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleTransport1
 * SingleTransport1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MultimodalTransport1
 * MultimodalTransport1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransportMeans1Choice
 * TransportMeans1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleTransport4
 * SingleTransport4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MultimodalTransport3
 * MultimodalTransport3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportMeans1
 * TransportMeans1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleTransport2
 * SingleTransport2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MultimodalTransport2
 * MultimodalTransport2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransportMeans2Choice
 * TransportMeans2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDetails1
 * TransportDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDataSet2
 * TransportDataSet2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleTransport5
 * SingleTransport5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportMeans2
 * TransportMeans2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDetails2
 * TransportDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDataSet3
 * TransportDataSet3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleTransport3
 * SingleTransport3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDataSet4
 * TransportDataSet4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDetails3
 * TransportDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportMeans4
 * TransportMeans4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleTransport6
 * SingleTransport6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleTransport7
 * SingleTransport7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportMeans5
 * TransportMeans5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDataSet5
 * TransportDataSet5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportMeans6
 * TransportMeans6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleTransport8
 * SingleTransport8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDetails4
 * TransportDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment4 Consignment4}</li>
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
 * "Transport"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Moving of goods or people from one place to another by vehicle."</li>
 * </ul>
 */
public class Transport {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Incoterms incoterms;
	/**
	 * Specifies the applicable Incoterm and associated location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Incoterms#mmTransport
	 * Incoterms.mmTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Incoterms Incoterms}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement6#mmIncoterms
	 * TradeAgreement6.mmIncoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmIncoterms
	 * LineItem10.mmIncoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#mmIncoterms
	 * LineItemDetails4.mmIncoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#mmIncoterms
	 * LineItem5.mmIncoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmIncoterms
	 * LineItemDetails7.mmIncoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem7#mmIncoterms
	 * LineItem7.mmIncoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem4#mmIncoterms
	 * LineItem4.mmIncoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails1#mmIncoterms
	 * TransportDetails1.mmIncoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem9#mmIncoterms
	 * LineItem9.mmIncoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmIncoterms
	 * TransportDetails2.mmIncoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmIncoterms
	 * TransportDetails3.mmIncoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem11#mmIncoterms
	 * LineItem11.mmIncoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmIncoterms
	 * LineItemDetails10.mmIncoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem12#mmIncoterms
	 * LineItem12.mmIncoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmIncoterms
	 * LineItemDetails13.mmIncoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmIncoterms
	 * LineItem13.mmIncoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem15#mmIncoterms
	 * LineItem15.mmIncoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmIncoterms
	 * TransportDetails4.mmIncoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement13#mmIncoterms
	 * TradeAgreement13.mmIncoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmIncoterms
	 * LineItem16.mmIncoterms}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incoterms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the applicable Incoterm and associated location."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIncoterms = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeAgreement6.mmIncoterms, com.tools20022.repository.msg.LineItem10.mmIncoterms, com.tools20022.repository.msg.LineItemDetails4.mmIncoterms,
					com.tools20022.repository.msg.LineItem5.mmIncoterms, com.tools20022.repository.msg.LineItemDetails7.mmIncoterms, com.tools20022.repository.msg.LineItem7.mmIncoterms, com.tools20022.repository.msg.LineItem4.mmIncoterms,
					com.tools20022.repository.msg.TransportDetails1.mmIncoterms, com.tools20022.repository.msg.LineItem9.mmIncoterms, com.tools20022.repository.msg.TransportDetails2.mmIncoterms,
					com.tools20022.repository.msg.TransportDetails3.mmIncoterms, com.tools20022.repository.msg.LineItem11.mmIncoterms, com.tools20022.repository.msg.LineItemDetails10.mmIncoterms,
					com.tools20022.repository.msg.LineItem12.mmIncoterms, com.tools20022.repository.msg.LineItemDetails13.mmIncoterms, com.tools20022.repository.msg.LineItem13.mmIncoterms,
					com.tools20022.repository.msg.LineItem15.mmIncoterms, com.tools20022.repository.msg.TransportDetails4.mmIncoterms, com.tools20022.repository.msg.TradeAgreement13.mmIncoterms,
					com.tools20022.repository.msg.LineItem16.mmIncoterms);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Incoterms";
			definition = "Specifies the applicable Incoterm and associated location.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Incoterms.mmTransport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Incoterms.mmObject();
		}
	};
	protected Max35Text identification;
	/**
	 * Unique identification of the means of transport, such as the
	 * International Maritime Organization number of a vessel.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportMeans3#mmIdentification
	 * TransportMeans3.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the means of transport, such as the International Maritime Organization number of a vessel."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportMeans3.mmIdentification);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique identification of the means of transport, such as the International Maritime Organization number of a vessel.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Packaging packaging;
	/**
	 * Physical packaging of goods for transport.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmTransport
	 * Packaging.mmTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Packaging Packaging}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#mmPackaging
	 * LineItem10.mmPackaging}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmConsignment
	 * TransportDetails2.mmConsignment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmConsignment
	 * TransportDetails3.mmConsignment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmConsignment
	 * TransportDetails4.mmConsignment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#mmPackaging
	 * LineItem16.mmPackaging}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Packaging"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical packaging of goods for transport."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPackaging = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem10.mmPackaging, com.tools20022.repository.msg.TransportDetails2.mmConsignment, com.tools20022.repository.msg.TransportDetails3.mmConsignment,
					com.tools20022.repository.msg.TransportDetails4.mmConsignment, com.tools20022.repository.msg.LineItem16.mmPackaging);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Packaging";
			definition = "Physical packaging of goods for transport.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.mmTransport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
		}
	};
	protected ISODateTime arrivalDateTime;
	/**
	 * Date and time when the goods reach their destination..
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmDeliveryDateTime
	 * LineItem10.mmDeliveryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmDeliveryDateTime
	 * LineItem16.mmDeliveryDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ArrivalDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time when the goods reach their destination.."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmArrivalDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem10.mmDeliveryDateTime, com.tools20022.repository.msg.LineItem16.mmDeliveryDateTime);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ArrivalDateTime";
			definition = "Date and time when the goods reach their destination..";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected YesNoIndicator partialShipment;
	/**
	 * Indicates whether or not partial shipments are allowed.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem5#mmPartialShipment
	 * LineItem5.mmPartialShipment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem7#mmPartialShipment
	 * LineItem7.mmPartialShipment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmPartialShipment
	 * LineItem11.mmPartialShipment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem13#mmPartialShipment
	 * LineItem13.mmPartialShipment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialShipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether or not partial shipments are allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPartialShipment = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem5.mmPartialShipment, com.tools20022.repository.msg.LineItem7.mmPartialShipment, com.tools20022.repository.msg.LineItem11.mmPartialShipment,
					com.tools20022.repository.msg.LineItem13.mmPartialShipment);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialShipment";
			definition = "Indicates whether or not partial shipments are allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator transShipment;
	/**
	 * Indicates whether or not transshipment of goods is allowed.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#mmTransShipment
	 * LineItem5.mmTransShipment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem7#mmTransShipment
	 * LineItem7.mmTransShipment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem11#mmTransShipment
	 * LineItem11.mmTransShipment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmTransShipment
	 * LineItem13.mmTransShipment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransShipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not transshipment of goods is allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransShipment = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem5.mmTransShipment, com.tools20022.repository.msg.LineItem7.mmTransShipment, com.tools20022.repository.msg.LineItem11.mmTransShipment,
					com.tools20022.repository.msg.LineItem13.mmTransShipment);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransShipment";
			definition = "Indicates whether or not transshipment of goods is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ProductDelivery productDelivery;
	/**
	 * Specifies the delivery parameters of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmRouting
	 * ProductDelivery.mmRouting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the delivery parameters of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProductDelivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductDelivery";
			definition = "Specifies the delivery parameters of a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmRouting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
		}
	};
	protected Location placeOfDeparture;
	/**
	 * Place from where the goods must leave.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmDepartureTransportParameters
	 * Location.mmDepartureTransportParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir1#mmDepartureAirport
	 * TransportByAir1.mmDepartureAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea1#mmPortOfLoading
	 * TransportBySea1.mmPortOfLoading}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad1#mmPlaceOfReceipt
	 * TransportByRoad1.mmPlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail1#mmPlaceOfReceipt
	 * TransportByRail1.mmPlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#mmDepartureAirport
	 * MultimodalTransport1.mmDepartureAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#mmPortOfLoading
	 * MultimodalTransport1.mmPortOfLoading}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#mmPlaceOfReceipt
	 * MultimodalTransport1.mmPlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#mmTakingInCharge
	 * MultimodalTransport1.mmTakingInCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir3#mmDepartureAirport
	 * TransportByAir3.mmDepartureAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea3#mmPortOfLoading
	 * TransportBySea3.mmPortOfLoading}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad3#mmPlaceOfReceipt
	 * TransportByRoad3.mmPlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport3#mmTakingInCharge
	 * MultimodalTransport3.mmTakingInCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir2#mmDepartureAirport
	 * TransportByAir2.mmDepartureAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea2#mmPortOfLoading
	 * TransportBySea2.mmPortOfLoading}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad2#mmPlaceOfReceipt
	 * TransportByRoad2.mmPlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail2#mmPlaceOfReceipt
	 * TransportByRail2.mmPlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmDepartureAirport
	 * MultimodalTransport2.mmDepartureAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmPortOfLoading
	 * MultimodalTransport2.mmPortOfLoading}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmPlaceOfReceipt
	 * MultimodalTransport2.mmPlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmTakingInCharge
	 * MultimodalTransport2.mmTakingInCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea4#mmPortOfLoading
	 * TransportBySea4.mmPortOfLoading}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#mmPlaceOfReceipt
	 * TransportByRail4.mmPlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#mmDepartureAirport
	 * TransportByAir4.mmDepartureAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad4#mmPlaceOfReceipt
	 * TransportByRoad4.mmPlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmPortOfLoading
	 * TransportBySea5.mmPortOfLoading}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5#mmDepartureAirport
	 * TransportByAir5.mmDepartureAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmPortOfLoading
	 * TransportBySea6.mmPortOfLoading}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5#mmPlaceOfReceipt
	 * TransportByRail5.mmPlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad5#mmPlaceOfReceipt
	 * TransportByRoad5.mmPlaceOfReceipt}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfDeparture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place from where the goods must leave."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPlaceOfDeparture = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportByAir1.mmDepartureAirport, com.tools20022.repository.msg.TransportBySea1.mmPortOfLoading,
					com.tools20022.repository.msg.TransportByRoad1.mmPlaceOfReceipt, com.tools20022.repository.msg.TransportByRail1.mmPlaceOfReceipt, com.tools20022.repository.msg.MultimodalTransport1.mmDepartureAirport,
					com.tools20022.repository.msg.MultimodalTransport1.mmPortOfLoading, com.tools20022.repository.msg.MultimodalTransport1.mmPlaceOfReceipt, com.tools20022.repository.msg.MultimodalTransport1.mmTakingInCharge,
					com.tools20022.repository.msg.TransportByAir3.mmDepartureAirport, com.tools20022.repository.msg.TransportBySea3.mmPortOfLoading, com.tools20022.repository.msg.TransportByRoad3.mmPlaceOfReceipt,
					com.tools20022.repository.msg.MultimodalTransport3.mmTakingInCharge, com.tools20022.repository.msg.TransportByAir2.mmDepartureAirport, com.tools20022.repository.msg.TransportBySea2.mmPortOfLoading,
					com.tools20022.repository.msg.TransportByRoad2.mmPlaceOfReceipt, com.tools20022.repository.msg.TransportByRail2.mmPlaceOfReceipt, com.tools20022.repository.msg.MultimodalTransport2.mmDepartureAirport,
					com.tools20022.repository.msg.MultimodalTransport2.mmPortOfLoading, com.tools20022.repository.msg.MultimodalTransport2.mmPlaceOfReceipt, com.tools20022.repository.msg.MultimodalTransport2.mmTakingInCharge,
					com.tools20022.repository.msg.TransportBySea4.mmPortOfLoading, com.tools20022.repository.msg.TransportByRail4.mmPlaceOfReceipt, com.tools20022.repository.msg.TransportByAir4.mmDepartureAirport,
					com.tools20022.repository.msg.TransportByRoad4.mmPlaceOfReceipt, com.tools20022.repository.msg.TransportBySea5.mmPortOfLoading, com.tools20022.repository.msg.TransportByAir5.mmDepartureAirport,
					com.tools20022.repository.msg.TransportBySea6.mmPortOfLoading, com.tools20022.repository.msg.TransportByRail5.mmPlaceOfReceipt, com.tools20022.repository.msg.TransportByRoad5.mmPlaceOfReceipt);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfDeparture";
			definition = "Place from where the goods must leave.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmDepartureTransportParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected Location placeOfDestination;
	/**
	 * Place where the goods must arrive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmDestinationTransportParameters
	 * Location.mmDestinationTransportParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir1#mmDestinationAirport
	 * TransportByAir1.mmDestinationAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea1#mmPortOfDischarge
	 * TransportBySea1.mmPortOfDischarge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad1#mmPlaceOfDelivery
	 * TransportByRoad1.mmPlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail1#mmPlaceOfDelivery
	 * TransportByRail1.mmPlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#mmDestinationAirport
	 * MultimodalTransport1.mmDestinationAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#mmPortOfDischarge
	 * MultimodalTransport1.mmPortOfDischarge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#mmPlaceOfDelivery
	 * MultimodalTransport1.mmPlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#mmPlaceOfFinalDestination
	 * MultimodalTransport1.mmPlaceOfFinalDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir3#mmDestinationAirport
	 * TransportByAir3.mmDestinationAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea3#mmPortOfDischarge
	 * TransportBySea3.mmPortOfDischarge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad3#mmPlaceOfDelivery
	 * TransportByRoad3.mmPlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail3#mmPlaceOfReceipt
	 * TransportByRail3.mmPlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail3#mmPlaceOfDelivery
	 * TransportByRail3.mmPlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport3#mmPlaceOfFinalDestination
	 * MultimodalTransport3.mmPlaceOfFinalDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir2#mmDestinationAirport
	 * TransportByAir2.mmDestinationAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea2#mmPortOfDischarge
	 * TransportBySea2.mmPortOfDischarge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad2#mmPlaceOfDelivery
	 * TransportByRoad2.mmPlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail2#mmPlaceOfDelivery
	 * TransportByRail2.mmPlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmDestinationAirport
	 * MultimodalTransport2.mmDestinationAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmPortOfDischarge
	 * MultimodalTransport2.mmPortOfDischarge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmPlaceOfDelivery
	 * MultimodalTransport2.mmPlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmPlaceOfFinalDestination
	 * MultimodalTransport2.mmPlaceOfFinalDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea4#mmPortOfDischarge
	 * TransportBySea4.mmPortOfDischarge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#mmPlaceOfDelivery
	 * TransportByRail4.mmPlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#mmDestinationAirport
	 * TransportByAir4.mmDestinationAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad4#mmPlaceOfDelivery
	 * TransportByRoad4.mmPlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmPortOfDischarge
	 * TransportBySea5.mmPortOfDischarge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5#mmDestinationAirport
	 * TransportByAir5.mmDestinationAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmPortOfDischarge
	 * TransportBySea6.mmPortOfDischarge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5#mmPlaceOfDelivery
	 * TransportByRail5.mmPlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad5#mmPlaceOfDelivery
	 * TransportByRoad5.mmPlaceOfDelivery}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfDestination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place where the goods must arrive."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPlaceOfDestination = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportByAir1.mmDestinationAirport, com.tools20022.repository.msg.TransportBySea1.mmPortOfDischarge,
					com.tools20022.repository.msg.TransportByRoad1.mmPlaceOfDelivery, com.tools20022.repository.msg.TransportByRail1.mmPlaceOfDelivery, com.tools20022.repository.msg.MultimodalTransport1.mmDestinationAirport,
					com.tools20022.repository.msg.MultimodalTransport1.mmPortOfDischarge, com.tools20022.repository.msg.MultimodalTransport1.mmPlaceOfDelivery, com.tools20022.repository.msg.MultimodalTransport1.mmPlaceOfFinalDestination,
					com.tools20022.repository.msg.TransportByAir3.mmDestinationAirport, com.tools20022.repository.msg.TransportBySea3.mmPortOfDischarge, com.tools20022.repository.msg.TransportByRoad3.mmPlaceOfDelivery,
					com.tools20022.repository.msg.TransportByRail3.mmPlaceOfReceipt, com.tools20022.repository.msg.TransportByRail3.mmPlaceOfDelivery, com.tools20022.repository.msg.MultimodalTransport3.mmPlaceOfFinalDestination,
					com.tools20022.repository.msg.TransportByAir2.mmDestinationAirport, com.tools20022.repository.msg.TransportBySea2.mmPortOfDischarge, com.tools20022.repository.msg.TransportByRoad2.mmPlaceOfDelivery,
					com.tools20022.repository.msg.TransportByRail2.mmPlaceOfDelivery, com.tools20022.repository.msg.MultimodalTransport2.mmDestinationAirport, com.tools20022.repository.msg.MultimodalTransport2.mmPortOfDischarge,
					com.tools20022.repository.msg.MultimodalTransport2.mmPlaceOfDelivery, com.tools20022.repository.msg.MultimodalTransport2.mmPlaceOfFinalDestination, com.tools20022.repository.msg.TransportBySea4.mmPortOfDischarge,
					com.tools20022.repository.msg.TransportByRail4.mmPlaceOfDelivery, com.tools20022.repository.msg.TransportByAir4.mmDestinationAirport, com.tools20022.repository.msg.TransportByRoad4.mmPlaceOfDelivery,
					com.tools20022.repository.msg.TransportBySea5.mmPortOfDischarge, com.tools20022.repository.msg.TransportByAir5.mmDestinationAirport, com.tools20022.repository.msg.TransportBySea6.mmPortOfDischarge,
					com.tools20022.repository.msg.TransportByRail5.mmPlaceOfDelivery, com.tools20022.repository.msg.TransportByRoad5.mmPlaceOfDelivery);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfDestination";
			definition = "Place where the goods must arrive.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmDestinationTransportParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Charges> transportCharges;
	/**
	 * Charges related to the conveyance of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmTransport
	 * Charges.mmTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#mmFreightCharges
	 * LineItemDetails4.mmFreightCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#mmFreightCharges
	 * LineItem5.mmFreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmFreightCharges
	 * LineItemDetails7.mmFreightCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem7#mmFreightCharges
	 * LineItem7.mmFreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#mmFreightCharges
	 * LineItemDetails6.mmFreightCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem4#mmFreightCharges
	 * LineItem4.mmFreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails1#mmFreightCharges
	 * TransportDetails1.mmFreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#mmFreightCharges
	 * LineItemDetails9.mmFreightCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem9#mmFreightCharges
	 * LineItem9.mmFreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmFreightCharges
	 * TransportDetails2.mmFreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmFreightCharges
	 * TransportDetails3.mmFreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmFreightCharges
	 * LineItem11.mmFreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmFreightCharges
	 * LineItemDetails10.mmFreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem12#mmFreightCharges
	 * LineItem12.mmFreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#mmFreightCharges
	 * LineItemDetails11.mmFreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmFreightCharges
	 * LineItemDetails13.mmFreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem13#mmFreightCharges
	 * LineItem13.mmFreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem15#mmFreightCharges
	 * LineItem15.mmFreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#mmFreightCharges
	 * LineItemDetails14.mmFreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmFreightCharges
	 * TransportDetails4.mmFreightCharges}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportCharges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charges related to the conveyance of goods."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTransportCharges = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItemDetails4.mmFreightCharges, com.tools20022.repository.msg.LineItem5.mmFreightCharges, com.tools20022.repository.msg.LineItemDetails7.mmFreightCharges,
					com.tools20022.repository.msg.LineItem7.mmFreightCharges, com.tools20022.repository.msg.LineItemDetails6.mmFreightCharges, com.tools20022.repository.msg.LineItem4.mmFreightCharges,
					com.tools20022.repository.msg.TransportDetails1.mmFreightCharges, com.tools20022.repository.msg.LineItemDetails9.mmFreightCharges, com.tools20022.repository.msg.LineItem9.mmFreightCharges,
					com.tools20022.repository.msg.TransportDetails2.mmFreightCharges, com.tools20022.repository.msg.TransportDetails3.mmFreightCharges, com.tools20022.repository.msg.LineItem11.mmFreightCharges,
					com.tools20022.repository.msg.LineItemDetails10.mmFreightCharges, com.tools20022.repository.msg.LineItem12.mmFreightCharges, com.tools20022.repository.msg.LineItemDetails11.mmFreightCharges,
					com.tools20022.repository.msg.LineItemDetails13.mmFreightCharges, com.tools20022.repository.msg.LineItem13.mmFreightCharges, com.tools20022.repository.msg.LineItem15.mmFreightCharges,
					com.tools20022.repository.msg.LineItemDetails14.mmFreightCharges, com.tools20022.repository.msg.TransportDetails4.mmFreightCharges);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransportCharges";
			definition = "Charges related to the conveyance of goods.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.mmTransport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
		}
	};
	protected FreightChargesCode freightChargesPrepaidOrCollect;
	/**
	 * Identifies whether the freight charges associated with the items are
	 * "prepaid" or "collect".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FreightChargesCode
	 * FreightChargesCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge12#mmType
	 * Charge12.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge13#mmType
	 * Charge13.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge24#mmType
	 * Charge24.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge25#mmType
	 * Charge25.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreightChargesPrepaidOrCollect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the freight charges associated with the items are \"prepaid\" or \"collect\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFreightChargesPrepaidOrCollect = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Charge12.mmType, com.tools20022.repository.msg.Charge13.mmType, com.tools20022.repository.msg.Charge24.mmType, com.tools20022.repository.msg.Charge25.mmType);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FreightChargesPrepaidOrCollect";
			definition = "Identifies whether the freight charges associated with the items are \"prepaid\" or \"collect\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FreightChargesCode.mmObject();
		}
	};
	protected ShipmentDateRange shipmentDates;
	/**
	 * Specifies the shipment date, the earliest shipment date and the latest
	 * shipment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmRelatedTransport
	 * ShipmentDateRange.mmRelatedTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ShipmentDateRange
	 * ShipmentDateRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmShipmentSchedule
	 * LineItemDetails7.mmShipmentSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem7#mmShipmentDateRange
	 * LineItem7.mmShipmentDateRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmShipmentDate
	 * TransportDetails3.mmShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmShipmentDateRange
	 * LineItem11.mmShipmentDateRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmShipmentSchedule
	 * LineItemDetails10.mmShipmentSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmShipmentSchedule
	 * LineItemDetails13.mmShipmentSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem13#mmShipmentDateRange
	 * LineItem13.mmShipmentDateRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmShipmentDate
	 * TransportDetails4.mmShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmShipmentAttributes
	 * SupportingDocumentEntry1.mmShipmentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#mmShipmentSchedule
	 * TradeContract1.mmShipmentSchedule}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipmentDates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the shipment date, the earliest shipment date and the latest shipment date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmShipmentDates = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItemDetails7.mmShipmentSchedule, com.tools20022.repository.msg.LineItem7.mmShipmentDateRange,
					com.tools20022.repository.msg.TransportDetails3.mmShipmentDate, com.tools20022.repository.msg.LineItem11.mmShipmentDateRange, com.tools20022.repository.msg.LineItemDetails10.mmShipmentSchedule,
					com.tools20022.repository.msg.LineItemDetails13.mmShipmentSchedule, com.tools20022.repository.msg.LineItem13.mmShipmentDateRange, com.tools20022.repository.msg.TransportDetails4.mmShipmentDate,
					com.tools20022.repository.msg.SupportingDocumentEntry1.mmShipmentAttributes, com.tools20022.repository.msg.TradeContract1.mmShipmentSchedule);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShipmentDates";
			definition = "Specifies the shipment date, the earliest shipment date and the latest shipment date.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ShipmentDateRange.mmRelatedTransport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ShipmentDateRange.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Goods> transportedGoods;
	/**
	 * Goods that are transported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Goods#mmTransport
	 * Goods.mmTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Goods Goods}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails1#mmTransportedGoods
	 * TransportDetails1.mmTransportedGoods}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmTransportedGoods
	 * TransportDetails2.mmTransportedGoods}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmTransportedGoods
	 * TransportDetails3.mmTransportedGoods}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmTransportedGoods
	 * TransportDetails4.mmTransportedGoods}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportedGoods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Goods that are transported."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTransportedGoods = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportDetails1.mmTransportedGoods, com.tools20022.repository.msg.TransportDetails2.mmTransportedGoods,
					com.tools20022.repository.msg.TransportDetails3.mmTransportedGoods, com.tools20022.repository.msg.TransportDetails4.mmTransportedGoods);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransportedGoods";
			definition = "Goods that are transported.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Goods.mmTransport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Goods.mmObject();
		}
	};
	protected TransportPartyRole partyRole;
	/**
	 * Specifies each role linked to the transport of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransportPartyRole#mmTransport
	 * TransportPartyRole.mmTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TransportPartyRole
	 * TransportPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies each role linked to the transport of goods."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to the transport of goods.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TransportPartyRole.mmTransport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TransportPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Location> transitLocation;
	/**
	 * Place through which the goods are transiting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmRelatedTransport
	 * Location.mmRelatedTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransitLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place through which the goods are transiting."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTransitLocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransitLocation";
			definition = "Place through which the goods are transiting.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmRelatedTransport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected Document transportDocuments;
	/**
	 * Documents which may be required in relation with the transportation of
	 * goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmTransport
	 * Document.mmTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportDocuments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Documents which may be required in relation with the transportation of goods."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTransportDocuments = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransportDocuments";
			definition = "Documents which may be required in relation with the transportation of goods.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.mmTransport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Transport";
				definition = "Moving of goods or people from one place to another by vehicle.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Location.mmDepartureTransportParameters, com.tools20022.repository.entity.Location.mmDestinationTransportParameters,
						com.tools20022.repository.entity.Location.mmRelatedTransport, com.tools20022.repository.entity.Document.mmTransport, com.tools20022.repository.entity.Charges.mmTransport,
						com.tools20022.repository.entity.Incoterms.mmTransport, com.tools20022.repository.entity.Goods.mmTransport, com.tools20022.repository.entity.ProductDelivery.mmRouting,
						com.tools20022.repository.entity.Packaging.mmTransport, com.tools20022.repository.entity.TransportPartyRole.mmTransport, com.tools20022.repository.entity.ShipmentDateRange.mmRelatedTransport);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportMeans3.mmModeCode, com.tools20022.repository.msg.Consignment2.mmTransportMeans,
						com.tools20022.repository.choice.TransportMeans1Choice.mmIndividualTransport, com.tools20022.repository.choice.TransportMeans1Choice.mmMultimodalTransport,
						com.tools20022.repository.msg.TransportMeans1.mmIndividualTransport, com.tools20022.repository.msg.TransportMeans1.mmMultimodalTransport, com.tools20022.repository.choice.TransportMeans2Choice.mmIndividualTransport,
						com.tools20022.repository.choice.TransportMeans2Choice.mmMultimodalTransport, com.tools20022.repository.msg.TransportDetails1.mmRoutingSummary, com.tools20022.repository.msg.TransportDataSet2.mmTransportInformation,
						com.tools20022.repository.msg.TransportMeans2.mmIndividualTransport, com.tools20022.repository.msg.TransportMeans2.mmMultimodalTransport, com.tools20022.repository.msg.TransportDetails2.mmRoutingSummary,
						com.tools20022.repository.msg.TransportDataSet3.mmTransportInformation, com.tools20022.repository.msg.TransportDataSet4.mmTransportInformation, com.tools20022.repository.msg.TransportDetails3.mmRoutingSummary,
						com.tools20022.repository.msg.TransportMeans4.mmIndividualTransport, com.tools20022.repository.msg.TransportMeans4.mmMultimodalTransport, com.tools20022.repository.msg.TransportMeans5.mmIndividualTransport,
						com.tools20022.repository.msg.TransportMeans5.mmMultimodalTransport, com.tools20022.repository.msg.TransportDataSet5.mmTransportInformation, com.tools20022.repository.msg.TransportMeans6.mmIndividualTransport,
						com.tools20022.repository.msg.TransportMeans6.mmMultimodalTransport, com.tools20022.repository.msg.TransportDetails4.mmRoutingSummary, com.tools20022.repository.msg.Consignment4.mmTransportMeans);
				subType_lazy = () -> Arrays.asList(TransportByAir.mmObject(), TransportBySea.mmObject(), TransportByRoad.mmObject(), TransportByRail.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Transport.mmIncoterms, com.tools20022.repository.entity.Transport.mmIdentification, com.tools20022.repository.entity.Transport.mmPackaging,
						com.tools20022.repository.entity.Transport.mmArrivalDateTime, com.tools20022.repository.entity.Transport.mmPartialShipment, com.tools20022.repository.entity.Transport.mmTransShipment,
						com.tools20022.repository.entity.Transport.mmProductDelivery, com.tools20022.repository.entity.Transport.mmPlaceOfDeparture, com.tools20022.repository.entity.Transport.mmPlaceOfDestination,
						com.tools20022.repository.entity.Transport.mmTransportCharges, com.tools20022.repository.entity.Transport.mmFreightChargesPrepaidOrCollect, com.tools20022.repository.entity.Transport.mmShipmentDates,
						com.tools20022.repository.entity.Transport.mmTransportedGoods, com.tools20022.repository.entity.Transport.mmPartyRole, com.tools20022.repository.entity.Transport.mmTransitLocation,
						com.tools20022.repository.entity.Transport.mmTransportDocuments);
				derivationComponent_lazy = () -> Arrays.asList(TransportMeans3.mmObject(), Consignment2.mmObject(), SingleTransport1.mmObject(), MultimodalTransport1.mmObject(), TransportMeans1Choice.mmObject(),
						SingleTransport4.mmObject(), MultimodalTransport3.mmObject(), TransportMeans1.mmObject(), SingleTransport2.mmObject(), MultimodalTransport2.mmObject(), TransportMeans2Choice.mmObject(), TransportDetails1.mmObject(),
						TransportDataSet2.mmObject(), SingleTransport5.mmObject(), TransportMeans2.mmObject(), TransportDetails2.mmObject(), TransportDataSet3.mmObject(), SingleTransport3.mmObject(), TransportDataSet4.mmObject(),
						TransportDetails3.mmObject(), TransportMeans4.mmObject(), SingleTransport6.mmObject(), SingleTransport7.mmObject(), TransportMeans5.mmObject(), TransportDataSet5.mmObject(), TransportMeans6.mmObject(),
						SingleTransport8.mmObject(), TransportDetails4.mmObject(), Consignment4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Incoterms getIncoterms() {
		return incoterms;
	}

	public void setIncoterms(com.tools20022.repository.entity.Incoterms incoterms) {
		this.incoterms = incoterms;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public Packaging getPackaging() {
		return packaging;
	}

	public void setPackaging(com.tools20022.repository.entity.Packaging packaging) {
		this.packaging = packaging;
	}

	public ISODateTime getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(ISODateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public YesNoIndicator getPartialShipment() {
		return partialShipment;
	}

	public void setPartialShipment(YesNoIndicator partialShipment) {
		this.partialShipment = partialShipment;
	}

	public YesNoIndicator getTransShipment() {
		return transShipment;
	}

	public void setTransShipment(YesNoIndicator transShipment) {
		this.transShipment = transShipment;
	}

	public ProductDelivery getProductDelivery() {
		return productDelivery;
	}

	public void setProductDelivery(com.tools20022.repository.entity.ProductDelivery productDelivery) {
		this.productDelivery = productDelivery;
	}

	public Location getPlaceOfDeparture() {
		return placeOfDeparture;
	}

	public void setPlaceOfDeparture(com.tools20022.repository.entity.Location placeOfDeparture) {
		this.placeOfDeparture = placeOfDeparture;
	}

	public Location getPlaceOfDestination() {
		return placeOfDestination;
	}

	public void setPlaceOfDestination(com.tools20022.repository.entity.Location placeOfDestination) {
		this.placeOfDestination = placeOfDestination;
	}

	public List<Charges> getTransportCharges() {
		return transportCharges;
	}

	public void setTransportCharges(List<com.tools20022.repository.entity.Charges> transportCharges) {
		this.transportCharges = transportCharges;
	}

	public FreightChargesCode getFreightChargesPrepaidOrCollect() {
		return freightChargesPrepaidOrCollect;
	}

	public void setFreightChargesPrepaidOrCollect(FreightChargesCode freightChargesPrepaidOrCollect) {
		this.freightChargesPrepaidOrCollect = freightChargesPrepaidOrCollect;
	}

	public ShipmentDateRange getShipmentDates() {
		return shipmentDates;
	}

	public void setShipmentDates(com.tools20022.repository.entity.ShipmentDateRange shipmentDates) {
		this.shipmentDates = shipmentDates;
	}

	public List<Goods> getTransportedGoods() {
		return transportedGoods;
	}

	public void setTransportedGoods(List<com.tools20022.repository.entity.Goods> transportedGoods) {
		this.transportedGoods = transportedGoods;
	}

	public TransportPartyRole getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(com.tools20022.repository.entity.TransportPartyRole partyRole) {
		this.partyRole = partyRole;
	}

	public List<Location> getTransitLocation() {
		return transitLocation;
	}

	public void setTransitLocation(List<com.tools20022.repository.entity.Location> transitLocation) {
		this.transitLocation = transitLocation;
	}

	public Document getTransportDocuments() {
		return transportDocuments;
	}

	public void setTransportDocuments(com.tools20022.repository.entity.Document transportDocuments) {
		this.transportDocuments = transportDocuments;
	}
}