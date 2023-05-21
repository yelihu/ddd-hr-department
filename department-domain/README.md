# Domain模块说明

## 代码规约要点

Domain模块是核心业务逻辑的集中地

可以在这里定义

1. 有状态的Entity
2. 领域服务Domain Service
3. 各种外部依赖的接口类（如Repository、ACL防腐层、中间件等）

依赖关系：仅依赖Types模块

```xml
<dependency>
    <groupId>org.dddexample.hr</groupId>
    <artifactId>department-domain</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```
