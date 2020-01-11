# 2-cli
CLI - Command Line Interface.

```bash
# common cli for management
docker
  
# cli for container composition management 
docker-compose

# cli for managing docker machines (engines)
docker-machine

# cli for managing docker daemon
dockerd
```

In our daily work, we are going to use mostly `docker` and `docker-compose` CLIs.

## Important note
`!NB` Some of `CLI` commands are PATH dependent.

For instance: If you are building image with command `docker build .`, 
docker-client will look at current directory(where command was executed) in attempt to find `./Dockerfile` and use this file to build image.
If file does not exist, than you will get such a log:
```bash
niks-MBP:docker-start nik$ pwd && ls
/Users/nik/src/github.com/zhenik/docker-start
docker                  docker-start.iml        pom.xml                 src
niks-MBP:docker-start nik$ docker build .
unable to prepare context: unable to evaluate symlinks in Dockerfile path: lstat /Users/nik/src/github.com/zhenik/docker-start/Dockerfile: no such file or directory
``` 
