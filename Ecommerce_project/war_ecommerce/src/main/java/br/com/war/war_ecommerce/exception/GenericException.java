package br.com.war.war_ecommerce.exception;public class GenericException extends Exception {

    public GenericException(){
        super();
    }

    String message;

    @Override
    public String toString() {
        return "Ocorreu o seguinte erro: " +this.getClass().getName()+
                "\n"+"message='" + message + '\'' +
                '}';
    }

    public GenericException(String message) {
        super(message);



    }
}
