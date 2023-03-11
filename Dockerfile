FROM openjdk:11
EXPOSE 8085
ADD target/docker_kubernetes_assignment.jar docker_kubernetes_assignment.jar
ENTRYPOINT ["java","-jar","/docker_kubernetes_assignment.jar"]