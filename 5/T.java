public class T{
    static void f(float i, Character... args){
        System.out.println("first");
    }
    static void f(float... args){
        System.out.println("second");
    }
    static void f(float i){
        System.out.println("third");
    }
    public static void main(String[] args){
        f(1, 'a');
        f('a');
    }
}
