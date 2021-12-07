import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {
            ArrayList<Student> s = new ArrayList<>();
            s.add(new Student("Самонин Георгий Максимович", 72, 8, 19));
            s.add(new Student("Тен Александр Александрович", 82, 16, 19));
            s.add(new Student("Аванесов Герман Гарьевич", 69, 9, 19));
            s.add(new Student("Никулин Владислав Сергеевич", 98, 21, 19));
            s.add(new Student("Москвин Геннадий Максимович", 100, 4, 19));

            new LabClassUI(s);
        }

    }