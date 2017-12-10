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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Set of parameters used to calculate an interest amount.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InterestCalculation" src="doc-files/InterestCalculation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDayCountBasis
 * InterestCalculation.mmDayCountBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InterestCalculation#mmRate
 * InterestCalculation.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterest
 * InterestCalculation.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateType
 * InterestCalculation.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestPeriod
 * InterestCalculation.mmInterestPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRelatedIndex
 * InterestCalculation.mmRelatedIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestAccrualDate
 * InterestCalculation.mmInterestAccrualDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCalculationMethod
 * InterestCalculation.mmCalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmVariableInterest
 * InterestCalculation.mmVariableInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestType
 * InterestCalculation.mmInterestType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateValidityRange
 * InterestCalculation.mmRateValidityRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestMethod
 * InterestCalculation.mmInterestMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCalculationFrequency
 * InterestCalculation.mmCalculationFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCalculationDate
 * InterestCalculation.mmCalculationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCharges
 * InterestCalculation.mmCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDebtInstrument
 * InterestCalculation.mmDebtInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmSpread
 * InterestCalculation.mmSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmPaymentFrequency
 * InterestCalculation.mmPaymentFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRelatedInterestManagement
 * InterestCalculation.mmRelatedInterestManagement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedInterestCalculation
 * DateTimePeriod.mmRelatedInterestCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRange#mmRelatedInterest
 * AmountRange.mmRelatedInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmRelatedInterest
 * Charges.mmRelatedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
 * Interest.mmInterestCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmNextInterest
 * Debt.mmNextInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmInterestCalculation
 * VariableInterest.mmInterestCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmRelatedInterest
 * Spread.mmRelatedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmInterestCalculation
 * InterestManagement.mmInterestCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat3Choice
 * InterestComputationMethodFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType19Choice
 * RateType19Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestComputationMethod2Choice
 * InterestComputationMethod2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType35Choice
 * RateType35Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat4Choice
 * InterestComputationMethodFormat4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType33Choice
 * RateType33Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestCalculation4
 * InterestCalculation4}</li>
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
 * "InterestCalculation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Set of parameters used to calculate an interest amount."</li>
 * </ul>
 */
