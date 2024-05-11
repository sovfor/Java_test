import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
    FileSave fileSave = new FileSave();
    private ToyShop toyShop = new ToyShop();
    private Integer id;
    private Scanner scanner = new Scanner(System.in);
    private  Scanner s;

    public Controller(){

    }
    public Integer display(){
        s = new Scanner(System.in);
        int i = -1;
        System.out.println("Введите цифру:");
        System.out.println("1 - добавить игрушку");
        System.out.println("2 - достать игрушку");
        System.out.println("3 - изменить частоту выпадения игрушки");
        System.out.println("4 - вывести список игрушек");
        System.out.println("0 - завершить программу");

        try{
            i = s.nextInt();
            return i;
        }
        catch (RuntimeException e){
            return -1;
        }

    }
    public void setId(Integer id){
        this.id = id;
    }

    public void addToy(){
        Toy toy = new Toy();
        toy.setId(id);

    try {
        System.out.print("Введите имя игрушки: ");

        toy.setName(scanner.next());

        System.out.print("Введите количество игрушек: ");

        toy.setAmount(scanner.nextInt());


        System.out.print("Введите частоту выпадения игрушки(100 и более)");

        toy.setFreuency(scanner.nextInt());

        toyShop.addToy(toy);
    }
    catch (RuntimeException e){
        System.err.println("Неправильно введены данные");
    }


    }

    public void changeFreguency(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id игрушки");
        int num = scanner.nextInt();
        System.out.println("Введите частоту выпадения игрушки(100 и более)");

        try {
            toyShop.changeFreguency(num,scanner.nextInt());
        }
        catch (IllegalArgumentException e){
            e.getStackTrace();
        }

    }

    public void getToy(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id игрушки");
        int num = scanner.nextInt();

        int j = 0;
        ArrayList<Toy> toys = toyShop.getToys();
        ArrayList<Toy> newToys = new ArrayList<>();

       System.out.println(toyShop.getToy(num).toSring());
       for(int i = 0;i < toys.size();i++){
           if(i != num){
               newToys.add(toys.get(i));
               newToys.get(j).setId(j);
               j++;
           }


       }


       toyShop.setToys(newToys);
    }

    public void printAll(){
       ArrayList<Toy> toylist = toyShop.getToys();
       if(!toylist.isEmpty()) {
           for (int i = 0; i < toyShop.getToys().size(); i++) {
               if (toyShop.getToy(i) != null) {
                   System.out.println(toyShop.getToy(i).toSring());
                   System.out.println();
               } else {
                   System.out.println("huh");
               }

           }
       }
       else{System.out.println("Игрушек в магазине нет");}
    }

    public void save(){
        fileSave.toysSave(toyShop.getToys());
    }

}
