# 程序猿社区

## 部署
### 依赖
- Git
- JDK
- Maven
- MySQL
### 步骤
- yum update
- yum install git
- mkdir App
- cd App
- git clone https://github.com/codeming99/community.git
- yum install maven
- mvn -v
- mvn compile package
- cp src/main/resources/application.properties src/main/resources/application-production.properties
- vim src/main/resources/application-production.properties
- java -jar -Dspring.profiles.active=production target/community-0.0.1-SNAPSHOT.jar

## 资料

[Spring 文档](https://spring.io/guides)  
[Spring Web 文档](https://spring.io/guides/gs/serving-web-content/)  
[es](https://elasticsearch.cn/explore)  
[Github deploy key](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)  
[BootStrap](https://v3.bootcss.com/getting-started/)  
[菜鸟教程](https://www.runoob.com)  
[GitHub OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)  
[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#setting-arrtibute-values)  
[OkHttp](https://square.github.io/okhttp/)  
[Spring MVC](https://docs.spring.io/spring/docs/5.3.0-SNAPSHOT/spring-framework-reference/web.html#spring-web)  
[Markdown 插件](http://editor.md.ipandao.com/)  

## 工具
[Git](https://git-scm.com/download)  
[Visual Paradigm](https://www.visual-paradigm.com)  
[Flyway](https://flywaydb.org/getstarted/firststeps/maven)  
[Lombok](https://www.projectlombok.org)  
[Postman](chrome-extension://coohjcphdfgbiolnekdpbcijmhambjff/index.html)    



## 脚本
```sql
CREATE TABLE USER(
    ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    ACCOUNT_ID VARCHAR(100),
    NAME VARCHAR(50),
    TOKEN VARCHAR(36),
    GMT_CREATE BIGINT,
    GMT_MODIFIED BIGINT
);
```
```bash
mvn flyway:migrate  
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```



