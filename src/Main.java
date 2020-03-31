public class Main{
    public static void main(String[] args) {
        Drink drink = Barman.createDrink("Likier malibu", 30, "Sok ananosowy", 40, "Mleko kokosowe", 10 );
        Barman.printDrink(drink);
    }
}

class Barman{
    static Drink createDrink(String ingredient1, int ilosc1, String ingredient2, int ilosc2, String ingredient3, int ilosc3){
        Ingredient skladnik1 = new Ingredient(ingredient1, ilosc1);
        Ingredient skladnik2 = new Ingredient(ingredient2, ilosc2);
        Ingredient skladnik3 = new Ingredient(ingredient3, ilosc3);
        return new Drink(skladnik1, skladnik2, skladnik3);
    }

    static void printDrink(Drink drink){
        int capacity = Drink.skladnik1.ilosc + Drink.skladnik2.ilosc + Drink.skladnik2.ilosc;
        System.out.println("Drink ma pojemnosc " + capacity + ". Składa się z: ");
        Drink.printIngredient(Drink.skladnik1);
        Drink.printIngredient(Drink.skladnik2);
        Drink.printIngredient(Drink.skladnik3);
    }
}

class Drink {
    static Ingredient skladnik1;
    static Ingredient skladnik2;
    static Ingredient skladnik3;

    public Drink(Ingredient skladnik1, Ingredient skladnik2, Ingredient skladnik3) {
        this.skladnik1 = skladnik1;
        this.skladnik2 = skladnik2;
        this.skladnik3 = skladnik3;
    }


    public static void printIngredient(Ingredient skladnik){
        System.out.println(skladnik.nazwa + " w ilosci " + skladnik.ilosc);
    }
}

class Ingredient {
    String nazwa;
    int ilosc;

    public Ingredient(String nazwa, int ilosc) {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
    }
}