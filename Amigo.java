import java.util.*;

class Amigo {
    String nome, p;
    List<Post> posts = new ArrayList<>();
    Post maiscurtido;

    // Construtor
    Amigo(String n) {nome = n;}

    // Métodos
    public void postar(Post p){posts.add(p);} // adiciona o post na lista de posts do usuário

    public void curtir(Post p){p.curtiram.add(this.nome);} // adiciona o nome do usuário na lista de curtidas do post

    public Post retornaPostMaisCurtido(){
        maiscurtido = posts.get(0);
        for (int i = 0; i < posts.size(); i++) { // iteração na lista "posts", que armazena todos os post do usuário
            if (posts.get(i).curtiram.size() > maiscurtido.curtiram.size()){ // compara o número de curtidas em cada post
                maiscurtido = posts.get(i);
            }
        }
        return maiscurtido;
    }
    public String retornaPosts(){
        p = nome + ": \n";
        for (int j = 0; j < posts.size(); j++) {
            p = p + posts.get(j) + "\n";
        }
        return p; // retorna todos os posts desse usuário
    }
}
