class FilterAdapter implements IProcessor{
    Filter filter;
    public FilterAdapter(Filter filter){
        this.filter = filter;
    }
    public String name(){
        return filter.name();
    }
    public Waveform process(Object input){
        return filter.process((Waveform)input);
    }
}

public class FilterProcessor{
    public static void main(String[] args){
        Waveform w = new Waveform();
        IApply.process(new FilterAdapter(new LowPass(1.0)), w);
        IApply.process(new FilterAdapter(new HighPass(2.0)), w);
        IApply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
    }
}
