public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "0055");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "0077");
        Teacher t3 = new Teacher("Kulyutmaz", "BIO", "0099");



        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        tarih.printTeacher();


        System.out.println("");
        System.out.println("***\t***\t***\t***\t***\t***");
        System.out.println("");

        Course fizik = new Course("Fizik", "201", "FZK");
        fizik.addTeacher(t2);

        fizik.printTeacher();

        System.out.println("");
        System.out.println("***\t***\t***\t***\t***\t***");
        System.out.println("");

        Course biyo = new Course("Bıyolojı", "301", "BIO");
        biyo.addTeacher(t3);
        biyo.printTeacher();


        System.out.println("");
        System.out.println("***\t***\t***\t***\t***\t***");


        System.out.println();
        System.out.println();

        Student s1=new Student("Kemal Reis","111","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,85,77);
        s1.addSozluNotu(10,90,60);
        s1.isPass();


        System.out.println();

        Student s2=new Student("Batu Reis","222","2",tarih,fizik,biyo);
        s2.addBulkExamNote(99,44,20);
        s2.addSozluNotu(80,50,90);
        s2.isPass();

        System.out.println();

        Student s3=new Student("Can Reis","333","3",tarih,fizik,biyo);
        s3.addBulkExamNote(80,70,60);
        s3.addSozluNotu(90,20,38);
        s3.isPass();

        System.out.println();



    }
}