Java project with docker:
docker build -t auto-franchiese-api .
docker run -p 8080:8080 auth-franchiese-api
access browser: localhost

Angular project with docker:
docker build -t auto-franchiese-ui .
docker run -p 80:80 auth-franchiese-ui
access browser: localhost
