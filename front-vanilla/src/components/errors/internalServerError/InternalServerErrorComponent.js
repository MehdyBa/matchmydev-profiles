import BaseComponent from "../BaseComponent.js";

export default class InternalServerErrorComponent extends BaseComponent {
    constructor() {
        super("main");
    }
    template() {
        return`
        <h1>${messages.errors.internalServerError.h1}</h1>
        <p>${messages.errors.internalServerError.p}</p>
        <img class="error-image" src = "./assets/images/internalServerError.svg" alt="${messages.errors.internalServerError.alt}">
        
        `;
    }
}