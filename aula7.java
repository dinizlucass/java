package aulas;

public class aula7 {
    public static void main(String[] args) {
        double price = 400.00;
        double discont;
        if (price < 200.00){
            discont = price * 0.1;
        }else{
            discont = 0;
        }
        System.out.println(discont);
    }
}
