import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      Scanner girdi = new Scanner(System.in);
 /**   Aşağıda tanımı verilen f(x,y) fonksiyonunu klavyeden girilen x ve y değerleri için
    hesaplayınız.
    x>0, y<0 ise f(x,y) = 4x+2y+4
    x>0, y=0 ise f(x,y) = 2x-y+3
    x<0, y>0 ise f(x,y) = 3x+4y+3 */
    System.out.println("x değerini giriniz: ");
    int x =girdi.nextInt();
    System.out.println("y değerini giriniz: ");
    int y= girdi.nextInt();
    int sonuc;
    if(x>0 && y<0){
      sonuc=4*x+2*y+4;
    }
    else if(x>0 && y==0){
      sonuc=2*x-y+3;
    }
    else if(x<0 && y>0){
      sonuc=3*x+4*y+3;
    }
    else{
      System.out.println("Hatalı giriş yaptınız.");
  }
    System.out.println("sonuc:  "+sonuc);
}
}