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
import java.math.BigDecimal;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 商品信息
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class Product implements Serializable {
    private static final long serialVersionUID = 8759017750454273437L;

    /**
     * 数据id
     */
    private Long id;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品价格
     */
    private BigDecimal productPrice;

    /**
     * 库存数量
     */
    private Integer stockCount;

    public Product() {
    }

    public Product(Long id, String productName, BigDecimal productPrice, Integer stockCount) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.stockCount = stockCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }
}
