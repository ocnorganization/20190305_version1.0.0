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


### 数据库交互流程
![数据库交互流程图](https://i.loli.net/2019/03/10/5c84cb7742f28.png)

# 项目搭建步骤
## 一、创建分布式多模块Maven项目
### 1.File-new->project-Module->-MAVEN->填写groupID和ArtifactID  
GroupID是项目组织唯一的标识符，实际对应JAVA的包的结构，是main目录里java的目录结构。
ArtifactID就是项目的唯一的标识符，实际对应项目的名称，就是项目根目录的名称。  
本项目中GroupID为com.alexmillerning,ArtifactID为WarehouseCF
### 2.依次创建各个module模块  
依赖关系:![各个模块依赖关系图](https://i.loli.net/2019/04/01/5ca18579d7b9c.png)  
### 3.在父模块定义依赖和插件(集中定义版本号,防止引入包冲突)
``` xml
        <!-- 集中定义版本号 -->
        <properties>
            <maven-resources-plugin>3.1.0</maven-resources-plugin>
            ...
            <spring-context.version>5.1.5.RELEASE</spring-context.version>
        </properties>
    ...
        <!-- 定义依赖 -->
        <dependencyManagement>
            <dependencies>
                ...
                <dependency>
                    <groupId>org.springframework</groupId>
                    <artifactId>spring-context-support</artifactId>
                    <version>${spring.version}</version>
                </dependency>
                ...
            </dependencies>
        </dependencyManagement>
        <build>
        <!-- 定义插件 -->
        <plugins>
            ...
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>${maven-compiler-plugin}</version>
                <configuration>
                    <compilerVersion>1.8</compilerVersion>
                    <source>1.8</source>
                    <target>1.8</target>
                    <encoding>UTF-8</encoding>
                </configuration>
            </plugin>
            ...
        </plugins>
    </build>
```
## 二、搭建Spring框架
### 1.在parent模块的pom.xml文件中添加spring依赖
``` xml
            <!-- 依赖spring  -->
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-context</artifactId>
                <version>${spring.version}</version>
            </dependency>

            <!-- 依赖spring-jdbc -->
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-jdbc</artifactId>
                <version>${spring.version}</version>
            </dependency>
            <!-- 依赖spring-mvcweb -->
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-webmvc</artifactId>
                <version>${spring.version}</version>
            </dependency>
            <!-- 依赖spring-bean -->
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-beans</artifactId>
                <version>${spring.version}</version>
            </dependency>
```
### 2.在service模块的pom.xml文件中添加spring依赖
``` xml
        <!-- 依赖spring 子模块的版本号可以不写,因为父模块已经定义了 -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
        </dependency>

        <!-- 依赖spring-jdbc -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-jdbc</artifactId>
        </dependency>
        <!-- 依赖spring-mvcweb -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
        </dependency>
        <!-- 依赖spring-bean -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-beans</artifactId>
        </dependency>
```
### 3.在在web模块的resource文件夹下新建文件夹spring,并创建spring.xml文件
``` xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:p="http://www.springframework.org/schema/p"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:mvc="http://www.springframework.org/schema/mvc"
       xmlns:task="http://www.springframework.org/schema/task"
       xsi:schemaLocation="
        http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd
        http://www.springframework.org/schema/mvc
        http://www.springframework.org/schema/mvc/spring-mvc.xsd
        http://www.springframework.org/schema/task
        http://www.springframework.org/schema/task/spring-task.xsd">
    <!-- 定义组件controller代码所在位置 -->
    <context:component-scan base-package="com.alexmillerning.controller"></context:component-scan>
    <!--主要作用于@Controller激活该模式下面是一种简写形式
           它会自动注册DefaultAnnotationHandlerMapping与AnnotationMethodHandlerAdapter，
           是spring MVC为@Controllers分发请求所必须的   -->
     <mvc:annotation-driven/>
</beans>
```
### 4.在web模块的resource/spring文件夹下创建applicationContext-service.xml文件
``` xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:util="http://www.springframework.org/schema/util"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:mvc="http://www.springframework.org/schema/mvc"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context
       http://www.springframework.org/schema/context/spring-context.xsd
       http://www.springframework.org/schema/cache http://www.springframework.org/schema/cache/spring-cache.xsd">
       <!-- 定义组件service代码所在位置 -->
        <context:component-scan base-package="com.alexmillerning.service"/>
</beans>
```
### 5.在web模块的resource/spring文件夹下创建applicationContext-trans.xml文件
``` xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:util="http://www.springframework.org/schema/util"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:mvc="http://www.springframework.org/schema/mvc"
       xmlns:tx="http://www.springframework.org/schema/tx" xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context
       http://www.springframework.org/schema/context/spring-context.xsd
       http://www.springframework.org/schema/cache http://www.springframework.org/schema/cache/spring-cache.xsd http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx.xsd http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop.xsd">
    <!-- 事务管理器 -->
    <bean id="transactionManager"  class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
        <!-- 数据源,引用其他的bean -->
        <property name="dataSource" ref="dataSource"/>
    </bean>
    <!-- 配置事务规则 -->
    <tx:advice id="txAdvice" transaction-manager="transactionManager">
        <tx:attributes>
            <tx:method name="save*" propagation="REQUIRED"/>
            <tx:method name="insert*" propagation="REQUIRED"/>
            <tx:method name="add*" propagation="REQUIRED"/>
            <tx:method name="create*" propagation="REQUIRED"/>
            <tx:method name="delete*" propagation="REQUIRED"/>
            <tx:method name="update*" propagation="REQUIRED"/>
            <tx:method name="find*" propagation="SUPPORTS" read-only="true"/>
            <tx:method name="select*" propagation="SUPPORTS" read-only="true"/>
            <tx:method name="get*" propagation="SUPPORTS" read-only="true"/>
        </tx:attributes>
    </tx:advice>
    <!-- 事务要处理的类的路径 -->
    <aop:config>
        <aop:advisor advice-ref="txAdvice"
                     pointcut="execution(* com.alexmillerning.service.*.*(..))"/>
    </aop:config>
</beans>
```
### 6.在web模块的resource/spring文件夹下创建applicationContext-dao.xml文件
``` xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context
       http://www.springframework.org/schema/context/spring-context.xsd">
    <!-- 定义组件mapper代码所在位置 -->
    <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
        <property name="basePackage" value="com.alexmillerning.mapper"/>
    </bean>
</beans>
```
## 三、搭建mybatis框架
### 1.在parent模块的pom.xml文件中添加mybatis,数据库连接驱动和数据库连接池依赖
``` xml
            <!-- 依赖druid数据库连接池 -->
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>druid</artifactId>
                <version>${druid.version}</version>
            </dependency>
            <dependency>
                <groupId>mysql</groupId>
                <artifactId>mysql-connector-java</artifactId>
                <version>${mysql.version}</version>
            </dependency>
            <!--mybatis 依赖的 插件 -->
            <dependency>
                <groupId>org.aspectj</groupId>
                <artifactId>aspectjweaver</artifactId>
                <version>${aspect.version}</version>
            </dependency>
```
### 2.在mapper模块的pom.xml文件中添加mybatis,数据库连接驱动和数据库连接池依赖
``` xml
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
        </dependency>
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis-spring</artifactId>
        </dependency>
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid</artifactId>
        </dependency>
```
### 3.在web模块的resource文件夹下新建文件夹mybatis,并新建sqlMapConfig.xml
``` xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE configuration PUBLIC "-//mybatis.org//DTD Config 3.0//EN" "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
</configuration>
```
### 4.在在web模块的resource文件夹下新建文件夹properties,并创建db.properties文件
```
#配置数据库连接信息
jdbc_url=jdbc:mysql://localhost:3306/warehousecf?characterEncoding=utf-8
jdbc_user=root
jdbc_password=123456
jdbc_driver=com.mysql.jdbc.Driver
```
### 5.applicationContext-dao.xml文件中配置数据库连接信息
``` xml
<!-- 引用上面创建的db.properties文件 -->
<context:property-placeholder location="classpath:properties/*.properties" />
<bean id="dataSource" class="com.alibaba.druid.pool.DruidDataSource" init-method="init" destroy-method="close">
    <!-- 直接引用db.properties文件中基本属性 url、user、password -->
    <property name="url" value="${jdbc_url}" />
    <property name="username" value="${jdbc_user}" />
    <property name="password" value="${jdbc_password}" />
    <property name="driverClassName" value="${jdbc_driver}" />
    <!-- 配置监控统计拦截的filters -->
    <property name="filters" value="stat" />
    <!-- 配置初始化大小、最小、最大 -->
    <property name="maxActive" value="20" />
    <property name="minIdle" value="1" />
    <property name="initialSize" value="1" />
    <!-- 配置获取连接等待超时的时间 -->
    <property name="maxWait" value="60000" />
    <!-- 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒 -->
    <property name="timeBetweenEvictionRunsMillis" value="2000" />
    <!-- 配置一个连接在池中最小生存的时间，单位是毫秒 -->
    <property name="minEvictableIdleTimeMillis" value="600000" />

    <property name="testWhileIdle" value="true" />
    <property name="testOnBorrow" value="false" />
    <property name="testOnReturn" value="false" />

    <property name="poolPreparedStatements" value="true" />
    <property name="maxOpenPreparedStatements" value="20" />

    <!--<property name="asyncInit" value="true" />-->
</bean>
```
### 6.applicationContext-dao.xml文件中引用sqlMapConfig.xml文件
``` xml
<!-- SqlSessionFactory是创建SqlSession的工厂. -->
<!-- 引用上面创建的sqlMapConfig.xml文件 -->
<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
    <property name="configLocation" value="classpath:mybatis/sqlMapConfig.xml"/>
    <property name="dataSource" ref="dataSource" />
</bean>
```
## 四、创建后台管理页面
### 1.创建数据库表,使用mybatis生成相应的pojo类和mapper类,以及exmaple的xml对象
### 2.分别在mapper模块和pojo模块中新建com.alexmillerning.mapper包和com.alexmillerning.pojo包,将mybatis生成的实体类和Example类复制到com.alexmillerning.pojo包下,将Mapper类复制到com.alexmillerning.mapper下
### 3.在web模块下创建webapp/WEB-INF/jsp文件夹,并创建index.jsp页面
### 4.在web模块下创建webapp/WEB-INF/web.xml文件
``` xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app version="3.0" xmlns="http://java.sun.com/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
        id="alexmillerning">

    <display-name>warehousecf-manager</display-name>
    <welcome-file-list>
        <welcome-file>index.html</welcome-file>
        <welcome-file>index.htm</welcome-file>
        <welcome-file>index.jsp</welcome-file>
    </welcome-file-list>
    <!-- 加载spring容器 -->
    <context-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>classpath:spring/applicationContext-*.xml</param-value>
    </context-param>
    <listener>
        <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
    </listener>
    <!-- 解决post乱码 -->
    <filter>
        <filter-name>CharacterEncodingFilter</filter-name>
        <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
        <init-param>
            <param-name>encoding</param-name>
            <param-value>utf-8</param-value>
        </init-param>
    </filter>
    <filter-mapping>
        <filter-name>CharacterEncodingFilter</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
    <!-- springmvc的前端控制器 -->
    <servlet>
        <servlet-name>warehousecf-manager</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <init-param>
            <param-name>contextConfigLocation</param-name>
            <param-value>classpath:spring/springmvc.xml</param-value>
        </init-param>
    </servlet>
    <servlet-mapping>
        <servlet-name>warehousecf-manager</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>
</web-app>
```
### 5.在web模块的spring/springmvc.xml文件中添加
``` xml
    <!-- index视图解析器-->
    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <!-- 页面前缀 -->
        <property name="prefix" value="/WEB-INF/jsp/"/>
        <!-- 页面后缀 -->
        <property name="suffix" value=".jsp"/>
    </bean>
    <!-- 页面css,js资源路径 -->
    <mvc:resources mapping="/css/**" location="/WEB-INF/css/"/>
    <mvc:resources mapping="/js/**" location="/WEB-INF/js/"/>
```
### 6.在web模块com.alexmillerning.controller包中创建controller类,用于识别网址后缀,并返回对应的页面名称
``` java
//必须要注解@Controller,用于标记该类为controller
@Controller
public class IndexController {
    //该注解用于匹配页面传递的后缀
    @RequestMapping("/")
    public String  requestIndex(){
        //返回的页面名称
        return "index";
    }

}
```
### 7.相关页面使用url加载数据
#### 7.1页面配置加载数据的url
```
$(function(){
            $('#home-tree').tree({
                url : '${path}/index/getEasyUITree',
            });
        });
```
#### 7.2创建service接口和对应的实现方法,用于处理后台数据  
WBMenusService.java
``` java
public interface WBMenusService {
    List<EasyUITree> getEasyUITreeListByParentId(String parent);
}
```
WBMenusServiceImpl.java
``` java
//必须注解@Service,用于标记该类为Service
@Service
public class WBMenusServiceImpl implements WBMenusService {
    //@Autowired可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。 通过 @Autowired的使用来消除 set ，get方法
    @Autowired
    WBMenusMapper wbMenusMapper;
    @Override
    public List<EasyUITree> getEasyUITreeListByParentId(String parent) {
        ...
        return easyUITreeList;
    }
}
```
#### 7.3建立相应的controller类,调用相关的service处理数据
WBMenusController.java
``` java
//必须要注解@Controller,用于标记该类为controller
@Controller
public class WBMenusController {
    @Autowired
    WBMenusService wbMenusService;
    @RequestMapping("/index/getEasyUITree")
    @ResponseBody
    public List<EasyUITree> getEasyUITreeListByParentId(@RequestParam(value = "id",defaultValue = "") String parentId){
        List<EasyUITree> easyUITreeList = wbMenusService.getEasyUITreeListByParentId(parentId);
        return easyUITreeList;
    }
}
```
