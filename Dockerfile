# 使用官方的 OpenJDK 17 镜像作为基础镜像
FROM openjdk:17-jdk-alpine

# 设置工作目录
WORKDIR /app

# 将 Maven 构建的 JAR 文件复制到容器中
COPY target/x-springboot-5.1.jar app.jar
# 暴露应用程序端口
EXPOSE 8080

# 运行 Spring Boot 应用程序
ENTRYPOINT ["java", "-jar", "app.jar"]