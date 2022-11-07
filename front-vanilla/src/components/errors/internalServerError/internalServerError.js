import {messages} from "../messages.js";
import "./internalServerError.css";

function renderInternalServerError() {
    const internalServerErrorContent = `
    <h1>${messages.errors.internalServerError.h1}</h1>
    <p>${messages.errors.internalServerError.p}</p>
    <img  class="error-image" src = "../../../assets/internalServerError.svg" alt="${messages.errors.internalServerError.alt}">
    
    `
    const main = document.getElementById("main");
    main.innerHTML = internalServerErrorContent; 
}

export {renderInternalServerError};