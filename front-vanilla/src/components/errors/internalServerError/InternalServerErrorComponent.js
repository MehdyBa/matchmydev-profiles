import BaseComponent from "../../BaseComponent.js";

export default class InternalServerErrorComponent extends BaseComponent {
    constructor() {
        super("#main");
    }
    template() {
        return`
        <h1>${this.msg.errors.internalServerError.h1}</h1>
        <p>${this.msg.errors.internalServerError.p}</p>
        <img class="error-image" src = "./assets/images/internalServerError.svg" alt="${this.msg.errors.internalServerError.alt}">
        
        `;
    }
}