
package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User extends Model {

    @Id
    public String email;
    public String name;
    public int userType;        // тип пользователя (1 - админ, 2 - студент, 3 - препод )
    public String password;
//    public static List<Course> courses;


    public User(String email, String name, int userType, String password) {
        this.email = email;
        this.name = name;
        this.userType = userType;
        this.password = password;
    }

    public static User authenticate(String email, String password) {
        return find.where().eq("email", email).eq("password", password)
                .findUnique();
    }

    public static Finder<String, User> find = new Finder<String, User>(String.class, User.class);
}