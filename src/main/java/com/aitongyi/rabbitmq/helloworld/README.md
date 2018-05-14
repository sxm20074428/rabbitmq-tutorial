# 运行测试

 如果在windows7下，你需要先双击rabbitmq-server.bat，来启动RabbitMQ服务。  
 否则，运行我们的程序时，会提示【java.net.ConnectException: Connection refused: connect】

 先运行消费者服务器来关注【hello】这个队列的情况。  
C [*] Waiting for messages. To exit press CTRL+C  

然后再运行生产者端，发送消息到队列中：  
P [x] Sent 'Hello World!'  

再切换到消费者端的控制台，查看日志：  
C [*] Waiting for messages. To exit press CTRL+C  
C [x] Received 'Hello World!'  

#总结

从上面的日志，我们就算是对RabbitMQ 的消息流有了一个基本的了解，如果你想更进一步，请进入到第二章-Work Queues的教程