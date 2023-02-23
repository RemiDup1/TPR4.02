package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {

    @Test
    void pokemon1_gagne_attaque() {
        // GIVEN
        ConstructeurDePokemon pokemon1 = new ConstructeurDePokemon();
        pokemon1.avecAttaque(40);
        pokemon1.avecDefense(20);

        ConstructeurDePokemon pokemon2 = new ConstructeurDePokemon();
        pokemon2.avecAttaque(30);
        pokemon2.avecDefense(20);

        // WHEN
        boolean result = pokemon1.construire().estVainqueurContre(pokemon2.construire());

        // THEN
        assertEquals(true,result);
    }

    @Test
    void pokemon1_perd_attaque() {
        // GIVEN
        ConstructeurDePokemon pokemon1 = new ConstructeurDePokemon();
        pokemon1.avecAttaque(30);
        pokemon1.avecDefense(20);

        ConstructeurDePokemon pokemon2 = new ConstructeurDePokemon();
        pokemon2.avecAttaque(40);
        pokemon2.avecDefense(20);

        // WHEN
        boolean result = pokemon1.construire().estVainqueurContre(pokemon2.construire());

        // THEN
        assertEquals(false,result);
    }

    @Test
    void pokemon1_gagne_defense() {
        // GIVEN
        ConstructeurDePokemon pokemon1 = new ConstructeurDePokemon();
        pokemon1.avecAttaque(10);
        pokemon1.avecDefense(30);

        ConstructeurDePokemon pokemon2 = new ConstructeurDePokemon();
        pokemon2.avecAttaque(10);
        pokemon2.avecDefense(20);

        // WHEN
        boolean result = pokemon1.construire().estVainqueurContre(pokemon2.construire());

        // THEN
        assertEquals(true,result);
    }

    @Test
    void pokemon1_perd_defense() {
        // GIVEN
        ConstructeurDePokemon pokemon1 = new ConstructeurDePokemon();
        pokemon1.avecAttaque(10);
        pokemon1.avecDefense(20);

        ConstructeurDePokemon pokemon2 = new ConstructeurDePokemon();
        pokemon2.avecAttaque(10);
        pokemon2.avecDefense(30);

        // WHEN
        boolean result = pokemon1.construire().estVainqueurContre(pokemon2.construire());

        // THEN
        assertEquals(false,result);
    }

    @Test
    void pokemon1_gagne_priorite() {
        //GIVEN
        ConstructeurDePokemon pokemon1 = new ConstructeurDePokemon();
        pokemon1.avecAttaque(10);
        pokemon1.avecDefense(10);

        ConstructeurDePokemon pokemon2 = new ConstructeurDePokemon();
        pokemon2.avecAttaque(10);
        pokemon2.avecDefense(10);

        // WHEN
        boolean result = pokemon1.construire().estVainqueurContre(pokemon2.construire());

        // THEN
        assertEquals(true,result);

    }


}