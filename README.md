
# Machine Learning User Defined Function (UDF) for Apache Kafka's KSQL

This project includes the source code and documentation to add a User Defined Function (UDF) for Deep Learning to Apache Kafka's KSQL.

The originally added source code can be found in the repository of zedite's KSQL project. This UDF is for implementing Deep Learning. A complete project, which is a fork of the original KSQL project including the Deep Learning UDF, can be accessed [here](https://github.com/zedite/ksql-fork-with-deep-learning-function). Clone and build this project to utilize the UDF in KSQL CLI or GUI.

## Use Case: Continuous Health Checks with Anomaly Detection
This UDF leverages a pre-trained analytic model within a KSQL UDF for continuous stream processing in real time. This is used for health checks and alerting in the event of risk. The system is based on the Kafka ecosystem which is used for inference, monitoring, and alerting.

## Deep Learning with an H2O Autoencoder for Sensor Analytics
The User-Defined KSQL Function ‘AnomalyKudf’ applies an H2O Neural Network. The class creates a new object instance of the Deep Learning model and applies it to the incoming sensor messages to detect anomalies.

## Implementation of the H2O Deep Learning KSQL UDF
To implement your own UDF, follow these steps:

1. Implement the UDF (Kudf Interface).

2. Embed the analytic model.

3. Register new UDF to FunctionRegistry.

## Quick Start for KSQL Machine Learning UDF
To test this implementation, you can add the code of this project to your KSQL clone or clone the following which includes all the code and stands ready to offer the UDF for Anomaly Detection without any code changes.

The analytic model and its dependency are included in this project. Just start Kafka and the KSQL engine to send input streams for inference. Steps to try it out are also provided.