

### JWT security
Page `http://localhost:8080/api/hello` is secured. To access this page, you need to do the following:

* **POST** request to `http://localhost:8080/api/signup` with body
```json
  username: "user",
  password: "12345"
```
* **POST** request to `http://localhost:8080/api/auth`, then take token from response and use it in header to access secured page
* **GET** request to `http://localhost:8080/api/hello` with header:
```json
  x-auth-token: <your token here>
```
