public class Teacher {
    String name;
    String mpno;
    String bracnh;

    Teacher(String name, String mpno, String bracnh) {
        this.name = name;
        this.mpno = mpno;
        this.bracnh = bracnh;
    }
    void print() {
        System.out.println("Adı :" + this.name);
        System.out.println("Telefoju :" + this.mpno);
        System.out.println("Bölümü :" + this.bracnh);

    }

}

