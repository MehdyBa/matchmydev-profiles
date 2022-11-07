import { messages} from "../messages.js";
import "./unauthorized.css";

function renderUnauthorized() {
    const content =
   ` <h1>${messages.errors.unauthorizerd.h1}</h1>
   <p>${messages.errors.unauthorizerd.p}</p>
     <img class="error-image" src="../../../assets/unauthorized.png" alt="${messages.errors.unauthorized.alt}">
    `
    const main = document.getElementById("main");
    main.innerHTML = content;
    
};
export {renderUnauthorized};