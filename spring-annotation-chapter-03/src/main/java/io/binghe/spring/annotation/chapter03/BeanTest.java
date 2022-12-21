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
package io.binghe.spring.annotation.chapter03;

import io.binghe.spring.annotation.chapter03.bean.User;
import io.binghe.spring.annotation.chapter03.config.BeanConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author binghe(公众号 : 冰河技术)
 * @version 1.0.0
 * @description 测试入口类
 */
public class BeanTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(BeanTest.class);
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        LOGGER.info("IOC容器启动完成....");
        User user1 = context.getBean(User.class);
        User user2 = context.getBean(User.class);
        LOGGER.info("user1是否等于user2===>>>{}", (user1 == user2));
        context.close();
    }
}
