Sistema de Postagem Simples
Este é um projeto simples para gerenciamento de posts e comentários. Ele permite criar posts com título, conteúdo, e data de publicação, além de adicionar, remover e exibir comentários.

Funcionalidades
Criar posts: Criação de posts com título, conteúdo, quantidade de curtidas e data de criação.

Adicionar/remover comentários: Permite adicionar ou remover comentários aos posts.

Exibir posts: Exibe os posts com título, conteúdo, curtidas, data e comentários.

Validações: Validações básicas para garantir que o conteúdo do post e os comentários não sejam vazios.

Tecnologias Utilizadas
Linguagem: Java

API: Java SE

Manipulação de data/hora: LocalDateTime e DateTimeFormatter

Como Rodar o Projeto
Pré-requisitos
Java 11 ou superior instalado na sua máquina.

Passos para execução
Clone o repositório para sua máquina:

bash
Copiar
Editar
git clone https://github.com/seuusuario/nome-do-repositorio.git
cd nome-do-repositorio
Compile o projeto:

bash
Copiar
Editar
javac -d bin src/entities/*.java src/program/Main.java
Execute o programa:

bash
Copiar
Editar
java -cp bin program.Main
A aplicação será executada e você verá a saída do post criado e seus comentários no console.

Estrutura do Projeto
bash
Copiar
Editar
/src
  /entities
    Comment.java             # Classe que representa um comentário
    Post.java                # Classe que representa um post
  /program
    Main.java                # Classe principal com a execução do sistema
Detalhes das Classes
Post:

A classe Post contém informações sobre o título, conteúdo, quantidade de curtidas e data/hora de publicação.

Possui métodos para adicionar e remover comentários.

O método toString() exibe as informações do post de forma legível.

Comment:

A classe Comment contém um texto representando um comentário de um usuário.

A classe tem os métodos getText() e setText() para acessar e modificar o texto do comentário.

Exemplo de Uso
Criando um Post com Comentários
java
Copiar
Editar
public class Main {
    public static void main(String[] args) {
        Comment c1 = new Comment("That was a terrible match ");
        Comment c2 = new Comment("Out Paiva, Bring my botafogo back");
        DateTimeFormatter dt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse("21/06/2018 13:05:44", dt1);
        
        Post p1 = new Post("Botafogo lost against Entudiantes de la Plata", "The match was terrible and the goalkeeper John made a bizarre mistake", 12, localDateTime);
        p1.addComment(c1);
        p1.addComment(c2);
        
        System.out.println(p1);
    }
}
Saída do Console:
sql
Copiar
Editar
Botafogo lost against Entudiantes de la Plata
The match was terrible and the goalkeeper John made a bizarre mistake
12 Likes - 21/06/2018 13:05:44
Comments: 
That was a terrible match
Out Paiva, Bring my botafogo back
Contribuições
Sinta-se à vontade para contribuir com este projeto! Se você quiser ajudar a melhorar o código, basta seguir os seguintes passos:

Faça um fork do repositório.

Crie uma nova branch (git checkout -b minha-nova-feature).

Faça as alterações e commit (git commit -am 'Adiciona nova feature').

Envie para o repositório remoto (git push origin minha-nova-feature).

Abra um Pull Request para revisão.

Licença
Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.

