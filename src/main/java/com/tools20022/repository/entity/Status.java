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

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.InvestigationPartyRole;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * The status of an instruction, advice or request.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Status" src="doc-files/Status.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmStatusReason
 * Status.mmStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmStatusDateTime
 * Status.mmStatusDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmValidityTime
 * Status.mmValidityTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmStatusDescription
 * Status.mmStatusDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#mmInstructionProcessingStatus
 * Status.mmInstructionProcessingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmPartyRole
 * Status.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmSettlementStatus
 * Status.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#mmCancellationProcessingStatus
 * Status.mmCancellationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#mmTransactionProcessingStatus
 * Status.mmTransactionProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Status#mmModificationProcessingStatus
 * Status.mmModificationProcessingStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmStatus
 * DateTimePeriod.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StatusReason#mmStatus
 * StatusReason.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole#mmStatus
 * InvestigationPartyRole.mmStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1#mmProprietaryStatus
 * ProprietaryStatusAndReason1.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#mmProprietary
 * ModificationProcessingStatus2Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmProcessingStatus
 * StatusTrail2.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmModificationProcessingStatus
 * StatusTrail2.mmModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmCancellationStatus
 * StatusTrail2.mmCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail2#mmSettled
 * StatusTrail2.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason2#mmProprietaryStatus
 * ProprietaryStatusAndReason2.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice#mmProprietary
 * ModificationProcessingStatus3Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail3#mmProcessingStatus
 * StatusTrail3.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail3#mmModificationProcessingStatus
 * StatusTrail3.mmModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail3#mmCancellationStatus
 * StatusTrail3.mmCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail3#mmSettled
 * StatusTrail3.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason12#mmProcessingStatus
 * StatusAndReason12.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason14#mmProcessingStatus
 * StatusAndReason14.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason1#mmStatusAndReason
 * StatusAndReason1.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason2#mmStatusAndReason
 * StatusAndReason2.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason4#mmStatusAndReason
 * StatusAndReason4.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason5#mmStatusAndReason
 * StatusAndReason5.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason7#mmStatusAndReason
 * StatusAndReason7.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason8#mmStatusAndReason
 * StatusAndReason8.mmStatusAndReason}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status9Choice#mmProprietary
 * Status9Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason9#mmStatusAndReason
 * StatusAndReason9.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status11Choice#mmProprietary
 * Status11Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason13#mmStatusAndReason
 * StatusAndReason13.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason16#mmStatusAndReason
 * StatusAndReason16.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason17#mmStatusAndReason
 * StatusAndReason17.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionProcessingStatus1#mmStatus
 * CorporateActionInstructionProcessingStatus1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus3Choice#mmRejected
 * ResponseStatus3Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus3Choice#mmPending
 * ResponseStatus3Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus4Choice#mmRejected
 * ResponseStatus4Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus4Choice#mmPending
 * ResponseStatus4Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatusOrStatement5Choice#mmStatusAdvice
 * StatusOrStatement5Choice.mmStatusAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatusOrStatement6Choice#mmStatusAdvice
 * StatusOrStatement6Choice.mmStatusAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryStatus1#mmType
 * IntraBalanceQueryStatus1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason3#mmProprietaryStatus
 * ProprietaryStatusAndReason3.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason18#mmStatusAndReason
 * StatusAndReason18.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status15Choice#mmProprietary
 * Status15Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason19#mmProcessingStatus
 * StatusAndReason19.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason20#mmProcessingStatus
 * StatusAndReason20.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason21#mmStatusAndReason
 * StatusAndReason21.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status16Choice#mmProprietary
 * Status16Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason25#mmStatusAndReason
 * StatusAndReason25.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail4#mmProcessingStatus
 * StatusTrail4.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail4#mmModificationProcessingStatus
 * StatusTrail4.mmModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail4#mmCancellationStatus
 * StatusTrail4.mmCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail4#mmSettled
 * StatusTrail4.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmProprietary
 * ModificationProcessingStatus4Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice#mmProprietary
 * ModificationProcessingStatus6Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason26#mmStatusAndReason
 * StatusAndReason26.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail5#mmProcessingStatus
 * StatusTrail5.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail5#mmModificationProcessingStatus
 * StatusTrail5.mmModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail5#mmCancellationStatus
 * StatusTrail5.mmCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail5#mmSettled
 * StatusTrail5.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus5Choice#mmProprietary
 * ModificationProcessingStatus5Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericValidationRuleIdentification1#mmIdentification
 * GenericValidationRuleIdentification1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason27#mmStatusAndReason
 * StatusAndReason27.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#mmRecordStatus
 * CurrencyControlPackageStatus1.mmRecordStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus6Choice#mmRejected
 * ResponseStatus6Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus6Choice#mmPending
 * ResponseStatus6Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatusOrStatement7Choice#mmStatusAdvice
 * StatusOrStatement7Choice.mmStatusAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason28#mmProcessingStatus
 * StatusAndReason28.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmProcessingStatus
 * StatusTrail6.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmModificationProcessingStatus
 * StatusTrail6.mmModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmCancellationStatus
 * StatusTrail6.mmCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail6#mmSettled
 * StatusTrail6.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmProprietary
 * ModificationProcessingStatus7Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason6#mmProprietaryStatus
 * ProprietaryStatusAndReason6.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status18Choice#mmProprietary
 * Status18Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason7#mmProprietaryStatus
 * ProprietaryStatusAndReason7.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason30#mmStatusAndReason
 * StatusAndReason30.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus8Choice#mmRejected
 * ResponseStatus8Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus8Choice#mmPending
 * ResponseStatus8Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason29#mmProcessingStatus
 * StatusAndReason29.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatusOrStatement8Choice#mmStatusAdvice
 * StatusOrStatement8Choice.mmStatusAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail7#mmProcessingStatus
 * StatusTrail7.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail7#mmModificationProcessingStatus
 * StatusTrail7.mmModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail7#mmCancellationStatus
 * StatusTrail7.mmCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail7#mmSettled
 * StatusTrail7.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus8Choice#mmProprietary
 * ModificationProcessingStatus8Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status23Choice#mmProprietary
 * Status23Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryStatus2#mmType
 * IntraBalanceQueryStatus2.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason32#mmStatusAndReason
 * StatusAndReason32.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason33#mmStatusAndReason
 * StatusAndReason33.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason34#mmStatusAndReason
 * StatusAndReason34.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAndReason35#mmStatusAndReason
 * StatusAndReason35.mmStatusAndReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemStatus SystemStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LimitStatus LimitStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
 * SecuritiesTradeStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CorporateActionStatus
 * CorporateActionStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesStatus
 * SecuritiesStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UndertakingStatus
 * UndertakingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MandateStatus MandateStatus}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
 * TreasuryTradeSettlementStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPaymentStatus
 * CardPaymentStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
 * SecuritiesOrderStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestigationCaseStatus
 * InvestigationCaseStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.CollateralStatus
 * CollateralStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus
 * InvoiceFinancingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BaselineStatus
 * BaselineStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.QuoteStatus QuoteStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvoiceStatus InvoiceStatus}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1
 * ProprietaryStatusAndReason1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice
 * ModificationProcessingStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail2 StatusTrail2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason2
 * ProprietaryStatusAndReason2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus3Choice
 * ModificationProcessingStatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail3 StatusTrail3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DeliveryReturn1Choice
 * DeliveryReturn1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DeliveryReturn2Choice
 * DeliveryReturn2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingDenied1Choice
 * MatchingDenied1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingDenied2Choice
 * MatchingDenied2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason3
 * StatusAndReason3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason6
 * StatusAndReason6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason12
 * StatusAndReason12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason14
 * StatusAndReason14}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status2Choice Status2Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason1
 * StatusAndReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason2
 * StatusAndReason2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status4Choice Status4Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason4
 * StatusAndReason4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason5
 * StatusAndReason5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason7
 * StatusAndReason7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason8
 * StatusAndReason8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status9Choice Status9Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason9
 * StatusAndReason9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status11Choice
 * Status11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason13
 * StatusAndReason13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason16
 * StatusAndReason16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason17
 * StatusAndReason17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason10
 * StatusAndReason10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice
 * ReplacementProcessingStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteractionComponent3
 * PointOfInteractionComponent3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportStatusAndReason1
 * ReportStatusAndReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportStatusAndReason2
 * ReportStatusAndReason2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus1Choice
 * RegistrationProcessingStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ResponseStatus1Choice
 * ResponseStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus1Choice
 * ReplacementProcessingStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus1Choice
 * SettlementStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus1Choice
 * SettlementConditionModificationStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status1Choice Status1Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Status8Choice Status8Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.ResponseStatus3Choice
 * ResponseStatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ResponseStatus4Choice
 * ResponseStatus4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus2Choice
 * RegistrationProcessingStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ResponseStatus2Choice
 * ResponseStatus2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus2Choice
 * ReplacementProcessingStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus3Choice
 * SettlementStatus3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus2Choice
 * SettlementConditionModificationStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status3Choice Status3Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Status10Choice
 * Status10Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus1Choice
 * ModificationProcessingStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceStatusAndReason1
 * IntraBalanceStatusAndReason1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProcessingStatus33Choice
 * ProcessingStatus33Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceStatusType1
 * IntraBalanceStatusType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceQueryStatus1
 * IntraBalanceQueryStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason3
 * ProprietaryStatusAndReason3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProcessingStatus30Choice
 * ProcessingStatus30Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountLinkStatus1
 * AccountLinkStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason18
 * StatusAndReason18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason19
 * StatusAndReason19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason20
 * StatusAndReason20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason21
 * StatusAndReason21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteractionComponent4
 * PointOfInteractionComponent4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReportItemStatus1Choice
 * ReportItemStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason25
 * StatusAndReason25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail4 StatusTrail4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice
 * ModificationProcessingStatus4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus6Choice
 * ModificationProcessingStatus6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason26
 * StatusAndReason26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail5 StatusTrail5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus5Choice
 * ModificationProcessingStatus5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteractionComponent5
 * PointOfInteractionComponent5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericValidationRuleIdentification1
 * GenericValidationRuleIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason27
 * StatusAndReason27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1
 * CurrencyControlGroupStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1
 * CurrencyControlPackageStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ValidationStatusReason1
 * ValidationStatusReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1
 * CurrencyControlRecordStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ResponseStatus6Choice
 * ResponseStatus6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason28
 * StatusAndReason28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail6 StatusTrail6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice
 * ModificationProcessingStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ResponseStatus5Choice
 * ResponseStatus5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus8Choice
 * ReplacementProcessingStatus8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason6
 * ProprietaryStatusAndReason6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus3Choice
 * RegistrationProcessingStatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DeliveryReturn3Choice
 * DeliveryReturn3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status19Choice
 * Status19Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus3Choice
 * SettlementConditionModificationStatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingDenied3Choice
 * MatchingDenied3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason7
 * ProprietaryStatusAndReason7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason30
 * StatusAndReason30}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ResponseStatus8Choice
 * ResponseStatus8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason29
 * StatusAndReason29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail7 StatusTrail7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingDenied4Choice
 * MatchingDenied4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status22Choice
 * Status22Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus4Choice
 * RegistrationProcessingStatus4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ResponseStatus7Choice
 * ResponseStatus7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus4Choice
 * SettlementConditionModificationStatus4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus9Choice
 * ReplacementProcessingStatus9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DeliveryReturn4Choice
 * DeliveryReturn4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus8Choice
 * ModificationProcessingStatus8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteractionComponent6
 * PointOfInteractionComponent6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProcessingStatus70Choice
 * ProcessingStatus70Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus9Choice
 * ModificationProcessingStatus9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceStatusAndReason2
 * IntraBalanceStatusAndReason2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus26Choice
 * SettlementStatus26Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceQueryStatus2
 * IntraBalanceQueryStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceStatusType2
 * IntraBalanceStatusType2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProcessingStatus68Choice
 * ProcessingStatus68Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason32
 * StatusAndReason32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason33
 * StatusAndReason33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteractionComponent7
 * PointOfInteractionComponent7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason34
 * StatusAndReason34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndReason35
 * StatusAndReason35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteractionComponent8
 * PointOfInteractionComponent8}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Status"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "The status of an instruction, advice or request."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<StatusReason> statusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StatusReason
	 * StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmStatus
	 * StatusReason.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Blocked1#mmReason
	 * Blocked1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch3#mmProprietaryStatusReason
	 * InstructionStatusSearch3.mmProprietaryStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice#mmProprietaryRejectionReason
	 * PaymentStatusReasonCode3Choice.mmProprietaryRejectionReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus1#mmReason
	 * PaymentStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1#mmProprietaryReason
	 * ProprietaryStatusAndReason1.mmProprietaryReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason2#mmProprietaryReason
	 * ProprietaryStatusAndReason2.mmProprietaryReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn1Choice#mmCode
	 * DeliveryReturn1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn1Choice#mmProprietary
	 * DeliveryReturn1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn2Choice#mmCode
	 * DeliveryReturn2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn2Choice#mmProprietary
	 * DeliveryReturn2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction4#mmCancellationReasonInformation
	 * OriginalPaymentInstruction4.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction8#mmCancellationReasonInformation
	 * OriginalPaymentInstruction8.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation2#mmReversalReasonInformation
	 * OriginalPaymentInformation2.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction35#mmReversalReasonInformation
	 * PaymentTransaction35.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction2#mmReversalReasonInformation
	 * OriginalPaymentInstruction2.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction42#mmReversalReasonInformation
	 * PaymentTransaction42.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction7#mmReversalReasonInformation
	 * OriginalPaymentInstruction7.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation1#mmStatusReasonInformation
	 * OriginalGroupInformation1.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#mmStatusReasonInformation
	 * PaymentTransactionInformation1.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation20#mmStatusReasonInformation
	 * OriginalGroupInformation20.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#mmStatusReasonInformation
	 * PaymentTransactionInformation25.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation1#mmStatusReasonInformation
	 * OriginalPaymentInformation1.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation9#mmReason
	 * StatusReasonInformation9.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1#mmStatusReasonInformation
	 * OriginalGroupHeader1.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#mmStatusReasonInformation
	 * PaymentTransaction32.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction1#mmStatusReasonInformation
	 * OriginalPaymentInstruction1.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#mmStatusReasonInformation
	 * PaymentTransaction46.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction6#mmStatusReasonInformation
	 * OriginalPaymentInstruction6.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmReversalReasonInformation
	 * PaymentTransaction36.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmReversalReasonInformation
	 * PaymentTransaction45.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#mmStatusReasonInformation
	 * PaymentTransactionInformation26.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#mmStatusReasonInformation
	 * PaymentTransaction33.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#mmStatusReasonInformation
	 * PaymentTransaction43.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment1#mmAmendmentReason
	 * MandateAmendment1.mmAmendmentReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment2#mmAmendmentReason
	 * MandateAmendment2.mmAmendmentReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment3#mmAmendmentReason
	 * MandateAmendment3.mmAmendmentReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation1#mmReturnReason
	 * ReturnReasonInformation1.mmReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation2#mmReturnReasonInformation
	 * OriginalGroupInformation2.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation9#mmReason
	 * ReturnReasonInformation9.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation21#mmReturnReasonInformation
	 * OriginalGroupInformation21.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader2#mmReturnReasonInformation
	 * OriginalGroupHeader2.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmReturnReasonInformation
	 * PaymentTransaction34.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmReturnReasonInformation
	 * PaymentTransaction44.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25#mmStatusReasonInformation
	 * OriginalGroupInformation25.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#mmStatusReasonInformation
	 * PaymentTransactionInformation34.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation5#mmStatusReasonInformation
	 * OriginalPaymentInformation5.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#mmStatusReasonInformation
	 * PaymentTransaction41.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction5#mmStatusReasonInformation
	 * OriginalPaymentInstruction5.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#mmStatusReasonInformation
	 * PaymentTransaction49.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction9#mmStatusReasonInformation
	 * OriginalPaymentInstruction9.mmStatusReasonInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InRepairStatus1#mmReason
	 * InRepairStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmCancelled
	 * IndividualOrderStatusAndReason1.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InRepairStatus2#mmReasonDetails
	 * InRepairStatus2.mmReasonDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmCancelled
	 * IndividualOrderStatusAndReason2.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmInRepair
	 * IndividualOrderStatusAndReason2.mmInRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus#mmStatusReason
	 * MeetingInstructionGlobalStatus.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportStatusAndReason1#mmRejected
	 * ReportStatusAndReason1.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason1#mmRejected
	 * TradeTransactionStatusAndReason1.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportStatusAndReason2#mmRejected
	 * ReportStatusAndReason2.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2#mmRejected
	 * TradeTransactionStatusAndReason2.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13#mmStatusReasonInformation
	 * OriginalGroupInformation13.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation17#mmStatusReasonInformation
	 * OriginalGroupInformation17.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#mmStatusReasonInformation
	 * OriginalGroupInformation15.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation19#mmStatusReasonInformation
	 * OriginalGroupInformation19.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation3#mmReturnReason
	 * ReturnReasonInformation3.mmReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation11#mmReturnReasonInformation
	 * OriginalGroupInformation11.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation18#mmReturnReasonInformation
	 * OriginalGroupInformation18.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation4#mmReturnReason
	 * ReturnReasonInformation4.mmReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation6#mmReturnReason
	 * ReturnReasonInformation6.mmReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#mmStatusReasonInformation
	 * PaymentTransactionInformation15.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#mmStatusReasonInformation
	 * PaymentTransactionInformation22.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation12#mmStatusReasonInformation
	 * PaymentTransactionInformation12.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation19#mmStatusReasonInformation
	 * PaymentTransactionInformation19.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation7#mmReturnReason
	 * ReturnReasonInformation7.mmReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason5#mmCancelled
	 * IndividualOrderStatusAndReason5.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusAndReason1#mmSettled
	 * IntraBalanceStatusAndReason1.mmSettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralStatusReason1#mmReason
	 * CollateralStatusReason1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusType1#mmSettled
	 * IntraPositionStatusType1.mmSettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusType1#mmSettled
	 * IntraBalanceStatusType1.mmSettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason3#mmProprietaryReason
	 * ProprietaryStatusAndReason3.mmProprietaryReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus2#mmReason
	 * PaymentStatus2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmUnmatched
	 * TransferStatus1Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmInRepair
	 * TransferStatus1Choice.mmInRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmFailedSettlement
	 * TransferStatus1Choice.mmFailedSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmCancellationPending
	 * TransferStatus1Choice.mmCancellationPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmReturnReasonInformation
	 * PaymentTransaction50.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment4#mmAmendmentReason
	 * MandateAmendment4.mmAmendmentReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction12#mmStatusReasonInformation
	 * OriginalPaymentInstruction12.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction11#mmReversalReasonInformation
	 * OriginalPaymentInstruction11.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#mmStatusReasonInformation
	 * PaymentTransaction52.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmReversalReasonInformation
	 * PaymentTransaction51.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#mmCancellationReasonInformation
	 * OriginalPaymentInstruction13.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#mmStatusReasonInformation
	 * PaymentTransaction57.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction56#mmReversalReasonInformation
	 * PaymentTransaction56.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReportItemStatus1Choice#mmAcceptedWithException
	 * ReportItemStatus1Choice.mmAcceptedWithException}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction14#mmStatusReasonInformation
	 * OriginalPaymentInstruction14.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#mmStatusReasonInformation
	 * PaymentTransaction59.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#mmStatusReason
	 * CurrencyControlPackageStatus1.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusReason1#mmReason
	 * ValidationStatusReason1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#mmStatusReason
	 * CurrencyControlRecordStatus1.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason6#mmProprietaryReason
	 * ProprietaryStatusAndReason6.mmProprietaryReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn3Choice#mmCode
	 * DeliveryReturn3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn3Choice#mmProprietary
	 * DeliveryReturn3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16#mmReversalReasonInformation
	 * OriginalPaymentInstruction16.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction18#mmStatusReasonInformation
	 * OriginalPaymentInstruction18.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmReturnReasonInformation
	 * PaymentTransaction65.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#mmStatusReasonInformation
	 * PaymentTransaction63.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmReversalReasonInformation
	 * PaymentTransaction60.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#mmStatusReasonInformation
	 * PaymentTransaction68.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#mmCancellationReasonInformation
	 * OriginalPaymentInstruction15.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction64#mmReversalReasonInformation
	 * PaymentTransaction64.mmReversalReasonInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Blocked2#mmReason
	 * Blocked2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmUnmatched
	 * TransferStatus2Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmInRepair
	 * TransferStatus2Choice.mmInRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmFailedSettlement
	 * TransferStatus2Choice.mmFailedSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmCancellationPending
	 * TransferStatus2Choice.mmCancellationPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status21Choice#mmPending
	 * Status21Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction19#mmStatusReasonInformation
	 * OriginalPaymentInstruction19.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#mmStatusReasonInformation
	 * PaymentTransaction69.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason7#mmProprietaryReason
	 * ProprietaryStatusAndReason7.mmProprietaryReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn4Choice#mmCode
	 * DeliveryReturn4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn4Choice#mmProprietary
	 * DeliveryReturn4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusAndReason2#mmSettled
	 * IntraBalanceStatusAndReason2.mmSettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusType2#mmSettled
	 * IntraBalanceStatusType2.mmSettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusType2#mmSettled
	 * IntraPositionStatusType2.mmSettled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmStatusReason
	 * AccountManagementStatusAndReason5.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmCancelled
	 * OrderStatus5Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus5Choice#mmInRepair
	 * OrderStatus5Choice.mmInRepair}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmEnabled
	 * AccountStatus2.mmEnabled}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmDisabled
	 * AccountStatus2.mmDisabled}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmPending
	 * AccountStatus2.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatus2#mmPendingOpening
	 * AccountStatus2.mmPendingOpening}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmProforma
	 * AccountStatus2.mmProforma}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmClosed
	 * AccountStatus2.mmClosed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatus2#mmClosurePending
	 * AccountStatus2.mmClosurePending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAccountStatus1#mmReason
	 * OtherAccountStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus3Choice#mmCancelled
	 * OrderStatus3Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmCancelled
	 * OrderStatus4Choice.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderStatus4Choice#mmInRepair
	 * OrderStatus4Choice.mmInRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmStatusReasonInformation
	 * PaymentTransaction80.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#mmStatusReasonInformation
	 * OriginalGroupHeader7.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmReversalReasonInformation
	 * PaymentTransaction81.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#mmStatusReasonInformation
	 * OriginalPaymentInstruction23.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#mmReversalReasonInformation
	 * OriginalPaymentInstruction21.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment5#mmAmendmentReason
	 * MandateAmendment5.mmAmendmentReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24#mmStatusReasonInformation
	 * OriginalPaymentInstruction24.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#mmStatusReasonInformation
	 * OriginalGroupInformation28.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmReturnReasonInformation
	 * PaymentTransaction76.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#mmCancellationReasonInformation
	 * OriginalPaymentInstruction20.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmStatusReasonInformation
	 * PaymentTransaction83.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#mmReversalReasonInformation
	 * PaymentTransaction77.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#mmStatusReasonInformation
	 * PaymentTransaction82.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateSuspensionReason1#mmReason
	 * MandateSuspensionReason1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmReturnReasonInformation
	 * PaymentTransaction87.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction88#mmReversalReasonInformation
	 * PaymentTransaction88.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction91#mmStatusReasonInformation
	 * PaymentTransaction91.mmStatusReasonInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus3#mmReason
	 * PaymentStatus3.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch4#mmProprietaryStatusReason
	 * InstructionStatusSearch4.mmProprietaryStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClaimNonReceiptRejectReason1Choice#mmCode
	 * ClaimNonReceiptRejectReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClaimNonReceiptRejectReason1Choice#mmProprietary
	 * ClaimNonReceiptRejectReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction28#mmReversalReasonInformation
	 * OriginalPaymentInstruction28.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction27#mmStatusReasonInformation
	 * OriginalPaymentInstruction27.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction29#mmCancellationReasonInformation
	 * OriginalPaymentInstruction29.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction92#mmStatusReasonInformation
	 * PaymentTransaction92.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction93#mmReversalReasonInformation
	 * PaymentTransaction93.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader13#mmStatusReasonInformation
	 * OriginalGroupHeader13.mmStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader12#mmReturnReasonInformation
	 * OriginalGroupHeader12.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation11#mmReason
	 * StatusReasonInformation11.mmReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reasons for the status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Status, List<StatusReason>> mmStatusReason = new MMBusinessAssociationEnd<Status, List<StatusReason>>() {
		{
			derivation_lazy = () -> Arrays.asList(Blocked1.mmReason, InstructionStatusSearch3.mmProprietaryStatusReason, PaymentStatusReasonCode3Choice.mmProprietaryRejectionReason, PaymentStatus1.mmReason,
					ProprietaryStatusAndReason1.mmProprietaryReason, ProprietaryStatusAndReason2.mmProprietaryReason, DeliveryReturn1Choice.mmCode, DeliveryReturn1Choice.mmProprietary, DeliveryReturn2Choice.mmCode,
					DeliveryReturn2Choice.mmProprietary, OriginalPaymentInstruction4.mmCancellationReasonInformation, OriginalPaymentInstruction8.mmCancellationReasonInformation, OriginalPaymentInformation2.mmReversalReasonInformation,
					PaymentTransaction35.mmReversalReasonInformation, OriginalPaymentInstruction2.mmReversalReasonInformation, PaymentTransaction42.mmReversalReasonInformation, OriginalPaymentInstruction7.mmReversalReasonInformation,
					OriginalGroupInformation1.mmStatusReasonInformation, PaymentTransactionInformation1.mmStatusReasonInformation, OriginalGroupInformation20.mmStatusReasonInformation,
					PaymentTransactionInformation25.mmStatusReasonInformation, OriginalPaymentInformation1.mmStatusReasonInformation, StatusReasonInformation9.mmReason, OriginalGroupHeader1.mmStatusReasonInformation,
					PaymentTransaction32.mmStatusReasonInformation, OriginalPaymentInstruction1.mmStatusReasonInformation, PaymentTransaction46.mmStatusReasonInformation, OriginalPaymentInstruction6.mmStatusReasonInformation,
					PaymentTransaction36.mmReversalReasonInformation, PaymentTransaction45.mmReversalReasonInformation, PaymentTransactionInformation26.mmStatusReasonInformation, PaymentTransaction33.mmStatusReasonInformation,
					PaymentTransaction43.mmStatusReasonInformation, MandateAmendment1.mmAmendmentReason, MandateAmendment2.mmAmendmentReason, MandateAmendment3.mmAmendmentReason, ReturnReasonInformation1.mmReturnReason,
					OriginalGroupInformation2.mmReturnReasonInformation, ReturnReasonInformation9.mmReason, OriginalGroupInformation21.mmReturnReasonInformation, OriginalGroupHeader2.mmReturnReasonInformation,
					PaymentTransaction34.mmReturnReasonInformation, PaymentTransaction44.mmReturnReasonInformation, OriginalGroupInformation25.mmStatusReasonInformation, PaymentTransactionInformation34.mmStatusReasonInformation,
					OriginalPaymentInformation5.mmStatusReasonInformation, PaymentTransaction41.mmStatusReasonInformation, OriginalPaymentInstruction5.mmStatusReasonInformation, PaymentTransaction49.mmStatusReasonInformation,
					OriginalPaymentInstruction9.mmStatusReasonInformation, InRepairStatus1.mmReason, IndividualOrderStatusAndReason1.mmCancelled, InRepairStatus2.mmReasonDetails, IndividualOrderStatusAndReason2.mmCancelled,
					IndividualOrderStatusAndReason2.mmInRepair, MeetingInstructionGlobalStatus.mmStatusReason, ReportStatusAndReason1.mmRejected, TradeTransactionStatusAndReason1.mmRejected, ReportStatusAndReason2.mmRejected,
					TradeTransactionStatusAndReason2.mmRejected, OriginalGroupInformation13.mmStatusReasonInformation, OriginalGroupInformation17.mmStatusReasonInformation, OriginalGroupInformation15.mmStatusReasonInformation,
					OriginalGroupInformation19.mmStatusReasonInformation, ReturnReasonInformation3.mmReturnReason, OriginalGroupInformation11.mmReturnReasonInformation, OriginalGroupInformation18.mmReturnReasonInformation,
					ReturnReasonInformation4.mmReturnReason, ReturnReasonInformation6.mmReturnReason, PaymentTransactionInformation15.mmStatusReasonInformation, PaymentTransactionInformation22.mmStatusReasonInformation,
					PaymentTransactionInformation12.mmStatusReasonInformation, PaymentTransactionInformation19.mmStatusReasonInformation, ReturnReasonInformation7.mmReturnReason, IndividualOrderStatusAndReason5.mmCancelled,
					IntraBalanceStatusAndReason1.mmSettled, CollateralStatusReason1.mmReason, IntraPositionStatusType1.mmSettled, IntraBalanceStatusType1.mmSettled, ProprietaryStatusAndReason3.mmProprietaryReason, PaymentStatus2.mmReason,
					TransferStatus1Choice.mmUnmatched, TransferStatus1Choice.mmInRepair, TransferStatus1Choice.mmFailedSettlement, TransferStatus1Choice.mmCancellationPending, PaymentTransaction50.mmReturnReasonInformation,
					MandateAmendment4.mmAmendmentReason, OriginalPaymentInstruction12.mmStatusReasonInformation, OriginalPaymentInstruction11.mmReversalReasonInformation, PaymentTransaction52.mmStatusReasonInformation,
					PaymentTransaction51.mmReversalReasonInformation, OriginalPaymentInstruction13.mmCancellationReasonInformation, PaymentTransaction57.mmStatusReasonInformation, PaymentTransaction56.mmReversalReasonInformation,
					ReportItemStatus1Choice.mmAcceptedWithException, OriginalPaymentInstruction14.mmStatusReasonInformation, PaymentTransaction59.mmStatusReasonInformation, CurrencyControlPackageStatus1.mmStatusReason,
					ValidationStatusReason1.mmReason, CurrencyControlRecordStatus1.mmStatusReason, ProprietaryStatusAndReason6.mmProprietaryReason, DeliveryReturn3Choice.mmCode, DeliveryReturn3Choice.mmProprietary,
					OriginalPaymentInstruction16.mmReversalReasonInformation, OriginalPaymentInstruction18.mmStatusReasonInformation, PaymentTransaction65.mmReturnReasonInformation, PaymentTransaction63.mmStatusReasonInformation,
					PaymentTransaction60.mmReversalReasonInformation, PaymentTransaction68.mmStatusReasonInformation, OriginalPaymentInstruction15.mmCancellationReasonInformation, PaymentTransaction64.mmReversalReasonInformation,
					Blocked2.mmReason, TransferStatus2Choice.mmUnmatched, TransferStatus2Choice.mmInRepair, TransferStatus2Choice.mmFailedSettlement, TransferStatus2Choice.mmCancellationPending, Status21Choice.mmPending,
					OriginalPaymentInstruction19.mmStatusReasonInformation, PaymentTransaction69.mmStatusReasonInformation, ProprietaryStatusAndReason7.mmProprietaryReason, DeliveryReturn4Choice.mmCode, DeliveryReturn4Choice.mmProprietary,
					IntraBalanceStatusAndReason2.mmSettled, IntraBalanceStatusType2.mmSettled, IntraPositionStatusType2.mmSettled, AccountManagementStatusAndReason5.mmStatusReason, OrderStatus5Choice.mmCancelled,
					OrderStatus5Choice.mmInRepair, AccountStatus2.mmEnabled, AccountStatus2.mmDisabled, AccountStatus2.mmPending, AccountStatus2.mmPendingOpening, AccountStatus2.mmProforma, AccountStatus2.mmClosed,
					AccountStatus2.mmClosurePending, OtherAccountStatus1.mmReason, OrderStatus3Choice.mmCancelled, OrderStatus4Choice.mmCancelled, OrderStatus4Choice.mmInRepair, PaymentTransaction80.mmStatusReasonInformation,
					OriginalGroupHeader7.mmStatusReasonInformation, PaymentTransaction81.mmReversalReasonInformation, OriginalPaymentInstruction23.mmStatusReasonInformation, OriginalPaymentInstruction21.mmReversalReasonInformation,
					MandateAmendment5.mmAmendmentReason, OriginalPaymentInstruction24.mmStatusReasonInformation, OriginalGroupInformation28.mmStatusReasonInformation, PaymentTransaction76.mmReturnReasonInformation,
					OriginalPaymentInstruction20.mmCancellationReasonInformation, PaymentTransaction83.mmStatusReasonInformation, PaymentTransaction77.mmReversalReasonInformation, PaymentTransaction82.mmStatusReasonInformation,
					MandateSuspensionReason1.mmReason, PaymentTransaction87.mmReturnReasonInformation, PaymentTransaction88.mmReversalReasonInformation, PaymentTransaction91.mmStatusReasonInformation, PaymentStatus3.mmReason,
					InstructionStatusSearch4.mmProprietaryStatusReason, ClaimNonReceiptRejectReason1Choice.mmCode, ClaimNonReceiptRejectReason1Choice.mmProprietary, OriginalPaymentInstruction28.mmReversalReasonInformation,
					OriginalPaymentInstruction27.mmStatusReasonInformation, OriginalPaymentInstruction29.mmCancellationReasonInformation, PaymentTransaction92.mmStatusReasonInformation, PaymentTransaction93.mmReversalReasonInformation,
					OriginalGroupHeader13.mmStatusReasonInformation, OriginalGroupHeader12.mmReturnReasonInformation, StatusReasonInformation11.mmReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatusReason";
			definition = "Specifies the reasons for the status.";
			minOccurs = 0;
			opposite_lazy = () -> StatusReason.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> StatusReason.mmObject();
		}

		@Override
		public List<StatusReason> getValue(Status obj) {
			return obj.getStatusReason();
		}

		@Override
		public void setValue(Status obj, List<StatusReason> value) {
			obj.setStatusReason(value);
		}
	};
	protected ISODateTime statusDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#mmStatusValueTime
	 * PaymentInstructionReference2Details.mmStatusValueTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch2#mmPaymentInstructionStatusDateTime
	 * InstructionStatusSearch2.mmPaymentInstructionStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch3#mmPaymentInstructionStatusDateTime
	 * InstructionStatusSearch3.mmPaymentInstructionStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails1#mmPaymentInstructionStatusDateTime
	 * PaymentStatusDetails1.mmPaymentInstructionStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails3#mmPaymentInstructionStatusDateTime
	 * PaymentStatusDetails3.mmPaymentInstructionStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails4#mmPaymentInstructionStatusDateTime
	 * PaymentStatusDetails4.mmPaymentInstructionStatusDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus1#mmDateTime
	 * PaymentStatus1.mmDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail2#mmStatusDate
	 * StatusTrail2.mmStatusDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail3#mmStatusDate
	 * StatusTrail3.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData1#mmCurrentStatusTime
	 * TradeData1.mmCurrentStatusTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData1#mmPreviousStatusTime
	 * TradeData1.mmPreviousStatusTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData10#mmCurrentStatusDateTime
	 * TradeData10.mmCurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData8#mmCurrentStatusDateTime
	 * TradeData8.mmCurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData9#mmCurrentStatusDateTime
	 * TradeData9.mmCurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData2#mmCurrentStatusTime
	 * TradeData2.mmCurrentStatusTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData2#mmPreviousStatusTime
	 * TradeData2.mmPreviousStatusTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData7#mmCurrentStatusDateTime
	 * TradeData7.mmCurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData7#mmPreviousStatusDateTime
	 * TradeData7.mmPreviousStatusDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CaseStatus#mmDateTime
	 * CaseStatus.mmDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CaseStatus2#mmDateTime
	 * CaseStatus2.mmDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeStatus1#mmStatusTime
	 * TradeStatus1.mmStatusTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionStatus2#mmChangeDateTime
	 * TransactionStatus2.mmChangeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionStatus5#mmChangeDateTime
	 * TransactionStatus5.mmChangeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2#mmStatusDate
	 * IntraBalanceCancellation2.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement2#mmStatusDate
	 * IntraBalanceMovement2.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2#mmStatusDate
	 * IntraBalanceModification2.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification2#mmStatusDate
	 * IntraPositionModification2.mmStatusDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus2#mmDateTime
	 * PaymentStatus2.mmDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData11#mmCurrentStatusDateTime
	 * TradeData11.mmCurrentStatusDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail4#mmStatusDate
	 * StatusTrail4.mmStatusDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail5#mmStatusDate
	 * StatusTrail5.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#mmStatusDateTime
	 * CurrencyControlGroupStatus1.mmStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#mmStatusDateTime
	 * CurrencyControlPackageStatus1.mmStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractJournal1#mmClosureDate
	 * RegisteredContractJournal1.mmClosureDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#mmStatusDateTime
	 * CurrencyControlRecordStatus1.mmStatusDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail6#mmStatusDate
	 * StatusTrail6.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmStatusDate
	 * InvestmentAccount50.mmStatusDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail7#mmStatusDate
	 * StatusTrail7.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement4#mmStatusDate
	 * IntraBalanceMovement4.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation4#mmStatusDate
	 * IntraBalanceCancellation4.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification4#mmStatusDate
	 * IntraBalanceModification4.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification4#mmStatusDate
	 * IntraPositionModification4.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmStatusDate
	 * InvestmentAccount62.mmStatusDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData14#mmCurrentStatusDateTime
	 * TradeData14.mmCurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData12#mmCurrentStatusDateTime
	 * TradeData12.mmCurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmCurrentStatusDateTime
	 * TradeData15.mmCurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmPreviousStatusDateTime
	 * TradeData15.mmPreviousStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData16#mmCurrentStatusDateTime
	 * TradeData16.mmCurrentStatusDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentStatus3#mmDateTime
	 * PaymentStatus3.mmDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch4#mmPaymentInstructionStatusDateTime
	 * InstructionStatusSearch4.mmPaymentInstructionStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClaimNonReceipt1#mmDateProcessed
	 * ClaimNonReceipt1.mmDateProcessed}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the status was assigned."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Status, ISODateTime> mmStatusDateTime = new MMBusinessAttribute<Status, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentInstructionReference2Details.mmStatusValueTime, InstructionStatusSearch2.mmPaymentInstructionStatusDateTime, InstructionStatusSearch3.mmPaymentInstructionStatusDateTime,
					PaymentStatusDetails1.mmPaymentInstructionStatusDateTime, PaymentStatusDetails3.mmPaymentInstructionStatusDateTime, PaymentStatusDetails4.mmPaymentInstructionStatusDateTime, PaymentStatus1.mmDateTime,
					StatusTrail2.mmStatusDate, StatusTrail3.mmStatusDate, TradeData1.mmCurrentStatusTime, TradeData1.mmPreviousStatusTime, TradeData10.mmCurrentStatusDateTime, TradeData8.mmCurrentStatusDateTime,
					TradeData9.mmCurrentStatusDateTime, TradeData2.mmCurrentStatusTime, TradeData2.mmPreviousStatusTime, TradeData7.mmCurrentStatusDateTime, TradeData7.mmPreviousStatusDateTime, CaseStatus.mmDateTime,
					CaseStatus2.mmDateTime, TradeStatus1.mmStatusTime, TransactionStatus2.mmChangeDateTime, TransactionStatus5.mmChangeDateTime, IntraBalanceCancellation2.mmStatusDate, IntraBalanceMovement2.mmStatusDate,
					IntraBalanceModification2.mmStatusDate, IntraPositionModification2.mmStatusDate, PaymentStatus2.mmDateTime, TradeData11.mmCurrentStatusDateTime, StatusTrail4.mmStatusDate, StatusTrail5.mmStatusDate,
					CurrencyControlGroupStatus1.mmStatusDateTime, CurrencyControlPackageStatus1.mmStatusDateTime, RegisteredContractJournal1.mmClosureDate, CurrencyControlRecordStatus1.mmStatusDateTime, StatusTrail6.mmStatusDate,
					InvestmentAccount50.mmStatusDate, StatusTrail7.mmStatusDate, IntraBalanceMovement4.mmStatusDate, IntraBalanceCancellation4.mmStatusDate, IntraBalanceModification4.mmStatusDate, IntraPositionModification4.mmStatusDate,
					InvestmentAccount62.mmStatusDate, TradeData14.mmCurrentStatusDateTime, TradeData12.mmCurrentStatusDateTime, TradeData15.mmCurrentStatusDateTime, TradeData15.mmPreviousStatusDateTime, TradeData16.mmCurrentStatusDateTime,
					PaymentStatus3.mmDateTime, InstructionStatusSearch4.mmPaymentInstructionStatusDateTime, ClaimNonReceipt1.mmDateProcessed);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatusDateTime";
			definition = "Date and time at which the status was assigned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Status obj) {
			return obj.getStatusDateTime();
		}

		@Override
		public void setValue(Status obj, ISODateTime value) {
			obj.setStatusDateTime(value);
		}
	};
	protected DateTimePeriod validityTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmStatus
	 * DateTimePeriod.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemStatusDetails1#mmValidityTime
	 * SystemStatusDetails1.mmValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemStatus1#mmValidityTime
	 * SystemStatus1.mmValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryStatus1#mmDatePeriod
	 * IntraPositionQueryStatus1.mmDatePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemStatus2#mmValidityTime
	 * SystemStatus2.mmValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryStatus2#mmDatePeriod
	 * IntraPositionQueryStatus2.mmDatePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemStatus3#mmValidityTime
	 * SystemStatus3.mmValidityTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period of time during which the status is valid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Status, DateTimePeriod> mmValidityTime = new MMBusinessAssociationEnd<Status, DateTimePeriod>() {
		{
			derivation_lazy = () -> Arrays.asList(SystemStatusDetails1.mmValidityTime, SystemStatus1.mmValidityTime, IntraPositionQueryStatus1.mmDatePeriod, SystemStatus2.mmValidityTime, IntraPositionQueryStatus2.mmDatePeriod,
					SystemStatus3.mmValidityTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityTime";
			definition = "Period of time during which the status is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(Status obj) {
			return obj.getValidityTime();
		}

		@Override
		public void setValue(Status obj, DateTimePeriod value) {
			obj.setValidityTime(value);
		}
	};
	protected Max350Text statusDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation9#mmAdditionalInformation
	 * StatusReasonInformation9.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingTermination3#mmAdditionalInformation
	 * UndertakingTermination3.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationRight1#mmAdditionalInformation
	 * CancellationRight1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationProcessingStatus1#mmAdditionalInformation
	 * CancellationProcessingStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionProcessingStatus1#mmAdditionalInformation
	 * CorporateActionInstructionProcessingStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionRejectionStatus1#mmAdditionalInformation
	 * CorporateActionInstructionRejectionStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationProcessingStatus1#mmAdditionalInformation
	 * CorporateActionCancellationProcessingStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellationRejectionStatus1#mmAdditionalInformation
	 * CorporateActionCancellationRejectionStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmendmentProcessingStatus1#mmAdditionalInformation
	 * CorporateActionAmendmentProcessingStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmendmentRejectionStatus1#mmAdditionalInformation
	 * CorporateActionAmendmentRejectionStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementProcessingStatus1#mmAdditionalInformation
	 * CorporateActionMovementProcessingStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementRejectionStatus1#mmAdditionalInformation
	 * CorporateActionMovementRejectionStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporationActionMovementProcessingStatus2#mmAdditionalInformation
	 * CorporationActionMovementProcessingStatus2.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementRejectionStatus2#mmAdditionalInformation
	 * CorporateActionMovementRejectionStatus2.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformationProcessingStatus1#mmAdditionalInformation
	 * CorporateActionInformationProcessingStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformationRejectedStatus1#mmAdditionalInformation
	 * CorporateActionInformationRejectedStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionProcessingStatus1#mmAdditionalInformation
	 * CorporateActionStandingInstructionProcessingStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionRejectionStatus1#mmAdditionalInformation
	 * CorporateActionStandingInstructionRejectionStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionCancellationProcessingStatus1#mmAdditionalInformation
	 * CorporateActionStandingInstructionCancellationProcessingStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionCancellationRejectionStatus1#mmAdditionalInformation
	 * CorporateActionStandingInstructionCancellationRejectionStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionProcessingStatus1#mmAdditionalInformation
	 * CorporateActionDeactivationInstructionProcessingStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionRejectionStatus1#mmAdditionalInformation
	 * CorporateActionDeactivationInstructionRejectionStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationCancellationProcessingStatus1#mmAdditionalInformation
	 * CorporateActionDeactivationCancellationProcessingStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationCancellationRejectionStatus1#mmAdditionalInformation
	 * CorporateActionDeactivationCancellationRejectionStatus1.
	 * mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusInformation1#mmAdditionalStatusReasonInformation
	 * CancellationStatusInformation1.mmAdditionalStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralCancellationStatus1#mmAdditionalInformation
	 * CollateralCancellationStatus1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericValidationRuleIdentification1#mmDescription
	 * GenericValidationRuleIdentification1.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#mmStatus
	 * CurrencyControlGroupStatus1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusReason1#mmValidationRule
	 * ValidationStatusReason1.mmValidationRule}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusReason1#mmAdditionalInformation
	 * ValidationStatusReason1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#mmStatus
	 * CurrencyControlRecordStatus1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation11#mmAdditionalInformation
	 * StatusReasonInformation11.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the state or the condition."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Status, Max350Text> mmStatusDescription = new MMBusinessAttribute<Status, Max350Text>() {
		{
			derivation_lazy = () -> Arrays.asList(StatusReasonInformation9.mmAdditionalInformation, UndertakingTermination3.mmAdditionalInformation, CancellationRight1.mmAdditionalInformation,
					CancellationProcessingStatus1.mmAdditionalInformation, CorporateActionInstructionProcessingStatus1.mmAdditionalInformation, CorporateActionInstructionRejectionStatus1.mmAdditionalInformation,
					CorporateActionCancellationProcessingStatus1.mmAdditionalInformation, CorporateActionCancellationRejectionStatus1.mmAdditionalInformation, CorporateActionAmendmentProcessingStatus1.mmAdditionalInformation,
					CorporateActionAmendmentRejectionStatus1.mmAdditionalInformation, CorporateActionMovementProcessingStatus1.mmAdditionalInformation, CorporateActionMovementRejectionStatus1.mmAdditionalInformation,
					CorporationActionMovementProcessingStatus2.mmAdditionalInformation, CorporateActionMovementRejectionStatus2.mmAdditionalInformation, CorporateActionInformationProcessingStatus1.mmAdditionalInformation,
					CorporateActionInformationRejectedStatus1.mmAdditionalInformation, CorporateActionStandingInstructionProcessingStatus1.mmAdditionalInformation, CorporateActionStandingInstructionRejectionStatus1.mmAdditionalInformation,
					CorporateActionStandingInstructionCancellationProcessingStatus1.mmAdditionalInformation, CorporateActionStandingInstructionCancellationRejectionStatus1.mmAdditionalInformation,
					CorporateActionDeactivationInstructionProcessingStatus1.mmAdditionalInformation, CorporateActionDeactivationInstructionRejectionStatus1.mmAdditionalInformation,
					CorporateActionDeactivationCancellationProcessingStatus1.mmAdditionalInformation, CorporateActionDeactivationCancellationRejectionStatus1.mmAdditionalInformation,
					CancellationStatusInformation1.mmAdditionalStatusReasonInformation, CollateralCancellationStatus1.mmAdditionalInformation, GenericValidationRuleIdentification1.mmDescription, CurrencyControlGroupStatus1.mmStatus,
					ValidationStatusReason1.mmValidationRule, ValidationStatusReason1.mmAdditionalInformation, CurrencyControlRecordStatus1.mmStatus, StatusReasonInformation11.mmAdditionalInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatusDescription";
			definition = "Specifies the state or the condition.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(Status obj) {
			return obj.getStatusDescription();
		}

		@Override
		public void setValue(Status obj, Max350Text value) {
			obj.setStatusDescription(value);
		}
	};
	protected StatusCode instructionProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.StatusCode
	 * StatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus#mmProcessingStatus
	 * MeetingInstructionGlobalStatus.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionStatusDetails#mmProcessingStatus
	 * MeetingInstructionStatusDetails.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionProcessingStatus1#mmStatus
	 * InstructionProcessingStatus1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus2Choice#mmProcessingStatus
	 * InstructionStatus2Choice.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus1#mmInstructionStatus
	 * DetailedInstructionStatus1.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus4Choice#mmProcessingStatus
	 * InstructionStatus4Choice.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus8#mmInstructionStatus
	 * DetailedInstructionStatus8.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus3Choice#mmGlobalInstructionStatus
	 * InstructionStatus3Choice.mmGlobalInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus3Choice#mmDetailedInstructionStatus
	 * InstructionStatus3Choice.mmDetailedInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus1Choice#mmInstructionStatus
	 * InstructionTypeStatus1Choice.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason1#mmStatus
	 * TradeTransactionStatusAndReason1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2#mmStatus
	 * TradeTransactionStatusAndReason2.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralCancellationStatus1#mmCollateralStatusCode
	 * CollateralCancellationStatus1.mmCollateralStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1#mmResponseType
	 * CollateralProposalResponseType1.mmResponseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubstitutionResponse1#mmResponseType
	 * SubstitutionResponse1.mmResponseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResponse1#mmResponseType
	 * InterestResponse1.mmResponseType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2#mmStatus
	 * TradeLeg2.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#mmStatus
	 * TradeLeg5.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralStatusReason1#mmStatus
	 * CollateralStatusReason1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountLinkStatus1#mmStatus
	 * AccountLinkStatus1.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmStatus
	 * TradeLeg8.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus2Choice#mmInstructionStatus
	 * InstructionTypeStatus2Choice.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus5Choice#mmGlobalInstructionStatus
	 * InstructionStatus5Choice.mmGlobalInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus5Choice#mmDetailedInstructionStatus
	 * InstructionStatus5Choice.mmDetailedInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus6Choice#mmProcessingStatus
	 * InstructionStatus6Choice.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11#mmInstructionStatus
	 * DetailedInstructionStatus11.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionProcessingStatus3#mmStatus
	 * InstructionProcessingStatus3.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1#mmStatus
	 * CurrencyControlPackageStatus1.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the processing of an instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Status, StatusCode> mmInstructionProcessingStatus = new MMBusinessAttribute<Status, StatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(MeetingInstructionGlobalStatus.mmProcessingStatus, MeetingInstructionStatusDetails.mmProcessingStatus, InstructionProcessingStatus1.mmStatus, InstructionStatus2Choice.mmProcessingStatus,
					DetailedInstructionStatus1.mmInstructionStatus, InstructionStatus4Choice.mmProcessingStatus, DetailedInstructionStatus8.mmInstructionStatus, InstructionStatus3Choice.mmGlobalInstructionStatus,
					InstructionStatus3Choice.mmDetailedInstructionStatus, InstructionTypeStatus1Choice.mmInstructionStatus, TradeTransactionStatusAndReason1.mmStatus, TradeTransactionStatusAndReason2.mmStatus,
					CollateralCancellationStatus1.mmCollateralStatusCode, CollateralProposalResponseType1.mmResponseType, SubstitutionResponse1.mmResponseType, InterestResponse1.mmResponseType, TradeLeg2.mmStatus, TradeLeg5.mmStatus,
					CollateralStatusReason1.mmStatus, AccountLinkStatus1.mmStatus, TradeLeg8.mmStatus, InstructionTypeStatus2Choice.mmInstructionStatus, InstructionStatus5Choice.mmGlobalInstructionStatus,
					InstructionStatus5Choice.mmDetailedInstructionStatus, InstructionStatus6Choice.mmProcessingStatus, DetailedInstructionStatus11.mmInstructionStatus, InstructionProcessingStatus3.mmStatus,
					CurrencyControlPackageStatus1.mmStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionProcessingStatus";
			definition = "Status of the processing of an instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StatusCode.mmObject();
		}

		@Override
		public StatusCode getValue(Status obj) {
			return obj.getInstructionProcessingStatus();
		}

		@Override
		public void setValue(Status obj, StatusCode value) {
			obj.setInstructionProcessingStatus(value);
		}
	};
	protected InvestigationPartyRole partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole
	 * InvestigationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationPartyRole#mmStatus
	 * InvestigationPartyRole.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Role played by a party in the context of assigning a status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Status, InvestigationPartyRole> mmPartyRole = new MMBusinessAssociationEnd<Status, InvestigationPartyRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of assigning a status.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestigationPartyRole.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestigationPartyRole.mmObject();
		}

		@Override
		public InvestigationPartyRole getValue(Status obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(Status obj, InvestigationPartyRole value) {
			obj.setPartyRole(value);
		}
	};
	protected SecuritiesSettlementStatusCode settlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatusCode
	 * SecuritiesSettlementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmSettlementStatus
	 * StatusTrail2.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail3#mmSettlementStatus
	 * StatusTrail3.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason3#mmSettlementStatus
	 * StatusAndReason3.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason6#mmSettlementStatus
	 * StatusAndReason6.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason12#mmSettlementStatus
	 * StatusAndReason12.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason14#mmSettlementStatus
	 * StatusAndReason14.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status2Choice#mmSettlementStatus
	 * Status2Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status4Choice#mmSettlementStatus
	 * Status4Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status9Choice#mmSettlementStatus
	 * Status9Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status11Choice#mmSettlementStatus
	 * Status11Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus1Choice#mmCode
	 * SettlementStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus1Choice#mmProprietary
	 * SettlementStatus1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#mmSettlementStatus
	 * Status1Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus5Choice#mmCode
	 * SettlementStatus5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus5Choice#mmProprietary
	 * SettlementStatus5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmSettlementStatus
	 * Status8Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus3Choice#mmCode
	 * SettlementStatus3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus3Choice#mmProprietary
	 * SettlementStatus3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmSettlementStatus
	 * Status3Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus6Choice#mmCode
	 * SettlementStatus6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus6Choice#mmProprietary
	 * SettlementStatus6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmSettlementStatus
	 * Status10Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusAndReason1#mmSettlementStatus
	 * PendingStatusAndReason1.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusAndReason1#mmSettlementStatus
	 * IntraBalanceStatusAndReason1.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusType1#mmSettlementStatus
	 * IntraPositionStatusType1.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusType1#mmSettlementStatus
	 * IntraBalanceStatusType1.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status15Choice#mmSettlementStatus
	 * Status15Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason19#mmSettlementStatus
	 * StatusAndReason19.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason20#mmSettlementStatus
	 * StatusAndReason20.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status16Choice#mmSettlementStatus
	 * Status16Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail4#mmSettlementStatus
	 * StatusTrail4.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail5#mmSettlementStatus
	 * StatusTrail5.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason28#mmSettlementStatus
	 * StatusAndReason28.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmSettlementStatus
	 * StatusTrail6.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status18Choice#mmSettlementStatus
	 * Status18Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmSettlementStatus
	 * Status19Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus19Choice#mmCode
	 * SettlementStatus19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus19Choice#mmProprietary
	 * SettlementStatus19Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason29#mmSettlementStatus
	 * StatusAndReason29.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail7#mmSettlementStatus
	 * StatusTrail7.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmSettlementStatus
	 * Status22Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus25Choice#mmCode
	 * SettlementStatus25Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus25Choice#mmProprietary
	 * SettlementStatus25Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status23Choice#mmSettlementStatus
	 * Status23Choice.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusAndReason2#mmSettlementStatus
	 * IntraBalanceStatusAndReason2.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus26Choice#mmCode
	 * SettlementStatus26Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus26Choice#mmProprietary
	 * SettlementStatus26Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusAndReason2#mmSettlementStatus
	 * PendingStatusAndReason2.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusType2#mmSettlementStatus
	 * IntraBalanceStatusType2.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusType2#mmSettlementStatus
	 * IntraPositionStatusType2.mmSettlementStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of settlement of a transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Status, SecuritiesSettlementStatusCode> mmSettlementStatus = new MMBusinessAttribute<Status, SecuritiesSettlementStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(StatusTrail2.mmSettlementStatus, StatusTrail3.mmSettlementStatus, StatusAndReason3.mmSettlementStatus, StatusAndReason6.mmSettlementStatus, StatusAndReason12.mmSettlementStatus,
					StatusAndReason14.mmSettlementStatus, Status2Choice.mmSettlementStatus, Status4Choice.mmSettlementStatus, Status9Choice.mmSettlementStatus, Status11Choice.mmSettlementStatus, SettlementStatus1Choice.mmCode,
					SettlementStatus1Choice.mmProprietary, Status1Choice.mmSettlementStatus, SettlementStatus5Choice.mmCode, SettlementStatus5Choice.mmProprietary, Status8Choice.mmSettlementStatus, SettlementStatus3Choice.mmCode,
					SettlementStatus3Choice.mmProprietary, Status3Choice.mmSettlementStatus, SettlementStatus6Choice.mmCode, SettlementStatus6Choice.mmProprietary, Status10Choice.mmSettlementStatus,
					PendingStatusAndReason1.mmSettlementStatus, IntraBalanceStatusAndReason1.mmSettlementStatus, IntraPositionStatusType1.mmSettlementStatus, IntraBalanceStatusType1.mmSettlementStatus, Status15Choice.mmSettlementStatus,
					StatusAndReason19.mmSettlementStatus, StatusAndReason20.mmSettlementStatus, Status16Choice.mmSettlementStatus, StatusTrail4.mmSettlementStatus, StatusTrail5.mmSettlementStatus, StatusAndReason28.mmSettlementStatus,
					StatusTrail6.mmSettlementStatus, Status18Choice.mmSettlementStatus, Status19Choice.mmSettlementStatus, SettlementStatus19Choice.mmCode, SettlementStatus19Choice.mmProprietary, StatusAndReason29.mmSettlementStatus,
					StatusTrail7.mmSettlementStatus, Status22Choice.mmSettlementStatus, SettlementStatus25Choice.mmCode, SettlementStatus25Choice.mmProprietary, Status23Choice.mmSettlementStatus,
					IntraBalanceStatusAndReason2.mmSettlementStatus, SettlementStatus26Choice.mmCode, SettlementStatus26Choice.mmProprietary, PendingStatusAndReason2.mmSettlementStatus, IntraBalanceStatusType2.mmSettlementStatus,
					IntraPositionStatusType2.mmSettlementStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementStatus";
			definition = "Status of settlement of a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesSettlementStatusCode.mmObject();
		}

		@Override
		public SecuritiesSettlementStatusCode getValue(Status obj) {
			return obj.getSettlementStatus();
		}

		@Override
		public void setValue(Status obj, SecuritiesSettlementStatusCode value) {
			obj.setSettlementStatus(value);
		}
	};
	protected CancellationProcessingStatusCode cancellationProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessingStatusCode
	 * CancellationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus1Choice#mmCode
	 * CancellationProcessingStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus1Choice#mmProprietary
	 * CancellationProcessingStatus1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#mmCancellationProcessingStatus
	 * Status1Choice.mmCancellationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmCancellationProcessingStatus
	 * Status8Choice.mmCancellationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus2Choice#mmCode
	 * CancellationProcessingStatus2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus2Choice#mmProprietary
	 * CancellationProcessingStatus2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmCancellationProcessingStatus
	 * Status3Choice.mmCancellationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmCancellationProcessingStatus
	 * Status10Choice.mmCancellationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus3Choice#mmCode
	 * CancellationProcessingStatus3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus3Choice#mmProprietary
	 * CancellationProcessingStatus3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmCancellationProcessingStatus
	 * Status19Choice.mmCancellationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus7Choice#mmCode
	 * CancellationProcessingStatus7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus7Choice#mmProprietary
	 * CancellationProcessingStatus7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus8Choice#mmCode
	 * CancellationProcessingStatus8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus8Choice#mmProprietary
	 * CancellationProcessingStatus8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmCancellationProcessingStatus
	 * Status22Choice.mmCancellationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus9Choice#mmCode
	 * CancellationProcessingStatus9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus9Choice#mmProprietary
	 * CancellationProcessingStatus9Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a cancellation request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Status, CancellationProcessingStatusCode> mmCancellationProcessingStatus = new MMBusinessAttribute<Status, CancellationProcessingStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CancellationProcessingStatus1Choice.mmCode, CancellationProcessingStatus1Choice.mmProprietary, Status1Choice.mmCancellationProcessingStatus, Status8Choice.mmCancellationProcessingStatus,
					CancellationProcessingStatus2Choice.mmCode, CancellationProcessingStatus2Choice.mmProprietary, Status3Choice.mmCancellationProcessingStatus, Status10Choice.mmCancellationProcessingStatus,
					CancellationProcessingStatus3Choice.mmCode, CancellationProcessingStatus3Choice.mmProprietary, Status19Choice.mmCancellationProcessingStatus, CancellationProcessingStatus7Choice.mmCode,
					CancellationProcessingStatus7Choice.mmProprietary, CancellationProcessingStatus8Choice.mmCode, CancellationProcessingStatus8Choice.mmProprietary, Status22Choice.mmCancellationProcessingStatus,
					CancellationProcessingStatus9Choice.mmCode, CancellationProcessingStatus9Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationProcessingStatus";
			definition = "Specifies the status of a cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationProcessingStatusCode.mmObject();
		}

		@Override
		public CancellationProcessingStatusCode getValue(Status obj) {
			return obj.getCancellationProcessingStatus();
		}

		@Override
		public void setValue(Status obj, CancellationProcessingStatusCode value) {
			obj.setCancellationProcessingStatus(value);
		}
	};
	protected InstructionProcessingStatusCode transactionProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
	 * InstructionProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status2Choice#mmInstructionProcessingStatus
	 * Status2Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status4Choice#mmInstructionProcessingStatus
	 * Status4Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status9Choice#mmInstructionProcessingStatus
	 * Status9Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status11Choice#mmInstructionProcessingStatus
	 * Status11Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus2Choice#mmCode
	 * InstructionProcessingStatus2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus2Choice#mmProprietary
	 * InstructionProcessingStatus2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmAccepted
	 * ReplacementProcessingStatus7Choice.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmCompleted
	 * ReplacementProcessingStatus7Choice.mmCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmDenied
	 * ReplacementProcessingStatus7Choice.mmDenied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmInRepair
	 * ReplacementProcessingStatus7Choice.mmInRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmPartialReplacementAccepted
	 * ReplacementProcessingStatus7Choice.mmPartialReplacementAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmPending
	 * ReplacementProcessingStatus7Choice.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmReceivedAtIntermediary
	 * ReplacementProcessingStatus7Choice.mmReceivedAtIntermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmReceivedAtStockExchange
	 * ReplacementProcessingStatus7Choice.mmReceivedAtStockExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmRejected
	 * ReplacementProcessingStatus7Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmModificationRequested
	 * ReplacementProcessingStatus7Choice.mmModificationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus7Choice#mmProprietaryStatus
	 * ReplacementProcessingStatus7Choice.mmProprietaryStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus1Choice#mmGlobalInstructionStatus
	 * InstructionStatus1Choice.mmGlobalInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus1Choice#mmDetailedInstructionStatus
	 * InstructionStatus1Choice.mmDetailedInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#mmInstructionProcessingStatus
	 * Status1Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#mmRegistrationProcessingStatus
	 * Status1Choice.mmRegistrationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#mmReplacementProcessingStatus
	 * Status1Choice.mmReplacementProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmInstructionProcessingStatus
	 * Status8Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmRegistrationProcessingStatus
	 * Status8Choice.mmRegistrationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmReplacementProcessingStatus
	 * Status8Choice.mmReplacementProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus5Choice#mmCode
	 * InstructionProcessingStatus5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus5Choice#mmProprietary
	 * InstructionProcessingStatus5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmInstructionProcessingStatus
	 * Status3Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmRegistrationProcessingStatus
	 * Status3Choice.mmRegistrationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmReplacementProcessingStatus
	 * Status3Choice.mmReplacementProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmInstructionProcessingStatus
	 * Status10Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmRegistrationProcessingStatus
	 * Status10Choice.mmRegistrationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmReplacementProcessingStatus
	 * Status10Choice.mmReplacementProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusAndReason1#mmProcessingStatus
	 * PendingStatusAndReason1.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusAndReason1#mmProcessingStatus
	 * IntraBalanceStatusAndReason1.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus33Choice#mmCode
	 * ProcessingStatus33Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus33Choice#mmProprietary
	 * ProcessingStatus33Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusType1#mmProcessingStatus
	 * IntraPositionStatusType1.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusType1#mmProcessingStatus
	 * IntraBalanceStatusType1.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus30Choice#mmCode
	 * ProcessingStatus30Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus30Choice#mmProprietary
	 * ProcessingStatus30Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status15Choice#mmInstructionProcessingStatus
	 * Status15Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#mmProcessingStatus
	 * AdditionalInformation9.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation10#mmProcessingStatus
	 * AdditionalInformation10.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status16Choice#mmInstructionProcessingStatus
	 * Status16Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReportItemStatus1Choice#mmRejected
	 * ReportItemStatus1Choice.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#mmProcessingStatus
	 * AdditionalInformation11.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status18Choice#mmInstructionProcessingStatus
	 * Status18Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus23Choice#mmCode
	 * InstructionProcessingStatus23Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus23Choice#mmProprietary
	 * InstructionProcessingStatus23Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmInstructionProcessingStatus
	 * Status19Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmRegistrationProcessingStatus
	 * Status19Choice.mmRegistrationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmReplacementProcessingStatus
	 * Status19Choice.mmReplacementProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation12#mmProcessingStatus
	 * AdditionalInformation12.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmInstructionProcessingStatus
	 * Status22Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmRegistrationProcessingStatus
	 * Status22Choice.mmRegistrationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmReplacementProcessingStatus
	 * Status22Choice.mmReplacementProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus26Choice#mmCode
	 * InstructionProcessingStatus26Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus26Choice#mmProprietary
	 * InstructionProcessingStatus26Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status23Choice#mmInstructionProcessingStatus
	 * Status23Choice.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus70Choice#mmCode
	 * ProcessingStatus70Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus70Choice#mmProprietary
	 * ProcessingStatus70Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusAndReason2#mmProcessingStatus
	 * IntraBalanceStatusAndReason2.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingStatusAndReason2#mmProcessingStatus
	 * PendingStatusAndReason2.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceStatusType2#mmProcessingStatus
	 * IntraBalanceStatusType2.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusType2#mmProcessingStatus
	 * IntraPositionStatusType2.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus68Choice#mmCode
	 * ProcessingStatus68Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus68Choice#mmProprietary
	 * ProcessingStatus68Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of processing of a transaction at account servicer level."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Status, InstructionProcessingStatusCode> mmTransactionProcessingStatus = new MMBusinessAttribute<Status, InstructionProcessingStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Status2Choice.mmInstructionProcessingStatus, Status4Choice.mmInstructionProcessingStatus, Status9Choice.mmInstructionProcessingStatus, Status11Choice.mmInstructionProcessingStatus,
					InstructionProcessingStatus2Choice.mmCode, InstructionProcessingStatus2Choice.mmProprietary, ReplacementProcessingStatus7Choice.mmAccepted, ReplacementProcessingStatus7Choice.mmCompleted,
					ReplacementProcessingStatus7Choice.mmDenied, ReplacementProcessingStatus7Choice.mmInRepair, ReplacementProcessingStatus7Choice.mmPartialReplacementAccepted, ReplacementProcessingStatus7Choice.mmPending,
					ReplacementProcessingStatus7Choice.mmReceivedAtIntermediary, ReplacementProcessingStatus7Choice.mmReceivedAtStockExchange, ReplacementProcessingStatus7Choice.mmRejected,
					ReplacementProcessingStatus7Choice.mmModificationRequested, ReplacementProcessingStatus7Choice.mmProprietaryStatus, InstructionStatus1Choice.mmGlobalInstructionStatus,
					InstructionStatus1Choice.mmDetailedInstructionStatus, Status1Choice.mmInstructionProcessingStatus, Status1Choice.mmRegistrationProcessingStatus, Status1Choice.mmReplacementProcessingStatus,
					Status8Choice.mmInstructionProcessingStatus, Status8Choice.mmRegistrationProcessingStatus, Status8Choice.mmReplacementProcessingStatus, InstructionProcessingStatus5Choice.mmCode,
					InstructionProcessingStatus5Choice.mmProprietary, Status3Choice.mmInstructionProcessingStatus, Status3Choice.mmRegistrationProcessingStatus, Status3Choice.mmReplacementProcessingStatus,
					Status10Choice.mmInstructionProcessingStatus, Status10Choice.mmRegistrationProcessingStatus, Status10Choice.mmReplacementProcessingStatus, PendingStatusAndReason1.mmProcessingStatus,
					IntraBalanceStatusAndReason1.mmProcessingStatus, ProcessingStatus33Choice.mmCode, ProcessingStatus33Choice.mmProprietary, IntraPositionStatusType1.mmProcessingStatus, IntraBalanceStatusType1.mmProcessingStatus,
					ProcessingStatus30Choice.mmCode, ProcessingStatus30Choice.mmProprietary, Status15Choice.mmInstructionProcessingStatus, AdditionalInformation9.mmProcessingStatus, AdditionalInformation10.mmProcessingStatus,
					Status16Choice.mmInstructionProcessingStatus, ReportItemStatus1Choice.mmRejected, AdditionalInformation11.mmProcessingStatus, Status18Choice.mmInstructionProcessingStatus, InstructionProcessingStatus23Choice.mmCode,
					InstructionProcessingStatus23Choice.mmProprietary, Status19Choice.mmInstructionProcessingStatus, Status19Choice.mmRegistrationProcessingStatus, Status19Choice.mmReplacementProcessingStatus,
					AdditionalInformation12.mmProcessingStatus, Status22Choice.mmInstructionProcessingStatus, Status22Choice.mmRegistrationProcessingStatus, Status22Choice.mmReplacementProcessingStatus,
					InstructionProcessingStatus26Choice.mmCode, InstructionProcessingStatus26Choice.mmProprietary, Status23Choice.mmInstructionProcessingStatus, ProcessingStatus70Choice.mmCode, ProcessingStatus70Choice.mmProprietary,
					IntraBalanceStatusAndReason2.mmProcessingStatus, PendingStatusAndReason2.mmProcessingStatus, IntraBalanceStatusType2.mmProcessingStatus, IntraPositionStatusType2.mmProcessingStatus, ProcessingStatus68Choice.mmCode,
					ProcessingStatus68Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionProcessingStatus";
			definition = "Status of processing of a transaction at account servicer level.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionProcessingStatusCode.mmObject();
		}

		@Override
		public InstructionProcessingStatusCode getValue(Status obj) {
			return obj.getTransactionProcessingStatus();
		}

		@Override
		public void setValue(Status obj, InstructionProcessingStatusCode value) {
			obj.setTransactionProcessingStatus(value);
		}
	};
	protected ModificationProcessingStatusCode modificationProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatusCode
	 * ModificationProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus1Choice#mmCode
	 * ModificationProcessingStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus1Choice#mmProprietary
	 * ModificationProcessingStatus1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus9Choice#mmCode
	 * ModificationProcessingStatus9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus9Choice#mmProprietary
	 * ModificationProcessingStatus9Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Status
	 * Status}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of a modification request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Status, ModificationProcessingStatusCode> mmModificationProcessingStatus = new MMBusinessAttribute<Status, ModificationProcessingStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ModificationProcessingStatus1Choice.mmCode, ModificationProcessingStatus1Choice.mmProprietary, ModificationProcessingStatus9Choice.mmCode, ModificationProcessingStatus9Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationProcessingStatus";
			definition = "Provides the status of a modification request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ModificationProcessingStatusCode.mmObject();
		}

		@Override
		public ModificationProcessingStatusCode getValue(Status obj) {
			return obj.getModificationProcessingStatus();
		}

		@Override
		public void setValue(Status obj, ModificationProcessingStatusCode value) {
			obj.setModificationProcessingStatus(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Status";
				definition = "The status of an instruction, advice or request.";
				associationDomain_lazy = () -> Arrays.asList(DateTimePeriod.mmStatus, StatusReason.mmStatus, InvestigationPartyRole.mmStatus);
				derivationElement_lazy = () -> Arrays.asList(ProprietaryStatusAndReason1.mmProprietaryStatus, ModificationProcessingStatus2Choice.mmProprietary, StatusTrail2.mmProcessingStatus, StatusTrail2.mmModificationProcessingStatus,
						StatusTrail2.mmCancellationStatus, StatusTrail2.mmSettled, ProprietaryStatusAndReason2.mmProprietaryStatus, ModificationProcessingStatus3Choice.mmProprietary, StatusTrail3.mmProcessingStatus,
						StatusTrail3.mmModificationProcessingStatus, StatusTrail3.mmCancellationStatus, StatusTrail3.mmSettled, StatusAndReason12.mmProcessingStatus, StatusAndReason14.mmProcessingStatus, StatusAndReason1.mmStatusAndReason,
						StatusAndReason2.mmStatusAndReason, StatusAndReason4.mmStatusAndReason, StatusAndReason5.mmStatusAndReason, StatusAndReason7.mmStatusAndReason, StatusAndReason8.mmStatusAndReason, Status9Choice.mmProprietary,
						StatusAndReason9.mmStatusAndReason, Status11Choice.mmProprietary, StatusAndReason13.mmStatusAndReason, StatusAndReason16.mmStatusAndReason, StatusAndReason17.mmStatusAndReason,
						CorporateActionInstructionProcessingStatus1.mmStatus, ResponseStatus3Choice.mmRejected, ResponseStatus3Choice.mmPending, ResponseStatus4Choice.mmRejected, ResponseStatus4Choice.mmPending,
						StatusOrStatement5Choice.mmStatusAdvice, StatusOrStatement6Choice.mmStatusAdvice, IntraBalanceQueryStatus1.mmType, ProprietaryStatusAndReason3.mmProprietaryStatus, StatusAndReason18.mmStatusAndReason,
						Status15Choice.mmProprietary, StatusAndReason19.mmProcessingStatus, StatusAndReason20.mmProcessingStatus, StatusAndReason21.mmStatusAndReason, Status16Choice.mmProprietary, StatusAndReason25.mmStatusAndReason,
						StatusTrail4.mmProcessingStatus, StatusTrail4.mmModificationProcessingStatus, StatusTrail4.mmCancellationStatus, StatusTrail4.mmSettled, ModificationProcessingStatus4Choice.mmProprietary,
						ModificationProcessingStatus6Choice.mmProprietary, StatusAndReason26.mmStatusAndReason, StatusTrail5.mmProcessingStatus, StatusTrail5.mmModificationProcessingStatus, StatusTrail5.mmCancellationStatus,
						StatusTrail5.mmSettled, ModificationProcessingStatus5Choice.mmProprietary, GenericValidationRuleIdentification1.mmIdentification, StatusAndReason27.mmStatusAndReason, CurrencyControlPackageStatus1.mmRecordStatus,
						ResponseStatus6Choice.mmRejected, ResponseStatus6Choice.mmPending, StatusOrStatement7Choice.mmStatusAdvice, StatusAndReason28.mmProcessingStatus, StatusTrail6.mmProcessingStatus,
						StatusTrail6.mmModificationProcessingStatus, StatusTrail6.mmCancellationStatus, StatusTrail6.mmSettled, ModificationProcessingStatus7Choice.mmProprietary, ProprietaryStatusAndReason6.mmProprietaryStatus,
						Status18Choice.mmProprietary, ProprietaryStatusAndReason7.mmProprietaryStatus, StatusAndReason30.mmStatusAndReason, ResponseStatus8Choice.mmRejected, ResponseStatus8Choice.mmPending,
						StatusAndReason29.mmProcessingStatus, StatusOrStatement8Choice.mmStatusAdvice, StatusTrail7.mmProcessingStatus, StatusTrail7.mmModificationProcessingStatus, StatusTrail7.mmCancellationStatus, StatusTrail7.mmSettled,
						ModificationProcessingStatus8Choice.mmProprietary, Status23Choice.mmProprietary, IntraBalanceQueryStatus2.mmType, StatusAndReason32.mmStatusAndReason, StatusAndReason33.mmStatusAndReason,
						StatusAndReason34.mmStatusAndReason, StatusAndReason35.mmStatusAndReason);
				subType_lazy = () -> Arrays.asList(AccountStatus.mmObject(), PaymentStatus.mmObject(), SystemStatus.mmObject(), LimitStatus.mmObject(), SecuritiesTradeStatus.mmObject(), CorporateActionStatus.mmObject(),
						SecuritiesStatus.mmObject(), UndertakingStatus.mmObject(), MandateStatus.mmObject(), TreasuryTradeSettlementStatus.mmObject(), CardPaymentStatus.mmObject(), SecuritiesOrderStatus.mmObject(),
						InvestigationCaseStatus.mmObject(), MeetingStatus.mmObject(), CollateralStatus.mmObject(), InvoiceFinancingStatus.mmObject(), BaselineStatus.mmObject(), QuoteStatus.mmObject(), InvoiceStatus.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Status.mmStatusReason, com.tools20022.repository.entity.Status.mmStatusDateTime, com.tools20022.repository.entity.Status.mmValidityTime,
						com.tools20022.repository.entity.Status.mmStatusDescription, com.tools20022.repository.entity.Status.mmInstructionProcessingStatus, com.tools20022.repository.entity.Status.mmPartyRole,
						com.tools20022.repository.entity.Status.mmSettlementStatus, com.tools20022.repository.entity.Status.mmCancellationProcessingStatus, com.tools20022.repository.entity.Status.mmTransactionProcessingStatus,
						com.tools20022.repository.entity.Status.mmModificationProcessingStatus);
				derivationComponent_lazy = () -> Arrays.asList(ProprietaryStatusAndReason1.mmObject(), ModificationProcessingStatus2Choice.mmObject(), StatusTrail2.mmObject(), ProprietaryStatusAndReason2.mmObject(),
						ModificationProcessingStatus3Choice.mmObject(), StatusTrail3.mmObject(), DeliveryReturn1Choice.mmObject(), DeliveryReturn2Choice.mmObject(), MatchingDenied1Choice.mmObject(), MatchingDenied2Choice.mmObject(),
						StatusAndReason3.mmObject(), StatusAndReason6.mmObject(), StatusAndReason12.mmObject(), StatusAndReason14.mmObject(), Status2Choice.mmObject(), StatusAndReason1.mmObject(), StatusAndReason2.mmObject(),
						Status4Choice.mmObject(), StatusAndReason4.mmObject(), StatusAndReason5.mmObject(), StatusAndReason7.mmObject(), StatusAndReason8.mmObject(), Status9Choice.mmObject(), StatusAndReason9.mmObject(),
						Status11Choice.mmObject(), StatusAndReason13.mmObject(), StatusAndReason16.mmObject(), StatusAndReason17.mmObject(), StatusAndReason10.mmObject(), ReplacementProcessingStatus7Choice.mmObject(),
						PointOfInteractionComponent3.mmObject(), ReportStatusAndReason1.mmObject(), ReportStatusAndReason2.mmObject(), RegistrationProcessingStatus1Choice.mmObject(), ResponseStatus1Choice.mmObject(),
						ReplacementProcessingStatus1Choice.mmObject(), SettlementStatus1Choice.mmObject(), SettlementConditionModificationStatus1Choice.mmObject(), Status1Choice.mmObject(), Status8Choice.mmObject(),
						ResponseStatus3Choice.mmObject(), ResponseStatus4Choice.mmObject(), RegistrationProcessingStatus2Choice.mmObject(), ResponseStatus2Choice.mmObject(), ReplacementProcessingStatus2Choice.mmObject(),
						SettlementStatus3Choice.mmObject(), SettlementConditionModificationStatus2Choice.mmObject(), Status3Choice.mmObject(), Status10Choice.mmObject(), ModificationProcessingStatus1Choice.mmObject(),
						IntraBalanceStatusAndReason1.mmObject(), ProcessingStatus33Choice.mmObject(), IntraBalanceStatusType1.mmObject(), IntraBalanceQueryStatus1.mmObject(), ProprietaryStatusAndReason3.mmObject(),
						ProcessingStatus30Choice.mmObject(), AccountLinkStatus1.mmObject(), StatusAndReason18.mmObject(), StatusAndReason19.mmObject(), StatusAndReason20.mmObject(), StatusAndReason21.mmObject(),
						PointOfInteractionComponent4.mmObject(), ReportItemStatus1Choice.mmObject(), StatusAndReason25.mmObject(), StatusTrail4.mmObject(), ModificationProcessingStatus4Choice.mmObject(),
						ModificationProcessingStatus6Choice.mmObject(), StatusAndReason26.mmObject(), StatusTrail5.mmObject(), ModificationProcessingStatus5Choice.mmObject(), PointOfInteractionComponent5.mmObject(),
						GenericValidationRuleIdentification1.mmObject(), StatusAndReason27.mmObject(), CurrencyControlGroupStatus1.mmObject(), CurrencyControlPackageStatus1.mmObject(), ValidationStatusReason1.mmObject(),
						CurrencyControlRecordStatus1.mmObject(), ResponseStatus6Choice.mmObject(), StatusAndReason28.mmObject(), StatusTrail6.mmObject(), ModificationProcessingStatus7Choice.mmObject(), ResponseStatus5Choice.mmObject(),
						ReplacementProcessingStatus8Choice.mmObject(), ProprietaryStatusAndReason6.mmObject(), RegistrationProcessingStatus3Choice.mmObject(), DeliveryReturn3Choice.mmObject(), Status19Choice.mmObject(),
						SettlementConditionModificationStatus3Choice.mmObject(), MatchingDenied3Choice.mmObject(), ProprietaryStatusAndReason7.mmObject(), StatusAndReason30.mmObject(), ResponseStatus8Choice.mmObject(),
						StatusAndReason29.mmObject(), StatusTrail7.mmObject(), MatchingDenied4Choice.mmObject(), Status22Choice.mmObject(), RegistrationProcessingStatus4Choice.mmObject(), ResponseStatus7Choice.mmObject(),
						SettlementConditionModificationStatus4Choice.mmObject(), ReplacementProcessingStatus9Choice.mmObject(), DeliveryReturn4Choice.mmObject(), ModificationProcessingStatus8Choice.mmObject(),
						PointOfInteractionComponent6.mmObject(), ProcessingStatus70Choice.mmObject(), ModificationProcessingStatus9Choice.mmObject(), IntraBalanceStatusAndReason2.mmObject(), SettlementStatus26Choice.mmObject(),
						IntraBalanceQueryStatus2.mmObject(), IntraBalanceStatusType2.mmObject(), ProcessingStatus68Choice.mmObject(), StatusAndReason32.mmObject(), StatusAndReason33.mmObject(), PointOfInteractionComponent7.mmObject(),
						StatusAndReason34.mmObject(), StatusAndReason35.mmObject(), PointOfInteractionComponent8.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Status.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<StatusReason> getStatusReason() {
		return statusReason == null ? statusReason = new ArrayList<>() : statusReason;
	}

	public Status setStatusReason(List<StatusReason> statusReason) {
		this.statusReason = Objects.requireNonNull(statusReason);
		return this;
	}

	public ISODateTime getStatusDateTime() {
		return statusDateTime;
	}

	public Status setStatusDateTime(ISODateTime statusDateTime) {
		this.statusDateTime = Objects.requireNonNull(statusDateTime);
		return this;
	}

	public DateTimePeriod getValidityTime() {
		return validityTime;
	}

	public Status setValidityTime(DateTimePeriod validityTime) {
		this.validityTime = Objects.requireNonNull(validityTime);
		return this;
	}

	public Max350Text getStatusDescription() {
		return statusDescription;
	}

	public Status setStatusDescription(Max350Text statusDescription) {
		this.statusDescription = Objects.requireNonNull(statusDescription);
		return this;
	}

	public StatusCode getInstructionProcessingStatus() {
		return instructionProcessingStatus;
	}

	public Status setInstructionProcessingStatus(StatusCode instructionProcessingStatus) {
		this.instructionProcessingStatus = Objects.requireNonNull(instructionProcessingStatus);
		return this;
	}

	public InvestigationPartyRole getPartyRole() {
		return partyRole;
	}

	public Status setPartyRole(InvestigationPartyRole partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public SecuritiesSettlementStatusCode getSettlementStatus() {
		return settlementStatus;
	}

	public Status setSettlementStatus(SecuritiesSettlementStatusCode settlementStatus) {
		this.settlementStatus = Objects.requireNonNull(settlementStatus);
		return this;
	}

	public CancellationProcessingStatusCode getCancellationProcessingStatus() {
		return cancellationProcessingStatus;
	}

	public Status setCancellationProcessingStatus(CancellationProcessingStatusCode cancellationProcessingStatus) {
		this.cancellationProcessingStatus = Objects.requireNonNull(cancellationProcessingStatus);
		return this;
	}

	public InstructionProcessingStatusCode getTransactionProcessingStatus() {
		return transactionProcessingStatus;
	}

	public Status setTransactionProcessingStatus(InstructionProcessingStatusCode transactionProcessingStatus) {
		this.transactionProcessingStatus = Objects.requireNonNull(transactionProcessingStatus);
		return this;
	}

	public ModificationProcessingStatusCode getModificationProcessingStatus() {
		return modificationProcessingStatus;
	}

	public Status setModificationProcessingStatus(ModificationProcessingStatusCode modificationProcessingStatus) {
		this.modificationProcessingStatus = Objects.requireNonNull(modificationProcessingStatus);
		return this;
	}
}