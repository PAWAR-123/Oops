package oops.com;

  public  class Constructor {
	private String name;
	private int rollname;
	
	
	
	public  Constructor() {
		System.out.println("i am constructor non parameter ");
		return;
	}
	 public void Constructor() {
			System.out.println(" i am a method ");
		}
	 public Constructor(String name, int rollname) {
		 this.name=name;
		 this.rollname=rollname;
		 
	 }
	
	 public String toString() {
		 return "constructor [name="+ this.name  +     "   rollname   "+  this.rollname+"]";
	 }
	
	public static void main(String[] args) {
		Constructor c1=new Constructor("vikas",102);
		
		c1.name="pawar";
		System.out.println(c1);
	}

}
