### SpringBoot + Mybatis Plus + Generator整合的案例

#### 运行环境:

  1. Jdk 8
  2. Maven 3.5.4
  3. Mysql 8.0.12
  
  
#### 如何运行:
  
  1.创建一个数据库名为db_mp_test, 执行mp_test.sql建表文件.
  
  2.配置好application.yml文件.
  
  3.配置MpGenerator.java配置类的信息, 并运行main方法生成代码.
  
  4.控制台输入要生成代码的表名, 成功后就可以运行测试类来测试.
  
  
#### 提示:
  1. 生成器会根据表分别生成entity, mapper, service, controller和XxxMapper.xml;
  2. 使用Mybatis-plus可以实现默认CRUD, 条件查询, 分页排序, sql性能分析等;
  3. 更多请参考Mybatis-plus[官方文档](https://mp.baomidou.com/);
