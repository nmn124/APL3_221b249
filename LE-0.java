/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{int age;
	    String name;
	    void setname(String name){
	        this.name=name;
	    }
	    void setage(int age){
	        this.age=age;
	    }
	    String getname(){
	        return this.name;
	    }
	    int getage(){
	        return this.age;
	    }
	    
	public static void main(String[] args) {
	    Main m1 = new Main();
	    m1.setname("Naman");
	    m1.setage(20);
		System.out.println(m1.getname()+" "+m1.getage());
	}
}
