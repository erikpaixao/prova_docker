FROM node:alpine

WORKDIR /app/prova/node-prova

COPY package*.json ./

RUN npm install

COPY . .

EXPOSE 3000

CMD [ "node", "app.js" ]

