public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity){
    data = new String[initialCapacity];
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if (data.length == size) resize();
    data[size] = element;
    size ++;
    return true;
  }

  public void add(int index, String element){
    if (size == data.length) resize();
    for (int i = size++; i > index; i--){
      data[i] = data[i-1];
    }
    data[index] = element;
  }

  public String remove(int index){
    String delete = data[index];
    for (int i = index; i < size-1; i++){
      data[i] = data[i+1];
    }
    return delete;
  }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    data[index] = element;
    return element;
  }

  public boolean contains(String s){
    for (int i = 0; i < size; i++){
      if (data[i].equals(s)) return true;
    }
    return false;
  }

  public int indexOf(String s){
    for (int i = 0; i < size; i++){
      if (data[i].equals(s)) return i;
    }
    return -1;
  }

  private void resize(){
    String[] arr = new String[data.length * 2];
    for (int i = 0; i < size; i++){
      arr[i] = data[i];
    }
    data = arr;
  }

  public void clear(){
    data = new String[size];
    size = 0;
  }

  public boolean isEmpty(){
    return size == 0;
  }

  public String toString(){
    if (size == 0) return "[]";
    String answer = "[";
    for (int i = 0; i < size-1; i++){
      answer += data[i] + ", ";
    }
    answer += data[size-1] + "]";
    return answer;
  }

  public String[] toArray(){
    String[] answer = new String[size];
    for (int i = 0; i < size; i++){
      answer[i] = data[i];
    }
    return answer;
  }
}
