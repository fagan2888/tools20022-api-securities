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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09;

/**
 * If CorporateActionGeneralInformation/EventType/Code is RHDI
 * (IntermediateSecuritiesDistribution), then
 * CorporateActionMovementDetails/IntermediateSecuritiesDistributionType must be
 * present in at least one occurrence of CorporateActionMovementDetails.<br>
 * (MT 564 NVR C11).
 */
public class ConstraintIntermediateSecuritiesDistributionRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09
	 * CorporateActionMovementPreliminaryAdviceV09}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CorporateActionMovementDetails[*]/IntermediateSecuritiesDistributionType&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/CorporateActionGeneralInformation/EventType/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;IntermediateSecuritiesDistribution&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistributionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionGeneralInformation/EventType/Code is RHDI (IntermediateSecuritiesDistribution), then CorporateActionMovementDetails/IntermediateSecuritiesDistributionType must be present in at least one occurrence of CorporateActionMovementDetails.\r\n(MT 564 NVR C11)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV09> for_seev_CorporateActionMovementPreliminaryAdviceV09 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV09>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistributionRule";
			definition = "If CorporateActionGeneralInformation/EventType/Code is RHDI (IntermediateSecuritiesDistribution), then CorporateActionMovementDetails/IntermediateSecuritiesDistributionType must be present in at least one occurrence of CorporateActionMovementDetails.\r\n(MT 564 NVR C11).";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV09.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/CorporateActionMovementDetails[*]/IntermediateSecuritiesDistributionType</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/CorporateActionGeneralInformation/EventType/Code</leftOperand><rightOperand>IntermediateSecuritiesDistribution</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(CorporateActionMovementPreliminaryAdviceV09 obj) throws Exception {
			check_seev_CorporateActionMovementPreliminaryAdviceV09(obj);
		}
	};

	/**
	 * If CorporateActionGeneralInformation/EventType/Code is RHDI
	 * (IntermediateSecuritiesDistribution), then
	 * CorporateActionMovementDetails/IntermediateSecuritiesDistributionType
	 * must be present in at least one occurrence of
	 * CorporateActionMovementDetails.<br>
	 * (MT 564 NVR C11).
	 */
	public static void check_seev_CorporateActionMovementPreliminaryAdviceV09(CorporateActionMovementPreliminaryAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}