package runner;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import javax.sql.rowset.serial.SerialBlob;
import models.Dosis;
import models.DosisAplicada;
import models.Enfermedad;
import models.Historial;
import models.Vacuna;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

public class Runner {

    public static void main(String[] args) throws SQLException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();


        Historial historial = (Historial) session.get(Historial.class, 1);
        Dosis dosis = (Dosis)  session.get(Dosis.class, 1);

        DosisAplicada dosisAplicada = new DosisAplicada(1, Calendar.getInstance().getTime(), historial, dosis);

        session.save(dosisAplicada);
        transaction.commit();

        session.close();
    }

}
