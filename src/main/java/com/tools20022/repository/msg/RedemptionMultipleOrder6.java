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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.setr.RedemptionOrderV04;
import com.tools20022.repository.choice.CancellationRight1Choice;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IndividualPerson32;
import com.tools20022.repository.msg.InvestmentAccount58;
import com.tools20022.repository.msg.PaymentTransaction72;
import com.tools20022.repository.msg.RedemptionOrder14;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Instruction from an investor to sell investment fund units back to the fund.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmMasterReference
 * RedemptionMultipleOrder6.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmPlaceOfTrade
 * RedemptionMultipleOrder6.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmOrderDateTime
 * RedemptionMultipleOrder6.mmOrderDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmExpiryDateTime
 * RedemptionMultipleOrder6.mmExpiryDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmRequestedFutureTradeDate
 * RedemptionMultipleOrder6.mmRequestedFutureTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmCancellationRight
 * RedemptionMultipleOrder6.mmCancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmInvestmentAccountDetails
 * RedemptionMultipleOrder6.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmBeneficiaryDetails
 * RedemptionMultipleOrder6.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmIndividualOrderDetails
 * RedemptionMultipleOrder6.mmIndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmBulkCashSettlementDetails
 * RedemptionMultipleOrder6.mmBulkCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmTotalSettlementAmount
 * RedemptionMultipleOrder6.mmTotalSettlementAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RedemptionOrder
 * RedemptionOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04#mmMultipleOrderDetails
 * RedemptionOrderV04.mmMultipleOrderDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetailsRule#forRedemptionMultipleOrder6
 * ConstraintBulkCashSettlementDetailsRule.forRedemptionMultipleOrder6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementCurrencyRule#forRedemptionMultipleOrder6
 * ConstraintSettlementCurrencyRule.forRedemptionMultipleOrder6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forRedemptionMultipleOrder6
 * ConstraintOrderOriginatorEligibility3Rule.forRedemptionMultipleOrder6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalSettlementCurrencyRule#forRedemptionMultipleOrder6
 * ConstraintTotalSettlementCurrencyRule.forRedemptionMultipleOrder6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RedemptionMultipleOrder6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction from an investor to sell investment fund units back to the fund."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RedemptionMultipleOrder6", propOrder = {"masterReference", "placeOfTrade", "orderDateTime", "expiryDateTime", "requestedFutureTradeDate", "cancellationRight", "investmentAccountDetails", "beneficiaryDetails",
		"individualOrderDetails", "bulkCashSettlementDetails", "totalSettlementAmount"})
