Jeedcp 是一个企业级分布式基础平台
当前最新版本： 1.0.0（发布日期：20161004）

前言：
随着 J2EE 框架 ( Bootstrap/SpringMvc/Mybaits/Freemarker) 等的逐渐成熟,系统界面逐渐实现统一化，代码生成器也可以生成统一规范的界面！
代码生成+手工MERGE半智能开发将是新的趋势，单表数据模型和一对多数据模型的增删改查功能直接生成使用,可节省60%工作量，快速提高开发效率！！！

简介
Jeedcp是一款基于代码生成器的智能快速开发平台，可以帮助解决java项目中80%的重复工作，让开发者更多关注业务逻辑。既能快速提高开发效率，帮助公司节省人力成本，同时不失灵活性。

Jeedcp快速开发宗旨是：简单功能由代码生成器生成使用，复杂业务采用表单自定义，只需要写极少代码，即可实现复杂的业务逻辑。

Jeedcp采用了目前极为流行的扁平化响应式的设计风格，可以完美兼容电脑，pad，手机等多个平台。前端UI采用hplus实现，后台采用 SpringMVC + MyBatis + BootStrap + Apache Shiro + Ehcache 开发组件 的基础架构,采用面向声明的开发模式， 基于泛型编写极少代码即可实现复杂的数据展示、数据编辑、表单处理等功能，再配合代码生成器的使用,将J2EE的开发效率提高5倍以上，可以将手写代码减少80%以上。

适用项目
Jeedcp快速开发平台，可以应用在任何J2EE项目的开发中，尤其适合企业信息管理系统（MIS）、内部办公系统（OA）、企业资源计划系统（ERP）、客户关系管理系统（CRM）等，尤为显著的支持SAAS企业级应用开发，插件机制更好的支持了SAAS云应用需求。

为什么选择Jeedcp?
1.采用主流框架，容易上手; 代码生成器依赖性低,很方便的扩展能力，可完全实现二次开发;
2.开发效率很高,采用代码生成器，单表数据模型和一对多(父子表)数据模型，增删改查功能自动生成，菜单配置直接使用；
3.页面校验自动生成(必须输入、数字校验、金额校验、时间空间等);
4.封装完善的用户基础权限、强大的数据权限、和数据字典等基础功能，直接使用无需修改
5.常用共通封装，各种工具类(定时任务,短信接口,邮件发送,Excel导出等),基本满足80%项目需求
6.集成简易报表工具，图像报表和数据导出非常方便，可极其方便的生成pdf、excel、word等报表；
7.集成工作流activiti，并实现了只需在页面配置流程转向，可极大的简化jbpm工作流的开发；用jbpm的流程设计器画出了流程走向，一个工作流基本就完成了，只需写很少量的java代码；
8.UI标签库，针对WEB UI进行标准式封装，页面统一采用自定义标签实现功能：列表数据展现、页面校验等,标签使用简单清晰且便于维护
9.在线流程设计，采用开源Activiti流程引擎，实现在线画流程,自定义表单,表单挂靠,业务流转
10.查询过滤器：查询功能自动生成，后台动态拼SQL追加查询条件；支持多种匹配方式（全匹配/模糊查询/包含查询/不匹配查询）；
11.多数据源：及其简易的使用方式，在线配置数据源配置，便捷的从其他数据抓取数据；
12.国际化：支持多语言，开发国际化项目非常方便；
13.数据权限（精细化数据权限控制，控制到行级，列表级，表单字段级，实现不同人看不同数据，不同人对同一个页面操作不同字段
14.简易Excel导入导出，支持单表导出和一对多表模式导出，生成的代码自带导入导出功能
Jeedcp 功能特点
使用目前流行的多种web技术，包括Spring MVC4.0+, MyBatis, Apache Shiro, ehcache, Jquery ,BootStrap, WebSocket 等等，
支持多种数据库MySQL, Oracle, sqlserver等。 分层设计：使用分层设计，分为dao，service，Controller，view层，层次清楚，
低耦合，高内聚。 安全考虑：严格遵循了web安全的规范，前后台双重验证，参数编码传输，密码md5加密存储，shiro权限验证，
从根本上避免了SQL注入，XSS攻击，CSRF攻击等常见的web攻击手段。
Jeedcp 技术点总结:
技术点一：Online Coding在线开发(通过在线配置实现一个表模型的增删改查功能，无需一行代码，支持用户自定义表单布局)
技术点二：代码生成器，支持多种数据模型,根据表生成对应的Entity,Service,Dao,Controller,JSP等,增删改查功能生成直接使用
技术点三：UI快速开发库，针对WEB UI进行标准封装，页面统一采用UI标签实现功能：数据datagrid,表单校验,Popup,Tab等，实现JSP页面零JS，开发维护非常高效
技术点四：在线流程定义，采用开源Activiti流程引擎，实现在线画流程,自定义表单,表单挂接,业务流转，流程监控，流程跟踪，流程委托等
技术点五：封装阿里云MQ和OSS文件系统，以插件机制集成到平台
技术点六：查询过滤器：查询功能自动生成，后台动态拼SQL追加查询条件；支持多种匹配方式（全匹配/模糊查询/包含查询/不匹配查询）
技术点七：此框架采用前后台分开，前后台都可以单独部署
技术点八：动态报表功能（用户输入一个sql，系统自动解析生成报表）
技术点九：数据权限（精细化数据权限控制，控制到行级，列表级，表单字段级，实现不同人看不同数据，不同人对同一个页面操作不同字段）
技术点十：封装支付宝和微信支付API，拿来即用
技术点十一：多数据源（在线配置数据源，数据源工作类封装）
技术点十二：微信模块封装开发，拿来即用
技术点十三：分布式定时任务，采用dangdang的Elastic-Job，具体文档请看https://github.com/archlevel/elastic-job
技术点十四：简易Excel导入导出，支持单表导出和一对多表模式导出，生成的代码自带导入导出功能
技术点十五：分布式配置管理平台，为分布式业务提供统一的配置管理服务”。现已开放源代码，开箱即用。 提供配置管理中心, 支持在线管理配置信息
技术点十六：插件开发，业务功能组件以插件方式集成平台，也可以单独部署发发布，有力支撑了SAAS云应用系统需求
支持多种浏览器: IE, 火狐, Google 等
支持数据库: Mysql,Oracle10g,Postgre,SqlServer等
基础权限: 用户，角色，菜单权限，按钮权限，数据权限
即将推出功能：分布式部署，云平台，移动平台开发，规则引擎
要求JDK1.6+

