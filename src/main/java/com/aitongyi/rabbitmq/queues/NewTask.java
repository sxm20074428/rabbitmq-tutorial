package com.aitongyi.rabbitmq.queues;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

/**
 * 工厂任务安排者（生产者P）
 */
public class NewTask {

    private static final String TASK_QUEUE_NAME = "task_queue";

    public static void main(String[] argv) throws Exception {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection()) {
            try (Channel channel = connection.createChannel()) {

                channel.queueDeclare(TASK_QUEUE_NAME, true, false, false, null);
                //	分发消息
                for (int i = 0; i < 5; i++) {
                    String message = "Hello World! " + i;
                    channel.basicPublish("", TASK_QUEUE_NAME, MessageProperties.PERSISTENT_TEXT_PLAIN, message.getBytes());
                    System.out.println(" [x] Sent '" + message + "'");
                }
            }
        }
    }
}
