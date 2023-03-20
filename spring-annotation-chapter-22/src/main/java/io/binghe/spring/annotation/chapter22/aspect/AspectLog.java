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
package io.binghe.spring.annotation.chapter22.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 切面型注解Log切面类
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
@Component
@Aspect
public class AspectLog {

    @Pointcut("execution(* io.binghe.spring.annotation.chapter22.service.impl.*.*(..))")
    private void pointCut(){}

    @Before("pointCut()")
    public void beforeLog(){
        System.out.println("@Before注解在执行切入点方法之前记录日志...");
    }

    @After("pointCut()")
    public void afterLog(){
        System.out.println("@After注解无论切入点方法是否抛出异常都会记录日志...");
    }

    @AfterReturning("pointCut()")
    public void afterReturningLog(){
        System.out.println("@AfterReturning注解在切入点方法正常执行后记录日志...");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowingLog(){
        System.out.println("@AfterThrowing注解在切入点方法抛出异常后记录日志...");
    }

    @Around("pointCut()")
    public Object arountLog(ProceedingJoinPoint pjp){
        //返回的结果数据
        Object resultValue = null;
        try{
            System.out.println("在执行切入点方法之前记录日志...");
            //获取执行方法的参数
            Object[] args = pjp.getArgs();
            //指定切入点的方法
            resultValue = pjp.proceed(args);
            System.out.println("在切入点方法正常执行后记录日志...");
        }catch (Throwable t){
            System.out.println("在切入点方法抛出异常后记录日志...");
        }finally {
            System.out.println("无论切入点方法是否抛出异常都会记录日志...");
        }
        return resultValue;
    }
}
