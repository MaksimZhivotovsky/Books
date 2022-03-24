./gradlew clean build

docker build . -t zhivotovsky/books-api:1.0.0
docker push zhivotovsky/books-api:1.0.0