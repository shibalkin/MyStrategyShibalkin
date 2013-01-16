/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.strategy;

/**
 *
 * @author eshibalkin
 */
public class BabyFeed implements BabyCalm {
 
	@Override
	public void calm() {
		System.out.println("Eat & calm down");
	}
 
}
