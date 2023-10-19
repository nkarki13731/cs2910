public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", "Thunder");
        Pokemon dragonite = new Pokemon("Dragonite", "Dragon/Flying");
        Pokemon articuno = new Pokemon("Articuno", "Ice/Flying");
        Pokemon gastly = new Pokemon("Gastly", "Ghost");
        Pokemon mewTwo = new Pokemon("MewTwo", "Psychic");
        Pokemon charizard= new Pokemon("Charizard", "Fire/FLying");


        PokemonTeam nayansTeam = new PokemonTeam();
        nayansTeam.addPokemon(dragonite);
        nayansTeam.addPokemon(articuno);
        nayansTeam.addPokemon(gastly);
        nayansTeam.addPokemon(mewTwo);
        nayansTeam.addPokemon(charizard);
        nayansTeam.addPokemon(pikachu);


        System.out.println( nayansTeam.levalTeam(1000));
        nayansTeam.viewPokemons();
    }
}