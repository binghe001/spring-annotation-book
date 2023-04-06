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
package io.binghe.spring.annotation.chapter46.controller;

import io.binghe.spring.annotation.chapter46.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description @RequestParam注解小案例
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
@RestController
public class RequestParamController {

    @RequestMapping(value = "/user")
    public String getUser(@RequestParam(value = "id") String id, @RequestParam(value = "name") String name){
        return new User(id, name).toString();
    }

    @RequestMapping(value = "/user/map")
    public String getUserByMap(@RequestParam Map<String, String> params){
        return new User(params.get("id"), params.get("name")).toString();
    }
}
