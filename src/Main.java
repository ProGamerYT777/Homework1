public class Main {
    public static void main(String[] args) {
    // Задача 1
    System.out.println("Задача 1");
    byte a = 1;
    short b = 2;
    int c = 3;
    long d = 4;
    float e = 5;
    double f = 6;
    System.out.println("Значение переменной a с типом byte равно " + a);
    System.out.println("Значение переменной b с типом short равно " + b);
    System.out.println("Значение переменной c с типом int равно " + c);
    System.out.println("Значение переменной d с типом long равно " + d);
    System.out.println("Значение переменной e с типом float равно " + e);
    System.out.println("Значение переменной f с типом double равно " + f);
    // Задача 2
    System.out.println("Задача 2");
    float z = 27.12F;
    long y = 987678965549L;
    double x = 2.786;
    boolean w = false;
    char v =  569;
    short u = -159;
    int t = 27897;
    byte s =  67;
    // Задача 3
    System.out.println("Задача 3");
    byte class1 = 23;
    byte class2 = 27;
    byte class3 = 30;
    short totalSheetsOfPaper = 480;
    int totalStudents = class1 + class2 + class3;
    System.out.println("На каждого ученика рассчитано " + totalSheetsOfPaper / totalStudents + " листов бумаги");
    // Задача 4
    System.out.println("Задача 4");
    byte bottles = 16;
    byte Minutes = 2;
    byte time1 = 20;
    short time2 = 1440;
    short time3 = 4320;
    int time4 = 43200;
    int bottlesInOneMinute = bottles / Minutes;
    int bottlesTime1 = bottlesInOneMinute * time1;
    int bottlesTime2 = bottlesInOneMinute * time2;
    int bottlesTime3 = bottlesInOneMinute * time3;
    int bottlesTime4 = bottlesInOneMinute * time4;
    System.out.println("За 20 минут машины произвели бутылок " + bottlesTime1 + " штук");
    System.out.println("За 1 день машины произвели бутылок " + bottlesTime2 + " штук");
    System.out.println("За 3 дня машины произвели бутылок " + bottlesTime3 + " штук");
    System.out.println("За 1 месяц машины произвели бутылок " + bottlesTime4 + " штук");
    // Задача 5
    System.out.println("Задача 5");
    byte paintCans = 120;
    byte white = 2;
    byte brown = 4;
    int totalClass = paintCans / (white + brown);
    int whiteCans = totalClass * white;
    int brownCans = totalClass * brown;
    System.out.println("В школе, где " + totalClass + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски");
    // Задача 6
    System.out.println("Задача 6");
    byte bananasQuantity = 5;
    byte milkQuantity = 2;
    byte iceCreamSundaeQuantity = 2;
    byte rawEggsQuantity = 4;
    byte oneBananaGr = 100;
    byte oneMilkGr = 105;
    byte oneIceCreamSundaeGr = 100;
    byte oneRawEggsGr = 70;
    int bananasWeightGr = bananasQuantity * oneBananaGr;
    int milkWeightGr = milkQuantity * oneMilkGr;
    int iceCreamSundaeWeightGr = iceCreamSundaeQuantity * oneIceCreamSundaeGr;
    int rawEggsWeightGr = rawEggsQuantity * oneRawEggsGr;
    int totalWeightGr = bananasWeightGr + milkWeightGr + iceCreamSundaeWeightGr + rawEggsWeightGr;
    short grPerKg = 1000;
    float totalWeightKg = totalWeightGr / (float) grPerKg;
    System.out.println(totalWeightKg);
    // Задача 7
    System.out.println("Задача 7");
    short oneDayGr1 = 250;
    short oneDayGr2 = 500;
    byte loseWeightKg = 7;
    short grPerKg1 = 1000;
    int loseWeightGr = grPerKg1 * loseWeightKg;
    int daysLoseWeight1 = loseWeightGr / oneDayGr1;
    int daysLoseWeight2 = loseWeightGr / oneDayGr2;
    int averageDayLoseWeight = (daysLoseWeight1 + daysLoseWeight2) / 2;
    System.out.println(daysLoseWeight1);
    System.out.println(daysLoseWeight2);
    System.out.println(averageDayLoseWeight);
    // Задача 8
    System.out.println("Задача 8");
    int Employee1 = 67760;
    int Employee2 = 83690;
    int Employee3 = 76230;
    double salaryIncrease1 = Employee1 * 1.1;
    double salaryIncrease2 = Employee2 * 1.1;
    double salaryIncrease3 = Employee3 * 1.1;
    int annualIncomeUpTo1 = Employee1 * 12;
    int annualIncomeUpTo2 = Employee2 * 12;
    int annualIncomeUpTo3 = Employee3 * 12;
    double annualIncomeAfter1 = salaryIncrease1 * 12;
    double annualIncomeAfter2 = salaryIncrease2 * 12;
    double annualIncomeAfter3 = salaryIncrease3 * 12;
    double incomeDifferencePerYear1 = annualIncomeAfter1 - annualIncomeUpTo1;
    double incomeDifferencePerYear2 = annualIncomeAfter2 - annualIncomeUpTo2;
    double incomeDifferencePerYear3 = annualIncomeAfter3 - annualIncomeUpTo3;
    System.out.println("Маша теперь получает " + salaryIncrease1 + " рублей. Годовой доход вырос на " + incomeDifferencePerYear1 + " рублей");
    System.out.println("Денис теперь получает " + salaryIncrease2 + " рублей. Годовой доход вырос на " + incomeDifferencePerYear2 + " рублей");
    System.out.println("Кристина теперь получает " + salaryIncrease3 + " рублей. Годовой доход вырос на " + incomeDifferencePerYear3 + " рублей");
    }
}