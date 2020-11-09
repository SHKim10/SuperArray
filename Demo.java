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

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray result = new SuperArray();
    int smallerArray = Math.min(a.size(), b.size());
    for (int i = 0; i < smallerArray; i++){
      result.add(a.get(i));
      result.add(b.get(i));
    }
    if (a.size() > b.size()){
      for (int i = b.size(); i < a.size(); i++){
        result.add(a.get(i));
      }
    } else {
      for (int i = a.size(); i < b.size(); i++){
        result.add(b.get(i));
      }
    }
    return result;
  }
}
