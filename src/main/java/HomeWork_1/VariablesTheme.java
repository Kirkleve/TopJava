package HomeWork_1;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("№1 Создание переменных и вывод их значений на консоль");
        int cores = 2;
        byte oc = 64;
        short ram = 8;
        long codeProduct = 2_104_071_916;
        float sdd = 237.1E01f;
        double freeSdd = 94.57;
        char processor = 'Г';
        boolean compOrNotpad = true;
        System.out.println("Ядер: " + cores);
        System.out.println("Тип системы: " + oc);
        System.out.println("Оперативная память: " + ram);
        System.out.println("Код продукта: " + codeProduct);
        System.out.println("SDD: " + sdd + processor + "б");
        System.out.println("Свободная память: " + freeSdd + processor + "б");
        System.out.println("Ноутбук?: " + compOrNotpad + "\n");


        System.out.println("№2 Расчет стоимости товара со скидкой");
        int pen = 100;
        int book = 200;
        double discount = (pen + book) * 0.11;
        double sum = (pen + book)- discount;
        System.out.println("Скидка = " + discount + " рубля\n" +
                "Стоимость товара со скидкой = " + sum + " рубля\n");

        System.out.println("   J    a  v     v  a  \n" +
                "   J   a a  v   v  a a            \n" +
                "J  J  aaaaa  V V  aaaaa           \n" +
                " JJ  a     a  V  a     a          \n");

        System.out.println("№4 Отображение min и max значений числовых типов данных");
        int maxInt = Integer.MAX_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("первоначальное значение int = " + maxInt + "\n" +
                "значение после инкремента int = " + maxInt++ + "\n" +
                "значение после декремента int = " + maxInt-- + "\n" +
                "первоначальное значение byte = " + maxByte + "\n" +
                "значение после инкремента byte = " + maxByte++ + "\n" +
                "значение после декремента byte = " + maxByte-- + "\n" +
                "первоначальное значение long = " + maxLong + "\n" +
                "значение после инкремента long = " + maxLong++ + "\n" +
                "значение после декремента long = " + maxLong-- + "\n" +
                "первоначальное значение short = " + maxShort + "\n" +
                "значение после инкремента short = " + maxShort++ + "\n" +
                "значение после декремента short = " + maxShort-- + "\n");

        System.out.println("№5 Перестановка значений переменных");
        int number1 = 2;
        int number2 = 5;
        int temp = 0;
        System.out.println("С тремя переменными 1число = " + number1 + " а второе = " + number2);
        temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("новые значения переменных 1число = " + number1 + " а второе = " + number2);
        System.out.println("При помощи арифметики 1число = " + number1 + " а второе = " + number2);
        int arifNumber1 = (number1 + number2) - number1;
        int arifNumber2 = (number1 + number2) - number2;
        System.out.print("новые значения 1число = " + arifNumber1 + " а второе = " + arifNumber2 + "\n");
        System.out.println("Побитовый способ 1число = " + arifNumber1 + " а второе = " + arifNumber2);
        int bit= arifNumber1 | arifNumber2;
        int bitNum1 = bit ^ arifNumber1;
        int bitNum2 = bit ^ arifNumber2;
        System.out.println("новые значения 1число = " + bitNum1 + " а второе = " + bitNum2 + "\n");

        System.out.println("№6 Вывод символов и их кодов");
        char simbol1 = 35;
        char simbol2 = 38;
        char simbol3 = 64;
        char simbol4 = 94;
        char simbol5 = 95;
        System.out.println("код зимвола 35 = " + simbol1 +
                "\nкод зимвола 38 = " + simbol2 +
                "\nкод зимвола 64 = " + simbol3 +
                "\nкод зимвола 94 = " + simbol4 +
                "\nкод зимвола 95 = " + simbol5 + "\n");

        System.out.println("№7 Отображение количества сотен, десятков и единиц числа");
        int number = 123;
        int hundred = number / 100;
        int ten = number % 100 / 10;
        int oneNumber = number % 10;
        System.out.println("Число " + number + " содержит:\n" +
                hundred + " сотню\n" + ten + " десятка\n" + oneNumber + " единицы\n");

        System.out.println("№8 Вывод на консоль ASCII-арт Дюка");
        var ws = " ";
        var bsn = "/";
        char sn = 92;
        var und = "_";
        var scob = "(";
        var unscob = ")";
        System.out.println(ws + ws + ws + ws + ws + bsn + sn + "\n"+
                ws + ws + ws+ ws + bsn + ws + sn +"\n" +
                ws + ws + ws + bsn + und + scob + unscob + sn + "\n" +
                ws + ws + bsn + ws + ws +ws + ws + ws + sn + "\n" +
                ws + bsn  + und + und + und +  bsn + sn + und + und + sn + "\n");

        System.out.println("№9 Произведение и сумма цифр числа");
        int num = 345;
        int hundredNum = num / 100;
        int tenNum = num % 100 / 10;
        int oneNum = num % 10;
        int summa = oneNum + tenNum + hundredNum;
        int multiply = oneNum * tenNum * hundredNum;
        System.out.println("Сумма цифр числа " + num + " = " + summa +
                "\nПроизведение цифр числа " + num + " = " + multiply + "\n");

        System.out.println("№10 Преобразование секунд");


    }
}