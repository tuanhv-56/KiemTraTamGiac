package Baitoantangiac;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestTamgiac {
	@Test
	public void Tamgiacdeu(){
		tamgiac tamgiac=new tamgiac(1,1,1);
		String Test=tamgiac.LoaiTamGiac();
		assertEquals("Tam giac nay là tam giac deu",Test);
	}
	@Test
	public void Tamgiacvuong(){
		tamgiac tamgiac=new tamgiac(3,4,5);
		String Test=tamgiac.LoaiTamGiac();
		assertEquals("Tam giac nay la tam giac  vuong",Test);
	}
	@Test
	public void Tamgiaccan(){
		tamgiac tamgiac=new tamgiac(8,6,6);
		String Test=tamgiac.LoaiTamGiac();
		assertEquals("Tam giac  nay la tam giac can",Test);
	}
	@Test 
	public void Tamgiacthuong(){
		tamgiac tamgiac=new tamgiac(5,6,7);
		String Test=tamgiac.LoaiTamGiac();
		assertEquals("Tam giac nay la tam giac thuong",Test);
	}
	@Test
	public void khongphaitamgiac(){
		tamgiac tamgiac=new tamgiac(1,3,4);
		String Test=tamgiac.LoaiTamGiac();
		assertEquals("Day khong phai la tam giac",Test);
	}
}