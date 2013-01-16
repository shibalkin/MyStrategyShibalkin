/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.strategy;

/**
 *
 * @author eshibalkin
 */
public class TestApp {
 
	public static void main(String[] args) {
		CryingBaby child;

		if(TestApp.weHaveMilk()) {
			child = new CryingBaby(new BabyFeed());
		} else {
			child = new CryingBaby(new BabyLull());
		}
 
		child.calm();
	}
 
	public static Boolean weHaveMilk() {
		return true;
	}
 
}
