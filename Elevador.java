public class Elevador {
    int capacidade_elevador;
    int andar_Escolhido;

    public int getCapacidade_elevador() {
        return capacidade_elevador;
    }

    public void setCapacidade_elevador(int capacidade_elevador) {
        this.capacidade_elevador = capacidade_elevador;
    }

    public int getAndar_atual() {
        return andar_atual;
    }

    public void setAndar_atual(int andar_atual) {
        this.andar_atual = andar_atual;
    }

    public int getTotal_andares() {
        return total_andares;
    }

    public void setTotal_andares(int total_andares) {
        this.total_andares = total_andares;
    }

    public int getPessoas_no_elevador() {
        return pessoas_no_elevador;
    }

    public void setPessoas_no_elevador(int pessoas_no_elevador) {
        this.pessoas_no_elevador = pessoas_no_elevador;
    }

    int andar_atual;
    int total_andares;
    int pessoas_no_elevador;


    public void setInicializa(int capacidade_elevador, int total_andares) {

        this.capacidade_elevador = capacidade_elevador;
        this.total_andares = total_andares;

    }


    public void saiPessoa(int pessoas_no_elevador) {
        if (capacidade_elevador <= this.pessoas_no_elevador) {
            this.pessoas_no_elevador = pessoas_no_elevador - this.pessoas_no_elevador;
        }
    }

    public void entraPessoa(int pessoas_no_elevador) {
        if (capacidade_elevador + pessoas_no_elevador <= this.pessoas_no_elevador) {
            this.pessoas_no_elevador = pessoas_no_elevador + this.pessoas_no_elevador;
        }
    }

    public void sobeAndar(int andar_atual) {
        if (andar_atual >= 0 && this.andar_atual <= total_andares) {

            this.andar_atual = andar_atual;
        }


    }

    public void desceAndar(int andar_Escolhido) {
        if (andar_atual > 0 && this.andar_Escolhido < total_andares) {

            this.andar_atual = andar_atual;
        }

    }
}
//Inicializa : que deve receber como parâmetros a capacidade do elevador e o
// total de andares no prédio (os elevadores sempre começam no térreo e vazio);
//Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
//Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
//Sobe: para subir um andar (não deve subir se já estiver no último andar);
//Desce: para descer um andar (não deve descer se já estiver no térreo);
//Encapsular todos os atributos da classe (criar os métodos set e get);