public class Main {
 public static void main(String[] args) {
  double rand = Math.floor(Math.random() * (99 - 50) + 50);
  int number = (int)rand;
  System.out.println("モンスターに、" + number + "のダメージを与えた");
 }
}