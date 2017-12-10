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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Prices related to a corporate action.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionPrice" src="doc-files/CorporateActionPrice.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCorporateActionEvent
 * CorporateActionPrice.mmCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCorporateActionExercisePrice
 * CorporateActionPrice.mmCorporateActionExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPriceReceivedPerProduct
 * CorporateActionPrice.mmGenericCashPriceReceivedPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPricePaidPerProduct
 * CorporateActionPrice.mmGenericCashPricePaidPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashInLieuOfSharePrice
 * CorporateActionPrice.mmCashInLieuOfSharePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmOverSubscriptionDepositPrice
 * CorporateActionPrice.mmOverSubscriptionDepositPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashValueForTax
 * CorporateActionPrice.mmCashValueForTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmPricingCalculation
 * CorporateActionPrice.mmPricingCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmExercisePriceRelatedEvent
 * SecuritiesPricing.mmExercisePriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmGenericCashPriceReceivedPerProductRelatedEvent
 * SecuritiesPricing.mmGenericCashPriceReceivedPerProductRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmGenericCashPricePaidPerProductRelatedEvent
 * SecuritiesPricing.mmGenericCashPricePaidPerProductRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashInLieuOfSharePriceRelatedEvent
 * SecuritiesPricing.mmCashInLieuOfSharePriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmOverSubscriptionDepositPriceRelatedEvent
 * SecuritiesPricing.mmOverSubscriptionDepositPriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashValueForTaxRelatedEvent
 * SecuritiesPricing.mmCashValueForTaxRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedCorporateActionPrice
 * SecuritiesPricing.mmRelatedCorporateActionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
 * CorporateActionEvent.mmCorporateActionPrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice4#mmIndicativePrice
 * CorporateActionPrice4.mmIndicativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice4#mmMarketPrice
 * CorporateActionPrice4.mmMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#mmIndicativeOrMarketPrice
 * CorporateActionPrice59.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#mmIndicativeOrMarketPrice
 * CorporateActionPrice56.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice60#mmIndicativeOrMarketPrice
 * CorporateActionPrice60.mmIndicativeOrMarketPrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice2
 * CorporateActionPrice2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice1
 * CorporateActionPrice1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice4
 * CorporateActionPrice4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice59
 * CorporateActionPrice59}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice56
 * CorporateActionPrice56}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice60
 * CorporateActionPrice60}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice58
 * CorporateActionPrice58}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice61
 * CorporateActionPrice61}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice57
 * CorporateActionPrice57}</li>
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
 * "CorporateActionPrice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Prices related to a corporate action."</li>
 * </ul>
 */
