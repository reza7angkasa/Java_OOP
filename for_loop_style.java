public class for_loop_style {
    public static void main(String[] args) {
        System.out.println("ini adalah awal program");
        System.out.println("loop pertama");
        for(int nilai=0;nilai<=10;nilai++){
            System.out.println("for loop ke-"+nilai);
        }
        System.out.println("loop kedua");
        for(int nilai=0;nilai<10;nilai++){
            System.out.println("for loop ke-"+nilai);
        }
        System.out.println("loop ketiga");
        for(int nilai=10;nilai >=5;nilai--){
            System.out.println("for loop ke-"+nilai);
        }
        System.out.println("loop keempat");
        int nilai=0;
        for(; nilai<10;){
            System.out.println("for loop ke-"+nilai);
            nilai++;
        }
        System.out.print("ini adalah akhir program");
    }
}