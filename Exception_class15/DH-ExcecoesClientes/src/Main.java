public class Main {
    public static void main(String[] args) {
        // write your code here
        Cliente c1 = new Cliente("William", "Rodrigues", "457544", 100);

        try {
            c1.comprar(100);
        }catch (ClientException e){
            System.err.println(e.getMessage());
        }

    }
}
