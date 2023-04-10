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
package io.binghe.spring.annotation.chapter53.controller;

import com.alibaba.fastjson2.JSONObject;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.beans.PropertyEditorSupport;
import java.util.Date;
import java.util.Locale;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description @InitBinder注解Controller类
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
@RestController
public class InitBinderController {

    @RequestMapping(value = "/hello")
    public String hello(String name){
        return name;
    }

    @InitBinder(value = "name")
    public void bindData(WebDataBinder binder){
        binder.registerCustomEditor(String.class, new PropertyEditorSupport(){
            @Override
            public void setAsText(String text) throws IllegalArgumentException {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("name", text);
                jsonObject.put("datetime", new DateFormatter("yyyy-MM-dd HH:mm:ss").print(new Date(), Locale.CHINA));
                setValue(jsonObject.toString());
            }
        });
    }
}
