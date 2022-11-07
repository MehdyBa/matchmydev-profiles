import {messages} from "../messages.js";
import "./forbidden.css";

function renderForbidden(){

    const forbiddenContent = `
        <h1>${messages.errors.forbidden.h1}</h1>
        <p>${messages.errors.forbidden.p}</p>
        <img class="error-image" src="../../../assets/forbidden.svg" alt="${messages.errors.forbidden.alt}">
    `;

    const main = document.getElementById("main");
    main.innerHTML = forbiddenContent;
}

export {renderForbidden};