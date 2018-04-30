# Basic-API
# How to Use

This project is not linked to an actual database just yet. As such, testing of this API project
requires the use of Postman.

### Testing GET
Can only be used at
```sh
http://localhost:8080/list/
http://localhost:8080/list/{id number}
```

### Testing POST
Can only be used at
```sh
http://localhost:8080/list/
```
example of body:
```sh
    {
        "id": "4",
        "middleini": "X",
        "lastname": "Dela Cruz",
        "address": "Pampanga",
        "mobile": "099999999",
        "name": "Juan"
        }
```

### Testing PUT
Can only be used at
```sh
http://localhost:8080/list/{id number}
```
example of body:
```sh
    {
        "id": "3",
        "middleini": "Y",
        "lastname": "Elcross",
        "address": "Pampang",
        "mobile": "091111111",
        "name": "John"
        }
```

### Testing DELETE
Can only be used at:
```sh
http://localhost:8080/list/{id number}
```