public class InterestCalculation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected InterestComputationMethodCode dayCountBasis;
	/**
	 * Identifies the computation method of accrued interest of the related
	 * financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
	 * InterestComputationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat3Choice#mmCode
	 * InterestComputationMethodFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat3Choice#mmProprietary
	 * InterestComputationMethodFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethod2Choice#mmCode
	 * InterestComputationMethod2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethod2Choice#mmProprietary
	 * InterestComputationMethod2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmInterestComputationMethod
	 * SecuritiesFinancing10.mmInterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmDayCountBasis
	 * FinancialInstrumentAttributes44.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmDayCountBasis
	 * InterestAmount1.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmDayCountBasis
	 * InterestAmount2.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmDayCountBasis
	 * FinancialInstrumentAttributes63.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmDayCountBasis
	 * FinancialInstrumentAttributes64.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmInterestComputationMethod
	 * SecuritiesFinancingTransactionDetails28.mmInterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmInterestComputationMethod
	 * SecuritiesFinancingTransactionDetails27.mmInterestComputationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat4Choice#mmCode
	 * InterestComputationMethodFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat4Choice#mmProprietary
	 * InterestComputationMethodFormat4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmDayCountBasis
	 * CollateralValuation5.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmDayCountBasis
	 * FinancialInstrumentAttributes79.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmDayCountBasis
	 * FinancialInstrumentAttributes81.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmDayCountBasis
	 * FinancialInstrumentAttributes80.mmDayCountBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayCountBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the computation method of accrued interest of the related financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDayCountBasis = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InterestComputationMethodFormat3Choice.mmCode, InterestComputationMethodFormat3Choice.mmProprietary, InterestComputationMethod2Choice.mmCode, InterestComputationMethod2Choice.mmProprietary,
					SecuritiesFinancing10.mmInterestComputationMethod, FinancialInstrumentAttributes44.mmDayCountBasis, InterestAmount1.mmDayCountBasis, InterestAmount2.mmDayCountBasis, FinancialInstrumentAttributes63.mmDayCountBasis,
					FinancialInstrumentAttributes64.mmDayCountBasis, SecuritiesFinancingTransactionDetails28.mmInterestComputationMethod, SecuritiesFinancingTransactionDetails27.mmInterestComputationMethod,
					InterestComputationMethodFormat4Choice.mmCode, InterestComputationMethodFormat4Choice.mmProprietary, CollateralValuation5.mmDayCountBasis, FinancialInstrumentAttributes79.mmDayCountBasis,
					FinancialInstrumentAttributes81.mmDayCountBasis, FinancialInstrumentAttributes80.mmDayCountBasis);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DayCountBasis";
			definition = "Identifies the computation method of accrued interest of the related financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestComputationMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getDayCountBasis", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate rate;
	/**
	 * Percentage charged for the use of an amount of money, usually expressed
	 * at an annual rate. The interest rate is the ratio of the amount of
	 * interest paid during a certain period of time compared to the principal
	 * amount of the interest bearing financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Rate2#mmRate Rate2.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmBorrowingRate
	 * SecuritiesFinancing10.mmBorrowingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmInterestRate
	 * FinancialInstrumentAttributes44.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmNextInterestRate
	 * FinancialInstrumentAttributes44.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmInterestRate
	 * FinancialInstrumentAttributes63.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmNextInterestRate
	 * FinancialInstrumentAttributes63.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmInterestRate
	 * FinancialInstrumentAttributes64.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmNextInterestRate
	 * FinancialInstrumentAttributes64.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmInterestRate
	 * InterestCalculation4.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmInterestRate
	 * FinancialInstrumentAttributes79.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmNextInterestRate
	 * FinancialInstrumentAttributes79.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmInterestRate
	 * FinancialInstrumentAttributes81.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmNextInterestRate
	 * FinancialInstrumentAttributes81.mmNextInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmInterestRate
	 * FinancialInstrumentAttributes80.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmNextInterestRate
	 * FinancialInstrumentAttributes80.mmNextInterestRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Rate2.mmRate, SecuritiesFinancing10.mmBorrowingRate, FinancialInstrumentAttributes44.mmInterestRate, FinancialInstrumentAttributes44.mmNextInterestRate,
					FinancialInstrumentAttributes63.mmInterestRate, FinancialInstrumentAttributes63.mmNextInterestRate, FinancialInstrumentAttributes64.mmInterestRate, FinancialInstrumentAttributes64.mmNextInterestRate,
					InterestCalculation4.mmInterestRate, FinancialInstrumentAttributes79.mmInterestRate, FinancialInstrumentAttributes79.mmNextInterestRate, FinancialInstrumentAttributes81.mmInterestRate,
					FinancialInstrumentAttributes81.mmNextInterestRate, FinancialInstrumentAttributes80.mmInterestRate, FinancialInstrumentAttributes80.mmNextInterestRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Interest> interest;
	/**
	 * Interest resulting from the interest calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
	 * Interest.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest resulting from the interest calculation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest resulting from the interest calculation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmInterestCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected InterestRateTypeCode rateType;
	/**
	 * Specifies the type of rate used to calculate the interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestRateTypeCode
	 * InterestRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType19Choice#mmCode
	 * RateType19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType19Choice#mmProprietary
	 * RateType19Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmRateType
	 * SecuritiesFinancing10.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmRateType
	 * SecuritiesFinancingTransactionDetails28.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmRateType
	 * SecuritiesFinancingTransactionDetails27.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmRateType
	 * SecuritiesFinancingTransactionDetails29.mmRateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType35Choice#mmCode
	 * RateType35Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType35Choice#mmProprietary
	 * RateType35Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType33Choice#mmCode
	 * RateType33Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType33Choice#mmProprietary
	 * RateType33Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmRateType
	 * SecuritiesFinancingTransactionDetails35.mmRateType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of rate used to calculate the interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRateType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RateType19Choice.mmCode, RateType19Choice.mmProprietary, SecuritiesFinancing10.mmRateType, SecuritiesFinancingTransactionDetails28.mmRateType,
					SecuritiesFinancingTransactionDetails27.mmRateType, SecuritiesFinancingTransactionDetails29.mmRateType, RateType35Choice.mmCode, RateType35Choice.mmProprietary, RateType33Choice.mmCode, RateType33Choice.mmProprietary,
					SecuritiesFinancingTransactionDetails35.mmRateType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RateType";
			definition = "Specifies the type of rate used to calculate the interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestRateTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getRateType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod interestPeriod;
	/**
	 * Period during which the interest rate has been applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedInterestCalculation
	 * DateTimePeriod.mmRelatedInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod1#mmInterestPeriod
	 * CorporateActionPeriod1.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmInterestPeriod
	 * InterestAmount1.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmInterestPeriod
	 * InterestAmount2.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmInterestPeriod
	 * CorporateActionPeriod10.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#mmInterestPeriod
	 * InterestStatement4.mmInterestPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the interest rate has been applied."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInterestPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod1.mmInterestPeriod, InterestAmount1.mmInterestPeriod, InterestAmount2.mmInterestPeriod, CorporateActionPeriod10.mmInterestPeriod, InterestStatement4.mmInterestPeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestPeriod";
			definition = "Period during which the interest rate has been applied.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedInterestCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected PercentageRate relatedIndex;
	/**
	 * Index rate related to the interest rate of the forthcoming interest
	 * payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate1#mmRelatedIndex
	 * CorporateActionRate1.mmRelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmRelatedIndex
	 * CorporateActionRate66.mmRelatedIndex}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Index rate related to the interest rate of the forthcoming interest payment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRelatedIndex = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate1.mmRelatedIndex, CorporateActionRate66.mmRelatedIndex);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedIndex";
			definition = "Index rate related to the interest rate of the forthcoming interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getRelatedIndex", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime interestAccrualDate;
	/**
	 * Start date used for calculating accrued interest on debt instruments
	 * which are being sold between interest payment dates. Often but not always
	 * the same as the issue date and the dated date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestAccrualDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Start date used for calculating accrued interest on debt instruments which are being sold between interest payment dates. Often but not always the same as the issue date and the dated date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInterestAccrualDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestAccrualDate";
			definition = "Start date used for calculating accrued interest on debt instruments which are being sold between interest payment dates. Often but not always the same as the issue date and the dated date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getInterestAccrualDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CalculationMethodCode calculationMethod;
	/**
	 * Specifies whether the interest is simple or compounded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationMethodCode
	 * CalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmCalculationMethod
	 * InterestAmount1.mmCalculationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmCalculationMethod
	 * InterestAmount2.mmCalculationMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the interest is simple or compounded."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCalculationMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InterestAmount1.mmCalculationMethod, InterestAmount2.mmCalculationMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationMethod";
			definition = "Specifies whether the interest is simple or compounded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CalculationMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getCalculationMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.VariableInterest> variableInterest;
	/**
	 * Specifies the parameters to be used for variable interest payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmInterestCalculation
	 * VariableInterest.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.VariableInterest
	 * VariableInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the parameters to be used for variable interest payments."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmVariableInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableInterest";
			definition = "Specifies the parameters to be used for variable interest payments.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmInterestCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmObject();
		}
	};
	protected InterestCode interestType;
	/**
	 * Specifies the type of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.InterestCode
	 * InterestCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInterestType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestType";
			definition = "Specifies the type of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getInterestType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AmountRange rateValidityRange;
	/**
	 * Specifies the amount range for which the interest rate is applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange#mmRelatedInterest
	 * AmountRange.mmRelatedInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AmountRange
	 * AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateValidityRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount range for which the interest rate is applicable."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRateValidityRange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RateValidityRange";
			definition = "Specifies the amount range for which the interest rate is applicable.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AmountRange.mmRelatedInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
		}
	};
	protected InterestMethodCode interestMethod;
	/**
	 * Indicates whether the interest will be settled in cash or rolled in the
	 * existing collateral balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestMethodCode
	 * InterestMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmInterestMethod
	 * InterestAmount1.mmInterestMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResult1#mmInterestMethod
	 * InterestResult1.mmInterestMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmInterestMethod
	 * InterestAmount2.mmInterestMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest will be settled in cash or rolled in the existing collateral balance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInterestMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InterestAmount1.mmInterestMethod, InterestResult1.mmInterestMethod, InterestAmount2.mmInterestMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestMethod";
			definition = "Indicates whether the interest will be settled in cash or rolled in the existing collateral balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getInterestMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FrequencyCode calculationFrequency;
	/**
	 * Specifies the periodicity of the calculation of the interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmCalculationFrequency
	 * InterestAmount1.mmCalculationFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmCalculationFrequency
	 * InterestAmount2.mmCalculationFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateContractTerm2#mmUnit
	 * InterestRateContractTerm2.mmUnit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the periodicity of the calculation of the interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCalculationFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InterestAmount1.mmCalculationFrequency, InterestAmount2.mmCalculationFrequency, InterestRateContractTerm2.mmUnit);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationFrequency";
			definition = "Specifies the periodicity of the calculation of the interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getCalculationFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate calculationDate;
	/**
	 * Indicates the calculation date of the interest amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmCalculationDate
	 * InterestCalculation4.mmCalculationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the calculation date of the interest amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCalculationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InterestCalculation4.mmCalculationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Indicates the calculation date of the interest amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getCalculationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Charges> charges;
	/**
	 * Specifies the charges on interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmRelatedInterest
	 * Charges.mmRelatedInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the charges on interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCharges = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Specifies the charges on interest.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.mmRelatedInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
		}
	};
	protected Debt debtInstrument;
	/**
	 * Debt for which a next interest is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmNextInterest
	 * Debt.mmNextInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debt for which a next interest is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDebtInstrument = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebtInstrument";
			definition = "Debt for which a next interest is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.mmNextInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Spread> spread;
	/**
	 * Specifies the difference between two interests.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmRelatedInterest
	 * Spread.mmRelatedInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the difference between two interests."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSpread = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Specifies the difference between two interests.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.mmRelatedInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
		}
	};
	protected FrequencyCode paymentFrequency;
	/**
	 * Specifies the frequency of an interest payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmPaymentFrequency
	 * FinancialInstrumentStipulations2.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmPaymentFrequency
	 * FinancialInstrumentAttributes44.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmPaymentFrequency
	 * FinancialInstrumentAttributes63.mmPaymentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmPaymentFrequency
	 * FinancialInstrumentAttributes64.mmPaymentFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the frequency of an interest payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPaymentFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations2.mmPaymentFrequency, FinancialInstrumentAttributes44.mmPaymentFrequency, FinancialInstrumentAttributes63.mmPaymentFrequency,
					FinancialInstrumentAttributes64.mmPaymentFrequency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentFrequency";
			definition = "Specifies the frequency of an interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestCalculation.class.getMethod("getPaymentFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InterestManagement relatedInterestManagement;
	/**
	 * Interest management process which requires interest calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmInterestCalculation
	 * InterestManagement.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestManagement
	 * InterestManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInterestManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest management process which requires interest calculation.                        "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInterestManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInterestManagement";
			definition = "Interest management process which requires interest calculation.                        ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmInterestCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestCalculation";
				definition = "Set of parameters used to calculate an interest amount.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmRelatedInterestCalculation, com.tools20022.repository.entity.AmountRange.mmRelatedInterest,
						com.tools20022.repository.entity.Charges.mmRelatedInterest, com.tools20022.repository.entity.Interest.mmInterestCalculation, com.tools20022.repository.entity.Debt.mmNextInterest,
						com.tools20022.repository.entity.VariableInterest.mmInterestCalculation, com.tools20022.repository.entity.Spread.mmRelatedInterest, com.tools20022.repository.entity.InterestManagement.mmInterestCalculation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InterestCalculation.mmDayCountBasis, com.tools20022.repository.entity.InterestCalculation.mmRate,
						com.tools20022.repository.entity.InterestCalculation.mmInterest, com.tools20022.repository.entity.InterestCalculation.mmRateType, com.tools20022.repository.entity.InterestCalculation.mmInterestPeriod,
						com.tools20022.repository.entity.InterestCalculation.mmRelatedIndex, com.tools20022.repository.entity.InterestCalculation.mmInterestAccrualDate,
						com.tools20022.repository.entity.InterestCalculation.mmCalculationMethod, com.tools20022.repository.entity.InterestCalculation.mmVariableInterest, com.tools20022.repository.entity.InterestCalculation.mmInterestType,
						com.tools20022.repository.entity.InterestCalculation.mmRateValidityRange, com.tools20022.repository.entity.InterestCalculation.mmInterestMethod,
						com.tools20022.repository.entity.InterestCalculation.mmCalculationFrequency, com.tools20022.repository.entity.InterestCalculation.mmCalculationDate, com.tools20022.repository.entity.InterestCalculation.mmCharges,
						com.tools20022.repository.entity.InterestCalculation.mmDebtInstrument, com.tools20022.repository.entity.InterestCalculation.mmSpread, com.tools20022.repository.entity.InterestCalculation.mmPaymentFrequency,
						com.tools20022.repository.entity.InterestCalculation.mmRelatedInterestManagement);
				derivationComponent_lazy = () -> Arrays.asList(Rate2.mmObject(), InterestComputationMethodFormat3Choice.mmObject(), RateType19Choice.mmObject(), InterestComputationMethod2Choice.mmObject(), RateType35Choice.mmObject(),
						InterestComputationMethodFormat4Choice.mmObject(), RateType33Choice.mmObject(), InterestCalculation4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return InterestCalculation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public InterestComputationMethodCode getDayCountBasis() {
		return dayCountBasis;
	}

	public void setDayCountBasis(InterestComputationMethodCode dayCountBasis) {
		this.dayCountBasis = dayCountBasis;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public void setRate(PercentageRate rate) {
		this.rate = rate;
	}

	public List<Interest> getInterest() {
		return interest;
	}

	public void setInterest(List<com.tools20022.repository.entity.Interest> interest) {
		this.interest = interest;
	}

	public InterestRateTypeCode getRateType() {
		return rateType;
	}

	public void setRateType(InterestRateTypeCode rateType) {
		this.rateType = rateType;
	}

	public DateTimePeriod getInterestPeriod() {
		return interestPeriod;
	}

	public void setInterestPeriod(com.tools20022.repository.entity.DateTimePeriod interestPeriod) {
		this.interestPeriod = interestPeriod;
	}

	public PercentageRate getRelatedIndex() {
		return relatedIndex;
	}

	public void setRelatedIndex(PercentageRate relatedIndex) {
		this.relatedIndex = relatedIndex;
	}

	public ISODateTime getInterestAccrualDate() {
		return interestAccrualDate;
	}

	public void setInterestAccrualDate(ISODateTime interestAccrualDate) {
		this.interestAccrualDate = interestAccrualDate;
	}

	public CalculationMethodCode getCalculationMethod() {
		return calculationMethod;
	}

	public void setCalculationMethod(CalculationMethodCode calculationMethod) {
		this.calculationMethod = calculationMethod;
	}

	public List<VariableInterest> getVariableInterest() {
		return variableInterest;
	}

	public void setVariableInterest(List<com.tools20022.repository.entity.VariableInterest> variableInterest) {
		this.variableInterest = variableInterest;
	}

	public InterestCode getInterestType() {
		return interestType;
	}

	public void setInterestType(InterestCode interestType) {
		this.interestType = interestType;
	}

	public AmountRange getRateValidityRange() {
		return rateValidityRange;
	}

	public void setRateValidityRange(com.tools20022.repository.entity.AmountRange rateValidityRange) {
		this.rateValidityRange = rateValidityRange;
	}

	public InterestMethodCode getInterestMethod() {
		return interestMethod;
	}

	public void setInterestMethod(InterestMethodCode interestMethod) {
		this.interestMethod = interestMethod;
	}

	public FrequencyCode getCalculationFrequency() {
		return calculationFrequency;
	}

	public void setCalculationFrequency(FrequencyCode calculationFrequency) {
		this.calculationFrequency = calculationFrequency;
	}

	public ISODate getCalculationDate() {
		return calculationDate;
	}

	public void setCalculationDate(ISODate calculationDate) {
		this.calculationDate = calculationDate;
	}

	public List<Charges> getCharges() {
		return charges;
	}

	public void setCharges(List<com.tools20022.repository.entity.Charges> charges) {
		this.charges = charges;
	}

	public Debt getDebtInstrument() {
		return debtInstrument;
	}

	public void setDebtInstrument(com.tools20022.repository.entity.Debt debtInstrument) {
		this.debtInstrument = debtInstrument;
	}

	public List<Spread> getSpread() {
		return spread;
	}

	public void setSpread(List<com.tools20022.repository.entity.Spread> spread) {
		this.spread = spread;
	}

	public FrequencyCode getPaymentFrequency() {
		return paymentFrequency;
	}

	public void setPaymentFrequency(FrequencyCode paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}

	public InterestManagement getRelatedInterestManagement() {
		return relatedInterestManagement;
	}

	public void setRelatedInterestManagement(com.tools20022.repository.entity.InterestManagement relatedInterestManagement) {
		this.relatedInterestManagement = relatedInterestManagement;
	}
}