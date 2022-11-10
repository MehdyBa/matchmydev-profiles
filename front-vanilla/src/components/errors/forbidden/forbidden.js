import {messages} from "../../../messages.js";

function renderForbidden(){

    const forbiddenContent = `
        <h1>${messages.errors.forbidden.h1}</h1>
        <p>${messages.errors.forbidden.p}</p>
        <img class="error-image" src="./assets/images/forbidden.svg" alt="${messages.errors.forbidden.alt}">
    `;

    const main = document.getElementById("main");
    main.innerHTML = forbiddenContent;
}

export {renderForbidden};