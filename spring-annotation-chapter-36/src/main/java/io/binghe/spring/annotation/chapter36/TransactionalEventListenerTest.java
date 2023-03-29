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
package io.binghe.spring.annotation.chapter36;

import io.binghe.spring.annotation.chapter36.bean.User;
import io.binghe.spring.annotation.chapter36.config.TransactionalEventListenerConfig;
import io.binghe.spring.annotation.chapter36.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description @TransactionalEventListener注解案例的测试类
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class TransactionalEventListenerTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TransactionalEventListenerConfig.class);
        context.getEnvironment().setActiveProfiles("dev");
        UserService userService = context.getBean(UserService.class);
        try{
            System.out.println("保存数据开始...");
            userService.saveUser(new User("binghe"));
        }finally {
            System.out.println("保存数据结束...");
            context.close();
        }
    }
}
