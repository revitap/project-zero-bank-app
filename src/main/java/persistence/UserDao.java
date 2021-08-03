package persistence;

public class UserDao {
	
	public static void main(String[] args) {
		
	}
	
    public <T>T getById(int id) {
//        Session session = getSession();
        T entity = (T)session.get(type, id);
        session.close();
        return entity;
    }

}
