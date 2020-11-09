public class DemoTester{
  public static void main(String[] args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);    //[kani, uni, ebi, una, una, ebi, kani, una, una, ebi, toro]
    Demo.removeDuplicates(words);
    System.out.println(words);    //[kani, uni, ebi, una, toro]

    SuperArray a = new SuperArray();
    SuperArray b = new SuperArray();
    a.add("9");   a.add("1");   a.add("2");   a.add("2");   a.add("3");   a.add("4");
    b.add("0");   b.add("4");   b.add("2");   b.add("2");   b.add("9");

    System.out.println(Demo.findOverlap(a, b));   //[9, 2, 4]

  }
}
