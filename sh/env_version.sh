#!/bin/bash
echo "LIB_VERSION=$(cat $1 | grep -Po '\d+\.\d+\.\d+')">> $GITHUB_ENV