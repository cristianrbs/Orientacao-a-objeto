package Classes;

import java.util.ArrayList;
import java.util.List;


public class GerenciadorDeReserva {
    private List<Reserva> reservas;
    
    public GerenciadorDeReserva(){
        this.reservas = new ArrayList<>();
    }
    
    public void adicionarReserva(Reserva reserva){
        reservas.add(reserva);
        System.out.println("Reserva adicionada");
    }
    
    public boolean calcelarReserva(String nomeReserva){
        for(Reserva r: reservas){
            if(r.getNomeReserva().equals(nomeReserva)){
                reservas.remove(r);
                System.out.println("Reserva cancelada");
                return true;
            }
        }
        return false;
    }
    
    public void listarReservas(){
        for(Reserva r: reservas){
            r.fill();
        }
    }
    
    public Reserva buscarReserva(String nomeReserva){
        for(Reserva r: reservas){
            if(r.getNomeReserva().equalsIgnoreCase(nomeReserva)){
                System.out.println("Reserva encontrada");
                return r;
            }
        }
        return null;
    }
}
