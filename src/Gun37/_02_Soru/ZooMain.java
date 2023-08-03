package Gun37._02_Soru;

import java.util.ArrayList;

public class ZooMain {
    public static void main(String[] args) {


        Cat cat = new Cat();
        Duck duck = new Duck();
        Shark shark = new Shark();
        Swallow swallow = new Swallow();

        ArrayList<IAnimal> IAnimals = new ArrayList<>();
        IAnimals.add(cat);
        IAnimals.add(duck);
        IAnimals.add(shark);
        IAnimals.add(swallow);

        for(IAnimal aa : IAnimals){

            System.out.println(aa.getClass().getSimpleName());
            System.out.println(aa.food());
            System.out.println("-----------------------");

        }




        //Tek bir method var ve classlarin kendine ait ozellesmis methodlari veya sonradan yazilmis methodlari olmadigi icin
        //polymorphsm yapmadim.(downcasting : if(aa instance of Animal)) --> ((Cat).aa).kendisine ait method olurdu )














    }
}
