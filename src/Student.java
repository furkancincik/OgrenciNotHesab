public class Student {

    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNu;
    String classes;
    double avarage;
    double savarage;
    boolean isPass;

    Student(String name, String stuNu, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNu = stuNu;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addSozluNotu(double sozluNotuC1, double sozluNotuC2, double sozluNotuC3) {

        c1.sozluNotu = sozluNotuC1;
        c2.sozluNotu = sozluNotuC2;
        c3.sozluNotu = sozluNotuC3;
    }


    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            c1.note = note1;

        }
        if (note2 >= 0 && note2 <= 100) {
            c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            c3.note = note3;
        }
    }

    void isPass() {
        this.avarage = ((c1.note * 0.8 + c1.sozluNotu * 0.2) +
                (c2.note * 0.8 + c2.sozluNotu * 0.2) +
                (c3.note * 0.8 + c3.sozluNotu * 0.2)) / 3;
        if (this.avarage >= 55) {
            System.out.println(this.name + " sınıfı GECTINIZ! tebrikler\t :)");
            isPass = true;
        } else {
            System.out.println(this.name + " sınıfta KALDINIZ!\t :(");
            isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.c1.name + "Notu\t\t:" + this.c1.note);
        System.out.println(this.c1.name + "Sozlu Notu:" + this.c1.sozluNotu);

        System.out.println(this.c2.name + "Notu\t\t:" + this.c2.note);
        System.out.println(this.c2.name + "Sozlu Notu:" + this.c2.sozluNotu);

        System.out.println(this.c3.name + "Notu\t:" + this.c3.note);
        System.out.println(this.c3.name + "Sozlu Notu:" + this.c3.sozluNotu);

        System.out.println("Ortalamaniz:" + this.avarage);

    }
}
