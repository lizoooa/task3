public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student("Jan", "Kowalski", "12345", "jan.kowalski@example.com", "Warszawa");
        Student stud2 = new Student("Elżbieta", "Milczarska", "61305", "elzbieta.milczarska@example.com", "Gdańsk");

        teacher teacher1 = new teacher("Marek", "Nowak", "marek.nowak@example.com", "Management");

        StudentGroup group = new StudentGroup("Zarządzanie 2025");
        group.addStudent(stud1);
        group.addStudent(stud2);

        group.printGroupInfo();
        teacher1.printInfo();
    }
}
