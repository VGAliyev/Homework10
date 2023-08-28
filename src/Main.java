public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 10");

        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastname = "Ivanov";
        String fullName = lastname + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Task 2");
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчёта - " + fullName.toUpperCase());
        System.out.println();
    }

    public static void task3() {
        System.out.println("Task 3");
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullName.replace('ё', 'е'));
        System.out.println();
    }
}