package personagem;

public abstract class PersonagemFactory {
    public abstract  Personagem createPersonagem (TipoPersonagem tipoPersonagem, String nome);
}
