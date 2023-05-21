public class Main {
    public static void printStudentInfo(Student student) {
        System.out.println("Имя: " + student.getName());
        student.getAddress().ifPresent(address -> {
            System.out.println("Адрес: " + address.getCity() + ", " + address.getRegion());
        });
        System.out.println();
    }

    public static void main(String[] args) {

        Student student1 = new Student("Вася Пупкин", new Address("Зажопинск", "Россия"));
        Student student2 = new Student("Даша Калашникова");
        Student student3 = new Student("Петр Умный", new Address("Краснодар", "Россия"));

        printStudentInfo(student1);
        printStudentInfo(student2);
        printStudentInfo(student3);
    }
}