import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int count = 0;
        Controller controller = new Controller();
        controller.setId(count);
        boolean iswork = true;
        while (iswork){
            System.out.println();
            switch (controller.display()){
                case 1:
                    controller.addToy();
                    controller.setId(++count);
                    break;
                case 2:
                    controller.getToy();
                    break;
                case 3:
                    controller.changeFreguency();
                    break;
                case 4:
                    controller.printAll();
                    break;
                case 0:
                    iswork = false;
                    break;
                case -1:
                    System.err.println("Неправильно введена цифра");
                    break;
            }
        }


        controller.save();


    }
}