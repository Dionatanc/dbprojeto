#language:pt
Funcionalidade: Busca de Livros

  Cenario: Realizar login e efetuar a busca de livros
    Dado que esteja logado no sistema com
      | login    | testeDionatan |
      | password | Senha2020$    |
    Quando for realizado o clique no botao BookStore
    Dado que esteja na pagina logado
    Quando pesquiso os valores dos seguintes livros
      | bookname | Speaking JavaScript |
    Quando for realizado clique em Add to Your Collection
    Entao o livro e adicionado a colecao
