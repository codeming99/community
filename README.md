# 程序猿社区

## 资料

[Spring 文档](https://spring.io/guides)  
[Spring Web 文档](https://spring.io/guides/gs/serving-web-content/)  
[es](https://elasticsearch.cn/explore)  
[BootStrap](https://v3.bootcss.com/getting-started/)  
[GitHub OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)  
[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#setting-arrtibute-values)  
[OkHttp](https://square.github.io/okhttp/)

## 工具
[Git](https://git-scm.com/download)  
[Visual Paradigm](https://www.visual-paradigm.com)  
[Flyway](https://flywaydb.org/getstarted/firststeps/maven)  
[Lombok](https://www.projectlombok.org)  



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
```



