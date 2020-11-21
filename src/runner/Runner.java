package runner;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Calendar;
import javax.sql.rowset.serial.SerialBlob;
import models.Enfermedad;
import models.Historial;
import models.Persona;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class Runner {

    public static void main(String[] args) throws SQLException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Persona persona = new Persona();
        persona.setId(1);
        persona.setDocumento("1049650075");
        persona.setTipoDocumento("CC");
        persona.setNombres("Nicolas Dario");
        persona.setApellidos("Espitia Torres");
        persona.setFechaNacimiento(Calendar.getInstance().getTime());
        
        Historial historial = new Historial();
        historial.setFechaCreacion(Calendar.getInstance().getTime());
        historial.setPersona(persona);
        session.save(persona);
        session.save(historial);
        
        transaction.commit();

        session.close();
    }

}
