# Use uma imagem base do JBoss
FROM jboss/wildfly:latest

RUN /opt/jboss/wildfly/bin/add-user.sh admin admin --silent

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]

COPY target/processoSeletivoRang.war /opt/jboss/wildfly/standalone/deployments/

EXPOSE 8080
