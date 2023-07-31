import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    int aa = 223;
//    int bb = 332;
//    int catCount = 17;
//    int dogPirat = 5;
//    int birdCount = 66;
//    String ss = "Om Shanti";
//    char hh = '&';
//    char jj = '*';
//    int kk = 10;
//    float ll = 10.5F;
//            System.out.println(aa+" "+" "+bb+" "+catCount+" "+ss+" "+jj+" "+ll);

//        System.out.println("Введите первое число: ");
//        double a = new Scanner(System.in).nextDouble();
//        System.out.println("Введите второе число: ");
//        double b = new Scanner(System.in).nextDouble();
//        System.out.println(a + "+" + b + "=" + (a + b));
//        System.out.println(a + "-" + b + "=" + (a - b));
//        System.out.println(a + "*" + b + "=" + (a * b));
//        System.out.println(a + ":" + b + "=" + (a / b));
        // BMI = weight/(height*height)
//        System.out.println("Введите ваш вес");
//        double weight = new Scanner(System.in).nextDouble();
//                System.out.println("Введите ваш рост (в метрах)");
//        double height = new Scanner(System.in).nextDouble();
//        System.out.println("Ваш BMI равен: "+ weight/(height*height));
//конвертер валют
        System.out.println("Введите сумму в рублях: ");
        double rub = new Scanner(System.in).nextDouble();
        System.out.println("Введите курс Доллара: ");
        double dol = new Scanner(System.in).nextDouble();
        System.out.println("Введите курс Евро: ");
        double eur = new Scanner(System.in).nextDouble();
        System.out.println(rub + " руб. = " + " " + (rub*1/dol) + " долларов");
        System.out.println(rub + " руб. = " + " " + (rub*1/eur) + " евро");
    }
}