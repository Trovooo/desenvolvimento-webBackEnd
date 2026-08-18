#Definição da imaggem
FROM maven:3.9-eclipse-temurin-21-noble

#Desabilita a intalação interativa
ENV DEBIAN_FRONTEND=noninteractive

#Instala as ferramentas que não existem na imagem base
#Remove os arquivos temporarios derivados da instalação provenientes do processo
#app-get update - Atualiza o repositorio de softwares
#app-et install - Vai instalar as ferramentas
#curl - Trafeo de arquivos na internet
#apt-get clean e rm - Limpam os arquivos temporarios
RUN apt-get update && apt-get install -y \
    mysql-server-8.0 \
    git \
    git-lfs \
    curl \
    unzip \
    zip \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*
