# Aula 13/05/2023 - Técnicas de Programação II - Curso D.S.M Fatec Araras
<h3>Aula API-REST</h3>

Start project in Main.java

## Métodos de chamada http

HelloAPIGet - GET:
http://localhost:8080/
http://localhost:8080/all

HelloApiPost - POST:
http://localhost:8080

body:
{
    "id": 220,
    "description": "Lorem ipsun dolor...",
    "data": "2023-02-01"
}

Create Category - POST:
http://localhost:8080/category/new

body:
{
    "id": 100,
    "description": "Suggestion"
}

HelloApiPut - PUT:
http://localhost:8080/{id}

body:
{
    "id": 100,
    "description": "Lorem ipsun dolor...",
    "data": "2023-02-01"
}

HelloAPiDelete - DELETE:
http://localhost:8080/{id}
