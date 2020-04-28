package java_class.elevador;

public class Elevador {

    private int andarAtual = 0;
    private int totalDeAndares;
    private int capacidadeDePessoas;
    private int pessoasPresentes = 0;

    public void inicializar(int totalDeAndares, int capacidadeDePessoas){
        this.totalDeAndares = totalDeAndares;
        this.capacidadeDePessoas = capacidadeDePessoas;
        System.out.println("Total de andares: " + totalDeAndares);
        System.out.println("Capacidade: " + capacidadeDePessoas);
    }

    public void entrar(){
        if(getPessoasPresentes() < capacidadeDePessoas){
            setPessoasPresentes(pessoasPresentes + 1);
            exibirPessoasABordor();
        } else {
            System.out.println("Capacidade máxima atingida. Por favor diminua o número de pessoas");
        }

    }

    public void sair(){
        if (getPessoasPresentes() > 0) {
            setPessoasPresentes(pessoasPresentes - 1);
            exibirPessoasABordor();
        } else {
            System.out.println("Elevador vázio!");
        }
    }

    public void subir(){
        if (getAndarAtual() < totalDeAndares){
            setAndarAtual(andarAtual + 1);
            exibirInformacaoAndar();
        } else{
            System.out.println("último andar atingido!");
        }
    }

    public void descer(){
        if (getAndarAtual() > 0){
            setAndarAtual(andarAtual - 1);
            exibirInformacaoAndar();
        } else {
            System.out.println("Térreo atingido!");
        }
    }

    public void exibirPessoasABordor(){
        System.out.println("Quantidade de pessaos a bordo: "+pessoasPresentes);
    }

    public void exibirInformacaoAndar(){
        System.out.println("Andar atual: "+andarAtual);
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public int getCapacidadeDePessoas() {
        return capacidadeDePessoas;
    }

    public void setCapacidadeDePessoas(int capacidadeDePessoas) {
        this.capacidadeDePessoas = capacidadeDePessoas;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }



}
