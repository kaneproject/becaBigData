FROM frolvlad/alpine-oraclejdk8
RUN mkdir -p /opt/springboothome/{app,repository}
WORKDIR /opt/springboothome
ADD target/*.jar .

RUN cd $HOME && \
    curl http://download.jboss.org/wildfly/$WILDFLY_VERSION/wildfly-$WILDFLY_VERSION.tar.gz | tar zx && \
    mv $HOME/wildfly-$WILDFLY_VERSION $HOME/wildfly
RUN /opt/jboss/wildfly/bin/add-user.sh jboss jboss --silent
EXPOSE 8080 9990
CMD java -jar 