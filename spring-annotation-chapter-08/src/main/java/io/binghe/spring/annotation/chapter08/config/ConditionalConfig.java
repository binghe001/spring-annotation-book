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
package io.binghe.spring.annotation.chapter08.config;

import io.binghe.spring.annotation.chapter08.bean.Founder;
import io.binghe.spring.annotation.chapter08.condition.MacosCondition;
import io.binghe.spring.annotation.chapter08.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description @Conditional注解配置类
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
@Configuration
@Conditional(value = {MacosCondition.class})
public class ConditionalConfig {

    @Bean(name = "bill")
    @Conditional(value = {WindowsCondition.class})
    public Founder windowsFounder(){
        System.out.println("创建名称为bill的Bean对象");
        return new Founder("Bill Gates");
    }

    @Bean(name = "jobs")
    @Conditional(value = {MacosCondition.class})
    public Founder macosFounder(){
        System.out.println("创建名称为jobs的Bean对象");
        return new Founder("Steve Jobs");
    }
}
