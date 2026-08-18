#!/bin/bash

#SE DER ERRO É ABORTADO
set -e

#EXIBE UMA MENSAGEM NO TERMINAL
echo "Iniciando MySQL..."
#INICIA O MYSQL
service mysql start

#FICA PINGANDO O MYSQL ATE ELE RESPONDER
echo "Aguardando MySQL ficar pronto..."
for tentativa in $(seq 1 30); do
    if mysqladmin ping --silent; then
        echo "MySQL pronto."
        break
    fi
    sleep 1
done

# Se passou das 30 tentativas sem resposta, para o script com erro.
if ! mysqladmin ping --silent; then
    echo "Erro: MySQL não respondeu a tempo." >&2
    exit 1
fi

echo "Configurando banco..."

#Envia os comandos a seguir para o MYSQL    
mysql <<EOF
CREATE DATABASE IF NOT EXISTS ecommerce
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

CREATE USER IF NOT EXISTS 'trovo'@'%' IDENTIFIED BY 'Allf42313756_';

GRANT ALL PRIVILEGES ON ecommerce.* TO 'trovo'@'%';

FLUSH PRIVILEGES;
EOF

echo "MySQL configurado com sucesso!"
