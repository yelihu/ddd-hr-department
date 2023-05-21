# Infrastructure（persistence）模块说明
Infrastructure模块可以包含Persistence、Messaging、External等模块，这里是三个模块当中的一个

## 代码规约要点
1. Data Object
2. ORM Mapper
3. Entity到DO的转化类 assembler/converter

依赖关系：
1. Persistence模块包含数据库DAO的实现
2. 具体的ORM类库，比如MyBatis。
3. 需要用Spring-Mybatis提供的注解方案，则需要依赖Spring。


```xml
<dependency>
    <groupId>org.dddexample.hr</groupId>
    <artifactId>department-domain</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```
