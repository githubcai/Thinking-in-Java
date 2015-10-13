public class IApply{
    public static void process(IProcessor p, Object s){
        System.out.println("Using IProcessor "+p.name());
        System.out.println(p.process(s));
    }
}
