public class MusicalInstrumentRunner {
    public static void main(String main[]){
        MusicalInstrumentInheritance musicalinheritance = new MusicalInstrumentInheritance();
        musicalinheritance.setDrum("drum");
        musicalinheritance.setGuitarSound("solo");
        System.out.println(musicalinheritance.getGuitarSound());
        System.out.println(musicalinheritance.getPianoSound());

    }
}
