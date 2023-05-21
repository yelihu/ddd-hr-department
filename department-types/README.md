# Types模块说明
## 代码规约要点
1. Types模块是保存可以对外暴露的Domain Primitives的地方。Domain Primitives因为是无状态的逻辑，可以对外暴露，所以经常被包含在对外的API接口中，需要单独成为模块
2. Types模块不依赖任何类库，纯POJO。

可以在这里定义
1. 一些异常，比如一些DP的验证异常可以在这里定义 比如`InvalidCurrencyException.class`
2. 可以暴露给对外的一些DP，这些是一些Value Object, 可以包含一点无状态的方法。

