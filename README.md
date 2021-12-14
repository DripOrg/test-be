# Desafio Backend Drip

### Resumo

Criar uma aplicação que sirva uma API Rest para converter timezones.

- Criar um endpoint para receber uma lista de timezones e mostrar a conversão entre todas elas (24 horas) levando em conta a hora 00:00
    - O timezone padrão deve ser o UTC.
    - Requisição esperada:
      ```
      {
          "timezones": [
              "America/Rio_Branco",  
              "Antarctica/Mawson",
              "Asia/Chita"
          ]
      }
      ```
    - Resposta esperada:
      ```
      [
          {
              "timezone": "America/Rio_Branco",
              "utcOffset": "−05:00",
              "time": "2021-12-16 19:00",
              "tooEarly": false,
              "tooLate": true
          },
          {
              "timezone": "Antarctica/Mawson",
              "utcOffset": "+05:00",
              "time": "2021-12-17 05:00",
              "tooEarly": true,
              "tooLate": false
          },  
          {
              "timezone": "Asia/Chita",
              "utcOffset": "+09:00",
              "time": "2021-12-17 09:00",
              "tooEarly": false,
              "tooLate": false
          }        
      ]
      ```
- Criar um endpoint para receber uma timezone, um horário(HH:MM) e uma lista de timezones e mostrar a conversão daquele horário entre todas as timezones
    - A timezone "padrão" deve ser a recebida pelo endpoint.
    - Requisição esperada:
      ```
       {
           "time": "12:00",
           "timezones": [
               "Africa/Abidjan",
               "America/Sao_Paulo",
               "America/Port-au-Prince"
           ]
       }
      ```
    - Resposta esperada:
      ```
      [
          {
              "timezone": "Africa/Abidjan",
              "utcOffset": "+00:00",
              "time": "2021-12-17 12:00",
              "tooEarly": false,
              "tooLate": false
          },
          {
              "timezone": "America/Sao_Paulo",
              "utcOffset": "−05:00",
              "time": "2021-12-17 07:00",
              "tooEarly": true,
              "tooLate": false
          },  
          {
              "timezone": "America/Port-au-Prince",
              "utcOffset": "−03:00",
              "time": "2021-12-17 09:00",
              "tooEarly": false,
              "tooLate": false
          }      
      ]
      ```
    - Destacar quando um horário é "tarde demais" ou "cedo demais" em alguma timezone
    - Considerar `< 08:00` cedo demais e `> 18:00` tarde demais

### Banco de dados

O banco de dados para o desafio será carregado em memória e povoado assim que a aplicação estiver rodando.

Formato do banco de dados:

- id: INT<PK>
- name: VARCHAR
- utc_offset: VARCHAR

| id  | name           | utc_offset | 
|-----|----------------|------------|
| 1   | Africa/Abidjan | +00:00     |
| 2   | Africa/Algiers | +01:00     |
| 3   | Africa/Bissau  | +00:00     |
| ... | ...            | ...        |

### Docker
 - Necessário `docker-compose` instalado.

Existe um container docker pronto para servir a aplicação na porta 8080 para desenvolvimento.

O único comando necessário para inicialização é:
```
docker-compose up -d
```
