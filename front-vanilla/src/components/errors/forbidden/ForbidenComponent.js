import BaseComponent from "../BaseComponent.js";

export default class ForbidenComponent extends BaseComponent {
    constructor() {
        super("#main");
    }
    template() {
        return`
        <h1>${this.msg.errors.forbidden.h1}</h1>
        <p>${this.msg.errors.forbidden.p}</p>
        <img class="error-image" src="./assets/images/forbidden.svg" alt="${this.msg.errors.forbidden.alt}">
    `;
    }
}