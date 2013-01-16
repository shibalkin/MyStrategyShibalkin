/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.strategy;

/**
 *
 * @author eshibalkin
 */
public class CryingBaby {
 
	private BabyCalm babyCalmer;
 
	public CryingBaby(BabyCalm calmType) {
		this.babyCalmer = calmType;
	}
 
	public void calm() {
		babyCalmer.calm();
	}
 
}