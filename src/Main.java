public class Main {
    public static void main(String[] args) {

        Teacher t1=new Teacher("Öner Hoca","111","TRH");
        Teacher t2=new Teacher("Ali Hoca","222","KMY");
        Teacher t3=new Teacher("Derya Hoca","333","FZK");

        Course tarih=new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course kimya=new Course("Kimya","102","KMY");
        kimya.addTeacher(t2);
        Course fizik=new Course("Fizik","103","FZK");
        fizik.addTeacher(t3);

        Student s1=new Student("veli","123","4",tarih,kimya,fizik);
        s1.addBulkExamNote(100,50,20);
        s1.isPass();

        Student s2=new Student("ayşe","122","4",tarih,kimya,fizik);
        s2.addBulkExamNote(0,50,40);
        s2.isPass();

        Student s3=new Student("Şaziye","112","4",tarih,kimya,fizik);
        s3.addBulkExamNote(100,60,70);
        s3.isPass();
    }

}