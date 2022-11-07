import {messages} from "../messages.js";
import internalServerError from internalServerError.css;

function renderInternalServerError() {
    const internalServerErrorContent = `
    <h1>{messages.errors.internalServerError.h1}</h1>
    <p>{messages.errors.internalServerError.p}</p>
    <img  class="error-image" src = "../../../assets/internalServerError.svg">
    
    `
    const main = document.getElementById("main");
    main.innerHTML = internalServerErrorContent; 
}

export {renderInternalServerError};