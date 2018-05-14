# RabbitMQ Java Client Library

The RabbitMQ Java client library allows Java code to interface with RabbitMQ.

5.x release series of this library require JDK 8, both for compilation and at runtime.  
On Android, this means only Android 7.0 or later versions are supported.  
4.x release series support JDK 6 and Android versions prior to 7.0.

##Adding Library Dependency

The recommended way to get started using the RabbitMQ Java AMQP in your project is with a dependency management system.

The snippet below can be copied and pasted into your build if you're using Maven:
```
<dependency>
  <groupId>com.rabbitmq</groupId>
  <artifactId>amqp-client</artifactId>
  <version>5.2.0</version>
</dependency>
```
#[API reference](https://rabbitmq.github.io/rabbitmq-java-client/api/current/overview-summary.html)

`Packages`

Package	| Description
--------- |: --------
com.rabbitmq.client	|The client API proper| classes and interfaces representing the AMQP connections, channels, and wire-protocol framing descriptors.
com.rabbitmq.client.impl	|Implementations of interfaces specified in the client API, and their supporting classes.
com.rabbitmq.client.impl.nio	| 
com.rabbitmq.client.impl.recovery	 |
com.rabbitmq.tools.json	|JSON reader/writer and utility classes.
com.rabbitmq.tools.jsonrpc	|JSON-RPC client and server classes for supporting JSON-RPC over an AMQP transport.
com.rabbitmq.utility	|Utility package of helper classes, mostly used in the implementation code.

##Overview

RabbitMQ Java client uses com.rabbitmq.client as its top-level package. The key classes and interfaces are:

* Channel: represents an AMQP 0-9-1 channel, and provides most of the operations (protocol methods).
* Connection: represents an AMQP 0-9-1 connection
* ConnectionFactory: constructs Connection instances
* Consumer: represents a message consumer
* DefaultConsumer: commonly used base class for consumers
* BasicProperties: message properties (metadata)
* BasicProperties.Builder: builder for BasicProperties  

Protocol operations are available through the Channel interface. Connection is used to open channels, register connection lifecycle event handlers, and close connections that are no longer needed. Connections are instantiated through ConnectionFactory, which is how you configure various connection settings, such as the vhost or username.


