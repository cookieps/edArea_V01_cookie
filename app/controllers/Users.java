package controllers;

import models.Course;
import models.User;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import views.html.courses;
import views.html.userpage;

/**
 * Created by cookie on 13.11.14.
 */

@Security.Authenticated(Secured.class)
public class Users extends Controller {



    public static Result showUserPage(Long user) {   // генерация страницы пользователя

       // return ok(userpage.render(User.find.
        return ok(userpage.render(User.find.where().like("id", "%" + user + "%").findUnique()));

    }



}
