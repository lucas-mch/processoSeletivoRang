# Projeto de Localização de Unidade de Saúde por CEP

Este é um projeto desenvolvido como parte de um processo seletivo para a Rang Tecnologia. O objetivo do projeto é criar uma aplicação web em Java utilizando JSF, PrimeFaces, JPA/Hibernate e MySQL, que permita aos pacientes informarem seu CEP e receberem sugestões sobre qual unidade de saúde atende à sua área.

## Funcionalidades

O projeto consiste em duas principais funcionalidades:

1. **Cadastro de Unidade de Saúde:** Permite o cadastro de unidades de saúde com os seguintes campos: CNES (Cadastro Nacional de Estabelecimentos de Saúde), Nome do estabelecimento, Faixa de CEP de início e Faixa de CEP de fim. As faixas de CEP não devem conflitar com outras faixas de CEP já cadastradas.

2. **Busca de Unidade de Saúde por CEP:** Permite que o usuário informe seu CEP e receba a sugestão da unidade de saúde que atende à sua área.

## Instruções de Execução

Para executar o projeto, siga os passos abaixo:

1. Certifique-se de ter o Docker e o Docker Compose instalados em sua máquina.

2. Clone este repositório:

```
git clone https://github.com/lucas-mch/processoSeletivoRang.git
```
3. Navegue até o diretório do projeto:
```
cd processoSeletivoRang
```
4. Execute o Docker Compose para iniciar os containers:
```
docker-compose -f devops/docker-compose.yml up
```
5. Após a inicialização, acesse a página da aplicação no navegador:
```http://localhost:8080/index.xhtml```

## Observações

- O projeto segue os padrões de projeto e as boas práticas de programação, incluindo comentários explicativos no código e testes unitários.

- O código está bem documentado e de fácil manutenção.

- A aplicação foi desenvolvida utilizando Java, JSF, PrimeFaces, JPA/Hibernate e MySQL.

- Certifique-se de que o Docker Compose foi executado corretamente e que todos os containers estão em execução antes de acessar a página da aplicação.

- Para mais informações ou dúvidas, entre em contato com alessandro@rangtecnologia.com.br.

Desenvolvido por Lucas Machado de Souza