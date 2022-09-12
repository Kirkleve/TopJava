package lesson1;

import java.text.DecimalFormat;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("№1 Перевод псевдокода на язык Java");
        int age = 30;
        String gender = "man";
        double height = 1.92;
        String name = "kirill";
        char firstLetterName = name.charAt(0);
        if (age > 20) {
            System.out.println("Ты уже не зелёный!)");
        } else {
            System.out.println("у тебя вся жизнь впереди!)");
        }
        if (gender.equals("man")) {
            System.out.println("Альфач!");
        } else {
            System.out.println("Самка!");
        }
        if (height < 1.80) {
            System.out.println("Пойдёшь в танкисты");
        } else {
            System.out.println("Пойдёшь в артиллерию");
        }
        if (firstLetterName == 'm') {
            System.out.println("Ты случаем не Максим?");
        } else if (firstLetterName == 'i') {
            System.out.println("А может ты Илья?");
        } else {
            System.out.println("Что мы в яслях? Почему я должен гадать какое у тебя имя?");
        }

        System.out.println("\n№2 Поиск max и min числа");
        int number1 = 24;
        int number2 = 19;
        if (number1 == number2) {
            System.out.println(number1 + " = " + number2);
        } else if (number1 > number2){
            System.out.println("Максимальное число из двух чисел " + number1 +
                    " и " + number2 + " = " + number1 + "\n" +
                    "Минимальное число из двух чисел " + number1 +
                    " и " + number2 + " = " + number2);
        } else {
            System.out.println("Максимальное число из двух чисел " + number1 +
                    " и " + number2 + " = " + number2 + "\n" +
                    "Минимальное число из двух чисел " + number1 +
                    " и " + number2 + " = " + number1);
        }

        System.out.println("\n№3 Работа с числом");
        int number = -248;
        System.out.println("Число " + number);
        if (number != 0) {
            if (number % 2 == 0) {
                System.out.print("Число чётное");
            } else {
                System.out.print("Число нечетное");
            }
            if (number >= 0) {
                System.out.print(" и положительное");
            } else {
                System.out.print(" и отрицательное");
            }
        }

        System.out.println("\n\n№4 Поиск одинаковых цифр в числах");
        int num1 = 352;
        int num2 = 361;
        System.out.println("Числа " + num1 + " и " + num2);
        if (num1 / 100 % 10 == num1 / 100 % 10) {
            System.out.println("Одинаковые цифры " + num1 / 100 % 10 + " в сотнях");
        } else if (num1 / 10 % 10 == num2 / 10 % 10) {
            System.out.println("Одинаковые цифры " + num1 / 10 % 10+ " в десятках");
        } else if (num1 % 10 == num2 % 10) {
            System.out.println("Одинаковые цифры " + num1 % 10 + " в единицах");
        } else {
            System.out.println("Нету одинаковых цифр в числе");
        }

        System.out.println("\n№5 Определение буквы, числа или символа по их коду");
        char simbol = '\u0057';
        System.out.println("Символ " + "\"" + simbol + "\"");
        if (simbol > 65 && simbol < 91) {
            System.out.println("Это заглавная буква!");
        } else if (simbol > 96 && simbol < 123) {
            System.out.println("Это маленькая буква");
        } else if (simbol > 48 && simbol < 58) {
            System.out.println("Это число");
        } else {
            System.out.println("Это не буква и не число");
        }

        System.out.println("\n№6 Определение суммы вклада и начисленных банком %");
        int depositAmount = 300_000;
        double percent = 0;
        double accruedInterest;
        DecimalFormat format = new DecimalFormat("#.00");
        if (depositAmount > 0) {
            if (depositAmount < 100_000) {
                percent = 0.05;
            } else if (depositAmount > 100_000 && depositAmount <= 300_000) {
                percent = 0.07;
            } else if (depositAmount >300_000) {
                percent = 0.1;
            }
            System.out.println("Сумма вклада " + format.format(depositAmount));
            accruedInterest = depositAmount * percent;
            System.out.println((int)(percent * 100) + "% годовых, прибыли " + format.format(accruedInterest) +
                    ", общая сумма " + format.format(depositAmount + accruedInterest));
        } else {
            System.out.println("Вы ввели неверные данные!");
        }

        System.out.println("\n№7 Определение оценки по предметам");
        int lessonHistory = 59;
        int gradesHistory = defineAnEstimate(lessonHistory);
        int lessonIT = 91;
        int gradesIT = defineAnEstimate(lessonIT);
        int averageScore = (gradesHistory + gradesIT) / 2;
        int averagePercentage = (lessonHistory + lessonIT) / 2;
        System.out.println("По истории оценка " + gradesHistory + "\n" +
                "По программированию " + gradesIT + "\n" +
                "Средний балл оценок по предметам " + averageScore + "\n" +
                "Средний % по предметам " + averagePercentage + "%" + "\n");

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

        System.out.println("\n№9 Подсчет количества банкнот");
        int usd = 567;
        int issuance100Usd = usd / 100;
        int issuance10Usd = usd % 100 / 10;
        int issuance1Usd = usd % 10;
        int numberOfBanknotes1usd = 200;
        int numberOfBanknotes10usd = 5;
        int numberOfBanknotes100usd = 20;
        int sumBanknotesInTerminal = numberOfBanknotes1usd + (numberOfBanknotes10usd * 10) +
                (numberOfBanknotes100usd * 100);
        int count = 0;
        if (usd > 0 && sumBanknotesInTerminal > usd ) {
            if (issuance100Usd > numberOfBanknotes100usd) {
                count = issuance100Usd - numberOfBanknotes100usd;
                issuance100Usd = numberOfBanknotes100usd;
                issuance10Usd += count * 10;
            }
            if (issuance10Usd > numberOfBanknotes10usd) {
                count = issuance10Usd - numberOfBanknotes10usd;
                issuance10Usd = numberOfBanknotes10usd;
                issuance1Usd += count * 10;
            }
            if (issuance1Usd > numberOfBanknotes1usd) issuance1Usd = 0;
            System.out.println("Номиналы банкнот 100usd = " + issuance100Usd +
                    " 10usd = " + issuance10Usd +
                    " 1usd = " + issuance1Usd + "\n" +
                    "Сумма всех банкнот = " + usd);
        } else if (sumBanknotesInTerminal < usd) {
            System.out.println("Извините в банкомате такой суммы нету");
        } else System.out.println("Такой суммы нет!");
    }

    private static int defineAnEstimate(int grade) {
        if (grade > 0 && grade <= 60) return grade = 2;
        else if (grade > 60 && grade < 73) return grade = 3;
        else if (grade >= 73 && grade < 91) return grade = 4;
        else if (grade >= 91 && grade <= 100) return grade = 5;
        else return grade = 0;
    }
}
