/*
@author: ZNevzz
@created: 8 PM June 1,2017
*/



public class Duck{

	private FlyBehaviour flyBehaviour;
	private QuackBehaviour quackBehaviour;
	
	public Duck(){
		
	}
	
	public FlyBehaviour getFlyBehaviour(){
		return this.flyBehaviour;
	}
	public void setFlyBehaviour(FlyBehaviour flyBehaviour){
		this.flyBehaviour = flyBehaviour;
		
	}
	public QuackBehaviour getQuackBehaviour(){
		return this.quackBehaviour;
	}
	public setQuackBehaviour(QuackBehaviour quackBehaviour){
		this.quackBehaviour = quackBehaviour;
	}
	
	

}