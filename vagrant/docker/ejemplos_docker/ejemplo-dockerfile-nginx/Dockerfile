# Version: 0.0.1
FROM ubuntu:14.04
MAINTAINER Ruben Gomez "rubengomez78@gmail.com"
RUN apt-get update
RUN apt-get install -y nginx
RUN echo '<marquee>Mira, un nuevo contenedor!<marquee/>' \
>/usr/share/nginx/html/index.html
EXPOSE 80
CMD nginx -g "daemon off;"
