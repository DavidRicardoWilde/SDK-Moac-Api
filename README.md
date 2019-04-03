# SDK-Moac-Api
Moac Restful API for Java and android.
- Read the [API document](https://moacdocs-chn.readthedocs.io/zh_CN/latest/restapi/RestfulAPI%E6%8E%A5%E5%8F%A3.html) for more details.

# Features
- Android support
- Asynchronous request support

## Demo 
```java
MoacService moacServiceManager = new MoacService(url);
```
For Asynchronous request
```java
MoacServiceAsyn moacServiceAsyn = new MoacServiceAsyn(new MoacNetworkService(url));
```

Please refer to [SDKDemo](https://github.com/DavidRicardoWilde/SDK-Moac-Api/blob/master/Demo/src/main/java/SDKDemo.java) for more details.
