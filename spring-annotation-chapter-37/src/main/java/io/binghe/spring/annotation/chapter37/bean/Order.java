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
package io.binghe.spring.annotation.chapter37.bean;

import java.io.Serializable;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 订单信息
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 4502776927669504211L;

    /**
     * 数据id
     */
    private Long id;

    /**
     * 订单编号
     */
    private String orderNo;

    public Order() {
    }

    public Order(Long id, String orderNo) {
        this.id = id;
        this.orderNo = orderNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
