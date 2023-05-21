# ddd-hr-department


## 父module建设关键点

### 设置打包方式为pom
```html
<groupId>org.dddexample.hr</groupId>
<artifactId>ddd-hr-department</artifactId>
<version>1.0-SNAPSHOT</version>
<packaging>pom</packaging>
```

### 确认子包是否都已经依赖此包
```html
<modules>
    <module>department-start</module>
    <module>department-types</module>
    <module>department-persistence</module>
    <module>department-domain</module>
    <module>department-application</module>
    <module>department-web</module>
</modules>
```
