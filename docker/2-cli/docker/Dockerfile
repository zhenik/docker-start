FROM ubuntu:18.04
COPY docker-entrypoint.sh ./
RUN ["chmod", "+x", "/docker-entrypoint.sh"]
ENTRYPOINT ["/docker-entrypoint.sh"]