FROM lcsmachaado/rang-custom-wildfly:latest

RUN /opt/jboss/wildfly/bin/add-user.sh admin admin --silent

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0","-Djboss.socket.binding.port-offset=100", "-Djava.net.preferIPv4Stack=true","--debug"]

COPY target/ROOT.war /opt/jboss/wildfly/standalone/deployments/

EXPOSE 8080