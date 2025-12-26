#!/bin/sh

# 复制项目的文件到对应docker路径，便于一键生成镜像。
usage() {
	echo "Usage: sh copy.sh"
	exit 1
}


# copy sql
echo "begin copy sql "
cp ../sql/ry_20250523.sql ./mysql/db
cp ../sql/ry_config_20250902.sql ./mysql/db

# copy html
echo "begin copy html "
cp -r ../x5-ui/dist/** ./nginx/html/dist


# copy jar
echo "begin copy x5-gateway "
cp ../x5-gateway/target/x5-gateway.jar ./x5/gateway/jar

echo "begin copy x5-auth "
cp ../x5-auth/target/x5-auth.jar ./x5/auth/jar

echo "begin copy x5-visual "
cp ../x5-visual/x5-monitor/target/x5-visual-monitor.jar  ./x5/visual/monitor/jar

echo "begin copy x5-modules-system "
cp ../x5-modules/x5-system/target/x5-modules-system.jar ./x5/modules/system/jar

echo "begin copy x5-modules-file "
cp ../x5-modules/x5-file/target/x5-modules-file.jar ./x5/modules/file/jar

echo "begin copy x5-modules-job "
cp ../x5-modules/x5-job/target/x5-modules-job.jar ./x5/modules/job/jar

echo "begin copy x5-modules-gen "
cp ../x5-modules/x5-gen/target/x5-modules-gen.jar ./x5/modules/gen/jar

