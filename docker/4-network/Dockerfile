FROM ubuntu:18.04
ENV SLEEP_TIME $SLEEP_TIME

RUN set -eux
RUN apt-get update
RUN apt-get install -y --no-install-recommends inetutils-ping;

COPY docker-entrypoint.sh ./
RUN ["chmod", "+x", "/docker-entrypoint.sh"]
ENTRYPOINT ["/docker-entrypoint.sh"]