public class RedemptionMultipleOrder6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MstrRef")
	protected Max35Text masterReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
	 * Order.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6
	 * RedemptionMultipleOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionMultipleOrder6, Optional<Max35Text>> mmMasterReference = new MMMessageAttribute<RedemptionMultipleOrder6, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleOrder6.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(RedemptionMultipleOrder6 obj) {
			return obj.getMasterReference();
		}

		@Override
		public void setValue(RedemptionMultipleOrder6 obj, Optional<Max35Text> value) {
			obj.setMasterReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PlcOfTrad")
	protected PlaceOfTradeIdentification1Choice placeOfTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice
	 * PlaceOfTradeIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6
	 * RedemptionMultipleOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market in which the advised trade transaction was executed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionMultipleOrder6, Optional<PlaceOfTradeIdentification1Choice>> mmPlaceOfTrade = new MMMessageAttribute<RedemptionMultipleOrder6, Optional<PlaceOfTradeIdentification1Choice>>() {
		{
			businessComponentTrace_lazy = () -> TradingMarket.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleOrder6.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Market in which the advised trade transaction was executed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PlaceOfTradeIdentification1Choice.mmObject();
		}

		@Override
		public Optional<PlaceOfTradeIdentification1Choice> getValue(RedemptionMultipleOrder6 obj) {
			return obj.getPlaceOfTrade();
		}

		@Override
		public void setValue(RedemptionMultipleOrder6 obj, Optional<PlaceOfTradeIdentification1Choice> value) {
			obj.setPlaceOfTrade(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrDtTm")
	protected ISODateTime orderDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderDateTime
	 * InvestmentFundOrder.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6
	 * RedemptionMultipleOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time the order is placed by the investor or its agent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionMultipleOrder6, Optional<ISODateTime>> mmOrderDateTime = new MMMessageAttribute<RedemptionMultipleOrder6, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleOrder6.mmObject();
			isDerived = false;
			xmlTag = "OrdrDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDateTime";
			definition = "Date and time the order is placed by the investor or its agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(RedemptionMultipleOrder6 obj) {
			return obj.getOrderDateTime();
		}

		@Override
		public void setValue(RedemptionMultipleOrder6 obj, Optional<ISODateTime> value) {
			obj.setOrderDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "XpryDtTm")
	protected DateAndDateTimeChoice expiryDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmExpiryDateTime
	 * InvestmentFundOrder.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6
	 * RedemptionMultipleOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the order expires."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionMultipleOrder6, Optional<DateAndDateTimeChoice>> mmExpiryDateTime = new MMMessageAttribute<RedemptionMultipleOrder6, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmExpiryDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleOrder6.mmObject();
			isDerived = false;
			xmlTag = "XpryDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDateTime";
			definition = "Date on which the order expires.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(RedemptionMultipleOrder6 obj) {
			return obj.getExpiryDateTime();
		}

		@Override
		public void setValue(RedemptionMultipleOrder6 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setExpiryDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdFutrTradDt")
	protected ISODate requestedFutureTradeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRequestedExecutionDateTime
	 * InvestmentFundOrder.mmRequestedExecutionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6
	 * RedemptionMultipleOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdFutrTradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedFutureTradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Future date at which the investor requests the order to be executed.\nThe specification of a requested future trade date is not allowed in some markets. The date must be a date in the future."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionMultipleOrder6, Optional<ISODate>> mmRequestedFutureTradeDate = new MMMessageAttribute<RedemptionMultipleOrder6, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmRequestedExecutionDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleOrder6.mmObject();
			isDerived = false;
			xmlTag = "ReqdFutrTradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedFutureTradeDate";
			definition = "Future date at which the investor requests the order to be executed.\nThe specification of a requested future trade date is not allowed in some markets. The date must be a date in the future.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(RedemptionMultipleOrder6 obj) {
			return obj.getRequestedFutureTradeDate();
		}

		@Override
		public void setValue(RedemptionMultipleOrder6 obj, Optional<ISODate> value) {
			obj.setRequestedFutureTradeDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CxlRght")
	protected CancellationRight1Choice cancellationRight;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CancellationRight1Choice
	 * CancellationRight1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmCancellationRight
	 * InvestmentFundOrder.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6
	 * RedemptionMultipleOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRght"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation right of the investor with respect to the investment fund order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionMultipleOrder6, Optional<CancellationRight1Choice>> mmCancellationRight = new MMMessageAttribute<RedemptionMultipleOrder6, Optional<CancellationRight1Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmCancellationRight;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleOrder6.mmObject();
			isDerived = false;
			xmlTag = "CxlRght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRight";
			definition = "Cancellation right of the investor with respect to the investment fund order.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CancellationRight1Choice.mmObject();
		}

		@Override
		public Optional<CancellationRight1Choice> getValue(RedemptionMultipleOrder6 obj) {
			return obj.getCancellationRight();
		}

		@Override
		public void setValue(RedemptionMultipleOrder6 obj, Optional<CancellationRight1Choice> value) {
			obj.setCancellationRight(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtAcctDtls", required = true)
	protected InvestmentAccount58 investmentAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount58
	 * InvestmentAccount58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
	 * InvestmentFundTransaction.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6
	 * RedemptionMultipleOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account impacted by the investment fund order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionMultipleOrder6, InvestmentAccount58> mmInvestmentAccountDetails = new MMMessageAssociationEnd<RedemptionMultipleOrder6, InvestmentAccount58>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleOrder6.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account impacted by the investment fund order.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccount58.mmObject();
		}

		@Override
		public InvestmentAccount58 getValue(RedemptionMultipleOrder6 obj) {
			return obj.getInvestmentAccountDetails();
		}

		@Override
		public void setValue(RedemptionMultipleOrder6 obj, InvestmentAccount58 value) {
			obj.setInvestmentAccountDetails(value);
		}
	};
	@XmlElement(name = "BnfcryDtls")
	protected List<IndividualPerson32> beneficiaryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson32
	 * IndividualPerson32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6
	 * RedemptionMultipleOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the investor."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionMultipleOrder6, List<IndividualPerson32>> mmBeneficiaryDetails = new MMMessageAssociationEnd<RedemptionMultipleOrder6, List<IndividualPerson32>>() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleOrder6.mmObject();
			isDerived = false;
			xmlTag = "BnfcryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryDetails";
			definition = "Additional information about the investor.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IndividualPerson32.mmObject();
		}

		@Override
		public List<IndividualPerson32> getValue(RedemptionMultipleOrder6 obj) {
			return obj.getBeneficiaryDetails();
		}

		@Override
		public void setValue(RedemptionMultipleOrder6 obj, List<IndividualPerson32> value) {
			obj.setBeneficiaryDetails(value);
		}
	};
	@XmlElement(name = "IndvOrdrDtls", required = true)
	protected List<RedemptionOrder14> individualOrderDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionOrder
	 * RedemptionOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6
	 * RedemptionMultipleOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvOrdrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualOrderDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction from an investor to sell investment fund units back to the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionMultipleOrder6, List<RedemptionOrder14>> mmIndividualOrderDetails = new MMMessageAssociationEnd<RedemptionMultipleOrder6, List<RedemptionOrder14>>() {
		{
			businessComponentTrace_lazy = () -> RedemptionOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleOrder6.mmObject();
			isDerived = false;
			xmlTag = "IndvOrdrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualOrderDetails";
			definition = "Instruction from an investor to sell investment fund units back to the fund.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RedemptionOrder14.mmObject();
		}

		@Override
		public List<RedemptionOrder14> getValue(RedemptionMultipleOrder6 obj) {
			return obj.getIndividualOrderDetails();
		}

		@Override
		public void setValue(RedemptionMultipleOrder6 obj, List<RedemptionOrder14> value) {
			obj.setIndividualOrderDetails(value);
		}
	};
	@XmlElement(name = "BlkCshSttlmDtls")
	protected PaymentTransaction72 bulkCashSettlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTransaction72
	 * PaymentTransaction72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BulkPayment BulkPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6
	 * RedemptionMultipleOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlkCshSttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment process for the transfer of cash from the debtor to the creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionMultipleOrder6, Optional<PaymentTransaction72>> mmBulkCashSettlementDetails = new MMMessageAssociationEnd<RedemptionMultipleOrder6, Optional<PaymentTransaction72>>() {
		{
			businessComponentTrace_lazy = () -> BulkPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleOrder6.mmObject();
			isDerived = false;
			xmlTag = "BlkCshSttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetails";
			definition = "Payment process for the transfer of cash from the debtor to the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTransaction72.mmObject();
		}

		@Override
		public Optional<PaymentTransaction72> getValue(RedemptionMultipleOrder6 obj) {
			return obj.getBulkCashSettlementDetails();
		}

		@Override
		public void setValue(RedemptionMultipleOrder6 obj, Optional<PaymentTransaction72> value) {
			obj.setBulkCashSettlementDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlSttlmAmt")
	protected ActiveCurrencyAndAmount totalSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6
	 * RedemptionMultipleOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlSttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money paid /to be paid or received in exchange for the financial instrument in the multiple order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionMultipleOrder6, Optional<ActiveCurrencyAndAmount>> mmTotalSettlementAmount = new MMMessageAttribute<RedemptionMultipleOrder6, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleOrder6.mmObject();
			isDerived = false;
			xmlTag = "TtlSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalSettlementAmount";
			definition = "Total amount of money paid /to be paid or received in exchange for the financial instrument in the multiple order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(RedemptionMultipleOrder6 obj) {
			return obj.getTotalSettlementAmount();
		}

		@Override
		public void setValue(RedemptionMultipleOrder6 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTotalSettlementAmount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionMultipleOrder6.mmMasterReference, com.tools20022.repository.msg.RedemptionMultipleOrder6.mmPlaceOfTrade,
						com.tools20022.repository.msg.RedemptionMultipleOrder6.mmOrderDateTime, com.tools20022.repository.msg.RedemptionMultipleOrder6.mmExpiryDateTime,
						com.tools20022.repository.msg.RedemptionMultipleOrder6.mmRequestedFutureTradeDate, com.tools20022.repository.msg.RedemptionMultipleOrder6.mmCancellationRight,
						com.tools20022.repository.msg.RedemptionMultipleOrder6.mmInvestmentAccountDetails, com.tools20022.repository.msg.RedemptionMultipleOrder6.mmBeneficiaryDetails,
						com.tools20022.repository.msg.RedemptionMultipleOrder6.mmIndividualOrderDetails, com.tools20022.repository.msg.RedemptionMultipleOrder6.mmBulkCashSettlementDetails,
						com.tools20022.repository.msg.RedemptionMultipleOrder6.mmTotalSettlementAmount);
				messageBuildingBlock_lazy = () -> Arrays.asList(RedemptionOrderV04.mmMultipleOrderDetails);
				trace_lazy = () -> RedemptionOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetailsRule.forRedemptionMultipleOrder6,
						com.tools20022.repository.constraints.ConstraintSettlementCurrencyRule.forRedemptionMultipleOrder6, com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forRedemptionMultipleOrder6,
						com.tools20022.repository.constraints.ConstraintTotalSettlementCurrencyRule.forRedemptionMultipleOrder6);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionMultipleOrder6";
				definition = "Instruction from an investor to sell investment fund units back to the fund.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public RedemptionMultipleOrder6 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public Optional<PlaceOfTradeIdentification1Choice> getPlaceOfTrade() {
		return placeOfTrade == null ? Optional.empty() : Optional.of(placeOfTrade);
	}

	public RedemptionMultipleOrder6 setPlaceOfTrade(PlaceOfTradeIdentification1Choice placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
		return this;
	}

	public Optional<ISODateTime> getOrderDateTime() {
		return orderDateTime == null ? Optional.empty() : Optional.of(orderDateTime);
	}

	public RedemptionMultipleOrder6 setOrderDateTime(ISODateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getExpiryDateTime() {
		return expiryDateTime == null ? Optional.empty() : Optional.of(expiryDateTime);
	}

	public RedemptionMultipleOrder6 setExpiryDateTime(DateAndDateTimeChoice expiryDateTime) {
		this.expiryDateTime = expiryDateTime;
		return this;
	}

	public Optional<ISODate> getRequestedFutureTradeDate() {
		return requestedFutureTradeDate == null ? Optional.empty() : Optional.of(requestedFutureTradeDate);
	}

	public RedemptionMultipleOrder6 setRequestedFutureTradeDate(ISODate requestedFutureTradeDate) {
		this.requestedFutureTradeDate = requestedFutureTradeDate;
		return this;
	}

	public Optional<CancellationRight1Choice> getCancellationRight() {
		return cancellationRight == null ? Optional.empty() : Optional.of(cancellationRight);
	}

	public RedemptionMultipleOrder6 setCancellationRight(CancellationRight1Choice cancellationRight) {
		this.cancellationRight = cancellationRight;
		return this;
	}

	public InvestmentAccount58 getInvestmentAccountDetails() {
		return investmentAccountDetails;
	}

	public RedemptionMultipleOrder6 setInvestmentAccountDetails(InvestmentAccount58 investmentAccountDetails) {
		this.investmentAccountDetails = Objects.requireNonNull(investmentAccountDetails);
		return this;
	}

	public List<IndividualPerson32> getBeneficiaryDetails() {
		return beneficiaryDetails == null ? beneficiaryDetails = new ArrayList<>() : beneficiaryDetails;
	}

	public RedemptionMultipleOrder6 setBeneficiaryDetails(List<IndividualPerson32> beneficiaryDetails) {
		this.beneficiaryDetails = Objects.requireNonNull(beneficiaryDetails);
		return this;
	}

	public List<RedemptionOrder14> getIndividualOrderDetails() {
		return individualOrderDetails == null ? individualOrderDetails = new ArrayList<>() : individualOrderDetails;
	}

	public RedemptionMultipleOrder6 setIndividualOrderDetails(List<RedemptionOrder14> individualOrderDetails) {
		this.individualOrderDetails = Objects.requireNonNull(individualOrderDetails);
		return this;
	}

	public Optional<PaymentTransaction72> getBulkCashSettlementDetails() {
		return bulkCashSettlementDetails == null ? Optional.empty() : Optional.of(bulkCashSettlementDetails);
	}

	public RedemptionMultipleOrder6 setBulkCashSettlementDetails(PaymentTransaction72 bulkCashSettlementDetails) {
		this.bulkCashSettlementDetails = bulkCashSettlementDetails;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalSettlementAmount() {
		return totalSettlementAmount == null ? Optional.empty() : Optional.of(totalSettlementAmount);
	}

	public RedemptionMultipleOrder6 setTotalSettlementAmount(ActiveCurrencyAndAmount totalSettlementAmount) {
		this.totalSettlementAmount = totalSettlementAmount;
		return this;
	}
}