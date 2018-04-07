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
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV06;

/**
 * In the framework of Securities Financing (repo, reverse repo, sec lending,
 * sec borrowing), the SettlementInstruction can only be used for the plain
 * vanilla settlement of the opening leg and closing leg.
 */
public class ConstraintSecuritiesFinancingSettlementUsageRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV06
	 * SecuritiesSettlementTransactionModificationRequestV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingSettlementUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In the framework of Securities Financing (repo, reverse repo, sec lending, sec borrowing), the SettlementInstruction can only be used for the plain vanilla settlement of the opening leg and closing leg."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionModificationRequestV06> for_sese_SecuritiesSettlementTransactionModificationRequestV06 = new MMConstraint<SecuritiesSettlementTransactionModificationRequestV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingSettlementUsageRule";
			definition = "In the framework of Securities Financing (repo, reverse repo, sec lending, sec borrowing), the SettlementInstruction can only be used for the plain vanilla settlement of the opening leg and closing leg.";
			owner_lazy = () -> SecuritiesSettlementTransactionModificationRequestV06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionModificationRequestV06 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionModificationRequestV06(obj);
		}
	};

	/**
	 * In the framework of Securities Financing (repo, reverse repo, sec
	 * lending, sec borrowing), the SettlementInstruction can only be used for
	 * the plain vanilla settlement of the opening leg and closing leg.
	 */
	public static void check_sese_SecuritiesSettlementTransactionModificationRequestV06(SecuritiesSettlementTransactionModificationRequestV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}