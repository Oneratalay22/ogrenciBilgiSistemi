public class Course {
    String name;
    String code;
    String prefix;
    Teacher teacher;
    int note=0;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        this.note=0;
    }
    void addTeacher(Teacher teacher) {
        if (teacher.bracnh.equals(this.prefix)) {
            this.teacher = teacher;
        }else{
            System.out.println("Öğretmen ve ders uyuşmazlığı");
        }
    }

    void printTeacherInfo(){
        this.teacher.print();
    }
}
