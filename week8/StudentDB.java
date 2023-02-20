package week8;

enum FindGPAParam {LOWER_THAN,HIGHER_THAN;}
public class StudentDB {
    Student [] students=new Student[3];
    int num =0;

    StudentDB(){
        students = new Student[3];
    }

    void add(Student s){
        students[num]=s;
        num++;
    }
    void add(String name ,int number,double aver){
        Student st= new Student(name,number,aver);
        students[num] =st;
        num++;
    }

    Student findBy(String name){
        for(int i=0;i< students.length;i++){
            if(students[i].getName().equals(name))
                return students[i];
        }
        return null;
    }

    Student findBy(int number){
        for(int i=0;i< students.length;i++){
            if(students[i].getNumber()==number)
                return students[i];
        }
        return null;
    }

    Student findBy(double aver){
        for(int i=0;i< students.length;i++){
            if(students[i].getAver()==aver)
                return students[i];
        }
        return null;
    }

    Student findBy(FindGPAParam param,double gpa){
        if(FindGPAParam.LOWER_THAN.equals(param)){
            for(int i=0; i<students.length;i++){
                if(students[i].getAver()<gpa)
                    return students[i];
            }
            return null;

        }else if (FindGPAParam.HIGHER_THAN.equals(param)){
            for(int i=0; i<students.length;i++){
                if(students[i].getAver()>gpa)
                    return students[i];
            }
            return null;
        }else
            System.out.printf("GPAParam이 입력이 잘 못 되었습니다.");return null;
    }


    public static void main(String[] args){
        StudentDB sdb= new StudentDB();
        Student st=new Student("김지우",201911111,4.01);
        sdb.add(st);
        sdb.add("이민준",201922222,3.85);
        sdb.add("박서우",201933333,3.90);
        System.out.println(sdb.findBy("김지우").toString());
        System.out.println(sdb.findBy(201922222).toString());
        System.out.println(sdb.findBy(3.90).toString());
        System.out.println(sdb.findBy(FindGPAParam.LOWER_THAN,3.95).toString());
        System.out.println(sdb.findBy(FindGPAParam.HIGHER_THAN,3.95).toString());

    }


}
