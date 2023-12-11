import controller.Controller;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createStudent("Пушкин", "Александр", "Сергеевич");
        controller.createStudent("Лермонтов", "Михаил", "Юрьевич");
        controller.createStudent("Гоголь", "Николай", "Васильевич");
        controller.createStudent("Чехов", "Антон", "Павлович");
        controller.createStudent("Горький", "Максим", "Алексеевич");
        controller.createStudent("Тургенев", "Иван", "Сергеевич");
        controller.createStudent("Шолохов", "Михаил", "Александрович");
        controller.createStudent("Блок", "Александр", "Александрович");
        controller.createStudent("Булгаков", "Михаил", "Афанасьевич");
        controller.createStudent("Гайдар", "Аркадий", "Петрович");
        controller.createStudent("Бианки", "Виталий", "Валентинович");
        controller.createTeacher("Чингачгук", "Аарон", "Моисеевич");
        controller.createTeacher("Виниту", "Давид", "Маркович");
        controller.createTeacher("Джеронимо", "Абрам", "Соломонович");
        controller.createTeacher("Покахонтас", "Юдифь", "Абдурахмановна");
        System.out.println("Список всех студентов:");
        controller.getAllStudent();
        System.out.println("\nСписок всех учителей:");
        controller.getAllTeacher();
        controller.createGroups(1, List.of(1, 2, 3, 10));
        controller.createGroups(2, List.of(8, 5, 6, 7));
        controller.createGroups(4, List.of(4, 5, 6, 7, 11));
        controller.createGroups(3, List.of(4, 5, 6, 7, 9, 8));
        System.out.println("\nСписок учебных групп с Id учителя и списка Id студентов:");
        controller.getAllGroups();
        System.out.println("\nСписок учебных групп с извлечением информации из базового класса User:");
        System.out.println(controller.toString2());

    }
}
