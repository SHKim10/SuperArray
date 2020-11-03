public class Tester{
  public static void main(String[] args){
    SuperArray words = new SuperArray();
    //Testing size, add, and get
    System.out.println(words.size());   //0
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    words.add("abc");
    words.add("def");
    words.add("ghi");
    System.out.println(words.size());   //6
    for (int i = 0; i < words.size(); i++){
      System.out.println(words.get(i));
    }
    //Testing set
    System.out.println("");
    words.set(3, "rst");
    words.set(4, "uvw");
    words.set(5, "xyz");
    for (int i = 0; i < words.size(); i++){
      System.out.println(words.get(i));
    }
    //Testing resize and modified add
    words.add("hij");
    words.add("klm");
    System.out.println(words.size());   //8
  }
}
