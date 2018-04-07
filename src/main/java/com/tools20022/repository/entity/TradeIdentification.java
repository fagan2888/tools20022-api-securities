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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ClearingBrokerIdentification;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different identifications associated with a trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TradeIdentification" src="doc-files/TradeIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCounterpartyReference
 * TradeIdentification.mmCounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
 * TradeIdentification.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCommonIdentification
 * TradeIdentification.mmCommonIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmMatchingReference
 * TradeIdentification.mmMatchingReference}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradeIdentification#mmTrade
 * TradeIdentification.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmUniqueTradeIdentifier
 * TradeIdentification.mmUniqueTradeIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmClearingBrokerIdentification
 * TradeIdentification.mmClearingBrokerIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeRelatedIdentifications
 * Trade.mmTradeRelatedIdentifications}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification#mmRelatedTradeIdentification
 * ClearingBrokerIdentification.mmRelatedTradeIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
 * SecuritiesTradeIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentIdentification
 * PaymentIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different identifications associated with a trade."</li>
 * </ul>
 */
public class TradeIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text counterpartyReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOpening3#mmCounterpartyReference
	 * InvestmentAccountOpening3.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification3#mmCounterpartyReference
	 * InvestmentAccountModification3.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation4#mmCounterpartyReference
	 * AccountManagementConfirmation4.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmCounterpartyProprietaryTransactionIdentification
	 * SecuredMarketTransaction4.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmCounterpartyProprietaryTransactionIdentification
	 * ForeignExchangeSwapTransaction3.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmCounterpartyProprietaryTransactionIdentification
	 * OvernightIndexSwapTransaction4.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmCounterpartyProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction4.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer29#mmCounterpartyReference
	 * ISATransfer29.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmCounterpartyReference
	 * Transfer35.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer34#mmCounterpartyReference
	 * Transfer34.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer28#mmCounterpartyReference
	 * ISATransfer28.mmCounterpartyReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the trade allocated by the counterparty."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TradeIdentification, Max35Text> mmCounterpartyReference = new MMBusinessAttribute<TradeIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccountOpening3.mmCounterpartyReference, InvestmentAccountModification3.mmCounterpartyReference, AccountManagementConfirmation4.mmCounterpartyReference,
					SecuredMarketTransaction4.mmCounterpartyProprietaryTransactionIdentification, ForeignExchangeSwapTransaction3.mmCounterpartyProprietaryTransactionIdentification,
					OvernightIndexSwapTransaction4.mmCounterpartyProprietaryTransactionIdentification, UnsecuredMarketTransaction4.mmCounterpartyProprietaryTransactionIdentification, ISATransfer29.mmCounterpartyReference,
					Transfer35.mmCounterpartyReference, Transfer34.mmCounterpartyReference, ISATransfer28.mmCounterpartyReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyReference";
			definition = "Unambiguous identification of the trade allocated by the counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TradeIdentification obj) {
			return obj.getCounterpartyReference();
		}

		@Override
		public void setValue(TradeIdentification obj, Max35Text value) {
			obj.setCounterpartyReference(value);
		}
	};
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmInstructingPartyTransactionIdentification
	 * IdentificationReference8Choice.
	 * mmInstructingPartyTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmExecutingPartyTransactionIdentification
	 * IdentificationReference8Choice.mmExecutingPartyTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmInstructingPartyTransactionIdentification
	 * IdentificationReference11Choice.
	 * mmInstructingPartyTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmExecutingPartyTransactionIdentification
	 * IdentificationReference11Choice.mmExecutingPartyTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmOpeningLegIdentification
	 * TwoLegTransactionDetails1.mmOpeningLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmClosingLegIdentification
	 * TwoLegTransactionDetails1.mmClosingLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeLegIdentification
	 * TradeLeg8.mmTradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmTradeLegIdentification
	 * TradeLeg10.mmTradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradeLegIdentification
	 * TradeLeg9.mmTradeLegIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References45Choice#mmOtherTransactionIdentification
	 * References45Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification18#mmTransactionIdentification
	 * SettlementTypeAndIdentification18.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters24#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters24.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters21.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#mmTradeIdentification
	 * References46Choice.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#mmOtherTransactionIdentification
	 * References46Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmTradeIdentification
	 * Identification15.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References41Choice#mmOtherTransactionIdentification
	 * References41Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References44Choice#mmOtherTransactionIdentification
	 * References44Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References47Choice#mmOtherTransactionIdentification
	 * References47Choice.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#mmTradeIdentification
	 * References18.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmDealReference
	 * IndividualOrderConfirmationStatusAndReason2.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference10#mmReference
	 * MessageAndBusinessReference10.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference10#mmRelatedReference
	 * MessageAndBusinessReference10.mmRelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmDealReference
	 * IndividualOrderStatusAndReason7.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmTransactionIdentification
	 * SecuritiesTransactionReport4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmPreviousPartialConfirmationIdentification
	 * AdditionalParameters29.mmPreviousPartialConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmProprietaryTransactionIdentification
	 * SecuredMarketTransaction4.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmRelatedProprietaryTransactionIdentification
	 * SecuredMarketTransaction4.mmRelatedProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmProprietaryTransactionIdentification
	 * ForeignExchangeSwapTransaction3.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmRelatedProprietaryTransactionIdentification
	 * ForeignExchangeSwapTransaction3.
	 * mmRelatedProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmProprietaryTransactionIdentification
	 * OvernightIndexSwapTransaction4.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmRelatedProprietaryTransactionIdentification
	 * OvernightIndexSwapTransaction4.
	 * mmRelatedProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction4.mmProprietaryTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmRelatedProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction4.mmRelatedProprietaryTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference11#mmCancellationReference
	 * MessageAndBusinessReference11.mmCancellationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References63Choice#mmPreviousReference
	 * References63Choice.mmPreviousReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References63Choice#mmOtherReference
	 * References63Choice.mmOtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmTradeIdentification
	 * SecuritiesTradeDetails71.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmTradeIdentification
	 * TransactionDetails105.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction60#mmTradeIdentification
	 * Transaction60.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction61#mmTradeIdentification
	 * Transaction61.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction62#mmTradeIdentification
	 * Transaction62.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73#mmTradeIdentification
	 * SecuritiesTradeDetails73.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75#mmTradeIdentification
	 * SecuritiesTradeDetails75.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76#mmTradeIdentification
	 * SecuritiesTradeDetails76.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails106#mmOtherTransactionIdentification
	 * TransactionDetails106.mmOtherTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78#mmTradeIdentification
	 * SecuritiesTradeDetails78.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79#mmTradeIdentification
	 * SecuritiesTradeDetails79.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails80#mmTradeIdentification
	 * SecuritiesTradeDetails80.mmTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification25#mmTransactionIdentification
	 * SettlementTypeAndIdentification25.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=BusinessComment, BusinessComment=Reference to the
	 * trade given by the IMI and Broker/Dealer each oin their side,
	 * ISO15022Synonym: :20C::TRRF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned to the trade by the investor or the trading party. This reference will be used throughout the trade life cycle to access/update the trade details."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TradeIdentification, Max35Text> mmIdentification = new MMBusinessAttribute<TradeIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(IdentificationReference8Choice.mmInstructingPartyTransactionIdentification, IdentificationReference8Choice.mmExecutingPartyTransactionIdentification,
					IdentificationReference11Choice.mmInstructingPartyTransactionIdentification, IdentificationReference11Choice.mmExecutingPartyTransactionIdentification, TwoLegTransactionDetails1.mmOpeningLegIdentification,
					TwoLegTransactionDetails1.mmClosingLegIdentification, TradeLeg8.mmTradeLegIdentification, TradeLeg10.mmTradeLegIdentification, TradeLeg9.mmTradeLegIdentification, References45Choice.mmOtherTransactionIdentification,
					SettlementTypeAndIdentification18.mmTransactionIdentification, AdditionalParameters24.mmPreviousPartialConfirmationIdentification, AdditionalParameters21.mmPreviousPartialConfirmationIdentification,
					References46Choice.mmTradeIdentification, References46Choice.mmOtherTransactionIdentification, Identification15.mmTradeIdentification, References41Choice.mmOtherTransactionIdentification,
					References44Choice.mmOtherTransactionIdentification, References47Choice.mmOtherTransactionIdentification, References18.mmTradeIdentification, IndividualOrderConfirmationStatusAndReason2.mmDealReference,
					MessageAndBusinessReference10.mmReference, MessageAndBusinessReference10.mmRelatedReference, IndividualOrderStatusAndReason7.mmDealReference, SecuritiesTransactionReport4.mmTransactionIdentification,
					AdditionalParameters29.mmPreviousPartialConfirmationIdentification, SecuredMarketTransaction4.mmProprietaryTransactionIdentification, SecuredMarketTransaction4.mmRelatedProprietaryTransactionIdentification,
					ForeignExchangeSwapTransaction3.mmProprietaryTransactionIdentification, ForeignExchangeSwapTransaction3.mmRelatedProprietaryTransactionIdentification,
					OvernightIndexSwapTransaction4.mmProprietaryTransactionIdentification, OvernightIndexSwapTransaction4.mmRelatedProprietaryTransactionIdentification, UnsecuredMarketTransaction4.mmProprietaryTransactionIdentification,
					UnsecuredMarketTransaction4.mmRelatedProprietaryTransactionIdentification, MessageAndBusinessReference11.mmCancellationReference, References63Choice.mmPreviousReference, References63Choice.mmOtherReference,
					SecuritiesTradeDetails71.mmTradeIdentification, TransactionDetails105.mmTradeIdentification, Transaction60.mmTradeIdentification, Transaction61.mmTradeIdentification, Transaction62.mmTradeIdentification,
					SecuritiesTradeDetails73.mmTradeIdentification, SecuritiesTradeDetails75.mmTradeIdentification, SecuritiesTradeDetails76.mmTradeIdentification, TransactionDetails106.mmOtherTransactionIdentification,
					SecuritiesTradeDetails78.mmTradeIdentification, SecuritiesTradeDetails79.mmTradeIdentification, SecuritiesTradeDetails80.mmTradeIdentification, SettlementTypeAndIdentification25.mmTransactionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "BusinessComment", new String[]{"BusinessComment", "Reference to the trade given by the IMI and Broker/Dealer each oin their side"}), new ISO15022Synonym(
					this, ":20C::TRRF"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Reference assigned to the trade by the investor or the trading party. This reference will be used throughout the trade life cycle to access/update the trade details.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TradeIdentification obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(TradeIdentification obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	protected Max35Text commonIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmCommonIdentification
	 * IdentificationReference8Choice.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmCommonIdentification
	 * IdentificationReference11Choice.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmTradePlaceMatchingIdentification
	 * SecuritiesTransaction1.mmTradePlaceMatchingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmComplexTradeComponentIdentification
	 * SecuritiesTransaction1.mmComplexTradeComponentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#mmCommonIdentification
	 * SettlementTypeAndIdentification19.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications31#mmCommonIdentification
	 * TransactionIdentifications31.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters12#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters12.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications32#mmCommonIdentification
	 * TransactionIdentifications32.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters14.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#mmCommonIdentification
	 * References46Choice.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmCommonIdentification
	 * Identification15.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters13#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters13.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#mmCommonIdentification
	 * References18.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19#mmCommonIdentification
	 * SettlementTypeAndAdditionalParameters19.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters15#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters15.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters17.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#mmCommonIdentification
	 * TransactionTypeAndAdditionalParameters16.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmCommonIdentification
	 * SecuritiesTradeDetails71.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction60#mmCommonIdentification
	 * Transaction60.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmCommonIdentification
	 * SecuritiesTradeDetails72.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction61#mmCommonIdentification
	 * Transaction61.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction62#mmCommonIdentification
	 * Transaction62.mmCommonIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=BusinessComment, BusinessComment=Commmon reference
	 * given by IMI and BD commonly, ISO15022Synonym: :20C::COMM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference agreed upon by the two trade counterparties to identify the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TradeIdentification, Max35Text> mmCommonIdentification = new MMBusinessAttribute<TradeIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(IdentificationReference8Choice.mmCommonIdentification, IdentificationReference11Choice.mmCommonIdentification, SecuritiesTransaction1.mmTradePlaceMatchingIdentification,
					SecuritiesTransaction1.mmComplexTradeComponentIdentification, SettlementTypeAndIdentification19.mmCommonIdentification, TransactionIdentifications31.mmCommonIdentification,
					SettlementTypeAndAdditionalParameters12.mmCommonIdentification, TransactionIdentifications32.mmCommonIdentification, SettlementTypeAndAdditionalParameters14.mmCommonIdentification,
					References46Choice.mmCommonIdentification, Identification15.mmCommonIdentification, SettlementTypeAndAdditionalParameters13.mmCommonIdentification, References18.mmCommonIdentification,
					SettlementTypeAndAdditionalParameters19.mmCommonIdentification, TransactionTypeAndAdditionalParameters15.mmCommonIdentification, TransactionTypeAndAdditionalParameters17.mmCommonIdentification,
					TransactionTypeAndAdditionalParameters16.mmCommonIdentification, SecuritiesTradeDetails71.mmCommonIdentification, Transaction60.mmCommonIdentification, SecuritiesTradeDetails72.mmCommonIdentification,
					Transaction61.mmCommonIdentification, Transaction62.mmCommonIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "BusinessComment", new String[]{"BusinessComment", "Commmon reference given by IMI and BD commonly"}), new ISO15022Synonym(this, ":20C::COMM"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommonIdentification";
			definition = "Unique reference agreed upon by the two trade counterparties to identify the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TradeIdentification obj) {
			return obj.getCommonIdentification();
		}

		@Override
		public void setValue(TradeIdentification obj, Max35Text value) {
			obj.setCommonIdentification(value);
		}
	};
	protected Max35Text matchingReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned by a matching system when the trade is matched."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TradeIdentification, Max35Text> mmMatchingReference = new MMBusinessAttribute<TradeIdentification, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MatchingReference";
			definition = "Reference assigned by a matching system when the trade is matched.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TradeIdentification obj) {
			return obj.getMatchingReference();
		}

		@Override
		public void setValue(TradeIdentification obj, Max35Text value) {
			obj.setMatchingReference(value);
		}
	};
	protected Trade trade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeRelatedIdentifications
	 * Trade.mmTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade for which identifications are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradeIdentification, Optional<Trade>> mmTrade = new MMBusinessAssociationEnd<TradeIdentification, Optional<Trade>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Specifies the trade for which identifications are provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Trade.mmTradeRelatedIdentifications;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Trade.mmObject();
		}

		@Override
		public Optional<Trade> getValue(TradeIdentification obj) {
			return obj.getTrade();
		}

		@Override
		public void setValue(TradeIdentification obj, Optional<Trade> value) {
			obj.setTrade(value.orElse(null));
		}
	};
	protected Max35Text uniqueTradeIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport2#mmTransactionIdentification
	 * SecuritiesTransactionReport2.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmUniqueTransactionIdentifier
	 * SecuredMarketTransaction4.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmUniqueTransactionIdentifier
	 * ForeignExchangeSwapTransaction3.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmUniqueTransactionIdentifier
	 * OvernightIndexSwapTransaction4.mmUniqueTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmUniqueTransactionIdentifier
	 * UnsecuredMarketTransaction4.mmUniqueTransactionIdentifier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniqueTradeIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This field specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TradeIdentification, Max35Text> mmUniqueTradeIdentifier = new MMBusinessAttribute<TradeIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTransactionReport2.mmTransactionIdentification, SecuredMarketTransaction4.mmUniqueTransactionIdentifier, ForeignExchangeSwapTransaction3.mmUniqueTransactionIdentifier,
					OvernightIndexSwapTransaction4.mmUniqueTransactionIdentifier, UnsecuredMarketTransaction4.mmUniqueTransactionIdentifier);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UniqueTradeIdentifier";
			definition = "This field specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TradeIdentification obj) {
			return obj.getUniqueTradeIdentifier();
		}

		@Override
		public void setValue(TradeIdentification obj, Max35Text value) {
			obj.setUniqueTradeIdentifier(value);
		}
	};
	protected List<ClearingBrokerIdentification> clearingBrokerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification#mmRelatedTradeIdentification
	 * ClearingBrokerIdentification.mmRelatedTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification
	 * ClearingBrokerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingBrokerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference number assigned by the clearing broker."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradeIdentification, List<ClearingBrokerIdentification>> mmClearingBrokerIdentification = new MMBusinessAssociationEnd<TradeIdentification, List<ClearingBrokerIdentification>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingBrokerIdentification";
			definition = "Reference number assigned by the clearing broker.";
			minOccurs = 0;
			opposite_lazy = () -> ClearingBrokerIdentification.mmRelatedTradeIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ClearingBrokerIdentification.mmObject();
		}

		@Override
		public List<ClearingBrokerIdentification> getValue(TradeIdentification obj) {
			return obj.getClearingBrokerIdentification();
		}

		@Override
		public void setValue(TradeIdentification obj, List<ClearingBrokerIdentification> value) {
			obj.setClearingBrokerIdentification(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeIdentification";
				definition = "Specifies the different identifications associated with a trade.";
				associationDomain_lazy = () -> Arrays.asList(Trade.mmTradeRelatedIdentifications, ClearingBrokerIdentification.mmRelatedTradeIdentification);
				subType_lazy = () -> Arrays.asList(SecuritiesTradeIdentification.mmObject(), PaymentIdentification.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradeIdentification.mmCounterpartyReference, com.tools20022.repository.entity.TradeIdentification.mmIdentification,
						com.tools20022.repository.entity.TradeIdentification.mmCommonIdentification, com.tools20022.repository.entity.TradeIdentification.mmMatchingReference, com.tools20022.repository.entity.TradeIdentification.mmTrade,
						com.tools20022.repository.entity.TradeIdentification.mmUniqueTradeIdentifier, com.tools20022.repository.entity.TradeIdentification.mmClearingBrokerIdentification);
			}

			@Override
			public Class<?> getInstanceClass() {
				return TradeIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getCounterpartyReference() {
		return counterpartyReference;
	}

	public TradeIdentification setCounterpartyReference(Max35Text counterpartyReference) {
		this.counterpartyReference = Objects.requireNonNull(counterpartyReference);
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public TradeIdentification setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Max35Text getCommonIdentification() {
		return commonIdentification;
	}

	public TradeIdentification setCommonIdentification(Max35Text commonIdentification) {
		this.commonIdentification = Objects.requireNonNull(commonIdentification);
		return this;
	}

	public Max35Text getMatchingReference() {
		return matchingReference;
	}

	public TradeIdentification setMatchingReference(Max35Text matchingReference) {
		this.matchingReference = Objects.requireNonNull(matchingReference);
		return this;
	}

	public Optional<Trade> getTrade() {
		return trade == null ? Optional.empty() : Optional.of(trade);
	}

	public TradeIdentification setTrade(Trade trade) {
		this.trade = trade;
		return this;
	}

	public Max35Text getUniqueTradeIdentifier() {
		return uniqueTradeIdentifier;
	}

	public TradeIdentification setUniqueTradeIdentifier(Max35Text uniqueTradeIdentifier) {
		this.uniqueTradeIdentifier = Objects.requireNonNull(uniqueTradeIdentifier);
		return this;
	}

	public List<ClearingBrokerIdentification> getClearingBrokerIdentification() {
		return clearingBrokerIdentification == null ? clearingBrokerIdentification = new ArrayList<>() : clearingBrokerIdentification;
	}

	public TradeIdentification setClearingBrokerIdentification(List<ClearingBrokerIdentification> clearingBrokerIdentification) {
		this.clearingBrokerIdentification = Objects.requireNonNull(clearingBrokerIdentification);
		return this;
	}
}