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
import com.root101.module.admin.kanban.core.module.KanbanCoreModule;
import com.root101.module.admin.kanban.core.usecase_def.ColumnaUseCase;
import com.root101.module.admin.kanban.repo.module.KanbanRepoModule;
import org.junit.Test;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class CoreLayerTest {

    public CoreLayerTest() {
        ConverterServiceJSONImpl.INSTANCE();
        
        KanbanCoreModule.init(KanbanRepoModule.init());
    }

    @Test
    public void coreTest() {
        System.out.println("Testing Core...");

        ColumnaUseCase uc = KanbanCoreModule.getInstance().getImplementation(ColumnaUseCase.class);
        System.out.println(uc.findAll());

        System.out.println("Finish Testing Core...");
    }

}
