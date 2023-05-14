import java.util.Scanner;
public class DuongTron {
	

	
	    private int x, y;

		public DuongTron(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
	    
		public void nhapDiem() {
			Scanner scn = new Scanner(System.in);
			System.out.print("Nhap toa do X : ");
			setX(scn.nextInt());
			System.out.print("Nhap toa do Y : ");
			setY(scn.nextInt());
		}
		
		public void inDiem() {
			System.out.print("("+x+", "+y+")");
		}
		
		
	}

