package org.example.utilities;

import com.poiji.bind.Poiji;
import org.example.models.PokemonModel;

import java.io.File;
import java.util.List;

//Esta clase me va a ayudar a leer del excel
public class ExcelReader {
    /*Declaro el File como una variable constante y
    le paso la ruta donde pegué mi excel dentro de mi proyecto maven, es decir en la carpeta test/source*/
    private static final String EXCEL_PATH = "src/test/resources/testData/pokemonList.xlsx";
    private final Logs log = new Logs();

    //Creamos un metodo que me devuelva la lista de pokemon
    public List<PokemonModel> readPokemonFromExcel() {
        log.debug("Leyendo pokemon from excel");
        //retorno la lista de tipo PokemonList
        return Poiji.fromExcel(new File(EXCEL_PATH), PokemonModel.class);
    }
}
