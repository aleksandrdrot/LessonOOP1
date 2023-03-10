public class Main {
    public static void main(String[] args) {

        PrintStudents p = new PrintStudents();

        Hogwarts[] hogwarts = {
                new Griffindor("Гарри", "Поттер", 85, 54, 14, 65, 24),
                new Puffendu("Захария", "Смит", 74, 65, 42, 15, 48),
                new Griffindor("Гермиона", "Грейнджер", 74, 48, 16, 28, 32),
                new Griffindor("Рон", "Уизли", 32, 43, 9, 15, 11),
                new Puffendu("Седрик", "Диггори", 65, 42, 31, 10, 22),
                new Puffendu("Джастин", "Финч-Флетчли", 32, 57, 28, 18, 51),
                new Kogtevran("Чжоу", "Чанг", 65, 25, 35, 54, 61, 15),
                new Kogtevran("Падма", "Патил", 53, 28, 44, 26, 55, 17),
                new Slizerin("Драко", "Малфой", 55, 48, 22, 45, 24, 32, 17),
                new Slizerin("Грэхэм", "Монтегю", 47, 73, 11, 56, 17, 55, 29),
                new Kogtevran("Маркус", "Белби", 81, 33, 57, 63, 46, 13),
                new Slizerin("Грегори", "Гойл", 64, 57, 18, 36, 75, 12, 33)
        };

        p.printAllStudent(hogwarts);
        System.out.println();
        p.bestStudentSchool(hogwarts, "Грегори", "Гойл", "Гермиона", "Грейнджер");
        System.out.println();
        p.bestStudentGriffindor(hogwarts, "Гарри", "Поттер", "Гермиона", "Грейнджер");

    }

}