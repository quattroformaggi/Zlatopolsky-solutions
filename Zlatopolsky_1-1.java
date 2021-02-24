/**
 * @author quattroformaggi
 * задачник Златопольского
 */
import java.util.Scanner;
class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //230221-1937 глава1 раздел "Простейшие программы. Арифметические выражения"
        //№1.1 Вывести число Пи с точностью до сотых.
        System.out.format("%.2f", Math.PI);
        System.out.println();

        //№1.2 Вывести число E с точностью до десятых
        System.out.format("%.1f", Math.E);
        System.out.println();

        //№1.3 Вывести введённое пользователем число с предшествующим сообщением "Вы ввели число"
        int a = in.nextInt();
        System.out.println("Вы ввели число: " + a);

        //№1.4 Вывести введённое пользователем число с последующим сообщением " - вот какое число Вы ввели"
        System.out.println(in.nextInt() + " - вот какое число Вы ввели");

        //№1.5 Вывести на одной строке числа 1,13,49 с одним пробелом между ними
        System.out.println(1 + " " + 13 + " " + 49);

        //№1.6 Вывести на одной строке числа 7,15,100 с двумя пробелами между ними
        System.out.println(7 + "  " + 15 + "  " + 100);

        //№1.7 Вывести в одну строку 3 любых числа с двумя пробелами между ними
        System.out.println(in.nextInt() + "  " + in.nextInt() + "  " + in.nextInt());

        //№1.8 Вывести в одну строку 4 любых числа с одним пробелом между ними
        System.out.println(in.nextInt() + " " + in.nextInt() + " " + in.nextInt() + " " + in.nextInt());

        //№1.9 Вывести числа 50,10 одно под другим
        System.out.println(50 + "\n" + 10);

        //№1.10 Вывести числа 5,10,21 одно под другим
        System.out.println(5 + "\n" + 10 + "\n" + 21);

        //№1.11 Вывести на экран 4 любых числа в столбик
        System.out.println(in.nextInt() + "\n" + in.nextInt() + "\n" + in.nextInt() + "\n" + in.nextInt());

        //№1.12 Вывод определённой информации
        int t,v,x,y;
        t = in.nextInt(); in.reset();
        v = in.nextInt(); in.reset();
        x = in.nextInt(); in.reset();
        y = in.nextInt(); in.reset();
        System.out.println(5 + " " + 10 + "\n" + 7 + "см");         //а
        System.out.println(100 + " " + t + "\n" + 1949 + " " + v);  //б
        System.out.println(x + " " + 25 + "\n" + x + " " + y);      //в

        //№1.13 Вывод определённой информации
        int a,b,x,y;
        a = in.nextInt(); in.reset();
        b = in.nextInt(); in.reset();
        x = in.nextInt(); in.reset();
        y = in.nextInt(); in.reset();
        System.out.println(2 + " кг\n" + 13 + " " + 17);        //а
        System.out.println(a + " " + 1 + "\n" + 19 + " " + b);  //б
        System.out.println(x + " " + y + "\n" + 5 + " " + y);   //в

        //№1.14 Записать выражения, соблюдая правила изучаемого языка программирования
        double a,b,n,x,y,alpha,beta;
        a = in.nextDouble(); in.reset();
        b = in.nextDouble(); in.reset();
        n = in.nextDouble(); in.reset();
        x = in.nextDouble(); in.reset();
        y = in.nextDouble(); in.reset();
        alpha = in.nextDouble(); in.reset();
        beta = in.nextDouble(); in.reset();
        System.out.println(2*x + " | " + Math.sin(x) + " | " + Math.pow(a, 2) + " | " + Math.sqrt(x));                  //абвг
        System.out.println(Math.abs(n) + " | " + 5*Math.cos(y) + " | " + -7.5*Math.pow(a,2) + " | " + 3*Math.sqrt(x));  //дежз
        System.out.println((Math.sin(alpha)*Math.cos(beta) + Math.cos(alpha)*Math.sin(beta)) + " | " + a*Math.sqrt(2*b)
        + " | " + 3*Math.sin(2*alpha)*Math.cos(3*beta) + " | " + -5*Math.sqrt(x + Math.sqrt(y)));                       //иклм

        //№1.15 Линейная запись
        double a,b,c,m,n,x;
        a = in.nextDouble(); in.reset();
        b = in.nextDouble(); in.reset();
        c = in.nextDouble(); in.reset();
        m = in.nextDouble(); in.reset();
        n = in.nextDouble(); in.reset();
        x = in.nextDouble(); in.reset();
        System.out.println(-1/Math.pow(x,2) + " | " + a/(b*c) + " | " + (a/b)*c + " | " + (a+b)/2);                                 //абвг
        System.out.println(5.45 * (a+2*b)/(2-a) + " | " + (-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a) + " | " + (-b+1/a)/(2/c));  //гдеж
        System.out.println(1/(1+(a+b)/2) + " | " + 1/(1+(1/(2+1/(2+3/5)))) + " | " + Math.pow(2,Math.pow(m,n)));

        //№1.17 (№1.16 = трэш-перевод, 18-21 = легчайший пропуск легчайших задач на присвоение)
        double a,b,c,d,h,I,m,m1,m2,r,R,R1,R2,t,v,v0,x,x1,x2,x3,Y;
        final double g = 9.8; //константа ускорения свободного падения
        a = in.nextDouble(); in.reset();
        b = in.nextDouble(); in.reset();
        c = in.nextDouble(); in.reset();
        d = in.nextDouble(); in.reset();
        h = in.nextDouble(); in.reset();
        I = in.nextDouble(); in.reset();
        m = in.nextDouble(); in.reset();
        m1 = in.nextDouble(); in.reset();
        m2 = in.nextDouble(); in.reset();
        r = in.nextDouble(); in.reset();
        R = in.nextDouble(); in.reset();
        R1 = in.nextDouble(); in.reset();
        R2 = in.nextDouble(); in.reset();
        t = in.nextDouble(); in.reset();
        v = in.nextDouble(); in.reset();
        v0 = in.nextDouble(); in.reset();
        x = in.nextDouble(); in.reset();
        x1 = in.nextDouble(); in.reset();
        x2 = in.nextDouble(); in.reset();
        x3 = in.nextDouble(); in.reset();
        Y = in.nextDouble(); in.reset();
        System.out.println(Math.sqrt(Math.pow(x1,2) + Math.pow(x2, 2)) + " | " + (x1*x2 + x1*x3 + x2*x3) + " | " + (v0*t + (a*Math.pow(t,2))/2));                       //абв
        System.out.println(((m*Math.pow(v,2))/2 + m*g*h) + " | " + (1/R1 + 1/R2) + " | " + (m*g*Math.cos(a)) + " | " + (2*Math.PI*R));                                  //гдеж
        System.out.println((Math.pow(b, 2) - 4*a*c) + " | " + Y*((m1*m2)/Math.pow(r, 2)) + " | " + Math.pow(I, 2)*R + " | " + a*b*Math.sin(c));                         //зикл
        System.out.println(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*Math.cos(c)) + " | " + (a*d + b*c)/(a*d) + " | " + Math.sqrt(1-Math.pow(Math.sin(x), 2))); //мно
        System.out.println(1/Math.sqrt(a*Math.pow(x,2) + b*x + c) + " | " + (Math.sqrt(x+1) + Math.sqrt(x-1))/(2*Math.sqrt(x)) + " | " + (Math.abs(x) + Math.abs(x+1)));//прс
        System.out.println(Math.abs(1 - Math.abs(x)));

        in.close();
    }
}