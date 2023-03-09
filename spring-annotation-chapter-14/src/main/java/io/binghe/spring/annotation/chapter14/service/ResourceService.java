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
package io.binghe.spring.annotation.chapter14.service;

import io.binghe.spring.annotation.chapter14.dao.ResourceDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description @Resource注解Service类
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
@Service
public class ResourceService {

    @Resource(name = "resourceDao1")
    private ResourceDao resourceDao;

    @Override
    public String toString() {
        return "ResourceService{" +
                "resourceDao=" + resourceDao +
                '}';
    }
}
