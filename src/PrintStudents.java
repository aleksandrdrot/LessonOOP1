public class PrintStudents {

    public void printStudentFaculty(Hogwarts[] hogwarts, String faculty){
        boolean flag = false;
        for (int i = 0; i < hogwarts.length; i++){
            Hogwarts hogwart = hogwarts[i];
            if (faculty.equals(hogwart.getClass().getCanonicalName())) {
                flag = true;
                System.out.println("Имя " + hogwart.getFirstName() + ", Фамилия " + hogwart.getLastName() +
                        ", Колдовство=" + hogwart.getWitchcraft() + ", Дистанция=" + hogwart.getDistance() + hogwart.toString());
            }
        }
        if (!flag){
            System.out.println("Совпадений не найдено");
        }
        System.out.println();
    }

    public void printAllStudent(Hogwarts[] hogwarts){
        for (int i = 0; i < hogwarts.length; i++){
            Hogwarts hogwart = hogwarts[i];
            System.out.println("Имя " + hogwart.getFirstName() + ", Фамилия " + hogwart.getLastName() +
                    ", Колдовство=" + hogwart.getWitchcraft() + ", Дистанция=" + hogwart.getDistance() + hogwart.toString());
        }
        System.out.println();
    }

    public void bestStudentSchool(Hogwarts[] hogwarts, String firstName1, String lastName1, String firstName2, String lastName2){
        int student1 = 0, sum1 = 0;
        int student2 = 0, sum2 = 0;
        boolean flag1 = false, flag2 = false;
        for (int i = 0; i < hogwarts.length ; i++){
            Hogwarts hogwart = hogwarts[i];
            if (hogwart.getFirstName() == firstName1){
                if (hogwart.getLastName() == lastName1){
                    student1 = i;
                    flag1 = true;
                    sum1 = hogwart.getWitchcraft() + hogwart.getDistance();
                }
            }
            if (hogwart.getFirstName() == firstName2){
                if (hogwart.getLastName() == lastName2){
                    student2 = i;
                    flag2 = true;
                    sum2 = hogwart.getWitchcraft() + hogwart.getDistance();
                }
            }
        }
        if (flag1 && flag2) {
            if (sum1 > sum2) {
                System.out.println("Сильнейший студент - " + hogwarts[student1].getFirstName() + " " + hogwarts[student1].getLastName() + " Кол.балов - " + sum1);
            } else {
                System.out.println("Сильнейший студент - " + hogwarts[student2].getFirstName() + " " + hogwarts[student2].getLastName() + " Кол.балов - " + sum2);
            }
        }else {
            System.out.println("Совпадений не найдено");
        }
    }

    public void bestStudentGriffindor(Hogwarts[] hogwarts, String firstName1, String lastName1, String firstName2, String lastName2){
        st(hogwarts, "Griffindor", firstName1, lastName1 , firstName2, lastName2);
    }

    public void bestStudentKogtevran(Hogwarts[] hogwarts, String firstName1, String lastName1, String firstName2, String lastName2){
        st(hogwarts, "Kogtevran", firstName1, lastName1 , firstName2, lastName2);
    }

    public void bestStudentPuffendu(Hogwarts[] hogwarts, String firstName1, String lastName1, String firstName2, String lastName2){
        st(hogwarts, "Puffendu", firstName1, lastName1 , firstName2, lastName2);
    }

    public void bestStudentSlizerin(Hogwarts[] hogwarts, String firstName1, String lastName1, String firstName2, String lastName2){
        st(hogwarts, "Slizerin", firstName1, lastName1 , firstName2, lastName2);
    }

    public void st(Hogwarts[] hogwarts, String faculty, String firstName1, String lastName1, String firstName2, String lastName2){
        int student1 = 0, sum1 = 0;
        int student2 = 0, sum2 = 0;
        boolean flag1 = false, flag2 = false;
        for (int i = 0; i < hogwarts.length ; i++){
            Hogwarts hogwart = hogwarts[i];
            if (faculty.equals(hogwart.getClass().getCanonicalName())) {
                if (hogwart.getFirstName() == firstName1) {
                    if (hogwart.getLastName() == lastName1) {
                        student1 = i;
                        flag1 = true;
                        sum1 = hogwart.sum();
                    }
                }
                if (hogwart.getFirstName() == firstName2) {
                    if (hogwart.getLastName() == lastName2) {
                        student2 = i;
                        flag2 = true;
                        sum2 = hogwart.sum();
                    }
                }
            }
        }
        if (flag1 && flag2) {
            if (sum1 > sum2) {
                System.out.println("Сильнейший студент " + faculty + " - " + hogwarts[student1].getFirstName() + " " + hogwarts[student1].getLastName() + " Кол.балов - " + sum1);
            } else {
                System.out.println("Сильнейший студент " + faculty + " - " + hogwarts[student2].getFirstName() + " " + hogwarts[student2].getLastName() + " Кол.балов - " + sum2);
            }
        }else {
            System.out.println("Совпадений не найдено");
        }
    }
}

