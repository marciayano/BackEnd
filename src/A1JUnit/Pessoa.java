package A1JUnit;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

//Crie um aplicativo com uma pessoa para ser salva em uma coleção, apenas se a pessoa for maior de idade (18 anos) e o nome contiver 5 letras ou mais. Por exemplo, ''Arthur'' deve ser salvo.
//Crie um teste que instancia 10 pessoas:
    //5 delas devem ter um nome com menos de 5 letras.
    //As outras 5 pessoas devem ter um nome de 5 letras ou mais.
    //Apenas 2 das pessoas com nomes com mais de 4 letras devem ser maiores de idade.
    //Faça uma asserção confirmando que apenas 2 pessoas estão na lista.


public class Pessoa {
    //Atributos
    private String nome;
    private String sobrenome;
    LocalDate idade;
    List<String> colecao = new ArrayList<>();

    //Construtor
    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public List<String> getColecao() {
        return colecao;
    }

    public void setColecao(List<String> colecao) {
        this.colecao = colecao;
    }

    //Metodo
    public List<String> adicionarNome (Pessoa p) {
        //Aqui vem a logica contar os caracteres e calcular a idade
        int var = p.getNome().length();
        int idade = p.calcIdade();

        if (var >= 5 && idade >= 18){
            colecao.add(p.getNome());
            System.out.println(colecao);
        }
        return null;
    }

    //Metodo que calcula a idade
    public int calcIdade(){
        int idade = Period.between(this.idade,LocalDate.of(2022,02,21)).getYears();
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' + ", sobrenome='" + sobrenome + '\'' + ", idade=" + idade + '}';
    }
}
