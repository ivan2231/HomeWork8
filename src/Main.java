public class Main {
    public static void main(String[] args) {
        //Задание1
        String name ="Ivan";
        String surname ="Ivanov";
        String patronymic = "Ivanovich";
        String fullName = surname + " "+ name +","+ patronymic;
        System.out.println("ФИО сотрудника-"+ fullName);

        //Задание2
        System.out.println("Данные ФИО сотрудника для заполнения отчета-"+fullName.toUpperCase());

        //Задание3
        fullName="Иванов Семен Семенович";
        String replaceFullName=fullName.replace("ё","е");
        System.out.println("Данные ФИО сотрудника-" + replaceFullName);
    }
}