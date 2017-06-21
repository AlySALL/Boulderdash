package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

import com.mysql.cj.api.jdbc.Statement;

/**
 * 
 * @author ALY
 *
 */
public abstract class ExampleDAO extends AbstractDAO {




	private static String sqlTypeofLevel1 = "{call FirstLevel1[(?)]}";
	

	//private static String sqlTypeofLevel2 = "{call SecondtLevel2()}";
	//private static String sqlTypeofLevel3 = "{call ThirdtLevel3()}";
	//private static String sqlTypeofLevel4 = "{call FourthtLevel4()}";
	//private static String sqlTypeofLevel5 = "{call FithtLevel5()}";

	public static ArrayList<Level> getLevel1(final char COL) throws SQLException {
		final ArrayList<Level> level1 = new ArrayList<Level>();
		final CallableStatement callStatement = prepareCall(sqlTypeofLevel1);
		final ResultSet result = callStatement.getResultSet();
		callStatement.setObject(1, COL,Types.VARCHAR);
		
		if (callStatement.execute()) {
			
			
			callStatement.getMoreResults(Statement.KEEP_CURRENT_RESULT);

			for (int  i=0; i<result.getMetaData().getColumnCount();i++) {

				System.out.print(result.getObject(i+1)+",");

			}
			System.out.println("");
		}
		System.out.println("Number of lines");
		result.close();
		return null;

	}


}
