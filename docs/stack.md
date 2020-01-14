# Stack
## MinIO
[MinIO Github](https://github.com/minio/minio)
MinIO is High Performance Object Storage released under Apache License v2.0. 
It is API compatible with Amazon S3 cloud storage service. 
Using MinIO build high performance infrastructure for machine learning, analytics and application data workloads.

`Role in architecture`
* Object storage (files)
* OLAP 
* Source of truth (Controversial - due to OLAP oriented)

## Hive Metastore
[Apache Hive Github](https://github.com/apache/hive)
> * Tools to enable easy access to data via SQL, thus enabling data warehousing tasks such as extract/transform/load (ETL), reporting, and data analysis
> * A mechanism to impose structure on a variety of data formats
> * Access to files stored either directly in Apache HDFS (TM) or in other data storage systems such as Apache HBase (TM)
> * Query execution using Apache Hadoop MapReduce, Apache Tez or Apache Spark frameworks.

`Role in architecture`
* Store metadata
* Query available to others components

The Hive Metastore, also referred to as HCatalog is a relational database repository containing metadata about objects you create in Hive. 
When you create a Hive table, the table definition (column names, data types, comments, etc.) are stored in the Hive Metastore. 
This is automatic and simply part of the Hive architecture. 
The reason why the Hive Metastore is critical is because it acts as a central schema repository which can be used by other access tools like Spark and Pig. 
Additionally, through Hiveserver2 you can access the Hive Metastore using ODBC and JDBC connections. 
This opens the schema to visualization tools like PowerBi or Tableau.
The only configuration you have to be concerned about is the initial install when you decide what relational database to use. 
The default is ProgresSQL but for production we recommend using Oracle or a system which is already being backed up and secured. Hope this helps.

[Reference 1](https://data-flair.training/blogs/apache-hive-metastore/)
[Kafka-Hive integration](https://blog.cloudera.com/introducing-hive-kafka-sql/)

## Apache Kafka
[Apache Kafka Github](https://github.com/apache/kafka)
Distributed streaming platform.

`Role in architecture`
* Log for other components
* Transactions
* Data ?

> * Building real-time streaming data pipelines that reliably get data between systems or applications
> * Building real-time streaming applications that transform or react to the streams of data

## Presto
[Presto Github](https://github.com/prestodb/presto)
> Presto is a distributed SQL query engine for big data.

`Role in architecture`
* OLAP

## Apache NiFi
[Apache NiFi Github](https://github.com/apache/nifi)
> Apache NiFi is an easy to use, powerful, and reliable system to process and distribute data.
> Apache NiFi was made for dataflow. It supports highly configurable directed graphs of data routing, transformation, and system mediation logic. Some of its key features include

`Role in architecture`
* ETL

## Apache AirFlow
[Apache AirFlow Github](https://github.com/apache/airflow)
> A platform to programmatically author, schedule, and monitor workflows.
> When workflows are defined as code, they become more maintainable, versionable, testable, and collaborative.

`Role in architecture`
* Pipeline management

## Examples of integration
[Presto + Hive + MinIO](https://blog.minio.io/presto-modern-interactive-sql-query-engine-for-enterprise-ce56d7aea931)