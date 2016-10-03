package functions;



import org.json.simple.JSONObject;
import org.json.simple.JSONStreamAware;
import utils.APIHandlerServlet;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Nikita on 28.09.2016.
 */




public class UserHandle extends APIHandlerServlet.APIRequestHandler {



    public static final UserHandle instance = new UserHandle();

    public static UserHandle getInstance() {
        return instance;
    }






    private UserHandle() {
    }

    @Override
    protected JSONStreamAware processRequest(HttpServletRequest request) throws Exception {

        String name = request.getParameter("name");
        String id = request.getParameter("id");



        JSONObject jsonObject = new JSONObject();

        jsonObject.put("resp", "Hi, " + name + " do u really wanna " + id + " as your ID ?" );

        return (JSONStreamAware) jsonObject;
    }
}