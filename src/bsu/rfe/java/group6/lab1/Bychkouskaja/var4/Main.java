package bsu.rfe.java.group6.lab1.Bychkouskaja.var4;

public class Main {
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];

        int itemsSoFar = 0;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else
            if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }
            if (parts[0].equals("Potatoes")) {
                breakfast[itemsSoFar] = new Potatoes(parts[1]);
            }
            itemsSoFar++;
        }

        for (Food item: breakfast)
            if (item!=null)
                item.consume();
            else
                break;
        count(breakfast);
        System.out.println("Всего хорошего!");
    }
    public static void count (Food[] breakfast){

        Food smallApple = new Apple("малое");
        int counterSmallApple = 0;
        Food bigApple = new Apple("большое");
        int counterBigApple = 0;
        Food cheese = new Cheese();
        int counterCheese = 0;
        Food potatoesFried = new Potatoes("жареная");
        int counterPotatoesFried = 0;
        Food potatoesBoiled = new Potatoes("вареная");
        int counterPotatoesBoiled = 0;
        Food potatoesFries = new Potatoes("фри");
        int counterPotatoesFries = 0;


        for(Food food : breakfast){

            if(food!=null){
                if(food.equals(smallApple)){
                    counterSmallApple++;
                }
                if(food.equals(bigApple)){
                    counterBigApple++;
                }
                if(food.equals(cheese)){
                    counterCheese++;
                }
                if(food.equals(potatoesFried)){
                    counterPotatoesFried++;
                }
                if(food.equals(potatoesBoiled)){
                    counterPotatoesBoiled++;
                }
                if(food.equals(potatoesFries)){
                    counterPotatoesFries++;
                }
            } else{
                break;
            }
        }
        System.out.println("Ваш завтрак: ");
        System.out.println(counterSmallApple + " маленьких яблок");
        System.out.println(counterBigApple + " больших яблок");
        System.out.println(counterCheese + " сыр");
        System.out.println(counterPotatoesFried + " жареной картошки");
        System.out.println(counterPotatoesBoiled + " варенной картошки");
        System.out.println(counterPotatoesFries + " картошки фри");

    }


}
