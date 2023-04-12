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
package io.binghe.spring.annotation.chapter57.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description @SessionAttributes注解案例
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
@Controller
@SessionAttributes(value = {"name"})
public class SessionAttributesController {

    @RequestMapping(value = "/sessions/test1")
    public String test1(Model model) {
        model.addAttribute("name","binghe");
        return "redirect:/sessions/test2";
    }

    @ResponseBody
    @RequestMapping(value = "/sessions/test2")
    public String test2(@SessionAttribute("name") String name) {
        return "hello " +  name;
    }
}
