FROM node
# Agregamos el directorio src
ADD src/ /src
# Accedemos al directorio src
WORKDIR /src
# Definimos las dependencias
RUN npm install
# Exponemos el puerto 80
EXPOSE 80
# Iniciamos el proces node
CMD ["node", "index.js"]
