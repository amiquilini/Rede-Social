import java.util.*;

class Post {
    String texto;
    List<String> curtidas = new ArrayList<>();
    String nomes;

    // Construtor
    Post(String p){texto = p;}

    // Métodos
    public String retornaNomesQueCurtiram(){
        nomes = "";
        for (String n: curtidas) { // percorre a lista "curtidas", que armazena todos os nomes de usuários que curtiram esse post
            nomes = nomes + n +" "; // concatenação de strings para retornar os nomes de quem curtiu o post
        }
        return nomes;
    }

    public String toString(){ // método para retornar em forma de string o conteúdo do post (texto e número de curtidas)
        return texto + ": " + curtidas.size() +" curtidas";
    }
}
