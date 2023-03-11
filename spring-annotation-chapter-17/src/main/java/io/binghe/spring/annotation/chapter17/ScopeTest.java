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
package io.binghe.spring.annotation.chapter17;

import io.binghe.spring.annotation.chapter17.bean.ScopeBean;
import io.binghe.spring.annotation.chapter17.config.ScopeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description @Scope注解案例的测试类
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class ScopeTest {

    public static void main(String[] args) {
        System.out.println("创建IOC容器开始...");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        System.out.println("创建IOC容器结束...");
        System.out.println("从IOC容器中第一次获取Bean对象开始...");
        ScopeBean scopeBean = context.getBean(ScopeBean.class);
        System.out.println(scopeBean);
        System.out.println("从IOC容器中第一次获取Bean对象结束...");
        System.out.println("从IOC容器中第二次获取Bean对象开始...");
        scopeBean = context.getBean(ScopeBean.class);
        System.out.println(scopeBean);
        System.out.println("从IOC容器中第二次获取Bean对象结束...");
    }
}
