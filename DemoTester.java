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
    SuperArray c = new SuperArray();
    SuperArray d = new SuperArray();
    a.add("9");   a.add("1");   a.add("2");   a.add("2");   a.add("3");   a.add("4");
    b.add("0");   b.add("4");   b.add("2");   b.add("2");   b.add("9");
    c.add("a");   c.add("b");   c.add("c");   c.add("d");   c.add("e");   c.add("f");
    d.add("0");   d.add("1");   d.add("2");   d.add("3");

    System.out.println(Demo.findOverlap(a, b));   //[9, 2, 4]
    System.out.println(Demo.zip(a, b));           //[9, 0, 1, 4, 2, 2, 2, 2, 3, 9, 4]
    System.out.println(Demo.zip(c, d));           //[a, 0, b, 1, c, 2, d, 3, e, f]
    c.remove(3);
    c.remove(4);
    c.remove(5);
    d.add(4, "4");
    System.out.println(Demo.zip(c, d));           //[a, 0, b, 1, c, 2, 3, 4]
  }
}
