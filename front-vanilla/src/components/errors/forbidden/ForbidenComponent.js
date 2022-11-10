import BaseComponent from "../BaseComponent.js";

export default class ForbidenComponent extends BaseComponent {
    constructor() {
        super("main");
    }
    template() {
        return`
        <h1>${messages.errors.forbidden.h1}</h1>
        <p>${messages.errors.forbidden.p}</p>
        <img class="error-image" src="./assets/images/forbidden.svg" alt="${Messages.errors.forbidden.alt}">
    `;
    }
}