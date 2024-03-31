$scriptDir = Split-Path -Parent $MyInvocation.MyCommand.Definition
$databaseDir = Join-Path $scriptDir "database"
Write-Output $databaseDir
docker run -d --name rang-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=senha-mysql -v ${databaseDir}:/docker-entrypoint-initdb.d mysql:latest
