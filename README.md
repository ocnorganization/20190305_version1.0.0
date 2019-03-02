# CFWarehouse
## 整体框架图
![框架图](https://i.loli.net/2019/03/02/5c7a9f18dc056.png)  
1. parent 集中定义全局的依赖,插件,jar包等等
2. manager 管理项目后台系统
3. sso 单点登录(SSO的定义是在多个应用系统中，用户只需要登录一次就可以访问所有相互信任的应用系统。)
4. search 搜索服务
5. common 通用模块,包括通用类,工具类等等
6. rest 支持PC端面向用户的门户网站,安卓应用,ios应用,微信小程序等等
7. redis 缓存,处理高并发

## parent模块
1. 配置maven库相关的设置  
pom.xml文件  
\<modules\>\</modules\>定义模块  
\<properties\>\</properties\>定义依赖版本号  
\<dependencyManagement\>\</dependencyManagement\>定义依赖  
\<plugins\>\</plugins\>定义插件
2. parent模块的package类型  
\<packaging\>pom\</packaging\>为了用于继承

## manager模块
-pojo(实体类-被依赖 jar)
-mapper(mybatis继承pojo jar)
-service(服务层 jar)
-web(展示前端页面-继承service war)

## SSM框架整合
Spring(核心框架service)
Spring MVC(表现层)
Mybatis(DAO)