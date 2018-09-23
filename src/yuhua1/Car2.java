package yuhua1;

import java.util.Scanner;

public class Car2 {
	String carName="";
	double tank= 0.0;//油箱的油量
	double oilConsumption=0.0;//油耗量

	public Car2(String carName, double tank, double oilConsumption) {
		super();
		this.carName = carName;
		this.tank = tank;
		this.oilConsumption = oilConsumption;
	}
	
    public static void show(int n,Car2 car[]) {
		 for(int i=0;i<n;i++) {
			 System.out.println("第"+(i+1)+"辆车的基本属性：");
			 System.out.println("车名："+car[i].carName);
			 System.out.println("车箱的油量："+car[i].tank);
			 System.out.println("车的油耗量："+car[i].oilConsumption+"\n");
		 }
	 }
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println("总共生成了 "+n+"辆车。");
		
		 Car2[] car=new Car2[n];
		 for(int i=0;i<n;i++) {
			 String carName=in.next();
			 //此处最好是使用in.next(),而不是用in.nextLine();
			 double tank=in.nextDouble();
			 double oilConsumption=in.nextDouble();
			 //因为in是对象，所以要想从键盘得到几个数据就得创建几个in对象。
			 car[i]=new Car2(carName, tank, oilConsumption);
		 }
		 /*for(Car2 c:car) {
			 String carName=in.next();
			 //此处最好是使用in.next(),而不是用in.nextLine();
			 double tank=in.nextDouble();
			 double oilConsumption=in.nextDouble();
			 c=new Car2(carName, tank, oilConsumption);
			 System.out.println("车名："+c.carName);
			 System.out.println("车箱的油量："+c.tank);
			 System.out.println("车的油耗量："+c.oilConsumption+"\n");
		 }*/
	
		 Car2.show(n,car);
		 //应编译器要求，此处的show方法在调用时好像最好是静态的。
		 String t=in.next();
		 System.out.println(t);
		 String s=in.nextLine();
		 System.out.println(s);
		 //两者输出效果是不一样的
	}
	
}
