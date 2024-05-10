//
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.excel.hibernate_demo.oneTomany.Laptop;
//import com.excel.hibernate_demo.oneTomany.Student;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//
//public class MainRunner {
//	public static void main(String[] args) {
//		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("student");
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		
//		List<Laptop> laptop = new ArrayList<>();
//		Laptop laptop1 = new Laptop();
//		Laptop laptop2 = new Laptop();
//		Laptop laptop3 = new Laptop();
//		
//		Student s = new Student();
//		laptop1.setBrand("Dell");
//		laptop1.setSerialNo("jwhuwjhdoq12");
//		laptop1.setStudent(s);
//		
//		laptop2.setBrand("hp");
//		laptop2.setSerialNo("ksnjsjis23");
//		laptop2.setStudent(s);
//		
//		laptop3.setBrand("lenovo");
//		laptop3.setSerialNo("kaksaaa45");
//		laptop3.setStudent(s);
//		
//		laptop.add(laptop1);
//		laptop.add(laptop2);
//		laptop.add(laptop3);
//		
//		s.setAge(21);
//		s.setName("John");
//		s.setLaptop(laptop);
//		
//		transaction.begin();
//		manager.persist(s);
//		transaction.commit();
//		
//		manager.close();
//	}
//}