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
import com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05;
import com.tools20022.repository.area.sese.AccountHoldingInformationV06;
import com.tools20022.repository.area.sese.PortfolioTransferConfirmationV08;
import com.tools20022.repository.area.sese.PortfolioTransferInstructionV08;

/**
 * If ProductTransfer/Portfolio/ISA is present, then
 * TransferorAccount/Designation is not allowed.<br>
 * <br>
 * If ProductTransfer/Portfolio/Portfolio is present, then
 * TransferorAccount/Designation is allowed.<br>
 */
public class ConstraintDesignationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05
	 * AccountHoldingInformationRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed.\r\n\r\nIf ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationRequestV05> for_sese_AccountHoldingInformationRequestV05 = new MMConstraint<AccountHoldingInformationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed.\r\n\r\nIf ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.\r\n";
			owner_lazy = () -> AccountHoldingInformationRequestV05.mmObject();
		}

		@Override
		public void executeValidator(AccountHoldingInformationRequestV05 obj) throws Exception {
			check_sese_AccountHoldingInformationRequestV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV06
	 * AccountHoldingInformationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. \r\nIf ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountHoldingInformationV06> for_sese_AccountHoldingInformationV06 = new MMConstraint<AccountHoldingInformationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. \r\nIf ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.\r\n";
			owner_lazy = () -> AccountHoldingInformationV06.mmObject();
		}

		@Override
		public void executeValidator(AccountHoldingInformationV06 obj) throws Exception {
			check_sese_AccountHoldingInformationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV08
	 * PortfolioTransferConfirmationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. If any occurrence of ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferConfirmationV08> for_sese_PortfolioTransferConfirmationV08 = new MMConstraint<PortfolioTransferConfirmationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. If any occurrence of ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.";
			owner_lazy = () -> PortfolioTransferConfirmationV08.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferConfirmationV08 obj) throws Exception {
			check_sese_PortfolioTransferConfirmationV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV08
	 * PortfolioTransferInstructionV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DesignationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If any occurrence of ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. If any occurrence of ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferInstructionV08> for_sese_PortfolioTransferInstructionV08 = new MMConstraint<PortfolioTransferInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DesignationRule";
			definition = "If any occurrence of ProductTransfer/Portfolio/ISA is present, then TransferorAccount/Designation is not allowed. If any occurrence of ProductTransfer/Portfolio/Portfolio is present, then TransferorAccount/Designation is allowed.";
			owner_lazy = () -> PortfolioTransferInstructionV08.mmObject();
		}

		@Override
		public void executeValidator(PortfolioTransferInstructionV08 obj) throws Exception {
			check_sese_PortfolioTransferInstructionV08(obj);
		}
	};

	/**
	 * If ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed.<br>
	 * <br>
	 * If ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.<br>
	 */
	public static void check_sese_AccountHoldingInformationRequestV05(AccountHoldingInformationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed. <br>
	 * If ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.<br>
	 */
	public static void check_sese_AccountHoldingInformationV06(AccountHoldingInformationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed. If any occurrence of
	 * ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.
	 */
	public static void check_sese_PortfolioTransferConfirmationV08(PortfolioTransferConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If any occurrence of ProductTransfer/Portfolio/ISA is present, then
	 * TransferorAccount/Designation is not allowed. If any occurrence of
	 * ProductTransfer/Portfolio/Portfolio is present, then
	 * TransferorAccount/Designation is allowed.
	 */
	public static void check_sese_PortfolioTransferInstructionV08(PortfolioTransferInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}