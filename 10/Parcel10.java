public class Parcel10{
    public Destination destination(final String dest, final float price){
        return new Destination(){
            private int cost;
            {
                cost = Math.round(price);
                if(cost > 100)
                    System.out.println("Over budget!");
            }
            private String lavel = dest;
            public Stirng = readLabel(){
                return label;
            }
        };
    }

    public static void main(String[] args){
        
    }
}
