public class Luta {
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta(Lutador desafiado, Lutador desafiante, int rounds) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
        this.aprovada = false;
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
        if( desafiante.getCategoria().equals(desafiado.getCategoria()) && desafiante != desafiado){
            aprovada = true;
            this.desafiado = desafiado;
            this.desafiante = desafiante;
        } else{
            aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }

    public void lutar(){
        if (aprovada){
            int resultadoLuta = (int) (1 + Math.random() * 3);
            System.out.println("Vamos conhecer o desafiante:\n");
            desafiante.apresentar();
            System.out.println("Agora iremos conhecer o desafiado:\n");
            desafiado.apresentar();

            switch (resultadoLuta){
                case 1:
                    System.out.println("A luta empatou");
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();
                    break;
                case 2:
                    System.out.println("O desafiado ganhou");
                    desafiante.perderLuta();
                    desafiado.ganharLuta();
                    break;
                case 3:
                    System.out.println("O desafiante ganhou");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }


        }
    }
}
