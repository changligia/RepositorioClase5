package org.example;

import org.example.models.MaestroPokemonModel;
import org.example.utilities.Logs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var log = new Logs();
        Pokedex pokedex = new Pokedex();
        Scanner scanner = new Scanner(System.in);

        log.info("Leyendo ID");
        System.out.print("Ingrese un id del 1 al 150: ");
        var id = scanner.nextInt();
        System.out.println("El id es: " + id);

        log.info("Leyendo Booleano");
        System.out.print("Ingrese booleano true o false: ");
        var imprimirLista = scanner.nextBoolean();
        System.out.println("El boolean es: " + imprimirLista);

        scanner.close();

        log.info("Leyendo quien es ese Pokemon");
        var pokemon = pokedex.quienEsEsePokemon(id);
        var maestroPokemonModel = new MaestroPokemonModel();
        System.out.println(maestroPokemonModel.getNombre());
        System.out.println(maestroPokemonModel.getApellido());
        System.out.println(maestroPokemonModel.getEdad());
        System.out.println(maestroPokemonModel.getPeso());
        System.out.println(maestroPokemonModel.getEmail());
        System.out.println(maestroPokemonModel.getPais());
        
        log.info("Imprimiendo la lista de pokemones");
        pokedex.imprimirPokemon(pokemon);
        if (imprimirLista) {
            pokedex.imprimirListaPokemons();
        } else {
            System.out.println("ok hasta luego entrenador");
        }
    }
}