public class CorporateActionPrice {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionEvent corporateActionEvent;
	/**
	 * Corporate event for which a price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate event for which a price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate event for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected SecuritiesPricing corporateActionExercisePrice;
	/**
	 * 1. Price at which security will be purchased/sold if warrant is
	 * exercised, either as an actual amount or a percentage.<br>
	 * 2. Price at which a bond is converted to underlying security either as an
	 * actual amount or a percentage.<br>
	 * 3. Strike price of an option, represented either as an actual amount or a
	 * percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmExercisePriceRelatedEvent
	 * SecuritiesPricing.mmExercisePriceRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmExercisePrice
	 * CorporateActionPrice1.mmExercisePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionExercisePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "1. Price at which security will be purchased/sold if warrant is exercised, either as an actual amount or a percentage.\r\n2. Price at which a bond is converted to underlying security either as an actual amount or a percentage.\r\n3. Strike price of an option, represented either as an actual amount or a percentage."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionExercisePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPrice1.mmExercisePrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionExercisePrice";
			definition = "1. Price at which security will be purchased/sold if warrant is exercised, either as an actual amount or a percentage.\r\n2. Price at which a bond is converted to underlying security either as an actual amount or a percentage.\r\n3. Strike price of an option, represented either as an actual amount or a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmExercisePriceRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing genericCashPriceReceivedPerProduct;
	/**
	 * Generic cash price received per product by the underlying security holder
	 * either as a percentage or an amount, eg, redemption price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmGenericCashPriceReceivedPerProductRelatedEvent
	 * SecuritiesPricing.mmGenericCashPriceReceivedPerProductRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice1.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice59.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails23#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails23.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice56.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice60#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice60.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails22#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails22.mmGenericCashPriceReceivedPerProduct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic cash price received per product by the underlying security holder either as a percentage or an amount, eg, redemption price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGenericCashPriceReceivedPerProduct = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPrice1.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice59.mmGenericCashPriceReceivedPerProduct, PriceDetails23.mmGenericCashPriceReceivedPerProduct,
					CorporateActionPrice56.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice60.mmGenericCashPriceReceivedPerProduct, PriceDetails22.mmGenericCashPriceReceivedPerProduct);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GenericCashPriceReceivedPerProduct";
			definition = "Generic cash price received per product by the underlying security holder either as a percentage or an amount, eg, redemption price.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmGenericCashPriceReceivedPerProductRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing genericCashPricePaidPerProduct;
	/**
	 * Amount included in the dividend/NAV that is identified as gains directly
	 * or indirectly derived from interest payments within the scope of the EU
	 * Savings directive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmGenericCashPricePaidPerProductRelatedEvent
	 * SecuritiesPricing.mmGenericCashPricePaidPerProductRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice1.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice59.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails23#mmGenericCashPricePaidPerProduct
	 * PriceDetails23.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice56.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice60#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice60.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails22#mmGenericCashPricePaidPerProduct
	 * PriceDetails22.mmGenericCashPricePaidPerProduct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePaidPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGenericCashPricePaidPerProduct = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPrice1.mmGenericCashPricePaidPerProduct, CorporateActionPrice59.mmGenericCashPricePaidPerProduct, PriceDetails23.mmGenericCashPricePaidPerProduct,
					CorporateActionPrice56.mmGenericCashPricePaidPerProduct, CorporateActionPrice60.mmGenericCashPricePaidPerProduct, PriceDetails22.mmGenericCashPricePaidPerProduct);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GenericCashPricePaidPerProduct";
			definition = "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmGenericCashPricePaidPerProductRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing cashInLieuOfSharePrice;
	/**
	 * Cash disbursement in lieu of equities; usually in lieu of fractional
	 * quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashInLieuOfSharePriceRelatedEvent
	 * SecuritiesPricing.mmCashInLieuOfSharePriceRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmCashInLieuOfSharePrice
	 * CorporateActionPrice1.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#mmCashInLieuOfSharePrice
	 * CorporateActionPrice59.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#mmCashInLieuOfSharePrice
	 * CorporateActionPrice56.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice58#mmCashInLieuOfSharePrice
	 * CorporateActionPrice58.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice61#mmCashInLieuOfSharePrice
	 * CorporateActionPrice61.mmCashInLieuOfSharePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfSharePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash disbursement in lieu of equities; usually in lieu of fractional quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashInLieuOfSharePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPrice1.mmCashInLieuOfSharePrice, CorporateActionPrice59.mmCashInLieuOfSharePrice, CorporateActionPrice56.mmCashInLieuOfSharePrice,
					CorporateActionPrice58.mmCashInLieuOfSharePrice, CorporateActionPrice61.mmCashInLieuOfSharePrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashInLieuOfSharePrice";
			definition = "Cash disbursement in lieu of equities; usually in lieu of fractional quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmCashInLieuOfSharePriceRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing overSubscriptionDepositPrice;
	/**
	 * Amount of money required per over-subscribed equity as defined by the
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmOverSubscriptionDepositPriceRelatedEvent
	 * SecuritiesPricing.mmOverSubscriptionDepositPriceRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice1.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice58#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice58.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice61#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice61.mmOverSubscriptionDepositPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverSubscriptionDepositPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money required per over-subscribed equity as defined by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOverSubscriptionDepositPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPrice1.mmOverSubscriptionDepositPrice, CorporateActionPrice58.mmOverSubscriptionDepositPrice, CorporateActionPrice61.mmOverSubscriptionDepositPrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OverSubscriptionDepositPrice";
			definition = "Amount of money required per over-subscribed equity as defined by the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmOverSubscriptionDepositPriceRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing cashValueForTax;
	/**
	 * Cash value of resulting securities proceeds for tax calculation and/or
	 * reporting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashValueForTaxRelatedEvent
	 * SecuritiesPricing.mmCashValueForTaxRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#mmCashValueForTax
	 * CorporateActionPrice59.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#mmCashValueForTax
	 * CorporateActionPrice56.mmCashValueForTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashValueForTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash value of resulting securities proceeds for tax calculation and/or reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashValueForTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPrice59.mmCashValueForTax, CorporateActionPrice56.mmCashValueForTax);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashValueForTax";
			definition = "Cash value of resulting securities proceeds for tax calculation and/or reporting.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmCashValueForTaxRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing pricingCalculation;
	/**
	 * Specifies the parameters taken into account to calculate the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedCorporateActionPrice
	 * SecuritiesPricing.mmRelatedCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PricingCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the parameters taken into account to calculate the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPricingCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PricingCalculation";
			definition = "Specifies the parameters taken into account to calculate the price.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmRelatedCorporateActionPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice";
				definition = "Prices related to a corporate action.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmExercisePriceRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.mmGenericCashPriceReceivedPerProductRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmGenericCashPricePaidPerProductRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.mmCashInLieuOfSharePriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmOverSubscriptionDepositPriceRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.mmCashValueForTaxRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmRelatedCorporateActionPrice,
						com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionPrice);
				derivationElement_lazy = () -> Arrays.asList(CorporateActionPrice4.mmIndicativePrice, CorporateActionPrice4.mmMarketPrice, CorporateActionPrice59.mmIndicativeOrMarketPrice, CorporateActionPrice56.mmIndicativeOrMarketPrice,
						CorporateActionPrice60.mmIndicativeOrMarketPrice);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionPrice.mmCorporateActionEvent, com.tools20022.repository.entity.CorporateActionPrice.mmCorporateActionExercisePrice,
						com.tools20022.repository.entity.CorporateActionPrice.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.entity.CorporateActionPrice.mmGenericCashPricePaidPerProduct,
						com.tools20022.repository.entity.CorporateActionPrice.mmCashInLieuOfSharePrice, com.tools20022.repository.entity.CorporateActionPrice.mmOverSubscriptionDepositPrice,
						com.tools20022.repository.entity.CorporateActionPrice.mmCashValueForTax, com.tools20022.repository.entity.CorporateActionPrice.mmPricingCalculation);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionPrice2.mmObject(), CorporateActionPrice1.mmObject(), CorporateActionPrice4.mmObject(), CorporateActionPrice59.mmObject(), CorporateActionPrice56.mmObject(),
						CorporateActionPrice60.mmObject(), CorporateActionPrice58.mmObject(), CorporateActionPrice61.mmObject(), CorporateActionPrice57.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionPrice.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionEvent getCorporateActionEvent() {
		return corporateActionEvent;
	}

	public void setCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent corporateActionEvent) {
		this.corporateActionEvent = corporateActionEvent;
	}

	public SecuritiesPricing getCorporateActionExercisePrice() {
		return corporateActionExercisePrice;
	}

	public void setCorporateActionExercisePrice(com.tools20022.repository.entity.SecuritiesPricing corporateActionExercisePrice) {
		this.corporateActionExercisePrice = corporateActionExercisePrice;
	}

	public SecuritiesPricing getGenericCashPriceReceivedPerProduct() {
		return genericCashPriceReceivedPerProduct;
	}

	public void setGenericCashPriceReceivedPerProduct(com.tools20022.repository.entity.SecuritiesPricing genericCashPriceReceivedPerProduct) {
		this.genericCashPriceReceivedPerProduct = genericCashPriceReceivedPerProduct;
	}

	public SecuritiesPricing getGenericCashPricePaidPerProduct() {
		return genericCashPricePaidPerProduct;
	}

	public void setGenericCashPricePaidPerProduct(com.tools20022.repository.entity.SecuritiesPricing genericCashPricePaidPerProduct) {
		this.genericCashPricePaidPerProduct = genericCashPricePaidPerProduct;
	}

	public SecuritiesPricing getCashInLieuOfSharePrice() {
		return cashInLieuOfSharePrice;
	}

	public void setCashInLieuOfSharePrice(com.tools20022.repository.entity.SecuritiesPricing cashInLieuOfSharePrice) {
		this.cashInLieuOfSharePrice = cashInLieuOfSharePrice;
	}

	public SecuritiesPricing getOverSubscriptionDepositPrice() {
		return overSubscriptionDepositPrice;
	}

	public void setOverSubscriptionDepositPrice(com.tools20022.repository.entity.SecuritiesPricing overSubscriptionDepositPrice) {
		this.overSubscriptionDepositPrice = overSubscriptionDepositPrice;
	}

	public SecuritiesPricing getCashValueForTax() {
		return cashValueForTax;
	}

	public void setCashValueForTax(com.tools20022.repository.entity.SecuritiesPricing cashValueForTax) {
		this.cashValueForTax = cashValueForTax;
	}

	public SecuritiesPricing getPricingCalculation() {
		return pricingCalculation;
	}

	public void setPricingCalculation(com.tools20022.repository.entity.SecuritiesPricing pricingCalculation) {
		this.pricingCalculation = pricingCalculation;
	}
}