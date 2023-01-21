<h1 align="center">
</br> Teste prático Petshop 
</h1>

## Desenvolvido por:
- [Luana Assis Silva](https://github.com/luanaassis)

## Introdução

Sistema que analisa e define qual seria o Petshop mais viável, com base no preço e na distância, para que o Senhor Eduardo leve os cães do canil.

## Estrutura

Os arquivos foram organizados da seguinte forma:

- `/src`: pasta destinada aos códigos fontes do projeto.
- `/README.md`: arquivo relativo à documentação do projeto.

## Premissas assumidas

- No canil  "Meu Canino Feliz", o aumento do final de semana é de 20% em cada um dos banhos;
- Todos os canis, e suas informações, já estão pré-estabelecidas e previamente criadas, sem a necessidade de informação por parte do usuário.
- Todas as distâncias foram passadas para a mesma unidade de medida, em KM.

## Classes e Métodos

### Petshop: 
Classe responsável por organizar e manipular o preço final a ser pago de acordo com o parâmetro relacionado à data. Nesta classe, estão contidos métodos como o constrututor, getters e setters

### TestePratico:
Classe que contém o main, e realiza a tratativa e manipulação das informações de entrada, e efetua as principais verificações relacionadas aos critérios

- `verificaFinalDeSemana`: é um método booleano que verifica se o dia informado é correspondente à sábado ou domingo, e caso sim, retorna true. Caso contrário, retorna falso.
- `custoBeneficioPetshop`: este método que recebe como parâmetro uma lista com os objetos "Petshop", e verifica entre eles qual possui o preço final menor. Caso tenham preços finais iguais, verifica qual Petshop possui a menor distância do canil. O Petshop que melhor atender aos requisitos, tem seu nome e seu preço final retornados como um print no console para o cliente.
- `main`: no método main, todas as instâncias são criadas, assim como uma lista contendo os objetos, que posteriormente, será usado para manipulação. O ArrayList foi criado para facilitar as verificações, sem perder a referência aos objetos. Neste método, a entrada é tratada e o main chama o método setPrecoFinal, da classe Petshop, e o custoBeneficioPetshop, que está contido na mesma classe.

## Instruções para compilação e execução

- Para compilar o projeto, basta inserir a seguinte linha de comando no terminal dentro da pasta `src`:

      javac .\TestePratico.java

- Após isso, basta inserir a seguinte linha de comando, também dentro da pasta `src`, no termilnal para reaizar a execução:

      java .\TestePratico.java
