package singletonPattern;

/**
 * @description: 主方法
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/14 17:01
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Start.");
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		if (obj1 == obj2) {
			System.out.println("obj1与obj2是相同的实例");
		} else {
			System.out.println("obj1与obj2是不同的实例");
		}
		System.out.println("End.");
	}
}