项目说明
	<!--以下几个模块属于基础模块，所有业务系统必须依赖 -->
		<module>jeedcp-base-common</module>        <!--框架技术类库 -->
		<module>jeedcp-base-persistence-nosql</module> <!--MongoDB支持 -->
		<module>jeedcp-base-persistence-sql</module> <!--mysql等关系数据库支持 -->
		<module>jeedcp-base-service</module> <!--service层基础类和异常 -->
		<module>jeedcp-base-webapp-support</module> <!--基础webapp支持 -->
		<module>jeedcp-base-webapp-static</module> <!--前端静态类库，后台管理系统使用 -->
		<module>jeedcp-base-webapp-static-frontend</module> <!--前端打包类 -->
		<module>jeedcp-base-webapp-commonjsp</module> <!--共用jsp，大部分为管理系统使用 -->

		<!--以下几个模块属于系统模块，所有业务系统必须依赖 -->
		<module>jeedcp-sys-webapp-tagtld</module><!-- 基础tag and tld -->
		<module>jeedcp-sys-webapp-security-cas</module> <!-- cas client -->
		<module>jeedcp-sys-entity</module> <!-- 系统管理entity -->
		<module>jeedcp-sys-dao</module><!-- 系统管理dao -->
		<module>jeedcp-sys-service</module> <!-- 系统管理 service -->
		<module>jeedcp-sys-webapp</module> <!-- 系统管理 View -->
		<module>jeedcp-sys-dao-xml</module><!-- 系统管理dao xml -->
		<module>jeedcp-cas-webapp</module> <!-- cas server -->

		<module>jeedcp-admin-webapp</module>        <!--管理平台 -->

		<!--以下几个模块属于可选模块，按照自己需要进行选择 -->
		<module>jeedcp-act-core</module> <!--流程引擎核心模块 -->
		<module>jeedcp-act-webapp</module> <!--流程引擎前台展示webapp -->
		<module>jeedcp-oa-webapp</module> <!--OA前台展示webapp -->
		<module>jeedcp-gen-webapp</module> <!--代码生成模块 -->
		<module>jeedcp-log-webapp</module> <!--日志模块 -->
		<module>jeedcp-weixin-webapp</module><!--微信操作模块，支持公众号，包括管理平台 -->
		<module>jeedcp-mobile-webapp</module><!--mobile服务端模块。支持token，验证码等 -->
		<module>jeedcp-test</module> <!--单元测试支持 -->
		<module>jeedcp-file-core</module> <!--阿里oss操作核心库 -->
		<module>jeedcp-file-webapp</module> <!--阿里oss操作web -->
		<!--<module>jeedcp-api-webapp</module> &lt;!&ndash;对外接口模块,支持摘要 &ndash;&gt;-->

		<!--以下几个模块尚未实现 -->
		<module>jeedcp-report</module><!--easy report模块 -->
		<module>jeedcp-message</module> <!--消息模块，暂时没用 -->
		<module>jeedcp-config</module> <!--公共配置模块，暂时没用 -->
		<module>jeedcp-mq</module> <!--阿里MQ操作模块，暂时没用 -->
		<module>jeedcp-cache</module> <!--缓存模块，暂时没用 -->
		<module>jeedcp-pay</module><!--支付模块，包含微信和支付宝，暂时没用 -->
		<module>jeedcp-job</module><!--分布式任务模块，暂时没用 -->

系统截图
![alt text](http://7xsfg6.com1.z0.glb.clouddn.com/QQ%E5%9B%BE%E7%89%8720161010215626.png)
![alt text](http://7xsfg6.com1.z0.glb.clouddn.com/QQ%E5%9B%BE%E7%89%8720161011092027.png)
![alt text](http://7xsfg6.com1.z0.glb.clouddn.com/QQ%E5%9B%BE%E7%89%8720161011092114.png)
![alt text](http://7xsfg6.com1.z0.glb.clouddn.com/QQ%E5%9B%BE%E7%89%8720161011092150.png)
![alt text](http://7xsfg6.com1.z0.glb.clouddn.com/QQ%E5%9B%BE%E7%89%8720161011092130.png)


安装使用说明：
1：初始化数据库：导入工程目录下doc文件db文件的jeesite_mysql.sql文件
2：在根目录下执行 mvn clean install命令
3：部署到tomcat中

如何交流、反馈、参与贡献？
Jeedcp技术交流群qq 139910463


