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
package io.adminshell.aas.v3.dataformat.rdf.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.adminshell.aas.v3.model.EntityType;
import io.adminshell.aas.v3.model.IdentifierKeyValuePair;
import io.adminshell.aas.v3.model.Reference;
import io.adminshell.aas.v3.model.SubmodelElement;

import java.util.List;

@JsonTypeName("aas:Entity")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface EntityMixin extends SubmodelElementMixin {
    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId")
    Reference getGlobalAssetId();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId")
    void setGlobalAssetId(Reference globalAssetId);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/specificAssetId")
    IdentifierKeyValuePair getSpecificAssetId();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/specificAssetId")
    void setSpecificAssetId(IdentifierKeyValuePair specificAssetId);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/entityType")
    EntityType getEntityType();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/entityType")
    void setEntityType(EntityType entityType);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/statement")
    List<SubmodelElement> getStatements();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/statement")
    void setStatements(List<SubmodelElement> statements);
}
