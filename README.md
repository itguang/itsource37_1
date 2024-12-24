![封面.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242144695.png)

![论文.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242145220.png)

![code.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242145257.png)



# 项目介绍

近年来，信息化管理行业的不断兴起，使得人们的日常生活越来越离不开计算机和互联网技术。首先，根据收集到的用户需求分析，对设计系统有一个初步的认识与了解，确定校园失物招领网站的总体功能模块。然后，详细设计系统的主要功能模块，通过数据库设计过程将相关的数据信息存储到数据库中，再通过使用关键的开发工具，如IDEA开发平台、AJAX技术等，编码设计相关的功能模块。接着，主要采用功能测试的方式对系统进行测试，找出系统在运行过程中存在的问题，以及解决问题的方法，不断地改进和完善系统的设计。最后，总结本文介绍的系统的设计和实现过程，并且针对于系统的开发提出未来的展望工作。本系统的研发具有重大的意义，在安全性方面，用户使用浏览器访问网站时，采用注册和密码等相关的保护措施，提高系统的可靠性，维护用户的个人信息和财产的安全。在方便性方面，促进了校园失物招领网站的信息化建设，极大的方便了相关的工作人员对校园失物招领网站信息进行管理。

**关键词**：校园失物招领网站管理；Java语言；VUE；AJAX技术；系统测试；Spring Boot 框架；Java；MySQL数据库

**技术栈:**

* 后端:  SpringBoot +Mybatis
* 数据库 : MySQL 8
* 前端:  VUE + ElementUI

**开发环境依赖：**
* MySQL 8 数据库
* JDK1.8
* Maven 3
* IDEA
* Node 13

## 一 业务介绍

本系统分为以下几个模块：管理后台和用户前台

- 管理后台： 可以管理整个系统，管理用户，失物招领信息，失物信息登记管理，系统公告等
- 用户前台：可以查看失物招领信息，发表失物信息，认领失物信息，留言公告等

### 2.用户前台
- 注册一个用户进行登录
  ![注册.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242155885.png)


- 首页

![1.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242150304.png)
![2.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242150815.png)
![3.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242150837.png)

- 公告
  ![公告.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242150158.png)

- 寻物启事
  ![寻物启事.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242150082.png)

- 失物招领
  ![失物招领.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242151442.png)

- 失物认领

![实物认领.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242151055.png)

- 发布寻物启事
  ![个人发布寻物启事.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242151204.png)

- 留言板
  ![留言板.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242155696.png)

- 个人中心
  ![个人中心.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242152171.png)

![个人中心2.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242152982.png)
![个人中心3.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242152775.png)



### 1.管理员后台

- 用户管理
  ![管理后台1.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242152025.png)
- 系统操作日志
  ![管理后台-操作日志.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242152512.png)
- 公告信息管理
  ![管理后台-公告信息.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242153384.png)

- 留言板管理
  ![管理后台-留言板管理.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242153973.png)
- 失物招领管理
  ![失物信息管理.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242155571.png)

- 寻物启事编辑页面
  ![寻物启事-编辑.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242156352.png)


## 二 技术介绍
### 1.技术栈

* 后端:  SpringBoot +Mybatis
* 数据库 : MYSQL
* 前端:  VUE + ElementUI

### 2.代码介绍
> ![code.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242145257.png)
### 三 Quick Start

### 1. 环境准备
* MYSQL 8
* JDK1.8
* Maven 3
* IDEA
* Node 14 （如果不需要对配置后台二次开发,不需要安装)

> 以上环境需要准备好, 在自己的本地搭建好,方可进行下面步骤
### 2. 下载源码

**文章末尾获取下载方式。**

### 3. 后端部署

