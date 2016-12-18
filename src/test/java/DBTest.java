import dao.HibernateUtil;
import entities.Category;
import entities.Entry;
import entities.Type;
import org.hibernate.Session;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DBTest {
    @Test
    public void test(){
        Category category = new Category();
        category.setName("categ");
        Type type = new Type();
        type.setName("type");

        Entry entry = new Entry();
        entry.setDescription("none");
        entry.setType(type);
        entry.setCategory(category);

       Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(category);
        session.save(type);
        session.save(entry);
        session.getTransaction().commit();

        List entities = new ArrayList<>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            entities = session.createCriteria(Entry.class).list();

        } catch (Exception e) {
            System.out.println("Select error");
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        for (Object e:entities
             ) {
            System.out.println(((Entry) e).getCategory().getName());
        }

    }
}
