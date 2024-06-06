# cadastroAPI

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-D4FAFF?style=for-the-badge&logo=docker)

Proposta do desenvolvimento é efetuar cadastro de vendedores de acordo com seu perfil.

## Índice

- [Instalaçao](#instalaçao)
- [API Endpoints](#api-endpoints)

## Instalaçao

1. Clone o repositorio:

```bash
git clone https://github.com/CarolLopesFavaretto/cadastroAPI.git 
```

2. Instale dependências com Maven

## API Endpoints
A API fornece o seguinte endpoint:


```markdown
POST /sellers - Cadastro de Vendedores
```
Request:
```json
{
  "name": "Caroline",
  "cpf": "000.000.000-08",
  "email": "caroline@hotmail.com",
  "contractType": "CLT"
}
```

Response:
```json
{
  "registry": "20d9c2ca-71b4-46eb-954e-a3e822d6b2f3-CLT",
  "name": "Caroline",
  "cpf": "000.000.000-08",
  "email": "caroline@hotmail.com",
  "contractType": "CLT"
}
```
```
statusCode: 200
```

Error:
```json
{
  "statusCode": 400,
  "timestamp": "2024-06-06T21:05:15.301+00:00",
  "message": "Tipo de contrato invalido: CLTI",
  "description": "uri=/sellers;client=0:0:0:0:0:0:0:1"
}
```

```markdown
GET /sellers/{id} - Busca vendedores por id
```

Response:
```json
{
  "registry": "20d9c2ca-71b4-46eb-954e-a3e822d6b2f3-CLT",
  "name": "Caroline",
  "cpf": "000.000.000-08",
  "email": "caroline@hotmail.com",
  "contractType": "CLT"
}
```
```
statusCode: 200
```

Error:
```json
{
  "statusCode": 400,
  "timestamp": "2024-06-06T21:05:56.623+00:00",
  "message": "Vendedor nao encontrado",
  "description": "uri=/sellers/20d9c2ca-71b4-46eb-954e-a3e822d6b2f3-CLT"
}
```

```markdown
PUT /sellers/update/{id} - Atualizacao do cadastro de vendedores
```
Request:
```json
{
  "name": "Caroline",
  "cpf": "000.000.000-08",
  "email": "caroline@hotmail.com",
  "contractType": "CLT"
}
```

Response:
```json
{
  "registry": "20d9c2ca-71b4-46eb-954e-a3e822d6b2f3-CLT",
  "name": "Caroline",
  "cpf": "000.000.000-08",
  "email": "caroline@hotmail.com",
  "contractType": "CLT"
}
```
```
statusCode: 200
```
Error:
```json
{
  "statusCode": 400,
  "timestamp": "2024-06-06T21:05:56.623+00:00",
  "message": "Vendedor nao encontrado",
  "description": "uri=/sellers/20d9c2ca-71b4-46eb-954e-a3e822d6b2f3-CLT"
}
```


