# Usa o Java 21 (versão leve)
FROM eclipse-temurin:21-jre-alpine

# Define o diretório de trabalho
WORKDIR /app

# Copia o seu JAR para dentro do container
COPY ./target/bff-0.0.1-SNAPSHOT.jar app.jar

# Expõe a porta que o Spring usa
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
