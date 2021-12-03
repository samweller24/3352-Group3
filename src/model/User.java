package model;

abstract class User {
   private String userName;
   private String email;
   private String password;

   /**
    * Abstract user
    *
    *
    * @param userName - the unique name of the user
    * @param email - the users email
    * @param password - the users password
    *
    */
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

   public String getPassword() {
      return password;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public void setPassword(String password) {
      this.password = password;
   }
}
