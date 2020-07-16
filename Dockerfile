FROM openjdk:11
ADD target/aws-fargate-springboot.jar aws-fargate-springboot.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "aws-fargate-springboot.jar"]
