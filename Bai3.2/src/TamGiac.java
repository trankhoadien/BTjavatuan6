import java.util.Scanner;
	import java.lang.Math;

public class TamGiac {
	
	public class TamGiac extends Diem{

		public TamGiac(int x, int y) {
			super(x, y);
		}

		private Diem A;
		private Diem B;
		private Diem C;
		
	    Diem diemA = new Diem(0, 0);
	    Diem diemB = new Diem(0, 0);
		Diem diemC = new Diem(0, 0);
		
		int count = 0;
		double AB, AC, BC;
		
		public void nhapTamGiac() {
			
			System.out.println("Nhap toa do diem A ");
			diemA.nhapDiem();
			System.out.println("Nhap toa do diem B ");
			diemB.nhapDiem();
			System.out.println("Nhap toa do diem C ");
			diemC.nhapDiem();
		}
		
		public void inTamGiac() {
			System.out.print("Toa do diem A la : ");
			diemA.inDiem();
			System.out.println();
			System.out.print("Toa do diem B la : ");
			diemB.inDiem();
			System.out.println();
			System.out.print("Toa do diem C la : ");
			diemC.inDiem();
		}
		
	    
		public void Ktra() {
			System.out.println();
			
			AB = (Math.sqrt((Math.pow((diemB.getX()-diemA.getX()), 2)) + (Math.pow((diemB.getY()-diemA.getY()), 2))));
		    BC = (Math.sqrt((Math.pow((diemC.getX()-diemB.getX()), 2)) + (Math.pow((diemC.getY()-diemB.getY()), 2))));
		    AC = (Math.sqrt((Math.pow((diemC.getX()-diemA.getX()), 2)) + (Math.pow((diemC.getY()-diemA.getY()), 2))));
		    
		    
		    System.out.println("AB = "+AB);
		    System.out.println("BC = "+BC);
		    System.out.println("AC = "+AC);
		    
	        if(((AB+BC)<=AC && (BC+AC)<=AB && (AB+AC)<=BC ) || (AB<=0 && BC <=0 && AC <=0)) {
	        	System.out.println("3 Diem da nhap khong phai la 3 dinh cua 1 tam giac ");
	        }else {
	        	System.out.println("3 Diem da nhap la 3 dinh cua 1 tam giac ");
	        	count ++;
	        }
		}
		
		public void tinhChuVi() {
		    if(count > 0) {
				double chuVi;
				chuVi = AB + AC + BC;
				System.out.println("Chu vi cua hinh tam giac la : "+ chuVi); 
			}else {
				System.out.println("Do 3 diem khong tao thanh tam giac ==> Khong tinh duoc chu vi");
			}
		}
		
		public void tinhDienTich() {
			if(count >0) {
				double p = (AB+AC+BC)/2;
		    	double dienTich = Math.sqrt(p*(p-AB)*(p-AC)*(p-BC));
		    	System.out.println("Dien tich cua tam giac da cho la : "+dienTich);
			}else {
				System.out.println("Do 3 diem khong tao thanh tam giac ==> Khong tinh duoc dien tich");
			}
			
		}
	}
}
