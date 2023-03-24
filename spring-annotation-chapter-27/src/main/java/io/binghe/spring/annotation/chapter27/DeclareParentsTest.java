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
package io.binghe.spring.annotation.chapter27;

import io.binghe.spring.annotation.chapter27.bean.DeclareParentsBean;
import io.binghe.spring.annotation.chapter27.config.DeclareParentsConfig;
import io.binghe.spring.annotation.chapter27.service.DeclareParentsService;
import io.binghe.spring.annotation.chapter27.service.NewDeclareParentsService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class DeclareParentsTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DeclareParentsConfig.class);
        DeclareParentsService declareParentsService = context.getBean(DeclareParentsService.class);

        DeclareParentsBean declareParentsBean = new DeclareParentsBean(DeclareParentsBean.NAME);
//        NewDeclareParentsService newDeclareParentsService = (NewDeclareParentsService) declareParentsService;
//        if (!newDeclareParentsService.validate(declareParentsBean)){
//            throw new IllegalStateException("参数不合法...");
//        }
//
//        System.out.println("参数合法，执行保存操作...");
        declareParentsService.saveAndUpdateDeclareParents(declareParentsBean);

        System.out.println("整个过程执行完毕...");
        context.close();
    }
}
