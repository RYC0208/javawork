package plac;

public class Data {

	DataAccessObject daosel = new OrcleDao();
	DataAccessObject daoins = new OrcleDao();
	DataAccessObject daoupd = new OrcleDao();
	DataAccessObject daodel = new OrcleDao();
	
	DataAccessObject myssel = new MysqlDao();
	DataAccessObject mysins = new MysqlDao();
	DataAccessObject mysupd = new MysqlDao();
	DataAccessObject mysdel = new MysqlDao();
	
void orc(){
	daosel.select();
	daoins.insert();
	daoupd.update();
	daodel.delete();
}void mys() {
	myssel.select();
	mysins.insert();
	mysupd.update();
	mysdel.delete();
	
}

}
