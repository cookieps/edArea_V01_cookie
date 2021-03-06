package models;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.sql.Blob;

/**
* Created by oliver on 05.11.14.
*/
@Entity
public class Course extends Model
{
    public String email;
    @Id
    @Required
    public String courseName;
    @Required
    public String science;

    @Required
    @Column(columnDefinition = "TEXT")
    public String aboutCourse;

    public String logoPath;  // путь к картинке на сервере

    public Blob picture;

    public boolean current;

    public Course(String email, String courseName, String logoPath, Blob picture, String science, String aboutCourse, Boolean current) {
        this.email = email;
        this.courseName = courseName;
        this.picture = picture;
        this.science = science;
        this.aboutCourse = aboutCourse;
        this.logoPath = logoPath;
        this.current = current;
    }

    public static Model.Finder<String, Course> find =
            new Model.Finder<String, Course>(String.class, Course.class);



}
