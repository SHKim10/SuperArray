public class Demo{
  public static void removeDuplicates(SuperArray s){
    for (int index = s.size()-1; index >= 0; index--){
      String element = s.get(index);
      if (s.indexOf(element) != index){
        s.remove(index);
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray result = new SuperArray();
    for (int i = 0; i < a.size(); i++){
      if (b.contains(a.get(i))){
        result.add(a.get(i));
      }
    }
    removeDuplicates(result);
    return result;
  }
}
