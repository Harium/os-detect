# os-detector
Lightweight fork of SystemUtils.java from Apache Commons Lang

## Maven
```
<dependency>
    <groupId>com.harium.util</groupId>
    <artifactId>os-detector</artifactId>
    <version>1.0.0</version>
</dependency>
```


## Usage
Use it as Apache Commons Lang:

```java
if (SystemUtils.IS_OS_WINDOWS) {
    // do something
} else {
    // do something
}
```

Or with OSDetector:
```java
if (OS.Linux == OSDetector.getOS()) {
    // do something
} else {
    // do something
}
```
