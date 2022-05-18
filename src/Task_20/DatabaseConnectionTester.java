package Task_20;

public class DatabaseConnectionTester {

	public static void main(String[] args) {
		MongoDataBase omongoDataBase = new MongoDataBase();
		omongoDataBase.connectToDataBase();

		OracleDataBase oOracleDataBase = new OracleDataBase();
		oOracleDataBase.connectToDataBase();

		SqlServerDataBase oSqlServerDataBase = new SqlServerDataBase();
		oSqlServerDataBase.connectToDataBase();

	}

}
