public class Lutador {
    // Atributos
    private String nome, nacionalidade;
    private int idade, vitorias, derrotas, empates;
    private double altura, peso;
    private String categoria;

    public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates,
                   double altura, double peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    //UTILIZAMOS O setCategoria POIS A CATEGORIA É BASEADA NO PESO
    //ENTAO SETAMOS A CATEGORIA AUTOMATICAMENTE LOGO APOS SETAR O PESO
    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    // METODO INTERNO (É USADO SOMENTE NESTA CLASSE NO setPeso)
    private void setCategoria() {
        if ( peso < 52.2 ){
            categoria = "invalido";
        }
        else if ( peso <= 70.3){
            categoria = "leve";
        }
        else if( peso <= 83.9 ){
            categoria = "medio";
        }
        else if ( peso <= 120.2){
            categoria = "pesado";
        }
        else{
            categoria = "invalido";
        }

    }

    public void apresentar(){
        System.out.println( "lutador: " + getNome() + "\norigem: " + getNacionalidade() +
                "\nidade: " + getIdade() + "\naltura: " + getAltura() + "m" + "\npeso: " + getPeso() + "kg" +
                "\nvitorias: " + getVitorias() + "\nderrotas: " + getDerrotas() + "\nempates: " + getEmpates());
    }

    public void status(){
        System.out.println("nome: " + getNome() + "\ncategoria: " + getCategoria() + "\n" + getVitorias() +
                " vitoria(s)\n" + getDerrotas() + " derrota(s)\n" + getEmpates() + " empate(s)");

    }

    public void empatarLuta(){
        empates += 1;
    }

    public void ganharLuta(){
        vitorias += 1;
    }

    public void perderLuta(){
        derrotas += 1;
    }
}