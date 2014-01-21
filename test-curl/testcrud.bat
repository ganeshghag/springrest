@echo off

rem getall
curl2 http://localhost:8080/mongo/

curl2 -i -X GET http://localhost:8080/mongo/007

rem insert
curl2 -i -X POST -H "Content-Type: application/json" -d "@insert.txt" http://localhost:8080/mongo

rem update
curl2 -i -X PUT -H "Content-Type: application/json" -d "@insert.txt" http://localhost:8080/mongo

rem delete
curl2 -i -X DELETE http://localhost:8080/mongo/007


