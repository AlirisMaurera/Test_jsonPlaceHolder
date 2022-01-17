# Teste api JsonPlaceHolder



Projeto de implementação de teste da api do site https://jsonplaceholder.typicode.com/, elaborado com configuração em gradle e gerando relatorio com cluecumber.



Pre requisitos:

* Java 14
* Intellij
* Gradle



Ferramentas:

* Cucumber
* RestAssured
* Plugin Cluecumber para gradle



para execução via linha de comando gradle cucumber



## Casos de testes

* ### Listando todos os recursos

| Cenário | Tipo de teste | Cenário de  teste         | Resultado  esperado                                  | status |
| ------- | ------------- | ------------------------- | ---------------------------------------------------- | ------ |
| C1      | Positivo      | Fazer  um get no endpoint | retornar  status 200 e mostrar uma lista de recursos | Ok     |

* ### Obter um recurso por id

| Cenário | Tipo de teste | Cenário de  teste                            | Resultado  esperado                                | status |
| ------- | ------------- | -------------------------------------------- | -------------------------------------------------- | ------ |
| C1      | Positivo      | Fazer  um get por id no endpoint             | retornar  status 200 e mostrar os dados do recurso | Ok     |
| C2      | Negativo      | Fazer  um get com um id invalido no endpoint | retornar  status 400                               | Ok     |



* ### Criar um recurso

| Cenário | Tipo de teste | Cenário de  teste                   | Resultado  esperado                                          | status |
| ------- | ------------- | ----------------------------------- | ------------------------------------------------------------ | ------ |
| C1      | Positivo      | criar  um recurso com dados validos | retornar  status 201 e mostrar os dados do recurso cadastrado | Ok     |



* ### Atualizar um recurso

| Cenário | Tipo de teste | Cenário de  teste                       | Resultado  esperado                                          | status |
| ------- | ------------- | --------------------------------------- | ------------------------------------------------------------ | ------ |
| C1      | Positivo      | atualizar  um recurso com dados validos | retornar  status 201 e mostrar os dados do recurso atualizado | Ok     |



* ### Atualizar o Titulo do recurso

| Cenário | Tipo de teste | Cenário de  teste                                | Resultado  esperado                                          | status |
| ------- | ------------- | ------------------------------------------------ | ------------------------------------------------------------ | ------ |
| C1      | Positivo      | atualizar o  titulo do recurso com dados validos | retornar  status 200 e mostrar os dados do recurso atualizado | Ok     |



* ### Deletando um recurso

| Cenário | Tipo de teste | Cenário de  teste          | Resultado  esperado  | status |
| ------- | ------------- | -------------------------- | -------------------- | ------ |
| C1      | Positivo      | deletar  um recurso por id | retornar  status 200 | Ok     |