- Step1: 下载源码
- Step2: IDEA 打开项目
- Step3: 安装 Maven 依赖
- Step4: 配置检查
> 数据库配置: 找到配置文件 `src/main/resources/application.yml` 修改为你本地的数据库配置。如
```yml
spring:  
    datasource:  
        driverClassName: com.mysql.cj.jdbc.Driver  
        url: jdbc:mysql://127.0.0.1:13306/itsource37?useUnicode=true&characterEncoding=utf8&autoReconnect=true&useSSL=false&serverTimezone=UTC&createDatabaseIfNotExist=true  
        username: root  
        password: root
```

注意：**不需要手动创建数据库和初始化表结构，直接运行项目，会自动创建数据库，初始化SQL语句**
- Step4: 启动后端项目
> Idea 运行后端项目,看到以下信息,表示运行成功
> ![run.png](https://itguang.oss-cn-beijing.aliyuncs.com/202412242158402.png)



### 4. 前端部署
项目默认已经构建好了前端静态文件,如果不二次开发的话,不需要单独启动前端项目.

## 下载源码

---
---

关注微信公众号: **ITSource 每日分享**,回复 `0037` 获取源码

---
---

**关注微信公众号 【ITSource每日分享】,免费获取一万个IT资源：项目源码，软件工具，面试面经，学习视频 应有尽有！！！!**

![关注 微信公众号 ! 获取更多学习资源呀](https://itguang.oss-cn-beijing.aliyuncs.com/订阅号.jpeg)

**更多资源推荐:**
- [ITSource 分享 第1期【问卷调查系统】springboot+vue](https://mp.weixin.qq.com/s/KE7jOCpvbLVddVnu81fg9A)
- [ITSource 分享 第2期【在线考试系统】springboot+vue](https://mp.weixin.qq.com/s/So2Nb20hotB3S0aQtqf1mQ)
- [ITSource 分享 第4期【简洁的问卷调查系统】springboot+vue](https://mp.weixin.qq.com/s/HeSGWxxU-bGoeONjyR6qsw)
- [ITSource 分享 第5期【校园信息墙系统】springboot+vue](https://mp.weixin.qq.com/s/oA0Mbz3c4q1ziQbHvr72dg)
- [ITSource 分享 第6期【网址云收藏系统】】](https://mp.weixin.qq.com/s/NddwJn9h2f5n6dY-spCFhQ)
- [ITSource 分享 第7期【小程序记账软件系统】springboot+小程序](https://mp.weixin.qq.com/s/kRigevtP_EjpOS_Bw2UdZQ)
- [ITSource 分享 第8期【班级学生管理系统】](https://mp.weixin.qq.com/s/oJ-PEahVwQkwRwE8sINyZg)
- [ITSource 分享 第9期【学知识在线考试系统】springboot+vue](https://mp.weixin.qq.com/s/euvjxBX3bVG71IF8yV_zJQ)
- [ITSource 分享 第10期【个人博客系统】](https://mp.weixin.qq.com/s/j5O3oi0Yc28v8ROomyR9_g)
- [ITSource 分享 第11期【简单的教务管理系统】](https://mp.weixin.qq.com/s/5AEgWPW1v0Y5Z77LGoMm1Q)
- [ITSource分享第12期【驾校理论课考试系统】springboot+vue](https://mp.weixin.qq.com/s/YpJXaGC5338ydeLCMBiLtg)
- [ITSource分享第13期【班级信息管理系统】](https://mp.weixin.qq.com/s/7FYxlXoKrb5r-nckcPlAWw)
- [ITSource分享第14期【电影院售票管理系统】springboot+vue](https://mp.weixin.qq.com/s/oRU1VtvB68Z1qJbuGIGrGw)
- [ITSource分享第15期【图书管理系统】](https://mp.weixin.qq.com/s/rgixOXuJyJyZlL8Ny0AE8A)
- [ITSource分享第16期【连锁门店管理系统】springboot+vue](https://mp.weixin.qq.com/s/5aOJ9EHIqcVqtYWdKn3ONw)
- [ITSource分享第17期【宠物管理系统(带论文)springboot+vue】](https://mp.weixin.qq.com/s/S_mDclr4BKOzGZHG6etnoA)
- [ITSource分享第18期【二手交易(电商,商城)系统(带论文和PPT)springboot+vue】](https://mp.weixin.qq.com/s/_LlrbVBq_6nhGp3BY7F38A)
- [ITSource分享第19期【学生选课管理系统springboot+vue】](https://mp.weixin.qq.com/s/b8qTt-XT9SZNzQTKOJQqSw)
- [ITSource分享第20期-Java SpringBoot 微信点餐系统视频](https://mp.weixin.qq.com/s/xqmR6R96yFSZeQOmkCQcmQ)
- [ITSource分享第21期【房屋租赁管理系统】springboot+vue](https://mp.weixin.qq.com/s/7F7EhKv_CG81LEDS1XEJHw)
- [# ITSource分享第22期【景区旅游管理系统】springboot](https://mp.weixin.qq.com/s/ygvHpQeg_frDWD2f1F-R_A)
- [ ITSource分享第23期【图书管理系统】springboot+layui前后端分离](https://mp.weixin.qq.com/s/b1-prJSZdQcEBy0M6JOnDg)
- [第24期【在线拍卖系统】springboot+vue前后端分离+论文+PPT](https://mp.weixin.qq.com/s/VGKHG_ZPER3VA5rTdbXFiQ)
- [第25期【汽车票网上预定系统】springboot+vue前后端分离+论文](https://mp.weixin.qq.com/s/CB6xxXJkvK1GAhAVFUgHZw)
- [# 第26期【在线旅游购买网站系统】springboot+vue前后端分离+论文+PPT](https://mp.weixin.qq.com/s/BfUtXw77GQzXgPQfGyubmg)
- [# 第27期【校园网上租赁交易系统设计与实现】springboot+vue前后端分离+论文+部署文档](https://mp.weixin.qq.com/s/FvWVPlmOkuULLQ9seQHcpQ)
- [# ITSource分享第28期【网上宠物用品交易系统设计与实现】springboot+vue前后端分离+论文+部署文档](https://mp.weixin.qq.com/s/dMLwreWgZFsY56VrQv_dzw)
- [# ITSource分享第29期【在线文档管理系统的设计与实现】springboot+vue前后端分离+论文+PPT+部署文档](https://mp.weixin.qq.com/s/K1ON3lHfR_1K3iKgC2yhMw)
- [# ITSource分享第30期【在线考试管理系统的设计与实现】springboot+vue前后端分离+论文](https://mp.weixin.qq.com/s/s3rYbnRFRgcGYkFzWVlJyw)
- [# ITSource分享第31期【在线视频网站系统的设计与实现】springboot+vue前后端分离+论文](https://mp.weixin.qq.com/s/AdpMAAPM5PGz3scaYh9Hsg)
- [ITSource分享第32期【在线问卷调查网站系统的设计与实现】springboot+vue前后端分离](https://mp.weixin.qq.com/s/SXKUMVhMsKqKbeso2yWKdg)
- [ITSource分享第33期【在线小说阅读系统】](https://mp.weixin.qq.com/s/NAjSRu-dX9hJ4uftcOsvHA)
- [ITSource分享第34期【在线音乐系统】](https://mp.weixin.qq.com/s/B735KGOEslGcGh8m6wDAgA)
- [# ITSource分享第35期【学生宿舍管理系统】](https://mp.weixin.qq.com/s/CCXr-3-g4ZDTOGzTH6PVtA)
- [# ITSource分享第35期【学生宿舍管理系统】](https://mp.weixin.qq.com/s/CCXr-3-g4ZDTOGzTH6PVtA)
- [# ITSource分享第36期【在线校园外卖服务系统的设计与实现】springboot+vue前后端分离+论文](https://mp.weixin.qq.com/s/ja74mg441BjWhqInKzy-DQ)
---
> 可付费二次开发,  定制, 一对一讲解, 有意可微信联系:  **itguangit**

---