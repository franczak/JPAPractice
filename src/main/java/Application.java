import com.model.Category;
import com.model.Product;
import com.model.Supplier;
import com.model.TransactionC;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Set;

public class Application {
    private static SessionFactory sessionFactory = null;

    private static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            sessionFactory = configuration.configure().buildSessionFactory();
        }
        return sessionFactory;
    }

    public static void main(final String[] args){


        sessionFactory = getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();




        //session.save(transaction);


        //int quan = transaction.getQuantity(product);
        //System.out.println(quan);




        //Category fc = session.get(Category.class, 3);
       // List<Product> products = fc.getProducts();
        //for(Product p : products)
         //   System.out.println(p.getProductName());
//  Supplier fs = session.get(Supplier.class,2);
//        Product product = new Product("Pizza",5);
//        product.setSupplier(fs);
//        product.setCategory(fc);
//        session.save(product);
        //fp.setCategory(fc);
        //session.save(fp);
     //   Supplier supplier = session.get(Supplier.class,4);
        //System.out.println(supplier);

        tx.commit();
        session.close();

    }
}
