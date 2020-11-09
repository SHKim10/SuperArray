public class Demo{
  public static void removeDuplicates(SuperArray s){
    for (int index = s.size()-1; index >= 0; index--){
      String element = s.get(index);
      if (s.indexOf(element) != index){
        s.remove(index);
      }
    }
  }
}
