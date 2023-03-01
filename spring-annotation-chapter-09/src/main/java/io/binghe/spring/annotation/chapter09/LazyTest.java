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
package io.binghe.spring.annotation.chapter09;

import io.binghe.spring.annotation.chapter09.bean.LazyBean;
import io.binghe.spring.annotation.chapter09.config.LazyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description @Lazy注解案例启动类
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class LazyTest {
    public static void main(String[] args) {
        System.out.println("创建IOC容器开始...");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LazyConfig.class);
        System.out.println("创建IOC容器结束...");
        System.out.println("从IOC容器中获取Bean开始...");
        LazyBean lazyBean1 = context.getBean(LazyBean.class);
        LazyBean lazyBean2 = context.getBean(LazyBean.class);
        System.out.println("(lazyBean1 是否等于 lazyBean2) ===>>> " + (lazyBean1 == lazyBean2));
        System.out.println("从IOC容器中获取Bean结束...");
    }
}
