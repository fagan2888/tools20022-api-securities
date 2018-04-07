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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.InvestmentFundTransactionInType1Choice;
import com.tools20022.repository.choice.InvestmentFundTransactionOutType1Choice;
import com.tools20022.repository.choice.TransactionType1Choice;
import com.tools20022.repository.choice.TransactionType2Choice;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Process of buying, selling, switching or transferring fund units.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFundTransaction"
 * src="doc-files/InvestmentFundTransaction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundOrder
 * InvestmentFundTransaction.mmInvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmClientReference
 * InvestmentFundTransaction.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmType
 * InvestmentFundTransaction.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionCharge
 * InvestmentFundTransaction.mmTransactionCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
 * InvestmentFundTransaction.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionTax
 * InvestmentFundTransaction.mmTransactionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmCreditDebitIndicator
 * InvestmentFundTransaction.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundOrderExecution
 * InvestmentFundTransaction.mmInvestmentFundOrderExecution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentFundTransaction
 * InvestmentFundClass.mmInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundTransaction
 * InvestmentAccount.mmInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmTransaction
 * InvestmentFundTax.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRelatedTransaction
 * InvestmentFundOrder.mmRelatedTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInvestmentFundTransaction
 * InvestmentFundOrderExecution.mmInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmInvestmentFundTransaction
 * Charges.mmInvestmentFundTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmEventType
 * InvestmentFundTransaction4.mmEventType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3
 * InvestmentFundTransactionsByFund3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
 * InvestmentFundTransaction4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransactionType1Choice
 * TransactionType1Choice}</li>
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
 * "InvestmentFundTransaction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Process of buying, selling, switching or transferring fund units."</li>
 * </ul>
 */
