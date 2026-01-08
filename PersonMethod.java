public class PersonMethod{
    String name;
    String section;

    public String getDetails(){
        return "Student";
    }
    public String getDetails(String section){
        if(section.equals("A")){
            return "A section belong";
        }else if(section.equals("B")){
            return "B section belong";
        }
        return getDetails();
    }
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
        public void setCourse(String section){
            this.section=section;
        }
}