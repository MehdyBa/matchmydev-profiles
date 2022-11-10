import {messages} from "../../../Messages.js";

function renderUnauthorized() {
    const content =
   ` <h1>${messages.errors.unauthorized.h1}</h1>
   <p>${messages.errors.unauthorized.p}</p>
     <img class="error-image" src="./assets/images/unauthorized.png" alt="${messages.errors.unauthorized.alt}">
    `
    const main = document.getElementById("main");
    main.innerHTML = content;
    
};

export { renderUnauthorized };