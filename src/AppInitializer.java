import lk.blacky.hiber.entity.Student;
import lk.blacky.hiber.util.FactoryConfiguaration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class AppInitializer {
    public static void main(String[] args) {
        Student student3=new Student("s003","Kasun","Panadura");
        Session session= FactoryConfiguaration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


       // session.save(student3);

        //1.Eager Fetching
       /* session.get(Student.class,"s001");
        System.out.println(student1.getId());*/
        /*session.get(Student.class,"s001");
        System.out.println(student1.getName());*/
        //2.lazy Fetching

       /* session.load(Student.class,"s001");
        System.out.println(student1.getId());*/

     /*   session.load(Student.class,"s001");
        System.out.println(student1.getName());*/

        /*From Clause*/


    /*  String hql="FROM Student";
        Query query = session.createQuery(hql);
        final List list = query.list();*/

        /*AS Clause*/
      /*  String hql="FROM Student AS S";
        Query query = session.createQuery(hql);
        List list = query.list();*/
        
        /*SELECT Clause*/
       /* String hql="SELECT S.name FROM Student S";
        Query query = session.createQuery(hql);
        List list = query.list();*/
        
        /*WHERE Clause*/
      /*  String hql="FROM Student S WHERE S.id='s001'";
        Query query = session.createQuery(hql);
        List list = query.list();*/

        /*ORDER BY Clause*/

        /*String hql="FROM Student S WHERE S.id > 's001' ORDER BY S.id ASC ";
        Query query = session.createQuery(hql);
        List list = query.list();*/

        /*GROUP BY Clause*/
       /* String hql="SELECT SUM(S.address),S.name FROM Student S "+"GROUP BY S.name";
        Query query = session.createQuery(hql);
        List list = query.list();*/

      /*Update Clause*/
      /*  String hql="UPDATE Student set name =:name"+" WHERE id =:id ";
        Query query = session.createQuery(hql);
        query.setParameter("name","Chamodya");
        query.setParameter("id","s001");
        int result = query.executeUpdate();
        System.out.println("Rows affected: "+ result);*/

        /*Delete Clause*/
        String hql="DELETE FROM Student "+ "WHERE id= :id";
        Query query = session.createQuery(hql);
        query.setParameter("id","s003");

        int result = query.executeUpdate();
        System.out.println("Rows affected: "+ result);


        transaction.commit();
        session.close();

    }

}
