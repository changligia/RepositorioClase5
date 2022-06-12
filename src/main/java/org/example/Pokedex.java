package org.example;

import org.example.models.PokemonModel;
import org.example.utilities.ExcelReader;
import org.example.utilities.MapParser;

public class Pokedex {

    public void imprimirPokemon (PokemonModel pokemonModel){
        var mensaje = String.format("El id es %d, " +
                            "el nombre es %s, el nombre japones es %s, " +
                            "el Atk es %d, el Def es %d, el Sp es %d, el SpDef es %d, " +
                            "el Crit es %d, el peso es %f, ¿Atrapado? %b ", pokemonModel.getId(), pokemonModel.getNombre(),
                    pokemonModel.getNombreJapones(), pokemonModel.getAtk(), pokemonModel.getDef(), pokemonModel.getSp(),
                    pokemonModel.getSpDef(), pokemonModel.getCrit(), pokemonModel.getPeso(), pokemonModel.getAtrapado());
        System.out.println(mensaje);
    }

    public void imprimirListaPokemons (){
        var pokemonList = new ExcelReader().readPokemonFromExcel();
        for (PokemonModel pokemonModel: pokemonList) {
            if (pokemonModel.getAtrapado()){
                imprimirPokemon(pokemonModel);
            }
        }
    }

    public PokemonModel quienEsEsePokemon (Integer id){
        var map = new MapParser().getPokemonMap();
        return map.get(id); //coge algo caracteristico
    }
}
