import {messages} from "../messages.js";
import "./forbidden.css";

function renderForbidden(){

    const forbiddenContent = `
        <h1>403 Forbidden</h1>
        <p>You don't have the permission to access on this server</p>
        <img class="error-image" src="../../../assets/forbidden.svg" alt="403 Forbidden">
    `;

    const main = document.getElementById("main");
    main.innerHTML = forbiddenContent;
}

export {renderForbidden};