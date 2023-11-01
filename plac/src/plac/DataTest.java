package plac;import java.util.Arrays;

public class DataTest {

	public static void main(String[] args) {
Data da = new Data();
 da.orc();
 DataAccessObject dao = new OrcleDao();
 da.mys();
 System.out.println("===================================================================");
 dbWork(new OrcleDao());
 dbWork(new MysqlDao());
 
	}
 public static void dbWork(DataAccessObject dao) {
	 dao.select();
	 dao.insert();
	 dao.update();
	 dao.delete();
	 
 }
	
}
