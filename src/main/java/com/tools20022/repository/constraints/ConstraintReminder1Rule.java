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
import com.tools20022.repository.area.seev.MeetingInstructionStatusV05;

/**
 * If InstructionType/InstructionIdentification/Identification is "NONREF", then
 * InstructionTypeStatus
 * /InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status must be
 * NOIN.
 */
public class ConstraintReminder1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV05
	 * MeetingInstructionStatusV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/InstructionTypeStatus/InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status&lt;/leftOperand&gt;&lt;rightOperand&gt;NotReceived&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/InstructionType/InstructionIdentification/Identification&lt;/leftOperand&gt;&lt;rightOperand&gt;NONREF&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reminder1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructionType/InstructionIdentification/Identification is \"NONREF\", then InstructionTypeStatus/InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status must be NOIN."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingInstructionStatusV05> for_seev_MeetingInstructionStatusV05 = new MMConstraint<MeetingInstructionStatusV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reminder1Rule";
			definition = "If InstructionType/InstructionIdentification/Identification is \"NONREF\", then InstructionTypeStatus/InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status must be NOIN.";
			owner_lazy = () -> MeetingInstructionStatusV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/InstructionTypeStatus/InstructionStatus/GlobalInstructionStatus/ProcessingStatus/Status</leftOperand><rightOperand>NotReceived</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/InstructionType/InstructionIdentification/Identification</leftOperand><rightOperand>NONREF</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(MeetingInstructionStatusV05 obj) throws Exception {
			check_seev_MeetingInstructionStatusV05(obj);
		}
	};

	/**
	 * If InstructionType/InstructionIdentification/Identification is "NONREF",
	 * then InstructionTypeStatus/InstructionStatus/GlobalInstructionStatus/
	 * ProcessingStatus/Status must be NOIN.
	 */
	public static void check_seev_MeetingInstructionStatusV05(MeetingInstructionStatusV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}