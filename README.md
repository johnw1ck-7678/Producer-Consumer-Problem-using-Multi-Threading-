# Producer-Consumer-Problem-using-Multi-Threading-
This project demonstrates the classical Producer–Consumer synchronization problem implemented using multi-threading. The problem models a real-world scenario where one or more producer threads generate data and place it into a shared bounded buffer, while one or more consumer threads remove and process that data concurrently.

**#Objective**

The main objective is to ensure safe and efficient communication between producer and consumer threads by:
--Maintaining mutual exclusion while accessing the buffer.
--Blocking producers when the buffer is full.
--Blocking consumers when the buffer is empty.
--Allowing concurrent execution without busy waiting.

**#Features**

1) Multi-threaded producer and consumer simulation.
2) Thread-safe bounded buffer.
3) Prevention of race conditions.
4) Demonstration of thread coordination and communication.

**#Applications**

The Producer–Consumer pattern is commonly used in:
-Task scheduling systems.<br>
-Message queues and event-driven architectures.<br>
-Logging and streaming pipelines.<br>
-Backend request processing and job workers.






