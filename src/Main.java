public class Main {
    public static void main(String[] args) {
      var dog = 8;
      var cat = 3.6;
      var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var dog1 = 8.0;
        dog1 = dog1 - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog1);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
      System.out.println("Общий вес двух бойцов " + totalWeight + " кг");
        var differenceWeight = boxerWeight2 - boxerWeight1;
      System.out.println("Разница между весами бойцов " + differenceWeight + " кг");

      var differenceWeight1 = boxerWeight2 - boxerWeight1;
      System.out.println(differenceWeight1);
      var differenceWeight2 = boxerWeight2 % boxerWeight1;
      System.out.println(differenceWeight2);

      var totalHours = 640;
      var hoursPerPerson = 8;
      var totalEmployees = totalHours / hoursPerPerson;
      System.out.println("Всего работников в компании - " + totalEmployees + " человек");

      var totalEmployees1 = 80 + 94;
      var hoursPerPerson1 = totalEmployees1 * hoursPerPerson;
      System.out.println("Если в компании работает "
              + totalEmployees1 + " человека, то всего "
              + hoursPerPerson1 + " часа работы может быть поделено между сотрудниками");
    }
}