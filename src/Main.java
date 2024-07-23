public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");

        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";

        String fullName = firstName + " " + lastName + " " + middleName;
        System.out.println("Ф.И.О сотрудника - " + fullName);

        System.out.println();
        System.out.println("task 2");
        System.out.println(fullName.toUpperCase());

        System.out.println();
        System.out.println("task 3");

        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replaceAll("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName1);





    }
}