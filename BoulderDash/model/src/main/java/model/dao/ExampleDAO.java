package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Example;

/**
 * 
 * @author ALY
 *
 */
public abstract class ExampleDAO extends AbstractDAO {

	private static int    ColumnIndex  ;



	private static String sqlTypeofLevel1 = "{call FirstLevel1()}";
	
	//private static String sqlTypeofLevel2 = "{call SecondtLevel2()}";
	//private static String sqlTypeofLevel3 = "{call ThirdtLevel3()}";
	//private static String sqlTypeofLevel4 = "{call FourthtLevel4()}";
	//private static String sqlTypeofLevel5 = "{call FithtLevel5()}";

	public static List<Example> getLevel1() throws SQLException {
		final ArrayList<Example> level1 = new ArrayList<Example>();
		final CallableStatement callStatement = prepareCall(sqlTypeofLevel1);
		if (callStatement.execute()) {
			final ResultSet result = callStatement.getResultSet();

			for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) {
				level1.add(new Example(ColumnIndex, result.getString("level1")));
			}
			result.close();
		}
		return level1;
	}
	
	

	



}
