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
package io.binghe.spring.annotation.chapter18.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description @PostConstruct与@PreDestroy的Bean对象
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class PrePostBean {

    public PrePostBean(){
        System.out.println("执行PrePostBean的构造方法...");
    }


    public void init(){
        System.out.println("执行PrePostBean的init方法...");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("执行PrePostBean的postConstruct方法...");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("执行PrePostBean的preDestroy方法...");
    }

    public void destroy(){
        System.out.println("执行PrePostBean的destroy方法...");
    }

}
