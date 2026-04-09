package Classes;
import java.util.ArrayList;
import java.util.List;

public class Motorista {
    private String nome;
    private List<Carro> carro;

    //contrutor com parametro
    public Motorista(String nome) {
        this.nome = nome;
        this.carro = new ArrayList<>();
    }
    
    //construtor sem parametro
    public Motorista(){
        this.nome = "";
        this.carro = new ArrayList<>();
    }
    
    //construtor de copia
    public Motorista(Motorista outro){
        this.nome = outro.nome;
        
        this.carro = new ArrayList<>();
        for(Carro carro_i : outro.getCarro()){
            Carro novo = new Carro();
            novo.copiar(carro_i);
            this.carro.add(novo);
        }
    }
    
    //metodo copiar
    public void copiar(Motorista outro){
        this.nome = outro.nome;
        
        this.carro = new ArrayList<>();
        for(Carro carro_i : outro.getCarro()){
            Carro novo = new Carro();
            novo.copiar(carro_i);
            this.carro.add(novo);
        }
    }
    
    //metodo StringBuilde
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Nome: ").append(this.nome).append("\n");
        
        for(int i = 0; i < carro.size(); i++){
            sb.append(carro.get(i).toString());
        }
        return sb.toString();
    }
    
    //metodo dirigir 

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carro> getCarro() {
        return carro;
    }

    public void setCarro(List<Carro> carro) {
        this.carro = carro;
    } 
}


