package src.model;

abstract class User {
   private String userName;
   private String email;
   private String password;

   public User(String userName, String email, String password) {
      this.userName = userName;
      this.email = email;
      this.password = password;
   }

   public String getEmail() {
      return email;
   }

   public String getUserName() {
      return userName;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }
}
