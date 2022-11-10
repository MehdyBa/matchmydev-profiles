import Messages from "./messages.js";
import { renderMenu } from "./components/menu/menu.js"
import { route } from "./router.js";



class Application {
    static async main() {
        await Messages.init();  
        Router.init();
    }
}

Application.main();


renderMenu();
route();

