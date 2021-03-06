package org.hl7.fhir.dstu3.model;

/*-
 * #%L
 * org.hl7.fhir.dstu3
 * %%
 * Copyright (C) 2014 - 2019 Health Level 7
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.hl7.fhir.instance.model.api.IBaseBinary;

public abstract class BaseBinary extends Resource implements IBaseBinary {

	private static final long serialVersionUID = 1L;

	@Override
	public String getContentAsBase64() {
		return getContentElement().getValueAsString();
	}

	@Override
	public BaseBinary setContentAsBase64(String theContent) {
		if (theContent != null) {
			getContentElement().setValueAsString(theContent);
		} else {
			setContent(null);
		}
		return this;
	}
	
	abstract Base64BinaryType getContentElement();
	
}
