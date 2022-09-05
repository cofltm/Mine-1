public class App {
    public static void main(String[] args) {
        
        Student me = new Student();

        me.studentname = "cherish";
        me.studentID = 2022229;
        me.section = "INF224";
        me.isTransferee = false;

        Grades gen = new Grades();

        gen.name = "Cherish";
        gen.mathgrade = 88;
        gen.enggrade = 89.3;
        gen.scigrade = 88;
        gen.genave = 88.43;

        gen.sayMyName();

        Info person = new Info();

        person.firstname = "Cherish";
        person.middleintl = 'L';
        person.surname = "Sarmiento";
        person.sex = 'F';
        person.age = 18;
        person.bodytemp = 36.5;
        person.isPWD = true;

    }
}
