import BaseComponent from  "../../BaseComponent.js";

export default class NotFoundComponent extends BaseComponent {

    constructor() {
        super("#main");
    }

    template() {
        return `
        <h1>${this.msg.errors.notFound.h1}</h1>
        <p>${this.msg.errors.notFound.p}</p>
        <img class="error-image"
        src="./assets/images/notFound.svg"
        alt="${this.msg.errors.notFound.alt}">
    `;
    }
}