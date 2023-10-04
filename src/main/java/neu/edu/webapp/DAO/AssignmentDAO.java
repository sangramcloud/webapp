package neu.edu.webapp.DAO;

import neu.edu.webapp.Model.Account;
import neu.edu.webapp.Model.Assignment;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AssignmentDAO extends DAO{
    @Autowired
    Assignment assignment;
    @Autowired
    Account account;

    //save it to DB
    public boolean saveAssignmentToDB(Assignment assignment) {
    try{
        begin();
        getSession().save(assignment);
        commit();

    }catch(Exception e){
        System.out.println(e.getMessage());
        return false;
    }finally{
        close();
    }
    return true;
    }


    //retrive from DB using User id
    public List<Assignment> retriveUsingAccID(Account account){

        List<Assignment> result = null;
        try{
            begin();
            Query query = getSession().createQuery("from Assignment where accountId=:accId");
            query.setParameter("accId",account);

            result = query.getResultList();
            commit();


        }
        catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }finally{
            close();
        }
        return result;
    }
    //retrive from DB using emailid

    //retrive all Assignments in the DB


}
