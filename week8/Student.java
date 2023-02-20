package week8;

public class Student {
    String name;
    int number;
    double aver;
    Student(String name,int number,double aver){
        this.name=name;
        this.number=number;
        this.aver=aver;
    }
    String getName(){return name;}
    int getNumber(){return number;}
    double getAver(){return aver;}

    public String toString(){
        String str="Name:"+name+",Number:"+number+"GPA:"+aver;
        return str;
    }

}
