dora-app-visibility-support
![Release](https://jitpack.io/v/dora4/dora-app-visibility-support.svg)
--------------------------------

#### gradle依赖配置

```kotlin
// 添加以下代码到项目根目录下的build.gradle.kts
allprojects {
    repositories {
        maven { setUrl("https://jitpack.io") }
    }
}

dependencies {
    // 扩展包必须在有主框架dora的情况下使用
    implementation("com.github.dora4:dora:1.3.60")
    implementation("com.github.dora4:dora-app-visibility-support:1.0")
}
```
#### Dora SDK生命周期注入配置
添加以下代码到AndroidManifest.xml
```xml
<application>
        <meta-data
            android:name="dora.lifecycle.config.AppVisibilityGlobalConfig"
            android:value="GlobalConfig" />
</application>
```
#### 使用方式
代码任意位置添加以下判断。
```kotlin
if (AppVisibility.isForeground) {
    // 前台运行
} else {
    // 后台运行
}
```
