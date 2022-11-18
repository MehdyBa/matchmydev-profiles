import Messages from "./Messages.js";
import Router from "./Router.js"

class Application {
    static async main(){

        await Messages.init();
        Router.init();

    }
}

Application.main()