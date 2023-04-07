/**
 * Copyright 2022-9999 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.binghe.spring.annotation.chapter51.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description @ModelAttribute注解Controller
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
@RestController
public class ModelAttributeController {

    @ModelAttribute
    public void initModel(Model model){
        System.out.println("执行了initModel()方法...");
        model.addAttribute("name", "binghe");
    }

    @RequestMapping(value = "/model")
    public String getModelAttribute(@ModelAttribute("name") String name, Model model){
        return "{\"name\" : \"" +name + "\"}";
    }
}
