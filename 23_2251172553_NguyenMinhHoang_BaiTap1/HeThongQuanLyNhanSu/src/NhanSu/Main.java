package NhanSu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		NhanVien[] nv = new NhanVien[2];
		
		nhapNhanVien(nv);
		xuatNhanVien(nv);
		
	}

	public static void xuatNhanVien(NhanVien[] nv) {
		for(int i=0 ; i<nv.length ; i++) {
			System.out.println("Ten: " + nv[i].getTen() );
			if(nv[i] instanceof NhanVienToanThoiGian) {
				System.out.println("Luong: " +  ((NhanVienToanThoiGian)nv[i]).TinhLuong() );
			}
			else if (nv[i] instanceof NhanVienBanThoiGian) {
				System.out.println("Luong: " +  ((NhanVienBanThoiGian)nv[i]).TinhLuong() );
			}
		}
		
	}
	
	public static void nhapNhanVien(NhanVien[] nv) {
		for(int i=0 ; i<nv.length ; i++) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Chon nhan vien: 1= nhan vien toan thoi gian, 2 = nhan vien ban thoi gian");
			int option = sc.nextInt();
			sc.nextLine();
			
			if (option == 1) {			
				System.out.print("Ten:");
				String Ten = sc.nextLine();
				
				System.out.print("Gio lam: ");
				int GioLam = sc.nextInt();
				sc.nextLine();
				
				nv[i] = new NhanVienToanThoiGian(Ten, GioLam);
				
			}
			else if (option == 2) {
				System.out.print("Ten:");
				String Ten = sc.nextLine();
				
				System.out.print("Gio lam: ");
				int GioLam = sc.nextInt();
				sc.nextLine();
				
				nv[i] = new NhanVienBanThoiGian(Ten, GioLam);
			}
		}
	}
}
