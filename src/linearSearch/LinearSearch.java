package linearSearch;

public class LinearSearch {
    /***
     * 线性查找
     * @param data
     * @param num
     * @return
     */
  public int Search(int[] data, int num) {
    for (int i = 0; i < data.length; i++) {
      if (data[i] == num) {
        return data[i];
      }
    }
    // 如果找不到则返回 -1
    return -1;
  }

  public static void main(String[] args) {
      int [] data ={1,4,56,2002,45,22,9,54654,1991};
      int num = 9;
      LinearSearch linearSearch = new LinearSearch();
    System.out.println(linearSearch.Search(data,num));

  }
}
