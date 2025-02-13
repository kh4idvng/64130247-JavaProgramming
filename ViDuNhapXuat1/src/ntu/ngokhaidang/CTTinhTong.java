package ntu.ngokhaidang;

import java.util.Scanner;

public class CTTinhTong {

	public static void main(String[] args) {
		// In ra một dòng tiêu đề App
		System.out.print("CT Tính Tổng \n");
		
		// Chuẩn bị cho việc nhập
		Scanner banPhim = new Scanner(System.in);
		
		// In  dòng mời nhập a và b
		System.out.println("Mời nhập a: ");
		double a = banPhim.nextDouble();
		System.out.println("Mời nhập b: ");
		double b = banPhim.nextDouble();
		
		// Tính toán
		double tong = a + b;
		System.out.print(tong);
		

	}

}
