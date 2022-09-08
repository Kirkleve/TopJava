package HomeWork_1;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("№1 Перевод псевдокода на язык Java");
        int age = 30;
        String gender = "man";
        double height = 1.92;
        String name = "kirill";
        char ferstWordName = name.charAt(0);
        if (age > 20){
            System.out.println("Ты уже не зелёный!)");
        } else {
            System.out.println("у тебя вся жизнь впереди!)");
        }
        if (gender.equals("man")){
            System.out.println("Альфач!");
        } else {
            System.out.println("Самка!");
        }
        if (height < 1.80) {
            System.out.println("Пойдёшь в танкисты");
        }else {
            System.out.println("Пойдёшь в артилерию");
        }
        if (ferstWordName == 'm') {
            System.out.println("Ты случаем не Максим?");
        } else if (ferstWordName == 'i') {
            System.out.println("А может ты Илья?");
        } else {
            System.out.println("Что мы в яслях? Почему я должен гадать какое у тебя имя?");
        }
        System.out.println();

        System.out.println("№2 Поиск max и min числа");
        int number1 = 24;
        int number2 = 19;
        if (number1 == number2) {
            System.out.println(number1 + " = " + number2);
        } else {
            System.out.println("Максимальное число из двух чисел " + number1 + " и " + number2 +
                    " = " + Integer.max(number1,number2));
            System.out.println("Минимальное число из двух чисел " + number1 + " и " + number2 +
                    " = " + Integer.min(number1,number2));
        }
        System.out.println();

        System.out.println("№3 Работа с числом");
        int number = -248;
        System.out.println("Число " + number);
        if (number == 0) {
            System.out.println("Число равно нулю");
        } else if (number < 0) {
            System.out.println("Это число отрицательное");
        } else {
            System.out.println("Это число положительное");
        }
        System.out.println();

        System.out.println("№4 Поиск одинаковых цифр в числах");
        String num1 = "352";
        String num2 = "512";
        System.out.println("Числа " + num1 + " и " + num2);
        if (num1.charAt(0) == num2.charAt(0)) {
            System.out.println("Одинаковые цифры " + num1.charAt(0) + " в сотнях");
        } else if (num1.charAt(1) == num2.charAt(1)) {
            System.out.println("Одинаковые цифры " + num1.charAt(1) + " в десятках");
        } else if (num1.charAt(2) == num2.charAt(2)) {
            System.out.println("Одинаковые цифры " + num1.charAt(2) + " в еденицах");
        } else {
            System.out.println("Нету одинаковых цифр в числе");
        }
        System.out.println();

        System.out.println("№5 Определение буквы, числа или символа по их коду");
        char simbol = '\u0057';
        System.out.println("Символ " + "\"" + simbol + "\"");
        if (65 < simbol && simbol < 91) {
            System.out.println("Это заглавная буква!");
        } else if (96 < simbol && simbol < 123) {
            System.out.println("Это маленькая буква");
        } else if (Character.isDigit(simbol)) {
            System.out.println("Это число");
        }
        System.out.println();

        System.out.println("№6 Определение суммы вклада и начисленных банком %");
        int depositAmount = 300_000;
        double percent;
        double accruedInterest;
        if (depositAmount < 100_000) {
            System.out.println("Сумма вклада " + depositAmount);
            percent = 0.05;
            accruedInterest = (depositAmount * percent);
            System.out.println((int)(percent * 100) + "% годовых, прибыли " + (int)accruedInterest);
            System.out.println("Общая сумма " + (int)(depositAmount + accruedInterest));
        } else if (depositAmount > 100_000 && depositAmount <= 300_000) {
            System.out.println("Сумма вклада " + depositAmount);
            percent = 0.07;
            accruedInterest = (depositAmount * percent);
            System.out.println((int)(percent * 100) + "% годовых, прибыли " + (int)accruedInterest);
            System.out.println("Общая сумма " + (int)(depositAmount + accruedInterest));
        } else if (depositAmount >300_000) {
            System.out.println("Сумма вклада " + depositAmount);
            percent = 0.1;
            accruedInterest = (depositAmount * percent);
            System.out.println((int)(percent * 100) + "% годовых, прибыли " + (int)accruedInterest);
            System.out.println("Общая сумма " + (int)(depositAmount + accruedInterest));
        } else {
            System.out.println("Что вы меня дурите, вы указали неверную сумму вклада");
        }
        System.out.println();

        System.out.println("№7 Определение оценки по предметам");
        int lessonHistory = 59;
        int gradesHistory = Grades(lessonHistory);
        int lessonIT = 91;
        int gradesIT = Grades(lessonIT);
        int averageScore = (gradesHistory + gradesIT) / 2;
        int averagePercentage = (lessonHistory + lessonIT) / 2;
        System.out.println("По истории оценка " + gradesHistory + "\n" +
                "По програмированию " + gradesIT + "\n" +
                "Средний балл оценок по предметам " + averageScore + "\n" +
                "Средний % по предметам " + averagePercentage + "%");
        System.out.println();

        System.out.println("№8 Расчет прибыли");
        int rent = 5000;
        int sale = 13000;
        int costPrice = 9000;
        int annualProfit = ((sale - costPrice) - rent) * 12;
        if (annualProfit > 0) {
            System.out.println("Прибыль за год +" + annualProfit);
        } else {
            System.out.println("Прибыль за год " + annualProfit);
        }
        System.out.println();

        System.out.println("№9 Подсчет количества банкнот");
        int usd = 567;
        int countBanknote1Usd = 0;
        int countBanknote10Usd = 0;
        int countBanknote100Usd = 0;
        int banknote1usd = 200;
        int banknote10usd = 5;
        int banknote100usd = 200;
        int count = 0;
        int sumaCountBanknote = 0;
        if (usd > 100) {
            countBanknote100Usd = usd / 100;
            countBanknote10Usd = usd % 100 / 10;
            countBanknote1Usd = usd % 10;
            if (countBanknote100Usd > banknote100usd) {
                count = countBanknote100Usd - banknote100usd;
                countBanknote100Usd = banknote100usd;
                countBanknote10Usd += count * 10;
            }
            if (countBanknote10Usd > banknote10usd) {
                count = countBanknote10Usd - banknote10usd;
                countBanknote10Usd = banknote10usd;
                countBanknote1Usd += count * 10;
            }
            if (countBanknote1Usd > banknote1usd) countBanknote1Usd = 0;
        } else if (usd < 100 && usd > 10) {
            countBanknote10Usd = usd % 100 / 10;
            countBanknote1Usd = usd % 10;
            if (countBanknote10Usd > banknote10usd) {
                count = countBanknote10Usd - banknote10usd;
                countBanknote10Usd = banknote10usd;
                countBanknote1Usd += count * 10;
            }
            if (countBanknote1Usd > banknote1usd) countBanknote1Usd = 0;
        } else if (usd < 10 && usd > 0) {
            countBanknote1Usd = usd % 10;
            if (countBanknote1Usd > banknote1usd) countBanknote1Usd = 0;
        }
        else System.out.println("Такой суммы нет!");
        sumaCountBanknote = countBanknote1Usd + (countBanknote10Usd * 10) + (countBanknote100Usd * 100);
        System.out.println("Номиналы банкнот 1usd = " + countBanknote1Usd);
        System.out.println("10usd = " + countBanknote10Usd);
        System.out.println("100usd = " + countBanknote100Usd);
        System.out.println("Сумма всех банкнот = " + sumaCountBanknote);

    }
    public static int Grades(int assessment){
        if (assessment <= 60 && assessment > 0) return assessment = 2;
        else if (assessment > 60 && assessment < 73) return assessment = 3;
        else if (assessment >= 73 && assessment < 91) return assessment = 4;
        else if (assessment >=91 && assessment <=100) return assessment = 5;
        else return assessment = 0;
    }
}