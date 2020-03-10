# 项目搭建
## 1.创建服务的提供者和消费者
创建user-service-provider工程  
创建order-service-consumer工程
## 2.将各模块需要的公共的JavaBean和接口进行抽取至接口模块-gmall-interface
## 3.在其他模块进行引入公共接口模块
```xml
<dependency>
    <groupId>com.fc</groupId>
    <artifactId>gmall-interface</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```
## 4.引入Dubbo相关依赖
```xml
<!-- https://mvnrepository.com/artifact/com.alibaba/dubbo -->
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>dubbo</artifactId>
    <version>2.6.7</version>
</dependency>
```
- Dubbo2.6之前的版本引入zkclient操作Zookeeper
```xml
<!-- https://mvnrepository.com/artifact/com.101tec/zkclient -->
<dependency>
    <groupId>com.101tec</groupId>
    <artifactId>zkclient</artifactId>
    <version>0.11</version>
</dependency>
```
- Dubbo2.6之后的版本引入curator操作Zookeeper
```xml
<!-- https://mvnrepository.com/artifact/org.apache.curator/curator-framework -->
<dependency>
    <groupId>org.apache.curator</groupId>
    <artifactId>curator-framework</artifactId>
    <version>4.2.0</version>
</dependency>
```