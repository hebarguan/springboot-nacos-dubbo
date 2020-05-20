# nacos-dubbo-springboot
>nacos 添加配置

![image](https://guanhuaihai.oss-cn-beijing.aliyuncs.com/%E4%BC%81%E4%B8%9A%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_15891786953796.png)

>shop-order-api

```yaml
testValue: hebarguan
server:
    port: 8003
dubbo:
  registry:
    address: nacos://127.0.0.1:8848
```

>shop-order-provider

```yaml
spring:
  application:
    name: shop-order-api
  datasource:
    url: jdbc:mysql://127.0.0.1:3306/test?autoReconnect=true&useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai
    username: account
    password: password
server:
  address: 127.0.0.1
  port: 8002

dubbo:
  registry:
    address: nacos://127.0.0.1:8848
```

>创建mysql库test & 添加 shop_order表

```mysql
CREATE DATABASE `test` /*!40100 DEFAULT CHARACTER SET utf8 */

CREATE TABLE `shop_order` (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `goodname` varchar(244) NOT NULL COMMENT 'name',
  `order_status` tinyint(1) NOT NULL DEFAULT '1' COMMENT 'status',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

```

> 运行ShopOrderApiApplication 和 ShopOrderProviderApplication 即可在nacos 控制台看到下图效果

![image](https://guanhuaihai.oss-cn-beijing.aliyuncs.com/%E4%BC%81%E4%B8%9A%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_1589179939689.png)

#### 最后调用http://localhost:8003/order/make.do?name=nacos-dubbo 就可以看到效果了