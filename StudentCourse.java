public class StudentCourse {
    private String stNO;
    private String name;
    StudentCourse(String name, String stNo){
        this.name=name;
        this.stNO=stNo;
    }

    public String getStNO() {
        return stNO;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "stNO='" + stNO + '\'' +
                ", name='" + name + '\'';
    }
}
