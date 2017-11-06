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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.LotteryTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The parameters required to manage the organisation of a lottery.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Lottery" src="doc-files/Lottery.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Lottery#mmLotteryDate
 * Lottery.mmLotteryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Lottery#mmIncrementalDenomination
 * Lottery.mmIncrementalDenomination}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Lottery#mmLotteryType
 * Lottery.mmLotteryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Lottery#mmRelatedCorporateEvent
 * Lottery.mmRelatedCorporateEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLottery
 * SecuritiesQuantity.mmLottery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmLottery
 * CorporateActionEvent.mmLottery}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.LotteryTypeFormat1Choice
 * LotteryTypeFormat1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LotteryTypeFormat2Choice
 * LotteryTypeFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LotteryType1FormatChoice
 * LotteryType1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LotteryTypeFormat3Choice
 * LotteryTypeFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LotteryTypeFormat4Choice
 * LotteryTypeFormat4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LotteryTypeFormat5Choice
 * LotteryTypeFormat5Choice}</li>
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
 * "Lottery"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The parameters required to manage the organisation of a lottery."</li>
 * </ul>
 */
public class Lottery {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime lotteryDate;
	/**
	 * Date on which the lottery is run and applied to the holder's positions.
	 * This is also applicable to partial calls.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Lottery
	 * Lottery}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmLotteryDate
	 * CorporateActionDate1.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmLotteryDate
	 * CorporateActionDate13.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmLotteryDate
	 * CorporateActionDate14.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmLotteryDate
	 * CorporateActionDate21.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmLotteryDate
	 * CorporateActionDate22.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmLotteryDate
	 * CorporateActionDate25.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmLotteryDate
	 * CorporateActionDate27.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmLotteryDate
	 * CorporateActionDate28.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmLotteryDate
	 * CorporateActionDate2.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD9#mmLotteryDate
	 * CorporateActionSD9.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD10#mmLotteryDate
	 * CorporateActionSD10.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate41#mmLotteryDate
	 * CorporateActionDate41.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate43#mmLotteryDate
	 * CorporateActionDate43.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate45#mmLotteryDate
	 * CorporateActionDate45.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmLotteryDate
	 * CorporateActionDate44.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate54#mmLotteryDate
	 * CorporateActionDate54.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmLotteryDate
	 * CorporateActionDate58.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD16#mmLotteryDate
	 * CorporateActionSD16.mmLotteryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLotteryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.mmLotteryDate, com.tools20022.repository.msg.CorporateActionDate13.mmLotteryDate,
					com.tools20022.repository.msg.CorporateActionDate14.mmLotteryDate, com.tools20022.repository.msg.CorporateActionDate21.mmLotteryDate, com.tools20022.repository.msg.CorporateActionDate22.mmLotteryDate,
					com.tools20022.repository.msg.CorporateActionDate25.mmLotteryDate, com.tools20022.repository.msg.CorporateActionDate27.mmLotteryDate, com.tools20022.repository.msg.CorporateActionDate28.mmLotteryDate,
					com.tools20022.repository.msg.CorporateActionDate2.mmLotteryDate, com.tools20022.repository.msg.CorporateActionSD9.mmLotteryDate, com.tools20022.repository.msg.CorporateActionSD10.mmLotteryDate,
					com.tools20022.repository.msg.CorporateActionDate41.mmLotteryDate, com.tools20022.repository.msg.CorporateActionDate43.mmLotteryDate, com.tools20022.repository.msg.CorporateActionDate45.mmLotteryDate,
					com.tools20022.repository.msg.CorporateActionDate44.mmLotteryDate, com.tools20022.repository.msg.CorporateActionDate54.mmLotteryDate, com.tools20022.repository.msg.CorporateActionDate58.mmLotteryDate,
					com.tools20022.repository.msg.CorporateActionSD16.mmLotteryDate);
			elementContext_lazy = () -> Lottery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotteryDate";
			definition = "Date on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected SecuritiesQuantity incrementalDenomination;
	/**
	 * Amount used when the called amount is not met by running the lottery with
	 * the base denomination.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLottery
	 * SecuritiesQuantity.mmLottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Lottery
	 * Lottery}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity1#mmIncrementalDenomination
	 * CorporateActionQuantity1.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity2#mmIncrementalDenomination
	 * CorporateActionQuantity2.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3#mmIncrementalDenomination
	 * CorporateActionQuantity3.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4#mmIncrementalDenomination
	 * CorporateActionQuantity4.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#mmIncrementalDenomination
	 * CorporateActionQuantity5.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#mmIncrementalDenomination
	 * CorporateActionQuantity6.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmIncrementalDenomination
	 * CorporateAction2.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7#mmIncrementalDenomination
	 * CorporateActionQuantity7.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity8#mmIncrementalDenomination
	 * CorporateActionQuantity8.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantitySD2#mmIncrementalDenomination
	 * CorporateActionQuantitySD2.mmIncrementalDenomination}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncrementalDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount used when the called amount is not met by running the lottery with the base denomination."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIncrementalDenomination = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionQuantity1.mmIncrementalDenomination, com.tools20022.repository.msg.CorporateActionQuantity2.mmIncrementalDenomination,
					com.tools20022.repository.msg.CorporateActionQuantity3.mmIncrementalDenomination, com.tools20022.repository.msg.CorporateActionQuantity4.mmIncrementalDenomination,
					com.tools20022.repository.msg.CorporateActionQuantity5.mmIncrementalDenomination, com.tools20022.repository.msg.CorporateActionQuantity6.mmIncrementalDenomination,
					com.tools20022.repository.msg.CorporateAction2.mmIncrementalDenomination, com.tools20022.repository.msg.CorporateActionQuantity7.mmIncrementalDenomination,
					com.tools20022.repository.msg.CorporateActionQuantity8.mmIncrementalDenomination, com.tools20022.repository.msg.CorporateActionQuantitySD2.mmIncrementalDenomination);
			elementContext_lazy = () -> Lottery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncrementalDenomination";
			definition = "Amount used when the called amount is not met by running the lottery with the base denomination.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmLottery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected LotteryTypeCode lotteryType;
	/**
	 * Specifies the type of lottery announced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LotteryTypeCode
	 * LotteryTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Lottery
	 * Lottery}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat1Choice#mmCode
	 * LotteryTypeFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat1Choice#mmProprietary
	 * LotteryTypeFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmLotteryType
	 * CorporateAction3.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat2Choice#mmCode
	 * LotteryTypeFormat2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat2Choice#mmProprietary
	 * LotteryTypeFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmLotteryType
	 * CorporateAction4.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmLotteryType
	 * CorporateAction5.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmLotteryType
	 * CorporateAction6.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmLotteryType
	 * CorporateAction7.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmLotteryType
	 * CorporateAction8.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmLotteryType
	 * CorporateAction10.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmLotteryType
	 * CorporateAction11.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryType1FormatChoice#mmCode
	 * LotteryType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryType1FormatChoice#mmProprietary
	 * LotteryType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmLotteryType
	 * CorporateAction2.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction13#mmLotteryType
	 * CorporateAction13.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmLotteryType
	 * CorporateAction12.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction14#mmLotteryType
	 * CorporateAction14.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction20#mmLotteryType
	 * CorporateAction20.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction18#mmLotteryType
	 * CorporateAction18.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmLotteryType
	 * CorporateAction17.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat3Choice#mmCode
	 * LotteryTypeFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat3Choice#mmProprietary
	 * LotteryTypeFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction24#mmLotteryType
	 * CorporateAction24.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction30#mmLotteryType
	 * CorporateAction30.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction28#mmLotteryType
	 * CorporateAction28.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction29#mmLotteryType
	 * CorporateAction29.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction33#mmLotteryType
	 * CorporateAction33.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction32#mmLotteryType
	 * CorporateAction32.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmLotteryType
	 * CorporateAction31.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat4Choice#mmCode
	 * LotteryTypeFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat4Choice#mmProprietary
	 * LotteryTypeFormat4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction34#mmLotteryType
	 * CorporateAction34.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction35#mmLotteryType
	 * CorporateAction35.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction36#mmLotteryType
	 * CorporateAction36.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction38#mmLotteryType
	 * CorporateAction38.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmLotteryType
	 * CorporateAction40.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat5Choice#mmCode
	 * LotteryTypeFormat5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat5Choice#mmProprietary
	 * LotteryTypeFormat5Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of lottery announced."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLotteryType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.LotteryTypeFormat1Choice.mmCode, com.tools20022.repository.choice.LotteryTypeFormat1Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateAction3.mmLotteryType, com.tools20022.repository.choice.LotteryTypeFormat2Choice.mmCode, com.tools20022.repository.choice.LotteryTypeFormat2Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateAction4.mmLotteryType, com.tools20022.repository.msg.CorporateAction5.mmLotteryType, com.tools20022.repository.msg.CorporateAction6.mmLotteryType,
					com.tools20022.repository.msg.CorporateAction7.mmLotteryType, com.tools20022.repository.msg.CorporateAction8.mmLotteryType, com.tools20022.repository.msg.CorporateAction10.mmLotteryType,
					com.tools20022.repository.msg.CorporateAction11.mmLotteryType, com.tools20022.repository.choice.LotteryType1FormatChoice.mmCode, com.tools20022.repository.choice.LotteryType1FormatChoice.mmProprietary,
					com.tools20022.repository.msg.CorporateAction2.mmLotteryType, com.tools20022.repository.msg.CorporateAction13.mmLotteryType, com.tools20022.repository.msg.CorporateAction12.mmLotteryType,
					com.tools20022.repository.msg.CorporateAction14.mmLotteryType, com.tools20022.repository.msg.CorporateAction20.mmLotteryType, com.tools20022.repository.msg.CorporateAction18.mmLotteryType,
					com.tools20022.repository.msg.CorporateAction17.mmLotteryType, com.tools20022.repository.choice.LotteryTypeFormat3Choice.mmCode, com.tools20022.repository.choice.LotteryTypeFormat3Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateAction24.mmLotteryType, com.tools20022.repository.msg.CorporateAction30.mmLotteryType, com.tools20022.repository.msg.CorporateAction28.mmLotteryType,
					com.tools20022.repository.msg.CorporateAction29.mmLotteryType, com.tools20022.repository.msg.CorporateAction33.mmLotteryType, com.tools20022.repository.msg.CorporateAction32.mmLotteryType,
					com.tools20022.repository.msg.CorporateAction31.mmLotteryType, com.tools20022.repository.choice.LotteryTypeFormat4Choice.mmCode, com.tools20022.repository.choice.LotteryTypeFormat4Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateAction34.mmLotteryType, com.tools20022.repository.msg.CorporateAction35.mmLotteryType, com.tools20022.repository.msg.CorporateAction36.mmLotteryType,
					com.tools20022.repository.msg.CorporateAction38.mmLotteryType, com.tools20022.repository.msg.CorporateAction40.mmLotteryType, com.tools20022.repository.choice.LotteryTypeFormat5Choice.mmCode,
					com.tools20022.repository.choice.LotteryTypeFormat5Choice.mmProprietary);
			elementContext_lazy = () -> Lottery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotteryType";
			definition = "Specifies the type of lottery announced.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LotteryTypeCode.mmObject();
		}
	};
	protected CorporateActionEvent relatedCorporateEvent;
	/**
	 * Corporate event for which lottery information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmLottery
	 * CorporateActionEvent.mmLottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Lottery
	 * Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which lottery information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCorporateEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Lottery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateEvent";
			definition = "Corporate event for which lottery information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmLottery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Lottery";
				definition = "The parameters required to manage the organisation of a lottery.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.mmLottery, com.tools20022.repository.entity.CorporateActionEvent.mmLottery);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Lottery.mmLotteryDate, com.tools20022.repository.entity.Lottery.mmIncrementalDenomination, com.tools20022.repository.entity.Lottery.mmLotteryType,
						com.tools20022.repository.entity.Lottery.mmRelatedCorporateEvent);
				derivationComponent_lazy = () -> Arrays.asList(LotteryTypeFormat1Choice.mmObject(), LotteryTypeFormat2Choice.mmObject(), LotteryType1FormatChoice.mmObject(), LotteryTypeFormat3Choice.mmObject(),
						LotteryTypeFormat4Choice.mmObject(), LotteryTypeFormat5Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getLotteryDate() {
		return lotteryDate;
	}

	public void setLotteryDate(ISODateTime lotteryDate) {
		this.lotteryDate = lotteryDate;
	}

	public SecuritiesQuantity getIncrementalDenomination() {
		return incrementalDenomination;
	}

	public void setIncrementalDenomination(com.tools20022.repository.entity.SecuritiesQuantity incrementalDenomination) {
		this.incrementalDenomination = incrementalDenomination;
	}

	public LotteryTypeCode getLotteryType() {
		return lotteryType;
	}

	public void setLotteryType(LotteryTypeCode lotteryType) {
		this.lotteryType = lotteryType;
	}

	public CorporateActionEvent getRelatedCorporateEvent() {
		return relatedCorporateEvent;
	}

	public void setRelatedCorporateEvent(com.tools20022.repository.entity.CorporateActionEvent relatedCorporateEvent) {
		this.relatedCorporateEvent = relatedCorporateEvent;
	}
}