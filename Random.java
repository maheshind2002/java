public class Random {
    public static void main(String[] args) {
        System.out.println(Math.random()); // Generating random with decimal point 
        System.out.println((int)Math.random()); // Convert that decimal value into a one interger by typecasting using int
        System.out.println((int)(Math.random()* 10000)); // IT will Generate 4 digit random no everytime
        System.out.println((int)(Math.random()* 1000000)); // IT will Generate 6 digit random no everytime
     
}
    
}
