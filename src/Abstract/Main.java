package Abstract;

public class Main {

    public static void main(String[] args) {

        Cow cow1 = new Cow(150,(byte) 5,"Milkey Way",'F');
        Cow cow2 = new Cow(120,(byte) 3,"Jackey",'M');
        Cow cow3 = new Cow(111,(byte) 4,"Pups",'M');
        Cow cow4 = new Cow(145,(byte) 2,"Mups",'F');
        Cow cow5 = new Cow(80,(byte) 1,"Roza",'F');
        Cow cow6 = new Cow(115,(byte) 3,"Roza's Friend",'F');

        Sheep sheep1 = new Sheep(45,(byte) 1,"Arashan",'M');
        Sheep sheep2 = new Sheep(80,(byte) 2,"Gissar",'M');
        Sheep sheep3 = new Sheep(35,(byte) 3,"Merinos",'F');
        Sheep sheep4 = new Sheep(55,(byte) 4,"Malysh",'F');

        Horse horse1 = new Horse(350,(byte) 2,"Arhiles",'M',"Black");
        Horse horse2 = new Horse(250,(byte) 1,"Gectar",'M',"Grey");
        Horse horse3 = new Horse(300,(byte) 3,"Tokol",'F',"White");

        Farm farm1 = new Farm("Naryn","Seitbek",new Sheep[]{sheep1,sheep2,sheep3},
                new Horse[]{horse1,horse2},new Cow[]{cow1,cow2,cow3,cow4,cow5});
        Farm farm2 = new Farm("Suusamyr","Zahid",
                new Sheep[]{sheep4},new Horse[]{horse3},new Cow[]{cow6});

        System.out.println(farm1);
        System.out.println();
        System.out.println(farm2);



    }
}
