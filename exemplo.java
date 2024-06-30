// casting é nada mais que uma conversao explicita
public class exemplo{


public static void main (String [] args){
    int valorI = 10;
    long valorL = 10;
    long total = valorI+valorL;
  //  int total2 = valorI+ valorL; //nao copmila
    int total3 = valorI +(int) valorL; //fazendo a conversao explicita de um tipo para outro
}
}