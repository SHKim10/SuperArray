public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
  }

  public int size(){
    int count = 0;
    for (int i = 0; i < data.length; i++){
      if (data[i] != null){
        count++;
      }
    }
    size = count;
    return size;
  }

  public boolean add(String element){
    if (data.length == size) resize();
    data[size] = element;
    size += 1;
    return true;
  }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    data[index] = element;
    return element;
  }

  private void resize(){
    String[] arr = new String[data.length * 2];
    for (int i = 0; i < size; i++){
      arr[i] = data[i];
    }
    data = arr;
  }

  public boolean isEmpty(){
    return size == 0;
  }

  public String toString(){
    if (size == 0) return "[]";
    String answer = "[";
    for (int i = 0; i < size; i++){
      answer += data[i] + ", ";
    }
    answer += data[size-1] + "]";
    return answer;
  }

  public boolean contains(String s){
    for (int i = 0; i < size; i++){
      if (data[i].equals(s)) return true;
    }
    return false;
  }

  public void clear(){
    data = new String[size];
    size = 0;
  }
}
