package yuhua1;

import java.util.Scanner;

public class Car2 {
	String carName="";
	double tank= 0.0;//���������
	double oilConsumption=0.0;//�ͺ���

	public Car2(String carName, double tank, double oilConsumption) {
		super();
		this.carName = carName;
		this.tank = tank;
		this.oilConsumption = oilConsumption;
	}
	
    public static void show(int n,Car2 car[]) {
		 for(int i=0;i<n;i++) {
			 System.out.println("��"+(i+1)+"�����Ļ������ԣ�");
			 System.out.println("������"+car[i].carName);
			 System.out.println("�����������"+car[i].tank);
			 System.out.println("�����ͺ�����"+car[i].oilConsumption+"\n");
		 }
	 }
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println("�ܹ������� "+n+"������");
		
		 Car2[] car=new Car2[n];
		 for(int i=0;i<n;i++) {
			 String carName=in.next();
			 //�˴������ʹ��in.next(),��������in.nextLine();
			 double tank=in.nextDouble();
			 double oilConsumption=in.nextDouble();
			 //��Ϊin�Ƕ�������Ҫ��Ӽ��̵õ��������ݾ͵ô�������in����
			 car[i]=new Car2(carName, tank, oilConsumption);
		 }
		 /*for(Car2 c:car) {
			 String carName=in.next();
			 //�˴������ʹ��in.next(),��������in.nextLine();
			 double tank=in.nextDouble();
			 double oilConsumption=in.nextDouble();
			 c=new Car2(carName, tank, oilConsumption);
			 System.out.println("������"+c.carName);
			 System.out.println("�����������"+c.tank);
			 System.out.println("�����ͺ�����"+c.oilConsumption+"\n");
		 }*/
	
		 Car2.show(n,car);
		 //Ӧ������Ҫ�󣬴˴���show�����ڵ���ʱ��������Ǿ�̬�ġ�
		 String t=in.next();
		 System.out.println(t);
		 String s=in.nextLine();
		 System.out.println(s);
		 //�������Ч���ǲ�һ����
	}
	
}
