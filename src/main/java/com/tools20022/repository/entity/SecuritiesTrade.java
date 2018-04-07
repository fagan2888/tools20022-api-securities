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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies trades linked to securities operations such as the exchange of
 * securities, the lending of securities and the transactions related to
 * investment funds.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTrade" src="doc-files/SecuritiesTrade.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeRelatedIdentifications
 * SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeAmount
 * SecuritiesTrade.mmTradeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmOpeningClosingIndicator
 * SecuritiesTrade.mmOpeningClosingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeTransactionCondition
 * SecuritiesTrade.mmTradeTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeStatus
 * SecuritiesTrade.mmSecuritiesTradeStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmActivity
 * SecuritiesTrade.mmActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeQuantity
 * SecuritiesTrade.mmTradeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeOriginationDate
 * SecuritiesTrade.mmTradeOriginationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmClearingFeeType
 * SecuritiesTrade.mmClearingFeeType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecurity
 * SecuritiesTrade.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradePrice
 * SecuritiesTrade.mmTradePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmPartyRole
 * SecuritiesTrade.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesFinancingClosingData
 * SecuritiesTrade.mmSecuritiesFinancingClosingData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradingExecution
 * SecuritiesTrade.mmTradingExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeAllocation
 * SecuritiesTrade.mmTradeAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmRelatedOrder
 * SecuritiesTrade.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesFinancingOpeningData
 * SecuritiesTrade.mmSecuritiesFinancingOpeningData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTransactionType
 * SecuritiesTrade.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmLegalFramework
 * SecuritiesTrade.mmLegalFramework}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTransactionType
 * SecuritiesTrade.mmSecuritiesTransactionType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSecuritiesTrade
 * Security.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecuritiesTrade
 * SecuritiesPricing.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmIdentifiedTrade
 * SecuritiesTradeIdentification.mmIdentifiedTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmTrade
 * SecuritiesQuantity.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmRelatedTrade
 * SecuritiesTradeExecution.mmRelatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmSecuritiesTrade
 * SecuritiesTradeStatus.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmClosingLegExecution
 * SecuritiesFinancing.mmClosingLegExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmOpeningLegExecution
 * SecuritiesFinancing.mmOpeningLegExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExecution
 * SecuritiesOrder.mmOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole#mmSecuritiesTrade
 * SecuritiesTradePartyRole.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmSecuritiesTrade
 * Allocation.mmSecuritiesTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeRegistrationOrigin
 * TradeLeg8.mmTradeRegistrationOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLegStatement3#mmTradeLegsDetails
 * TradeLegStatement3.mmTradeLegsDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetPosition3#mmTradeLegDetails
 * NetPosition3.mmTradeLegDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmTradeRegistrationOrigin
 * TradeLeg10.mmTradeRegistrationOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradeRegistrationOrigin
 * TradeLeg9.mmTradeRegistrationOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmOtherAmounts
 * SecuritiesTradeDetails71.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction60#mmTransactionDetails
 * Transaction60.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmOtherAmounts
 * SecuritiesTradeDetails72.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction61#mmTransactionDetails
 * Transaction61.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction62#mmTransactionDetails
 * Transaction62.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails106#mmTransactionDetails
 * TransactionDetails106.mmTransactionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
 * InvestmentFundTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesFinancing
 * SecuritiesFinancing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransaction
 * SecuritiesTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOptionTrade
 * SecuritiesOptionTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.TradeType3Choice
 * TradeType3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition4Choice
 * TradeTransactionCondition4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16 OtherAmounts16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TwoLegTransactionType1Choice
 * TwoLegTransactionType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8 TradeLeg8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLegStatement3
 * TradeLegStatement3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10 TradeLeg10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9 TradeLeg9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails81
 * TransactionDetails81}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails74
 * TransactionDetails74}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails82
 * TransactionDetails82}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails80
 * TransactionDetails80}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters24
 * AdditionalParameters24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters21
 * AdditionalParameters21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts32 OtherAmounts32}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LegalFramework3Choice
 * LegalFramework3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransactionActivity3Choice
 * TransactionActivity3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition5Choice
 * TradeTransactionCondition5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts29 OtherAmounts29}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnilateralSplit3Choice
 * UnilateralSplit3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeCommodity2
 * DerivativeCommodity2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters29
 * AdditionalParameters29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalParameters30
 * AdditionalParameters30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts41 OtherAmounts41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71
 * SecuritiesTradeDetails71}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts39 OtherAmounts39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails105
 * TransactionDetails105}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts40 OtherAmounts40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction60 Transaction60}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72
 * SecuritiesTradeDetails72}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails104
 * TransactionDetails104}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction61 Transaction61}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails103
 * TransactionDetails103}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction62 Transaction62}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73
 * SecuritiesTradeDetails73}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75
 * SecuritiesTradeDetails75}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76
 * SecuritiesTradeDetails76}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails106
 * TransactionDetails106}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails107
 * TransactionDetails107}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78
 * SecuritiesTradeDetails78}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79
 * SecuritiesTradeDetails79}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails80
 * SecuritiesTradeDetails80}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=BusinessComment, BusinessComment=Street Side
 * confirmation</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTrade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies trades linked to securities operations such as the exchange of securities, the lending of securities and the transactions related to investment funds."
 * </li>
 * </ul>
 */
