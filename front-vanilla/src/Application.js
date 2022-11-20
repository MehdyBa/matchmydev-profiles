import I18N from "./I18N.js";
import Router from "./Router.js"

class Application {
    static async main() {

        await I18N.init();
        Router.init();

    }
}

Application.main()