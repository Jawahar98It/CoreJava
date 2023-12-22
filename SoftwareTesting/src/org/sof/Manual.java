package org.sof;
public class Manual {
	void sdlc()
	{
		System.out.println("Learn SDLC");
	}
	void stlc()
	{
		System.out.println("Learn STLC");
	}
	void bugLifecycle()
	{
		System.out.println("Learn Bug LifeCycle");
	}

	public static void main(String[] args) {
		Manual man=new Manual();
		man.sdlc();
		man.stlc();
		man.bugLifecycle();
	}

}
