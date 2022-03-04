package A8Mesa.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HotelApi {
    //Procura os hoteis conforme um horario escolhido
    public String buscarHoteis(String dataPartida, String dataRetorno, String cidade){
        List<String> hoteis = Arrays.asList("Hotel Fazenda","Hotel Minuano", "Hotel California", "Hotel Cecil");
        Random r = new Random();
        return hoteis.get(r.nextInt(hoteis.size()));
    }
}
