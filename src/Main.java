public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temp = 3;
        if (temp <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 60;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
        } else if (age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age < 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 14;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int totalPlace = 102;
        int seatsCount = 60;
        int standCount = totalPlace - seatsCount;
        int seatsBusy = 60;
        int standBusy = 42;
        if (seatsBusy < seatsCount && standBusy < standCount) {
            System.out.println("В вагоне есть " + (seatsCount - seatsBusy) + " сидячих мест, и " + (standCount - standBusy) + " стоячих мест");
        } else if (seatsBusy >= seatsCount && standBusy < standCount) {
            System.out.println("В вагоне есть " + (standCount - standBusy) + " стоячих мест");
        } else if (seatsBusy < seatsCount && standBusy >= standCount) {
            System.out.println("В вагоне есть " + (seatsCount - seatsBusy) + " сидячих мест");
        } else {
            System.out.println("Вагон переполнен");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 100;
        int two = 200;
        int three = 200;
        if (one > two && one > three) {
            System.out.println("Большее число one равно " + one);
        } else if (two > one && two > three) {
            System.out.println("Большее число two равно " + two);
        } else if (three > one && three > two) {
            System.out.println("Большее число three равно " + three);
        } else if (one == two && one == three) {
            System.out.println("Все числа равны");
        } else if (one == two) {
            System.out.println("Числа one и two равны");
        } else if (two == three) {
            System.out.println("Числа two и three равны");
        } else if (one == three) {
            System.out.println("Числа one и three равны");
        }
    }
}