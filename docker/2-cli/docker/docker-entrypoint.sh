#!/usr/bin/env bash


echo "Configuration check"
echo "I am in directory"; pwd

# sleep for some time
if [[ -z ${SLEEP_TIME} ]]; then
  SLEEP_TIME=25                     # default value, because $SLEEP_TIME is empty string
  echo "$SLEEP_TIME"                # print value of env variable
else
  echo "$SLEEP_TIME"
fi
echo "Sleep before start $SLEEP_TIME"                  # sleep before start :) just a simulation
echo "Application started"; sleep 40000                # running program simulation (40_000 seconds)
echo "I am done"