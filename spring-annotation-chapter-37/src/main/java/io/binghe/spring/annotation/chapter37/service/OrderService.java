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
package io.binghe.spring.annotation.chapter37.service;

import io.binghe.spring.annotation.chapter37.bean.Order;
import io.binghe.spring.annotation.chapter37.dao.OrderDao;
import io.binghe.spring.annotation.chapter37.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description OrderService
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ProductService productService;

    @Transactional(propagation = Propagation.REQUIRED)
    public void submitOrder(){
        //生成订单
        Order order = new Order();
        long number = Math.abs(new Random().nextInt(500));
        order.setId(number);
        order.setOrderNo("order_" + number);
        orderDao.saveOrder(order);

        //减库存
        this.updateProductStockCountById(1, 1L);

    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void updateProductStockCountById(Integer stockCount, Long id){
        try{
            productDao.updateProductStockCountById(stockCount, id);
            int i = 1 / 0;
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
