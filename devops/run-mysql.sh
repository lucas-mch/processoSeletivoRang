#!/bin/bash

SCRIPTS_DIR=$(cd "$(dirname "$0")" && pwd)
DATABASE_DIR="$SCRIPTS_DIR/database"

docker run -d --name rang-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=senha-mysql -v "$DATABASE_DIR:/docker-entrypoint-initdb.d" mysql:latest