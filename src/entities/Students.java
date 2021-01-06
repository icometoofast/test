package entities;

public class Students extends Person{
    public int sudId;
    protected String schoolName;
    private  String schoolLocation;

    public Students(String name, int sudId, String schoolName, String schoolLocation) {
        super(name);
        this.sudId = sudId;
        this.schoolName = schoolName;
        this.schoolLocation = schoolLocation;
    }

    public Students(boolean sex, int sudId, String schoolName, String schoolLocation) {
        super(sex);
        this.sudId = sudId;
        this.schoolName = schoolName;
        this.schoolLocation = schoolLocation;
    }

    public Students(){

    }


    public Students(String name, boolean sex, int age, int sudId, String schoolName, String schoolLocation) {
        super(name, sex, age);
        this.sudId = sudId;
        this.schoolName = schoolName;
        this.schoolLocation = schoolLocation;
    }

    public int getSudId() {
        return sudId;
    }

    public String getSchoolLocation() {
        return schoolLocation;
    }

    public void setSchoolLocation(String schoolLocation) {
        this.schoolLocation = schoolLocation;
    }

    public void setSudId(int sudId) {
        this.sudId = sudId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println("i am studing");
    }

    protected void walk(){
        System.out.println("i am walking");
    }

    private void play(){
        System.out.println("i an playing");
    }


}
