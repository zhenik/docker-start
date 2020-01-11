FROM ubuntu:18.04
ENV SLEEP_TIME $SLEEP_TIME
COPY docker-entrypoint.sh ./
RUN ["chmod", "+x", "/docker-entrypoint.sh"]
ENTRYPOINT ["/docker-entrypoint.sh"]