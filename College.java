package task;

//Example of Final Method
//If We make any method as final, you cannot override it.

class Students{
  final void run(){
      System.out.println("We are in LJIET");
  }  // Method is declared Final method
}

class College extends Students{
  void run(){
      System.out.println("We are Students of LJIET");
  }  //We will not be able to override method as above it is declared final

  public static void main(String args[]){
      College College= new College();
      College.run();
  }
}

//output
//we will get compile time error