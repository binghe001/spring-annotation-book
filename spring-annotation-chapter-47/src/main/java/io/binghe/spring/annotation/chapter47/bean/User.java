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
package io.binghe.spring.annotation.chapter47.bean;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description @PathVariable注解Bean
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class User implements Serializable {
    private static final long serialVersionUID = 8989170361469703242L;

    private String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{ id='" + id + ", name='" + name +  '}';
    }
}
