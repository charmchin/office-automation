# OA 系统

## 一，需求分析与环境准备

### 1，需求介绍

- 采用 B/S 架构设计开发
- HR 为每一位员工分配系统账户，员工用此账号登录系统
- 公司采用分级定岗，从1-8 依次提升，不同岗位薪资水平不同
- 6级（含）以下为业务岗，对应人员执行公司业务事宜
- 7-8 级为管理岗，其中 7 级为部门经理，8 级为总经理
- 业务岗与管理岗员工可用系统功能不同，要求允许灵活配置

### 核心业务 — 请假流程

- 所有员工都可以使用“请假申请”功能申请请假
- 请假时间少于 72小时，部门经理审批后直接通过
- 请假时间大于 72小时，部门经理审批后还需总经理进行审批
- 部门经理只允许批准本部门员工申请
- 部门经理请假需直接由总经理审批
- 总经理提起请假申请，系统自动批准通过

### 2，框架 & 组件

- MySQL 8

- Mybatis 3.5

  注意：在mappers中写好对应的xml文件后，还需要在mybatis-config.xml 文件中进行注册。

- Alibaba Druid

- Servlet 3.1

- Vue 3.x

- Apache Commons Codec 

  是用于编码/解码的组件

- Element Plus

  在CDN内容分发网络下载好element plus后复制到如下目录中：

  ![image-20240225122402426](E:\repositories\office-automation\README.assets\image-20240225122402426.png)

  axios和后台进行交互。

### 3，基于MVC 的软件分层设计

HTML视图层（View）——Servlet 控制层（Controller）—— Service业务逻辑层（Model）—— Mapper数据持久层（Model）

每一层都有自己的职责，很清晰。

### 4，开发过程回顾

- 1，Navicat创建数据库
- 2，创建maven工程，配置web和Tomcat
- 3，在 pom.xml 中引入相关依赖，为加快速度，可以利用alibaba 镜像
- 4，在resource目录下新建一个文件，命名为mybatis-config.xml 。

### 5，RBAC

- Role-Based Access Control，基于角色权限控制（RBAC）
- 是面向企业安全策略的访问控制方式，核心思想是将控制访问的资源与角色（role）的绑定
- 系统的用户（User）与角色（Role）再进行绑定，用户便拥有对应权限

![image-20240225122320301](E:\repositories\office-automation\README.assets\image-20240225122320301.png)

*编号：没啥意义的数字；而编码包含了更多的信息。* 



## 二，开发基于 RBAC 的访问控制模块

重要！！！

## 三，开发多级请假审批流程

- 1，了解开发顺序：

先创建一个实体类（entity），接着在mapper 下创建接口类，然后在resource 目录下的 mappers目录下书写对应的xml 文件，接着再到mybatis-config.xml 文件里面进行注册。配置好后，然后就是生成测试用例。在mapper 包下的文件里双击方法名后，用idea 自动创建测试用例。

![image-20240225122546032](E:\repositories\office-automation\README.assets\image-20240225122546032.png)

- 2，在MVC 中只能是service 对mapper 进行调用，这是一个标准，其他的都是违规的。

# 总结

以上就算是完成了一个完整的OA 系统请假流程，作为当前项目，它的含金量还是很高的，既涉及到了基础技能的开发，包括使用 Vue + Element 进行界面的构建，也涉及到了底层数据库的设计以及工作流程的设计。还有涉及到了大量开发时所使用的实用技能。这个项目我相信将来再次回味时一定很有收获的。