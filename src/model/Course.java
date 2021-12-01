package src.model;

public class Course {
   private String id;
   private String section;
   private String name;

   public Course(String id, String section, String name){
      this.id = id;
      this.section = section;
      this.name = name;
   }

   public String getid(){
      return id;
   }

   public void setid(String id){
      this.id = id;
   }

   public String getSection(){
      return section;
   }

   public void setSection(String section){
      this.section = section;
   }
   
   public String getName(){
      return name;
   }

   public void setName(String name){
      this.name = name;
   }
}
