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
    }
    
    public boolean calcelarReserva(String nomeReserva){
        for(Reserva r: reservas){
            if(r.getNomeReserva().equals(nomeReserva)){
                reservas.remove(r);
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
                return r;
            }
        }
        return null;
    }
}
