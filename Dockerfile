FROM eclipse-temurin:17
COPY target/autoapp.jar autoapp.jar
CMD [ "java","-jar","autoapp.jar" ]