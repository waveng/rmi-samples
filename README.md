# rmi-samples
rmi dome  
### java的 rmi使用过程中若遇的问题，可以尝试如下的解决方法

错误 1 ：  
```java
java.rmi.server.ExportException: remote object implements illegal remote interface; nested exception is: 
	java.lang.IllegalArgumentException: illegal remote method encountered: public abstract java.lang.String my.rmi.samples.api.Hello.sayHi(java.lang.String)
	at sun.rmi.server.UnicastServerRef.exportObject(UnicastServerRef.java:225)
	at java.rmi.server.UnicastRemoteObject.exportObject(UnicastRemoteObject.java:383)
	at java.rmi.server.UnicastRemoteObject.exportObject(UnicastRemoteObject.java:320)
Caused by: java.lang.IllegalArgumentException: illegal remote method encountered: public abstract java.lang.String my.rmi.samples.api.Hello.sayHi(java.lang.String)
	at sun.rmi.server.Util.checkMethod(Util.java:267)
	at sun.rmi.server.Util.getRemoteInterfaces(Util.java:246)
	at sun.rmi.server.Util.getRemoteInterfaces(Util.java:216)
	at sun.rmi.server.Util.createProxy(Util.java:146)
	at sun.rmi.server.UnicastServerRef.exportObject(UnicastServerRef.java:223)
```
解决方法 ：若提示这样的错误说明接口函数未设置异常抛出，在所提示的函数后面加上throw Exception即可解决

错误 2：exception:
```java
java.rmi.MarshalException: error marshalling arguments; nested exception is: 
	java.io.NotSerializableException: my.rmi.samples.provider.HelloImpl
	at sun.rmi.registry.RegistryImpl_Stub.rebind(Unknown Source)
	at java.rmi.Naming.rebind(Naming.java:177)
	at my.rmi.samples.provider.HelloImplTest.sayHi(HelloImplTest.java:28)
Caused by: java.io.NotSerializableException: my.rmi.samples.provider.HelloImpl
	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1184)
	at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:348)
```
解决方法：若提示这样的错误说明某个类是不能序列化的，需要在该类实现加上implements Serializable，或者 extends UnicastRemoteObject 即可解决