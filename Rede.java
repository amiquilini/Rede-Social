import java.util.*;

class Rede {
    List<Amigo> amigos = new ArrayList<>();
    String timeline = "";

    // Construtor
    Rede() {}

    // Métodos
    public void adicionarAmigo(Amigo a) {
        amigos.add(a);  // Adiciona o amigo na rede
    }

    public String timeline() {
        for (int i = 0; i < amigos.size(); i++) {   // iteração na lista "amigos", que armazena todos os usuários da rede
            timeline = timeline + amigos.get(i).retornaPosts(); // concatena os posts de cada usuário para mostrar em ordem na timeline
        }
        return timeline;
    }
}
