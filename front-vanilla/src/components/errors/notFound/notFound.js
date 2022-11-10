import { messages } from "../../../messages.js"

function renderNotFound() {
    const content = `
    <h1>${messages.errors.notFound.h1}</h1>
    <p>${messages.errors.notFound.p}</p>
    <img class="error-image"
     src="./assets/images/notFound.svg"
     alt="${messages.errors.notFound.alt}">`

    const main = document.getElementById("main");
    main.innerHTML = content;
}

export { renderNotFound }; 
