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
package io.binghe.spring.annotation.chapter27.aspect;

import io.binghe.spring.annotation.chapter27.bean.DeclareParentsBean;
import io.binghe.spring.annotation.chapter27.service.NewDeclareParentsService;
import io.binghe.spring.annotation.chapter27.service.impl.NewDeclareParentsServiceImpl;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description @DeclareParents案例的切面类
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
@Aspect
@Component
public class DeclareParentsAspect {

    @DeclareParents(value = "io.binghe.spring.annotation.chapter27.service.DeclareParentsService+", defaultImpl = NewDeclareParentsServiceImpl.class)
    private NewDeclareParentsService newDeclareParentsService;


    @Pointcut("execution(* io.binghe.spring.annotation.chapter27.service.impl.*.*(..))")
    private void pointCut(){}


    @Before(value = "pointCut() && args(declareParentsBean) && this(newDeclareParentsService)")
    public void validate(DeclareParentsBean declareParentsBean, NewDeclareParentsService newDeclareParentsService){
        if (!newDeclareParentsService.validate(declareParentsBean)){
            throw new IllegalStateException("参数不合法...");
        }
        System.out.println("参数合法，执行保存操作...");
    }
}
