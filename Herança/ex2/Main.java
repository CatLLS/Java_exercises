public class Main{
    public static void main(String[]args){
       Animal animal = new Animal("Passarinho", "Azul", 2);
        animal.exibir_dados(); // exibe os atributos do animal
        Cachorro dog = new Cachorro("Rex", "Marrom", 4, "Vira lata");
        dog.exibir_dados(); // exibe os atributos do cachorro 
    }
}