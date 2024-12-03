
package mvc;

import Controller.Controller;
import Model.Model;
import View.View;


public class MVC {

   
    public static void main(String[] args) {
       Model model = new Model();
       View view = new View();
       Controller controller= new Controller(model,view);
       controller.setData("Hello MVC");
       controller.updateView();
    }
    
}
