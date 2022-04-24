docker stop prolog_hello_dev
docker build -t prolog_hello .
docker run -d --rm -p 5001:8080 --name prolog_hello_dev prolog_hello 
