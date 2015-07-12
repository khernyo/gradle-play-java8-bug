package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import java.util.function.Function;

public class Application extends Controller {
    public static Result index() {
        final Function<Integer, String> f = n -> Integer.toString(n);
        return ok(index.render());
    }
}
