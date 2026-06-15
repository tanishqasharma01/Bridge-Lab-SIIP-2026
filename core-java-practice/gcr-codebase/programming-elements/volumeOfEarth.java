public class volumeOfEarth {
    public static void main(String[] args){
        double volumeInkilometers ;
        double volInradius ;
        double radius = 6378;
        volInradius = Math.pow(radius, 3);
        volumeInkilometers = (4.0/3.0) * Math.PI * volInradius;
         System.out.println("the volume of the Earth is " + volumeInkilometers + " cubic kilometers");
    
    }
   
}
