public class MusicalInstrument {
    String guitarsound;
    String pianosound;
    public MusicalInstrument(){

    }
    public MusicalInstrument(String guitarsound,String pianosound){
        this.guitarsound=guitarsound;
        this.pianosound=pianosound;
    }
    public static void main(String args){
        MusicalInstrument instrument=new MusicalInstrument("bee","solo");
        System.out.println(instrument.getGuitarSound());
    }
    public void setGuitarSound(String guitarsound){
        this.guitarsound=guitarsound;
    }
    public String getGuitarSound(){
        return guitarsound;
    } 
    public void setPianoSound(String pianosound){
        this.pianosound=pianosound;
    }
    public String getPianoSound(){
        return pianosound;
    } 
    
}
