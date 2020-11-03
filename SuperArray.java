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
}
