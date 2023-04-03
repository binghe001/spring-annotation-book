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
package io.binghe.spring.annotation.springmvc.starter;

import org.apache.catalina.Server;
import org.apache.catalina.Service;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description Tomcat启动器
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class TomcatStarter {

    public static void start(int port){
        try{
            Tomcat tomcat = new Tomcat();
            Server server = tomcat.getServer();
            Service service = server.findService("Tomcat");
            Connector connector = new Connector();
            connector.setPort(port);
            service.addConnector(connector);
            tomcat.setBaseDir("d:/tomcat");
            tomcat.addWebapp("/","d:/tomcat");
            tomcat.start();
            server.await();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
