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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.Eligibility1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the type of investor. The rules that apply to each type of client
 * are different.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Eligibility1Code#EligibleCounterparty
 * Eligibility1Code.EligibleCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Eligibility1Code#RetailClient
 * Eligibility1Code.RetailClient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Eligibility1Code#ProfessionalClient
 * Eligibility1Code.ProfessionalClient}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.EligibilityCode
 * EligibilityCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ELIG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Eligibility1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the type of investor. The rules that apply to each type of client are different."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Eligibility1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Eligibility1Code
	 * Eligibility1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleCounterparty"</li>
	 * </ul>
	 */
	public static final Eligibility1Code EligibleCounterparty = new Eligibility1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleCounterparty";
			owner_lazy = () -> com.tools20022.repository.codeset.Eligibility1Code.mmObject();
			codeName = EligibilityCode.EligibleCounterparty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Eligibility1Code
	 * Eligibility1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetailClient"</li>
	 * </ul>
	 */
	public static final Eligibility1Code RetailClient = new Eligibility1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetailClient";
			owner_lazy = () -> com.tools20022.repository.codeset.Eligibility1Code.mmObject();
			codeName = EligibilityCode.RetailClient.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Eligibility1Code
	 * Eligibility1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfessionalClient"</li>
	 * </ul>
	 */
	public static final Eligibility1Code ProfessionalClient = new Eligibility1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfessionalClient";
			owner_lazy = () -> com.tools20022.repository.codeset.Eligibility1Code.mmObject();
			codeName = EligibilityCode.ProfessionalClient.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Eligibility1Code> codesByName = new LinkedHashMap<>();

	protected Eligibility1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ELIG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Eligibility1Code";
				definition = "Identifies the type of investor. The rules that apply to each type of client are different.";
				trace_lazy = () -> EligibilityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Eligibility1Code.EligibleCounterparty, com.tools20022.repository.codeset.Eligibility1Code.RetailClient,
						com.tools20022.repository.codeset.Eligibility1Code.ProfessionalClient);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(EligibleCounterparty.getCodeName().get(), EligibleCounterparty);
		codesByName.put(RetailClient.getCodeName().get(), RetailClient);
		codesByName.put(ProfessionalClient.getCodeName().get(), ProfessionalClient);
	}

	public static Eligibility1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Eligibility1Code[] values() {
		Eligibility1Code[] values = new Eligibility1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Eligibility1Code> {
		@Override
		public Eligibility1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Eligibility1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}