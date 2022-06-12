package org.example.models;

import com.github.javafaker.Faker;

public class MaestroPokemonModel {
    private final String nombre;
    private final String apellido;
    private final int edad;
    private final double peso;
    private final String pais;
    private final String email;
    private final boolean esHombre;

    public MaestroPokemonModel() {
        var faker = new Faker();
        nombre = faker.name().firstName();
        apellido = faker.name().lastName();
        edad = faker.random().nextInt(18, 50);
        peso = faker.number().randomDouble(2,60, 80);
        pais = faker.address().country();
        email = faker.internet().emailAddress();
        esHombre = faker.random().nextBoolean();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String getPais() {
        return pais;
    }

    public String getEmail() {
        return email;
    }

    public boolean isEsHombre() {
        return esHombre;
    }
}
