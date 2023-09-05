public class ClientException extends Exception{

    public ClientException() {
        super();
    }

    String message ;

    public ClientException(String message) {
        super(message);
    }
    public String toString(){
        return "Ocorreu uma exceção: " + this.getClass().getName() +"\n"+ "Mensagem: " + this.getMessage() + "\n";
    }

}
