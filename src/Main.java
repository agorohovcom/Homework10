public class Main {
    public static void main(String[] args) {
        // Строки
        // Задача 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();

        // Задача 2
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpperCase);
        System.out.println();

        // Задача 3
        fullName = "Иванов Семён Семёнович";
        String fullNameReplacedUnsupportedSymbol = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullNameReplacedUnsupportedSymbol);
    }
}