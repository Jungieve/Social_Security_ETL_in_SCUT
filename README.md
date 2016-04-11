## 项目说明

###部署环境
- Tomcat8 + JDK8 + Spring4.2.5
- Idea 15.02

###如何部署
- clone本项目git地址到你的idea中
- 导入jar包
- 配置IDEA artifacts以及tomcat
- 将Job文件复制到C盘下面 不能复制到别的地方

###如何成功
- 启动tomcat，输入localhost:8080/ETL/html/index.html 可以看到界面 说明成功部署前端
- 输入localhost:8080/ETL/job，可以启动ETLjob 说明成功部署后台

###项目目标
- 实现数据读取 前后台交互
- 维护各个子模块的统一性

###更强悍的开发
- 下载并部署jrebel，可以做到tomcat下java源码编译后无需reload即可热启动
- 在idea配置github，轻松upload和commit