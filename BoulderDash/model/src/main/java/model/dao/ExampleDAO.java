package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Example;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class ExampleDAO extends AbstractDAO {

	/** The sql example by id. */
	private static String sqlExampleById   = "{call findExampleById(?)}";

	/** The sql example by name. */
	private static String sqlExampleByName = "{call findExampleByName(?)}";

	/** The sql all examples. */
	private static String sqlAllExamples   = "{call findAllExamples()}";

	/** The id column index. */
	private static int    idColumnIndex    = 1;

	/** The name column index. */
	private static int    nameColumnIndex  = 2;

	private static String sqlTypeofLevel1 = "{call FirstLevel1(?)}";
	private static String sqlTypeofLevel2 = "{call SecondtLevel2(?)}";
	private static String sqlTypeofLevel3 = "{call ThirdtLevel3(?)}";
	private static String sqlTypeofLevel4 = "{call FourthtLevel4(?)}";
	private static String sqlTypeofLevel5 = "{call FithtLevel5(?)}";




	/**
	 * Gets the example by id.
	 *
	 * @param id
	 *            the id
	 * @return the example by id
	 * @throws SQLException
	 *             the SQL exception
	 */
	public static Example getExampleById(final int id) throws SQLException {
		final CallableStatement callStatement = prepareCall(sqlExampleById);
		Example example = null;
		callStatement.setInt(1, id);
		if (callStatement.execute()) {
			final ResultSet result = callStatement.getResultSet();
			if (result.first()) {
				example = new Example(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
			}
			result.close();
		}
		return example;
	}

	/**
	 * Gets the example by name.
	 *
	 * @param name
	 *            the name
	 * @return the example by name
	 * @throws SQLException
	 *             the SQL exception
	 */
	public static Example getExampleByName(final String name) throws SQLException {
		final CallableStatement callStatement = prepareCall(sqlExampleByName);
		Example example = null;

		callStatement.setString(1, name);
		if (callStatement.execute()) {
			final ResultSet result = callStatement.getResultSet();
			if (result.first()) {
				example = new Example(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
			}
			result.close();
		}
		return example;
	}

	/**
	 * Gets the all examples.
	 *
	 * @return the all examples
	 * @throws SQLException
	 *             the SQL exception
	 */
	public static List<Example> getAllExamples() throws SQLException {
		final ArrayList<Example> examples = new ArrayList<Example>();
		final CallableStatement callStatement = prepareCall(sqlAllExamples);
		if (callStatement.execute()) {
			final ResultSet result = callStatement.getResultSet();

			for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) {
				examples.add(new Example(result.getInt(idColumnIndex), result.getString(nameColumnIndex)));
			}
			result.close();
		}
		return examples;
	}
	/**
	 * 
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static String getSqlTypeofLevel1() throws SQLException {
		final CallableStatement callStatement = prepareCall(sqlTypeofLevel1);
		@SuppressWarnings("unused")
		String level1 = null;
		callStatement.setLong(idColumnIndex, 1);
		if(callStatement.execute()){
			final ResultSet result = getResultSet();
			result.close();
		}
		return sqlTypeofLevel1;
	}
	private static ResultSet getResultSet() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static String getSqlTypeofLevel2() throws SQLException{
		@SuppressWarnings("unused")
		final  CallableStatement callableStatement = prepareCall(sqlTypeofLevel2);
		return sqlTypeofLevel2;
	}

	public static void setSqlTypeofLevel2(String sqlTypeofLevel2) {
		ExampleDAO.sqlTypeofLevel2 = sqlTypeofLevel2;
	}
	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static String getSqlTypeofLevel3() throws SQLException{
		@SuppressWarnings("unused")
		final CallableStatement callableStatement = prepareCall(sqlTypeofLevel3);
		return sqlTypeofLevel3;
	}

/**
 * 
 * @return
 * @throws SQLException
 */

	public static String getSqlTypeofLevel4()throws SQLException {
		@SuppressWarnings("unused")
		final CallableStatement callableStatement =prepareCall(sqlTypeofLevel4);
		return sqlTypeofLevel4;
	}

/**
 * 
 * @return
 * @throws SQLException
 */

	public static String getSqlTypeofLevel5()throws SQLException {
		@SuppressWarnings("unused")
		final CallableStatement callableStatement = prepareCall(sqlTypeofLevel5);
		return sqlTypeofLevel5;
	}




}
