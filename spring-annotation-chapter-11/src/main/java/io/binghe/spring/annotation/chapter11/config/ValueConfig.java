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
package io.binghe.spring.annotation.chapter11.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description @Value注解案例的配置类
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
@Configuration
@ComponentScan(value = {"io.binghe.spring.annotation.chapter11"})
@PropertySource(value = {"classpath:test.properties"})
public class ValueConfig {

    /**
     * 注入普通字符串
     */
    @Value("normalString")
    private String normalString;

    /**
     * 注入操作系统名称
     */
    @Value("#{systemProperties['os.name']}")
    private String osName;

    /**
     * 注入表达式的结果
     */
    @Value("#{ T(java.lang.Math).random() * 100.0 }")
    private double randomNum;

    /**
     * 注入其他Bean的属性
     */
    @Value("#{valueName.name}")
    private String name;

    /**
     * 注入配置文件中的值
     */
    @Value("${db.url}")
    private String dbUrl;

    @Override
    public String toString() {
        return "ValueConfig{" +
                "normalString='" + normalString + '\'' +
                ", osName='" + osName + '\'' +
                ", randomNum=" + randomNum +
                ", name='" + name + '\'' +
                ", dbUrl='" + dbUrl + '\'' +
                '}';
    }
}