public class InvestmentFundTransaction extends SecuritiesTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.InvestmentFundOrder> investmentFundOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRelatedTransaction
	 * InvestmentFundOrder.mmRelatedTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, eg, other assets, into or out of an investment fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InvestmentFundTransaction, List<InvestmentFundOrder>> mmInvestmentFundOrder = new MMBusinessAssociationEnd<InvestmentFundTransaction, List<InvestmentFundOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrder";
			definition = "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, eg, other assets, into or out of an investment fund.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmRelatedTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
		}

		@Override
		public List<InvestmentFundOrder> getValue(InvestmentFundTransaction obj) {
			return obj.getInvestmentFundOrder();
		}

		@Override
		public void setValue(InvestmentFundTransaction obj, List<InvestmentFundOrder> value) {
			obj.setInvestmentFundOrder(value);
		}
	};
	protected Max35Text clientReference;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmClientReference
	 * InvestmentFundTransaction4.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOpening3#mmClientReference
	 * InvestmentAccountOpening3.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder11#mmClientReference
	 * InvestmentFundOrder11.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmClientReference
	 * SwitchExecution7.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification3#mmClientReference
	 * InvestmentAccountModification3.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder9#mmClientReference
	 * InvestmentFundOrder9.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmClientReference
	 * SwitchOrder7.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation4#mmClientReference
	 * AccountManagementConfirmation4.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmClientReference
	 * RedemptionOrder14.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmClientReference
	 * SwitchOrderStatusAndReason2.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmClientReference
	 * SubscriptionExecution13.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmClientReference
	 * SubscriptionExecution12.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmClientReference
	 * SubscriptionOrder15.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmClientReference
	 * RedemptionOrder15.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmClientReference
	 * RedemptionExecution16.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmClientReference
	 * SubscriptionOrder14.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#mmClientReference
	 * InvestmentFundOrder8.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmClientReference
	 * RedemptionExecution15.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer29#mmClientReference
	 * ISATransfer29.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation18#mmClientReference
	 * ReceiveInformation18.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmClientReference
	 * Transfer35.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer34#mmClientReference
	 * Transfer34.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmClientReference
	 * DeliverInformation19.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation19#mmClientReference
	 * ReceiveInformation19.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason4#mmClientReference
	 * CancellationStatusAndReason4.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer28#mmClientReference
	 * ISATransfer28.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation18#mmClientReference
	 * DeliverInformation18.mmClientReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous investor's identification of an order assigned by a client."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InvestmentFundTransaction, Max35Text> mmClientReference = new MMBusinessAttribute<InvestmentFundTransaction, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmClientReference, InvestmentAccountOpening3.mmClientReference, InvestmentFundOrder11.mmClientReference, SwitchExecution7.mmClientReference,
					InvestmentAccountModification3.mmClientReference, InvestmentFundOrder9.mmClientReference, SwitchOrder7.mmClientReference, AccountManagementConfirmation4.mmClientReference, RedemptionOrder14.mmClientReference,
					SwitchOrderStatusAndReason2.mmClientReference, SubscriptionExecution13.mmClientReference, SubscriptionExecution12.mmClientReference, SubscriptionOrder15.mmClientReference, RedemptionOrder15.mmClientReference,
					RedemptionExecution16.mmClientReference, SubscriptionOrder14.mmClientReference, InvestmentFundOrder8.mmClientReference, RedemptionExecution15.mmClientReference, ISATransfer29.mmClientReference,
					ReceiveInformation18.mmClientReference, Transfer35.mmClientReference, Transfer34.mmClientReference, DeliverInformation19.mmClientReference, ReceiveInformation19.mmClientReference,
					CancellationStatusAndReason4.mmClientReference, ISATransfer28.mmClientReference, DeliverInformation18.mmClientReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of an order assigned by a client.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(InvestmentFundTransaction obj) {
			return obj.getClientReference();
		}

		@Override
		public void setValue(InvestmentFundTransaction obj, Max35Text value) {
			obj.setClientReference(value);
		}
	};
	protected InvestmentFundTransactionTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmInvestmentFundTransactionOutType
	 * FundCashOutBreakdown3.mmInvestmentFundTransactionOutType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#mmInvestmentFundTransactionInType
	 * FundCashInBreakdown3.mmInvestmentFundTransactionInType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType2Choice#mmType
	 * TransactionType2Choice.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType2Choice#mmProprietary
	 * TransactionType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentFundTransactionInType1Choice#mmCode
	 * InvestmentFundTransactionInType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentFundTransactionInType1Choice#mmProprietary
	 * InvestmentFundTransactionInType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentFundTransactionOutType1Choice#mmCode
	 * InvestmentFundTransactionOutType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentFundTransactionOutType1Choice#mmProprietary
	 * InvestmentFundTransactionOutType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType1Choice#mmTransactionType
	 * TransactionType1Choice.mmTransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of investment fund transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InvestmentFundTransaction, InvestmentFundTransactionTypeCode> mmType = new MMBusinessAttribute<InvestmentFundTransaction, InvestmentFundTransactionTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(FundCashOutBreakdown3.mmInvestmentFundTransactionOutType, FundCashInBreakdown3.mmInvestmentFundTransactionInType, TransactionType2Choice.mmType, TransactionType2Choice.mmProprietary,
					InvestmentFundTransactionInType1Choice.mmCode, InvestmentFundTransactionInType1Choice.mmProprietary, InvestmentFundTransactionOutType1Choice.mmCode, InvestmentFundTransactionOutType1Choice.mmProprietary,
					TransactionType1Choice.mmTransactionType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of investment fund transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
		}

		@Override
		public InvestmentFundTransactionTypeCode getValue(InvestmentFundTransaction obj) {
			return obj.getType();
		}

		@Override
		public void setValue(InvestmentFundTransaction obj, InvestmentFundTransactionTypeCode value) {
			obj.setType(value);
		}
	};
	protected Charges transactionCharge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmInvestmentFundTransaction
	 * Charges.mmInvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmChargeDetails
	 * FundCashOutBreakdown3.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#mmChargeDetails
	 * FundCashInBreakdown3.mmChargeDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FeeAndTax1#mmIndividualFee
	 * FeeAndTax1.mmIndividualFee}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fees1#mmIndividualFee
	 * Fees1.mmIndividualFee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charge for the placement of an order and/or for its execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InvestmentFundTransaction, Charges> mmTransactionCharge = new MMBusinessAssociationEnd<InvestmentFundTransaction, Charges>() {
		{
			derivation_lazy = () -> Arrays.asList(FundCashOutBreakdown3.mmChargeDetails, FundCashInBreakdown3.mmChargeDetails, FeeAndTax1.mmIndividualFee, Fees1.mmIndividualFee);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionCharge";
			definition = "Charge for the placement of an order and/or for its execution.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Charges.mmInvestmentFundTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Charges.mmObject();
		}

		@Override
		public Charges getValue(InvestmentFundTransaction obj) {
			return obj.getTransactionCharge();
		}

		@Override
		public void setValue(InvestmentFundTransaction obj, Charges value) {
			obj.setTransactionCharge(value);
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundTransaction
	 * InvestmentAccount.mmInvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmInvestmentAccountDetails
	 * IndividualOrderConfirmationStatusAndReason2.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmInvestmentAccountDetails
	 * SwitchExecution7.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmInvestmentAccountDetails
	 * RedemptionMultipleExecution5.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmInvestmentAccountDetails
	 * RedemptionMultipleOrder6.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmInvestmentAccountDetails
	 * SubscriptionMultipleOrder6.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmInvestmentAccountDetails
	 * SwitchOrder7.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#mmInvestmentAccountDetails
	 * SubscriptionMultipleExecution5.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmInvestmentAccountDetails
	 * SwitchSubscriptionLegOrder6.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason8#mmInvestmentAccountDetails
	 * IndividualOrderStatusAndReason8.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmInvestmentAccountDetails
	 * SubscriptionExecution12.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmInvestmentAccountDetails
	 * SubscriptionOrder15.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmInvestmentAccountDetails
	 * FundOrderData5.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmInvestmentAccountDetails
	 * SwitchRedemptionLegOrder6.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmInvestmentAccountDetails
	 * RedemptionOrder15.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmInvestmentAccountDetails
	 * RedemptionExecution16.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#mmInvestmentAccountDetails
	 * InvestmentFundOrder8.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmInvestmentAccountDetails
	 * SwitchSubscriptionLegExecution4.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmInvestmentAccountDetails
	 * SwitchRedemptionLegExecution4.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#mmInvestmentAccountDetails
	 * SwitchLegReferences2.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference11#mmInvestmentAccountDetails
	 * MessageAndBusinessReference11.mmInvestmentAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account related to an investment fund transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InvestmentFundTransaction, List<InvestmentAccount>> mmInvestmentAccount = new MMBusinessAssociationEnd<InvestmentFundTransaction, List<InvestmentAccount>>() {
		{
			derivation_lazy = () -> Arrays.asList(IndividualOrderConfirmationStatusAndReason2.mmInvestmentAccountDetails, SwitchExecution7.mmInvestmentAccountDetails, RedemptionMultipleExecution5.mmInvestmentAccountDetails,
					RedemptionMultipleOrder6.mmInvestmentAccountDetails, SubscriptionMultipleOrder6.mmInvestmentAccountDetails, SwitchOrder7.mmInvestmentAccountDetails, SubscriptionMultipleExecution5.mmInvestmentAccountDetails,
					SwitchSubscriptionLegOrder6.mmInvestmentAccountDetails, IndividualOrderStatusAndReason8.mmInvestmentAccountDetails, SubscriptionExecution12.mmInvestmentAccountDetails, SubscriptionOrder15.mmInvestmentAccountDetails,
					FundOrderData5.mmInvestmentAccountDetails, SwitchRedemptionLegOrder6.mmInvestmentAccountDetails, RedemptionOrder15.mmInvestmentAccountDetails, RedemptionExecution16.mmInvestmentAccountDetails,
					InvestmentFundOrder8.mmInvestmentAccountDetails, SwitchSubscriptionLegExecution4.mmInvestmentAccountDetails, SwitchRedemptionLegExecution4.mmInvestmentAccountDetails, SwitchLegReferences2.mmInvestmentAccountDetails,
					MessageAndBusinessReference11.mmInvestmentAccountDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Account related to an investment fund transaction.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}

		@Override
		public List<InvestmentAccount> getValue(InvestmentFundTransaction obj) {
			return obj.getInvestmentAccount();
		}

		@Override
		public void setValue(InvestmentFundTransaction obj, List<InvestmentAccount> value) {
			obj.setInvestmentAccount(value);
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundClass> investmentFundClass;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentFundTransaction
	 * InvestmentFundClass.mmInvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3#mmFundOrSubFundDetails
	 * FundDetailedConfirmedCashForecastReport3.mmFundOrSubFundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmFinancialInstrumentDetails
	 * IndividualOrderConfirmationStatusAndReason2.mmFinancialInstrumentDetails}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmFinancialInstrumentDetails
	 * SubscriptionBulkOrder5.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmFinancialInstrumentDetails
	 * RedemptionBulkExecution5.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#mmFinancialInstrumentDetails
	 * SubscriptionBulkExecution4.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmFinancialInstrumentDetails
	 * RedemptionBulkOrder6.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmFinancialInstrumentDetails
	 * RedemptionOrder14.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmGatingOrHoldBackDetails
	 * IndividualOrderStatusAndReason7.mmGatingOrHoldBackDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmFinancialInstrumentDetails
	 * SwitchSubscriptionLegOrder6.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason8#mmFinancialInstrumentDetails
	 * IndividualOrderStatusAndReason8.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmFinancialInstrumentDetails
	 * SubscriptionExecution13.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmFinancialInstrumentIdentification
	 * HoldBackInformation2.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmFinancialInstrumentDetails
	 * FundOrderData5.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmFinancialInstrumentDetails
	 * SwitchRedemptionLegOrder6.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmGatingOrHoldBackDetails
	 * RedemptionExecution16.mmGatingOrHoldBackDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmFinancialInstrumentDetails
	 * SubscriptionOrder14.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#mmFinancialInstrumentDetails
	 * InvestmentFundOrder8.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmFinancialInstrumentDetails
	 * SwitchSubscriptionLegExecution4.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmFinancialInstrumentDetails
	 * RedemptionExecution15.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmGatingOrHoldBackDetails
	 * RedemptionExecution15.mmGatingOrHoldBackDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmGatingOrHoldBackDetails
	 * SwitchRedemptionLegExecution4.mmGatingOrHoldBackDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#mmFinancialInstrumentDetails
	 * SwitchLegReferences2.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#mmFinancialInstrumentIdentification
	 * HoldBackInformation3.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund class to which an investment fund order and its execution are related."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InvestmentFundTransaction, List<InvestmentFundClass>> mmInvestmentFundClass = new MMBusinessAssociationEnd<InvestmentFundTransaction, List<InvestmentFundClass>>() {
		{
			derivation_lazy = () -> Arrays.asList(FundDetailedConfirmedCashForecastReport3.mmFundOrSubFundDetails, IndividualOrderConfirmationStatusAndReason2.mmFinancialInstrumentDetails,
					SubscriptionBulkOrder5.mmFinancialInstrumentDetails, RedemptionBulkExecution5.mmFinancialInstrumentDetails, SubscriptionBulkExecution4.mmFinancialInstrumentDetails, RedemptionBulkOrder6.mmFinancialInstrumentDetails,
					RedemptionOrder14.mmFinancialInstrumentDetails, IndividualOrderStatusAndReason7.mmGatingOrHoldBackDetails, SwitchSubscriptionLegOrder6.mmFinancialInstrumentDetails,
					IndividualOrderStatusAndReason8.mmFinancialInstrumentDetails, SubscriptionExecution13.mmFinancialInstrumentDetails, HoldBackInformation2.mmFinancialInstrumentIdentification, FundOrderData5.mmFinancialInstrumentDetails,
					SwitchRedemptionLegOrder6.mmFinancialInstrumentDetails, RedemptionExecution16.mmGatingOrHoldBackDetails, SubscriptionOrder14.mmFinancialInstrumentDetails, InvestmentFundOrder8.mmFinancialInstrumentDetails,
					SwitchSubscriptionLegExecution4.mmFinancialInstrumentDetails, RedemptionExecution15.mmFinancialInstrumentDetails, RedemptionExecution15.mmGatingOrHoldBackDetails, SwitchRedemptionLegExecution4.mmGatingOrHoldBackDetails,
					SwitchLegReferences2.mmFinancialInstrumentDetails, HoldBackInformation3.mmFinancialInstrumentIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundClass";
			definition = "Investment fund class to which an investment fund order and its execution are related.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentFundTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
		}

		@Override
		public List<InvestmentFundClass> getValue(InvestmentFundTransaction obj) {
			return obj.getInvestmentFundClass();
		}

		@Override
		public void setValue(InvestmentFundTransaction obj, List<InvestmentFundClass> value) {
			obj.setInvestmentFundClass(value);
		}
	};
	protected InvestmentFundTax transactionTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmTransaction
	 * InvestmentFundTax.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax applicable to an investment fund order and/or to its execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InvestmentFundTransaction, InvestmentFundTax> mmTransactionTax = new MMBusinessAssociationEnd<InvestmentFundTransaction, InvestmentFundTax>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionTax";
			definition = "Tax applicable to an investment fund order and/or to its execution.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestmentFundTax.mmTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentFundTax.mmObject();
		}

		@Override
		public InvestmentFundTax getValue(InvestmentFundTransaction obj) {
			return obj.getTransactionTax();
		}

		@Override
		public void setValue(InvestmentFundTransaction obj, InvestmentFundTax value) {
			obj.setTransactionTax(value);
		}
	};
	protected DebitCreditCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmCreditDebit
	 * InvestmentFundTransaction4.mmCreditDebit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Direction of the transaction, ie, securities are received (credited) or delivered (debited)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InvestmentFundTransaction, DebitCreditCode> mmCreditDebitIndicator = new MMBusinessAttribute<InvestmentFundTransaction, DebitCreditCode>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmCreditDebit);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Direction of the transaction, ie, securities are received (credited) or delivered (debited).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		@Override
		public DebitCreditCode getValue(InvestmentFundTransaction obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(InvestmentFundTransaction obj, DebitCreditCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundOrderExecution> investmentFundOrderExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInvestmentFundTransaction
	 * InvestmentFundOrderExecution.mmInvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundOrderExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InvestmentFundTransaction, List<InvestmentFundOrderExecution>> mmInvestmentFundOrderExecution = new MMBusinessAssociationEnd<InvestmentFundTransaction, List<InvestmentFundOrderExecution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrderExecution";
			definition = "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmInvestmentFundTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
		}

		@Override
		public List<InvestmentFundOrderExecution> getValue(InvestmentFundTransaction obj) {
			return obj.getInvestmentFundOrderExecution();
		}

		@Override
		public void setValue(InvestmentFundTransaction obj, List<InvestmentFundOrderExecution> value) {
			obj.setInvestmentFundOrderExecution(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundTransaction";
				definition = "Process of buying, selling, switching or transferring fund units.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentFundTransaction, com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundTransaction,
						InvestmentFundTax.mmTransaction, com.tools20022.repository.entity.InvestmentFundOrder.mmRelatedTransaction, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmInvestmentFundTransaction,
						Charges.mmInvestmentFundTransaction);
				derivationElement_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmEventType);
				superType_lazy = () -> SecuritiesTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundOrder, com.tools20022.repository.entity.InvestmentFundTransaction.mmClientReference,
						com.tools20022.repository.entity.InvestmentFundTransaction.mmType, com.tools20022.repository.entity.InvestmentFundTransaction.mmTransactionCharge,
						com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentAccount, com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundClass,
						com.tools20022.repository.entity.InvestmentFundTransaction.mmTransactionTax, com.tools20022.repository.entity.InvestmentFundTransaction.mmCreditDebitIndicator,
						com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundOrderExecution);
				derivationComponent_lazy = () -> Arrays.asList(InvestmentFundTransactionsByFund3.mmObject(), InvestmentFundTransaction4.mmObject(), TransactionType1Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestmentFundTransaction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<InvestmentFundOrder> getInvestmentFundOrder() {
		return investmentFundOrder == null ? investmentFundOrder = new ArrayList<>() : investmentFundOrder;
	}

	public InvestmentFundTransaction setInvestmentFundOrder(List<com.tools20022.repository.entity.InvestmentFundOrder> investmentFundOrder) {
		this.investmentFundOrder = Objects.requireNonNull(investmentFundOrder);
		return this;
	}

	public Max35Text getClientReference() {
		return clientReference;
	}

	public InvestmentFundTransaction setClientReference(Max35Text clientReference) {
		this.clientReference = Objects.requireNonNull(clientReference);
		return this;
	}

	public InvestmentFundTransactionTypeCode getType() {
		return type;
	}

	public InvestmentFundTransaction setType(InvestmentFundTransactionTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Charges getTransactionCharge() {
		return transactionCharge;
	}

	public InvestmentFundTransaction setTransactionCharge(Charges transactionCharge) {
		this.transactionCharge = Objects.requireNonNull(transactionCharge);
		return this;
	}

	public List<InvestmentAccount> getInvestmentAccount() {
		return investmentAccount == null ? investmentAccount = new ArrayList<>() : investmentAccount;
	}

	public InvestmentFundTransaction setInvestmentAccount(List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount) {
		this.investmentAccount = Objects.requireNonNull(investmentAccount);
		return this;
	}

	public List<InvestmentFundClass> getInvestmentFundClass() {
		return investmentFundClass == null ? investmentFundClass = new ArrayList<>() : investmentFundClass;
	}

	public InvestmentFundTransaction setInvestmentFundClass(List<com.tools20022.repository.entity.InvestmentFundClass> investmentFundClass) {
		this.investmentFundClass = Objects.requireNonNull(investmentFundClass);
		return this;
	}

	public InvestmentFundTax getTransactionTax() {
		return transactionTax;
	}

	public InvestmentFundTransaction setTransactionTax(InvestmentFundTax transactionTax) {
		this.transactionTax = Objects.requireNonNull(transactionTax);
		return this;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public InvestmentFundTransaction setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public List<InvestmentFundOrderExecution> getInvestmentFundOrderExecution() {
		return investmentFundOrderExecution == null ? investmentFundOrderExecution = new ArrayList<>() : investmentFundOrderExecution;
	}

	public InvestmentFundTransaction setInvestmentFundOrderExecution(List<com.tools20022.repository.entity.InvestmentFundOrderExecution> investmentFundOrderExecution) {
		this.investmentFundOrderExecution = Objects.requireNonNull(investmentFundOrderExecution);
		return this;
	}
}