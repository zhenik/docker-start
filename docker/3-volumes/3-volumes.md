# 3-volumes
> Docker volumes are free-floating filesystems. They don't have to be connected to a particular container. You can use volumes mounted from data-only containers for portability.

[Official documentation: volumes](https://docs.docker.com/storage/volumes/)

## Volume map (docker-cli)
```bash
# Run container with volume
docker run -d -v "${PWD}/some-file.txt:/file-inside-container.txt" my-first-app:2.0

# Run container bash
 docker exec -it <container_id> bash

# verify that file exist in container
ls

# write something to the file
echo "some data for the file" >> file-inside-container.txt

# You can see that data written by container appear in mapped file on host machine (and vice versa)
```

Things to know:
* map volumes `<host_filesystem>:<container_filesystem>`
* several volumes could be mapped to 1 container
* 1 volume could be mapped to several containers
* volumes can be mapped: file-to-file; directory-to-directory
* volumes can not be mapped ~~directory-to-file~~ or ~~file-to-directory~~

## Volume map (docker-compose-cli)
Example of `docker-compose.yml` file

```yaml
version: '3'
services:
  my-application1:
    image: my-first-app:2.0
    environment:
      SLEEP_TIME: 5
      CUSTOM_VARIABLE: "Yohohoho and bottle of Rom"
    volumes:
    - "./some-file.txt:/file-inside-container1.txt" # 1 way how to map volume

  my-application2:
    image: my-first-app:2.0
    environment:
      SLEEP_TIME: 100
    volumes:
    - "./some-file.txt:/file-inside-container2.txt"
```