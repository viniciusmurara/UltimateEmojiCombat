public class Luta {
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta(Lutador desafiado, Lutador desafiante, int rounds, boolean aprovada) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
        this.aprovada = aprovada;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador desafiante, Lutador desafiado, int rounds){
        this.desafiante = desafiante;
        this.desafiado = desafiado;
        this.rounds = rounds;
    }

    public void lutar(){

    }
}
