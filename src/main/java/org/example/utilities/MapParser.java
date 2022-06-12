package org.example.utilities;

import org.example.models.PokemonModel;

import java.util.HashMap;

public class MapParser {
    private final Logs log = new Logs();

    public HashMap<Integer, PokemonModel> getPokemonMap() {
        var pokemonList = new ExcelReader().readPokemonFromExcel();
        log.debug("HashMap de PokemonModel");
        var map = new HashMap<Integer, PokemonModel>();
        for (PokemonModel pokemon : pokemonList) {
            map.put(pokemon.getId(), pokemon);
        }
        log.debug("Finalizando el map");
        return map;
    }
}
