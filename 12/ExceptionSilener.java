public class ExceptionSilener{
    public static void main(String[] args){
        try{
            throw new RuntimeException();
        }finally{
            return;
        }
    }
}
