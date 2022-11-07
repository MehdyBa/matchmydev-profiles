import { initMessages } from "./messages.js"
import { renderMenu } from "./components/menu/menu.js"
import { route } from "./router.js";

await initMessages();
renderMenu();
route();

