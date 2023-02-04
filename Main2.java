class  App{
    App(){
        System.out.println("Constructor of App");
    }
    App(int num){
        System.out.println(num);
    }

}

public class Main2 extends App {
    Main2(){
        super(20); //used to call constructor base
        System.out.println("Constructor of Main2");
    }

    public static void main(String[] args) {
        new Main2();
    }

}
