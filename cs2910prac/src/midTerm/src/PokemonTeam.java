public class PokemonTeam {
       private Pokemon[] pokemonList = new Pokemon[6];
        PokemonTeam(){


        }

        public String addPokemon(Pokemon pokemon){
            for(int i = 0; i < pokemonList.length; i++ ){
                if(this.pokemonList[i]==null){
                    this.pokemonList[i]=pokemon;
                    return pokemon.getName() +"added";

                }

                }
            return "Team is full";

            }


        public void viewPokemons(){
            for(Pokemon pokemon: this.pokemonList){
                System.out.println(pokemon.getName().toString());
            }
        }

        public int levalTeam(int fightExperience){
            int numberOfPokemonLevelled = 0;
            for(Pokemon pokemon:this.pokemonList){
               if( pokemon!=null && pokemon.hasLevelledUp(fightExperience)){
                    numberOfPokemonLevelled++;
               }
            }
            return numberOfPokemonLevelled;

        }
}
