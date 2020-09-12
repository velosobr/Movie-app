<h1 align="center">Movie App</h1>

<p align="center">
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
  <a href="https://android-arsenal.com/api?level=21"><img alt="API" src="https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat"/></a>
</p>

<h2 align="justify">Android app, with the object of showing info about movies, trailers and other stuff. All that, using IMDB API and based on MVVM architecture.</h2>

## Requisitos funcionais

### Versão inicial:
- #### mostrar uma lista dos próximos filmes a estrear
    O app deve ser capaz de mostrar uma lista de filmes, que vão estrear, mostrando ao menos uma capa, título e data de lançamento.
- #### mostrar detalhes dos filmes
    Quando clicado em um título da lista, o deve ser capaz de apresentar detalhes do filme: Sinópse, gênero, descrição, capa e data de lançamento.
- #### apresentar uma lista de traillers dos filmes.
    Abaixo dos detalhes do filme, uma lista de possíveis traillers do filme em questão deve ser apresentado.
- #### favoritar e listar filmes.
    A opção de favoritar o filme deve estar presente na tela do filme. Com isso, uma nova tela também, para poder listar os filmes favoritados.

### Evoluções possíveis: 
#### Cache para funcionamento offline.

#### Opção para a atualizar a lista dos filmes.

#### Pesquisar por filmes.


## Requisitos não-funcionais

### Versão inicial:
- #### O app deve levar em consideração os principios SOLID.
    Apresentar se possível, ao menos um exemplo de cada item do SOLID.
- #### Utilizar as bibliotecas do Android Jetpack.
    Hilt, naivgation, room, Livedata, lifecycle, viewmodel.
- #### Minimum SDK level 21
- #### Kotlin based
- #### Coroutines for asynchronous. 
- #### Retrofit2 & OkHttp3 - construct the REST APIs and paging network data.
