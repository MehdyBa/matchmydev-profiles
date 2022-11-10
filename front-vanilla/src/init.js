import { initMessages } from "./Messages.js"
import { renderMenu } from "./components/menu/menu.js"
import { route } from "./router.js";

await initMessages();
renderMenu();
route();

