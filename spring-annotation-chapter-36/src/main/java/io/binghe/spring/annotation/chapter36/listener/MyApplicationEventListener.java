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
package io.binghe.spring.annotation.chapter36.listener;

import io.binghe.spring.annotation.chapter36.event.MyApplicationEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 事件监听
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
@Component
public class MyApplicationEventListener {

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void afterCommit(MyApplicationEvent event){
        System.out.println("事务已经提交===>>>" + event.getSource().toString());
    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK)
    public void afterRollback(MyApplicationEvent event){
        System.out.println("事务已经回滚===>>>" + event.getSource().toString());
    }
}
