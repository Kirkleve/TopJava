package HomeWork_1;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("№1 Создание переменных и вывод их значений на консоль");
        int cores = 2;
        byte os = 64;
        short ram = 8;
        long codeProduct = 2_104_071_916;
        float sdd = 237.1E01f;
        double freeSdd = 94.57;
        char gigabyteCharG = 'Г';
        boolean compOrNotpad = true;
        System.out.println("Ядер: " + cores);
        System.out.println("Тип системы: " + os);
        System.out.println("Оперативная память: " + ram);
        System.out.println("Код продукта: " + codeProduct);
        System.out.println("SDD: " + sdd + gigabyteCharG + "б");
        System.out.println("Свободная память: " + freeSdd + gigabyteCharG + "б");
        System.out.println("Ноутбук?: " + compOrNotpad + "\n");

        System.out.println("№2 Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        double discount = (pricePen + priceBook) * 0.11;
        double discountPrice = (pricePen + priceBook)- discount;
        System.out.println("Скидка = " + discount + " рубля\n" +
                "Стоимость товара со скидкой = " + discountPrice + " рубля\n");

        System.out.println("№3 Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a  \n" +
                "   J   a a  v   v  a a            \n" +
                "J  J  aaaaa  V V  aaaaa           \n" +
                " JJ  a     a  V  a     a          \n");

        System.out.println("№4 Отображение min и max значений числовых типов данных");
        int maxInt = Integer.MAX_VALUE;
        System.out.println("первоначальное значение int = " + maxInt);
        maxInt++;
        System.out.println("значение после инкремента int = " + maxInt);
        maxInt--;
        System.out.println("значение после декремента int = " + maxInt);
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("первоначальное значение byte = " + maxByte);
        maxByte++;
        System.out.println("значение после инкремента byte = " + maxByte);
        maxByte--;
        System.out.println("значение после декремента byte = " + maxByte);
        long maxLong = Long.MAX_VALUE;
        System.out.println("первоначальное значение long = " + maxLong);
        maxLong++;
        System.out.println( "значение после инкремента long = " + maxLong);
        maxLong--;
        System.out.println("значение после декремента long = " + maxLong);
        short maxShort = Short.MAX_VALUE;
        System.out.println("первоначальное значение short = " + maxShort);
        maxShort++;
        System.out.println("значение после инкремента short = " + maxShort);
        maxShort--;
        System.out.println( "значение после декремента short = " + maxShort);

        System.out.println("\n№5 Перестановка значений переменных");
        int number1 = 2;
        int number2 = 5;
        int temp = 0;
        System.out.println("С тремя переменными 1число = " + number1 + " а второе = " + number2);
        temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("новые значения переменных 1число = " + number1 + " а второе = " + number2);
        System.out.println("При помощи арифметики 1число = " + number1 + " а второе = " + number2);
        number1 += number2;
        number2 = number1 - number2;
        number1 -= number2;
        System.out.print("новые значения 1число = " + number1 + " а второе = " + number2 + "\n");
        System.out.println("Побитовый способ 1число = " + number1 + " а второе = " + number2);
        number1 ^= number2;
        number2 ^= number1;
        number1 ^= number2;
        System.out.println("новые значения 1число = " + number1 + " а второе = " + number2 + "\n");

        System.out.println("№6 Вывод символов и их кодов");
        char simbol1 = '#';
        char simbol2 = '&';
        char simbol3 = '@';
        char simbol4 = '^';
        char simbol5 = '_';
        System.out.println("код cимвола "+ "\"" + simbol1 + "\" = " + (int) simbol1 + "\n" +
                "код cимвола "+ "\"" + simbol2 + "\" = " + (int) simbol2 + "\n" +
                "код cимвола "+ "\"" + simbol3 + "\" = " + (int) simbol3 + "\n" +
                "код cимвола "+ "\"" + simbol4 + "\" = " + (int) simbol4 + "\n" +
                "код cимвола "+ "\"" + simbol5 + "\" = " + (int) simbol5 + "\n");

        System.out.println("№7 Отображение количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number / 100;
        int dozens = number % 100 / 10;
        int ones = number % 10;
        System.out.println("Число " + number + " содержит:\n" +
                hundreds + " сотню\n" + dozens + " десятка\n" + ones + " единицы\n");

        System.out.println("№8 Вывод на консоль ASCII-арт Дюка");
        char space = ' ';
        char slash = '/';
        char backSlash = '\\';
        char underscore = '_';
        char openPerentheses = '(';
        char closePerentheses = ')';
        System.out.println("" + space + space + space + space + space + slash + backSlash + "\n" +
                space + space + space + space + slash + space + space + backSlash + "\n" +
                space + space + space + slash + underscore + openPerentheses + space + closePerentheses + backSlash + "\n" +
                space + space + slash + space + space + space + space + space + space + backSlash + "\n" +
                space + slash + underscore + underscore + underscore + underscore + slash + backSlash + underscore + underscore + backSlash + "\n");

        System.out.println("№9 Произведение и сумма цифр числа");
        int num = 345;
        int hundreds1 = num / 100;
        int dozens1 = num % 100 / 10;
        int ones1 = num % 10;
        int sumDigits = ones1 + dozens1 + hundreds1;
        int prodDigits = ones1 * dozens1 * hundreds1;
        System.out.println("Сумма цифр числа " + num + " = " + sumDigits + "\n" +
                "Произведение цифр числа " + num + " = " + prodDigits + "\n");

        System.out.println("№10 Преобразование секунд");
        int totalSec = 86399;
        int hour = (totalSec / 60) / 60;
        int min = (totalSec / 60) % 60;
        int sec = totalSec % 60;
        System.out.println("Конвертируемое число = " + totalSec);
        System.out.println(hour + ":" + min + ":" + sec);
    }
}