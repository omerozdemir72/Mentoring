package Mentoring_9_Inheritance;

 class Super_class {
  /*
  Super_class isminde bir class oluşturun. içerisinde int num  = 20     değeri olsun.

  public static void goster isminde bir method oluşturun ve "Bu method süper classın görüntülenme methodudur" print etsin.


  Aynı sayfa içerisinde   Sub_class oluşturun ve Super_class'tan miras alın.
  Sub_class içerisinde de         int num= 20 olsun. (super class ile baglantılı değil)

  public static void goster methodu oluşturun ve "Bu method Sub classsın görüntülenme methodudur. "  print etsin.

  my_method isminde void method oluşturun

  içerisinde  sub classtaki goster methodunu ve super classtaki goster methodunu cagırın.
  Aynı zamanda sub classstaki numarayı ve super classtaki int num u yazdırın.

  daha sonra main methodu acıp my method u yazdırın.
  Konsol şöyle olmalı :

  Bu method Sub classın görüntülenme yöntemidir.
  Bu method süper classın görüntülenme yöntemidir.
  Sub classtaki eleman :10
  süperClasstaki eleman  :20
   */
  int num = 20;


  public static void goster() {

   System.out.println("Bu method süper classın görüntülenme methodudur.");
  }
 }

class Sub_class extends Super_class{

 int num = 10;

 public static void goster(){

  System.out.println("Bu method Sub classın görüntülenme methodudur.");
 }


 public void my_method(){

  Sub_class sb = new Sub_class();

  Sub_class.goster();

  Super_class.goster();

  System.out.println("Sub classtaki eleman :  " + sb.num);

  System.out.println("süperClasstaki eleman :   " +super.num );
 }

 public static void main(String[] args) {

  Sub_class sb = new Sub_class();

  sb.my_method();



 }


}