public class SecuritiesTrade extends Trade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<SecuritiesTradeIdentification> securitiesTradeRelatedIdentifications;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmIdentifiedTrade
	 * SecuritiesTradeIdentification.mmIdentifiedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#mmReference
	 * RequestDetails15.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails15#mmIdentification
	 * IntraPositionMovementDetails15.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeRelatedIdentifications"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different identifications associated with a securities trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTrade, List<SecuritiesTradeIdentification>> mmSecuritiesTradeRelatedIdentifications = new MMBusinessAssociationEnd<SecuritiesTrade, List<SecuritiesTradeIdentification>>() {
		{
			derivation_lazy = () -> Arrays.asList(RequestDetails15.mmReference, IntraPositionMovementDetails15.mmIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeRelatedIdentifications";
			definition = "Specifies the different identifications associated with a securities trade.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesTradeIdentification.mmIdentifiedTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTradeIdentification.mmObject();
		}

		@Override
		public List<SecuritiesTradeIdentification> getValue(SecuritiesTrade obj) {
			return obj.getSecuritiesTradeRelatedIdentifications();
		}

		@Override
		public void setValue(SecuritiesTrade obj, List<SecuritiesTradeIdentification> value) {
			obj.setSecuritiesTradeRelatedIdentifications(value);
		}
	};
	protected CurrencyAndAmount tradeAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmGrossTradeAmount
	 * TwoLegTransactionDetails1.mmGrossTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmNetAmount
	 * SecuritiesTransaction1.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts32#mmTradeAmount
	 * OtherAmounts32.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation18#mmNetAmount
	 * ReceiveInformation18.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmNetAmount
	 * DeliverInformation19.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation19#mmNetAmount
	 * ReceiveInformation19.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation18#mmNetAmount
	 * DeliverInformation18.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts41#mmTradeAmount
	 * OtherAmounts41.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts39#mmTradeAmount
	 * OtherAmounts39.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts40#mmTradeAmount
	 * OtherAmounts40.mmTradeAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::DEAL, FIXSynonym: 381</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of the trade. Is equal to the executed trade quantity multiplied by the executed trade price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTrade, CurrencyAndAmount> mmTradeAmount = new MMBusinessAttribute<SecuritiesTrade, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(TwoLegTransactionDetails1.mmGrossTradeAmount, SecuritiesTransaction1.mmNetAmount, OtherAmounts32.mmTradeAmount, ReceiveInformation18.mmNetAmount, DeliverInformation19.mmNetAmount,
					ReceiveInformation19.mmNetAmount, DeliverInformation18.mmNetAmount, OtherAmounts41.mmTradeAmount, OtherAmounts39.mmTradeAmount, OtherAmounts40.mmTradeAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::DEAL"), new FIXSynonym(this, "381"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeAmount";
			definition = "Total amount of the trade. Is equal to the executed trade quantity multiplied by the executed trade price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(SecuritiesTrade obj) {
			return obj.getTradeAmount();
		}

		@Override
		public void setValue(SecuritiesTrade obj, CurrencyAndAmount value) {
			obj.setTradeAmount(value);
		}
	};
	protected OpeningClosingCode openingClosingIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OpeningClosingCode
	 * OpeningClosingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73#mmOpeningClosing
	 * SecuritiesTradeDetails73.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75#mmOpeningClosing
	 * SecuritiesTradeDetails75.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76#mmOpeningClosing
	 * SecuritiesTradeDetails76.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78#mmOpeningClosing
	 * SecuritiesTradeDetails78.mmOpeningClosing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79#mmOpeningClosing
	 * SecuritiesTradeDetails79.mmOpeningClosing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::PROC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningClosingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information relative to the processing of the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTrade, OpeningClosingCode> mmOpeningClosingIndicator = new MMBusinessAttribute<SecuritiesTrade, OpeningClosingCode>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTradeDetails73.mmOpeningClosing, SecuritiesTradeDetails75.mmOpeningClosing, SecuritiesTradeDetails76.mmOpeningClosing, SecuritiesTradeDetails78.mmOpeningClosing,
					SecuritiesTradeDetails79.mmOpeningClosing);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::PROC"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningClosingIndicator";
			definition = "Specifies additional information relative to the processing of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OpeningClosingCode.mmObject();
		}

		@Override
		public OpeningClosingCode getValue(SecuritiesTrade obj) {
			return obj.getOpeningClosingIndicator();
		}

		@Override
		public void setValue(SecuritiesTrade obj, OpeningClosingCode value) {
			obj.setOpeningClosingIndicator(value);
		}
	};
	protected TradeTransactionConditionCode tradeTransactionCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition4Choice#mmCode
	 * TradeTransactionCondition4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition4Choice#mmProprietary
	 * TradeTransactionCondition4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmTransactionConditions
	 * FinancialInstrumentStipulations2.mmTransactionConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmTradeTransactionCondition
	 * Order17.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmTradeTransactionCondition
	 * Order18.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition5Choice#mmCode
	 * TradeTransactionCondition5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition5Choice#mmProprietary
	 * TradeTransactionCondition5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmTradeTransactionCondition
	 * FundSettlementParameters11.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12#mmTradeTransactionCondition
	 * FundSettlementParameters12.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmTradeTransactionCondition
	 * SecuritiesTradeDetails71.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73#mmTradeTransactionCondition
	 * SecuritiesTradeDetails73.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails74#mmTradeTransactionCondition
	 * SecuritiesTradeDetails74.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75#mmTradeTransactionCondition
	 * SecuritiesTradeDetails75.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76#mmTradeTransactionCondition
	 * SecuritiesTradeDetails76.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails77#mmTradeTransactionCondition
	 * SecuritiesTradeDetails77.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78#mmTradeTransactionCondition
	 * SecuritiesTradeDetails78.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79#mmTradeTransactionCondition
	 * SecuritiesTradeDetails79.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails80#mmTradeTransactionCondition
	 * SecuritiesTradeDetails80.mmTradeTransactionCondition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::TTCO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the conditions under which the order/trade is to be/was executed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTrade, TradeTransactionConditionCode> mmTradeTransactionCondition = new MMBusinessAttribute<SecuritiesTrade, TradeTransactionConditionCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeTransactionCondition4Choice.mmCode, TradeTransactionCondition4Choice.mmProprietary, FinancialInstrumentStipulations2.mmTransactionConditions, Order17.mmTradeTransactionCondition,
					Order18.mmTradeTransactionCondition, TradeTransactionCondition5Choice.mmCode, TradeTransactionCondition5Choice.mmProprietary, FundSettlementParameters11.mmTradeTransactionCondition,
					FundSettlementParameters12.mmTradeTransactionCondition, SecuritiesTradeDetails71.mmTradeTransactionCondition, SecuritiesTradeDetails73.mmTradeTransactionCondition, SecuritiesTradeDetails74.mmTradeTransactionCondition,
					SecuritiesTradeDetails75.mmTradeTransactionCondition, SecuritiesTradeDetails76.mmTradeTransactionCondition, SecuritiesTradeDetails77.mmTradeTransactionCondition, SecuritiesTradeDetails78.mmTradeTransactionCondition,
					SecuritiesTradeDetails79.mmTradeTransactionCondition, SecuritiesTradeDetails80.mmTradeTransactionCondition);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::TTCO"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeTransactionCondition";
			definition = "Indicates the conditions under which the order/trade is to be/was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeTransactionConditionCode.mmObject();
		}

		@Override
		public TradeTransactionConditionCode getValue(SecuritiesTrade obj) {
			return obj.getTradeTransactionCondition();
		}

		@Override
		public void setValue(SecuritiesTrade obj, TradeTransactionConditionCode value) {
			obj.setTradeTransactionCondition(value);
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesTradeStatus> securitiesTradeStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmSecuritiesTrade
	 * SecuritiesTradeStatus.mmSecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#mmMatchingDenial
	 * RequestDetails15.mmMatchingDenial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction60#mmStatusAndReason
	 * Transaction60.mmStatusAndReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTrade, List<SecuritiesTradeStatus>> mmSecuritiesTradeStatus = new MMBusinessAssociationEnd<SecuritiesTrade, List<SecuritiesTradeStatus>>() {
		{
			derivation_lazy = () -> Arrays.asList(RequestDetails15.mmMatchingDenial, Transaction60.mmStatusAndReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeStatus";
			definition = "Specifies the status of a trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
		}

		@Override
		public List<SecuritiesTradeStatus> getValue(SecuritiesTrade obj) {
			return obj.getSecuritiesTradeStatus();
		}

		@Override
		public void setValue(SecuritiesTrade obj, List<SecuritiesTradeStatus> value) {
			obj.setSecuritiesTradeStatus(value);
		}
	};
	protected TransactionActivityCode activity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionActivityCode
	 * TransactionActivityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity3Choice#mmCode
	 * TransactionActivity3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionActivity3Choice#mmProprietary
	 * TransactionActivity3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmTransactionActivity
	 * TransactionDetails104.mmTransactionActivity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmTransactionActivity
	 * TransactionDetails103.mmTransactionActivity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Activity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of activity to which the trade relates."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTrade, TransactionActivityCode> mmActivity = new MMBusinessAttribute<SecuritiesTrade, TransactionActivityCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionActivity3Choice.mmCode, TransactionActivity3Choice.mmProprietary, TransactionDetails104.mmTransactionActivity, TransactionDetails103.mmTransactionActivity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Activity";
			definition = "Specifies the type of activity to which the trade relates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionActivityCode.mmObject();
		}

		@Override
		public TransactionActivityCode getValue(SecuritiesTrade obj) {
			return obj.getActivity();
		}

		@Override
		public void setValue(SecuritiesTrade obj, TransactionActivityCode value) {
			obj.setActivity(value);
		}
	};
	protected List<SecuritiesQuantity> tradeQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmTrade
	 * SecuritiesQuantity.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeQuantity
	 * TradeLeg8.mmTradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#mmTradeQuantity
	 * TradeLeg10.mmTradeQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradeQuantity
	 * TradeLeg9.mmTradeQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total quantity of a financial instrument involved in a trade. It is derived from the ordered quantity or from the quantity specified in a leg of a financing agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTrade, List<SecuritiesQuantity>> mmTradeQuantity = new MMBusinessAssociationEnd<SecuritiesTrade, List<SecuritiesQuantity>>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeLeg8.mmTradeQuantity, TradeLeg10.mmTradeQuantity, TradeLeg9.mmTradeQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeQuantity";
			definition = "Specifies the total quantity of a financial instrument involved in a trade. It is derived from the ordered quantity or from the quantity specified in a leg of a financing agreement.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesQuantity.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public List<SecuritiesQuantity> getValue(SecuritiesTrade obj) {
			return obj.getTradeQuantity();
		}

		@Override
		public void setValue(SecuritiesTrade obj, List<SecuritiesQuantity> value) {
			obj.setTradeQuantity(value);
		}
	};
	protected ISODateTime tradeOriginationDate;
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
	 * {@linkplain com.tools20022.repository.msg.Order17#mmTradeOriginationDate
	 * Order17.mmTradeOriginationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmTradeOriginationDate
	 * Order18.mmTradeOriginationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 229</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeOriginationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the date and time of the agreement in principal between counter-parties prior to actual trade date.\nUsed with fixed income for municipal new issue markets."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTrade, ISODateTime> mmTradeOriginationDate = new MMBusinessAttribute<SecuritiesTrade, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(Order17.mmTradeOriginationDate, Order18.mmTradeOriginationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "229"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeOriginationDate";
			definition = "Indicates the date and time of the agreement in principal between counter-parties prior to actual trade date.\nUsed with fixed income for municipal new issue markets.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(SecuritiesTrade obj) {
			return obj.getTradeOriginationDate();
		}

		@Override
		public void setValue(SecuritiesTrade obj, ISODateTime value) {
			obj.setTradeOriginationDate(value);
		}
	};
	protected ClearingFeeTypeCode clearingFeeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode
	 * ClearingFeeTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 635</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingFeeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of fee for trade executions at an exchange."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTrade, ClearingFeeTypeCode> mmClearingFeeType = new MMBusinessAttribute<SecuritiesTrade, ClearingFeeTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "635"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingFeeType";
			definition = "Indicates the type of fee for trade executions at an exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ClearingFeeTypeCode.mmObject();
		}

		@Override
		public ClearingFeeTypeCode getValue(SecuritiesTrade obj) {
			return obj.getClearingFeeType();
		}

		@Override
		public void setValue(SecuritiesTrade obj, ClearingFeeTypeCode value) {
			obj.setClearingFeeType(value);
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesTrade
	 * Security.mmSecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails71.mmFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails72.mmFinancialInstrumentAttributes}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security involved in a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTrade, List<Security>> mmSecurity = new MMBusinessAssociationEnd<SecuritiesTrade, List<Security>>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTradeDetails71.mmFinancialInstrumentAttributes, SecuritiesTradeDetails72.mmFinancialInstrumentAttributes);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security involved in a trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}

		@Override
		public List<Security> getValue(SecuritiesTrade obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(SecuritiesTrade obj, List<Security> value) {
			obj.setSecurity(value);
		}
	};
	protected List<SecuritiesPricing> tradePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecuritiesTrade
	 * SecuritiesPricing.mmSecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmAverageDealPrice
	 * NetPosition3.mmAverageDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmPrice
	 * SecuritiesTransaction1.mmPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the executed trade price which is derived from the different deal prices."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTrade, List<SecuritiesPricing>> mmTradePrice = new MMBusinessAssociationEnd<SecuritiesTrade, List<SecuritiesPricing>>() {
		{
			derivation_lazy = () -> Arrays.asList(NetPosition3.mmAverageDealPrice, SecuritiesTransaction1.mmPrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradePrice";
			definition = "Specifies the executed trade price which is derived from the different deal prices.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesPricing.mmSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public List<SecuritiesPricing> getValue(SecuritiesTrade obj) {
			return obj.getTradePrice();
		}

		@Override
		public void setValue(SecuritiesTrade obj, List<SecuritiesPricing> value) {
			obj.setTradePrice(value);
		}
	};
	protected List<SecuritiesTradePartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole#mmSecuritiesTrade
	 * SecuritiesTradePartyRole.mmSecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole
	 * SecuritiesTradePartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmOtherBusinessParties
	 * SecuritiesTradeDetails71.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmOtherBusinessParties
	 * SecuritiesTradeDetails72.mmOtherBusinessParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a securities trade and played by a party at that step in a securities transaction flow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTrade, List<SecuritiesTradePartyRole>> mmPartyRole = new MMBusinessAssociationEnd<SecuritiesTrade, List<SecuritiesTradePartyRole>>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTradeDetails71.mmOtherBusinessParties, SecuritiesTradeDetails72.mmOtherBusinessParties);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a securities trade and played by a party at that step in a securities transaction flow.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesTradePartyRole.mmSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTradePartyRole.mmObject();
		}

		@Override
		public List<SecuritiesTradePartyRole> getValue(SecuritiesTrade obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(SecuritiesTrade obj, List<SecuritiesTradePartyRole> value) {
			obj.setPartyRole(value);
		}
	};
	protected SecuritiesFinancing securitiesFinancingClosingData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmClosingLegExecution
	 * SecuritiesFinancing.mmClosingLegExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmSecuritiesFinancingDetails
	 * SecuritiesTradeDetails71.mmSecuritiesFinancingDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingClosingData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financing process for which a closing leg is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTrade, Optional<SecuritiesFinancing>> mmSecuritiesFinancingClosingData = new MMBusinessAssociationEnd<SecuritiesTrade, Optional<SecuritiesFinancing>>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTradeDetails71.mmSecuritiesFinancingDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancingClosingData";
			definition = "Financing process for which a closing leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesFinancing.mmClosingLegExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesFinancing.mmObject();
		}

		@Override
		public Optional<SecuritiesFinancing> getValue(SecuritiesTrade obj) {
			return obj.getSecuritiesFinancingClosingData();
		}

		@Override
		public void setValue(SecuritiesTrade obj, Optional<SecuritiesFinancing> value) {
			obj.setSecuritiesFinancingClosingData(value.orElse(null));
		}
	};
	protected List<SecuritiesTradeExecution> tradingExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmRelatedTrade
	 * SecuritiesTradeExecution.mmRelatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The realisation of the trade over one or more transactions."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTrade, List<SecuritiesTradeExecution>> mmTradingExecution = new MMBusinessAssociationEnd<SecuritiesTrade, List<SecuritiesTradeExecution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingExecution";
			definition = "The realisation of the trade over one or more transactions.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesTradeExecution.mmRelatedTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTradeExecution.mmObject();
		}

		@Override
		public List<SecuritiesTradeExecution> getValue(SecuritiesTrade obj) {
			return obj.getTradingExecution();
		}

		@Override
		public void setValue(SecuritiesTrade obj, List<SecuritiesTradeExecution> value) {
			obj.setTradingExecution(value);
		}
	};
	protected List<Allocation> tradeAllocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmSecuritiesTrade
	 * Allocation.mmSecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Allocation
	 * Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the allocation of the trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTrade, List<Allocation>> mmTradeAllocation = new MMBusinessAssociationEnd<SecuritiesTrade, List<Allocation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeAllocation";
			definition = "Information about the allocation of the trade.";
			minOccurs = 0;
			opposite_lazy = () -> Allocation.mmSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Allocation.mmObject();
		}

		@Override
		public List<Allocation> getValue(SecuritiesTrade obj) {
			return obj.getTradeAllocation();
		}

		@Override
		public void setValue(SecuritiesTrade obj, List<Allocation> value) {
			obj.setTradeAllocation(value);
		}
	};
	protected SecuritiesOrder relatedOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExecution
	 * SecuritiesOrder.mmOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmOrderTransmission
	 * SecuritiesTransactionReport4.mmOrderTransmission}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order which is executed by a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTrade, Optional<SecuritiesOrder>> mmRelatedOrder = new MMBusinessAssociationEnd<SecuritiesTrade, Optional<SecuritiesOrder>>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTransactionReport4.mmOrderTransmission);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order which is executed by a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesOrder.mmOrderExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}

		@Override
		public Optional<SecuritiesOrder> getValue(SecuritiesTrade obj) {
			return obj.getRelatedOrder();
		}

		@Override
		public void setValue(SecuritiesTrade obj, Optional<SecuritiesOrder> value) {
			obj.setRelatedOrder(value.orElse(null));
		}
	};
	protected SecuritiesFinancing securitiesFinancingOpeningData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmOpeningLegExecution
	 * SecuritiesFinancing.mmOpeningLegExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingOpeningData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financing process for which an opening leg is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTrade, Optional<SecuritiesFinancing>> mmSecuritiesFinancingOpeningData = new MMBusinessAssociationEnd<SecuritiesTrade, Optional<SecuritiesFinancing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancingOpeningData";
			definition = "Financing process for which an opening leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesFinancing.mmOpeningLegExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesFinancing.mmObject();
		}

		@Override
		public Optional<SecuritiesFinancing> getValue(SecuritiesTrade obj) {
			return obj.getSecuritiesFinancingOpeningData();
		}

		@Override
		public void setValue(SecuritiesTrade obj, Optional<SecuritiesFinancing> value) {
			obj.setSecuritiesFinancingOpeningData(value.orElse(null));
		}
	};
	protected TradeTypeCode transactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.TradeType3Choice#mmCode
	 * TradeType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeType3Choice#mmProprietary
	 * TradeType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmTradeTransactionType
	 * Order17.mmTradeTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmTradeTransactionType
	 * Order18.mmTradeTransactionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeType
	 * TradeLeg8.mmTradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#mmTradeType
	 * TradeLeg10.mmTradeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradeType
	 * TradeLeg9.mmTradeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmDerivativeNotionalChange
	 * SecuritiesTransaction1.mmDerivativeNotionalChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeCommodity2#mmTransactionType
	 * DerivativeCommodity2.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmTransactionType
	 * SecuredMarketTransaction4.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmTransactionType
	 * OvernightIndexSwapTransaction4.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmTransactionType
	 * UnsecuredMarketTransaction4.mmTransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRTR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of transaction of which the order is a component."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTrade, TradeTypeCode> mmTransactionType = new MMBusinessAttribute<SecuritiesTrade, TradeTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeType3Choice.mmCode, TradeType3Choice.mmProprietary, Order17.mmTradeTransactionType, Order18.mmTradeTransactionType, TradeLeg8.mmTradeType, TradeLeg10.mmTradeType,
					TradeLeg9.mmTradeType, SecuritiesTransaction1.mmDerivativeNotionalChange, DerivativeCommodity2.mmTransactionType, SecuredMarketTransaction4.mmTransactionType, OvernightIndexSwapTransaction4.mmTransactionType,
					UnsecuredMarketTransaction4.mmTransactionType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRTR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionType";
			definition = "Indicates the type of transaction of which the order is a component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeTypeCode.mmObject();
		}

		@Override
		public TradeTypeCode getValue(SecuritiesTrade obj) {
			return obj.getTransactionType();
		}

		@Override
		public void setValue(SecuritiesTrade obj, TradeTypeCode value) {
			obj.setTransactionType(value);
		}
	};
	protected LegalFrameworkCode legalFramework;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LegalFrameworkCode
	 * LegalFrameworkCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmLegalFramework
	 * SecuritiesFinancing10.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails27.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegalFramework3Choice#mmCode
	 * LegalFramework3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LegalFramework3Choice#mmProprietary
	 * LegalFramework3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails37#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails37.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails38.mmLegalFramework}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalFramework"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal framework of the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTrade, LegalFrameworkCode> mmLegalFramework = new MMBusinessAttribute<SecuritiesTrade, LegalFrameworkCode>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesFinancing10.mmLegalFramework, SecuritiesFinancingTransactionDetails27.mmLegalFramework, LegalFramework3Choice.mmCode, LegalFramework3Choice.mmProprietary,
					SecuritiesFinancingTransactionDetails37.mmLegalFramework, SecuritiesFinancingTransactionDetails38.mmLegalFramework);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegalFramework";
			definition = "Legal framework of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LegalFrameworkCode.mmObject();
		}

		@Override
		public LegalFrameworkCode getValue(SecuritiesTrade obj) {
			return obj.getLegalFramework();
		}

		@Override
		public void setValue(SecuritiesTrade obj, LegalFrameworkCode value) {
			obj.setLegalFramework(value);
		}
	};
	protected SecuritiesTransactionTypeV2Code securitiesTransactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmSettlementTransactionType
	 * SettlementDetails43.mmSettlementTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit3Choice#mmCode
	 * UnilateralSplit3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit3Choice#mmProprietary
	 * UnilateralSplit3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters15#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters15.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters17.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#mmSecuritiesFinancingTransactionType
	 * TransactionTypeAndAdditionalParameters16.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails35.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmTransactionType
	 * ForeignExchangeSwapTransaction3.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmSecuritiesTransactionType
	 * SettlementDetails142.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmSecuritiesTransactionType
	 * SettlementDetails144.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141#mmSecuritiesTransactionType
	 * SettlementDetails141.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmSecuritiesTransactionType
	 * SettlementDetails145.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent22Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent22Choice.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType36Choice#mmCode
	 * SecuritiesTransactionType36Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType36Choice#mmProprietary
	 * SecuritiesTransactionType36Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmSecuritiesTransactionType
	 * SettlementDetails146.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType37Choice#mmCode
	 * SecuritiesTransactionType37Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType37Choice#mmProprietary
	 * SecuritiesTransactionType37Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmSecuritiesTransactionType
	 * SettlementDetails143.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType38Choice#mmCode
	 * SecuritiesTransactionType38Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType38Choice#mmProprietary
	 * SecuritiesTransactionType38Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent23Choice#mmSecuritiesTransactionType
	 * SettlementOrCorporateActionEvent23Choice.mmSecuritiesTransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying information about the settlement transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTrade, SecuritiesTransactionTypeV2Code> mmSecuritiesTransactionType = new MMBusinessAttribute<SecuritiesTrade, SecuritiesTransactionTypeV2Code>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails43.mmSettlementTransactionType, UnilateralSplit3Choice.mmCode, UnilateralSplit3Choice.mmProprietary,
					TransactionTypeAndAdditionalParameters15.mmSecuritiesFinancingTransactionType, TransactionTypeAndAdditionalParameters17.mmSecuritiesFinancingTransactionType,
					TransactionTypeAndAdditionalParameters16.mmSecuritiesFinancingTransactionType, SecuritiesFinancingTransactionDetails35.mmSecuritiesFinancingTransactionType, ForeignExchangeSwapTransaction3.mmTransactionType,
					SettlementDetails142.mmSecuritiesTransactionType, SettlementDetails144.mmSecuritiesTransactionType, SettlementDetails141.mmSecuritiesTransactionType, SettlementDetails145.mmSecuritiesTransactionType,
					SettlementOrCorporateActionEvent22Choice.mmSecuritiesTransactionType, SecuritiesTransactionType36Choice.mmCode, SecuritiesTransactionType36Choice.mmProprietary, SettlementDetails146.mmSecuritiesTransactionType,
					SecuritiesTransactionType37Choice.mmCode, SecuritiesTransactionType37Choice.mmProprietary, SettlementDetails143.mmSecuritiesTransactionType, SecuritiesTransactionType38Choice.mmCode,
					SecuritiesTransactionType38Choice.mmProprietary, SettlementOrCorporateActionEvent23Choice.mmSecuritiesTransactionType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransactionType";
			definition = "Underlying information about the settlement transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
		}

		@Override
		public SecuritiesTransactionTypeV2Code getValue(SecuritiesTrade obj) {
			return obj.getSecuritiesTransactionType();
		}

		@Override
		public void setValue(SecuritiesTrade obj, SecuritiesTransactionTypeV2Code value) {
			obj.setSecuritiesTransactionType(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "BusinessComment", new String[]{"BusinessComment", "Street Side confirmation"}));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTrade";
				definition = "Specifies trades linked to securities operations such as the exchange of securities, the lending of securities and the transactions related to investment funds.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecuritiesTrade, SecuritiesPricing.mmSecuritiesTrade, SecuritiesTradeIdentification.mmIdentifiedTrade, SecuritiesQuantity.mmTrade,
						SecuritiesTradeExecution.mmRelatedTrade, com.tools20022.repository.entity.SecuritiesTradeStatus.mmSecuritiesTrade, SecuritiesFinancing.mmClosingLegExecution, SecuritiesFinancing.mmOpeningLegExecution,
						SecuritiesOrder.mmOrderExecution, SecuritiesTradePartyRole.mmSecuritiesTrade, Allocation.mmSecuritiesTrade);
				derivationElement_lazy = () -> Arrays.asList(TradeLeg8.mmTradeRegistrationOrigin, TradeLegStatement3.mmTradeLegsDetails, NetPosition3.mmTradeLegDetails, TradeLeg10.mmTradeRegistrationOrigin,
						TradeLeg9.mmTradeRegistrationOrigin, SecuritiesTradeDetails71.mmOtherAmounts, Transaction60.mmTransactionDetails, SecuritiesTradeDetails72.mmOtherAmounts, Transaction61.mmTransactionDetails,
						Transaction62.mmTransactionDetails, TransactionDetails106.mmTransactionDetails);
				subType_lazy = () -> Arrays.asList(InvestmentFundTransaction.mmObject(), SecuritiesFinancing.mmObject(), SecuritiesTransaction.mmObject(), SecuritiesOptionTrade.mmObject());
				superType_lazy = () -> Trade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications, com.tools20022.repository.entity.SecuritiesTrade.mmTradeAmount,
						com.tools20022.repository.entity.SecuritiesTrade.mmOpeningClosingIndicator, com.tools20022.repository.entity.SecuritiesTrade.mmTradeTransactionCondition,
						com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeStatus, com.tools20022.repository.entity.SecuritiesTrade.mmActivity, com.tools20022.repository.entity.SecuritiesTrade.mmTradeQuantity,
						com.tools20022.repository.entity.SecuritiesTrade.mmTradeOriginationDate, com.tools20022.repository.entity.SecuritiesTrade.mmClearingFeeType, com.tools20022.repository.entity.SecuritiesTrade.mmSecurity,
						com.tools20022.repository.entity.SecuritiesTrade.mmTradePrice, com.tools20022.repository.entity.SecuritiesTrade.mmPartyRole, com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesFinancingClosingData,
						com.tools20022.repository.entity.SecuritiesTrade.mmTradingExecution, com.tools20022.repository.entity.SecuritiesTrade.mmTradeAllocation, com.tools20022.repository.entity.SecuritiesTrade.mmRelatedOrder,
						com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesFinancingOpeningData, com.tools20022.repository.entity.SecuritiesTrade.mmTransactionType,
						com.tools20022.repository.entity.SecuritiesTrade.mmLegalFramework, com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTransactionType);
				derivationComponent_lazy = () -> Arrays.asList(TradeType3Choice.mmObject(), TradeTransactionCondition4Choice.mmObject(), OtherAmounts16.mmObject(), TwoLegTransactionType1Choice.mmObject(), TradeLeg8.mmObject(),
						TradeLegStatement3.mmObject(), TradeLeg10.mmObject(), TradeLeg9.mmObject(), TransactionDetails81.mmObject(), TransactionDetails74.mmObject(), TransactionDetails82.mmObject(), TransactionDetails80.mmObject(),
						AdditionalParameters24.mmObject(), AdditionalParameters21.mmObject(), OtherAmounts32.mmObject(), LegalFramework3Choice.mmObject(), TransactionActivity3Choice.mmObject(), TradeTransactionCondition5Choice.mmObject(),
						OtherAmounts29.mmObject(), UnilateralSplit3Choice.mmObject(), DerivativeCommodity2.mmObject(), AdditionalParameters29.mmObject(), AdditionalParameters30.mmObject(), OtherAmounts41.mmObject(),
						SecuritiesTradeDetails71.mmObject(), OtherAmounts39.mmObject(), TransactionDetails105.mmObject(), OtherAmounts40.mmObject(), Transaction60.mmObject(), SecuritiesTradeDetails72.mmObject(),
						TransactionDetails104.mmObject(), Transaction61.mmObject(), TransactionDetails103.mmObject(), Transaction62.mmObject(), SecuritiesTradeDetails73.mmObject(), SecuritiesTradeDetails75.mmObject(),
						SecuritiesTradeDetails76.mmObject(), TransactionDetails106.mmObject(), TransactionDetails107.mmObject(), SecuritiesTradeDetails78.mmObject(), SecuritiesTradeDetails79.mmObject(), SecuritiesTradeDetails80.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTrade.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesTradeIdentification> getSecuritiesTradeRelatedIdentifications() {
		return securitiesTradeRelatedIdentifications == null ? securitiesTradeRelatedIdentifications = new ArrayList<>() : securitiesTradeRelatedIdentifications;
	}

	public SecuritiesTrade setSecuritiesTradeRelatedIdentifications(List<SecuritiesTradeIdentification> securitiesTradeRelatedIdentifications) {
		this.securitiesTradeRelatedIdentifications = Objects.requireNonNull(securitiesTradeRelatedIdentifications);
		return this;
	}

	public CurrencyAndAmount getTradeAmount() {
		return tradeAmount;
	}

	public SecuritiesTrade setTradeAmount(CurrencyAndAmount tradeAmount) {
		this.tradeAmount = Objects.requireNonNull(tradeAmount);
		return this;
	}

	public OpeningClosingCode getOpeningClosingIndicator() {
		return openingClosingIndicator;
	}

	public SecuritiesTrade setOpeningClosingIndicator(OpeningClosingCode openingClosingIndicator) {
		this.openingClosingIndicator = Objects.requireNonNull(openingClosingIndicator);
		return this;
	}

	public TradeTransactionConditionCode getTradeTransactionCondition() {
		return tradeTransactionCondition;
	}

	public SecuritiesTrade setTradeTransactionCondition(TradeTransactionConditionCode tradeTransactionCondition) {
		this.tradeTransactionCondition = Objects.requireNonNull(tradeTransactionCondition);
		return this;
	}

	public List<SecuritiesTradeStatus> getSecuritiesTradeStatus() {
		return securitiesTradeStatus == null ? securitiesTradeStatus = new ArrayList<>() : securitiesTradeStatus;
	}

	public SecuritiesTrade setSecuritiesTradeStatus(List<com.tools20022.repository.entity.SecuritiesTradeStatus> securitiesTradeStatus) {
		this.securitiesTradeStatus = Objects.requireNonNull(securitiesTradeStatus);
		return this;
	}

	public TransactionActivityCode getActivity() {
		return activity;
	}

	public SecuritiesTrade setActivity(TransactionActivityCode activity) {
		this.activity = Objects.requireNonNull(activity);
		return this;
	}

	public List<SecuritiesQuantity> getTradeQuantity() {
		return tradeQuantity == null ? tradeQuantity = new ArrayList<>() : tradeQuantity;
	}

	public SecuritiesTrade setTradeQuantity(List<SecuritiesQuantity> tradeQuantity) {
		this.tradeQuantity = Objects.requireNonNull(tradeQuantity);
		return this;
	}

	public ISODateTime getTradeOriginationDate() {
		return tradeOriginationDate;
	}

	public SecuritiesTrade setTradeOriginationDate(ISODateTime tradeOriginationDate) {
		this.tradeOriginationDate = Objects.requireNonNull(tradeOriginationDate);
		return this;
	}

	public ClearingFeeTypeCode getClearingFeeType() {
		return clearingFeeType;
	}

	public SecuritiesTrade setClearingFeeType(ClearingFeeTypeCode clearingFeeType) {
		this.clearingFeeType = Objects.requireNonNull(clearingFeeType);
		return this;
	}

	public List<Security> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public SecuritiesTrade setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public List<SecuritiesPricing> getTradePrice() {
		return tradePrice == null ? tradePrice = new ArrayList<>() : tradePrice;
	}

	public SecuritiesTrade setTradePrice(List<SecuritiesPricing> tradePrice) {
		this.tradePrice = Objects.requireNonNull(tradePrice);
		return this;
	}

	public List<SecuritiesTradePartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public SecuritiesTrade setPartyRole(List<SecuritiesTradePartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public Optional<SecuritiesFinancing> getSecuritiesFinancingClosingData() {
		return securitiesFinancingClosingData == null ? Optional.empty() : Optional.of(securitiesFinancingClosingData);
	}

	public SecuritiesTrade setSecuritiesFinancingClosingData(SecuritiesFinancing securitiesFinancingClosingData) {
		this.securitiesFinancingClosingData = securitiesFinancingClosingData;
		return this;
	}

	public List<SecuritiesTradeExecution> getTradingExecution() {
		return tradingExecution == null ? tradingExecution = new ArrayList<>() : tradingExecution;
	}

	public SecuritiesTrade setTradingExecution(List<SecuritiesTradeExecution> tradingExecution) {
		this.tradingExecution = Objects.requireNonNull(tradingExecution);
		return this;
	}

	public List<Allocation> getTradeAllocation() {
		return tradeAllocation == null ? tradeAllocation = new ArrayList<>() : tradeAllocation;
	}

	public SecuritiesTrade setTradeAllocation(List<Allocation> tradeAllocation) {
		this.tradeAllocation = Objects.requireNonNull(tradeAllocation);
		return this;
	}

	public Optional<SecuritiesOrder> getRelatedOrder() {
		return relatedOrder == null ? Optional.empty() : Optional.of(relatedOrder);
	}

	public SecuritiesTrade setRelatedOrder(SecuritiesOrder relatedOrder) {
		this.relatedOrder = relatedOrder;
		return this;
	}

	public Optional<SecuritiesFinancing> getSecuritiesFinancingOpeningData() {
		return securitiesFinancingOpeningData == null ? Optional.empty() : Optional.of(securitiesFinancingOpeningData);
	}

	public SecuritiesTrade setSecuritiesFinancingOpeningData(SecuritiesFinancing securitiesFinancingOpeningData) {
		this.securitiesFinancingOpeningData = securitiesFinancingOpeningData;
		return this;
	}

	public TradeTypeCode getTransactionType() {
		return transactionType;
	}

	public SecuritiesTrade setTransactionType(TradeTypeCode transactionType) {
		this.transactionType = Objects.requireNonNull(transactionType);
		return this;
	}

	public LegalFrameworkCode getLegalFramework() {
		return legalFramework;
	}

	public SecuritiesTrade setLegalFramework(LegalFrameworkCode legalFramework) {
		this.legalFramework = Objects.requireNonNull(legalFramework);
		return this;
	}

	public SecuritiesTransactionTypeV2Code getSecuritiesTransactionType() {
		return securitiesTransactionType;
	}

	public SecuritiesTrade setSecuritiesTransactionType(SecuritiesTransactionTypeV2Code securitiesTransactionType) {
		this.securitiesTransactionType = Objects.requireNonNull(securitiesTransactionType);
		return this;
	}
}