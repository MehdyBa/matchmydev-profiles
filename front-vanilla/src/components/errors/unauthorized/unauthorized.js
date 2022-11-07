/*unauthorized.js*/
import { messages} from "../messages.js";

function renderUnauthorized() {
    const content =
   ` <h1>401 Unauthorized</h1>
     <p>the request was not made because valid credentials for the targeted resource are missing.</p>
     <img class="error-image" src="../../../assets/unauthorizedError.png" alt="401 unauthorized">
    `
    const main = document.getElementById("main");
    main.innerHTML = content;
    
};
export {renderUnauthorized};