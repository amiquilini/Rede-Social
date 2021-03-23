import java.util.*;

class Rede {
    List<Amigo> amigos = new ArrayList<>();
    String timeline = "";

    // Construtor
    Rede() {}

    // Métodos
    public void adicionarAmigo(Amigo a) {
        amigos.add(a);  // Adiciona o usuário na rede
    }

    public String timeline() {
        for (Amigo a: amigos) {   // percorre a lista "amigos", que armazena todos os usuários da rede
            timeline = timeline + a.retornaPosts(); // concatena os posts de cada usuário para mostrar em ordem na timeline
        }
        return timeline;
    }
}
