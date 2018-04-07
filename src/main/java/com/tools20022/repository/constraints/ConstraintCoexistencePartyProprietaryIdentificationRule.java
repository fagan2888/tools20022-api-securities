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
import com.tools20022.repository.choice.PartyIdentification40Choice;

/**
 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be
 * 34 characters or less. The field must not start or end with a slash ‘/’ or
 * contain two consecutive slashes ‘//’.
 */
public class ConstraintCoexistencePartyProprietaryIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
	 * PartyIdentification40Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistencePartyProprietaryIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification40Choice> forPartyIdentification40Choice = new MMConstraint<PartyIdentification40Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistencePartyProprietaryIdentificationRule";
			definition = "During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification must be 34 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> PartyIdentification40Choice.mmObject();
		}

		@Override
		public void executeValidator(PartyIdentification40Choice obj) throws Exception {
			checkPartyIdentification40Choice(obj);
		}
	};

	/**
	 * During ISO 15022 – 20022 coexistence, Party ProprietaryIdentification
	 * must be 34 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkPartyIdentification40Choice(PartyIdentification40Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}