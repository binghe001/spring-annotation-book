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
package io.binghe.spring.annotation.chapter12;

import io.binghe.spring.annotation.chapter12.config.AutowiredConfig;
import io.binghe.spring.annotation.chapter12.dao.AutowiredDao;
import io.binghe.spring.annotation.chapter12.service.AutowiredService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description @Autowired注解测试类
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class AutowiredTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutowiredConfig.class);
        AutowiredDao autowiredDao = context.getBean(AutowiredDao.class);
        System.out.println("autowiredDao===>>>" + autowiredDao);
        AutowiredService autowiredService = context.getBean(AutowiredService.class);
        System.out.println("autowiredService=>>>" + autowiredService);
    }
}
