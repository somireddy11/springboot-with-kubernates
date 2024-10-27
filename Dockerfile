FROM eclipse-temurin:17-focal

ADD target/*.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 9100
ENTRYPOINT ["sh", "-c","java -jar /app.jar"]