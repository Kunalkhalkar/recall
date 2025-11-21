/*abstract class practicals*/
import java.util.*;
public class AbstractClass{
	public static void main(String x[]){
		
	}
}

abstract class GrandFather{
	protected int property = 1000000;
	protected int gold = 50000;
	protected int farm = 100;
	
	protected int equityP;
	protected int equityG;
	protected int equityF;
	
	
	abstract void calcProperty();
	abstract void calcGold();
	abstract void calcFarm();
}

class Child1 extends GrandFather{
	
	void calcProperty(){
		equityP = property/2;
		System.out.println("Eqity in property according to child NO. 1: "+ equityP);
	}
	
	void calcGold(){
		equityG = gold/3; //gold divided in three beacuase there are one sister and two brothers (gold divided into three of them)
		System.out.println("Eqity in gold according to child NO. 1: "+ equityG");
		
	}
	void calcFarm(){
		equityF = farm/3; //FARM DIVIDED BTWEEN FATHER AND BOTH CHILD(BOYS)
		System.out.println("Eqity in farm according to child NO. 1: "+ equityF");
		
	}
}

class Child2 extends GrandFather{
	void calcProperty(){
		equityP = property/3;
		System.out.println("Eqity in property according to child NO. 2: "+ equityP);//property divided into into father and childs
	}
	
	void calcGold(){
		equityG = gold/2; //gold divided in two brothers (gold divided into both of them)
		System.out.println("Eqity in gold according to child NO. 2: "+ equityG");
		
	}
	void calcFarm(){
		equityF = farm ; //FARM not DIVIDED child 2 wants all farm
		System.out.println("Eqity in farm according to child NO. 2: "+ equityF");
		
	}
}
class Child3 extends GrandFather{
	void calcProperty(){
		equityP = property/4;
		System.out.println("Eqity in property according to child NO. 3: "+ equityP);//property divided into into father and childs(including girl)child 3 is girl
	}
	
	void calcGold(){
		equityG = gold/2; //child three want all gold
		System.out.println("Eqity in gold according to child NO. 3: "+ equityG");
		
	}
	void calcFarm(){
		equityF = farm / 3; //child 3 not want farm
		System.out.println("Eqity in farm according to child NO. 3: "+ equityF");
		
	}
}