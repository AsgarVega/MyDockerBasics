FROM swipl:stable

# The user that will run the app 
ARG USER=docker
ARG PW=docker

WORKDIR /app/

COPY ./prolog /app
CMD ["swipl", "/app/start.pl"]

