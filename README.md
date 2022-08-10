# Exercise Altice Labs

Projeto desenvolvido para o processo seletivo da Altice Labs.
Foi utilizado o https://code.quarkus.io/ para configuração inicial do projeto.

## Para executar o projeto :
1º Passo: //Baixar as dependências
```shell script
./mvnw package
```
2º Passo: //Buildar a imagem do docker
```shell script
docker build -f src/main/docker/Dockerfile.jvm -t quarkus/exercise-altice-labs-jvm .
```
3º Passo: //Rodando a imagem
```shell script
docker run -i --rm -p 8080:8080 quarkus/exercise-altice-labs-jvm 
```




### Documentação oficial Quarkus

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
