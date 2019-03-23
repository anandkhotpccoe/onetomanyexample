package com.example.onetomany;




import java.util.HashSet;
import java.util.Iterator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.onetomany.model.Car;
import com.example.onetomany.model.Part;
import com.example.onetomany.repository.CarRepository;
import com.example.onetomany.repository.PartRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OnetomanyApplicationTests {

	/*
	 * @Test public void contextLoads() { }
	 */
	
	
	@Autowired
	private CarRepository carRepository;
	
	
	@Autowired
	private PartRepository partRepository;
	
	
	@Test
	public void createCar()
	{
		Car car = new Car(1l, "Dzire", new HashSet<>());
		carRepository.save(car);
	}
	
	@Test
	public void createPart()
	{
		Part part = new Part(1l, "Mirror", new Car(1l, null, null));
		partRepository.save(part);
		
		java.util.List<Part> list = partRepository.printAllParts();
		
		Iterator<Part> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			
			System.out.println("Parts: " + iterator.next());
		}
		
		
	}
}
