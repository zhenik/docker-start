# 0-start
## Why docker
> Fast, **consistent** delivery of your applications.

* Forget about problem -> ~~Application doe not work on my machine~~, works same on all machines

[Official documentation](https://docs.docker.com/engine/docker-overview/)


**Additional motivation:** docker based on virtualization. 
It is fundamental to understand `networks`, `volumes`, `port mapping`, etc...
Understanding will make further work with orchestration tools( `k8s`, `hashiCorp nomad` ) easier, once you got these concept s. 
## Image vs Container
[**def1**] A Docker image is a file, comprised of multiple layers, used to execute code in a Docker container.

[ref](https://searchitoperations.techtarget.com/definition/Docker-image)

[**def2**]
A Docker image is a set of instructions to instantiate container. 

Example:
```dockerfile
FROM ubuntu:18.04
COPY docker-entrypoint.sh ./
RUN ["chmod", "+x", "/docker-entrypoint.sh"]
ENTRYPOINT ["/docker-entrypoint.sh"]
``` 

3 logical groups of instructions: `base-image`, `instructions` and `run` 
```
FROM        base-image
...         custom commands (instructions)
...
...
ENTRYPOINT  how to run application
```

**Relationship Image-Container** could be interpreted as `Java_class - Object_instance`.



## Image syntax
Docker images has own syntax how to define instructions. [Docker doc](https://docs.docker.com/)
```dockerfile
FROM ...
MAINTAINER ...
RUN ...
ADD ...
ENV ...
CMD ...
ENTRYPOINT ...
... // and more
```

## CLI
```bash
# build an image
docker build -t zhenik/docker-test . 

# check local images
docker images
```


