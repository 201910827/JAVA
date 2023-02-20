import java.time.LocalDateTime;

public class NewCat {
    String name;
    String breed;
    java.time.LocalDateTime birthday;

    public NewCat(String name, String breed){
        this.name=name;
        this.breed=breed;
        birthday= LocalDateTime.now();
    }

    @Override
     public Object clone() throws CloneNotSupportedException {
        NewCat catClone= (NewCat)super.clone();  // super은 Object의미 형을 뉴켓으로 형변환  밑에는 만든 클론에다가 값들 대입
        catClone.name=name;
        catClone.breed=breed;
        catClone.birthday=birthday;
        return catClone;
    }
    @Override
    public boolean equals(Object o){
        if(o==null) return false;  // 가장먼저해야할일 널인지
        if(!(o instanceof NewCat)) return false;  // Object가 클래스가 뉴켓인지
        NewCat d = (NewCat) o;   // 널확인 -> 클래스확인 -> 이제 동일한지
        return d.name.equals(name)&& d.birthday.equals(birthday) && d.breed.equals(breed);
    }
   /* @Override
    public int hashCode(){
        return java.util.Objects.hash(name,breed,birthday);
    }*/

}
