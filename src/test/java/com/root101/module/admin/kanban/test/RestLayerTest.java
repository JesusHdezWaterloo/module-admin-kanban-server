/*
 * Copyright 2021 Root101 (jhernandezb96@gmail.com, +53-5-426-8660).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Or read it directly from LICENCE.txt file at the root of this project.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.root101.module.admin.kanban.test;

import com.root101.json.ConverterServiceJSONImpl;
import com.root101.module.admin.kanban.core.domain.ColumnaDomain;
import com.root101.module.admin.kanban.rest.ModuleAdminKanbanRESTConstants;
import com.root101.spring.client.RestTemplateUtils;
import com.root101.spring.server.RESTUrlConstants;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class RestLayerTest {

    public RestLayerTest() {
        ConverterServiceJSONImpl.INSTANCE();
    }

    @Test
    public void consumeRestTest() {
        System.out.println("Testing Rest Service Consumer...");

        RestTemplate rt = new RestTemplate();

        String URL_GENERAL = "http://localhost:8080";
        String URL_TEST = URL_GENERAL 
                + ModuleAdminKanbanRESTConstants.COLUMMA_GENERAL_PATH 
                + RESTUrlConstants.FIND_ALL_PATH;

        System.out.println(RestTemplateUtils.getForList(rt, URL_TEST, ColumnaDomain.class));

        System.out.println("Finish Testing Rest Service Consumer");
    }
}
