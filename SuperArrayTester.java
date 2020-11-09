public class SuperArrayTester{
  public static void main(String[] args){
    SuperArray words = new SuperArray();
    String random = "supercalifragilisticexpialidocious";

    System.out.println(words.size());             //0
    System.out.println(words.toString());         //[]
    System.out.println(words.isEmpty());          //true
    System.out.println(words.contains("s"));      //false

    System.out.println("");
    for (int i = 0; i < random.length(); i++) {
      words.add(random.substring(i, i+1));
    }
    System.out.println(words.size());             //34
    for (int i = 0; i < words.size(); i++){
      System.out.print(words.get(i));             //supercalifragilisticexpialidocious
    }
    System.out.println("");
    System.out.println(words.toString());
    System.out.println(words.isEmpty());          //false
    System.out.println(words.contains("s"));      //true
    System.out.println(words.indexOf("s"));       //0
    System.out.println(words.lastIndexOf("s"));   //33
    System.out.println(words.contains("z"));      //false
    System.out.println(words.indexOf("z"));       //-1
    System.out.println(words.lastIndexOf("z"));   //-1

    System.out.println("");
    words.set(0, "abc");
    words.add(1, "def");
    System.out.println(words.toString());
    words.remove(0);
    System.out.println(words.toString());
    words.remove(1);
    System.out.println(words.toString());

    System.out.println("");
    words.clear();
    System.out.println(words.toString());
  }
}
