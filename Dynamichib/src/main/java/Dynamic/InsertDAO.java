package Dynamic;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;



public class InsertDAO {

	public int insert(Employee e) {
		SessionFactory sf=Config.hibConfig();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		int r=(int)s.save(e);
		t.commit();
		return r;
	}	
	public List<Employee> get() {
		SessionFactory sf=Config.hibConfig();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Query q=s.createQuery("from Employee");
		List<Employee> el =q.list();
		t.commit();
		return el;
	}

	
}
