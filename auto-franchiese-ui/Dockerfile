FROM node:16-alpine

WORKDIR /usr/src/app

COPY package.json yarn.lock ./

RUN yarn install

COPY . .

RUN ng build --prod

FROM nginx:1.19-alpine

COPY nginx.conf /etc/nginx/conf.d/default.conf

COPY dist/auto-franchiese-ui /usr/share/nginx/html

CMD ["nginx", "-g", "daemon off;"]
