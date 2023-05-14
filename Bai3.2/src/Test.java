
public class Test {
	    public static void main(String[] args) {
			TamGiac tg = new TamGiac(0, 0);
			tg.nhapTamGiac();
			tg.inTamGiac();
			
			tg.Ktra();
			tg.tinhChuVi();
			tg.tinhDienTich();
			
			DuongTron dt = new DuongTron(0,0,0);
			dt.nhapDuongTron();
			dt.inDuongTron();
			dt.chuViDuongtron();
			dt.dienTichDuongTron();
	    }
	}
}
