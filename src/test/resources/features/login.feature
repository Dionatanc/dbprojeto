
#language:pt
Funcionalidade: Login

  Cenario: Realizar login com campos obrigatorios
    Dado que a pagina esteja sendo exibida
    Quando os campos de login forem preenchidos da seguinte forma
      | login    | testeDionatan |
      | password | Senha2020$    |
    Quando for realizado o clique no botao log in
    Entao deve ser possivel entrar no sistema