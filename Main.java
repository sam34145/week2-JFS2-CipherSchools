public class Main {

    //this keyword

    int arg=5;

    Main(){
        System.out.println("Hi ! I am default constructor");
    }

    Main(int arg){
        this.arg=arg;
    }

//    void myTest(int arg){
//        this.arg = arg;
//    }

    public static void main(String[] args) {

        int arg = 10;
        Main obj = new Main(10);
//        obj.myTest(arg);
        System.out.println(obj.arg);
    }
}
