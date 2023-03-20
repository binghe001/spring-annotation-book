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
package io.binghe.spring.annotation.chapter22.service.impl;

import io.binghe.spring.annotation.chapter22.bean.AspectBean;
import io.binghe.spring.annotation.chapter22.service.AspectService;
import org.springframework.stereotype.Service;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 切面型注解Service实现类
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
@Service
public class AspectServiceImpl implements AspectService {
    @Override
    public void saveOrUpdateAspectBean(AspectBean aspectBean) {
        int i = 1 / 0;
        System.out.println("保存或者更新AspectBean对象...");
    }
}
