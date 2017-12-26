import com.model.Address;
import com.model.Product;
import com.model.Supplier;
import com.model.TransactionC;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Set;

public class ApplicationJPA {
    public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibllegro");
    EntityManager em = emf.createEntityManager();
    EntityTransaction etx = em.getTransaction();
    etx.begin();

    //Address address = new Address("Oij 32","Japan","XNX0S");
    //Supplier supplier = new Supplier("Mexico Tacos","Mexico City","Tacostreet 21","T4C05");
    //supplier.setAddress(address);

   // em.persist(supplier);

    etx.commit();
    em.close();
    }
}
