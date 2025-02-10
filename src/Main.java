public class Main {
    public static void main(String[] args) {
//№1
        int age = 66;
        if (age > 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний ");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он несовершеннолетний ");
        }
//№2
        int temperature = 16;
        if (temperature < 5) {
            System.out.println("Если на улице " + temperature + " градусов, то нужно надеть шапку");
        } else {
            System.out.println("Если на улице " + temperature + " градусов, то можно идти без шапки ");
        }
//№3
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " ,то придётся заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно");
        }
//№4
        int age1 = 4;
        int age2 = 13;
        int age3 = 21;
        int age4 = 26;
        if (age1 > 2 && age1 < 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад ");
        }
        if (age2 > 7 && age2 < 17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
        }
        if (age3 >= 18 && age3 <= 24) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в университет");
        }
        if (age4 > 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить на работу");
        }
//№5
        int ageChildren = 4;
        int ageChildren2 = 6;
        int ageChildren3 = 16;
        if (ageChildren < 5) {
            System.out.println("Если возраст ребёнка равен " + ageChildren + " ,то ему нельзя кататься на аттракционе.");
        }
        if (ageChildren2 > 5 && ageChildren2 < 14) {
            System.out.println("Если возраст ребёнка равен " + ageChildren2 + " ,то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (ageChildren3 > 14) {
            System.out.println("Если возраст ребёнка равен " + ageChildren3 + " ,то он может кататься на аттракционе самостоятельно.");
        }
//№6
        int totalSeats = 102;
        int seatingCapacity = 60;
        int standingPlaces = totalSeats - seatingCapacity;
        int passengers = 103;
        int standingPassengers = 61;
        if (passengers <= totalSeats) {
            System.out.println("В вагоне есть свободные места");
        } else {
            System.out.println("В вагоне нет свободных мест");
            if (standingPassengers > 60 && standingPassengers < 102) {
                System.out.println("В вагоне есть свободные места , но только стоячие");
            }
        }
//№7
        int one = 6;
        int two = 66;
        int three = 666;
        if (one > two) {
            System.out.println("Число one больше two");
        } else {
            System.out.println("Число two больше one");
        }
        if (two > three) {
            System.out.println("Число two больше three");
        } else {
            System.out.println("Число three больше two");
        }
    }


}
