# Informações importantes da aplicação

Design Pattern é uma forma padrão de organizar as classes e objetos, onde são compartilhados conhecimentos sobre orientação objeto aplicados a problemas que acontecem em diversos cenários de desenvolvimento de software.

Com o Design Pattern você terá vários benefícios dentre eles são, código mais enxuto, limpo, organizado, aumentar a qualidade e diminuir a complexidade do seu código.

Basicamente, os padrões de projeto podem ser divididos em três grandes grupos, que são os seguintes:

Creational Patterns (criacionais);     
Structural Patterns (estruturais);  
Behavior Patters (comportamentais).

O nosso projeto consta os seguintes Design Patterns:


**Builder:** -> Local:   *UsuarioServiceImpl* ->  Descrição: Usado na camada de servicos para setar informacoes na classe de usuarios.



**Strategy** -> Local:  *service/controller*  -> Descrição: utilizado para evitar os diversos ifs que poderiamos utilizar.

**A nossa aplicação utiliza arquiteturas, ferramentas e outras coisas mais modernas que mostraremos abaixo:**

**MVC**

Utilizamos em todo o projeto a arquitetura de software que divide a aplicação em três camadas: manipulação dos dados (model);
interação do usuário (view); camada de controle (controller)



**SWAGGER**

O Swagger é, basicamente, um conjunto de ferramentas que nos ajuda a fazer o design, ou seja, fazer a modelagem,
a documentar e até gerar código para desenvolvimento de APIs.
Segue o link para acessar as informações da aplicação

**Internacionalização**

Tratamento de erros personalizados para APIs rest com Spring Boot

**H2**

H2 é um banco de dados relacional escrito em Java. Ele pode ser integrado em aplicativos Java ou executado no modo
cliente-servidor. Todos os modos contam com suporte para bancos de dados persistentes e na memória.


Obs.:  Existe um arquivo(**API-pedidos.postman_collection**) de collections para usar no postman para testar todas as rotas da API