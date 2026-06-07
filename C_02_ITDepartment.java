package AbstractClass;

public abstract class C_02_ITDepartment implements C_01_Employee {

    public abstract void dept();
    public abstract void salary();

    public void SetUp() {
        System.out.println("Setup: Dell Desktop and Additional Monitor");
    }

    public void support() {
        System.out.println("Support: Reliance");
    }
}