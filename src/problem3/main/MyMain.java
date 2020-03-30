/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
	public static void main(String[] args) {
		MyPriorityQueue queue = new MyPriorityQueue();
		queue.enqueue(new Student("harsh",58));
		queue.enqueue(new Student("harshit",23));
		queue.enqueue(new Student("harshita",65));
		queue.enqueue(new Student("ritik",1));
		queue.enqueue(new Student("rishika",10));
		queue.enqueue(new Student("mehul",76));

		queue.show();
		queue.dequeue();
		queue.show();
	}
}



