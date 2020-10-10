package linearSearch;

public class LinearSearch {
  /**
   * * 线性查找
   *
   * @param data 数组
   * @param num 目标元素
   * @return
   */
  // 私有化默认构造方法,这样就可以避免外部实例化
  private LinearSearch (){}
  // 使用static 这样就不用使用new 实例化了
  public static <E> int Search(E[] data, E num) {
    for (int i = 0; i < data.length; i++) {
      // 这个时候data[i] 和 num 是类对象而不是基本数据类型了,判断类对象比较不能使用==
      // 需要使用equals()
      // == 判断的是引用相等 而这里想判断的是值相等
      if (data[i].equals(num)) {
        return i;
      }
    }
    // 如果找不到则返回 -1
    return -1;
  }

  public static void main(String[] args) {
    Integer[] data = {1, 4, 56, 2002, 45, 22, 9, 54654, 1991};
    int num = 2002;
    LinearSearch linearSearch = new LinearSearch();
    System.out.println(linearSearch.Search(data, num));
    Student[] stu = {new Student(23,"xiaoming1"),new Student(234,"xiaoming"),new Student(23,"xiaoming")};
    Student target = new Student(23,"xiaoming");
    System.out.println(linearSearch.Search(stu, target));

  }
}
