package buiphuongnga.com.test;

import java.util.ArrayList;

import buiphuongnga.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SinhVien>dsSV = new ArrayList<SinhVien>();
		dsSV.add(new SinhVien(1, "Teo", 6));
		dsSV.add(new SinhVien(2, "Ty", 6));
		dsSV.add(new SinhVien(3, "Bin", 6));
		dsSV.add(new SinhVien(4, "Bo", 6));
		System.out.println("Danh sach sinh vien");
		for(SinhVien sv: dsSV)
		{
			System.out.println(sv);
		}

	}

}
