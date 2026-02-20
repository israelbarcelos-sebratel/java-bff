#!/bin/bash

echo "--- 📥 Iniciando Git Pull ---"
git pull # mude para sua branch (master/main/dev)

# Verifica se o git pull falhou
if [ $? -ne 0 ]; then
    echo "❌ Erro ao baixar código do Git. Abortando."
    exit 1
fi

echo "--- 🏗️  Limpando e Buildando Containers ---"
docker-compose up -d --build

echo "--- 🧹 Removendo imagens órfãs (opcional) ---"
docker image prune -f

echo "--- 📋 Status dos Containers ---"
docker-compose ps

echo "🚀 Aplicação atualizada com sucesso!"
