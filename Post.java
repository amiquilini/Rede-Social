import java.util.*;

class Post {
    String post;
    List<String> curtiram = new ArrayList<>();
    String nomes = "";

    // Construtor
    Post(String p){post = p;}

    // Métodos
    public String retornaNomesQueCurtiram(){
        for (int i = 0; i < curtiram.size(); i++) { // iteração na lista "curtiram", que armazena todos os nomes de usuários que curtiram esse post
            nomes = nomes + curtiram.get(i) +" "; // concatenação de strings para retornar os nomes de quem curtiu o post
        }
        return nomes;
    }

    public String toString(){ // método para retornar em forma de string o conteúdo do post (texto e número de curtidas)
        return post + ": " + curtiram.size() +" curtidas";
    }
}
