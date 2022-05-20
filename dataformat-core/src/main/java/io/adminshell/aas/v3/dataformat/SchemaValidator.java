/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.adminshell.aas.v3.dataformat;

import java.util.Set;

/**
 * Validator that can validate a serialized AASEnvironment according to a
 * specific schema.
 */
public interface SchemaValidator {

    /**
     * Validate a serialized AASEnvironment according to a specific Schema. Does
     * not contain any additional validation, but is restricted to schema
     * validation only.
     *
     * @param serializedAASEnvironment A string-serialized AASEnvironment.
     * @return Set of validation errors. If validation succeeds, the Set is
     * empty.
     */
    public Set<String> validateSchema(String serializedAASEnvironment);

}
