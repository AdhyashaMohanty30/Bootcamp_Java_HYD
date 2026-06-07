package AbstractClass;

public class C_03_HRDepartment extends C_02_ITDepartment {

    @Override
    public void dept() {
        System.out.println("Dept : HR");
    }

    @Override
    public void salary() {
        System.out.println("Salary : HR Department");
    }

    @Override
    public void bonus() {
        System.out.println("Bonus : HR Department");
    }

    public static void main(String[] args) {

        C_03_HRDepartment obj = new C_03_HRDepartment();

        obj.dept();
        obj.salary();
        obj.SetUp();
        obj.support();
        obj.bonus();

        System.out.println("===========");

        C_02_ITDepartment obj1 = new C_03_HRDepartment();

        obj1.dept();
        obj1.salary();
        obj1.SetUp();
        obj1.support();
       
    }
}