package dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    private static EntryDao entryDao = new EntryDao();
    private static CategoryDao categoryDao = new CategoryDao();
    private static TypeDao typeDao = new TypeDao();

    static {

        try {
            sessionFactory = new Configuration()
                    .setProperty("hibernate.show_sql", "false")
                    .setProperty("hibernate.use_sql_comments", "false")
                    .setProperty("hibernate.generate_statistics", "false")
                    .configure()
                    .buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed."+ ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static EntryDao getEntryDao() {
        return entryDao;
    }

    public static CategoryDao getCategoryDao() {
        return categoryDao;
    }

    public static TypeDao getTypeDao() {
        return typeDao;
    }
}
