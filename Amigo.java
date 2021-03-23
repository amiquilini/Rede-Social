import java.util.*;

class Amigo {
    String nome, p;
    List<Post> posts = new ArrayList<>();
    Post maiscurtido;

    // Construtor
    Amigo(String n) {nome = n;}

    // Métodos
    public void postar(Post p){posts.add(p);} // adiciona o post na lista de posts do usuário

    public void curtir(Post p){p.curtidas.add(this.nome);} // adiciona o nome do usuário na lista de curtidas do post

    public Post retornaPostMaisCurtido(){
        maiscurtido = posts.get(0);
        for (Post post: posts) { // percorre a lista "posts", que armazena todos os post do usuário
            if (post.curtidas.size() > maiscurtido.curtidas.size()){ // compara o número de curtidas em cada post
                maiscurtido = post;
            }
        }
        return maiscurtido;
    }

    public String retornaPosts(){
        p = nome + ": \n";
        for (Post post: posts) { // percorre a lista de posts do usuário
            p = p + post + "\n";
        }
        return p; // retorna todos os posts desse usuário
    }
}
