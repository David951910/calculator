import java.util.Scanner;



public class Calc {




    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("Ввод:");

            //Класс сканнер для ввода
            Scanner scanner = new Scanner(System.in);

            //Массив
            String[]exp;



            //Размер массива и деление строки по пробелу через условный оператор и выбрасывание исключения если свыше 3-х операндов
            if((exp=(new Scanner(System.in)).nextLine().split(" ")).length !=3)throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор");

            //1-ая Парсинг первой целочисленной переменной и 1-ая операнда
            int number1 = Integer.parseInt(exp[0]);

            //2-ая переменная String для введения символов и сохранение в массиве
           String operation = exp[1];

            // 3-ая целочисленная переменная чисел и 2-ая операнда
            int number2 = Integer.parseInt(exp[2]);

            //4-ая переменная
            int res = 0;

            //вызов метода calc
            int k = calc(number1, number2, operation, res);
            System.out.println("Результат:" + k);


        }
    }

    private static int calc(int number1, int number2, String operation, int res) throws Exception{
        if ((number1<=0 || number1 > 10) || (number2<=0 || number2 > 10)) {
            System.out.println("Введите цифры от 0 до 10");

            System.exit(0);
        }

        switch (operation) {
            case "+":res=number1 + number2;
                break;

            case "-": res=number1 - number2;
                break;

            case "*":res=number1*number2;
                break;

            case "/":res=number1/number2;
                break;

            default:System.out.println("Неправильное выражение");
        }
        return res;
    }


}


