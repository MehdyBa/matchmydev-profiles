import Messages from "./Messages.js";

class Application {
    static async main(){

        await Messages.init();

    }
}

Application.main()