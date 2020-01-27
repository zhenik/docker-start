# 4-network

* [Basic docker networking](https://runnable.com/docker/basic-docker-networking)
* [Docker network: official documentation](https://docs.docker.com/network/)
## General info
Docker networks:
* none
* bridge
* host
* defined by user (overlay networks)*

Containers, by default, run in `default bridge network` of docker-host.

[Docker networking explanation. Video](https://www.youtube.com/watch?v=Xxhhdo2e-DA&feature=youtu.be) 
### 0-Build image
```bash
docker build -t network-application .
```
### 1-Check docker host network
```bash
ifconfig 
``` 
Output example:
```bash
...
docker0   Link encap:Ethernet  HWaddr 02:42:f0:8b:eb:7e  
          inet addr:172.17.0.1  Bcast:172.17.255.255  Mask:255.255.0.0
          inet6 addr: fe80::42:f0ff:fe8b:eb7e/64 Scope:Link
          UP BROADCAST RUNNING MULTICAST  MTU:1500  Metric:1
          RX packets:0 errors:0 dropped:0 overruns:0 frame:0
          TX packets:76 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:0 
          RX bytes:0 (0.0 B)  TX bytes:14290 (14.2 KB)
...l
```

### 2-Let's run two containers**
```bash
docker run -d network-application
docker run -d network-application

docker ps
```

Inspect networks of container:
```bash
docker inspect <container1_id> | grep Network
docker inspect <container2_id> | grep Network
```

Output example (same for both containers): 
```bash
    "NetworkMode": "default",
"NetworkSettings": {
    "Networks": {
            "NetworkID": "1961b56c91bfd309c850cff8774ffc4e6145b5508576f2b46e0a55bf33db6b27",
```

Containers can communicate with each other via IP.
```bash
docker inspect <container_1_id> | grep IPAddress

docker exec <container_2_id> ping <container_1_IPAddress>
```

> Docker does not support automatic service discovery on the default bridge network. 
>If you want containers to be able to resolve IP addresses by container name, you should use user-defined networks instead.
[Official documentation](https://docs.docker.com/v17.09/engine/userguide/networking/#the-default-bridge-network)

todo:
- port mapping
- docker engine has dns
- docker-compose creates default network, all services are in that network (by default) 
