/**
 * An IdMapping is one int-String pair, for example, a primary key in a
 * database and a name or description of the item in the named row.
 * IdMapping objects are immutable.
 * @version $Id$
 */
public class IdMapping {
	int id;
	String name;
	public IdMapping(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getname() {
		return name;
	}
}