# spring-boot-kafka
In my last article, we created a sample [Java and Apache Kafka subscriber and producer example](http://www.devglan.com/apache-kafka/apache-kafka-java-example).In this article, we will be using spring boot 2 feature to develop a sample Kafka subscriber and producer application.We will take a look at the use of KafkaTemplate to send messages to Kafka topics, @KafkaListener annotation to listen to those messages and @SendTo annotation to forward messages to a specified topic.We will also take a look at how to produce messages to multiple partitions of a single topic and how those messages are consumed by a consumer group along with custom message converters in spring boot.

Other Articles on Apache Kafka
[Stream Spring Boot Log4j Logs to Kafka](http://www.devglan.com/apache-kafka/stream-log4j-logs-to-kafka)
[Kafka ElasticSearch Logstash Example](http://www.devglan.com/apache-kafka/kafka-elasticsearch-logstash-example)
