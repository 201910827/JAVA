class helloarry{
    String toWhom ="world";
    helloarry() {}
    helloarry(String whom) {
        setWhom(whom);
        }
     void setWhom(String whom){
     toWhom=whom;
     }
     void sayhello(){
      System.out.println("hello"+toWhom);
      }
      }