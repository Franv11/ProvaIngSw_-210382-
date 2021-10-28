package pack2;

import static org.junit.Assert.*;

import java.sql.Time;
import java.util.ArrayList;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pack1.MyListUtil;

public class test {
	
	ArrayList<Integer> l = new ArrayList<Integer>();
	ArrayList<Integer> sorted = new ArrayList<Integer>();
	
	public void inizio() {
		l.add(1);
		l.add(3);
		l.add(8);
		l.add(2);
		l.add(5);
	}
	
	@Before
	public void TimeBefore() {
		DateTime dt = new DateTime(0);
		System.out.println("Prima dei test:");
		
	}

	@After
	public void TimeAfter() {
		DateTime dt = new DateTime(0);	
		System.out.println("Dopo dei test:");
	}

	@Test
	public void test1() {
		System.out.println("Test Cresc");
		inizio(); 
		sorted.add(1);
		sorted.add(2);
		sorted.add(3);
		sorted.add(5);
		sorted.add(8);
		assertEquals(sorted,MyListUtil.sort(l, 0));
	}
	
	@Test 
	public void test2() {
		System.out.println("Test Decr");
		inizio();
		sorted.add(1);
		sorted.add(2);
		sorted.add(3);
		sorted.add(5);
		sorted.add(8);
		assertEquals(sorted,MyListUtil.sort(l, 1));
		
	}

}
