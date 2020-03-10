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
