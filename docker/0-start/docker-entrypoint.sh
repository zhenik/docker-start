#!/usr/bin/env bash

# sleep for some time
if [[ -z "$SLEEP_TIME" ]]; then
  SLEEP_TIME=25                     # default value, because $SLEEP_TIME is empty string
  echo "$SLEEP_TIME"                # print value of env variable
else
  echo "$SLEEP_TIME"
fi

echo "I like docker"                # running program simulation