package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Picture extends Model {

    private static final Finder<Long, Picture> FINDER = new Finder<Long, Picture>(Long.class, Picture.class);

    @Id
    public Long id;

    @Lob
    public byte[] content;
    public String contentType;

    public static Picture byId(Long id) {
        return FINDER.byId(id);
    }

    public static List<Picture> all() {
        return FINDER.all();
    }

    public static List<Long> allIds()
    {
        List<Long> ids = new ArrayList<Long>();

        for (Picture image : FINDER.all())
        {
            ids.add(image.id);
        }

        return ids;
    }
}